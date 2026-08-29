package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pu extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.g6.hj, org.telegram.ui.ActionBar.g6.ij, org.telegram.ui.ActionBar.g6.lj, org.telegram.ui.ActionBar.g6.kj, org.telegram.ui.ActionBar.g6.jj, org.telegram.ui.ActionBar.g6.pj, org.telegram.ui.ActionBar.g6.qj};
    public static final int[] f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.z71 a;
    public org.telegram.ui.Components.y71 b;
    public boolean c;

    public pu() {
        super(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.w8;
        lVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        lVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 6));
        n0 n0Var = new n0(this, context, 6);
        n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(context, null);
        this.a = z71Var;
        z71Var.setAdapter(new mu(this));
        org.telegram.ui.Components.y71 n10 = this.a.n(8, true);
        this.b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        n0Var.addView(this.b, i7.f6.e(-1, 48, 55));
        n0Var.addView(this.a, i7.f6.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return !this.c ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        if (f9 > 0.5f && !this.c) {
            this.c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f9);
    }

    public final void r0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof lu) {
            lu luVar = (lu) currentView;
            luVar.e1(new hu(luVar), 700, true);
        }
    }
}
