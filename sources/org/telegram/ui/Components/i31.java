package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i31 extends k41 {
    static {
        k41.h(new i31());
    }

    public static l41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, j80 j80Var, View.OnClickListener onClickListener2) {
        l41 K = l41.K(i31.class);
        K.d = i7;
        K.m = charSequence;
        K.f = z10;
        K.u = false;
        K.E = onClickListener;
        K.H = j80Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7;
        ImageView imageView;
        j31 j31Var = (j31) view;
        CharSequence charSequence = l41Var.m;
        boolean z11 = l41Var.f;
        View.OnClickListener onClickListener = l41Var.E;
        Object obj = l41Var.H;
        j80 j80Var = obj != null ? (j80) obj : null;
        boolean z12 = l41Var.u;
        View.OnClickListener onClickListener2 = l41Var.F;
        ImageView imageView2 = j31Var.n;
        TextView textView = j31Var.d;
        g31 g31Var = j31Var.c;
        h31 h31Var = j31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : x5.cloneSpans(charSequence));
        int i10 = 0;
        p80[] p80VarArr = (p80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p80.class);
        if (p80VarArr != null) {
            while (i10 < p80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(p80VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(p80VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(p80VarArr[i10]);
                int i11 = i10;
                p80 p80Var = p80VarArr[i11];
                View.OnClickListener onClickListener3 = onClickListener2;
                p80 p80Var2 = new p80(h31Var, p80Var.a, p80Var.d, null);
                p80 p80Var3 = p80VarArr[i11];
                p80Var2.f = p80Var3.f;
                p80Var2.h = p80Var3.h;
                p80Var2.n = p80Var3.n;
                if (!p80Var3.n || i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, j31Var.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, p80VarArr[i11].h);
                    imageView = imageView2;
                    p80Var2.a(org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(p80Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z14 = z12;
        ImageView imageView3 = imageView2;
        if (!j31Var.h || z11) {
            i7 = 0;
            g31Var.setVisibility(z11 ? 0 : 8);
            h31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i7 = 0;
            g31Var.setVisibility(0);
            h31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = g31Var.animate().alpha(0.0f).withEndAction(new ap0(j31Var, 24));
            TimeInterpolator timeInterpolator = lr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            h31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        j31Var.h = z11;
        textView.setVisibility(z11 ? i7 : 8);
        textView.setOnClickListener(onClickListener);
        j31Var.setClipChildren(z11);
        g31Var.setText(spannableStringBuilder);
        h31Var.setText(spannableStringBuilder);
        h31Var.setTextIsSelectable((z14 || !(p80VarArr == null || p80VarArr.length == 0)) ? i7 : 1);
        h31Var.setOnLinkPressListener(j80Var);
        imageView3.setVisibility(onClickListener4 != null ? i7 : 8);
        imageView3.setOnClickListener(onClickListener4);
        j31Var.b = z10;
        j31Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return TextUtils.equals(l41Var.m, l41Var2.m) && l41Var.f == l41Var2.f;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new j31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
