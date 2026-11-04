package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class vu extends xt implements Drawable.Callback {
    public final o41 X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public nb.a c0;
    public Bitmap d0;

    public vu(cv cvVar, Rect rect, int i3, int i10, int i11) {
        super(cvVar, rect, i3);
        this.a0 = i10;
        this.b0 = i11;
        o41 o41Var = new o41();
        this.X = o41Var;
        o41Var.setCallback(this);
        o41Var.n = bd.M0(2131743841, null);
        o41Var.o = bd.M0(2131743842, null);
        o41Var.p = bd.M0(2131743836, null);
        o41Var.j = new vs(cvVar, 7);
        int i12 = this.c;
        this.Y = i12;
        this.Z = o41Var.a(i12);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i3;
        if (x1Var != null) {
            cv cvVar = this.a;
            if (cvVar.s || cvVar.u) {
                i3 = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.Q, this.O);
                return i3;
            }
        }
        i3 = this.O;
        return i3;
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
            cv cvVar = this.a;
            if (cvVar.s || cvVar.u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.N;
    }

    @Override // org.telegram.messenger.xt
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = this.Y + i3;
        int i12 = this.Z + i10;
        o41 o41Var = this.X;
        o41Var.setBounds(i3, i10, i11, i12);
        o41Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
