package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class qe0 extends FrameLayout {
    public final o5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.a2 c;
    public final /* synthetic */ se0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(se0 se0Var, Context context) {
        super(context);
        this.d = se0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, this, null);
        o5 o5Var = new o5(getContext());
        this.a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i3 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.r6.V(o5Var, i3, null);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        o5Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i3, null);
        a2Var.setGravity(org.telegram.messenger.bd.a0 ? 3 : 5);
        a2Var.setOnClickListener(new ga0(this, 6));
        boolean z10 = org.telegram.messenger.bd.a0;
        addView(o5Var, b8.mf.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, b8.mf.d(-2, -1.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i3, int i10, int i11, boolean z10) {
        o5 o5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.hs.i(o5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.li.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.zi.C5(m10, arrayList, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        } else {
            o5Var.setText(org.telegram.messenger.i6.m(str, o5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i3));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.bd.a0 ? new SpannableStringBuilder(com.google.android.recaptcha.internal.a.h(i3, "% – ")) : new SpannableStringBuilder(k2.p1.j(i3, " – ", "%"));
        spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (i11 == 0) {
            if (this.d.q1.quiz) {
                a2Var.c(org.telegram.messenger.bd.G(i10, "Answer", new Object[0]), z10, true);
                return;
            } else {
                a2Var.c(org.telegram.messenger.bd.G(i10, "Vote", new Object[0]), z10, true);
                return;
            }
        }
        if (i11 == 1) {
            a2Var.c(org.telegram.messenger.bd.M0(2131747179, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.bd.M0(2131747183, null), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = org.telegram.messenger.bd.a0;
        o5 o5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = o5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = o5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i3, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        measureChildWithMargins(a2Var, i3, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i3, org.telegram.messenger.g0.L(32.0f) + a2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(32.0f));
    }
}
