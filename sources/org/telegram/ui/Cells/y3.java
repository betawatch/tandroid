package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.Components.x5 a;
    public final x3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.h6 d;
    public int e;
    public boolean f;

    public y3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(16, context, h6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        x3 x3Var = this.b;
        x3Var.c(charSequence, true, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        x3 x3Var = this.b;
        x3Var.c(charSequence2, false, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i7) {
        this.e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        x3 x3Var = this.b;
        x3Var.c(charSequence, true, true);
        x3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        x3 x3Var = this.b;
        x3Var.setVisibility(8);
        x3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.x5 x5Var = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.ActionBar.t6.U(x5Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.Y(this.b, i7, h6Var);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.e7, h6Var));
        int i7 = org.telegram.ui.ActionBar.m6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
    }

    public y3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = 32;
        this.d = h6Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.e7, this, h6Var);
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(getContext());
        this.a = x5Var;
        boolean z10 = true;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.f7;
        org.telegram.ui.ActionBar.t6.U(x5Var, i10, h6Var);
        x5Var.setGravity((hd.a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(x5Var, c8.ma.d(-1, -1.0f, (hd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        x3 x3Var = new x3(getContext(), z10, z10, z10, 0);
        this.b = x3Var;
        x3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.b(0.9f, 420L, nr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(x3Var, i10, h6Var);
        x3Var.setGravity(hd.a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ma.d(-2, -1.0f, (hd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.c = d;
        addView(x3Var, d);
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
