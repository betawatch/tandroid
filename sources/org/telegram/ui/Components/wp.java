package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wp extends FrameLayout {
    public final TextView[] a;
    public final kj0[] b;
    public final ImageView c;
    public AnimatorSet d;
    public rg e;
    public float f;
    public final org.telegram.ui.ActionBar.f6 h;

    public wp(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = new TextView[2];
        this.b = new kj0[2];
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.qf, f6Var)));
        int i10 = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, w7.a6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i10 < 2) {
            this.b[i10] = new kj0(activity);
            this.b[i10].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.b[i10], w7.a6.d(24, 24.0f, 51, 0.0f, i10 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.a[i10] = new TextView(activity);
            this.a[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pf, this.h));
            this.a[i10].setTextSize(1, 14.0f);
            this.a[i10].setMaxLines(1);
            this.a[i10].setSingleLine(true);
            this.a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.a[i10].setGravity(51);
            this.a[i10].setPivotX(0.0f);
            frameLayout.addView(this.a[i10], w7.a6.d(-2, -2.0f, 51, 32.0f, i10 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i10 == 0) {
                this.b[i10].f(R.raw.ticks_single, 24, 24, null);
                this.a[i10].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.b[i10].f(R.raw.ticks_double, 24, 24, null);
                this.a[i10].setText(LocaleController.getString(R.string.HintRead));
            }
            this.b[i10].d();
            i10++;
        }
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        rg rgVar = this.e;
        if (rgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rgVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<wp, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<wp, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<wp, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new vp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
