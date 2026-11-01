package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w31 extends a51 {
    static {
        a51.h(new w31());
    }

    public static b51 i(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, o80 o80Var, View.OnClickListener onClickListener2) {
        b51 K = b51.K(w31.class);
        K.d = i10;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = o80Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        x31 x31Var = (x31) view;
        CharSequence charSequence = b51Var.l;
        boolean z11 = b51Var.f;
        View.OnClickListener onClickListener = b51Var.D;
        Object obj = b51Var.G;
        o80 o80Var = obj != null ? (o80) obj : null;
        boolean z12 = b51Var.t;
        View.OnClickListener onClickListener2 = b51Var.E;
        ImageView imageView = x31Var.n;
        TextView textView = x31Var.d;
        u31 u31Var = x31Var.c;
        v31 v31Var = x31Var.f;
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
                u80 u80Var2 = new u80(v31Var, u80Var.a, u80Var.d, null);
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
        if (!x31Var.h || z11) {
            u31Var.setVisibility(z11 ? 0 : 8);
            v31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            u31Var.setVisibility(0);
            v31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = u31Var.animate().alpha(0.0f).withEndAction(new vo0(x31Var, 26));
            TimeInterpolator timeInterpolator = gr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            v31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        x31Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        x31Var.setClipChildren(z11);
        u31Var.setText(spannableStringBuilder);
        v31Var.setText(spannableStringBuilder);
        v31Var.setTextIsSelectable(!z14 && (u80VarArr == null || u80VarArr.length == 0));
        v31Var.setOnLinkPressListener(o80Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        x31Var.b = z10;
        x31Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(b51 b51Var, b51 b51Var2) {
        return TextUtils.equals(b51Var.l, b51Var2.l) && b51Var.f == b51Var2.f;
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new x31(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return b51Var.d == b51Var2.d;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
