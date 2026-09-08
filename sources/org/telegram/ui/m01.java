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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m01 extends org.telegram.ui.Components.xu0 {
    public boolean f2;
    public final /* synthetic */ ProfileActivity g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.Components.pu0 pu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.f6 f6Var, bh.b bVar) {
        super(context, j3, pu0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, f6Var, bVar);
        this.g2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void D0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.g2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.xu0.w0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.w5[c10].b(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.g2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.t5[0]) == null || profileActivity.O == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.O.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.g2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.xu0
    public final void K0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.g2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.B0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.Z, !z10, 0.95f, true);
        profileActivity.Q0.setVisibility((z10 || !profileActivity.L0) ? 8 : 4);
        profileActivity.R0.setVisibility((z10 || !profileActivity.M0) ? 8 : 4);
        profileActivity.S0.setVisibility((z10 || !profileActivity.N0) ? 8 : 4);
        profileActivity.T0.setVisibility(z10 ? 8 : 4);
        profileActivity.l5(false);
    }

    @Override // org.telegram.ui.Components.xu0
    public final void L0() {
        this.g2.R();
    }

    @Override // org.telegram.ui.Components.xu0
    public final void M0(float f7) {
        E0();
        ProfileActivity profileActivity = this.g2;
        m01 m01Var = profileActivity.O;
        if (m01Var != null && profileActivity.s1) {
            if (profileActivity.t5[0] != null) {
                profileActivity.t5[0].setTranslationX(m01Var.f0(8, true));
            }
            if (profileActivity.t5[1] != null) {
                profileActivity.t5[1].setTranslationX(profileActivity.O.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.h6);
            profileActivity.U4();
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final void P(Canvas canvas, float f7, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.g2;
        profileActivity.m5.J(canvas, getY() + profileActivity.a.getY() + f7, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.xu0
    public final int V0(int i10) {
        this.g2.getClass();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.xu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(boolean z10) {
        float f7;
        int i10;
        super.b1(z10);
        ProfileActivity profileActivity = this.g2;
        if (profileActivity.s1) {
            if (z10) {
                g1(null);
            }
            this.L1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            ViewPropertyAnimator animate = profileActivity.t5[selectedTab].animate();
            if (!z10) {
                if (selectedTab == 0) {
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                }
                f7 = AndroidUtilities.dp(72.0f);
                animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).setUpdateListener(new c3(this, 27)).start();
            }
            f7 = 0.0f;
            animate.translationY(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).setUpdateListener(new c3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean l0() {
        ProfileActivity profileActivity = this.g2;
        return profileActivity.i1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.h1;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void o0() {
        k01 k01Var = this.g2.m5;
        if (k01Var != null) {
            k01Var.M();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new f01(this, 1));
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean u0() {
        return this.g2.s1;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean v0() {
        return this.g2.s1;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.g2;
        boolean z11 = profileActivity.t1;
        org.telegram.ui.Components.nr0 nr0Var = this.V;
        if (z11 && !profileActivity.w1 && this.I0.e(14)) {
            if (!this.f2 && (i11 = profileActivity.u1) > 0 && nr0Var != null) {
                this.f2 = true;
                nr0Var.M = i11;
                nr0Var.e();
            }
            profileActivity.w1 = true;
            Y0(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.f2 || (i10 = profileActivity.u1) <= 0 || nr0Var == null) {
            return;
        }
        this.f2 = true;
        nr0Var.M = i10;
        nr0Var.e();
    }
}
