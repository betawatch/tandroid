package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class cf0 extends FrameLayout {
    public final w5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.b2 c;
    public final /* synthetic */ ef0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(ef0 ef0Var, Context context) {
        super(context);
        this.d = ef0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.i5, this, null);
        w5 w5Var = new w5(getContext());
        this.a = w5Var;
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.f7;
        org.telegram.ui.ActionBar.u6.U(w5Var, i7, null);
        w5Var.setSingleLine(true);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        w5Var.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, null);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, getContext(), 1);
        this.c = b2Var;
        b2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.Y(b2Var, i7, null);
        b2Var.setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
        b2Var.setOnClickListener(new g70(this, 8));
        boolean z10 = org.telegram.messenger.gd.a0;
        addView(w5Var, c8.na.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, c8.na.d(-2, -1.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(b2Var, c8.na.d(-2, -1.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z10) {
        w5 w5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.ks.i(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.ri.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, arrayList, w5Var.getPaint().getFontMetricsInt(), false);
            w5Var.setText(m10);
        } else {
            w5Var.setText(org.telegram.messenger.j6.m(str, w5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.gd.a0 ? new SpannableStringBuilder(com.google.android.gms.internal.vision.e2.i(i7, "% – ")) : new SpannableStringBuilder(i5.c.j(i7, " – ", "%"));
        spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.b2 b2Var = this.c;
        if (i11 == 0) {
            if (this.d.t1.quiz) {
                b2Var.c(org.telegram.messenger.gd.G(i10, "Answer", new Object[0]), z10, true);
                return;
            } else {
                b2Var.c(org.telegram.messenger.gd.G(i10, "Vote", new Object[0]), z10, true);
                return;
            }
        }
        if (i11 == 1) {
            b2Var.c(org.telegram.messenger.gd.N0(2131746977, null), z10, true);
        } else {
            b2Var.c(org.telegram.messenger.gd.N0(2131746981, null), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = org.telegram.messenger.gd.a0;
        w5 w5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = w5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = w5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i7, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.b2 b2Var = this.c;
        measureChildWithMargins(b2Var, i7, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i7, org.telegram.messenger.g0.L(32.0f) + b2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(32.0f));
    }
}
