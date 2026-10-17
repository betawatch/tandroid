package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class a51 extends e61 {
    static {
        e61.setup(new a51());
    }

    public static f61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, w90 w90Var, View.OnClickListener onClickListener2) {
        f61 J = f61.J(a51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = w90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        b51 b51Var = (b51) view;
        CharSequence charSequence = f61Var.l;
        boolean z11 = f61Var.f;
        View.OnClickListener onClickListener = f61Var.D;
        Object obj = f61Var.G;
        w90 w90Var = obj != null ? (w90) obj : null;
        boolean z12 = f61Var.t;
        View.OnClickListener onClickListener2 = f61Var.E;
        ImageView imageView = b51Var.n;
        TextView textView = b51Var.d;
        y41 y41Var = b51Var.c;
        z41 z41Var = b51Var.f;
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
                ca0 ca0Var2 = new ca0(z41Var, ca0Var.a, ca0Var.d, null);
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
        if (!b51Var.h || z11) {
            y41Var.setVisibility(z11 ? 0 : 8);
            z41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            y41Var.setVisibility(0);
            z41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = y41Var.animate().alpha(0.0f).withEndAction(new fr0(b51Var, 23));
            TimeInterpolator timeInterpolator = bs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            z41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        b51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        b51Var.setClipChildren(z11);
        y41Var.setText(spannableStringBuilder);
        z41Var.setText(spannableStringBuilder);
        z41Var.setTextIsSelectable(!z14 && (ca0VarArr == null || ca0VarArr.length == 0));
        z41Var.setOnLinkPressListener(w90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        b51Var.b = z10;
        b51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        return TextUtils.equals(f61Var.l, f61Var2.l) && f61Var.f == f61Var2.f;
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new b51(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        return f61Var.d == f61Var2.d;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
