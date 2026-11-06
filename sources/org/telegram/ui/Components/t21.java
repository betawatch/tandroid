package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t21 extends w31 {
    static {
        w31.h(new t21());
    }

    public static x31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, v70 v70Var, View.OnClickListener onClickListener2) {
        x31 K = x31.K(t21.class);
        K.d = i7;
        K.l = charSequence;
        K.f = z9;
        K.t = false;
        K.D = onClickListener;
        K.G = v70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        u21 u21Var = (u21) view;
        CharSequence charSequence = x31Var.l;
        boolean z10 = x31Var.f;
        View.OnClickListener onClickListener = x31Var.D;
        Object obj = x31Var.G;
        v70 v70Var = obj != null ? (v70) obj : null;
        boolean z11 = x31Var.t;
        View.OnClickListener onClickListener2 = x31Var.E;
        ImageView imageView = u21Var.n;
        TextView textView = u21Var.d;
        r21 r21Var = u21Var.c;
        s21 s21Var = u21Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : r5.cloneSpans(charSequence));
        b80[] b80VarArr = (b80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b80.class);
        if (b80VarArr != null) {
            int i7 = 0;
            while (i7 < b80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(b80VarArr[i7]);
                int spanEnd = spannableStringBuilder.getSpanEnd(b80VarArr[i7]);
                boolean z12 = z11;
                spannableStringBuilder.removeSpan(b80VarArr[i7]);
                int i10 = i7;
                b80 b80Var = b80VarArr[i10];
                b80 b80Var2 = new b80(s21Var, b80Var.a, b80Var.d, null);
                b80 b80Var3 = b80VarArr[i10];
                b80Var2.f = b80Var3.f;
                b80Var2.h = b80Var3.h;
                b80Var2.n = b80Var3.n;
                spannableStringBuilder.setSpan(b80Var2, spanStart, spanEnd, 33);
                i7 = i10 + 1;
                z11 = z12;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z13 = z11;
        if (!u21Var.h || z10) {
            r21Var.setVisibility(z10 ? 0 : 8);
            s21Var.setVisibility(!z10 ? 0 : 8);
        } else {
            r21Var.setVisibility(0);
            s21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = r21Var.animate().alpha(0.0f).withEndAction(new ir0(u21Var, 22));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            s21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        u21Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        u21Var.setClipChildren(z10);
        r21Var.setText(spannableStringBuilder);
        s21Var.setText(spannableStringBuilder);
        s21Var.setTextIsSelectable(!z13 && (b80VarArr == null || b80VarArr.length == 0));
        s21Var.setOnLinkPressListener(v70Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        u21Var.b = z9;
        u21Var.setWillNotDraw(true ^ z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return TextUtils.equals(x31Var.l, x31Var2.l) && x31Var.f == x31Var2.f;
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new u21(context, f6Var);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.d == x31Var2.d;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
