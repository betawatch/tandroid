package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.f6 a;
    public final b0 b;
    public final g01 c;
    public int d;
    public float e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        this.b = new b0(i7, context, f6Var);
        g01 g01Var = new g01(i7, this, f6Var, true);
        this.c = g01Var;
        g01Var.e = new my0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i7) {
        this.d = i7;
        this.e = f10;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        b0 b0Var = this.b;
        int i7 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (f6Var != null) {
            f6Var.b(f11, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(f11, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.i + L);
        b0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.b;
        my0 my0Var = b0Var.d;
        TLRPC.User a22 = qp.s1(b0Var.b).a2(Long.valueOf(j3));
        my0 my0Var2 = b0Var.e;
        my0Var2.m(1);
        my0Var2.p(9999.0f);
        my0Var2.q(id.a0(null, null, 2131753070, t10.p(a22)));
        float b10 = (my0Var2.b() / 2.0f) * 1.2f;
        my0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        my0Var2.p(Math.min(f10, b10));
        if (my0Var2.b.getLineCount() > 2) {
            my0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, my0Var2.b()), my0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = my0Var2.i() + my0Var.i() + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) i7;
    }
}
