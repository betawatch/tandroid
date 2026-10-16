package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g01 extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.u0 u0Var;
        int w02;
        ProfileActivity profileActivity = this.b;
        profileActivity.E5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.y;
        xz0 xz0Var = profileActivity.u0;
        if (xz0Var != null) {
            xz0Var.setActionBarActionMode(f7);
        }
        zh.f0 f0Var = profileActivity.v0;
        if (f0Var != null) {
            f0Var.setActionBarActionMode(f7);
        }
        profileActivity.d1.invalidate();
        int w03 = profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.vh, profileActivity.z0);
        int i10 = org.telegram.ui.ActionBar.g6.Oi;
        int w04 = org.telegram.ui.ActionBar.g6.w0(i10, profileActivity.z0);
        int offsetColor = AndroidUtilities.getOffsetColor(w03, w04, f7, 1.0f);
        profileActivity.f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.x;
        if (drawable != null) {
            if (profileActivity.Q5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h8, profileActivity.z0), w04, f7, 1.0f));
        }
        int w05 = profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, profileActivity.z0);
        int w06 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.y8, profileActivity.z0);
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar.D(AndroidUtilities.getOffsetColor(w05, w06, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.Q5;
        int w07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f8, profileActivity.z0);
        int w08 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z8, profileActivity.z0);
        kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar2.C(AndroidUtilities.getOffsetColor(w07, w08, f7, 1.0f), false);
        profileActivity.d1.invalidate();
        profileActivity.T0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, profileActivity.z0));
        profileActivity.Q0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, profileActivity.z0));
        profileActivity.R0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, profileActivity.z0));
        profileActivity.S0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.v8, profileActivity.z0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, profileActivity.z0), org.telegram.ui.ActionBar.g6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.Q5;
            if (peerColor2 != null) {
                w02 = org.telegram.ui.ActionBar.g6.b(0.1f, org.telegram.ui.ActionBar.g6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), profileActivity.Q5.hasColor6(org.telegram.ui.ActionBar.g6.I.q()) ? profileActivity.Q5.getColor5() : profileActivity.Q5.getColor3()));
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, profileActivity.z0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.g6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.z0), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.Q5 == null ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, profileActivity.z0) : -1, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, profileActivity.z0), org.telegram.ui.ActionBar.g6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.zh, profileActivity.z0), org.telegram.ui.ActionBar.g6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.o0.n;
        if (profileActivity2.L0) {
            u0Var = profileActivity2.Q0;
        } else if (profileActivity2.N0) {
            u0Var = profileActivity2.S0;
        } else {
            u0Var = profileActivity2.U0;
            if (u0Var == null) {
                u0Var = null;
            }
        }
        if (u0Var != null) {
            if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.E5);
    }
}
