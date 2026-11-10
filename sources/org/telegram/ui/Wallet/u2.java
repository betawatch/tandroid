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
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class u2 extends FrameLayout {
    public final org.telegram.ui.Components.v5 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ x2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, Context context) {
        super(context);
        this.e = x2Var;
        this.a = new org.telegram.ui.Components.v5(this, 250L, wq.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, x2Var.I0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        x2 x2Var = this.e;
        Integer num = x2Var.p1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, x2Var.I0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = x2Var.l1.getViewPages();
        this.d = 0.0f;
        for (ai.i0 i0Var : viewPages) {
            if (i0Var != 0) {
                float i7 = Utilities.i(1.0f - Math.abs(i0Var.getTranslationX() / Math.max(1, i0Var.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z9 = i0Var instanceof v2;
                if (z9) {
                    w2 w2Var = (w2) ((v2) i0Var);
                    f10 = Math.max(0.0f, w2Var.getHeight() - w2Var.a.getMeasuredHeight());
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
        rectF.set(x2Var.t0, max, getWidth() - x2Var.t0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (x2Var.E != null) {
            x2Var.E.setTranslationY(Math.max((x2Var.b.getY() + this.d) + x2Var.s0, x2Var.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - x2Var.E.getBottom());
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
        x2 x2Var = this.e;
        FrameLayout frameLayout = x2Var.o1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = x2Var.o1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        x2Var.l1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
