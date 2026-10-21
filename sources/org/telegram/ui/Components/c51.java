package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class c51 extends g61 {
    static {
        g61.setup(new c51());
    }

    public static h61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        h61 J = h61.J(c51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        d51 d51Var = (d51) view;
        CharSequence charSequence = h61Var.l;
        boolean z11 = h61Var.f;
        View.OnClickListener onClickListener = h61Var.D;
        Object obj = h61Var.G;
        w90 w90Var = obj != null ? (w90) obj : null;
        boolean z12 = h61Var.t;
        View.OnClickListener onClickListener2 = h61Var.E;
        ImageView imageView = d51Var.n;
        TextView textView = d51Var.d;
        a51 a51Var = d51Var.c;
        b51 b51Var = d51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : a6.cloneSpans(charSequence));
        ca0[] ca0VarArr = (ca0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ca0.class);
        if (ca0VarArr != null) {
            int i10 = 0;
            while (i10 < ca0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ca0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ca0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(ca0VarArr[i10]);
                int i11 = i10;
                ca0 ca0Var = ca0VarArr[i11];
                ca0 ca0Var2 = new ca0(b51Var, ca0Var.a, ca0Var.d, null);
                ca0 ca0Var3 = ca0VarArr[i11];
                ca0Var2.f = ca0Var3.f;
                ca0Var2.h = ca0Var3.h;
                ca0Var2.n = ca0Var3.n;
                spannableStringBuilder.setSpan(ca0Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = a51Var.animate().alpha(0.0f).withEndAction(new hr0(d51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            b51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        d51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        d51Var.setClipChildren(z11);
        a51Var.setText(spannableStringBuilder);
        b51Var.setText(spannableStringBuilder);
        b51Var.setTextIsSelectable(!z14 && (ca0VarArr == null || ca0VarArr.length == 0));
        b51Var.setOnLinkPressListener(w90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        d51Var.b = z10;
        d51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(h61Var.l, h61Var2.l) && h61Var.f == h61Var2.f;
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new d51(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.d == h61Var2.d;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
