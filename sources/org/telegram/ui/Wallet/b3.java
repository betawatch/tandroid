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
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b3 extends FrameLayout {
    public final org.telegram.ui.Components.c6 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ e3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e3 e3Var, Context context) {
        super(context);
        this.e = e3Var;
        this.a = new org.telegram.ui.Components.c6(this, 250L, kr.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, e3Var.J0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        e3 e3Var = this.e;
        Integer num = e3Var.q1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, e3Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = e3Var.m1.getViewPages();
        this.d = 0.0f;
        for (ai.i0 i0Var : viewPages) {
            if (i0Var != 0) {
                float i7 = Utilities.i(1.0f - Math.abs(i0Var.getTranslationX() / Math.max(1, i0Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = i0Var instanceof c3;
                if (z10) {
                    d3 d3Var = (d3) ((c3) i0Var);
                    f10 = Math.max(0.0f, d3Var.getHeight() - d3Var.a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f11;
                if (i0Var.getVisibility() == 0 && z10) {
                }
            }
        }
        float e10 = this.a.e(false, this.d <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.g0.m, this.d) - (org.telegram.messenger.g0.m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(e3Var.u0, max, getWidth() - e3Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (e3Var.F != null) {
            e3Var.F.setTranslationY(Math.max((e3Var.b.getY() + this.d) + e3Var.t0, e3Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - e3Var.F.getBottom());
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
        e3 e3Var = this.e;
        FrameLayout frameLayout = e3Var.p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = e3Var.p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        e3Var.m1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
