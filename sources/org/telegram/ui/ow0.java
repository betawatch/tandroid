package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ow0 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(ProfileActivity profileActivity, int i10) {
        super("headerShadow", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = profileActivity;
                super("avatarAnimationProgress", 0);
                break;
            default:
                this.c = profileActivity;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        ei.r rVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.p5 p5Var;
        int w02;
        switch (this.b) {
            case 0:
                this.c.a1 = f7;
                break;
            default:
                ProfileActivity profileActivity = this.c;
                boolean z10 = ((profileActivity.Q5 > 0.0f ? 1 : (profileActivity.Q5 == 0.0f ? 0 : -1)) > 0) != ((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0);
                profileActivity.Q5 = f7;
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
                rVar.g();
                if (z10) {
                    profileActivity.P3();
                }
                ProfileActivity.s1(profileActivity);
                profileActivity.x5();
                kw0 kw0Var = profileActivity.r;
                if (kw0Var != null && !profileActivity.o2) {
                    Object tag = kw0Var.getTag();
                    kw0Var.setTextColor(i0.b.f(f7, tag instanceof Integer ? profileActivity.I3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), profileActivity.z0), Boolean.valueOf(profileActivity.J0[0])) : profileActivity.I3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, profileActivity.z0), Boolean.TRUE), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, profileActivity.z0)));
                }
                profileActivity.z5();
                lw0 lw0Var = profileActivity.u0;
                if (lw0Var != null) {
                    lw0Var.setActionBarActionMode(f7);
                }
                rh.g0 g0Var = profileActivity.v0;
                if (g0Var != null) {
                    g0Var.setActionBarActionMode(f7);
                }
                profileActivity.c1.invalidate();
                int w03 = profileActivity.g6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ji, profileActivity.z0);
                int i10 = org.telegram.ui.ActionBar.t6.Cj;
                int w04 = org.telegram.ui.ActionBar.t6.w0(i10, profileActivity.z0);
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, w03, w04);
                profileActivity.f.setTextColor(S0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.g6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.K != null) {
                    profileActivity.K.b(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h8, profileActivity.z0), w04));
                }
                int w05 = profileActivity.g6 != null ? -1 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, profileActivity.z0);
                int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y8, profileActivity.z0);
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                lVar.D(org.telegram.messenger.i0.S0(f7, 1.0f, w05, w06), false);
                org.telegram.messenger.lp lpVar = profileActivity.g6;
                int w07 = lpVar != null ? 1090519039 : lpVar != null ? 553648127 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f8, profileActivity.z0);
                int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z8, profileActivity.z0);
                lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                lVar2.C(org.telegram.messenger.i0.S0(f7, 1.0f, w07, w08), false);
                profileActivity.c1.invalidate();
                if (profileActivity.y != null) {
                    org.telegram.messenger.lp lpVar2 = profileActivity.g6;
                    if (lpVar2 != null) {
                        w02 = org.telegram.ui.ActionBar.t6.b(0.1f, org.telegram.ui.ActionBar.t6.I.q() ? -0.1f : -0.08f, i0.b.f(0.4f, lpVar2.g(), profileActivity.g6.o(org.telegram.ui.ActionBar.t6.I.q()) ? profileActivity.g6.k() : profileActivity.g6.i()));
                    } else {
                        w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity.z0);
                    }
                    profileActivity.y.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, w02, org.telegram.ui.ActionBar.t6.w0(i10, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.H != null) {
                    profileActivity.H.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, profileActivity.g6 == null ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, profileActivity.z0) : -1, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.D != null) {
                    profileActivity.D.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity.z0), org.telegram.ui.ActionBar.t6.w0(i10, profileActivity.z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.s5();
                ProfileActivity profileActivity2 = profileActivity.o0.n;
                if (profileActivity2.L0) {
                    p5Var = profileActivity2.P0;
                } else if (profileActivity2.N0) {
                    p5Var = profileActivity2.R0;
                } else {
                    p5Var = profileActivity2.T0;
                    if (p5Var == null) {
                        p5Var = null;
                    }
                }
                if (p5Var != null) {
                    if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                        profileActivity.z4(0, profileActivity.L3(), true);
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
                return Float.valueOf(this.c.Q5);
        }
    }
}
