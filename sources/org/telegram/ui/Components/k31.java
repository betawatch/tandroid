package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k31 extends m41 {
    static {
        m41.setup(new k31());
    }

    public static n41 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        n41 J = n41.J(k31.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = o80Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        l31 l31Var = (l31) view;
        CharSequence charSequence = n41Var.l;
        boolean z11 = n41Var.f;
        View.OnClickListener onClickListener = n41Var.D;
        Object obj = n41Var.G;
        o80 o80Var = obj != null ? (o80) obj : null;
        boolean z12 = n41Var.t;
        View.OnClickListener onClickListener2 = n41Var.E;
        ImageView imageView = l31Var.n;
        TextView textView = l31Var.d;
        i31 i31Var = l31Var.c;
        j31 j31Var = l31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : t5.cloneSpans(charSequence));
        u80[] u80VarArr = (u80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u80.class);
        if (u80VarArr != null) {
            int i10 = 0;
            while (i10 < u80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u80VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u80VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(u80VarArr[i10]);
                int i11 = i10;
                u80 u80Var = u80VarArr[i11];
                u80 u80Var2 = new u80(j31Var, u80Var.a, u80Var.d, null);
                u80 u80Var3 = u80VarArr[i11];
                u80Var2.f = u80Var3.f;
                u80Var2.h = u80Var3.h;
                u80Var2.n = u80Var3.n;
                spannableStringBuilder.setSpan(u80Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!l31Var.h || z11) {
            i31Var.setVisibility(z11 ? 0 : 8);
            j31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i31Var.setVisibility(0);
            j31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = i31Var.animate().alpha(0.0f).withEndAction(new up0(l31Var, 23));
            TimeInterpolator timeInterpolator = er.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        l31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        l31Var.setClipChildren(z11);
        i31Var.setText(spannableStringBuilder);
        j31Var.setText(spannableStringBuilder);
        j31Var.setTextIsSelectable(!z14 && (u80VarArr == null || u80VarArr.length == 0));
        j31Var.setOnLinkPressListener(o80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        l31Var.b = z10;
        l31Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.l, n41Var2.l) && n41Var.f == n41Var2.f;
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new l31(context, c6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
