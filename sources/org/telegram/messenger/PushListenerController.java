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
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
                return jb6.a0(null, null, 2131746307, objArr);
            case "REACT_WALLET_TONCONNECT_REQUEST":
                return jb6.a0(null, null, 2131746244, objArr);
            case "CHAT_REACT_POLL_APPEND":
                return jb6.a0(null, null, 2131746296, objArr);
            case "REACT_GEOLIVE":
                return jb6.a0(null, null, 2131746280, objArr);
            case "REACT_GAME_SCORE":
                return jb6.a0(null, null, 2131746282, objArr);
            case "REACT_STORY_HIDDEN":
                return jb6.a0(null, null, 2131746256, objArr);
            case "CHAT_REACT_TODO_DONE":
            case "CHAT_REACT_TODO_APPEND":
                return jb6.a0(null, null, 2131746288, objArr);
            case "REACT_RECURRING_PAY":
                return jb6.a0(null, null, 2131746266, objArr);
            case "REACT_STARGIFT_UPGRADE":
                return jb6.a0(null, null, 2131746259, objArr);
            case "REACT_HIDDEN":
                return jb6.a0(null, null, 2131746275, objArr);
            case "CHAT_REACT_NOTEXT":
                return jb6.a0(null, null, 2131746299, objArr);
            case "CHAT_REACT_GAME_SCORE":
                return jb6.a0(null, null, 2131746304, objArr);
            case "REACT_NOTEXT":
                return jb6.a0(null, null, 2131746273, objArr);
            case "REACT_PHOTO_SECRET":
                return jb6.a0(null, null, 2131746270, objArr);
            case "REACT_WALLPAPER":
                return jb6.a0(null, null, 2131746243, objArr);
            case "CHAT_REACT_INVOICE":
                return jb6.a0(null, null, 2131746300, objArr);
            case "CHAT_REACT_NOTHEME":
            case "CHAT_REACT_THEME":
                return jb6.a0(null, null, 2131746290, objArr);
            case "REACT_CONTACT":
                return jb6.a0(null, null, 2131746285, objArr);
            case "REACT_STARGIFT_PREPAID_UPGRADE":
                return jb6.a0(null, null, 2131746261, objArr);
            case "CHAT_REACT_STICKER":
                return jb6.a0(null, null, 2131746293, objArr);
            case "REACT_SAME_WALLPAPER":
                return jb6.a0(null, null, 2131746264, objArr);
            case "REACT_GRAM_TRANSFER_COMMENT":
                return jb6.a0(null, null, 2131746276, objArr);
            case "REACT_GAME":
                return jb6.a0(null, null, 2131746283, objArr);
            case "REACT_POLL":
                return jb6.a0(null, null, 2131746269, objArr);
            case "REACT_QUIZ":
                return jb6.a0(null, null, 2131746267, objArr);
            case "REACT_TEXT":
                return jb6.a0(null, null, 2131746251, objArr);
            case "REACT_TODO":
                return jb6.a0(null, null, 2131746249, objArr);
            case "REACT_INVOICE":
                return jb6.a0(null, null, 2131746274, objArr);
            case "REACT_SCREENSHOT":
                return jb6.a0(null, null, 2131746263, objArr);
            case "CHAT_REACT_DOC":
                return jb6.a0(null, null, 2131746306, objArr);
            case "CHAT_REACT_GEO":
                return jb6.a0(null, null, 2131746303, objArr);
            case "CHAT_REACT_GIF":
                return jb6.a0(null, null, 2131746301, objArr);
            case "REACT_TODO_DONE":
            case "REACT_TODO_APPEND":
                return jb6.a0(null, null, 2131746248, objArr);
            case "REACT_NOTHEME":
            case "REACT_THEME":
            case "REACT_GIFT_THEME":
                return jb6.a0(null, null, 2131746250, objArr);
            case "REACT_GRAM_TRANSFER":
                return jb6.a0(null, null, 2131746277, objArr);
            case "REACT_STARGIFT_UNPACK_UPGRADE":
                return jb6.a0(null, null, 2131746260, objArr);
            case "REACT_GIFTCODE":
                return jb6.a0(null, null, 2131746278, objArr);
            case "REACT_STICKER":
                return jb6.a0(null, null, 2131746258, objArr);
            case "CHAT_REACT_AUDIO":
                return jb6.a0(null, null, 2131746308, objArr);
            case "CHAT_REACT_PHOTO":
                return jb6.a0(null, null, 2131746298, objArr);
            case "CHAT_REACT_ROUND":
                return jb6.a0(null, null, 2131746294, objArr);
            case "CHAT_REACT_STORY":
                return jb6.a0(null, null, 2131746292, objArr);
            case "CHAT_REACT_VIDEO":
                return jb6.a0(null, null, 2131746287, objArr);
            case "CHAT_REACT_GIVEAWAY":
                return jb6.a0(null, null, 2131747782, objArr);
            case "REACT_UNIQUE_STARGIFT":
                return jb6.a0(null, null, 2131746247, objArr);
            case "REACT_STORY_MENTION":
                return jb6.a0(null, null, 2131746254, objArr);
            case "REACT_GIVEAWAY_STARS":
                return jb6.a0(null, null, 2131747670, objArr);
            case "REACT_GIVEAWAY":
                return jb6.a0(null, null, 2131747670, objArr);
            case "REACT_STARGIFT":
                return jb6.a0(null, null, 2131746262, objArr);
            case "CHAT_REACT_GEOLIVE":
                return jb6.a0(null, null, 2131746302, objArr);
            case "REACT_VIDEO_SECRET":
                return jb6.a0(null, null, 2131746245, objArr);
            case "REACT_SUGGEST_BIRTHDAY":
                return jb6.a0(null, null, 2131746253, objArr);
            case "REACT_PROXIMITY":
                return jb6.a0(null, null, 2131746268, objArr);
            case "REACT_PAID_MEDIA":
                return jb6.a0(null, null, 2131746272, objArr);
            case "REACT_AUDIO":
                return jb6.a0(null, null, 2131746286, objArr);
            case "REACT_PHOTO":
                return jb6.a0(null, null, 2131746271, objArr);
            case "REACT_ROUND":
                return jb6.a0(null, null, 2131746265, objArr);
            case "REACT_STORY":
                return jb6.a0(null, null, 2131746257, objArr);
            case "REACT_VIDEO":
                return jb6.a0(null, null, 2131746246, objArr);
            case "REACT_SUGGEST_USERPIC":
                return jb6.a0(null, null, 2131746252, objArr);
            case "REACT_DOC":
                return jb6.a0(null, null, 2131746284, objArr);
            case "REACT_GEO":
                return jb6.a0(null, null, 2131746281, objArr);
            case "REACT_GIF":
                return jb6.a0(null, null, 2131746279, objArr);
            case "CHAT_REACT_GAME":
                return jb6.a0(null, null, 2131746305, objArr);
            case "CHAT_REACT_POLL":
                return jb6.a0(null, null, 2131746297, objArr);
            case "CHAT_REACT_QUIZ":
                return jb6.a0(null, null, 2131746295, objArr);
            case "CHAT_REACT_TEXT":
                return jb6.a0(null, null, 2131746291, objArr);
            case "CHAT_REACT_TODO":
                return jb6.a0(null, null, 2131746289, objArr);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$2(int i, TLRPC.TL_updates tL_updates) {
        oc7.r1(i).T3(tL_updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$3(int i) {
        if (z8c.h(i).e() != 0) {
            z8c.h(i).b();
            oc7.r1(i).E3(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$processRemoteMessage$4(int i) {
        dd6 f = dd6.f(i);
        if (f.b.isEmpty()) {
            return;
        }
        f.I = SystemClock.elapsedRealtime() + 65000;
        f.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$5(int i, long j, int i2) {
        oc7.r1(i).s4(i2, j, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1031:0x225c, code lost:
    
        if (r5.equals("CHAT_CREATED") != false) goto L978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1080:0x072e, code lost:
    
        if (cf7.Y(r27).l(r12) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x039d, code lost:
    
        if (r5.equals("MESSAGE_WALLET_TONCONNECT_REQUEST") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x184a, code lost:
    
        if (r5.equals("MESSAGE_GRAM_TRANSFER_UNKNOWN") != false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x1a42, code lost:
    
        if (r5.equals("PHONE_CALL_REQUEST") != false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x1d60, code lost:
    
        if (r5.equals("CHANNEL_MESSAGE_TEXT") != false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:973:0x1fd2, code lost:
    
        if (r5.equals("MESSAGE_MUTED") != false) goto L921;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x0437: MOVE (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r27 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:1116:0x0437 */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x24da A[Catch: all -> 0x2565, TryCatch #1 {all -> 0x2565, blocks: (B:173:0x24f6, B:175:0x2504, B:177:0x2511, B:179:0x251b, B:181:0x252c, B:183:0x2530, B:185:0x2534, B:186:0x253b, B:190:0x2555, B:191:0x255a, B:196:0x254d, B:326:0x2332, B:328:0x2336, B:330:0x2364, B:332:0x236c, B:335:0x2377, B:339:0x2381, B:342:0x238b, B:344:0x2394, B:346:0x239d, B:347:0x23a4, B:349:0x23ac, B:360:0x243e, B:361:0x2450, B:363:0x2454, B:365:0x245c, B:368:0x2467, B:370:0x246f, B:373:0x2478, B:375:0x24b0, B:377:0x24b4, B:379:0x24b8, B:381:0x24bc, B:386:0x24c6, B:387:0x24ce, B:399:0x23c2, B:400:0x23d0, B:592:0x22a8, B:740:0x225e, B:949:0x1f09, B:951:0x1f15, B:952:0x1f24, B:953:0x1f3a, B:956:0x22f1, B:958:0x22f5, B:960:0x1f46, B:962:0x1f50, B:963:0x1f67, B:965:0x1f71, B:966:0x1f88, B:968:0x1f92, B:969:0x1fa9, B:971:0x1fb3, B:972:0x1fca, B:974:0x1fd6, B:976:0x1fe0, B:977:0x1ff5, B:979:0x1fff, B:980:0x201c, B:982:0x2026, B:983:0x203f, B:985:0x2049, B:986:0x2067, B:988:0x2071, B:989:0x208a, B:991:0x2094, B:992:0x20ad, B:996:0x20b9, B:998:0x20c3, B:1001:0x20ef, B:1003:0x20f9, B:1004:0x2116, B:1006:0x2120, B:1007:0x2139, B:1009:0x2143, B:1010:0x2162, B:1012:0x216c, B:1013:0x2183, B:1015:0x218d, B:1016:0x21a4, B:1018:0x21ae, B:1019:0x21c5, B:1021:0x21cf, B:1022:0x21f6, B:1024:0x2202, B:1026:0x2206, B:1028:0x220e, B:1029:0x223d, B:1030:0x2254, B:1032:0x2277, B:1034:0x2281, B:1035:0x229e, B:1038:0x22d5, B:1040:0x22e0, B:1042:0x2313, B:1065:0x24da, B:1067:0x24e6), top: B:162:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:1070:0x0764 A[Catch: all -> 0x2415, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:1077:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:1081:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:1093:0x2586  */
    /* JADX WARN: Removed duplicated region for block: B:1096:0x259d  */
    /* JADX WARN: Removed duplicated region for block: B:1099:0x2596  */
    /* JADX WARN: Removed duplicated region for block: B:1101:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:1102:0x044b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:1113:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ed A[Catch: all -> 0x03fc, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x03fc, blocks: (B:58:0x01ca, B:60:0x01ce, B:61:0x01e2, B:66:0x01ee, B:71:0x0214, B:73:0x021c, B:75:0x022e, B:78:0x039f, B:81:0x03ab, B:82:0x03b4, B:85:0x0236, B:87:0x023e, B:89:0x0285, B:91:0x028d, B:93:0x0293, B:95:0x02a0, B:99:0x02ac, B:101:0x02b8, B:103:0x0301, B:106:0x030a, B:110:0x0326, B:116:0x0354, B:118:0x035c, B:120:0x0372, B:122:0x0378, B:124:0x0397, B:128:0x03d3, B:133:0x03ed), top: B:56:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0411 A[Catch: all -> 0x0436, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0436, blocks: (B:108:0x031e, B:138:0x0411, B:142:0x0426), top: B:69:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0426 A[Catch: all -> 0x0436, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0436, blocks: (B:108:0x031e, B:138:0x0411, B:142:0x0426), top: B:69:0x020f }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0481 A[Catch: all -> 0x2415, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x049b A[Catch: all -> 0x2415, TRY_ENTER, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ab A[Catch: all -> 0x2415, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06d0 A[Catch: all -> 0x2415, TRY_ENTER, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06eb A[Catch: all -> 0x2415, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0896 A[Catch: all -> 0x2568, TryCatch #2 {all -> 0x2568, blocks: (B:145:0x0443, B:148:0x0453, B:151:0x0493, B:165:0x04bd, B:169:0x04cf, B:188:0x2545, B:198:0x04e3, B:213:0x0563, B:216:0x0583, B:221:0x05a7, B:233:0x0625, B:244:0x06a5, B:246:0x06ab, B:250:0x06c8, B:261:0x0733, B:266:0x0742, B:276:0x0775, B:281:0x079a, B:286:0x07b7, B:292:0x07d5, B:303:0x0805, B:313:0x0890, B:315:0x0896, B:317:0x089c, B:350:0x23df, B:357:0x2421, B:396:0x2418, B:402:0x23dd, B:945:0x1ef5, B:947:0x1efd, B:1050:0x0857, B:1057:0x0874, B:1068:0x075e, B:1082:0x06b8), top: B:144:0x0443 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x2336 A[Catch: all -> 0x2565, TryCatch #1 {all -> 0x2565, blocks: (B:173:0x24f6, B:175:0x2504, B:177:0x2511, B:179:0x251b, B:181:0x252c, B:183:0x2530, B:185:0x2534, B:186:0x253b, B:190:0x2555, B:191:0x255a, B:196:0x254d, B:326:0x2332, B:328:0x2336, B:330:0x2364, B:332:0x236c, B:335:0x2377, B:339:0x2381, B:342:0x238b, B:344:0x2394, B:346:0x239d, B:347:0x23a4, B:349:0x23ac, B:360:0x243e, B:361:0x2450, B:363:0x2454, B:365:0x245c, B:368:0x2467, B:370:0x246f, B:373:0x2478, B:375:0x24b0, B:377:0x24b4, B:379:0x24b8, B:381:0x24bc, B:386:0x24c6, B:387:0x24ce, B:399:0x23c2, B:400:0x23d0, B:592:0x22a8, B:740:0x225e, B:949:0x1f09, B:951:0x1f15, B:952:0x1f24, B:953:0x1f3a, B:956:0x22f1, B:958:0x22f5, B:960:0x1f46, B:962:0x1f50, B:963:0x1f67, B:965:0x1f71, B:966:0x1f88, B:968:0x1f92, B:969:0x1fa9, B:971:0x1fb3, B:972:0x1fca, B:974:0x1fd6, B:976:0x1fe0, B:977:0x1ff5, B:979:0x1fff, B:980:0x201c, B:982:0x2026, B:983:0x203f, B:985:0x2049, B:986:0x2067, B:988:0x2071, B:989:0x208a, B:991:0x2094, B:992:0x20ad, B:996:0x20b9, B:998:0x20c3, B:1001:0x20ef, B:1003:0x20f9, B:1004:0x2116, B:1006:0x2120, B:1007:0x2139, B:1009:0x2143, B:1010:0x2162, B:1012:0x216c, B:1013:0x2183, B:1015:0x218d, B:1016:0x21a4, B:1018:0x21ae, B:1019:0x21c5, B:1021:0x21cf, B:1022:0x21f6, B:1024:0x2202, B:1026:0x2206, B:1028:0x220e, B:1029:0x223d, B:1030:0x2254, B:1032:0x2277, B:1034:0x2281, B:1035:0x229e, B:1038:0x22d5, B:1040:0x22e0, B:1042:0x2313, B:1065:0x24da, B:1067:0x24e6), top: B:162:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x2364 A[Catch: all -> 0x2565, TryCatch #1 {all -> 0x2565, blocks: (B:173:0x24f6, B:175:0x2504, B:177:0x2511, B:179:0x251b, B:181:0x252c, B:183:0x2530, B:185:0x2534, B:186:0x253b, B:190:0x2555, B:191:0x255a, B:196:0x254d, B:326:0x2332, B:328:0x2336, B:330:0x2364, B:332:0x236c, B:335:0x2377, B:339:0x2381, B:342:0x238b, B:344:0x2394, B:346:0x239d, B:347:0x23a4, B:349:0x23ac, B:360:0x243e, B:361:0x2450, B:363:0x2454, B:365:0x245c, B:368:0x2467, B:370:0x246f, B:373:0x2478, B:375:0x24b0, B:377:0x24b4, B:379:0x24b8, B:381:0x24bc, B:386:0x24c6, B:387:0x24ce, B:399:0x23c2, B:400:0x23d0, B:592:0x22a8, B:740:0x225e, B:949:0x1f09, B:951:0x1f15, B:952:0x1f24, B:953:0x1f3a, B:956:0x22f1, B:958:0x22f5, B:960:0x1f46, B:962:0x1f50, B:963:0x1f67, B:965:0x1f71, B:966:0x1f88, B:968:0x1f92, B:969:0x1fa9, B:971:0x1fb3, B:972:0x1fca, B:974:0x1fd6, B:976:0x1fe0, B:977:0x1ff5, B:979:0x1fff, B:980:0x201c, B:982:0x2026, B:983:0x203f, B:985:0x2049, B:986:0x2067, B:988:0x2071, B:989:0x208a, B:991:0x2094, B:992:0x20ad, B:996:0x20b9, B:998:0x20c3, B:1001:0x20ef, B:1003:0x20f9, B:1004:0x2116, B:1006:0x2120, B:1007:0x2139, B:1009:0x2143, B:1010:0x2162, B:1012:0x216c, B:1013:0x2183, B:1015:0x218d, B:1016:0x21a4, B:1018:0x21ae, B:1019:0x21c5, B:1021:0x21cf, B:1022:0x21f6, B:1024:0x2202, B:1026:0x2206, B:1028:0x220e, B:1029:0x223d, B:1030:0x2254, B:1032:0x2277, B:1034:0x2281, B:1035:0x229e, B:1038:0x22d5, B:1040:0x22e0, B:1042:0x2313, B:1065:0x24da, B:1067:0x24e6), top: B:162:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x2360  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x185a A[Catch: all -> 0x2415, TryCatch #6 {all -> 0x2415, blocks: (B:1103:0x044b, B:150:0x0481, B:153:0x049b, B:158:0x04ab, B:160:0x04b3, B:201:0x04ef, B:203:0x04fe, B:206:0x051f, B:207:0x0550, B:208:0x052f, B:210:0x0538, B:211:0x054b, B:212:0x0542, B:215:0x056b, B:219:0x058f, B:224:0x05b5, B:225:0x05c8, B:227:0x05cb, B:229:0x05d7, B:231:0x05f8, B:235:0x062d, B:236:0x0645, B:238:0x0648, B:240:0x065c, B:242:0x0678, B:248:0x06b3, B:252:0x06d0, B:254:0x06eb, B:256:0x06ff, B:257:0x0719, B:264:0x073b, B:269:0x0750, B:271:0x0756, B:283:0x07a2, B:288:0x07bd, B:294:0x07db, B:296:0x07ec, B:300:0x07fd, B:302:0x0800, B:306:0x0817, B:308:0x081a, B:310:0x0820, B:320:0x08fe, B:322:0x0906, B:353:0x23eb, B:393:0x23fb, B:395:0x2409, B:405:0x0923, B:407:0x092b, B:408:0x094a, B:410:0x0952, B:415:0x0979, B:417:0x0981, B:418:0x0998, B:420:0x09a0, B:421:0x09c7, B:424:0x09d1, B:428:0x09ec, B:429:0x0a0b, B:430:0x0a24, B:432:0x0a2c, B:433:0x0a45, B:435:0x0a4b, B:437:0x0a54, B:444:0x0a5e, B:446:0x0a66, B:447:0x0a95, B:449:0x0a9d, B:452:0x0ac8, B:454:0x0ad0, B:455:0x0ae3, B:457:0x0aeb, B:458:0x0b08, B:460:0x0b10, B:461:0x0b2d, B:463:0x0b35, B:464:0x0b4c, B:466:0x0b54, B:467:0x0b71, B:469:0x0b79, B:470:0x0b96, B:472:0x0b9e, B:473:0x0bbb, B:475:0x0bc3, B:476:0x0bea, B:478:0x0bf2, B:479:0x0c19, B:482:0x0c23, B:484:0x0c2b, B:485:0x0c4e, B:487:0x0c56, B:488:0x0c6e, B:490:0x0c76, B:491:0x0c9f, B:493:0x0ca7, B:494:0x0cce, B:496:0x0cd6, B:497:0x0d05, B:499:0x0d0d, B:500:0x0d24, B:502:0x0d2c, B:503:0x0d43, B:505:0x0d4b, B:506:0x0d62, B:508:0x0d6a, B:509:0x0d81, B:511:0x0d89, B:512:0x0dae, B:514:0x0db6, B:515:0x0dcd, B:517:0x0dd5, B:518:0x0e04, B:520:0x0e0c, B:521:0x0e28, B:525:0x0e32, B:527:0x0e3c, B:530:0x0e5c, B:532:0x0e64, B:533:0x0e81, B:535:0x0e89, B:536:0x0ea2, B:539:0x0eac, B:541:0x0ec7, B:542:0x0ee0, B:543:0x0ef3, B:545:0x0efb, B:546:0x0f16, B:549:0x1d62, B:550:0x0f20, B:552:0x0f28, B:553:0x0f46, B:555:0x0f4e, B:556:0x0f69, B:558:0x0f71, B:559:0x0f8e, B:561:0x0f96, B:562:0x0fbf, B:564:0x0fc7, B:565:0x0fee, B:567:0x0ff6, B:568:0x0fff, B:570:0x1007, B:571:0x1028, B:573:0x1030, B:574:0x1051, B:576:0x1059, B:577:0x107f, B:579:0x1087, B:580:0x10a8, B:582:0x10b0, B:583:0x10d3, B:585:0x10db, B:586:0x110c, B:588:0x1114, B:589:0x1143, B:593:0x114f, B:596:0x1159, B:599:0x1173, B:600:0x1189, B:601:0x1199, B:603:0x11a1, B:604:0x11c5, B:606:0x11cd, B:607:0x11ec, B:611:0x11f6, B:613:0x1200, B:616:0x1224, B:618:0x122c, B:619:0x1249, B:621:0x1251, B:622:0x126c, B:625:0x1276, B:627:0x1291, B:628:0x12aa, B:629:0x12bd, B:632:0x12c7, B:634:0x12e2, B:635:0x12fb, B:636:0x130e, B:639:0x1318, B:641:0x1333, B:642:0x134c, B:643:0x135f, B:646:0x1369, B:648:0x1384, B:649:0x139d, B:650:0x13b0, B:652:0x13b8, B:653:0x13d0, B:656:0x184c, B:658:0x185a, B:665:0x1877, B:672:0x13da, B:674:0x13e2, B:675:0x13fc, B:677:0x1404, B:678:0x141d, B:680:0x1425, B:681:0x1450, B:684:0x145a, B:686:0x1462, B:687:0x1479, B:689:0x1481, B:690:0x1498, B:692:0x14a0, B:693:0x14b7, B:695:0x14bf, B:696:0x14d6, B:698:0x14de, B:699:0x14f7, B:701:0x14ff, B:702:0x1516, B:704:0x151e, B:706:0x1522, B:708:0x152a, B:709:0x1561, B:710:0x1594, B:712:0x159c, B:713:0x15ad, B:715:0x15b5, B:716:0x15d2, B:718:0x15da, B:719:0x15f7, B:721:0x15ff, B:722:0x161c, B:724:0x1624, B:725:0x1643, B:727:0x164b, B:728:0x166d, B:731:0x1677, B:733:0x167f, B:734:0x1698, B:736:0x16a0, B:737:0x16b1, B:741:0x16bd, B:744:0x16c7, B:746:0x16cf, B:747:0x16eb, B:749:0x16f3, B:753:0x1707, B:754:0x1704, B:755:0x171b, B:757:0x1723, B:758:0x1734, B:760:0x173c, B:761:0x174e, B:764:0x1758, B:767:0x1762, B:769:0x176a, B:770:0x178d, B:773:0x1797, B:775:0x179f, B:776:0x17b6, B:778:0x17be, B:779:0x17d8, B:781:0x17e0, B:782:0x17f7, B:784:0x17ff, B:785:0x1818, B:788:0x1822, B:790:0x182a, B:791:0x1844, B:793:0x1891, B:796:0x189b, B:799:0x18b5, B:800:0x18cb, B:801:0x18db, B:804:0x18e5, B:807:0x18ff, B:808:0x1915, B:809:0x1925, B:812:0x192f, B:814:0x194a, B:815:0x1963, B:816:0x1976, B:819:0x1980, B:822:0x199a, B:823:0x19b0, B:824:0x19c0, B:826:0x19ca, B:828:0x19ce, B:830:0x19d6, B:831:0x1a05, B:832:0x1a1c, B:834:0x1a24, B:835:0x1a3c, B:837:0x1a48, B:840:0x1a52, B:842:0x1a56, B:844:0x1a5e, B:845:0x1a75, B:847:0x1a8a, B:849:0x1a8e, B:851:0x1a96, B:852:0x1ab3, B:853:0x1acc, B:855:0x1ad0, B:857:0x1ad8, B:858:0x1aef, B:859:0x1b02, B:861:0x1b08, B:862:0x1b22, B:864:0x1b2a, B:865:0x1b41, B:868:0x1b4b, B:871:0x1b65, B:872:0x1b81, B:873:0x1b97, B:876:0x1ba1, B:878:0x1bbc, B:879:0x1bdb, B:880:0x1bf4, B:883:0x1bfe, B:886:0x1c18, B:887:0x1c34, B:888:0x1c4a, B:891:0x1c54, B:894:0x1c6e, B:895:0x1c8a, B:896:0x1ca0, B:899:0x1caa, B:902:0x1cc4, B:903:0x1cda, B:904:0x1cea, B:906:0x1cf2, B:907:0x1d15, B:909:0x1d1d, B:910:0x1d37, B:912:0x1d3f, B:913:0x1d5a, B:915:0x1d7c, B:917:0x1d84, B:918:0x1da3, B:920:0x1dab, B:921:0x1dc5, B:923:0x1dcd, B:924:0x1df2, B:926:0x1dfa, B:927:0x1e26, B:929:0x1e2e, B:930:0x1e60, B:933:0x1e6a, B:936:0x1e83, B:937:0x1e98, B:938:0x1ea7, B:940:0x1eaf, B:941:0x1ed7, B:943:0x1edf, B:1047:0x0845, B:1070:0x0764, B:1079:0x0726, B:1084:0x06be), top: B:1102:0x044b }] */
    /* JADX WARN: Removed duplicated region for block: B:958:0x22f5 A[Catch: all -> 0x2565, TryCatch #1 {all -> 0x2565, blocks: (B:173:0x24f6, B:175:0x2504, B:177:0x2511, B:179:0x251b, B:181:0x252c, B:183:0x2530, B:185:0x2534, B:186:0x253b, B:190:0x2555, B:191:0x255a, B:196:0x254d, B:326:0x2332, B:328:0x2336, B:330:0x2364, B:332:0x236c, B:335:0x2377, B:339:0x2381, B:342:0x238b, B:344:0x2394, B:346:0x239d, B:347:0x23a4, B:349:0x23ac, B:360:0x243e, B:361:0x2450, B:363:0x2454, B:365:0x245c, B:368:0x2467, B:370:0x246f, B:373:0x2478, B:375:0x24b0, B:377:0x24b4, B:379:0x24b8, B:381:0x24bc, B:386:0x24c6, B:387:0x24ce, B:399:0x23c2, B:400:0x23d0, B:592:0x22a8, B:740:0x225e, B:949:0x1f09, B:951:0x1f15, B:952:0x1f24, B:953:0x1f3a, B:956:0x22f1, B:958:0x22f5, B:960:0x1f46, B:962:0x1f50, B:963:0x1f67, B:965:0x1f71, B:966:0x1f88, B:968:0x1f92, B:969:0x1fa9, B:971:0x1fb3, B:972:0x1fca, B:974:0x1fd6, B:976:0x1fe0, B:977:0x1ff5, B:979:0x1fff, B:980:0x201c, B:982:0x2026, B:983:0x203f, B:985:0x2049, B:986:0x2067, B:988:0x2071, B:989:0x208a, B:991:0x2094, B:992:0x20ad, B:996:0x20b9, B:998:0x20c3, B:1001:0x20ef, B:1003:0x20f9, B:1004:0x2116, B:1006:0x2120, B:1007:0x2139, B:1009:0x2143, B:1010:0x2162, B:1012:0x216c, B:1013:0x2183, B:1015:0x218d, B:1016:0x21a4, B:1018:0x21ae, B:1019:0x21c5, B:1021:0x21cf, B:1022:0x21f6, B:1024:0x2202, B:1026:0x2206, B:1028:0x220e, B:1029:0x223d, B:1030:0x2254, B:1032:0x2277, B:1034:0x2281, B:1035:0x229e, B:1038:0x22d5, B:1040:0x22e0, B:1042:0x2313, B:1065:0x24da, B:1067:0x24e6), top: B:162:0x04b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void lambda$processRemoteMessage$6(String str, String str2, long j) {
        int i;
        String str3;
        String str4;
        int i2;
        byte[] decode;
        NativeByteBuffer nativeByteBuffer;
        byte[] bArr;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        long e;
        int intValue;
        boolean z;
        String str5;
        int i3;
        int i4;
        String str6;
        JSONObject jSONObject3;
        long j2;
        long j3;
        long j4;
        final int i5;
        long j5;
        long j6;
        JSONObject jSONObject4;
        String str7;
        long j7;
        String str8;
        String str9;
        String str10;
        boolean z2;
        long j8;
        long j9;
        String str11;
        String str12;
        String[] strArr;
        int i6;
        int i7;
        long j10;
        long j11;
        long j12;
        boolean z3;
        boolean z4;
        int i8;
        int i9;
        String str13;
        boolean z5;
        boolean z6;
        JSONObject jSONObject5;
        boolean z7;
        int i10;
        String[] strArr2;
        boolean z8;
        long j13;
        boolean z9;
        boolean z10;
        String str14;
        boolean z11;
        String str15;
        Object obj;
        String str16;
        String str17;
        long j14;
        boolean z12;
        boolean z13;
        boolean z14;
        String reactedText;
        boolean z15;
        final int i11;
        String str18;
        String str19;
        String str20;
        final long j15;
        long j16;
        TLRPC.Peer tL_peerUser;
        int i12;
        String Y;
        String L0;
        String Y2;
        int i13;
        String G;
        int i14;
        int i15;
        if (e21.a) {
            fc4.b(str + " START PROCESSING");
        }
        try {
            decode = Base64.decode(str2, 8);
            nativeByteBuffer = new NativeByteBuffer(decode.length);
            nativeByteBuffer.writeBytes(decode);
            nativeByteBuffer.position(0);
            if (gda.l == null) {
                gda.l = new byte[8];
                byte[] n = Utilities.n(gda.k);
                System.arraycopy(n, n.length - 8, gda.l, 0, 8);
            }
            bArr = new byte[8];
            nativeByteBuffer.readBytes(bArr, true);
        } catch (Throwable th) {
            th = th;
            i = -1;
            str3 = null;
            str4 = null;
        }
        if (!Arrays.equals(gda.l, bArr)) {
            onDecryptError();
            if (e21.a) {
                fc4.b(String.format(Locale.US, str + " DECRYPT ERROR 2 k1=%s k2=%s, key=%s", Utilities.f(gda.l), Utilities.f(bArr), Utilities.f(gda.k)));
            }
            return;
        }
        byte[] bArr2 = new byte[16];
        nativeByteBuffer.readBytes(bArr2, true);
        wm4 U = wm4.U(2, true, gda.k, bArr2);
        Utilities.c(nativeByteBuffer.buffer, (byte[]) U.b, (byte[]) U.c, false, false, 24, decode.length - 24);
        byte[] bArr3 = gda.k;
        ByteBuffer byteBuffer = nativeByteBuffer.buffer;
        if (!Utilities.d(bArr2, Utilities.p(bArr3, 96, byteBuffer, 24, byteBuffer.limit()), 8)) {
            onDecryptError();
            if (e21.a) {
                fc4.b(String.format(str + " DECRYPT ERROR 3, key = %s", Utilities.f(gda.k)));
                return;
            }
            return;
        }
        byte[] bArr4 = new byte[nativeByteBuffer.readInt32(true)];
        nativeByteBuffer.readBytes(bArr4, true);
        str4 = new String(bArr4);
        try {
            jSONObject = new JSONObject(str4);
            a aVar = a.a;
            str3 = jSONObject.has("loc_key") ? jSONObject.getString("loc_key") : "";
            try {
                jSONObject2 = jSONObject.get("custom") instanceof JSONObject ? jSONObject.getJSONObject("custom") : new JSONObject();
                Object obj2 = jSONObject.has("user_id") ? jSONObject.get("user_id") : null;
                if (obj2 == null) {
                    e = z8c.h(z8c.t0).e();
                } else if (obj2 instanceof Long) {
                    e = ((Long) obj2).longValue();
                } else {
                    if (obj2 instanceof Integer) {
                        intValue = ((Integer) obj2).intValue();
                    } else if (obj2 instanceof String) {
                        intValue = Utilities.z((String) obj2).intValue();
                    } else {
                        e = z8c.h(z8c.t0).e();
                    }
                    e = intValue;
                }
                int i16 = z8c.t0;
                i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        i2 = i16;
                        z = false;
                        break;
                    } else {
                        if (z8c.h(i2).e() == e) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i = -1;
                i2 = -1;
                if (i2 != i) {
                }
                if (e21.a) {
                }
                fc4.f(th);
                return;
            }
        } catch (Throwable th3) {
            th = th3;
            i = -1;
            str3 = null;
        }
        if (!z) {
            if (e21.a) {
                fc4.b(str + " ACCOUNT NOT FOUND");
            }
            countDownLatch.countDown();
            return;
        }
        try {
            try {
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str5 = str4;
        }
        if (!z8c.h(i2).o()) {
            if (e21.a) {
                fc4.b(str + " ACCOUNT NOT ACTIVATED");
            }
            countDownLatch.countDown();
            return;
        }
        if (e21.a) {
            fc4.b(str + " " + str3);
        }
        try {
        } catch (Throwable th6) {
            th = th6;
            i2 = i3;
        }
        switch (str3.hashCode()) {
            case -1963663249:
                if (str3.equals("SESSION_REVOKE")) {
                    gm.c3(new fx0(i2, (byte) 9));
                    countDownLatch.countDown();
                    break;
                }
                JSONObject jSONObject6 = jSONObject2;
                if (jSONObject2.has("channel_id")) {
                    jSONObject3 = jSONObject6;
                    j2 = 0;
                    j3 = jSONObject3.getLong("channel_id");
                    i4 = i2;
                    str6 = "";
                    j4 = -j3;
                } else {
                    i4 = i2;
                    str6 = "";
                    jSONObject3 = jSONObject6;
                    j2 = 0;
                    j3 = 0;
                    j4 = 0;
                }
                try {
                    if (jSONObject3.has("from_id")) {
                        j6 = jSONObject3.getLong("from_id");
                        j5 = j6;
                    } else {
                        j5 = j4;
                        j6 = j2;
                    }
                    if (jSONObject3.has("chat_id")) {
                        str7 = " ";
                        j7 = jSONObject3.getLong("chat_id");
                        str5 = str4;
                        jSONObject4 = jSONObject;
                        j5 = -j7;
                    } else {
                        str5 = str4;
                        jSONObject4 = jSONObject;
                        str7 = " ";
                        j7 = j2;
                    }
                    try {
                        if (jSONObject3.has("topic_id")) {
                            try {
                                i5 = jSONObject3.getInt("topic_id");
                            } catch (Throwable th7) {
                                th = th7;
                                i2 = i4;
                            }
                        } else {
                            i5 = 0;
                        }
                        StringBuilder sb = new StringBuilder();
                        str8 = str6;
                        sb.append("recived push notification {");
                        sb.append(str3);
                        sb.append("} chatId ");
                        sb.append(j7);
                        sb.append(" custom topicId ");
                        sb.append(i5);
                        fc4.b(sb.toString());
                        if (jSONObject3.has("encryption_id")) {
                            str9 = "silent";
                            str10 = "loc_args";
                            j5 = pg3.E(jSONObject3.getInt("encryption_id"));
                        } else {
                            str9 = "silent";
                            str10 = "loc_args";
                        }
                        z2 = !jSONObject3.has("schedule") && jSONObject3.getInt("schedule") == 1;
                        if (j5 == j2 && "ENCRYPTED_MESSAGE".equals(str3)) {
                            j5 = lo7.o0;
                        }
                        j8 = j5;
                        try {
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        i5 = i4;
                        i2 = i5;
                        str4 = str5;
                        i = -1;
                        if (i2 != i) {
                        }
                        if (e21.a) {
                        }
                        fc4.f(th);
                        return;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str5 = str4;
                }
                if (j8 != j2) {
                    String str21 = str10;
                    boolean z16 = z2;
                    if ("CONF_CALL_REQUEST".equals(str3)) {
                        j9 = j8;
                        str11 = "msg_id";
                        str12 = "call_id";
                    } else if ("CONF_VIDEOCALL_REQUEST".equals(str3)) {
                        j9 = j8;
                        str11 = "msg_id";
                        str12 = "call_id";
                    } else if ("READ_HISTORY".equals(str3)) {
                        int i17 = jSONObject3.getInt("max_id");
                        ArrayList arrayList = new ArrayList();
                        if (e21.a) {
                            fc4.b(str + " received read notification max_id = " + i17 + " for dialogId = " + j8);
                        }
                        if (j3 != j2) {
                            TL_update.TL_updateReadChannelInbox tL_updateReadChannelInbox = new TL_update.TL_updateReadChannelInbox();
                            tL_updateReadChannelInbox.channel_id = j3;
                            tL_updateReadChannelInbox.max_id = i17;
                            tL_updateReadChannelInbox.still_unread_count = 0;
                            arrayList.add(tL_updateReadChannelInbox);
                        } else {
                            TL_update.TL_updateReadHistoryInbox tL_updateReadHistoryInbox = new TL_update.TL_updateReadHistoryInbox();
                            if (j6 != j2) {
                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                tL_updateReadHistoryInbox.peer = tL_peerUser2;
                                tL_peerUser2.user_id = j6;
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_updateReadHistoryInbox.peer = tL_peerChat;
                                tL_peerChat.chat_id = j7;
                            }
                            tL_updateReadHistoryInbox.max_id = i17;
                            arrayList.add(tL_updateReadHistoryInbox);
                        }
                        oc7.r1(i4).S3(arrayList, null, null, false, 0);
                    } else if ("READ_STORIES".equals(str3)) {
                        lo7.l0.c(new co7(lo7.n(i4), j8, jSONObject3.getInt("max_id"), (byte) 1));
                    } else if ("STORY_DELETED".equals(str3)) {
                        lo7.l0.c(new co7(lo7.n(i4), j8, jSONObject3.getInt("story_id"), (byte) 0));
                    } else if ("MESSAGE_DELETED".equals(str3)) {
                        String[] split = jSONObject3.getString("messages").split(",");
                        vh6 vh6Var = new vh6();
                        ArrayList arrayList2 = new ArrayList();
                        for (String str22 : split) {
                            arrayList2.add(Utilities.z(str22));
                        }
                        vh6Var.k(arrayList2, -j3);
                        lo7.n(i4).M(vh6Var, false);
                        oc7.r1(i4).Y(j8, j3, arrayList2);
                        if (e21.a) {
                            fc4.b(str + " received " + str3 + " for dialogId = " + j8 + " mids = " + TextUtils.join(",", arrayList2));
                        }
                    } else {
                        long j17 = j6;
                        if ("READ_REACTION".equals(str3)) {
                            String[] split2 = jSONObject3.getString("messages").split(",");
                            vh6 vh6Var2 = new vh6();
                            ArrayList arrayList3 = new ArrayList();
                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                            for (String str23 : split2) {
                                Integer z17 = Utilities.z(str23);
                                int intValue2 = z17.intValue();
                                arrayList3.add(z17);
                                sparseBooleanArray.put(intValue2, false);
                            }
                            vh6Var2.k(arrayList3, -j3);
                            lo7.n(i4).M(vh6Var2, true);
                            oc7.r1(i4).L(j8, i5, sparseBooleanArray, true);
                            if (e21.a) {
                                fc4.b(str + " received " + str3 + " for dialogId = " + j8 + " mids = " + TextUtils.join(",", arrayList3));
                            }
                        } else if (!TextUtils.isEmpty(str3)) {
                            if (jSONObject3.has("msg_id")) {
                                i7 = jSONObject3.getInt("msg_id");
                            } else if (jSONObject3.has("story_id")) {
                                i7 = jSONObject3.getInt("story_id");
                            } else {
                                i6 = i5;
                                i7 = 0;
                                if (jSONObject3.has("random_id")) {
                                    j10 = j7;
                                    j11 = j2;
                                } else {
                                    j10 = j7;
                                    j11 = Utilities.A(jSONObject3.getString("random_id")).longValue();
                                }
                                if (i7 != 0) {
                                    j12 = j3;
                                    if (j11 != j2) {
                                        break;
                                    }
                                } else {
                                    j12 = j3;
                                    Integer num = (Integer) oc7.r1(i4).P.get(Long.valueOf(j8));
                                    if (num == null) {
                                        num = Integer.valueOf(cf7.Y(i4).S(j8, false));
                                        oc7.r1(i4).P.put(Long.valueOf(j8), num);
                                    }
                                    z3 = i7 > num.intValue();
                                }
                                if (!str3.startsWith("REACT_") || str3.startsWith("CHAT_REACT_")) {
                                    z3 = true;
                                }
                                z4 = z3;
                                if (!str3.equals("STORY_NOTEXT") || str3.equals("STORY_LIVE") || str3.equals("STORY_HIDDEN_AUTHOR")) {
                                    i8 = !jSONObject3.has("story_id") ? jSONObject3.getInt("story_id") : -1;
                                    z4 = i8 < 0;
                                } else {
                                    i8 = -1;
                                }
                                if (z4) {
                                    i5 = i4;
                                    if ("CONF_CALL_MISSED".equalsIgnoreCase(str3)) {
                                        VoIPGroupNotification.hideByCallId(a.b, i5, jSONObject3.getLong("call_id"));
                                    }
                                } else {
                                    int i18 = i8;
                                    long j18 = j11;
                                    long j19 = j2;
                                    long optLong = jSONObject3.optLong("chat_from_id", j19);
                                    long optLong2 = jSONObject3.optLong("chat_from_broadcast_id", j19);
                                    long optLong3 = jSONObject3.optLong("chat_from_group_id", j19);
                                    int i19 = (optLong > j19 ? 1 : (optLong == j19 ? 0 : -1));
                                    boolean z18 = (i19 == 0 && optLong3 == j19) ? false : true;
                                    if (!jSONObject3.has("mention") || jSONObject3.getInt("mention") == 0) {
                                        String str24 = str9;
                                        i9 = i19;
                                        str13 = str24;
                                        z5 = false;
                                    } else {
                                        String str25 = str9;
                                        i9 = i19;
                                        str13 = str25;
                                        z5 = true;
                                    }
                                    if (!jSONObject3.has(str13) || jSONObject3.getInt(str13) == 0) {
                                        JSONObject jSONObject7 = jSONObject4;
                                        z6 = z18;
                                        jSONObject5 = jSONObject7;
                                        z7 = false;
                                    } else {
                                        JSONObject jSONObject8 = jSONObject4;
                                        z6 = z18;
                                        jSONObject5 = jSONObject8;
                                        z7 = true;
                                    }
                                    boolean z19 = z5;
                                    if (jSONObject5.has(str21)) {
                                        JSONArray jSONArray = jSONObject5.getJSONArray(str21);
                                        int length = jSONArray.length();
                                        i10 = i7;
                                        String[] strArr3 = new String[length];
                                        for (int i20 = 0; i20 < length; i20++) {
                                            strArr3[i20] = jSONArray.getString(i20);
                                        }
                                        strArr2 = strArr3;
                                    } else {
                                        i10 = i7;
                                        strArr2 = null;
                                    }
                                    String str26 = (strArr2 == null || strArr2.length <= 0) ? null : strArr2[0];
                                    boolean has = jSONObject3.has("edit_date");
                                    if (!str3.startsWith("CHAT_") || strArr2 == null || strArr2.length <= 0) {
                                        if (str3.startsWith("PINNED_")) {
                                            z8 = z16;
                                            j13 = j10;
                                            z10 = false;
                                            str14 = null;
                                            z11 = j12 != 0;
                                            z9 = true;
                                            if (str3.startsWith("REACT_") && !str3.startsWith("CHAT_REACT_")) {
                                                z13 = z9;
                                                String str27 = str26;
                                                str17 = "CHAT_REACT_";
                                                str16 = "REACT_";
                                                z12 = z7;
                                                j14 = optLong2;
                                                str15 = " for dialogId = ";
                                                JSONObject jSONObject9 = jSONObject3;
                                                switch (str3.hashCode()) {
                                                    case -2104766184:
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (str3.equals(obj)) {
                                                            str20 = jb6.L0(2131744280);
                                                            z15 = false;
                                                            i11 = i18;
                                                            str18 = str27;
                                                            str19 = null;
                                                            break;
                                                        }
                                                        if (e21.a) {
                                                            fc4.l("unhandled loc_key = " + str3);
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -2100047043:
                                                        i5 = i4;
                                                        if (!str3.equals("MESSAGE_GAME_SCORE")) {
                                                            z14 = false;
                                                            obj = "STORY_NOTEXT";
                                                            if (e21.a) {
                                                            }
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        z14 = false;
                                                        Y2 = jb6.Y(2131747737, "NotificationMessageGameScored", strArr2[0], strArr2[1], strArr2[2]);
                                                        z15 = false;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = Y2;
                                                        obj = "STORY_NOTEXT";
                                                        break;
                                                    case -2091498420:
                                                        i5 = i4;
                                                        if (str3.equals("CHANNEL_MESSAGE_CONTACT")) {
                                                            Y = jb6.Y(2131752317, "ChannelMessageContact2", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753944);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -2053872415:
                                                        i5 = i4;
                                                        break;
                                                    case -2039746363:
                                                        String str28 = str7;
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_STICKER")) {
                                                            if (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) {
                                                                Y = jb6.Y(2131747690, "NotificationMessageSticker", strArr2[0]);
                                                                L0 = jb6.L0(2131753901);
                                                            } else {
                                                                Y = jb6.Y(2131747689, "NotificationMessageStickerEmoji", strArr2[0], strArr2[1]);
                                                                L0 = strArr2[1] + str28 + jb6.L0(2131753901);
                                                            }
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -2023218804:
                                                        i5 = i4;
                                                        if (str3.equals("CHANNEL_MESSAGE_VIDEOS")) {
                                                            Y2 = jb6.Y(2131752315, "ChannelMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Videos", new Object[0]));
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1979538588:
                                                        i5 = i4;
                                                        if (str3.equals("CHANNEL_MESSAGE_DOC")) {
                                                            Y = jb6.Y(2131752316, "ChannelMessageDocument", strArr2[0]);
                                                            L0 = jb6.L0(2131753940);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1979536003:
                                                        i5 = i4;
                                                        if (str3.equals("CHANNEL_MESSAGE_GEO")) {
                                                            Y = jb6.Y(2131752312, "ChannelMessageMap", strArr2[0]);
                                                            L0 = jb6.L0(2131753926);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1979535888:
                                                        i5 = i4;
                                                        if (str3.equals("CHANNEL_MESSAGE_GIF")) {
                                                            Y = jb6.Y(2131752314, "ChannelMessageGIF", strArr2[0]);
                                                            L0 = jb6.L0(2131753936);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1969004705:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_ADD_MEMBER")) {
                                                            Y2 = jb6.Y(2131747767, "NotificationGroupAddMember", strArr2[0], strArr2[1], strArr2[2]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1946699248:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_JOINED")) {
                                                            Y2 = jb6.Y(2131747765, "NotificationGroupAddSelfMega", strArr2[0], strArr2[1]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1891964556:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_MESSAGE_TODO_APPEND")) {
                                                            Y2 = jb6.Z(2131747714, strArr2[0], strArr2[1], strArr2[2]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1833440864:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_MESSAGE_GIVEAWAY_STARS")) {
                                                            try {
                                                                i13 = Integer.parseInt(strArr2[2]);
                                                            } catch (Exception unused) {
                                                                i13 = 1;
                                                            }
                                                            Y = jb6.Z(2131747743, strArr2[0], strArr2[1], jb6.G(i13, "AmongWinners", new Object[0]), strArr2[3]);
                                                            L0 = jb6.L0(2131753457);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1717283471:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_REQ_JOINED")) {
                                                            Y2 = jb6.Y(2131743456, "UserAcceptedToGroupPushWithGroup", strArr2[0], strArr2[1]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1646640058:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_VOICECHAT_START")) {
                                                            Y2 = jb6.Y(2131747763, "NotificationGroupCreatedCall", strArr2[0], strArr2[1]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1633328296:
                                                        i5 = i4;
                                                        if (str3.equals("PINNED_PAID_MEDIA")) {
                                                            int parseInt = Integer.parseInt(strArr2[1]);
                                                            reactedText = jb6.G(parseInt, "NotificationPinnedPaidMedia", strArr2[0]);
                                                            str19 = jb6.G(parseInt, "NotificationPinnedPaidMedia", strArr2[0]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = false;
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1528047021:
                                                        i5 = i4;
                                                        if (str3.equals("CHAT_MESSAGES")) {
                                                            Y2 = jb6.Y(2131747764, "NotificationGroupAlbum", strArr2[0], strArr2[1]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1507149394:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_RECURRING_PAY")) {
                                                            Y = jb6.Y(2131747700, "NotificationMessageRecurringPay", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131747131);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1493579426:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_AUDIO")) {
                                                            Y = jb6.Z(2131747747, strArr2[0]);
                                                            L0 = jb6.L0(2131753947);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1482481933:
                                                        i5 = i4;
                                                        break;
                                                    case -1480102982:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_PHOTO")) {
                                                            Y = jb6.Y(2131747703, "NotificationMessagePhoto", strArr2[0]);
                                                            L0 = jb6.L0(2131753913);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1478041834:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_ROUND")) {
                                                            Y = jb6.Y(2131747699, "NotificationMessageRound", strArr2[0]);
                                                            L0 = jb6.L0(2131753906);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1476974979:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_STORY")) {
                                                            Y = jb6.Y(2131747664, "NotificationStory", strArr2[0]);
                                                            L0 = jb6.L0(2131744424);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1474543101:
                                                        i5 = i4;
                                                        if (str3.equals("MESSAGE_VIDEO")) {
                                                            Y = jb6.Y(2131747679, "NotificationMessageVideo", strArr2[0]);
                                                            L0 = jb6.L0(2131753898);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1465695932:
                                                        i5 = i4;
                                                        if (str3.equals("ENCRYPTION_ACCEPT")) {
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1428026623:
                                                        if (str3.equals("CONF_CALL_MISSED")) {
                                                            i5 = i4;
                                                            VoIPGroupNotification.hideByCallId(a.b, i5, jSONObject9.getLong("call_id"));
                                                            int parseInt2 = Integer.parseInt(strArr2[1]);
                                                            Y2 = parseInt2 <= 0 ? jb6.Z(2131747853, strArr2[0]) : jb6.J(parseInt2, "NotificationActionMissedCallConferenceOther", strArr2[0]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1374906292:
                                                        if (str3.equals("ENCRYPTED_MESSAGE")) {
                                                            Y2 = jb6.L0(2131742500);
                                                            str18 = jb6.L0(2131745427);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1372940586:
                                                        if (str3.equals("CHAT_RETURNED")) {
                                                            Y2 = jb6.Y(2131747766, "NotificationGroupAddSelf", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1264245338:
                                                        if (str3.equals("PINNED_INVOICE")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747826, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747828, strArr2[0], strArr2[1]) : jb6.Z(2131747827, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1236154001:
                                                        if (str3.equals("CHANNEL_MESSAGE_DOCS")) {
                                                            Y2 = jb6.Y(2131752315, "ChannelMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Files", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1236086700:
                                                        if (str3.equals("CHANNEL_MESSAGE_FWDS")) {
                                                            Y2 = jb6.Y(2131752315, "ChannelMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "ForwardedMessageCount", new Object[0]).toLowerCase());
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1236077786:
                                                        if (str3.equals("CHANNEL_MESSAGE_GAME")) {
                                                            Y = jb6.Y(2131747738, "NotificationMessageGame", strArr2[0]);
                                                            L0 = jb6.L0(2131753937);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1235796237:
                                                        if (str3.equals("CHANNEL_MESSAGE_POLL")) {
                                                            Y = jb6.Z(2131752308, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131746918);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1235760759:
                                                        if (str3.equals("CHANNEL_MESSAGE_QUIZ")) {
                                                            Y = jb6.Y(2131752307, "ChannelMessageQuiz2", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131746178);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1235686303:
                                                        break;
                                                    case -1235677318:
                                                        if (str3.equals("CHANNEL_MESSAGE_TODO")) {
                                                            Y = jb6.Z(2131752303, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131743794);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1198046100:
                                                        if (str3.equals("MESSAGE_VIDEO_SECRET")) {
                                                            Y = jb6.Y(2131747697, "NotificationMessageSDVideo", strArr2[0]);
                                                            L0 = jb6.L0(2131753941);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1124254527:
                                                        if (str3.equals("CHAT_MESSAGE_CONTACT")) {
                                                            Y = jb6.Y(2131747732, "NotificationMessageGroupContact2", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131753944);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1085137927:
                                                        if (str3.equals("PINNED_GAME")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747838, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747843, strArr2[0], strArr2[1]) : jb6.Z(2131747842, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1084856378:
                                                        if (str3.equals("PINNED_POLL")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747814, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747816, strArr2[0], strArr2[2], strArr2[1]) : jb6.Z(2131747815, strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1084820900:
                                                        if (str3.equals("PINNED_QUIZ")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747811, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747813, strArr2[0], strArr2[2], strArr2[1]) : jb6.Z(2131747812, strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1084746444:
                                                        if (str3.equals("PINNED_TEXT")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747799, "NotificationActionPinnedTextUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747801, "NotificationActionPinnedText", strArr2[0], strArr2[1], strArr2[2]) : jb6.Y(2131747800, "NotificationActionPinnedTextChannel", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -1084737459:
                                                        if (str3.equals("PINNED_TODO")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747796, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747798, strArr2[0], strArr2[2], strArr2[1]) : jb6.Z(2131747797, strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -947756761:
                                                        if (str3.equals("CHANNEL_MESSAGE_TODO_DONE")) {
                                                            Y2 = jb6.Z(2131752301, strArr2[0], strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -891852842:
                                                        if (str3.equals("STORY_HIDDEN_AUTHOR")) {
                                                            G = jb6.G(1, "StoryNotificationHidden", new Object[0]);
                                                            str20 = G;
                                                            i5 = i4;
                                                            i11 = i18;
                                                            str18 = str27;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -819729482:
                                                        if (str3.equals("PINNED_STICKER")) {
                                                            Y2 = j8 > j2 ? (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) ? jb6.Y(2131747802, "NotificationActionPinnedStickerUser", strArr2[0]) : jb6.Y(2131747803, "NotificationActionPinnedStickerEmojiUser", strArr2[0], strArr2[1]) : z6 ? (strArr2.length <= 2 || TextUtils.isEmpty(strArr2[2])) ? jb6.Y(2131747807, "NotificationActionPinnedSticker", strArr2[0], strArr2[1]) : jb6.Y(2131747805, "NotificationActionPinnedStickerEmoji", strArr2[0], strArr2[2], strArr2[1]) : (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) ? jb6.Y(2131747806, "NotificationActionPinnedStickerChannel", strArr2[0]) : jb6.Y(2131747804, "NotificationActionPinnedStickerEmojiChannel", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -772141857:
                                                        break;
                                                    case -706345256:
                                                        if (str3.equals("MESSAGE_UNIQUE_STARGIFT")) {
                                                            str14 = strArr2[0];
                                                            Y = jb6.Z(2131747685, str14);
                                                            L0 = jb6.L0(2131749829);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -638310039:
                                                        String str29 = str7;
                                                        if (str3.equals("CHANNEL_MESSAGE_STICKER")) {
                                                            if (strArr2.length <= 1 || TextUtils.isEmpty(strArr2[1])) {
                                                                Y = jb6.Y(2131752305, "ChannelMessageSticker", strArr2[0]);
                                                                L0 = jb6.L0(2131753901);
                                                            } else {
                                                                Y = jb6.Y(2131752304, "ChannelMessageStickerEmoji", strArr2[0], strArr2[1]);
                                                                L0 = strArr2[1] + str29 + jb6.L0(2131753901);
                                                            }
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -590403924:
                                                        if (str3.equals("PINNED_GAME_SCORE")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747839, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747841, strArr2[0], strArr2[1]) : jb6.Z(2131747840, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -589196239:
                                                        if (str3.equals("PINNED_DOC")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747844, "NotificationActionPinnedFileUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747846, "NotificationActionPinnedFile", strArr2[0], strArr2[1]) : jb6.Y(2131747845, "NotificationActionPinnedFileChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -589193654:
                                                        if (str3.equals("PINNED_GEO")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747832, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747837, strArr2[0], strArr2[1]) : jb6.Z(2131747836, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -589193539:
                                                        if (str3.equals("PINNED_GIF")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747829, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747831, strArr2[0], strArr2[1]) : jb6.Z(2131747830, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -573031834:
                                                        break;
                                                    case -455004278:
                                                        if (str3.equals("MESSAGE_WALLPAPER")) {
                                                            Y = jb6.Y(2131754561, "ActionSetWallpaperForThisChat", strArr2[0]);
                                                            L0 = jb6.L0(2131742616);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -440169325:
                                                        if (str3.equals("AUTH_UNKNOWN")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -412748110:
                                                        if (str3.equals("CHAT_DELETE_YOU")) {
                                                            Y2 = jb6.Y(2131747756, "NotificationGroupKickYou", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -346082433:
                                                        if (str3.equals("CHANNEL_MESSAGE_TODO_APPEND")) {
                                                            Y2 = jb6.Z(2131752302, strArr2[0], strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -242433887:
                                                        if (str3.equals("MESSAGE_SAME_WALLPAPER")) {
                                                            Y = jb6.Y(2131754564, "ActionSetSameWallpaperForThisChat", strArr2[0]);
                                                            L0 = jb6.L0(2131742614);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -228518075:
                                                        if (str3.equals("MESSAGE_GEOLIVE")) {
                                                            Y = jb6.Y(2131747710, "NotificationMessageLiveLocation", strArr2[0]);
                                                            L0 = jb6.L0(2131753931);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -213586509:
                                                        if (str3.equals("ENCRYPTION_REQUEST")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -115582002:
                                                        if (str3.equals("CHAT_MESSAGE_INVOICE")) {
                                                            Y = jb6.Y(2131747727, "NotificationMessageGroupInvoice", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131747131);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -112621464:
                                                        if (str3.equals("CONTACT_JOINED")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -108522133:
                                                        if (str3.equals("AUTH_REGION")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -107572034:
                                                        if (str3.equals("MESSAGE_SCREENSHOT")) {
                                                            Y2 = jb6.L0(2131754532).replace("un1", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -77243824:
                                                        if (str3.equals("MESSAGE_SUGGEST_BIRTHDAY")) {
                                                            Y2 = jb6.Z(2131747688, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -40534265:
                                                        if (str3.equals("CHAT_DELETE_MEMBER")) {
                                                            Y2 = jb6.Y(2131747757, "NotificationGroupKickMember", strArr2[0], strArr2[1], strArr2.length <= 2 ? str8 : strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case -35560251:
                                                        if (str3.equals("CHANNEL_MESSAGE_PAID_MEDIA")) {
                                                            int parseInt3 = Integer.parseInt(strArr2[1]);
                                                            Y = jb6.G(parseInt3, "NotificationChannelMessagePaidMedia", strArr2[0]);
                                                            L0 = jb6.G(parseInt3, "NotificationPaidMedia", new Object[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 52369421:
                                                        if (str3.equals("REACT_TEXT")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 65254746:
                                                        if (str3.equals("CHAT_ADD_YOU")) {
                                                            i5 = i4;
                                                            Y2 = jb6.Y(2131747750, "NotificationInvitedToGroup", strArr2[0], strArr2[1]);
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 120441350:
                                                        if (str3.equals("PINNED_GIVEAWAY")) {
                                                            Y2 = jb6.Z(2131747674, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 141040782:
                                                        if (str3.equals("CHAT_LEFT")) {
                                                            Y2 = jb6.Y(2131747755, "NotificationGroupLeftMember", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 172201318:
                                                        if (str3.equals("MESSAGE_GRAM_TRANSFER_UNKNOWN_COMMENT")) {
                                                            boolean startsWith = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                            boolean endsWith = str3.endsWith("_COMMENT");
                                                            if (strArr2 != null) {
                                                                if (strArr2.length >= (endsWith ? 3 : 2)) {
                                                                    str19 = jb6.Z(startsWith ? endsWith ? 2131747768 : 2131747769 : endsWith ? 2131747771 : 2131747772, strArr2);
                                                                    i5 = i4;
                                                                    i11 = i10;
                                                                    str18 = str27;
                                                                    obj = "STORY_NOTEXT";
                                                                    z14 = false;
                                                                    z15 = false;
                                                                    str20 = str19;
                                                                    break;
                                                                }
                                                            }
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 191667248:
                                                        if (str3.equals("CHAT_MESSAGE_PAID_MEDIA")) {
                                                            int parseInt4 = Integer.parseInt(strArr2[2]);
                                                            Y = jb6.G(parseInt4, "NotificationChatMessagePaidMedia", strArr2[0], strArr2[1]);
                                                            L0 = jb6.G(parseInt4, "NotificationPaidMedia", new Object[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 202550149:
                                                        if (str3.equals("CHAT_VOICECHAT_INVITE")) {
                                                            Y2 = jb6.Y(2131747759, "NotificationGroupInvitedToCall", strArr2[0], strArr2[1], strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 309993049:
                                                        if (str3.equals("CHAT_MESSAGE_DOC")) {
                                                            Y = jb6.Y(2131747731, "NotificationMessageGroupDocument", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753940);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 309995634:
                                                        if (str3.equals("CHAT_MESSAGE_GEO")) {
                                                            Y = jb6.Y(2131747725, "NotificationMessageGroupMap", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753926);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 309995749:
                                                        if (str3.equals("CHAT_MESSAGE_GIF")) {
                                                            Y = jb6.Y(2131747728, "NotificationMessageGroupGif", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753936);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 320532812:
                                                        if (str3.equals("MESSAGES")) {
                                                            Y2 = jb6.Z(2131747748, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 328933854:
                                                        if (str3.equals("CHAT_MESSAGE_STICKER")) {
                                                            if (strArr2.length <= 2 || TextUtils.isEmpty(strArr2[2])) {
                                                                Y = jb6.Y(2131747718, "NotificationMessageGroupSticker", strArr2[0], strArr2[1]);
                                                                L0 = strArr2[1] + str7 + jb6.L0(2131753901);
                                                            } else {
                                                                Y = jb6.Y(2131747717, "NotificationMessageGroupStickerEmoji", strArr2[0], strArr2[1], strArr2[2]);
                                                                L0 = strArr2[2] + str7 + jb6.L0(2131753901);
                                                            }
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 331340546:
                                                        if (str3.equals("CHANNEL_MESSAGE_AUDIO")) {
                                                            Y = jb6.Y(2131752318, "ChannelMessageAudio", strArr2[0]);
                                                            L0 = jb6.L0(2131753947);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 342406591:
                                                        if (str3.equals("CHAT_VOICECHAT_END")) {
                                                            Y2 = jb6.Y(2131747762, "NotificationGroupEndedCall", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 344816990:
                                                        if (str3.equals("CHANNEL_MESSAGE_PHOTO")) {
                                                            Y = jb6.Y(2131752309, "ChannelMessagePhoto", strArr2[0]);
                                                            L0 = jb6.L0(2131753913);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 346878138:
                                                        if (str3.equals("CHANNEL_MESSAGE_ROUND")) {
                                                            Y = jb6.Y(2131752306, "ChannelMessageRound", strArr2[0]);
                                                            L0 = jb6.L0(2131753906);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 347944993:
                                                        if (str3.equals("CHANNEL_MESSAGE_STORY")) {
                                                            Y = jb6.Y(2131747786, "NotificationChannelStory", strArr2[0]);
                                                            L0 = jb6.L0(2131744424);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 350376871:
                                                        if (str3.equals("CHANNEL_MESSAGE_VIDEO")) {
                                                            Y = jb6.Y(2131752300, "ChannelMessageVideo", strArr2[0]);
                                                            L0 = jb6.L0(2131753898);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 469501563:
                                                        if (str3.equals("MESSAGE_GRAM_TRANSFER")) {
                                                            boolean startsWith2 = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                            boolean endsWith2 = str3.endsWith("_COMMENT");
                                                            if (strArr2 != null) {
                                                            }
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 510462069:
                                                        if (str3.equals("MESSAGE_GIFTCODE")) {
                                                            Y2 = jb6.Y(2131747735, "NotificationMessageGiftCode", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Months", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 608430149:
                                                        if (str3.equals("CHAT_VOICECHAT_INVITE_YOU")) {
                                                            Y2 = jb6.Y(2131747758, "NotificationGroupInvitedYouToCall", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 615714517:
                                                        if (str3.equals("MESSAGE_PHOTO_SECRET")) {
                                                            Y = jb6.Y(2131747698, "NotificationMessageSDPhoto", strArr2[0]);
                                                            L0 = jb6.L0(2131753942);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 662207611:
                                                        if (str3.equals("MESSAGE_GRAM_TRANSFER_COMMENT")) {
                                                            boolean startsWith22 = str3.startsWith("MESSAGE_GRAM_TRANSFER_UNKNOWN");
                                                            boolean endsWith22 = str3.endsWith("_COMMENT");
                                                            if (strArr2 != null) {
                                                            }
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 702966260:
                                                        if (str3.equals("MESSAGE_STARGIFT_UNPACK_UPGRADE")) {
                                                            str14 = strArr2[0];
                                                            Y = jb6.Z(2131747681, str14);
                                                            L0 = jb6.L0(2131749823);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 715508879:
                                                        if (str3.equals("PINNED_AUDIO")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747790, "NotificationActionPinnedVoiceUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747792, "NotificationActionPinnedVoice", strArr2[0], strArr2[1]) : jb6.Y(2131747791, "NotificationActionPinnedVoiceChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 728985323:
                                                        if (str3.equals("PINNED_PHOTO")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747817, "NotificationActionPinnedPhotoUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747819, "NotificationActionPinnedPhoto", strArr2[0], strArr2[1]) : jb6.Y(2131747818, "NotificationActionPinnedPhotoChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 731046471:
                                                        if (str3.equals("PINNED_ROUND")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747808, "NotificationActionPinnedRoundUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747810, "NotificationActionPinnedRound", strArr2[0], strArr2[1]) : jb6.Y(2131747809, "NotificationActionPinnedRoundChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 734545204:
                                                        if (str3.equals("PINNED_VIDEO")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747793, "NotificationActionPinnedVideoUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747795, "NotificationActionPinnedVideo", strArr2[0], strArr2[1]) : jb6.Y(2131747794, "NotificationActionPinnedVideoChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 802032552:
                                                        if (str3.equals("MESSAGE_CONTACT")) {
                                                            Y = jb6.Z(2131747742, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753944);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 860688476:
                                                        if (str3.equals("CHAT_MESSAGE_TODO_DONE")) {
                                                            Y2 = jb6.Z(2131747713, strArr2[0], strArr2[1], strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 901537717:
                                                        if (str3.equals("CHANNEL_MESSAGE_GIVEAWAY_STARS")) {
                                                            try {
                                                                i14 = Integer.parseInt(strArr2[1]);
                                                            } catch (Exception unused2) {
                                                                i14 = 1;
                                                            }
                                                            Y = jb6.Z(2131747745, strArr2[0], jb6.G(i14, "AmongWinners", new Object[0]), strArr2[2]);
                                                            L0 = jb6.L0(2131753457);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 954623703:
                                                        if (str3.equals("MESSAGE_GIVEAWAY")) {
                                                            Y2 = jb6.Y(2131747734, "NotificationMessageGiveaway", strArr2[0], strArr2[1], strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 977076186:
                                                        if (str3.equals("MESSAGE_STARGIFT")) {
                                                            str14 = strArr2[0];
                                                            Y = jb6.J(Integer.parseInt(strArr2[1]), "NotificationMessageStarGift", strArr2[0]);
                                                            L0 = jb6.I(Integer.parseInt(strArr2[1]), "Gift2Notification");
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 991498806:
                                                        if (str3.equals("PINNED_GEOLIVE")) {
                                                            Y2 = j8 > j2 ? jb6.Z(2131747833, strArr2[0], strArr2[1]) : z6 ? jb6.Z(2131747835, strArr2[0], strArr2[1]) : jb6.Z(2131747834, strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1007364121:
                                                        if (str3.equals("CHANNEL_MESSAGE_GAME_SCORE")) {
                                                            i5 = i4;
                                                            z14 = false;
                                                            Y2 = jb6.Y(2131747737, "NotificationMessageGameScored", strArr2[0], strArr2[1], strArr2[2]);
                                                            z15 = false;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1019850010:
                                                        if (str3.equals("CHAT_MESSAGE_DOCS")) {
                                                            Y2 = jb6.Y(2131747761, "NotificationGroupFew", strArr2[0], strArr2[1], jb6.G(Utilities.z(strArr2[2]).intValue(), "Files", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1019917311:
                                                        if (str3.equals("CHAT_MESSAGE_FWDS")) {
                                                            Y2 = jb6.Y(2131747760, "NotificationGroupForwardedFew", strArr2[0], strArr2[1], jb6.G(Utilities.z(strArr2[2]).intValue(), "messages", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1019926225:
                                                        if (str3.equals("CHAT_MESSAGE_GAME")) {
                                                            Y = jb6.Y(2131747730, "NotificationMessageGroupGame", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131753937);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1020207774:
                                                        if (str3.equals("CHAT_MESSAGE_POLL")) {
                                                            Y = jb6.Z(2131747721, strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131746918);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1020243252:
                                                        if (str3.equals("CHAT_MESSAGE_QUIZ")) {
                                                            Y = jb6.Y(2131747720, "NotificationMessageGroupQuiz2", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131746897);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1020317708:
                                                        if (str3.equals("CHAT_MESSAGE_TEXT")) {
                                                            Y = jb6.Y(2131747716, "NotificationMessageGroupText", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = strArr2[2];
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1020326693:
                                                        if (str3.equals("CHAT_MESSAGE_TODO")) {
                                                            Y = jb6.Z(2131747715, strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131743794);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1054583304:
                                                        if (str3.equals("MESSAGE_STORY_MENTION")) {
                                                            Y2 = jb6.L0(2131744281);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060282259:
                                                        if (str3.equals("MESSAGE_DOCS")) {
                                                            Y2 = jb6.Y(2131747740, "NotificationMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Files", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060349560:
                                                        if (str3.equals("MESSAGE_FWDS")) {
                                                            Y2 = jb6.Y(2131747739, "NotificationMessageForwardFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "messages", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060358474:
                                                        if (str3.equals("MESSAGE_GAME")) {
                                                            Y = jb6.Y(2131747738, "NotificationMessageGame", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753937);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060640023:
                                                        if (str3.equals("MESSAGE_POLL")) {
                                                            Y = jb6.Z(2131747702, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131746918);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060675501:
                                                        if (str3.equals("MESSAGE_QUIZ")) {
                                                            Y = jb6.Z(2131747701, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131746178);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060749957:
                                                        if (str3.equals("MESSAGE_TEXT")) {
                                                            Y = jb6.Y(2131747687, "NotificationMessageText", strArr2[0], strArr2[1]);
                                                            L0 = strArr2[1];
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1060758942:
                                                        if (str3.equals("MESSAGE_TODO")) {
                                                            Y = jb6.Z(2131747686, strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131743794);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1073049781:
                                                        if (str3.equals("PINNED_NOTEXT")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747820, "NotificationActionPinnedNoTextUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747822, "NotificationActionPinnedNoText", strArr2[0], strArr2[1]) : jb6.Y(2131747821, "NotificationActionPinnedNoTextChannel", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1078101399:
                                                        if (str3.equals("CHAT_TITLE_EDITED")) {
                                                            Y2 = jb6.Y(2131747777, "NotificationEditedGroupName", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1110103437:
                                                        if (str3.equals("CHAT_MESSAGE_NOTEXT")) {
                                                            Y = jb6.Y(2131747723, "NotificationMessageGroupNoText", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131748360);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1144183001:
                                                        if (str3.equals("MESSAGE_GIVEAWAY_STARS")) {
                                                            try {
                                                                i15 = Integer.parseInt(strArr2[1]);
                                                            } catch (Exception unused3) {
                                                                i15 = 1;
                                                            }
                                                            Y2 = jb6.Z(2131747691, strArr2[0], jb6.G(i15, "AmongWinners", new Object[0]), strArr2[2]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1151995881:
                                                        if (str3.equals("MESSAGE_PAID_MEDIA")) {
                                                            int parseInt5 = Integer.parseInt(strArr2[1]);
                                                            Y = jb6.G(parseInt5, "NotificationMessagePaidMedia", strArr2[0]);
                                                            L0 = jb6.G(parseInt5, "NotificationPaidMedia", new Object[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1160762272:
                                                        if (str3.equals("CHAT_MESSAGE_PHOTOS")) {
                                                            Y2 = jb6.Y(2131747761, "NotificationGroupFew", strArr2[0], strArr2[1], jb6.G(Utilities.z(strArr2[2]).intValue(), "Photos", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1172918249:
                                                        if (str3.equals("CHANNEL_MESSAGE_GEOLIVE")) {
                                                            Y = jb6.Y(2131752313, "ChannelMessageLiveLocation", strArr2[0]);
                                                            L0 = jb6.L0(2131753931);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1234591620:
                                                        if (str3.equals("CHAT_MESSAGE_GAME_SCORE")) {
                                                            Y2 = jb6.Y(2131747729, "NotificationMessageGroupGameScored", strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1281128640:
                                                        if (str3.equals("MESSAGE_DOC")) {
                                                            Y = jb6.Y(2131747741, "NotificationMessageDocument", strArr2[0]);
                                                            L0 = jb6.L0(2131753940);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1281131225:
                                                        if (str3.equals("MESSAGE_GEO")) {
                                                            Y = jb6.Y(2131747709, "NotificationMessageMap", strArr2[0]);
                                                            L0 = jb6.L0(2131753926);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1281131340:
                                                        if (str3.equals("MESSAGE_GIF")) {
                                                            Y = jb6.Y(2131747736, "NotificationMessageGif", strArr2[0]);
                                                            L0 = jb6.L0(2131753936);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1310789062:
                                                        if (str3.equals("MESSAGE_NOTEXT")) {
                                                            Y = jb6.Y(2131747707, "NotificationMessageNoText", strArr2[0]);
                                                            L0 = jb6.L0(2131748360);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1333118583:
                                                        if (str3.equals("CHAT_MESSAGE_VIDEOS")) {
                                                            Y2 = jb6.Y(2131747761, "NotificationGroupFew", strArr2[0], strArr2[1], jb6.G(Utilities.z(strArr2[2]).intValue(), "Videos", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1361447897:
                                                        if (str3.equals("MESSAGE_PHOTOS")) {
                                                            Y2 = jb6.Y(2131747740, "NotificationMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Photos", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1369266398:
                                                        if (str3.equals("CHAT_MESSAGE_GIVEAWAY")) {
                                                            Y = jb6.Y(2131747744, "NotificationMessageChatGiveaway", strArr2[0], strArr2[1], strArr2[2], strArr2[3]);
                                                            L0 = jb6.L0(2131753457);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1420317335:
                                                        if (str3.equals("MESSAGE_STARGIFT_UPGRADE")) {
                                                            str14 = strArr2[0];
                                                            Y = jb6.Z(2131747680, str14);
                                                            L0 = jb6.L0(2131749822);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1449476787:
                                                        if (str3.equals("CHANNEL_MESSAGE_GIVEAWAY")) {
                                                            Y = jb6.Y(2131747746, "NotificationMessageChannelGiveaway", strArr2[0], strArr2[1], strArr2[2]);
                                                            L0 = jb6.L0(2131753457);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1498266155:
                                                        if (str3.equals("PHONE_CALL_MISSED")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1533804208:
                                                        if (str3.equals("MESSAGE_VIDEOS")) {
                                                            Y2 = jb6.Y(2131747740, "NotificationMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Videos", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1540131626:
                                                        if (str3.equals("MESSAGE_PLAYLIST")) {
                                                            Y2 = jb6.Y(2131747740, "NotificationMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "MusicFiles", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1547988151:
                                                        if (str3.equals("CHAT_MESSAGE_AUDIO")) {
                                                            Y = jb6.Y(2131747733, "NotificationMessageGroupAudio", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753947);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1561464595:
                                                        if (str3.equals("CHAT_MESSAGE_PHOTO")) {
                                                            Y = jb6.Y(2131747722, "NotificationMessageGroupPhoto", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753913);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1563525743:
                                                        if (str3.equals("CHAT_MESSAGE_ROUND")) {
                                                            Y = jb6.Y(2131747719, "NotificationMessageGroupRound", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753906);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1564592598:
                                                        if (str3.equals("CHAT_MESSAGE_STORY")) {
                                                            Y = jb6.Y(2131747781, "NotificationChatStory", strArr2[0]);
                                                            L0 = jb6.L0(2131744424);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1567024476:
                                                        if (str3.equals("CHAT_MESSAGE_VIDEO")) {
                                                            Y = jb6.Y(2131747712, "NotificationMessageGroupVideo", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753898);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1810705077:
                                                        if (str3.equals("MESSAGE_INVOICE")) {
                                                            Y = jb6.Y(2131747711, "NotificationMessageInvoice", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131747131);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1815177512:
                                                        if (str3.equals("CHANNEL_MESSAGES")) {
                                                            Y2 = jb6.Y(2131752319, "ChannelMessageAlbum", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1837240696:
                                                        if (str3.equals("CHAT_REACT_PAID_MEDIA")) {
                                                            int parseInt6 = Integer.parseInt(strArr2[1]);
                                                            reactedText = jb6.G(parseInt6, "NotificationPinnedPaidMedia", strArr2[0]);
                                                            str19 = jb6.G(parseInt6, "NotificationPinnedPaidMedia", strArr2[0]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = false;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1954774321:
                                                        if (str3.equals("CHAT_MESSAGE_PLAYLIST")) {
                                                            Y2 = jb6.Y(2131747761, "NotificationGroupFew", strArr2[0], strArr2[1], jb6.G(Utilities.z(strArr2[2]).intValue(), "MusicFiles", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 1963241394:
                                                        if (str3.equals("LOCKED_MESSAGE")) {
                                                            i5 = i4;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            z15 = z14;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            str19 = null;
                                                            str20 = null;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2008915478:
                                                        if (str3.equals("STORY_LIVE")) {
                                                            G = jb6.L0(2131744308);
                                                            str20 = G;
                                                            i5 = i4;
                                                            i11 = i18;
                                                            str18 = str27;
                                                            obj = "STORY_NOTEXT";
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2014789757:
                                                        if (str3.equals("CHAT_PHOTO_EDITED")) {
                                                            Y2 = jb6.Y(2131747776, "NotificationEditedGroupPhoto", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2022049433:
                                                        if (str3.equals("PINNED_CONTACT")) {
                                                            Y2 = j8 > j2 ? jb6.Y(2131747847, "NotificationActionPinnedContactUser", strArr2[0], strArr2[1]) : z6 ? jb6.Y(2131747849, "NotificationActionPinnedContact2", strArr2[0], strArr2[2], strArr2[1]) : jb6.Y(2131747848, "NotificationActionPinnedContactChannel2", strArr2[0], strArr2[1]);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = false;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2034984710:
                                                        if (str3.equals("CHANNEL_MESSAGE_PLAYLIST")) {
                                                            Y2 = jb6.Y(2131752315, "ChannelMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "MusicFiles", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2048733346:
                                                        if (str3.equals("CHANNEL_MESSAGE_NOTEXT")) {
                                                            Y = jb6.Y(2131752310, "ChannelMessageNoText", strArr2[0]);
                                                            L0 = jb6.L0(2131748360);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2099392181:
                                                        if (str3.equals("CHANNEL_MESSAGE_PHOTOS")) {
                                                            Y2 = jb6.Y(2131752315, "ChannelMessageFew", strArr2[0], jb6.G(Utilities.z(strArr2[1]).intValue(), "Photos", new Object[0]));
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            str19 = null;
                                                            z15 = true;
                                                            str20 = Y2;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2103150375:
                                                        if (str3.equals("MESSAGE_STARGIFT_PREPAID_UPGRADE")) {
                                                            str14 = strArr2[0];
                                                            Y = jb6.J(Integer.parseInt(strArr2[1]), "NotificationMessageUniqueStarGiftPrepaidUpgrade", strArr2[0]);
                                                            L0 = jb6.L0(2131749828);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    case 2140162142:
                                                        if (str3.equals("CHAT_MESSAGE_GEOLIVE")) {
                                                            Y = jb6.Y(2131747726, "NotificationMessageGroupLiveLocation", strArr2[0], strArr2[1]);
                                                            L0 = jb6.L0(2131753931);
                                                            i5 = i4;
                                                            i11 = i10;
                                                            str18 = str27;
                                                            z14 = false;
                                                            z15 = false;
                                                            str20 = Y;
                                                            str19 = L0;
                                                            obj = "STORY_NOTEXT";
                                                            break;
                                                        }
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                    default:
                                                        i5 = i4;
                                                        obj = "STORY_NOTEXT";
                                                        z14 = false;
                                                        if (e21.a) {
                                                        }
                                                        z15 = z14;
                                                        i11 = i10;
                                                        str18 = str27;
                                                        str19 = null;
                                                        str20 = null;
                                                        break;
                                                }
                                                if (e21.a) {
                                                    j15 = j8;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(str);
                                                    sb2.append(" received message notification ");
                                                    sb2.append(str3);
                                                    sb2.append(str15);
                                                    j15 = j8;
                                                    sb2.append(j15);
                                                    sb2.append(" mid = ");
                                                    sb2.append(i11);
                                                    fc4.b(sb2.toString());
                                                }
                                                if (str20 != null) {
                                                    boolean z20 = (str3.equals("REACT_STORY") || str3.equals("REACT_STORY_HIDDEN")) ? true : z14;
                                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                                    if (z20 && i11 > 0) {
                                                        i11 = -i11;
                                                    }
                                                    tL_message.id = i11;
                                                    tL_message.random_id = j18;
                                                    if (str19 == null) {
                                                        str19 = str20;
                                                    }
                                                    tL_message.message = str19;
                                                    tL_message.date = (int) (j / 1000);
                                                    if (z13) {
                                                        tL_message.action = new TLRPC.TL_messageActionPinMessage();
                                                    }
                                                    if (z11) {
                                                        tL_message.flags |= TLObject.FLAG_31;
                                                    }
                                                    tL_message.dialog_id = j15;
                                                    if (j12 != 0) {
                                                        tL_peerUser = new TLRPC.TL_peerChannel();
                                                        tL_message.peer_id = tL_peerUser;
                                                        tL_peerUser.channel_id = j12;
                                                        i12 = i5;
                                                        j16 = j13;
                                                    } else if (j13 != 0) {
                                                        tL_peerUser = new TLRPC.TL_peerChat();
                                                        tL_message.peer_id = tL_peerUser;
                                                        j16 = j13;
                                                        tL_peerUser.chat_id = j16;
                                                        i12 = i5;
                                                    } else {
                                                        j16 = j13;
                                                        tL_peerUser = new TLRPC.TL_peerUser();
                                                        tL_message.peer_id = tL_peerUser;
                                                        i12 = i5;
                                                        tL_peerUser.user_id = j17;
                                                    }
                                                    tL_message.flags |= 256;
                                                    if (optLong3 != 0) {
                                                        TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                                                        tL_message.from_id = tL_peerChat2;
                                                        tL_peerChat2.chat_id = j16;
                                                    } else if (j14 != 0) {
                                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                        tL_message.from_id = tL_peerChannel;
                                                        tL_peerChannel.channel_id = j14;
                                                    } else if (i9 != 0) {
                                                        TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                        tL_message.from_id = tL_peerUser3;
                                                        tL_peerUser3.user_id = optLong;
                                                    } else {
                                                        tL_message.from_id = tL_peerUser;
                                                    }
                                                    tL_message.mentioned = z19 || z13;
                                                    tL_message.silent = z12;
                                                    tL_message.from_scheduled = z8;
                                                    k47 k47Var = new k47(i12, tL_message, str20, str18, str14, z15, z10, z11, has);
                                                    i5 = i12;
                                                    if (i6 != 0) {
                                                        tL_message.reply_to = new TLRPC.TL_messageReplyHeader();
                                                        TLRPC.MessageReplyHeader messageReplyHeader = k47Var.k.reply_to;
                                                        messageReplyHeader.forum_topic = true;
                                                        messageReplyHeader.reply_to_top_id = i6;
                                                    }
                                                    k47Var.J = z20;
                                                    k47Var.I = !z20 && (str3.startsWith(str16) || str3.startsWith(str17));
                                                    k47Var.K = str3.equals(obj) || str3.equals("STORY_HIDDEN_AUTHOR");
                                                    k47Var.N = str3.equals("STORY_LIVE");
                                                    k47Var.L = str3.equals("MESSAGE_STORY_MENTION");
                                                    k47Var.M = str3.equals("STORY_HIDDEN_AUTHOR");
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(k47Var);
                                                    fc4.b("PushListenerController push notification to NotificationsController of " + tL_message.dialog_id);
                                                    if (!k47Var.J && !k47Var.I && !k47Var.L && !k47Var.K && !k47Var.M && !z19 && !z13 && i11 > 0) {
                                                        gm.c3(new Runnable() { // from class: yw8
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                PushListenerController.lambda$processRemoteMessage$5(i5, j15, i11);
                                                            }
                                                        });
                                                    }
                                                    lo7.n(i5).K(arrayList4, true, true, countDownLatch);
                                                    ConnectionsManager.onInternalPushReceived(i5);
                                                    ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                                                    break;
                                                }
                                            } else {
                                                str15 = " for dialogId = ";
                                                obj = "STORY_NOTEXT";
                                                str16 = "REACT_";
                                                str17 = "CHAT_REACT_";
                                                j14 = optLong2;
                                                z12 = z7;
                                                z13 = z9;
                                                i5 = i4;
                                                z14 = false;
                                                reactedText = getReactedText(str3, strArr2);
                                                z15 = false;
                                                i11 = i10;
                                                str18 = str26;
                                                str19 = null;
                                            }
                                            str20 = reactedText;
                                            if (e21.a) {
                                            }
                                            if (str20 != null) {
                                            }
                                        } else {
                                            if (str3.startsWith("CHANNEL_")) {
                                                z8 = z16;
                                                j13 = j10;
                                                z9 = false;
                                                z10 = true;
                                                z11 = false;
                                                str14 = null;
                                                if (str3.startsWith("REACT_")) {
                                                }
                                                str15 = " for dialogId = ";
                                                obj = "STORY_NOTEXT";
                                                str16 = "REACT_";
                                                str17 = "CHAT_REACT_";
                                                j14 = optLong2;
                                                z12 = z7;
                                                z13 = z9;
                                                i5 = i4;
                                                z14 = false;
                                                reactedText = getReactedText(str3, strArr2);
                                                z15 = false;
                                                i11 = i10;
                                                str18 = str26;
                                                str19 = null;
                                                str20 = reactedText;
                                                if (e21.a) {
                                                }
                                                if (str20 != null) {
                                                }
                                            }
                                            z8 = z16;
                                            j13 = j10;
                                            z9 = false;
                                            z10 = false;
                                            z11 = false;
                                            str14 = null;
                                            if (str3.startsWith("REACT_")) {
                                            }
                                            str15 = " for dialogId = ";
                                            obj = "STORY_NOTEXT";
                                            str16 = "REACT_";
                                            str17 = "CHAT_REACT_";
                                            j14 = optLong2;
                                            z12 = z7;
                                            z13 = z9;
                                            i5 = i4;
                                            z14 = false;
                                            reactedText = getReactedText(str3, strArr2);
                                            z15 = false;
                                            i11 = i10;
                                            str18 = str26;
                                            str19 = null;
                                            str20 = reactedText;
                                            if (e21.a) {
                                            }
                                            if (str20 != null) {
                                            }
                                        }
                                    } else if (m9c.A(j8)) {
                                        str26 = str26 + " @ " + strArr2[1];
                                        z8 = z16;
                                        j13 = j10;
                                        z9 = false;
                                        z10 = false;
                                        z11 = false;
                                        str14 = null;
                                        if (str3.startsWith("REACT_")) {
                                        }
                                        str15 = " for dialogId = ";
                                        obj = "STORY_NOTEXT";
                                        str16 = "REACT_";
                                        str17 = "CHAT_REACT_";
                                        j14 = optLong2;
                                        z12 = z7;
                                        z13 = z9;
                                        i5 = i4;
                                        z14 = false;
                                        reactedText = getReactedText(str3, strArr2);
                                        z15 = false;
                                        i11 = i10;
                                        str18 = str26;
                                        str19 = null;
                                        str20 = reactedText;
                                        if (e21.a) {
                                        }
                                        if (str20 != null) {
                                        }
                                    } else {
                                        boolean z21 = j12 != 0;
                                        str14 = str26;
                                        str26 = strArr2[1];
                                        j13 = j10;
                                        z11 = z21;
                                        z8 = z16;
                                        z9 = false;
                                        z10 = false;
                                        if (str3.startsWith("REACT_")) {
                                        }
                                        str15 = " for dialogId = ";
                                        obj = "STORY_NOTEXT";
                                        str16 = "REACT_";
                                        str17 = "CHAT_REACT_";
                                        j14 = optLong2;
                                        z12 = z7;
                                        z13 = z9;
                                        i5 = i4;
                                        z14 = false;
                                        reactedText = getReactedText(str3, strArr2);
                                        z15 = false;
                                        i11 = i10;
                                        str18 = str26;
                                        str19 = null;
                                        str20 = reactedText;
                                        if (e21.a) {
                                        }
                                        if (str20 != null) {
                                        }
                                    }
                                    th = th8;
                                    i2 = i5;
                                    str4 = str5;
                                    i = -1;
                                    if (i2 != i) {
                                        ConnectionsManager.onInternalPushReceived(i2);
                                        ConnectionsManager.getInstance(i2).resumeNetworkMaybe();
                                        countDownLatch.countDown();
                                    } else {
                                        onDecryptError();
                                    }
                                    if (e21.a) {
                                        fc4.d("error in loc_key = " + str3 + " json " + str4);
                                    }
                                    fc4.f(th);
                                }
                                countDownLatch.countDown();
                                ConnectionsManager.onInternalPushReceived(i5);
                                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                            }
                            i6 = i5;
                            if (jSONObject3.has("random_id")) {
                            }
                            if (i7 != 0) {
                            }
                            if (!str3.startsWith("REACT_")) {
                            }
                            z3 = true;
                            z4 = z3;
                            if (str3.equals("STORY_NOTEXT")) {
                            }
                            if (!jSONObject3.has("story_id")) {
                            }
                            if (i8 < 0) {
                            }
                            if (z4) {
                            }
                            countDownLatch.countDown();
                            ConnectionsManager.onInternalPushReceived(i5);
                            ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                        }
                    }
                    JSONObject jSONObject10 = jSONObject4;
                    i5 = i4;
                    long j20 = jSONObject3.getLong(str12);
                    int i21 = jSONObject3.getInt(str11);
                    if (jSONObject10.has(str21)) {
                        JSONArray jSONArray2 = jSONObject10.getJSONArray(str21);
                        int length2 = jSONArray2.length();
                        strArr = new String[length2];
                        for (int i22 = 0; i22 < length2; i22++) {
                            strArr[i22] = jSONArray2.getString(i22);
                        }
                    } else {
                        strArr = null;
                    }
                    if (System.currentTimeMillis() - j < oc7.r1(i5).a3) {
                        VoIPGroupNotification.request(a.b, i5, j9, (strArr == null || strArr.length <= 2) ? null : strArr[2], j20, i21, "CONF_VIDEOCALL_REQUEST".equals(str3));
                        i5 = i5;
                    } else {
                        VoIPGroupNotification.hide(a.b, i5, i21);
                    }
                    countDownLatch.countDown();
                    ConnectionsManager.onInternalPushReceived(i5);
                    ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
            case -1702432235:
                break;
            case -920689527:
                if (str3.equals("DC_UPDATE")) {
                    int i23 = jSONObject2.getInt("dc");
                    String[] split3 = jSONObject2.getString("addr").split(":");
                    if (split3.length != 2) {
                        countDownLatch.countDown();
                        break;
                    } else {
                        ConnectionsManager.getInstance(i2).applyDatacenterAddress(i23, split3[0], Integer.parseInt(split3[1]));
                        ConnectionsManager.getInstance(i2).resumeNetworkMaybe();
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
                StringBuilder sb3 = new StringBuilder();
                str8 = str6;
                sb3.append("recived push notification {");
                sb3.append(str3);
                sb3.append("} chatId ");
                sb3.append(j7);
                sb3.append(" custom topicId ");
                sb3.append(i5);
                fc4.b(sb3.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                    break;
                }
                if (j5 == j2) {
                    j5 = lo7.o0;
                    break;
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
            case -763636569:
                if (str3.equals("OAUTH_REQUEST")) {
                    if (jSONObject.has("loc_args")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("loc_args");
                        int length3 = jSONArray3.length();
                        String[] strArr4 = new String[length3];
                        for (int i24 = 0; i24 < length3; i24++) {
                            strArr4[i24] = jSONArray3.getString(i24);
                        }
                        if (length3 >= 2) {
                            String optString = jSONObject2.optString("url");
                            if (!TextUtils.isEmpty(optString)) {
                                String Z = jb6.Z(2131753087, strArr4[0], strArr4[1]);
                                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                                tL_message2.id = 2147483637;
                                tL_message2.random_id = 9223372036854775797L;
                                tL_message2.message = Z;
                                tL_message2.date = (int) (j / 1000);
                                tL_message2.dialog_id = 489001L;
                                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                tL_message2.peer_id = tL_peerUser4;
                                tL_peerUser4.user_id = 489001L;
                                tL_message2.flags |= 256;
                                tL_message2.from_id = tL_peerUser4;
                                tL_message2.silent = jSONObject2.has("silent") && jSONObject2.getInt("silent") != 0;
                                k47 k47Var2 = new k47(i2, tL_message2, Z, optString, null, true, false, false, false);
                                k47Var2.O = true;
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(k47Var2);
                                fc4.b("PushListenerController push OAUTH notification to NotificationsController of " + tL_message2.dialog_id);
                                lo7.n(i2).K(arrayList5, true, true, countDownLatch);
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
                StringBuilder sb32 = new StringBuilder();
                str8 = str6;
                sb32.append("recived push notification {");
                sb32.append(str3);
                sb32.append("} chatId ");
                sb32.append(j7);
                sb32.append(" custom topicId ");
                sb32.append(i5);
                fc4.b(sb32.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j5 == j2) {
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
            case 633004703:
                if (str3.equals("MESSAGE_ANNOUNCEMENT")) {
                    TL_update.TL_updateServiceNotification tL_updateServiceNotification = new TL_update.TL_updateServiceNotification();
                    tL_updateServiceNotification.popup = false;
                    tL_updateServiceNotification.flags = 2;
                    tL_updateServiceNotification.inbox_date = (int) (j / 1000);
                    tL_updateServiceNotification.message = jSONObject.getString("message");
                    tL_updateServiceNotification.type = "announcement";
                    tL_updateServiceNotification.media = new TLRPC.TL_messageMediaEmpty();
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateServiceNotification);
                    Utilities.d.c(new ge7(i2, (Object) tL_updates, (byte) 10));
                    ConnectionsManager.getInstance(i2).resumeNetworkMaybe();
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
                StringBuilder sb322 = new StringBuilder();
                str8 = str6;
                sb322.append("recived push notification {");
                sb322.append(str3);
                sb322.append("} chatId ");
                sb322.append(j7);
                sb322.append(" custom topicId ");
                sb322.append(i5);
                fc4.b(sb322.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j5 == j2) {
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
            case 657503015:
                if (str3.equals("MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("loc_args");
                    lo7.n(i2).a0(j, (!"MESSAGE_WALLET_TONCONNECT_REQUEST_DAPP".equals(str3) || optJSONArray == null) ? null : optJSONArray.optString(1, null));
                    ConnectionsManager.onInternalPushReceived(i2);
                    ConnectionsManager.getInstance(i2).resumeNetworkMaybe();
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
                StringBuilder sb3222 = new StringBuilder();
                str8 = str6;
                sb3222.append("recived push notification {");
                sb3222.append(str3);
                sb3222.append("} chatId ");
                sb3222.append(j7);
                sb3222.append(" custom topicId ");
                sb3222.append(i5);
                fc4.b(sb3222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j5 == j2) {
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
            case 1365673842:
                if (str3.equals("GEO_LIVE_PENDING")) {
                    Utilities.d.c(new fx0(i2, (byte) 10));
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
                StringBuilder sb32222 = new StringBuilder();
                str8 = str6;
                sb32222.append("recived push notification {");
                sb32222.append(str3);
                sb32222.append("} chatId ");
                sb32222.append(j7);
                sb32222.append(" custom topicId ");
                sb32222.append(i5);
                fc4.b(sb32222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j5 == j2) {
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
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
                StringBuilder sb322222 = new StringBuilder();
                str8 = str6;
                sb322222.append("recived push notification {");
                sb322222.append(str3);
                sb322222.append("} chatId ");
                sb322222.append(j7);
                sb322222.append(" custom topicId ");
                sb322222.append(i5);
                fc4.b(sb322222.toString());
                if (jSONObject3.has("encryption_id")) {
                }
                if (jSONObject3.has("schedule")) {
                }
                if (j5 == j2) {
                }
                j8 = j5;
                if (j8 != j2) {
                }
                i5 = i4;
                countDownLatch.countDown();
                ConnectionsManager.onInternalPushReceived(i5);
                ConnectionsManager.getInstance(i5).resumeNetworkMaybe();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processRemoteMessage$7(String str, String str2, long j) {
        if (e21.a) {
            fc4.b(str + " PRE INIT APP");
        }
        a.v();
        if (e21.a) {
            fc4.b(str + " POST INIT APP");
        }
        Utilities.d.c(new zw8(str, str2, j, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$0(int i, int i2, String str) {
        oc7.r1(i).e4(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendRegistrationToServer$1(String str, int i) {
        boolean z;
        ConnectionsManager.setRegId(str, i, gda.g);
        if (str != null) {
            if (gda.h == 0 || gda.i == 0 || (gda.j && TextUtils.equals(gda.f, str))) {
                z = false;
            } else {
                gda.j = false;
                z = true;
            }
            gda.f = str;
            gda.e = i;
            for (int i2 = 0; i2 < 4; i2++) {
                z8c h = z8c.h(i2);
                h.d = false;
                h.u(false);
                if (h.e() != 0) {
                    if (z) {
                        String str2 = i == 2 ? "fcm" : "hcm";
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = gda.h;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = gda.i;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = gda.i - gda.h;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        gda.j = true;
                        gda.x();
                        ConnectionsManager.getInstance(i2).sendRequest(tL_help_saveAppLog, null);
                        z = false;
                    }
                    gm.c3(new cu(i2, i, (Object) str, (byte) 13));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o()) {
                ConnectionsManager.onInternalPushReceived(i);
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i, String str, long j) {
        String str2 = i == 2 ? "FCM" : "HCM";
        if (e21.a) {
            fc4.b(str2.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gm.c3(new zw8(str2, str, j, (byte) 1));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z = e21.a;
        StringBuilder p = wi8.p("finished ", str2, " service, time = ");
        p.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        fc4.b(p.toString());
    }

    public static void sendRegistrationToServer(int i, String str) {
        Utilities.d.c(new rr7(str, i));
    }
}
