package ei;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b8.be;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 1:
                super(context);
                this.b = new Path();
                setClipChildren(false);
                setClipToPadding(false);
                break;
            default:
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
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
            case 0:
                int action = motionEvent.getAction();
                n1 n1Var = n1.a0;
                if (n1Var.H != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(n1Var.H.getX(), n1Var.H.getY());
                    boolean dispatchTouchEvent = n1Var.H.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        n1Var.H = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = n1Var.y.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !n1Var.y.isInProgress() && ((GestureDetector) n1Var.E.a).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    n1Var.F = false;
                    n1Var.G = false;
                    q1.g gVar = n1Var.Q;
                    if (!gVar.f) {
                        float f10 = n1Var.O;
                        gVar.b = f10;
                        gVar.c = true;
                        gVar.m.i = (n1Var.K / 2.0f) + f10 >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r2 - r7) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                        n1Var.Q.h();
                    }
                    q1.g gVar2 = n1Var.R;
                    if (!gVar2.f) {
                        gVar2.b = n1Var.P;
                        gVar2.c = true;
                        gVar2.m.i = be.a(r2, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.q.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
                        n1Var.R.h();
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
            case 0:
                org.telegram.messenger.g0.v(getContext(), configuration);
                n1 n1Var = n1.a0;
                org.telegram.messenger.g0.y3(n1Var.b, n1Var.d, n1Var.c);
                n1Var.a();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path = this.b;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, i3, i10);
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                Path path2 = this.b;
                float paddingLeft = (i3 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i10 - getPaddingTop()) - getPaddingBottom();
                path2.rewind();
                path2.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path2.offset(getPaddingLeft(), getPaddingTop());
                break;
        }
    }
}
