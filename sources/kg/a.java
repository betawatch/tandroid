package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements t0 {
    public final p6 a;
    public final tk0 b;
    public final s4.a0 c;

    public a(Context context, p6 p6Var) {
        super(context);
        this.a = p6Var;
        tk0 tk0Var = new tk0(context, p6Var);
        this.b = tk0Var;
        tk0Var.setNestedScrollingEnabled(true);
        tk0Var.setAdapter(a());
        s4.a0 a0Var = new s4.a0(1, false);
        this.c = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setClipToPadding(false);
        addView(tk0Var, b6.c(-1.0f, -1));
    }

    public abstract s4.g0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint W0 = t6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = t6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, W0);
    }

    @Override // kg.t0
    public void setOffset(float f7) {
        if (Math.abs(f7 / getMeasuredWidth()) == 1.0f) {
            tk0 tk0Var = this.b;
            if (tk0Var.K(0) == null || tk0Var.K(0).a.getTop() != tk0Var.getPaddingTop()) {
                tk0Var.v0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
