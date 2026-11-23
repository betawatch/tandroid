package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class yu extends au implements Drawable.Callback {
    public final k51 X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public w7.s c0;
    public Bitmap d0;

    public yu(fv fvVar, Rect rect, int i7, int i10, int i11) {
        super(fvVar, rect, i7);
        this.a0 = i10;
        this.b0 = i11;
        k51 k51Var = new k51();
        this.X = k51Var;
        k51Var.setCallback(this);
        k51Var.n = hd.N0(2131743586, null);
        k51Var.o = hd.N0(2131743587, null);
        k51Var.p = hd.N0(2131743581, null);
        k51Var.j = new yr(fvVar, 7);
        int i12 = this.c;
        this.Y = i12;
        this.Z = k51Var.a(i12);
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.y1 y1Var) {
        int i7;
        if (y1Var != null) {
            fv fvVar = this.a;
            if (fvVar.s || fvVar.u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, y1Var.L1)), this.Q, this.O);
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

    public final float j0(org.telegram.ui.Cells.y1 y1Var) {
        if (y1Var != null) {
            fv fvVar = this.a;
            if (fvVar.s || fvVar.u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, y1Var.L1)));
            }
        }
        return this.N;
    }

    @Override // org.telegram.messenger.au
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = this.Y + i7;
        int i12 = this.Z + i10;
        k51 k51Var = this.X;
        k51Var.setBounds(i7, i10, i11, i12);
        k51Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
