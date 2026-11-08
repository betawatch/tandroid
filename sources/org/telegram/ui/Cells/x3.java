package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.Components.q5 a;
    public final w3 b;
    public final FrameLayout.LayoutParams c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public boolean f;

    public x3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(16, context, f6Var);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.e), TLObject.FLAG_30));
    }

    public void setLayerHeight(int i7) {
        this.e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z9) {
        this.f = z9;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
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
        w3 w3Var = this.b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.q5 q5Var = this.a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        org.telegram.ui.ActionBar.r6.V(q5Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.Z(this.b, i7, f6Var);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        boolean z9 = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        setBackgroundColor(z9 ? 0 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, f6Var));
        int i7 = org.telegram.ui.ActionBar.k6.f7;
        this.a.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
    }

    public x3(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 32;
        this.d = f6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, this, f6Var);
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(getContext());
        this.a = q5Var;
        boolean z9 = true;
        q5Var.setTextSize(1, 14.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.r6.V(q5Var, i10, f6Var);
        q5Var.setGravity((id.a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(q5Var, c8.ha.d(-1, -1.0f, (id.a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), z9, z9, z9, 0);
        this.b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(w3Var, i10, f6Var);
        w3Var.setGravity(id.a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, (id.a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.a;
        new r0.v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
