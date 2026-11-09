package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u21 extends x31 {
    static {
        x31.h(new u21());
    }

    public static y31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, w70 w70Var, View.OnClickListener onClickListener2) {
        y31 K = y31.K(u21.class);
        K.d = i7;
        K.l = charSequence;
        K.f = z9;
        K.t = false;
        K.D = onClickListener;
        K.G = w70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v21 v21Var = (v21) view;
        CharSequence charSequence = y31Var.l;
        boolean z10 = y31Var.f;
        View.OnClickListener onClickListener = y31Var.D;
        Object obj = y31Var.G;
        w70 w70Var = obj != null ? (w70) obj : null;
        boolean z11 = y31Var.t;
        View.OnClickListener onClickListener2 = y31Var.E;
        ImageView imageView = v21Var.n;
        TextView textView = v21Var.d;
        s21 s21Var = v21Var.c;
        t21 t21Var = v21Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : r5.cloneSpans(charSequence));
        c80[] c80VarArr = (c80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c80.class);
        if (c80VarArr != null) {
            int i7 = 0;
            while (i7 < c80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(c80VarArr[i7]);
                int spanEnd = spannableStringBuilder.getSpanEnd(c80VarArr[i7]);
                boolean z12 = z11;
                spannableStringBuilder.removeSpan(c80VarArr[i7]);
                int i10 = i7;
                c80 c80Var = c80VarArr[i10];
                c80 c80Var2 = new c80(t21Var, c80Var.a, c80Var.d, null);
                c80 c80Var3 = c80VarArr[i10];
                c80Var2.f = c80Var3.f;
                c80Var2.h = c80Var3.h;
                c80Var2.n = c80Var3.n;
                spannableStringBuilder.setSpan(c80Var2, spanStart, spanEnd, 33);
                i7 = i10 + 1;
                z11 = z12;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z13 = z11;
        if (!v21Var.h || z10) {
            s21Var.setVisibility(z10 ? 0 : 8);
            t21Var.setVisibility(!z10 ? 0 : 8);
        } else {
            s21Var.setVisibility(0);
            t21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = s21Var.animate().alpha(0.0f).withEndAction(new kr0(v21Var, 22));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            t21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        v21Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        v21Var.setClipChildren(z10);
        s21Var.setText(spannableStringBuilder);
        t21Var.setText(spannableStringBuilder);
        t21Var.setTextIsSelectable(!z13 && (c80VarArr == null || c80VarArr.length == 0));
        t21Var.setOnLinkPressListener(w70Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        v21Var.b = z9;
        v21Var.setWillNotDraw(true ^ z9);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return TextUtils.equals(y31Var.l, y31Var2.l) && y31Var.f == y31Var2.f;
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new v21(context, g6Var);
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.d == y31Var2.d;
    }

    @Override // org.telegram.ui.Components.x31
    public final boolean f() {
        return false;
    }
}
