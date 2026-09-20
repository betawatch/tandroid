package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class s41 extends v51 {
    static {
        v51.setup(new s41());
    }

    public static w51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, j90 j90Var, View.OnClickListener onClickListener2) {
        w51 J = w51.J(s41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = j90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        t41 t41Var = (t41) view;
        CharSequence charSequence = w51Var.l;
        boolean z11 = w51Var.f;
        View.OnClickListener onClickListener = w51Var.D;
        Object obj = w51Var.G;
        j90 j90Var = obj != null ? (j90) obj : null;
        boolean z12 = w51Var.t;
        View.OnClickListener onClickListener2 = w51Var.E;
        ImageView imageView = t41Var.n;
        TextView textView = t41Var.d;
        q41 q41Var = t41Var.c;
        r41 r41Var = t41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : y5.cloneSpans(charSequence));
        p90[] p90VarArr = (p90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p90.class);
        if (p90VarArr != null) {
            int i10 = 0;
            while (i10 < p90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(p90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(p90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(p90VarArr[i10]);
                int i11 = i10;
                p90 p90Var = p90VarArr[i11];
                p90 p90Var2 = new p90(r41Var, p90Var.a, p90Var.d, null);
                p90 p90Var3 = p90VarArr[i11];
                p90Var2.f = p90Var3.f;
                p90Var2.h = p90Var3.h;
                p90Var2.n = p90Var3.n;
                spannableStringBuilder.setSpan(p90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!t41Var.h || z11) {
            q41Var.setVisibility(z11 ? 0 : 8);
            r41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            q41Var.setVisibility(0);
            r41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = q41Var.animate().alpha(0.0f).withEndAction(new wq0(t41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            r41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        t41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        t41Var.setClipChildren(z11);
        q41Var.setText(spannableStringBuilder);
        r41Var.setText(spannableStringBuilder);
        r41Var.setTextIsSelectable(!z14 && (p90VarArr == null || p90VarArr.length == 0));
        r41Var.setOnLinkPressListener(j90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        t41Var.b = z10;
        t41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return TextUtils.equals(w51Var.l, w51Var2.l) && w51Var.f == w51Var2.f;
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.d == w51Var2.d;
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
