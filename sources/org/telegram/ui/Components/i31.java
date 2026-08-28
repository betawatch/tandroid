package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i31 extends k41 {
    static {
        k41.setup(new i31());
    }

    public static l41 a(int i9, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, k80 k80Var, View.OnClickListener onClickListener2) {
        l41 J = l41.J(i31.class);
        J.d = i9;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = k80Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        j31 j31Var = (j31) view;
        CharSequence charSequence = l41Var.l;
        boolean z11 = l41Var.f;
        View.OnClickListener onClickListener = l41Var.D;
        Object obj = l41Var.G;
        k80 k80Var = obj != null ? (k80) obj : null;
        boolean z12 = l41Var.t;
        View.OnClickListener onClickListener2 = l41Var.E;
        ImageView imageView = j31Var.n;
        TextView textView = j31Var.d;
        g31 g31Var = j31Var.c;
        h31 h31Var = j31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : t5.cloneSpans(charSequence));
        q80[] q80VarArr = (q80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q80.class);
        if (q80VarArr != null) {
            int i9 = 0;
            while (i9 < q80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(q80VarArr[i9]);
                int spanEnd = spannableStringBuilder.getSpanEnd(q80VarArr[i9]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(q80VarArr[i9]);
                int i10 = i9;
                q80 q80Var = q80VarArr[i10];
                q80 q80Var2 = new q80(h31Var, q80Var.a, q80Var.d, null);
                q80 q80Var3 = q80VarArr[i10];
                q80Var2.f = q80Var3.f;
                q80Var2.h = q80Var3.h;
                q80Var2.n = q80Var3.n;
                spannableStringBuilder.setSpan(q80Var2, spanStart, spanEnd, 33);
                i9 = i10 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!j31Var.h || z11) {
            g31Var.setVisibility(z11 ? 0 : 8);
            h31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            g31Var.setVisibility(0);
            h31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g31Var.animate().alpha(0.0f).withEndAction(new tp0(j31Var, 23));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        j31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        j31Var.setClipChildren(z11);
        g31Var.setText(spannableStringBuilder);
        h31Var.setText(spannableStringBuilder);
        h31Var.setTextIsSelectable(!z14 && (q80VarArr == null || q80VarArr.length == 0));
        h31Var.setOnLinkPressListener(k80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        j31Var.b = z10;
        j31Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(l41Var.l, l41Var2.l) && l41Var.f == l41Var2.f;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new j31(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
