package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t3 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.Components.r5 a;
    public final Paint b;
    public final Path c;
    public final RectF d;
    public ValueAnimator e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public int s;
    public final /* synthetic */ u3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(u3 u3Var, Context context) {
        super(context);
        this.v = u3Var;
        this.b = new Paint(1);
        this.c = new Path();
        this.d = new RectF();
        this.h = -1.0f;
        int dp = AndroidUtilities.dp(14.0f);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u3Var.a));
        setForeground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o12, o12));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && isSelected() == z10) {
            return;
        }
        setSelected(z10);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            this.f = z10 ? 1.0f : 0.0f;
            b();
            invalidate();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f, z10 ? 1.0f : 0.0f);
            this.e = ofFloat;
            ofFloat.setDuration(280L);
            this.e.setInterpolator(ds.h);
            this.e.addUpdateListener(new r(this, 3));
            this.e.start();
        }
    }

    public final void b() {
        this.r = true;
        int i10 = org.telegram.ui.ActionBar.y6.n6;
        u3 u3Var = this.v;
        int f7 = i0.a.f(this.f, org.telegram.ui.ActionBar.y6.w0(i10, u3Var.a), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u3Var.a));
        if (getCurrentTextColor() != f7) {
            setTextColor(f7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.r5 r5Var = this.a;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f = isSelected() ? 1.0f : 0.0f;
        b();
        org.telegram.ui.Components.r5 r5Var = this.a;
        if (r5Var != null) {
            r5Var.b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, this.v.a);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, width, height);
        Path path = this.c;
        path.rewind();
        float dp = AndroidUtilities.dp(14.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, dp, dp2, direction);
        canvas.save();
        canvas.clipPath(path);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
        Paint paint = this.b;
        paint.setColor(o12);
        canvas.drawRect(rectF, paint);
        if (this.f > 0.0f) {
            float f7 = this.h;
            if (f7 < 0.0f) {
                f7 = getWidth() / 2.0f;
            }
            float height2 = this.h < 0.0f ? getHeight() / 2.0f : this.n;
            float hypot = (float) Math.hypot(Math.max(f7, getWidth() - f7), Math.max(height2, getHeight() - height2));
            path.rewind();
            path.addCircle(f7, height2, hypot * this.f, direction);
            canvas.clipPath(path);
            paint.setColor(w02);
            canvas.drawRect(rectF, paint);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.h = motionEvent.getX();
            this.n = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            if (this.r) {
                b();
            }
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, this.v.a));
            if (o12 != this.s) {
                this.s = o12;
                org.telegram.ui.ActionBar.y6.E1(getForeground(), o12, true);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
