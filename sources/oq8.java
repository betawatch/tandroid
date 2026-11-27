// default package

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oq8 extends rn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq8(ProfileActivity profileActivity, byte b) {
        super("headerShadow", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = profileActivity;
                super("avatarAnimationProgress", (byte) 0);
                break;
            default:
                this.c = profileActivity;
                break;
        }
    }

    @Override // rn
    public final void c(Object obj, float f) {
        vy4 vy4Var;
        a aVar;
        a aVar2;
        sla slaVar;
        int v0;
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                profileActivity.b1 = f;
                break;
            default:
                boolean z = ((profileActivity.W5 > 0.0f ? 1 : (profileActivity.W5 == 0.0f ? 0 : -1)) > 0) != ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0);
                profileActivity.W5 = f;
                vy4Var = ((e) profileActivity).glassEngine;
                vy4Var.g();
                if (z) {
                    profileActivity.H1();
                }
                profileActivity.S3();
                profileActivity.T3();
                kq8 kq8Var = profileActivity.r;
                if (kq8Var != null && !profileActivity.q2) {
                    Object tag = kq8Var.getTag();
                    kq8Var.setTextColor(vm2.f(f, tag instanceof Integer ? profileActivity.A1(aob.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.A1(aob.v0(aob.B8, profileActivity.A0), Boolean.TRUE), aob.v0(aob.Gj, profileActivity.A0)));
                }
                profileActivity.V3();
                lq8 lq8Var = profileActivity.v0;
                if (lq8Var != null) {
                    lq8Var.setActionBarActionMode(f);
                }
                gu8 gu8Var = profileActivity.w0;
                if (gu8Var != null) {
                    gu8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int v02 = profileActivity.n6 != null ? -1 : aob.v0(aob.mi, profileActivity.A0);
                int i = aob.Fj;
                int v03 = aob.v0(i, profileActivity.A0);
                int R0 = hl.R0(f, 1.0f, v02, v03);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.n6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(hl.R0(f, 1.0f, aob.v0(aob.h8, profileActivity.A0), v03));
                }
                int v04 = profileActivity.n6 != null ? -1 : aob.v0(aob.v8, profileActivity.A0);
                int v05 = aob.v0(aob.y8, profileActivity.A0);
                aVar = ((e) profileActivity).actionBar;
                aVar.H(hl.R0(f, 1.0f, v04, v05), false);
                kc7 kc7Var = profileActivity.n6;
                int v06 = kc7Var != null ? 1090519039 : kc7Var != null ? 553648127 : aob.v0(aob.f8, profileActivity.A0);
                int v07 = aob.v0(aob.z8, profileActivity.A0);
                aVar2 = ((e) profileActivity).actionBar;
                aVar2.G(hl.R0(f, 1.0f, v06, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    kc7 kc7Var2 = profileActivity.n6;
                    if (kc7Var2 != null) {
                        int g = kc7Var2.g();
                        boolean o = profileActivity.n6.o(aob.I.o());
                        kc7 kc7Var3 = profileActivity.n6;
                        v0 = aob.a(0.1f, aob.I.o() ? -0.1f : -0.08f, vm2.f(0.4f, g, o ? kc7Var3.k() : kc7Var3.i()));
                    } else {
                        v0 = aob.v0(aob.qi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(hl.R0(f, 1.0f, v0, aob.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(hl.R0(f, 1.0f, profileActivity.n6 == null ? aob.v0(aob.ri, profileActivity.A0) : -1, aob.v0(aob.d6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(hl.R0(f, 1.0f, aob.v0(aob.qi, profileActivity.A0), aob.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.M3();
                yr8 yr8Var = profileActivity.p0;
                int i2 = yr8.r;
                ProfileActivity profileActivity2 = yr8Var.n;
                if (profileActivity2.M0) {
                    slaVar = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    slaVar = profileActivity2.S0;
                } else {
                    slaVar = profileActivity2.U0;
                    if (slaVar == null) {
                        slaVar = null;
                    }
                }
                if (slaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.P2(0, profileActivity.D1(), true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(profileActivity.b1);
            default:
                return Float.valueOf(profileActivity.W5);
        }
    }
}
