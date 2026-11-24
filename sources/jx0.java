// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jx0 extends View implements tjb {
    public final /* synthetic */ lx0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(lx0 lx0Var, Context context) {
        super(context);
        this.a = lx0Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.n);
        setTranslationY(gl.n);
    }

    @Override // tjb
    public final void updateColors() {
        lx0 lx0Var = this.a;
        Paint paint = lx0Var.d;
        try {
            vx0 vx0Var = lx0Var.a;
            if (vx0Var != null) {
                int e = vx0Var.e(bkb.w0(null, bkb.Z6, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    gl.p3(lx0Var, e, true, null);
                    gl.j3(lx0Var, gl.B(e) >= 0.721f);
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
