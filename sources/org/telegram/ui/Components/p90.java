package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p90 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final h6 b;
    public final h6 c;

    public p90(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        h6 h6Var2 = new h6(true, true, true);
        this.b = h6Var2;
        wq wqVar = wq.h;
        h6Var2.n(0.3f, 430L, wqVar);
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        h6Var2.w(org.telegram.messenger.g0.L(18.0f));
        h6Var2.q(!org.telegram.messenger.id.a0);
        h6Var2.setCallback(this);
        Point point = org.telegram.messenger.g0.q;
        h6Var2.M = point.x;
        h6 h6Var3 = new h6(true, true, true);
        this.c = h6Var3;
        h6Var3.n(0.3f, 430L, wqVar);
        h6Var3.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
        h6Var3.w(org.telegram.messenger.g0.L(14.0f));
        h6Var3.q(!org.telegram.messenger.id.a0);
        h6Var3.setCallback(this);
        h6Var3.M = point.x;
    }

    public final void a(CharSequence charSequence, boolean z9) {
        this.c.t(charSequence, z9 && !org.telegram.messenger.id.a0, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.b.t(charSequence, z9 && !org.telegram.messenger.id.a0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        h6 h6Var = this.c;
        float W1 = org.telegram.messenger.g0.W1(h6Var.i(), L, L2);
        int paddingLeft = getPaddingLeft();
        int i7 = (int) W1;
        int L3 = i7 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + i7;
        h6 h6Var2 = this.b;
        h6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        h6Var2.draw(canvas);
        h6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        h6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            h6 h6Var = this.b;
            org.telegram.ui.ActionBar.h6 h6Var2 = this.a;
            if (h6Var != null) {
                h6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var2));
            }
            h6 h6Var3 = this.c;
            if (h6Var3 != null) {
                h6Var3.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var2));
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
