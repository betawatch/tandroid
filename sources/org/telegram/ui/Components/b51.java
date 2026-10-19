package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class b51 extends f61 {
    static {
        f61.setup(new b51());
    }

    public static g61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        g61 J = g61.J(b51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        c51 c51Var = (c51) view;
        CharSequence charSequence = g61Var.l;
        boolean z11 = g61Var.f;
        View.OnClickListener onClickListener = g61Var.D;
        Object obj = g61Var.G;
        w90 w90Var = obj != null ? (w90) obj : null;
        boolean z12 = g61Var.t;
        View.OnClickListener onClickListener2 = g61Var.E;
        ImageView imageView = c51Var.n;
        TextView textView = c51Var.d;
        z41 z41Var = c51Var.c;
        a51 a51Var = c51Var.f;
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
                ca0 ca0Var2 = new ca0(a51Var, ca0Var.a, ca0Var.d, null);
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
        if (!c51Var.h || z11) {
            z41Var.setVisibility(z11 ? 0 : 8);
            a51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            z41Var.setVisibility(0);
            a51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = z41Var.animate().alpha(0.0f).withEndAction(new gr0(c51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            a51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        c51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        c51Var.setClipChildren(z11);
        z41Var.setText(spannableStringBuilder);
        a51Var.setText(spannableStringBuilder);
        a51Var.setTextIsSelectable(!z14 && (ca0VarArr == null || ca0VarArr.length == 0));
        a51Var.setOnLinkPressListener(w90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        c51Var.b = z10;
        c51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.f61
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        return TextUtils.equals(g61Var.l, g61Var2.l) && g61Var.f == g61Var2.f;
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c51(context, d6Var);
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
