package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e41 extends h51 {
    static {
        h51.setup(new e41());
    }

    public static i51 a(int i10, CharSequence charSequence, boolean z4, View.OnClickListener onClickListener, e90 e90Var, View.OnClickListener onClickListener2) {
        i51 J = i51.J(e41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z4;
        J.t = false;
        J.D = onClickListener;
        J.G = e90Var;
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
        e90 e90Var = obj != null ? (e90) obj : null;
        boolean z11 = i51Var.t;
        View.OnClickListener onClickListener2 = i51Var.E;
        ImageView imageView = f41Var.n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.c;
        d41 d41Var = f41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : u5.cloneSpans(charSequence));
        k90[] k90VarArr = (k90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), k90.class);
        if (k90VarArr != null) {
            int i10 = 0;
            while (i10 < k90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(k90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(k90VarArr[i10]);
                boolean z12 = z11;
                spannableStringBuilder.removeSpan(k90VarArr[i10]);
                int i11 = i10;
                k90 k90Var = k90VarArr[i11];
                k90 k90Var2 = new k90(d41Var, k90Var.a, k90Var.d, null);
                k90 k90Var3 = k90VarArr[i11];
                k90Var2.f = k90Var3.f;
                k90Var2.h = k90Var3.h;
                k90Var2.n = k90Var3.n;
                spannableStringBuilder.setSpan(k90Var2, spanStart, spanEnd, 33);
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
            TimeInterpolator timeInterpolator = mr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        f41Var.h = z10;
        textView.setVisibility(z10 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z10);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        d41Var.setTextIsSelectable(!z13 && (k90VarArr == null || k90VarArr.length == 0));
        d41Var.setOnLinkPressListener(e90Var);
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
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
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
