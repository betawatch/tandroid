package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lz0 extends org.telegram.ui.Components.u6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int w02;
        ProfileActivity profileActivity = this.b;
        profileActivity.K5 = f7;
        ProfileActivity.m1(profileActivity);
        View view = profileActivity.N5;
        if (view != null) {
            view.setAlpha(f7);
        }
        dz0 dz0Var = profileActivity.u0;
        if (dz0Var != null) {
            dz0Var.setActionBarActionMode(f7);
        }
        bi.i1 i1Var = profileActivity.v0;
        if (i1Var != null) {
            i1Var.setActionBarActionMode(f7);
        }
        profileActivity.d1.invalidate();
        int w03 = profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.vh, profileActivity.z0);
        int i10 = org.telegram.ui.ActionBar.y6.Oi;
        int w04 = org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.z0);
        int offsetColor = AndroidUtilities.getOffsetColor(w03, w04, f7, 1.0f);
        profileActivity.f.setTextColor(offsetColor);
        Drawable drawable = profileActivity.w;
        if (drawable != null) {
            if (profileActivity.X5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.K != null) {
            profileActivity.K.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h8, profileActivity.z0), w04, f7, 1.0f));
        }
        int w05 = profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, profileActivity.z0);
        int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y8, profileActivity.z0);
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar.y(AndroidUtilities.getOffsetColor(w05, w06, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.X5;
        int w07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, profileActivity.z0);
        int w08 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z8, profileActivity.z0);
        kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar2.x(AndroidUtilities.getOffsetColor(w07, w08, f7, 1.0f), false);
        profileActivity.d1.invalidate();
        profileActivity.T0.setIconColor(profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, profileActivity.z0));
        profileActivity.Q0.setIconColor(profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, profileActivity.z0));
        profileActivity.R0.setIconColor(profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, profileActivity.z0));
        profileActivity.S0.setIconColor(profileActivity.X5 != null ? -1 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v8, profileActivity.z0));
        if (profileActivity.x != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.X5;
            if (peerColor2 != null) {
                w02 = org.telegram.ui.ActionBar.y6.b(0.1f, org.telegram.ui.ActionBar.y6.I.q() ? -0.1f : -0.08f, i0.a.f(0.4f, peerColor2.getColor2(), profileActivity.X5.hasColor6(org.telegram.ui.ActionBar.y6.I.q()) ? profileActivity.X5.getColor5() : profileActivity.X5.getColor3()));
            } else {
                w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, profileActivity.z0);
            }
            profileActivity.x.setColorFilter(AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            profileActivity.H.setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.X5 == null ? org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, profileActivity.z0) : -1, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.y != null) {
            profileActivity.y.setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, profileActivity.z0), org.telegram.ui.ActionBar.y6.w0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.j5();
        ProfileActivity profileActivity2 = profileActivity.o0.n;
        if (profileActivity2.L0) {
            w0Var = profileActivity2.Q0;
        } else if (profileActivity2.N0) {
            w0Var = profileActivity2.S0;
        } else {
            w0Var = profileActivity2.U0;
            if (w0Var == null) {
                w0Var = null;
            }
        }
        if (w0Var != null) {
            if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                profileActivity.s4(0, profileActivity.G3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.K5);
    }
}
