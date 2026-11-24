// default package

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ep8 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(ProfileActivity profileActivity, byte b) {
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

    @Override // ro
    public final void c(Object obj, float f) {
        sy4 sy4Var;
        a aVar;
        a aVar2;
        zja zjaVar;
        int v0;
        byte b = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                profileActivity.b1 = f;
                break;
            default:
                boolean z = ((profileActivity.b6 > 0.0f ? 1 : (profileActivity.b6 == 0.0f ? 0 : -1)) > 0) != ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0);
                profileActivity.b6 = f;
                sy4Var = ((d) profileActivity).glassEngine;
                sy4Var.g();
                if (z) {
                    profileActivity.I1();
                }
                profileActivity.V3();
                profileActivity.W3();
                ap8 ap8Var = profileActivity.r;
                if (ap8Var != null && !profileActivity.q2) {
                    Object tag = ap8Var.getTag();
                    ap8Var.setTextColor(on2.f(f, tag instanceof Integer ? profileActivity.B1(cmb.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.B1(cmb.v0(cmb.A8, profileActivity.A0), Boolean.TRUE), cmb.v0(cmb.Fj, profileActivity.A0)));
                }
                profileActivity.Y3();
                bp8 bp8Var = profileActivity.v0;
                if (bp8Var != null) {
                    bp8Var.setActionBarActionMode(f);
                }
                xs8 xs8Var = profileActivity.w0;
                if (xs8Var != null) {
                    xs8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int v02 = profileActivity.s6 != null ? -1 : cmb.v0(cmb.li, profileActivity.A0);
                int i = cmb.Ej;
                int v03 = cmb.v0(i, profileActivity.A0);
                int R0 = gm.R0(f, 1.0f, v02, v03);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.s6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(gm.R0(f, 1.0f, cmb.v0(cmb.g8, profileActivity.A0), v03));
                }
                int v04 = profileActivity.s6 != null ? -1 : cmb.v0(cmb.u8, profileActivity.A0);
                int v05 = cmb.v0(cmb.x8, profileActivity.A0);
                aVar = ((d) profileActivity).actionBar;
                aVar.H(gm.R0(f, 1.0f, v04, v05), false);
                ec7 ec7Var = profileActivity.s6;
                int v06 = ec7Var != null ? 1090519039 : ec7Var != null ? 553648127 : cmb.v0(cmb.e8, profileActivity.A0);
                int v07 = cmb.v0(cmb.y8, profileActivity.A0);
                aVar2 = ((d) profileActivity).actionBar;
                aVar2.G(gm.R0(f, 1.0f, v06, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    ec7 ec7Var2 = profileActivity.s6;
                    if (ec7Var2 != null) {
                        int g = ec7Var2.g();
                        boolean o = profileActivity.s6.o(cmb.I.o());
                        ec7 ec7Var3 = profileActivity.s6;
                        v0 = cmb.a(0.1f, cmb.I.o() ? -0.1f : -0.08f, on2.f(0.4f, g, o ? ec7Var3.k() : ec7Var3.i()));
                    } else {
                        v0 = cmb.v0(cmb.pi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(gm.R0(f, 1.0f, v0, cmb.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(gm.R0(f, 1.0f, profileActivity.s6 == null ? cmb.v0(cmb.qi, profileActivity.A0) : -1, cmb.v0(cmb.c6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(gm.R0(f, 1.0f, cmb.v0(cmb.pi, profileActivity.A0), cmb.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.P3();
                nq8 nq8Var = profileActivity.p0;
                int i2 = nq8.r;
                ProfileActivity profileActivity2 = nq8Var.n;
                if (profileActivity2.M0) {
                    zjaVar = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    zjaVar = profileActivity2.S0;
                } else {
                    zjaVar = profileActivity2.U0;
                    if (zjaVar == null) {
                        zjaVar = null;
                    }
                }
                if (zjaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.R2(0, profileActivity.E1(), true);
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
                return Float.valueOf(profileActivity.b6);
        }
    }
}
