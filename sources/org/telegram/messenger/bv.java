package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class bv extends cu implements Drawable.Callback {
    public final x41 X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public w7.s c0;
    public Bitmap d0;

    public bv(iv ivVar, Rect rect, int i7, int i10, int i11) {
        super(ivVar, rect, i7);
        this.a0 = i10;
        this.b0 = i11;
        x41 x41Var = new x41();
        this.X = x41Var;
        x41Var.setCallback(this);
        x41Var.n = hd.M0(2131743831, null);
        x41Var.o = hd.M0(2131743832, null);
        x41Var.p = hd.M0(2131743826, null);
        x41Var.j = new as(ivVar, 7);
        int i12 = this.c;
        this.Y = i12;
        this.Z = x41Var.a(i12);
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i7;
        if (x1Var != null) {
            iv ivVar = this.a;
            if (ivVar.s || ivVar.u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.Q, this.O);
                return i7;
            }
        }
        i7 = this.O;
        return i7;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            iv ivVar = this.a;
            if (ivVar.s || ivVar.u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.N;
    }

    @Override // org.telegram.messenger.cu
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = this.Y + i7;
        int i12 = this.Z + i10;
        x41 x41Var = this.X;
        x41Var.setBounds(i7, i10, i11, i12);
        x41Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
