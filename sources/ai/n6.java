package ai;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import ci.e9;
import ci.f8;
import ci.wb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ n6(d7 d7Var, int i3) {
        this.a = i3;
        this.b = d7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    @Override // org.telegram.messenger.n10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        char c2;
        String a02;
        int i3;
        String a03;
        CharSequence H2;
        int i10 = this.a;
        d7 d7Var = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                vg.j jVar = d7Var.X1;
                FrameLayout frameLayout = d7Var.i2;
                boolean z10 = d7Var.T1;
                boolean z11 = d7Var.U1;
                TL_stars.StarGift starGift = d7Var.V1;
                String str = d7Var.Y1;
                boolean z12 = d7Var.Q1;
                int i11 = d7Var.R1;
                hp s12 = hp.s1(i11);
                long j10 = d7Var.S1;
                long N1 = s12.N1(j10);
                arrayList.add(r31.j(-1, d7Var.a2));
                if (N1 <= 0) {
                    arrayList.add(r31.j(-2, d7Var.m2));
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(12.0f)));
                }
                String str2 = null;
                if (starGift != null) {
                    if (!starGift.can_upgrade || z12) {
                        arrayList.add(r31.B(-5, null));
                    } else {
                        arrayList.add(r31.B(-3, null));
                        int i12 = 2;
                        r31 i13 = r31.i(2, wb.a1(false, bd.a0(null, null, z12 ? 2131749862 : 2131749886, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        i13.L(d7Var.k2);
                        arrayList.add(i13);
                        if (z11) {
                            H2 = bd.a0(null, null, j10 < 0 ? 2131750102 : 2131750101, str);
                        } else if (z10) {
                            H2 = bd.a0(null, null, j10 < 0 ? 2131749881 : 2131749865, str);
                        } else {
                            if (z12) {
                                a03 = bd.M0(2131749861, null);
                            } else {
                                a03 = bd.a0(null, null, j10 >= 0 ? 2131749864 : 2131749880, str);
                            }
                            H2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(a03, new p6(d7Var, i12)), true);
                        }
                        r31 B = r31.B(-5, H2);
                        B.g = (z10 || z11) ? false : true;
                        arrayList.add(B);
                        str2 = null;
                    }
                    r31 i14 = r31.i(1, bd.M0(z12 ? 2131750193 : 2131750198, str2));
                    i14.L(d7Var.j2);
                    arrayList.add(i14);
                    if (z12) {
                        i3 = 2131750192;
                    } else if (j10 < 0) {
                        i3 = 2131750197;
                    } else {
                        c2 = 0;
                        a02 = bd.a0(str2, str2, 2131750194, str);
                        arrayList.add(r31.B(-6, a02));
                        if (frameLayout != null) {
                            int i15 = starGift.gifts_per_round;
                            Object[] objArr = new Object[1];
                            objArr[c2] = Integer.valueOf(i15);
                            SpannableStringBuilder H22 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.G(i15, "Gift2AuctionInfoLearnMore2", objArr), new p6(d7Var, 3)), true);
                            arrayList.add(r31.j(-43, frameLayout));
                            arrayList.add(r31.B(-44, H22));
                        }
                    }
                    a02 = bd.M0(i3, str2);
                    c2 = 0;
                    arrayList.add(r31.B(-6, a02));
                    if (frameLayout != null) {
                    }
                } else {
                    if (N1 <= 0) {
                        arrayList.add(r31.B(-3, bd.a0(null, null, 2131750126, str)));
                    }
                    if (jVar != null && (jVar.c != null || jVar.d != null)) {
                        r31 i16 = r31.i(3, wb.a1(false, bd.a0(null, null, 2131750125, Integer.valueOf((int) jVar.g())), 0.78f, null));
                        i16.L(d7Var.l2);
                        arrayList.add(i16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.E(e9.y(i11, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(r31.B(-7, TextUtils.concat(wb.a1(false, bd.V(null, null, 2131750124, spannableStringBuilder), 0.66f, null), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750123, null), new p6(d7Var, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
                    }
                }
                if (d7Var.H1) {
                    Collections.reverse(arrayList);
                    break;
                }
                break;
            default:
                String str3 = (String) obj2;
                TL_stars.StarGift starGift2 = d7Var.V1;
                x6 x6Var = d7Var.m2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!"STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                        if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str3)) {
                            org.telegram.messenger.g0.v1(x6Var);
                            d7Var.dismiss();
                            fc e12 = d7Var.e1();
                            if (e12 != null && starGift2 != null && starGift2.limited_per_user) {
                                e12.R(starGift2.getDocument(), org.telegram.messenger.g0.X2(bd.H(',', "Gift2PerUserLimit", starGift2.per_user_total))).j();
                                break;
                            }
                        }
                    } else {
                        org.telegram.messenger.g0.v1(x6Var);
                        d7Var.dismiss();
                        e9 y9 = e9.y(d7Var.R1, false);
                        int i17 = y9.a;
                        if (starGift2 != null && y9.D) {
                            starGift2.availability_remains = 0;
                            ArrayList arrayList2 = y9.H;
                            int i18 = y9.F;
                            long j11 = y9.G;
                            qr a04 = qr.a0(i17);
                            a04.a.c(new f8(i18, 0, j11, a04, arrayList2));
                            hs.f(i17).k(hs.I3, starGift2);
                            break;
                        }
                    }
                } else {
                    Runnable runnable = d7Var.Z1;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.v1(x6Var);
                    d7Var.dismiss();
                }
                d7Var.h2.setLoading(false);
                break;
        }
    }
}
