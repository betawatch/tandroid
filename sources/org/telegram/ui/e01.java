package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e01 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ ProfileActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.b = profileActivity;
    }

    @Override // org.telegram.ui.Components.q6
    public final void b(Object obj, float f7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.w0 w0Var;
        int v02;
        ProfileActivity profileActivity = this.b;
        profileActivity.E5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.y;
        vz0 vz0Var = profileActivity.u0;
        if (vz0Var != null) {
            vz0Var.setActionBarActionMode(f7);
        }
        xh.g0 g0Var = profileActivity.v0;
        if (g0Var != null) {
            g0Var.setActionBarActionMode(f7);
        }
        profileActivity.d1.invalidate();
        int v03 = profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vh, profileActivity.z0);
        int i10 = org.telegram.ui.ActionBar.j6.Oi;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0);
        int offsetColor = AndroidUtilities.getOffsetColor(v03, v04, f7, 1.0f);
        profileActivity.f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.x;
        if (drawable != null) {
            if (profileActivity.Q5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h8, profileActivity.z0), v04, f7, 1.0f));
        }
        int v05 = profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0);
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y8, profileActivity.z0);
        lVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        lVar.C(AndroidUtilities.getOffsetColor(v05, v06, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.Q5;
        int v07 = peerColor != null ? 1090519039 : peerColor != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.z0);
        int v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z8, profileActivity.z0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        lVar2.A(AndroidUtilities.getOffsetColor(v07, v08, f7, 1.0f), false);
        profileActivity.d1.invalidate();
        profileActivity.T0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0));
        profileActivity.Q0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0));
        profileActivity.R0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0));
        profileActivity.S0.setIconColor(profileActivity.Q5 != null ? -1 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, profileActivity.z0));
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.z0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.Q5;
            if (peerColor2 != null) {
                v02 = org.telegram.ui.ActionBar.j6.b(0.1f, org.telegram.ui.ActionBar.j6.I.q() ? -0.1f : -0.08f, i0.a.d(0.4f, peerColor2.getColor2(), profileActivity.Q5.hasColor6(org.telegram.ui.ActionBar.j6.I.q()) ? profileActivity.Q5.getColor5() : profileActivity.Q5.getColor3()));
            } else {
                v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.z0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v02, org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(profileActivity.Q5 == null ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.z0) : -1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.z0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, profileActivity.z0), org.telegram.ui.ActionBar.j6.v0(i10, profileActivity.z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
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
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(this.b.E5);
    }
}
