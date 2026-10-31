package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f6 extends FrameLayout {
    public final /* synthetic */ int a;
    public Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                super(context);
                break;
            default:
                this.b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int save = canvas.save();
                canvas.clipPath(this.b);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                int action = motionEvent.getAction();
                th.w0 w0Var = th.w0.Z;
                if (w0Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(w0Var.G.getX(), w0Var.G.getY());
                    boolean dispatchTouchEvent = w0Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        w0Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = w0Var.y.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !w0Var.y.isInProgress() && ((GestureDetector) w0Var.D.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    w0Var.E = false;
                    w0Var.F = false;
                    o1.j jVar = w0Var.P;
                    if (!jVar.f) {
                        float f7 = w0Var.N;
                        jVar.b = f7;
                        jVar.c = true;
                        jVar.m.i = (w0Var.J / 2.0f) + f7 >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r2 - r7) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
                        w0Var.P.h();
                    }
                    o1.j jVar2 = w0Var.Q;
                    if (!jVar2.f) {
                        jVar2.b = w0Var.O;
                        jVar2.c = true;
                        jVar2.m.i = w7.u.a(r2, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.q.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
                        w0Var.Q.h();
                    }
                }
                return onTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.i0.v(getContext(), configuration);
                th.w0 w0Var = th.w0.Z;
                org.telegram.messenger.i0.x3(w0Var.b, w0Var.d, w0Var.c);
                w0Var.a();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = this.b;
                float paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path2 = this.b;
                path2.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, i10, i11);
                path2.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                break;
        }
    }
}
