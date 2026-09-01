package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f41 extends i51 {
    static {
        i51.setup(new f41());
    }

    public static j51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, f90 f90Var, View.OnClickListener onClickListener2) {
        j51 J = j51.J(f41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z4;
        J.t = false;
        J.D = onClickListener;
        J.G = f90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        g41 g41Var = (g41) view;
        CharSequence charSequence = j51Var.l;
        boolean z10 = j51Var.f;
        View.OnClickListener onClickListener = j51Var.D;
        Object obj = j51Var.G;
        f90 f90Var = obj != null ? (f90) obj : null;
        boolean z11 = j51Var.t;
        View.OnClickListener onClickListener2 = j51Var.E;
        ImageView imageView = g41Var.n;
        TextView textView = g41Var.d;
        d41 d41Var = g41Var.c;
        e41 e41Var = g41Var.f;
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
                l90 l90Var2 = new l90(e41Var, l90Var.a, l90Var.d, null);
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
        if (!g41Var.h || z10) {
            d41Var.setVisibility(z10 ? 0 : 8);
            e41Var.setVisibility(!z10 ? 0 : 8);
        } else {
            d41Var.setVisibility(0);
            e41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = d41Var.animate().alpha(0.0f).withEndAction(new oq0(g41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            e41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        g41Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        g41Var.setClipChildren(z10);
        d41Var.setText(spannableStringBuilder);
        e41Var.setText(spannableStringBuilder);
        e41Var.setTextIsSelectable(!z13 && (l90VarArr == null || l90VarArr.length == 0));
        e41Var.setOnLinkPressListener(f90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        g41Var.b = z4;
        g41Var.setWillNotDraw(true ^ z4);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return TextUtils.equals(j51Var.l, j51Var2.l) && j51Var.f == j51Var2.f;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g41(context, g6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
