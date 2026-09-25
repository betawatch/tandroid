package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class r41 extends u51 {
    static {
        u51.setup(new r41());
    }

    public static v51 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, m90 m90Var, View.OnClickListener onClickListener2) {
        v51 J = v51.J(r41.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = m90Var;
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
        m90 m90Var = obj != null ? (m90) obj : null;
        boolean z12 = v51Var.t;
        View.OnClickListener onClickListener2 = v51Var.E;
        ImageView imageView = s41Var.n;
        TextView textView = s41Var.d;
        p41 p41Var = s41Var.c;
        q41 q41Var = s41Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : z5.cloneSpans(charSequence));
        s90[] s90VarArr = (s90[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), s90.class);
        if (s90VarArr != null) {
            int i10 = 0;
            while (i10 < s90VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(s90VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(s90VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(s90VarArr[i10]);
                int i11 = i10;
                s90 s90Var = s90VarArr[i11];
                s90 s90Var2 = new s90(q41Var, s90Var.a, s90Var.d, null);
                s90 s90Var3 = s90VarArr[i11];
                s90Var2.f = s90Var3.f;
                s90Var2.h = s90Var3.h;
                s90Var2.n = s90Var3.n;
                spannableStringBuilder.setSpan(s90Var2, spanStart, spanEnd, 33);
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
            ViewPropertyAnimator withEndAction = p41Var.animate().alpha(0.0f).withEndAction(new wq0(s41Var, 24));
            TimeInterpolator timeInterpolator = rr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            q41Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        s41Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        s41Var.setClipChildren(z11);
        p41Var.setText(spannableStringBuilder);
        q41Var.setText(spannableStringBuilder);
        q41Var.setTextIsSelectable(!z14 && (s90VarArr == null || s90VarArr.length == 0));
        q41Var.setOnLinkPressListener(m90Var);
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
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s41(context, d6Var);
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
