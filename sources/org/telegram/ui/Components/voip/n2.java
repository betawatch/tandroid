package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n2 extends FrameLayout {
    public TextView[] a;
    public TextView b;
    public FrameLayout c;
    public r2 d;
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
        ofFloat.addUpdateListener(new ah.m0(19, view2, view));
        this.h.addListener(new hg.k0((FrameLayout) this, view, view2, (Object) runnable, 4));
        this.h.setDuration(250L).setInterpolator(pr.f);
        this.h.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        TextView[] textViewArr = this.a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new ig.w1(textViewArr), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            str = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z11 = false;
        }
        if (!z11) {
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
            a(textViewArr[0], textViewArr[1], new ig.t0(this, 26));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.c;
        if (!z10) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(pr.f).setListener(new m2(this, 1)).setDuration(300L).start();
        } else {
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            wl.q(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), pr.k, 300L);
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.b;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z10 ? 0 : 8);
        } else {
            if (!z10) {
                textView.animate().alpha(0.0f).setListener(new m2(this, 0)).setDuration(150L).start();
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

    public final void e(boolean z10) {
        r2 r2Var = this.d;
        TextView[] textViewArr = this.a;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z10 = false;
        }
        if (this.n) {
            return;
        }
        r2Var.a();
        if (z10) {
            if (this.f) {
                this.e = "timer";
                return;
            } else {
                this.n = true;
                a(textViewArr[0], r2Var, null);
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
        r2Var.setVisibility(0);
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}
