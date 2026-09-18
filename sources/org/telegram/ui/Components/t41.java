package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class t41 extends w51 {
    static {
        w51.setup(new t41());
    }

    public static x51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, k90 k90Var, View.OnClickListener onClickListener2) {
        x51 J = x51.J(t41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = k90Var;
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
        k90 k90Var = obj != null ? (k90) obj : null;
        boolean z12 = x51Var.t;
        View.OnClickListener onClickListener2 = x51Var.E;
        ImageView imageView = u41Var.n;
        TextView textView = u41Var.d;
        r41 r41Var = u41Var.c;
        s41 s41Var = u41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        q90[] q90VarArr = (q90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q90.class);
        if (q90VarArr != null) {
            int i10 = 0;
            while (i10 < q90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(q90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(q90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(q90VarArr[i10]);
                int i11 = i10;
                q90 q90Var = q90VarArr[i11];
                q90 q90Var2 = new q90(s41Var, q90Var.a, q90Var.d, null);
                q90 q90Var3 = q90VarArr[i11];
                q90Var2.f = q90Var3.f;
                q90Var2.h = q90Var3.h;
                q90Var2.n = q90Var3.n;
                spannableStringBuilder.setSpan(q90Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = r41Var.animate().alpha(0.0f).withEndAction(new xq0(u41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        u41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        u41Var.setClipChildren(z11);
        r41Var.setText(spannableStringBuilder);
        s41Var.setText(spannableStringBuilder);
        s41Var.setTextIsSelectable(!z14 && (q90VarArr == null || q90VarArr.length == 0));
        s41Var.setOnLinkPressListener(k90Var);
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
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u41(context, e6Var);
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
