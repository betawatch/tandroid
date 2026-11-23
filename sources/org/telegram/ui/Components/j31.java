package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j31 extends m41 {
    static {
        m41.h(new j31());
    }

    public static n41 i(int i7, CharSequence charSequence, boolean z10, View.OnClickListener onClickListener, i80 i80Var, View.OnClickListener onClickListener2) {
        n41 K = n41.K(j31.class);
        K.d = i7;
        K.m = charSequence;
        K.f = z10;
        K.u = false;
        K.E = onClickListener;
        K.H = i80Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7;
        ImageView imageView;
        k31 k31Var = (k31) view;
        CharSequence charSequence = n41Var.m;
        boolean z11 = n41Var.f;
        View.OnClickListener onClickListener = n41Var.E;
        Object obj = n41Var.H;
        i80 i80Var = obj != null ? (i80) obj : null;
        boolean z12 = n41Var.u;
        View.OnClickListener onClickListener2 = n41Var.F;
        ImageView imageView2 = k31Var.n;
        TextView textView = k31Var.d;
        h31 h31Var = k31Var.c;
        i31 i31Var = k31Var.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : x5.cloneSpans(charSequence));
        int i10 = 0;
        o80[] o80VarArr = (o80[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o80.class);
        if (o80VarArr != null) {
            while (i10 < o80VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(o80VarArr[i10]);
                int spanEnd = spannableStringBuilder.getSpanEnd(o80VarArr[i10]);
                boolean z13 = z12;
                spannableStringBuilder.removeSpan(o80VarArr[i10]);
                int i11 = i10;
                o80 o80Var = o80VarArr[i11];
                View.OnClickListener onClickListener3 = onClickListener2;
                o80 o80Var2 = new o80(i31Var, o80Var.a, o80Var.d, null);
                o80 o80Var3 = o80VarArr[i11];
                o80Var2.f = o80Var3.f;
                o80Var2.h = o80Var3.h;
                o80Var2.n = o80Var3.n;
                if (!o80Var3.n || i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, k31Var.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, o80VarArr[i11].h);
                    imageView = imageView2;
                    o80Var2.a(org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.07f / max), -1), org.telegram.ui.ActionBar.n6.r1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(o80Var2, spanStart, spanEnd, 33);
                i10 = i11 + 1;
                z12 = z13;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z14 = z12;
        ImageView imageView3 = imageView2;
        if (!k31Var.h || z11) {
            i7 = 0;
            h31Var.setVisibility(z11 ? 0 : 8);
            i31Var.setVisibility(!z11 ? 0 : 8);
        } else {
            i7 = 0;
            h31Var.setVisibility(0);
            i31Var.setVisibility(0);
            ViewPropertyAnimator withEndAction = h31Var.animate().alpha(0.0f).withEndAction(new bp0(k31Var, 24));
            TimeInterpolator timeInterpolator = kr.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            i31Var.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        k31Var.h = z11;
        textView.setVisibility(z11 ? i7 : 8);
        textView.setOnClickListener(onClickListener);
        k31Var.setClipChildren(z11);
        h31Var.setText(spannableStringBuilder);
        i31Var.setText(spannableStringBuilder);
        i31Var.setTextIsSelectable((z14 || !(o80VarArr == null || o80VarArr.length == 0)) ? i7 : 1);
        i31Var.setOnLinkPressListener(i80Var);
        imageView3.setVisibility(onClickListener4 != null ? i7 : 8);
        imageView3.setOnClickListener(onClickListener4);
        k31Var.b = z10;
        k31Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.m, n41Var2.m) && n41Var.f == n41Var2.f;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k31(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
