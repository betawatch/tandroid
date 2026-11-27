// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j78 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ r78 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j78(r78 r78Var, Activity activity, Activity activity2) {
        super(activity);
        this.d = r78Var;
        this.c = activity2;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        r78 r78Var = this.d;
        Paint paint = r78Var.u1;
        int i = r78Var.v1 - r78Var.t0;
        int L = hl.L(30.0f) + getMeasuredHeight() + r78Var.t0;
        float L2 = hl.L(12.0f);
        int i2 = r78Var.t0;
        float min = ((float) (i + i2)) < L2 ? 1.0f - Math.min(1.0f, ((L2 - i) - i2) / L2) : 1.0f;
        int i3 = hl.m;
        int i4 = i + i3;
        r78Var.s0.setBounds(0, i4, getMeasuredWidth(), L - i3);
        r78Var.s0.draw(canvas);
        if (min != 1.0f) {
            paint.setColor(aob.v0(aob.h5, r78Var.J0));
            float f = r78Var.u0;
            float f2 = r78Var.t0 + i4;
            float measuredWidth = getMeasuredWidth() - r78Var.u0;
            float L3 = hl.L(24.0f) + r78Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(f, f2, measuredWidth, L3);
            float f3 = L2 * min;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        int v0 = aob.v0(aob.h5, r78Var.J0);
        paint.setColor(Color.argb((int) (r78Var.o1.getAlpha() * 255.0f), (int) (Color.red(v0) * 0.8f), (int) (Color.green(v0) * 0.8f), (int) (Color.blue(v0) * 0.8f)));
        canvas.drawRect(r78Var.u0, 0.0f, getMeasuredWidth() - r78Var.u0, hl.m, paint);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            r78 r78Var = this.d;
            if (r78Var.v1 != 0 && motionEvent.getY() < r78Var.v1 && r78Var.o1.getAlpha() == 0.0f) {
                r78Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        r78 r78Var = this.d;
        r78Var.t1 = true;
        super.onLayout(z, i, i2, i3, i4);
        r78Var.t1 = false;
        r78Var.F0(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        this.b = true;
        r78 r78Var = this.d;
        k78 k78Var = r78Var.m1;
        int i3 = r78Var.u0;
        setPadding(i3, hl.m, i3, 0);
        this.b = false;
        int paddingTop = size - getPaddingTop();
        View.MeasureSpec.getSize(i);
        ((FrameLayout.LayoutParams) r78Var.p1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        this.b = true;
        int L = hl.L(80.0f);
        xh4 xh4Var = r78Var.l1;
        int i4 = ((r78) xh4Var.b).y1;
        for (int i5 = 0; i5 < i4; i5++) {
            ViewGroup y = xh4Var.y(this.c, i5);
            y.measure(i, 0);
            L += y.getMeasuredHeight();
        }
        int i6 = L < paddingTop ? paddingTop - L : paddingTop / 5;
        if (k78Var.getPaddingTop() != i6) {
            k78Var.getPaddingTop();
            k78Var.setPadding(0, i6, 0, 0);
        }
        this.b = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
