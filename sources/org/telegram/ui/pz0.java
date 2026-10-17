package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.Components.sv0 {
    public boolean f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.kv0 kv0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.d6 d6Var, bh.b bVar) {
        super(context, j10, kv0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, d6Var, bVar);
        this.g2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void F0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.g2;
        if (profileActivity.t1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.sv0.y0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.y5[c10].b(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final void G0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.g2;
        if (!profileActivity.t1 || (frameLayout = profileActivity.v5[0]) == null || profileActivity.O == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean K0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.g2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void M0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        profileActivity.R0.setVisibility((z10 || !profileActivity.M0) ? 8 : 4);
        profileActivity.S0.setVisibility((z10 || !profileActivity.N0) ? 8 : 4);
        profileActivity.T0.setVisibility((z10 || !profileActivity.O0) ? 8 : 4);
        profileActivity.U0.setVisibility(z10 ? 8 : 4);
        profileActivity.l5(false);
    }

    @Override // org.telegram.ui.Components.sv0
    public final void N0() {
        this.g2.R();
    }

    @Override // org.telegram.ui.Components.sv0
    public final void O0(float f7) {
        G0();
        ProfileActivity profileActivity = this.g2;
        pz0 pz0Var = profileActivity.O;
        if (pz0Var != null && profileActivity.t1) {
            if (profileActivity.v5[0] != null) {
                profileActivity.v5[0].setTranslationX(pz0Var.g0(8, true));
            }
            if (profileActivity.v5[1] != null) {
                profileActivity.v5[1].setTranslationX(profileActivity.O.g0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.j6);
            profileActivity.U4();
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.g2;
        profileActivity.o5.J(canvas, getY() + profileActivity.a.getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.sv0
    public final int X0(int i10) {
        this.g2.getClass();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.sv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(boolean z10) {
        float f7;
        int i10;
        super.d1(z10);
        ProfileActivity profileActivity = this.g2;
        if (profileActivity.t1) {
            if (z10) {
                i1(null);
            }
            this.L1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            ViewPropertyAnimator animate = profileActivity.v5[selectedTab].animate();
            if (!z10) {
                if (selectedTab == 0) {
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                }
                f7 = AndroidUtilities.dp(72.0f);
                animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).setUpdateListener(new e3(this, 27)).start();
            }
            f7 = 0.0f;
            animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.bs.h).setUpdateListener(new e3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean m0() {
        ProfileActivity profileActivity = this.g2;
        return profileActivity.j1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.i1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new sy0(this, 2));
    }

    @Override // org.telegram.ui.Components.sv0
    public final void p0() {
        nz0 nz0Var = this.g2.o5;
        if (nz0Var != null) {
            nz0Var.M();
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean w0() {
        return this.g2.t1;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean x0() {
        return this.g2.t1;
    }

    @Override // org.telegram.ui.Components.sv0
    public final void y1(boolean z10) {
        int i10;
        int i11;
        super.y1(z10);
        ProfileActivity profileActivity = this.g2;
        boolean z11 = profileActivity.u1;
        org.telegram.ui.Components.is0 is0Var = this.V;
        if (z11 && !profileActivity.x1 && this.I0.e(14)) {
            if (!this.f2 && (i11 = profileActivity.v1) > 0 && is0Var != null) {
                this.f2 = true;
                is0Var.M = i11;
                is0Var.e();
            }
            profileActivity.x1 = true;
            a1(14);
            return;
        }
        if (!profileActivity.u1 || !profileActivity.x1 || this.f2 || (i10 = profileActivity.v1) <= 0 || is0Var == null) {
            return;
        }
        this.f2 = true;
        is0Var.M = i10;
        is0Var.e();
    }
}
