package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f41 extends i51 {
    static {
        i51.setup(new f41());
    }

    public static j51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, b90 b90Var, View.OnClickListener onClickListener2) {
        j51 J = j51.J(f41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = b90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        g41 g41Var = (g41) view;
        CharSequence charSequence = j51Var.l;
        boolean z11 = j51Var.f;
        View.OnClickListener onClickListener = j51Var.D;
        Object obj = j51Var.G;
        b90 b90Var = obj != null ? (b90) obj : null;
        boolean z12 = j51Var.t;
        View.OnClickListener onClickListener2 = j51Var.E;
        ImageView imageView = g41Var.n;
        TextView textView = g41Var.d;
        d41 d41Var = g41Var.c;
        e41 e41Var = g41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : x5.cloneSpans(charSequence));
        h90[] h90VarArr = (h90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h90.class);
        if (h90VarArr != null) {
            int i10 = 0;
            while (i10 < h90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(h90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(h90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(h90VarArr[i10]);
                int i11 = i10;
                h90 h90Var = h90VarArr[i11];
                h90 h90Var2 = new h90(e41Var, h90Var.a, h90Var.d, null);
                h90 h90Var3 = h90VarArr[i11];
                h90Var2.f = h90Var3.f;
                h90Var2.h = h90Var3.h;
                h90Var2.n = h90Var3.n;
                spannableStringBuilder.setSpan(h90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!g41Var.h || z11) {
            d41Var.setVisibility(z11 ? 0 : 8);
            e41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            d41Var.setVisibility(0);
            e41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = d41Var.animate().alpha(0.0f).withEndAction(new kq0(g41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            e41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        g41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        g41Var.setClipChildren(z11);
        d41Var.setText(spannableStringBuilder);
        e41Var.setText(spannableStringBuilder);
        e41Var.setTextIsSelectable(!z14 && (h90VarArr == null || h90VarArr.length == 0));
        e41Var.setOnLinkPressListener(b90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        g41Var.b = z10;
        g41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return TextUtils.equals(j51Var.l, j51Var2.l) && j51Var.f == j51Var2.f;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g41(context, f6Var);
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
