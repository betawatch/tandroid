// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dt5 extends vbc {
    public float f;
    public float h;
    public final Paint n;
    public float r;
    public ko9 s;
    public final /* synthetic */ lt5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt5(lt5 lt5Var, Context context) {
        super(lt5Var, context);
        this.w = lt5Var;
        this.n = new Paint();
    }

    @Override // vbc, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lt5 lt5Var = this.w;
        lt5Var.P1.setTranslationY(hl.L(64.0f) + hl.L(6.0f) + (lt5Var.x1 - lt5Var.t0));
        float f = lt5Var.i2 + lt5Var.o2;
        z2b z2bVar = lt5Var.t1;
        if (z2bVar.getVisibility() != 0) {
            this.f = f;
            this.h = f;
        } else {
            float f2 = this.h;
            if (f2 != f) {
                this.h = f;
                this.r = (f - this.f) * 0.10666667f;
            } else {
                f = f2;
            }
        }
        float f3 = this.f;
        if (f3 != f) {
            float f4 = this.r;
            float f5 = f3 + f4;
            this.f = f5;
            if (f4 > 0.0f && f5 > f) {
                this.f = f;
            } else if (f4 >= 0.0f || f5 >= f) {
                invalidate();
            } else {
                this.f = f;
            }
        }
        z2bVar.setTranslationY(lt5Var.x1 + this.f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        lt5 lt5Var = this.w;
        if (view != lt5Var.P1) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0.0f, view.getY() - hl.L(4.0f), getMeasuredWidth(), view.getY() + lt5Var.e2 + 1.0f);
        canvas.drawColor(vm2.o(aob.w0(null, aob.d6, false), (int) (lt5Var.b2 * 255.0f)));
        int o = vm2.o(aob.w0(null, aob.d7, false), (int) (lt5Var.b2 * 255.0f));
        Paint paint = this.n;
        paint.setColor(o);
        canvas.drawRect(0.0f, view.getY() + lt5Var.e2, getMeasuredWidth(), view.getY() + lt5Var.e2 + 1.0f, paint);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ko9 ko9Var = this.s;
        if (ko9Var != null) {
            ((bec) ko9Var.b).b = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (view == this.w.n2 && this.s == null) {
            this.s = new ko9(view);
        }
    }
}
