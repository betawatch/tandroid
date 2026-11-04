package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.Components.o5 a;
    public final w3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int e;
    public boolean f;

    public x3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(16, context, e6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        w3 w3Var = this.b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i3) {
        this.e = i3;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i3) {
        float f10 = i3;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        w3 w3Var = this.b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i3) {
        org.telegram.ui.Components.o5 o5Var = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.r6.V(o5Var, i3, e6Var);
        org.telegram.ui.ActionBar.r6.Z(this.b, i3, e6Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        boolean z10 = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        setBackgroundColor(z10 ? 0 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, e6Var));
        int i3 = org.telegram.ui.ActionBar.k6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
    }

    public x3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 32;
        this.d = e6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, this, e6Var);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(getContext());
        this.a = o5Var;
        boolean z10 = true;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.r6.V(o5Var, i10, e6Var);
        o5Var.setGravity((bd.a0 ? 5 : 3) | 16);
        float f10 = i3;
        addView(o5Var, mf.d(-1, -1.0f, (bd.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), z10, z10, z10, 0);
        this.b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(w3Var, i10, e6Var);
        w3Var.setGravity(bd.a0 ? 3 : 5);
        FrameLayout.LayoutParams d = mf.d(-2, -1.0f, (bd.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
