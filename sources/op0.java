// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class op0 extends View {
    public final ylb a;
    public final pp0 b;
    public final bwb c;
    public int d;
    public float e;

    public op0(int i, ylb ylbVar, Context context) {
        super(context);
        this.a = ylbVar;
        this.b = new pp0(i, ylbVar, context);
        bwb bwbVar = new bwb(i, this, ylbVar, true);
        this.c = bwbVar;
        bwbVar.e = new uib("", 14.0f, gm.o());
    }

    public final void a(float f, int i) {
        this.d = i;
        this.e = f;
    }

    public int getSideMenuWidth() {
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int sideMenuWidth = getSideMenuWidth();
        int measuredWidth = getMeasuredWidth();
        pp0 pp0Var = this.b;
        int i = ((measuredWidth - pp0Var.h) + sideMenuWidth) / 2;
        int L = gm.L(34.0f);
        int measuredWidth2 = getMeasuredWidth();
        float f = sideMenuWidth;
        float f2 = f / 2.0f;
        int i2 = this.d;
        float f3 = this.e;
        ylb ylbVar = this.a;
        if (ylbVar != null) {
            ylbVar.b(f2, f3, measuredWidth2, i2);
        } else {
            cmb.q(f2, f3, measuredWidth2, i2);
        }
        this.c.c(canvas, getWidth(), f, 0.0f, 1.0f, 1.0f, false);
        pp0Var.setBounds(i, L, pp0Var.h + i, pp0Var.i + L);
        pp0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), wi8.E(40.0f, this.b.i, TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        pp0 pp0Var = this.b;
        uib uibVar = pp0Var.d;
        TLRPC.User W1 = oc7.r1(pp0Var.b).W1(Long.valueOf(j));
        uib uibVar2 = pp0Var.e;
        uibVar2.l(1);
        uibVar2.o(9999.0f);
        uibVar2.p(jb6.a0(null, null, 2131753035, m9c.r(W1)));
        float b = (uibVar2.b() / 2.0f) * 1.2f;
        uibVar2.l(4);
        float f = (int) (gm.q.x * 0.95f);
        uibVar2.o(Math.min(f, b));
        if (uibVar2.b.getLineCount() > 2) {
            uibVar2.o(Math.min(f, b * 1.2f));
        }
        float min = Math.min(Math.max(Math.max(0.0f, uibVar2.b()), uibVar.b()) + gm.L(32.0f), f);
        float h = uibVar2.h() + uibVar.h() + gm.L(17.0f) + 0.0f + gm.L(70.0f) + gm.L(14.0f) + gm.L(4.0f) + gm.L(2.0f) + gm.L(20.0f) + gm.L(5.0f);
        pp0Var.h = (int) min;
        pp0Var.i = (int) h;
    }
}
