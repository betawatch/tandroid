package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ia0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final e6 b;
    public final e6 c;

    public ia0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        e6 e6Var = new e6(true, true, true);
        this.b = e6Var;
        gr grVar = gr.h;
        e6Var.n(0.3f, 430L, grVar);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
        e6Var.w(org.telegram.messenger.i0.L(18.0f));
        e6Var.q(!org.telegram.messenger.cd.X);
        e6Var.setCallback(this);
        Point point = org.telegram.messenger.i0.q;
        e6Var.M = point.x;
        e6 e6Var2 = new e6(true, true, true);
        this.c = e6Var2;
        e6Var2.n(0.3f, 430L, grVar);
        e6Var2.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
        e6Var2.w(org.telegram.messenger.i0.L(14.0f));
        e6Var2.q(!org.telegram.messenger.cd.X);
        e6Var2.setCallback(this);
        e6Var2.M = point.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        this.c.t(charSequence, z10 && !org.telegram.messenger.cd.X, true);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.b.t(charSequence, z10 && !org.telegram.messenger.cd.X, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(29.0f);
        int L2 = org.telegram.messenger.i0.L(18.83f);
        e6 e6Var = this.c;
        float W1 = org.telegram.messenger.i0.W1(e6Var.i(), L, L2);
        int paddingLeft = getPaddingLeft();
        int i10 = (int) W1;
        int L3 = i10 - org.telegram.messenger.i0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.i0.L(32.0f) + i10;
        e6 e6Var2 = this.b;
        e6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        e6Var2.draw(canvas);
        e6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.i0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.i0.L(32.0f) + r0);
        e6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
        setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            e6 e6Var = this.b;
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            if (e6Var != null) {
                e6Var.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
            }
            e6 e6Var2 = this.c;
            if (e6Var2 != null) {
                e6Var2.u(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }
}
