package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i51 extends l61 {
    static {
        l61.setup(new i51());
    }

    public static m61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, x90 x90Var, View.OnClickListener onClickListener2) {
        m61 J = m61.J(i51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = x90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        j51 j51Var = (j51) view;
        CharSequence charSequence = m61Var.l;
        boolean z11 = m61Var.f;
        View.OnClickListener onClickListener = m61Var.D;
        Object obj = m61Var.G;
        x90 x90Var = obj != null ? (x90) obj : null;
        boolean z12 = m61Var.t;
        View.OnClickListener onClickListener2 = m61Var.E;
        ImageView imageView = j51Var.n;
        TextView textView = j51Var.d;
        g51 g51Var = j51Var.c;
        h51 h51Var = j51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : a6.cloneSpans(charSequence));
        da0[] da0VarArr = (da0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), da0.class);
        if (da0VarArr != null) {
            int i10 = 0;
            while (i10 < da0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(da0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(da0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(da0VarArr[i10]);
                int i11 = i10;
                da0 da0Var = da0VarArr[i11];
                da0 da0Var2 = new da0(h51Var, da0Var.a, da0Var.d, null);
                da0 da0Var3 = da0VarArr[i11];
                da0Var2.f = da0Var3.f;
                da0Var2.h = da0Var3.h;
                da0Var2.n = da0Var3.n;
                spannableStringBuilder.setSpan(da0Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!j51Var.h || z11) {
            g51Var.setVisibility(z11 ? 0 : 8);
            h51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            g51Var.setVisibility(0);
            h51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g51Var.animate().alpha(0.0f).withEndAction(new kr0(j51Var, 24));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        j51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        j51Var.setClipChildren(z11);
        g51Var.setText(spannableStringBuilder);
        h51Var.setText(spannableStringBuilder);
        h51Var.setTextIsSelectable(!z14 && (da0VarArr == null || da0VarArr.length == 0));
        h51Var.setOnLinkPressListener(x90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        j51Var.b = z10;
        j51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        return TextUtils.equals(m61Var.l, m61Var2.l) && m61Var.f == m61Var2.f;
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new j51(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        return m61Var.d == m61Var2.d;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
