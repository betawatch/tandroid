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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ y41 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r41(y41 y41Var, Context context) {
        super(context);
        this.d = y41Var;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        org.telegram.ui.ActionBar.k6.m(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y41 y41Var = this.d;
        float K = y41Var.K(true);
        float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.r.a(K / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
        y41Var.x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, K));
        boolean z10 = K <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z10) {
            this.c = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(y41Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z10 ? y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5) : org.telegram.ui.ActionBar.k6.v(y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8), 855638016)) > 0.721f);
        }
        y41Var.topBulletinContainer.setTranslationY(Math.max(y41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, K) + getTranslationY() + ((-r1.getTop()) - y41Var.topBulletinContainer.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, K, getWidth(), getHeight() + lerp);
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y41 y41Var = this.d;
        if (y41Var.O != null && y41Var.P != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + y41Var.O.x());
            }
            if (y41Var.O.x() && y41Var.P.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = y41Var.P.b(motionEvent);
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
        qc.a(this, new ei.o8(9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y41 y41Var = this.d;
        y41Var.topBulletinContainer.setTranslationY(Math.max(y41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, y41Var.K(true)) + ((-r1.getTop()) - y41Var.topBulletinContainer.getHeight()) + f7);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.b.setColor(this.d.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
