package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import di.pb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9 b;

    public /* synthetic */ m8(a9 a9Var, int i7) {
        this.a = i7;
        this.b = a9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.q10
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
        a9 a9Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ug.j jVar = a9Var.a2;
                FrameLayout frameLayout = a9Var.l2;
                boolean z10 = a9Var.W1;
                boolean z11 = a9Var.X1;
                TL_stars.StarGift starGift = a9Var.Y1;
                String str = a9Var.b2;
                boolean z12 = a9Var.T1;
                int i11 = a9Var.U1;
                mp u12 = mp.u1(i11);
                long j3 = a9Var.V1;
                long P1 = u12.P1(j3);
                arrayList.add(l41.j(-1, a9Var.d2));
                if (P1 <= 0) {
                    arrayList.add(l41.j(-2, a9Var.p2));
                    arrayList.add(l41.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(l41.B(-5, null));
                    } else {
                        arrayList.add(l41.B(-3, null));
                        int i12 = 2;
                        l41 i13 = l41.i(2, pb.b1(false, gd.a0(null, null, z12 ? 2131749838 : 2131749862, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(a9Var.n2);
                        arrayList.add(i13);
                        if (z11) {
                            H2 = gd.a0(null, null, j3 < 0 ? 2131750078 : 2131750077, str);
                        } else if (z10) {
                            H2 = gd.a0(null, null, j3 < 0 ? 2131749857 : 2131749841, str);
                        } else {
                            if (z12) {
                                a03 = gd.M0(2131749837, null);
                            } else {
                                a03 = gd.a0(null, null, j3 >= 0 ? 2131749840 : 2131749856, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(a03, new o8(a9Var, i12)), true);
                        }
                        l41 B = l41.B(-5, H2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    l41 i14 = l41.i(1, gd.M0(z12 ? 2131750169 : 2131750174, str2));
                    i14.L(a9Var.m2);
                    arrayList.add(i14);
                    if (z12) {
                        i7 = 2131750168;
                    } else if (j3 < 0) {
                        i7 = 2131750173;
                    } else {
                        c10 = 0;
                        a02 = gd.a0(str2, str2, 2131750170, str);
                        arrayList.add(l41.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new o8(a9Var, 3)), true);
                            arrayList.add(l41.j(-43, frameLayout));
                            arrayList.add(l41.B(-44, H22));
                        }
                    }
                    a02 = gd.M0(i7, str2);
                    c10 = 0;
                    arrayList.add(l41.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (P1 <= 0) {
                        arrayList.add(l41.B(-3, gd.a0(null, null, 2131750102, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        l41 i16 = l41.i(3, pb.b1(false, gd.a0(null, null, 2131750101, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(a9Var.o2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.E(di.x8.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(l41.B(-7, TextUtils.concat(pb.b1(false, gd.V(null, null, 2131750100, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750099, null), new o8(a9Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (a9Var.K1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = a9Var.Y1;
                u8 u8Var = a9Var.p2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(u8Var);
                            a9Var.dismiss();
                            lc f12 = a9Var.f1();
                            if (f12 != null && starGift2 != null && starGift2.limited_per_user) {
                                f12.R(starGift2.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(u8Var);
                        a9Var.dismiss();
                        di.x8 y10 = di.x8.y(a9Var.U1, false);
                        int i17 = y10.a;
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y10.H;
                            int i18 = y10.F;
                            long j10 = y10.G;
                            tr a04 = tr.a0(i17);
                            a04.a.c(new q3(i18, 1, j10, a04, arrayList2));
                            ks.f(i17).k(234, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = a9Var.c2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(u8Var);
                    a9Var.dismiss();
                }
                a9Var.k2.setLoading(false);
                break;
        }
    }
}
