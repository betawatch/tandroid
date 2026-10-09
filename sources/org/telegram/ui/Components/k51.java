package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k51 extends o61 {
    static {
        o61.setup(new k51());
    }

    public static p61 a(int i10, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, da0 da0Var, View.OnClickListener onClickListener2) {
        p61 J = p61.J(k51.class);
        J.d = i10;
        J.l = charSequence;
        J.f = z10;
        J.t = false;
        J.D = onClickListener;
        J.G = da0Var;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        l51 l51Var = (l51) view;
        CharSequence charSequence = p61Var.l;
        boolean z11 = p61Var.f;
        View.OnClickListener onClickListener = p61Var.D;
        Object obj = p61Var.G;
        da0 da0Var = obj != null ? (da0) obj : null;
        boolean z12 = p61Var.t;
        View.OnClickListener onClickListener2 = p61Var.E;
        ImageView imageView = l51Var.n;
        TextView textView = l51Var.d;
        i51 i51Var = l51Var.c;
        j51 j51Var = l51Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : b6.cloneSpans(charSequence));
        ja0[] ja0VarArr = (ja0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ja0.class);
        if (ja0VarArr != null) {
            int i10 = 0;
            while (i10 < ja0VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ja0VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ja0VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(ja0VarArr[i10]);
                int i11 = i10;
                ja0 ja0Var = ja0VarArr[i11];
                ja0 ja0Var2 = new ja0(j51Var, ja0Var.a, ja0Var.d, null);
                ja0 ja0Var3 = ja0VarArr[i11];
                ja0Var2.f = ja0Var3.f;
                ja0Var2.h = ja0Var3.h;
                ja0Var2.n = ja0Var3.n;
                spannableStringBuilder.setSpan(ja0Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener2;
            }
        }
        View.OnClickListener onClickListener3 = onClickListener2;
        boolean z14 = z12;
        if (!l51Var.h || z11) {
            i51Var.setVisibility(z11 ? 0 : 8);
            j51Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i51Var.setVisibility(0);
            j51Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = i51Var.animate().alpha(0.0f).withEndAction(new or0(l51Var, 23));
            TimeInterpolator timeInterpolator = hs.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j51Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        l51Var.h = z11;
        textView.setVisibility(z11 ? 0 : 8);
        textView.setOnClickListener(onClickListener);
        l51Var.setClipChildren(z11);
        i51Var.setText(spannableStringBuilder);
        j51Var.setText(spannableStringBuilder);
        j51Var.setTextIsSelectable(!z14 && (ja0VarArr == null || ja0VarArr.length == 0));
        j51Var.setOnLinkPressListener(da0Var);
        imageView.setVisibility(onClickListener3 != null ? 0 : 8);
        imageView.setOnClickListener(onClickListener3);
        l51Var.b = z10;
        l51Var.setWillNotDraw(true ^ z10);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        return TextUtils.equals(p61Var.l, p61Var2.l) && p61Var.f == p61Var2.f;
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l51(context, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        return p61Var.d == p61Var2.d;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return false;
    }
}
