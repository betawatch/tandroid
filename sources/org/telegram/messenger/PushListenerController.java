package org.telegram.messenger;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import androidx.collection.LongSparseArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* loaded from: classes3.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PushType {
    }

    public static void sendRegistrationToServer(final int i, final String str) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PushListenerController.$r8$lambda$gWkEZv3oxmETvqnhw1v-3CF-Wl4(str, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$gWkEZv3oxmETvqnhw1v-3CF-Wl4(final String str, final int i) {
        boolean z;
        ConnectionsManager.setRegId(str, i, SharedConfig.pushStringStatus);
        if (str == null) {
            return;
        }
        if (SharedConfig.pushStringGetTimeStart == 0 || SharedConfig.pushStringGetTimeEnd == 0 || (SharedConfig.pushStatSent && TextUtils.equals(SharedConfig.pushString, str))) {
            z = false;
        } else {
            SharedConfig.pushStatSent = false;
            z = true;
        }
        SharedConfig.pushString = str;
        SharedConfig.pushType = i;
        for (final int i2 = 0; i2 < 4; i2++) {
            UserConfig userConfig = UserConfig.getInstance(i2);
            userConfig.registeredForPush = false;
            userConfig.saveConfig(false);
            if (userConfig.getClientUserId() != 0) {
                if (z) {
                    String str2 = i == 2 ? "fcm" : "hcm";
                    TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                    TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent.time = SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent.type = str2 + "_token_request";
                    tL_inputAppEvent.peer = 0L;
                    tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent);
                    TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent2.time = SharedConfig.pushStringGetTimeEnd;
                    tL_inputAppEvent2.type = str2 + "_token_response";
                    tL_inputAppEvent2.peer = SharedConfig.pushStringGetTimeEnd - SharedConfig.pushStringGetTimeStart;
                    tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                    SharedConfig.pushStatSent = true;
                    SharedConfig.saveConfig();
                    ConnectionsManager.getInstance(i2).sendRequest(tL_help_saveAppLog, null);
                    z = false;
                }
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessagesController.getInstance(i2).registerForPush(i, str);
                    }
                });
            }
        }
    }

    public static void processRemoteMessage(int i, final String str, final long j) {
        final String str2 = i == 2 ? "FCM" : "HCM";
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str2 + " PRE START PROCESSING");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                PushListenerController.$r8$lambda$nYIZ4V9UJXbKQeRZEvfo7jiLnHo(str2, str, j);
            }
        });
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("finished " + str2 + " service, time = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public static /* synthetic */ void $r8$lambda$nYIZ4V9UJXbKQeRZEvfo7jiLnHo(final String str, final String str2, final long j) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " PRE INIT APP");
        }
        ApplicationLoader.postInitApplication();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(str + " POST INIT APP");
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                PushListenerController.lambda$processRemoteMessage$6(str, str2, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:1716:0x0603, code lost:
    
        if (org.telegram.messenger.MessagesStorage.getInstance(r36).checkMessageByRandomId(r13) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0614, code lost:
    
        if (r3.startsWith(r7) != false) goto L255;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a7 A[Catch: all -> 0x02fe, TRY_LEAVE, TryCatch #18 {all -> 0x02fe, blocks: (B:108:0x02eb, B:110:0x02f3, B:112:0x0304, B:114:0x030c, B:115:0x0324, B:117:0x032d, B:118:0x0336, B:120:0x0366, B:121:0x0378, B:123:0x0381, B:128:0x0396, B:130:0x039e, B:133:0x03a7, B:164:0x03cf, B:166:0x03de, B:169:0x03ff, B:170:0x0430, B:171:0x040f, B:173:0x0418, B:174:0x042b, B:175:0x0422, B:179:0x044f, B:183:0x0468, B:187:0x0482, B:188:0x0495, B:190:0x0498, B:192:0x04a6, B:194:0x04c7, B:197:0x04fa, B:198:0x0512, B:200:0x0515, B:202:0x052b, B:204:0x0546, B:209:0x057d, B:212:0x0597, B:214:0x05af, B:216:0x05c5, B:217:0x05e8, B:224:0x0610, B:231:0x062c, B:233:0x0632, B:246:0x0682, B:251:0x0693, B:257:0x06ab, B:259:0x06bc, B:263:0x06d0, B:266:0x06d4, B:270:0x06ed, B:272:0x06f0, B:274:0x06f6, B:279:0x0764, B:281:0x0774, B:282:0x0778, B:288:0x0fce, B:290:0x0fd2, B:296:0x2508, B:307:0x255a, B:309:0x2563, B:313:0x2572, B:317:0x25b3, B:369:0x25c3, B:371:0x25cf, B:375:0x258a, B:711:0x1645, B:714:0x165c, B:719:0x166b, B:722:0x1697, B:723:0x169d, B:726:0x16c9, B:727:0x16cf, B:730:0x16fb, B:731:0x1701, B:734:0x172d, B:735:0x1733, B:738:0x1746, B:739:0x174c, B:742:0x175f, B:743:0x1765, B:746:0x1778, B:747:0x177e, B:750:0x1791, B:751:0x1797, B:754:0x17aa, B:755:0x17b0, B:760:0x17d3, B:761:0x17c4, B:762:0x17d9, B:765:0x17ec, B:766:0x17f2, B:769:0x1805, B:770:0x180b, B:773:0x1824, B:774:0x182a, B:777:0x183d, B:778:0x1843, B:781:0x185c, B:782:0x1862, B:785:0x1875, B:786:0x187b, B:789:0x188e, B:790:0x1894, B:793:0x18a7, B:794:0x18ad, B:797:0x18c6, B:800:0x18d6, B:803:0x18f5, B:804:0x18fb, B:807:0x1914, B:808:0x191f, B:811:0x1932, B:812:0x193d, B:815:0x1950, B:816:0x195c, B:819:0x196f, B:820:0x197b, B:823:0x1992, B:824:0x1998, B:827:0x19af, B:828:0x19b5, B:831:0x19cc, B:832:0x19d8, B:835:0x19ef, B:836:0x19fb, B:839:0x1a14, B:840:0x1a20, B:843:0x1a39, B:844:0x1a45, B:847:0x1a58, B:848:0x1a64, B:850:0x1a68, B:852:0x1a70, B:855:0x1a89, B:856:0x1aab, B:859:0x1ac0, B:860:0x1ae0, B:863:0x1af3, B:864:0x1aff, B:867:0x1b12, B:868:0x1b1e, B:871:0x1b31, B:872:0x1b3d, B:875:0x1b50, B:876:0x1b5c, B:879:0x1b69, B:880:0x1b75, B:883:0x1b88, B:884:0x1b94, B:887:0x1bad, B:890:0x1bb7, B:891:0x1bbf, B:894:0x1be5, B:897:0x1bf1, B:900:0x1c10, B:901:0x1c1c, B:904:0x1c29, B:905:0x1c2f, B:908:0x1c51, B:909:0x1c57, B:912:0x1c79, B:913:0x1c7f, B:916:0x1ca1, B:917:0x1ca7, B:920:0x1cc9, B:921:0x1ccf, B:924:0x1cf5, B:925:0x1cfb, B:928:0x1d08, B:929:0x1d14, B:932:0x1d21, B:933:0x1d2d, B:936:0x1d3a, B:937:0x1d46, B:940:0x1d53, B:941:0x1d5f, B:943:0x1d70, B:944:0x1d76, B:946:0x1d87, B:947:0x1d8d, B:950:0x1d9e, B:951:0x1daa, B:954:0x1dbb, B:955:0x1dc7, B:958:0x1dda, B:959:0x1de6, B:962:0x1df9, B:963:0x1e05, B:966:0x1e12, B:967:0x1e1e, B:969:0x1e24, B:971:0x1e2c, B:974:0x1e3f, B:975:0x1e5f, B:978:0x1e6c, B:979:0x1e78, B:982:0x1e85, B:983:0x1e91, B:986:0x1e9e, B:987:0x1eaa, B:990:0x1eb7, B:991:0x1ec3, B:994:0x1ed0, B:995:0x1edc, B:998:0x1ee9, B:999:0x1ef5, B:1002:0x1f02, B:1005:0x1f12, B:1006:0x1f1a, B:1009:0x1f34, B:1012:0x1f40, B:1015:0x1f59, B:1016:0x1f65, B:1019:0x1f70, B:1020:0x1f76, B:1023:0x1f81, B:1026:0x1f8b, B:1027:0x1f93, B:1030:0x1fad, B:1033:0x1fb3, B:1036:0x1fcc, B:1037:0x1fd2, B:1040:0x1ff6, B:1041:0x1ffc, B:1044:0x201e, B:1045:0x2024, B:1048:0x2046, B:1049:0x204b, B:1052:0x206d, B:1053:0x2072, B:1056:0x2094, B:1057:0x2099, B:1060:0x20bb, B:1061:0x20cd, B:1064:0x20e0, B:1065:0x20ec, B:1068:0x2105, B:1069:0x210b, B:1072:0x211e, B:1073:0x212a, B:1076:0x2137, B:1077:0x2143, B:1080:0x2150, B:1081:0x215c, B:1084:0x2169, B:1085:0x2175, B:1088:0x2186, B:1089:0x2192, B:1092:0x21a3, B:1093:0x21af, B:1096:0x21c0, B:1097:0x21cc, B:1100:0x21dd, B:1101:0x21e9, B:1104:0x21f4, B:1105:0x2200, B:1107:0x2206, B:1109:0x220e, B:1112:0x2221, B:1113:0x2241, B:1116:0x224e, B:1117:0x225a, B:1120:0x2267, B:1121:0x2273, B:1124:0x2280, B:1125:0x228c, B:1126:0x229e, B:1129:0x22ab, B:1130:0x22b7, B:1133:0x22c4, B:1134:0x22d0, B:1137:0x22dd, B:1138:0x22e9, B:1141:0x22f6, B:1142:0x2302, B:1143:0x230e, B:1146:0x231b, B:1147:0x2327, B:1150:0x2334, B:1151:0x2340, B:1153:0x234f, B:1155:0x2359, B:1158:0x2362, B:1160:0x2371, B:1162:0x237b, B:1163:0x2380, B:1165:0x2396, B:1167:0x23a5, B:1169:0x23b7, B:1170:0x23c2, B:1172:0x23d4, B:1173:0x23e3, B:1176:0x23ee, B:1178:0x23fc, B:1180:0x240f, B:1181:0x241a, B:1184:0x2425, B:1185:0x2430, B:1188:0x243b, B:1189:0x2446, B:1191:0x2459, B:1192:0x246a, B:1195:0x247d, B:1196:0x2485, B:1199:0x2498, B:1200:0x24a4, B:1203:0x24b1, B:1204:0x24bd, B:1207:0x24ca, B:1208:0x24dc, B:1210:0x24e7, B:1211:0x24ee, B:1216:0x077f, B:1220:0x078d, B:1223:0x079b, B:1226:0x07a9, B:1229:0x07b7, B:1232:0x07c5, B:1235:0x07d3, B:1238:0x07e1, B:1241:0x07ec, B:1244:0x07fa, B:1247:0x0808, B:1250:0x0816, B:1253:0x0824, B:1256:0x0832, B:1259:0x0840, B:1262:0x084e, B:1265:0x085c, B:1268:0x086a, B:1271:0x0878, B:1274:0x0886, B:1277:0x0894, B:1280:0x08a2, B:1283:0x08b0, B:1286:0x08be, B:1289:0x08cc, B:1292:0x08da, B:1295:0x08e8, B:1298:0x08f6, B:1301:0x0904, B:1304:0x0912, B:1307:0x0920, B:1310:0x092e, B:1313:0x093c, B:1316:0x094a, B:1319:0x0958, B:1322:0x0966, B:1325:0x0974, B:1328:0x0982, B:1331:0x0990, B:1334:0x099e, B:1337:0x09ab, B:1340:0x09b9, B:1343:0x09c7, B:1346:0x09d5, B:1349:0x09e3, B:1352:0x09f1, B:1355:0x09ff, B:1358:0x0a0d, B:1361:0x0a1b, B:1364:0x0a29, B:1367:0x0a37, B:1370:0x0a45, B:1373:0x0a53, B:1376:0x0a61, B:1379:0x0a6f, B:1382:0x0a7d, B:1385:0x0a8b, B:1388:0x0a99, B:1391:0x0aa7, B:1394:0x0ab5, B:1397:0x0ac3, B:1400:0x0ad1, B:1403:0x0adf, B:1406:0x0aed, B:1409:0x0afb, B:1412:0x0b09, B:1415:0x0b17, B:1418:0x0b25, B:1421:0x0b33, B:1424:0x0b41, B:1427:0x0b4f, B:1430:0x0b5d, B:1433:0x0b6b, B:1436:0x0b79, B:1439:0x0b87, B:1442:0x0b95, B:1445:0x0ba3, B:1448:0x0bb1, B:1451:0x0bbf, B:1454:0x0bcd, B:1457:0x0bdb, B:1460:0x0be9, B:1463:0x0bf7, B:1466:0x0c05, B:1469:0x0c13, B:1472:0x0c21, B:1475:0x0c2f, B:1478:0x0c3d, B:1481:0x0c4b, B:1484:0x0c59, B:1487:0x0c67, B:1490:0x0c75, B:1493:0x0c83, B:1496:0x0c91, B:1499:0x0c9f, B:1502:0x0cac, B:1505:0x0cba, B:1508:0x0cc8, B:1511:0x0cd6, B:1514:0x0ce3, B:1517:0x0cf1, B:1520:0x0cff, B:1523:0x0d0d, B:1526:0x0d1b, B:1529:0x0d29, B:1532:0x0d37, B:1535:0x0d45, B:1538:0x0d53, B:1541:0x0d5e, B:1544:0x0d6c, B:1547:0x0d7a, B:1550:0x0d88, B:1553:0x0d96, B:1556:0x0da4, B:1559:0x0db2, B:1562:0x0dc0, B:1565:0x0dce, B:1568:0x0ddc, B:1571:0x0de9, B:1574:0x0df7, B:1577:0x0e05, B:1580:0x0e13, B:1583:0x0e21, B:1586:0x0e2f, B:1589:0x0e3d, B:1592:0x0e4b, B:1595:0x0e59, B:1598:0x0e67, B:1601:0x0e75, B:1604:0x0e83, B:1607:0x0e91, B:1610:0x0e9f, B:1613:0x0ead, B:1616:0x0ebb, B:1619:0x0ec9, B:1622:0x0ed6, B:1625:0x0ee4, B:1628:0x0ef2, B:1631:0x0f00, B:1634:0x0f0e, B:1637:0x0f1c, B:1640:0x0f2a, B:1643:0x0f38, B:1646:0x0f46, B:1649:0x0f54, B:1652:0x0f61, B:1655:0x0f6e, B:1658:0x0f7b, B:1661:0x0f88, B:1664:0x0f95, B:1667:0x0fa2, B:1670:0x0faf, B:1679:0x0725, B:1703:0x0643, B:1715:0x05fb, B:1720:0x0588), top: B:107:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:1684:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:1689:0x074f A[Catch: all -> 0x26b8, TryCatch #13 {all -> 0x26b8, blocks: (B:159:0x03b1, B:161:0x03c3, B:177:0x0447, B:180:0x045d, B:184:0x0474, B:195:0x04f2, B:205:0x0571, B:207:0x0577, B:210:0x058e, B:221:0x0608, B:227:0x061e, B:238:0x0654, B:244:0x067a, B:249:0x068d, B:255:0x06a5, B:267:0x06db, B:277:0x075e, B:294:0x2504, B:298:0x2534, B:302:0x2544, B:305:0x2551, B:310:0x256a, B:314:0x25a7, B:322:0x25e7, B:372:0x25db, B:378:0x259a, B:1674:0x24fe, B:1682:0x0733, B:1689:0x074f, B:1701:0x063d, B:1718:0x0582), top: B:158:0x03b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:1693:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:1697:0x26bd A[Catch: all -> 0x2619, TryCatch #14 {all -> 0x2619, blocks: (B:328:0x2604, B:329:0x261d, B:331:0x2627, B:333:0x262d, B:336:0x2636, B:338:0x263e, B:342:0x264c, B:344:0x2686, B:346:0x268a, B:348:0x268e, B:350:0x2692, B:355:0x269c, B:356:0x26a6, B:1697:0x26bd, B:1699:0x26c9, B:137:0x26d4, B:139:0x26e2, B:141:0x26ef, B:143:0x26fc, B:145:0x270d, B:147:0x2712, B:149:0x2716, B:150:0x2718), top: B:134:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06ab A[Catch: all -> 0x02fe, TRY_ENTER, TryCatch #18 {all -> 0x02fe, blocks: (B:108:0x02eb, B:110:0x02f3, B:112:0x0304, B:114:0x030c, B:115:0x0324, B:117:0x032d, B:118:0x0336, B:120:0x0366, B:121:0x0378, B:123:0x0381, B:128:0x0396, B:130:0x039e, B:133:0x03a7, B:164:0x03cf, B:166:0x03de, B:169:0x03ff, B:170:0x0430, B:171:0x040f, B:173:0x0418, B:174:0x042b, B:175:0x0422, B:179:0x044f, B:183:0x0468, B:187:0x0482, B:188:0x0495, B:190:0x0498, B:192:0x04a6, B:194:0x04c7, B:197:0x04fa, B:198:0x0512, B:200:0x0515, B:202:0x052b, B:204:0x0546, B:209:0x057d, B:212:0x0597, B:214:0x05af, B:216:0x05c5, B:217:0x05e8, B:224:0x0610, B:231:0x062c, B:233:0x0632, B:246:0x0682, B:251:0x0693, B:257:0x06ab, B:259:0x06bc, B:263:0x06d0, B:266:0x06d4, B:270:0x06ed, B:272:0x06f0, B:274:0x06f6, B:279:0x0764, B:281:0x0774, B:282:0x0778, B:288:0x0fce, B:290:0x0fd2, B:296:0x2508, B:307:0x255a, B:309:0x2563, B:313:0x2572, B:317:0x25b3, B:369:0x25c3, B:371:0x25cf, B:375:0x258a, B:711:0x1645, B:714:0x165c, B:719:0x166b, B:722:0x1697, B:723:0x169d, B:726:0x16c9, B:727:0x16cf, B:730:0x16fb, B:731:0x1701, B:734:0x172d, B:735:0x1733, B:738:0x1746, B:739:0x174c, B:742:0x175f, B:743:0x1765, B:746:0x1778, B:747:0x177e, B:750:0x1791, B:751:0x1797, B:754:0x17aa, B:755:0x17b0, B:760:0x17d3, B:761:0x17c4, B:762:0x17d9, B:765:0x17ec, B:766:0x17f2, B:769:0x1805, B:770:0x180b, B:773:0x1824, B:774:0x182a, B:777:0x183d, B:778:0x1843, B:781:0x185c, B:782:0x1862, B:785:0x1875, B:786:0x187b, B:789:0x188e, B:790:0x1894, B:793:0x18a7, B:794:0x18ad, B:797:0x18c6, B:800:0x18d6, B:803:0x18f5, B:804:0x18fb, B:807:0x1914, B:808:0x191f, B:811:0x1932, B:812:0x193d, B:815:0x1950, B:816:0x195c, B:819:0x196f, B:820:0x197b, B:823:0x1992, B:824:0x1998, B:827:0x19af, B:828:0x19b5, B:831:0x19cc, B:832:0x19d8, B:835:0x19ef, B:836:0x19fb, B:839:0x1a14, B:840:0x1a20, B:843:0x1a39, B:844:0x1a45, B:847:0x1a58, B:848:0x1a64, B:850:0x1a68, B:852:0x1a70, B:855:0x1a89, B:856:0x1aab, B:859:0x1ac0, B:860:0x1ae0, B:863:0x1af3, B:864:0x1aff, B:867:0x1b12, B:868:0x1b1e, B:871:0x1b31, B:872:0x1b3d, B:875:0x1b50, B:876:0x1b5c, B:879:0x1b69, B:880:0x1b75, B:883:0x1b88, B:884:0x1b94, B:887:0x1bad, B:890:0x1bb7, B:891:0x1bbf, B:894:0x1be5, B:897:0x1bf1, B:900:0x1c10, B:901:0x1c1c, B:904:0x1c29, B:905:0x1c2f, B:908:0x1c51, B:909:0x1c57, B:912:0x1c79, B:913:0x1c7f, B:916:0x1ca1, B:917:0x1ca7, B:920:0x1cc9, B:921:0x1ccf, B:924:0x1cf5, B:925:0x1cfb, B:928:0x1d08, B:929:0x1d14, B:932:0x1d21, B:933:0x1d2d, B:936:0x1d3a, B:937:0x1d46, B:940:0x1d53, B:941:0x1d5f, B:943:0x1d70, B:944:0x1d76, B:946:0x1d87, B:947:0x1d8d, B:950:0x1d9e, B:951:0x1daa, B:954:0x1dbb, B:955:0x1dc7, B:958:0x1dda, B:959:0x1de6, B:962:0x1df9, B:963:0x1e05, B:966:0x1e12, B:967:0x1e1e, B:969:0x1e24, B:971:0x1e2c, B:974:0x1e3f, B:975:0x1e5f, B:978:0x1e6c, B:979:0x1e78, B:982:0x1e85, B:983:0x1e91, B:986:0x1e9e, B:987:0x1eaa, B:990:0x1eb7, B:991:0x1ec3, B:994:0x1ed0, B:995:0x1edc, B:998:0x1ee9, B:999:0x1ef5, B:1002:0x1f02, B:1005:0x1f12, B:1006:0x1f1a, B:1009:0x1f34, B:1012:0x1f40, B:1015:0x1f59, B:1016:0x1f65, B:1019:0x1f70, B:1020:0x1f76, B:1023:0x1f81, B:1026:0x1f8b, B:1027:0x1f93, B:1030:0x1fad, B:1033:0x1fb3, B:1036:0x1fcc, B:1037:0x1fd2, B:1040:0x1ff6, B:1041:0x1ffc, B:1044:0x201e, B:1045:0x2024, B:1048:0x2046, B:1049:0x204b, B:1052:0x206d, B:1053:0x2072, B:1056:0x2094, B:1057:0x2099, B:1060:0x20bb, B:1061:0x20cd, B:1064:0x20e0, B:1065:0x20ec, B:1068:0x2105, B:1069:0x210b, B:1072:0x211e, B:1073:0x212a, B:1076:0x2137, B:1077:0x2143, B:1080:0x2150, B:1081:0x215c, B:1084:0x2169, B:1085:0x2175, B:1088:0x2186, B:1089:0x2192, B:1092:0x21a3, B:1093:0x21af, B:1096:0x21c0, B:1097:0x21cc, B:1100:0x21dd, B:1101:0x21e9, B:1104:0x21f4, B:1105:0x2200, B:1107:0x2206, B:1109:0x220e, B:1112:0x2221, B:1113:0x2241, B:1116:0x224e, B:1117:0x225a, B:1120:0x2267, B:1121:0x2273, B:1124:0x2280, B:1125:0x228c, B:1126:0x229e, B:1129:0x22ab, B:1130:0x22b7, B:1133:0x22c4, B:1134:0x22d0, B:1137:0x22dd, B:1138:0x22e9, B:1141:0x22f6, B:1142:0x2302, B:1143:0x230e, B:1146:0x231b, B:1147:0x2327, B:1150:0x2334, B:1151:0x2340, B:1153:0x234f, B:1155:0x2359, B:1158:0x2362, B:1160:0x2371, B:1162:0x237b, B:1163:0x2380, B:1165:0x2396, B:1167:0x23a5, B:1169:0x23b7, B:1170:0x23c2, B:1172:0x23d4, B:1173:0x23e3, B:1176:0x23ee, B:1178:0x23fc, B:1180:0x240f, B:1181:0x241a, B:1184:0x2425, B:1185:0x2430, B:1188:0x243b, B:1189:0x2446, B:1191:0x2459, B:1192:0x246a, B:1195:0x247d, B:1196:0x2485, B:1199:0x2498, B:1200:0x24a4, B:1203:0x24b1, B:1204:0x24bd, B:1207:0x24ca, B:1208:0x24dc, B:1210:0x24e7, B:1211:0x24ee, B:1216:0x077f, B:1220:0x078d, B:1223:0x079b, B:1226:0x07a9, B:1229:0x07b7, B:1232:0x07c5, B:1235:0x07d3, B:1238:0x07e1, B:1241:0x07ec, B:1244:0x07fa, B:1247:0x0808, B:1250:0x0816, B:1253:0x0824, B:1256:0x0832, B:1259:0x0840, B:1262:0x084e, B:1265:0x085c, B:1268:0x086a, B:1271:0x0878, B:1274:0x0886, B:1277:0x0894, B:1280:0x08a2, B:1283:0x08b0, B:1286:0x08be, B:1289:0x08cc, B:1292:0x08da, B:1295:0x08e8, B:1298:0x08f6, B:1301:0x0904, B:1304:0x0912, B:1307:0x0920, B:1310:0x092e, B:1313:0x093c, B:1316:0x094a, B:1319:0x0958, B:1322:0x0966, B:1325:0x0974, B:1328:0x0982, B:1331:0x0990, B:1334:0x099e, B:1337:0x09ab, B:1340:0x09b9, B:1343:0x09c7, B:1346:0x09d5, B:1349:0x09e3, B:1352:0x09f1, B:1355:0x09ff, B:1358:0x0a0d, B:1361:0x0a1b, B:1364:0x0a29, B:1367:0x0a37, B:1370:0x0a45, B:1373:0x0a53, B:1376:0x0a61, B:1379:0x0a6f, B:1382:0x0a7d, B:1385:0x0a8b, B:1388:0x0a99, B:1391:0x0aa7, B:1394:0x0ab5, B:1397:0x0ac3, B:1400:0x0ad1, B:1403:0x0adf, B:1406:0x0aed, B:1409:0x0afb, B:1412:0x0b09, B:1415:0x0b17, B:1418:0x0b25, B:1421:0x0b33, B:1424:0x0b41, B:1427:0x0b4f, B:1430:0x0b5d, B:1433:0x0b6b, B:1436:0x0b79, B:1439:0x0b87, B:1442:0x0b95, B:1445:0x0ba3, B:1448:0x0bb1, B:1451:0x0bbf, B:1454:0x0bcd, B:1457:0x0bdb, B:1460:0x0be9, B:1463:0x0bf7, B:1466:0x0c05, B:1469:0x0c13, B:1472:0x0c21, B:1475:0x0c2f, B:1478:0x0c3d, B:1481:0x0c4b, B:1484:0x0c59, B:1487:0x0c67, B:1490:0x0c75, B:1493:0x0c83, B:1496:0x0c91, B:1499:0x0c9f, B:1502:0x0cac, B:1505:0x0cba, B:1508:0x0cc8, B:1511:0x0cd6, B:1514:0x0ce3, B:1517:0x0cf1, B:1520:0x0cff, B:1523:0x0d0d, B:1526:0x0d1b, B:1529:0x0d29, B:1532:0x0d37, B:1535:0x0d45, B:1538:0x0d53, B:1541:0x0d5e, B:1544:0x0d6c, B:1547:0x0d7a, B:1550:0x0d88, B:1553:0x0d96, B:1556:0x0da4, B:1559:0x0db2, B:1562:0x0dc0, B:1565:0x0dce, B:1568:0x0ddc, B:1571:0x0de9, B:1574:0x0df7, B:1577:0x0e05, B:1580:0x0e13, B:1583:0x0e21, B:1586:0x0e2f, B:1589:0x0e3d, B:1592:0x0e4b, B:1595:0x0e59, B:1598:0x0e67, B:1601:0x0e75, B:1604:0x0e83, B:1607:0x0e91, B:1610:0x0e9f, B:1613:0x0ead, B:1616:0x0ebb, B:1619:0x0ec9, B:1622:0x0ed6, B:1625:0x0ee4, B:1628:0x0ef2, B:1631:0x0f00, B:1634:0x0f0e, B:1637:0x0f1c, B:1640:0x0f2a, B:1643:0x0f38, B:1646:0x0f46, B:1649:0x0f54, B:1652:0x0f61, B:1655:0x0f6e, B:1658:0x0f7b, B:1661:0x0f88, B:1664:0x0f95, B:1667:0x0fa2, B:1670:0x0faf, B:1679:0x0725, B:1703:0x0643, B:1715:0x05fb, B:1720:0x0588), top: B:107:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0764 A[Catch: all -> 0x02fe, TRY_ENTER, TryCatch #18 {all -> 0x02fe, blocks: (B:108:0x02eb, B:110:0x02f3, B:112:0x0304, B:114:0x030c, B:115:0x0324, B:117:0x032d, B:118:0x0336, B:120:0x0366, B:121:0x0378, B:123:0x0381, B:128:0x0396, B:130:0x039e, B:133:0x03a7, B:164:0x03cf, B:166:0x03de, B:169:0x03ff, B:170:0x0430, B:171:0x040f, B:173:0x0418, B:174:0x042b, B:175:0x0422, B:179:0x044f, B:183:0x0468, B:187:0x0482, B:188:0x0495, B:190:0x0498, B:192:0x04a6, B:194:0x04c7, B:197:0x04fa, B:198:0x0512, B:200:0x0515, B:202:0x052b, B:204:0x0546, B:209:0x057d, B:212:0x0597, B:214:0x05af, B:216:0x05c5, B:217:0x05e8, B:224:0x0610, B:231:0x062c, B:233:0x0632, B:246:0x0682, B:251:0x0693, B:257:0x06ab, B:259:0x06bc, B:263:0x06d0, B:266:0x06d4, B:270:0x06ed, B:272:0x06f0, B:274:0x06f6, B:279:0x0764, B:281:0x0774, B:282:0x0778, B:288:0x0fce, B:290:0x0fd2, B:296:0x2508, B:307:0x255a, B:309:0x2563, B:313:0x2572, B:317:0x25b3, B:369:0x25c3, B:371:0x25cf, B:375:0x258a, B:711:0x1645, B:714:0x165c, B:719:0x166b, B:722:0x1697, B:723:0x169d, B:726:0x16c9, B:727:0x16cf, B:730:0x16fb, B:731:0x1701, B:734:0x172d, B:735:0x1733, B:738:0x1746, B:739:0x174c, B:742:0x175f, B:743:0x1765, B:746:0x1778, B:747:0x177e, B:750:0x1791, B:751:0x1797, B:754:0x17aa, B:755:0x17b0, B:760:0x17d3, B:761:0x17c4, B:762:0x17d9, B:765:0x17ec, B:766:0x17f2, B:769:0x1805, B:770:0x180b, B:773:0x1824, B:774:0x182a, B:777:0x183d, B:778:0x1843, B:781:0x185c, B:782:0x1862, B:785:0x1875, B:786:0x187b, B:789:0x188e, B:790:0x1894, B:793:0x18a7, B:794:0x18ad, B:797:0x18c6, B:800:0x18d6, B:803:0x18f5, B:804:0x18fb, B:807:0x1914, B:808:0x191f, B:811:0x1932, B:812:0x193d, B:815:0x1950, B:816:0x195c, B:819:0x196f, B:820:0x197b, B:823:0x1992, B:824:0x1998, B:827:0x19af, B:828:0x19b5, B:831:0x19cc, B:832:0x19d8, B:835:0x19ef, B:836:0x19fb, B:839:0x1a14, B:840:0x1a20, B:843:0x1a39, B:844:0x1a45, B:847:0x1a58, B:848:0x1a64, B:850:0x1a68, B:852:0x1a70, B:855:0x1a89, B:856:0x1aab, B:859:0x1ac0, B:860:0x1ae0, B:863:0x1af3, B:864:0x1aff, B:867:0x1b12, B:868:0x1b1e, B:871:0x1b31, B:872:0x1b3d, B:875:0x1b50, B:876:0x1b5c, B:879:0x1b69, B:880:0x1b75, B:883:0x1b88, B:884:0x1b94, B:887:0x1bad, B:890:0x1bb7, B:891:0x1bbf, B:894:0x1be5, B:897:0x1bf1, B:900:0x1c10, B:901:0x1c1c, B:904:0x1c29, B:905:0x1c2f, B:908:0x1c51, B:909:0x1c57, B:912:0x1c79, B:913:0x1c7f, B:916:0x1ca1, B:917:0x1ca7, B:920:0x1cc9, B:921:0x1ccf, B:924:0x1cf5, B:925:0x1cfb, B:928:0x1d08, B:929:0x1d14, B:932:0x1d21, B:933:0x1d2d, B:936:0x1d3a, B:937:0x1d46, B:940:0x1d53, B:941:0x1d5f, B:943:0x1d70, B:944:0x1d76, B:946:0x1d87, B:947:0x1d8d, B:950:0x1d9e, B:951:0x1daa, B:954:0x1dbb, B:955:0x1dc7, B:958:0x1dda, B:959:0x1de6, B:962:0x1df9, B:963:0x1e05, B:966:0x1e12, B:967:0x1e1e, B:969:0x1e24, B:971:0x1e2c, B:974:0x1e3f, B:975:0x1e5f, B:978:0x1e6c, B:979:0x1e78, B:982:0x1e85, B:983:0x1e91, B:986:0x1e9e, B:987:0x1eaa, B:990:0x1eb7, B:991:0x1ec3, B:994:0x1ed0, B:995:0x1edc, B:998:0x1ee9, B:999:0x1ef5, B:1002:0x1f02, B:1005:0x1f12, B:1006:0x1f1a, B:1009:0x1f34, B:1012:0x1f40, B:1015:0x1f59, B:1016:0x1f65, B:1019:0x1f70, B:1020:0x1f76, B:1023:0x1f81, B:1026:0x1f8b, B:1027:0x1f93, B:1030:0x1fad, B:1033:0x1fb3, B:1036:0x1fcc, B:1037:0x1fd2, B:1040:0x1ff6, B:1041:0x1ffc, B:1044:0x201e, B:1045:0x2024, B:1048:0x2046, B:1049:0x204b, B:1052:0x206d, B:1053:0x2072, B:1056:0x2094, B:1057:0x2099, B:1060:0x20bb, B:1061:0x20cd, B:1064:0x20e0, B:1065:0x20ec, B:1068:0x2105, B:1069:0x210b, B:1072:0x211e, B:1073:0x212a, B:1076:0x2137, B:1077:0x2143, B:1080:0x2150, B:1081:0x215c, B:1084:0x2169, B:1085:0x2175, B:1088:0x2186, B:1089:0x2192, B:1092:0x21a3, B:1093:0x21af, B:1096:0x21c0, B:1097:0x21cc, B:1100:0x21dd, B:1101:0x21e9, B:1104:0x21f4, B:1105:0x2200, B:1107:0x2206, B:1109:0x220e, B:1112:0x2221, B:1113:0x2241, B:1116:0x224e, B:1117:0x225a, B:1120:0x2267, B:1121:0x2273, B:1124:0x2280, B:1125:0x228c, B:1126:0x229e, B:1129:0x22ab, B:1130:0x22b7, B:1133:0x22c4, B:1134:0x22d0, B:1137:0x22dd, B:1138:0x22e9, B:1141:0x22f6, B:1142:0x2302, B:1143:0x230e, B:1146:0x231b, B:1147:0x2327, B:1150:0x2334, B:1151:0x2340, B:1153:0x234f, B:1155:0x2359, B:1158:0x2362, B:1160:0x2371, B:1162:0x237b, B:1163:0x2380, B:1165:0x2396, B:1167:0x23a5, B:1169:0x23b7, B:1170:0x23c2, B:1172:0x23d4, B:1173:0x23e3, B:1176:0x23ee, B:1178:0x23fc, B:1180:0x240f, B:1181:0x241a, B:1184:0x2425, B:1185:0x2430, B:1188:0x243b, B:1189:0x2446, B:1191:0x2459, B:1192:0x246a, B:1195:0x247d, B:1196:0x2485, B:1199:0x2498, B:1200:0x24a4, B:1203:0x24b1, B:1204:0x24bd, B:1207:0x24ca, B:1208:0x24dc, B:1210:0x24e7, B:1211:0x24ee, B:1216:0x077f, B:1220:0x078d, B:1223:0x079b, B:1226:0x07a9, B:1229:0x07b7, B:1232:0x07c5, B:1235:0x07d3, B:1238:0x07e1, B:1241:0x07ec, B:1244:0x07fa, B:1247:0x0808, B:1250:0x0816, B:1253:0x0824, B:1256:0x0832, B:1259:0x0840, B:1262:0x084e, B:1265:0x085c, B:1268:0x086a, B:1271:0x0878, B:1274:0x0886, B:1277:0x0894, B:1280:0x08a2, B:1283:0x08b0, B:1286:0x08be, B:1289:0x08cc, B:1292:0x08da, B:1295:0x08e8, B:1298:0x08f6, B:1301:0x0904, B:1304:0x0912, B:1307:0x0920, B:1310:0x092e, B:1313:0x093c, B:1316:0x094a, B:1319:0x0958, B:1322:0x0966, B:1325:0x0974, B:1328:0x0982, B:1331:0x0990, B:1334:0x099e, B:1337:0x09ab, B:1340:0x09b9, B:1343:0x09c7, B:1346:0x09d5, B:1349:0x09e3, B:1352:0x09f1, B:1355:0x09ff, B:1358:0x0a0d, B:1361:0x0a1b, B:1364:0x0a29, B:1367:0x0a37, B:1370:0x0a45, B:1373:0x0a53, B:1376:0x0a61, B:1379:0x0a6f, B:1382:0x0a7d, B:1385:0x0a8b, B:1388:0x0a99, B:1391:0x0aa7, B:1394:0x0ab5, B:1397:0x0ac3, B:1400:0x0ad1, B:1403:0x0adf, B:1406:0x0aed, B:1409:0x0afb, B:1412:0x0b09, B:1415:0x0b17, B:1418:0x0b25, B:1421:0x0b33, B:1424:0x0b41, B:1427:0x0b4f, B:1430:0x0b5d, B:1433:0x0b6b, B:1436:0x0b79, B:1439:0x0b87, B:1442:0x0b95, B:1445:0x0ba3, B:1448:0x0bb1, B:1451:0x0bbf, B:1454:0x0bcd, B:1457:0x0bdb, B:1460:0x0be9, B:1463:0x0bf7, B:1466:0x0c05, B:1469:0x0c13, B:1472:0x0c21, B:1475:0x0c2f, B:1478:0x0c3d, B:1481:0x0c4b, B:1484:0x0c59, B:1487:0x0c67, B:1490:0x0c75, B:1493:0x0c83, B:1496:0x0c91, B:1499:0x0c9f, B:1502:0x0cac, B:1505:0x0cba, B:1508:0x0cc8, B:1511:0x0cd6, B:1514:0x0ce3, B:1517:0x0cf1, B:1520:0x0cff, B:1523:0x0d0d, B:1526:0x0d1b, B:1529:0x0d29, B:1532:0x0d37, B:1535:0x0d45, B:1538:0x0d53, B:1541:0x0d5e, B:1544:0x0d6c, B:1547:0x0d7a, B:1550:0x0d88, B:1553:0x0d96, B:1556:0x0da4, B:1559:0x0db2, B:1562:0x0dc0, B:1565:0x0dce, B:1568:0x0ddc, B:1571:0x0de9, B:1574:0x0df7, B:1577:0x0e05, B:1580:0x0e13, B:1583:0x0e21, B:1586:0x0e2f, B:1589:0x0e3d, B:1592:0x0e4b, B:1595:0x0e59, B:1598:0x0e67, B:1601:0x0e75, B:1604:0x0e83, B:1607:0x0e91, B:1610:0x0e9f, B:1613:0x0ead, B:1616:0x0ebb, B:1619:0x0ec9, B:1622:0x0ed6, B:1625:0x0ee4, B:1628:0x0ef2, B:1631:0x0f00, B:1634:0x0f0e, B:1637:0x0f1c, B:1640:0x0f2a, B:1643:0x0f38, B:1646:0x0f46, B:1649:0x0f54, B:1652:0x0f61, B:1655:0x0f6e, B:1658:0x0f7b, B:1661:0x0f88, B:1664:0x0f95, B:1667:0x0fa2, B:1670:0x0faf, B:1679:0x0725, B:1703:0x0643, B:1715:0x05fb, B:1720:0x0588), top: B:107:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x2508 A[Catch: all -> 0x02fe, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x02fe, blocks: (B:108:0x02eb, B:110:0x02f3, B:112:0x0304, B:114:0x030c, B:115:0x0324, B:117:0x032d, B:118:0x0336, B:120:0x0366, B:121:0x0378, B:123:0x0381, B:128:0x0396, B:130:0x039e, B:133:0x03a7, B:164:0x03cf, B:166:0x03de, B:169:0x03ff, B:170:0x0430, B:171:0x040f, B:173:0x0418, B:174:0x042b, B:175:0x0422, B:179:0x044f, B:183:0x0468, B:187:0x0482, B:188:0x0495, B:190:0x0498, B:192:0x04a6, B:194:0x04c7, B:197:0x04fa, B:198:0x0512, B:200:0x0515, B:202:0x052b, B:204:0x0546, B:209:0x057d, B:212:0x0597, B:214:0x05af, B:216:0x05c5, B:217:0x05e8, B:224:0x0610, B:231:0x062c, B:233:0x0632, B:246:0x0682, B:251:0x0693, B:257:0x06ab, B:259:0x06bc, B:263:0x06d0, B:266:0x06d4, B:270:0x06ed, B:272:0x06f0, B:274:0x06f6, B:279:0x0764, B:281:0x0774, B:282:0x0778, B:288:0x0fce, B:290:0x0fd2, B:296:0x2508, B:307:0x255a, B:309:0x2563, B:313:0x2572, B:317:0x25b3, B:369:0x25c3, B:371:0x25cf, B:375:0x258a, B:711:0x1645, B:714:0x165c, B:719:0x166b, B:722:0x1697, B:723:0x169d, B:726:0x16c9, B:727:0x16cf, B:730:0x16fb, B:731:0x1701, B:734:0x172d, B:735:0x1733, B:738:0x1746, B:739:0x174c, B:742:0x175f, B:743:0x1765, B:746:0x1778, B:747:0x177e, B:750:0x1791, B:751:0x1797, B:754:0x17aa, B:755:0x17b0, B:760:0x17d3, B:761:0x17c4, B:762:0x17d9, B:765:0x17ec, B:766:0x17f2, B:769:0x1805, B:770:0x180b, B:773:0x1824, B:774:0x182a, B:777:0x183d, B:778:0x1843, B:781:0x185c, B:782:0x1862, B:785:0x1875, B:786:0x187b, B:789:0x188e, B:790:0x1894, B:793:0x18a7, B:794:0x18ad, B:797:0x18c6, B:800:0x18d6, B:803:0x18f5, B:804:0x18fb, B:807:0x1914, B:808:0x191f, B:811:0x1932, B:812:0x193d, B:815:0x1950, B:816:0x195c, B:819:0x196f, B:820:0x197b, B:823:0x1992, B:824:0x1998, B:827:0x19af, B:828:0x19b5, B:831:0x19cc, B:832:0x19d8, B:835:0x19ef, B:836:0x19fb, B:839:0x1a14, B:840:0x1a20, B:843:0x1a39, B:844:0x1a45, B:847:0x1a58, B:848:0x1a64, B:850:0x1a68, B:852:0x1a70, B:855:0x1a89, B:856:0x1aab, B:859:0x1ac0, B:860:0x1ae0, B:863:0x1af3, B:864:0x1aff, B:867:0x1b12, B:868:0x1b1e, B:871:0x1b31, B:872:0x1b3d, B:875:0x1b50, B:876:0x1b5c, B:879:0x1b69, B:880:0x1b75, B:883:0x1b88, B:884:0x1b94, B:887:0x1bad, B:890:0x1bb7, B:891:0x1bbf, B:894:0x1be5, B:897:0x1bf1, B:900:0x1c10, B:901:0x1c1c, B:904:0x1c29, B:905:0x1c2f, B:908:0x1c51, B:909:0x1c57, B:912:0x1c79, B:913:0x1c7f, B:916:0x1ca1, B:917:0x1ca7, B:920:0x1cc9, B:921:0x1ccf, B:924:0x1cf5, B:925:0x1cfb, B:928:0x1d08, B:929:0x1d14, B:932:0x1d21, B:933:0x1d2d, B:936:0x1d3a, B:937:0x1d46, B:940:0x1d53, B:941:0x1d5f, B:943:0x1d70, B:944:0x1d76, B:946:0x1d87, B:947:0x1d8d, B:950:0x1d9e, B:951:0x1daa, B:954:0x1dbb, B:955:0x1dc7, B:958:0x1dda, B:959:0x1de6, B:962:0x1df9, B:963:0x1e05, B:966:0x1e12, B:967:0x1e1e, B:969:0x1e24, B:971:0x1e2c, B:974:0x1e3f, B:975:0x1e5f, B:978:0x1e6c, B:979:0x1e78, B:982:0x1e85, B:983:0x1e91, B:986:0x1e9e, B:987:0x1eaa, B:990:0x1eb7, B:991:0x1ec3, B:994:0x1ed0, B:995:0x1edc, B:998:0x1ee9, B:999:0x1ef5, B:1002:0x1f02, B:1005:0x1f12, B:1006:0x1f1a, B:1009:0x1f34, B:1012:0x1f40, B:1015:0x1f59, B:1016:0x1f65, B:1019:0x1f70, B:1020:0x1f76, B:1023:0x1f81, B:1026:0x1f8b, B:1027:0x1f93, B:1030:0x1fad, B:1033:0x1fb3, B:1036:0x1fcc, B:1037:0x1fd2, B:1040:0x1ff6, B:1041:0x1ffc, B:1044:0x201e, B:1045:0x2024, B:1048:0x2046, B:1049:0x204b, B:1052:0x206d, B:1053:0x2072, B:1056:0x2094, B:1057:0x2099, B:1060:0x20bb, B:1061:0x20cd, B:1064:0x20e0, B:1065:0x20ec, B:1068:0x2105, B:1069:0x210b, B:1072:0x211e, B:1073:0x212a, B:1076:0x2137, B:1077:0x2143, B:1080:0x2150, B:1081:0x215c, B:1084:0x2169, B:1085:0x2175, B:1088:0x2186, B:1089:0x2192, B:1092:0x21a3, B:1093:0x21af, B:1096:0x21c0, B:1097:0x21cc, B:1100:0x21dd, B:1101:0x21e9, B:1104:0x21f4, B:1105:0x2200, B:1107:0x2206, B:1109:0x220e, B:1112:0x2221, B:1113:0x2241, B:1116:0x224e, B:1117:0x225a, B:1120:0x2267, B:1121:0x2273, B:1124:0x2280, B:1125:0x228c, B:1126:0x229e, B:1129:0x22ab, B:1130:0x22b7, B:1133:0x22c4, B:1134:0x22d0, B:1137:0x22dd, B:1138:0x22e9, B:1141:0x22f6, B:1142:0x2302, B:1143:0x230e, B:1146:0x231b, B:1147:0x2327, B:1150:0x2334, B:1151:0x2340, B:1153:0x234f, B:1155:0x2359, B:1158:0x2362, B:1160:0x2371, B:1162:0x237b, B:1163:0x2380, B:1165:0x2396, B:1167:0x23a5, B:1169:0x23b7, B:1170:0x23c2, B:1172:0x23d4, B:1173:0x23e3, B:1176:0x23ee, B:1178:0x23fc, B:1180:0x240f, B:1181:0x241a, B:1184:0x2425, B:1185:0x2430, B:1188:0x243b, B:1189:0x2446, B:1191:0x2459, B:1192:0x246a, B:1195:0x247d, B:1196:0x2485, B:1199:0x2498, B:1200:0x24a4, B:1203:0x24b1, B:1204:0x24bd, B:1207:0x24ca, B:1208:0x24dc, B:1210:0x24e7, B:1211:0x24ee, B:1216:0x077f, B:1220:0x078d, B:1223:0x079b, B:1226:0x07a9, B:1229:0x07b7, B:1232:0x07c5, B:1235:0x07d3, B:1238:0x07e1, B:1241:0x07ec, B:1244:0x07fa, B:1247:0x0808, B:1250:0x0816, B:1253:0x0824, B:1256:0x0832, B:1259:0x0840, B:1262:0x084e, B:1265:0x085c, B:1268:0x086a, B:1271:0x0878, B:1274:0x0886, B:1277:0x0894, B:1280:0x08a2, B:1283:0x08b0, B:1286:0x08be, B:1289:0x08cc, B:1292:0x08da, B:1295:0x08e8, B:1298:0x08f6, B:1301:0x0904, B:1304:0x0912, B:1307:0x0920, B:1310:0x092e, B:1313:0x093c, B:1316:0x094a, B:1319:0x0958, B:1322:0x0966, B:1325:0x0974, B:1328:0x0982, B:1331:0x0990, B:1334:0x099e, B:1337:0x09ab, B:1340:0x09b9, B:1343:0x09c7, B:1346:0x09d5, B:1349:0x09e3, B:1352:0x09f1, B:1355:0x09ff, B:1358:0x0a0d, B:1361:0x0a1b, B:1364:0x0a29, B:1367:0x0a37, B:1370:0x0a45, B:1373:0x0a53, B:1376:0x0a61, B:1379:0x0a6f, B:1382:0x0a7d, B:1385:0x0a8b, B:1388:0x0a99, B:1391:0x0aa7, B:1394:0x0ab5, B:1397:0x0ac3, B:1400:0x0ad1, B:1403:0x0adf, B:1406:0x0aed, B:1409:0x0afb, B:1412:0x0b09, B:1415:0x0b17, B:1418:0x0b25, B:1421:0x0b33, B:1424:0x0b41, B:1427:0x0b4f, B:1430:0x0b5d, B:1433:0x0b6b, B:1436:0x0b79, B:1439:0x0b87, B:1442:0x0b95, B:1445:0x0ba3, B:1448:0x0bb1, B:1451:0x0bbf, B:1454:0x0bcd, B:1457:0x0bdb, B:1460:0x0be9, B:1463:0x0bf7, B:1466:0x0c05, B:1469:0x0c13, B:1472:0x0c21, B:1475:0x0c2f, B:1478:0x0c3d, B:1481:0x0c4b, B:1484:0x0c59, B:1487:0x0c67, B:1490:0x0c75, B:1493:0x0c83, B:1496:0x0c91, B:1499:0x0c9f, B:1502:0x0cac, B:1505:0x0cba, B:1508:0x0cc8, B:1511:0x0cd6, B:1514:0x0ce3, B:1517:0x0cf1, B:1520:0x0cff, B:1523:0x0d0d, B:1526:0x0d1b, B:1529:0x0d29, B:1532:0x0d37, B:1535:0x0d45, B:1538:0x0d53, B:1541:0x0d5e, B:1544:0x0d6c, B:1547:0x0d7a, B:1550:0x0d88, B:1553:0x0d96, B:1556:0x0da4, B:1559:0x0db2, B:1562:0x0dc0, B:1565:0x0dce, B:1568:0x0ddc, B:1571:0x0de9, B:1574:0x0df7, B:1577:0x0e05, B:1580:0x0e13, B:1583:0x0e21, B:1586:0x0e2f, B:1589:0x0e3d, B:1592:0x0e4b, B:1595:0x0e59, B:1598:0x0e67, B:1601:0x0e75, B:1604:0x0e83, B:1607:0x0e91, B:1610:0x0e9f, B:1613:0x0ead, B:1616:0x0ebb, B:1619:0x0ec9, B:1622:0x0ed6, B:1625:0x0ee4, B:1628:0x0ef2, B:1631:0x0f00, B:1634:0x0f0e, B:1637:0x0f1c, B:1640:0x0f2a, B:1643:0x0f38, B:1646:0x0f46, B:1649:0x0f54, B:1652:0x0f61, B:1655:0x0f6e, B:1658:0x0f7b, B:1661:0x0f88, B:1664:0x0f95, B:1667:0x0fa2, B:1670:0x0faf, B:1679:0x0725, B:1703:0x0643, B:1715:0x05fb, B:1720:0x0588), top: B:107:0x02eb }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x2534 A[Catch: all -> 0x26b8, TRY_ENTER, TryCatch #13 {all -> 0x26b8, blocks: (B:159:0x03b1, B:161:0x03c3, B:177:0x0447, B:180:0x045d, B:184:0x0474, B:195:0x04f2, B:205:0x0571, B:207:0x0577, B:210:0x058e, B:221:0x0608, B:227:0x061e, B:238:0x0654, B:244:0x067a, B:249:0x068d, B:255:0x06a5, B:267:0x06db, B:277:0x075e, B:294:0x2504, B:298:0x2534, B:302:0x2544, B:305:0x2551, B:310:0x256a, B:314:0x25a7, B:322:0x25e7, B:372:0x25db, B:378:0x259a, B:1674:0x24fe, B:1682:0x0733, B:1689:0x074f, B:1701:0x063d, B:1718:0x0582), top: B:158:0x03b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x2604 A[Catch: all -> 0x2619, TRY_ENTER, TryCatch #14 {all -> 0x2619, blocks: (B:328:0x2604, B:329:0x261d, B:331:0x2627, B:333:0x262d, B:336:0x2636, B:338:0x263e, B:342:0x264c, B:344:0x2686, B:346:0x268a, B:348:0x268e, B:350:0x2692, B:355:0x269c, B:356:0x26a6, B:1697:0x26bd, B:1699:0x26c9, B:137:0x26d4, B:139:0x26e2, B:141:0x26ef, B:143:0x26fc, B:145:0x270d, B:147:0x2712, B:149:0x2716, B:150:0x2718), top: B:134:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x263e A[Catch: all -> 0x2619, TryCatch #14 {all -> 0x2619, blocks: (B:328:0x2604, B:329:0x261d, B:331:0x2627, B:333:0x262d, B:336:0x2636, B:338:0x263e, B:342:0x264c, B:344:0x2686, B:346:0x268a, B:348:0x268e, B:350:0x2692, B:355:0x269c, B:356:0x26a6, B:1697:0x26bd, B:1699:0x26c9, B:137:0x26d4, B:139:0x26e2, B:141:0x26ef, B:143:0x26fc, B:145:0x270d, B:147:0x2712, B:149:0x2716, B:150:0x2718), top: B:134:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x2686 A[Catch: all -> 0x2619, TryCatch #14 {all -> 0x2619, blocks: (B:328:0x2604, B:329:0x261d, B:331:0x2627, B:333:0x262d, B:336:0x2636, B:338:0x263e, B:342:0x264c, B:344:0x2686, B:346:0x268a, B:348:0x268e, B:350:0x2692, B:355:0x269c, B:356:0x26a6, B:1697:0x26bd, B:1699:0x26c9, B:137:0x26d4, B:139:0x26e2, B:141:0x26ef, B:143:0x26fc, B:145:0x270d, B:147:0x2712, B:149:0x2716, B:150:0x2718), top: B:134:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x2649  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x2530  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x28c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x28de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x28d7  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v481, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v482 */
    /* JADX WARN: Type inference failed for: r9v641 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$processRemoteMessage$6(String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject;
        long clientUserId;
        int intValue;
        final int i3;
        boolean z;
        char c;
        int i4;
        String str11;
        long j2;
        long j3;
        long j4;
        long j5;
        String str12;
        Object obj;
        Object obj2;
        ?? r11;
        String str13;
        long j6;
        long j7;
        boolean z2;
        long j8;
        int i5;
        int i6;
        int i7;
        long j9;
        int i8;
        long j10;
        long j11;
        long j12;
        boolean z3;
        String str14;
        Object obj3;
        int i9;
        boolean z4;
        boolean z5;
        String str15;
        boolean z6;
        String[] strArr;
        String str16;
        String str17;
        long j13;
        boolean z7;
        boolean z8;
        boolean z9;
        Object obj4;
        Object obj5;
        String str18;
        String str19;
        String reactedText;
        String str20;
        String str21;
        boolean z10;
        String str22;
        int i10;
        long j14;
        final int i11;
        long j15;
        long j16;
        boolean z11;
        MessageObject messageObject;
        final int i12;
        Object obj6;
        boolean z12;
        char c2;
        char c3;
        String string;
        String formatString;
        String string2;
        String str23;
        String formatPluralStringComma;
        String formatPluralString;
        String formatPluralString2;
        String formatPluralString3;
        String formatPluralString4;
        String formatString2;
        int i13;
        int i14;
        int i15;
        String str24;
        int i16;
        String[] strArr2;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            str3 = "NotificationPaidMedia";
            sb.append(" START PROCESSING");
            FileLog.d(sb.toString());
        } else {
            str3 = "NotificationPaidMedia";
        }
        String str25 = null;
        try {
            byte[] decode = Base64.decode(str2, 8);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (SharedConfig.pushAuthKeyId == null) {
                str6 = "Photos";
                SharedConfig.pushAuthKeyId = new byte[8];
                str7 = "Videos";
                str8 = "MusicFiles";
                str9 = "Files";
                System.arraycopy(Utilities.computeSHA1(SharedConfig.pushAuthKey), r8.length - 8, SharedConfig.pushAuthKeyId, 0, 8);
            } else {
                str6 = "Photos";
                str7 = "Videos";
                str8 = "MusicFiles";
                str9 = "Files";
            }
            byte[] bArr = new byte[8];
            nativeByteBuffer.readBytes(bArr, true);
            if (!Arrays.equals(SharedConfig.pushAuthKeyId, bArr)) {
                onDecryptError();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format(Locale.US, str + " DECRYPT ERROR 2 k1=%s k2=%s, key=%s", Utilities.bytesToHex(SharedConfig.pushAuthKeyId), Utilities.bytesToHex(bArr), Utilities.bytesToHex(SharedConfig.pushAuthKey)));
                    return;
                }
                return;
            }
            byte[] bArr2 = new byte[16];
            nativeByteBuffer.readBytes(bArr2, true);
            MessageKeyData generateMessageKeyData = MessageKeyData.generateMessageKeyData(SharedConfig.pushAuthKey, bArr2, true, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, generateMessageKeyData.aesKey, generateMessageKeyData.aesIv, false, false, 24, decode.length - 24);
            byte[] bArr3 = SharedConfig.pushAuthKey;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.arraysEquals(bArr2, 0, Utilities.computeSHA256(bArr3, 96, 32, byteBuffer, 24, byteBuffer.limit()), 8)) {
                onDecryptError();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format(str + " DECRYPT ERROR 3, key = %s", Utilities.bytesToHex(SharedConfig.pushAuthKey)));
                    return;
                }
                return;
            }
            byte[] bArr4 = new byte[nativeByteBuffer.readInt32(true)];
            nativeByteBuffer.readBytes(bArr4, true);
            String str26 = new String(bArr4);
            try {
                JSONObject jSONObject2 = new JSONObject(str26);
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null && applicationLoader.consumePush(-1, jSONObject2)) {
                    countDownLatch.countDown();
                    return;
                }
                str5 = jSONObject2.has("loc_key") ? jSONObject2.getString("loc_key") : "";
                try {
                    if (jSONObject2.get("custom") instanceof JSONObject) {
                        try {
                            jSONObject = jSONObject2.getJSONObject("custom");
                        } catch (Throwable th) {
                            th = th;
                            str25 = str5;
                            str10 = str26;
                            str4 = str10;
                            str5 = str25;
                            i2 = -1;
                            i = -1;
                            if (i == i2) {
                            }
                            if (BuildVars.LOGS_ENABLED) {
                            }
                            FileLog.e(th);
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    Object obj7 = jSONObject2.has("user_id") ? jSONObject2.get("user_id") : null;
                    if (obj7 == null) {
                        clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    } else if (obj7 instanceof Long) {
                        clientUserId = ((Long) obj7).longValue();
                    } else {
                        if (obj7 instanceof Integer) {
                            intValue = ((Integer) obj7).intValue();
                        } else if (obj7 instanceof String) {
                            intValue = Utilities.parseInt((CharSequence) obj7).intValue();
                        } else {
                            clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                        }
                        clientUserId = intValue;
                    }
                    int i17 = UserConfig.selectedAccount;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= 4) {
                            i3 = i17;
                            z = false;
                            break;
                        } else {
                            if (UserConfig.getInstance(i18).getClientUserId() == clientUserId) {
                                i3 = i18;
                                z = true;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (!z) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(str + " ACCOUNT NOT FOUND");
                        }
                        countDownLatch.countDown();
                        return;
                    }
                    try {
                        if (!UserConfig.getInstance(i3).isClientActivated()) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d(str + " ACCOUNT NOT ACTIVATED");
                            }
                            countDownLatch.countDown();
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(str + " " + str5);
                        }
                        switch (str5.hashCode()) {
                            case -1963663249:
                                if (str5.equals("SESSION_REVOKE")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -920689527:
                                if (str5.equals("DC_UPDATE")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -763636569:
                                if (str5.equals("OAUTH_REQUEST")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 633004703:
                                if (str5.equals("MESSAGE_ANNOUNCEMENT")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1365673842:
                                if (str5.equals("GEO_LIVE_PENDING")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        try {
                            if (c == 0) {
                                int i19 = jSONObject.getInt("dc");
                                String[] split = jSONObject.getString("addr").split(":");
                                if (split.length != 2) {
                                    countDownLatch.countDown();
                                    return;
                                }
                                ConnectionsManager.getInstance(i3).applyDatacenterAddress(i19, split[0], Integer.parseInt(split[1]));
                                ConnectionsManager.getInstance(i3).resumeNetworkMaybe();
                                countDownLatch.countDown();
                                return;
                            }
                            if (c == 1) {
                                TL_update.TL_updateServiceNotification tL_updateServiceNotification = new TL_update.TL_updateServiceNotification();
                                tL_updateServiceNotification.popup = false;
                                tL_updateServiceNotification.flags = 2;
                                tL_updateServiceNotification.inbox_date = (int) (j / 1000);
                                tL_updateServiceNotification.message = jSONObject2.getString("message");
                                tL_updateServiceNotification.type = "announcement";
                                tL_updateServiceNotification.media = new TLRPC.TL_messageMediaEmpty();
                                final TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                                tL_updates.updates.add(tL_updateServiceNotification);
                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MessagesController.getInstance(i3).processUpdates(tL_updates, false);
                                    }
                                });
                                ConnectionsManager.getInstance(i3).resumeNetworkMaybe();
                                countDownLatch.countDown();
                                return;
                            }
                            if (c == 2) {
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PushListenerController.$r8$lambda$P1a24T7VvkcTjlUqZlJxlqIf4HM(i3);
                                    }
                                });
                                countDownLatch.countDown();
                                return;
                            }
                            if (c == 3) {
                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LocationController.getInstance(i3).setNewLocationEndWatchTime();
                                    }
                                });
                                countDownLatch.countDown();
                                return;
                            }
                            str2 = str26;
                            if (c == 4) {
                                if (jSONObject2.has("loc_args")) {
                                    JSONArray jSONArray = jSONObject2.getJSONArray("loc_args");
                                    int length = jSONArray.length();
                                    String[] strArr3 = new String[length];
                                    for (int i20 = 0; i20 < length; i20++) {
                                        strArr3[i20] = jSONArray.getString(i20);
                                    }
                                    if (length < 2) {
                                        return;
                                    }
                                    String optString = jSONObject.optString("url");
                                    if (TextUtils.isEmpty(optString)) {
                                        return;
                                    }
                                    String formatString3 = LocaleController.formatString(R.string.BotAuthNotification, strArr3[0], strArr3[1]);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.id = 2147483637;
                                    tL_message.random_id = 9223372036854775797L;
                                    tL_message.message = formatString3;
                                    tL_message.date = (int) (j / 1000);
                                    tL_message.dialog_id = UserObject.OAUTH;
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.peer_id = tL_peerUser;
                                    tL_peerUser.user_id = UserObject.OAUTH;
                                    tL_message.flags |= 256;
                                    tL_message.from_id = tL_peerUser;
                                    tL_message.silent = jSONObject.has("silent") && jSONObject.getInt("silent") != 0;
                                    MessageObject messageObject2 = new MessageObject(i3, tL_message, formatString3, optString, null, true, false, false, false);
                                    messageObject2.isOauthPush = true;
                                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                                    arrayList.add(messageObject2);
                                    FileLog.d("PushListenerController push OAUTH notification to NotificationsController of " + tL_message.dialog_id);
                                    NotificationsController.getInstance(i3).processNewMessages(arrayList, true, true, countDownLatch);
                                    return;
                                }
                                return;
                            }
                            if (jSONObject.has("channel_id")) {
                                j2 = 0;
                                try {
                                    j3 = jSONObject.getLong("channel_id");
                                    i4 = i3;
                                    str11 = " ";
                                    j4 = -j3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str2;
                                    i = i3;
                                    i2 = -1;
                                    if (i == i2) {
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                    }
                                    FileLog.e(th);
                                }
                            } else {
                                i4 = i3;
                                str11 = " ";
                                j2 = 0;
                                j3 = 0;
                                j4 = 0;
                            }
                            try {
                                if (jSONObject.has("from_id")) {
                                    j5 = jSONObject.getLong("from_id");
                                    j4 = j5;
                                } else {
                                    j5 = j2;
                                }
                                if (jSONObject.has("chat_id")) {
                                    str12 = "loc_args";
                                    long j17 = jSONObject.getLong("chat_id");
                                    obj = "STORY_LIVE";
                                    obj2 = "STORY_NOTEXT";
                                    j4 = -j17;
                                    r11 = j17;
                                } else {
                                    str12 = "loc_args";
                                    obj = "STORY_LIVE";
                                    obj2 = "STORY_NOTEXT";
                                    r11 = j2;
                                }
                                int i21 = jSONObject.has("topic_id") ? jSONObject.getInt("topic_id") : 0;
                                FileLog.d("recived push notification {" + str5 + "} chatId " + (r11 == true ? 1L : 0L) + " custom topicId " + i21);
                                if (jSONObject.has("encryption_id")) {
                                    str13 = "CHAT_REACT_";
                                    j6 = DialogObject.makeEncryptedDialogId(jSONObject.getInt("encryption_id"));
                                } else {
                                    str13 = "CHAT_REACT_";
                                    j6 = j4;
                                }
                                if (jSONObject.has("schedule")) {
                                    j7 = j6;
                                    if (jSONObject.getInt("schedule") == 1) {
                                        z2 = true;
                                        j8 = (j7 == j2 || !"ENCRYPTED_MESSAGE".equals(str5)) ? j7 : NotificationsController.globalSecretChatId;
                                        if (j8 != j2) {
                                            boolean z13 = z2;
                                            try {
                                                if (!"CONF_CALL_REQUEST".equals(str5)) {
                                                    try {
                                                        if (!"CONF_VIDEOCALL_REQUEST".equals(str5)) {
                                                            if ("READ_HISTORY".equals(str5)) {
                                                                int i22 = jSONObject.getInt("max_id");
                                                                ArrayList<TLRPC.Update> arrayList2 = new ArrayList<>();
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received read notification max_id = " + i22 + " for dialogId = " + j8);
                                                                }
                                                                if (j3 != j2) {
                                                                    TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                                                                    tL_updateReadChannelInbox.channel_id = j3;
                                                                    tL_updateReadChannelInbox.max_id = i22;
                                                                    tL_updateReadChannelInbox.still_unread_count = 0;
                                                                    arrayList2.add(tL_updateReadChannelInbox);
                                                                } else {
                                                                    TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                                                                    if (j5 != j2) {
                                                                        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                                        tL_updateReadHistoryInbox.peer = tL_peerUser2;
                                                                        tL_peerUser2.user_id = j5;
                                                                    } else {
                                                                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                                                        tL_updateReadHistoryInbox.peer = tL_peerChat;
                                                                        tL_peerChat.chat_id = r11 == true ? 1L : 0L;
                                                                    }
                                                                    tL_updateReadHistoryInbox.max_id = i22;
                                                                    arrayList2.add(tL_updateReadHistoryInbox);
                                                                }
                                                                MessagesController.getInstance(i4).processUpdateArray(arrayList2, null, null, false, 0);
                                                            } else {
                                                                long j18 = j5;
                                                                if ("READ_STORIES".equals(str5)) {
                                                                    NotificationsController.getInstance(i4).processReadStories(j8, jSONObject.getInt("max_id"));
                                                                } else if ("STORY_DELETED".equals(str5)) {
                                                                    NotificationsController.getInstance(i4).processDeleteStory(j8, jSONObject.getInt("story_id"));
                                                                } else {
                                                                    long j19 = j8;
                                                                    if ("MESSAGE_DELETED".equals(str5)) {
                                                                        String[] split2 = jSONObject.getString("messages").split(",");
                                                                        LongSparseArray longSparseArray = new LongSparseArray();
                                                                        ArrayList<Integer> arrayList3 = new ArrayList<>();
                                                                        for (String str27 : split2) {
                                                                            arrayList3.add(Utilities.parseInt((CharSequence) str27));
                                                                        }
                                                                        longSparseArray.put(-j3, arrayList3);
                                                                        NotificationsController.getInstance(i4).removeDeletedMessagesFromNotifications(longSparseArray, false);
                                                                        MessagesController.getInstance(i4).deleteMessagesByPush(j19, arrayList3, j3);
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                            FileLog.d(str + " received " + str5 + " for dialogId = " + j19 + " mids = " + TextUtils.join(",", arrayList3));
                                                                        }
                                                                    } else if ("READ_REACTION".equals(str5)) {
                                                                        String[] split3 = jSONObject.getString("messages").split(",");
                                                                        LongSparseArray longSparseArray2 = new LongSparseArray();
                                                                        ArrayList arrayList4 = new ArrayList();
                                                                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                                                        for (String str28 : split3) {
                                                                            Integer parseInt = Utilities.parseInt((CharSequence) str28);
                                                                            int intValue2 = parseInt.intValue();
                                                                            arrayList4.add(parseInt);
                                                                            sparseBooleanArray.put(intValue2, false);
                                                                        }
                                                                        longSparseArray2.put(-j3, arrayList4);
                                                                        NotificationsController.getInstance(i4).removeDeletedMessagesFromNotifications(longSparseArray2, true);
                                                                        MessagesController.getInstance(i4).checkUnreadReactions(j19, i21, sparseBooleanArray);
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                            FileLog.d(str + " received " + str5 + " for dialogId = " + j19 + " mids = " + TextUtils.join(",", arrayList4));
                                                                        }
                                                                    } else if (!TextUtils.isEmpty(str5)) {
                                                                        if (jSONObject.has("msg_id")) {
                                                                            i6 = jSONObject.getInt("msg_id");
                                                                        } else {
                                                                            i6 = jSONObject.has("story_id") ? jSONObject.getInt("story_id") : 0;
                                                                        }
                                                                        if (jSONObject.has("random_id")) {
                                                                            i7 = i21;
                                                                            j9 = Utilities.parseLong(jSONObject.getString("random_id")).longValue();
                                                                        } else {
                                                                            i7 = i21;
                                                                            j9 = j2;
                                                                        }
                                                                        if (i6 != 0) {
                                                                            i8 = i7;
                                                                            ConcurrentHashMap<Long, Integer> concurrentHashMap = MessagesController.getInstance(i4).dialogs_read_inbox_max;
                                                                            j10 = r11 == true ? 1 : 0;
                                                                            Integer num = concurrentHashMap.get(Long.valueOf(j19));
                                                                            if (num == null) {
                                                                                j11 = j19;
                                                                                j12 = j3;
                                                                                num = Integer.valueOf(MessagesStorage.getInstance(i4).getDialogReadMax(false, j11));
                                                                                MessagesController.getInstance(i4).dialogs_read_inbox_max.put(Long.valueOf(j11), num);
                                                                            } else {
                                                                                j11 = j19;
                                                                                j12 = j3;
                                                                            }
                                                                            z3 = i6 > num.intValue();
                                                                        } else {
                                                                            i8 = i7;
                                                                            j10 = r11 == true ? 1 : 0;
                                                                            j11 = j19;
                                                                            j12 = j3;
                                                                            if (j9 != j2) {
                                                                            }
                                                                        }
                                                                        if (str5.startsWith("REACT_")) {
                                                                            str14 = str13;
                                                                        } else {
                                                                            str14 = str13;
                                                                        }
                                                                        z3 = true;
                                                                        Object obj8 = obj2;
                                                                        int i23 = i6;
                                                                        if (str5.equals(obj8)) {
                                                                            obj3 = obj;
                                                                        } else {
                                                                            z4 = z3;
                                                                            obj3 = obj;
                                                                            if (!str5.equals(obj3) && !str5.equals("STORY_HIDDEN_AUTHOR")) {
                                                                                i9 = -1;
                                                                                if (!z4) {
                                                                                    int i24 = i9;
                                                                                    long j20 = j11;
                                                                                    long j21 = j9;
                                                                                    long j22 = j2;
                                                                                    long optLong = jSONObject.optLong("chat_from_id", j22);
                                                                                    long optLong2 = jSONObject.optLong("chat_from_broadcast_id", j22);
                                                                                    long optLong3 = jSONObject.optLong("chat_from_group_id", j22);
                                                                                    if (optLong == j22 && optLong3 == j22) {
                                                                                        z5 = false;
                                                                                        boolean z14 = (jSONObject.has("mention") || jSONObject.getInt("mention") == 0) ? false : true;
                                                                                        boolean z15 = (jSONObject.has("silent") || jSONObject.getInt("silent") == 0) ? false : true;
                                                                                        boolean z16 = z5;
                                                                                        str15 = str12;
                                                                                        if (jSONObject2.has(str15)) {
                                                                                            z6 = z14;
                                                                                            strArr = null;
                                                                                        } else {
                                                                                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str15);
                                                                                            int length2 = jSONArray2.length();
                                                                                            z6 = z14;
                                                                                            String[] strArr4 = new String[length2];
                                                                                            for (int i25 = 0; i25 < length2; i25++) {
                                                                                                strArr4[i25] = jSONArray2.getString(i25);
                                                                                            }
                                                                                            strArr = strArr4;
                                                                                        }
                                                                                        if (strArr != null && strArr.length > 0) {
                                                                                            str16 = strArr[0];
                                                                                            boolean has = jSONObject.has("edit_date");
                                                                                            if (!str5.startsWith("CHAT_") && strArr != null && strArr.length > 0) {
                                                                                                if (!UserObject.isReplyUser(j20)) {
                                                                                                    z8 = j12 != 0;
                                                                                                    j13 = 1000;
                                                                                                    z7 = false;
                                                                                                    str17 = str16;
                                                                                                    str16 = strArr[1];
                                                                                                    z9 = false;
                                                                                                    if (!str5.startsWith("REACT_")) {
                                                                                                    }
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    obj5 = obj3;
                                                                                                    str18 = str16;
                                                                                                    str19 = str17;
                                                                                                    reactedText = getReactedText(str5, strArr);
                                                                                                    str20 = reactedText;
                                                                                                    str21 = str19;
                                                                                                    str22 = str18;
                                                                                                    i10 = i23;
                                                                                                    z10 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str20 != null) {
                                                                                                    }
                                                                                                } else {
                                                                                                    str16 = str16 + " @ " + strArr[1];
                                                                                                    str17 = null;
                                                                                                    j13 = 1000;
                                                                                                    z7 = false;
                                                                                                    z9 = false;
                                                                                                    z8 = false;
                                                                                                    if (!str5.startsWith("REACT_")) {
                                                                                                    }
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    obj5 = obj3;
                                                                                                    str18 = str16;
                                                                                                    str19 = str17;
                                                                                                    reactedText = getReactedText(str5, strArr);
                                                                                                    str20 = reactedText;
                                                                                                    str21 = str19;
                                                                                                    str22 = str18;
                                                                                                    i10 = i23;
                                                                                                    z10 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str20 != null) {
                                                                                                    }
                                                                                                }
                                                                                            } else if (str5.startsWith("PINNED_")) {
                                                                                                if (str5.startsWith("CHANNEL_")) {
                                                                                                    str17 = null;
                                                                                                    j13 = 1000;
                                                                                                    z7 = true;
                                                                                                    z9 = false;
                                                                                                    z8 = false;
                                                                                                    if (!str5.startsWith("REACT_")) {
                                                                                                    }
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    obj5 = obj3;
                                                                                                    str18 = str16;
                                                                                                    str19 = str17;
                                                                                                    reactedText = getReactedText(str5, strArr);
                                                                                                    str20 = reactedText;
                                                                                                    str21 = str19;
                                                                                                    str22 = str18;
                                                                                                    i10 = i23;
                                                                                                    z10 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str20 != null) {
                                                                                                    }
                                                                                                }
                                                                                                str17 = null;
                                                                                                j13 = 1000;
                                                                                                z7 = false;
                                                                                                z9 = false;
                                                                                                z8 = false;
                                                                                                if (!str5.startsWith("REACT_")) {
                                                                                                }
                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                obj5 = obj3;
                                                                                                str18 = str16;
                                                                                                str19 = str17;
                                                                                                reactedText = getReactedText(str5, strArr);
                                                                                                str20 = reactedText;
                                                                                                str21 = str19;
                                                                                                str22 = str18;
                                                                                                i10 = i23;
                                                                                                z10 = false;
                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                }
                                                                                                if (str20 != null) {
                                                                                                }
                                                                                            } else {
                                                                                                z8 = j12 != 0;
                                                                                                str17 = null;
                                                                                                j13 = 1000;
                                                                                                z7 = false;
                                                                                                z9 = true;
                                                                                                if (!str5.startsWith("REACT_") || str5.startsWith(str14)) {
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    obj5 = obj3;
                                                                                                    str18 = str16;
                                                                                                    str19 = str17;
                                                                                                    reactedText = getReactedText(str5, strArr);
                                                                                                } else {
                                                                                                    switch (str5.hashCode()) {
                                                                                                        case -2104766184:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals(obj8)) {
                                                                                                                c2 = 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -2100047043:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GAME_SCORE")) {
                                                                                                                c2 = '&';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -2091498420:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                                                                                c2 = '=';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -2053872415:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_CREATED")) {
                                                                                                                c2 = 'd';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -2039746363:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STICKER")) {
                                                                                                                c2 = 28;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -2023218804:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                                                                                c2 = 'I';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1979538588:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_DOC")) {
                                                                                                                c2 = ':';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1979536003:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GEO")) {
                                                                                                                c2 = 'C';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1979535888:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GIF")) {
                                                                                                                c2 = 'E';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1969004705:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_ADD_MEMBER")) {
                                                                                                                c2 = 'h';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1946699248:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_JOINED")) {
                                                                                                                c2 = 'q';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1891964556:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                                                                                c2 = ']';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1833440864:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                c2 = 'N';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1717283471:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_REQ_JOINED")) {
                                                                                                                c2 = 'r';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1646640058:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_VOICECHAT_START")) {
                                                                                                                c2 = 'i';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1633328296:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_PAID_MEDIA")) {
                                                                                                                c2 = 16;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1528047021:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGES")) {
                                                                                                                c2 = 'x';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1507149394:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_RECURRING_PAY")) {
                                                                                                                c2 = 5;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1493579426:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_AUDIO")) {
                                                                                                                c2 = 29;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1482481933:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_MUTED")) {
                                                                                                                c2 = 150;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1480102982:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_PHOTO")) {
                                                                                                                c2 = 21;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1478041834:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_ROUND")) {
                                                                                                                c2 = 26;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1476974979:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STORY")) {
                                                                                                                c2 = 19;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1474543101:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_VIDEO")) {
                                                                                                                c2 = 23;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1465695932:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("ENCRYPTION_ACCEPT")) {
                                                                                                                c2 = 148;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1428026623:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CONF_CALL_MISSED")) {
                                                                                                                c2 = 141;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1374906292:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("ENCRYPTED_MESSAGE")) {
                                                                                                                c2 = 140;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1372940586:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_RETURNED")) {
                                                                                                                c2 = 'p';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1264245338:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_INVOICE")) {
                                                                                                                c2 = 138;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1236154001:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_DOCS")) {
                                                                                                                c2 = 'K';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1236086700:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_FWDS")) {
                                                                                                                c2 = 'G';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1236077786:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GAME")) {
                                                                                                                c2 = 'F';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1235796237:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_POLL")) {
                                                                                                                c2 = '?';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1235760759:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                                                                                c2 = '>';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1235686303:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_TEXT")) {
                                                                                                                c2 = 7;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1235677318:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_TODO")) {
                                                                                                                c2 = '@';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1198046100:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_VIDEO_SECRET")) {
                                                                                                                c2 = 24;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1124254527:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_CONTACT")) {
                                                                                                                c2 = 'X';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1085137927:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GAME")) {
                                                                                                                c2 = 136;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1084856378:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_POLL")) {
                                                                                                                c2 = 132;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1084820900:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_QUIZ")) {
                                                                                                                c2 = 131;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1084746444:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_TEXT")) {
                                                                                                                c2 = 'y';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -1084737459:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_TODO")) {
                                                                                                                c2 = 133;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -947756761:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                                                                                c2 = 'A';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -891852842:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("STORY_HIDDEN_AUTHOR")) {
                                                                                                                c2 = 2;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -819729482:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_STICKER")) {
                                                                                                                c2 = 127;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -772141857:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PHONE_CALL_REQUEST")) {
                                                                                                                c2 = 149;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -706345256:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                                                                                c2 = '\t';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -638310039:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_STICKER")) {
                                                                                                                c2 = ';';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -590403924:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GAME_SCORE")) {
                                                                                                                c2 = 137;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -589196239:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_DOC")) {
                                                                                                                c2 = '~';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -589193654:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GEO")) {
                                                                                                                c2 = 134;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -589193539:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GIF")) {
                                                                                                                c2 = 139;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -455004278:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_WALLPAPER")) {
                                                                                                                c2 = 4;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -440169325:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("AUTH_UNKNOWN")) {
                                                                                                                c2 = 144;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -412748110:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_DELETE_YOU")) {
                                                                                                                c2 = 'n';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -346082433:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                                                                                c2 = 'B';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -242433887:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_SAME_WALLPAPER")) {
                                                                                                                c2 = 3;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -228518075:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GEOLIVE")) {
                                                                                                                c2 = '#';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -213586509:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("ENCRYPTION_REQUEST")) {
                                                                                                                c2 = 147;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -115582002:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_INVOICE")) {
                                                                                                                c2 = 'c';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -112621464:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CONTACT_JOINED")) {
                                                                                                                c2 = 143;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -108522133:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("AUTH_REGION")) {
                                                                                                                c2 = 145;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -107572034:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_SCREENSHOT")) {
                                                                                                                c2 = 25;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -77243824:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_SUGGEST_BIRTHDAY")) {
                                                                                                                c2 = '1';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -40534265:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_DELETE_MEMBER")) {
                                                                                                                c2 = 'm';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case -35560251:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                                                                                c2 = 14;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 52369421:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("REACT_TEXT")) {
                                                                                                                c2 = 142;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 65254746:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_ADD_YOU")) {
                                                                                                                c2 = 'e';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 120441350:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GIVEAWAY")) {
                                                                                                                c2 = 130;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 141040782:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_LEFT")) {
                                                                                                                c2 = 'o';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 191667248:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                                                                                c2 = 15;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 202550149:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_VOICECHAT_INVITE")) {
                                                                                                                c2 = 'j';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 309993049:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_DOC")) {
                                                                                                                c2 = 'U';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 309995634:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GEO")) {
                                                                                                                c2 = '^';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 309995749:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GIF")) {
                                                                                                                c2 = '`';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 320532812:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGES")) {
                                                                                                                c2 = '2';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 328933854:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_STICKER")) {
                                                                                                                c2 = 'V';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 331340546:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                                                                                c2 = '<';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 342406591:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_VOICECHAT_END")) {
                                                                                                                c2 = 'k';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 344816990:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                                                                                c2 = '7';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 346878138:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_ROUND")) {
                                                                                                                c2 = '9';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 347944993:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_STORY")) {
                                                                                                                c2 = '6';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 350376871:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                                                                                c2 = '8';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 510462069:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GIFTCODE")) {
                                                                                                                c2 = '.';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 608430149:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                                                                                c2 = 'l';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 615714517:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_PHOTO_SECRET")) {
                                                                                                                c2 = 22;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 702966260:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                                                                                c2 = '\f';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 715508879:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_AUDIO")) {
                                                                                                                c2 = 128;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 728985323:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_PHOTO")) {
                                                                                                                c2 = '{';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 731046471:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_ROUND")) {
                                                                                                                c2 = '}';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 734545204:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_VIDEO")) {
                                                                                                                c2 = '|';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 802032552:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_CONTACT")) {
                                                                                                                c2 = 30;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 860688476:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                                                                                c2 = '\\';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 901537717:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                c2 = '4';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 954623703:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GIVEAWAY")) {
                                                                                                                c2 = '/';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 977076186:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STARGIFT")) {
                                                                                                                c2 = '\b';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 991498806:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_GEOLIVE")) {
                                                                                                                c2 = 135;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1007364121:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                                                                                c2 = '\'';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1019850010:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_DOCS")) {
                                                                                                                c2 = 'w';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1019917311:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_FWDS")) {
                                                                                                                c2 = 's';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1019926225:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GAME")) {
                                                                                                                c2 = 'a';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1020207774:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_POLL")) {
                                                                                                                c2 = 'Z';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1020243252:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_QUIZ")) {
                                                                                                                c2 = 'Y';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1020317708:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_TEXT")) {
                                                                                                                c2 = 'O';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1020326693:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_TODO")) {
                                                                                                                c2 = '[';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1054583304:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STORY_MENTION")) {
                                                                                                                c2 = 20;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060282259:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_DOCS")) {
                                                                                                                c2 = '-';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060349560:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_FWDS")) {
                                                                                                                c2 = ')';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060358474:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GAME")) {
                                                                                                                c2 = '%';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060640023:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_POLL")) {
                                                                                                                c2 = ' ';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060675501:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_QUIZ")) {
                                                                                                                c2 = 31;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060749957:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_TEXT")) {
                                                                                                                c2 = 6;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1060758942:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_TODO")) {
                                                                                                                c2 = '!';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1073049781:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_NOTEXT")) {
                                                                                                                c2 = 'z';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1078101399:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_TITLE_EDITED")) {
                                                                                                                c2 = 'f';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1110103437:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_NOTEXT")) {
                                                                                                                c2 = 'P';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1144183001:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                c2 = '0';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1151995881:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_PAID_MEDIA")) {
                                                                                                                c2 = '\r';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1160762272:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_PHOTOS")) {
                                                                                                                c2 = 't';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1172918249:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                                                                                c2 = 'D';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1234591620:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                                                                                c2 = 'b';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1281128640:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_DOC")) {
                                                                                                                c2 = 27;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1281131225:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GEO")) {
                                                                                                                c2 = '\"';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1281131340:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_GIF")) {
                                                                                                                c2 = '$';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1310789062:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_NOTEXT")) {
                                                                                                                c2 = 18;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1333118583:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_VIDEOS")) {
                                                                                                                c2 = 'u';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1361447897:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_PHOTOS")) {
                                                                                                                c2 = '*';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1369266398:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                                                                                c2 = 'M';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1420317335:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                                                                                c2 = '\n';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1449476787:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                                                                                c2 = '3';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1498266155:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PHONE_CALL_MISSED")) {
                                                                                                                c2 = 151;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1533804208:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_VIDEOS")) {
                                                                                                                c2 = '+';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1540131626:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_PLAYLIST")) {
                                                                                                                c2 = ',';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1547988151:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_AUDIO")) {
                                                                                                                c2 = 'W';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1561464595:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_PHOTO")) {
                                                                                                                c2 = 'R';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1563525743:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_ROUND")) {
                                                                                                                c2 = 'T';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1564592598:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_STORY")) {
                                                                                                                c2 = 'Q';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1567024476:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_VIDEO")) {
                                                                                                                c2 = 'S';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1810705077:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_INVOICE")) {
                                                                                                                c2 = '(';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1815177512:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGES")) {
                                                                                                                c2 = 'L';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1837240696:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_REACT_PAID_MEDIA")) {
                                                                                                                c2 = 17;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1954774321:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                                                                                c2 = 'v';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 1963241394:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("LOCKED_MESSAGE")) {
                                                                                                                c2 = 146;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2008915478:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals(obj3)) {
                                                                                                                c2 = 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2014789757:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_PHOTO_EDITED")) {
                                                                                                                c2 = 'g';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2022049433:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("PINNED_CONTACT")) {
                                                                                                                c2 = 129;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2034984710:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                                                                                c2 = 'J';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2048733346:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                                                                                c2 = '5';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2099392181:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                                                                                c2 = 'H';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2103150375:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                                                                                c2 = 11;
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        case 2140162142:
                                                                                                            str18 = str16;
                                                                                                            if (str5.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                                                                                c2 = '_';
                                                                                                                break;
                                                                                                            }
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                        default:
                                                                                                            str18 = str16;
                                                                                                            c3 = 65535;
                                                                                                            break;
                                                                                                    }
                                                                                                    c3 = c2;
                                                                                                    ?? r9 = "NotificationPinnedPaidMedia";
                                                                                                    str19 = str17;
                                                                                                    obj5 = obj3;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                switch (c3) {
                                                                                                                    case 0:
                                                                                                                        string = LocaleController.getString(R.string.StoryNotificationSingle);
                                                                                                                        str20 = string;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i24;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                            j14 = j20;
                                                                                                                        } else {
                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                            sb2.append(str);
                                                                                                                            sb2.append(" received message notification ");
                                                                                                                            sb2.append(str5);
                                                                                                                            sb2.append(" for dialogId = ");
                                                                                                                            j14 = j20;
                                                                                                                            sb2.append(j14);
                                                                                                                            sb2.append(" mid = ");
                                                                                                                            sb2.append(i10);
                                                                                                                            FileLog.d(sb2.toString());
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                                                                                                            if (str5.startsWith("REACT_STORY") && i10 > 0) {
                                                                                                                                i10 = -i10;
                                                                                                                            }
                                                                                                                            tL_message2.id = i10;
                                                                                                                            tL_message2.random_id = j21;
                                                                                                                            tL_message2.message = str25 != null ? str25 : str20;
                                                                                                                            tL_message2.date = (int) (j / j13);
                                                                                                                            if (z9) {
                                                                                                                                tL_message2.action = new TLRPC.TL_messageActionPinMessage();
                                                                                                                            }
                                                                                                                            if (z8) {
                                                                                                                                tL_message2.flags |= TLObject.FLAG_31;
                                                                                                                            }
                                                                                                                            tL_message2.dialog_id = j14;
                                                                                                                            if (j12 != 0) {
                                                                                                                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                                                                                                tL_message2.peer_id = tL_peerChannel;
                                                                                                                                i11 = i10;
                                                                                                                                tL_peerChannel.channel_id = j12;
                                                                                                                                j16 = j14;
                                                                                                                                j15 = j10;
                                                                                                                            } else {
                                                                                                                                i11 = i10;
                                                                                                                                if (j10 != 0) {
                                                                                                                                    TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                                                                                                    tL_message2.peer_id = tL_peerChat2;
                                                                                                                                    j15 = j10;
                                                                                                                                    tL_peerChat2.chat_id = j15;
                                                                                                                                    j16 = j14;
                                                                                                                                } else {
                                                                                                                                    j15 = j10;
                                                                                                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                                                                                                    tL_message2.peer_id = tL_peerUser3;
                                                                                                                                    j16 = j14;
                                                                                                                                    tL_peerUser3.user_id = j18;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            tL_message2.flags |= 256;
                                                                                                                            if (optLong3 != 0) {
                                                                                                                                TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                                                                                                                                tL_message2.from_id = tL_peerChat3;
                                                                                                                                tL_peerChat3.chat_id = j15;
                                                                                                                            } else if (optLong2 != 0) {
                                                                                                                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                                                                                                tL_message2.from_id = tL_peerChannel2;
                                                                                                                                tL_peerChannel2.channel_id = optLong2;
                                                                                                                            } else if (optLong != j22) {
                                                                                                                                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                                                                                                tL_message2.from_id = tL_peerUser4;
                                                                                                                                tL_peerUser4.user_id = optLong;
                                                                                                                            } else {
                                                                                                                                tL_message2.from_id = tL_message2.peer_id;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!z6 && !z9) {
                                                                                                                                    z11 = false;
                                                                                                                                    tL_message2.mentioned = z11;
                                                                                                                                    tL_message2.silent = z15;
                                                                                                                                    tL_message2.from_scheduled = z13;
                                                                                                                                    i12 = i4;
                                                                                                                                    messageObject = new MessageObject(i12, tL_message2, str20, str22, str21, z10, z7, z8, has);
                                                                                                                                    if (i8 != 0) {
                                                                                                                                        messageObject.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                                                                                                                                        TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
                                                                                                                                        messageReplyHeader.forum_topic = true;
                                                                                                                                        messageReplyHeader.reply_to_top_id = i8;
                                                                                                                                    }
                                                                                                                                    boolean startsWith = str5.startsWith("REACT_STORY");
                                                                                                                                    messageObject.isStoryReactionPush = startsWith;
                                                                                                                                    messageObject.isReactionPush = startsWith && (str5.startsWith("REACT_") || str5.startsWith(str14));
                                                                                                                                    if (str5.equals(obj8)) {
                                                                                                                                        obj6 = obj4;
                                                                                                                                        if (!str5.equals(obj6)) {
                                                                                                                                            z12 = false;
                                                                                                                                            messageObject.isStoryPush = z12;
                                                                                                                                            messageObject.isLiveStoryPush = str5.equals(obj5);
                                                                                                                                            messageObject.isStoryMentionPush = str5.equals("MESSAGE_STORY_MENTION");
                                                                                                                                            messageObject.isStoryPushHidden = str5.equals(obj6);
                                                                                                                                            ArrayList<MessageObject> arrayList5 = new ArrayList<>();
                                                                                                                                            arrayList5.add(messageObject);
                                                                                                                                            FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                                                                                            if (!messageObject.isStoryReactionPush && !messageObject.isReactionPush && !messageObject.isStoryMentionPush && !messageObject.isStoryPush && !messageObject.isStoryPushHidden && !z6 && !z9 && i11 > 0) {
                                                                                                                                                final long j23 = j16;
                                                                                                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                                    @Override // java.lang.Runnable
                                                                                                                                                    public final void run() {
                                                                                                                                                        MessagesController.getInstance(i12).reportMessageDelivery(j23, i11, true);
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                            }
                                                                                                                                            NotificationsController.getInstance(i12).processNewMessages(arrayList5, true, true, countDownLatch);
                                                                                                                                            i5 = i12;
                                                                                                                                            ConnectionsManager.onInternalPushReceived(i5);
                                                                                                                                            ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        obj6 = obj4;
                                                                                                                                    }
                                                                                                                                    z12 = true;
                                                                                                                                    messageObject.isStoryPush = z12;
                                                                                                                                    messageObject.isLiveStoryPush = str5.equals(obj5);
                                                                                                                                    messageObject.isStoryMentionPush = str5.equals("MESSAGE_STORY_MENTION");
                                                                                                                                    messageObject.isStoryPushHidden = str5.equals(obj6);
                                                                                                                                    ArrayList<MessageObject> arrayList52 = new ArrayList<>();
                                                                                                                                    arrayList52.add(messageObject);
                                                                                                                                    FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                                                                                    if (!messageObject.isStoryReactionPush) {
                                                                                                                                        final long j232 = j16;
                                                                                                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                            @Override // java.lang.Runnable
                                                                                                                                            public final void run() {
                                                                                                                                                MessagesController.getInstance(i12).reportMessageDelivery(j232, i11, true);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                    NotificationsController.getInstance(i12).processNewMessages(arrayList52, true, true, countDownLatch);
                                                                                                                                    i5 = i12;
                                                                                                                                    ConnectionsManager.onInternalPushReceived(i5);
                                                                                                                                    ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                                                                                                }
                                                                                                                                messageObject = new MessageObject(i12, tL_message2, str20, str22, str21, z10, z7, z8, has);
                                                                                                                                if (i8 != 0) {
                                                                                                                                }
                                                                                                                                boolean startsWith2 = str5.startsWith("REACT_STORY");
                                                                                                                                messageObject.isStoryReactionPush = startsWith2;
                                                                                                                                messageObject.isReactionPush = startsWith2 && (str5.startsWith("REACT_") || str5.startsWith(str14));
                                                                                                                                if (str5.equals(obj8)) {
                                                                                                                                }
                                                                                                                                z12 = true;
                                                                                                                                messageObject.isStoryPush = z12;
                                                                                                                                messageObject.isLiveStoryPush = str5.equals(obj5);
                                                                                                                                messageObject.isStoryMentionPush = str5.equals("MESSAGE_STORY_MENTION");
                                                                                                                                messageObject.isStoryPushHidden = str5.equals(obj6);
                                                                                                                                ArrayList<MessageObject> arrayList522 = new ArrayList<>();
                                                                                                                                arrayList522.add(messageObject);
                                                                                                                                FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                                                                                if (!messageObject.isStoryReactionPush) {
                                                                                                                                }
                                                                                                                                NotificationsController.getInstance(i12).processNewMessages(arrayList522, true, true, countDownLatch);
                                                                                                                                i5 = i12;
                                                                                                                                ConnectionsManager.onInternalPushReceived(i5);
                                                                                                                                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                                                                                            } catch (Throwable th3) {
                                                                                                                                th = th3;
                                                                                                                                r11 = i12;
                                                                                                                                i3 = r11;
                                                                                                                                str4 = str2;
                                                                                                                                i = i3;
                                                                                                                                i2 = -1;
                                                                                                                                if (i == i2) {
                                                                                                                                }
                                                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                                                }
                                                                                                                                FileLog.e(th);
                                                                                                                            }
                                                                                                                            z11 = true;
                                                                                                                            tL_message2.mentioned = z11;
                                                                                                                            tL_message2.silent = z15;
                                                                                                                            tL_message2.from_scheduled = z13;
                                                                                                                            i12 = i4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        string = LocaleController.getString(R.string.StoryLiveNotificationSingle);
                                                                                                                        str20 = string;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i24;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        string = LocaleController.formatPluralString("StoryNotificationHidden", 1, new Object[0]);
                                                                                                                        str20 = string;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i24;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        formatString = LocaleController.formatString("ActionSetSameWallpaperForThisChat", R.string.ActionSetSameWallpaperForThisChat, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.WallpaperSameNotification);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        formatString = LocaleController.formatString("ActionSetWallpaperForThisChat", R.string.ActionSetWallpaperForThisChat, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.WallpaperNotification);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 5:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageRecurringPay", R.string.NotificationMessageRecurringPay, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 6:
                                                                                                                    case 7:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageText", R.string.NotificationMessageText, strArr[0], strArr[1]);
                                                                                                                        string2 = strArr[1];
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\b':
                                                                                                                        str23 = strArr[0];
                                                                                                                        formatString = LocaleController.formatPluralStringComma("NotificationMessageStarGift", Integer.parseInt(strArr[1]), strArr[0]);
                                                                                                                        formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Notification", Integer.parseInt(strArr[1]));
                                                                                                                        str25 = formatPluralStringComma;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\t':
                                                                                                                        str23 = strArr[0];
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGift, str23);
                                                                                                                        formatPluralStringComma = LocaleController.getString(R.string.Gift2UniqueNotification);
                                                                                                                        str25 = formatPluralStringComma;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\n':
                                                                                                                        str23 = strArr[0];
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUpgrade, str23);
                                                                                                                        formatPluralStringComma = LocaleController.getString(R.string.Gift2UniqueUpgradeNotification);
                                                                                                                        str25 = formatPluralStringComma;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 11:
                                                                                                                        str23 = strArr[0];
                                                                                                                        formatString = LocaleController.formatPluralStringComma("NotificationMessageUniqueStarGiftPrepaidUpgrade", Integer.parseInt(strArr[1]), strArr[0]);
                                                                                                                        formatPluralStringComma = LocaleController.getString(R.string.Gift2UniquePrepaidUpgradeNotification);
                                                                                                                        str25 = formatPluralStringComma;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\f':
                                                                                                                        str23 = strArr[0];
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUnpackUpgrade, str23);
                                                                                                                        formatPluralStringComma = LocaleController.getString(R.string.Gift2UniqueUnpackUpgradeNotification);
                                                                                                                        str25 = formatPluralStringComma;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\r':
                                                                                                                        String str29 = str3;
                                                                                                                        int parseInt2 = Integer.parseInt(strArr[1]);
                                                                                                                        formatPluralString = LocaleController.formatPluralString("NotificationMessagePaidMedia", parseInt2, strArr[0]);
                                                                                                                        formatPluralString2 = LocaleController.formatPluralString(str29, parseInt2, new Object[0]);
                                                                                                                        str25 = formatPluralString2;
                                                                                                                        str20 = formatPluralString;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 14:
                                                                                                                        String str30 = str3;
                                                                                                                        int parseInt3 = Integer.parseInt(strArr[1]);
                                                                                                                        formatPluralString = LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", parseInt3, strArr[0]);
                                                                                                                        formatPluralString2 = LocaleController.formatPluralString(str30, parseInt3, new Object[0]);
                                                                                                                        str25 = formatPluralString2;
                                                                                                                        str20 = formatPluralString;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 15:
                                                                                                                        int parseInt4 = Integer.parseInt(strArr[2]);
                                                                                                                        formatPluralString = LocaleController.formatPluralString("NotificationChatMessagePaidMedia", parseInt4, strArr[0], strArr[1]);
                                                                                                                        formatPluralString2 = LocaleController.formatPluralString(str3, parseInt4, new Object[0]);
                                                                                                                        str25 = formatPluralString2;
                                                                                                                        str20 = formatPluralString;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 16:
                                                                                                                        int parseInt5 = Integer.parseInt(strArr[1]);
                                                                                                                        formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr[0]);
                                                                                                                        formatPluralString4 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr[0]);
                                                                                                                        str25 = formatPluralString4;
                                                                                                                        formatPluralString = formatPluralString3;
                                                                                                                        str20 = formatPluralString;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 17:
                                                                                                                        int parseInt6 = Integer.parseInt(strArr[1]);
                                                                                                                        formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr[0]);
                                                                                                                        formatPluralString4 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr[0]);
                                                                                                                        str25 = formatPluralString4;
                                                                                                                        formatPluralString = formatPluralString3;
                                                                                                                        str20 = formatPluralString;
                                                                                                                        str21 = str19;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 18:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageNoText", R.string.NotificationMessageNoText, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.Message);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 19:
                                                                                                                        formatString = LocaleController.formatString("NotificationStory", R.string.NotificationStory, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.Story);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 20:
                                                                                                                        reactedText = LocaleController.getString(R.string.StoryNotificationMention);
                                                                                                                        break;
                                                                                                                    case 21:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessagePhoto", R.string.NotificationMessagePhoto, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 22:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageSDPhoto", R.string.NotificationMessageSDPhoto, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachDestructingPhoto);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 23:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageVideo", R.string.NotificationMessageVideo, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 24:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageSDVideo", R.string.NotificationMessageSDVideo, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachDestructingVideo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 25:
                                                                                                                        reactedText = LocaleController.getString(R.string.ActionTakeScreenshoot).replace("un1", strArr[0]);
                                                                                                                        break;
                                                                                                                    case 26:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageRound", R.string.NotificationMessageRound, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachRound);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 27:
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageDocument", R.string.NotificationMessageDocument, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 28:
                                                                                                                        String str31 = str11;
                                                                                                                        if (strArr.length > 1 && !TextUtils.isEmpty(strArr[1])) {
                                                                                                                            formatString = LocaleController.formatString("NotificationMessageStickerEmoji", R.string.NotificationMessageStickerEmoji, strArr[0], strArr[1]);
                                                                                                                            string2 = strArr[1] + str31 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        } else {
                                                                                                                            formatString = LocaleController.formatString("NotificationMessageSticker", R.string.NotificationMessageSticker, strArr[0]);
                                                                                                                            string2 = LocaleController.getString(R.string.AttachSticker);
                                                                                                                        }
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 29:
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageAudio, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 30:
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageContact2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachContact);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 31:
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageQuiz2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.QuizPoll);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ' ':
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessagePoll2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.Poll);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '!':
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageTodo2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.Todo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\"':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageMap", R.string.NotificationMessageMap, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '#':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageLiveLocation", R.string.NotificationMessageLiveLocation, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '$':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGif", R.string.NotificationMessageGif, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGif);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '%':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGame);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '&':
                                                                                                                    case '\'':
                                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGameScored", R.string.NotificationMessageGameScored, strArr[0], strArr[1], strArr[2]);
                                                                                                                        break;
                                                                                                                    case '(':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageInvoice", R.string.NotificationMessageInvoice, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ')':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageForwardFew", R.string.NotificationMessageForwardFew, strArr[0], LocaleController.formatPluralString("messages", Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '*':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr[0], LocaleController.formatPluralString(str6, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '+':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr[0], LocaleController.formatPluralString(str7, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ',':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr[0], LocaleController.formatPluralString(str8, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '-':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '.':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageGiftCode", R.string.NotificationMessageGiftCode, strArr[0], LocaleController.formatPluralString("Months", Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '/':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationMessageGiveaway", R.string.NotificationMessageGiveaway, strArr[0], strArr[1], strArr[2]);
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '0':
                                                                                                                        try {
                                                                                                                            i13 = Integer.parseInt(strArr[1]);
                                                                                                                        } catch (Exception unused) {
                                                                                                                            i13 = 1;
                                                                                                                        }
                                                                                                                        formatString2 = LocaleController.formatString(R.string.NotificationMessageStarsGiveaway2, strArr[0], LocaleController.formatPluralString("AmongWinners", i13, new Object[0]), strArr[2]);
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '1':
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageSuggestBirthday, strArr[0]);
                                                                                                                        break;
                                                                                                                    case '2':
                                                                                                                        formatString2 = LocaleController.formatString(R.string.NotificationMessageAlbum, strArr[0]);
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '3':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageChannelGiveaway", R.string.NotificationMessageChannelGiveaway, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '4':
                                                                                                                        try {
                                                                                                                            i14 = Integer.parseInt(strArr[1]);
                                                                                                                        } catch (Exception unused2) {
                                                                                                                            i14 = 1;
                                                                                                                        }
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageChannelStarsGiveaway2, strArr[0], LocaleController.formatPluralString("AmongWinners", i14, new Object[0]), strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '5':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageNoText", R.string.ChannelMessageNoText, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.Message);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '6':
                                                                                                                        formatString = LocaleController.formatString("NotificationChannelStory", R.string.NotificationChannelStory, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.Story);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '7':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessagePhoto", R.string.ChannelMessagePhoto, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '8':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageVideo", R.string.ChannelMessageVideo, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '9':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageRound", R.string.ChannelMessageRound, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachRound);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ':':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageDocument", R.string.ChannelMessageDocument, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case ';':
                                                                                                                        String str32 = str11;
                                                                                                                        if (strArr.length > 1 && !TextUtils.isEmpty(strArr[1])) {
                                                                                                                            formatString = LocaleController.formatString("ChannelMessageStickerEmoji", R.string.ChannelMessageStickerEmoji, strArr[0], strArr[1]);
                                                                                                                            string2 = strArr[1] + str32 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        } else {
                                                                                                                            formatString = LocaleController.formatString("ChannelMessageSticker", R.string.ChannelMessageSticker, strArr[0]);
                                                                                                                            string2 = LocaleController.getString(R.string.AttachSticker);
                                                                                                                        }
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '<':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageAudio", R.string.ChannelMessageAudio, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '=':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageContact2", R.string.ChannelMessageContact2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachContact);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '>':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageQuiz2", R.string.ChannelMessageQuiz2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.QuizPoll);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '?':
                                                                                                                        formatString = LocaleController.formatString(R.string.ChannelMessagePoll2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.Poll);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '@':
                                                                                                                        formatString = LocaleController.formatString(R.string.ChannelMessageTodo2, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.Todo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'A':
                                                                                                                        reactedText = LocaleController.formatString(R.string.ChannelMessageTodoDone2, strArr[0], strArr[2]);
                                                                                                                        break;
                                                                                                                    case 'B':
                                                                                                                        reactedText = LocaleController.formatString(R.string.ChannelMessageTodoAppend2, strArr[0], strArr[2]);
                                                                                                                        break;
                                                                                                                    case 'C':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageMap", R.string.ChannelMessageMap, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'D':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageLiveLocation", R.string.ChannelMessageLiveLocation, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'E':
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageGIF", R.string.ChannelMessageGIF, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGif);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'F':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGame);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'G':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr[0], LocaleController.formatPluralString("ForwardedMessageCount", Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]).toLowerCase());
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'H':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr[0], LocaleController.formatPluralString(str6, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'I':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr[0], LocaleController.formatPluralString(str7, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'J':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr[0], LocaleController.formatPluralString(str8, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'K':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr[1]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'L':
                                                                                                                        formatString2 = LocaleController.formatString("ChannelMessageAlbum", R.string.ChannelMessageAlbum, strArr[0]);
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'M':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageChatGiveaway", R.string.NotificationMessageChatGiveaway, strArr[0], strArr[1], strArr[2], strArr[3]);
                                                                                                                        string2 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'N':
                                                                                                                        try {
                                                                                                                            i15 = Integer.parseInt(strArr[2]);
                                                                                                                        } catch (Exception unused3) {
                                                                                                                            i15 = 1;
                                                                                                                        }
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageChatStarsGiveaway2, strArr[0], strArr[1], LocaleController.formatPluralString("AmongWinners", i15, new Object[0]), strArr[3]);
                                                                                                                        string2 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'O':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupText", R.string.NotificationMessageGroupText, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = strArr[2];
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'P':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupNoText", R.string.NotificationMessageGroupNoText, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.Message);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'Q':
                                                                                                                        formatString = LocaleController.formatString("NotificationChatStory", R.string.NotificationChatStory, strArr[0]);
                                                                                                                        string2 = LocaleController.getString(R.string.Story);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'R':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupPhoto", R.string.NotificationMessageGroupPhoto, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'S':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupVideo", R.string.NotificationMessageGroupVideo, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'T':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupRound", R.string.NotificationMessageGroupRound, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachRound);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'U':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupDocument", R.string.NotificationMessageGroupDocument, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'V':
                                                                                                                        if (strArr.length > 2 && !TextUtils.isEmpty(strArr[2])) {
                                                                                                                            formatString = LocaleController.formatString("NotificationMessageGroupStickerEmoji", R.string.NotificationMessageGroupStickerEmoji, strArr[0], strArr[1], strArr[2]);
                                                                                                                            string2 = strArr[2] + str11 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        } else {
                                                                                                                            String str33 = str11;
                                                                                                                            formatString = LocaleController.formatString("NotificationMessageGroupSticker", R.string.NotificationMessageGroupSticker, strArr[0], strArr[1]);
                                                                                                                            string2 = strArr[1] + str33 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        }
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'W':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupAudio", R.string.NotificationMessageGroupAudio, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'X':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupContact2", R.string.NotificationMessageGroupContact2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachContact);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'Y':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupQuiz2", R.string.NotificationMessageGroupQuiz2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.PollQuiz);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'Z':
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.Poll);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '[':
                                                                                                                        formatString = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.Todo);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '\\':
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageGroupTodoDone2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        break;
                                                                                                                    case ']':
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationMessageGroupTodoAppend2, strArr[0], strArr[1], strArr[2]);
                                                                                                                        break;
                                                                                                                    case '^':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '_':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupLiveLocation", R.string.NotificationMessageGroupLiveLocation, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case '`':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupGif", R.string.NotificationMessageGroupGif, strArr[0], strArr[1]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGif);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'a':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupGame", R.string.NotificationMessageGroupGame, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.AttachGame);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'b':
                                                                                                                        reactedText = LocaleController.formatString("NotificationMessageGroupGameScored", R.string.NotificationMessageGroupGameScored, strArr[0], strArr[1], strArr[2], strArr[3]);
                                                                                                                        break;
                                                                                                                    case 'c':
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupInvoice", R.string.NotificationMessageGroupInvoice, strArr[0], strArr[1], strArr[2]);
                                                                                                                        string2 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                        str25 = string2;
                                                                                                                        str23 = str19;
                                                                                                                        str20 = formatString;
                                                                                                                        str21 = str23;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'd':
                                                                                                                    case 'e':
                                                                                                                        reactedText = LocaleController.formatString("NotificationInvitedToGroup", R.string.NotificationInvitedToGroup, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'f':
                                                                                                                        reactedText = LocaleController.formatString("NotificationEditedGroupName", R.string.NotificationEditedGroupName, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'g':
                                                                                                                        reactedText = LocaleController.formatString("NotificationEditedGroupPhoto", R.string.NotificationEditedGroupPhoto, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'h':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupAddMember", R.string.NotificationGroupAddMember, strArr[0], strArr[1], strArr[2]);
                                                                                                                        break;
                                                                                                                    case 'i':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupCreatedCall", R.string.NotificationGroupCreatedCall, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'j':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupInvitedToCall", R.string.NotificationGroupInvitedToCall, strArr[0], strArr[1], strArr[2]);
                                                                                                                        break;
                                                                                                                    case 'k':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupEndedCall", R.string.NotificationGroupEndedCall, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'l':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupInvitedYouToCall", R.string.NotificationGroupInvitedYouToCall, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'm':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupKickMember", R.string.NotificationGroupKickMember, strArr[0], strArr[1], strArr.length <= 2 ? "" : strArr[2]);
                                                                                                                        break;
                                                                                                                    case 'n':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupKickYou", R.string.NotificationGroupKickYou, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'o':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupLeftMember", R.string.NotificationGroupLeftMember, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'p':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupAddSelf", R.string.NotificationGroupAddSelf, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'q':
                                                                                                                        reactedText = LocaleController.formatString("NotificationGroupAddSelfMega", R.string.NotificationGroupAddSelfMega, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 'r':
                                                                                                                        reactedText = LocaleController.formatString("UserAcceptedToGroupPushWithGroup", R.string.UserAcceptedToGroupPushWithGroup, strArr[0], strArr[1]);
                                                                                                                        break;
                                                                                                                    case 's':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationGroupForwardedFew", R.string.NotificationGroupForwardedFew, strArr[0], strArr[1], LocaleController.formatPluralString("messages", Utilities.parseInt((CharSequence) strArr[2]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 't':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr[0], strArr[1], LocaleController.formatPluralString(str6, Utilities.parseInt((CharSequence) strArr[2]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'u':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr[0], strArr[1], LocaleController.formatPluralString(str7, Utilities.parseInt((CharSequence) strArr[2]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'v':
                                                                                                                        formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr[0], strArr[1], LocaleController.formatPluralString(str8, Utilities.parseInt((CharSequence) strArr[2]).intValue(), new Object[0]));
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'w':
                                                                                                                        int i26 = i4;
                                                                                                                        try {
                                                                                                                            i4 = i26;
                                                                                                                            formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr[0], strArr[1], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr[2]).intValue(), new Object[0]));
                                                                                                                            str24 = str18;
                                                                                                                            str20 = formatString2;
                                                                                                                            str22 = str24;
                                                                                                                            str21 = str19;
                                                                                                                            i10 = i23;
                                                                                                                            z10 = true;
                                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                                            }
                                                                                                                            if (str20 != null) {
                                                                                                                            }
                                                                                                                        } catch (Throwable th4) {
                                                                                                                            th = th4;
                                                                                                                            i4 = i26;
                                                                                                                            i3 = i4;
                                                                                                                            str4 = str2;
                                                                                                                            i = i3;
                                                                                                                            i2 = -1;
                                                                                                                            if (i == i2) {
                                                                                                                                ConnectionsManager.onInternalPushReceived(i);
                                                                                                                                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                                                                                                                                countDownLatch.countDown();
                                                                                                                            } else {
                                                                                                                                onDecryptError();
                                                                                                                            }
                                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                                                FileLog.e("error in loc_key = " + str5 + " json " + str4);
                                                                                                                            }
                                                                                                                            FileLog.e(th);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'x':
                                                                                                                        int i27 = i4;
                                                                                                                        formatString2 = LocaleController.formatString("NotificationGroupAlbum", R.string.NotificationGroupAlbum, strArr[0], strArr[1]);
                                                                                                                        i4 = i27;
                                                                                                                        str24 = str18;
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 'y':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedTextUser", R.string.NotificationActionPinnedTextUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedText", R.string.NotificationActionPinnedText, strArr[0], strArr[1], strArr[2]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedTextChannel", R.string.NotificationActionPinnedTextChannel, strArr[0], strArr[1]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case 'z':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedNoTextUser", R.string.NotificationActionPinnedNoTextUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedNoText", R.string.NotificationActionPinnedNoText, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedNoTextChannel", R.string.NotificationActionPinnedNoTextChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case '{':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedPhotoUser", R.string.NotificationActionPinnedPhotoUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedPhoto", R.string.NotificationActionPinnedPhoto, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedPhotoChannel", R.string.NotificationActionPinnedPhotoChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case '|':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVideoUser", R.string.NotificationActionPinnedVideoUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVideo", R.string.NotificationActionPinnedVideo, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVideoChannel", R.string.NotificationActionPinnedVideoChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case '}':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedRoundUser", R.string.NotificationActionPinnedRoundUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedRound", R.string.NotificationActionPinnedRound, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedRoundChannel", R.string.NotificationActionPinnedRoundChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case '~':
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedFileUser", R.string.NotificationActionPinnedFileUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedFile", R.string.NotificationActionPinnedFile, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedFileChannel", R.string.NotificationActionPinnedFileChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.needDeleteBusinessLink /* 127 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            if (strArr.length > 1 && !TextUtils.isEmpty(strArr[1])) {
                                                                                                                                reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmojiUser", R.string.NotificationActionPinnedStickerEmojiUser, strArr[0], strArr[1]);
                                                                                                                            } else {
                                                                                                                                reactedText = LocaleController.formatString("NotificationActionPinnedStickerUser", R.string.NotificationActionPinnedStickerUser, strArr[0]);
                                                                                                                            }
                                                                                                                        } else if (z16) {
                                                                                                                            if (strArr.length > 2 && !TextUtils.isEmpty(strArr[2])) {
                                                                                                                                reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmoji", R.string.NotificationActionPinnedStickerEmoji, strArr[0], strArr[2], strArr[1]);
                                                                                                                            } else {
                                                                                                                                reactedText = LocaleController.formatString("NotificationActionPinnedSticker", R.string.NotificationActionPinnedSticker, strArr[0], strArr[1]);
                                                                                                                            }
                                                                                                                        } else if (strArr.length > 1 && !TextUtils.isEmpty(strArr[1])) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmojiChannel", R.string.NotificationActionPinnedStickerEmojiChannel, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedStickerChannel", R.string.NotificationActionPinnedStickerChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case 128:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVoiceUser", R.string.NotificationActionPinnedVoiceUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVoice", R.string.NotificationActionPinnedVoice, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedVoiceChannel", R.string.NotificationActionPinnedVoiceChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.messageTranslating /* 129 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedContactUser", R.string.NotificationActionPinnedContactUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedContact2", R.string.NotificationActionPinnedContact2, strArr[0], strArr[2], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedContactChannel2", R.string.NotificationActionPinnedContactChannel2, strArr[0], strArr[1]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.dialogIsTranslatable /* 130 */:
                                                                                                                        i16 = i4;
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationPinnedGiveaway, strArr[0]);
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.dialogTranslate /* 131 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuizUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, strArr[0], strArr[2], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, strArr[0], strArr[1]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.didGenerateFingerprintKeyPair /* 132 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPollUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPoll2, strArr[0], strArr[2], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, strArr[0], strArr[1]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.walletPendingTransactionsChanged /* 133 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodoUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodo2, strArr[0], strArr[2], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, strArr[0], strArr[1]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.walletSyncProgressChanged /* 134 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeo, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.httpFileDidLoad /* 135 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.httpFileDidFailedLoad /* 136 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGame, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.didUpdateConnectionState /* 137 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScore, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.fileUploaded /* 138 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoice, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.fileUploadFailed /* 139 */:
                                                                                                                        i16 = i4;
                                                                                                                        if (j8 > j2) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGifUser, strArr[0], strArr[1]);
                                                                                                                        } else if (z16) {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGif, strArr[0], strArr[1]);
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, strArr[0]);
                                                                                                                        }
                                                                                                                        i4 = i16;
                                                                                                                        break;
                                                                                                                    case NotificationCenter.fileUploadProgressChanged /* 140 */:
                                                                                                                        formatString2 = LocaleController.getString(R.string.YouHaveNewMessage);
                                                                                                                        i4 = i4;
                                                                                                                        str24 = LocaleController.getString(R.string.SecretChatName);
                                                                                                                        str20 = formatString2;
                                                                                                                        str22 = str24;
                                                                                                                        str21 = str19;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = true;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case NotificationCenter.fileLoadProgressChanged /* 141 */:
                                                                                                                        try {
                                                                                                                            i16 = i4;
                                                                                                                            VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i16, jSONObject.getLong("call_id"));
                                                                                                                            int parseInt7 = Integer.parseInt(strArr[1]);
                                                                                                                            if (parseInt7 <= 0) {
                                                                                                                                reactedText = LocaleController.formatString(R.string.NotificationActionMissedCallConference, strArr[0]);
                                                                                                                            } else {
                                                                                                                                reactedText = LocaleController.formatPluralStringComma("NotificationActionMissedCallConferenceOther", parseInt7, strArr[0]);
                                                                                                                            }
                                                                                                                            i4 = i16;
                                                                                                                            break;
                                                                                                                        } catch (Throwable th5) {
                                                                                                                            th = th5;
                                                                                                                            r9 = i4;
                                                                                                                            i3 = r9;
                                                                                                                            str4 = str2;
                                                                                                                            i = i3;
                                                                                                                            i2 = -1;
                                                                                                                            if (i == i2) {
                                                                                                                            }
                                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                                            }
                                                                                                                            FileLog.e(th);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                            FileLog.w("unhandled loc_key = " + str5);
                                                                                                                        }
                                                                                                                    case NotificationCenter.fileLoaded /* 142 */:
                                                                                                                    case NotificationCenter.fileLoadFailed /* 143 */:
                                                                                                                    case NotificationCenter.filePreparingStarted /* 144 */:
                                                                                                                    case NotificationCenter.fileNewChunkAvailable /* 145 */:
                                                                                                                    case NotificationCenter.filePreparingFailed /* 146 */:
                                                                                                                    case NotificationCenter.dialogsUnreadCounterChanged /* 147 */:
                                                                                                                    case NotificationCenter.messagePlayingProgressDidChanged /* 148 */:
                                                                                                                    case NotificationCenter.messagePlayingDidReset /* 149 */:
                                                                                                                    case 150:
                                                                                                                    case NotificationCenter.messagePlayingDidStart /* 151 */:
                                                                                                                        str21 = str19;
                                                                                                                        str20 = null;
                                                                                                                        str22 = str18;
                                                                                                                        i10 = i23;
                                                                                                                        z10 = false;
                                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                                        }
                                                                                                                        if (str20 != null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                            }
                                                                                                        } catch (Throwable th7) {
                                                                                                            th = th7;
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        th = th8;
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                str20 = reactedText;
                                                                                                str21 = str19;
                                                                                                str22 = str18;
                                                                                                i10 = i23;
                                                                                                z10 = false;
                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                }
                                                                                                if (str20 != null) {
                                                                                                }
                                                                                            }
                                                                                            countDownLatch.countDown();
                                                                                            ConnectionsManager.onInternalPushReceived(i5);
                                                                                            ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                                                        }
                                                                                        str16 = null;
                                                                                        boolean has2 = jSONObject.has("edit_date");
                                                                                        if (!str5.startsWith("CHAT_")) {
                                                                                        }
                                                                                        if (str5.startsWith("PINNED_")) {
                                                                                        }
                                                                                    }
                                                                                    z5 = true;
                                                                                    if (jSONObject.has("mention")) {
                                                                                    }
                                                                                    if (jSONObject.has("silent")) {
                                                                                    }
                                                                                    boolean z162 = z5;
                                                                                    str15 = str12;
                                                                                    if (jSONObject2.has(str15)) {
                                                                                    }
                                                                                    if (strArr != null) {
                                                                                        str16 = strArr[0];
                                                                                        boolean has22 = jSONObject.has("edit_date");
                                                                                        if (!str5.startsWith("CHAT_")) {
                                                                                        }
                                                                                        if (str5.startsWith("PINNED_")) {
                                                                                        }
                                                                                    }
                                                                                    str16 = null;
                                                                                    boolean has222 = jSONObject.has("edit_date");
                                                                                    if (!str5.startsWith("CHAT_")) {
                                                                                    }
                                                                                    if (str5.startsWith("PINNED_")) {
                                                                                    }
                                                                                } else {
                                                                                    int i28 = i4;
                                                                                    if ("CONF_CALL_MISSED".equalsIgnoreCase(str5)) {
                                                                                        VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i28, jSONObject.getLong("call_id"));
                                                                                    }
                                                                                    i5 = i28;
                                                                                    countDownLatch.countDown();
                                                                                    ConnectionsManager.onInternalPushReceived(i5);
                                                                                    ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                                                }
                                                                            }
                                                                        }
                                                                        i9 = jSONObject.has("story_id") ? jSONObject.getInt("story_id") : -1;
                                                                        z4 = i9 >= 0;
                                                                        if (!z4) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        r11 = i4;
                                                    }
                                                }
                                                int i29 = i4;
                                                String str34 = str12;
                                                long j24 = jSONObject.getLong("call_id");
                                                int i30 = jSONObject.getInt("msg_id");
                                                if (jSONObject2.has(str34)) {
                                                    JSONArray jSONArray3 = jSONObject2.getJSONArray(str34);
                                                    int length3 = jSONArray3.length();
                                                    strArr2 = new String[length3];
                                                    for (int i31 = 0; i31 < length3; i31++) {
                                                        strArr2[i31] = jSONArray3.getString(i31);
                                                    }
                                                } else {
                                                    strArr2 = null;
                                                }
                                                if (System.currentTimeMillis() - j < MessagesController.getInstance(i29).callRingTimeout) {
                                                    Context context = ApplicationLoader.applicationContext;
                                                    if (strArr2 != null && strArr2.length > 2) {
                                                        str25 = strArr2[2];
                                                    }
                                                    i5 = i29;
                                                    VoIPGroupNotification.request(context, i5, j8, str25, j24, i30, "CONF_VIDEOCALL_REQUEST".equals(str5));
                                                } else {
                                                    i5 = i29;
                                                    VoIPGroupNotification.hide(ApplicationLoader.applicationContext, i5, i30);
                                                }
                                                countDownLatch.countDown();
                                                ConnectionsManager.onInternalPushReceived(i5);
                                                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                            } catch (Throwable th10) {
                                                th = th10;
                                            }
                                        }
                                        i5 = i4;
                                        countDownLatch.countDown();
                                        ConnectionsManager.onInternalPushReceived(i5);
                                        ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                    }
                                } else {
                                    j7 = j6;
                                }
                                z2 = false;
                                if (j7 == j2) {
                                }
                                if (j8 != j2) {
                                }
                                i5 = i4;
                                countDownLatch.countDown();
                                ConnectionsManager.onInternalPushReceived(i5);
                                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        str2 = str26;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    str10 = str26;
                    str25 = str5;
                    str4 = str10;
                    str5 = str25;
                    i2 = -1;
                    i = -1;
                    if (i == i2) {
                    }
                    if (BuildVars.LOGS_ENABLED) {
                    }
                    FileLog.e(th);
                }
            } catch (Throwable th15) {
                th = th15;
            }
        } catch (Throwable th16) {
            th = th16;
            str4 = null;
            str5 = null;
        }
    }

    public static /* synthetic */ void $r8$lambda$P1a24T7VvkcTjlUqZlJxlqIf4HM(int i) {
        if (UserConfig.getInstance(i).getClientUserId() != 0) {
            UserConfig.getInstance(i).clearConfig();
            MessagesController.getInstance(i).performLogout(0);
        }
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "CHAT_REACT_CONTACT":
                return LocaleController.formatString(R.string.PushChatReactContact, objArr);
            case "REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushReactGeoLocation, objArr);
            case "REACT_STORY_HIDDEN":
                return LocaleController.formatString(R.string.PushReactStoryHidden, objArr);
            case "REACT_HIDDEN":
                return LocaleController.formatString(R.string.PushReactHidden, objArr);
            case "CHAT_REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushChatReactNotext, objArr);
            case "REACT_NOTEXT":
                return LocaleController.formatString(R.string.PushReactNoText, objArr);
            case "CHAT_REACT_INVOICE":
                return LocaleController.formatString(R.string.PushChatReactInvoice, objArr);
            case "REACT_CONTACT":
                return LocaleController.formatString(R.string.PushReactContect, objArr);
            case "CHAT_REACT_STICKER":
                return LocaleController.formatString(R.string.PushChatReactSticker, objArr);
            case "REACT_GAME":
                return LocaleController.formatString(R.string.PushReactGame, objArr);
            case "REACT_POLL":
                return LocaleController.formatString(R.string.PushReactPoll, objArr);
            case "REACT_QUIZ":
                return LocaleController.formatString(R.string.PushReactQuiz, objArr);
            case "REACT_TEXT":
                return LocaleController.formatString(R.string.PushReactText, objArr);
            case "REACT_TODO":
                return LocaleController.formatString(R.string.PushReactTodo, objArr);
            case "REACT_INVOICE":
                return LocaleController.formatString(R.string.PushReactInvoice, objArr);
            case "CHAT_REACT_DOC":
                return LocaleController.formatString(R.string.PushChatReactDoc, objArr);
            case "CHAT_REACT_GEO":
                return LocaleController.formatString(R.string.PushChatReactGeo, objArr);
            case "CHAT_REACT_GIF":
                return LocaleController.formatString(R.string.PushChatReactGif, objArr);
            case "REACT_STICKER":
                return LocaleController.formatString(R.string.PushReactSticker, objArr);
            case "CHAT_REACT_AUDIO":
                return LocaleController.formatString(R.string.PushChatReactAudio, objArr);
            case "CHAT_REACT_PHOTO":
                return LocaleController.formatString(R.string.PushChatReactPhoto, objArr);
            case "CHAT_REACT_ROUND":
                return LocaleController.formatString(R.string.PushChatReactRound, objArr);
            case "CHAT_REACT_VIDEO":
                return LocaleController.formatString(R.string.PushChatReactVideo, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationChatReactGiveaway, objArr);
            case "REACT_GIVEAWAY":
                return LocaleController.formatString(R.string.NotificationReactGiveaway, objArr);
            case "CHAT_REACT_GEOLIVE":
                return LocaleController.formatString(R.string.PushChatReactGeoLive, objArr);
            case "REACT_AUDIO":
                return LocaleController.formatString(R.string.PushReactAudio, objArr);
            case "REACT_PHOTO":
                return LocaleController.formatString(R.string.PushReactPhoto, objArr);
            case "REACT_ROUND":
                return LocaleController.formatString(R.string.PushReactRound, objArr);
            case "REACT_STORY":
                return LocaleController.formatString(R.string.PushReactStory, objArr);
            case "REACT_VIDEO":
                return LocaleController.formatString(R.string.PushReactVideo, objArr);
            case "REACT_DOC":
                return LocaleController.formatString(R.string.PushReactDoc, objArr);
            case "REACT_GEO":
                return LocaleController.formatString(R.string.PushReactGeo, objArr);
            case "REACT_GIF":
                return LocaleController.formatString(R.string.PushReactGif, objArr);
            case "CHAT_REACT_GAME":
                return LocaleController.formatString(R.string.PushChatReactGame, objArr);
            case "CHAT_REACT_POLL":
                return LocaleController.formatString(R.string.PushChatReactPoll, objArr);
            case "CHAT_REACT_QUIZ":
                return LocaleController.formatString(R.string.PushChatReactQuiz, objArr);
            case "CHAT_REACT_TEXT":
                return LocaleController.formatString(R.string.PushChatReactText, objArr);
            case "CHAT_REACT_TODO":
                return LocaleController.formatString(R.string.PushChatReactTodo, objArr);
            default:
                return null;
        }
    }

    private static void onDecryptError() {
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                ConnectionsManager.onInternalPushReceived(i);
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static final class GooglePushListenerServiceProvider implements IPushListenerServiceProvider {
        public static final GooglePushListenerServiceProvider INSTANCE = new GooglePushListenerServiceProvider();
        private Boolean hasServices;

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public int getPushType() {
            return 2;
        }

        private GooglePushListenerServiceProvider() {
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public String getLogTitle() {
            return "Google Play Services";
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public void onRequestPushToken() {
            String str = SharedConfig.pushString;
            if (!TextUtils.isEmpty(str)) {
                if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED) {
                    FileLog.d("FCM regId = " + str);
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("FCM Registration not found.");
            }
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$GooglePushListenerServiceProvider$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    PushListenerController.GooglePushListenerServiceProvider.$r8$lambda$gT5eU7N3XlxjHqspPS2JecxQcmM(PushListenerController.GooglePushListenerServiceProvider.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$gT5eU7N3XlxjHqspPS2JecxQcmM(final GooglePushListenerServiceProvider googlePushListenerServiceProvider) {
            googlePushListenerServiceProvider.getClass();
            try {
                SharedConfig.pushStringGetTimeStart = SystemClock.elapsedRealtime();
                FirebaseApp.initializeApp(ApplicationLoader.applicationContext);
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.messenger.PushListenerController$GooglePushListenerServiceProvider$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        PushListenerController.GooglePushListenerServiceProvider.$r8$lambda$Bgux8VgBg6mpsPaBEPXd9XSPbcQ(PushListenerController.GooglePushListenerServiceProvider.this, task);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public static /* synthetic */ void $r8$lambda$Bgux8VgBg6mpsPaBEPXd9XSPbcQ(GooglePushListenerServiceProvider googlePushListenerServiceProvider, Task task) {
            googlePushListenerServiceProvider.getClass();
            SharedConfig.pushStringGetTimeEnd = SystemClock.elapsedRealtime();
            if (!task.isSuccessful()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Failed to get regid");
                }
                SharedConfig.pushStringStatus = "__FIREBASE_FAILED__";
                PushListenerController.sendRegistrationToServer(googlePushListenerServiceProvider.getPushType(), null);
                return;
            }
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(googlePushListenerServiceProvider.getPushType(), str);
        }

        @Override // org.telegram.messenger.PushListenerController.IPushListenerServiceProvider
        public boolean hasServices() {
            if (this.hasServices == null) {
                try {
                    this.hasServices = Boolean.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(ApplicationLoader.applicationContext) == 0);
                } catch (Exception e) {
                    FileLog.e(e);
                    this.hasServices = Boolean.FALSE;
                }
            }
            return this.hasServices.booleanValue();
        }
    }
}
