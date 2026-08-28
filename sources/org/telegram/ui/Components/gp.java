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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gp extends FrameLayout {
    public final TextView[] a;
    public final pi0[] b;
    public final ImageView c;
    public AnimatorSet d;
    public fg e;
    public float f;
    public final org.telegram.ui.ActionBar.b6 h;

    public gp(Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.a = new TextView[2];
        this.b = new pi0[2];
        this.h = b6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.qf, b6Var)));
        int i9 = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i9 < 2) {
            this.b[i9] = new pi0(activity);
            this.b[i9].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.b[i9], g7.e6.d(24, 24.0f, 51, 0.0f, i9 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.a[i9] = new TextView(activity);
            this.a[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pf, this.h));
            this.a[i9].setTextSize(1, 14.0f);
            this.a[i9].setMaxLines(1);
            this.a[i9].setSingleLine(true);
            this.a[i9].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.a[i9].setGravity(51);
            this.a[i9].setPivotX(0.0f);
            frameLayout.addView(this.a[i9], g7.e6.d(-2, -2.0f, 51, 32.0f, i9 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i9 == 0) {
                this.b[i9].f(R.raw.ticks_single, 24, 24, null);
                this.a[i9].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.b[i9].f(R.raw.ticks_double, 24, 24, null);
                this.a[i9].setText(LocaleController.getString(R.string.HintRead));
            }
            this.b[i9].d();
            i9++;
        }
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        fg fgVar = this.e;
        if (fgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fgVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<gp, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<gp, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<gp, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new fp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
