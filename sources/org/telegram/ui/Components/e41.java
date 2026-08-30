package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e41 extends h51 {
    static {
        h51.setup(new e41());
    }

    public static i51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, d90 d90Var, View.OnClickListener onClickListener2) {
        i51 J = i51.J(e41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z4;
        J.t = false;
        J.D = onClickListener;
        J.G = d90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        f41 f41Var = (f41) view;
        CharSequence charSequence = i51Var.l;
        boolean z10 = i51Var.f;
        View.OnClickListener onClickListener = i51Var.D;
        Object obj = i51Var.G;
        d90 d90Var = obj != null ? (d90) obj : null;
        boolean z11 = i51Var.t;
        View.OnClickListener onClickListener2 = i51Var.E;
        ImageView imageView = f41Var.n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.c;
        d41 d41Var = f41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : u5.cloneSpans(charSequence));
        j90[] j90VarArr = (j90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), j90.class);
        if (j90VarArr != null) {
            int i10 = 0;
            while (i10 < j90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(j90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(j90VarArr[i10]);
                boolean z12 = z11;
                spannableStringBuilder.removeSpan(j90VarArr[i10]);
                int i11 = i10;
                j90 j90Var = j90VarArr[i11];
                j90 j90Var2 = new j90(d41Var, j90Var.a, j90Var.d, null);
                j90 j90Var3 = j90VarArr[i11];
                j90Var2.f = j90Var3.f;
                j90Var2.h = j90Var3.h;
                j90Var2.n = j90Var3.n;
                spannableStringBuilder.setSpan(j90Var2, spanStart, spanEnd, 33);
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
            TimeInterpolator timeInterpolator = nr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        f41Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z10);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        d41Var.setTextIsSelectable(!z13 && (j90VarArr == null || j90VarArr.length == 0));
        d41Var.setOnLinkPressListener(d90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        f41Var.b = z4;
        f41Var.setWillNotDraw(true ^ z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return TextUtils.equals(i51Var.l, i51Var2.l) && i51Var.f == i51Var2.f;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
