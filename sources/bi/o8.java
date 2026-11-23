package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import di.pb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ o8(c9 c9Var, int i7) {
        this.a = i7;
        this.b = c9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        char c10;
        String a02;
        int i7;
        String a03;
        CharSequence H2;
        int i10 = this.a;
        c9 c9Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ug.j jVar = c9Var.a2;
                FrameLayout frameLayout = c9Var.l2;
                boolean z10 = c9Var.W1;
                boolean z11 = c9Var.X1;
                TL_stars.StarGift starGift = c9Var.Y1;
                String str = c9Var.b2;
                boolean z12 = c9Var.T1;
                int i11 = c9Var.U1;
                np u12 = np.u1(i11);
                long j3 = c9Var.V1;
                long P1 = u12.P1(j3);
                arrayList.add(o41.j(-1, c9Var.d2));
                if (P1 <= 0) {
                    arrayList.add(o41.j(-2, c9Var.p2));
                    arrayList.add(o41.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(o41.B(-5, null));
                    } else {
                        arrayList.add(o41.B(-3, null));
                        int i12 = 2;
                        o41 i13 = o41.i(2, pb.b1(false, hd.a0(null, null, z12 ? 2131749837 : 2131749861, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(c9Var.n2);
                        arrayList.add(i13);
                        if (z11) {
                            H2 = hd.a0(null, null, j3 < 0 ? 2131750077 : 2131750076, str);
                        } else if (z10) {
                            H2 = hd.a0(null, null, j3 < 0 ? 2131749856 : 2131749840, str);
                        } else {
                            if (z12) {
                                a03 = hd.N0(2131749836, null);
                            } else {
                                a03 = hd.a0(null, null, j3 >= 0 ? 2131749839 : 2131749855, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(a03, new q8(c9Var, i12)), true);
                        }
                        o41 B = o41.B(-5, H2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    o41 i14 = o41.i(1, hd.N0(z12 ? 2131750168 : 2131750173, str2));
                    i14.L(c9Var.m2);
                    arrayList.add(i14);
                    if (z12) {
                        i7 = 2131750167;
                    } else if (j3 < 0) {
                        i7 = 2131750172;
                    } else {
                        c10 = 0;
                        a02 = hd.a0(str2, str2, 2131750169, str);
                        arrayList.add(o41.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(hd.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new q8(c9Var, 3)), true);
                            arrayList.add(o41.j(-43, frameLayout));
                            arrayList.add(o41.B(-44, H22));
                        }
                    }
                    a02 = hd.N0(i7, str2);
                    c10 = 0;
                    arrayList.add(o41.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (P1 <= 0) {
                        arrayList.add(o41.B(-3, hd.a0(null, null, 2131750101, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        o41 i16 = o41.i(3, pb.b1(false, hd.a0(null, null, 2131750100, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(c9Var.o2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.E(di.y8.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(o41.B(-7, TextUtils.concat(pb.b1(false, hd.V(null, null, 2131750099, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(hd.N0(2131750098, null), new q8(c9Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (c9Var.K1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = c9Var.Y1;
                w8 w8Var = c9Var.p2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(w8Var);
                            c9Var.dismiss();
                            lc f12 = c9Var.f1();
                            if (f12 != null && starGift2 != null && starGift2.limited_per_user) {
                                f12.R(starGift2.getDocument(), org.telegram.messenger.g0.W2(hd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(w8Var);
                        c9Var.dismiss();
                        di.y8 y10 = di.y8.y(c9Var.U1, false);
                        int i17 = y10.a;
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y10.H;
                            int i18 = y10.F;
                            long j10 = y10.G;
                            ur a04 = ur.a0(i17);
                            a04.a.c(new u3(i18, 1, j10, a04, arrayList2));
                            ls.f(i17).k(234, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = c9Var.c2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(w8Var);
                    c9Var.dismiss();
                }
                c9Var.k2.setLoading(false);
                break;
        }
    }
}
