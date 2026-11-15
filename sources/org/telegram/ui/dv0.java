package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ProfileActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ProfileActivity profileActivity, int i7) {
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

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        ri.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.d5 d5Var;
        int w02;
        switch (this.b) {
            case 0:
                this.c.b1 = f10;
                break;
            default:
                ProfileActivity profileActivity = this.c;
                boolean z10 = ((profileActivity.U5 > 0.0f ? 1 : (profileActivity.U5 == 0.0f ? 0 : -1)) > 0) != ((f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) > 0);
                profileActivity.U5 = f10;
                qVar = ((org.telegram.ui.ActionBar.e2) profileActivity).glassEngine;
                qVar.g();
                if (z10) {
                    profileActivity.O3();
                }
                profileActivity.z5();
                profileActivity.A5();
                zu0 zu0Var = profileActivity.r;
                if (zu0Var != null && !profileActivity.q2) {
                    Object tag = zu0Var.getTag();
                    zu0Var.setTextColor(i0.a.f(f10, tag instanceof Integer ? profileActivity.H3(org.telegram.ui.ActionBar.j6.w0(((Integer) tag).intValue(), profileActivity.A0), Boolean.valueOf(profileActivity.K0[0])) : profileActivity.H3(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, profileActivity.A0), Boolean.TRUE), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, profileActivity.A0)));
                }
                profileActivity.C5();
                av0 av0Var = profileActivity.v0;
                if (av0Var != null) {
                    av0Var.setActionBarActionMode(f10);
                }
                di.u0 u0Var = profileActivity.w0;
                if (u0Var != null) {
                    u0Var.setActionBarActionMode(f10);
                }
                profileActivity.d1.invalidate();
                int w03 = profileActivity.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.mi, profileActivity.A0);
                int i7 = org.telegram.ui.ActionBar.j6.Fj;
                int w04 = org.telegram.ui.ActionBar.j6.w0(i7, profileActivity.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w03, w04);
                profileActivity.f.setTextColor(S0);
                Drawable drawable = profileActivity.x;
                if (drawable != null) {
                    if (profileActivity.l6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.L != null) {
                    profileActivity.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h8, profileActivity.A0), w04));
                }
                int w05 = profileActivity.l6 != null ? -1 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v8, profileActivity.A0);
                int w06 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y8, profileActivity.A0);
                kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                kVar.H(org.telegram.messenger.g0.S0(f10, 1.0f, w05, w06), false);
                org.telegram.messenger.cp cpVar = profileActivity.l6;
                int w07 = cpVar != null ? 1090519039 : cpVar != null ? 553648127 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f8, profileActivity.A0);
                int w08 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.z8, profileActivity.A0);
                kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                kVar2.F(org.telegram.messenger.g0.S0(f10, 1.0f, w07, w08), false);
                profileActivity.d1.invalidate();
                if (profileActivity.y != null) {
                    org.telegram.messenger.cp cpVar2 = profileActivity.l6;
                    if (cpVar2 != null) {
                        w02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, cpVar2.g(), profileActivity.l6.o(org.telegram.ui.ActionBar.j6.I.q()) ? profileActivity.l6.k() : profileActivity.l6.i()));
                    } else {
                        w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, profileActivity.A0);
                    }
                    profileActivity.y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w02, org.telegram.ui.ActionBar.j6.w0(i7, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.I != null) {
                    profileActivity.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, profileActivity.l6 == null ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ri, profileActivity.A0) : -1, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity.E != null) {
                    profileActivity.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.qi, profileActivity.A0), org.telegram.ui.ActionBar.j6.w0(i7, profileActivity.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity.u5();
                ProfileActivity profileActivity2 = profileActivity.p0.n;
                if (profileActivity2.M0) {
                    d5Var = profileActivity2.Q0;
                } else if (profileActivity2.O0) {
                    d5Var = profileActivity2.S0;
                } else {
                    d5Var = profileActivity2.U0;
                    if (d5Var == null) {
                        d5Var = null;
                    }
                }
                if (d5Var != null) {
                    if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                        profileActivity.B4(0, profileActivity.K3(), true);
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
                return Float.valueOf(this.c.U5);
        }
    }
}
