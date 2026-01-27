package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.IUpdateLayout;

/* loaded from: classes5.dex */
public class UpdateLayout extends IUpdateLayout {
    private final Activity activity;
    private final ViewGroup sideMenuContainer;
    private FrameLayout updateLayout;
    private RadialProgress2 updateLayoutIcon;
    private AnimatedTextView updateTextView;

    public UpdateLayout(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.activity = activity;
        this.sideMenuContainer = viewGroup;
    }

    @Override // org.telegram.ui.IUpdateLayout
    public void updateFileProgress(Object[] objArr) {
        if (this.updateLayout == null || this.updateTextView == null || !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        float downloadingUpdateProgress = ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress();
        this.updateLayoutIcon.setProgress(downloadingUpdateProgress, true);
        this.updateTextView.setText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (downloadingUpdateProgress * 100.0f))));
        this.updateLayout.invalidate();
    }

    public void createUpdateUI(final int i) {
        if (this.sideMenuContainer == null || this.updateLayout != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.activity);
        this.updateLayout = frameLayout;
        frameLayout.setVisibility(4);
        this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
        this.updateLayout.setBackground(Theme.getSelectorDrawable(1090519039, false));
        this.sideMenuContainer.addView(this.updateLayout, LayoutHelper.createFrame(-1, 44, 83));
        this.updateLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.UpdateLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateLayout.this.lambda$createUpdateUI$0(i, view);
            }
        });
        AnimatedTextView animatedTextView = new AnimatedTextView(this.activity, true, true, true) { // from class: org.telegram.ui.Components.UpdateLayout.1
            @Override // org.telegram.ui.Components.AnimatedTextView, android.view.View
            protected void onDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - width()) / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(11.0f));
                UpdateLayout.this.updateLayoutIcon.draw(canvas);
                canvas.restore();
            }
        };
        this.updateTextView = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.updateTextView.setTypeface(AndroidUtilities.bold());
        this.updateTextView.setTextColor(-1);
        this.updateTextView.setGravity(17);
        this.updateLayout.addView(this.updateTextView, LayoutHelper.createFrameMatchParent());
        this.updateTextView.setText(LocaleController.getString(R.string.AppUpdateBeta), false);
        RadialProgress2 radialProgress2 = new RadialProgress2(this.updateTextView);
        this.updateLayoutIcon = radialProgress2;
        int i2 = Theme.key_featuredStickers_addButton;
        radialProgress2.setColors(-1, -1, Theme.getColor(i2), Theme.getColor(i2));
        this.updateLayoutIcon.setProgressRect(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        this.updateLayoutIcon.setCircleRadius(AndroidUtilities.dp(11.0f));
        this.updateLayoutIcon.setAsMini();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUpdateUI$0(int i, View view) {
        if (this.updateLayoutIcon.getIcon() == 2) {
            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
            updateAppUpdateViews(i, true);
        } else if (this.updateLayoutIcon.getIcon() == 3) {
            ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
            updateAppUpdateViews(i, true);
        } else {
            File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
            if (downloadedUpdateFile != null) {
                AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", this.activity, null, false);
            }
        }
    }

    @Override // org.telegram.ui.IUpdateLayout
    public void updateAppUpdateViews(int i, boolean z) {
        if (this.sideMenuContainer == null) {
            return;
        }
        if (ApplicationLoader.applicationLoaderInstance.getUpdate() != null) {
            createUpdateUI(i);
            File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
            if (downloadedUpdateFile != null && downloadedUpdateFile.exists()) {
                this.updateLayoutIcon.setIcon(15, true, z);
                setUpdateText(LocaleController.getString(R.string.AppUpdateNow), z);
            } else if (ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                this.updateLayoutIcon.setIcon(3, true, z);
                this.updateLayoutIcon.setProgress(ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress(), true);
                setUpdateText(LocaleController.formatString(R.string.AppUpdateDownloading, Integer.valueOf((int) (ApplicationLoader.applicationLoaderInstance.getDownloadingUpdateProgress() * 100.0f))), z);
            } else {
                this.updateLayoutIcon.setIcon(2, true, z);
                setUpdateText(LocaleController.getString(R.string.AppUpdateBeta), z);
            }
            if (this.updateLayout.getTag() != null) {
                return;
            }
            this.updateLayout.setVisibility(0);
            this.updateLayout.setTag(1);
            if (z) {
                this.updateLayout.animate().translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(null).setDuration(180L).start();
                return;
            } else {
                this.updateLayout.setTranslationY(0.0f);
                return;
            }
        }
        FrameLayout frameLayout = this.updateLayout;
        if (frameLayout == null || frameLayout.getTag() == null) {
            return;
        }
        this.updateLayout.setTag(null);
        if (z) {
            this.updateLayout.animate().translationY(AndroidUtilities.dp(44.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.UpdateLayout.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (UpdateLayout.this.updateLayout.getTag() == null) {
                        UpdateLayout.this.updateLayout.setVisibility(4);
                    }
                }
            }).setDuration(180L).start();
        } else {
            this.updateLayout.setTranslationY(AndroidUtilities.dp(44.0f));
            this.updateLayout.setVisibility(4);
        }
    }

    private void setUpdateText(String str, boolean z) {
        this.updateTextView.setText(str, z);
    }
}
