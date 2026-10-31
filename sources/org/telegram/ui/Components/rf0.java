package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class rf0 extends FrameLayout {
    public final n5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.a2 c;
    public final /* synthetic */ tf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf0(tf0 tf0Var, Context context) {
        super(context);
        this.d = tf0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.i5, this, null);
        n5 n5Var = new n5(getContext());
        this.a = n5Var;
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        int i10 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.a7.V(n5Var, i10, null);
        n5Var.setSingleLine(true);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        n5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(a2Var, i10, null);
        a2Var.setGravity(org.telegram.messenger.cd.X ? 3 : 5);
        a2Var.setOnClickListener(new db0(this, 6));
        boolean z10 = org.telegram.messenger.cd.X;
        addView(n5Var, w7.b6.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, w7.b6.d(-2, -1.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, w7.b6.d(-2, -1.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        n5 n5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.zs.i(n5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.ui.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.jj.A5(m10, arrayList, n5Var.getPaint().getFontMetricsInt(), false);
            n5Var.setText(m10);
        } else {
            n5Var.setText(org.telegram.messenger.k6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.cd.X ? new SpannableStringBuilder(a1.g.k(i10, "% – ")) : new SpannableStringBuilder(i0.a.j(i10, " – ", "%"));
        spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (i12 == 0) {
            if (this.d.p1.quiz) {
                a2Var.c(org.telegram.messenger.cd.G(i11, "Answer", new Object[0]), z10, true);
                return;
            } else {
                a2Var.c(org.telegram.messenger.cd.G(i11, "Vote", new Object[0]), z10, true);
                return;
            }
        }
        if (i12 == 1) {
            a2Var.c(org.telegram.messenger.cd.L0(2131747186, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.cd.L0(2131747190, null), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = org.telegram.messenger.cd.X;
        n5 n5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = n5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = n5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        measureChildWithMargins(a2Var, i10, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i10, org.telegram.messenger.i0.L(32.0f) + a2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(32.0f));
    }
}
