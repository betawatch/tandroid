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
                PushListenerController.lambda$sendRegistrationToServer$1(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(final String str, final int i) {
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
                        PushListenerController.lambda$sendRegistrationToServer$0(i2, i, str);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i, int i2, String str) {
        MessagesController.getInstance(i).registerForPush(i2, str);
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
                PushListenerController.lambda$processRemoteMessage$7(str2, str, j);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(final String str, final String str2, final long j) {
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
    /* JADX WARN: Code restructure failed: missing block: B:1670:0x05df, code lost:
    
        if (org.telegram.messenger.MessagesStorage.getInstance(r14).checkMessageByRandomId(r1) == false) goto L251;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:262:0x075c. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:1635:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:1640:0x0730 A[Catch: all -> 0x124d, TryCatch #7 {all -> 0x124d, blocks: (B:222:0x0630, B:228:0x0650, B:231:0x066b, B:236:0x068e, B:247:0x06be, B:257:0x0740, B:259:0x0746, B:261:0x0758, B:355:0x1214, B:1619:0x11cf, B:1633:0x0717, B:1640:0x0730), top: B:221:0x0630 }] */
    /* JADX WARN: Removed duplicated region for block: B:1644:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:1646:0x0658 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1718:0x295c A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0674 A[Catch: all -> 0x0663, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0663, blocks: (B:1647:0x0658, B:233:0x0674, B:238:0x0694, B:240:0x06a3, B:243:0x06b4, B:246:0x06b8, B:250:0x06ce, B:252:0x06d1, B:254:0x06d7, B:269:0x11ef, B:271:0x11f3, B:1170:0x0767, B:1174:0x0777, B:1177:0x0789, B:1180:0x079b, B:1183:0x07ad, B:1186:0x07bf, B:1189:0x07d1, B:1192:0x07e3, B:1195:0x07f5, B:1198:0x0807, B:1201:0x0817, B:1204:0x0829, B:1207:0x083b, B:1210:0x084d, B:1213:0x085f, B:1216:0x0871, B:1219:0x0883, B:1222:0x0895, B:1225:0x08a7, B:1228:0x08b9, B:1231:0x08cb, B:1234:0x08dd, B:1237:0x08ef, B:1240:0x0901, B:1243:0x0913, B:1246:0x0925, B:1249:0x0937, B:1252:0x0949, B:1255:0x095b, B:1258:0x096d, B:1261:0x097f, B:1264:0x0991, B:1267:0x09a3, B:1270:0x09b5, B:1273:0x09c7, B:1276:0x09d9, B:1279:0x09eb, B:1282:0x09fd, B:1285:0x0a0f, B:1288:0x0a20, B:1291:0x0a32, B:1294:0x0a44, B:1297:0x0a56, B:1300:0x0a68, B:1303:0x0a7a, B:1306:0x0a8c, B:1309:0x0a9e, B:1312:0x0ab0, B:1315:0x0ac2, B:1318:0x0ad4, B:1321:0x0ae6, B:1324:0x0af8, B:1327:0x0b0a, B:1330:0x0b1c, B:1333:0x0b2e, B:1336:0x0b3f, B:1339:0x0b51, B:1342:0x0b63, B:1345:0x0b75, B:1348:0x0b87, B:1351:0x0b99, B:1354:0x0bab, B:1357:0x0bbd, B:1360:0x0bcf, B:1363:0x0be1, B:1366:0x0bf3, B:1369:0x0c05, B:1372:0x0c17, B:1375:0x0c29, B:1378:0x0c3b, B:1381:0x0c4d, B:1384:0x0c5f, B:1387:0x0c71, B:1390:0x0c83, B:1393:0x0c95, B:1396:0x0ca7, B:1399:0x0cb9, B:1402:0x0ccb, B:1405:0x0cdd, B:1408:0x0cef, B:1411:0x0d01, B:1414:0x0d13, B:1417:0x0d25, B:1420:0x0d37, B:1423:0x0d49, B:1426:0x0d5b, B:1429:0x0d6d, B:1432:0x0d7d, B:1435:0x0d8f, B:1438:0x0da1, B:1441:0x0db3, B:1444:0x0dc5, B:1447:0x0dd7, B:1450:0x0de7, B:1453:0x0df9, B:1456:0x0e0b, B:1459:0x0e1d, B:1462:0x0e2d, B:1465:0x0e3f, B:1468:0x0e51, B:1471:0x0e63, B:1474:0x0e75, B:1477:0x0e87, B:1480:0x0e97, B:1483:0x0ea9, B:1486:0x0ebb, B:1489:0x0ecd, B:1492:0x0edf, B:1495:0x0ef1, B:1498:0x0f03, B:1501:0x0f15, B:1504:0x0f27, B:1507:0x0f39, B:1510:0x0f4b, B:1513:0x0f5d, B:1516:0x0f6f, B:1519:0x0f80, B:1522:0x0f92, B:1525:0x0fa4, B:1528:0x0fb6, B:1531:0x0fc8, B:1534:0x0fda, B:1537:0x0fec, B:1540:0x0ffe, B:1543:0x1010, B:1546:0x1022, B:1549:0x1034, B:1552:0x1046, B:1555:0x1058, B:1558:0x106a, B:1561:0x107c, B:1564:0x108e, B:1567:0x10a0, B:1570:0x10b0, B:1573:0x10c2, B:1576:0x10d4, B:1579:0x10e6, B:1582:0x10f8, B:1585:0x110a, B:1588:0x111c, B:1591:0x112e, B:1594:0x1140, B:1597:0x1152, B:1600:0x1164, B:1603:0x1176, B:1606:0x1187, B:1609:0x1198, B:1612:0x11a9, B:1615:0x11ba, B:1628:0x0707), top: B:1646:0x0658 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0694 A[Catch: all -> 0x0663, TRY_ENTER, TryCatch #1 {all -> 0x0663, blocks: (B:1647:0x0658, B:233:0x0674, B:238:0x0694, B:240:0x06a3, B:243:0x06b4, B:246:0x06b8, B:250:0x06ce, B:252:0x06d1, B:254:0x06d7, B:269:0x11ef, B:271:0x11f3, B:1170:0x0767, B:1174:0x0777, B:1177:0x0789, B:1180:0x079b, B:1183:0x07ad, B:1186:0x07bf, B:1189:0x07d1, B:1192:0x07e3, B:1195:0x07f5, B:1198:0x0807, B:1201:0x0817, B:1204:0x0829, B:1207:0x083b, B:1210:0x084d, B:1213:0x085f, B:1216:0x0871, B:1219:0x0883, B:1222:0x0895, B:1225:0x08a7, B:1228:0x08b9, B:1231:0x08cb, B:1234:0x08dd, B:1237:0x08ef, B:1240:0x0901, B:1243:0x0913, B:1246:0x0925, B:1249:0x0937, B:1252:0x0949, B:1255:0x095b, B:1258:0x096d, B:1261:0x097f, B:1264:0x0991, B:1267:0x09a3, B:1270:0x09b5, B:1273:0x09c7, B:1276:0x09d9, B:1279:0x09eb, B:1282:0x09fd, B:1285:0x0a0f, B:1288:0x0a20, B:1291:0x0a32, B:1294:0x0a44, B:1297:0x0a56, B:1300:0x0a68, B:1303:0x0a7a, B:1306:0x0a8c, B:1309:0x0a9e, B:1312:0x0ab0, B:1315:0x0ac2, B:1318:0x0ad4, B:1321:0x0ae6, B:1324:0x0af8, B:1327:0x0b0a, B:1330:0x0b1c, B:1333:0x0b2e, B:1336:0x0b3f, B:1339:0x0b51, B:1342:0x0b63, B:1345:0x0b75, B:1348:0x0b87, B:1351:0x0b99, B:1354:0x0bab, B:1357:0x0bbd, B:1360:0x0bcf, B:1363:0x0be1, B:1366:0x0bf3, B:1369:0x0c05, B:1372:0x0c17, B:1375:0x0c29, B:1378:0x0c3b, B:1381:0x0c4d, B:1384:0x0c5f, B:1387:0x0c71, B:1390:0x0c83, B:1393:0x0c95, B:1396:0x0ca7, B:1399:0x0cb9, B:1402:0x0ccb, B:1405:0x0cdd, B:1408:0x0cef, B:1411:0x0d01, B:1414:0x0d13, B:1417:0x0d25, B:1420:0x0d37, B:1423:0x0d49, B:1426:0x0d5b, B:1429:0x0d6d, B:1432:0x0d7d, B:1435:0x0d8f, B:1438:0x0da1, B:1441:0x0db3, B:1444:0x0dc5, B:1447:0x0dd7, B:1450:0x0de7, B:1453:0x0df9, B:1456:0x0e0b, B:1459:0x0e1d, B:1462:0x0e2d, B:1465:0x0e3f, B:1468:0x0e51, B:1471:0x0e63, B:1474:0x0e75, B:1477:0x0e87, B:1480:0x0e97, B:1483:0x0ea9, B:1486:0x0ebb, B:1489:0x0ecd, B:1492:0x0edf, B:1495:0x0ef1, B:1498:0x0f03, B:1501:0x0f15, B:1504:0x0f27, B:1507:0x0f39, B:1510:0x0f4b, B:1513:0x0f5d, B:1516:0x0f6f, B:1519:0x0f80, B:1522:0x0f92, B:1525:0x0fa4, B:1528:0x0fb6, B:1531:0x0fc8, B:1534:0x0fda, B:1537:0x0fec, B:1540:0x0ffe, B:1543:0x1010, B:1546:0x1022, B:1549:0x1034, B:1552:0x1046, B:1555:0x1058, B:1558:0x106a, B:1561:0x107c, B:1564:0x108e, B:1567:0x10a0, B:1570:0x10b0, B:1573:0x10c2, B:1576:0x10d4, B:1579:0x10e6, B:1582:0x10f8, B:1585:0x110a, B:1588:0x111c, B:1591:0x112e, B:1594:0x1140, B:1597:0x1152, B:1600:0x1164, B:1603:0x1176, B:1606:0x1187, B:1609:0x1198, B:1612:0x11a9, B:1615:0x11ba, B:1628:0x0707), top: B:1646:0x0658 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06b4 A[Catch: all -> 0x0663, TryCatch #1 {all -> 0x0663, blocks: (B:1647:0x0658, B:233:0x0674, B:238:0x0694, B:240:0x06a3, B:243:0x06b4, B:246:0x06b8, B:250:0x06ce, B:252:0x06d1, B:254:0x06d7, B:269:0x11ef, B:271:0x11f3, B:1170:0x0767, B:1174:0x0777, B:1177:0x0789, B:1180:0x079b, B:1183:0x07ad, B:1186:0x07bf, B:1189:0x07d1, B:1192:0x07e3, B:1195:0x07f5, B:1198:0x0807, B:1201:0x0817, B:1204:0x0829, B:1207:0x083b, B:1210:0x084d, B:1213:0x085f, B:1216:0x0871, B:1219:0x0883, B:1222:0x0895, B:1225:0x08a7, B:1228:0x08b9, B:1231:0x08cb, B:1234:0x08dd, B:1237:0x08ef, B:1240:0x0901, B:1243:0x0913, B:1246:0x0925, B:1249:0x0937, B:1252:0x0949, B:1255:0x095b, B:1258:0x096d, B:1261:0x097f, B:1264:0x0991, B:1267:0x09a3, B:1270:0x09b5, B:1273:0x09c7, B:1276:0x09d9, B:1279:0x09eb, B:1282:0x09fd, B:1285:0x0a0f, B:1288:0x0a20, B:1291:0x0a32, B:1294:0x0a44, B:1297:0x0a56, B:1300:0x0a68, B:1303:0x0a7a, B:1306:0x0a8c, B:1309:0x0a9e, B:1312:0x0ab0, B:1315:0x0ac2, B:1318:0x0ad4, B:1321:0x0ae6, B:1324:0x0af8, B:1327:0x0b0a, B:1330:0x0b1c, B:1333:0x0b2e, B:1336:0x0b3f, B:1339:0x0b51, B:1342:0x0b63, B:1345:0x0b75, B:1348:0x0b87, B:1351:0x0b99, B:1354:0x0bab, B:1357:0x0bbd, B:1360:0x0bcf, B:1363:0x0be1, B:1366:0x0bf3, B:1369:0x0c05, B:1372:0x0c17, B:1375:0x0c29, B:1378:0x0c3b, B:1381:0x0c4d, B:1384:0x0c5f, B:1387:0x0c71, B:1390:0x0c83, B:1393:0x0c95, B:1396:0x0ca7, B:1399:0x0cb9, B:1402:0x0ccb, B:1405:0x0cdd, B:1408:0x0cef, B:1411:0x0d01, B:1414:0x0d13, B:1417:0x0d25, B:1420:0x0d37, B:1423:0x0d49, B:1426:0x0d5b, B:1429:0x0d6d, B:1432:0x0d7d, B:1435:0x0d8f, B:1438:0x0da1, B:1441:0x0db3, B:1444:0x0dc5, B:1447:0x0dd7, B:1450:0x0de7, B:1453:0x0df9, B:1456:0x0e0b, B:1459:0x0e1d, B:1462:0x0e2d, B:1465:0x0e3f, B:1468:0x0e51, B:1471:0x0e63, B:1474:0x0e75, B:1477:0x0e87, B:1480:0x0e97, B:1483:0x0ea9, B:1486:0x0ebb, B:1489:0x0ecd, B:1492:0x0edf, B:1495:0x0ef1, B:1498:0x0f03, B:1501:0x0f15, B:1504:0x0f27, B:1507:0x0f39, B:1510:0x0f4b, B:1513:0x0f5d, B:1516:0x0f6f, B:1519:0x0f80, B:1522:0x0f92, B:1525:0x0fa4, B:1528:0x0fb6, B:1531:0x0fc8, B:1534:0x0fda, B:1537:0x0fec, B:1540:0x0ffe, B:1543:0x1010, B:1546:0x1022, B:1549:0x1034, B:1552:0x1046, B:1555:0x1058, B:1558:0x106a, B:1561:0x107c, B:1564:0x108e, B:1567:0x10a0, B:1570:0x10b0, B:1573:0x10c2, B:1576:0x10d4, B:1579:0x10e6, B:1582:0x10f8, B:1585:0x110a, B:1588:0x111c, B:1591:0x112e, B:1594:0x1140, B:1597:0x1152, B:1600:0x1164, B:1603:0x1176, B:1606:0x1187, B:1609:0x1198, B:1612:0x11a9, B:1615:0x11ba, B:1628:0x0707), top: B:1646:0x0658 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0746 A[Catch: all -> 0x124d, TryCatch #7 {all -> 0x124d, blocks: (B:222:0x0630, B:228:0x0650, B:231:0x066b, B:236:0x068e, B:247:0x06be, B:257:0x0740, B:259:0x0746, B:261:0x0758, B:355:0x1214, B:1619:0x11cf, B:1633:0x0717, B:1640:0x0730), top: B:221:0x0630 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x26c8 A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x26f6 A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x27c2 A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x27fd A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x283d A[Catch: all -> 0x1237, TryCatch #12 {all -> 0x1237, blocks: (B:278:0x26c4, B:280:0x26c8, B:282:0x26f6, B:286:0x2706, B:289:0x2711, B:291:0x271c, B:293:0x2725, B:294:0x272c, B:296:0x2734, B:297:0x275f, B:299:0x276b, B:304:0x27a1, B:306:0x27c2, B:307:0x27d6, B:309:0x27e0, B:311:0x27e8, B:314:0x27f3, B:316:0x27fd, B:320:0x280b, B:322:0x283d, B:324:0x2841, B:326:0x2845, B:328:0x2849, B:333:0x2853, B:334:0x285b, B:335:0x28dd, B:343:0x277b, B:345:0x2789, B:346:0x2795, B:349:0x2746, B:350:0x2752, B:352:0x28d8, B:357:0x121c, B:359:0x1228, B:361:0x1231, B:364:0x123d, B:367:0x1247, B:369:0x1251, B:373:0x1265, B:376:0x1274, B:378:0x127c, B:381:0x128b, B:382:0x1291, B:385:0x129b, B:388:0x12a5, B:391:0x12b4, B:393:0x12bc, B:396:0x12cb, B:397:0x12d1, B:400:0x12db, B:403:0x12e5, B:406:0x12f4, B:408:0x12fc, B:411:0x130b, B:412:0x1311, B:415:0x131b, B:418:0x1325, B:421:0x1334, B:423:0x133c, B:426:0x134b, B:427:0x1351, B:430:0x135b, B:433:0x1365, B:436:0x1374, B:438:0x137c, B:441:0x138b, B:442:0x1391, B:445:0x139b, B:448:0x13a5, B:451:0x13b4, B:453:0x13bc, B:456:0x13cb, B:457:0x13d1, B:460:0x13db, B:463:0x13e5, B:466:0x13f4, B:468:0x13fc, B:471:0x1411, B:472:0x1417, B:475:0x1426, B:478:0x1430, B:481:0x143f, B:483:0x1447, B:486:0x145c, B:487:0x1462, B:490:0x1471, B:493:0x147b, B:496:0x148a, B:498:0x1492, B:501:0x14a7, B:502:0x14ad, B:505:0x14bc, B:506:0x14c2, B:509:0x14ce, B:512:0x14d8, B:515:0x14e9, B:517:0x14f1, B:520:0x1509, B:521:0x150f, B:524:0x1520, B:527:0x152a, B:530:0x153b, B:532:0x1543, B:535:0x1554, B:536:0x155a, B:539:0x1566, B:542:0x1570, B:544:0x1574, B:546:0x157c, B:549:0x158c, B:550:0x1592, B:553:0x159e, B:555:0x15a6, B:557:0x15aa, B:559:0x15b2, B:562:0x15c9, B:563:0x15cf, B:566:0x15e0, B:567:0x15e6, B:569:0x15ea, B:571:0x15f2, B:574:0x1602, B:575:0x1608, B:578:0x1614, B:581:0x161e, B:584:0x162f, B:586:0x1637, B:589:0x1648, B:590:0x164e, B:593:0x165a, B:596:0x1664, B:599:0x1675, B:601:0x167d, B:604:0x168e, B:605:0x1694, B:608:0x16a0, B:611:0x16aa, B:614:0x16bb, B:616:0x16c3, B:619:0x16d4, B:620:0x16da, B:623:0x16e6, B:626:0x16f0, B:629:0x1701, B:631:0x1709, B:634:0x171a, B:635:0x1720, B:638:0x172c, B:641:0x1736, B:644:0x1747, B:646:0x174f, B:649:0x1760, B:650:0x1766, B:653:0x1772, B:656:0x177c, B:659:0x178d, B:661:0x1795, B:664:0x17ad, B:665:0x17b3, B:668:0x17c4, B:669:0x17ca, B:672:0x17dd, B:674:0x17e3, B:677:0x180c, B:678:0x1812, B:681:0x183b, B:682:0x1841, B:685:0x186a, B:686:0x1870, B:689:0x1899, B:690:0x189f, B:693:0x18ca, B:694:0x18d0, B:697:0x18e3, B:698:0x18e9, B:701:0x18fc, B:702:0x1902, B:705:0x1915, B:706:0x191b, B:709:0x192e, B:710:0x1934, B:713:0x1947, B:714:0x194d, B:718:0x196e, B:719:0x195f, B:721:0x1974, B:724:0x1987, B:725:0x198d, B:728:0x19a0, B:729:0x19a6, B:732:0x19c0, B:733:0x19c6, B:736:0x19d9, B:737:0x19df, B:740:0x19f9, B:741:0x19ff, B:744:0x1a12, B:745:0x1a18, B:748:0x1a2b, B:749:0x1a31, B:752:0x1a44, B:753:0x1a4a, B:756:0x1a64, B:759:0x1a74, B:762:0x1a94, B:763:0x1a9a, B:766:0x1ab4, B:767:0x1abf, B:770:0x1ad2, B:771:0x1add, B:774:0x1af0, B:775:0x1afc, B:778:0x1b0f, B:779:0x1b1b, B:782:0x1b32, B:783:0x1b38, B:786:0x1b4f, B:787:0x1b55, B:790:0x1b6c, B:791:0x1b78, B:794:0x1b8f, B:795:0x1b9b, B:798:0x1bb5, B:799:0x1bc1, B:802:0x1bdb, B:803:0x1be7, B:806:0x1bfa, B:807:0x1c06, B:809:0x1c0c, B:811:0x1c14, B:814:0x1c2c, B:815:0x1c4e, B:818:0x1c62, B:819:0x1c82, B:822:0x1c95, B:823:0x1ca1, B:826:0x1cb4, B:827:0x1cc0, B:830:0x1cd3, B:831:0x1cdf, B:834:0x1cf2, B:835:0x1cfe, B:838:0x1d0c, B:839:0x1d18, B:842:0x1d2b, B:843:0x1d37, B:846:0x1d51, B:849:0x1d5c, B:850:0x1d64, B:853:0x1d86, B:856:0x1d92, B:859:0x1db2, B:860:0x1dbe, B:863:0x1dcc, B:864:0x1dd2, B:867:0x1df4, B:868:0x1dfa, B:871:0x1e1c, B:872:0x1e22, B:875:0x1e44, B:876:0x1e4a, B:879:0x1e6c, B:880:0x1e72, B:883:0x1e98, B:884:0x1e9e, B:887:0x1eac, B:888:0x1eb8, B:891:0x1ec6, B:892:0x1ed2, B:895:0x1ee0, B:896:0x1eec, B:899:0x1efa, B:900:0x1f06, B:902:0x1f17, B:903:0x1f1d, B:905:0x1f2e, B:906:0x1f34, B:909:0x1f45, B:910:0x1f51, B:913:0x1f62, B:914:0x1f6e, B:917:0x1f81, B:918:0x1f8d, B:921:0x1fa0, B:922:0x1fac, B:925:0x1fba, B:926:0x1fc6, B:928:0x1fce, B:930:0x1fd6, B:933:0x1fe7, B:934:0x2007, B:937:0x2013, B:938:0x201f, B:941:0x202d, B:942:0x2039, B:945:0x2047, B:946:0x2053, B:949:0x2061, B:950:0x206d, B:953:0x207b, B:954:0x2087, B:957:0x2095, B:958:0x20a1, B:961:0x20af, B:964:0x20c0, B:965:0x20c8, B:968:0x20e0, B:971:0x20ec, B:974:0x2106, B:975:0x2112, B:978:0x2120, B:981:0x212b, B:982:0x2133, B:985:0x214b, B:988:0x2151, B:991:0x216b, B:992:0x2171, B:995:0x2195, B:996:0x219b, B:999:0x21bd, B:1000:0x21c3, B:1003:0x21e5, B:1004:0x21eb, B:1007:0x220d, B:1008:0x2212, B:1011:0x2234, B:1012:0x2239, B:1015:0x225d, B:1016:0x226d, B:1019:0x2280, B:1020:0x228c, B:1023:0x22a6, B:1024:0x22ac, B:1027:0x22bf, B:1028:0x22cb, B:1031:0x22d9, B:1032:0x22e5, B:1035:0x22f3, B:1036:0x22ff, B:1039:0x230d, B:1040:0x2319, B:1043:0x232a, B:1044:0x2336, B:1047:0x2347, B:1048:0x2353, B:1051:0x2364, B:1052:0x2370, B:1055:0x2381, B:1056:0x238d, B:1059:0x2399, B:1060:0x23a5, B:1062:0x23ad, B:1064:0x23b5, B:1067:0x23c6, B:1068:0x23e6, B:1071:0x23f2, B:1072:0x23fe, B:1075:0x240c, B:1076:0x2418, B:1079:0x2426, B:1080:0x2432, B:1081:0x2445, B:1084:0x2453, B:1085:0x245f, B:1088:0x246d, B:1089:0x2479, B:1092:0x2487, B:1093:0x2493, B:1096:0x24a1, B:1097:0x24ad, B:1098:0x24bb, B:1101:0x24c9, B:1102:0x24d5, B:1105:0x24e3, B:1106:0x24ef, B:1108:0x24ff, B:1110:0x2509, B:1112:0x2511, B:1114:0x2521, B:1116:0x252b, B:1117:0x2530, B:1119:0x2547, B:1121:0x2557, B:1123:0x256b, B:1124:0x2576, B:1126:0x258a, B:1127:0x2595, B:1130:0x25a1, B:1132:0x25af, B:1134:0x25c3, B:1135:0x25ce, B:1138:0x25da, B:1139:0x25e5, B:1142:0x25f1, B:1143:0x25fc, B:1146:0x2612, B:1147:0x2627, B:1150:0x263b, B:1151:0x2643, B:1154:0x2656, B:1155:0x2662, B:1158:0x2670, B:1159:0x267c, B:1162:0x268a, B:1163:0x26a2, B:1165:0x26af, B:1623:0x26be, B:1653:0x286b, B:1655:0x2876, B:1677:0x2880, B:1679:0x288e, B:1681:0x289b, B:1683:0x28a6, B:1685:0x28b7, B:1687:0x28bb, B:1689:0x28bf, B:1690:0x28c1, B:1691:0x28d3, B:1712:0x28ee, B:1714:0x2901, B:1716:0x2912, B:1718:0x295c, B:1720:0x2975, B:1722:0x297b), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x2808  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x26f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x29b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x29c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x29c1  */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v216 */
    /* JADX WARN: Type inference failed for: r13v217 */
    /* JADX WARN: Type inference failed for: r13v218 */
    /* JADX WARN: Type inference failed for: r13v220 */
    /* JADX WARN: Type inference failed for: r13v221 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$processRemoteMessage$6(String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        Throwable th;
        String str6;
        String str7;
        int i;
        String str8;
        int i2;
        Object obj;
        String str9;
        String str10;
        String str11;
        String str12;
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        long clientUserId;
        int intValue;
        int i3;
        boolean z;
        int i4;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        JSONObject jSONObject3;
        int i5;
        Object obj2;
        final int i6;
        String[] strArr;
        int i7;
        String str13;
        long j7;
        int i8;
        String str14;
        boolean z2;
        Object obj3;
        int i9;
        boolean z3;
        boolean z4;
        boolean z5;
        long j8;
        JSONObject jSONObject4;
        String str15;
        boolean z6;
        int i10;
        String[] strArr2;
        String str16;
        boolean has;
        boolean z7;
        String str17;
        String str18;
        boolean z8;
        boolean z9;
        boolean z10;
        String str19;
        String str20;
        String str21;
        long j9;
        String reactedText;
        String str22;
        final int i11;
        boolean z11;
        long j10;
        long j11;
        boolean z12;
        MessageObject messageObject;
        Object obj4;
        boolean z13;
        Object obj5;
        char c2;
        String string2;
        String formatString;
        String string3;
        String str23;
        String string4;
        String formatPluralString;
        String formatPluralString2;
        String formatPluralString3;
        String formatString2;
        int i12;
        int i13;
        int i14;
        String str24;
        str3 = "";
        if (BuildVars.LOGS_ENABLED) {
            str4 = "AmongWinners";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            str5 = "Photos";
            sb.append(" START PROCESSING");
            FileLog.d(sb.toString());
        } else {
            str4 = "AmongWinners";
            str5 = "Photos";
        }
        String str25 = null;
        try {
            byte[] decode = Base64.decode(str2, 8);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (SharedConfig.pushAuthKeyId == null) {
                str11 = "MusicFiles";
                SharedConfig.pushAuthKeyId = new byte[8];
                byte[] computeSHA1 = Utilities.computeSHA1(SharedConfig.pushAuthKey);
                str9 = "Files";
                str10 = "call_id";
                obj = "STORY_NOTEXT";
                System.arraycopy(computeSHA1, computeSHA1.length - 8, SharedConfig.pushAuthKeyId, 0, 8);
            } else {
                obj = "STORY_NOTEXT";
                str9 = "Files";
                str10 = "call_id";
                str11 = "MusicFiles";
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
                jSONObject = new JSONObject(str26);
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    try {
                        if (applicationLoader.consumePush(-1, jSONObject)) {
                            countDownLatch.countDown();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str12 = str26;
                        str6 = str12;
                        str7 = str25;
                        i2 = -1;
                        i = -1;
                        str8 = str7;
                        if (i == i2) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        FileLog.e(th);
                    }
                }
                string = jSONObject.has("loc_key") ? jSONObject.getString("loc_key") : str3;
            } catch (Throwable th3) {
                str12 = str26;
                th = th3;
            }
            try {
                if (jSONObject.get("custom") instanceof JSONObject) {
                    try {
                        jSONObject2 = jSONObject.getJSONObject("custom");
                    } catch (Throwable th4) {
                        th = th4;
                        str25 = string;
                        str12 = str26;
                        str6 = str12;
                        str7 = str25;
                        i2 = -1;
                        i = -1;
                        str8 = str7;
                        if (i == i2) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        FileLog.e(th);
                    }
                } else {
                    jSONObject2 = new JSONObject();
                }
                Object obj6 = jSONObject.has("user_id") ? jSONObject.get("user_id") : null;
                if (obj6 == null) {
                    clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                } else if (obj6 instanceof Long) {
                    clientUserId = ((Long) obj6).longValue();
                } else {
                    if (obj6 instanceof Integer) {
                        intValue = ((Integer) obj6).intValue();
                    } else if (obj6 instanceof String) {
                        intValue = Utilities.parseInt((CharSequence) obj6).intValue();
                    } else {
                        clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    }
                    clientUserId = intValue;
                }
                int i15 = UserConfig.selectedAccount;
                int i16 = 4;
                int i17 = 0;
                while (true) {
                    if (i17 >= i16) {
                        i3 = i15;
                        z = false;
                        break;
                    } else if (UserConfig.getInstance(i17).getClientUserId() == clientUserId) {
                        i3 = i17;
                        z = true;
                        break;
                    } else {
                        i17++;
                        i16 = 4;
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
                    try {
                        if (!UserConfig.getInstance(i3).isClientActivated()) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d(str + " ACCOUNT NOT ACTIVATED");
                            }
                            countDownLatch.countDown();
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(str + " " + string);
                        }
                        int hashCode = string.hashCode();
                        char c3 = 57455;
                        String str27 = -1963663249;
                        if (hashCode != -1963663249) {
                            c3 = 25737;
                            str27 = -920689527;
                            if (hashCode != -920689527) {
                                c3 = 58015;
                                str27 = 633004703;
                                if (hashCode != 633004703) {
                                    c3 = 34674;
                                    str27 = 1365673842;
                                    c3 = 34674;
                                    try {
                                        if (hashCode == 1365673842 && string.equals("GEO_LIVE_PENDING")) {
                                            c = 3;
                                            if (c != 0) {
                                                int i18 = i3;
                                                int i19 = jSONObject2.getInt("dc");
                                                String[] split = jSONObject2.getString("addr").split(":");
                                                if (split.length != 2) {
                                                    countDownLatch.countDown();
                                                    return;
                                                }
                                                ConnectionsManager.getInstance(i18).applyDatacenterAddress(i19, split[0], Integer.parseInt(split[1]));
                                                ConnectionsManager.getInstance(i18).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 1) {
                                                final int i20 = i3;
                                                TLRPC.TL_updateServiceNotification tL_updateServiceNotification = new TLRPC.TL_updateServiceNotification();
                                                tL_updateServiceNotification.popup = false;
                                                tL_updateServiceNotification.flags = 2;
                                                tL_updateServiceNotification.inbox_date = (int) (j / 1000);
                                                tL_updateServiceNotification.message = jSONObject.getString("message");
                                                tL_updateServiceNotification.type = "announcement";
                                                tL_updateServiceNotification.media = new TLRPC.TL_messageMediaEmpty();
                                                final TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                                                tL_updates.updates.add(tL_updateServiceNotification);
                                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda4
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        PushListenerController.lambda$processRemoteMessage$2(i20, tL_updates);
                                                    }
                                                });
                                                ConnectionsManager.getInstance(i20).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 2) {
                                                final int i21 = i3;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        PushListenerController.lambda$processRemoteMessage$3(i21);
                                                    }
                                                });
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 3) {
                                                final int i22 = i3;
                                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        PushListenerController.lambda$processRemoteMessage$4(i22);
                                                    }
                                                });
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (jSONObject2.has("channel_id")) {
                                                j2 = jSONObject2.getLong("channel_id");
                                                j3 = -j2;
                                            } else {
                                                j2 = 0;
                                                j3 = 0;
                                            }
                                            if (jSONObject2.has("from_id")) {
                                                j5 = jSONObject2.getLong("from_id");
                                                j4 = j5;
                                            } else {
                                                j4 = j3;
                                                j5 = 0;
                                            }
                                            if (jSONObject2.has("chat_id")) {
                                                try {
                                                    j6 = jSONObject2.getLong("chat_id");
                                                    str2 = str26;
                                                    jSONObject3 = jSONObject;
                                                    j4 = -j6;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    str2 = str26;
                                                    th = th;
                                                    i4 = i3;
                                                    str6 = str2;
                                                    i = i4;
                                                    i2 = -1;
                                                    str8 = string;
                                                    if (i == i2) {
                                                    }
                                                    if (BuildVars.LOGS_ENABLED) {
                                                    }
                                                    FileLog.e(th);
                                                }
                                            } else {
                                                str2 = str26;
                                                jSONObject3 = jSONObject;
                                                j6 = 0;
                                            }
                                            try {
                                                if (jSONObject2.has("topic_id")) {
                                                    try {
                                                        i5 = jSONObject2.getInt("topic_id");
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        th = th;
                                                        i4 = i3;
                                                        str6 = str2;
                                                        i = i4;
                                                        i2 = -1;
                                                        str8 = string;
                                                        if (i == i2) {
                                                        }
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        FileLog.e(th);
                                                    }
                                                } else {
                                                    i5 = 0;
                                                }
                                                StringBuilder sb2 = new StringBuilder();
                                                JSONObject jSONObject5 = jSONObject3;
                                                sb2.append("recived push notification {");
                                                sb2.append(string);
                                                sb2.append("} chatId ");
                                                sb2.append(j6);
                                                sb2.append(" custom topicId ");
                                                sb2.append(i5);
                                                FileLog.d(sb2.toString());
                                                if (jSONObject2.has("encryption_id")) {
                                                    obj2 = "REACT_";
                                                    j4 = DialogObject.makeEncryptedDialogId(jSONObject2.getInt("encryption_id"));
                                                } else {
                                                    obj2 = "REACT_";
                                                }
                                                boolean z14 = jSONObject2.has("schedule") && jSONObject2.getInt("schedule") == 1;
                                                if (j4 == 0 && "ENCRYPTED_MESSAGE".equals(string)) {
                                                    j4 = NotificationsController.globalSecretChatId;
                                                }
                                                boolean z15 = z14;
                                                final long j12 = j4;
                                                if (j12 != 0) {
                                                    Object obj7 = obj2;
                                                    if ("CONF_CALL_REQUEST".equals(string) || "CONF_VIDEOCALL_REQUEST".equals(string)) {
                                                        i6 = i3;
                                                        long j13 = jSONObject2.getLong(str10);
                                                        int i23 = jSONObject2.getInt("msg_id");
                                                        if (jSONObject5.has("loc_args")) {
                                                            JSONArray jSONArray = jSONObject5.getJSONArray("loc_args");
                                                            int length = jSONArray.length();
                                                            strArr = new String[length];
                                                            for (int i24 = 0; i24 < length; i24++) {
                                                                strArr[i24] = jSONArray.getString(i24);
                                                            }
                                                        } else {
                                                            strArr = null;
                                                        }
                                                        if (System.currentTimeMillis() - j < MessagesController.getInstance(i6).callRingTimeout) {
                                                            Context context = ApplicationLoader.applicationContext;
                                                            if (strArr != null && strArr.length > 2) {
                                                                str25 = strArr[2];
                                                            }
                                                            VoIPGroupNotification.request(context, i6, j12, str25, j13, i23, "CONF_VIDEOCALL_REQUEST".equals(string));
                                                        } else {
                                                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, i6, i23);
                                                        }
                                                    } else if ("READ_HISTORY".equals(string)) {
                                                        int i25 = jSONObject2.getInt("max_id");
                                                        ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.d(str + " received read notification max_id = " + i25 + " for dialogId = " + j12);
                                                        }
                                                        if (j2 != 0) {
                                                            TLRPC.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TLRPC.TL_updateReadChannelInbox();
                                                            tL_updateReadChannelInbox.channel_id = j2;
                                                            tL_updateReadChannelInbox.max_id = i25;
                                                            tL_updateReadChannelInbox.still_unread_count = 0;
                                                            arrayList.add(tL_updateReadChannelInbox);
                                                        } else {
                                                            TLRPC.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TLRPC.TL_updateReadHistoryInbox();
                                                            if (j5 != 0) {
                                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                                tL_updateReadHistoryInbox.peer = tL_peerUser;
                                                                tL_peerUser.user_id = j5;
                                                            } else {
                                                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                                                tL_updateReadHistoryInbox.peer = tL_peerChat;
                                                                tL_peerChat.chat_id = j6;
                                                            }
                                                            tL_updateReadHistoryInbox.max_id = i25;
                                                            arrayList.add(tL_updateReadHistoryInbox);
                                                        }
                                                        MessagesController.getInstance(i3).processUpdateArray(arrayList, null, null, false, 0);
                                                    } else if ("READ_STORIES".equals(string)) {
                                                        NotificationsController.getInstance(i3).processReadStories(j12, jSONObject2.getInt("max_id"));
                                                    } else {
                                                        long j14 = j5;
                                                        if ("STORY_DELETED".equals(string)) {
                                                            NotificationsController.getInstance(i3).processDeleteStory(j12, jSONObject2.getInt("story_id"));
                                                        } else {
                                                            long j15 = j6;
                                                            if ("MESSAGE_DELETED".equals(string)) {
                                                                String[] split2 = jSONObject2.getString("messages").split(",");
                                                                LongSparseArray longSparseArray = new LongSparseArray();
                                                                ArrayList<Integer> arrayList2 = new ArrayList<>();
                                                                for (String str28 : split2) {
                                                                    arrayList2.add(Utilities.parseInt((CharSequence) str28));
                                                                }
                                                                longSparseArray.put(-j2, arrayList2);
                                                                NotificationsController.getInstance(i3).removeDeletedMessagesFromNotifications(longSparseArray, false);
                                                                MessagesController.getInstance(i3).deleteMessagesByPush(j12, arrayList2, j2);
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received " + string + " for dialogId = " + j12 + " mids = " + TextUtils.join(",", arrayList2));
                                                                }
                                                            } else if ("READ_REACTION".equals(string)) {
                                                                String[] split3 = jSONObject2.getString("messages").split(",");
                                                                LongSparseArray longSparseArray2 = new LongSparseArray();
                                                                ArrayList arrayList3 = new ArrayList();
                                                                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                                                int i26 = 0;
                                                                while (i26 < split3.length) {
                                                                    Integer parseInt = Utilities.parseInt((CharSequence) split3[i26]);
                                                                    String[] strArr3 = split3;
                                                                    int intValue2 = parseInt.intValue();
                                                                    arrayList3.add(parseInt);
                                                                    sparseBooleanArray.put(intValue2, false);
                                                                    i26++;
                                                                    split3 = strArr3;
                                                                }
                                                                longSparseArray2.put(-j2, arrayList3);
                                                                NotificationsController.getInstance(i3).removeDeletedMessagesFromNotifications(longSparseArray2, true);
                                                                MessagesController.getInstance(i3).checkUnreadReactions(j12, i5, sparseBooleanArray);
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received " + string + " for dialogId = " + j12 + " mids = " + TextUtils.join(",", arrayList3));
                                                                }
                                                            } else if (!TextUtils.isEmpty(string)) {
                                                                if (jSONObject2.has("msg_id")) {
                                                                    i7 = jSONObject2.getInt("msg_id");
                                                                } else {
                                                                    i7 = jSONObject2.has("story_id") ? jSONObject2.getInt("story_id") : 0;
                                                                }
                                                                if (jSONObject2.has("random_id")) {
                                                                    str13 = "messages";
                                                                    j7 = Utilities.parseLong(jSONObject2.getString("random_id")).longValue();
                                                                } else {
                                                                    str13 = "messages";
                                                                    j7 = 0;
                                                                }
                                                                if (i7 != 0) {
                                                                    str14 = str13;
                                                                    Integer num = MessagesController.getInstance(i3).dialogs_read_inbox_max.get(Long.valueOf(j12));
                                                                    if (num == null) {
                                                                        num = Integer.valueOf(MessagesStorage.getInstance(i3).getDialogReadMax(false, j12));
                                                                        i8 = i5;
                                                                        MessagesController.getInstance(i3).dialogs_read_inbox_max.put(Long.valueOf(j12), num);
                                                                    } else {
                                                                        i8 = i5;
                                                                    }
                                                                    if (i7 > num.intValue()) {
                                                                        str27 = obj7;
                                                                        z2 = true;
                                                                    }
                                                                    str27 = obj7;
                                                                    z2 = false;
                                                                } else {
                                                                    i8 = i5;
                                                                    str14 = str13;
                                                                    if (j7 != 0) {
                                                                    }
                                                                    str27 = obj7;
                                                                    z2 = false;
                                                                }
                                                                long j16 = j7;
                                                                if (string.startsWith(str27) || string.startsWith("CHAT_REACT_")) {
                                                                    obj3 = obj;
                                                                    z2 = true;
                                                                } else {
                                                                    obj3 = obj;
                                                                }
                                                                int i27 = i7;
                                                                if (string.equals(obj3) || string.equals("STORY_HIDDEN_AUTHOR")) {
                                                                    i9 = jSONObject2.has("story_id") ? jSONObject2.getInt("story_id") : -1;
                                                                    z3 = i9 >= 0;
                                                                } else {
                                                                    z3 = z2;
                                                                    i9 = -1;
                                                                }
                                                                if (z3) {
                                                                    Object obj8 = obj3;
                                                                    Object obj9 = "STORY_HIDDEN_AUTHOR";
                                                                    int i28 = i3;
                                                                    try {
                                                                        long optLong = jSONObject2.optLong("chat_from_id", 0L);
                                                                        String str29 = str27;
                                                                        long optLong2 = jSONObject2.optLong("chat_from_broadcast_id", 0L);
                                                                        int i29 = i9;
                                                                        long optLong3 = jSONObject2.optLong("chat_from_group_id", 0L);
                                                                        int i30 = (optLong > 0L ? 1 : (optLong == 0L ? 0 : -1));
                                                                        if (i30 == 0 && optLong3 == 0) {
                                                                            z4 = false;
                                                                            if (jSONObject2.has("mention")) {
                                                                                try {
                                                                                    if (jSONObject2.getInt("mention") != 0) {
                                                                                        z5 = true;
                                                                                        if (jSONObject2.has("silent") || jSONObject2.getInt("silent") == 0) {
                                                                                            j8 = optLong;
                                                                                            jSONObject4 = jSONObject5;
                                                                                            str15 = "loc_args";
                                                                                            z6 = false;
                                                                                        } else {
                                                                                            j8 = optLong;
                                                                                            jSONObject4 = jSONObject5;
                                                                                            str15 = "loc_args";
                                                                                            z6 = true;
                                                                                        }
                                                                                        if (jSONObject4.has(str15)) {
                                                                                            JSONArray jSONArray2 = jSONObject4.getJSONArray(str15);
                                                                                            int length2 = jSONArray2.length();
                                                                                            strArr2 = new String[length2];
                                                                                            i10 = i30;
                                                                                            for (int i31 = 0; i31 < length2; i31++) {
                                                                                                strArr2[i31] = jSONArray2.getString(i31);
                                                                                            }
                                                                                        } else {
                                                                                            i10 = i30;
                                                                                            strArr2 = null;
                                                                                        }
                                                                                        if (strArr2 != null && strArr2.length > 0) {
                                                                                            str16 = strArr2[0];
                                                                                            has = jSONObject2.has("edit_date");
                                                                                            if (!string.startsWith("CHAT_") && strArr2 != null && strArr2.length > 0) {
                                                                                                if (UserObject.isReplyUser(j12)) {
                                                                                                    StringBuilder sb3 = new StringBuilder();
                                                                                                    sb3.append(str16);
                                                                                                    sb3.append(" @ ");
                                                                                                    z7 = has;
                                                                                                    sb3.append(strArr2[1]);
                                                                                                    str16 = sb3.toString();
                                                                                                    str17 = null;
                                                                                                    str18 = str29;
                                                                                                    z8 = false;
                                                                                                    z9 = false;
                                                                                                    z10 = false;
                                                                                                    if (!string.startsWith(str18)) {
                                                                                                    }
                                                                                                    str19 = "CHAT_REACT_";
                                                                                                    str20 = str18;
                                                                                                    str21 = str16;
                                                                                                    j9 = optLong2;
                                                                                                    i6 = i28;
                                                                                                    reactedText = getReactedText(string, strArr2);
                                                                                                    str22 = reactedText;
                                                                                                    i11 = i27;
                                                                                                    z11 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str22 != null) {
                                                                                                    }
                                                                                                } else {
                                                                                                    z7 = has;
                                                                                                    boolean z16 = j2 != 0;
                                                                                                    str17 = str16;
                                                                                                    str16 = strArr2[1];
                                                                                                    z8 = false;
                                                                                                    z10 = z16;
                                                                                                    str18 = str29;
                                                                                                    z9 = false;
                                                                                                    if (!string.startsWith(str18)) {
                                                                                                    }
                                                                                                    str19 = "CHAT_REACT_";
                                                                                                    str20 = str18;
                                                                                                    str21 = str16;
                                                                                                    j9 = optLong2;
                                                                                                    i6 = i28;
                                                                                                    reactedText = getReactedText(string, strArr2);
                                                                                                    str22 = reactedText;
                                                                                                    i11 = i27;
                                                                                                    z11 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str22 != null) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                z7 = has;
                                                                                                if (!string.startsWith("PINNED_")) {
                                                                                                    if (string.startsWith("CHANNEL_")) {
                                                                                                        str17 = null;
                                                                                                        str18 = str29;
                                                                                                        z8 = false;
                                                                                                        z9 = true;
                                                                                                        z10 = false;
                                                                                                        if (!string.startsWith(str18)) {
                                                                                                        }
                                                                                                        str19 = "CHAT_REACT_";
                                                                                                        str20 = str18;
                                                                                                        str21 = str16;
                                                                                                        j9 = optLong2;
                                                                                                        i6 = i28;
                                                                                                        reactedText = getReactedText(string, strArr2);
                                                                                                        str22 = reactedText;
                                                                                                        i11 = i27;
                                                                                                        z11 = false;
                                                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                                                        }
                                                                                                        if (str22 != null) {
                                                                                                        }
                                                                                                    }
                                                                                                    str17 = null;
                                                                                                    str18 = str29;
                                                                                                    z8 = false;
                                                                                                    z9 = false;
                                                                                                    z10 = false;
                                                                                                    if (!string.startsWith(str18)) {
                                                                                                    }
                                                                                                    str19 = "CHAT_REACT_";
                                                                                                    str20 = str18;
                                                                                                    str21 = str16;
                                                                                                    j9 = optLong2;
                                                                                                    i6 = i28;
                                                                                                    reactedText = getReactedText(string, strArr2);
                                                                                                    str22 = reactedText;
                                                                                                    i11 = i27;
                                                                                                    z11 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str22 != null) {
                                                                                                    }
                                                                                                } else {
                                                                                                    z10 = j2 != 0;
                                                                                                    str17 = null;
                                                                                                    str18 = str29;
                                                                                                    z8 = true;
                                                                                                    z9 = false;
                                                                                                    if (!string.startsWith(str18) || string.startsWith("CHAT_REACT_")) {
                                                                                                        str19 = "CHAT_REACT_";
                                                                                                        str20 = str18;
                                                                                                        str21 = str16;
                                                                                                        j9 = optLong2;
                                                                                                        i6 = i28;
                                                                                                        reactedText = getReactedText(string, strArr2);
                                                                                                    } else {
                                                                                                        switch (string.hashCode()) {
                                                                                                            case -2104766184:
                                                                                                                str21 = str16;
                                                                                                                obj5 = obj8;
                                                                                                                if (string.equals(obj5)) {
                                                                                                                    c2 = 0;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2100047043:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GAME_SCORE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '%';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2091498420:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ';';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2053872415:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_CREATED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'b';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2039746363:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STICKER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 27;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2023218804:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'G';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979538588:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_DOC")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '8';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979536003:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'A';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979535888:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GIF")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'C';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1969004705:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_ADD_MEMBER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'f';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1946699248:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_JOINED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'o';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1891964556:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '[';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1833440864:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'L';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1717283471:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_REQ_JOINED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'p';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1646640058:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_VOICECHAT_START")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'g';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1633328296:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_PAID_MEDIA")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 15;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1528047021:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGES")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'v';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1507149394:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_RECURRING_PAY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 4;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1493579426:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_AUDIO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 28;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1482481933:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_MUTED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 148;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1480102982:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_PHOTO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 20;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1478041834:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_ROUND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 25;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1476974979:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STORY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 18;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1474543101:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_VIDEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 22;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1465695932:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("ENCRYPTION_ACCEPT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 146;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1428026623:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CONF_CALL_MISSED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 139;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1374906292:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("ENCRYPTED_MESSAGE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 138;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1372940586:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_RETURNED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'n';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1264245338:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_INVOICE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 136;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236154001:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_DOCS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'I';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236086700:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_FWDS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'E';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236077786:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GAME")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'D';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235796237:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_POLL")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '=';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235760759:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '<';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235686303:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_TEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 6;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235677318:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_TODO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '>';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1198046100:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_VIDEO_SECRET")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 23;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1124254527:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_CONTACT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'V';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1085137927:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GAME")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 134;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084856378:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_POLL")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 130;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084820900:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_QUIZ")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 129;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084746444:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_TEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'w';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084737459:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_TODO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 131;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -947756761:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '?';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -891852842:
                                                                                                                str21 = str16;
                                                                                                                boolean equals = string.equals(obj9);
                                                                                                                obj9 = obj9;
                                                                                                                obj5 = obj8;
                                                                                                                if (equals) {
                                                                                                                    c2 = 1;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -819729482:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_STICKER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '}';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -772141857:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PHONE_CALL_REQUEST")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 147;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -706345256:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\b';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -638310039:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_STICKER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '9';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -590403924:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GAME_SCORE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 135;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589196239:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_DOC")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '|';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589193654:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 132;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589193539:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GIF")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 137;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -455004278:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_WALLPAPER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 3;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -440169325:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("AUTH_UNKNOWN")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 142;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -412748110:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_DELETE_YOU")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'l';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -346082433:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '@';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -242433887:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_SAME_WALLPAPER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 2;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -228518075:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GEOLIVE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\"';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -213586509:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("ENCRYPTION_REQUEST")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 145;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -115582002:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_INVOICE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'a';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -112621464:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CONTACT_JOINED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 141;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -108522133:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("AUTH_REGION")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 143;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -107572034:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_SCREENSHOT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 24;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -40534265:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_DELETE_MEMBER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'k';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -35560251:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\r';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 52369421:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("REACT_TEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 140;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 65254746:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_ADD_YOU")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'c';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 120441350:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GIVEAWAY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 128;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 141040782:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_LEFT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'm';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 191667248:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 14;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 202550149:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_VOICECHAT_INVITE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'h';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309993049:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_DOC")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'S';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309995634:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\\';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309995749:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GIF")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '^';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 320532812:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGES")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '0';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 328933854:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_STICKER")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'T';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 331340546:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ':';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 342406591:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_VOICECHAT_END")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'i';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 344816990:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '5';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 346878138:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_ROUND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '7';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 347944993:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_STORY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '4';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 350376871:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '6';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 510462069:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GIFTCODE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '-';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 608430149:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'j';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 615714517:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_PHOTO_SECRET")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 21;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 702966260:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 11;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 715508879:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_AUDIO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '~';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 728985323:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_PHOTO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'y';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 731046471:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_ROUND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '{';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 734545204:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_VIDEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'z';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 802032552:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_CONTACT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 29;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 860688476:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'Z';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 901537717:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '2';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 954623703:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GIVEAWAY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '.';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 977076186:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STARGIFT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 7;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 991498806:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_GEOLIVE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 133;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1007364121:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '&';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019850010:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_DOCS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'u';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019917311:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_FWDS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'q';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019926225:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GAME")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '_';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020207774:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_POLL")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'X';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020243252:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_QUIZ")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'W';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020317708:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_TEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'M';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020326693:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_TODO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'Y';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1054583304:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STORY_MENTION")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 19;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060282259:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_DOCS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ',';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060349560:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_FWDS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '(';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060358474:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GAME")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '$';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060640023:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_POLL")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 31;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060675501:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_QUIZ")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 30;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060749957:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_TEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 5;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060758942:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_TODO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ' ';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1073049781:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_NOTEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'x';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1078101399:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_TITLE_EDITED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'd';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1110103437:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_NOTEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'N';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1144183001:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '/';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1151995881:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\f';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1160762272:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_PHOTOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'r';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1172918249:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'B';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1234591620:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '`';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281128640:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_DOC")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 26;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281131225:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '!';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281131340:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_GIF")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '#';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1310789062:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_NOTEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 17;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1333118583:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_VIDEOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 's';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1361447897:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_PHOTOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ')';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1369266398:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'K';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1420317335:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\t';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1449476787:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '1';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1498266155:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PHONE_CALL_MISSED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 149;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1533804208:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_VIDEOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '*';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1540131626:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_PLAYLIST")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '+';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1547988151:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_AUDIO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'U';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1561464595:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_PHOTO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'P';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1563525743:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_ROUND")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'R';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1564592598:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_STORY")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'O';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1567024476:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_VIDEO")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'Q';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1810705077:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_INVOICE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\'';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1815177512:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGES")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'J';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1837240696:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_REACT_PAID_MEDIA")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 16;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1954774321:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 't';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1963241394:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("LOCKED_MESSAGE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 144;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2014789757:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_PHOTO_EDITED")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'e';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2022049433:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("PINNED_CONTACT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 127;
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2034984710:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'H';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2048733346:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '3';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2099392181:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = 'F';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2103150375:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = '\n';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2140162142:
                                                                                                                str21 = str16;
                                                                                                                if (string.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                                                                                    obj5 = obj8;
                                                                                                                    c2 = ']';
                                                                                                                    obj8 = obj5;
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            default:
                                                                                                                str21 = str16;
                                                                                                                obj5 = obj8;
                                                                                                                obj8 = obj5;
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                        }
                                                                                                        str19 = "CHAT_REACT_";
                                                                                                        str20 = str18;
                                                                                                        j9 = optLong2;
                                                                                                        try {
                                                                                                            switch (c2) {
                                                                                                                case 0:
                                                                                                                    i6 = i28;
                                                                                                                    string2 = LocaleController.getString(R.string.StoryNotificationSingle);
                                                                                                                    i11 = i29;
                                                                                                                    z11 = false;
                                                                                                                    str22 = string2;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                        j10 = j16;
                                                                                                                    } else {
                                                                                                                        StringBuilder sb4 = new StringBuilder();
                                                                                                                        j10 = j16;
                                                                                                                        sb4.append(str);
                                                                                                                        sb4.append(" received message notification ");
                                                                                                                        sb4.append(string);
                                                                                                                        sb4.append(" for dialogId = ");
                                                                                                                        sb4.append(j12);
                                                                                                                        sb4.append(" mid = ");
                                                                                                                        sb4.append(i11);
                                                                                                                        FileLog.d(sb4.toString());
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                                                                                        if (string.startsWith("REACT_STORY") && i11 > 0) {
                                                                                                                            i11 = -i11;
                                                                                                                        }
                                                                                                                        tL_message.id = i11;
                                                                                                                        tL_message.random_id = j10;
                                                                                                                        tL_message.message = str25 != null ? str25 : str22;
                                                                                                                        tL_message.date = (int) (j / 1000);
                                                                                                                        if (z8) {
                                                                                                                            tL_message.action = new TLRPC.TL_messageActionPinMessage();
                                                                                                                        }
                                                                                                                        if (z10) {
                                                                                                                            tL_message.flags |= TLObject.FLAG_31;
                                                                                                                        }
                                                                                                                        tL_message.dialog_id = j12;
                                                                                                                        if (j2 != 0) {
                                                                                                                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                                                                                            tL_message.peer_id = tL_peerChannel;
                                                                                                                            tL_peerChannel.channel_id = j2;
                                                                                                                            j11 = j15;
                                                                                                                        } else if (j15 != 0) {
                                                                                                                            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                                                                                            tL_message.peer_id = tL_peerChat2;
                                                                                                                            j11 = j15;
                                                                                                                            tL_peerChat2.chat_id = j11;
                                                                                                                        } else {
                                                                                                                            j11 = j15;
                                                                                                                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                                                                                            tL_message.peer_id = tL_peerUser2;
                                                                                                                            tL_peerUser2.user_id = j14;
                                                                                                                        }
                                                                                                                        tL_message.flags |= 256;
                                                                                                                        if (optLong3 != 0) {
                                                                                                                            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                                                                                                                            tL_message.from_id = tL_peerChat3;
                                                                                                                            tL_peerChat3.chat_id = j11;
                                                                                                                        } else if (j9 != 0) {
                                                                                                                            TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                                                                                            tL_message.from_id = tL_peerChannel2;
                                                                                                                            tL_peerChannel2.channel_id = j9;
                                                                                                                        } else if (i10 != 0) {
                                                                                                                            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                                                                                            tL_message.from_id = tL_peerUser3;
                                                                                                                            tL_peerUser3.user_id = j8;
                                                                                                                        } else {
                                                                                                                            tL_message.from_id = tL_message.peer_id;
                                                                                                                        }
                                                                                                                        if (!z5 && !z8) {
                                                                                                                            z12 = false;
                                                                                                                            tL_message.mentioned = z12;
                                                                                                                            tL_message.silent = z6;
                                                                                                                            tL_message.from_scheduled = z15;
                                                                                                                            messageObject = new MessageObject(i6, tL_message, str22, str21, str17, z11, z9, z10, z7);
                                                                                                                            if (i8 != 0) {
                                                                                                                                messageObject.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                                                                                                                                TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
                                                                                                                                messageReplyHeader.forum_topic = true;
                                                                                                                                messageReplyHeader.reply_to_top_id = i8;
                                                                                                                            }
                                                                                                                            boolean startsWith = string.startsWith("REACT_STORY");
                                                                                                                            messageObject.isStoryReactionPush = startsWith;
                                                                                                                            messageObject.isReactionPush = startsWith && (string.startsWith(str20) || string.startsWith(str19));
                                                                                                                            if (string.equals(obj8)) {
                                                                                                                                obj4 = obj9;
                                                                                                                                if (!string.equals(obj4)) {
                                                                                                                                    z13 = false;
                                                                                                                                    messageObject.isStoryPush = z13;
                                                                                                                                    messageObject.isStoryMentionPush = string.equals("MESSAGE_STORY_MENTION");
                                                                                                                                    messageObject.isStoryPushHidden = string.equals(obj4);
                                                                                                                                    ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                                                                                                                                    arrayList4.add(messageObject);
                                                                                                                                    FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                                    if (!messageObject.isStoryReactionPush && !messageObject.isReactionPush && !messageObject.isStoryMentionPush && !messageObject.isStoryPush && !messageObject.isStoryPushHidden && !z5 && !z8 && i11 > 0) {
                                                                                                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                            @Override // java.lang.Runnable
                                                                                                                                            public final void run() {
                                                                                                                                                PushListenerController.lambda$processRemoteMessage$5(i6, j12, i11);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                    NotificationsController.getInstance(i6).processNewMessages(arrayList4, true, true, countDownLatch);
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                obj4 = obj9;
                                                                                                                            }
                                                                                                                            z13 = true;
                                                                                                                            messageObject.isStoryPush = z13;
                                                                                                                            messageObject.isStoryMentionPush = string.equals("MESSAGE_STORY_MENTION");
                                                                                                                            messageObject.isStoryPushHidden = string.equals(obj4);
                                                                                                                            ArrayList<MessageObject> arrayList42 = new ArrayList<>();
                                                                                                                            arrayList42.add(messageObject);
                                                                                                                            FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                            if (!messageObject.isStoryReactionPush) {
                                                                                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                    @Override // java.lang.Runnable
                                                                                                                                    public final void run() {
                                                                                                                                        PushListenerController.lambda$processRemoteMessage$5(i6, j12, i11);
                                                                                                                                    }
                                                                                                                                });
                                                                                                                            }
                                                                                                                            NotificationsController.getInstance(i6).processNewMessages(arrayList42, true, true, countDownLatch);
                                                                                                                        }
                                                                                                                        z12 = true;
                                                                                                                        tL_message.mentioned = z12;
                                                                                                                        tL_message.silent = z6;
                                                                                                                        tL_message.from_scheduled = z15;
                                                                                                                        messageObject = new MessageObject(i6, tL_message, str22, str21, str17, z11, z9, z10, z7);
                                                                                                                        if (i8 != 0) {
                                                                                                                        }
                                                                                                                        boolean startsWith2 = string.startsWith("REACT_STORY");
                                                                                                                        messageObject.isStoryReactionPush = startsWith2;
                                                                                                                        messageObject.isReactionPush = startsWith2 && (string.startsWith(str20) || string.startsWith(str19));
                                                                                                                        if (string.equals(obj8)) {
                                                                                                                        }
                                                                                                                        z13 = true;
                                                                                                                        messageObject.isStoryPush = z13;
                                                                                                                        messageObject.isStoryMentionPush = string.equals("MESSAGE_STORY_MENTION");
                                                                                                                        messageObject.isStoryPushHidden = string.equals(obj4);
                                                                                                                        ArrayList<MessageObject> arrayList422 = new ArrayList<>();
                                                                                                                        arrayList422.add(messageObject);
                                                                                                                        FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                        if (!messageObject.isStoryReactionPush) {
                                                                                                                        }
                                                                                                                        NotificationsController.getInstance(i6).processNewMessages(arrayList422, true, true, countDownLatch);
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    i6 = i28;
                                                                                                                    string2 = LocaleController.formatPluralString("StoryNotificationHidden", 1, new Object[0]);
                                                                                                                    i11 = i29;
                                                                                                                    z11 = false;
                                                                                                                    str22 = string2;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ActionSetSameWallpaperForThisChat", R.string.ActionSetSameWallpaperForThisChat, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.WallpaperSameNotification);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ActionSetWallpaperForThisChat", R.string.ActionSetWallpaperForThisChat, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.WallpaperNotification);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageRecurringPay", R.string.NotificationMessageRecurringPay, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 5:
                                                                                                                case 6:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageText", R.string.NotificationMessageText, strArr2[0], strArr2[1]);
                                                                                                                    string3 = strArr2[1];
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 7:
                                                                                                                    i6 = i28;
                                                                                                                    String str30 = strArr2[0];
                                                                                                                    formatString = LocaleController.formatPluralStringComma("NotificationMessageStarGift", Integer.parseInt(strArr2[1]), strArr2[0]);
                                                                                                                    str25 = LocaleController.formatPluralStringComma("Gift2Notification", Integer.parseInt(strArr2[1]));
                                                                                                                    str23 = str30;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\b':
                                                                                                                    i6 = i28;
                                                                                                                    str23 = strArr2[0];
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGift, str23);
                                                                                                                    string4 = LocaleController.getString(R.string.Gift2UniqueNotification);
                                                                                                                    str25 = string4;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\t':
                                                                                                                    i6 = i28;
                                                                                                                    str23 = strArr2[0];
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUpgrade, str23);
                                                                                                                    string4 = LocaleController.getString(R.string.Gift2UniqueUpgradeNotification);
                                                                                                                    str25 = string4;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\n':
                                                                                                                    i6 = i28;
                                                                                                                    str23 = strArr2[0];
                                                                                                                    formatString = LocaleController.formatPluralStringComma("NotificationMessageUniqueStarGiftPrepaidUpgrade", Integer.parseInt(strArr2[1]), strArr2[0]);
                                                                                                                    string4 = LocaleController.getString(R.string.Gift2UniquePrepaidUpgradeNotification);
                                                                                                                    str25 = string4;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 11:
                                                                                                                    i6 = i28;
                                                                                                                    str23 = strArr2[0];
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUnpackUpgrade, str23);
                                                                                                                    string4 = LocaleController.getString(R.string.Gift2UniqueUnpackUpgradeNotification);
                                                                                                                    str25 = string4;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\f':
                                                                                                                    i6 = i28;
                                                                                                                    int parseInt2 = Integer.parseInt(strArr2[1]);
                                                                                                                    reactedText = LocaleController.formatPluralString("NotificationMessagePaidMedia", parseInt2, strArr2[0]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt2, new Object[0]);
                                                                                                                    str25 = formatPluralString;
                                                                                                                    break;
                                                                                                                case '\r':
                                                                                                                    i6 = i28;
                                                                                                                    int parseInt3 = Integer.parseInt(strArr2[1]);
                                                                                                                    reactedText = LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", parseInt3, strArr2[0]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt3, new Object[0]);
                                                                                                                    str25 = formatPluralString;
                                                                                                                    break;
                                                                                                                case 14:
                                                                                                                    i6 = i28;
                                                                                                                    int parseInt4 = Integer.parseInt(strArr2[2]);
                                                                                                                    reactedText = LocaleController.formatPluralString("NotificationChatMessagePaidMedia", parseInt4, strArr2[0], strArr2[1]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt4, new Object[0]);
                                                                                                                    str25 = formatPluralString;
                                                                                                                    break;
                                                                                                                case 15:
                                                                                                                    i6 = i28;
                                                                                                                    int parseInt5 = Integer.parseInt(strArr2[1]);
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr2[0]);
                                                                                                                    formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr2[0]);
                                                                                                                    str25 = formatPluralString3;
                                                                                                                    reactedText = formatPluralString2;
                                                                                                                    break;
                                                                                                                case 16:
                                                                                                                    i6 = i28;
                                                                                                                    int parseInt6 = Integer.parseInt(strArr2[1]);
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr2[0]);
                                                                                                                    formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr2[0]);
                                                                                                                    str25 = formatPluralString3;
                                                                                                                    reactedText = formatPluralString2;
                                                                                                                    break;
                                                                                                                case 17:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageNoText", R.string.NotificationMessageNoText, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.Message);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 18:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationStory", R.string.NotificationStory, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.Story);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 19:
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.getString(R.string.StoryNotificationMention);
                                                                                                                    break;
                                                                                                                case 20:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessagePhoto", R.string.NotificationMessagePhoto, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 21:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageSDPhoto", R.string.NotificationMessageSDPhoto, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachDestructingPhoto);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 22:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageVideo", R.string.NotificationMessageVideo, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 23:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageSDVideo", R.string.NotificationMessageSDVideo, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachDestructingVideo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 24:
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.getString(R.string.ActionTakeScreenshoot).replace("un1", strArr2[0]);
                                                                                                                    break;
                                                                                                                case 25:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageRound", R.string.NotificationMessageRound, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 26:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageDocument", R.string.NotificationMessageDocument, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 27:
                                                                                                                    i6 = i28;
                                                                                                                    if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageStickerEmoji", R.string.NotificationMessageStickerEmoji, strArr2[0], strArr2[1]);
                                                                                                                        string3 = strArr2[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                                    } else {
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageSticker", R.string.NotificationMessageSticker, strArr2[0]);
                                                                                                                        string3 = LocaleController.getString(R.string.AttachSticker);
                                                                                                                    }
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 28:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageAudio, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 29:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageContact2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 30:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageQuiz2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.QuizPoll);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 31:
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessagePoll2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.Poll);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ' ':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageTodo2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.Todo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '!':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageMap", R.string.NotificationMessageMap, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\"':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageLiveLocation", R.string.NotificationMessageLiveLocation, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '#':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGif", R.string.NotificationMessageGif, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '$':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '%':
                                                                                                                case '&':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationMessageGameScored", R.string.NotificationMessageGameScored, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    break;
                                                                                                                case '\'':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageInvoice", R.string.NotificationMessageInvoice, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '(':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageForwardFew", R.string.NotificationMessageForwardFew, strArr2[0], LocaleController.formatPluralString(str14, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ')':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '*':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '+':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str11, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ',':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '-':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageGiftCode", R.string.NotificationMessageGiftCode, strArr2[0], LocaleController.formatPluralString("Months", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '.':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageGiveaway", R.string.NotificationMessageGiveaway, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '/':
                                                                                                                    String str31 = str4;
                                                                                                                    i6 = i28;
                                                                                                                    try {
                                                                                                                        i12 = Integer.parseInt(strArr2[1]);
                                                                                                                    } catch (Exception unused) {
                                                                                                                        i12 = 1;
                                                                                                                    }
                                                                                                                    formatString2 = LocaleController.formatString(R.string.NotificationMessageStarsGiveaway2, strArr2[0], LocaleController.formatPluralString(str31, i12, new Object[0]), strArr2[2]);
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '0':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationMessageAlbum", R.string.NotificationMessageAlbum, strArr2[0]);
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '1':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageChannelGiveaway", R.string.NotificationMessageChannelGiveaway, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '2':
                                                                                                                    String str32 = str4;
                                                                                                                    i6 = i28;
                                                                                                                    try {
                                                                                                                        i13 = Integer.parseInt(strArr2[1]);
                                                                                                                    } catch (Exception unused2) {
                                                                                                                        i13 = 1;
                                                                                                                    }
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageChannelStarsGiveaway2, strArr2[0], LocaleController.formatPluralString(str32, i13, new Object[0]), strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '3':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageNoText", R.string.ChannelMessageNoText, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.Message);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '4':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationChannelStory", R.string.NotificationChannelStory, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.Story);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '5':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessagePhoto", R.string.ChannelMessagePhoto, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '6':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageVideo", R.string.ChannelMessageVideo, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '7':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageRound", R.string.ChannelMessageRound, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '8':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageDocument", R.string.ChannelMessageDocument, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '9':
                                                                                                                    i6 = i28;
                                                                                                                    if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageStickerEmoji", R.string.ChannelMessageStickerEmoji, strArr2[0], strArr2[1]);
                                                                                                                        string3 = strArr2[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                                    } else {
                                                                                                                        formatString = LocaleController.formatString("ChannelMessageSticker", R.string.ChannelMessageSticker, strArr2[0]);
                                                                                                                        string3 = LocaleController.getString(R.string.AttachSticker);
                                                                                                                    }
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ':':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageAudio", R.string.ChannelMessageAudio, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ';':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageContact2", R.string.ChannelMessageContact2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '<':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageQuiz2", R.string.ChannelMessageQuiz2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.QuizPoll);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '=':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.ChannelMessagePoll2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.Poll);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '>':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.ChannelMessageTodo2, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.Todo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '?':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString(R.string.ChannelMessageTodoDone2, strArr2[0], strArr2[2]);
                                                                                                                    break;
                                                                                                                case '@':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString(R.string.ChannelMessageTodoAppend2, strArr2[0], strArr2[2]);
                                                                                                                    break;
                                                                                                                case 'A':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageMap", R.string.ChannelMessageMap, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'B':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageLiveLocation", R.string.ChannelMessageLiveLocation, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'C':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageGIF", R.string.ChannelMessageGIF, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'D':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'E':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString("ForwardedMessageCount", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]).toLowerCase());
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'F':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'G':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'H':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str11, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'I':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'J':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("ChannelMessageAlbum", R.string.ChannelMessageAlbum, strArr2[0]);
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'K':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageChatGiveaway", R.string.NotificationMessageChatGiveaway, strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                                                                    string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'L':
                                                                                                                    i6 = i28;
                                                                                                                    try {
                                                                                                                        i14 = Integer.parseInt(strArr2[2]);
                                                                                                                    } catch (Exception unused3) {
                                                                                                                        i14 = 1;
                                                                                                                    }
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageChatStarsGiveaway2, strArr2[0], strArr2[1], LocaleController.formatPluralString(str4, i14, new Object[0]), strArr2[3]);
                                                                                                                    string3 = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'M':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupText", R.string.NotificationMessageGroupText, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = strArr2[2];
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'N':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupNoText", R.string.NotificationMessageGroupNoText, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.Message);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'O':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationChatStory", R.string.NotificationChatStory, strArr2[0]);
                                                                                                                    string3 = LocaleController.getString(R.string.Story);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'P':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupPhoto", R.string.NotificationMessageGroupPhoto, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Q':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupVideo", R.string.NotificationMessageGroupVideo, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'R':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupRound", R.string.NotificationMessageGroupRound, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'S':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupDocument", R.string.NotificationMessageGroupDocument, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'T':
                                                                                                                    i6 = i28;
                                                                                                                    if (strArr2.length > 2 && !TextUtils.isEmpty(strArr2[2])) {
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupStickerEmoji", R.string.NotificationMessageGroupStickerEmoji, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                        string3 = strArr2[2] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                                    } else {
                                                                                                                        formatString = LocaleController.formatString("NotificationMessageGroupSticker", R.string.NotificationMessageGroupSticker, strArr2[0], strArr2[1]);
                                                                                                                        string3 = strArr2[1] + " " + LocaleController.getString(R.string.AttachSticker);
                                                                                                                    }
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'U':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupAudio", R.string.NotificationMessageGroupAudio, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'V':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupContact2", R.string.NotificationMessageGroupContact2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'W':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupQuiz2", R.string.NotificationMessageGroupQuiz2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.PollQuiz);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'X':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.Poll);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Y':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.Todo);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Z':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString(R.string.NotificationMessageGroupTodoDone2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    break;
                                                                                                                case '[':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString(R.string.NotificationMessageGroupTodoAppend2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    break;
                                                                                                                case '\\':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ']':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupLiveLocation", R.string.NotificationMessageGroupLiveLocation, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '^':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupGif", R.string.NotificationMessageGroupGif, strArr2[0], strArr2[1]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '_':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupGame", R.string.NotificationMessageGroupGame, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '`':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationMessageGroupGameScored", R.string.NotificationMessageGroupGameScored, strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                                                                    break;
                                                                                                                case 'a':
                                                                                                                    i6 = i28;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGroupInvoice", R.string.NotificationMessageGroupInvoice, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string3 = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str25 = string3;
                                                                                                                    str23 = str17;
                                                                                                                    str22 = formatString;
                                                                                                                    str17 = str23;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'b':
                                                                                                                case 'c':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationInvitedToGroup", R.string.NotificationInvitedToGroup, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'd':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationEditedGroupName", R.string.NotificationEditedGroupName, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'e':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationEditedGroupPhoto", R.string.NotificationEditedGroupPhoto, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'f':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupAddMember", R.string.NotificationGroupAddMember, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    break;
                                                                                                                case 'g':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupCreatedCall", R.string.NotificationGroupCreatedCall, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'h':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupInvitedToCall", R.string.NotificationGroupInvitedToCall, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    break;
                                                                                                                case 'i':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupEndedCall", R.string.NotificationGroupEndedCall, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'j':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupInvitedYouToCall", R.string.NotificationGroupInvitedYouToCall, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'k':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupKickMember", R.string.NotificationGroupKickMember, strArr2[0], strArr2[1], strArr2.length > 2 ? strArr2[2] : "");
                                                                                                                    break;
                                                                                                                case 'l':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupKickYou", R.string.NotificationGroupKickYou, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'm':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupLeftMember", R.string.NotificationGroupLeftMember, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'n':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupAddSelf", R.string.NotificationGroupAddSelf, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'o':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("NotificationGroupAddSelfMega", R.string.NotificationGroupAddSelfMega, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'p':
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString("UserAcceptedToGroupPushWithGroup", R.string.UserAcceptedToGroupPushWithGroup, strArr2[0], strArr2[1]);
                                                                                                                    break;
                                                                                                                case 'q':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupForwardedFew", R.string.NotificationGroupForwardedFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str14, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'r':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 's':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 't':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str11, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'u':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'v':
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.formatString("NotificationGroupAlbum", R.string.NotificationGroupAlbum, strArr2[0], strArr2[1]);
                                                                                                                    str24 = str21;
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'w':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedTextUser", R.string.NotificationActionPinnedTextUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedText", R.string.NotificationActionPinnedText, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedTextChannel", R.string.NotificationActionPinnedTextChannel, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case 'x':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedNoTextUser", R.string.NotificationActionPinnedNoTextUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedNoText", R.string.NotificationActionPinnedNoText, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedNoTextChannel", R.string.NotificationActionPinnedNoTextChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case 'y':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedPhotoUser", R.string.NotificationActionPinnedPhotoUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedPhoto", R.string.NotificationActionPinnedPhoto, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedPhotoChannel", R.string.NotificationActionPinnedPhotoChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case 'z':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVideoUser", R.string.NotificationActionPinnedVideoUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVideo", R.string.NotificationActionPinnedVideo, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVideoChannel", R.string.NotificationActionPinnedVideoChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case '{':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedRoundUser", R.string.NotificationActionPinnedRoundUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedRound", R.string.NotificationActionPinnedRound, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedRoundChannel", R.string.NotificationActionPinnedRoundChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case '|':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedFileUser", R.string.NotificationActionPinnedFileUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedFile", R.string.NotificationActionPinnedFile, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedFileChannel", R.string.NotificationActionPinnedFileChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case '}':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmojiUser", R.string.NotificationActionPinnedStickerEmojiUser, strArr2[0], strArr2[1]);
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedStickerUser", R.string.NotificationActionPinnedStickerUser, strArr2[0]);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    } else if (z4) {
                                                                                                                        if (strArr2.length > 2 && !TextUtils.isEmpty(strArr2[2])) {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmoji", R.string.NotificationActionPinnedStickerEmoji, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                            break;
                                                                                                                        } else {
                                                                                                                            reactedText = LocaleController.formatString("NotificationActionPinnedSticker", R.string.NotificationActionPinnedSticker, strArr2[0], strArr2[1]);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    } else if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedStickerEmojiChannel", R.string.NotificationActionPinnedStickerEmojiChannel, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedStickerChannel", R.string.NotificationActionPinnedStickerChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case '~':
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVoiceUser", R.string.NotificationActionPinnedVoiceUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVoice", R.string.NotificationActionPinnedVoice, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedVoiceChannel", R.string.NotificationActionPinnedVoiceChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.messageTranslated /* 127 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedContactUser", R.string.NotificationActionPinnedContactUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedContact2", R.string.NotificationActionPinnedContact2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString("NotificationActionPinnedContactChannel2", R.string.NotificationActionPinnedContactChannel2, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case 128:
                                                                                                                    i6 = i28;
                                                                                                                    reactedText = LocaleController.formatString(R.string.NotificationPinnedGiveaway, strArr2[0]);
                                                                                                                    break;
                                                                                                                case NotificationCenter.dialogIsTranslatable /* 129 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuizUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.dialogTranslate /* 130 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPollUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPoll2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.didGenerateFingerprintKeyPair /* 131 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodoUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodo2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.walletPendingTransactionsChanged /* 132 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeo, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.walletSyncProgressChanged /* 133 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.httpFileDidLoad /* 134 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGame, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.httpFileDidFailedLoad /* 135 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScore, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.didUpdateConnectionState /* 136 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoice, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.fileUploaded /* 137 */:
                                                                                                                    i6 = i28;
                                                                                                                    if (j12 > 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGifUser, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else if (z4) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGif, strArr2[0], strArr2[1]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                case NotificationCenter.fileUploadFailed /* 138 */:
                                                                                                                    i6 = i28;
                                                                                                                    formatString2 = LocaleController.getString(R.string.YouHaveNewMessage);
                                                                                                                    str24 = LocaleController.getString(R.string.SecretChatName);
                                                                                                                    str22 = formatString2;
                                                                                                                    str21 = str24;
                                                                                                                    i11 = i27;
                                                                                                                    z11 = true;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileUploadProgressChanged /* 139 */:
                                                                                                                    i6 = i28;
                                                                                                                    VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i6, jSONObject2.getLong(str10));
                                                                                                                    int parseInt7 = Integer.parseInt(strArr2[1]);
                                                                                                                    if (parseInt7 <= 0) {
                                                                                                                        reactedText = LocaleController.formatString(R.string.NotificationActionMissedCallConference, strArr2[0]);
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        reactedText = LocaleController.formatPluralStringComma("NotificationActionMissedCallConferenceOther", parseInt7, strArr2[0]);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                default:
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                        FileLog.w("unhandled loc_key = " + string);
                                                                                                                    }
                                                                                                                case NotificationCenter.fileLoadProgressChanged /* 140 */:
                                                                                                                case NotificationCenter.fileLoaded /* 141 */:
                                                                                                                case NotificationCenter.fileLoadFailed /* 142 */:
                                                                                                                case NotificationCenter.filePreparingStarted /* 143 */:
                                                                                                                case NotificationCenter.fileNewChunkAvailable /* 144 */:
                                                                                                                case NotificationCenter.filePreparingFailed /* 145 */:
                                                                                                                case NotificationCenter.dialogsUnreadCounterChanged /* 146 */:
                                                                                                                case NotificationCenter.messagePlayingProgressDidChanged /* 147 */:
                                                                                                                case NotificationCenter.messagePlayingDidReset /* 148 */:
                                                                                                                case NotificationCenter.messagePlayingPlayStateChanged /* 149 */:
                                                                                                                    str22 = null;
                                                                                                                    i11 = i27;
                                                                                                                    i6 = i28;
                                                                                                                    z11 = false;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str22 != null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        } catch (Throwable th7) {
                                                                                                            th = th7;
                                                                                                            th = th;
                                                                                                            i4 = str27;
                                                                                                            str6 = str2;
                                                                                                            i = i4;
                                                                                                            i2 = -1;
                                                                                                            str8 = string;
                                                                                                            if (i == i2) {
                                                                                                            }
                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                            }
                                                                                                            FileLog.e(th);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    str22 = reactedText;
                                                                                                    i11 = i27;
                                                                                                    z11 = false;
                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                    }
                                                                                                    if (str22 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            ConnectionsManager.onInternalPushReceived(i6);
                                                                                            ConnectionsManager.getInstance(i6).resumeNetworkMaybe();
                                                                                            return;
                                                                                        }
                                                                                        str16 = null;
                                                                                        has = jSONObject2.has("edit_date");
                                                                                        if (!string.startsWith("CHAT_")) {
                                                                                        }
                                                                                        z7 = has;
                                                                                        if (!string.startsWith("PINNED_")) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    i4 = i28;
                                                                                    str6 = str2;
                                                                                    i = i4;
                                                                                    i2 = -1;
                                                                                    str8 = string;
                                                                                    if (i == i2) {
                                                                                        ConnectionsManager.onInternalPushReceived(i);
                                                                                        ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                                                                                        countDownLatch.countDown();
                                                                                    } else {
                                                                                        onDecryptError();
                                                                                    }
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                        FileLog.e("error in loc_key = " + str8 + " json " + str6);
                                                                                    }
                                                                                    FileLog.e(th);
                                                                                }
                                                                            }
                                                                            z5 = false;
                                                                            if (jSONObject2.has("silent")) {
                                                                            }
                                                                            j8 = optLong;
                                                                            jSONObject4 = jSONObject5;
                                                                            str15 = "loc_args";
                                                                            z6 = false;
                                                                            if (jSONObject4.has(str15)) {
                                                                            }
                                                                            if (strArr2 != null) {
                                                                                str16 = strArr2[0];
                                                                                has = jSONObject2.has("edit_date");
                                                                                if (!string.startsWith("CHAT_")) {
                                                                                }
                                                                                z7 = has;
                                                                                if (!string.startsWith("PINNED_")) {
                                                                                }
                                                                            }
                                                                            str16 = null;
                                                                            has = jSONObject2.has("edit_date");
                                                                            if (!string.startsWith("CHAT_")) {
                                                                            }
                                                                            z7 = has;
                                                                            if (!string.startsWith("PINNED_")) {
                                                                            }
                                                                        }
                                                                        z4 = true;
                                                                        if (jSONObject2.has("mention")) {
                                                                        }
                                                                        z5 = false;
                                                                        if (jSONObject2.has("silent")) {
                                                                        }
                                                                        j8 = optLong;
                                                                        jSONObject4 = jSONObject5;
                                                                        str15 = "loc_args";
                                                                        z6 = false;
                                                                        if (jSONObject4.has(str15)) {
                                                                        }
                                                                        if (strArr2 != null) {
                                                                        }
                                                                        str16 = null;
                                                                        has = jSONObject2.has("edit_date");
                                                                        if (!string.startsWith("CHAT_")) {
                                                                        }
                                                                        z7 = has;
                                                                        if (!string.startsWith("PINNED_")) {
                                                                        }
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        str27 = i28;
                                                                    }
                                                                } else {
                                                                    i6 = i3;
                                                                    String str33 = str10;
                                                                    if ("CONF_CALL_MISSED".equalsIgnoreCase(string)) {
                                                                        VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i6, jSONObject2.getLong(str33));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    countDownLatch.countDown();
                                                    ConnectionsManager.onInternalPushReceived(i6);
                                                    ConnectionsManager.getInstance(i6).resumeNetworkMaybe();
                                                    return;
                                                }
                                                i6 = i3;
                                                countDownLatch.countDown();
                                                ConnectionsManager.onInternalPushReceived(i6);
                                                ConnectionsManager.getInstance(i6).resumeNetworkMaybe();
                                                return;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                str27 = i3;
                                                th = th;
                                                i4 = str27;
                                                str6 = str2;
                                                i = i4;
                                                i2 = -1;
                                                str8 = string;
                                                if (i == i2) {
                                                }
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                FileLog.e(th);
                                            }
                                        }
                                        if (c != 0) {
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                    c = 65535;
                                    str27 = c3;
                                } else {
                                    if (string.equals("MESSAGE_ANNOUNCEMENT")) {
                                        c = 1;
                                        if (c != 0) {
                                        }
                                    }
                                    c = 65535;
                                    str27 = c3;
                                    if (c != 0) {
                                    }
                                }
                            } else {
                                if (string.equals("DC_UPDATE")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                str27 = c3;
                                if (c != 0) {
                                }
                            }
                        } else {
                            if (string.equals("SESSION_REVOKE")) {
                                c = 2;
                                if (c != 0) {
                                }
                            }
                            c = 65535;
                            str27 = c3;
                            if (c != 0) {
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        str2 = str26;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    str2 = str26;
                }
            } catch (Throwable th14) {
                str12 = str26;
                th = th14;
                str25 = string;
                str6 = str12;
                str7 = str25;
                i2 = -1;
                i = -1;
                str8 = str7;
                if (i == i2) {
                }
                if (BuildVars.LOGS_ENABLED) {
                }
                FileLog.e(th);
            }
        } catch (Throwable th15) {
            th = th15;
            str6 = null;
            str7 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i, TLRPC.TL_updates tL_updates) {
        MessagesController.getInstance(i).processUpdates(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i) {
        if (UserConfig.getInstance(i).getClientUserId() != 0) {
            UserConfig.getInstance(i).clearConfig();
            MessagesController.getInstance(i).performLogout(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$4(int i) {
        LocationController.getInstance(i).setNewLocationEndWatchTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i, long j, int i2) {
        MessagesController.getInstance(i).reportMessageDelivery(j, i2, true);
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.hashCode();
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
                    PushListenerController.GooglePushListenerServiceProvider.this.lambda$onRequestPushToken$1();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRequestPushToken$1() {
            try {
                SharedConfig.pushStringGetTimeStart = SystemClock.elapsedRealtime();
                FirebaseApp.initializeApp(ApplicationLoader.applicationContext);
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: org.telegram.messenger.PushListenerController$GooglePushListenerServiceProvider$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        PushListenerController.GooglePushListenerServiceProvider.this.lambda$onRequestPushToken$0(task);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRequestPushToken$0(Task task) {
            SharedConfig.pushStringGetTimeEnd = SystemClock.elapsedRealtime();
            if (!task.isSuccessful()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Failed to get regid");
                }
                SharedConfig.pushStringStatus = "__FIREBASE_FAILED__";
                PushListenerController.sendRegistrationToServer(getPushType(), null);
                return;
            }
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(getPushType(), str);
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
