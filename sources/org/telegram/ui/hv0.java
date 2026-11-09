package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(ProfileActivity profileActivity, int i7) {
        super("headerShadow", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = profileActivity;
                super("avatarAnimationProgress", 0);
                break;
            default:
                this.c = profileActivity;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        oi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.f5 f5Var;
        int w02;
        switch (this.b) {
            case 0:
                this.c.a1 = f10;
                break;
            default:
                ProfileActivity profileActivity = this.c;
                boolean z9 = ((profileActivity.S5 > 0.0f ? 1 : (profileActivity.S5 == 0.0f ? 0 : -1)) > 0) != ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0);
                profileActivity.S5 = f10;
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
                qVar.g();
                if (z9) {
                    profileActivity.P3();
                }
                ProfileActivity.s1(profileActivity);
                profileActivity.A5();
                dv0 dv0Var = profileActivity.r;
                if (dv0Var != null && !profileActivity.o2) {
                    Object tag = dv0Var.getTag();
                    dv0Var.setTextColor(i0.a.f(f10, tag instanceof Integer ? profileActivity.I3(org.telegram.ui.ActionBar.l6.w0(((Integer) tag).intValue(), profileActivity.z0), Boolean.valueOf(profileActivity.J0[0])) : profileActivity.I3(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, profileActivity.z0), Boolean.TRUE), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Dj, profileActivity.z0)));
                }
                profileActivity.C5();
                ev0 ev0Var = profileActivity.u0;
                if (ev0Var != null) {
                    ev0Var.setActionBarActionMode(f10);
                }
                bi.g1 g1Var = profileActivity.v0;
                if (g1Var != null) {
                    g1Var.setActionBarActionMode(f10);
                }
                profileActivity.c1.invalidate();
                int w03 = profileActivity.j6 != null ? -1 : org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ji, profileActivity.z0);
                int i7 = org.telegram.ui.ActionBar.l6.Cj;
                int w04 = org.telegram.ui.ActionBar.l6.w0(i7, profileActivity.z0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w03, w04);
                profileActivity.f.setTextColor(S0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.j6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.K != null) {
                    profileActivity.K.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h8, profileActivity.z0), w04));
                }
                int w05 = profileActivity.j6 != null ? -1 : org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.v8, profileActivity.z0);
                int w06 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y8, profileActivity.z0);
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                kVar.E(org.telegram.messenger.g0.S0(f10, 1.0f, w05, w06), false);
                org.telegram.messenger.fp fpVar = profileActivity.j6;
                int w07 = fpVar != null ? 1090519039 : fpVar != null ? 553648127 : org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f8, profileActivity.z0);
                int w08 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z8, profileActivity.z0);
                kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                kVar2.D(org.telegram.messenger.g0.S0(f10, 1.0f, w07, w08), false);
                profileActivity.c1.invalidate();
                if (profileActivity.y != null) {
                    org.telegram.messenger.fp fpVar2 = profileActivity.j6;
                    if (fpVar2 != null) {
                        w02 = org.telegram.ui.ActionBar.l6.b(0.1f, org.telegram.ui.ActionBar.l6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, fpVar2.g(), profileActivity.j6.o(org.telegram.ui.ActionBar.l6.I.q()) ? profileActivity.j6.k() : profileActivity.j6.i()));
                    } else {
                        w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, profileActivity.z0);
                    }
                    profileActivity.y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w02, org.telegram.ui.ActionBar.l6.w0(i7, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.H != null) {
                    profileActivity.H.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, profileActivity.j6 == null ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.oi, profileActivity.z0) : -1, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.D != null) {
                    profileActivity.D.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ni, profileActivity.z0), org.telegram.ui.ActionBar.l6.w0(i7, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.v5();
                ProfileActivity profileActivity2 = profileActivity.o0.n;
                if (profileActivity2.L0) {
                    f5Var = profileActivity2.P0;
                } else if (profileActivity2.N0) {
                    f5Var = profileActivity2.R0;
                } else {
                    f5Var = profileActivity2.T0;
                    if (f5Var == null) {
                        f5Var = null;
                    }
                }
                if (f5Var != null) {
                    if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                        profileActivity.C4(0, profileActivity.L3(), true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.a1);
            default:
                return Float.valueOf(this.c.S5);
        }
    }
}
