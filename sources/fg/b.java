package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements x0 {
    public final g6 a;
    public final tl0 b;
    public final f2.j0 c;

    public b(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        tl0 tl0Var = new tl0(context, g6Var);
        this.b = tl0Var;
        tl0Var.setNestedScrollingEnabled(true);
        tl0Var.setAdapter(a());
        f2.j0 j0Var = new f2.j0(1, false);
        this.c = j0Var;
        tl0Var.setLayoutManager(j0Var);
        tl0Var.setClipToPadding(false);
        addView(tl0Var, c6.c(-1.0f, -1));
    }

    public abstract f2.p0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = k6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = k6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // fg.x0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            tl0 tl0Var = this.b;
            if (tl0Var.K(0) == null || tl0Var.K(0).a.getTop() != tl0Var.getPaddingTop()) {
                tl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
