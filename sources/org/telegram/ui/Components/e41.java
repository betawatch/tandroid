package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e41 extends g51 {
    static {
        g51.setup(new e41());
    }

    public static h51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, f90 f90Var, View.OnClickListener onClickListener2) {
        h51 J = h51.J(e41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z4;
        J.t = false;
        J.D = onClickListener;
        J.G = f90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        f41 f41Var = (f41) view;
        CharSequence charSequence = h51Var.l;
        boolean z10 = h51Var.f;
        View.OnClickListener onClickListener = h51Var.D;
        Object obj = h51Var.G;
        f90 f90Var = obj != null ? (f90) obj : null;
        boolean z11 = h51Var.t;
        View.OnClickListener onClickListener2 = h51Var.E;
        ImageView imageView = f41Var.n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.c;
        d41 d41Var = f41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : u5.cloneSpans(charSequence));
        l90[] l90VarArr = (l90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), l90.class);
        if (l90VarArr != null) {
            int i10 = 0;
            while (i10 < l90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(l90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(l90VarArr[i10]);
                boolean z12 = z11;
                spannableStringBuilder.removeSpan(l90VarArr[i10]);
                int i11 = i10;
                l90 l90Var = l90VarArr[i11];
                l90 l90Var2 = new l90(d41Var, l90Var.a, l90Var.d, null);
                l90 l90Var3 = l90VarArr[i11];
                l90Var2.f = l90Var3.f;
                l90Var2.h = l90Var3.h;
                l90Var2.n = l90Var3.n;
                spannableStringBuilder.setSpan(l90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z11 = z12;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z13 = z11;
        if (!f41Var.h || z10) {
            c41Var.setVisibility(z10 ? 0 : 8);
            d41Var.setVisibility(!z10 ? 0 : 8);
        } else {
            c41Var.setVisibility(0);
            d41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = c41Var.animate().alpha(0.0f).withEndAction(new nq0(f41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        f41Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z10);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        d41Var.setTextIsSelectable(!z13 && (l90VarArr == null || l90VarArr.length == 0));
        d41Var.setOnLinkPressListener(f90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        f41Var.b = z4;
        f41Var.setWillNotDraw(true ^ z4);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return TextUtils.equals(h51Var.l, h51Var2.l) && h51Var.f == h51Var2.f;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f41(context, g6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
