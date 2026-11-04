package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o21 extends q31 {
    static {
        q31.h(new o21());
    }

    public static r31 i(int i3, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, r70 r70Var, View.OnClickListener onClickListener2) {
        r31 K = r31.K(o21.class);
        K.d = i3;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = r70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        p21 p21Var = (p21) view;
        CharSequence charSequence = r31Var.l;
        boolean z11 = r31Var.f;
        View.OnClickListener onClickListener = r31Var.D;
        Object obj = r31Var.G;
        r70 r70Var = obj != null ? (r70) obj : null;
        boolean z12 = r31Var.t;
        View.OnClickListener onClickListener2 = r31Var.E;
        ImageView imageView = p21Var.n;
        TextView textView = p21Var.d;
        m21 m21Var = p21Var.c;
        n21 n21Var = p21Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : p5.cloneSpans(charSequence));
        x70[] x70VarArr = (x70[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x70.class);
        if (x70VarArr != null) {
            int i3 = 0;
            while (i3 < x70VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(x70VarArr[i3]);
                int spanEnd = spannableStringBuilder.getSpanEnd(x70VarArr[i3]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(x70VarArr[i3]);
                int i10 = i3;
                x70 x70Var = x70VarArr[i10];
                x70 x70Var2 = new x70(n21Var, x70Var.a, x70Var.d, null);
                x70 x70Var3 = x70VarArr[i10];
                x70Var2.f = x70Var3.f;
                x70Var2.h = x70Var3.h;
                x70Var2.n = x70Var3.n;
                spannableStringBuilder.setSpan(x70Var2, spanStart, spanEnd, 33);
                i3 = i10 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!p21Var.h || z11) {
            m21Var.setVisibility(z11 ? 0 : 8);
            n21Var.setVisibility(!z11 ? 0 : 8);
        } else {
            m21Var.setVisibility(0);
            n21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = m21Var.animate().alpha(0.0f).withEndAction(new sp0(p21Var, 23));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            n21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        p21Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        p21Var.setClipChildren(z11);
        m21Var.setText(spannableStringBuilder);
        n21Var.setText(spannableStringBuilder);
        n21Var.setTextIsSelectable(!z14 && (x70VarArr == null || x70VarArr.length == 0));
        n21Var.setOnLinkPressListener(r70Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        p21Var.b = z10;
        p21Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(r31Var.l, r31Var2.l) && r31Var.f == r31Var2.f;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p21(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.d == r31Var2.d;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
