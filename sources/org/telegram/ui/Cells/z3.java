package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.Components.n5 a;
    public final y3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;
    public boolean f;

    public z3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(16, context, p6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        y3 y3Var = this.b;
        y3Var.c(charSequence, true, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        y3 y3Var = this.b;
        y3Var.c(charSequence2, false, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i10) {
        this.e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        y3 y3Var = this.b;
        y3Var.c(charSequence, true, true);
        y3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int L = org.telegram.messenger.i0.L(f7);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        y3 y3Var = this.b;
        y3Var.setVisibility(8);
        y3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.n5 n5Var = this.a;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.ActionBar.a7.V(n5Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.Z(this.b, i10, p6Var);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, p6Var));
        int i10 = org.telegram.ui.ActionBar.t6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
    }

    public z3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 32;
        this.d = p6Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, this, p6Var);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(getContext());
        this.a = n5Var;
        boolean z10 = true;
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.a7.V(n5Var, i11, p6Var);
        n5Var.setGravity((cd.X ? 5 : 3) | 16);
        float f7 = i10;
        addView(n5Var, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        y3 y3Var = new y3(getContext(), z10, z10, z10, 0);
        this.b = y3Var;
        y3Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        y3Var.b(0.9f, 420L, gr.h);
        y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(y3Var, i11, p6Var);
        y3Var.setGravity(cd.X ? 3 : 5);
        FrameLayout.LayoutParams d = w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.c = d;
        addView(y3Var, d);
        WeakHashMap weakHashMap = r0.h0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
