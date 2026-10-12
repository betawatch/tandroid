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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class eh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ fh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh0(fh0 fh0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = fh0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                fh0 fh0Var = this.b;
                lp0 lp0Var = fh0Var.R;
                if (lp0Var != null && lp0Var.a()) {
                    fh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fh0Var.R.draw(canvas);
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
        org.telegram.ui.rt0 rt0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                fh0 fh0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        fh0Var.f0 = true;
                        fh0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(fh0Var.h0, 500L);
                    } else {
                        fh0Var.f0 = false;
                        fh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(fh0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fh0Var.f0 = false;
                    fh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fh0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = fh0Var.V) != null && (rt0Var = photoViewer.c4) != null && rt0Var.rewinding) {
                    rt0Var.setX(motionEvent.getX());
                }
                if (fh0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(fh0Var.y.getX(), fh0Var.y.getY());
                    boolean dispatchTouchEvent = fh0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        fh0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = fh0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !fh0Var.s.isInProgress() && fh0Var.v.Y0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fh0Var.w = false;
                    fh0Var.x = false;
                    if (fh0Var.d0) {
                        fh0Var.d0 = false;
                        fh0 fh0Var2 = fh0.p0;
                        hv hvVar = fh0Var2.U;
                        if (hvVar != null) {
                            hvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = fh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        fh0.j(false);
                    } else {
                        o1.k kVar = fh0Var.M;
                        if (!kVar.f) {
                            float f7 = fh0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (fh0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            fh0Var.M.h();
                        }
                        o1.k kVar2 = fh0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = fh0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.s.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fh0Var.I) - AndroidUtilities.dp(16.0f));
                            fh0Var.N.h();
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
                fh0 fh0Var = this.b;
                fh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(fh0Var.b, fh0Var.d, fh0Var.c);
                if (fh0Var.H != fh0Var.t() * fh0Var.J || fh0Var.I != fh0Var.r() * fh0Var.J) {
                    WindowManager.LayoutParams layoutParams = fh0Var.c;
                    int t10 = (int) (fh0Var.t() * fh0Var.J);
                    fh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = fh0Var.c;
                    int r10 = (int) (fh0Var.r() * fh0Var.J);
                    fh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(fh0Var.b, fh0Var.d, fh0Var.c);
                    o1.k kVar = fh0Var.M;
                    float f7 = fh0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a1.g.B(fh0Var.t(), fh0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (fh0Var.t() * fh0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    fh0Var.M.h();
                    o1.k kVar2 = fh0Var.N;
                    kVar2.b = fh0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.s.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (fh0Var.r() * fh0Var.J)) - AndroidUtilities.dp(16.0f));
                    fh0Var.N.h();
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
                fh0 fh0Var = this.b;
                z71 z71Var = fh0Var.Q;
                if (z71Var.j) {
                    z71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    fh0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
