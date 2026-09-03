package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements x0 {
    public final f6 a;
    public final rl0 b;
    public final f2.i0 c;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        rl0 rl0Var = new rl0(context, f6Var);
        this.b = rl0Var;
        rl0Var.setNestedScrollingEnabled(true);
        rl0Var.setAdapter(a());
        f2.i0 i0Var = new f2.i0(1, false);
        this.c = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setClipToPadding(false);
        addView(rl0Var, b6.c(-1.0f, -1));
    }

    public abstract f2.o0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = j6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = j6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // eg.x0
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            rl0 rl0Var = this.b;
            if (rl0Var.K(0) == null || rl0Var.K(0).a.getTop() != rl0Var.getPaddingTop()) {
                rl0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
