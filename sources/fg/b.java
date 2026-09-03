package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements x0 {
    public final g6 a;
    public final sl0 b;
    public final f2.j0 c;

    public b(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        sl0 sl0Var = new sl0(context, g6Var);
        this.b = sl0Var;
        sl0Var.setNestedScrollingEnabled(true);
        sl0Var.setAdapter(a());
        f2.j0 j0Var = new f2.j0(1, false);
        this.c = j0Var;
        sl0Var.setLayoutManager(j0Var);
        sl0Var.setClipToPadding(false);
        addView(sl0Var, c6.c(-1.0f, -1));
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
            sl0 sl0Var = this.b;
            if (sl0Var.K(0) == null || sl0Var.K(0).a.getTop() != sl0Var.getPaddingTop()) {
                sl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
