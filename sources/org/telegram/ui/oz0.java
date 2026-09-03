package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oz0 extends org.telegram.ui.Components.m6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int v02;
        ProfileActivity profileActivity = this.b;
        profileActivity.B5 = f10;
        Drawable[] drawableArr = profileActivity.B;
        Drawable[] drawableArr2 = profileActivity.F;
        Drawable[] drawableArr3 = profileActivity.y;
        fz0 fz0Var = profileActivity.r0;
        if (fz0Var != null) {
            fz0Var.setActionBarActionMode(f10);
        }
        lh.u0 u0Var = profileActivity.s0;
        if (u0Var != null) {
            u0Var.setActionBarActionMode(f10);
        }
        profileActivity.a1.invalidate();
        int v03 = profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, profileActivity.w0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0);
        int offsetColor = AndroidUtilities.getOffsetColor(v03, v04, f10, 1.0f);
        profileActivity.f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.x;
        if (drawable != null) {
            if (profileActivity.N5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.I != null) {
            profileActivity.I.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, profileActivity.w0), v04, f10, 1.0f));
        }
        int v05 = profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0);
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, profileActivity.w0);
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar.C(AndroidUtilities.getOffsetColor(v05, v06, f10, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.N5;
        int v07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.w0);
        int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z8, profileActivity.w0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar2.B(AndroidUtilities.getOffsetColor(v07, v08, f10, 1.0f), false);
        profileActivity.a1.invalidate();
        profileActivity.Q0.setIconColor(profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0));
        profileActivity.N0.setIconColor(profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0));
        profileActivity.O0.setIconColor(profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0));
        profileActivity.P0.setIconColor(profileActivity.N5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.w0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.w0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.N5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), profileActivity.N5.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? profileActivity.N5.getColor5() : profileActivity.N5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.w0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.w0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.N5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.w0) : -1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.w0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.w0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.l0.n;
        if (profileActivity2.I0) {
            w0Var = profileActivity2.N0;
        } else if (profileActivity2.K0) {
            w0Var = profileActivity2.P0;
        } else {
            w0Var = profileActivity2.R0;
            if (w0Var == null) {
                w0Var = null;
            }
        }
        if (w0Var != null) {
            if (profileActivity.J0 || profileActivity.K0 || profileActivity.I0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.B5);
    }
}
