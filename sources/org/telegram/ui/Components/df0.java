package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class df0 extends FrameLayout {
    public final x5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.b2 c;
    public final /* synthetic */ ff0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(ff0 ff0Var, Context context) {
        super(context);
        this.d = ff0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.i5, this, null);
        x5 x5Var = new x5(getContext());
        this.a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.f7;
        org.telegram.ui.ActionBar.t6.U(x5Var, i7, null);
        x5Var.setSingleLine(true);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, null);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, getContext(), 1);
        this.c = b2Var;
        b2Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(b2Var, i7, null);
        b2Var.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        b2Var.setOnClickListener(new j70(this, 8));
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(x5Var, c8.ma.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, c8.ma.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(b2Var, c8.ma.d(-2, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i7, int i10, int i11, boolean z10) {
        x5 x5Var = this.a;
        if (arrayList != null) {
            org.telegram.messenger.ls.i(x5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            org.telegram.messenger.si.g(arrayList, str, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.gj.B5(m10, arrayList, x5Var.getPaint().getFontMetricsInt(), false);
            x5Var.setText(m10);
        } else {
            x5Var.setText(org.telegram.messenger.j6.m(str, x5Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i7));
        SpannableStringBuilder spannableStringBuilder2 = org.telegram.messenger.hd.a0 ? new SpannableStringBuilder(com.google.android.gms.internal.vision.e2.i(i7, "% – ")) : new SpannableStringBuilder(i5.c.j(i7, " – ", "%"));
        spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.b2 b2Var = this.c;
        if (i11 == 0) {
            if (this.d.t1.quiz) {
                b2Var.c(org.telegram.messenger.hd.G(i10, "Answer", new Object[0]), z10, true);
                return;
            } else {
                b2Var.c(org.telegram.messenger.hd.G(i10, "Vote", new Object[0]), z10, true);
                return;
            }
        }
        if (i11 == 1) {
            b2Var.c(org.telegram.messenger.hd.N0(2131746977, null), z10, true);
        } else {
            b2Var.c(org.telegram.messenger.hd.N0(2131746981, null), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = org.telegram.messenger.hd.a0;
        x5 x5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = x5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = x5Var.getRight();
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
