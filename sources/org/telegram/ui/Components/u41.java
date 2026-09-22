package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u41 extends x51 {
    static {
        x51.setup(new u41());
    }

    public static y51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, m90 m90Var, View.OnClickListener onClickListener2) {
        y51 J = y51.J(u41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = m90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        v41 v41Var = (v41) view;
        CharSequence charSequence = y51Var.l;
        boolean z11 = y51Var.f;
        View.OnClickListener onClickListener = y51Var.D;
        Object obj = y51Var.G;
        m90 m90Var = obj != null ? (m90) obj : null;
        boolean z12 = y51Var.t;
        View.OnClickListener onClickListener2 = y51Var.E;
        ImageView imageView = v41Var.n;
        TextView textView = v41Var.d;
        s41 s41Var = v41Var.c;
        t41 t41Var = v41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : y5.cloneSpans(charSequence));
        s90[] s90VarArr = (s90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s90.class);
        if (s90VarArr != null) {
            int i10 = 0;
            while (i10 < s90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(s90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(s90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(s90VarArr[i10]);
                int i11 = i10;
                s90 s90Var = s90VarArr[i11];
                s90 s90Var2 = new s90(t41Var, s90Var.a, s90Var.d, null);
                s90 s90Var3 = s90VarArr[i11];
                s90Var2.f = s90Var3.f;
                s90Var2.h = s90Var3.h;
                s90Var2.n = s90Var3.n;
                spannableStringBuilder.setSpan(s90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!v41Var.h || z11) {
            s41Var.setVisibility(z11 ? 0 : 8);
            t41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            s41Var.setVisibility(0);
            t41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = s41Var.animate().alpha(0.0f).withEndAction(new yq0(v41Var, 24));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            t41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        v41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        v41Var.setClipChildren(z11);
        s41Var.setText(spannableStringBuilder);
        t41Var.setText(spannableStringBuilder);
        t41Var.setTextIsSelectable(!z14 && (s90VarArr == null || s90VarArr.length == 0));
        t41Var.setOnLinkPressListener(m90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        v41Var.b = z10;
        v41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return TextUtils.equals(y51Var.l, y51Var2.l) && y51Var.f == y51Var2.f;
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.d == y51Var2.d;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
