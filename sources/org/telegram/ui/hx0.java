package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hx0 extends org.telegram.ui.Components.au0 {
    public boolean w2;
    public final /* synthetic */ ProfileActivity x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.st0 st0Var, int i10, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i11, int i12, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.p6 p6Var, tg.b bVar) {
        super(context, j10, st0Var, i10, arrayList, chatFull, userFull, i11, i12, profileActivity2, profileActivity3, 1, p6Var, bVar);
        this.x2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean E0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean F0() {
        return this.x2.r1;
    }

    @Override // org.telegram.ui.Components.au0
    public final void L1(boolean z10) {
        int i10;
        int i11;
        super.L1(z10);
        ProfileActivity profileActivity = this.x2;
        boolean z11 = profileActivity.s1;
        org.telegram.ui.Components.wq0 wq0Var = this.a0;
        if (z11 && !profileActivity.v1 && this.K0.d(14)) {
            if (!this.w2 && (i11 = profileActivity.t1) > 0 && wq0Var != null) {
                this.w2 = true;
                wq0Var.P = i11;
                wq0Var.e();
            }
            profileActivity.v1 = true;
            g1(14);
            return;
        }
        if (!profileActivity.s1 || !profileActivity.v1 || this.w2 || (i10 = profileActivity.t1) <= 0 || wq0Var == null) {
            return;
        }
        this.w2 = true;
        wq0Var.P = i10;
        wq0Var.e();
    }

    @Override // org.telegram.ui.Components.au0
    public final void M0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c10 = (org.telegram.ui.Components.au0.G0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c10 >= 0) {
                if (c10 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.w5[c10].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.au0
    public final void N0() {
        FrameLayout frameLayout;
        hx0 hx0Var;
        ProfileActivity profileActivity = this.x2;
        if (!profileActivity.r1 || (frameLayout = profileActivity.t5[0]) == null || (hx0Var = profileActivity.N) == null) {
            return;
        }
        ProfileActivity.Y4(frameLayout, 1.0f - hx0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean R0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.x2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.au0
    public final void T0(boolean z10) {
        int i10;
        ProfileActivity profileActivity = this.x2;
        Activity parentActivity = profileActivity.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).classGuid;
        org.telegram.messenger.i0.B2(parentActivity, i10);
        profileActivity.a.C0();
        profileActivity.Y.setPivotY((profileActivity.X.getMeasuredHeight() / 2.0f) + profileActivity.X.getPivotY());
        profileActivity.Y.setPivotX(r1.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.i0.Y3(profileActivity.Y, !z10, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override // org.telegram.ui.Components.au0
    public final void U0() {
        this.x2.W();
    }

    @Override // org.telegram.ui.Components.au0
    public final void V0(float f7) {
        N0();
        ProfileActivity profileActivity = this.x2;
        hx0 hx0Var = profileActivity.N;
        if (hx0Var != null && profileActivity.r1) {
            if (profileActivity.t5[0] != null) {
                profileActivity.t5[0].setTranslationX(hx0Var.p0(8, true));
            }
            if (profileActivity.t5[1] != null) {
                profileActivity.t5[1].setTranslationX(profileActivity.N.p0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.E6);
            profileActivity.p5();
        }
    }

    @Override // org.telegram.ui.Components.au0
    public final int d1(int i10) {
        RectF rectF = ProfileActivity.S6;
        this.x2.getClass();
        return i10;
    }

    @Override // org.telegram.ui.Components.au0
    public final int getInitialTab() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.wp.r1(r6).T4() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.au0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z10) {
        int i10;
        super.m1(z10);
        ProfileActivity profileActivity = this.x2;
        if (profileActivity.r1) {
            if (z10) {
                r1(null);
            }
            this.O1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z11 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.t5[selectedTab];
                if (!z10) {
                    if (selectedTab == 0) {
                        i10 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z11 ? ProfileActivity.T6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).setUpdateListener(new a3(this, 25)).withEndAction(new xv0(1, frameLayout, z11)).start();
                }
                z11 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z11 ? ProfileActivity.T6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).setUpdateListener(new a3(this, 25)).withEndAction(new xv0(1, frameLayout, z11)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.g3(new vv0(this, 5));
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean w0() {
        ProfileActivity profileActivity = this.x2;
        return profileActivity.h1 == profileActivity.getUserConfig().e() && !profileActivity.g1;
    }
}
