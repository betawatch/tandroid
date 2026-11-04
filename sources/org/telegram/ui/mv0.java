package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.Components.ws0 {
    public boolean x2;
    public final /* synthetic */ ProfileActivity y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.Components.os0 os0Var, int i3, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i10, int i11, ProfileActivity profileActivity2, ProfileActivity profileActivity3, org.telegram.ui.ActionBar.e6 e6Var, eh.c cVar) {
        super(context, j10, os0Var, i3, arrayList, chatFull, userFull, i10, i11, profileActivity2, profileActivity3, 1, e6Var, cVar);
        this.y2 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean G0() {
        return this.y2.s1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean H0() {
        return this.y2.s1;
    }

    @Override // org.telegram.ui.Components.ws0
    public final void N1(boolean z10) {
        int i3;
        int i10;
        super.N1(z10);
        ProfileActivity profileActivity = this.y2;
        boolean z11 = profileActivity.t1;
        org.telegram.ui.Components.vp0 vp0Var = this.b0;
        if (z11 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i10 = profileActivity.u1) > 0 && vp0Var != null) {
                this.x2 = true;
                vp0Var.Q = i10;
                vp0Var.e();
            }
            profileActivity.w1 = true;
            i1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.x2 || (i3 = profileActivity.u1) <= 0 || vp0Var == null) {
            return;
        }
        this.x2 = true;
        vp0Var.Q = i3;
        vp0Var.e();
    }

    @Override // org.telegram.ui.Components.ws0
    public final void O0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c2 = (org.telegram.ui.Components.ws0.I0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c2 >= 0) {
                if (c2 == 0) {
                    ProfileActivity.O0(profileActivity, size);
                }
                profileActivity.x5[c2].c(size, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ws0
    public final void P0() {
        FrameLayout frameLayout;
        mv0 mv0Var;
        ProfileActivity profileActivity = this.y2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.u5[0]) == null || (mv0Var = profileActivity.O) == null) {
            return;
        }
        ProfileActivity.Y4(frameLayout, 1.0f - mv0Var.getBottomButtonStoriesVisibility());
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean T0(TLRPC.ChatParticipant chatParticipant, boolean z10, View view) {
        return this.y2.h(chatParticipant, z10, false, view);
    }

    @Override // org.telegram.ui.Components.ws0
    public final void V0(boolean z10) {
        int i3;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).classGuid;
        org.telegram.messenger.g0.B2(parentActivity, i3);
        profileActivity.a.C0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r1.getMeasuredWidth() / 2.0f);
        org.telegram.messenger.g0.Z3(profileActivity.Z, !z10, 0.95f, true, true);
        profileActivity.L5(false);
    }

    @Override // org.telegram.ui.Components.ws0
    public final void W0() {
        this.y2.V();
    }

    @Override // org.telegram.ui.Components.ws0
    public final void X0(float f10) {
        P0();
        ProfileActivity profileActivity = this.y2;
        mv0 mv0Var = profileActivity.O;
        if (mv0Var != null && profileActivity.s1) {
            if (profileActivity.u5[0] != null) {
                profileActivity.u5[0].setTranslationX(mv0Var.q0(8, true));
            }
            if (profileActivity.u5[1] != null) {
                profileActivity.u5[1].setTranslationX(profileActivity.O.q0(9, false));
            }
            ProfileActivity.O0(profileActivity, profileActivity.F6);
            profileActivity.p5();
        }
    }

    @Override // org.telegram.ui.Components.ws0
    public final int f1(int i3) {
        RectF rectF = ProfileActivity.T6;
        this.y2.getClass();
        return i3;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getInitialTab() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (org.telegram.messenger.hp.s1(r6).W4() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // org.telegram.ui.Components.ws0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z10) {
        int i3;
        super.o1(z10);
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            if (z10) {
                t1(null);
            }
            this.P1 = z10;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z11 = true;
                if (selectedTab > 1) {
                    return;
                }
                FrameLayout frameLayout = profileActivity.u5[selectedTab];
                if (!z10) {
                    if (selectedTab == 0) {
                        i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                    }
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z11 ? ProfileActivity.U6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new b3(this, 25)).withEndAction(new org.telegram.ui.Components.up0(12, frameLayout, z11)).start();
                }
                z11 = false;
                frameLayout.setVisibility(0);
                frameLayout.animate().translationY(!z11 ? ProfileActivity.U6 : 0.0f).alpha(z11 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).setUpdateListener(new b3(this, 25)).withEndAction(new org.telegram.ui.Components.up0(12, frameLayout, z11)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.g0.h3(new pu0(this, 2));
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean x0() {
        ProfileActivity profileActivity = this.y2;
        return profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1;
    }
}
