package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.i6 a;
    public final b0 b;
    public final q01 c;
    public int d;
    public float e;

    public a0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = i6Var;
        this.b = new b0(i7, context, i6Var);
        q01 q01Var = new q01(i7, this, i6Var, true);
        this.c = q01Var;
        q01Var.e = new vy0("", 14.0f, org.telegram.messenger.g0.o());
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
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        if (i6Var != null) {
            i6Var.e(f11, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.n6.r(f11, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i7, L, b0Var.h + i7, b0Var.i + L);
        b0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), n10.C(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        b0 b0Var = this.b;
        vy0 vy0Var = b0Var.d;
        TLRPC.User c22 = mp.u1(b0Var.b).c2(Long.valueOf(j3));
        vy0 vy0Var2 = b0Var.e;
        vy0Var2.m(1);
        vy0Var2.p(9999.0f);
        vy0Var2.q(gd.a0(null, null, 2131753068, o10.q(c22)));
        float b10 = (vy0Var2.b() / 2.0f) * 1.2f;
        vy0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        vy0Var2.p(Math.min(f10, b10));
        if (vy0Var2.b.getLineCount() > 2) {
            vy0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, vy0Var2.b()), vy0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i7 = vy0Var2.i() + vy0Var.i() + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) i7;
    }
}
