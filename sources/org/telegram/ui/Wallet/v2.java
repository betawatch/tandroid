package org.telegram.ui.Wallet;

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
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class v2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ y2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(y2 y2Var, Context context) {
        super(context);
        this.e = y2Var;
        this.a = new org.telegram.ui.Components.w5(this, 250L, xq.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, y2Var.I0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        y2 y2Var = this.e;
        Integer num = y2Var.m1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, y2Var.I0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = y2Var.i1.getViewPages();
        this.d = 0.0f;
        for (ai.i0 i0Var : viewPages) {
            if (i0Var != 0) {
                float i7 = Utilities.i(1.0f - Math.abs(i0Var.getTranslationX() / Math.max(1, i0Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z9 = i0Var instanceof w2;
                if (z9) {
                    x2 x2Var = (x2) ((w2) i0Var);
                    f10 = Math.max(0.0f, x2Var.getHeight() - x2Var.a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f11;
                if (i0Var.getVisibility() == 0 && z9) {
                }
            }
        }
        float e10 = this.a.e(false, this.d <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.g0.m, this.d) - (org.telegram.messenger.g0.m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(y2Var.t0, max, getWidth() - y2Var.t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (y2Var.E != null) {
            y2Var.E.setTranslationY(Math.max((y2Var.b.getY() + this.d) + y2Var.s0, y2Var.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - y2Var.E.getBottom());
        }
        canvas.save();
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        y2 y2Var = this.e;
        FrameLayout frameLayout = y2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = y2Var.l1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        y2Var.i1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
