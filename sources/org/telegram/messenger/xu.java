package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class xu extends zt implements Drawable.Callback {
    public final h51 X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public w7.s c0;
    public Bitmap d0;

    public xu(ev evVar, Rect rect, int i7, int i10, int i11) {
        super(evVar, rect, i7);
        this.a0 = i10;
        this.b0 = i11;
        h51 h51Var = new h51();
        this.X = h51Var;
        h51Var.setCallback(this);
        h51Var.n = gd.M0(2131743594, null);
        h51Var.o = gd.M0(2131743595, null);
        h51Var.p = gd.M0(2131743589, null);
        h51Var.j = new xr(evVar, 7);
        int i12 = this.c;
        this.Y = i12;
        this.Z = h51Var.a(i12);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
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
            ev evVar = this.a;
            if (evVar.s || evVar.u) {
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
            ev evVar = this.a;
            if (evVar.s || evVar.u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.N;
    }

    @Override // org.telegram.messenger.zt
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = this.Y + i7;
        int i12 = this.Z + i10;
        h51 h51Var = this.X;
        h51Var.setBounds(i7, i10, i11, i12);
        h51Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
