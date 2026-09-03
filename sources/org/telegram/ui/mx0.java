package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mx0 extends FrameLayout {
    public org.telegram.ui.Components.n9 a;
    public org.telegram.ui.Cells.s1 b;
    public Drawable c;
    public Drawable d;
    public org.telegram.ui.Components.l40 e;
    public MessageObject f;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.e.e(this.b, null, 0, 0, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.a;
        if (n9Var != null) {
            n9Var.dispose();
            this.a = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        if (s02 != null && this.c != s02) {
            org.telegram.ui.Components.n9 n9Var = this.a;
            if (n9Var != null) {
                n9Var.dispose();
                this.a = null;
            }
            this.c = s02;
        }
        Drawable drawable2 = this.c;
        if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof org.telegram.ui.Components.ec0)) {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.c;
            if (drawable3 instanceof org.telegram.ui.Components.o9) {
                this.a = ((org.telegram.ui.Components.o9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        } else if (drawable2 instanceof BitmapDrawable) {
            if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                canvas.save();
                float f10 = 2.0f / AndroidUtilities.density;
                canvas.scale(f10, f10);
                this.c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
            } else {
                int measuredHeight = getMeasuredHeight();
                float max = Math.max(getMeasuredWidth() / this.c.getIntrinsicWidth(), measuredHeight / this.c.getIntrinsicHeight());
                int ceil = (int) Math.ceil(this.c.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(this.c.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int i10 = (measuredHeight - ceil2) / 2;
                canvas.save();
                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                this.c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
            }
            this.c.draw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z4) {
    }
}
