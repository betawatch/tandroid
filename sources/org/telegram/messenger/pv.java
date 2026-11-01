package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pv extends ru implements Drawable.Callback {
    public final y51 W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public hb.a b0;
    public Bitmap c0;

    public pv(wv wvVar, Rect rect, int i10, int i11, int i12) {
        super(wvVar, rect, i10);
        this.Z = i11;
        this.a0 = i12;
        y51 y51Var = new y51();
        this.W = y51Var;
        y51Var.setCallback(this);
        y51Var.n = dd.L0(2131743856, null);
        y51Var.o = dd.L0(2131743857, null);
        y51Var.p = dd.L0(2131743852, null);
        y51Var.j = new ns(wvVar, 8);
        int i13 = this.c;
        this.X = i13;
        this.Y = y51Var.a(i13);
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.Y + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        View view = this.V;
        if (view != null) {
            return this.W.i.a(view, motionEvent);
        }
        return false;
    }

    public final float h0(org.telegram.ui.Cells.x1 x1Var) {
        int i10;
        if (x1Var != null) {
            wv wvVar = this.a;
            if (wvVar.s || wvVar.u) {
                i10 = i0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), this.P, this.N);
                return i10;
            }
        }
        i10 = this.N;
        return i10;
    }

    public final float i0(org.telegram.ui.Cells.x1 x1Var) {
        if (x1Var != null) {
            wv wvVar = this.a;
            if (wvVar.s || wvVar.u) {
                return i0.T1(this.O, this.M, Math.max(0.0f, Math.min(1.0f, x1Var.L1)));
            }
        }
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.ru
    public final void q(Canvas canvas) {
        Rect rect = this.b;
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = this.X + i10;
        int i13 = this.Y + i11;
        y51 y51Var = this.W;
        y51Var.setBounds(i10, i11, i12, i13);
        y51Var.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
