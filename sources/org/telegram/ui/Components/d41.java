package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d41 extends g51 {
    static {
        g51.setup(new d41());
    }

    public static h51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, c90 c90Var, View.OnClickListener onClickListener2) {
        h51 J = h51.J(d41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = c90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        e41 e41Var = (e41) view;
        CharSequence charSequence = h51Var.l;
        boolean z11 = h51Var.f;
        View.OnClickListener onClickListener = h51Var.D;
        Object obj = h51Var.G;
        c90 c90Var = obj != null ? (c90) obj : null;
        boolean z12 = h51Var.t;
        View.OnClickListener onClickListener2 = h51Var.E;
        ImageView imageView = e41Var.n;
        TextView textView = e41Var.d;
        b41 b41Var = e41Var.c;
        c41 c41Var = e41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        i90[] i90VarArr = (i90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i90.class);
        if (i90VarArr != null) {
            int i10 = 0;
            while (i10 < i90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(i90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(i90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(i90VarArr[i10]);
                int i11 = i10;
                i90 i90Var = i90VarArr[i11];
                i90 i90Var2 = new i90(c41Var, i90Var.a, i90Var.d, null);
                i90 i90Var3 = i90VarArr[i11];
                i90Var2.f = i90Var3.f;
                i90Var2.h = i90Var3.h;
                i90Var2.n = i90Var3.n;
                spannableStringBuilder.setSpan(i90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!e41Var.h || z11) {
            b41Var.setVisibility(z11 ? 0 : 8);
            c41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            b41Var.setVisibility(0);
            c41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = b41Var.animate().alpha(0.0f).withEndAction(new jq0(e41Var, 23));
            TimeInterpolator timeInterpolator = pr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            c41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        e41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        e41Var.setClipChildren(z11);
        b41Var.setText(spannableStringBuilder);
        c41Var.setText(spannableStringBuilder);
        c41Var.setTextIsSelectable(!z14 && (i90VarArr == null || i90VarArr.length == 0));
        c41Var.setOnLinkPressListener(c90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        e41Var.b = z10;
        e41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return TextUtils.equals(h51Var.l, h51Var2.l) && h51Var.f == h51Var2.f;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e41(context, f6Var);
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
