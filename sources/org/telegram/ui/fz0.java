package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class fz0 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.s6
    public final void c(Object obj, float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.u0 u0Var;
        int w02;
        ProfileActivity profileActivity = this.b;
        profileActivity.G5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.y;
        wy0 wy0Var = profileActivity.v0;
        if (wy0Var != null) {
            wy0Var.setActionBarActionMode(f7);
        }
        ai.j1 j1Var = profileActivity.w0;
        if (j1Var != null) {
            j1Var.setActionBarActionMode(f7);
        }
        profileActivity.e1.invalidate();
        int w03 = profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.vh, profileActivity.A0);
        int i10 = org.telegram.ui.ActionBar.h6.Oi;
        int w04 = org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0);
        int offsetColor = AndroidUtilities.getOffsetColor(w03, w04, f7, 1.0f);
        profileActivity.f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.x;
        if (drawable != null) {
            if (profileActivity.S5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h8, profileActivity.A0), w04, f7, 1.0f));
        }
        int w05 = profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, profileActivity.A0);
        int w06 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y8, profileActivity.A0);
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.C(AndroidUtilities.getOffsetColor(w05, w06, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.S5;
        int w07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f8, profileActivity.A0);
        int w08 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z8, profileActivity.A0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar2.B(AndroidUtilities.getOffsetColor(w07, w08, f7, 1.0f), false);
        profileActivity.e1.invalidate();
        profileActivity.U0.setIconColor(profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, profileActivity.A0));
        profileActivity.R0.setIconColor(profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, profileActivity.A0));
        profileActivity.S0.setIconColor(profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, profileActivity.A0));
        profileActivity.T0.setIconColor(profileActivity.S5 != null ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v8, profileActivity.A0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.S5;
            if (peerColor2 != null) {
                w02 = org.telegram.ui.ActionBar.h6.b(0.1f, org.telegram.ui.ActionBar.h6.I.q() ? -0.1f : -0.08f, i0.b.f(0.4f, peerColor2.getColor2(), profileActivity.S5.hasColor6(org.telegram.ui.ActionBar.h6.I.q()) ? profileActivity.S5.getColor5() : profileActivity.S5.getColor3()));
            } else {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, profileActivity.A0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.S5 == null ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.A0) : -1, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i10, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.p0.n;
        if (profileActivity2.M0) {
            u0Var = profileActivity2.R0;
        } else if (profileActivity2.O0) {
            u0Var = profileActivity2.T0;
        } else {
            u0Var = profileActivity2.V0;
            if (u0Var == null) {
                u0Var = null;
            }
        }
        if (u0Var != null) {
            if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.G5);
    }
}
