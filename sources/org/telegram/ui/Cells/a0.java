package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.rz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.p6 a;
    public final b0 b;
    public final m11 c;
    public int d;
    public float e;

    public a0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        this.b = new b0(i10, context, p6Var);
        m11 m11Var = new m11(i10, this, p6Var, true);
        this.c = m11Var;
        m11Var.e = new rz0("", 14.0f, org.telegram.messenger.i0.o());
    }

    public final void a(float f7, int i10) {
        this.d = i10;
        this.e = f7;
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
        int i10 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.i0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f7 = sideMenuWidth;
        float f10 = f7 / 2.0f;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        if (p6Var != null) {
            p6Var.b(f10, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.t6.r(f10, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f7, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i10, L, b0Var.h + i10, b0Var.i + L);
        b0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), a30.B(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.b;
        rz0 rz0Var = b0Var.d;
        TLRPC.User Z1 = wp.r1(b0Var.b).Z1(Long.valueOf(j10));
        rz0 rz0Var2 = b0Var.e;
        rz0Var2.m(1);
        rz0Var2.p(9999.0f);
        rz0Var2.q(dd.a0(null, null, 2131753070, i20.p(Z1)));
        float b10 = (rz0Var2.b() / 2.0f) * 1.2f;
        rz0Var2.m(4);
        float f7 = (int) (org.telegram.messenger.i0.q.x * 0.95f);
        rz0Var2.p(Math.min(f7, b10));
        if (rz0Var2.b.getLineCount() > 2) {
            rz0Var2.p(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, rz0Var2.b()), rz0Var.b()) + org.telegram.messenger.i0.L(32.0f), f7);
        float i10 = rz0Var2.i() + rz0Var.i() + org.telegram.messenger.i0.L(17.0f) + 0.0f + org.telegram.messenger.i0.L(70.0f) + org.telegram.messenger.i0.L(14.0f) + org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(2.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) i10;
    }
}
