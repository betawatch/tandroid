package gi;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.v60;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ((ArrayList) obj).add(r31.j(0, ((li.b) this.b).Q1));
    }

    private final void c(Object obj, Object obj2) {
        Utilities.i.c(new m2.s(3, (String[]) this.b, (n10) obj2));
    }

    private final void d(Object obj, Object obj2) {
        mi.v vVar = (mi.v) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(r31.j(1, vVar.T1));
        arrayList.add(r31.j(3, vVar.W1));
        if (vVar.b2 != null) {
            arrayList.add(r31.j(2, vVar.U1));
        }
    }

    private final void e(Object obj, Object obj2) {
        mi.t3.L1((mi.t3[]) this.b, (ArrayList) obj, (f41) obj2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        String str;
        int i3;
        String upperCase;
        String str2;
        boolean z10;
        f41 f41Var;
        String str3;
        int i10;
        boolean z11;
        boolean z12;
        String str4;
        String str5;
        String str6;
        String str7;
        Object[] objArr;
        int i11;
        mi.g2 g2Var;
        int i12 = this.a;
        int i13 = 9;
        int i14 = -1;
        boolean z13 = false;
        int i15 = 0;
        z13 = false;
        boolean z14 = true;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((ua) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 1:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (m7Var.a2 || m7Var.Z1 != null) {
                    TLRPC.WebPage webPage = m7Var.Z1;
                    g7 g7Var = new g7(m7Var, 0);
                    int i16 = k7.b;
                    r31 K = r31.K(k7.class);
                    K.G = webPage;
                    K.D = g7Var;
                    arrayList.add(K);
                }
                arrayList.add(r31.k(m7Var.R1));
                arrayList.add(r31.B(1, null));
                r31 i17 = r31.i(2, bd.M0(2131744647, null));
                i17.L(m7Var.f2);
                arrayList.add(i17);
                if (m7Var.f2) {
                    arrayList.add(r31.k(m7Var.S1));
                }
                arrayList.add(r31.B(3, null));
                arrayList.add(r31.k(m7Var.T1));
                break;
            case 2:
                va vaVar = (va) obj3;
                Float f10 = (Float) obj2;
                long duration = vaVar.Y0.getDuration() < 100 ? vaVar.L1.h0 : vaVar.Y0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                f7 f7Var = vaVar.L1;
                float f11 = f7Var.a0;
                float f12 = f7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                ja jaVar = vaVar.Y0;
                long j11 = (long) ((f12 * f14) + j10);
                vaVar.N1 = j11;
                jaVar.m(j11);
                x9 x9Var = vaVar.w1;
                if (x9Var != null) {
                    x9Var.setCoverTime(vaVar.N1);
                }
                f7 f7Var2 = vaVar.L1;
                if (f7Var2 != null && f7Var2.g) {
                    f7Var2.j = true;
                    break;
                }
                break;
            case 3:
                ((ya) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 4:
                ((hi.g) obj3).E0((ArrayList) obj, (f41) obj2);
                break;
            case 5:
                hi.f fVar = (hi.f) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(r31.k(fVar.R1));
                arrayList2.add(r31.k(fVar.S1));
                break;
            case 6:
                ((ii.k) obj3).H0((ArrayList) obj, (f41) obj2);
                break;
            case 7:
                ii.s.Z((ii.s) obj3, (ArrayList) obj);
                break;
            case 8:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) obj3;
                String str8 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(org.telegram.messenger.g0.i0(l10.longValue(), false, false));
                }
                if (str8 == null) {
                    upperCase = null;
                } else {
                    if (!str8.isEmpty()) {
                        switch (str8.hashCode()) {
                            case -2008589971:
                                if (str8.equals("application/epub+zip")) {
                                    i14 = 0;
                                    break;
                                }
                                break;
                            case -1719571662:
                                if (str8.equals("application/vnd.oasis.opendocument.text")) {
                                    i14 = 1;
                                    break;
                                }
                                break;
                            case -1664118616:
                                if (str8.equals("video/3gpp")) {
                                    i14 = 2;
                                    break;
                                }
                                break;
                            case -1578389996:
                                if (str8.equals("application/vnd.ms-fontobject")) {
                                    i14 = 3;
                                    break;
                                }
                                break;
                            case -1348237359:
                                if (str8.equals("application/x-cdf")) {
                                    i14 = 4;
                                    break;
                                }
                                break;
                            case -1348236892:
                                if (str8.equals("application/x-csh")) {
                                    i3 = 5;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -1079884372:
                                if (str8.equals("video/x-msvideo")) {
                                    i14 = 6;
                                    break;
                                }
                                break;
                            case -1073633483:
                                if (str8.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    i3 = 7;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -1071817359:
                                if (str8.equals("application/vnd.ms-powerpoint")) {
                                    i14 = 8;
                                    break;
                                }
                                break;
                            case -1050893613:
                                if (str8.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    i14 = 9;
                                    break;
                                }
                                break;
                            case -1007601745:
                                if (str8.equals("audio/x-midi")) {
                                    i3 = 10;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -958424608:
                                if (str8.equals("text/calendar")) {
                                    i3 = 11;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -816908365:
                                if (str8.equals("application/x-httpd-php")) {
                                    i3 = 12;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -648684635:
                                if (str8.equals("audio/3gpp2")) {
                                    i14 = 13;
                                    break;
                                }
                                break;
                            case -433129473:
                                if (str8.equals("application/vnd.apple.installer+xml")) {
                                    i3 = 14;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -366307023:
                                if (str8.equals("application/vnd.ms-excel")) {
                                    i3 = 15;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -48069494:
                                if (str8.equals("video/3gpp2")) {
                                    i3 = 16;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -43923783:
                                if (str8.equals("application/gzip")) {
                                    i3 = 17;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case -43491031:
                                if (str8.equals("application/x-sh")) {
                                    i3 = 18;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 187091926:
                                if (str8.equals("audio/ogg")) {
                                    i3 = 19;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 817335912:
                                if (str8.equals("text/plain")) {
                                    i3 = 20;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 859118878:
                                if (str8.equals("application/x-abiword")) {
                                    i3 = 21;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 886992732:
                                if (str8.equals("application/ld+json")) {
                                    i14 = 22;
                                    break;
                                }
                                break;
                            case 904647503:
                                if (str8.equals("application/msword")) {
                                    i3 = 23;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1154306387:
                                if (str8.equals("application/x-bzip")) {
                                    i3 = 24;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1154455342:
                                if (str8.equals("application/x-gzip")) {
                                    i3 = 25;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1178484637:
                                if (str8.equals("application/octet-stream")) {
                                    i3 = 26;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1423759679:
                                if (str8.equals("application/x-bzip2")) {
                                    i3 = 27;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1436962847:
                                if (str8.equals("application/vnd.oasis.opendocument.presentation")) {
                                    i3 = 28;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1454024983:
                                if (str8.equals("application/x-7z-compressed")) {
                                    i3 = 29;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1455492626:
                                if (str8.equals("application/x-freearc")) {
                                    i3 = 30;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1503095341:
                                if (str8.equals("audio/3gpp")) {
                                    i3 = 31;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1504831518:
                                if (str8.equals("audio/mpeg")) {
                                    i3 = 32;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1509238306:
                                if (str8.equals("application/vnd.rar")) {
                                    i3 = 33;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1578362927:
                                if (str8.equals("image/vnd.microsoft.icon")) {
                                    i3 = 34;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1643664935:
                                if (str8.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    i3 = 35;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1672200517:
                                if (str8.equals("application/vnd.amazon.ebook")) {
                                    i3 = 36;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 1993842850:
                                if (str8.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    i3 = 37;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 2049276534:
                                if (str8.equals("application/java-archive")) {
                                    i3 = 38;
                                    i14 = i3;
                                    break;
                                }
                                break;
                            case 2132236175:
                                if (str8.equals("text/javascript")) {
                                    i3 = 39;
                                    i14 = i3;
                                    break;
                                }
                                break;
                        }
                        switch (i14) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case hs.U /* 31 */:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case 8:
                                str = "ppt";
                                break;
                            case 9:
                                str = "docx";
                                break;
                            case 10:
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case 12:
                                str = "php";
                                break;
                            case 13:
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case hs.T /* 30 */:
                                str = "arc";
                                break;
                            case 32:
                                str = "mp3";
                                break;
                            case 33:
                                str = "rar";
                                break;
                            case 34:
                                str = "ico";
                                break;
                            case 35:
                                str = "ods";
                                break;
                            case 36:
                                str = "azw";
                                break;
                            case 37:
                                str = "xlsx";
                                break;
                            case 38:
                                str = "jar";
                                break;
                            case 39:
                                str = "js";
                                break;
                            default:
                                if (str8.contains("/")) {
                                    str8 = str8.substring(str8.indexOf("/") + 1);
                                }
                                if (str8.contains("-")) {
                                    str8 = str8.substring(str8.indexOf("-") + 1);
                                }
                                if (str8.contains("+")) {
                                    str8 = str8.substring(0, str8.indexOf("+"));
                                }
                                str = str8.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(upperCase.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(bd.M0(2131753975, null));
                }
                h6Var.setText(sb2);
                break;
            case 9:
                ii.j1 j1Var = (ii.j1) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(r31.j(-1, j1Var.T1));
                arrayList3.add(r31.C(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752980, j1Var.R1))));
                break;
            case 10:
                ii.a3 a3Var = (ii.a3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    a3Var.getClass();
                    break;
                } else {
                    ii.q4 q4Var = a3Var.x0;
                    if (q4Var != null) {
                        q4Var.a(tL_webViewResultUrl);
                        a3Var.s();
                        break;
                    }
                }
                break;
            case 11:
                ((ii.q3) obj3).I0((ArrayList) obj, (f41) obj2);
                break;
            case 12:
                ((ii.p4) obj3).Z((ArrayList) obj, (f41) obj2);
                break;
            case 13:
                ((ji.q) obj3).w.c((ArrayList) obj);
                break;
            case 14:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                bm0 bm0Var = (bm0) ((kg.e0) obj3);
                uw uwVar = bm0Var.J0;
                org.telegram.messenger.g0.v1(uwVar.getParentActivity().getCurrentFocus());
                f60 I = f60.I(uwVar, (org.telegram.ui.Cells.f6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                    str2 = null;
                } else {
                    f60 J = I.J();
                    J.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new jb0(I, 22), false);
                    J.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J.k();
                        }
                        J.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    str2 = null;
                    z10 = false;
                    I.c(R.drawable.msg_channel, bd.M0(2131745258, null), new ai.y3(I, J, i13), false);
                }
                I.c(R.drawable.msg_info, bd.M0(2131754943, str2), new v60(bm0Var, uwVar, bm0Var.K0, I, 4), z10);
                I.c(R.drawable.msg_block2, bd.M0(2131746244, str2), new v60(bm0Var, uwVar, tL_sponsoredPeer, I, 5), z10);
                I.k();
                I.c(R.drawable.msg_cancel, bd.M0(2131746328, str2), new org.telegram.ui.Components.e7(bm0Var, uwVar, I, 22), z10);
                I.V(bd.a0 ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 15:
                lg.c.Z((lg.c) obj3, (ArrayList) obj, (f41) obj2);
                break;
            case 16:
                lg.m mVar = (lg.m) obj3;
                mVar.M.dismiss();
                mVar.E = (String) obj;
                mVar.F = (TLRPC.InputDocument) obj2;
                mVar.x = false;
                org.telegram.messenger.g0.r(mVar.e);
                mVar.n.setSticker(mVar.E);
                mVar.j0(true);
                ai.h4 h4Var = mVar.a;
                if (h4Var != null && (f41Var = h4Var.g3) != null) {
                    f41Var.O(true);
                    break;
                }
                break;
            case 17:
                lg.j0 j0Var = (lg.j0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                f41 f41Var2 = (f41) obj2;
                f41Var2.G = 1;
                arrayList4.add(r31.l(-5, j0Var.T1));
                TL_account.TL_connectedBot tL_connectedBot = j0Var.Q1;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        str3 = null;
                        arrayList4.add(r31.u(bd.M0(2131745569, null)));
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList4.add(r31.f(bd.M0(2131745566, null), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList4.add(r31.f(bd.M0(2131745565, null), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList4.add(r31.f(bd.M0(2131745567, null), bd.x(tL_connectedBot.date, false), 3));
                        }
                        arrayList4.add(r31.C(null));
                    } else {
                        str3 = null;
                    }
                    f41Var2.V();
                    arrayList4.add(r31.u(bd.M0(2131752819, str3)));
                    int i18 = lg.j0.d2;
                    r31 x10 = r31.x(-1, bd.M0(2131752781, str3));
                    x10.L(j0Var.Y1);
                    arrayList4.add(x10);
                    int i19 = lg.j0.e2;
                    r31 x11 = r31.x(-2, bd.M0(2131752776, str3));
                    x11.L(!j0Var.Y1);
                    arrayList4.add(x11);
                    f41Var2.U();
                    arrayList4.add(r31.C(str3));
                    lg.b0 b0Var = j0Var.S1;
                    if (b0Var != null) {
                        b0Var.a(arrayList4, f41Var2, true);
                    }
                    arrayList4.add(r31.C(bd.M0(2131752818, str3)));
                    break;
                }
                break;
            case 18:
                final lg.r0 r0Var = (lg.r0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                LongSparseArray longSparseArray = r0Var.O;
                String M0 = bd.M0(2131752783, null);
                String M02 = bd.M0(2131752782, null);
                r31 r31Var = new r31(2);
                r31Var.l = M0;
                r31Var.o = M02;
                r31Var.m = "tg_superplaceholders_android_2";
                r31Var.n = "🤖🏝️";
                r31Var.z = 120;
                arrayList5.add(r31Var);
                if (r0Var.N != null) {
                    f41Var3.V();
                    long j12 = r0Var.N.id;
                    r31 r31Var2 = new r31(13);
                    r31Var2.x = j12;
                    r31Var2.L(true);
                    final int i20 = z13 ? 1 : 0;
                    r31Var2.D = new View.OnClickListener() { // from class: lg.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    r0 r0Var2 = r0Var;
                                    r0Var2.N = null;
                                    r0Var2.c.g3.O(true);
                                    r0Var2.d0(true);
                                    break;
                                case 1:
                                    r0 r0Var3 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = r0Var3.K;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    r0Var3.c.g3.O(true);
                                    r0Var3.d0(true);
                                    break;
                                case 2:
                                    r0 r0Var4 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var4.K;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        r0Var4.c0(-14, true, new l0(r0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        r0Var4.c.g3.O(true);
                                        r0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r0 r0Var5 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var5.K;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        r0Var5.c0(-17, true, new l0(r0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        r0Var5.c.g3.O(true);
                                        r0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var6 = r0Var;
                                    r0Var6.K.manage_stories = !r0.manage_stories;
                                    r0Var6.c.g3.O(true);
                                    r0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(r31Var2);
                    f41Var3.U();
                    z11 = true;
                } else {
                    f41Var3.V();
                    arrayList5.add(r31.k(r0Var.e));
                    longSparseArray.clear();
                    int i21 = 0;
                    boolean z15 = false;
                    while (i21 < r0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) r0Var.d.d.get(i21);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                z12 = z14;
                                long j13 = user.id;
                                String str9 = r0Var.E;
                                r31 r31Var3 = new r31(13);
                                r31Var3.x = j13;
                                r31Var3.n = str9;
                                arrayList5.add(r31Var3);
                                longSparseArray.put(user.id, user);
                                z15 = z12;
                                i21++;
                                z14 = z12;
                            }
                        }
                        z12 = z14;
                        i21++;
                        z14 = z12;
                    }
                    z11 = z14;
                    for (int i22 = 0; i22 < r0Var.d.e.size(); i22++) {
                        TLObject tLObject2 = (TLObject) r0Var.d.e.get(i22);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str10 = r0Var.E;
                                r31 r31Var4 = new r31(13);
                                r31Var4.x = j14;
                                r31Var4.n = str10;
                                arrayList5.add(r31Var4);
                                longSparseArray.put(user2.id, user2);
                                z15 = z11;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(r0Var.f.getText().toString()) || r0Var.d.e() || r0Var.y)) {
                        arrayList5.add(r31.k(r0Var.n));
                        z15 = z11;
                    }
                    r0Var.h.setVisibility(z15 ? 0 : 8);
                    f41Var3.U();
                }
                arrayList5.add(r31.C(bd.M0(2131752815, null)));
                f41Var3.V();
                r31 u10 = r31.u(bd.M0(2131752819, null));
                u10.g = r0Var.N != null ? z11 : false;
                arrayList5.add(u10);
                r31 x12 = r31.x(-1, bd.M0(2131752781, null));
                x12.L(r0Var.J);
                x12.g = r0Var.N != null ? z11 : false;
                arrayList5.add(x12);
                r31 x13 = r31.x(-2, bd.M0(2131752776, null));
                x13.L(!r0Var.J);
                x13.g = r0Var.N != null ? z11 : false;
                arrayList5.add(x13);
                f41Var3.U();
                arrayList5.add(r31.C(null));
                r0Var.w.a(arrayList5, f41Var3, r0Var.N != null ? z11 : false);
                arrayList5.add(r31.C(bd.M0(2131752818, null)));
                if (r0Var.N != null) {
                    f41Var3.V();
                    arrayList5.add(r31.u(bd.M0(2131752808, null)));
                    String M03 = bd.M0(2131752795, null);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = r0Var.K;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    r31 o10 = r31.o(-4, M03, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var.K;
                    o10.L((tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) ? z11 : false);
                    o10.f = !r0Var.Q;
                    boolean z16 = z11;
                    final int i23 = z16 ? 1 : 0;
                    o10.D = new View.OnClickListener() { // from class: lg.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    r0 r0Var2 = r0Var;
                                    r0Var2.N = null;
                                    r0Var2.c.g3.O(true);
                                    r0Var2.d0(true);
                                    break;
                                case 1:
                                    r0 r0Var3 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var3.K;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    r0Var3.c.g3.O(true);
                                    r0Var3.d0(true);
                                    break;
                                case 2:
                                    r0 r0Var4 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = r0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        r0Var4.c0(-14, true, new l0(r0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        r0Var4.c.g3.O(true);
                                        r0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r0 r0Var5 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = r0Var5.K;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        r0Var5.c0(-17, true, new l0(r0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        r0Var5.c.g3.O(true);
                                        r0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var6 = r0Var;
                                    r0Var6.K.manage_stories = !r0.manage_stories;
                                    r0Var6.c.g3.O(true);
                                    r0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o10);
                    if (r0Var.Q) {
                        str4 = null;
                        r31 z17 = r31.z(-5, bd.M0(2131752797, null));
                        z17.L(z16);
                        z17.g = false;
                        z17.i = z16 ? 1 : 0;
                        arrayList5.add(z17);
                        r31 z18 = r31.z(-6, bd.M0(2131752796, null));
                        z18.L(r0Var.K.reply);
                        z18.i = z16 ? 1 : 0;
                        arrayList5.add(z18);
                        r31 z19 = r31.z(-7, bd.M0(2131752798, null));
                        z19.L(r0Var.K.read_messages);
                        z19.i = z16 ? 1 : 0;
                        arrayList5.add(z19);
                        r31 z20 = r31.z(-8, bd.M0(2131752799, null));
                        z20.L(r0Var.K.delete_sent_messages);
                        z20.i = z16 ? 1 : 0;
                        arrayList5.add(z20);
                        r31 z21 = r31.z(-9, bd.M0(2131752800, null));
                        z21.L(r0Var.K.delete_received_messages);
                        z21.i = z16 ? 1 : 0;
                        arrayList5.add(z21);
                    } else {
                        str4 = null;
                    }
                    String M04 = bd.M0(2131752791, str4);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var.K;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    r31 o11 = r31.o(-10, M04, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = r0Var.K;
                    o11.L(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    o11.f = !r0Var.R;
                    final int i24 = 2;
                    o11.D = new View.OnClickListener() { // from class: lg.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    r0 r0Var2 = r0Var;
                                    r0Var2.N = null;
                                    r0Var2.c.g3.O(true);
                                    r0Var2.d0(true);
                                    break;
                                case 1:
                                    r0 r0Var3 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = r0Var3.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    r0Var3.c.g3.O(true);
                                    r0Var3.d0(true);
                                    break;
                                case 2:
                                    r0 r0Var4 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = r0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        r0Var4.c0(-14, true, new l0(r0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        r0Var4.c.g3.O(true);
                                        r0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r0 r0Var5 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = r0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        r0Var5.c0(-17, true, new l0(r0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        r0Var5.c.g3.O(true);
                                        r0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var6 = r0Var;
                                    r0Var6.K.manage_stories = !r0.manage_stories;
                                    r0Var6.c.g3.O(true);
                                    r0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o11);
                    if (r0Var.R) {
                        str5 = null;
                        r31 z22 = r31.z(-11, bd.M0(2131752793, null));
                        z22.L(r0Var.K.edit_name);
                        z22.i = 1;
                        arrayList5.add(z22);
                        r31 z23 = r31.z(-12, bd.M0(2131752794, null));
                        z23.L(r0Var.K.edit_bio);
                        z23.i = 1;
                        arrayList5.add(z23);
                        r31 z24 = r31.z(-13, bd.M0(2131752792, null));
                        z24.L(r0Var.K.edit_profile_photo);
                        z24.i = 1;
                        arrayList5.add(z24);
                        r31 z25 = r31.z(-14, bd.M0(2131752790, null));
                        z25.L(r0Var.K.edit_username);
                        z25.i = 1;
                        arrayList5.add(z25);
                    } else {
                        str5 = null;
                    }
                    String M05 = bd.M0(2131752807, str5);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = r0Var.K;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    r31 o12 = r31.o(-15, M05, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = r0Var.K;
                    o12.L(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    o12.f = !r0Var.S;
                    final int i25 = 3;
                    o12.D = new View.OnClickListener() { // from class: lg.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
                                case 0:
                                    r0 r0Var2 = r0Var;
                                    r0Var2.N = null;
                                    r0Var2.c.g3.O(true);
                                    r0Var2.d0(true);
                                    break;
                                case 1:
                                    r0 r0Var3 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = r0Var3.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    r0Var3.c.g3.O(true);
                                    r0Var3.d0(true);
                                    break;
                                case 2:
                                    r0 r0Var4 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = r0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        r0Var4.c0(-14, true, new l0(r0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        r0Var4.c.g3.O(true);
                                        r0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r0 r0Var5 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = r0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        r0Var5.c0(-17, true, new l0(r0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        r0Var5.c.g3.O(true);
                                        r0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var6 = r0Var;
                                    r0Var6.K.manage_stories = !r0.manage_stories;
                                    r0Var6.c.g3.O(true);
                                    r0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o12);
                    if (r0Var.S) {
                        str6 = null;
                        r31 z26 = r31.z(-16, bd.M0(2131752802, null));
                        z26.L(r0Var.K.view_gifts);
                        z26.i = 1;
                        arrayList5.add(z26);
                        r31 z27 = r31.z(-17, bd.M0(2131752806, null));
                        z27.L(r0Var.K.sell_gifts);
                        z27.i = 1;
                        arrayList5.add(z27);
                        r31 z28 = r31.z(-18, bd.M0(2131752805, null));
                        z28.L(r0Var.K.change_gift_settings);
                        z28.i = 1;
                        arrayList5.add(z28);
                        r31 z29 = r31.z(-19, bd.M0(2131752804, null));
                        z29.L(r0Var.K.transfer_and_upgrade_gifts);
                        z29.i = 1;
                        arrayList5.add(z29);
                        r31 z30 = r31.z(-20, bd.M0(2131752803, null));
                        z30.L(r0Var.K.transfer_stars);
                        z30.i = 1;
                        arrayList5.add(z30);
                    } else {
                        str6 = null;
                    }
                    r31 o13 = r31.o(-21, bd.M0(2131752789, str6), "");
                    o13.L(r0Var.K.manage_stories);
                    final int i26 = 4;
                    o13.D = new View.OnClickListener() { // from class: lg.n0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    r0 r0Var2 = r0Var;
                                    r0Var2.N = null;
                                    r0Var2.c.g3.O(true);
                                    r0Var2.d0(true);
                                    break;
                                case 1:
                                    r0 r0Var3 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = r0Var3.K;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    r0Var3.c.g3.O(true);
                                    r0Var3.d0(true);
                                    break;
                                case 2:
                                    r0 r0Var4 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = r0Var4.K;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        r0Var4.c0(-14, true, new l0(r0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        r0Var4.c.g3.O(true);
                                        r0Var4.d0(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r0 r0Var5 = r0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = r0Var5.K;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        r0Var5.c0(-17, true, new l0(r0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        r0Var5.c.g3.O(true);
                                        r0Var5.d0(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r0 r0Var6 = r0Var;
                                    r0Var6.K.manage_stories = !r0.manage_stories;
                                    r0Var6.c.g3.O(true);
                                    r0Var6.d0(true);
                                    break;
                            }
                        }
                    };
                    arrayList5.add(o13);
                    f41Var3.U();
                    arrayList5.add(r31.B(-4, null));
                    arrayList5.add(r31.B(-5, null));
                    arrayList5.add(r31.B(-6, null));
                    arrayList5.add(r31.B(-7, null));
                    break;
                }
                break;
            case 19:
                lg.t0.Z((lg.t0) obj3, (ArrayList) obj, (f41) obj2);
                break;
            case 20:
                lg.b1 b1Var = (lg.b1) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                String M06 = bd.M0(2131752698, null);
                String M07 = bd.M0(2131752692, null);
                r31 r31Var5 = new r31(2);
                r31Var5.l = M06;
                r31Var5.o = M07;
                r31Var5.k = R.raw.biz_map;
                arrayList6.add(r31Var5);
                arrayList6.add(r31.k(b1Var.d));
                arrayList6.add(r31.C(null));
                r31 i27 = r31.i(1, bd.M0(2131752691, null));
                i27.L(b1Var.x != null);
                arrayList6.add(i27);
                if (b1Var.x != null) {
                    arrayList6.add(r31.k(b1Var.f));
                }
                arrayList6.add(r31.C(null));
                if (b1Var.w != null && (b1Var.x != null || !TextUtils.isEmpty(b1Var.y))) {
                    z13 = true;
                }
                b1Var.G = z13;
                if (z13) {
                    r31 e10 = r31.e(2, bd.M0(2131752696, null));
                    e10.r = true;
                    arrayList6.add(e10);
                    arrayList6.add(r31.C(null));
                }
                b1Var.Z(true);
                break;
            case 21:
                lg.d1.a0((lg.d1) obj3, (ArrayList) obj);
                break;
            case 22:
                lg.f1 f1Var = (lg.f1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = f1Var.b;
                String str11 = null;
                String M08 = bd.M0(2131752752, null);
                r31 r31Var6 = new r31(9);
                r31Var6.d = -1;
                r31Var6.l = M08;
                r31Var6.L(f1Var.r);
                arrayList7.add(r31Var6);
                arrayList7.add(r31.C(null));
                if (f1Var.r) {
                    while (i15 < arrayList8.size()) {
                        if (i15 > 0) {
                            arrayList7.add(r31.C(str11));
                        }
                        lg.c1 c1Var = (lg.c1) arrayList8.get(i15);
                        if (f1Var.Z()) {
                            str7 = null;
                        } else {
                            int i28 = i15 * 3;
                            str7 = null;
                            arrayList7.add(r31.f(bd.M0(2131752751, null), lg.c1.a(c1Var.a), i28));
                            arrayList7.add(r31.f(bd.M0(2131752757, null), lg.c1.a(c1Var.b), i28 + 1));
                            r31 e11 = r31.e(i28 + 2, bd.M0(2131746329, null));
                            e11.r = true;
                            arrayList7.add(e11);
                        }
                        i15++;
                        str11 = str7;
                    }
                    String str12 = str11;
                    if (f1Var.a0()) {
                        arrayList7.add(r31.C(str12));
                        r31 c2 = r31.c(-2, R.drawable.menu_premium_clock_add, bd.M0(2131752758, str12));
                        c2.q = true;
                        arrayList7.add(c2);
                    }
                    arrayList7.add(r31.C(bd.M0(2131752753, str12)));
                    break;
                }
                break;
            case 23:
                lg.x1.a0((lg.x1) obj3, (ArrayList) obj, (f41) obj2);
                break;
            case 24:
                li.a aVar = (li.a) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                arrayList9.add(r31.E(0, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(r31.j(1, aVar.S1));
                arrayList9.add(r31.E(2, org.telegram.messenger.g0.L(12.0f)));
                arrayList9.add(r31.t(3, bd.M0(2131751947, null)));
                aVar.V1 = arrayList9.size();
                String M09 = bd.M0(2131751946, null);
                boolean z31 = aVar.U1;
                r31 y9 = r31.y(hs.h2, M09, bd.M0(z31 ? 2131751945 : 2131751944, null));
                y9.L(!aVar.R1);
                arrayList9.add(y9);
                r31 y10 = r31.y(hs.g2, bd.M0(2131751950, null), bd.M0(z31 ? 2131751949 : 2131751948, null));
                y10.L(aVar.R1);
                arrayList9.add(y10);
                arrayList9.add(r31.B(6, bd.M0(2131751951, null)));
                break;
            case 25:
                b(obj, obj2);
                break;
            case 26:
                c(obj, obj2);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                mi.t3 t3Var = (mi.t3) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = t3Var.t3;
                ArrayList arrayList12 = new ArrayList(arrayList10.size());
                int size = arrayList10.size();
                int i29 = 0;
                while (i29 < size) {
                    Object obj4 = arrayList10.get(i29);
                    i29++;
                    Object obj5 = ((r31) obj4).G;
                    if (obj5 instanceof mi.a) {
                        arrayList12.add((mi.a) obj5);
                    }
                }
                if (arrayList12.size() >= 2) {
                    ArrayList arrayList13 = new ArrayList();
                    int size2 = arrayList12.size();
                    int i30 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i31 = 0;
                    int i32 = 0;
                    while (i32 < size2) {
                        Object obj6 = arrayList12.get(i32);
                        i32++;
                        mi.a aVar2 = (mi.a) obj6;
                        int indexOf = arrayList11.indexOf(aVar2);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i33 = indexOf + 1;
                            if (mi.t3.A3(aVar2) && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                                int S3 = t3Var.S3(indexOf);
                                i33 = S3 >= arrayList11.size() ? arrayList11.size() : S3 + 1;
                            }
                            arrayList13.add(new ArrayList(arrayList11.subList(indexOf, i33)));
                            i30 = Math.min(i30, indexOf);
                            i14 = Math.max(i14, i33);
                            i31 += i33 - indexOf;
                        }
                    }
                    if (i31 == i14 - i30) {
                        ArrayList arrayList14 = new ArrayList(i31);
                        int size3 = arrayList13.size();
                        int i34 = 0;
                        while (i34 < size3) {
                            Object obj7 = arrayList13.get(i34);
                            i34++;
                            arrayList14.addAll((ArrayList) obj7);
                        }
                        for (int i35 = 0; i35 < arrayList14.size(); i35++) {
                            if (arrayList11.get(i30 + i35) != arrayList14.get(i35)) {
                                mi.g2 g2Var2 = t3Var.R3;
                                if (g2Var2 != null) {
                                    g2Var2.d();
                                }
                                for (int i36 = 0; i36 < arrayList14.size(); i36++) {
                                    arrayList11.set(i30 + i36, (mi.a) arrayList14.get(i36));
                                }
                                mi.a aVar3 = t3Var.a4;
                                ArrayList arrayList15 = mi.t3.A4;
                                if (aVar3 != null) {
                                    ArrayList arrayList16 = aVar3.k;
                                    int indexOf2 = arrayList11.indexOf(aVar3);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList17 = indexOf2 > 0 ? ((mi.a) arrayList11.get(indexOf2 - 1)).k : arrayList15;
                                        int i37 = indexOf2 + 1;
                                        if (i37 < arrayList11.size()) {
                                            arrayList15 = ((mi.a) arrayList11.get(i37)).k;
                                        }
                                        if (arrayList17.size() < arrayList15.size()) {
                                            arrayList17 = arrayList15;
                                        }
                                        if (!arrayList16.equals(arrayList17)) {
                                            arrayList16.clear();
                                            arrayList16.addAll(arrayList17);
                                            objArr = true;
                                            boolean A2 = t3Var.A2();
                                            i11 = 0;
                                            while (i11 < arrayList11.size()) {
                                                mi.a aVar4 = (mi.a) arrayList11.get(i11);
                                                if (!aVar4.i && !mi.t3.A3(aVar4)) {
                                                    mi.a aVar5 = i11 > 0 ? (mi.a) arrayList11.get(i11 - 1) : null;
                                                    int max = aVar5 != null ? Math.max(0, aVar5.c) : 0;
                                                    if (mi.t3.H3(aVar4.b)) {
                                                        aVar4.c = max;
                                                        if (max > 0) {
                                                            aVar4.d = aVar5.d > 0 ? 1 : 0;
                                                            aVar4.e = false;
                                                            aVar4.f = false;
                                                        }
                                                    } else {
                                                        int i38 = max + 1;
                                                        if (aVar4.c > i38) {
                                                            aVar4.c = i38;
                                                        }
                                                    }
                                                    if (aVar4.c <= 0) {
                                                        aVar4.c = 0;
                                                        aVar4.d = 0;
                                                        aVar4.e = false;
                                                        aVar4.f = false;
                                                    }
                                                }
                                                i11++;
                                            }
                                            t3Var.v4();
                                            t3Var.d2();
                                            if (!objArr == true || A2) {
                                                t3Var.g3.O(true);
                                                t3Var.A4();
                                            } else {
                                                t3Var.A4();
                                            }
                                            g2Var = t3Var.R3;
                                            if (g2Var == null) {
                                                g2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                objArr = false;
                                boolean A22 = t3Var.A2();
                                i11 = 0;
                                while (i11 < arrayList11.size()) {
                                }
                                t3Var.v4();
                                t3Var.d2();
                                if (objArr == true) {
                                }
                                t3Var.g3.O(true);
                                t3Var.A4();
                                g2Var = t3Var.R3;
                                if (g2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
