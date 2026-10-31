package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y1 extends View implements org.telegram.ui.ActionBar.k6 {
    public final x51 a;
    public final org.telegram.ui.ActionBar.p6 b;
    public int c;
    public int d;
    public l1 e;
    public float f;
    public int h;

    public y1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = p6Var;
        x51 x51Var = new x51();
        this.a = x51Var;
        x51Var.setCallback(this);
        x51Var.n = cd.L0(2131743853, null);
        x51Var.o = cd.L0(2131743854, null);
        x51Var.p = cd.L0(2131743852, null);
        x51Var.j = new f(this, 1);
    }

    public final void a(Canvas canvas) {
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        if (p6Var != null) {
            p6Var.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            org.telegram.ui.ActionBar.t6.r(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = org.telegram.messenger.i0.L(18.0f);
        float L2 = org.telegram.messenger.i0.L(6.0f);
        float L3 = org.telegram.messenger.i0.L(18.0f) + this.c;
        float L4 = org.telegram.messenger.i0.L(6.0f) + this.d;
        float L5 = org.telegram.messenger.i0.L(18.0f);
        float L6 = org.telegram.messenger.i0.L(18.0f);
        Paint d = p6Var != null ? p6Var.d("paintChatActionBackground") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, d);
        if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
            canvas.drawRoundRect(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(18.0f) + this.c, org.telegram.messenger.i0.L(6.0f) + this.d, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.h2);
        }
    }

    public final void b(float f7, int i10) {
        this.f = f7;
        this.h = i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(18.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int L3 = org.telegram.messenger.i0.L(18.0f) + this.c;
        int L4 = org.telegram.messenger.i0.L(6.0f) + this.d;
        x51 x51Var = this.a;
        x51Var.setBounds(L, L2, L3, L4);
        x51Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = size - org.telegram.messenger.i0.L(36.0f);
        this.c = L;
        int a2 = this.a.a(L);
        this.d = a2;
        setMeasuredDimension(size, org.telegram.messenger.i0.L(12.0f) + a2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(l1 l1Var) {
        this.e = l1Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.a.b();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
