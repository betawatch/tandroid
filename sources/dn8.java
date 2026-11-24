// default package

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dn8 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn8(ProfileActivity profileActivity, byte b) {
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

    @Override // qn
    public final void c(Object obj, float f) {
        qw4 qw4Var;
        a aVar;
        a aVar2;
        xha xhaVar;
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
                qw4Var = ((d) profileActivity).glassEngine;
                qw4Var.g();
                if (z) {
                    profileActivity.G1();
                }
                profileActivity.R3();
                profileActivity.S3();
                zm8 zm8Var = profileActivity.r;
                if (zm8Var != null && !profileActivity.q2) {
                    Object tag = zm8Var.getTag();
                    zm8Var.setTextColor(bm2.f(f, tag instanceof Integer ? profileActivity.z1(bkb.v0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.z1(bkb.v0(bkb.A8, profileActivity.A0), Boolean.TRUE), bkb.v0(bkb.Fj, profileActivity.A0)));
                }
                profileActivity.U3();
                an8 an8Var = profileActivity.v0;
                if (an8Var != null) {
                    an8Var.setActionBarActionMode(f);
                }
                vq8 vq8Var = profileActivity.w0;
                if (vq8Var != null) {
                    vq8Var.setActionBarActionMode(f);
                }
                profileActivity.d1.invalidate();
                int v02 = profileActivity.n6 != null ? -1 : bkb.v0(bkb.li, profileActivity.A0);
                int i = bkb.Ej;
                int v03 = bkb.v0(i, profileActivity.A0);
                int R0 = gl.R0(f, 1.0f, v02, v03);
                profileActivity.f.setTextColor(R0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.n6 != null) {
                        R0 = -1;
                    }
                    drawable.setColorFilter(R0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(gl.R0(f, 1.0f, bkb.v0(bkb.g8, profileActivity.A0), v03));
                }
                int v04 = profileActivity.n6 != null ? -1 : bkb.v0(bkb.u8, profileActivity.A0);
                int v05 = bkb.v0(bkb.x8, profileActivity.A0);
                aVar = ((d) profileActivity).actionBar;
                aVar.H(gl.R0(f, 1.0f, v04, v05), false);
                da7 da7Var = profileActivity.n6;
                int v06 = da7Var != null ? 1090519039 : da7Var != null ? 553648127 : bkb.v0(bkb.e8, profileActivity.A0);
                int v07 = bkb.v0(bkb.y8, profileActivity.A0);
                aVar2 = ((d) profileActivity).actionBar;
                aVar2.G(gl.R0(f, 1.0f, v06, v07), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    da7 da7Var2 = profileActivity.n6;
                    if (da7Var2 != null) {
                        int g = da7Var2.g();
                        boolean o = profileActivity.n6.o(bkb.I.o());
                        da7 da7Var3 = profileActivity.n6;
                        v0 = bkb.a(0.1f, bkb.I.o() ? -0.1f : -0.08f, bm2.f(0.4f, g, o ? da7Var3.k() : da7Var3.i()));
                    } else {
                        v0 = bkb.v0(bkb.pi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(gl.R0(f, 1.0f, v0, bkb.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(gl.R0(f, 1.0f, profileActivity.n6 == null ? bkb.v0(bkb.qi, profileActivity.A0) : -1, bkb.v0(bkb.c6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(gl.R0(f, 1.0f, bkb.v0(bkb.pi, profileActivity.A0), bkb.v0(i, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.L3();
                mo8 mo8Var = profileActivity.p0;
                int i2 = mo8.r;
                ProfileActivity profileActivity2 = mo8Var.n;
                if (profileActivity2.M0) {
                    xhaVar = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    xhaVar = profileActivity2.S0;
                } else {
                    xhaVar = profileActivity2.U0;
                    if (xhaVar == null) {
                        xhaVar = null;
                    }
                }
                if (xhaVar != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.O2(0, profileActivity.C1(), true);
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
