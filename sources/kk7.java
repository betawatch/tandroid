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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kk7 extends FrameLayout {
    public final ln a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ mk7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk7(mk7 mk7Var, Context context) {
        super(context);
        this.e = mk7Var;
        this.a = new ln(250L, this, d53.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(cmb.v0(cmb.g5, mk7Var.J0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        mk7 mk7Var = this.e;
        Integer num = mk7Var.p1;
        int intValue = num != null ? num.intValue() : cmb.v0(cmb.g5, mk7Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = mk7Var.l1.getViewPages();
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float i = Utilities.i(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f2 = this.d;
                if (view instanceof lk7) {
                    lk7 lk7Var = (lk7) view;
                    f = Math.max(0.0f, lk7Var.getHeight() - lk7Var.a.getMeasuredHeight());
                } else {
                    f = 0.0f;
                }
                this.d = (f * i) + f2;
                view.getVisibility();
            }
        }
        float e = this.a.e(false, this.d <= ((float) gm.m) ? 1.0f : 0.0f);
        float max = Math.max(gm.m, this.d) - (gm.m * e);
        this.d = max;
        RectF rectF = gm.P;
        rectF.set(mk7Var.u0, max, getWidth() - mk7Var.u0, gm.L(8.0f) + getHeight());
        float U1 = gm.U1(e, gm.L(14.0f), 0);
        canvas.drawRoundRect(rectF, U1, U1, paint);
        if (mk7Var.F != null) {
            mk7Var.F.setTranslationY(Math.max((mk7Var.b.getY() + this.d) + mk7Var.t0, mk7Var.F.getHeight() + (gm.L(56.0f) + gm.m)) - mk7Var.F.getBottom());
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
        mk7 mk7Var = this.e;
        FrameLayout frameLayout = mk7Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), 0);
            i3 = mk7Var.o1.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        mk7Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i3), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
