package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class b extends FrameLayout implements l1 {
    public final c6 a;
    public final zk0 b;
    public final f2.k0 c;

    public b(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        zk0 zk0Var = new zk0(context, c6Var);
        this.b = zk0Var;
        zk0Var.setNestedScrollingEnabled(true);
        zk0Var.setAdapter(a());
        f2.k0 k0Var = new f2.k0(1, false);
        this.c = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setClipToPadding(false);
        addView(zk0Var, z5.c(-1.0f, -1));
    }

    public abstract f2.q0 a();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Paint T0 = g6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = g6.k0;
        }
        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, T0);
    }

    @Override // ag.l1
    public void setOffset(float f10) {
        if (Math.abs(f10 / getMeasuredWidth()) == 1.0f) {
            zk0 zk0Var = this.b;
            if (zk0Var.K(0) == null || zk0Var.K(0).a.getTop() != zk0Var.getPaddingTop()) {
                zk0Var.u0(0);
            }
        }
    }

    public void setTopOffset(int i10) {
        this.b.setPadding(0, i10, 0, 0);
    }
}
