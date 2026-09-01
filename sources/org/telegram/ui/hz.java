package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hz extends LinearLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.p9 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.p9 f;
    public final FrameLayout h;
    public ValueAnimator n;
    public float r;

    public hz(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        k7.e6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, k7.c6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        p9Var.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(p9Var, k7.c6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        TextView b10 = k7.g6.b(context, 14.0f, i10, true, null);
        b10.setPadding(b.e(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, k7.c6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        frameLayout2.addView(frameLayout3, k7.c6.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.k6.g6;
        TextView b11 = k7.g6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, k7.c6.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, k7.c6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        k7.e6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, k7.c6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.f = p9Var2;
        p9Var2.setImageDrawable(new org.telegram.ui.Components.ij0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(p9Var2, k7.c6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = k7.g6.b(context, 14.0f, i10, true, null);
        b12.setPadding(b.e(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, k7.c6.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        frameLayout5.addView(frameLayout6, k7.c6.e(-2, 26, 17));
        TextView b13 = k7.g6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, k7.c6.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, k7.c6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z4, boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        org.telegram.ui.Components.p9 p9Var = this.f;
        org.telegram.ui.Components.p9 p9Var2 = this.c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        if (z10) {
            ViewPropertyAnimator alpha = frameLayout2.animate().scaleX(!z4 ? 0.0f : 1.0f).scaleY(!z4 ? 0.0f : 1.0f).alpha(!z4 ? 0.0f : 1.0f);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            alpha.setInterpolator(prVar).setDuration(320L).start();
            frameLayout.animate().scaleX(z4 ? 0.0f : 1.0f).scaleY(z4 ? 0.0f : 1.0f).alpha(z4 ? 0.0f : 1.0f).setInterpolator(prVar).setDuration(320L).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z4 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 11));
            this.n.addListener(new org.telegram.ui.Components.x20(17, this, z4));
            this.n.setInterpolator(prVar);
            this.n.setDuration(320L);
            this.n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            frameLayout2.setScaleX(!z4 ? 0.0f : 1.0f);
            frameLayout2.setScaleY(!z4 ? 0.0f : 1.0f);
            frameLayout2.setAlpha(!z4 ? 0.0f : 1.0f);
            frameLayout.setScaleX(z4 ? 0.0f : 1.0f);
            frameLayout.setScaleY(z4 ? 0.0f : 1.0f);
            frameLayout.setAlpha(z4 ? 0.0f : 1.0f);
            this.r = z4 ? 1.0f : 0.0f;
            int i10 = org.telegram.ui.ActionBar.k6.C6;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            int i11 = org.telegram.ui.ActionBar.k6.Oh;
            int d = i0.a.d(this.r, v02, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            p9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            p9Var2.invalidate();
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.r, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)), mode));
            p9Var.invalidate();
        }
        if (z4) {
            p9Var = p9Var2;
        }
        org.telegram.ui.Components.ij0 lottieAnimation = p9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            if (lottieAnimation.r() > (z4 ? 0.85f : 0.8f)) {
                lottieAnimation.Q(0.0f, false);
            }
            lottieAnimation.F(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
