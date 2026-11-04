package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class a0 extends View {
    public final org.telegram.ui.ActionBar.e6 a;
    public final b0 b;
    public final f01 c;
    public int d;
    public float e;

    public a0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        this.b = new b0(i3, context, e6Var);
        f01 f01Var = new f01(i3, this, e6Var, true);
        this.c = f01Var;
        f01Var.e = new ly0("", 14.0f, org.telegram.messenger.g0.o());
    }

    public final void a(float f10, int i3) {
        this.d = i3;
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
        int i3 = ((measuredWidth - b0Var.h) + sideMenuWidth) / 2;
        int L = org.telegram.messenger.g0.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f10 = sideMenuWidth;
        float f11 = f10 / 2.0f;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (e6Var != null) {
            e6Var.b(f11, this.e, measuredWidth2, this.d);
        } else {
            org.telegram.ui.ActionBar.k6.r(f11, this.e, measuredWidth2, this.d);
        }
        this.c.c(canvas, getWidth(), f10, 0.0f, 1.0f, 1.0f, false);
        b0Var.setBounds(i3, L, b0Var.h + i3, b0Var.i + L);
        b0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), org.telegram.messenger.camera.q.B(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        b0 b0Var = this.b;
        ly0 ly0Var = b0Var.d;
        TLRPC.User a22 = hp.s1(b0Var.b).a2(Long.valueOf(j10));
        ly0 ly0Var2 = b0Var.e;
        ly0Var2.m(1);
        ly0Var2.p(9999.0f);
        ly0Var2.q(bd.a0(null, null, 2131753070, l10.p(a22)));
        float b10 = (ly0Var2.b() / 2.0f) * 1.2f;
        ly0Var2.m(4);
        float f10 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        ly0Var2.p(Math.min(f10, b10));
        if (ly0Var2.b.getLineCount() > 2) {
            ly0Var2.p(Math.min(f10, b10 * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, ly0Var2.b()), ly0Var.b()) + org.telegram.messenger.g0.L(32.0f), f10);
        float i3 = ly0Var2.i() + ly0Var.i() + org.telegram.messenger.g0.L(17.0f) + 0.0f + org.telegram.messenger.g0.L(70.0f) + org.telegram.messenger.g0.L(14.0f) + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(5.0f);
        b0Var.h = (int) min;
        b0Var.i = (int) i3;
    }
}
