package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import di.lb;
import di.u8;
import di.w7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ f6(u6 u6Var, int i7) {
        this.a = i7;
        this.b = u6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.s10
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
        u6 u6Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ug.j jVar = u6Var.a2;
                FrameLayout frameLayout = u6Var.l2;
                boolean z10 = u6Var.W1;
                boolean z11 = u6Var.X1;
                TL_stars.StarGift starGift = u6Var.Y1;
                String str = u6Var.b2;
                boolean z12 = u6Var.T1;
                int i11 = u6Var.U1;
                np s12 = np.s1(i11);
                long j3 = u6Var.V1;
                long N1 = s12.N1(j3);
                arrayList.add(b41.j(-1, u6Var.d2));
                if (N1 <= 0) {
                    arrayList.add(b41.j(-2, u6Var.p2));
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(b41.B(-5, null));
                    } else {
                        arrayList.add(b41.B(-3, null));
                        int i12 = 2;
                        b41 i13 = b41.i(2, lb.a1(false, hd.a0(null, null, z12 ? 2131749854 : 2131749878, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(u6Var.n2);
                        arrayList.add(i13);
                        if (z11) {
                            H2 = hd.a0(null, null, j3 < 0 ? 2131750094 : 2131750093, str);
                        } else if (z10) {
                            H2 = hd.a0(null, null, j3 < 0 ? 2131749873 : 2131749857, str);
                        } else {
                            if (z12) {
                                a03 = hd.M0(2131749853, null);
                            } else {
                                a03 = hd.a0(null, null, j3 >= 0 ? 2131749856 : 2131749872, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(a03, new h6(u6Var, i12)), true);
                        }
                        b41 B = b41.B(-5, H2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    b41 i14 = b41.i(1, hd.M0(z12 ? 2131750185 : 2131750190, str2));
                    i14.L(u6Var.m2);
                    arrayList.add(i14);
                    if (z12) {
                        i7 = 2131750184;
                    } else if (j3 < 0) {
                        i7 = 2131750189;
                    } else {
                        c10 = 0;
                        a02 = hd.a0(str2, str2, 2131750186, str);
                        arrayList.add(b41.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new h6(u6Var, 3)), true);
                            arrayList.add(b41.j(-43, frameLayout));
                            arrayList.add(b41.B(-44, H22));
                        }
                    }
                    a02 = hd.M0(i7, str2);
                    c10 = 0;
                    arrayList.add(b41.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (N1 <= 0) {
                        arrayList.add(b41.B(-3, hd.a0(null, null, 2131750118, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        b41 i16 = b41.i(3, lb.a1(false, hd.a0(null, null, 2131750117, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(u6Var.o2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.E(u8.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(b41.B(-7, TextUtils.concat(lb.a1(false, hd.V(null, null, 2131750116, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750115, null), new h6(u6Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (u6Var.K1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = u6Var.Y1;
                o6 o6Var = u6Var.p2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(o6Var);
                            u6Var.dismiss();
                            cc e12 = u6Var.e1();
                            if (e12 != null && starGift2 != null && starGift2.limited_per_user) {
                                e12.R(starGift2.getDocument(), org.telegram.messenger.g0.X2(hd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(o6Var);
                        u6Var.dismiss();
                        u8 y10 = u8.y(u6Var.U1, false);
                        int i17 = y10.a;
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y10.H;
                            int i18 = y10.F;
                            long j10 = y10.G;
                            vr a04 = vr.a0(i17);
                            a04.a.c(new w7(i18, 0, j10, a04, arrayList2));
                            ns.f(i17).k(ns.I3, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = u6Var.c2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(o6Var);
                    u6Var.dismiss();
                }
                u6Var.k2.setLoading(false);
                break;
        }
    }
}
