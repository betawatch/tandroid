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
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class t2 extends FrameLayout {
    public final org.telegram.ui.Components.u5 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ w2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var, Context context) {
        super(context);
        this.e = w2Var;
        this.a = new org.telegram.ui.Components.u5(this, 250L, er.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, w2Var.J0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        w2 w2Var = this.e;
        Integer num = w2Var.q1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, w2Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = w2Var.m1.getViewPages();
        this.d = 0.0f;
        for (ai.j1 j1Var : viewPages) {
            if (j1Var != 0) {
                float i7 = Utilities.i(1.0f - Math.abs(j1Var.getTranslationX() / Math.max(1, j1Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = j1Var instanceof u2;
                if (z10) {
                    v2 v2Var = (v2) ((u2) j1Var);
                    f10 = Math.max(0.0f, v2Var.getHeight() - v2Var.a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i7) + f11;
                if (j1Var.getVisibility() == 0 && z10) {
                }
            }
        }
        float e10 = this.a.e(false, this.d <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.g0.m, this.d) - (org.telegram.messenger.g0.m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(w2Var.u0, max, getWidth() - w2Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (w2Var.F != null) {
            w2Var.F.setTranslationY(Math.max((w2Var.b.getY() + this.d) + w2Var.t0, w2Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - w2Var.F.getBottom());
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
        w2 w2Var = this.e;
        FrameLayout frameLayout = w2Var.p1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = w2Var.p1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        w2Var.m1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
