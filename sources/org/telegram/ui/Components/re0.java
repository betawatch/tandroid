package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class re0 extends FrameLayout {
    public final o5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.a2 c;
    public final /* synthetic */ te0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re0(te0 te0Var, Context context) {
        super(context);
        this.d = te0Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.i5, this, null);
        o5 o5Var = new o5(getContext());
        this.a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.j6.f7;
        org.telegram.ui.ActionBar.q6.U(o5Var, i7, null);
        o5Var.setSingleLine(true);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        o5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, null);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(this, getContext(), 1);
        this.c = a2Var;
        a2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.Y(a2Var, i7, null);
        a2Var.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        a2Var.setOnClickListener(new y60(this, 6));
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(o5Var, c8.ja.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, c8.ja.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a2Var, c8.ja.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z10) {
        o5 o5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.ns.i(o5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.si.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.gj.B5(m10, arrayList, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        } else {
            o5Var.setText(org.telegram.messenger.j6.m(str, o5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.hd.a0 ? new SpannableStringBuilder(com.google.android.gms.internal.vision.e2.i(i7, "% – ")) : new SpannableStringBuilder(i5.c.j(i7, " – ", "%"));
        spannableStringBuilder2.setSpan(new y31(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (i11 == 0) {
            if (this.d.t1.quiz) {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Answer", new Object[0]), z10, true);
                return;
            } else {
                a2Var.c(org.telegram.messenger.hd.G(i10, "Vote", new Object[0]), z10, true);
                return;
            }
        }
        if (i11 == 1) {
            a2Var.c(org.telegram.messenger.hd.M0(2131747171, null), z10, true);
        } else {
            a2Var.c(org.telegram.messenger.hd.M0(2131747175, null), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = org.telegram.messenger.hd.a0;
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
