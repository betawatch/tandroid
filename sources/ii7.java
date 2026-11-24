// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ii7 extends FrameLayout {
    public final lm a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ ki7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii7(ki7 ki7Var, Context context) {
        super(context);
        this.e = ki7Var;
        this.a = new lm(250L, this, s33.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(bkb.v0(bkb.g5, ki7Var.J0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ki7 ki7Var = this.e;
        Integer num = ki7Var.p1;
        int intValue = num != null ? num.intValue() : bkb.v0(bkb.g5, ki7Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = ki7Var.l1.getViewPages();
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f2 = this.d;
                if (view instanceof ji7) {
                    ji7 ji7Var = (ji7) view;
                    f = Math.max(0.0f, ji7Var.getHeight() - ji7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f2;
                view.getVisibility();
            }
        }
        float e = this.a.e(false, this.d <= ((float) gl.m) ? 1.0f : 0.0f);
        float max = Math.max(gl.m, this.d) - (gl.m * e);
        this.d = max;
        RectF rectF = gl.P;
        rectF.set(ki7Var.u0, max, getWidth() - ki7Var.u0, gl.L(8.0f) + getHeight());
        float U1 = gl.U1(e, gl.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (ki7Var.F != null) {
            ki7Var.F.setTranslationY(Math.max((ki7Var.b.getY() + this.d) + ki7Var.t0, ki7Var.F.getHeight() + (gl.L(56.0f) + gl.m)) - ki7Var.F.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.d) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.dismiss();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ki7 ki7Var = this.e;
        FrameLayout frameLayout = ki7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
            i3 = ki7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        ki7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
