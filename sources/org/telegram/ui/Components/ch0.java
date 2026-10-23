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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ch0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch0(dh0 dh0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = dh0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                dh0 dh0Var = this.b;
                lp0 lp0Var = dh0Var.R;
                if (lp0Var != null && lp0Var.a()) {
                    dh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    dh0Var.R.draw(canvas);
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
        org.telegram.ui.ts0 ts0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                dh0 dh0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        dh0Var.f0 = true;
                        dh0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(dh0Var.h0, 500L);
                    } else {
                        dh0Var.f0 = false;
                        dh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(dh0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    dh0Var.f0 = false;
                    dh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(dh0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = dh0Var.V) != null && (ts0Var = photoViewer.c4) != null && ts0Var.rewinding) {
                    ts0Var.setX(motionEvent.getX());
                }
                if (dh0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(dh0Var.y.getX(), dh0Var.y.getY());
                    boolean dispatchTouchEvent = dh0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        dh0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = dh0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !dh0Var.s.isInProgress() && dh0Var.v.k(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    dh0Var.w = false;
                    dh0Var.x = false;
                    if (dh0Var.d0) {
                        dh0Var.d0 = false;
                        dh0 dh0Var2 = dh0.p0;
                        cv cvVar = dh0Var2.U;
                        if (cvVar != null) {
                            cvVar.F();
                        } else {
                            PhotoViewer photoViewer2 = dh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.R0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        dh0.j(false);
                    } else {
                        o1.k kVar = dh0Var.M;
                        if (!kVar.f) {
                            float f7 = dh0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (dh0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            dh0Var.M.h();
                        }
                        o1.k kVar2 = dh0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = dh0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
                            dh0Var.N.h();
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
                dh0 dh0Var = this.b;
                dh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(dh0Var.b, dh0Var.d, dh0Var.c);
                if (dh0Var.H != dh0Var.t() * dh0Var.J || dh0Var.I != dh0Var.r() * dh0Var.J) {
                    WindowManager.LayoutParams layoutParams = dh0Var.c;
                    int t10 = (int) (dh0Var.t() * dh0Var.J);
                    dh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = dh0Var.c;
                    int r10 = (int) (dh0Var.r() * dh0Var.J);
                    dh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, dh0Var.c);
                    o1.k kVar = dh0Var.M;
                    float f7 = dh0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a1.g.B(dh0Var.t(), dh0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (dh0Var.t() * dh0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    dh0Var.M.h();
                    o1.k kVar2 = dh0Var.N;
                    kVar2.b = dh0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (dh0Var.r() * dh0Var.J)) - AndroidUtilities.dp(16.0f));
                    dh0Var.N.h();
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
                dh0 dh0Var = this.b;
                b81 b81Var = dh0Var.Q;
                if (b81Var.j) {
                    b81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    dh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    dh0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
