package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p51 extends s61 {
    static {
        s61.setup(new p51());
    }

    public static t61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, y90 y90Var, View.OnClickListener onClickListener2) {
        t61 K = t61.K(p51.class);
        K.d = i10;
        K.l = charSequence;
        K.f = z10;
        K.t = false;
        K.D = onClickListener;
        K.G = y90Var;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        q51 q51Var = (q51) view;
        CharSequence charSequence = t61Var.l;
        boolean z11 = t61Var.f;
        View.OnClickListener onClickListener = t61Var.D;
        Object obj = t61Var.G;
        y90 y90Var = obj != null ? (y90) obj : null;
        boolean z12 = t61Var.t;
        View.OnClickListener onClickListener2 = t61Var.E;
        ImageView imageView = q51Var.n;
        TextView textView = q51Var.d;
        n51 n51Var = q51Var.c;
        o51 o51Var = q51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : c6.cloneSpans(charSequence));
        ea0[] ea0VarArr = (ea0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ea0.class);
        if (ea0VarArr != null) {
            int i10 = 0;
            while (i10 < ea0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ea0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ea0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(ea0VarArr[i10]);
                int i11 = i10;
                ea0 ea0Var = ea0VarArr[i11];
                ea0 ea0Var2 = new ea0(o51Var, ea0Var.a, ea0Var.d, null);
                ea0 ea0Var3 = ea0VarArr[i11];
                ea0Var2.f = ea0Var3.f;
                ea0Var2.h = ea0Var3.h;
                ea0Var2.n = ea0Var3.n;
                spannableStringBuilder.setSpan(ea0Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!q51Var.h || z11) {
            n51Var.setVisibility(z11 ? 0 : 8);
            o51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            n51Var.setVisibility(0);
            o51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = n51Var.animate().alpha(0.0f).withEndAction(new mp0(q51Var, 29));
            TimeInterpolator timeInterpolator = ds.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            o51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        q51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        q51Var.setClipChildren(z11);
        n51Var.setText(spannableStringBuilder);
        o51Var.setText(spannableStringBuilder);
        o51Var.setTextIsSelectable(!z14 && (ea0VarArr == null || ea0VarArr.length == 0));
        o51Var.setOnLinkPressListener(y90Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        q51Var.b = z10;
        q51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return TextUtils.equals(t61Var.l, t61Var2.l) && t61Var.f == t61Var2.f;
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new q51(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.d == t61Var2.d;
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
