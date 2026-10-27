package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q51 extends t61 {
    static {
        t61.setup(new q51());
    }

    public static u61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, z90 z90Var, View.OnClickListener onClickListener2) {
        u61 K = u61.K(q51.class);
        K.d = i10;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = z90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        r51 r51Var = (r51) view;
        CharSequence charSequence = u61Var.l;
        boolean z11 = u61Var.f;
        View.OnClickListener onClickListener = u61Var.D;
        Object obj = u61Var.G;
        z90 z90Var = obj != null ? (z90) obj : null;
        boolean z12 = u61Var.t;
        View.OnClickListener onClickListener2 = u61Var.E;
        ImageView imageView = r51Var.n;
        TextView textView = r51Var.d;
        o51 o51Var = r51Var.c;
        p51 p51Var = r51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : c6.cloneSpans(charSequence));
        fa0[] fa0VarArr = (fa0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fa0.class);
        if (fa0VarArr != null) {
            int i10 = 0;
            while (i10 < fa0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(fa0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(fa0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(fa0VarArr[i10]);
                int i11 = i10;
                fa0 fa0Var = fa0VarArr[i11];
                fa0 fa0Var2 = new fa0(p51Var, fa0Var.a, fa0Var.d, null);
                fa0 fa0Var3 = fa0VarArr[i11];
                fa0Var2.f = fa0Var3.f;
                fa0Var2.h = fa0Var3.h;
                fa0Var2.n = fa0Var3.n;
                spannableStringBuilder.setSpan(fa0Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!r51Var.h || z11) {
            o51Var.setVisibility(z11 ? 0 : 8);
            p51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            o51Var.setVisibility(0);
            p51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = o51Var.animate().alpha(0.0f).withEndAction(new np0(r51Var, 29));
            TimeInterpolator timeInterpolator = ds.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            p51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        r51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        r51Var.setClipChildren(z11);
        o51Var.setText(spannableStringBuilder);
        p51Var.setText(spannableStringBuilder);
        p51Var.setTextIsSelectable(!z14 && (fa0VarArr == null || fa0VarArr.length == 0));
        p51Var.setOnLinkPressListener(z90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        r51Var.b = z10;
        r51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return TextUtils.equals(u61Var.l, u61Var2.l) && u61Var.f == u61Var2.f;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new r51(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.d == u61Var2.d;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }
}
