package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v31 extends z41 {
    static {
        z41.h(new v31());
    }

    public static a51 i(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        a51 K = a51.K(v31.class);
        K.d = i10;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = o80Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        w31 w31Var = (w31) view;
        CharSequence charSequence = a51Var.l;
        boolean z11 = a51Var.f;
        View.OnClickListener onClickListener = a51Var.D;
        Object obj = a51Var.G;
        o80 o80Var = obj != null ? (o80) obj : null;
        boolean z12 = a51Var.t;
        View.OnClickListener onClickListener2 = a51Var.E;
        ImageView imageView = w31Var.n;
        TextView textView = w31Var.d;
        t31 t31Var = w31Var.c;
        u31 u31Var = w31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : o5.cloneSpans(charSequence));
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
                u80 u80Var2 = new u80(u31Var, u80Var.a, u80Var.d, null);
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
        if (!w31Var.h || z11) {
            t31Var.setVisibility(z11 ? 0 : 8);
            u31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            t31Var.setVisibility(0);
            u31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = t31Var.animate().alpha(0.0f).withEndAction(new uo0(w31Var, 26));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            u31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        w31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        w31Var.setClipChildren(z11);
        t31Var.setText(spannableStringBuilder);
        u31Var.setText(spannableStringBuilder);
        u31Var.setTextIsSelectable(!z14 && (u80VarArr == null || u80VarArr.length == 0));
        u31Var.setOnLinkPressListener(o80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        w31Var.b = z10;
        w31Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return TextUtils.equals(a51Var.l, a51Var2.l) && a51Var.f == a51Var2.f;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new w31(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
