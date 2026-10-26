package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lu extends org.telegram.ui.ActionBar.r2 {
    public static final int[][] r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] s = {org.telegram.ui.ActionBar.y6.hj, org.telegram.ui.ActionBar.y6.ij, org.telegram.ui.ActionBar.y6.lj, org.telegram.ui.ActionBar.y6.kj, org.telegram.ui.ActionBar.y6.jj, org.telegram.ui.ActionBar.y6.pj, org.telegram.ui.ActionBar.y6.qj};
    public static final int[] v = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] w = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] x = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.u91 a;
    public org.telegram.ui.Components.t91 b;
    public FrameLayout c;
    public View d;
    public final se.b e;
    public boolean f;
    public int h;
    public int n;

    public lu() {
        super(null);
        this.e = new se.b();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 24));
        di.i4 i4Var = new di.i4(context, 22);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, i4Var, null);
        org.telegram.ui.Components.u91 u91Var = new org.telegram.ui.Components.u91(context, null);
        this.a = u91Var;
        u91Var.setAdapter(new iu(this));
        this.c = new FrameLayout(context);
        this.b = this.a.n(-2, true);
        i4Var.addView(this.a, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        i4Var.addView(view, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h) - AndroidUtilities.dp(9.0f));
        this.c.addView(this.b, org.telegram.ui.Components.gb1.g(48.0f, -1));
        this.c.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        FrameLayout frameLayout = this.c;
        eh.d c10 = getBaseSimpleGlass().c.c(this.c, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.u91 u91Var2 = this.a;
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        baseSimpleGlass.g = i4Var;
        baseSimpleGlass.h = u91Var2;
        baseSimpleGlass.a.c(u91Var2);
        baseSimpleGlass.f(i4Var, r5Var, u6Var);
        getBaseSimpleGlass().i = new bi.g(8, this, i4Var);
        getBaseSimpleGlass().h = null;
        i4Var.addView(this.c, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = i4Var;
        return i4Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return !this.f ? super.isLightStatusBar() : AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.w8, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.a.getCurrentPosition() == 0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.n = i13;
        this.c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            hu huVar = (hu) it.next();
            lu luVar = huVar.w3;
            oi.a.d(huVar, luVar.h, luVar.n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f) {
            this.f = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void t0() {
        View currentView = this.a.getCurrentView();
        if (currentView instanceof hu) {
            hu huVar = (hu) currentView;
            huVar.e1(new du(huVar), 700, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
