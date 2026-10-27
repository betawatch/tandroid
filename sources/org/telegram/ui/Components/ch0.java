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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                rp0 rp0Var = dh0Var.R;
                if (rp0Var != null && rp0Var.a()) {
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
        org.telegram.ui.zs0 zs0Var;
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
                } else if (actionMasked == 2 && (photoViewer = dh0Var.V) != null && (zs0Var = photoViewer.c4) != null && zs0Var.rewinding) {
                    zs0Var.setX(motionEvent.getX());
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
                boolean z10 = !dh0Var.s.isInProgress() && dh0Var.v.g0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    dh0Var.w = false;
                    dh0Var.x = false;
                    if (dh0Var.d0) {
                        dh0Var.d0 = false;
                        dh0 dh0Var2 = dh0.p0;
                        dv dvVar = dh0Var2.U;
                        if (dvVar != null) {
                            dvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = dh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        dh0.j(false);
                    } else {
                        o1.j jVar = dh0Var.M;
                        if (!jVar.f) {
                            float f7 = dh0Var.K;
                            jVar.b = f7;
                            jVar.c = true;
                            jVar.u.i = (dh0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            dh0Var.M.h();
                        }
                        o1.j jVar2 = dh0Var.N;
                        if (!jVar2.f) {
                            jVar2.b = dh0Var.L;
                            jVar2.c = true;
                            jVar2.u.i = a8.ee.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - dh0Var.I) - AndroidUtilities.dp(16.0f));
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
                    int r6 = (int) (dh0Var.r() * dh0Var.J);
                    dh0Var.I = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(dh0Var.b, dh0Var.d, dh0Var.c);
                    o1.j jVar = dh0Var.M;
                    float f7 = dh0Var.K;
                    jVar.b = f7;
                    jVar.c = true;
                    jVar.u.i = a1.g.C(dh0Var.t(), dh0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (dh0Var.t() * dh0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    dh0Var.M.h();
                    o1.j jVar2 = dh0Var.N;
                    jVar2.b = dh0Var.L;
                    jVar2.c = true;
                    jVar2.u.i = a8.ee.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (dh0Var.r() * dh0Var.J)) - AndroidUtilities.dp(16.0f));
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
                k81 k81Var = dh0Var.Q;
                if (k81Var.j) {
                    k81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
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
