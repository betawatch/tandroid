package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r41 extends u51 {
    static {
        u51.setup(new r41());
    }

    public static v51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, l90 l90Var, View.OnClickListener onClickListener2) {
        v51 J = v51.J(r41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = l90Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        s41 s41Var = (s41) view;
        CharSequence charSequence = v51Var.l;
        boolean z11 = v51Var.f;
        View.OnClickListener onClickListener = v51Var.D;
        Object obj = v51Var.G;
        l90 l90Var = obj != null ? (l90) obj : null;
        boolean z12 = v51Var.t;
        View.OnClickListener onClickListener2 = v51Var.E;
        ImageView imageView = s41Var.n;
        TextView textView = s41Var.d;
        p41 p41Var = s41Var.c;
        q41 q41Var = s41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : y5.cloneSpans(charSequence));
        r90[] r90VarArr = (r90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r90.class);
        if (r90VarArr != null) {
            int i10 = 0;
            while (i10 < r90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(r90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(r90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(r90VarArr[i10]);
                int i11 = i10;
                r90 r90Var = r90VarArr[i11];
                r90 r90Var2 = new r90(q41Var, r90Var.a, r90Var.d, null);
                r90 r90Var3 = r90VarArr[i11];
                r90Var2.f = r90Var3.f;
                r90Var2.h = r90Var3.h;
                r90Var2.n = r90Var3.n;
                spannableStringBuilder.setSpan(r90Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!s41Var.h || z11) {
            p41Var.setVisibility(z11 ? 0 : 8);
            q41Var.setVisibility(!z11 ? 0 : 8);
        } else {
            p41Var.setVisibility(0);
            q41Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = p41Var.animate().alpha(0.0f).withEndAction(new uq0(s41Var, 23));
            TimeInterpolator timeInterpolator = wr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            q41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        s41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        s41Var.setClipChildren(z11);
        p41Var.setText(spannableStringBuilder);
        q41Var.setText(spannableStringBuilder);
        q41Var.setTextIsSelectable(!z14 && (r90VarArr == null || r90VarArr.length == 0));
        q41Var.setOnLinkPressListener(l90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        s41Var.b = z10;
        s41Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return TextUtils.equals(v51Var.l, v51Var2.l) && v51Var.f == v51Var2.f;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new s41(context, f6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
