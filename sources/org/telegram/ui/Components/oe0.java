package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class oe0 extends FrameLayout {
    public final q5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.a2 c;
    public final /* synthetic */ qe0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(qe0 qe0Var, Context context) {
        super(context);
        this.d = qe0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, this, null);
        q5 q5Var = new q5(getContext());
        this.a = q5Var;
        q5Var.setTextSize(1, 14.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.r6.V(q5Var, i7, null);
        q5Var.setSingleLine(true);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        q5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i7, null);
        a2Var.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        a2Var.setOnClickListener(new la0(this, 5));
        boolean z9 = org.telegram.messenger.hd.a0;
        addView(q5Var, c8.ha.d(-2, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 0 : 16, 0.0f, z9 ? 16 : 0, 0.0f));
        addView(textView, c8.ha.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, c8.ha.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z9) {
        q5 q5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.qs.i(q5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.ui.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, q5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.ij.C5(m10, arrayList, q5Var.getPaint().getFontMetricsInt(), false);
            q5Var.setText(m10);
        } else {
            q5Var.setText(org.telegram.messenger.i6.m(str, q5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.hd.a0 ? new SpannableStringBuilder(com.google.android.recaptcha.internal.a.i(i7, "% – ")) : new SpannableStringBuilder(jg.g.k(i7, " – ", "%"));
        spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (i11 == 0) {
            if (this.d.p1.quiz) {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Answer", new Object[0]), z9, true);
                return;
            } else {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Vote", new Object[0]), z9, true);
                return;
            }
        }
        if (i11 == 1) {
            a2Var.c(org.telegram.messenger.hd.M0(2131747170, null), z9, true);
        } else {
            a2Var.c(org.telegram.messenger.hd.M0(2131747174, null), z9, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        boolean z10 = org.telegram.messenger.hd.a0;
        q5 q5Var = this.a;
        TextView textView = this.b;
        if (z10) {
            int left = q5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = q5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i7, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        measureChildWithMargins(a2Var, i7, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i7, org.telegram.messenger.g0.L(32.0f) + a2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(32.0f));
    }
}
