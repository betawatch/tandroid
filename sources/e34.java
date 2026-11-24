// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class e34 extends FrameLayout {
    public boolean a;
    public final d34 b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public e34(Context context, d34 d34Var) {
        super(context);
        this.b = d34Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a && (view instanceof e09)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (!(view instanceof vhb)) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d34 d34Var = this.b;
        l34 A = d34Var.A();
        if (A == null) {
            return false;
        }
        if (motionEvent.getPointerCount() != 1) {
            A.n = false;
            A.r = true;
            this.c = false;
            this.f = true;
            invalidate();
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            A.n = false;
            A.r = false;
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.f = false;
            return true;
        }
        if (!this.f && actionMasked == 2) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.c || loe.a(x, y, this.d, this.e) > gl.e) {
                this.c = true;
                A.n = true;
                A.e(x - this.d, y - this.e);
                this.d = x;
                this.e = y;
                return true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            A.n = false;
            A.r = true;
            if (!this.c) {
                d34Var.u();
            }
            invalidate();
            return false;
        }
        return true;
    }
}
