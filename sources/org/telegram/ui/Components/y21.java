package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y21 extends a41 {
    static {
        a41.h(new y21());
    }

    public static b41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, y70 y70Var, View.OnClickListener onClickListener2) {
        b41 K = b41.K(y21.class);
        K.d = i7;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = y70Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        z21 z21Var = (z21) view;
        CharSequence charSequence = b41Var.l;
        boolean z11 = b41Var.f;
        View.OnClickListener onClickListener = b41Var.D;
        Object obj = b41Var.G;
        y70 y70Var = obj != null ? (y70) obj : null;
        boolean z12 = b41Var.t;
        View.OnClickListener onClickListener2 = b41Var.E;
        ImageView imageView = z21Var.n;
        TextView textView = z21Var.d;
        w21 w21Var = z21Var.c;
        x21 x21Var = z21Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : p5.cloneSpans(charSequence));
        e80[] e80VarArr = (e80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), e80.class);
        if (e80VarArr != null) {
            int i7 = 0;
            while (i7 < e80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(e80VarArr[i7]);
                int spanEnd = spannableStringBuilder.getSpanEnd(e80VarArr[i7]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(e80VarArr[i7]);
                int i10 = i7;
                e80 e80Var = e80VarArr[i10];
                e80 e80Var2 = new e80(x21Var, e80Var.a, e80Var.d, null);
                e80 e80Var3 = e80VarArr[i10];
                e80Var2.f = e80Var3.f;
                e80Var2.h = e80Var3.h;
                e80Var2.n = e80Var3.n;
                spannableStringBuilder.setSpan(e80Var2, spanStart, spanEnd, 33);
                i7 = i10 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!z21Var.h || z11) {
            w21Var.setVisibility(z11 ? 0 : 8);
            x21Var.setVisibility(!z11 ? 0 : 8);
        } else {
            w21Var.setVisibility(0);
            x21Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = w21Var.animate().alpha(0.0f).withEndAction(new ro0(z21Var, 25));
            TimeInterpolator timeInterpolator = er.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            x21Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        z21Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        z21Var.setClipChildren(z11);
        w21Var.setText(spannableStringBuilder);
        x21Var.setText(spannableStringBuilder);
        x21Var.setTextIsSelectable(!z14 && (e80VarArr == null || e80VarArr.length == 0));
        x21Var.setOnLinkPressListener(y70Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        z21Var.b = z10;
        z21Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        return TextUtils.equals(b41Var.l, b41Var2.l) && b41Var.f == b41Var2.f;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new z21(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        return b41Var.d == b41Var2.d;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
