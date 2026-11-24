// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class lj4 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sj4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj4(sj4 sj4Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = sj4Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.dispatchDraw(canvas);
                sj4 sj4Var = this.b;
                iv9 iv9Var = sj4Var.G;
                if (iv9Var != null && iv9Var.a()) {
                    sj4Var.G.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sj4Var.G.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r2 == false) goto L34;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                sj4 sj4Var = this.b;
                float[] fArr = sj4Var.M;
                jj4 jj4Var = sj4Var.N;
                sa8 sa8Var = sj4Var.b;
                if (sj4Var.K) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        sj4Var.L = true;
                        fArr[0] = motionEvent.getX();
                        fArr[1] = motionEvent.getY();
                        gl.d3(jj4Var, 500L);
                    } else {
                        sj4Var.L = false;
                        sa8Var.L0();
                        gl.r(jj4Var);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sj4Var.L = false;
                    sa8Var.L0();
                    gl.r(jj4Var);
                } else if (actionMasked == 2 && sa8Var.b0()) {
                    sa8Var.S0(motionEvent.getX());
                }
                if (sj4Var.t != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(-sj4Var.t.getX(), -sj4Var.t.getY());
                    boolean dispatchTouchEvent = sj4Var.t.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        sj4Var.t = null;
                        break;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = sj4Var.p.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z = !sj4Var.p.isInProgress() && sj4Var.q.X(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sj4Var.r = false;
                    sj4Var.s = false;
                    yla ylaVar = sj4Var.D;
                    if (!ylaVar.f) {
                        ylaVar.b = sj4Var.B;
                        ylaVar.c = true;
                        ylaVar.m.i = sj4.n(r1, sj4Var.x);
                        sj4Var.D.h();
                    }
                    yla ylaVar2 = sj4Var.E;
                    if (!ylaVar2.f) {
                        ylaVar2.b = sj4Var.C;
                        ylaVar2.c = true;
                        ylaVar2.m.i = sj4.e(r1, sj4Var.y);
                        sj4Var.E.h();
                    }
                }
                if (!onTouchEvent && !z) {
                    return false;
                }
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                sj4 sj4Var = this.b;
                rac racVar = sj4Var.F;
                if (racVar.j) {
                    racVar.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    racVar.draw(canvas);
                }
                canvas.save();
                canvas.translate(getLeft(), getTop());
                sj4Var.b.r2(canvas, getRight() - getLeft(), getBottom() - getTop());
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
