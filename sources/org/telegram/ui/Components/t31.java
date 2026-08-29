package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t31 extends v41 {
    static {
        v41.setup(new t31());
    }

    public static w41 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, x80 x80Var, View.OnClickListener onClickListener2) {
        w41 J = w41.J(t31.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = x80Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        u31 u31Var = (u31) view;
        CharSequence charSequence = w41Var.l;
        boolean z11 = w41Var.f;
        View.OnClickListener onClickListener = w41Var.D;
        Object obj = w41Var.G;
        x80 x80Var = obj != null ? (x80) obj : null;
        boolean z12 = w41Var.t;
        View.OnClickListener onClickListener2 = w41Var.E;
        ImageView imageView = u31Var.n;
        TextView textView = u31Var.d;
        r31 r31Var = u31Var.c;
        s31 s31Var = u31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : y5.cloneSpans(charSequence));
        d90[] d90VarArr = (d90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), d90.class);
        if (d90VarArr != null) {
            int i10 = 0;
            while (i10 < d90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(d90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(d90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(d90VarArr[i10]);
                int i11 = i10;
                d90 d90Var = d90VarArr[i11];
                d90 d90Var2 = new d90(s31Var, d90Var.a, d90Var.d, null);
                d90 d90Var3 = d90VarArr[i11];
                d90Var2.f = d90Var3.f;
                d90Var2.h = d90Var3.h;
                d90Var2.n = d90Var3.n;
                spannableStringBuilder.setSpan(d90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!u31Var.h || z11) {
            r31Var.setVisibility(z11 ? 0 : 8);
            s31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            r31Var.setVisibility(0);
            s31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r31Var.animate().alpha(0.0f).withEndAction(new fq0(u31Var, 23));
            TimeInterpolator timeInterpolator = jr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        u31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        u31Var.setClipChildren(z11);
        r31Var.setText(spannableStringBuilder);
        s31Var.setText(spannableStringBuilder);
        s31Var.setTextIsSelectable(!z14 && (d90VarArr == null || d90VarArr.length == 0));
        s31Var.setOnLinkPressListener(x80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        u31Var.b = z10;
        u31Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return TextUtils.equals(w41Var.l, w41Var2.l) && w41Var.f == w41Var2.f;
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u31(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
