package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e41 extends h51 {
    static {
        h51.setup(new e41());
    }

    public static i51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, b90 b90Var, View.OnClickListener onClickListener2) {
        i51 J = i51.J(e41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = b90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        f41 f41Var = (f41) view;
        CharSequence charSequence = i51Var.l;
        boolean z11 = i51Var.f;
        View.OnClickListener onClickListener = i51Var.D;
        Object obj = i51Var.G;
        b90 b90Var = obj != null ? (b90) obj : null;
        boolean z12 = i51Var.t;
        View.OnClickListener onClickListener2 = i51Var.E;
        ImageView imageView = f41Var.n;
        TextView textView = f41Var.d;
        c41 c41Var = f41Var.c;
        d41 d41Var = f41Var.f;
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
                h90 h90Var2 = new h90(d41Var, h90Var.a, h90Var.d, null);
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
        if (!f41Var.h || z11) {
            c41Var.setVisibility(z11 ? 0 : 8);
            d41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            c41Var.setVisibility(0);
            d41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = c41Var.animate().alpha(0.0f).withEndAction(new jq0(f41Var, 23));
            TimeInterpolator timeInterpolator = qr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            d41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        f41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        f41Var.setClipChildren(z11);
        c41Var.setText(spannableStringBuilder);
        d41Var.setText(spannableStringBuilder);
        d41Var.setTextIsSelectable(!z14 && (h90VarArr == null || h90VarArr.length == 0));
        d41Var.setOnLinkPressListener(b90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        f41Var.b = z10;
        f41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return TextUtils.equals(i51Var.l, i51Var2.l) && i51Var.f == i51Var2.f;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f41(context, e6Var);
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
