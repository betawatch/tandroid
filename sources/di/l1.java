package di;

import a8.ee;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
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
                o1 o1Var = o1.Z;
                if (o1Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(o1Var.G.getX(), o1Var.G.getY());
                    boolean dispatchTouchEvent = o1Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        o1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = o1Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !o1Var.x.isInProgress() && ((GestureDetector) o1Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    o1Var.E = false;
                    o1Var.F = false;
                    o1.j jVar = o1Var.P;
                    if (!jVar.f) {
                        float f7 = o1Var.N;
                        jVar.b = f7;
                        jVar.c = true;
                        jVar.u.i = (o1Var.J / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        o1Var.P.h();
                    }
                    o1.j jVar2 = o1Var.Q;
                    if (!jVar2.f) {
                        jVar2.b = o1Var.O;
                        jVar2.c = true;
                        jVar2.u.i = ee.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
                        o1Var.Q.h();
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
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                o1 o1Var = o1.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(o1Var.b, o1Var.d, o1Var.c);
                o1Var.i();
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
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path2 = this.b;
                float paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
                path2.rewind();
                path2.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path2.offset(getPaddingLeft(), getPaddingTop());
                break;
        }
    }
}
