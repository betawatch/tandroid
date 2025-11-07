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
    /* JADX WARN: Code restructure failed: missing block: B:1696:0x05f2, code lost:
    
        if (org.telegram.messenger.MessagesStorage.getInstance(r63).checkMessageByRandomId(r13) == false) goto L252;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:361:0x0771. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:1667:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:1672:0x0741 A[Catch: all -> 0x128d, TryCatch #7 {all -> 0x128d, blocks: (B:236:0x0648, B:242:0x0672, B:247:0x0689, B:252:0x06a8, B:263:0x06da, B:273:0x074f, B:276:0x0755, B:360:0x076d, B:373:0x124f, B:1651:0x1206, B:1665:0x0728, B:1672:0x0741), top: B:235:0x0648 }] */
    /* JADX WARN: Removed duplicated region for block: B:1676:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:1684:0x0639 A[Catch: all -> 0x035b, TRY_LEAVE, TryCatch #16 {all -> 0x035b, blocks: (B:129:0x0324, B:131:0x034d, B:132:0x0363, B:134:0x036c, B:140:0x0380, B:142:0x0388, B:146:0x0394, B:149:0x03a6, B:151:0x03b7, B:154:0x03c3, B:156:0x03d2, B:159:0x03f5, B:160:0x0428, B:161:0x0405, B:163:0x0410, B:164:0x0423, B:165:0x041a, B:166:0x043d, B:168:0x0445, B:169:0x0453, B:172:0x0460, B:173:0x046c, B:176:0x047a, B:177:0x048d, B:179:0x0490, B:181:0x049c, B:183:0x04b9, B:184:0x04e4, B:186:0x04ec, B:187:0x0504, B:189:0x0507, B:191:0x051f, B:193:0x053d, B:194:0x0568, B:196:0x056e, B:198:0x0574, B:199:0x0585, B:201:0x058e, B:203:0x05a6, B:205:0x05ba, B:206:0x05d9, B:210:0x05fb, B:213:0x0605, B:217:0x0612, B:221:0x0620, B:223:0x0626, B:244:0x067a, B:249:0x0692, B:254:0x06ae, B:256:0x06bf, B:259:0x06d0, B:262:0x06d4, B:266:0x06ea, B:268:0x06ed, B:270:0x06f3, B:368:0x1226, B:370:0x122a, B:1196:0x077c, B:1200:0x078c, B:1203:0x079e, B:1206:0x07b0, B:1209:0x07c2, B:1212:0x07d4, B:1215:0x07e6, B:1218:0x07f8, B:1221:0x080a, B:1224:0x081c, B:1227:0x082e, B:1230:0x0840, B:1233:0x0852, B:1236:0x0864, B:1239:0x0876, B:1242:0x0888, B:1245:0x089a, B:1248:0x08ac, B:1251:0x08be, B:1254:0x08d0, B:1257:0x08e2, B:1260:0x08f4, B:1263:0x0906, B:1266:0x0918, B:1269:0x092a, B:1272:0x093c, B:1275:0x094e, B:1278:0x0960, B:1281:0x0972, B:1284:0x0984, B:1287:0x0996, B:1290:0x09a8, B:1293:0x09ba, B:1296:0x09cc, B:1299:0x09de, B:1302:0x09f0, B:1305:0x0a02, B:1308:0x0a14, B:1311:0x0a26, B:1314:0x0a38, B:1317:0x0a49, B:1320:0x0a5b, B:1323:0x0a6d, B:1326:0x0a7f, B:1329:0x0a91, B:1332:0x0aa3, B:1335:0x0ab5, B:1338:0x0ac7, B:1341:0x0ad9, B:1344:0x0aeb, B:1347:0x0afd, B:1350:0x0b0f, B:1353:0x0b21, B:1356:0x0b33, B:1359:0x0b45, B:1362:0x0b57, B:1365:0x0b67, B:1368:0x0b79, B:1371:0x0b8b, B:1374:0x0b9d, B:1377:0x0baf, B:1380:0x0bc1, B:1383:0x0bd3, B:1386:0x0be5, B:1389:0x0bf7, B:1392:0x0c09, B:1395:0x0c1b, B:1398:0x0c2d, B:1401:0x0c3f, B:1404:0x0c51, B:1407:0x0c63, B:1410:0x0c75, B:1413:0x0c87, B:1416:0x0c99, B:1419:0x0cab, B:1422:0x0cbd, B:1425:0x0ccf, B:1428:0x0ce1, B:1431:0x0cf3, B:1434:0x0d05, B:1437:0x0d17, B:1440:0x0d29, B:1443:0x0d3b, B:1446:0x0d4d, B:1449:0x0d5f, B:1452:0x0d71, B:1455:0x0d83, B:1458:0x0d95, B:1461:0x0da7, B:1464:0x0db9, B:1467:0x0dcb, B:1470:0x0ddd, B:1473:0x0def, B:1476:0x0e01, B:1479:0x0e13, B:1482:0x0e23, B:1485:0x0e35, B:1488:0x0e47, B:1491:0x0e59, B:1494:0x0e69, B:1497:0x0e7b, B:1500:0x0e8d, B:1503:0x0e9f, B:1506:0x0eb1, B:1509:0x0ec3, B:1512:0x0ed5, B:1515:0x0ee7, B:1518:0x0ef9, B:1521:0x0f07, B:1524:0x0f19, B:1527:0x0f2b, B:1530:0x0f3d, B:1533:0x0f4f, B:1536:0x0f61, B:1539:0x0f73, B:1542:0x0f85, B:1545:0x0f95, B:1548:0x0fa7, B:1551:0x0fb8, B:1554:0x0fca, B:1557:0x0fdc, B:1560:0x0fee, B:1563:0x1000, B:1566:0x1012, B:1569:0x1024, B:1572:0x1036, B:1575:0x1048, B:1578:0x105a, B:1581:0x106c, B:1584:0x107e, B:1587:0x1090, B:1590:0x10a2, B:1593:0x10b4, B:1596:0x10c6, B:1599:0x10d8, B:1602:0x10e9, B:1605:0x10fb, B:1608:0x110b, B:1611:0x111d, B:1614:0x112f, B:1617:0x1141, B:1620:0x1153, B:1623:0x1165, B:1626:0x1177, B:1629:0x1189, B:1632:0x119b, B:1635:0x11ad, B:1638:0x11be, B:1641:0x11cf, B:1644:0x11e0, B:1647:0x11f1, B:1662:0x071d, B:1682:0x0633, B:1684:0x0639, B:1695:0x05ea, B:1698:0x0579, B:1700:0x057f), top: B:128:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:1686:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:1687:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:1688:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:1689:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:1757:0x2adc A[Catch: all -> 0x29ee, TryCatch #8 {all -> 0x29ee, blocks: (B:233:0x2a4e, B:232:0x2a49, B:229:0x29dc, B:231:0x29e4, B:1703:0x29f1, B:1705:0x29ff, B:1707:0x2a0c, B:1709:0x2a17, B:1711:0x2a28, B:1713:0x2a2c, B:1715:0x2a30, B:1716:0x2a32, B:1717:0x2a44, B:1751:0x2a6e, B:1753:0x2a81, B:1755:0x2a92, B:1757:0x2adc, B:1759:0x2af5, B:1761:0x2afb), top: B:102:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x29d8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0648 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06ae A[Catch: all -> 0x035b, TRY_ENTER, TryCatch #16 {all -> 0x035b, blocks: (B:129:0x0324, B:131:0x034d, B:132:0x0363, B:134:0x036c, B:140:0x0380, B:142:0x0388, B:146:0x0394, B:149:0x03a6, B:151:0x03b7, B:154:0x03c3, B:156:0x03d2, B:159:0x03f5, B:160:0x0428, B:161:0x0405, B:163:0x0410, B:164:0x0423, B:165:0x041a, B:166:0x043d, B:168:0x0445, B:169:0x0453, B:172:0x0460, B:173:0x046c, B:176:0x047a, B:177:0x048d, B:179:0x0490, B:181:0x049c, B:183:0x04b9, B:184:0x04e4, B:186:0x04ec, B:187:0x0504, B:189:0x0507, B:191:0x051f, B:193:0x053d, B:194:0x0568, B:196:0x056e, B:198:0x0574, B:199:0x0585, B:201:0x058e, B:203:0x05a6, B:205:0x05ba, B:206:0x05d9, B:210:0x05fb, B:213:0x0605, B:217:0x0612, B:221:0x0620, B:223:0x0626, B:244:0x067a, B:249:0x0692, B:254:0x06ae, B:256:0x06bf, B:259:0x06d0, B:262:0x06d4, B:266:0x06ea, B:268:0x06ed, B:270:0x06f3, B:368:0x1226, B:370:0x122a, B:1196:0x077c, B:1200:0x078c, B:1203:0x079e, B:1206:0x07b0, B:1209:0x07c2, B:1212:0x07d4, B:1215:0x07e6, B:1218:0x07f8, B:1221:0x080a, B:1224:0x081c, B:1227:0x082e, B:1230:0x0840, B:1233:0x0852, B:1236:0x0864, B:1239:0x0876, B:1242:0x0888, B:1245:0x089a, B:1248:0x08ac, B:1251:0x08be, B:1254:0x08d0, B:1257:0x08e2, B:1260:0x08f4, B:1263:0x0906, B:1266:0x0918, B:1269:0x092a, B:1272:0x093c, B:1275:0x094e, B:1278:0x0960, B:1281:0x0972, B:1284:0x0984, B:1287:0x0996, B:1290:0x09a8, B:1293:0x09ba, B:1296:0x09cc, B:1299:0x09de, B:1302:0x09f0, B:1305:0x0a02, B:1308:0x0a14, B:1311:0x0a26, B:1314:0x0a38, B:1317:0x0a49, B:1320:0x0a5b, B:1323:0x0a6d, B:1326:0x0a7f, B:1329:0x0a91, B:1332:0x0aa3, B:1335:0x0ab5, B:1338:0x0ac7, B:1341:0x0ad9, B:1344:0x0aeb, B:1347:0x0afd, B:1350:0x0b0f, B:1353:0x0b21, B:1356:0x0b33, B:1359:0x0b45, B:1362:0x0b57, B:1365:0x0b67, B:1368:0x0b79, B:1371:0x0b8b, B:1374:0x0b9d, B:1377:0x0baf, B:1380:0x0bc1, B:1383:0x0bd3, B:1386:0x0be5, B:1389:0x0bf7, B:1392:0x0c09, B:1395:0x0c1b, B:1398:0x0c2d, B:1401:0x0c3f, B:1404:0x0c51, B:1407:0x0c63, B:1410:0x0c75, B:1413:0x0c87, B:1416:0x0c99, B:1419:0x0cab, B:1422:0x0cbd, B:1425:0x0ccf, B:1428:0x0ce1, B:1431:0x0cf3, B:1434:0x0d05, B:1437:0x0d17, B:1440:0x0d29, B:1443:0x0d3b, B:1446:0x0d4d, B:1449:0x0d5f, B:1452:0x0d71, B:1455:0x0d83, B:1458:0x0d95, B:1461:0x0da7, B:1464:0x0db9, B:1467:0x0dcb, B:1470:0x0ddd, B:1473:0x0def, B:1476:0x0e01, B:1479:0x0e13, B:1482:0x0e23, B:1485:0x0e35, B:1488:0x0e47, B:1491:0x0e59, B:1494:0x0e69, B:1497:0x0e7b, B:1500:0x0e8d, B:1503:0x0e9f, B:1506:0x0eb1, B:1509:0x0ec3, B:1512:0x0ed5, B:1515:0x0ee7, B:1518:0x0ef9, B:1521:0x0f07, B:1524:0x0f19, B:1527:0x0f2b, B:1530:0x0f3d, B:1533:0x0f4f, B:1536:0x0f61, B:1539:0x0f73, B:1542:0x0f85, B:1545:0x0f95, B:1548:0x0fa7, B:1551:0x0fb8, B:1554:0x0fca, B:1557:0x0fdc, B:1560:0x0fee, B:1563:0x1000, B:1566:0x1012, B:1569:0x1024, B:1572:0x1036, B:1575:0x1048, B:1578:0x105a, B:1581:0x106c, B:1584:0x107e, B:1587:0x1090, B:1590:0x10a2, B:1593:0x10b4, B:1596:0x10c6, B:1599:0x10d8, B:1602:0x10e9, B:1605:0x10fb, B:1608:0x110b, B:1611:0x111d, B:1614:0x112f, B:1617:0x1141, B:1620:0x1153, B:1623:0x1165, B:1626:0x1177, B:1629:0x1189, B:1632:0x119b, B:1635:0x11ad, B:1638:0x11be, B:1641:0x11cf, B:1644:0x11e0, B:1647:0x11f1, B:1662:0x071d, B:1682:0x0633, B:1684:0x0639, B:1695:0x05ea, B:1698:0x0579, B:1700:0x057f), top: B:128:0x0324 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x2824 A[Catch: all -> 0x1274, TryCatch #10 {all -> 0x1274, blocks: (B:280:0x2819, B:284:0x2820, B:286:0x2824, B:288:0x2854, B:292:0x2864, B:295:0x2870, B:297:0x287b, B:299:0x2884, B:300:0x288b, B:302:0x2893, B:303:0x28c4, B:305:0x28d0, B:310:0x2904, B:312:0x2925, B:313:0x2939, B:315:0x2943, B:317:0x294b, B:320:0x2956, B:322:0x2960, B:326:0x296e, B:328:0x29a8, B:330:0x29ac, B:332:0x29b0, B:334:0x29b4, B:339:0x29be, B:340:0x29c8, B:349:0x28e0, B:351:0x28ec, B:352:0x28f8, B:355:0x28a7, B:356:0x28b5, B:375:0x1257, B:377:0x1263, B:379:0x126c, B:381:0x127e, B:384:0x1288, B:386:0x1291, B:390:0x12a7, B:393:0x12b6, B:395:0x12bd, B:398:0x12cc, B:399:0x12d1, B:402:0x12db, B:405:0x12e4, B:408:0x12f3, B:410:0x12fb, B:413:0x130a, B:414:0x1310, B:417:0x131a, B:420:0x1324, B:423:0x1333, B:425:0x133b, B:428:0x134a, B:429:0x1350, B:432:0x135a, B:435:0x1364, B:438:0x1373, B:440:0x137b, B:443:0x138a, B:444:0x1390, B:447:0x139a, B:450:0x13a4, B:453:0x13b3, B:455:0x13bb, B:458:0x13ca, B:459:0x13d0, B:462:0x13da, B:465:0x13e4, B:468:0x13f3, B:470:0x13fb, B:473:0x140a, B:474:0x1410, B:477:0x141a, B:480:0x1424, B:483:0x1433, B:485:0x143b, B:488:0x1451, B:489:0x1457, B:492:0x1466, B:495:0x1470, B:498:0x147f, B:500:0x1487, B:503:0x149d, B:504:0x14a3, B:507:0x14b2, B:510:0x14bc, B:513:0x14cb, B:515:0x14d3, B:518:0x14e9, B:519:0x14ef, B:522:0x14fe, B:523:0x1504, B:526:0x1510, B:529:0x151a, B:532:0x152c, B:534:0x1534, B:537:0x154c, B:538:0x1552, B:541:0x1564, B:544:0x156e, B:547:0x1580, B:549:0x1588, B:552:0x159a, B:553:0x15a0, B:556:0x15ac, B:559:0x15b6, B:561:0x15ba, B:563:0x15c2, B:566:0x15d3, B:567:0x15d9, B:570:0x15e5, B:572:0x15ed, B:574:0x15f1, B:576:0x15f9, B:579:0x1610, B:580:0x1616, B:583:0x1628, B:584:0x162e, B:586:0x1632, B:588:0x163a, B:591:0x164b, B:592:0x1651, B:595:0x165d, B:598:0x1667, B:601:0x1679, B:603:0x1681, B:606:0x1693, B:607:0x1699, B:610:0x16a5, B:613:0x16af, B:616:0x16c1, B:618:0x16c9, B:621:0x16db, B:622:0x16e1, B:625:0x16ed, B:628:0x16f7, B:631:0x1709, B:633:0x1711, B:636:0x1723, B:637:0x1729, B:640:0x1735, B:643:0x173f, B:646:0x1751, B:648:0x1759, B:651:0x176b, B:652:0x1771, B:655:0x177d, B:658:0x1787, B:661:0x1799, B:663:0x17a1, B:666:0x17b3, B:667:0x17b9, B:670:0x17c5, B:673:0x17cf, B:676:0x17e1, B:678:0x17e9, B:681:0x1801, B:682:0x1807, B:685:0x1819, B:686:0x181f, B:689:0x1833, B:692:0x183b, B:695:0x1864, B:696:0x1869, B:699:0x1892, B:700:0x1897, B:703:0x18c0, B:704:0x18c6, B:707:0x18ef, B:708:0x18f5, B:711:0x1920, B:712:0x1926, B:715:0x193a, B:716:0x1940, B:719:0x1954, B:720:0x195a, B:723:0x196e, B:724:0x1974, B:727:0x1988, B:728:0x198e, B:731:0x19a2, B:732:0x19a8, B:736:0x19cb, B:737:0x19bc, B:739:0x19d1, B:742:0x19e6, B:743:0x19ec, B:746:0x1a01, B:747:0x1a07, B:750:0x1a23, B:751:0x1a29, B:754:0x1a3e, B:755:0x1a44, B:758:0x1a60, B:759:0x1a66, B:762:0x1a7b, B:763:0x1a81, B:766:0x1a96, B:767:0x1a9c, B:770:0x1ab1, B:771:0x1ab7, B:774:0x1ad3, B:777:0x1ae3, B:780:0x1b05, B:781:0x1b0b, B:784:0x1b27, B:785:0x1b32, B:788:0x1b47, B:789:0x1b52, B:792:0x1b67, B:793:0x1b73, B:796:0x1b88, B:797:0x1b94, B:800:0x1bad, B:801:0x1bb3, B:804:0x1bcc, B:805:0x1bd2, B:808:0x1beb, B:809:0x1bf7, B:812:0x1c10, B:813:0x1c1c, B:816:0x1c38, B:817:0x1c44, B:820:0x1c60, B:821:0x1c6c, B:824:0x1c81, B:825:0x1c8d, B:827:0x1c95, B:829:0x1c9d, B:832:0x1cb5, B:833:0x1cd7, B:836:0x1ceb, B:837:0x1d0b, B:840:0x1d20, B:841:0x1d2c, B:844:0x1d41, B:845:0x1d4d, B:848:0x1d62, B:849:0x1d6e, B:852:0x1d83, B:853:0x1d8f, B:856:0x1d9f, B:857:0x1dab, B:860:0x1dc0, B:861:0x1dcc, B:864:0x1de8, B:867:0x1df5, B:868:0x1dfd, B:871:0x1e1f, B:874:0x1e2b, B:877:0x1e4d, B:878:0x1e59, B:881:0x1e69, B:883:0x1e70, B:886:0x1e95, B:887:0x1e9a, B:890:0x1ebf, B:891:0x1ec4, B:894:0x1ee9, B:895:0x1eef, B:898:0x1f14, B:899:0x1f1a, B:902:0x1f43, B:903:0x1f49, B:906:0x1f59, B:907:0x1f65, B:910:0x1f75, B:911:0x1f81, B:914:0x1f91, B:915:0x1f9d, B:918:0x1fad, B:919:0x1fb9, B:921:0x1fcc, B:922:0x1fd2, B:924:0x1fe5, B:925:0x1feb, B:928:0x1ffe, B:929:0x200a, B:932:0x201d, B:933:0x2029, B:936:0x203e, B:937:0x204a, B:940:0x205f, B:941:0x206b, B:944:0x207b, B:945:0x2087, B:947:0x2091, B:949:0x2099, B:952:0x20aa, B:953:0x20ca, B:956:0x20d6, B:957:0x20e2, B:960:0x20f2, B:961:0x20fe, B:964:0x210e, B:965:0x211a, B:968:0x212a, B:969:0x2136, B:972:0x2146, B:973:0x2152, B:976:0x2162, B:977:0x216e, B:980:0x217e, B:983:0x2191, B:984:0x2199, B:987:0x21b1, B:990:0x21bd, B:993:0x21d9, B:994:0x21e5, B:997:0x21f3, B:998:0x21f9, B:1001:0x2207, B:1004:0x2214, B:1005:0x221c, B:1008:0x2234, B:1011:0x223a, B:1014:0x2256, B:1015:0x225c, B:1018:0x2282, B:1019:0x2288, B:1022:0x22ac, B:1023:0x22b2, B:1026:0x22d6, B:1027:0x22dc, B:1030:0x2300, B:1031:0x2306, B:1034:0x232a, B:1035:0x2330, B:1038:0x2356, B:1039:0x2367, B:1042:0x237c, B:1043:0x2388, B:1046:0x23a4, B:1047:0x23aa, B:1050:0x23bf, B:1051:0x23cb, B:1054:0x23db, B:1055:0x23e7, B:1058:0x23f7, B:1059:0x2403, B:1062:0x2413, B:1063:0x241f, B:1066:0x2432, B:1067:0x243e, B:1070:0x2451, B:1071:0x245d, B:1074:0x2470, B:1075:0x247c, B:1078:0x248f, B:1079:0x249b, B:1082:0x24a9, B:1083:0x24b5, B:1085:0x24bf, B:1087:0x24c7, B:1090:0x24d8, B:1091:0x24f8, B:1094:0x2504, B:1095:0x2510, B:1098:0x2520, B:1099:0x252c, B:1102:0x253c, B:1103:0x2548, B:1104:0x255e, B:1107:0x256e, B:1108:0x257a, B:1111:0x258a, B:1112:0x2596, B:1115:0x25a6, B:1116:0x25b2, B:1119:0x25c2, B:1120:0x25ce, B:1121:0x25da, B:1124:0x25ea, B:1125:0x25f6, B:1128:0x2606, B:1129:0x2612, B:1131:0x2624, B:1133:0x262e, B:1135:0x2637, B:1137:0x2649, B:1139:0x2653, B:1140:0x2658, B:1142:0x2671, B:1144:0x2681, B:1146:0x2697, B:1147:0x26a2, B:1149:0x26b8, B:1150:0x26c3, B:1153:0x26d1, B:1155:0x26df, B:1157:0x26f5, B:1158:0x2700, B:1161:0x270e, B:1162:0x2719, B:1165:0x2727, B:1166:0x2732, B:1169:0x274a, B:1170:0x2760, B:1173:0x2776, B:1174:0x277e, B:1177:0x2793, B:1178:0x279f, B:1181:0x27af, B:1182:0x27bb, B:1185:0x27cb, B:1186:0x27e1, B:1188:0x27f0, B:1189:0x27fb), top: B:274:0x0753 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x2854 A[Catch: all -> 0x1274, TryCatch #10 {all -> 0x1274, blocks: (B:280:0x2819, B:284:0x2820, B:286:0x2824, B:288:0x2854, B:292:0x2864, B:295:0x2870, B:297:0x287b, B:299:0x2884, B:300:0x288b, B:302:0x2893, B:303:0x28c4, B:305:0x28d0, B:310:0x2904, B:312:0x2925, B:313:0x2939, B:315:0x2943, B:317:0x294b, B:320:0x2956, B:322:0x2960, B:326:0x296e, B:328:0x29a8, B:330:0x29ac, B:332:0x29b0, B:334:0x29b4, B:339:0x29be, B:340:0x29c8, B:349:0x28e0, B:351:0x28ec, B:352:0x28f8, B:355:0x28a7, B:356:0x28b5, B:375:0x1257, B:377:0x1263, B:379:0x126c, B:381:0x127e, B:384:0x1288, B:386:0x1291, B:390:0x12a7, B:393:0x12b6, B:395:0x12bd, B:398:0x12cc, B:399:0x12d1, B:402:0x12db, B:405:0x12e4, B:408:0x12f3, B:410:0x12fb, B:413:0x130a, B:414:0x1310, B:417:0x131a, B:420:0x1324, B:423:0x1333, B:425:0x133b, B:428:0x134a, B:429:0x1350, B:432:0x135a, B:435:0x1364, B:438:0x1373, B:440:0x137b, B:443:0x138a, B:444:0x1390, B:447:0x139a, B:450:0x13a4, B:453:0x13b3, B:455:0x13bb, B:458:0x13ca, B:459:0x13d0, B:462:0x13da, B:465:0x13e4, B:468:0x13f3, B:470:0x13fb, B:473:0x140a, B:474:0x1410, B:477:0x141a, B:480:0x1424, B:483:0x1433, B:485:0x143b, B:488:0x1451, B:489:0x1457, B:492:0x1466, B:495:0x1470, B:498:0x147f, B:500:0x1487, B:503:0x149d, B:504:0x14a3, B:507:0x14b2, B:510:0x14bc, B:513:0x14cb, B:515:0x14d3, B:518:0x14e9, B:519:0x14ef, B:522:0x14fe, B:523:0x1504, B:526:0x1510, B:529:0x151a, B:532:0x152c, B:534:0x1534, B:537:0x154c, B:538:0x1552, B:541:0x1564, B:544:0x156e, B:547:0x1580, B:549:0x1588, B:552:0x159a, B:553:0x15a0, B:556:0x15ac, B:559:0x15b6, B:561:0x15ba, B:563:0x15c2, B:566:0x15d3, B:567:0x15d9, B:570:0x15e5, B:572:0x15ed, B:574:0x15f1, B:576:0x15f9, B:579:0x1610, B:580:0x1616, B:583:0x1628, B:584:0x162e, B:586:0x1632, B:588:0x163a, B:591:0x164b, B:592:0x1651, B:595:0x165d, B:598:0x1667, B:601:0x1679, B:603:0x1681, B:606:0x1693, B:607:0x1699, B:610:0x16a5, B:613:0x16af, B:616:0x16c1, B:618:0x16c9, B:621:0x16db, B:622:0x16e1, B:625:0x16ed, B:628:0x16f7, B:631:0x1709, B:633:0x1711, B:636:0x1723, B:637:0x1729, B:640:0x1735, B:643:0x173f, B:646:0x1751, B:648:0x1759, B:651:0x176b, B:652:0x1771, B:655:0x177d, B:658:0x1787, B:661:0x1799, B:663:0x17a1, B:666:0x17b3, B:667:0x17b9, B:670:0x17c5, B:673:0x17cf, B:676:0x17e1, B:678:0x17e9, B:681:0x1801, B:682:0x1807, B:685:0x1819, B:686:0x181f, B:689:0x1833, B:692:0x183b, B:695:0x1864, B:696:0x1869, B:699:0x1892, B:700:0x1897, B:703:0x18c0, B:704:0x18c6, B:707:0x18ef, B:708:0x18f5, B:711:0x1920, B:712:0x1926, B:715:0x193a, B:716:0x1940, B:719:0x1954, B:720:0x195a, B:723:0x196e, B:724:0x1974, B:727:0x1988, B:728:0x198e, B:731:0x19a2, B:732:0x19a8, B:736:0x19cb, B:737:0x19bc, B:739:0x19d1, B:742:0x19e6, B:743:0x19ec, B:746:0x1a01, B:747:0x1a07, B:750:0x1a23, B:751:0x1a29, B:754:0x1a3e, B:755:0x1a44, B:758:0x1a60, B:759:0x1a66, B:762:0x1a7b, B:763:0x1a81, B:766:0x1a96, B:767:0x1a9c, B:770:0x1ab1, B:771:0x1ab7, B:774:0x1ad3, B:777:0x1ae3, B:780:0x1b05, B:781:0x1b0b, B:784:0x1b27, B:785:0x1b32, B:788:0x1b47, B:789:0x1b52, B:792:0x1b67, B:793:0x1b73, B:796:0x1b88, B:797:0x1b94, B:800:0x1bad, B:801:0x1bb3, B:804:0x1bcc, B:805:0x1bd2, B:808:0x1beb, B:809:0x1bf7, B:812:0x1c10, B:813:0x1c1c, B:816:0x1c38, B:817:0x1c44, B:820:0x1c60, B:821:0x1c6c, B:824:0x1c81, B:825:0x1c8d, B:827:0x1c95, B:829:0x1c9d, B:832:0x1cb5, B:833:0x1cd7, B:836:0x1ceb, B:837:0x1d0b, B:840:0x1d20, B:841:0x1d2c, B:844:0x1d41, B:845:0x1d4d, B:848:0x1d62, B:849:0x1d6e, B:852:0x1d83, B:853:0x1d8f, B:856:0x1d9f, B:857:0x1dab, B:860:0x1dc0, B:861:0x1dcc, B:864:0x1de8, B:867:0x1df5, B:868:0x1dfd, B:871:0x1e1f, B:874:0x1e2b, B:877:0x1e4d, B:878:0x1e59, B:881:0x1e69, B:883:0x1e70, B:886:0x1e95, B:887:0x1e9a, B:890:0x1ebf, B:891:0x1ec4, B:894:0x1ee9, B:895:0x1eef, B:898:0x1f14, B:899:0x1f1a, B:902:0x1f43, B:903:0x1f49, B:906:0x1f59, B:907:0x1f65, B:910:0x1f75, B:911:0x1f81, B:914:0x1f91, B:915:0x1f9d, B:918:0x1fad, B:919:0x1fb9, B:921:0x1fcc, B:922:0x1fd2, B:924:0x1fe5, B:925:0x1feb, B:928:0x1ffe, B:929:0x200a, B:932:0x201d, B:933:0x2029, B:936:0x203e, B:937:0x204a, B:940:0x205f, B:941:0x206b, B:944:0x207b, B:945:0x2087, B:947:0x2091, B:949:0x2099, B:952:0x20aa, B:953:0x20ca, B:956:0x20d6, B:957:0x20e2, B:960:0x20f2, B:961:0x20fe, B:964:0x210e, B:965:0x211a, B:968:0x212a, B:969:0x2136, B:972:0x2146, B:973:0x2152, B:976:0x2162, B:977:0x216e, B:980:0x217e, B:983:0x2191, B:984:0x2199, B:987:0x21b1, B:990:0x21bd, B:993:0x21d9, B:994:0x21e5, B:997:0x21f3, B:998:0x21f9, B:1001:0x2207, B:1004:0x2214, B:1005:0x221c, B:1008:0x2234, B:1011:0x223a, B:1014:0x2256, B:1015:0x225c, B:1018:0x2282, B:1019:0x2288, B:1022:0x22ac, B:1023:0x22b2, B:1026:0x22d6, B:1027:0x22dc, B:1030:0x2300, B:1031:0x2306, B:1034:0x232a, B:1035:0x2330, B:1038:0x2356, B:1039:0x2367, B:1042:0x237c, B:1043:0x2388, B:1046:0x23a4, B:1047:0x23aa, B:1050:0x23bf, B:1051:0x23cb, B:1054:0x23db, B:1055:0x23e7, B:1058:0x23f7, B:1059:0x2403, B:1062:0x2413, B:1063:0x241f, B:1066:0x2432, B:1067:0x243e, B:1070:0x2451, B:1071:0x245d, B:1074:0x2470, B:1075:0x247c, B:1078:0x248f, B:1079:0x249b, B:1082:0x24a9, B:1083:0x24b5, B:1085:0x24bf, B:1087:0x24c7, B:1090:0x24d8, B:1091:0x24f8, B:1094:0x2504, B:1095:0x2510, B:1098:0x2520, B:1099:0x252c, B:1102:0x253c, B:1103:0x2548, B:1104:0x255e, B:1107:0x256e, B:1108:0x257a, B:1111:0x258a, B:1112:0x2596, B:1115:0x25a6, B:1116:0x25b2, B:1119:0x25c2, B:1120:0x25ce, B:1121:0x25da, B:1124:0x25ea, B:1125:0x25f6, B:1128:0x2606, B:1129:0x2612, B:1131:0x2624, B:1133:0x262e, B:1135:0x2637, B:1137:0x2649, B:1139:0x2653, B:1140:0x2658, B:1142:0x2671, B:1144:0x2681, B:1146:0x2697, B:1147:0x26a2, B:1149:0x26b8, B:1150:0x26c3, B:1153:0x26d1, B:1155:0x26df, B:1157:0x26f5, B:1158:0x2700, B:1161:0x270e, B:1162:0x2719, B:1165:0x2727, B:1166:0x2732, B:1169:0x274a, B:1170:0x2760, B:1173:0x2776, B:1174:0x277e, B:1177:0x2793, B:1178:0x279f, B:1181:0x27af, B:1182:0x27bb, B:1185:0x27cb, B:1186:0x27e1, B:1188:0x27f0, B:1189:0x27fb), top: B:274:0x0753 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x2925 A[Catch: all -> 0x1274, TryCatch #10 {all -> 0x1274, blocks: (B:280:0x2819, B:284:0x2820, B:286:0x2824, B:288:0x2854, B:292:0x2864, B:295:0x2870, B:297:0x287b, B:299:0x2884, B:300:0x288b, B:302:0x2893, B:303:0x28c4, B:305:0x28d0, B:310:0x2904, B:312:0x2925, B:313:0x2939, B:315:0x2943, B:317:0x294b, B:320:0x2956, B:322:0x2960, B:326:0x296e, B:328:0x29a8, B:330:0x29ac, B:332:0x29b0, B:334:0x29b4, B:339:0x29be, B:340:0x29c8, B:349:0x28e0, B:351:0x28ec, B:352:0x28f8, B:355:0x28a7, B:356:0x28b5, B:375:0x1257, B:377:0x1263, B:379:0x126c, B:381:0x127e, B:384:0x1288, B:386:0x1291, B:390:0x12a7, B:393:0x12b6, B:395:0x12bd, B:398:0x12cc, B:399:0x12d1, B:402:0x12db, B:405:0x12e4, B:408:0x12f3, B:410:0x12fb, B:413:0x130a, B:414:0x1310, B:417:0x131a, B:420:0x1324, B:423:0x1333, B:425:0x133b, B:428:0x134a, B:429:0x1350, B:432:0x135a, B:435:0x1364, B:438:0x1373, B:440:0x137b, B:443:0x138a, B:444:0x1390, B:447:0x139a, B:450:0x13a4, B:453:0x13b3, B:455:0x13bb, B:458:0x13ca, B:459:0x13d0, B:462:0x13da, B:465:0x13e4, B:468:0x13f3, B:470:0x13fb, B:473:0x140a, B:474:0x1410, B:477:0x141a, B:480:0x1424, B:483:0x1433, B:485:0x143b, B:488:0x1451, B:489:0x1457, B:492:0x1466, B:495:0x1470, B:498:0x147f, B:500:0x1487, B:503:0x149d, B:504:0x14a3, B:507:0x14b2, B:510:0x14bc, B:513:0x14cb, B:515:0x14d3, B:518:0x14e9, B:519:0x14ef, B:522:0x14fe, B:523:0x1504, B:526:0x1510, B:529:0x151a, B:532:0x152c, B:534:0x1534, B:537:0x154c, B:538:0x1552, B:541:0x1564, B:544:0x156e, B:547:0x1580, B:549:0x1588, B:552:0x159a, B:553:0x15a0, B:556:0x15ac, B:559:0x15b6, B:561:0x15ba, B:563:0x15c2, B:566:0x15d3, B:567:0x15d9, B:570:0x15e5, B:572:0x15ed, B:574:0x15f1, B:576:0x15f9, B:579:0x1610, B:580:0x1616, B:583:0x1628, B:584:0x162e, B:586:0x1632, B:588:0x163a, B:591:0x164b, B:592:0x1651, B:595:0x165d, B:598:0x1667, B:601:0x1679, B:603:0x1681, B:606:0x1693, B:607:0x1699, B:610:0x16a5, B:613:0x16af, B:616:0x16c1, B:618:0x16c9, B:621:0x16db, B:622:0x16e1, B:625:0x16ed, B:628:0x16f7, B:631:0x1709, B:633:0x1711, B:636:0x1723, B:637:0x1729, B:640:0x1735, B:643:0x173f, B:646:0x1751, B:648:0x1759, B:651:0x176b, B:652:0x1771, B:655:0x177d, B:658:0x1787, B:661:0x1799, B:663:0x17a1, B:666:0x17b3, B:667:0x17b9, B:670:0x17c5, B:673:0x17cf, B:676:0x17e1, B:678:0x17e9, B:681:0x1801, B:682:0x1807, B:685:0x1819, B:686:0x181f, B:689:0x1833, B:692:0x183b, B:695:0x1864, B:696:0x1869, B:699:0x1892, B:700:0x1897, B:703:0x18c0, B:704:0x18c6, B:707:0x18ef, B:708:0x18f5, B:711:0x1920, B:712:0x1926, B:715:0x193a, B:716:0x1940, B:719:0x1954, B:720:0x195a, B:723:0x196e, B:724:0x1974, B:727:0x1988, B:728:0x198e, B:731:0x19a2, B:732:0x19a8, B:736:0x19cb, B:737:0x19bc, B:739:0x19d1, B:742:0x19e6, B:743:0x19ec, B:746:0x1a01, B:747:0x1a07, B:750:0x1a23, B:751:0x1a29, B:754:0x1a3e, B:755:0x1a44, B:758:0x1a60, B:759:0x1a66, B:762:0x1a7b, B:763:0x1a81, B:766:0x1a96, B:767:0x1a9c, B:770:0x1ab1, B:771:0x1ab7, B:774:0x1ad3, B:777:0x1ae3, B:780:0x1b05, B:781:0x1b0b, B:784:0x1b27, B:785:0x1b32, B:788:0x1b47, B:789:0x1b52, B:792:0x1b67, B:793:0x1b73, B:796:0x1b88, B:797:0x1b94, B:800:0x1bad, B:801:0x1bb3, B:804:0x1bcc, B:805:0x1bd2, B:808:0x1beb, B:809:0x1bf7, B:812:0x1c10, B:813:0x1c1c, B:816:0x1c38, B:817:0x1c44, B:820:0x1c60, B:821:0x1c6c, B:824:0x1c81, B:825:0x1c8d, B:827:0x1c95, B:829:0x1c9d, B:832:0x1cb5, B:833:0x1cd7, B:836:0x1ceb, B:837:0x1d0b, B:840:0x1d20, B:841:0x1d2c, B:844:0x1d41, B:845:0x1d4d, B:848:0x1d62, B:849:0x1d6e, B:852:0x1d83, B:853:0x1d8f, B:856:0x1d9f, B:857:0x1dab, B:860:0x1dc0, B:861:0x1dcc, B:864:0x1de8, B:867:0x1df5, B:868:0x1dfd, B:871:0x1e1f, B:874:0x1e2b, B:877:0x1e4d, B:878:0x1e59, B:881:0x1e69, B:883:0x1e70, B:886:0x1e95, B:887:0x1e9a, B:890:0x1ebf, B:891:0x1ec4, B:894:0x1ee9, B:895:0x1eef, B:898:0x1f14, B:899:0x1f1a, B:902:0x1f43, B:903:0x1f49, B:906:0x1f59, B:907:0x1f65, B:910:0x1f75, B:911:0x1f81, B:914:0x1f91, B:915:0x1f9d, B:918:0x1fad, B:919:0x1fb9, B:921:0x1fcc, B:922:0x1fd2, B:924:0x1fe5, B:925:0x1feb, B:928:0x1ffe, B:929:0x200a, B:932:0x201d, B:933:0x2029, B:936:0x203e, B:937:0x204a, B:940:0x205f, B:941:0x206b, B:944:0x207b, B:945:0x2087, B:947:0x2091, B:949:0x2099, B:952:0x20aa, B:953:0x20ca, B:956:0x20d6, B:957:0x20e2, B:960:0x20f2, B:961:0x20fe, B:964:0x210e, B:965:0x211a, B:968:0x212a, B:969:0x2136, B:972:0x2146, B:973:0x2152, B:976:0x2162, B:977:0x216e, B:980:0x217e, B:983:0x2191, B:984:0x2199, B:987:0x21b1, B:990:0x21bd, B:993:0x21d9, B:994:0x21e5, B:997:0x21f3, B:998:0x21f9, B:1001:0x2207, B:1004:0x2214, B:1005:0x221c, B:1008:0x2234, B:1011:0x223a, B:1014:0x2256, B:1015:0x225c, B:1018:0x2282, B:1019:0x2288, B:1022:0x22ac, B:1023:0x22b2, B:1026:0x22d6, B:1027:0x22dc, B:1030:0x2300, B:1031:0x2306, B:1034:0x232a, B:1035:0x2330, B:1038:0x2356, B:1039:0x2367, B:1042:0x237c, B:1043:0x2388, B:1046:0x23a4, B:1047:0x23aa, B:1050:0x23bf, B:1051:0x23cb, B:1054:0x23db, B:1055:0x23e7, B:1058:0x23f7, B:1059:0x2403, B:1062:0x2413, B:1063:0x241f, B:1066:0x2432, B:1067:0x243e, B:1070:0x2451, B:1071:0x245d, B:1074:0x2470, B:1075:0x247c, B:1078:0x248f, B:1079:0x249b, B:1082:0x24a9, B:1083:0x24b5, B:1085:0x24bf, B:1087:0x24c7, B:1090:0x24d8, B:1091:0x24f8, B:1094:0x2504, B:1095:0x2510, B:1098:0x2520, B:1099:0x252c, B:1102:0x253c, B:1103:0x2548, B:1104:0x255e, B:1107:0x256e, B:1108:0x257a, B:1111:0x258a, B:1112:0x2596, B:1115:0x25a6, B:1116:0x25b2, B:1119:0x25c2, B:1120:0x25ce, B:1121:0x25da, B:1124:0x25ea, B:1125:0x25f6, B:1128:0x2606, B:1129:0x2612, B:1131:0x2624, B:1133:0x262e, B:1135:0x2637, B:1137:0x2649, B:1139:0x2653, B:1140:0x2658, B:1142:0x2671, B:1144:0x2681, B:1146:0x2697, B:1147:0x26a2, B:1149:0x26b8, B:1150:0x26c3, B:1153:0x26d1, B:1155:0x26df, B:1157:0x26f5, B:1158:0x2700, B:1161:0x270e, B:1162:0x2719, B:1165:0x2727, B:1166:0x2732, B:1169:0x274a, B:1170:0x2760, B:1173:0x2776, B:1174:0x277e, B:1177:0x2793, B:1178:0x279f, B:1181:0x27af, B:1182:0x27bb, B:1185:0x27cb, B:1186:0x27e1, B:1188:0x27f0, B:1189:0x27fb), top: B:274:0x0753 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x2960 A[Catch: all -> 0x1274, TryCatch #10 {all -> 0x1274, blocks: (B:280:0x2819, B:284:0x2820, B:286:0x2824, B:288:0x2854, B:292:0x2864, B:295:0x2870, B:297:0x287b, B:299:0x2884, B:300:0x288b, B:302:0x2893, B:303:0x28c4, B:305:0x28d0, B:310:0x2904, B:312:0x2925, B:313:0x2939, B:315:0x2943, B:317:0x294b, B:320:0x2956, B:322:0x2960, B:326:0x296e, B:328:0x29a8, B:330:0x29ac, B:332:0x29b0, B:334:0x29b4, B:339:0x29be, B:340:0x29c8, B:349:0x28e0, B:351:0x28ec, B:352:0x28f8, B:355:0x28a7, B:356:0x28b5, B:375:0x1257, B:377:0x1263, B:379:0x126c, B:381:0x127e, B:384:0x1288, B:386:0x1291, B:390:0x12a7, B:393:0x12b6, B:395:0x12bd, B:398:0x12cc, B:399:0x12d1, B:402:0x12db, B:405:0x12e4, B:408:0x12f3, B:410:0x12fb, B:413:0x130a, B:414:0x1310, B:417:0x131a, B:420:0x1324, B:423:0x1333, B:425:0x133b, B:428:0x134a, B:429:0x1350, B:432:0x135a, B:435:0x1364, B:438:0x1373, B:440:0x137b, B:443:0x138a, B:444:0x1390, B:447:0x139a, B:450:0x13a4, B:453:0x13b3, B:455:0x13bb, B:458:0x13ca, B:459:0x13d0, B:462:0x13da, B:465:0x13e4, B:468:0x13f3, B:470:0x13fb, B:473:0x140a, B:474:0x1410, B:477:0x141a, B:480:0x1424, B:483:0x1433, B:485:0x143b, B:488:0x1451, B:489:0x1457, B:492:0x1466, B:495:0x1470, B:498:0x147f, B:500:0x1487, B:503:0x149d, B:504:0x14a3, B:507:0x14b2, B:510:0x14bc, B:513:0x14cb, B:515:0x14d3, B:518:0x14e9, B:519:0x14ef, B:522:0x14fe, B:523:0x1504, B:526:0x1510, B:529:0x151a, B:532:0x152c, B:534:0x1534, B:537:0x154c, B:538:0x1552, B:541:0x1564, B:544:0x156e, B:547:0x1580, B:549:0x1588, B:552:0x159a, B:553:0x15a0, B:556:0x15ac, B:559:0x15b6, B:561:0x15ba, B:563:0x15c2, B:566:0x15d3, B:567:0x15d9, B:570:0x15e5, B:572:0x15ed, B:574:0x15f1, B:576:0x15f9, B:579:0x1610, B:580:0x1616, B:583:0x1628, B:584:0x162e, B:586:0x1632, B:588:0x163a, B:591:0x164b, B:592:0x1651, B:595:0x165d, B:598:0x1667, B:601:0x1679, B:603:0x1681, B:606:0x1693, B:607:0x1699, B:610:0x16a5, B:613:0x16af, B:616:0x16c1, B:618:0x16c9, B:621:0x16db, B:622:0x16e1, B:625:0x16ed, B:628:0x16f7, B:631:0x1709, B:633:0x1711, B:636:0x1723, B:637:0x1729, B:640:0x1735, B:643:0x173f, B:646:0x1751, B:648:0x1759, B:651:0x176b, B:652:0x1771, B:655:0x177d, B:658:0x1787, B:661:0x1799, B:663:0x17a1, B:666:0x17b3, B:667:0x17b9, B:670:0x17c5, B:673:0x17cf, B:676:0x17e1, B:678:0x17e9, B:681:0x1801, B:682:0x1807, B:685:0x1819, B:686:0x181f, B:689:0x1833, B:692:0x183b, B:695:0x1864, B:696:0x1869, B:699:0x1892, B:700:0x1897, B:703:0x18c0, B:704:0x18c6, B:707:0x18ef, B:708:0x18f5, B:711:0x1920, B:712:0x1926, B:715:0x193a, B:716:0x1940, B:719:0x1954, B:720:0x195a, B:723:0x196e, B:724:0x1974, B:727:0x1988, B:728:0x198e, B:731:0x19a2, B:732:0x19a8, B:736:0x19cb, B:737:0x19bc, B:739:0x19d1, B:742:0x19e6, B:743:0x19ec, B:746:0x1a01, B:747:0x1a07, B:750:0x1a23, B:751:0x1a29, B:754:0x1a3e, B:755:0x1a44, B:758:0x1a60, B:759:0x1a66, B:762:0x1a7b, B:763:0x1a81, B:766:0x1a96, B:767:0x1a9c, B:770:0x1ab1, B:771:0x1ab7, B:774:0x1ad3, B:777:0x1ae3, B:780:0x1b05, B:781:0x1b0b, B:784:0x1b27, B:785:0x1b32, B:788:0x1b47, B:789:0x1b52, B:792:0x1b67, B:793:0x1b73, B:796:0x1b88, B:797:0x1b94, B:800:0x1bad, B:801:0x1bb3, B:804:0x1bcc, B:805:0x1bd2, B:808:0x1beb, B:809:0x1bf7, B:812:0x1c10, B:813:0x1c1c, B:816:0x1c38, B:817:0x1c44, B:820:0x1c60, B:821:0x1c6c, B:824:0x1c81, B:825:0x1c8d, B:827:0x1c95, B:829:0x1c9d, B:832:0x1cb5, B:833:0x1cd7, B:836:0x1ceb, B:837:0x1d0b, B:840:0x1d20, B:841:0x1d2c, B:844:0x1d41, B:845:0x1d4d, B:848:0x1d62, B:849:0x1d6e, B:852:0x1d83, B:853:0x1d8f, B:856:0x1d9f, B:857:0x1dab, B:860:0x1dc0, B:861:0x1dcc, B:864:0x1de8, B:867:0x1df5, B:868:0x1dfd, B:871:0x1e1f, B:874:0x1e2b, B:877:0x1e4d, B:878:0x1e59, B:881:0x1e69, B:883:0x1e70, B:886:0x1e95, B:887:0x1e9a, B:890:0x1ebf, B:891:0x1ec4, B:894:0x1ee9, B:895:0x1eef, B:898:0x1f14, B:899:0x1f1a, B:902:0x1f43, B:903:0x1f49, B:906:0x1f59, B:907:0x1f65, B:910:0x1f75, B:911:0x1f81, B:914:0x1f91, B:915:0x1f9d, B:918:0x1fad, B:919:0x1fb9, B:921:0x1fcc, B:922:0x1fd2, B:924:0x1fe5, B:925:0x1feb, B:928:0x1ffe, B:929:0x200a, B:932:0x201d, B:933:0x2029, B:936:0x203e, B:937:0x204a, B:940:0x205f, B:941:0x206b, B:944:0x207b, B:945:0x2087, B:947:0x2091, B:949:0x2099, B:952:0x20aa, B:953:0x20ca, B:956:0x20d6, B:957:0x20e2, B:960:0x20f2, B:961:0x20fe, B:964:0x210e, B:965:0x211a, B:968:0x212a, B:969:0x2136, B:972:0x2146, B:973:0x2152, B:976:0x2162, B:977:0x216e, B:980:0x217e, B:983:0x2191, B:984:0x2199, B:987:0x21b1, B:990:0x21bd, B:993:0x21d9, B:994:0x21e5, B:997:0x21f3, B:998:0x21f9, B:1001:0x2207, B:1004:0x2214, B:1005:0x221c, B:1008:0x2234, B:1011:0x223a, B:1014:0x2256, B:1015:0x225c, B:1018:0x2282, B:1019:0x2288, B:1022:0x22ac, B:1023:0x22b2, B:1026:0x22d6, B:1027:0x22dc, B:1030:0x2300, B:1031:0x2306, B:1034:0x232a, B:1035:0x2330, B:1038:0x2356, B:1039:0x2367, B:1042:0x237c, B:1043:0x2388, B:1046:0x23a4, B:1047:0x23aa, B:1050:0x23bf, B:1051:0x23cb, B:1054:0x23db, B:1055:0x23e7, B:1058:0x23f7, B:1059:0x2403, B:1062:0x2413, B:1063:0x241f, B:1066:0x2432, B:1067:0x243e, B:1070:0x2451, B:1071:0x245d, B:1074:0x2470, B:1075:0x247c, B:1078:0x248f, B:1079:0x249b, B:1082:0x24a9, B:1083:0x24b5, B:1085:0x24bf, B:1087:0x24c7, B:1090:0x24d8, B:1091:0x24f8, B:1094:0x2504, B:1095:0x2510, B:1098:0x2520, B:1099:0x252c, B:1102:0x253c, B:1103:0x2548, B:1104:0x255e, B:1107:0x256e, B:1108:0x257a, B:1111:0x258a, B:1112:0x2596, B:1115:0x25a6, B:1116:0x25b2, B:1119:0x25c2, B:1120:0x25ce, B:1121:0x25da, B:1124:0x25ea, B:1125:0x25f6, B:1128:0x2606, B:1129:0x2612, B:1131:0x2624, B:1133:0x262e, B:1135:0x2637, B:1137:0x2649, B:1139:0x2653, B:1140:0x2658, B:1142:0x2671, B:1144:0x2681, B:1146:0x2697, B:1147:0x26a2, B:1149:0x26b8, B:1150:0x26c3, B:1153:0x26d1, B:1155:0x26df, B:1157:0x26f5, B:1158:0x2700, B:1161:0x270e, B:1162:0x2719, B:1165:0x2727, B:1166:0x2732, B:1169:0x274a, B:1170:0x2760, B:1173:0x2776, B:1174:0x277e, B:1177:0x2793, B:1178:0x279f, B:1181:0x27af, B:1182:0x27bb, B:1185:0x27cb, B:1186:0x27e1, B:1188:0x27f0, B:1189:0x27fb), top: B:274:0x0753 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x29a8 A[Catch: all -> 0x1274, TryCatch #10 {all -> 0x1274, blocks: (B:280:0x2819, B:284:0x2820, B:286:0x2824, B:288:0x2854, B:292:0x2864, B:295:0x2870, B:297:0x287b, B:299:0x2884, B:300:0x288b, B:302:0x2893, B:303:0x28c4, B:305:0x28d0, B:310:0x2904, B:312:0x2925, B:313:0x2939, B:315:0x2943, B:317:0x294b, B:320:0x2956, B:322:0x2960, B:326:0x296e, B:328:0x29a8, B:330:0x29ac, B:332:0x29b0, B:334:0x29b4, B:339:0x29be, B:340:0x29c8, B:349:0x28e0, B:351:0x28ec, B:352:0x28f8, B:355:0x28a7, B:356:0x28b5, B:375:0x1257, B:377:0x1263, B:379:0x126c, B:381:0x127e, B:384:0x1288, B:386:0x1291, B:390:0x12a7, B:393:0x12b6, B:395:0x12bd, B:398:0x12cc, B:399:0x12d1, B:402:0x12db, B:405:0x12e4, B:408:0x12f3, B:410:0x12fb, B:413:0x130a, B:414:0x1310, B:417:0x131a, B:420:0x1324, B:423:0x1333, B:425:0x133b, B:428:0x134a, B:429:0x1350, B:432:0x135a, B:435:0x1364, B:438:0x1373, B:440:0x137b, B:443:0x138a, B:444:0x1390, B:447:0x139a, B:450:0x13a4, B:453:0x13b3, B:455:0x13bb, B:458:0x13ca, B:459:0x13d0, B:462:0x13da, B:465:0x13e4, B:468:0x13f3, B:470:0x13fb, B:473:0x140a, B:474:0x1410, B:477:0x141a, B:480:0x1424, B:483:0x1433, B:485:0x143b, B:488:0x1451, B:489:0x1457, B:492:0x1466, B:495:0x1470, B:498:0x147f, B:500:0x1487, B:503:0x149d, B:504:0x14a3, B:507:0x14b2, B:510:0x14bc, B:513:0x14cb, B:515:0x14d3, B:518:0x14e9, B:519:0x14ef, B:522:0x14fe, B:523:0x1504, B:526:0x1510, B:529:0x151a, B:532:0x152c, B:534:0x1534, B:537:0x154c, B:538:0x1552, B:541:0x1564, B:544:0x156e, B:547:0x1580, B:549:0x1588, B:552:0x159a, B:553:0x15a0, B:556:0x15ac, B:559:0x15b6, B:561:0x15ba, B:563:0x15c2, B:566:0x15d3, B:567:0x15d9, B:570:0x15e5, B:572:0x15ed, B:574:0x15f1, B:576:0x15f9, B:579:0x1610, B:580:0x1616, B:583:0x1628, B:584:0x162e, B:586:0x1632, B:588:0x163a, B:591:0x164b, B:592:0x1651, B:595:0x165d, B:598:0x1667, B:601:0x1679, B:603:0x1681, B:606:0x1693, B:607:0x1699, B:610:0x16a5, B:613:0x16af, B:616:0x16c1, B:618:0x16c9, B:621:0x16db, B:622:0x16e1, B:625:0x16ed, B:628:0x16f7, B:631:0x1709, B:633:0x1711, B:636:0x1723, B:637:0x1729, B:640:0x1735, B:643:0x173f, B:646:0x1751, B:648:0x1759, B:651:0x176b, B:652:0x1771, B:655:0x177d, B:658:0x1787, B:661:0x1799, B:663:0x17a1, B:666:0x17b3, B:667:0x17b9, B:670:0x17c5, B:673:0x17cf, B:676:0x17e1, B:678:0x17e9, B:681:0x1801, B:682:0x1807, B:685:0x1819, B:686:0x181f, B:689:0x1833, B:692:0x183b, B:695:0x1864, B:696:0x1869, B:699:0x1892, B:700:0x1897, B:703:0x18c0, B:704:0x18c6, B:707:0x18ef, B:708:0x18f5, B:711:0x1920, B:712:0x1926, B:715:0x193a, B:716:0x1940, B:719:0x1954, B:720:0x195a, B:723:0x196e, B:724:0x1974, B:727:0x1988, B:728:0x198e, B:731:0x19a2, B:732:0x19a8, B:736:0x19cb, B:737:0x19bc, B:739:0x19d1, B:742:0x19e6, B:743:0x19ec, B:746:0x1a01, B:747:0x1a07, B:750:0x1a23, B:751:0x1a29, B:754:0x1a3e, B:755:0x1a44, B:758:0x1a60, B:759:0x1a66, B:762:0x1a7b, B:763:0x1a81, B:766:0x1a96, B:767:0x1a9c, B:770:0x1ab1, B:771:0x1ab7, B:774:0x1ad3, B:777:0x1ae3, B:780:0x1b05, B:781:0x1b0b, B:784:0x1b27, B:785:0x1b32, B:788:0x1b47, B:789:0x1b52, B:792:0x1b67, B:793:0x1b73, B:796:0x1b88, B:797:0x1b94, B:800:0x1bad, B:801:0x1bb3, B:804:0x1bcc, B:805:0x1bd2, B:808:0x1beb, B:809:0x1bf7, B:812:0x1c10, B:813:0x1c1c, B:816:0x1c38, B:817:0x1c44, B:820:0x1c60, B:821:0x1c6c, B:824:0x1c81, B:825:0x1c8d, B:827:0x1c95, B:829:0x1c9d, B:832:0x1cb5, B:833:0x1cd7, B:836:0x1ceb, B:837:0x1d0b, B:840:0x1d20, B:841:0x1d2c, B:844:0x1d41, B:845:0x1d4d, B:848:0x1d62, B:849:0x1d6e, B:852:0x1d83, B:853:0x1d8f, B:856:0x1d9f, B:857:0x1dab, B:860:0x1dc0, B:861:0x1dcc, B:864:0x1de8, B:867:0x1df5, B:868:0x1dfd, B:871:0x1e1f, B:874:0x1e2b, B:877:0x1e4d, B:878:0x1e59, B:881:0x1e69, B:883:0x1e70, B:886:0x1e95, B:887:0x1e9a, B:890:0x1ebf, B:891:0x1ec4, B:894:0x1ee9, B:895:0x1eef, B:898:0x1f14, B:899:0x1f1a, B:902:0x1f43, B:903:0x1f49, B:906:0x1f59, B:907:0x1f65, B:910:0x1f75, B:911:0x1f81, B:914:0x1f91, B:915:0x1f9d, B:918:0x1fad, B:919:0x1fb9, B:921:0x1fcc, B:922:0x1fd2, B:924:0x1fe5, B:925:0x1feb, B:928:0x1ffe, B:929:0x200a, B:932:0x201d, B:933:0x2029, B:936:0x203e, B:937:0x204a, B:940:0x205f, B:941:0x206b, B:944:0x207b, B:945:0x2087, B:947:0x2091, B:949:0x2099, B:952:0x20aa, B:953:0x20ca, B:956:0x20d6, B:957:0x20e2, B:960:0x20f2, B:961:0x20fe, B:964:0x210e, B:965:0x211a, B:968:0x212a, B:969:0x2136, B:972:0x2146, B:973:0x2152, B:976:0x2162, B:977:0x216e, B:980:0x217e, B:983:0x2191, B:984:0x2199, B:987:0x21b1, B:990:0x21bd, B:993:0x21d9, B:994:0x21e5, B:997:0x21f3, B:998:0x21f9, B:1001:0x2207, B:1004:0x2214, B:1005:0x221c, B:1008:0x2234, B:1011:0x223a, B:1014:0x2256, B:1015:0x225c, B:1018:0x2282, B:1019:0x2288, B:1022:0x22ac, B:1023:0x22b2, B:1026:0x22d6, B:1027:0x22dc, B:1030:0x2300, B:1031:0x2306, B:1034:0x232a, B:1035:0x2330, B:1038:0x2356, B:1039:0x2367, B:1042:0x237c, B:1043:0x2388, B:1046:0x23a4, B:1047:0x23aa, B:1050:0x23bf, B:1051:0x23cb, B:1054:0x23db, B:1055:0x23e7, B:1058:0x23f7, B:1059:0x2403, B:1062:0x2413, B:1063:0x241f, B:1066:0x2432, B:1067:0x243e, B:1070:0x2451, B:1071:0x245d, B:1074:0x2470, B:1075:0x247c, B:1078:0x248f, B:1079:0x249b, B:1082:0x24a9, B:1083:0x24b5, B:1085:0x24bf, B:1087:0x24c7, B:1090:0x24d8, B:1091:0x24f8, B:1094:0x2504, B:1095:0x2510, B:1098:0x2520, B:1099:0x252c, B:1102:0x253c, B:1103:0x2548, B:1104:0x255e, B:1107:0x256e, B:1108:0x257a, B:1111:0x258a, B:1112:0x2596, B:1115:0x25a6, B:1116:0x25b2, B:1119:0x25c2, B:1120:0x25ce, B:1121:0x25da, B:1124:0x25ea, B:1125:0x25f6, B:1128:0x2606, B:1129:0x2612, B:1131:0x2624, B:1133:0x262e, B:1135:0x2637, B:1137:0x2649, B:1139:0x2653, B:1140:0x2658, B:1142:0x2671, B:1144:0x2681, B:1146:0x2697, B:1147:0x26a2, B:1149:0x26b8, B:1150:0x26c3, B:1153:0x26d1, B:1155:0x26df, B:1157:0x26f5, B:1158:0x2700, B:1161:0x270e, B:1162:0x2719, B:1165:0x2727, B:1166:0x2732, B:1169:0x274a, B:1170:0x2760, B:1173:0x2776, B:1174:0x277e, B:1177:0x2793, B:1178:0x279f, B:1181:0x27af, B:1182:0x27bb, B:1185:0x27cb, B:1186:0x27e1, B:1188:0x27f0, B:1189:0x27fb), top: B:274:0x0753 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x296b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x29d5  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x2850  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x2b34  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x2b4b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x2b44  */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v177 */
    /* JADX WARN: Type inference failed for: r5v178 */
    /* JADX WARN: Type inference failed for: r5v187 */
    /* JADX WARN: Type inference failed for: r5v188 */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v9 */
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
        int i2;
        String str8;
        Object obj;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject;
        final int i3;
        long clientUserId;
        int intValue;
        int i4;
        boolean z;
        String str12;
        int i5;
        String str13;
        String str14;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        String str15;
        long j6;
        String str16;
        int i6;
        StringBuilder sb;
        String str17;
        String str18;
        int i7;
        String[] strArr;
        int i8;
        String str19;
        long j7;
        int i9;
        String str20;
        String str21;
        boolean z2;
        Object obj2;
        boolean z3;
        long j8;
        Object obj3;
        int i10;
        boolean z4;
        long j9;
        boolean z5;
        JSONObject jSONObject2;
        String str22;
        boolean z6;
        long j10;
        boolean z7;
        String[] strArr2;
        String str23;
        String str24;
        boolean z8;
        boolean z9;
        boolean z10;
        int i11;
        boolean z11;
        String str25;
        Object obj4;
        String str26;
        String str27;
        String str28;
        boolean z12;
        String str29;
        final int i12;
        String str30;
        long j11;
        long j12;
        long j13;
        boolean z13;
        MessageObject messageObject;
        Object obj5;
        boolean z14;
        int i13;
        int i14;
        int i15;
        String str31;
        Object obj6;
        char c2;
        int i16;
        int i17;
        String string;
        int i18;
        String str32;
        int i19;
        String string2;
        int i20;
        String formatPluralString;
        int i21;
        String formatPluralString2;
        String formatPluralString3;
        int i22;
        String formatString;
        int i23;
        int i24;
        String str33;
        int i25;
        int i26;
        int i27;
        int i28;
        String str34;
        int i29;
        str3 = "";
        if (BuildVars.LOGS_ENABLED) {
            str4 = "AmongWinners";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            str5 = "Photos";
            sb2.append(" START PROCESSING");
            FileLog.d(sb2.toString());
        } else {
            str4 = "AmongWinners";
            str5 = "Photos";
        }
        String str35 = null;
        try {
            byte[] decode = Base64.decode(str2, 8);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (SharedConfig.pushAuthKeyId == null) {
                str9 = "MusicFiles";
                SharedConfig.pushAuthKeyId = new byte[8];
                byte[] computeSHA1 = Utilities.computeSHA1(SharedConfig.pushAuthKey);
                str10 = "Files";
                str8 = "call_id";
                obj = "STORY_LIVE";
                System.arraycopy(computeSHA1, computeSHA1.length - 8, SharedConfig.pushAuthKeyId, 0, 8);
            } else {
                str8 = "call_id";
                obj = "STORY_LIVE";
                str9 = "MusicFiles";
                str10 = "Files";
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
            ?? r41 = byteBuffer;
            if (!Utilities.arraysEquals(bArr2, 0, Utilities.computeSHA256(bArr3, 96, 32, r41, 24, byteBuffer.limit()), 8)) {
                onDecryptError();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(String.format(str + " DECRYPT ERROR 3, key = %s", Utilities.bytesToHex(SharedConfig.pushAuthKey)));
                    return;
                }
                return;
            }
            byte[] bArr4 = new byte[nativeByteBuffer.readInt32(true)];
            nativeByteBuffer.readBytes(bArr4, true);
            String str36 = new String(bArr4);
            try {
                jSONObject = new JSONObject(str36);
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    try {
                        if (applicationLoader.consumePush(-1, jSONObject)) {
                            countDownLatch.countDown();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str11 = str36;
                        str7 = str35;
                        str6 = str11;
                        i2 = -1;
                        i = -1;
                        if (i != i2) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        FileLog.e(th);
                    }
                }
                str7 = jSONObject.has("loc_key") ? jSONObject.getString("loc_key") : str3;
            } catch (Throwable th3) {
                str11 = str36;
                th = th3;
            }
            try {
                if (jSONObject.get("custom") instanceof JSONObject) {
                    try {
                        i3 = jSONObject.getJSONObject("custom");
                    } catch (Throwable th4) {
                        th = th4;
                        str35 = str7;
                        str11 = str36;
                        str7 = str35;
                        str6 = str11;
                        i2 = -1;
                        i = -1;
                        if (i != i2) {
                        }
                        if (BuildVars.LOGS_ENABLED) {
                        }
                        FileLog.e(th);
                    }
                } else {
                    i3 = new JSONObject();
                }
                Object obj7 = jSONObject.has("user_id") ? jSONObject.get("user_id") : null;
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
                int i30 = UserConfig.selectedAccount;
                int i31 = 4;
                int i32 = 0;
                while (true) {
                    if (i32 >= i31) {
                        i4 = i30;
                        z = false;
                        break;
                    } else if (UserConfig.getInstance(i32).getClientUserId() == clientUserId) {
                        i4 = i32;
                        z = true;
                        break;
                    } else {
                        i32++;
                        i31 = 4;
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
                        if (!UserConfig.getInstance(i4).isClientActivated()) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d(str + " ACCOUNT NOT ACTIVATED");
                            }
                            countDownLatch.countDown();
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d(str + " " + str7);
                        }
                        int hashCode = str7.hashCode();
                        i5 = -1963663249;
                        if (hashCode != -1963663249) {
                            i5 = -920689527;
                            if (hashCode != -920689527) {
                                i5 = 633004703;
                                if (hashCode != 633004703) {
                                    i5 = 1365673842;
                                    try {
                                        if (hashCode == 1365673842 && str7.equals("GEO_LIVE_PENDING")) {
                                            c = 3;
                                            if (c != 0) {
                                                int i33 = i4;
                                                int i34 = i3.getInt("dc");
                                                String[] split = i3.getString("addr").split(":");
                                                if (split.length != 2) {
                                                    countDownLatch.countDown();
                                                    return;
                                                }
                                                ConnectionsManager.getInstance(i33).applyDatacenterAddress(i34, split[0], Integer.parseInt(split[1]));
                                                ConnectionsManager.getInstance(i33).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 1) {
                                                final int i35 = i4;
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
                                                        PushListenerController.lambda$processRemoteMessage$2(i35, tL_updates);
                                                    }
                                                });
                                                ConnectionsManager.getInstance(i35).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 2) {
                                                final int i36 = i4;
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda3
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        PushListenerController.lambda$processRemoteMessage$3(i36);
                                                    }
                                                });
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            if (c == 3) {
                                                final int i37 = i4;
                                                Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda2
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        PushListenerController.lambda$processRemoteMessage$4(i37);
                                                    }
                                                });
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            int i38 = i4;
                                            if (i3.has("channel_id")) {
                                                try {
                                                    j2 = i3.getLong("channel_id");
                                                    j3 = -j2;
                                                } catch (Throwable th5) {
                                                    i5 = i38;
                                                    th = th5;
                                                    str13 = str36;
                                                    i = i5;
                                                    str14 = str13;
                                                    str6 = str14;
                                                    i2 = -1;
                                                    if (i != i2) {
                                                        ConnectionsManager.onInternalPushReceived(i);
                                                        ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                                                        countDownLatch.countDown();
                                                    } else {
                                                        onDecryptError();
                                                    }
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        FileLog.e("error in loc_key = " + str7 + " json " + str6);
                                                    }
                                                    FileLog.e(th);
                                                }
                                            } else {
                                                j2 = 0;
                                                j3 = 0;
                                            }
                                            try {
                                                if (i3.has("from_id")) {
                                                    j5 = i3.getLong("from_id");
                                                    j4 = j5;
                                                } else {
                                                    j4 = j3;
                                                    j5 = 0;
                                                }
                                                if (i3.has("chat_id")) {
                                                    try {
                                                        j6 = i3.getLong("chat_id");
                                                        str16 = " ";
                                                        str15 = str36;
                                                        j4 = -j6;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        str15 = str36;
                                                        i5 = i38;
                                                        th = th;
                                                        str13 = str15;
                                                        i = i5;
                                                        str14 = str13;
                                                        str6 = str14;
                                                        i2 = -1;
                                                        if (i != i2) {
                                                        }
                                                        if (BuildVars.LOGS_ENABLED) {
                                                        }
                                                        FileLog.e(th);
                                                    }
                                                } else {
                                                    str16 = " ";
                                                    str15 = str36;
                                                    j6 = 0;
                                                }
                                                try {
                                                    if (i3.has("topic_id")) {
                                                        try {
                                                            i6 = i3.getInt("topic_id");
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            i5 = i38;
                                                            th = th;
                                                            str13 = str15;
                                                            i = i5;
                                                            str14 = str13;
                                                            str6 = str14;
                                                            i2 = -1;
                                                            if (i != i2) {
                                                            }
                                                            if (BuildVars.LOGS_ENABLED) {
                                                            }
                                                            FileLog.e(th);
                                                        }
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    sb = new StringBuilder();
                                                    str17 = str15;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    i5 = i38;
                                                    str12 = str15;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                i5 = i38;
                                                str12 = str36;
                                            }
                                            try {
                                                sb.append("recived push notification {");
                                                sb.append(str7);
                                                sb.append("} chatId ");
                                                sb.append(j6);
                                                sb.append(" custom topicId ");
                                                sb.append(i6);
                                                FileLog.d(sb.toString());
                                                if (i3.has("encryption_id")) {
                                                    str18 = "REACT_";
                                                    j4 = DialogObject.makeEncryptedDialogId(i3.getInt("encryption_id"));
                                                } else {
                                                    str18 = "REACT_";
                                                }
                                                boolean z15 = i3.has("schedule") && i3.getInt("schedule") == 1;
                                                long j14 = (j4 == 0 && "ENCRYPTED_MESSAGE".equals(str7)) ? NotificationsController.globalSecretChatId : j4;
                                                if (j14 != 0) {
                                                    boolean z16 = z15;
                                                    if ("CONF_CALL_REQUEST".equals(str7) || "CONF_VIDEOCALL_REQUEST".equals(str7)) {
                                                        i7 = i38;
                                                        long j15 = i3.getLong(str8);
                                                        int i39 = i3.getInt("msg_id");
                                                        if (jSONObject.has("loc_args")) {
                                                            JSONArray jSONArray = jSONObject.getJSONArray("loc_args");
                                                            int length = jSONArray.length();
                                                            strArr = new String[length];
                                                            for (int i40 = 0; i40 < length; i40++) {
                                                                strArr[i40] = jSONArray.getString(i40);
                                                            }
                                                        } else {
                                                            strArr = null;
                                                        }
                                                        if (System.currentTimeMillis() - j < MessagesController.getInstance(i7).callRingTimeout) {
                                                            Context context = ApplicationLoader.applicationContext;
                                                            if (strArr != null && strArr.length > 2) {
                                                                str35 = strArr[2];
                                                            }
                                                            VoIPGroupNotification.request(context, i7, j14, str35, j15, i39, "CONF_VIDEOCALL_REQUEST".equals(str7));
                                                        } else {
                                                            VoIPGroupNotification.hide(ApplicationLoader.applicationContext, i7, i39);
                                                        }
                                                    } else if ("READ_HISTORY".equals(str7)) {
                                                        int i41 = i3.getInt("max_id");
                                                        ArrayList<TLRPC.Update> arrayList = new ArrayList<>();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            FileLog.d(str + " received read notification max_id = " + i41 + " for dialogId = " + j14);
                                                        }
                                                        if (j2 != 0) {
                                                            TLRPC.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TLRPC.TL_updateReadChannelInbox();
                                                            tL_updateReadChannelInbox.channel_id = j2;
                                                            tL_updateReadChannelInbox.max_id = i41;
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
                                                            tL_updateReadHistoryInbox.max_id = i41;
                                                            arrayList.add(tL_updateReadHistoryInbox);
                                                        }
                                                        MessagesController.getInstance(i38).processUpdateArray(arrayList, null, null, false, 0);
                                                    } else if ("READ_STORIES".equals(str7)) {
                                                        NotificationsController.getInstance(i38).processReadStories(j14, i3.getInt("max_id"));
                                                    } else {
                                                        long j16 = j5;
                                                        if ("STORY_DELETED".equals(str7)) {
                                                            NotificationsController.getInstance(i38).processDeleteStory(j14, i3.getInt("story_id"));
                                                        } else {
                                                            long j17 = j6;
                                                            if ("MESSAGE_DELETED".equals(str7)) {
                                                                String[] split2 = i3.getString("messages").split(",");
                                                                LongSparseArray longSparseArray = new LongSparseArray();
                                                                ArrayList<Integer> arrayList2 = new ArrayList<>();
                                                                for (String str37 : split2) {
                                                                    arrayList2.add(Utilities.parseInt((CharSequence) str37));
                                                                }
                                                                longSparseArray.put(-j2, arrayList2);
                                                                NotificationsController.getInstance(i38).removeDeletedMessagesFromNotifications(longSparseArray, false);
                                                                MessagesController.getInstance(i38).deleteMessagesByPush(j14, arrayList2, j2);
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received " + str7 + " for dialogId = " + j14 + " mids = " + TextUtils.join(",", arrayList2));
                                                                }
                                                            } else if ("READ_REACTION".equals(str7)) {
                                                                String[] split3 = i3.getString("messages").split(",");
                                                                LongSparseArray longSparseArray2 = new LongSparseArray();
                                                                ArrayList arrayList3 = new ArrayList();
                                                                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                                                int i42 = 0;
                                                                while (i42 < split3.length) {
                                                                    Integer parseInt = Utilities.parseInt((CharSequence) split3[i42]);
                                                                    String[] strArr3 = split3;
                                                                    int intValue2 = parseInt.intValue();
                                                                    arrayList3.add(parseInt);
                                                                    sparseBooleanArray.put(intValue2, false);
                                                                    i42++;
                                                                    split3 = strArr3;
                                                                }
                                                                longSparseArray2.put(-j2, arrayList3);
                                                                NotificationsController.getInstance(i38).removeDeletedMessagesFromNotifications(longSparseArray2, true);
                                                                MessagesController.getInstance(i38).checkUnreadReactions(j14, i6, sparseBooleanArray);
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    FileLog.d(str + " received " + str7 + " for dialogId = " + j14 + " mids = " + TextUtils.join(",", arrayList3));
                                                                }
                                                            } else if (!TextUtils.isEmpty(str7)) {
                                                                if (i3.has("msg_id")) {
                                                                    i8 = i3.getInt("msg_id");
                                                                } else {
                                                                    i8 = i3.has("story_id") ? i3.getInt("story_id") : 0;
                                                                }
                                                                if (i3.has("random_id")) {
                                                                    str19 = "messages";
                                                                    j7 = Utilities.parseLong(i3.getString("random_id")).longValue();
                                                                } else {
                                                                    str19 = "messages";
                                                                    j7 = 0;
                                                                }
                                                                if (i8 != 0) {
                                                                    str20 = str19;
                                                                    Integer num = MessagesController.getInstance(i38).dialogs_read_inbox_max.get(Long.valueOf(j14));
                                                                    if (num == null) {
                                                                        num = Integer.valueOf(MessagesStorage.getInstance(i38).getDialogReadMax(false, j14));
                                                                        i9 = i6;
                                                                        MessagesController.getInstance(i38).dialogs_read_inbox_max.put(Long.valueOf(j14), num);
                                                                    } else {
                                                                        i9 = i6;
                                                                    }
                                                                    if (i8 > num.intValue()) {
                                                                        str21 = str18;
                                                                        z2 = true;
                                                                    }
                                                                    str21 = str18;
                                                                    z2 = false;
                                                                } else {
                                                                    i9 = i6;
                                                                    str20 = str19;
                                                                    if (j7 != 0) {
                                                                    }
                                                                    str21 = str18;
                                                                    z2 = false;
                                                                }
                                                                int i43 = i8;
                                                                if (!str7.startsWith(str21) && !str7.startsWith("CHAT_REACT_")) {
                                                                    obj2 = "STORY_NOTEXT";
                                                                    z3 = z2;
                                                                    if (str7.equals(obj2)) {
                                                                        j8 = j7;
                                                                        obj3 = obj;
                                                                        if (!str7.equals(obj3) && !str7.equals("STORY_HIDDEN_AUTHOR")) {
                                                                            i10 = -1;
                                                                            if (z3) {
                                                                                try {
                                                                                    Object obj8 = obj3;
                                                                                    int i44 = i10;
                                                                                    Object obj9 = obj2;
                                                                                    long optLong = i3.optLong("chat_from_id", 0L);
                                                                                    long optLong2 = i3.optLong("chat_from_broadcast_id", 0L);
                                                                                    long optLong3 = i3.optLong("chat_from_group_id", 0L);
                                                                                    if (optLong == 0 && optLong3 == 0) {
                                                                                        z4 = false;
                                                                                        if (i3.has("mention") || i3.getInt("mention") == 0) {
                                                                                            j9 = optLong2;
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            j9 = optLong2;
                                                                                            z5 = true;
                                                                                        }
                                                                                        if (i3.has("silent") || i3.getInt("silent") == 0) {
                                                                                            jSONObject2 = jSONObject;
                                                                                            str22 = "loc_args";
                                                                                            z6 = false;
                                                                                        } else {
                                                                                            jSONObject2 = jSONObject;
                                                                                            str22 = "loc_args";
                                                                                            z6 = true;
                                                                                        }
                                                                                        if (jSONObject2.has(str22)) {
                                                                                            j10 = optLong;
                                                                                            z7 = z5;
                                                                                            strArr2 = null;
                                                                                        } else {
                                                                                            JSONArray jSONArray2 = jSONObject2.getJSONArray(str22);
                                                                                            int length2 = jSONArray2.length();
                                                                                            z7 = z5;
                                                                                            strArr2 = new String[length2];
                                                                                            j10 = optLong;
                                                                                            for (int i45 = 0; i45 < length2; i45++) {
                                                                                                strArr2[i45] = jSONArray2.getString(i45);
                                                                                            }
                                                                                        }
                                                                                        if (strArr2 != null && strArr2.length > 0) {
                                                                                            str23 = strArr2[0];
                                                                                            boolean has = i3.has("edit_date");
                                                                                            if (!str7.startsWith("CHAT_") && strArr2 != null && strArr2.length > 0) {
                                                                                                if (UserObject.isReplyUser(j14)) {
                                                                                                    str23 = str23 + " @ " + strArr2[1];
                                                                                                    str24 = null;
                                                                                                    z8 = false;
                                                                                                    z9 = false;
                                                                                                    z10 = false;
                                                                                                } else {
                                                                                                    z10 = j2 != 0;
                                                                                                    z8 = false;
                                                                                                    z9 = false;
                                                                                                    str24 = str23;
                                                                                                    str23 = strArr2[1];
                                                                                                }
                                                                                            } else if (str7.startsWith("PINNED_")) {
                                                                                                if (str7.startsWith("CHANNEL_")) {
                                                                                                    str24 = null;
                                                                                                    z8 = false;
                                                                                                    z9 = true;
                                                                                                    z10 = false;
                                                                                                }
                                                                                                str24 = null;
                                                                                                z8 = false;
                                                                                                z9 = false;
                                                                                                z10 = false;
                                                                                            } else {
                                                                                                z10 = j2 != 0;
                                                                                                str24 = null;
                                                                                                z8 = true;
                                                                                                z9 = false;
                                                                                            }
                                                                                            try {
                                                                                                if (str7.startsWith(str21)) {
                                                                                                    i11 = i38;
                                                                                                    z11 = has;
                                                                                                    str25 = str23;
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    str26 = str21;
                                                                                                    str27 = "CHAT_REACT_";
                                                                                                } else {
                                                                                                    str25 = str23;
                                                                                                    if (!str7.startsWith("CHAT_REACT_")) {
                                                                                                        switch (str7.hashCode()) {
                                                                                                            case -2104766184:
                                                                                                                str28 = str24;
                                                                                                                obj6 = obj9;
                                                                                                                if (str7.equals(obj6)) {
                                                                                                                    c2 = 0;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2100047043:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GAME_SCORE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '&';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2091498420:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '=';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2053872415:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_CREATED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'd';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2039746363:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STICKER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 28;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -2023218804:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'I';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979538588:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_DOC")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ':';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979536003:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'C';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1979535888:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GIF")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'E';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1969004705:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_ADD_MEMBER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'h';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1946699248:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_JOINED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'q';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1891964556:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ']';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1833440864:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'N';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1717283471:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_REQ_JOINED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'r';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1646640058:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_VOICECHAT_START")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'i';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1633328296:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_PAID_MEDIA")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 16;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1528047021:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGES")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'x';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1507149394:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_RECURRING_PAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 5;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1493579426:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_AUDIO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 29;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1482481933:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_MUTED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 150;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1480102982:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_PHOTO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 21;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1478041834:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_ROUND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 26;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1476974979:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STORY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 19;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1474543101:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_VIDEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 23;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1465695932:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("ENCRYPTION_ACCEPT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 148;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1428026623:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CONF_CALL_MISSED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 141;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1374906292:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("ENCRYPTED_MESSAGE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 140;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1372940586:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_RETURNED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'p';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1264245338:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_INVOICE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 138;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236154001:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_DOCS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'K';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236086700:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_FWDS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'G';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1236077786:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GAME")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'F';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235796237:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_POLL")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '?';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235760759:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '>';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235686303:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_TEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 7;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1235677318:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_TODO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '@';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1198046100:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_VIDEO_SECRET")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 24;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1124254527:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_CONTACT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'X';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1085137927:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GAME")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 136;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084856378:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_POLL")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 132;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084820900:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_QUIZ")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 131;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084746444:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_TEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'y';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -1084737459:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_TODO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 133;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -947756761:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'A';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -891852842:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("STORY_HIDDEN_AUTHOR")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 2;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -819729482:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_STICKER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 127;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -772141857:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PHONE_CALL_REQUEST")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 149;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -706345256:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\t';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -638310039:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_STICKER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ';';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -590403924:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GAME_SCORE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 137;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589196239:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_DOC")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '~';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589193654:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 134;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -589193539:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GIF")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 139;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -455004278:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_WALLPAPER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 4;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -440169325:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("AUTH_UNKNOWN")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 144;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -412748110:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_DELETE_YOU")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'n';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -346082433:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'B';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -242433887:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_SAME_WALLPAPER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 3;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -228518075:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GEOLIVE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '#';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -213586509:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("ENCRYPTION_REQUEST")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 147;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -115582002:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_INVOICE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'c';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -112621464:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CONTACT_JOINED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 143;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -108522133:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("AUTH_REGION")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 145;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -107572034:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_SCREENSHOT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 25;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -77243824:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_SUGGEST_BIRTHDAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '1';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -40534265:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_DELETE_MEMBER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'm';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case -35560251:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 14;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 52369421:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("REACT_TEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 142;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 65254746:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_ADD_YOU")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'e';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 120441350:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GIVEAWAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 130;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 141040782:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_LEFT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'o';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 191667248:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 15;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 202550149:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_VOICECHAT_INVITE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'j';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309993049:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_DOC")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'U';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309995634:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '^';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 309995749:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GIF")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '`';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 320532812:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGES")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '2';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 328933854:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_STICKER")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'V';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 331340546:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '<';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 342406591:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_VOICECHAT_END")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'k';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 344816990:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '7';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 346878138:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_ROUND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '9';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 347944993:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_STORY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '6';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 350376871:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '8';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 510462069:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GIFTCODE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '.';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 608430149:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'l';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 615714517:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_PHOTO_SECRET")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 22;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 702966260:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\f';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 715508879:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_AUDIO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 128;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 728985323:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_PHOTO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '{';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 731046471:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_ROUND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '}';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 734545204:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_VIDEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '|';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 802032552:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_CONTACT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 30;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 860688476:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\\';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 901537717:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '4';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 954623703:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GIVEAWAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '/';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 977076186:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STARGIFT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\b';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 991498806:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_GEOLIVE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 135;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1007364121:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\'';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019850010:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_DOCS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'w';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019917311:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_FWDS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 's';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1019926225:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GAME")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'a';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020207774:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_POLL")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'Z';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020243252:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_QUIZ")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'Y';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020317708:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_TEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'O';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1020326693:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_TODO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '[';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1054583304:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STORY_MENTION")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 20;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060282259:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_DOCS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '-';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060349560:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_FWDS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ')';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060358474:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GAME")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '%';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060640023:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_POLL")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ' ';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060675501:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_QUIZ")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 31;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060749957:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_TEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 6;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1060758942:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_TODO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '!';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1073049781:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_NOTEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'z';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1078101399:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_TITLE_EDITED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'f';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1110103437:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_NOTEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'P';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1144183001:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '0';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1151995881:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_PAID_MEDIA")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\r';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1160762272:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_PHOTOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 't';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1172918249:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'D';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1234591620:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'b';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281128640:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_DOC")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 27;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281131225:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\"';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1281131340:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_GIF")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '$';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1310789062:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_NOTEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 18;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1333118583:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_VIDEOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'u';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1361447897:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_PHOTOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '*';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1369266398:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'M';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1420317335:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '\n';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1449476787:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '3';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1498266155:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PHONE_CALL_MISSED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 151;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1533804208:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_VIDEOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '+';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1540131626:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_PLAYLIST")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = ',';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1547988151:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_AUDIO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'W';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1561464595:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_PHOTO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'R';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1563525743:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_ROUND")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'T';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1564592598:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_STORY")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'Q';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1567024476:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_VIDEO")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'S';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1810705077:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_INVOICE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '(';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1815177512:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGES")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'L';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1837240696:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_REACT_PAID_MEDIA")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 17;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1954774321:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'v';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 1963241394:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("LOCKED_MESSAGE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 146;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2008915478:
                                                                                                                str28 = str24;
                                                                                                                boolean equals = str7.equals(obj8);
                                                                                                                obj8 = obj8;
                                                                                                                obj6 = obj9;
                                                                                                                if (equals) {
                                                                                                                    c2 = 1;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2014789757:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_PHOTO_EDITED")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'g';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2022049433:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("PINNED_CONTACT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 129;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2034984710:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'J';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2048733346:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '5';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2099392181:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 'H';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2103150375:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = 11;
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            case 2140162142:
                                                                                                                str28 = str24;
                                                                                                                if (str7.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                                                                                    obj6 = obj9;
                                                                                                                    c2 = '_';
                                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                    break;
                                                                                                                }
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                            default:
                                                                                                                str28 = str24;
                                                                                                                obj6 = obj9;
                                                                                                                obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                                c2 = 65535;
                                                                                                                break;
                                                                                                        }
                                                                                                        obj9 = obj6;
                                                                                                        str27 = "CHAT_REACT_";
                                                                                                        str26 = str21;
                                                                                                        try {
                                                                                                            switch (c2) {
                                                                                                                case 0:
                                                                                                                    i16 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.getString(R.string.StoryNotificationSingle);
                                                                                                                    i12 = i44;
                                                                                                                    str29 = str25;
                                                                                                                    i13 = i16;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                                                        j11 = j9;
                                                                                                                        sb3.append(str);
                                                                                                                        sb3.append(" received message notification ");
                                                                                                                        sb3.append(str7);
                                                                                                                        sb3.append(" for dialogId = ");
                                                                                                                        sb3.append(j14);
                                                                                                                        sb3.append(" mid = ");
                                                                                                                        sb3.append(i12);
                                                                                                                        FileLog.d(sb3.toString());
                                                                                                                    } else {
                                                                                                                        j11 = j9;
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                        i7 = i3;
                                                                                                                        break;
                                                                                                                    } else {
                                                                                                                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                                                                                        if (str7.startsWith("REACT_STORY") && i12 > 0) {
                                                                                                                            i12 = -i12;
                                                                                                                        }
                                                                                                                        tL_message.id = i12;
                                                                                                                        tL_message.random_id = j8;
                                                                                                                        tL_message.message = str35 != null ? str35 : str30;
                                                                                                                        tL_message.date = (int) (j / 1000);
                                                                                                                        if (z8) {
                                                                                                                            tL_message.action = new TLRPC.TL_messageActionPinMessage();
                                                                                                                        }
                                                                                                                        if (z10) {
                                                                                                                            tL_message.flags |= TLObject.FLAG_31;
                                                                                                                        }
                                                                                                                        tL_message.dialog_id = j14;
                                                                                                                        if (j2 != 0) {
                                                                                                                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                                                                                            tL_message.peer_id = tL_peerChannel;
                                                                                                                            tL_peerChannel.channel_id = j2;
                                                                                                                            j13 = j14;
                                                                                                                            j12 = j17;
                                                                                                                        } else if (j17 != 0) {
                                                                                                                            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                                                                                            tL_message.peer_id = tL_peerChat2;
                                                                                                                            j12 = j17;
                                                                                                                            tL_peerChat2.chat_id = j12;
                                                                                                                            j13 = j14;
                                                                                                                        } else {
                                                                                                                            j12 = j17;
                                                                                                                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                                                                                            tL_message.peer_id = tL_peerUser2;
                                                                                                                            j13 = j14;
                                                                                                                            tL_peerUser2.user_id = j16;
                                                                                                                        }
                                                                                                                        tL_message.flags |= 256;
                                                                                                                        if (optLong3 != 0) {
                                                                                                                            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                                                                                                                            tL_message.from_id = tL_peerChat3;
                                                                                                                            tL_peerChat3.chat_id = j12;
                                                                                                                        } else if (j11 != 0) {
                                                                                                                            TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                                                                                            tL_message.from_id = tL_peerChannel2;
                                                                                                                            tL_peerChannel2.channel_id = j11;
                                                                                                                        } else if (optLong != 0) {
                                                                                                                            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                                                                                            tL_message.from_id = tL_peerUser3;
                                                                                                                            tL_peerUser3.user_id = j10;
                                                                                                                        } else {
                                                                                                                            tL_message.from_id = tL_message.peer_id;
                                                                                                                        }
                                                                                                                        if (!z7 && !z8) {
                                                                                                                            z13 = false;
                                                                                                                            tL_message.mentioned = z13;
                                                                                                                            tL_message.silent = z6;
                                                                                                                            tL_message.from_scheduled = z16;
                                                                                                                            messageObject = new MessageObject(i3, tL_message, str30, str29, str28, z12, z9, z10, z11);
                                                                                                                            if (i9 != 0) {
                                                                                                                                messageObject.messageOwner.reply_to = new TLRPC.TL_messageReplyHeader();
                                                                                                                                TLRPC.MessageReplyHeader messageReplyHeader = messageObject.messageOwner.reply_to;
                                                                                                                                messageReplyHeader.forum_topic = true;
                                                                                                                                messageReplyHeader.reply_to_top_id = i9;
                                                                                                                            }
                                                                                                                            boolean startsWith = str7.startsWith("REACT_STORY");
                                                                                                                            messageObject.isStoryReactionPush = startsWith;
                                                                                                                            messageObject.isReactionPush = startsWith && (str7.startsWith(str26) || str7.startsWith(str27));
                                                                                                                            if (str7.equals(obj9)) {
                                                                                                                                obj5 = obj4;
                                                                                                                                if (!str7.equals(obj5)) {
                                                                                                                                    z14 = false;
                                                                                                                                    messageObject.isStoryPush = z14;
                                                                                                                                    messageObject.isLiveStoryPush = str7.equals(obj8);
                                                                                                                                    messageObject.isStoryMentionPush = str7.equals("MESSAGE_STORY_MENTION");
                                                                                                                                    messageObject.isStoryPushHidden = str7.equals(obj5);
                                                                                                                                    ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                                                                                                                                    arrayList4.add(messageObject);
                                                                                                                                    FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                                    if (!messageObject.isStoryReactionPush && !messageObject.isReactionPush && !messageObject.isStoryMentionPush && !messageObject.isStoryPush && !messageObject.isStoryPushHidden && !z7 && !z8 && i12 > 0) {
                                                                                                                                        final long j18 = j13;
                                                                                                                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                            @Override // java.lang.Runnable
                                                                                                                                            public final void run() {
                                                                                                                                                PushListenerController.lambda$processRemoteMessage$5(i3, j18, i12);
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                    }
                                                                                                                                    NotificationsController.getInstance(i3).processNewMessages(arrayList4, true, true, countDownLatch);
                                                                                                                                    i7 = i3;
                                                                                                                                    ConnectionsManager.onInternalPushReceived(i7);
                                                                                                                                    ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                obj5 = obj4;
                                                                                                                            }
                                                                                                                            z14 = true;
                                                                                                                            messageObject.isStoryPush = z14;
                                                                                                                            messageObject.isLiveStoryPush = str7.equals(obj8);
                                                                                                                            messageObject.isStoryMentionPush = str7.equals("MESSAGE_STORY_MENTION");
                                                                                                                            messageObject.isStoryPushHidden = str7.equals(obj5);
                                                                                                                            ArrayList<MessageObject> arrayList42 = new ArrayList<>();
                                                                                                                            arrayList42.add(messageObject);
                                                                                                                            FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                            if (!messageObject.isStoryReactionPush) {
                                                                                                                                final long j182 = j13;
                                                                                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.PushListenerController$$ExternalSyntheticLambda1
                                                                                                                                    @Override // java.lang.Runnable
                                                                                                                                    public final void run() {
                                                                                                                                        PushListenerController.lambda$processRemoteMessage$5(i3, j182, i12);
                                                                                                                                    }
                                                                                                                                });
                                                                                                                            }
                                                                                                                            NotificationsController.getInstance(i3).processNewMessages(arrayList42, true, true, countDownLatch);
                                                                                                                            i7 = i3;
                                                                                                                            ConnectionsManager.onInternalPushReceived(i7);
                                                                                                                            ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                                                                                                                        }
                                                                                                                        z13 = true;
                                                                                                                        tL_message.mentioned = z13;
                                                                                                                        tL_message.silent = z6;
                                                                                                                        tL_message.from_scheduled = z16;
                                                                                                                        messageObject = new MessageObject(i3, tL_message, str30, str29, str28, z12, z9, z10, z11);
                                                                                                                        if (i9 != 0) {
                                                                                                                        }
                                                                                                                        boolean startsWith2 = str7.startsWith("REACT_STORY");
                                                                                                                        messageObject.isStoryReactionPush = startsWith2;
                                                                                                                        messageObject.isReactionPush = startsWith2 && (str7.startsWith(str26) || str7.startsWith(str27));
                                                                                                                        if (str7.equals(obj9)) {
                                                                                                                        }
                                                                                                                        z14 = true;
                                                                                                                        messageObject.isStoryPush = z14;
                                                                                                                        messageObject.isLiveStoryPush = str7.equals(obj8);
                                                                                                                        messageObject.isStoryMentionPush = str7.equals("MESSAGE_STORY_MENTION");
                                                                                                                        messageObject.isStoryPushHidden = str7.equals(obj5);
                                                                                                                        ArrayList<MessageObject> arrayList422 = new ArrayList<>();
                                                                                                                        arrayList422.add(messageObject);
                                                                                                                        FileLog.d("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                                                                        if (!messageObject.isStoryReactionPush) {
                                                                                                                        }
                                                                                                                        NotificationsController.getInstance(i3).processNewMessages(arrayList422, true, true, countDownLatch);
                                                                                                                        i7 = i3;
                                                                                                                        ConnectionsManager.onInternalPushReceived(i7);
                                                                                                                        ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                                                                                                                    }
                                                                                                                case 1:
                                                                                                                    i16 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.getString(R.string.StoryLiveNotificationSingle);
                                                                                                                    i12 = i44;
                                                                                                                    str29 = str25;
                                                                                                                    i13 = i16;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    i16 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatPluralString("StoryNotificationHidden", 1, new Object[0]);
                                                                                                                    i12 = i44;
                                                                                                                    str29 = str25;
                                                                                                                    i13 = i16;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ActionSetSameWallpaperForThisChat", R.string.ActionSetSameWallpaperForThisChat, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.WallpaperSameNotification);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ActionSetWallpaperForThisChat", R.string.ActionSetWallpaperForThisChat, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.WallpaperNotification);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 5:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageRecurringPay", R.string.NotificationMessageRecurringPay, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 6:
                                                                                                                case 7:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageText", R.string.NotificationMessageText, strArr2[0], strArr2[1]);
                                                                                                                    string = strArr2[1];
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\b':
                                                                                                                    i18 = i38;
                                                                                                                    z11 = has;
                                                                                                                    String str38 = strArr2[0];
                                                                                                                    str30 = LocaleController.formatPluralStringComma("NotificationMessageStarGift", Integer.parseInt(strArr2[1]), strArr2[0]);
                                                                                                                    str35 = LocaleController.formatPluralStringComma("Gift2Notification", Integer.parseInt(strArr2[1]));
                                                                                                                    str32 = str38;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\t':
                                                                                                                    i19 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str32 = strArr2[0];
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageUniqueStarGift, str32);
                                                                                                                    string2 = LocaleController.getString(R.string.Gift2UniqueNotification);
                                                                                                                    str35 = string2;
                                                                                                                    i18 = i19;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\n':
                                                                                                                    i19 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str32 = strArr2[0];
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUpgrade, str32);
                                                                                                                    string2 = LocaleController.getString(R.string.Gift2UniqueUpgradeNotification);
                                                                                                                    str35 = string2;
                                                                                                                    i18 = i19;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 11:
                                                                                                                    i19 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str32 = strArr2[0];
                                                                                                                    str30 = LocaleController.formatPluralStringComma("NotificationMessageUniqueStarGiftPrepaidUpgrade", Integer.parseInt(strArr2[1]), strArr2[0]);
                                                                                                                    string2 = LocaleController.getString(R.string.Gift2UniquePrepaidUpgradeNotification);
                                                                                                                    str35 = string2;
                                                                                                                    i18 = i19;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\f':
                                                                                                                    i19 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str32 = strArr2[0];
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageUniqueStarGiftUnpackUpgrade, str32);
                                                                                                                    string2 = LocaleController.getString(R.string.Gift2UniqueUnpackUpgradeNotification);
                                                                                                                    str35 = string2;
                                                                                                                    i18 = i19;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\r':
                                                                                                                    i20 = i38;
                                                                                                                    z11 = has;
                                                                                                                    int parseInt2 = Integer.parseInt(strArr2[1]);
                                                                                                                    str30 = LocaleController.formatPluralString("NotificationMessagePaidMedia", parseInt2, strArr2[0]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt2, new Object[0]);
                                                                                                                    str35 = formatPluralString;
                                                                                                                    i14 = i20;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 14:
                                                                                                                    i20 = i38;
                                                                                                                    z11 = has;
                                                                                                                    int parseInt3 = Integer.parseInt(strArr2[1]);
                                                                                                                    str30 = LocaleController.formatPluralString("NotificationChannelMessagePaidMedia", parseInt3, strArr2[0]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt3, new Object[0]);
                                                                                                                    str35 = formatPluralString;
                                                                                                                    i14 = i20;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 15:
                                                                                                                    i20 = i38;
                                                                                                                    z11 = has;
                                                                                                                    int parseInt4 = Integer.parseInt(strArr2[2]);
                                                                                                                    str30 = LocaleController.formatPluralString("NotificationChatMessagePaidMedia", parseInt4, strArr2[0], strArr2[1]);
                                                                                                                    formatPluralString = LocaleController.formatPluralString("NotificationPaidMedia", parseInt4, new Object[0]);
                                                                                                                    str35 = formatPluralString;
                                                                                                                    i14 = i20;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 16:
                                                                                                                    i21 = i38;
                                                                                                                    z11 = has;
                                                                                                                    int parseInt5 = Integer.parseInt(strArr2[1]);
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr2[0]);
                                                                                                                    formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt5, strArr2[0]);
                                                                                                                    str35 = formatPluralString3;
                                                                                                                    str30 = formatPluralString2;
                                                                                                                    i14 = i21;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 17:
                                                                                                                    i21 = i38;
                                                                                                                    z11 = has;
                                                                                                                    int parseInt6 = Integer.parseInt(strArr2[1]);
                                                                                                                    formatPluralString2 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr2[0]);
                                                                                                                    formatPluralString3 = LocaleController.formatPluralString("NotificationPinnedPaidMedia", parseInt6, strArr2[0]);
                                                                                                                    str35 = formatPluralString3;
                                                                                                                    str30 = formatPluralString2;
                                                                                                                    i14 = i21;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 18:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageNoText", R.string.NotificationMessageNoText, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.Message);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 19:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationStory", R.string.NotificationStory, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.Story);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 20:
                                                                                                                    i14 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.getString(R.string.StoryNotificationMention);
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 21:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessagePhoto", R.string.NotificationMessagePhoto, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 22:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageSDPhoto", R.string.NotificationMessageSDPhoto, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachDestructingPhoto);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 23:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageVideo", R.string.NotificationMessageVideo, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 24:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageSDVideo", R.string.NotificationMessageSDVideo, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachDestructingVideo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 25:
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.getString(R.string.ActionTakeScreenshoot).replace("un1", strArr2[0]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 26:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageRound", R.string.NotificationMessageRound, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 27:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageDocument", R.string.NotificationMessageDocument, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 28:
                                                                                                                    int i46 = i38;
                                                                                                                    z11 = has;
                                                                                                                    String str39 = str16;
                                                                                                                    if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        str30 = LocaleController.formatString("NotificationMessageStickerEmoji", R.string.NotificationMessageStickerEmoji, strArr2[0], strArr2[1]);
                                                                                                                        string = strArr2[1] + str39 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i46;
                                                                                                                    } else {
                                                                                                                        str30 = LocaleController.formatString("NotificationMessageSticker", R.string.NotificationMessageSticker, strArr2[0]);
                                                                                                                        string = LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i46;
                                                                                                                    }
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 29:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageAudio, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 30:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageContact2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 31:
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageQuiz2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.QuizPoll);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ' ':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessagePoll2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.Poll);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '!':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageTodo2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.Todo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\"':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageMap", R.string.NotificationMessageMap, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '#':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageLiveLocation", R.string.NotificationMessageLiveLocation, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '$':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGif", R.string.NotificationMessageGif, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '%':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '&':
                                                                                                                case '\'':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationMessageGameScored", R.string.NotificationMessageGameScored, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '(':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageInvoice", R.string.NotificationMessageInvoice, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ')':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageForwardFew", R.string.NotificationMessageForwardFew, strArr2[0], LocaleController.formatPluralString(str20, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '*':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '+':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ',':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '-':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageFew", R.string.NotificationMessageFew, strArr2[0], LocaleController.formatPluralString(str10, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '.':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGiftCode", R.string.NotificationMessageGiftCode, strArr2[0], LocaleController.formatPluralString("Months", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '/':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("NotificationMessageGiveaway", R.string.NotificationMessageGiveaway, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '0':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    String str40 = str4;
                                                                                                                    try {
                                                                                                                        i23 = Integer.parseInt(strArr2[1]);
                                                                                                                    } catch (Exception unused) {
                                                                                                                        i23 = 1;
                                                                                                                    }
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageStarsGiveaway2, strArr2[0], LocaleController.formatPluralString(str40, i23, new Object[0]), strArr2[2]);
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '1':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString(R.string.NotificationMessageSuggestBirthday, strArr2[0]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '2':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString(R.string.NotificationMessageAlbum, strArr2[0]);
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '3':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageChannelGiveaway", R.string.NotificationMessageChannelGiveaway, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '4':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    String str41 = str4;
                                                                                                                    try {
                                                                                                                        i24 = Integer.parseInt(strArr2[1]);
                                                                                                                    } catch (Exception unused2) {
                                                                                                                        i24 = 1;
                                                                                                                    }
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageChannelStarsGiveaway2, strArr2[0], LocaleController.formatPluralString(str41, i24, new Object[0]), strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '5':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageNoText", R.string.ChannelMessageNoText, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.Message);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '6':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationChannelStory", R.string.NotificationChannelStory, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.Story);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '7':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessagePhoto", R.string.ChannelMessagePhoto, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '8':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageVideo", R.string.ChannelMessageVideo, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '9':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageRound", R.string.ChannelMessageRound, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ':':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageDocument", R.string.ChannelMessageDocument, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ';':
                                                                                                                    int i47 = i38;
                                                                                                                    z11 = has;
                                                                                                                    String str42 = str16;
                                                                                                                    if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        str30 = LocaleController.formatString("ChannelMessageStickerEmoji", R.string.ChannelMessageStickerEmoji, strArr2[0], strArr2[1]);
                                                                                                                        string = strArr2[1] + str42 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i47;
                                                                                                                    } else {
                                                                                                                        str30 = LocaleController.formatString("ChannelMessageSticker", R.string.ChannelMessageSticker, strArr2[0]);
                                                                                                                        string = LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i47;
                                                                                                                    }
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '<':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageAudio", R.string.ChannelMessageAudio, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '=':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageContact2", R.string.ChannelMessageContact2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '>':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageQuiz2", R.string.ChannelMessageQuiz2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.QuizPoll);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '?':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.ChannelMessagePoll2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.Poll);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '@':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.ChannelMessageTodo2, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.Todo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'A':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString(R.string.ChannelMessageTodoDone2, strArr2[0], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'B':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString(R.string.ChannelMessageTodoAppend2, strArr2[0], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'C':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageMap", R.string.ChannelMessageMap, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'D':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageLiveLocation", R.string.ChannelMessageLiveLocation, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'E':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("ChannelMessageGIF", R.string.ChannelMessageGIF, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'F':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGame", R.string.NotificationMessageGame, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'G':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString("ForwardedMessageCount", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]).toLowerCase());
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'H':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'I':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'J':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'K':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageFew", R.string.ChannelMessageFew, strArr2[0], LocaleController.formatPluralString(str10, Utilities.parseInt((CharSequence) strArr2[1]).intValue(), new Object[0]));
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'L':
                                                                                                                    i22 = i38;
                                                                                                                    z11 = has;
                                                                                                                    formatString = LocaleController.formatString("ChannelMessageAlbum", R.string.ChannelMessageAlbum, strArr2[0]);
                                                                                                                    str33 = formatString;
                                                                                                                    i28 = i22;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'M':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageChatGiveaway", R.string.NotificationMessageChatGiveaway, strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                                                                    string = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'N':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    try {
                                                                                                                        i25 = Integer.parseInt(strArr2[2]);
                                                                                                                    } catch (Exception unused3) {
                                                                                                                        i25 = 1;
                                                                                                                    }
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageChatStarsGiveaway2, strArr2[0], strArr2[1], LocaleController.formatPluralString(str4, i25, new Object[0]), strArr2[3]);
                                                                                                                    string = LocaleController.getString(R.string.BoostingGiveaway);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'O':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupText", R.string.NotificationMessageGroupText, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = strArr2[2];
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'P':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupNoText", R.string.NotificationMessageGroupNoText, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.Message);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Q':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationChatStory", R.string.NotificationChatStory, strArr2[0]);
                                                                                                                    string = LocaleController.getString(R.string.Story);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'R':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupPhoto", R.string.NotificationMessageGroupPhoto, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachPhoto);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'S':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupVideo", R.string.NotificationMessageGroupVideo, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'T':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupRound", R.string.NotificationMessageGroupRound, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachRound);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'U':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupDocument", R.string.NotificationMessageGroupDocument, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachDocument);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'V':
                                                                                                                    int i48 = i38;
                                                                                                                    z11 = has;
                                                                                                                    if (strArr2.length > 2 && !TextUtils.isEmpty(strArr2[2])) {
                                                                                                                        str30 = LocaleController.formatString("NotificationMessageGroupStickerEmoji", R.string.NotificationMessageGroupStickerEmoji, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                        string = strArr2[2] + str16 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i48;
                                                                                                                    } else {
                                                                                                                        String str43 = str16;
                                                                                                                        str30 = LocaleController.formatString("NotificationMessageGroupSticker", R.string.NotificationMessageGroupSticker, strArr2[0], strArr2[1]);
                                                                                                                        string = strArr2[1] + str43 + LocaleController.getString(R.string.AttachSticker);
                                                                                                                        i17 = i48;
                                                                                                                    }
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'W':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupAudio", R.string.NotificationMessageGroupAudio, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachAudio);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'X':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupContact2", R.string.NotificationMessageGroupContact2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.AttachContact);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Y':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupQuiz2", R.string.NotificationMessageGroupQuiz2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.PollQuiz);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'Z':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageGroupPoll2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.Poll);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '[':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString(R.string.NotificationMessageGroupTodo2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.Todo);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '\\':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString(R.string.NotificationMessageGroupTodoDone2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case ']':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString(R.string.NotificationMessageGroupTodoAppend2, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '^':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupMap", R.string.NotificationMessageGroupMap, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '_':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupLiveLocation", R.string.NotificationMessageGroupLiveLocation, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachLiveLocation);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '`':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupGif", R.string.NotificationMessageGroupGif, strArr2[0], strArr2[1]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGif);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'a':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupGame", R.string.NotificationMessageGroupGame, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.AttachGame);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'b':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationMessageGroupGameScored", R.string.NotificationMessageGroupGameScored, strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'c':
                                                                                                                    i17 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = LocaleController.formatString("NotificationMessageGroupInvoice", R.string.NotificationMessageGroupInvoice, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    string = LocaleController.getString(R.string.PaymentInvoice);
                                                                                                                    str35 = string;
                                                                                                                    str32 = str28;
                                                                                                                    i18 = i17;
                                                                                                                    str28 = str32;
                                                                                                                    i14 = i18;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'd':
                                                                                                                case 'e':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationInvitedToGroup", R.string.NotificationInvitedToGroup, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'f':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationEditedGroupName", R.string.NotificationEditedGroupName, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'g':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationEditedGroupPhoto", R.string.NotificationEditedGroupPhoto, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'h':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupAddMember", R.string.NotificationGroupAddMember, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'i':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupCreatedCall", R.string.NotificationGroupCreatedCall, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'j':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupInvitedToCall", R.string.NotificationGroupInvitedToCall, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'k':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupEndedCall", R.string.NotificationGroupEndedCall, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'l':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupInvitedYouToCall", R.string.NotificationGroupInvitedYouToCall, strArr2[0], strArr2[1]);
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'm':
                                                                                                                    i15 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupKickMember", R.string.NotificationGroupKickMember, strArr2[0], strArr2[1], strArr2.length > 2 ? strArr2[2] : "");
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'n':
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupKickYou", R.string.NotificationGroupKickYou, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'o':
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupLeftMember", R.string.NotificationGroupLeftMember, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'p':
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupAddSelf", R.string.NotificationGroupAddSelf, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'q':
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString("NotificationGroupAddSelfMega", R.string.NotificationGroupAddSelfMega, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'r':
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString("UserAcceptedToGroupPushWithGroup", R.string.UserAcceptedToGroupPushWithGroup, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 's':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupForwardedFew", R.string.NotificationGroupForwardedFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str20, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 't':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str5, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'u':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString("Videos", Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'v':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str9, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'w':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupFew", R.string.NotificationGroupFew, strArr2[0], strArr2[1], LocaleController.formatPluralString(str10, Utilities.parseInt((CharSequence) strArr2[2]).intValue(), new Object[0]));
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'x':
                                                                                                                    i27 = i38;
                                                                                                                    str33 = LocaleController.formatString("NotificationGroupAlbum", R.string.NotificationGroupAlbum, strArr2[0], strArr2[1]);
                                                                                                                    z11 = has;
                                                                                                                    i28 = i27;
                                                                                                                    str34 = str25;
                                                                                                                    i29 = i28;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'y':
                                                                                                                    int i49 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedTextUser", R.string.NotificationActionPinnedTextUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i49;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedText", R.string.NotificationActionPinnedText, strArr2[0], strArr2[1], strArr2[2]);
                                                                                                                        i26 = i49;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedTextChannel", R.string.NotificationActionPinnedTextChannel, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i49;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 'z':
                                                                                                                    int i50 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedNoTextUser", R.string.NotificationActionPinnedNoTextUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i50;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedNoText", R.string.NotificationActionPinnedNoText, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i50;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedNoTextChannel", R.string.NotificationActionPinnedNoTextChannel, strArr2[0]);
                                                                                                                        i26 = i50;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '{':
                                                                                                                    int i51 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedPhotoUser", R.string.NotificationActionPinnedPhotoUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i51;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedPhoto", R.string.NotificationActionPinnedPhoto, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i51;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedPhotoChannel", R.string.NotificationActionPinnedPhotoChannel, strArr2[0]);
                                                                                                                        i26 = i51;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '|':
                                                                                                                    int i52 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVideoUser", R.string.NotificationActionPinnedVideoUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i52;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVideo", R.string.NotificationActionPinnedVideo, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i52;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVideoChannel", R.string.NotificationActionPinnedVideoChannel, strArr2[0]);
                                                                                                                        i26 = i52;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '}':
                                                                                                                    int i53 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedRoundUser", R.string.NotificationActionPinnedRoundUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i53;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedRound", R.string.NotificationActionPinnedRound, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i53;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedRoundChannel", R.string.NotificationActionPinnedRoundChannel, strArr2[0]);
                                                                                                                        i26 = i53;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case '~':
                                                                                                                    int i54 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedFileUser", R.string.NotificationActionPinnedFileUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i54;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedFile", R.string.NotificationActionPinnedFile, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i54;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedFileChannel", R.string.NotificationActionPinnedFileChannel, strArr2[0]);
                                                                                                                        i26 = i54;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.messageTranslated /* 127 */:
                                                                                                                    int i55 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                            str31 = LocaleController.formatString("NotificationActionPinnedStickerEmojiUser", R.string.NotificationActionPinnedStickerEmojiUser, strArr2[0], strArr2[1]);
                                                                                                                            i26 = i55;
                                                                                                                        } else {
                                                                                                                            str31 = LocaleController.formatString("NotificationActionPinnedStickerUser", R.string.NotificationActionPinnedStickerUser, strArr2[0]);
                                                                                                                            i26 = i55;
                                                                                                                        }
                                                                                                                    } else if (z4) {
                                                                                                                        if (strArr2.length > 2 && !TextUtils.isEmpty(strArr2[2])) {
                                                                                                                            str31 = LocaleController.formatString("NotificationActionPinnedStickerEmoji", R.string.NotificationActionPinnedStickerEmoji, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                            i26 = i55;
                                                                                                                        } else {
                                                                                                                            str31 = LocaleController.formatString("NotificationActionPinnedSticker", R.string.NotificationActionPinnedSticker, strArr2[0], strArr2[1]);
                                                                                                                            i26 = i55;
                                                                                                                        }
                                                                                                                    } else if (strArr2.length > 1 && !TextUtils.isEmpty(strArr2[1])) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedStickerEmojiChannel", R.string.NotificationActionPinnedStickerEmojiChannel, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i55;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedStickerChannel", R.string.NotificationActionPinnedStickerChannel, strArr2[0]);
                                                                                                                        i26 = i55;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 128:
                                                                                                                    int i56 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVoiceUser", R.string.NotificationActionPinnedVoiceUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i56;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVoice", R.string.NotificationActionPinnedVoice, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i56;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedVoiceChannel", R.string.NotificationActionPinnedVoiceChannel, strArr2[0]);
                                                                                                                        i26 = i56;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.dialogIsTranslatable /* 129 */:
                                                                                                                    int i57 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedContactUser", R.string.NotificationActionPinnedContactUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i57;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedContact2", R.string.NotificationActionPinnedContact2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        i26 = i57;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString("NotificationActionPinnedContactChannel2", R.string.NotificationActionPinnedContactChannel2, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i57;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.dialogTranslate /* 130 */:
                                                                                                                    i26 = i38;
                                                                                                                    str31 = LocaleController.formatString(R.string.NotificationPinnedGiveaway, strArr2[0]);
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.didGenerateFingerprintKeyPair /* 131 */:
                                                                                                                    int i58 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedQuizUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i58;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedQuiz2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        i26 = i58;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedQuizChannel2, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i58;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.walletPendingTransactionsChanged /* 132 */:
                                                                                                                    int i59 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedPollUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i59;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedPoll2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        i26 = i59;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedPollChannel2, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i59;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.walletSyncProgressChanged /* 133 */:
                                                                                                                    int i60 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedTodoUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i60;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedTodo2, strArr2[0], strArr2[2], strArr2[1]);
                                                                                                                        i26 = i60;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedTodoChannel2, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i60;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.httpFileDidLoad /* 134 */:
                                                                                                                    int i61 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeoUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i61;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeo, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i61;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeoChannel, strArr2[0]);
                                                                                                                        i26 = i61;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.httpFileDidFailedLoad /* 135 */:
                                                                                                                    int i62 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i62;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeoLive, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i62;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGeoLiveChannel, strArr2[0]);
                                                                                                                        i26 = i62;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.didUpdateConnectionState /* 136 */:
                                                                                                                    int i63 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGameUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i63;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGame, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i63;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGameChannel, strArr2[0]);
                                                                                                                        i26 = i63;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileUploaded /* 137 */:
                                                                                                                    int i64 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i64;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGameScore, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i64;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGameScoreChannel, strArr2[0]);
                                                                                                                        i26 = i64;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileUploadFailed /* 138 */:
                                                                                                                    int i65 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i65;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedInvoice, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i65;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedInvoiceChannel, strArr2[0]);
                                                                                                                        i26 = i65;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileUploadProgressChanged /* 139 */:
                                                                                                                    int i66 = i38;
                                                                                                                    if (j14 > 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGifUser, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i66;
                                                                                                                    } else if (z4) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGif, strArr2[0], strArr2[1]);
                                                                                                                        i26 = i66;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionPinnedGifChannel, strArr2[0]);
                                                                                                                        i26 = i66;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileLoadProgressChanged /* 140 */:
                                                                                                                    i29 = i38;
                                                                                                                    str33 = LocaleController.getString(R.string.YouHaveNewMessage);
                                                                                                                    str34 = LocaleController.getString(R.string.SecretChatName);
                                                                                                                    z11 = has;
                                                                                                                    str30 = str33;
                                                                                                                    str29 = str34;
                                                                                                                    i12 = i43;
                                                                                                                    z12 = true;
                                                                                                                    i3 = i29;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case NotificationCenter.fileLoaded /* 141 */:
                                                                                                                    long j19 = i3.getLong(str8);
                                                                                                                    int i67 = i38;
                                                                                                                    VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i67, j19);
                                                                                                                    int parseInt7 = Integer.parseInt(strArr2[1]);
                                                                                                                    if (parseInt7 <= 0) {
                                                                                                                        str31 = LocaleController.formatString(R.string.NotificationActionMissedCallConference, strArr2[0]);
                                                                                                                        i26 = i67;
                                                                                                                    } else {
                                                                                                                        str31 = LocaleController.formatPluralStringComma("NotificationActionMissedCallConferenceOther", parseInt7, strArr2[0]);
                                                                                                                        i26 = i67;
                                                                                                                    }
                                                                                                                    z11 = has;
                                                                                                                    i15 = i26;
                                                                                                                    str30 = str31;
                                                                                                                    i14 = i15;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                        FileLog.w("unhandled loc_key = " + str7);
                                                                                                                    }
                                                                                                                case NotificationCenter.fileLoadFailed /* 142 */:
                                                                                                                case NotificationCenter.filePreparingStarted /* 143 */:
                                                                                                                case NotificationCenter.fileNewChunkAvailable /* 144 */:
                                                                                                                case NotificationCenter.filePreparingFailed /* 145 */:
                                                                                                                case NotificationCenter.dialogsUnreadCounterChanged /* 146 */:
                                                                                                                case NotificationCenter.messagePlayingProgressDidChanged /* 147 */:
                                                                                                                case NotificationCenter.messagePlayingDidReset /* 148 */:
                                                                                                                case NotificationCenter.messagePlayingPlayStateChanged /* 149 */:
                                                                                                                case 150:
                                                                                                                case NotificationCenter.messagePlayingDidSeek /* 151 */:
                                                                                                                    i14 = i38;
                                                                                                                    z11 = has;
                                                                                                                    str30 = null;
                                                                                                                    str29 = str25;
                                                                                                                    i12 = i43;
                                                                                                                    i13 = i14;
                                                                                                                    z12 = false;
                                                                                                                    i3 = i13;
                                                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                                                    }
                                                                                                                    if (str30 == null) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                            i = i3;
                                                                                                            str14 = str17;
                                                                                                            str6 = str14;
                                                                                                            i2 = -1;
                                                                                                            if (i != i2) {
                                                                                                            }
                                                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                                            }
                                                                                                            FileLog.e(th);
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    i11 = i38;
                                                                                                    z11 = has;
                                                                                                    str27 = "CHAT_REACT_";
                                                                                                    obj4 = "STORY_HIDDEN_AUTHOR";
                                                                                                    str26 = str21;
                                                                                                }
                                                                                                str28 = str24;
                                                                                                str31 = getReactedText(str7, strArr2);
                                                                                                i15 = i11;
                                                                                                str30 = str31;
                                                                                                i14 = i15;
                                                                                                str29 = str25;
                                                                                                i12 = i43;
                                                                                                i13 = i14;
                                                                                                z12 = false;
                                                                                                i3 = i13;
                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                }
                                                                                                if (str30 == null) {
                                                                                                }
                                                                                            } catch (Throwable th11) {
                                                                                                th = th11;
                                                                                                th = th;
                                                                                                i5 = i3;
                                                                                                str13 = str17;
                                                                                                i = i5;
                                                                                                str14 = str13;
                                                                                                str6 = str14;
                                                                                                i2 = -1;
                                                                                                if (i != i2) {
                                                                                                }
                                                                                                if (BuildVars.LOGS_ENABLED) {
                                                                                                }
                                                                                                FileLog.e(th);
                                                                                            }
                                                                                        }
                                                                                        str23 = null;
                                                                                        boolean has2 = i3.has("edit_date");
                                                                                        if (!str7.startsWith("CHAT_")) {
                                                                                        }
                                                                                        if (str7.startsWith("PINNED_")) {
                                                                                        }
                                                                                    }
                                                                                    z4 = true;
                                                                                    if (i3.has("mention")) {
                                                                                    }
                                                                                    j9 = optLong2;
                                                                                    z5 = false;
                                                                                    if (i3.has("silent")) {
                                                                                    }
                                                                                    jSONObject2 = jSONObject;
                                                                                    str22 = "loc_args";
                                                                                    z6 = false;
                                                                                    if (jSONObject2.has(str22)) {
                                                                                    }
                                                                                    if (strArr2 != null) {
                                                                                        str23 = strArr2[0];
                                                                                        boolean has22 = i3.has("edit_date");
                                                                                        if (!str7.startsWith("CHAT_")) {
                                                                                        }
                                                                                        if (str7.startsWith("PINNED_")) {
                                                                                        }
                                                                                    }
                                                                                    str23 = null;
                                                                                    boolean has222 = i3.has("edit_date");
                                                                                    if (!str7.startsWith("CHAT_")) {
                                                                                    }
                                                                                    if (str7.startsWith("PINNED_")) {
                                                                                    }
                                                                                } catch (Throwable th12) {
                                                                                    th = th12;
                                                                                    i3 = i38;
                                                                                }
                                                                            } else {
                                                                                i7 = i38;
                                                                                String str44 = str8;
                                                                                if ("CONF_CALL_MISSED".equalsIgnoreCase(str7)) {
                                                                                    VoIPGroupNotification.hideByCallId(ApplicationLoader.applicationContext, i7, i3.getLong(str44));
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        j8 = j7;
                                                                        obj3 = obj;
                                                                    }
                                                                    i10 = !i3.has("story_id") ? i3.getInt("story_id") : -1;
                                                                    z3 = i10 < 0;
                                                                    if (z3) {
                                                                    }
                                                                }
                                                                obj2 = "STORY_NOTEXT";
                                                                z2 = true;
                                                                z3 = z2;
                                                                if (str7.equals(obj2)) {
                                                                }
                                                                if (!i3.has("story_id")) {
                                                                }
                                                                if (i10 < 0) {
                                                                }
                                                                if (z3) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    countDownLatch.countDown();
                                                    ConnectionsManager.onInternalPushReceived(i7);
                                                    ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                                                    return;
                                                }
                                                i7 = i38;
                                                countDownLatch.countDown();
                                                ConnectionsManager.onInternalPushReceived(i7);
                                                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                                                return;
                                            } catch (Throwable th13) {
                                                th = th13;
                                                i5 = i38;
                                                str12 = str17;
                                                th = th;
                                                str13 = str12;
                                                i = i5;
                                                str14 = str13;
                                                str6 = str14;
                                                i2 = -1;
                                                if (i != i2) {
                                                }
                                                if (BuildVars.LOGS_ENABLED) {
                                                }
                                                FileLog.e(th);
                                            }
                                        }
                                        if (c != 0) {
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        str12 = r41;
                                    }
                                    c = 65535;
                                } else {
                                    if (str7.equals("MESSAGE_ANNOUNCEMENT")) {
                                        c = 1;
                                        if (c != 0) {
                                        }
                                    }
                                    c = 65535;
                                    if (c != 0) {
                                    }
                                }
                            } else {
                                if (str7.equals("DC_UPDATE")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            }
                        } else {
                            if (str7.equals("SESSION_REVOKE")) {
                                c = 2;
                                if (c != 0) {
                                }
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        str13 = str36;
                        i5 = i4;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    str12 = str36;
                    i5 = i4;
                }
            } catch (Throwable th17) {
                str11 = str36;
                th = th17;
                str35 = str7;
                str7 = str35;
                str6 = str11;
                i2 = -1;
                i = -1;
                if (i != i2) {
                }
                if (BuildVars.LOGS_ENABLED) {
                }
                FileLog.e(th);
            }
        } catch (Throwable th18) {
            th = th18;
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
