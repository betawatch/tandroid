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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hz0 extends org.telegram.ui.Components.eu0 {
    public boolean b2;
    public final /* synthetic */ ProfileActivity c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.wt0 wt0Var, int i9, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.b6 b6Var, ig.a aVar) {
        super(context, j10, wt0Var, i9, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, b6Var, aVar);
        this.c2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void D0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.c2;
        if (profileActivity.o1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.eu0.w0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.F0(profileActivity, size);
                }
                profileActivity.s5[c10].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final void E0() {
        FrameLayout frameLayout;
        ProfileActivity profileActivity = this.c2;
        if (!profileActivity.o1 || (frameLayout = profileActivity.p5[0]) == null || profileActivity.K == null) {
            return;
        }
        frameLayout.setTranslationY((1.0f - profileActivity.K.getBottomButtonStoriesVisibility()) * AndroidUtilities.dp(72.0f));
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean I0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.c2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.eu0
    public final void K0(boolean z10) {
        int i9;
        ProfileActivity profileActivity = this.c2;
        Activity parentActivity = profileActivity.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
        AndroidUtilities.removeAdjustResize(parentActivity, i9);
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

    @Override // org.telegram.ui.Components.eu0
    public final void L0() {
        this.c2.Q();
    }

    @Override // org.telegram.ui.Components.eu0
    public final void M0(float f10) {
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
            ProfileActivity.F0(profileActivity, profileActivity.d6);
            profileActivity.U4();
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final void P(Canvas canvas, float f10, Rect rect, Paint paint) {
        ProfileActivity profileActivity = this.c2;
        profileActivity.i5.J(canvas, getY() + profileActivity.a.getY() + f10, rect, paint, true);
    }

    @Override // org.telegram.ui.Components.eu0
    public final int V0(int i9) {
        this.c2.getClass();
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r4).storiesEnabled() != false) goto L18;
     */
    @Override // org.telegram.ui.Components.eu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(boolean z10) {
        float f10;
        int i9;
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
                    i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                }
                f10 = AndroidUtilities.dp(72.0f);
                animate.translationY(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).setUpdateListener(new f3(this, 27)).start();
            }
            f10 = 0.0f;
            animate.translationY(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).setUpdateListener(new f3(this, 27)).start();
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean l0() {
        ProfileActivity profileActivity = this.c2;
        return profileActivity.e1 == profileActivity.getUserConfig().getClientUserId() && !profileActivity.d1;
    }

    @Override // org.telegram.ui.Components.eu0
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

    @Override // org.telegram.ui.Components.eu0
    public final boolean u0() {
        return this.c2.o1;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean v0() {
        return this.c2.o1;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void v1(boolean z10) {
        int i9;
        int i10;
        super.v1(z10);
        ProfileActivity profileActivity = this.c2;
        boolean z11 = profileActivity.p1;
        org.telegram.ui.Components.vq0 vq0Var = this.R;
        if (z11 && !profileActivity.s1 && this.E0.e(14)) {
            if (!this.b2 && (i10 = profileActivity.q1) > 0 && vq0Var != null) {
                this.b2 = true;
                vq0Var.I = i10;
                vq0Var.e();
            }
            profileActivity.s1 = true;
            Y0(14);
            return;
        }
        if (!profileActivity.p1 || !profileActivity.s1 || this.b2 || (i9 = profileActivity.q1) <= 0 || vq0Var == null) {
            return;
        }
        this.b2 = true;
        vq0Var.I = i9;
        vq0Var.e();
    }
}
