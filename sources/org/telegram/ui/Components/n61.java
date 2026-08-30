package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.IUpdateLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n61 extends IUpdateLayout {
    public FrameLayout a;
    public RadialProgress2 b;
    public org.telegram.ui.Cells.w1 c;
    public final Activity d;
    public final ViewGroup e;

    public n61(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void createUpdateUI(int i10) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || this.a != null) {
            return;
        }
        Activity activity = this.d;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setVisibility(4);
        this.a.setTranslationY(AndroidUtilities.dp(44.0f));
        this.a.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 2, -1));
        viewGroup.addView(this.a, k7.b6.e(-1, 44, 83));
        this.a.setOnClickListener(new lh.y0(this, i10, 11));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity);
        this.c = w1Var;
        w1Var.setTextSize(AndroidUtilities.dp(15.0f));
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(-1);
        this.c.setGravity(17);
        this.a.addView(this.c, k7.b6.g());
        this.c.c(LocaleController.getString(R.string.AppUpdateBeta), false, true);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.c, null);
        this.b = radialProgress2;
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        radialProgress2.setColors(-1, -1, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.b.q(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        this.b.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.b.setAsMini();
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateAppUpdateViews(int i10, boolean z4) {
        if (this.e == null) {
            return;
        }
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() == null) {
            FrameLayout frameLayout = this.a;
            if (frameLayout == null || frameLayout.getTag() == null) {
                return;
            }
            this.a.setTag(null);
            if (z4) {
                this.a.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(nr.g).setListener(new nd0(this, 26)).setDuration(180L).start();
                return;
            } else {
                this.a.setTranslationY(AndroidUtilities.dp(44.0f));
                this.a.setVisibility(4);
                return;
            }
        }
        createUpdateUI(i10);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
            this.b.setIcon(15, true, z4);
            this.c.c(LocaleController.getString(R.string.AppUpdateNow), z4, true);
        } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            this.b.setIcon(3, true, z4);
            this.b.o(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
            this.c.c(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z4, true);
        } else {
            this.b.setIcon(2, true, z4);
            this.c.c(LocaleController.getString(R.string.AppUpdateBeta), z4, true);
        }
        if (this.a.getTag() != null) {
            return;
        }
        this.a.setVisibility(0);
        this.a.setTag(1);
        if (z4) {
            this.a.animate().translationY(0.0f).setInterpolator(nr.g).setListener(null).setDuration(180L).start();
        } else {
            this.a.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.IUpdateLayout
    public final void updateFileProgress(Object[] objArr) {
        if (this.a == null || this.c == null || !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
        this.b.o(downloadingUpdateProgress, true);
        this.c.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
        this.a.invalidate();
    }
}
