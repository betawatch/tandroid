package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class av extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.j6.hj, org.telegram.ui.ActionBar.j6.ij, org.telegram.ui.ActionBar.j6.lj, org.telegram.ui.ActionBar.j6.kj, org.telegram.ui.ActionBar.j6.jj, org.telegram.ui.ActionBar.j6.pj, org.telegram.ui.ActionBar.j6.qj};
    public static final int[] f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.i81 a;
    public org.telegram.ui.Components.h81 b;
    public boolean c;

    public av() {
        super(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 20));
        j0 j0Var = new j0(this, context, 6);
        j0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(context, null);
        this.a = i81Var;
        i81Var.setAdapter(new xu(this));
        org.telegram.ui.Components.h81 n10 = this.a.n(8, true);
        this.b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        j0Var.addView(this.b, w7.x5.e(-1, 48, 55));
        j0Var.addView(this.a, w7.x5.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = j0Var;
        return j0Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return !this.c ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.c) {
            this.c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof wu) {
            wu wuVar = (wu) currentView;
            wuVar.d1(new su(wuVar), 700, true);
        }
    }
}
