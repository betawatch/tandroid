package ai;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class j2 extends FrameLayout {
    public final /* synthetic */ int a;
    public Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.b = new Path();
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
                Path path = this.b;
                w7.g6.a(path, getWidth(), getHeight());
                canvas.clipPath(path);
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
                n2 n2Var = n2.Z;
                if (n2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(n2Var.G.getX(), n2Var.G.getY());
                    boolean dispatchTouchEvent = n2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        n2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = n2Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !n2Var.x.isInProgress() && ((GestureDetector) n2Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    n2Var.E = false;
                    n2Var.F = false;
                    o1.k kVar = n2Var.P;
                    if (!kVar.f) {
                        float f7 = n2Var.N;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (n2Var.J / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        n2Var.P.h();
                    }
                    o1.k kVar2 = n2Var.Q;
                    if (!kVar2.f) {
                        kVar2.b = n2Var.O;
                        kVar2.c = true;
                        kVar2.u.i = w7.o.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
                        n2Var.Q.h();
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
                n2 n2Var = n2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(n2Var.b, n2Var.d, n2Var.c);
                n2Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
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
                break;
        }
    }
}
