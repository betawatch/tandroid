package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p2 extends FrameLayout {
    public TextView[] a;
    public TextView b;
    public FrameLayout c;
    public t2 d;
    public CharSequence e;
    public boolean f;
    public ValueAnimator h;
    public boolean n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(AndroidUtilities.dp(15.0f));
        view2.setAlpha(0.0f);
        this.f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ag.a(17, view2, view));
        this.h.addListener(new vs(this, view, view2, runnable, 2));
        this.h.setDuration(250L).setInterpolator(nr.f);
        this.h.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, boolean z4, boolean z10) {
        View view = this.d;
        TextView[] textViewArr = this.a;
        if (z4) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new org.telegram.ui.Components.a0(textViewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z10 = false;
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f = false;
            textViewArr[0].setText(str);
            textViewArr[0].setVisibility(0);
            textViewArr[1].setVisibility(8);
            view.setVisibility(8);
            return;
        }
        if (this.f) {
            this.e = str;
            return;
        }
        if (this.n) {
            textViewArr[0].setText(str);
            a(view, textViewArr[0], null);
        } else {
            if (textViewArr[0].getText().equals(str)) {
                return;
            }
            textViewArr[1].setText(str);
            a(textViewArr[0], textViewArr[1], new n5(this, 24));
        }
    }

    public final void c(boolean z4) {
        FrameLayout frameLayout = this.c;
        if (!z4) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(nr.f).setListener(new o2(this, 1)).setDuration(300L).start();
        } else {
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            org.telegram.ui.b.p(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), nr.k, 300L);
        }
    }

    public final void d(boolean z4, boolean z10) {
        TextView textView = this.b;
        if (!z10) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z4 ? 0 : 8);
        } else {
            if (!z4) {
                textView.animate().alpha(0.0f).setListener(new o2(this, 0)).setDuration(150L).start();
                return;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
            textView.animate().setListener(null).cancel();
            textView.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void e(boolean z4) {
        t2 t2Var = this.d;
        TextView[] textViewArr = this.a;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z4 = false;
        }
        if (this.n) {
            return;
        }
        t2Var.a();
        if (z4) {
            if (this.f) {
                this.e = "timer";
                return;
            } else {
                this.n = true;
                a(textViewArr[0], t2Var, null);
                return;
            }
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = true;
        this.f = false;
        textViewArr[0].setVisibility(8);
        textViewArr[1].setVisibility(8);
        t2Var.setVisibility(0);
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}
