package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.t41;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class dv extends fu implements Drawable.Callback {
    public final t41 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public pb.b b0;
    public Bitmap c0;

    public dv(kv kvVar, Rect rect, int i7, int i10, int i11) {
        super(kvVar, rect, i7);
        this.Z = i10;
        this.a0 = i11;
        t41 t41Var = new t41();
        this.W = t41Var;
        t41Var.setCallback(this);
        t41Var.n = id.M0(2131743831, null);
        t41Var.o = id.M0(2131743832, null);
        t41Var.p = id.M0(2131743826, null);
        t41Var.j = new ds(kvVar, 7);
        int i12 = this.c;
        this.X = i12;
        this.Y = t41Var.a(i12);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        int i7;
        if (x1Var != null) {
            kv kvVar = this.a;
            if (kvVar.s || kvVar.u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.P, this.N);
                return i7;
            }
        }
        i7 = this.N;
        return i7;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            kv kvVar = this.a;
            if (kvVar.s || kvVar.u) {
                return g0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override // org.telegram.messenger.fu
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = this.X + i7;
        int i12 = this.Y + i10;
        t41 t41Var = this.W;
        t41Var.setBounds(i7, i10, i11, i12);
        t41Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
