package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d51 extends g61 {
    static {
        g61.setup(new d51());
    }

    public static h61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, p90 p90Var, View.OnClickListener onClickListener2) {
        h61 K = h61.K(d51.class);
        K.d = i10;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = p90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        e51 e51Var = (e51) view;
        CharSequence charSequence = h61Var.l;
        boolean z11 = h61Var.f;
        View.OnClickListener onClickListener = h61Var.D;
        Object obj = h61Var.G;
        p90 p90Var = obj != null ? (p90) obj : null;
        boolean z12 = h61Var.t;
        View.OnClickListener onClickListener2 = h61Var.E;
        ImageView imageView = e51Var.n;
        TextView textView = e51Var.d;
        b51 b51Var = e51Var.c;
        c51 c51Var = e51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        v90[] v90VarArr = (v90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), v90.class);
        if (v90VarArr != null) {
            int i10 = 0;
            while (i10 < v90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(v90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(v90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(v90VarArr[i10]);
                int i11 = i10;
                v90 v90Var = v90VarArr[i11];
                v90 v90Var2 = new v90(c51Var, v90Var.a, v90Var.d, null);
                v90 v90Var3 = v90VarArr[i11];
                v90Var2.f = v90Var3.f;
                v90Var2.h = v90Var3.h;
                v90Var2.n = v90Var3.n;
                spannableStringBuilder.setSpan(v90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!e51Var.h || z11) {
            b51Var.setVisibility(z11 ? 0 : 8);
            c51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            b51Var.setVisibility(0);
            c51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = b51Var.animate().alpha(0.0f).withEndAction(new gq0(e51Var, 26));
            TimeInterpolator timeInterpolator = tr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            c51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        e51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        e51Var.setClipChildren(z11);
        b51Var.setText(spannableStringBuilder);
        c51Var.setText(spannableStringBuilder);
        c51Var.setTextIsSelectable(!z14 && (v90VarArr == null || v90VarArr.length == 0));
        c51Var.setOnLinkPressListener(p90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        e51Var.b = z10;
        e51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        return TextUtils.equals(h61Var.l, h61Var2.l) && h61Var.f == h61Var2.f;
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new e51(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.d == h61Var2.d;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
