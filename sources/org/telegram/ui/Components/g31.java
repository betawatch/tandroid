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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ m31 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g31(m31 m31Var, Context context) {
        super(context);
        this.d = m31Var;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, m31Var.I0));
        org.telegram.ui.ActionBar.t6.n(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m31 m31Var = this.d;
        float L0 = m31Var.L0(true);
        float W1 = org.telegram.messenger.i0.W1(w7.u.a(L0 / org.telegram.messenger.i0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.i0.L(12.0f));
        m31Var.t1.setTranslationY(Math.max(org.telegram.messenger.i0.m, L0));
        boolean z10 = L0 <= ((float) org.telegram.messenger.i0.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            this.c = Boolean.valueOf(z10);
            org.telegram.messenger.i0.r3(m31Var.getWindow(), org.telegram.messenger.i0.B(z10 ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, m31Var.I0) : org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, m31Var.I0), 855638016)) > 0.721f);
        }
        m31Var.E.setTranslationY(Math.max(m31Var.E.getHeight() + org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m, L0) + getTranslationY() + ((-r1.getTop()) - m31Var.E.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, L0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m31 m31Var = this.d;
        if (m31Var.F1 != null && m31Var.G1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + m31Var.F1.x());
            }
            if (m31Var.F1.x() && m31Var.G1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = m31Var.G1.b(motionEvent);
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
        setTag(R.id.bulletin_delegate_tag, new mg.u(6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m31 m31Var = this.d;
        m31Var.E.setTranslationY(Math.max(m31Var.E.getHeight() + org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m, m31Var.L0(true)) + ((-r1.getTop()) - m31Var.E.getHeight()) + f7);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.b.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.d.I0));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
