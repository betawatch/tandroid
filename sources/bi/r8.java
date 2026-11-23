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
import org.telegram.messenger.p10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ r8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.p10
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
        f9 f9Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ug.j jVar = f9Var.a2;
                FrameLayout frameLayout = f9Var.l2;
                boolean z10 = f9Var.W1;
                boolean z11 = f9Var.X1;
                TL_stars.StarGift starGift = f9Var.Y1;
                String str = f9Var.b2;
                boolean z12 = f9Var.T1;
                int i11 = f9Var.U1;
                mp u12 = mp.u1(i11);
                long j3 = f9Var.V1;
                long P1 = u12.P1(j3);
                arrayList.add(n41.j(-1, f9Var.d2));
                if (P1 <= 0) {
                    arrayList.add(n41.j(-2, f9Var.p2));
                    arrayList.add(n41.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(n41.B(-5, null));
                    } else {
                        arrayList.add(n41.B(-3, null));
                        int i12 = 2;
                        n41 i13 = n41.i(2, pb.b1(false, gd.a0(null, null, z12 ? 2131749837 : 2131749861, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(f9Var.n2);
                        arrayList.add(i13);
                        if (z11) {
                            H2 = gd.a0(null, null, j3 < 0 ? 2131750077 : 2131750076, str);
                        } else if (z10) {
                            H2 = gd.a0(null, null, j3 < 0 ? 2131749856 : 2131749840, str);
                        } else {
                            if (z12) {
                                a03 = gd.N0(2131749836, null);
                            } else {
                                a03 = gd.a0(null, null, j3 >= 0 ? 2131749839 : 2131749855, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(a03, new t8(f9Var, i12)), true);
                        }
                        n41 B = n41.B(-5, H2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    n41 i14 = n41.i(1, gd.N0(z12 ? 2131750168 : 2131750173, str2));
                    i14.L(f9Var.m2);
                    arrayList.add(i14);
                    if (z12) {
                        i7 = 2131750167;
                    } else if (j3 < 0) {
                        i7 = 2131750172;
                    } else {
                        c10 = 0;
                        a02 = gd.a0(str2, str2, 2131750169, str);
                        arrayList.add(n41.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c10] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new t8(f9Var, 3)), true);
                            arrayList.add(n41.j(-43, frameLayout));
                            arrayList.add(n41.B(-44, H22));
                        }
                    }
                    a02 = gd.N0(i7, str2);
                    c10 = 0;
                    arrayList.add(n41.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (P1 <= 0) {
                        arrayList.add(n41.B(-3, gd.a0(null, null, 2131750101, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        n41 i16 = n41.i(3, pb.b1(false, gd.a0(null, null, 2131750100, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(f9Var.o2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.E(di.y8.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(n41.B(-7, TextUtils.concat(pb.b1(false, gd.V(null, null, 2131750099, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750098, null), new t8(f9Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (f9Var.K1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = f9Var.Y1;
                z8 z8Var = f9Var.p2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(z8Var);
                            f9Var.dismiss();
                            kc f12 = f9Var.f1();
                            if (f12 != null && starGift2 != null && starGift2.limited_per_user) {
                                f12.R(starGift2.getDocument(), org.telegram.messenger.g0.W2(gd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(z8Var);
                        f9Var.dismiss();
                        di.y8 y10 = di.y8.y(f9Var.U1, false);
                        int i17 = y10.a;
                        if (starGift2 != null && y10.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y10.H;
                            int i18 = y10.F;
                            long j10 = y10.G;
                            tr a04 = tr.a0(i17);
                            a04.a.c(new w3(i18, 1, j10, a04, arrayList2));
                            ks.f(i17).k(234, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = f9Var.c2;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(z8Var);
                    f9Var.dismiss();
                }
                f9Var.k2.setLoading(false);
                break;
        }
    }
}
