// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class lg0 extends FrameLayout implements wu7 {
    public final vnb a;
    public final d79 b;
    public final x46 c;

    public lg0(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        d79 d79Var = new d79(context, vnbVar);
        this.b = d79Var;
        d79Var.setNestedScrollingEnabled(true);
        d79Var.setAdapter(a());
        x46 x46Var = new x46(1, false);
        this.c = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setClipToPadding(false);
        addView(d79Var, tre.c(-1.0f, -1));
    }

    public j79 a() {
        return new ox0(this, (byte) 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint U0 = aob.U0("paintDivider", this.a);
        if (U0 == null) {
            U0 = aob.j0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, U0);
    }

    @Override // wu7
    public void setOffset(float f) {
        if (Math.abs(f / getMeasuredWidth()) == 1.0f) {
            d79 d79Var = this.b;
            if (d79Var.L(0) == null || d79Var.L(0).a.getTop() != d79Var.getPaddingTop()) {
                d79Var.x0(0);
            }
        }
    }

    public void setTopOffset(int i) {
        this.b.setPadding(0, i, 0, 0);
    }
}
