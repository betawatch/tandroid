package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class k71 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final j71 c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f;
    public int h;
    public final int[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        final int i10 = 0;
        this.n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false), PorterDuff.Mode.MULTIPLY));
        ai.f0 f0Var = new ai.f0(this, context, 23);
        f0Var.setWillNotDraw(false);
        this.containerView = f0Var;
        j71 j71Var = new j71(this, context);
        this.c = j71Var;
        final int i11 = 1;
        j71Var.setFillViewport(true);
        j71Var.setWillNotDraw(false);
        j71Var.setClipToPadding(false);
        j71Var.setVerticalScrollBarEnabled(false);
        f0Var.addView(j71Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        j71Var.addView(linearLayout, w7.z5.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.j(20.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.i6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i13 = org.telegram.ui.ActionBar.i6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        f0Var.addView(view, layoutParams);
        ci.d dVar = new ci.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new gt(22, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i71
                public final /* synthetic */ k71 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i10) {
                        case 0:
                            k71 k71Var = this.b;
                            k71Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            k71Var.dismiss();
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        f0Var.addView(dVar, w7.z5.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        ci.d dVar2 = new ci.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.i71
            public final /* synthetic */ k71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        k71 k71Var = this.b;
                        k71Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        k71Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        f0Var.addView(dVar2, w7.z5.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(k71 k71Var) {
        View childAt = k71Var.f.getChildAt(0);
        int[] iArr = k71Var.n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= k71Var.containerView.getTranslationY() + (k71Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            k71Var.o(false);
        } else {
            k71Var.o(true);
        }
        if (k71Var.h != max) {
            k71Var.h = max;
            k71Var.c.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void o(boolean z10) {
        View view = this.e;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.d.setDuration(150L);
        this.d.addListener(new da(23, this, z10));
        this.d.start();
    }
}
