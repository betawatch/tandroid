package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ea0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final n6 b;
    public final n6 c;

    public ea0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        n6 n6Var = new n6(true, true, true);
        this.b = n6Var;
        nr nrVar = nr.h;
        n6Var.n(0.3f, 430L, nrVar);
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        n6Var.w(org.telegram.messenger.g0.L(18.0f));
        n6Var.q(!org.telegram.messenger.gd.a0);
        n6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.q;
        n6Var.N = point.x;
        n6 n6Var2 = new n6(true, true, true);
        this.c = n6Var2;
        n6Var2.n(0.3f, 430L, nrVar);
        n6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
        n6Var2.w(org.telegram.messenger.g0.L(14.0f));
        n6Var2.q(!org.telegram.messenger.gd.a0);
        n6Var2.setCallback(this);
        n6Var2.N = point.x;
    }

    public final void a(CharSequence charSequence, boolean z10) {
        this.c.t(charSequence, z10 && !org.telegram.messenger.gd.a0, true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.b.t(charSequence, z10 && !org.telegram.messenger.gd.a0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        n6 n6Var = this.c;
        float W1 = org.telegram.messenger.g0.W1(n6Var.i(), L, L2);
        int paddingLeft = getPaddingLeft();
        int i7 = (int) W1;
        int L3 = i7 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + i7;
        n6 n6Var2 = this.b;
        n6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        n6Var2.draw(canvas);
        n6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        n6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            n6 n6Var = this.b;
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
            }
            n6 n6Var2 = this.c;
            if (n6Var2 != null) {
                n6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }
}
