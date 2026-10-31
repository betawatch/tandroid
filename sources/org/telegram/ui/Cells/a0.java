package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.p6 a;
    public final b0 b;
    public final l11 c;
    public int d;
    public float e;

    public a0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        this.b = new b0(i10, context, p6Var);
        l11 l11Var = new l11(i10, this, p6Var, true);
        this.c = l11Var;
        l11Var.e = new qz0("", 14.0f, org.telegram.messenger.i0.o());
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), z20.B(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.b;
        qz0 qz0Var = b0Var.d;
        TLRPC.User Z1 = vp.r1(b0Var.b).Z1(Long.valueOf(j10));
        qz0 qz0Var2 = b0Var.e;
        qz0Var2.m(1);
        qz0Var2.p(9999.0f);
        qz0Var2.q(cd.a0(null, null, 2131753070, h20.p(Z1)));
        float b10 = (qz0Var2.b() / 2.0f) * 1.2f;
        qz0Var2.m(4);
        float f7 = (int) (org.telegram.messenger.i0.q.x * 0.95f);
        qz0Var2.p(Math.min(f7, b10));
        if (qz0Var2.b.getLineCount() > 2) {
            qz0Var2.p(Math.min(f7, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, qz0Var2.b()), qz0Var.b()) + org.telegram.messenger.i0.L(32.0f), f7);
        float i10 = qz0Var2.i() + qz0Var.i() + org.telegram.messenger.i0.L(17.0f) + 0.0f + org.telegram.messenger.i0.L(70.0f) + org.telegram.messenger.i0.L(14.0f) + org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(2.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) i10;
    }
}
