// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oj9 extends qi9 implements Drawable.Callback {
    public final g8c X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public dhf c0;
    public Bitmap d0;

    public oj9(uj9 uj9Var, Rect rect, int i, int i2, int i3) {
        super(uj9Var, rect, i);
        this.a0 = i2;
        this.b0 = i3;
        g8c g8cVar = new g8c();
        this.X = g8cVar;
        g8cVar.setCallback(this);
        g8cVar.n = jb6.M0(2131743518, null);
        g8cVar.o = jb6.M0(2131743519, null);
        g8cVar.p = jb6.M0(2131743513, null);
        g8cVar.j = new kf9(uj9Var, (byte) 4);
        int i4 = this.c;
        this.Y = i4;
        this.Z = g8cVar.a(i4);
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.i.a(view, motionEvent);
        }
        return false;
    }

    public final float h0(yc2 yc2Var) {
        int i;
        if (yc2Var != null) {
            uj9 uj9Var = this.a;
            if (uj9Var.s || uj9Var.u) {
                i = gm.U1(Math.max(0.0f, Math.min(1.0f, yc2Var.L1)), this.Q, this.O);
                return i;
            }
        }
        i = this.O;
        return i;
    }

    public final float i0(yc2 yc2Var) {
        if (yc2Var != null) {
            uj9 uj9Var = this.a;
            if (uj9Var.s || uj9Var.u) {
                return gm.R1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, yc2Var.L1)));
            }
        }
        return this.N;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // qi9
    public final void p(Canvas canvas) {
        Rect rect = this.b;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = this.Y + i;
        int i4 = this.Z + i2;
        g8c g8cVar = this.X;
        g8cVar.setBounds(i, i2, i3, i4);
        g8cVar.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
