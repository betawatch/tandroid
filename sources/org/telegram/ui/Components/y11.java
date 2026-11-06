package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y11 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ e21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y11(e21 e21Var, Context context) {
        super(context);
        this.d = e21Var;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e21Var.I0));
        org.telegram.ui.ActionBar.k6.n(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e21 e21Var = this.d;
        float L0 = e21Var.L0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.j9.a(L0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        e21Var.t1.setTranslationY(Math.max(org.telegram.messenger.g0.m, L0));
        boolean z9 = L0 <= ((float) org.telegram.messenger.g0.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z9) {
            this.c = Boolean.valueOf(z9);
            org.telegram.messenger.g0.s3(e21Var.getWindow(), org.telegram.messenger.g0.B(z9 ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e21Var.I0) : org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, e21Var.I0), 855638016)) > 0.721f);
        }
        e21Var.E.setTranslationY(Math.max(e21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, L0) + getTranslationY() + ((-r1.getTop()) - e21Var.E.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e21 e21Var = this.d;
        if (e21Var.F1 != null && e21Var.G1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + e21Var.F1.x());
            }
            if (e21Var.F1.x() && e21Var.G1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = e21Var.G1.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b10);
            }
            if (b10) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new fi.r7(9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        e21 e21Var = this.d;
        e21Var.E.setTranslationY(Math.max(e21Var.E.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, e21Var.L0(true)) + ((-r1.getTop()) - e21Var.E.getHeight()) + f10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.b.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.d.I0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
