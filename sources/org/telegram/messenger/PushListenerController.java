package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "CHAT_REACT_CONTACT":
                return id.a0(null, null, 2131746575, objArr);
            case "REACT_WALLET_TONCONNECT_REQUEST":
                return id.a0(null, null, 2131746512, objArr);
            case "CHAT_REACT_POLL_APPEND":
                return id.a0(null, null, 2131746564, objArr);
            case "REACT_GEOLIVE":
                return id.a0(null, null, 2131746548, objArr);
            case "REACT_GAME_SCORE":
                return id.a0(null, null, 2131746550, objArr);
            case "REACT_STORY_HIDDEN":
                return id.a0(null, null, 2131746524, objArr);
            case "CHAT_REACT_TODO_DONE":
            case "CHAT_REACT_TODO_APPEND":
                return id.a0(null, null, 2131746556, objArr);
            case "REACT_RECURRING_PAY":
                return id.a0(null, null, 2131746534, objArr);
            case "REACT_STARGIFT_UPGRADE":
                return id.a0(null, null, 2131746527, objArr);
            case "REACT_HIDDEN":
                return id.a0(null, null, 2131746543, objArr);
            case "CHAT_REACT_NOTEXT":
                return id.a0(null, null, 2131746567, objArr);
            case "CHAT_REACT_GAME_SCORE":
                return id.a0(null, null, 2131746572, objArr);
            case "REACT_NOTEXT":
                return id.a0(null, null, 2131746541, objArr);
            case "REACT_PHOTO_SECRET":
                return id.a0(null, null, 2131746538, objArr);
            case "REACT_WALLPAPER":
                return id.a0(null, null, 2131746511, objArr);
            case "CHAT_REACT_INVOICE":
                return id.a0(null, null, 2131746568, objArr);
            case "CHAT_REACT_NOTHEME":
            case "CHAT_REACT_THEME":
                return id.a0(null, null, 2131746558, objArr);
            case "REACT_CONTACT":
                return id.a0(null, null, 2131746553, objArr);
            case "REACT_STARGIFT_PREPAID_UPGRADE":
                return id.a0(null, null, 2131746529, objArr);
            case "CHAT_REACT_STICKER":
                return id.a0(null, null, 2131746561, objArr);
            case "REACT_SAME_WALLPAPER":
                return id.a0(null, null, 2131746532, objArr);
            case "REACT_GRAM_TRANSFER_COMMENT":
                return id.a0(null, null, 2131746544, objArr);
            case "REACT_GAME":
                return id.a0(null, null, 2131746551, objArr);
            case "REACT_POLL":
                return id.a0(null, null, 2131746537, objArr);
            case "REACT_QUIZ":
                return id.a0(null, null, 2131746535, objArr);
            case "REACT_TEXT":
                return id.a0(null, null, 2131746519, objArr);
            case "REACT_TODO":
                return id.a0(null, null, 2131746517, objArr);
            case "REACT_INVOICE":
                return id.a0(null, null, 2131746542, objArr);
            case "REACT_SCREENSHOT":
                return id.a0(null, null, 2131746531, objArr);
            case "CHAT_REACT_DOC":
                return id.a0(null, null, 2131746574, objArr);
            case "CHAT_REACT_GEO":
                return id.a0(null, null, 2131746571, objArr);
            case "CHAT_REACT_GIF":
                return id.a0(null, null, 2131746569, objArr);
            case "REACT_TODO_DONE":
            case "REACT_TODO_APPEND":
                return id.a0(null, null, 2131746516, objArr);
            case "REACT_NOTHEME":
            case "REACT_THEME":
            case "REACT_GIFT_THEME":
                return id.a0(null, null, 2131746518, objArr);
            case "REACT_GRAM_TRANSFER":
                return id.a0(null, null, 2131746545, objArr);
            case "REACT_STARGIFT_UNPACK_UPGRADE":
                return id.a0(null, null, 2131746528, objArr);
            case "REACT_GIFTCODE":
                return id.a0(null, null, 2131746546, objArr);
            case "REACT_STICKER":
                return id.a0(null, null, 2131746526, objArr);
            case "CHAT_REACT_AUDIO":
                return id.a0(null, null, 2131746576, objArr);
            case "CHAT_REACT_PHOTO":
                return id.a0(null, null, 2131746566, objArr);
            case "CHAT_REACT_ROUND":
                return id.a0(null, null, 2131746562, objArr);
            case "CHAT_REACT_STORY":
                return id.a0(null, null, 2131746560, objArr);
            case "CHAT_REACT_VIDEO":
                return id.a0(null, null, 2131746555, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return id.a0(null, null, 2131748049, objArr);
            case "REACT_UNIQUE_STARGIFT":
                return id.a0(null, null, 2131746515, objArr);
            case "REACT_STORY_MENTION":
                return id.a0(null, null, 2131746522, objArr);
            case "REACT_GIVEAWAY_STARS":
                return id.a0(null, null, 2131747938, objArr);
            case "REACT_GIVEAWAY":
                return id.a0(null, null, 2131747938, objArr);
            case "REACT_STARGIFT":
                return id.a0(null, null, 2131746530, objArr);
            case "CHAT_REACT_GEOLIVE":
                return id.a0(null, null, 2131746570, objArr);
            case "REACT_VIDEO_SECRET":
                return id.a0(null, null, 2131746513, objArr);
            case "REACT_SUGGEST_BIRTHDAY":
                return id.a0(null, null, 2131746521, objArr);
            case "REACT_PROXIMITY":
                return id.a0(null, null, 2131746536, objArr);
            case "REACT_PAID_MEDIA":
                return id.a0(null, null, 2131746540, objArr);
            case "REACT_AUDIO":
                return id.a0(null, null, 2131746554, objArr);
            case "REACT_PHOTO":
                return id.a0(null, null, 2131746539, objArr);
            case "REACT_ROUND":
                return id.a0(null, null, 2131746533, objArr);
            case "REACT_STORY":
                return id.a0(null, null, 2131746525, objArr);
            case "REACT_VIDEO":
                return id.a0(null, null, 2131746514, objArr);
            case "REACT_SUGGEST_USERPIC":
                return id.a0(null, null, 2131746520, objArr);
            case "REACT_DOC":
                return id.a0(null, null, 2131746552, objArr);
            case "REACT_GEO":
                return id.a0(null, null, 2131746549, objArr);
            case "REACT_GIF":
                return id.a0(null, null, 2131746547, objArr);
            case "CHAT_REACT_GAME":
                return id.a0(null, null, 2131746573, objArr);
            case "CHAT_REACT_POLL":
                return id.a0(null, null, 2131746565, objArr);
            case "CHAT_REACT_QUIZ":
                return id.a0(null, null, 2131746563, objArr);
            case "CHAT_REACT_TEXT":
                return id.a0(null, null, 2131746559, objArr);
            case "CHAT_REACT_TODO":
                return id.a0(null, null, 2131746557, objArr);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i7, TLRPC.TL_updates tL_updates) {
        qp.s1(i7).O3(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i7) {
        if (p10.i(i7).e() != 0) {
            p10.i(i7).b();
            qp.s1(i7).A3(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$processRemoteMessage$4(int i7) {
        sd f10 = sd.f(i7);
        if (f10.b.isEmpty()) {
            return;
        }
        f10.H = SystemClock.elapsedRealtime() + 65000;
        f10.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i7, long j3, int i10) {
        qp.s1(i7).n4(i10, j3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1030:0x0753, code lost:
    
        if (org.telegram.messenger.yr.a0(r27).m(r12) == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1124:0x03b9, code lost:
    
        if (r5.equals("MESSAGE_WALLET_TONCONNECT_REQUEST") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0ac5, code lost:
    
        if (r5.equals("LOCKED_MESSAGE") != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1731, code lost:
    
        if (r5.equals("REACT_TEXT") != false) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x18bd, code lost:
    
        if (r5.equals("MESSAGE_GRAM_TRANSFER_UNKNOWN") != false) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x1dc5, code lost:
    
        if (r5.equals("CHANNEL_MESSAGE_TEXT") != false) goto L879;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x201a, code lost:
    
        if (r5.equals("MESSAGE_MUTED") != false) goto L938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:981:0x22a4, code lost:
    
        if (r5.equals("CHAT_CREATED") != false) goto L995;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x08a7 A[Catch: all -> 0x1f7e, TryCatch #16 {all -> 0x1f7e, blocks: (B:97:0x0461, B:100:0x0478, B:103:0x04b8, B:117:0x04e2, B:121:0x04f4, B:140:0x257a, B:150:0x0508, B:165:0x058a, B:168:0x05a9, B:173:0x05cc, B:185:0x064a, B:196:0x06ca, B:198:0x06d0, B:202:0x06ed, B:213:0x0758, B:218:0x0767, B:228:0x079b, B:234:0x07c1, B:239:0x07de, B:245:0x07fc, B:257:0x082d, B:267:0x08b7, B:269:0x08bd, B:271:0x08d7, B:305:0x2414, B:313:0x2456, B:353:0x244a, B:359:0x2412, B:899:0x1f3a, B:901:0x1f42, B:1000:0x088a, B:1007:0x08a7, B:1018:0x0784, B:1032:0x06df), top: B:96:0x0461 }] */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x2510 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x078a A[Catch: all -> 0x0470, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a6 A[Catch: all -> 0x0470, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x0469 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x0444 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04c0 A[Catch: all -> 0x0470, TRY_ENTER, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04d0 A[Catch: all -> 0x0470, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06f5 A[Catch: all -> 0x0470, TRY_ENTER, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0710 A[Catch: all -> 0x0470, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0802 A[Catch: all -> 0x0470, TRY_ENTER, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x083d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08bd A[Catch: all -> 0x1f7e, TryCatch #16 {all -> 0x1f7e, blocks: (B:97:0x0461, B:100:0x0478, B:103:0x04b8, B:117:0x04e2, B:121:0x04f4, B:140:0x257a, B:150:0x0508, B:165:0x058a, B:168:0x05a9, B:173:0x05cc, B:185:0x064a, B:196:0x06ca, B:198:0x06d0, B:202:0x06ed, B:213:0x0758, B:218:0x0767, B:228:0x079b, B:234:0x07c1, B:239:0x07de, B:245:0x07fc, B:257:0x082d, B:267:0x08b7, B:269:0x08bd, B:271:0x08d7, B:305:0x2414, B:313:0x2456, B:353:0x244a, B:359:0x2412, B:899:0x1f3a, B:901:0x1f42, B:1000:0x088a, B:1007:0x08a7, B:1018:0x0784, B:1032:0x06df), top: B:96:0x0461 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x233a A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x2369 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x2397 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x23bd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x23c9 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x23d2 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x23e1 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x2420 A[Catch: all -> 0x0470, TRY_ENTER, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x2473 A[Catch: all -> 0x1f6a, TRY_ENTER, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x2489 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x24a4 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x24e6 A[Catch: all -> 0x1f6a, TryCatch #5 {all -> 0x1f6a, blocks: (B:125:0x252b, B:127:0x2539, B:129:0x2546, B:131:0x2550, B:133:0x2561, B:135:0x2565, B:137:0x2569, B:138:0x2570, B:142:0x2587, B:143:0x258c, B:148:0x2582, B:276:0x2336, B:278:0x233a, B:280:0x2365, B:282:0x2369, B:284:0x2397, B:286:0x239f, B:290:0x23ab, B:294:0x23b5, B:297:0x23c0, B:299:0x23c9, B:301:0x23d2, B:302:0x23d9, B:304:0x23e1, B:316:0x2473, B:317:0x2485, B:319:0x2489, B:321:0x2491, B:324:0x249c, B:326:0x24a4, B:330:0x24ae, B:332:0x24e6, B:334:0x24ea, B:336:0x24ee, B:338:0x24f2, B:343:0x24fc, B:344:0x2504, B:356:0x23f7, B:357:0x2405, B:554:0x22f0, B:702:0x22a6, B:903:0x1f4e, B:905:0x1f5a, B:906:0x1f6e, B:907:0x1f82, B:910:0x1f8e, B:912:0x1f98, B:913:0x1faf, B:915:0x1fb9, B:916:0x1fd0, B:918:0x1fda, B:919:0x1ff1, B:921:0x1ffb, B:922:0x2012, B:924:0x201e, B:926:0x2028, B:927:0x203d, B:929:0x2047, B:930:0x2064, B:932:0x206e, B:933:0x2087, B:935:0x2091, B:936:0x20af, B:938:0x20b9, B:939:0x20d2, B:941:0x20dc, B:942:0x20f5, B:946:0x2101, B:948:0x210b, B:951:0x2137, B:953:0x2141, B:954:0x215e, B:956:0x2168, B:957:0x2181, B:959:0x218b, B:960:0x21aa, B:962:0x21b4, B:963:0x21cb, B:965:0x21d5, B:966:0x21ec, B:968:0x21f6, B:969:0x220d, B:971:0x2217, B:972:0x223e, B:974:0x224a, B:976:0x224e, B:978:0x2256, B:979:0x2285, B:980:0x229c, B:982:0x22bf, B:984:0x22c9, B:985:0x22e6, B:988:0x231a, B:990:0x2325, B:992:0x2358, B:1015:0x2510, B:1017:0x251c), top: B:114:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x242a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x23f1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x23be  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x2393  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x25ae  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x18cd A[Catch: all -> 0x0470, TryCatch #7 {all -> 0x0470, blocks: (B:1045:0x0469, B:102:0x04a6, B:105:0x04c0, B:110:0x04d0, B:112:0x04d8, B:153:0x0514, B:155:0x0523, B:158:0x0544, B:159:0x0575, B:160:0x0554, B:162:0x055d, B:163:0x0570, B:164:0x0567, B:167:0x0592, B:171:0x05b5, B:176:0x05da, B:177:0x05ed, B:179:0x05f0, B:181:0x05fc, B:183:0x061d, B:187:0x0652, B:188:0x066a, B:190:0x066d, B:192:0x0681, B:194:0x069d, B:200:0x06d8, B:204:0x06f5, B:206:0x0710, B:208:0x0724, B:209:0x073e, B:216:0x0760, B:221:0x0775, B:223:0x077b, B:236:0x07c9, B:241:0x07e4, B:247:0x0802, B:249:0x0813, B:253:0x0824, B:256:0x0828, B:260:0x083f, B:262:0x0842, B:264:0x0848, B:308:0x2420, B:350:0x2430, B:352:0x243e, B:363:0x093e, B:365:0x0946, B:369:0x0971, B:371:0x0979, B:372:0x0997, B:374:0x099f, B:379:0x09d1, B:381:0x09d9, B:382:0x09f0, B:384:0x09f8, B:385:0x0a1e, B:388:0x0a28, B:392:0x0a4c, B:393:0x0a6a, B:394:0x0a82, B:396:0x0a8a, B:397:0x0aa2, B:399:0x0aa8, B:401:0x0abf, B:406:0x0acb, B:408:0x0ad3, B:409:0x0b02, B:411:0x0b0a, B:414:0x0b35, B:416:0x0b3d, B:417:0x0b50, B:419:0x0b58, B:420:0x0b75, B:422:0x0b7d, B:423:0x0b9a, B:425:0x0ba2, B:426:0x0bb9, B:428:0x0bc1, B:429:0x0bde, B:431:0x0be6, B:432:0x0c03, B:434:0x0c0b, B:435:0x0c28, B:437:0x0c30, B:438:0x0c57, B:440:0x0c5f, B:441:0x0c86, B:444:0x0c90, B:446:0x0c98, B:447:0x0cbb, B:449:0x0cc3, B:450:0x0cdb, B:452:0x0ce3, B:453:0x0d0c, B:455:0x0d14, B:456:0x0d3b, B:458:0x0d43, B:459:0x0d72, B:461:0x0d7a, B:462:0x0d91, B:464:0x0d99, B:465:0x0db0, B:467:0x0db8, B:468:0x0dcf, B:470:0x0dd7, B:471:0x0dee, B:473:0x0df6, B:474:0x0e1b, B:476:0x0e23, B:477:0x0e3a, B:479:0x0e42, B:480:0x0e71, B:482:0x0e79, B:483:0x0e95, B:487:0x0e9f, B:489:0x0ea9, B:492:0x0ec9, B:494:0x0ed1, B:495:0x0eee, B:497:0x0ef6, B:498:0x0f0f, B:501:0x0f19, B:503:0x0f34, B:504:0x0f4d, B:505:0x0f60, B:507:0x0f68, B:508:0x0f83, B:511:0x1dc7, B:512:0x0f8d, B:514:0x0f95, B:515:0x0fb3, B:517:0x0fbb, B:518:0x0fd6, B:520:0x0fde, B:521:0x0ffb, B:523:0x1003, B:524:0x102c, B:526:0x1034, B:527:0x105b, B:529:0x1063, B:530:0x106c, B:532:0x1074, B:533:0x1095, B:535:0x109d, B:536:0x10be, B:538:0x10c6, B:539:0x10ec, B:541:0x10f4, B:542:0x1115, B:544:0x111d, B:545:0x1140, B:547:0x1148, B:548:0x1179, B:550:0x1181, B:551:0x11b0, B:555:0x11bc, B:558:0x11c6, B:560:0x11df, B:561:0x11f6, B:562:0x1207, B:564:0x120f, B:565:0x1233, B:567:0x123b, B:568:0x125a, B:572:0x1264, B:574:0x126e, B:577:0x1292, B:579:0x129a, B:580:0x12b7, B:582:0x12bf, B:583:0x12da, B:586:0x12e4, B:588:0x12ff, B:589:0x1318, B:590:0x132b, B:593:0x1335, B:595:0x1350, B:596:0x1369, B:597:0x137c, B:600:0x1386, B:602:0x13a1, B:603:0x13ba, B:604:0x13cd, B:607:0x13d7, B:609:0x13f2, B:610:0x140b, B:611:0x141e, B:613:0x1426, B:614:0x143e, B:617:0x18bf, B:620:0x18cd, B:628:0x18ec, B:634:0x1448, B:636:0x1450, B:637:0x146a, B:639:0x1472, B:640:0x148b, B:642:0x1493, B:643:0x14be, B:646:0x14c8, B:648:0x14d0, B:649:0x14e7, B:651:0x14ef, B:652:0x1506, B:654:0x150e, B:655:0x1525, B:657:0x152d, B:658:0x1544, B:660:0x154c, B:661:0x1565, B:663:0x156d, B:664:0x1584, B:666:0x158c, B:668:0x1590, B:670:0x1598, B:671:0x15cf, B:672:0x1602, B:674:0x160a, B:675:0x161b, B:677:0x1623, B:678:0x1640, B:680:0x1648, B:681:0x1665, B:683:0x166d, B:684:0x168a, B:686:0x1692, B:687:0x16b1, B:689:0x16b9, B:690:0x16db, B:693:0x16e5, B:695:0x16ed, B:696:0x1706, B:698:0x170e, B:699:0x171f, B:703:0x172b, B:705:0x173a, B:707:0x1742, B:708:0x175e, B:710:0x1766, B:714:0x177a, B:715:0x1777, B:716:0x178e, B:718:0x1796, B:719:0x17a7, B:721:0x17af, B:722:0x17c1, B:725:0x17cb, B:728:0x17d5, B:730:0x17dd, B:731:0x1800, B:734:0x180a, B:736:0x1812, B:737:0x1829, B:739:0x1831, B:740:0x184b, B:742:0x1853, B:743:0x186a, B:745:0x1872, B:746:0x188b, B:749:0x1895, B:751:0x189d, B:752:0x18b7, B:754:0x18ff, B:757:0x1909, B:759:0x1922, B:760:0x1939, B:761:0x194a, B:764:0x1954, B:766:0x196d, B:767:0x1984, B:768:0x1995, B:771:0x199f, B:773:0x19ba, B:774:0x19d3, B:775:0x19e6, B:778:0x19f0, B:780:0x1a09, B:781:0x1a20, B:782:0x1a31, B:784:0x1a3b, B:786:0x1a3f, B:788:0x1a47, B:789:0x1a76, B:790:0x1a8d, B:792:0x1a95, B:793:0x1aad, B:796:0x1ab7, B:799:0x1ac1, B:801:0x1ac5, B:803:0x1acd, B:804:0x1ae4, B:806:0x1af9, B:808:0x1afd, B:810:0x1b05, B:811:0x1b22, B:812:0x1b3b, B:814:0x1b3f, B:816:0x1b47, B:817:0x1b5e, B:818:0x1b71, B:820:0x1b77, B:821:0x1b83, B:823:0x1b8b, B:824:0x1ba2, B:827:0x1bac, B:829:0x1bc5, B:830:0x1be2, B:831:0x1bf9, B:834:0x1c03, B:836:0x1c1e, B:837:0x1c3d, B:838:0x1c56, B:841:0x1c60, B:843:0x1c79, B:844:0x1c96, B:845:0x1cad, B:848:0x1cb7, B:850:0x1cd0, B:851:0x1ced, B:852:0x1d04, B:855:0x1d0e, B:857:0x1d27, B:858:0x1d3e, B:859:0x1d4f, B:861:0x1d57, B:862:0x1d7a, B:864:0x1d82, B:865:0x1d9c, B:867:0x1da4, B:868:0x1dbf, B:870:0x1de2, B:872:0x1dea, B:873:0x1e0a, B:875:0x1e12, B:876:0x1e2d, B:878:0x1e35, B:879:0x1e4c, B:881:0x1e54, B:882:0x1e81, B:884:0x1e89, B:885:0x1eb0, B:888:0x1eba, B:890:0x1ed3, B:891:0x1eea, B:892:0x1efb, B:894:0x1f03, B:895:0x1f1c, B:897:0x1f24, B:997:0x0878, B:1020:0x078a, B:1029:0x074b, B:1034:0x06e5), top: B:1044:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x25c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x25be  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042f A[Catch: all -> 0x036b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x036b, blocks: (B:91:0x042f, B:1109:0x0338), top: B:81:0x0225 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0477  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void lambda$processRemoteMessage$6(String str, String str2, long j3) {
        int i7;
        String str3;
        String str4;
        int i10;
        byte[] decode;
        NativeByteBuffer nativeByteBuffer;
        byte[] bArr;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        long e10;
        int intValue;
        boolean z9;
        String str5;
        JSONObject jSONObject3;
        long j10;
        long j11;
        int i11;
        String str6;
        long j12;
        final int i12;
        long j13;
        long j14;
        String str7;
        long j15;
        JSONObject jSONObject4;
        String str8;
        String str9;
        String str10;
        boolean z10;
        long j16;
        long j17;
        String str11;
        String str12;
        String[] strArr;
        int i13;
        int i14;
        long j18;
        long j19;
        long j20;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        int i16;
        String str13;
        boolean z14;
        boolean z15;
        JSONObject jSONObject5;
        boolean z16;
        int i17;
        String[] strArr2;
        String str14;
        boolean z17;
        long j21;
        boolean z18;
        boolean z19;
        String str15;
        boolean z20;
        String str16;
        Object obj;
        String str17;
        String str18;
        long j22;
        boolean z21;
        boolean z22;
        boolean z23;
        String reactedText;
        boolean z24;
        final int i18;
        String str19;
        String str20;
        String str21;
        final long j23;
        boolean z25;
        long j24;
        int i19;
        boolean z26;
        ij ijVar;
        boolean z27;
        String Y;
        String L0;
        String Y2;
        int i20;
        String G;
        int i21;
        int i22;
        if (r2.a) {
            a8.b(str + " START PROCESSING");
        }
        try {
            decode = Base64.decode(str2, 8);
            nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (iz.m == null) {
                iz.m = new byte[8];
                byte[] n10 = Utilities.n(iz.l);
                System.arraycopy(n10, n10.length - 8, iz.m, 0, 8);
            }
            bArr = new byte[8];
            nativeByteBuffer.readBytes(bArr, true);
        } catch (Throwable th2) {
            th = th2;
            i7 = -1;
            str3 = null;
            str4 = null;
        }
        if (!Arrays.equals(iz.m, bArr)) {
            onDecryptError();
            if (r2.a) {
                a8.b(String.format(Locale.US, str + " DECRYPT ERROR 2 k1=%s k2=%s, key=%s", Utilities.f(iz.m), Utilities.f(bArr), Utilities.f(iz.l)));
            }
            return;
        }
        byte[] bArr2 = new byte[16];
        nativeByteBuffer.readBytes(bArr2, true);
        j2.n d02 = j2.n.d0(2, true, iz.l, bArr2);
        Utilities.c(nativeByteBuffer.buffer, (byte[]) d02.b, (byte[]) d02.c, false, false, 24, decode.length - 24);
        byte[] bArr3 = iz.l;
        ByteBuffer byteBuffer = nativeByteBuffer.buffer;
        if (!Utilities.d(bArr2, Utilities.p(bArr3, 96, byteBuffer, 24, byteBuffer.limit()), 8)) {
            onDecryptError();
            if (r2.a) {
                a8.b(String.format(str + " DECRYPT ERROR 3, key = %s", Utilities.f(iz.l)));
                return;
            }
            return;
        }
        byte[] bArr4 = new byte[nativeByteBuffer.readInt32(true)];
        nativeByteBuffer.readBytes(bArr4, true);
        str4 = new String(bArr4);
        try {
            jSONObject = new JSONObject(str4);
            t0 t0Var = t0.a;
            if (jSONObject.has("loc_key")) {
                try {
                    str3 = jSONObject.getString("loc_key");
                } catch (Throwable th3) {
                    th = th3;
                    i7 = -1;
                    str3 = null;
                    i10 = -1;
                    if (i10 != i7) {
                    }
                    if (r2.a) {
                    }
                    a8.f(th);
                    return;
                }
            } else {
                str3 = "";
            }
            try {
                if (jSONObject.get("custom") instanceof JSONObject) {
                    try {
                        jSONObject2 = jSONObject.getJSONObject("custom");
                    } catch (Throwable th4) {
                        th = th4;
                        i7 = -1;
                        i10 = -1;
                        if (i10 != i7) {
                        }
                        if (r2.a) {
                        }
                        a8.f(th);
                        return;
                    }
                } else {
                    jSONObject2 = new JSONObject();
                }
                Object obj2 = jSONObject.has("user_id") ? jSONObject.get("user_id") : null;
                if (obj2 == null) {
                    e10 = p10.i(p10.s0).e();
                } else if (obj2 instanceof Long) {
                    e10 = ((Long) obj2).longValue();
                } else {
                    if (obj2 instanceof Integer) {
                        intValue = ((Integer) obj2).intValue();
                    } else if (obj2 instanceof String) {
                        intValue = Utilities.z((String) obj2).intValue();
                    } else {
                        e10 = p10.i(p10.s0).e();
                    }
                    e10 = intValue;
                }
                int i23 = p10.s0;
                i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        i10 = i23;
                        z9 = false;
                        break;
                    } else {
                        if (p10.i(i10).e() == e10) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        if (!z9) {
            if (r2.a) {
                a8.b(str + " ACCOUNT NOT FOUND");
            }
            countDownLatch.countDown();
            return;
        }
        try {
            try {
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            str5 = str4;
        }
        if (!p10.i(i10).p()) {
            if (r2.a) {
                a8.b(str + " ACCOUNT NOT ACTIVATED");
            }
            countDownLatch.countDown();
            return;
        }
        if (r2.a) {
            a8.b(str + " " + str3);
        }
        try {
        } catch (Throwable th9) {
            th = th9;
        }
        switch (str3.hashCode()) {
            case -1963663249:
                if (str3.equals("SESSION_REVOKE")) {
                    g0.h3(new hi.j2(i10, 5));
                    countDownLatch.countDown();
                    break;
                }
                JSONObject jSONObject6 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                    try {
                        jSONObject3 = jSONObject6;
                        j10 = 0;
                        j11 = jSONObject3.getLong("channel_id");
                        i11 = i10;
                        str6 = "";
                        j12 = -j11;
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    i11 = i10;
                    str6 = "";
                    jSONObject3 = jSONObject6;
                    j10 = 0;
                    j11 = 0;
                    j12 = 0;
                }
                try {
                    if (jSONObject3.has("from_id")) {
                        j14 = jSONObject3.getLong("from_id");
                        j13 = j14;
                    } else {
                        j13 = j12;
                        j14 = j10;
                    }
                    if (jSONObject3.has("chat_id")) {
                        try {
                            str7 = " ";
                            j15 = jSONObject3.getLong("chat_id");
                            str5 = str4;
                            jSONObject4 = jSONObject;
                            j13 = -j15;
                        } catch (Throwable th11) {
                            th = th11;
                            i10 = i11;
                            i7 = -1;
                            if (i10 != i7) {
                            }
                            if (r2.a) {
                            }
                            a8.f(th);
                            return;
                        }
                    } else {
                        str5 = str4;
                        jSONObject4 = jSONObject;
                        str7 = " ";
                        j15 = j10;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    str5 = str4;
                }
                try {
                    if (jSONObject3.has("topic_id")) {
                        try {
                            i12 = jSONObject3.getInt("topic_id");
                        } catch (Throwable th13) {
                            th = th13;
                            i10 = i11;
                        }
                    } else {
                        i12 = 0;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    str8 = str6;
                    sb2.append("recived push notification {");
                    sb2.append(str3);
                    sb2.append("} chatId ");
                    sb2.append(j15);
                    sb2.append(" custom topicId ");
                    sb2.append(i12);
                    a8.b(sb2.toString());
                    if (jSONObject3.has("encryption_id")) {
                        str9 = "loc_args";
                        str10 = "silent";
                        j13 = m5.F(jSONObject3.getInt("encryption_id"));
                    } else {
                        str9 = "loc_args";
                        str10 = "silent";
                    }
                    z10 = !jSONObject3.has("schedule") && jSONObject3.getInt("schedule") == 1;
                    if (j13 == j10 && "ENCRYPTED_MESSAGE".equals(str3)) {
                        j13 = dt.n0;
                    }
                    j16 = j13;
                    try {
                    } catch (Throwable th14) {
                        th = th14;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    i12 = i11;
                    i10 = i12;
                    str4 = str5;
                    i7 = -1;
                    if (i10 != i7) {
                    }
                    if (r2.a) {
                    }
                    a8.f(th);
                    return;
                }
                if (j16 != j10) {
                    String str22 = str9;
                    boolean z28 = z10;
                    if ("CONF_CALL_REQUEST".equals(str3)) {
                        j17 = j16;
                        str11 = "msg_id";
                        str12 = "call_id";
                    } else if ("CONF_VIDEOCALL_REQUEST".equals(str3)) {
                        j17 = j16;
                        str11 = "msg_id";
                        str12 = "call_id";
                    } else if ("READ_HISTORY".equals(str3)) {
                        int i24 = jSONObject3.getInt("max_id");
                        ArrayList arrayList = new ArrayList();
                        if (r2.a) {
                            a8.b(str + " received read notification max_id = " + i24 + " for dialogId = " + j16);
                        }
                        if (j11 != j10) {
                            TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                            tL_updateReadChannelInbox.channel_id = j11;
                            tL_updateReadChannelInbox.max_id = i24;
                            tL_updateReadChannelInbox.still_unread_count = 0;
                            arrayList.add(tL_updateReadChannelInbox);
                        } else {
                            TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                            if (j14 != j10) {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_updateReadHistoryInbox.peer = tL_peerUser;
                                tL_peerUser.user_id = j14;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_updateReadHistoryInbox.peer = tL_peerChat;
                                tL_peerChat.chat_id = j15;
                            }
                            tL_updateReadHistoryInbox.max_id = i24;
                            arrayList.add(tL_updateReadHistoryInbox);
                        }
                        qp.s1(i11).N3(arrayList, null, null, false, 0);
                    } else if ("READ_STORIES".equals(str3)) {
                        dt.k0.c(new us(dt.t(i11), j16, jSONObject3.getInt("max_id"), 1));
                    } else if ("STORY_DELETED".equals(str3)) {
                        dt.k0.c(new us(dt.t(i11), j16, jSONObject3.getInt("story_id"), 0));
                    } else if ("MESSAGE_DELETED".equals(str3)) {
                        String[] split = jSONObject3.getString("messages").split(",");
                        a0.h hVar = new a0.h();
                        ArrayList arrayList2 = new ArrayList();
                        for (String str23 : split) {
                            arrayList2.add(Utilities.z(str23));
                        }
                        hVar.k(arrayList2, -j11);
                        dt.t(i11).M(hVar, false);
                        qp.s1(i11).c0(j16, j11, arrayList2);
                        if (r2.a) {
                            a8.b(str + " received " + str3 + " for dialogId = " + j16 + " mids = " + TextUtils.join(",", arrayList2));
                        }
                    } else {
                        long j25 = j14;
                        if ("READ_REACTION".equals(str3)) {
                            String[] split2 = jSONObject3.getString("messages").split(",");
                            a0.h hVar2 = new a0.h();
                            ArrayList arrayList3 = new ArrayList();
                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                            for (String str24 : split2) {
                                Integer z29 = Utilities.z(str24);
                                int intValue2 = z29.intValue();
                                arrayList3.add(z29);
                                sparseBooleanArray.put(intValue2, false);
                            }
                            hVar2.k(arrayList3, -j11);
                            dt.t(i11).M(hVar2, true);
                            qp.s1(i11).P(j16, i12, sparseBooleanArray, true);
                            if (r2.a) {
                                a8.b(str + " received " + str3 + " for dialogId = " + j16 + " mids = " + TextUtils.join(",", arrayList3));
                            }
                        } else if (!TextUtils.isEmpty(str3)) {
                            if (jSONObject3.has("msg_id")) {
                                i14 = jSONObject3.getInt("msg_id");
                            } else if (jSONObject3.has("story_id")) {
                                i14 = jSONObject3.getInt("story_id");
                            } else {
                                i13 = i12;
                                i14 = 0;
                                if (jSONObject3.has("random_id")) {
                                    j18 = j15;
                                    j19 = j10;
                                } else {
                                    j18 = j15;
                                    j19 = Utilities.A(jSONObject3.getString("random_id")).longValue();
                                }
                                if (i14 != 0) {
                                    j20 = j11;
                                    if (j19 != j10) {
                                        break;
                                    }
                                } else {
                                    j20 = j11;
                                    Integer num = (Integer) qp.s1(i11).O.get(Long.valueOf(j16));
                                    if (num == null) {
                                        num = Integer.valueOf(yr.a0(i11).U(j16, false));
                                        qp.s1(i11).O.put(Long.valueOf(j16), num);
                                    }
                                    z11 = i14 > num.intValue();
                                }
                                if (!str3.startsWith("REACT_") || str3.startsWith("CHAT_REACT_")) {
                                    z11 = true;
                                }
                                z12 = z11;
                                if (!str3.equals("STORY_NOTEXT") || str3.equals("STORY_LIVE") || str3.equals("STORY_HIDDEN_AUTHOR")) {
                                    i15 = !jSONObject3.has("story_id") ? jSONObject3.getInt("story_id") : -1;
                                    z12 = i15 < 0;
                                } else {
                                    i15 = -1;
                                }
                                if (z12) {
                                    i12 = i11;
                                    if ("CONF_CALL_MISSED".equalsIgnoreCase(str3)) {
                                        VoIPGroupNotification.hideByCallId(t0.b, i12, jSONObject3.getLong("call_id"));
                                    }
                                } else {
                                    int i25 = i15;
                                    long j26 = j19;
                                    long j27 = j10;
                                    long optLong = jSONObject3.optLong("chat_from_id", j27);
                                    long optLong2 = jSONObject3.optLong("chat_from_broadcast_id", j27);
                                    long optLong3 = jSONObject3.optLong("chat_from_group_id", j27);
                                    int i26 = (optLong > j27 ? 1 : (optLong == j27 ? 0 : -1));
                                    if (i26 == 0 && optLong3 == j27) {
                                        z13 = false;
                                        if (jSONObject3.has("mention") || jSONObject3.getInt("mention") == 0) {
                                            String str25 = str10;
                                            i16 = i26;
                                            str13 = str25;
                                            z14 = false;
                                        } else {
                                            String str26 = str10;
                                            i16 = i26;
                                            str13 = str26;
                                            z14 = true;
                                        }
                                        if (jSONObject3.has(str13) || jSONObject3.getInt(str13) == 0) {
                                            JSONObject jSONObject7 = jSONObject4;
                                            z15 = z13;
                                            jSONObject5 = jSONObject7;
                                            z16 = false;
                                        } else {
                                            JSONObject jSONObject8 = jSONObject4;
                                            z15 = z13;
                                            jSONObject5 = jSONObject8;
                                            z16 = true;
                                        }
                                        boolean z30 = z14;
                                        if (jSONObject5.has(str22)) {
                                            i17 = i14;
                                            strArr2 = null;
                                        } else {
                                            JSONArray jSONArray = jSONObject5.getJSONArray(str22);
                                            int length = jSONArray.length();
                                            i17 = i14;
                                            String[] strArr3 = new String[length];
                                            for (int i27 = 0; i27 < length; i27++) {
                                                strArr3[i27] = jSONArray.getString(i27);
                                            }
                                            strArr2 = strArr3;
                                        }
                                        if (strArr2 != null && strArr2.length > 0) {
                                            str14 = strArr2[0];
                                            boolean has = jSONObject3.has("edit_date");
                                            if (str3.startsWith("CHAT_") || strArr2 == null || strArr2.length <= 0) {
                                                if (str3.startsWith("PINNED_")) {
                                                    if (str3.startsWith("CHANNEL_")) {
                                                        z17 = z28;
                                                        j21 = j18;
                                                        z18 = false;
                                                        z19 = true;
                                                        z20 = false;
                                                        str15 = null;
                                                        if (str3.startsWith("REACT_")) {
                                                        }
                                                        str16 = " for dialogId = ";
                                                        obj = "STORY_NOTEXT";
                                                        str17 = "REACT_";
                                                        str18 = "CHAT_REACT_";
                                                        j22 = optLong2;
                                                        z21 = z16;
                                                        z22 = z18;
                                                        String str27 = str14;
                                                        i12 = i11;
                                                        z23 = false;
                                                        reactedText = getReactedText(str3, strArr2);
                                                        z24 = false;
                                                        i18 = i17;
                                                        str19 = str27;
                                                        str20 = null;
                                                        str21 = reactedText;
                                                        if (r2.a) {
                                                        }
                                                        if (str21 != null) {
                                                        }
                                                    }
                                                    z17 = z28;
                                                    j21 = j18;
                                                    z18 = false;
                                                    z19 = false;
                                                    z20 = false;
                                                    str15 = null;
                                                    if (str3.startsWith("REACT_")) {
                                                    }
                                                    str16 = " for dialogId = ";
                                                    obj = "STORY_NOTEXT";
                                                    str17 = "REACT_";
                                                    str18 = "CHAT_REACT_";
                                                    j22 = optLong2;
                                                    z21 = z16;
                                                    z22 = z18;
                                                    String str272 = str14;
                                                    i12 = i11;
                                                    z23 = false;
                                                    reactedText = getReactedText(str3, strArr2);
                                                    z24 = false;
                                                    i18 = i17;
                                                    str19 = str272;
                                                    str20 = null;
                                                    str21 = reactedText;
                                                    if (r2.a) {
                                                    }
                                                    if (str21 != null) {
                                                    }
                                                } else {
                                                    z17 = z28;
                                                    j21 = j18;
                                                    z19 = false;
                                                    str15 = null;
                                                    z20 = j20 != 0;
                                                    z18 = true;
                                                    if (!str3.startsWith("REACT_") || str3.startsWith("CHAT_REACT_")) {
                                                        str16 = " for dialogId = ";
                                                        obj = "STORY_NOTEXT";
                                                        str17 = "REACT_";
                                                        str18 = "CHAT_REACT_";
                                                        j22 = optLong2;
                                                        z21 = z16;
                                                        z22 = z18;
                                                        String str2722 = str14;
                                                        i12 = i11;
                                                        z23 = false;
                                                        reactedText = getReactedText(str3, strArr2);
                                                        z24 = false;
                                                        i18 = i17;
                                                        str19 = str2722;
                                                        str20 = null;
                                                    } else {
                                                        z22 = z18;
                                                        String str28 = str14;
                                                        str18 = "CHAT_REACT_";
                                                        str17 = "REACT_";
                                                        z21 = z16;
                                                        j22 = optLong2;
                                                        str16 = " for dialogId = ";
                                                        JSONObject jSONObject9 = jSONObject3;
                                                        switch (str3.hashCode()) {
                                                            case -2104766184:
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (str3.equals(obj)) {
                                                                    str21 = id.L0(2131744597);
                                                                    z24 = false;
                                                                    i18 = i25;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    break;
                                                                }
                                                                if (r2.a) {
                                                                    a8.l("unhandled loc_key = " + str3);
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -2100047043:
                                                                i12 = i11;
                                                                if (!str3.equals("MESSAGE_GAME_SCORE")) {
                                                                    z23 = false;
                                                                    obj = "STORY_NOTEXT";
                                                                    if (r2.a) {
                                                                    }
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                z23 = false;
                                                                Y2 = id.Y(2131748005, "NotificationMessageGameScored", strArr2[0], strArr2[1], strArr2[2]);
                                                                z24 = false;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = Y2;
                                                                obj = "STORY_NOTEXT";
                                                                break;
                                                            case -2091498420:
                                                                i12 = i11;
                                                                if (str3.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                                    Y = id.Y(2131752373, "ChannelMessageContact2", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753979);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -2053872415:
                                                                i12 = i11;
                                                                break;
                                                            case -2039746363:
                                                                String str29 = str7;
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_STICKER")) {
                                                                    if (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) {
                                                                        Y = id.Y(2131747958, "NotificationMessageSticker", strArr2[0]);
                                                                        L0 = id.L0(2131753936);
                                                                    } else {
                                                                        Y = id.Y(2131747957, "NotificationMessageStickerEmoji", strArr2[0], strArr2[1]);
                                                                        L0 = strArr2[1] + str29 + id.L0(2131753936);
                                                                    }
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -2023218804:
                                                                i12 = i11;
                                                                if (str3.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                                    Y2 = id.Y(2131752371, "ChannelMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Videos", new Object[0]));
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1979538588:
                                                                i12 = i11;
                                                                if (str3.equals("CHANNEL_MESSAGE_DOC")) {
                                                                    Y = id.Y(2131752372, "ChannelMessageDocument", strArr2[0]);
                                                                    L0 = id.L0(2131753975);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1979536003:
                                                                i12 = i11;
                                                                if (str3.equals("CHANNEL_MESSAGE_GEO")) {
                                                                    Y = id.Y(2131752368, "ChannelMessageMap", strArr2[0]);
                                                                    L0 = id.L0(2131753961);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1979535888:
                                                                i12 = i11;
                                                                if (str3.equals("CHANNEL_MESSAGE_GIF")) {
                                                                    Y = id.Y(2131752370, "ChannelMessageGIF", strArr2[0]);
                                                                    L0 = id.L0(2131753971);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1969004705:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_ADD_MEMBER")) {
                                                                    Y2 = id.Y(2131748035, "NotificationGroupAddMember", strArr2[0], strArr2[1], strArr2[2]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1946699248:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_JOINED")) {
                                                                    Y2 = id.Y(2131748033, "NotificationGroupAddSelfMega", strArr2[0], strArr2[1]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1891964556:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                                    Y2 = id.Z(2131747982, strArr2[0], strArr2[1], strArr2[2]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1833440864:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                                    try {
                                                                        i20 = Integer.parseInt(strArr2[2]);
                                                                    } catch (Exception unused) {
                                                                        i20 = 1;
                                                                    }
                                                                    Y = id.Z(2131748011, strArr2[0], strArr2[1], id.G(i20, "AmongWinners", new Object[0]), strArr2[3]);
                                                                    L0 = id.L0(2131753492);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1717283471:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_REQ_JOINED")) {
                                                                    Y2 = id.Y(2131743772, "UserAcceptedToGroupPushWithGroup", strArr2[0], strArr2[1]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1646640058:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_VOICECHAT_START")) {
                                                                    Y2 = id.Y(2131748031, "NotificationGroupCreatedCall", strArr2[0], strArr2[1]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1633328296:
                                                                i12 = i11;
                                                                if (str3.equals("PINNED_PAID_MEDIA")) {
                                                                    int parseInt = Integer.parseInt(strArr2[1]);
                                                                    reactedText = id.G(parseInt, "NotificationPinnedPaidMedia", strArr2[0]);
                                                                    str20 = id.G(parseInt, "NotificationPinnedPaidMedia", strArr2[0]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1528047021:
                                                                i12 = i11;
                                                                if (str3.equals("CHAT_MESSAGES")) {
                                                                    Y2 = id.Y(2131748032, "NotificationGroupAlbum", strArr2[0], strArr2[1]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1507149394:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_RECURRING_PAY")) {
                                                                    Y = id.Y(2131747968, "NotificationMessageRecurringPay", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131747399);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1493579426:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_AUDIO")) {
                                                                    Y = id.Z(2131748015, strArr2[0]);
                                                                    L0 = id.L0(2131753982);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1482481933:
                                                                i12 = i11;
                                                                break;
                                                            case -1480102982:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_PHOTO")) {
                                                                    Y = id.Y(2131747971, "NotificationMessagePhoto", strArr2[0]);
                                                                    L0 = id.L0(2131753948);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1478041834:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_ROUND")) {
                                                                    Y = id.Y(2131747967, "NotificationMessageRound", strArr2[0]);
                                                                    L0 = id.L0(2131753941);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1476974979:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_STORY")) {
                                                                    Y = id.Y(2131747932, "NotificationStory", strArr2[0]);
                                                                    L0 = id.L0(2131744738);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1474543101:
                                                                i12 = i11;
                                                                if (str3.equals("MESSAGE_VIDEO")) {
                                                                    Y = id.Y(2131747947, "NotificationMessageVideo", strArr2[0]);
                                                                    L0 = id.L0(2131753933);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1465695932:
                                                                i12 = i11;
                                                                if (str3.equals("ENCRYPTION_ACCEPT")) {
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1428026623:
                                                                if (str3.equals("CONF_CALL_MISSED")) {
                                                                    i12 = i11;
                                                                    VoIPGroupNotification.hideByCallId(t0.b, i12, jSONObject9.getLong("call_id"));
                                                                    int parseInt2 = Integer.parseInt(strArr2[1]);
                                                                    Y2 = parseInt2 <= 0 ? id.Z(2131748120, strArr2[0]) : id.J(parseInt2, "NotificationActionMissedCallConferenceOther", strArr2[0]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1374906292:
                                                                if (str3.equals("ENCRYPTED_MESSAGE")) {
                                                                    Y2 = id.L0(2131742840);
                                                                    str19 = id.L0(2131745696);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1372940586:
                                                                if (str3.equals("CHAT_RETURNED")) {
                                                                    Y2 = id.Y(2131748034, "NotificationGroupAddSelf", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1264245338:
                                                                if (str3.equals("PINNED_INVOICE")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748093, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748095, strArr2[0], strArr2[1]) : id.Z(2131748094, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1236154001:
                                                                if (str3.equals("CHANNEL_MESSAGE_DOCS")) {
                                                                    Y2 = id.Y(2131752371, "ChannelMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Files", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1236086700:
                                                                if (str3.equals("CHANNEL_MESSAGE_FWDS")) {
                                                                    Y2 = id.Y(2131752371, "ChannelMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "ForwardedMessageCount", new Object[0]).toLowerCase());
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1236077786:
                                                                if (str3.equals("CHANNEL_MESSAGE_GAME")) {
                                                                    Y = id.Y(2131748006, "NotificationMessageGame", strArr2[0]);
                                                                    L0 = id.L0(2131753972);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1235796237:
                                                                if (str3.equals("CHANNEL_MESSAGE_POLL")) {
                                                                    Y = id.Z(2131752364, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131747186);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1235760759:
                                                                if (str3.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                                    Y = id.Y(2131752363, "ChannelMessageQuiz2", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131746446);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1235686303:
                                                                break;
                                                            case -1235677318:
                                                                if (str3.equals("CHANNEL_MESSAGE_TODO")) {
                                                                    Y = id.Z(2131752359, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131744112);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1198046100:
                                                                if (str3.equals("MESSAGE_VIDEO_SECRET")) {
                                                                    Y = id.Y(2131747965, "NotificationMessageSDVideo", strArr2[0]);
                                                                    L0 = id.L0(2131753976);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1124254527:
                                                                if (str3.equals("CHAT_MESSAGE_CONTACT")) {
                                                                    Y = id.Y(2131748000, "NotificationMessageGroupContact2", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131753979);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1085137927:
                                                                if (str3.equals("PINNED_GAME")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748105, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748110, strArr2[0], strArr2[1]) : id.Z(2131748109, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1084856378:
                                                                if (str3.equals("PINNED_POLL")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748081, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748083, strArr2[0], strArr2[2], strArr2[1]) : id.Z(2131748082, strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1084820900:
                                                                if (str3.equals("PINNED_QUIZ")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748078, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748080, strArr2[0], strArr2[2], strArr2[1]) : id.Z(2131748079, strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1084746444:
                                                                if (str3.equals("PINNED_TEXT")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748066, "NotificationActionPinnedTextUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748068, "NotificationActionPinnedText", strArr2[0], strArr2[1], strArr2[2]) : id.Y(2131748067, "NotificationActionPinnedTextChannel", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -1084737459:
                                                                if (str3.equals("PINNED_TODO")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748063, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748065, strArr2[0], strArr2[2], strArr2[1]) : id.Z(2131748064, strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -947756761:
                                                                if (str3.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                                    Y2 = id.Z(2131752357, strArr2[0], strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -891852842:
                                                                if (str3.equals("STORY_HIDDEN_AUTHOR")) {
                                                                    G = id.G(1, "StoryNotificationHidden", new Object[0]);
                                                                    str21 = G;
                                                                    i12 = i11;
                                                                    i18 = i25;
                                                                    str19 = str28;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -819729482:
                                                                if (str3.equals("PINNED_STICKER")) {
                                                                    Y2 = j16 > j10 ? (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) ? id.Y(2131748069, "NotificationActionPinnedStickerUser", strArr2[0]) : id.Y(2131748070, "NotificationActionPinnedStickerEmojiUser", strArr2[0], strArr2[1]) : z15 ? (strArr2.length <= 2 || TextUtils.isEmpty(strArr2[2])) ? id.Y(2131748074, "NotificationActionPinnedSticker", strArr2[0], strArr2[1]) : id.Y(2131748072, "NotificationActionPinnedStickerEmoji", strArr2[0], strArr2[2], strArr2[1]) : (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) ? id.Y(2131748073, "NotificationActionPinnedStickerChannel", strArr2[0]) : id.Y(2131748071, "NotificationActionPinnedStickerEmojiChannel", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -772141857:
                                                                if (str3.equals("PHONE_CALL_REQUEST")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -706345256:
                                                                if (str3.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                                    str15 = strArr2[0];
                                                                    Y = id.Z(2131747953, str15);
                                                                    L0 = id.L0(2131749897);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -638310039:
                                                                String str30 = str7;
                                                                if (str3.equals("CHANNEL_MESSAGE_STICKER")) {
                                                                    if (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) {
                                                                        Y = id.Y(2131752361, "ChannelMessageSticker", strArr2[0]);
                                                                        L0 = id.L0(2131753936);
                                                                    } else {
                                                                        Y = id.Y(2131752360, "ChannelMessageStickerEmoji", strArr2[0], strArr2[1]);
                                                                        L0 = strArr2[1] + str30 + id.L0(2131753936);
                                                                    }
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -590403924:
                                                                if (str3.equals("PINNED_GAME_SCORE")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748106, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748108, strArr2[0], strArr2[1]) : id.Z(2131748107, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -589196239:
                                                                if (str3.equals("PINNED_DOC")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748111, "NotificationActionPinnedFileUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748113, "NotificationActionPinnedFile", strArr2[0], strArr2[1]) : id.Y(2131748112, "NotificationActionPinnedFileChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -589193654:
                                                                if (str3.equals("PINNED_GEO")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748099, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748104, strArr2[0], strArr2[1]) : id.Z(2131748103, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -589193539:
                                                                if (str3.equals("PINNED_GIF")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748096, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748098, strArr2[0], strArr2[1]) : id.Z(2131748097, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -573031834:
                                                                break;
                                                            case -455004278:
                                                                if (str3.equals("MESSAGE_WALLPAPER")) {
                                                                    Y = id.Y(2131754564, "ActionSetWallpaperForThisChat", strArr2[0]);
                                                                    L0 = id.L0(2131742956);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -440169325:
                                                                if (str3.equals("AUTH_UNKNOWN")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -412748110:
                                                                if (str3.equals("CHAT_DELETE_YOU")) {
                                                                    Y2 = id.Y(2131748024, "NotificationGroupKickYou", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -346082433:
                                                                if (str3.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                                    Y2 = id.Z(2131752358, strArr2[0], strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -242433887:
                                                                if (str3.equals("MESSAGE_SAME_WALLPAPER")) {
                                                                    Y = id.Y(2131754567, "ActionSetSameWallpaperForThisChat", strArr2[0]);
                                                                    L0 = id.L0(2131742954);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -228518075:
                                                                if (str3.equals("MESSAGE_GEOLIVE")) {
                                                                    Y = id.Y(2131747978, "NotificationMessageLiveLocation", strArr2[0]);
                                                                    L0 = id.L0(2131753966);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -213586509:
                                                                if (str3.equals("ENCRYPTION_REQUEST")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -115582002:
                                                                if (str3.equals("CHAT_MESSAGE_INVOICE")) {
                                                                    Y = id.Y(2131747995, "NotificationMessageGroupInvoice", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131747399);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -112621464:
                                                                if (str3.equals("CONTACT_JOINED")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -108522133:
                                                                if (str3.equals("AUTH_REGION")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -107572034:
                                                                if (str3.equals("MESSAGE_SCREENSHOT")) {
                                                                    Y2 = id.L0(2131754535).replace("un1", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -77243824:
                                                                if (str3.equals("MESSAGE_SUGGEST_BIRTHDAY")) {
                                                                    Y2 = id.Z(2131747956, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -40534265:
                                                                if (str3.equals("CHAT_DELETE_MEMBER")) {
                                                                    Y2 = id.Y(2131748025, "NotificationGroupKickMember", strArr2[0], strArr2[1], strArr2.length <= 2 ? str8 : strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case -35560251:
                                                                if (str3.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                                    int parseInt3 = Integer.parseInt(strArr2[1]);
                                                                    Y = id.G(parseInt3, "NotificationChannelMessagePaidMedia", strArr2[0]);
                                                                    L0 = id.G(parseInt3, "NotificationPaidMedia", new Object[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 52369421:
                                                                break;
                                                            case 65254746:
                                                                if (str3.equals("CHAT_ADD_YOU")) {
                                                                    i12 = i11;
                                                                    Y2 = id.Y(2131748018, "NotificationInvitedToGroup", strArr2[0], strArr2[1]);
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 120441350:
                                                                if (str3.equals("PINNED_GIVEAWAY")) {
                                                                    Y2 = id.Z(2131747942, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 141040782:
                                                                if (str3.equals("CHAT_LEFT")) {
                                                                    Y2 = id.Y(2131748023, "NotificationGroupLeftMember", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 172201318:
                                                                if (str3.equals("MESSAGE_GRAM_TRANSFER_UNKNOWN_COMMENT")) {
                                                                    boolean startsWith = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                                    boolean endsWith = str3.endsWith("_COMMENT");
                                                                    if (strArr2 != null) {
                                                                        if (strArr2.length >= (endsWith ? 3 : 2)) {
                                                                            str20 = id.Z(startsWith ? endsWith ? 2131748036 : 2131748037 : endsWith ? 2131748038 : 2131748039, strArr2);
                                                                            i12 = i11;
                                                                            i18 = i17;
                                                                            str19 = str28;
                                                                            obj = "STORY_NOTEXT";
                                                                            z23 = false;
                                                                            z24 = false;
                                                                            str21 = str20;
                                                                            break;
                                                                        }
                                                                    }
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 191667248:
                                                                if (str3.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                                    int parseInt4 = Integer.parseInt(strArr2[2]);
                                                                    Y = id.G(parseInt4, "NotificationChatMessagePaidMedia", strArr2[0], strArr2[1]);
                                                                    L0 = id.G(parseInt4, "NotificationPaidMedia", new Object[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 202550149:
                                                                if (str3.equals("CHAT_VOICECHAT_INVITE")) {
                                                                    Y2 = id.Y(2131748027, "NotificationGroupInvitedToCall", strArr2[0], strArr2[1], strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 309993049:
                                                                if (str3.equals("CHAT_MESSAGE_DOC")) {
                                                                    Y = id.Y(2131747999, "NotificationMessageGroupDocument", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753975);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 309995634:
                                                                if (str3.equals("CHAT_MESSAGE_GEO")) {
                                                                    Y = id.Y(2131747993, "NotificationMessageGroupMap", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753961);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 309995749:
                                                                if (str3.equals("CHAT_MESSAGE_GIF")) {
                                                                    Y = id.Y(2131747996, "NotificationMessageGroupGif", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753971);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 320532812:
                                                                if (str3.equals("MESSAGES")) {
                                                                    Y2 = id.Z(2131748016, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 328933854:
                                                                if (str3.equals("CHAT_MESSAGE_STICKER")) {
                                                                    if (strArr2.length <= 2 || TextUtils.isEmpty(strArr2[2])) {
                                                                        Y = id.Y(2131747986, "NotificationMessageGroupSticker", strArr2[0], strArr2[1]);
                                                                        L0 = strArr2[1] + str7 + id.L0(2131753936);
                                                                    } else {
                                                                        Y = id.Y(2131747985, "NotificationMessageGroupStickerEmoji", strArr2[0], strArr2[1], strArr2[2]);
                                                                        L0 = strArr2[2] + str7 + id.L0(2131753936);
                                                                    }
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 331340546:
                                                                if (str3.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                                    Y = id.Y(2131752374, "ChannelMessageAudio", strArr2[0]);
                                                                    L0 = id.L0(2131753982);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 342406591:
                                                                if (str3.equals("CHAT_VOICECHAT_END")) {
                                                                    Y2 = id.Y(2131748030, "NotificationGroupEndedCall", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 344816990:
                                                                if (str3.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                                    Y = id.Y(2131752365, "ChannelMessagePhoto", strArr2[0]);
                                                                    L0 = id.L0(2131753948);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 346878138:
                                                                if (str3.equals("CHANNEL_MESSAGE_ROUND")) {
                                                                    Y = id.Y(2131752362, "ChannelMessageRound", strArr2[0]);
                                                                    L0 = id.L0(2131753941);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 347944993:
                                                                if (str3.equals("CHANNEL_MESSAGE_STORY")) {
                                                                    Y = id.Y(2131748053, "NotificationChannelStory", strArr2[0]);
                                                                    L0 = id.L0(2131744738);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 350376871:
                                                                if (str3.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                                    Y = id.Y(2131752356, "ChannelMessageVideo", strArr2[0]);
                                                                    L0 = id.L0(2131753933);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 469501563:
                                                                if (str3.equals("MESSAGE_GRAM_TRANSFER")) {
                                                                    boolean startsWith2 = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                                    boolean endsWith2 = str3.endsWith("_COMMENT");
                                                                    if (strArr2 != null) {
                                                                    }
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 510462069:
                                                                if (str3.equals("MESSAGE_GIFTCODE")) {
                                                                    Y2 = id.Y(2131748003, "NotificationMessageGiftCode", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Months", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 608430149:
                                                                if (str3.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                                    Y2 = id.Y(2131748026, "NotificationGroupInvitedYouToCall", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 615714517:
                                                                if (str3.equals("MESSAGE_PHOTO_SECRET")) {
                                                                    Y = id.Y(2131747966, "NotificationMessageSDPhoto", strArr2[0]);
                                                                    L0 = id.L0(2131753977);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 662207611:
                                                                if (str3.equals("MESSAGE_GRAM_TRANSFER_COMMENT")) {
                                                                    boolean startsWith22 = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                                    boolean endsWith22 = str3.endsWith("_COMMENT");
                                                                    if (strArr2 != null) {
                                                                    }
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 702966260:
                                                                if (str3.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                                    str15 = strArr2[0];
                                                                    Y = id.Z(2131747949, str15);
                                                                    L0 = id.L0(2131749891);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 715508879:
                                                                if (str3.equals("PINNED_AUDIO")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748057, "NotificationActionPinnedVoiceUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748059, "NotificationActionPinnedVoice", strArr2[0], strArr2[1]) : id.Y(2131748058, "NotificationActionPinnedVoiceChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 728985323:
                                                                if (str3.equals("PINNED_PHOTO")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748084, "NotificationActionPinnedPhotoUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748086, "NotificationActionPinnedPhoto", strArr2[0], strArr2[1]) : id.Y(2131748085, "NotificationActionPinnedPhotoChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 731046471:
                                                                if (str3.equals("PINNED_ROUND")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748075, "NotificationActionPinnedRoundUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748077, "NotificationActionPinnedRound", strArr2[0], strArr2[1]) : id.Y(2131748076, "NotificationActionPinnedRoundChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 734545204:
                                                                if (str3.equals("PINNED_VIDEO")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748060, "NotificationActionPinnedVideoUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748062, "NotificationActionPinnedVideo", strArr2[0], strArr2[1]) : id.Y(2131748061, "NotificationActionPinnedVideoChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 802032552:
                                                                if (str3.equals("MESSAGE_CONTACT")) {
                                                                    Y = id.Z(2131748010, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753979);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 860688476:
                                                                if (str3.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                                    Y2 = id.Z(2131747981, strArr2[0], strArr2[1], strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 901537717:
                                                                if (str3.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                                    try {
                                                                        i21 = Integer.parseInt(strArr2[1]);
                                                                    } catch (Exception unused2) {
                                                                        i21 = 1;
                                                                    }
                                                                    Y = id.Z(2131748013, strArr2[0], id.G(i21, "AmongWinners", new Object[0]), strArr2[2]);
                                                                    L0 = id.L0(2131753492);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 954623703:
                                                                if (str3.equals("MESSAGE_GIVEAWAY")) {
                                                                    Y2 = id.Y(2131748002, "NotificationMessageGiveaway", strArr2[0], strArr2[1], strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 977076186:
                                                                if (str3.equals("MESSAGE_STARGIFT")) {
                                                                    str15 = strArr2[0];
                                                                    Y = id.J(Integer.parseInt(strArr2[1]), "NotificationMessageStarGift", strArr2[0]);
                                                                    L0 = id.I(Integer.parseInt(strArr2[1]), "Gift2Notification");
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 991498806:
                                                                if (str3.equals("PINNED_GEOLIVE")) {
                                                                    Y2 = j16 > j10 ? id.Z(2131748100, strArr2[0], strArr2[1]) : z15 ? id.Z(2131748102, strArr2[0], strArr2[1]) : id.Z(2131748101, strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1007364121:
                                                                if (str3.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                                    i12 = i11;
                                                                    z23 = false;
                                                                    Y2 = id.Y(2131748005, "NotificationMessageGameScored", strArr2[0], strArr2[1], strArr2[2]);
                                                                    z24 = false;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1019850010:
                                                                if (str3.equals("CHAT_MESSAGE_DOCS")) {
                                                                    Y2 = id.Y(2131748029, "NotificationGroupFew", strArr2[0], strArr2[1], id.G(Utilities.z(strArr2[2]).intValue(), "Files", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1019917311:
                                                                if (str3.equals("CHAT_MESSAGE_FWDS")) {
                                                                    Y2 = id.Y(2131748028, "NotificationGroupForwardedFew", strArr2[0], strArr2[1], id.G(Utilities.z(strArr2[2]).intValue(), "messages", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1019926225:
                                                                if (str3.equals("CHAT_MESSAGE_GAME")) {
                                                                    Y = id.Y(2131747998, "NotificationMessageGroupGame", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131753972);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1020207774:
                                                                if (str3.equals("CHAT_MESSAGE_POLL")) {
                                                                    Y = id.Z(2131747989, strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131747186);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1020243252:
                                                                if (str3.equals("CHAT_MESSAGE_QUIZ")) {
                                                                    Y = id.Y(2131747988, "NotificationMessageGroupQuiz2", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131747165);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1020317708:
                                                                if (str3.equals("CHAT_MESSAGE_TEXT")) {
                                                                    Y = id.Y(2131747984, "NotificationMessageGroupText", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = strArr2[2];
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1020326693:
                                                                if (str3.equals("CHAT_MESSAGE_TODO")) {
                                                                    Y = id.Z(2131747983, strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131744112);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1054583304:
                                                                if (str3.equals("MESSAGE_STORY_MENTION")) {
                                                                    Y2 = id.L0(2131744598);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060282259:
                                                                if (str3.equals("MESSAGE_DOCS")) {
                                                                    Y2 = id.Y(2131748008, "NotificationMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Files", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060349560:
                                                                if (str3.equals("MESSAGE_FWDS")) {
                                                                    Y2 = id.Y(2131748007, "NotificationMessageForwardFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "messages", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060358474:
                                                                if (str3.equals("MESSAGE_GAME")) {
                                                                    Y = id.Y(2131748006, "NotificationMessageGame", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753972);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060640023:
                                                                if (str3.equals("MESSAGE_POLL")) {
                                                                    Y = id.Z(2131747970, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131747186);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060675501:
                                                                if (str3.equals("MESSAGE_QUIZ")) {
                                                                    Y = id.Z(2131747969, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131746446);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060749957:
                                                                if (str3.equals("MESSAGE_TEXT")) {
                                                                    Y = id.Y(2131747955, "NotificationMessageText", strArr2[0], strArr2[1]);
                                                                    L0 = strArr2[1];
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1060758942:
                                                                if (str3.equals("MESSAGE_TODO")) {
                                                                    Y = id.Z(2131747954, strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131744112);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1073049781:
                                                                if (str3.equals("PINNED_NOTEXT")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748087, "NotificationActionPinnedNoTextUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748089, "NotificationActionPinnedNoText", strArr2[0], strArr2[1]) : id.Y(2131748088, "NotificationActionPinnedNoTextChannel", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1078101399:
                                                                if (str3.equals("CHAT_TITLE_EDITED")) {
                                                                    Y2 = id.Y(2131748044, "NotificationEditedGroupName", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1110103437:
                                                                if (str3.equals("CHAT_MESSAGE_NOTEXT")) {
                                                                    Y = id.Y(2131747991, "NotificationMessageGroupNoText", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131748604);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1144183001:
                                                                if (str3.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                                    try {
                                                                        i22 = Integer.parseInt(strArr2[1]);
                                                                    } catch (Exception unused3) {
                                                                        i22 = 1;
                                                                    }
                                                                    Y2 = id.Z(2131747959, strArr2[0], id.G(i22, "AmongWinners", new Object[0]), strArr2[2]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1151995881:
                                                                if (str3.equals("MESSAGE_PAID_MEDIA")) {
                                                                    int parseInt5 = Integer.parseInt(strArr2[1]);
                                                                    Y = id.G(parseInt5, "NotificationMessagePaidMedia", strArr2[0]);
                                                                    L0 = id.G(parseInt5, "NotificationPaidMedia", new Object[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1160762272:
                                                                if (str3.equals("CHAT_MESSAGE_PHOTOS")) {
                                                                    Y2 = id.Y(2131748029, "NotificationGroupFew", strArr2[0], strArr2[1], id.G(Utilities.z(strArr2[2]).intValue(), "Photos", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1172918249:
                                                                if (str3.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                                    Y = id.Y(2131752369, "ChannelMessageLiveLocation", strArr2[0]);
                                                                    L0 = id.L0(2131753966);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1234591620:
                                                                if (str3.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                                    Y2 = id.Y(2131747997, "NotificationMessageGroupGameScored", strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1281128640:
                                                                if (str3.equals("MESSAGE_DOC")) {
                                                                    Y = id.Y(2131748009, "NotificationMessageDocument", strArr2[0]);
                                                                    L0 = id.L0(2131753975);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1281131225:
                                                                if (str3.equals("MESSAGE_GEO")) {
                                                                    Y = id.Y(2131747977, "NotificationMessageMap", strArr2[0]);
                                                                    L0 = id.L0(2131753961);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1281131340:
                                                                if (str3.equals("MESSAGE_GIF")) {
                                                                    Y = id.Y(2131748004, "NotificationMessageGif", strArr2[0]);
                                                                    L0 = id.L0(2131753971);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1310789062:
                                                                if (str3.equals("MESSAGE_NOTEXT")) {
                                                                    Y = id.Y(2131747975, "NotificationMessageNoText", strArr2[0]);
                                                                    L0 = id.L0(2131748604);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1333118583:
                                                                if (str3.equals("CHAT_MESSAGE_VIDEOS")) {
                                                                    Y2 = id.Y(2131748029, "NotificationGroupFew", strArr2[0], strArr2[1], id.G(Utilities.z(strArr2[2]).intValue(), "Videos", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1361447897:
                                                                if (str3.equals("MESSAGE_PHOTOS")) {
                                                                    Y2 = id.Y(2131748008, "NotificationMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Photos", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1369266398:
                                                                if (str3.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                                    Y = id.Y(2131748012, "NotificationMessageChatGiveaway", strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                                    L0 = id.L0(2131753492);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1420317335:
                                                                if (str3.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                                    str15 = strArr2[0];
                                                                    Y = id.Z(2131747948, str15);
                                                                    L0 = id.L0(2131749890);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1449476787:
                                                                if (str3.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                                    Y = id.Y(2131748014, "NotificationMessageChannelGiveaway", strArr2[0], strArr2[1], strArr2[2]);
                                                                    L0 = id.L0(2131753492);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1498266155:
                                                                if (str3.equals("PHONE_CALL_MISSED")) {
                                                                    i12 = i11;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = z23;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    str20 = null;
                                                                    str21 = null;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1533804208:
                                                                if (str3.equals("MESSAGE_VIDEOS")) {
                                                                    Y2 = id.Y(2131748008, "NotificationMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Videos", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1540131626:
                                                                if (str3.equals("MESSAGE_PLAYLIST")) {
                                                                    Y2 = id.Y(2131748008, "NotificationMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "MusicFiles", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1547988151:
                                                                if (str3.equals("CHAT_MESSAGE_AUDIO")) {
                                                                    Y = id.Y(2131748001, "NotificationMessageGroupAudio", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753982);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1561464595:
                                                                if (str3.equals("CHAT_MESSAGE_PHOTO")) {
                                                                    Y = id.Y(2131747990, "NotificationMessageGroupPhoto", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753948);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1563525743:
                                                                if (str3.equals("CHAT_MESSAGE_ROUND")) {
                                                                    Y = id.Y(2131747987, "NotificationMessageGroupRound", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753941);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1564592598:
                                                                if (str3.equals("CHAT_MESSAGE_STORY")) {
                                                                    Y = id.Y(2131748048, "NotificationChatStory", strArr2[0]);
                                                                    L0 = id.L0(2131744738);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1567024476:
                                                                if (str3.equals("CHAT_MESSAGE_VIDEO")) {
                                                                    Y = id.Y(2131747980, "NotificationMessageGroupVideo", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753933);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1810705077:
                                                                if (str3.equals("MESSAGE_INVOICE")) {
                                                                    Y = id.Y(2131747979, "NotificationMessageInvoice", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131747399);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1815177512:
                                                                if (str3.equals("CHANNEL_MESSAGES")) {
                                                                    Y2 = id.Y(2131752375, "ChannelMessageAlbum", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1837240696:
                                                                if (str3.equals("CHAT_REACT_PAID_MEDIA")) {
                                                                    int parseInt6 = Integer.parseInt(strArr2[1]);
                                                                    reactedText = id.G(parseInt6, "NotificationPinnedPaidMedia", strArr2[0]);
                                                                    str20 = id.G(parseInt6, "NotificationPinnedPaidMedia", strArr2[0]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1954774321:
                                                                if (str3.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                                    Y2 = id.Y(2131748029, "NotificationGroupFew", strArr2[0], strArr2[1], id.G(Utilities.z(strArr2[2]).intValue(), "MusicFiles", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 1963241394:
                                                                break;
                                                            case 2008915478:
                                                                if (str3.equals("STORY_LIVE")) {
                                                                    G = id.L0(2131744625);
                                                                    str21 = G;
                                                                    i12 = i11;
                                                                    i18 = i25;
                                                                    str19 = str28;
                                                                    obj = "STORY_NOTEXT";
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2014789757:
                                                                if (str3.equals("CHAT_PHOTO_EDITED")) {
                                                                    Y2 = id.Y(2131748043, "NotificationEditedGroupPhoto", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2022049433:
                                                                if (str3.equals("PINNED_CONTACT")) {
                                                                    Y2 = j16 > j10 ? id.Y(2131748114, "NotificationActionPinnedContactUser", strArr2[0], strArr2[1]) : z15 ? id.Y(2131748116, "NotificationActionPinnedContact2", strArr2[0], strArr2[2], strArr2[1]) : id.Y(2131748115, "NotificationActionPinnedContactChannel2", strArr2[0], strArr2[1]);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = false;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2034984710:
                                                                if (str3.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                                    Y2 = id.Y(2131752371, "ChannelMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "MusicFiles", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2048733346:
                                                                if (str3.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                                    Y = id.Y(2131752366, "ChannelMessageNoText", strArr2[0]);
                                                                    L0 = id.L0(2131748604);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2099392181:
                                                                if (str3.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                                    Y2 = id.Y(2131752371, "ChannelMessageFew", strArr2[0], id.G(Utilities.z(strArr2[1]).intValue(), "Photos", new Object[0]));
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    str20 = null;
                                                                    z24 = true;
                                                                    str21 = Y2;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2103150375:
                                                                if (str3.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                                    str15 = strArr2[0];
                                                                    Y = id.J(Integer.parseInt(strArr2[1]), "NotificationMessageUniqueStarGiftPrepaidUpgrade", strArr2[0]);
                                                                    L0 = id.L0(2131749896);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            case 2140162142:
                                                                if (str3.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                                    Y = id.Y(2131747994, "NotificationMessageGroupLiveLocation", strArr2[0], strArr2[1]);
                                                                    L0 = id.L0(2131753966);
                                                                    i12 = i11;
                                                                    i18 = i17;
                                                                    str19 = str28;
                                                                    z23 = false;
                                                                    z24 = false;
                                                                    str21 = Y;
                                                                    str20 = L0;
                                                                    obj = "STORY_NOTEXT";
                                                                    break;
                                                                }
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                            default:
                                                                i12 = i11;
                                                                obj = "STORY_NOTEXT";
                                                                z23 = false;
                                                                if (r2.a) {
                                                                }
                                                                z24 = z23;
                                                                i18 = i17;
                                                                str19 = str28;
                                                                str20 = null;
                                                                str21 = null;
                                                                break;
                                                        }
                                                        if (r2.a) {
                                                            j23 = j16;
                                                        } else {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append(str);
                                                            sb3.append(" received message notification ");
                                                            sb3.append(str3);
                                                            sb3.append(str16);
                                                            j23 = j16;
                                                            sb3.append(j23);
                                                            sb3.append(" mid = ");
                                                            sb3.append(i18);
                                                            a8.b(sb3.toString());
                                                        }
                                                        if (str21 != null) {
                                                            if (!str3.equals("REACT_STORY") && !str3.equals("REACT_STORY_HIDDEN")) {
                                                                z25 = z23;
                                                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                                if (z25 && i18 > 0) {
                                                                    i18 = -i18;
                                                                }
                                                                tL_message.id = i18;
                                                                tL_message.random_id = j26;
                                                                if (str20 != null) {
                                                                    str20 = str21;
                                                                }
                                                                tL_message.message = str20;
                                                                tL_message.date = (int) (j3 / 1000);
                                                                if (z22) {
                                                                    tL_message.action = new TLRPC.TL_messageActionPinMessage();
                                                                }
                                                                if (z20) {
                                                                    tL_message.flags |= TLObject.FLAG_31;
                                                                }
                                                                tL_message.dialog_id = j23;
                                                                if (j20 == 0) {
                                                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                                    tL_message.peer_id = tL_peerChannel;
                                                                    tL_peerChannel.channel_id = j20;
                                                                    i19 = i12;
                                                                    j24 = j21;
                                                                } else if (j21 != 0) {
                                                                    TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                                    tL_message.peer_id = tL_peerChat2;
                                                                    j24 = j21;
                                                                    tL_peerChat2.chat_id = j24;
                                                                    i19 = i12;
                                                                } else {
                                                                    j24 = j21;
                                                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                                    tL_message.peer_id = tL_peerUser2;
                                                                    i19 = i12;
                                                                    tL_peerUser2.user_id = j25;
                                                                }
                                                                tL_message.flags |= 256;
                                                                if (optLong3 == 0) {
                                                                    TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                                                                    tL_message.from_id = tL_peerChat3;
                                                                    tL_peerChat3.chat_id = j24;
                                                                } else if (j22 != 0) {
                                                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                                    tL_message.from_id = tL_peerChannel2;
                                                                    tL_peerChannel2.channel_id = j22;
                                                                } else if (i16 != 0) {
                                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                                    tL_message.from_id = tL_peerUser3;
                                                                    tL_peerUser3.user_id = optLong;
                                                                } else {
                                                                    tL_message.from_id = tL_message.peer_id;
                                                                }
                                                                if (!z30 && !z22) {
                                                                    z26 = false;
                                                                    tL_message.mentioned = z26;
                                                                    tL_message.silent = z21;
                                                                    tL_message.from_scheduled = z17;
                                                                    ijVar = new ij(i19, tL_message, str21, str19, str15, z24, z19, z20, has);
                                                                    i12 = i19;
                                                                    if (i13 != 0) {
                                                                        tL_message.reply_to = new TLRPC.TL_messageReplyHeader();
                                                                        TLRPC.MessageReplyHeader messageReplyHeader = ijVar.k.reply_to;
                                                                        messageReplyHeader.forum_topic = true;
                                                                        messageReplyHeader.reply_to_top_id = i13;
                                                                    }
                                                                    ijVar.J = z25;
                                                                    ijVar.I = z25 && (str3.startsWith(str17) || str3.startsWith(str18));
                                                                    if (!str3.equals(obj) && !str3.equals("STORY_HIDDEN_AUTHOR")) {
                                                                        z27 = false;
                                                                        ijVar.K = z27;
                                                                        ijVar.N = str3.equals("STORY_LIVE");
                                                                        ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                                        ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                                        ArrayList arrayList4 = new ArrayList();
                                                                        arrayList4.add(ijVar);
                                                                        a8.b("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                        if (!ijVar.J && !ijVar.I && !ijVar.L && !ijVar.K && !ijVar.M && !z30 && !z22 && i18 > 0) {
                                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.rt
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    PushListenerController.lambda$processRemoteMessage$5(i12, j23, i18);
                                                                                }
                                                                            });
                                                                        }
                                                                        dt.t(i12).K(arrayList4, true, true, countDownLatch);
                                                                        ConnectionsManager.onInternalPushReceived(i12);
                                                                        ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                                        break;
                                                                    }
                                                                    z27 = true;
                                                                    ijVar.K = z27;
                                                                    ijVar.N = str3.equals("STORY_LIVE");
                                                                    ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                                    ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                                    ArrayList arrayList42 = new ArrayList();
                                                                    arrayList42.add(ijVar);
                                                                    a8.b("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                    if (!ijVar.J) {
                                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.rt
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                PushListenerController.lambda$processRemoteMessage$5(i12, j23, i18);
                                                                            }
                                                                        });
                                                                    }
                                                                    dt.t(i12).K(arrayList42, true, true, countDownLatch);
                                                                    ConnectionsManager.onInternalPushReceived(i12);
                                                                    ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                                }
                                                                z26 = true;
                                                                tL_message.mentioned = z26;
                                                                tL_message.silent = z21;
                                                                tL_message.from_scheduled = z17;
                                                                ijVar = new ij(i19, tL_message, str21, str19, str15, z24, z19, z20, has);
                                                                i12 = i19;
                                                                if (i13 != 0) {
                                                                }
                                                                ijVar.J = z25;
                                                                ijVar.I = z25 && (str3.startsWith(str17) || str3.startsWith(str18));
                                                                if (!str3.equals(obj)) {
                                                                    z27 = false;
                                                                    ijVar.K = z27;
                                                                    ijVar.N = str3.equals("STORY_LIVE");
                                                                    ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                                    ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                                    ArrayList arrayList422 = new ArrayList();
                                                                    arrayList422.add(ijVar);
                                                                    a8.b("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                    if (!ijVar.J) {
                                                                    }
                                                                    dt.t(i12).K(arrayList422, true, true, countDownLatch);
                                                                    ConnectionsManager.onInternalPushReceived(i12);
                                                                    ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                                }
                                                                z27 = true;
                                                                ijVar.K = z27;
                                                                ijVar.N = str3.equals("STORY_LIVE");
                                                                ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                                ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                                ArrayList arrayList4222 = new ArrayList();
                                                                arrayList4222.add(ijVar);
                                                                a8.b("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                                if (!ijVar.J) {
                                                                }
                                                                dt.t(i12).K(arrayList4222, true, true, countDownLatch);
                                                                ConnectionsManager.onInternalPushReceived(i12);
                                                                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                            }
                                                            z25 = true;
                                                            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                                            if (z25) {
                                                                i18 = -i18;
                                                            }
                                                            tL_message2.id = i18;
                                                            tL_message2.random_id = j26;
                                                            if (str20 != null) {
                                                            }
                                                            tL_message2.message = str20;
                                                            tL_message2.date = (int) (j3 / 1000);
                                                            if (z22) {
                                                            }
                                                            if (z20) {
                                                            }
                                                            tL_message2.dialog_id = j23;
                                                            if (j20 == 0) {
                                                            }
                                                            tL_message2.flags |= 256;
                                                            if (optLong3 == 0) {
                                                            }
                                                            if (!z30) {
                                                                z26 = false;
                                                                tL_message2.mentioned = z26;
                                                                tL_message2.silent = z21;
                                                                tL_message2.from_scheduled = z17;
                                                                ijVar = new ij(i19, tL_message2, str21, str19, str15, z24, z19, z20, has);
                                                                i12 = i19;
                                                                if (i13 != 0) {
                                                                }
                                                                ijVar.J = z25;
                                                                ijVar.I = z25 && (str3.startsWith(str17) || str3.startsWith(str18));
                                                                if (!str3.equals(obj)) {
                                                                }
                                                                z27 = true;
                                                                ijVar.K = z27;
                                                                ijVar.N = str3.equals("STORY_LIVE");
                                                                ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                                ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                                ArrayList arrayList42222 = new ArrayList();
                                                                arrayList42222.add(ijVar);
                                                                a8.b("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                                if (!ijVar.J) {
                                                                }
                                                                dt.t(i12).K(arrayList42222, true, true, countDownLatch);
                                                                ConnectionsManager.onInternalPushReceived(i12);
                                                                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                            }
                                                            z26 = true;
                                                            tL_message2.mentioned = z26;
                                                            tL_message2.silent = z21;
                                                            tL_message2.from_scheduled = z17;
                                                            ijVar = new ij(i19, tL_message2, str21, str19, str15, z24, z19, z20, has);
                                                            i12 = i19;
                                                            if (i13 != 0) {
                                                            }
                                                            ijVar.J = z25;
                                                            ijVar.I = z25 && (str3.startsWith(str17) || str3.startsWith(str18));
                                                            if (!str3.equals(obj)) {
                                                            }
                                                            z27 = true;
                                                            ijVar.K = z27;
                                                            ijVar.N = str3.equals("STORY_LIVE");
                                                            ijVar.L = str3.equals("MESSAGE_STORY_MENTION");
                                                            ijVar.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                            ArrayList arrayList422222 = new ArrayList();
                                                            arrayList422222.add(ijVar);
                                                            a8.b("PushListenerController push notification to NotificationsController of " + tL_message2.dialog_id);
                                                            if (!ijVar.J) {
                                                            }
                                                            dt.t(i12).K(arrayList422222, true, true, countDownLatch);
                                                            ConnectionsManager.onInternalPushReceived(i12);
                                                            ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                                                        }
                                                    }
                                                    str21 = reactedText;
                                                    if (r2.a) {
                                                    }
                                                    if (str21 != null) {
                                                    }
                                                }
                                            } else if (t10.y(j16)) {
                                                str14 = str14 + " @ " + strArr2[1];
                                                z17 = z28;
                                                j21 = j18;
                                                z18 = false;
                                                z19 = false;
                                                z20 = false;
                                                str15 = null;
                                                if (str3.startsWith("REACT_")) {
                                                }
                                                str16 = " for dialogId = ";
                                                obj = "STORY_NOTEXT";
                                                str17 = "REACT_";
                                                str18 = "CHAT_REACT_";
                                                j22 = optLong2;
                                                z21 = z16;
                                                z22 = z18;
                                                String str27222 = str14;
                                                i12 = i11;
                                                z23 = false;
                                                reactedText = getReactedText(str3, strArr2);
                                                z24 = false;
                                                i18 = i17;
                                                str19 = str27222;
                                                str20 = null;
                                                str21 = reactedText;
                                                if (r2.a) {
                                                }
                                                if (str21 != null) {
                                                }
                                            } else {
                                                boolean z31 = j20 != 0;
                                                str15 = str14;
                                                str14 = strArr2[1];
                                                j21 = j18;
                                                z20 = z31;
                                                z17 = z28;
                                                z18 = false;
                                                z19 = false;
                                                if (str3.startsWith("REACT_")) {
                                                }
                                                str16 = " for dialogId = ";
                                                obj = "STORY_NOTEXT";
                                                str17 = "REACT_";
                                                str18 = "CHAT_REACT_";
                                                j22 = optLong2;
                                                z21 = z16;
                                                z22 = z18;
                                                String str272222 = str14;
                                                i12 = i11;
                                                z23 = false;
                                                reactedText = getReactedText(str3, strArr2);
                                                z24 = false;
                                                i18 = i17;
                                                str19 = str272222;
                                                str20 = null;
                                                str21 = reactedText;
                                                if (r2.a) {
                                                }
                                                if (str21 != null) {
                                                }
                                            }
                                            th = th14;
                                            i10 = i12;
                                            str4 = str5;
                                            i7 = -1;
                                            if (i10 != i7) {
                                                ConnectionsManager.onInternalPushReceived(i10);
                                                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                                                countDownLatch.countDown();
                                            } else {
                                                onDecryptError();
                                            }
                                            if (r2.a) {
                                                a8.d("error in loc_key = " + str3 + " json " + str4);
                                            }
                                            a8.f(th);
                                        }
                                        str14 = null;
                                        boolean has2 = jSONObject3.has("edit_date");
                                        if (str3.startsWith("CHAT_")) {
                                        }
                                        if (str3.startsWith("PINNED_")) {
                                        }
                                    }
                                    z13 = true;
                                    if (jSONObject3.has("mention")) {
                                    }
                                    String str252 = str10;
                                    i16 = i26;
                                    str13 = str252;
                                    z14 = false;
                                    if (jSONObject3.has(str13)) {
                                    }
                                    JSONObject jSONObject72 = jSONObject4;
                                    z15 = z13;
                                    jSONObject5 = jSONObject72;
                                    z16 = false;
                                    boolean z302 = z14;
                                    if (jSONObject5.has(str22)) {
                                    }
                                    if (strArr2 != null) {
                                        str14 = strArr2[0];
                                        boolean has22 = jSONObject3.has("edit_date");
                                        if (str3.startsWith("CHAT_")) {
                                        }
                                        if (str3.startsWith("PINNED_")) {
                                        }
                                    }
                                    str14 = null;
                                    boolean has222 = jSONObject3.has("edit_date");
                                    if (str3.startsWith("CHAT_")) {
                                    }
                                    if (str3.startsWith("PINNED_")) {
                                    }
                                }
                                countDownLatch.countDown();
                                ConnectionsManager.onInternalPushReceived(i12);
                                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                            }
                            i13 = i12;
                            if (jSONObject3.has("random_id")) {
                            }
                            if (i14 != 0) {
                            }
                            if (!str3.startsWith("REACT_")) {
                            }
                            z11 = true;
                            z12 = z11;
                            if (str3.equals("STORY_NOTEXT")) {
                            }
                            if (!jSONObject3.has("story_id")) {
                            }
                            if (i15 < 0) {
                            }
                            if (z12) {
                            }
                            countDownLatch.countDown();
                            ConnectionsManager.onInternalPushReceived(i12);
                            ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                        }
                    }
                    JSONObject jSONObject10 = jSONObject4;
                    i12 = i11;
                    long j28 = jSONObject3.getLong(str12);
                    int i28 = jSONObject3.getInt(str11);
                    if (jSONObject10.has(str22)) {
                        JSONArray jSONArray2 = jSONObject10.getJSONArray(str22);
                        int length2 = jSONArray2.length();
                        strArr = new String[length2];
                        for (int i29 = 0; i29 < length2; i29++) {
                            strArr[i29] = jSONArray2.getString(i29);
                        }
                    } else {
                        strArr = null;
                    }
                    if (System.currentTimeMillis() - j3 < qp.s1(i12).h3) {
                        VoIPGroupNotification.request(t0.b, i12, j17, (strArr == null || strArr.length <= 2) ? null : strArr[2], j28, i28, "CONF_VIDEOCALL_REQUEST".equals(str3));
                        i12 = i12;
                    } else {
                        VoIPGroupNotification.hide(t0.b, i12, i28);
                    }
                    countDownLatch.countDown();
                    ConnectionsManager.onInternalPushReceived(i12);
                    ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            case -1702432235:
                break;
            case -920689527:
                if (str3.equals("DC_UPDATE")) {
                    int i30 = jSONObject2.getInt("dc");
                    String[] split3 = jSONObject2.getString("addr").split(":");
                    if (split3.length != 2) {
                        countDownLatch.countDown();
                        break;
                    } else {
                        ConnectionsManager.getInstance(i10).applyDatacenterAddress(i30, split3[0], Integer.parseInt(split3[1]));
                        ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                        countDownLatch.countDown();
                        break;
                    }
                }
                JSONObject jSONObject62 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb22 = new StringBuilder();
                str8 = str6;
                sb22.append("recived push notification {");
                sb22.append(str3);
                sb22.append("} chatId ");
                sb22.append(j15);
                sb22.append(" custom topicId ");
                sb22.append(i12);
                a8.b(sb22.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                    break;
                }
                if (j13 == j10) {
                    j13 = dt.n0;
                    break;
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            case -763636569:
                if (str3.equals("OAUTH_REQUEST")) {
                    if (jSONObject.has("loc_args")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("loc_args");
                        int length3 = jSONArray3.length();
                        String[] strArr4 = new String[length3];
                        for (int i31 = 0; i31 < length3; i31++) {
                            strArr4[i31] = jSONArray3.getString(i31);
                        }
                        if (length3 < 2) {
                            break;
                        } else {
                            String optString = jSONObject2.optString("url");
                            if (TextUtils.isEmpty(optString)) {
                                break;
                            } else {
                                String Z = id.Z(2131753122, strArr4[0], strArr4[1]);
                                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                                tL_message3.id = 2147483637;
                                tL_message3.random_id = 9223372036854775797L;
                                tL_message3.message = Z;
                                tL_message3.date = (int) (j3 / 1000);
                                tL_message3.dialog_id = 489001L;
                                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                tL_message3.peer_id = tL_peerUser4;
                                tL_peerUser4.user_id = 489001L;
                                tL_message3.flags |= 256;
                                tL_message3.from_id = tL_peerUser4;
                                tL_message3.silent = jSONObject2.has("silent") && jSONObject2.getInt("silent") != 0;
                                ij ijVar2 = new ij(i10, tL_message3, Z, optString, null, true, false, false, false);
                                ijVar2.O = true;
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(ijVar2);
                                a8.b("PushListenerController push OAUTH notification to NotificationsController of " + tL_message3.dialog_id);
                                dt.t(i10).K(arrayList5, true, true, countDownLatch);
                                break;
                            }
                        }
                    }
                }
                JSONObject jSONObject622 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb222 = new StringBuilder();
                str8 = str6;
                sb222.append("recived push notification {");
                sb222.append(str3);
                sb222.append("} chatId ");
                sb222.append(j15);
                sb222.append(" custom topicId ");
                sb222.append(i12);
                a8.b(sb222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j13 == j10) {
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            case 633004703:
                if (str3.equals("MESSAGE_ANNOUNCEMENT")) {
                    TL_update.TL_updateServiceNotification tL_updateServiceNotification = new TL_update.TL_updateServiceNotification();
                    tL_updateServiceNotification.popup = false;
                    tL_updateServiceNotification.flags = 2;
                    tL_updateServiceNotification.inbox_date = (int) (j3 / 1000);
                    tL_updateServiceNotification.message = jSONObject.getString("message");
                    tL_updateServiceNotification.type = "announcement";
                    tL_updateServiceNotification.media = new TLRPC.TL_messageMediaEmpty();
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateServiceNotification);
                    Utilities.d.c(new x0(i10, tL_updates, 11));
                    ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                    countDownLatch.countDown();
                    break;
                }
                JSONObject jSONObject6222 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb2222 = new StringBuilder();
                str8 = str6;
                sb2222.append("recived push notification {");
                sb2222.append(str3);
                sb2222.append("} chatId ");
                sb2222.append(j15);
                sb2222.append(" custom topicId ");
                sb2222.append(i12);
                a8.b(sb2222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j13 == j10) {
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            case 657503015:
                if (str3.equals("MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("loc_args");
                    dt.t(i10).a0(j3, (!"MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP".equals(str3) || optJSONArray == null) ? null : optJSONArray.optString(1, null));
                    ConnectionsManager.onInternalPushReceived(i10);
                    ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
                    countDownLatch.countDown();
                    break;
                }
                JSONObject jSONObject62222 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb22222 = new StringBuilder();
                str8 = str6;
                sb22222.append("recived push notification {");
                sb22222.append(str3);
                sb22222.append("} chatId ");
                sb22222.append(j15);
                sb22222.append(" custom topicId ");
                sb22222.append(i12);
                a8.b(sb22222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j13 == j10) {
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            case 1365673842:
                if (str3.equals("GEO_LIVE_PENDING")) {
                    Utilities.d.c(new hi.j2(i10, 6));
                    countDownLatch.countDown();
                    break;
                }
                JSONObject jSONObject622222 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb222222 = new StringBuilder();
                str8 = str6;
                sb222222.append("recived push notification {");
                sb222222.append(str3);
                sb222222.append("} chatId ");
                sb222222.append(j15);
                sb222222.append(" custom topicId ");
                sb222222.append(i12);
                a8.b(sb222222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j13 == j10) {
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
            default:
                JSONObject jSONObject6222222 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                }
                if (jSONObject3.has("from_id")) {
                }
                if (jSONObject3.has("chat_id")) {
                }
                if (jSONObject3.has("topic_id")) {
                }
                StringBuilder sb2222222 = new StringBuilder();
                str8 = str6;
                sb2222222.append("recived push notification {");
                sb2222222.append(str3);
                sb2222222.append("} chatId ");
                sb2222222.append(j15);
                sb2222222.append(" custom topicId ");
                sb2222222.append(i12);
                a8.b(sb2222222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j13 == j10) {
                }
                j16 = j13;
                if (j16 != j10) {
                }
                i12 = i11;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i12);
                ConnectionsManager.getInstance(i12).resumeNetworkMaybe();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(String str, String str2, long j3) {
        if (r2.a) {
            a8.b(str + " PRE INIT APP");
        }
        t0.w();
        if (r2.a) {
            a8.b(str + " POST INIT APP");
        }
        Utilities.d.c(new st(0, j3, str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i7, int i10, String str) {
        qp.s1(i7).Z3(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(String str, int i7) {
        boolean z9;
        ConnectionsManager.setRegId(str, i7, iz.h);
        if (str == null) {
            return;
        }
        if (iz.i == 0 || iz.j == 0 || (iz.k && TextUtils.equals(iz.g, str))) {
            z9 = false;
        } else {
            iz.k = false;
            z9 = true;
        }
        iz.g = str;
        iz.f = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            p10 i11 = p10.i(i10);
            i11.d = false;
            i11.v(false);
            if (i11.e() != 0) {
                if (z9) {
                    String str2 = i7 == 2 ? "fcm" : "hcm";
                    TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                    TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent.time = iz.i;
                    tL_inputAppEvent.type = str2.concat("_token_request");
                    tL_inputAppEvent.peer = 0L;
                    tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent);
                    TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                    tL_inputAppEvent2.time = iz.j;
                    tL_inputAppEvent2.type = str2.concat("_token_response");
                    tL_inputAppEvent2.peer = iz.j - iz.i;
                    tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                    tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                    iz.k = true;
                    iz.y();
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, null);
                    z9 = false;
                }
                g0.h3(new jg.r(i10, i7, str, 5));
            }
        }
    }

    private static void onDecryptError() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p()) {
                ConnectionsManager.onInternalPushReceived(i7);
                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i7, String str, long j3) {
        String str2 = i7 == 2 ? "FCM" : "HCM";
        if (r2.a) {
            a8.b(str2.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g0.h3(new st(1, j3, str2, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z9 = r2.a;
        StringBuilder u10 = a8.p0.u("finished ", str2, " service, time = ");
        u10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        a8.b(u10.toString());
    }

    public static void sendRegistrationToServer(int i7, String str) {
        Utilities.d.c(new x0(str, i7, 10));
    }
}
