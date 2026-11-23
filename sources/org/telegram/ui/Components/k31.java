package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k31 extends n41 {
    static {
        n41.h(new k31());
    }

    public static o41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, l80 l80Var, View.OnClickListener onClickListener2) {
        o41 K = o41.K(k31.class);
        K.d = i7;
        K.m = charSequence;
        K.f = z10;
        K.u = false;
        K.E = onClickListener;
        K.H = l80Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7;
        ImageView imageView;
        l31 l31Var = (l31) view;
        CharSequence charSequence = o41Var.m;
        boolean z11 = o41Var.f;
        View.OnClickListener onClickListener = o41Var.E;
        Object obj = o41Var.H;
        l80 l80Var = obj != null ? (l80) obj : null;
        boolean z12 = o41Var.u;
        View.OnClickListener onClickListener2 = o41Var.F;
        ImageView imageView2 = l31Var.n;
        TextView textView = l31Var.d;
        i31 i31Var = l31Var.c;
        j31 j31Var = l31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : y5.cloneSpans(charSequence));
        int i10 = 0;
        r80[] r80VarArr = (r80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), r80.class);
        if (r80VarArr != null) {
            while (i10 < r80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(r80VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(r80VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(r80VarArr[i10]);
                int i11 = i10;
                r80 r80Var = r80VarArr[i11];
                View.OnClickListener onClickListener3 = onClickListener2;
                r80 r80Var2 = new r80(j31Var, r80Var.a, r80Var.d, null);
                r80 r80Var3 = r80VarArr[i11];
                r80Var2.f = r80Var3.f;
                r80Var2.h = r80Var3.h;
                r80Var2.n = r80Var3.n;
                if (!r80Var3.n || i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, l31Var.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, r80VarArr[i11].h);
                    imageView = imageView2;
                    r80Var2.a(org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.m6.r1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(r80Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z14 = z12;
        ImageView imageView3 = imageView2;
        if (!l31Var.h || z11) {
            i7 = 0;
            i31Var.setVisibility(z11 ? 0 : 8);
            j31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i7 = 0;
            i31Var.setVisibility(0);
            j31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = i31Var.animate().alpha(0.0f).withEndAction(new cp0(l31Var, 24));
            TimeInterpolator timeInterpolator = nr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            j31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        l31Var.h = z11;
        textView.setVisibility(z11 ? i7 : 8);
        textView.setOnClickListener(onClickListener);
        l31Var.setClipChildren(z11);
        i31Var.setText(spannableStringBuilder);
        j31Var.setText(spannableStringBuilder);
        j31Var.setTextIsSelectable((z14 || !(r80VarArr == null || r80VarArr.length == 0)) ? i7 : 1);
        j31Var.setOnLinkPressListener(l80Var);
        imageView3.setVisibility(onClickListener4 != null ? i7 : 8);
        imageView3.setOnClickListener(onClickListener4);
        l31Var.b = z10;
        l31Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return TextUtils.equals(o41Var.m, o41Var2.m) && o41Var.f == o41Var2.f;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new l31(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
