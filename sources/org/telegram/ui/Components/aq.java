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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class aq extends FrameLayout {
    public final TextView[] a;
    public final xj0[] b;
    public final ImageView c;
    public AnimatorSet d;
    public pg e;
    public float f;
    public final org.telegram.ui.ActionBar.d6 h;

    public aq(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.a = new TextView[2];
        this.b = new xj0[2];
        this.h = d6Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.qf, d6Var)));
        int i10 = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 6.0f, -2, 51));
        while (i10 < 2) {
            this.b[i10] = new xj0(activity);
            this.b[i10].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.b[i10], w7.z5.a(24.0f, 0.0f, i10 == 0 ? 0.0f : 24.0f, 0.0f, 0.0f, 24, 51));
            this.a[i10] = new TextView(activity);
            this.a[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pf, this.h));
            this.a[i10].setTextSize(1, 14.0f);
            this.a[i10].setMaxLines(1);
            this.a[i10].setSingleLine(true);
            this.a[i10].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.a[i10].setGravity(51);
            this.a[i10].setPivotX(0.0f);
            frameLayout.addView(this.a[i10], w7.z5.a(-2.0f, 32.0f, i10 == 0 ? 2.0f : 26.0f, 10.0f, 0.0f, -2, 51));
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
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.qf, this.h), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 14, 83));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        pg pgVar = this.e;
        if (pgVar != null) {
            AndroidUtilities.cancelRunOnUIThread(pgVar);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<aq, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<aq, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<aq, Float>) View.SCALE_Y, 0.0f));
        this.d.addListener(new zp(this, 1));
        this.d.setDuration(180L);
        this.d.start();
    }

    public float getBaseTranslationY() {
        return this.f;
    }
}
