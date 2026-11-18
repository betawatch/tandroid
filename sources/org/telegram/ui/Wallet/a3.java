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
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a3 extends FrameLayout {
    public final org.telegram.ui.Components.c6 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ d3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d3 d3Var, Context context) {
        super(context);
        this.e = d3Var;
        this.a = new org.telegram.ui.Components.c6(this, 250L, lr.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, d3Var.J0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        d3 d3Var = this.e;
        Integer num = d3Var.q1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, d3Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = d3Var.m1.getViewPages();
        this.d = 0.0f;
        for (ai.k1 k1Var : viewPages) {
            if (k1Var != 0) {
                float i7 = Utilities.i(1.0f - Math.abs(k1Var.getTranslationX() / Math.max(1, k1Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = k1Var instanceof b3;
                if (z10) {
                    c3 c3Var = (c3) ((b3) k1Var);
                    f10 = Math.max(0.0f, c3Var.getHeight() - c3Var.a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f11;
                if (k1Var.getVisibility() == 0 && z10) {
                }
            }
        }
        float e10 = this.a.e(false, this.d <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.g0.m, this.d) - (org.telegram.messenger.g0.m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(d3Var.u0, max, getWidth() - d3Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (d3Var.F != null) {
            d3Var.F.setTranslationY(Math.max((d3Var.b.getY() + this.d) + d3Var.t0, d3Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - d3Var.F.getBottom());
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
        d3 d3Var = this.e;
        FrameLayout frameLayout = d3Var.p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = d3Var.p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        d3Var.m1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
