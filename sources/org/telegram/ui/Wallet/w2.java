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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout {
    public final org.telegram.ui.Components.t5 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ z2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(z2 z2Var, Context context) {
        super(context);
        this.e = z2Var;
        this.a = new org.telegram.ui.Components.t5(this, 250L, gr.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, z2Var.I0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        z2 z2Var = this.e;
        Integer num = z2Var.m1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, z2Var.I0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = z2Var.i1.getViewPages();
        this.d = 0.0f;
        for (ag.j3 j3Var : viewPages) {
            if (j3Var != 0) {
                float i10 = Utilities.i(1.0f - Math.abs(j3Var.getTranslationX() / Math.max(1, j3Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f10 = this.d;
                boolean z10 = j3Var instanceof x2;
                if (z10) {
                    y2 y2Var = (y2) ((x2) j3Var);
                    f7 = Math.max(0.0f, y2Var.getHeight() - y2Var.a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * i10) + f10;
                if (j3Var.getVisibility() == 0 && z10) {
                }
            }
        }
        float e = this.a.e(false, this.d <= ((float) org.telegram.messenger.i0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.i0.m, this.d) - (org.telegram.messenger.i0.m * e);
        this.d = max;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(z2Var.t0, max, getWidth() - z2Var.t0, org.telegram.messenger.i0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.i0.W1(e, org.telegram.messenger.i0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (z2Var.E != null) {
            z2Var.E.setTranslationY(Math.max((z2Var.b.getY() + this.d) + z2Var.s0, z2Var.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m)) - z2Var.E.getBottom());
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        z2 z2Var = this.e;
        FrameLayout frameLayout = z2Var.l1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = z2Var.l1.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        z2Var.i1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
