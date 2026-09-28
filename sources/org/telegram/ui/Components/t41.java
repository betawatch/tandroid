package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class t41 extends w51 {
    static {
        w51.setup(new t41());
    }

    public static x51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o90 o90Var, View.OnClickListener onClickListener2) {
        x51 J = x51.J(t41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = o90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        u41 u41Var = (u41) view;
        CharSequence charSequence = x51Var.l;
        boolean z11 = x51Var.f;
        View.OnClickListener onClickListener = x51Var.D;
        Object obj = x51Var.G;
        o90 o90Var = obj != null ? (o90) obj : null;
        boolean z12 = x51Var.t;
        View.OnClickListener onClickListener2 = x51Var.E;
        ImageView imageView = u41Var.n;
        TextView textView = u41Var.d;
        r41 r41Var = u41Var.c;
        s41 s41Var = u41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        u90[] u90VarArr = (u90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u90.class);
        if (u90VarArr != null) {
            int i10 = 0;
            while (i10 < u90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(u90VarArr[i10]);
                int i11 = i10;
                u90 u90Var = u90VarArr[i11];
                u90 u90Var2 = new u90(s41Var, u90Var.a, u90Var.d, null);
                u90 u90Var3 = u90VarArr[i11];
                u90Var2.f = u90Var3.f;
                u90Var2.h = u90Var3.h;
                u90Var2.n = u90Var3.n;
                spannableStringBuilder.setSpan(u90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!u41Var.h || z11) {
            r41Var.setVisibility(z11 ? 0 : 8);
            s41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            r41Var.setVisibility(0);
            s41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r41Var.animate().alpha(0.0f).withEndAction(new yq0(u41Var, 24));
            TimeInterpolator timeInterpolator = sr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        u41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        u41Var.setClipChildren(z11);
        r41Var.setText(spannableStringBuilder);
        s41Var.setText(spannableStringBuilder);
        s41Var.setTextIsSelectable(!z14 && (u90VarArr == null || u90VarArr.length == 0));
        s41Var.setOnLinkPressListener(o90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        u41Var.b = z10;
        u41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return TextUtils.equals(x51Var.l, x51Var2.l) && x51Var.f == x51Var2.f;
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new u41(context, d6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.d == x51Var2.d;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
