// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class a44 extends FrameLayout {
    public boolean a;
    public final z34 b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public a44(Context context, z34 z34Var) {
        super(context);
        this.b = z34Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a && (view instanceof s39)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof rlb)) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z34 z34Var = this.b;
        h44 L = z34Var.L();
        if (L == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            L.n = false;
            L.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            L.n = false;
            L.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.c || dte.a(x, y, this.d, this.e) > hl.e) {
                this.c = true;
                L.n = true;
                L.e(x - this.d, y - this.e);
                this.d = x;
                this.e = y;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            L.n = false;
            L.r = true;
            if (!this.c) {
                z34Var.e();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
