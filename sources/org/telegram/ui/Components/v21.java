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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ b31 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(b31 b31Var, Context context) {
        super(context);
        this.d = b31Var;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, b31Var.J0));
        org.telegram.ui.ActionBar.m6.n(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b31 b31Var = this.d;
        float M0 = b31Var.M0(true);
        float W1 = org.telegram.messenger.g0.W1(c8.l9.a(M0 / org.telegram.messenger.g0.N(24.0f), 0.0f, 1.0f), 0, org.telegram.messenger.g0.L(12.0f));
        b31Var.x1.setTranslationY(Math.max(org.telegram.messenger.g0.m, M0));
        boolean z10 = M0 <= ((float) org.telegram.messenger.g0.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            this.c = Boolean.valueOf(z10);
            org.telegram.messenger.g0.r3(b31Var.getWindow(), org.telegram.messenger.g0.B(z10 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, b31Var.J0) : org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, b31Var.J0), 855638016)) > 0.721f);
        }
        b31Var.F.setTranslationY(Math.max(b31Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, M0) + getTranslationY() + ((-r1.getTop()) - b31Var.F.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, M0, getWidth(), getHeight() + W1);
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b31 b31Var = this.d;
        if (b31Var.J1 != null && b31Var.K1 != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + b31Var.J1.x());
            }
            if (b31Var.J1.x() && b31Var.K1.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = b31Var.K1.b(motionEvent);
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
        setTag(R.id.bulletin_delegate_tag, new bi.t(10));
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
        b31 b31Var = this.d;
        b31Var.F.setTranslationY(Math.max(b31Var.F.getHeight() + org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, b31Var.M0(true)) + ((-r1.getTop()) - b31Var.F.getHeight()) + f10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.b.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.d.J0));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
