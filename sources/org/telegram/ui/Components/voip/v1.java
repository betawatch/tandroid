package org.telegram.ui.Components.voip;

import ag.x2;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 extends FrameLayout {
    public TextView[] a;
    public TextView b;
    public FrameLayout c;
    public z1 d;
    public CharSequence e;
    public boolean f;
    public ValueAnimator h;
    public boolean n;

    public final void a(View view, View view2, Runnable runnable) {
        view.setVisibility(0);
        view2.setVisibility(0);
        view2.setTranslationY(org.telegram.messenger.i0.L(15.0f));
        view2.setAlpha(0.0f);
        this.f = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ag.p2(18, view2, view));
        this.h.addListener(new ci.i((Object) this, (Object) view, (Object) view2, (Object) runnable, 3));
        this.h.setDuration(250L).setInterpolator(gr.f);
        this.h.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, boolean z10, boolean z11) {
        View view = this.d;
        TextView[] textViewArr = this.a;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            SpannableString spannableString = new SpannableString(".");
            spannableString.setSpan(new x2(textViewArr), 0, 1, 33);
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
            a(textViewArr[0], textViewArr[1], new w5(this, 8));
        }
    }

    public final void c(boolean z10) {
        FrameLayout frameLayout = this.c;
        if (!z10) {
            if (frameLayout.getVisibility() == 8) {
                return;
            }
            frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setInterpolator(gr.f).setListener(new u1(this, 1)).setDuration(300L).start();
        } else {
            if (frameLayout.getVisibility() == 0) {
                return;
            }
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(0.0f);
            frameLayout.setScaleY(0.6f);
            frameLayout.setScaleX(0.6f);
            frameLayout.animate().setListener(null).cancel();
            z20.m(frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), gr.k, 300L);
        }
    }

    public final void d(boolean z10, boolean z11) {
        TextView textView = this.b;
        if (!z11) {
            textView.animate().setListener(null).cancel();
            textView.setVisibility(z10 ? 0 : 8);
        } else {
            if (!z10) {
                textView.animate().alpha(0.0f).setListener(new u1(this, 0)).setDuration(150L).start();
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
        z1 z1Var = this.d;
        TextView[] textViewArr = this.a;
        if (TextUtils.isEmpty(textViewArr[0].getText())) {
            z10 = false;
        }
        if (this.n) {
            return;
        }
        z1Var.a();
        if (z10) {
            if (this.f) {
                this.e = "timer";
                return;
            } else {
                this.n = true;
                a(textViewArr[0], z1Var, null);
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
        z1Var.setVisibility(0);
    }

    public void setSignalBarCount(int i10) {
        this.d.setSignalBarCount(i10);
    }
}
