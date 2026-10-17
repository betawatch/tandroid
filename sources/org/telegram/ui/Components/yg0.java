package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg0(zg0 zg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = zg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                zg0 zg0Var = this.b;
                gp0 gp0Var = zg0Var.R;
                if (gp0Var != null && gp0Var.a()) {
                    zg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    zg0Var.R.draw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer;
        org.telegram.ui.ss0 ss0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                zg0 zg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        zg0Var.f0 = true;
                        zg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(zg0Var.h0, 500L);
                    } else {
                        zg0Var.f0 = false;
                        zg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(zg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    zg0Var.f0 = false;
                    zg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(zg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = zg0Var.V) != null && (ss0Var = photoViewer.c4) != null && ss0Var.rewinding) {
                    ss0Var.setX(motionEvent.getX());
                }
                if (zg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(zg0Var.y.getX(), zg0Var.y.getY());
                    boolean dispatchTouchEvent = zg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        zg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = zg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !zg0Var.s.isInProgress() && zg0Var.v.j0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    zg0Var.w = false;
                    zg0Var.x = false;
                    if (zg0Var.d0) {
                        zg0Var.d0 = false;
                        zg0 zg0Var2 = zg0.p0;
                        cv cvVar = zg0Var2.U;
                        if (cvVar != null) {
                            cvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = zg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        zg0.j(false);
                    } else {
                        o1.k kVar = zg0Var.M;
                        if (!kVar.f) {
                            float f7 = zg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (zg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            zg0Var.M.h();
                        }
                        o1.k kVar2 = zg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = zg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - zg0Var.I) - AndroidUtilities.dp(16.0f));
                            zg0Var.N.h();
                        }
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
                zg0 zg0Var = this.b;
                zg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(zg0Var.b, zg0Var.d, zg0Var.c);
                if (zg0Var.H != zg0Var.t() * zg0Var.J || zg0Var.I != zg0Var.r() * zg0Var.J) {
                    WindowManager.LayoutParams layoutParams = zg0Var.c;
                    int t10 = (int) (zg0Var.t() * zg0Var.J);
                    zg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = zg0Var.c;
                    int r10 = (int) (zg0Var.r() * zg0Var.J);
                    zg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(zg0Var.b, zg0Var.d, zg0Var.c);
                    o1.k kVar = zg0Var.M;
                    float f7 = zg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a1.g.B(zg0Var.t(), zg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (zg0Var.t() * zg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    zg0Var.M.h();
                    o1.k kVar2 = zg0Var.N;
                    kVar2.b = zg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (zg0Var.r() * zg0Var.J)) - AndroidUtilities.dp(16.0f));
                    zg0Var.N.h();
                    break;
                }
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                zg0 zg0Var = this.b;
                r71 r71Var = zg0Var.Q;
                if (r71Var.j) {
                    r71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    zg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    zg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
