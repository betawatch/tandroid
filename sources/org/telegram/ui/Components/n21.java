package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n21 extends q31 {
    static {
        q31.h(new n21());
    }

    public static r31 i(int i7, CharSequence charSequence, boolean z9, View.OnClickListener onClickListener, v70 v70Var, View.OnClickListener onClickListener2) {
        r31 K = r31.K(n21.class);
        K.d = i7;
        K.l = charSequence;
        K.f = z9;
        K.t = false;
        K.D = onClickListener;
        K.G = v70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        o21 o21Var = (o21) view;
        CharSequence charSequence = r31Var.l;
        boolean z10 = r31Var.f;
        View.OnClickListener onClickListener = r31Var.D;
        Object obj = r31Var.G;
        v70 v70Var = obj != null ? (v70) obj : null;
        boolean z11 = r31Var.t;
        View.OnClickListener onClickListener2 = r31Var.E;
        ImageView imageView = o21Var.n;
        TextView textView = o21Var.d;
        l21 l21Var = o21Var.c;
        m21 m21Var = o21Var.f;
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
                b80 b80Var2 = new b80(m21Var, b80Var.a, b80Var.d, null);
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
        if (!o21Var.h || z10) {
            l21Var.setVisibility(z10 ? 0 : 8);
            m21Var.setVisibility(!z10 ? 0 : 8);
        } else {
            l21Var.setVisibility(0);
            m21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = l21Var.animate().alpha(0.0f).withEndAction(new ir0(o21Var, 21));
            TimeInterpolator timeInterpolator = xq.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            m21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        o21Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        o21Var.setClipChildren(z10);
        l21Var.setText(spannableStringBuilder);
        m21Var.setText(spannableStringBuilder);
        m21Var.setTextIsSelectable(!z13 && (b80VarArr == null || b80VarArr.length == 0));
        m21Var.setOnLinkPressListener(v70Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        o21Var.b = z9;
        o21Var.setWillNotDraw(true ^ z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return TextUtils.equals(r31Var.l, r31Var2.l) && r31Var.f == r31Var2.f;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o21(context, f6Var);
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
