package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g51 extends k61 {
    static {
        k61.setup(new g51());
    }

    public static l61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, ca0 ca0Var, View.OnClickListener onClickListener2) {
        l61 J = l61.J(g51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = ca0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        h51 h51Var = (h51) view;
        CharSequence charSequence = l61Var.l;
        boolean z11 = l61Var.f;
        View.OnClickListener onClickListener = l61Var.D;
        Object obj = l61Var.G;
        ca0 ca0Var = obj != null ? (ca0) obj : null;
        boolean z12 = l61Var.t;
        View.OnClickListener onClickListener2 = l61Var.E;
        ImageView imageView = h51Var.n;
        TextView textView = h51Var.d;
        e51 e51Var = h51Var.c;
        f51 f51Var = h51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : b6.cloneSpans(charSequence));
        ia0[] ia0VarArr = (ia0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ia0.class);
        if (ia0VarArr != null) {
            int i10 = 0;
            while (i10 < ia0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ia0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ia0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(ia0VarArr[i10]);
                int i11 = i10;
                ia0 ia0Var = ia0VarArr[i11];
                ia0 ia0Var2 = new ia0(f51Var, ia0Var.a, ia0Var.d, null);
                ia0 ia0Var3 = ia0VarArr[i11];
                ia0Var2.f = ia0Var3.f;
                ia0Var2.h = ia0Var3.h;
                ia0Var2.n = ia0Var3.n;
                spannableStringBuilder.setSpan(ia0Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!h51Var.h || z11) {
            e51Var.setVisibility(z11 ? 0 : 8);
            f51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            e51Var.setVisibility(0);
            f51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = e51Var.animate().alpha(0.0f).withEndAction(new lr0(h51Var, 24));
            TimeInterpolator timeInterpolator = es.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            f51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        h51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        h51Var.setClipChildren(z11);
        e51Var.setText(spannableStringBuilder);
        f51Var.setText(spannableStringBuilder);
        f51Var.setTextIsSelectable(!z14 && (ia0VarArr == null || ia0VarArr.length == 0));
        f51Var.setOnLinkPressListener(ca0Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        h51Var.b = z10;
        h51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        return TextUtils.equals(l61Var.l, l61Var2.l) && l61Var.f == l61Var2.f;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h51(context, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        return l61Var.d == l61Var2.d;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean isClickable() {
        return false;
    }
}
