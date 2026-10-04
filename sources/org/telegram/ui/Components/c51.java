package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class c51 extends f61 {
    static {
        f61.setup(new c51());
    }

    public static g61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, p90 p90Var, View.OnClickListener onClickListener2) {
        g61 J = g61.J(c51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = p90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        d51 d51Var = (d51) view;
        CharSequence charSequence = g61Var.l;
        boolean z11 = g61Var.f;
        View.OnClickListener onClickListener = g61Var.D;
        Object obj = g61Var.G;
        p90 p90Var = obj != null ? (p90) obj : null;
        boolean z12 = g61Var.t;
        View.OnClickListener onClickListener2 = g61Var.E;
        ImageView imageView = d51Var.n;
        TextView textView = d51Var.d;
        a51 a51Var = d51Var.c;
        b51 b51Var = d51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        v90[] v90VarArr = (v90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), v90.class);
        if (v90VarArr != null) {
            int i10 = 0;
            while (i10 < v90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(v90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(v90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(v90VarArr[i10]);
                int i11 = i10;
                v90 v90Var = v90VarArr[i11];
                v90 v90Var2 = new v90(b51Var, v90Var.a, v90Var.d, null);
                v90 v90Var3 = v90VarArr[i11];
                v90Var2.f = v90Var3.f;
                v90Var2.h = v90Var3.h;
                v90Var2.n = v90Var3.n;
                spannableStringBuilder.setSpan(v90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!d51Var.h || z11) {
            a51Var.setVisibility(z11 ? 0 : 8);
            b51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            a51Var.setVisibility(0);
            b51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = a51Var.animate().alpha(0.0f).withEndAction(new br0(d51Var, 25));
            TimeInterpolator timeInterpolator = tr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            b51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        d51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        d51Var.setClipChildren(z11);
        a51Var.setText(spannableStringBuilder);
        b51Var.setText(spannableStringBuilder);
        b51Var.setTextIsSelectable(!z14 && (v90VarArr == null || v90VarArr.length == 0));
        b51Var.setOnLinkPressListener(p90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        d51Var.b = z10;
        d51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return TextUtils.equals(g61Var.l, g61Var2.l) && g61Var.f == g61Var2.f;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d51(context, d6Var);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        return g61Var.d == g61Var2.d;
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean isClickable() {
        return false;
    }
}
