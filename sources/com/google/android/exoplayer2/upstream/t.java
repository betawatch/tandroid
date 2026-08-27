package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public t(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, v5.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.c = pVar;
        this.d = cVarArr;
        this.a = z10;
        this.b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x09f4  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0cda  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0d09  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0d2a  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0d49  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0d50  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0d8f  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0d9d  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x0dab  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0dc7  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0dea  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0df8  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0dff  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0e22  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0e45  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0e53  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0e5a  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0e76  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0e7d  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0eae  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0eb5  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0ebc  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0ed8  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x0ee6  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0eed  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0efb  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0f02  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x0f17  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x0f2c  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0f33  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0f3a  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0f48  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0f4f  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0f56  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x0f5d  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0f64  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0f79  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0f87  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0f8e  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0faa  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0fb8  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0fdb  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x1005  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x100c  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x1013  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x101a  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x1021  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x1028  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x103d  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x1044  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x104b  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x1052  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x1059  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x1060  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1067  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:850:0x1083  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x108a  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x1091  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x1098  */
    /* JADX WARN: Removed duplicated region for block: B:854:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x10a6  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x10ad  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x10bb  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x10c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x10c9  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x10d0  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x10d7  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x10de  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x10ec  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x10f3  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x10fa  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1101  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x1108  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x110f  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:873:0x1124  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x1132  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x1139  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:878:0x1147  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x1155  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x115c  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x116f  */
    /* JADX WARN: Removed duplicated region for block: B:885:0x1175  */
    /* JADX WARN: Removed duplicated region for block: B:886:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x1187  */
    /* JADX WARN: Removed duplicated region for block: B:889:0x118d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x1193  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x1199  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x119f  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x11a5  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x11b1  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x11b7  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Context context) {
        String c10;
        int[] iArr;
        TelephonyManager telephonyManager;
        this.c = context == null ? null : context.getApplicationContext();
        int i10 = d5.g0.a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                c10 = h7.d0.c(networkCountryIso);
                p8.l0 l0Var = u.n;
                c10.getClass();
                switch (c10) {
                    case "AD":
                    case "CW":
                        iArr = new int[]{2, 2, 0, 0, 2, 2};
                        break;
                    case "AE":
                        iArr = new int[]{1, 4, 3, 4, 4, 2};
                        break;
                    case "AF":
                    case "PG":
                        iArr = new int[]{4, 3, 3, 3, 2, 2};
                        break;
                    case "AG":
                        iArr = new int[]{2, 4, 3, 4, 2, 2};
                        break;
                    case "AI":
                    case "BB":
                    case "BM":
                    case "BQ":
                    case "DM":
                    case "FO":
                        iArr = new int[]{0, 2, 0, 0, 2, 2};
                        break;
                    case "AL":
                        iArr = new int[]{1, 1, 1, 3, 2, 2};
                        break;
                    case "AM":
                        iArr = new int[]{2, 3, 2, 3, 2, 2};
                        break;
                    case "AO":
                        iArr = new int[]{4, 4, 4, 3, 2, 2};
                        break;
                    case "AQ":
                    case "ER":
                    case "SH":
                        iArr = new int[]{4, 2, 2, 2, 2, 2};
                        break;
                    case "AS":
                        iArr = new int[]{2, 2, 3, 3, 2, 2};
                        break;
                    case "AT":
                        iArr = new int[]{1, 2, 1, 4, 1, 4};
                        break;
                    case "AU":
                        iArr = new int[]{0, 2, 1, 1, 3, 0};
                        break;
                    case "AW":
                    case "GU":
                        iArr = new int[]{1, 2, 4, 4, 2, 2};
                        break;
                    case "AX":
                    case "CX":
                    case "LI":
                    case "MP":
                    case "MS":
                    case "PM":
                    case "SM":
                    case "VA":
                        iArr = new int[]{0, 2, 2, 2, 2, 2};
                        break;
                    case "AZ":
                    case "BF":
                    case "DZ":
                        iArr = new int[]{3, 3, 4, 4, 2, 2};
                        break;
                    case "BA":
                    case "IE":
                        iArr = new int[]{1, 1, 1, 1, 2, 2};
                        break;
                    case "BD":
                    case "KZ":
                        iArr = new int[]{2, 1, 2, 2, 2, 2};
                        break;
                    case "BE":
                        iArr = new int[]{0, 1, 4, 4, 3, 2};
                        break;
                    case "BG":
                    case "ES":
                    case "GR":
                    case "SI":
                        iArr = new int[]{0, 0, 0, 0, 1, 2};
                        break;
                    case "BH":
                        iArr = new int[]{1, 3, 1, 4, 4, 2};
                        break;
                    case "BI":
                    case "HT":
                    case "MG":
                    case "NE":
                    case "TD":
                    case "VE":
                    case "YE":
                        iArr = new int[]{4, 4, 4, 4, 2, 2};
                        break;
                    case "BJ":
                        iArr = new int[]{4, 4, 2, 3, 2, 2};
                        break;
                    case "BL":
                    case "MF":
                    case "PY":
                        iArr = new int[]{1, 2, 2, 2, 2, 2};
                        break;
                    case "BN":
                        iArr = new int[]{3, 2, 0, 1, 2, 2};
                        break;
                    case "BO":
                        iArr = new int[]{1, 2, 3, 2, 2, 2};
                        break;
                    case "BR":
                        iArr = new int[]{1, 1, 2, 1, 1, 0};
                        break;
                    case "BS":
                    case "LB":
                        iArr = new int[]{3, 2, 1, 2, 2, 2};
                        break;
                    case "BT":
                    case "MZ":
                    case "WS":
                        iArr = new int[]{3, 1, 2, 1, 2, 2};
                        break;
                    case "BW":
                        iArr = new int[]{3, 2, 1, 0, 2, 2};
                        break;
                    case "BY":
                        iArr = new int[]{1, 1, 2, 3, 2, 2};
                        break;
                    case "BZ":
                    case "CK":
                        iArr = new int[]{2, 2, 2, 1, 2, 2};
                        break;
                    case "CA":
                        iArr = new int[]{0, 2, 3, 3, 3, 3};
                        break;
                    case "CD":
                    case "KM":
                        iArr = new int[]{4, 3, 3, 2, 2, 2};
                        break;
                    case "CF":
                    case "SB":
                        iArr = new int[]{4, 2, 4, 2, 2, 2};
                        break;
                    case "CG":
                    case "GH":
                        iArr = new int[]{3, 3, 3, 3, 2, 2};
                        break;
                    case "CH":
                        iArr = new int[]{0, 0, 0, 0, 0, 3};
                        break;
                    case "CI":
                    case "EG":
                        iArr = new int[]{3, 4, 3, 3, 2, 2};
                        break;
                    case "CL":
                        iArr = new int[]{1, 1, 2, 1, 3, 2};
                        break;
                    case "CM":
                        iArr = new int[]{4, 3, 3, 4, 2, 2};
                        break;
                    case "CN":
                        iArr = new int[]{2, 0, 4, 3, 3, 1};
                        break;
                    case "CO":
                        iArr = new int[]{2, 3, 4, 2, 2, 2};
                        break;
                    case "CR":
                        iArr = new int[]{2, 4, 4, 4, 2, 2};
                        break;
                    case "CU":
                    case "KI":
                        iArr = new int[]{4, 2, 4, 3, 2, 2};
                        break;
                    case "CV":
                        iArr = new int[]{2, 3, 0, 1, 2, 2};
                        break;
                    case "CY":
                    case "HR":
                    case "LV":
                        iArr = new int[]{1, 0, 0, 0, 0, 2};
                        break;
                    case "CZ":
                        iArr = new int[]{0, 0, 2, 0, 1, 2};
                        break;
                    case "DE":
                        iArr = new int[]{0, 1, 3, 2, 2, 2};
                        break;
                    case "DJ":
                    case "SY":
                    case "TJ":
                        iArr = new int[]{4, 3, 4, 4, 2, 2};
                        break;
                    case "DK":
                    case "EE":
                    case "HU":
                    case "LT":
                    case "MT":
                        iArr = new int[]{0, 0, 0, 0, 0, 2};
                        break;
                    case "DO":
                        iArr = new int[]{3, 4, 4, 4, 4, 2};
                        break;
                    case "EC":
                        iArr = new int[]{1, 3, 2, 1, 2, 2};
                        break;
                    case "ET":
                    case "SN":
                        iArr = new int[]{4, 4, 3, 2, 2, 2};
                        break;
                    case "FI":
                        iArr = new int[]{0, 0, 0, 2, 0, 2};
                        break;
                    case "FJ":
                        iArr = new int[]{3, 1, 2, 3, 2, 2};
                        break;
                    case "FM":
                        iArr = new int[]{4, 2, 3, 0, 2, 2};
                        break;
                    case "FR":
                        iArr = new int[]{1, 1, 2, 1, 1, 2};
                        break;
                    case "GA":
                    case "TG":
                        iArr = new int[]{3, 4, 1, 0, 2, 2};
                        break;
                    case "GB":
                        iArr = new int[]{0, 1, 1, 2, 1, 2};
                        break;
                    case "GD":
                    case "KN":
                    case "KY":
                    case "LC":
                    case "SX":
                    case "VC":
                        iArr = new int[]{1, 2, 0, 0, 2, 2};
                        break;
                    case "GE":
                        iArr = new int[]{1, 0, 0, 2, 2, 2};
                        break;
                    case "GF":
                    case "PK":
                    case "SL":
                        iArr = new int[]{3, 2, 3, 3, 2, 2};
                        break;
                    case "GG":
                        iArr = new int[]{0, 2, 1, 0, 2, 2};
                        break;
                    case "GI":
                    case "JE":
                        iArr = new int[]{1, 2, 0, 1, 2, 2};
                        break;
                    case "GL":
                    case "TK":
                        iArr = new int[]{2, 2, 2, 4, 2, 2};
                        break;
                    case "GM":
                        iArr = new int[]{4, 3, 2, 4, 2, 2};
                        break;
                    case "GN":
                        iArr = new int[]{4, 4, 4, 2, 2, 2};
                        break;
                    case "GP":
                        iArr = new int[]{3, 1, 1, 3, 2, 2};
                        break;
                    case "GQ":
                        iArr = new int[]{4, 4, 3, 3, 2, 2};
                        break;
                    case "GT":
                        iArr = new int[]{2, 2, 2, 1, 1, 2};
                        break;
                    case "GW":
                        iArr = new int[]{4, 4, 2, 2, 2, 2};
                        break;
                    case "GY":
                        iArr = new int[]{3, 0, 1, 1, 2, 2};
                        break;
                    case "HK":
                        iArr = new int[]{0, 1, 1, 3, 2, 0};
                        break;
                    case "HN":
                        iArr = new int[]{3, 3, 2, 2, 2, 2};
                        break;
                    case "ID":
                        iArr = new int[]{3, 1, 1, 2, 3, 2};
                        break;
                    case "IL":
                        iArr = new int[]{1, 2, 2, 3, 4, 2};
                        break;
                    case "IM":
                        iArr = new int[]{0, 2, 0, 1, 2, 2};
                        break;
                    case "IN":
                        iArr = new int[]{1, 1, 2, 1, 2, 1};
                        break;
                    case "IO":
                    case "TV":
                    case "WF":
                        iArr = new int[]{4, 2, 2, 4, 2, 2};
                        break;
                    case "IQ":
                    case "SJ":
                        iArr = new int[]{3, 2, 2, 2, 2, 2};
                        break;
                    case "IR":
                        iArr = new int[]{4, 2, 3, 3, 4, 2};
                        break;
                    case "IS":
                        iArr = new int[]{0, 0, 1, 0, 0, 2};
                        break;
                    case "IT":
                        iArr = new int[]{0, 0, 1, 1, 1, 2};
                        break;
                    case "JM":
                        iArr = new int[]{2, 4, 2, 1, 2, 2};
                        break;
                    case "JO":
                        iArr = new int[]{2, 0, 1, 1, 2, 2};
                        break;
                    case "JP":
                        iArr = new int[]{0, 3, 3, 3, 4, 4};
                        break;
                    case "KE":
                        iArr = new int[]{3, 2, 2, 1, 2, 2};
                        break;
                    case "KG":
                    case "MQ":
                        iArr = new int[]{2, 1, 1, 2, 2, 2};
                        break;
                    case "KH":
                        iArr = new int[]{1, 0, 4, 2, 2, 2};
                        break;
                    case "KR":
                        iArr = new int[]{0, 2, 2, 4, 4, 4};
                        break;
                    case "KW":
                        iArr = new int[]{1, 0, 1, 0, 0, 2};
                        break;
                    case "LA":
                        iArr = new int[]{1, 2, 1, 3, 2, 2};
                        break;
                    case "LK":
                        iArr = new int[]{3, 2, 3, 4, 4, 2};
                        break;
                    case "LR":
                        iArr = new int[]{3, 4, 3, 4, 2, 2};
                        break;
                    case "LS":
                    case "UG":
                        iArr = new int[]{3, 3, 3, 2, 2, 2};
                        break;
                    case "LU":
                        iArr = new int[]{1, 1, 4, 2, 0, 2};
                        break;
                    case "LY":
                    case "TO":
                    case "ZW":
                        iArr = new int[]{3, 2, 4, 3, 2, 2};
                        break;
                    case "MA":
                        iArr = new int[]{3, 3, 2, 1, 2, 2};
                        break;
                    case "MC":
                        iArr = new int[]{0, 2, 2, 0, 2, 2};
                        break;
                    case "MD":
                        iArr = new int[]{1, 0, 0, 0, 2, 2};
                        break;
                    case "ME":
                        iArr = new int[]{2, 0, 0, 1, 1, 2};
                        break;
                    case "MH":
                        iArr = new int[]{4, 2, 1, 3, 2, 2};
                        break;
                    case "MK":
                        iArr = new int[]{2, 0, 0, 1, 3, 2};
                        break;
                    case "ML":
                    case "TZ":
                        iArr = new int[]{3, 4, 2, 2, 2, 2};
                        break;
                    case "MM":
                        iArr = new int[]{2, 2, 2, 3, 4, 2};
                        break;
                    case "MN":
                        iArr = new int[]{2, 0, 1, 2, 2, 2};
                        break;
                    case "MO":
                        iArr = new int[]{0, 2, 4, 4, 4, 2};
                        break;
                    case "MR":
                        iArr = new int[]{4, 2, 3, 4, 2, 2};
                        break;
                    case "MU":
                    case "SA":
                        iArr = new int[]{3, 1, 1, 2, 2, 2};
                        break;
                    case "MV":
                        iArr = new int[]{3, 4, 1, 3, 3, 2};
                        break;
                    case "MW":
                        iArr = new int[]{4, 2, 3, 3, 2, 2};
                        break;
                    case "MX":
                        iArr = new int[]{3, 4, 4, 4, 2, 2};
                        break;
                    case "MY":
                        iArr = new int[]{1, 0, 4, 1, 2, 2};
                        break;
                    case "NA":
                        iArr = new int[]{3, 4, 3, 2, 2, 2};
                        break;
                    case "NC":
                        iArr = new int[]{3, 2, 3, 4, 2, 2};
                        break;
                    case "NG":
                        iArr = new int[]{3, 4, 2, 1, 2, 2};
                        break;
                    case "NI":
                        iArr = new int[]{2, 3, 4, 3, 2, 2};
                        break;
                    case "NL":
                        iArr = new int[]{0, 2, 3, 3, 0, 4};
                        break;
                    case "NO":
                        iArr = new int[]{0, 1, 2, 1, 1, 2};
                        break;
                    case "NP":
                        iArr = new int[]{2, 1, 4, 3, 2, 2};
                        break;
                    case "NR":
                        iArr = new int[]{4, 0, 3, 2, 2, 2};
                        break;
                    case "NU":
                        iArr = new int[]{4, 2, 2, 1, 2, 2};
                        break;
                    case "NZ":
                        iArr = new int[]{1, 0, 2, 2, 4, 2};
                        break;
                    case "OM":
                        iArr = new int[]{2, 3, 1, 3, 4, 2};
                        break;
                    case "PA":
                        iArr = new int[]{2, 3, 3, 3, 2, 2};
                        break;
                    case "PE":
                        iArr = new int[]{1, 2, 4, 4, 3, 2};
                        break;
                    case "PF":
                    case "SV":
                        iArr = new int[]{2, 3, 3, 1, 2, 2};
                        break;
                    case "PH":
                        iArr = new int[]{2, 1, 3, 2, 2, 0};
                        break;
                    case "PL":
                        iArr = new int[]{2, 1, 2, 2, 4, 2};
                        break;
                    case "PR":
                        iArr = new int[]{2, 0, 2, 0, 2, 1};
                        break;
                    case "PS":
                        iArr = new int[]{3, 4, 1, 4, 2, 2};
                        break;
                    case "PT":
                        iArr = new int[]{1, 0, 0, 0, 1, 2};
                        break;
                    case "PW":
                        iArr = new int[]{2, 2, 4, 2, 2, 2};
                        break;
                    case "QA":
                        iArr = new int[]{1, 4, 4, 4, 4, 2};
                        break;
                    case "RE":
                        iArr = new int[]{1, 2, 2, 3, 1, 2};
                        break;
                    case "RO":
                        iArr = new int[]{0, 0, 1, 2, 1, 2};
                        break;
                    case "RS":
                        iArr = new int[]{2, 0, 0, 0, 2, 2};
                        break;
                    case "RU":
                        iArr = new int[]{1, 0, 0, 0, 3, 3};
                        break;
                    case "RW":
                        iArr = new int[]{3, 3, 1, 0, 2, 2};
                        break;
                    case "SC":
                        iArr = new int[]{4, 3, 1, 1, 2, 2};
                        break;
                    case "SD":
                        iArr = new int[]{4, 3, 4, 2, 2, 2};
                        break;
                    case "SE":
                        iArr = new int[]{0, 1, 1, 1, 0, 2};
                        break;
                    case "SG":
                        iArr = new int[]{2, 3, 3, 3, 3, 3};
                        break;
                    case "SK":
                        iArr = new int[]{1, 1, 1, 1, 3, 2};
                        break;
                    case "SO":
                        iArr = new int[]{3, 2, 2, 4, 4, 2};
                        break;
                    case "SR":
                        iArr = new int[]{2, 4, 3, 0, 2, 2};
                        break;
                    case "SS":
                    case "TM":
                        iArr = new int[]{4, 2, 2, 3, 2, 2};
                        break;
                    case "ST":
                        iArr = new int[]{2, 2, 1, 2, 2, 2};
                        break;
                    case "SZ":
                        iArr = new int[]{4, 4, 3, 4, 2, 2};
                        break;
                    case "TC":
                        iArr = new int[]{2, 2, 1, 3, 2, 2};
                        break;
                    case "TH":
                        iArr = new int[]{0, 1, 2, 1, 2, 2};
                        break;
                    case "TL":
                        iArr = new int[]{4, 2, 4, 4, 2, 2};
                        break;
                    case "TN":
                    case "UY":
                        iArr = new int[]{2, 1, 1, 1, 2, 2};
                        break;
                    case "TR":
                        iArr = new int[]{1, 0, 0, 1, 3, 2};
                        break;
                    case "TT":
                        iArr = new int[]{1, 4, 0, 0, 2, 2};
                        break;
                    case "TW":
                        iArr = new int[]{0, 2, 0, 0, 0, 0};
                        break;
                    case "UA":
                        iArr = new int[]{0, 1, 1, 2, 4, 2};
                        break;
                    case "US":
                        iArr = new int[]{1, 1, 4, 1, 3, 1};
                        break;
                    case "UZ":
                        iArr = new int[]{2, 2, 3, 4, 3, 2};
                        break;
                    case "VG":
                        iArr = new int[]{2, 2, 0, 1, 2, 2};
                        break;
                    case "VI":
                        iArr = new int[]{0, 2, 1, 2, 2, 2};
                        break;
                    case "VN":
                        iArr = new int[]{0, 0, 1, 2, 2, 1};
                        break;
                    case "VU":
                        iArr = new int[]{4, 3, 3, 1, 2, 2};
                        break;
                    case "XK":
                        iArr = new int[]{1, 2, 1, 1, 2, 2};
                        break;
                    case "YT":
                        iArr = new int[]{2, 3, 3, 4, 2, 2};
                        break;
                    case "ZA":
                        iArr = new int[]{2, 3, 2, 1, 2, 2};
                        break;
                    case "ZM":
                        iArr = new int[]{4, 4, 4, 3, 3, 2};
                        break;
                    default:
                        iArr = new int[]{2, 2, 2, 2, 2, 2};
                        break;
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                p8.l0 l0Var2 = u.n;
                hashMap.put(2, (Long) l0Var2.get(iArr[0]));
                hashMap.put(3, (Long) u.o.get(iArr[1]));
                hashMap.put(4, (Long) u.p.get(iArr[2]));
                hashMap.put(5, (Long) u.q.get(iArr[3]));
                hashMap.put(10, (Long) u.r.get(iArr[4]));
                hashMap.put(9, (Long) u.s.get(iArr[5]));
                hashMap.put(7, (Long) l0Var2.get(iArr[0]));
                this.d = hashMap;
                this.b = 2000;
                this.e = d5.b0.a;
                this.a = true;
            }
        }
        c10 = h7.d0.c(Locale.getDefault().getCountry());
        p8.l0 l0Var3 = u.n;
        c10.getClass();
        switch (c10) {
            case 2083:
                break;
            case 2084:
                break;
            case 2085:
                break;
            case 2086:
                break;
            case 2088:
                break;
            case 2091:
                break;
            case 2092:
                break;
            case 2094:
                break;
            case 2096:
                break;
            case 2098:
                break;
            case 2099:
                break;
            case 2100:
                break;
            case 2102:
                break;
            case 2103:
                break;
            case 2105:
                break;
            case 2111:
                break;
            case 2112:
                break;
            case 2114:
                break;
            case 2115:
                break;
            case 2116:
                break;
            case 2117:
                break;
            case 2118:
                break;
            case 2119:
                break;
            case 2120:
                break;
            case 2122:
                break;
            case 2123:
                break;
            case 2124:
                break;
            case 2125:
                break;
            case 2127:
                break;
            case 2128:
                break;
            case 2129:
                break;
            case 2130:
                break;
            case 2133:
                break;
            case 2135:
                break;
            case 2136:
                break;
            case 2142:
                break;
            case 2145:
                break;
            case 2147:
                break;
            case 2148:
                break;
            case 2149:
                break;
            case 2150:
                break;
            case 2152:
                break;
            case 2153:
                break;
            case 2154:
                break;
            case 2155:
                break;
            case 2156:
                break;
            case 2159:
                break;
            case 2162:
                break;
            case 2163:
                break;
            case 2164:
                break;
            case 2165:
                break;
            case 2166:
                break;
            case 2167:
                break;
            case 2177:
                break;
            case 2182:
                break;
            case 2183:
                break;
            case 2185:
                break;
            case 2187:
                break;
            case 2198:
                break;
            case 2206:
                break;
            case 2208:
                break;
            case 2210:
                break;
            case 2221:
                break;
            case 2222:
                break;
            case 2223:
                break;
            case 2243:
                break;
            case 2244:
                break;
            case 2247:
                break;
            case 2249:
                break;
            case 2252:
                break;
            case 2266:
                break;
            case 2267:
                break;
            case 2269:
                break;
            case 2270:
                break;
            case 2271:
                break;
            case 2272:
                break;
            case 2273:
                break;
            case 2274:
                break;
            case 2277:
                break;
            case 2278:
                break;
            case 2279:
                break;
            case 2281:
                break;
            case 2282:
                break;
            case 2283:
                break;
            case 2285:
                break;
            case 2286:
                break;
            case 2288:
                break;
            case 2290:
                break;
            case 2307:
                break;
            case 2310:
                break;
            case 2314:
                break;
            case 2316:
                break;
            case 2317:
                break;
            case 2331:
                break;
            case 2332:
                break;
            case 2339:
                break;
            case 2340:
                break;
            case 2341:
                break;
            case 2342:
                break;
            case 2344:
                break;
            case 2345:
                break;
            case 2346:
                break;
            case 2347:
                break;
            case 2363:
                break;
            case 2371:
                break;
            case 2373:
                break;
            case 2374:
                break;
            case 2394:
                break;
            case 2396:
                break;
            case 2397:
                break;
            case 2398:
                break;
            case 2402:
                break;
            case 2403:
                break;
            case 2407:
                break;
            case 2412:
                break;
            case 2414:
                break;
            case 2415:
                break;
            case 2421:
                break;
            case 2422:
                break;
            case 2423:
                break;
            case 2429:
                break;
            case 2431:
                break;
            case 2438:
                break;
            case 2439:
                break;
            case 2440:
                break;
            case 2441:
                break;
            case 2442:
                break;
            case 2445:
                break;
            case 2452:
                break;
            case 2454:
                break;
            case 2455:
                break;
            case 2456:
                break;
            case 2457:
                break;
            case 2458:
                break;
            case 2459:
                break;
            case 2462:
                break;
            case 2463:
                break;
            case 2464:
                break;
            case 2465:
                break;
            case 2466:
                break;
            case 2467:
                break;
            case 2468:
                break;
            case 2469:
                break;
            case 2470:
                break;
            case 2471:
                break;
            case 2472:
                break;
            case 2473:
                break;
            case 2474:
                break;
            case 2475:
                break;
            case 2476:
                break;
            case 2477:
                break;
            case 2483:
                break;
            case 2485:
                break;
            case 2487:
                break;
            case 2489:
                break;
            case 2491:
                break;
            case 2494:
                break;
            case 2497:
                break;
            case 2498:
                break;
            case 2500:
                break;
            case 2503:
                break;
            case 2508:
                break;
            case 2526:
                break;
            case 2545:
                break;
            case 2549:
                break;
            case 2550:
                break;
            case 2551:
                break;
            case 2552:
                break;
            case 2555:
                break;
            case 2556:
                break;
            case 2557:
                break;
            case 2562:
                break;
            case 2563:
                break;
            case 2564:
                break;
            case 2567:
                break;
            case 2569:
                break;
            case 2576:
                break;
            case 2611:
                break;
            case 2621:
                break;
            case 2625:
                break;
            case 2627:
                break;
            case 2629:
                break;
            case 2638:
                break;
            case 2639:
                break;
            case 2640:
                break;
            case 2641:
                break;
            case 2642:
                break;
            case 2644:
                break;
            case 2645:
                break;
            case 2646:
                break;
            case 2647:
                break;
            case 2648:
                break;
            case 2649:
                break;
            case 2650:
                break;
            case 2651:
                break;
            case 2652:
                break;
            case 2655:
                break;
            case 2656:
                break;
            case 2657:
                break;
            case 2659:
                break;
            case 2661:
                break;
            case 2662:
                break;
            case 2663:
                break;
            case 2671:
                break;
            case 2672:
                break;
            case 2675:
                break;
            case 2676:
                break;
            case 2678:
                break;
            case 2679:
                break;
            case 2680:
                break;
            case 2681:
                break;
            case 2682:
                break;
            case 2683:
                break;
            case 2686:
                break;
            case 2688:
                break;
            case 2690:
                break;
            case 2691:
                break;
            case 2694:
                break;
            case 2700:
                break;
            case 2706:
                break;
            case 2718:
                break;
            case 2724:
                break;
            case 2725:
                break;
            case 2731:
                break;
            case 2733:
                break;
            case 2735:
                break;
            case 2737:
                break;
            case 2739:
                break;
            case 2744:
                break;
            case 2751:
                break;
            case 2767:
                break;
            case 2780:
                break;
            case 2803:
                break;
            case 2828:
                break;
            case 2843:
                break;
            case 2855:
                break;
            case 2867:
                break;
            case 2877:
                break;
        }
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        p8.l0 l0Var22 = u.n;
        hashMap2.put(2, (Long) l0Var22.get(iArr[0]));
        hashMap2.put(3, (Long) u.o.get(iArr[1]));
        hashMap2.put(4, (Long) u.p.get(iArr[2]));
        hashMap2.put(5, (Long) u.q.get(iArr[3]));
        hashMap2.put(10, (Long) u.r.get(iArr[4]));
        hashMap2.put(9, (Long) u.s.get(iArr[5]));
        hashMap2.put(7, (Long) l0Var22.get(iArr[0]));
        this.d = hashMap2;
        this.b = 2000;
        this.e = d5.b0.a;
        this.a = true;
    }
}
