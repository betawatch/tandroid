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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hz0 extends org.telegram.ui.Components.qu0 {
    public boolean b2;
    public final /* synthetic */ ProfileActivity c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.iu0 iu0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.c6 c6Var, lg.a aVar) {
        super(context, j10, iu0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, c6Var, aVar);
        this.c2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void D0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.c2;
        if (profileActivity.o1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c3 = (org.telegram.ui.Components.qu0.w0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c3 >= 0) {
                if (c3 == 0) {
                    ProfileActivity.G0(profileActivity, size);
                }
                profileActivity.s5[c3].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.c2;
        if (!profileActivity.o1 || (frameLayout = profileActivity.p5[0]) == null || profileActivity.K == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.K.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.c2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.qu0
    public final void K0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.c2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i10);
        profileActivity.a.B0();
        profileActivity.V.setPivotY((profileActivity.U.getMeasuredHeight() / 2.0f) + profileActivity.U.getPivotY());
        profileActivity.V.setPivotX(r1.getMeasuredWidth() / 2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(profileActivity.V, !z10, 0.95f, true);
        profileActivity.M0.setVisibility((z10 || !profileActivity.H0) ? 8 : 4);
        profileActivity.N0.setVisibility((z10 || !profileActivity.I0) ? 8 : 4);
        profileActivity.O0.setVisibility((z10 || !profileActivity.J0) ? 8 : 4);
        profileActivity.P0.setVisibility(z10 ? 8 : 4);
        profileActivity.l5(false);
    }

    @Override // org.telegram.ui.Components.qu0
    public final void L0() {
        this.c2.R();
    }

    @Override // org.telegram.ui.Components.qu0
    public final void M0(float f9) {
        E0();
        ProfileActivity profileActivity = this.c2;
        hz0 hz0Var = profileActivity.K;
        if (hz0Var != null && profileActivity.o1) {
            if (profileActivity.p5[0] != null) {
                profileActivity.p5[0].setTranslationX(hz0Var.f0(8, true));
            }
            if (profileActivity.p5[1] != null) {
                profileActivity.p5[1].setTranslationX(profileActivity.K.f0(9, false));
            }
            ProfileActivity.G0(profileActivity, profileActivity.d6);
            profileActivity.U4();
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final void P(Canvas canvas, float f9, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.c2;
        profileActivity.i5.J(canvas, getY() + profileActivity.a.getY() + f9, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.qu0
    public final int V0(int i10) {
        this.c2.getClass();
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.qu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(boolean z10) {
        float f9;
        int i10;
        super.b1(z10);
        ProfileActivity profileActivity = this.c2;
        if (profileActivity.o1) {
            if (z10) {
                g1(null);
            }
            this.H1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab < 0 || selectedTab > 1) {
                return;
            }
            ViewPropertyAnimator animate = profileActivity.p5[selectedTab].animate();
            if (!z10) {
                if (selectedTab == 0) {
                    i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                }
                f9 = AndroidUtilities.dp(72.0f);
                animate.translationY(f9).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).setUpdateListener(new g3(this, 27)).start();
            }
            f9 = 0.0f;
            animate.translationY(f9).setDuration(320L).setInterpolator(org.telegram.ui.Components.jr.h).setUpdateListener(new g3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.qu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean l0() {
        ProfileActivity profileActivity = this.c2;
        return profileActivity.e1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.d1;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void o0() {
        fz0 fz0Var = this.c2.i5;
        if (fz0Var != null) {
            fz0Var.M();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AndroidUtilities.runOnUIThread(new ky0(this, 2));
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean u0() {
        return this.c2.o1;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean v0() {
        return this.c2.o1;
    }

    @Override // org.telegram.ui.Components.qu0
    public final void v1(boolean z10) {
        int i10;
        int i11;
        super.v1(z10);
        ProfileActivity profileActivity = this.c2;
        boolean z11 = profileActivity.p1;
        org.telegram.ui.Components.gr0 gr0Var = this.R;
        if (z11 && !profileActivity.s1 && this.E0.d(14)) {
            if (!this.b2 && (i11 = profileActivity.q1) > 0 && gr0Var != null) {
                this.b2 = true;
                gr0Var.I = i11;
                gr0Var.e();
            }
            profileActivity.s1 = true;
            Y0(14);
            return;
        }
        if (!profileActivity.p1 || !profileActivity.s1 || this.b2 || (i10 = profileActivity.q1) <= 0 || gr0Var == null) {
            return;
        }
        this.b2 = true;
        gr0Var.I = i10;
        gr0Var.e();
    }
}
