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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o51 extends org.telegram.ui.ActionBar.f3 {
    public final Drawable b;
    public final n51 c;
    public AnimatorSet d;
    public final View e;
    public final LinearLayout f;
    public int h;
    public final int[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(Context context, BetaUpdate betaUpdate) {
        super(context, false);
        final int i9 = 0;
        this.n = new int[2];
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
        fh.d2 d2Var = new fh.d2(this, context, 25);
        d2Var.setWillNotDraw(false);
        this.containerView = d2Var;
        n51 n51Var = new n51(this, context);
        this.c = n51Var;
        final int i10 = 1;
        n51Var.setFillViewport(true);
        n51Var.setWillNotDraw(false);
        n51Var.setClipToPadding(false);
        n51Var.setVerticalScrollBarEnabled(false);
        d2Var.addView(n51Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        n51Var.addView(linearLayout, g7.e6.x(-1, -2, 51));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString(R.string.AppUpdateBeta));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r5, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        int i12 = org.telegram.ui.ActionBar.f6.k5;
        textView2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        textView2.setText(LocaleController.formatString(R.string.AppBetaUpdateVersion, betaUpdate.version, Integer.valueOf(betaUpdate.versionCode)));
        textView2.setGravity(49);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 49, 23, 0, 23, 5));
        if (!TextUtils.isEmpty(betaUpdate.changelog)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView3.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            textView3.setText(Emoji.replaceEmoji(betaUpdate.changelog, textView3.getPaint().getFontMetricsInt(), false));
            NotificationCenter.listenEmojiLoading(textView3);
            textView3.setGravity(51);
            linearLayout.addView(textView3, g7.e6.t(-2, -2, 51, 23, 15, 23, 0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.e = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        view.setAlpha(0.0f);
        view.setTag(1);
        d2Var.addView(view, layoutParams);
        kh.d dVar = new kh.d(context, null, true);
        File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
        if (downloadedUpdateFile != null) {
            dVar.g(LocaleController.formatString(R.string.AppUpdateNow, new Object[0]), false, true);
            dVar.setOnClickListener(new vh0(9, this, downloadedUpdateFile));
        } else {
            dVar.g(LocaleController.formatString(R.string.AppUpdateDownloadNow, new Object[0]), false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m51
                public final /* synthetic */ o51 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i9) {
                        case 0:
                            o51 o51Var = this.b;
                            o51Var.getClass();
                            ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                            o51Var.dismiss();
                            break;
                        default:
                            this.b.dismiss();
                            break;
                    }
                }
            });
        }
        d2Var.addView(dVar, g7.e6.d(-1, 48.0f, 87, 20.0f, 0.0f, 20.0f, 60.0f));
        kh.d dVar2 = new kh.d(context, null, false);
        dVar2.g(LocaleController.getString(R.string.AppUpdateRemindMeLater), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m51
            public final /* synthetic */ o51 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        o51 o51Var = this.b;
                        o51Var.getClass();
                        ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                        o51Var.dismiss();
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        d2Var.addView(dVar2, g7.e6.d(-1, 48.0f, 87, 20.0f, 4.0f, 20.0f, 8.0f));
    }

    public static void m(o51 o51Var) {
        View childAt = o51Var.f.getChildAt(0);
        int[] iArr = o51Var.n;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - AndroidUtilities.dp(24.0f), 0);
        if (r0.getMeasuredHeight() + iArr[1] <= o51Var.containerView.getTranslationY() + (o51Var.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f))) {
            o51Var.o(false);
        } else {
            o51Var.o(true);
        }
        if (o51Var.h != max) {
            o51Var.h = max;
            o51Var.c.invalidate();
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
        this.d.addListener(new u9(23, this, z10));
        this.d.start();
    }
}
