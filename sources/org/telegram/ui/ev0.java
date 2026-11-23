package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ev0 extends org.telegram.ui.Components.p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev0(ProfileActivity profileActivity, int i7) {
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

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        ri.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.g5 g5Var;
        int w02;
        switch (this.b) {
            case 0:
                this.c.b1 = f10;
                break;
            default:
                ProfileActivity profileActivity = this.c;
                boolean z10 = ((profileActivity.W5 > 0.0f ? 1 : (profileActivity.W5 == 0.0f ? 0 : -1)) > 0) != ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0);
                profileActivity.W5 = f10;
                qVar = ((org.telegram.ui.ActionBar.g2) profileActivity).glassEngine;
                qVar.g();
                if (z10) {
                    profileActivity.P3();
                }
                profileActivity.A5();
                profileActivity.B5();
                av0 av0Var = profileActivity.r;
                if (av0Var != null && !profileActivity.q2) {
                    Object tag = av0Var.getTag();
                    av0Var.setTextColor(i0.a.f(f10, tag instanceof Integer ? profileActivity.I3(org.telegram.ui.ActionBar.n6.w0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.I3(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, profileActivity.A0), Boolean.TRUE), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, profileActivity.A0)));
                }
                profileActivity.D5();
                bv0 bv0Var = profileActivity.v0;
                if (bv0Var != null) {
                    bv0Var.setActionBarActionMode(f10);
                }
                di.t0 t0Var = profileActivity.w0;
                if (t0Var != null) {
                    t0Var.setActionBarActionMode(f10);
                }
                profileActivity.d1.invalidate();
                int w03 = profileActivity.n6 != null ? -1 : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.mi, profileActivity.A0);
                int i7 = org.telegram.ui.ActionBar.n6.Fj;
                int w04 = org.telegram.ui.ActionBar.n6.w0(i7, profileActivity.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w03, w04);
                profileActivity.f.setTextColor(S0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.n6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h8, profileActivity.A0), w04));
                }
                int w05 = profileActivity.n6 != null ? -1 : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v8, profileActivity.A0);
                int w06 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y8, profileActivity.A0);
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                kVar.F(org.telegram.messenger.g0.S0(f10, 1.0f, w05, w06), false);
                org.telegram.messenger.bp bpVar = profileActivity.n6;
                int w07 = bpVar != null ? 1090519039 : bpVar != null ? 553648127 : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f8, profileActivity.A0);
                int w08 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z8, profileActivity.A0);
                kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity).actionBar;
                kVar2.E(org.telegram.messenger.g0.S0(f10, 1.0f, w07, w08), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    org.telegram.messenger.bp bpVar2 = profileActivity.n6;
                    if (bpVar2 != null) {
                        w02 = org.telegram.ui.ActionBar.n6.b(0.1f, org.telegram.ui.ActionBar.n6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, bpVar2.g(), profileActivity.n6.o(org.telegram.ui.ActionBar.n6.I.q()) ? profileActivity.n6.k() : profileActivity.n6.i()));
                    } else {
                        w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w02, org.telegram.ui.ActionBar.n6.w0(i7, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, profileActivity.n6 == null ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ri, profileActivity.A0) : -1, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.qi, profileActivity.A0), org.telegram.ui.ActionBar.n6.w0(i7, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.v5();
                ProfileActivity profileActivity2 = profileActivity.p0.n;
                if (profileActivity2.M0) {
                    g5Var = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    g5Var = profileActivity2.S0;
                } else {
                    g5Var = profileActivity2.U0;
                    if (g5Var == null) {
                        g5Var = null;
                    }
                }
                if (g5Var != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
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
                return Float.valueOf(this.c.b1);
            default:
                return Float.valueOf(this.c.W5);
        }
    }
}
