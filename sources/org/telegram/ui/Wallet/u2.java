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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u2 extends FrameLayout {
    public final org.telegram.ui.Components.u5 a;
    public final Paint b;
    public final Path c;
    public float d;
    public final /* synthetic */ x2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, Context context) {
        super(context);
        this.e = x2Var;
        this.a = new org.telegram.ui.Components.u5(this, 250L, xq.h);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, x2Var.J0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        x2 x2Var = this.e;
        Integer num = x2Var.n1;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, x2Var.J0);
        Paint paint = this.b;
        paint.setColor(intValue);
        View[] viewPages = x2Var.j1.getViewPages();
        this.d = 0.0f;
        for (ai.f fVar : viewPages) {
            if (fVar != 0) {
                float i3 = Utilities.i(1.0f - Math.abs(fVar.getTranslationX() / Math.max(1, fVar.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = fVar instanceof v2;
                if (z10) {
                    w2 w2Var = (w2) ((v2) fVar);
                    f10 = Math.max(0.0f, w2Var.getHeight() - w2Var.a.getMeasuredHeight());
                } else {
                    f10 = 0.0f;
                }
                this.d = (f10 * i3) + f11;
                if (fVar.getVisibility() == 0 && z10) {
                }
            }
        }
        float e10 = this.a.e(false, this.d <= ((float) org.telegram.messenger.g0.m) ? 1.0f : 0.0f);
        float max = Math.max(org.telegram.messenger.g0.m, this.d) - (org.telegram.messenger.g0.m * e10);
        this.d = max;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(x2Var.u0, max, getWidth() - x2Var.u0, org.telegram.messenger.g0.L(8.0f) + getHeight());
        float W1 = org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(14.0f), 0);
        canvas.drawRoundRect(rectF, W1, W1, paint);
        if (x2Var.F != null) {
            x2Var.F.setTranslationY(Math.max((x2Var.b.getY() + this.d) + x2Var.t0, x2Var.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - x2Var.F.getBottom());
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        x2 x2Var = this.e;
        FrameLayout frameLayout = x2Var.m1;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = x2Var.m1.getMeasuredHeight();
        } else {
            i11 = 0;
        }
        x2Var.j1.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i11), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
