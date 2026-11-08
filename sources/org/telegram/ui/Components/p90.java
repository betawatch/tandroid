package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p90 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final i6 b;
    public final i6 c;

    public p90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        i6 i6Var = new i6(true, true, true);
        this.b = i6Var;
        xq xqVar = xq.h;
        i6Var.n(0.3f, 430L, xqVar);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
        i6Var.w(org.telegram.messenger.g0.L(18.0f));
        i6Var.q(!org.telegram.messenger.id.a0);
        i6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.q;
        i6Var.M = point.x;
        i6 i6Var2 = new i6(true, true, true);
        this.c = i6Var2;
        i6Var2.n(0.3f, 430L, xqVar);
        i6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, f6Var));
        i6Var2.w(org.telegram.messenger.g0.L(14.0f));
        i6Var2.q(!org.telegram.messenger.id.a0);
        i6Var2.setCallback(this);
        i6Var2.M = point.x;
    }

    public final void a(CharSequence charSequence, boolean z9) {
        this.c.t(charSequence, z9 && !org.telegram.messenger.id.a0, true);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.b.t(charSequence, z9 && !org.telegram.messenger.id.a0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(29.0f);
        int L2 = org.telegram.messenger.g0.L(18.83f);
        i6 i6Var = this.c;
        float W1 = org.telegram.messenger.g0.W1(i6Var.i(), L, L2);
        int paddingLeft = getPaddingLeft();
        int i7 = (int) W1;
        int L3 = i7 - org.telegram.messenger.g0.L(32.0f);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int L4 = org.telegram.messenger.g0.L(32.0f) + i7;
        i6 i6Var2 = this.b;
        i6Var2.setBounds(paddingLeft, L3, measuredWidth, L4);
        i6Var2.draw(canvas);
        i6Var.setBounds(getPaddingLeft(), r0 - org.telegram.messenger.g0.L(32.0f), getMeasuredWidth() - getPaddingRight(), org.telegram.messenger.g0.L(32.0f) + r0);
        i6Var.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            i6 i6Var = this.b;
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            if (i6Var != null) {
                i6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, f6Var));
            }
            i6 i6Var2 = this.c;
            if (i6Var2 != null) {
                i6Var2.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, f6Var));
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
