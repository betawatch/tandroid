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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class dg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg0(eg0 eg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                eg0 eg0Var = this.b;
                ko0 ko0Var = eg0Var.R;
                if (ko0Var != null && ko0Var.a()) {
                    eg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    eg0Var.R.draw(canvas);
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
        org.telegram.ui.jt0 jt0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                eg0 eg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        eg0Var.f0 = true;
                        eg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(eg0Var.h0, 500L);
                    } else {
                        eg0Var.f0 = false;
                        eg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(eg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    eg0Var.f0 = false;
                    eg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(eg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = eg0Var.V) != null && (jt0Var = photoViewer.c4) != null && jt0Var.rewinding) {
                    jt0Var.setX(motionEvent.getX());
                }
                if (eg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(eg0Var.y.getX(), eg0Var.y.getY());
                    boolean dispatchTouchEvent = eg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        eg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = eg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !eg0Var.s.isInProgress() && eg0Var.v.h(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    eg0Var.w = false;
                    eg0Var.x = false;
                    if (eg0Var.d0) {
                        eg0Var.d0 = false;
                        eg0 eg0Var2 = eg0.p0;
                        tu tuVar = eg0Var2.U;
                        if (tuVar != null) {
                            tuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = eg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        eg0.j(false);
                    } else {
                        o1.k kVar = eg0Var.M;
                        if (!kVar.f) {
                            float f7 = eg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (eg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            eg0Var.M.f();
                        }
                        o1.k kVar2 = eg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = eg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.p.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
                            eg0Var.N.f();
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
                eg0 eg0Var = this.b;
                eg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(eg0Var.b, eg0Var.d, eg0Var.c);
                if (eg0Var.H != eg0Var.t() * eg0Var.J || eg0Var.I != eg0Var.r() * eg0Var.J) {
                    WindowManager.LayoutParams layoutParams = eg0Var.c;
                    int t10 = (int) (eg0Var.t() * eg0Var.J);
                    eg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = eg0Var.c;
                    int r10 = (int) (eg0Var.r() * eg0Var.J);
                    eg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(eg0Var.b, eg0Var.d, eg0Var.c);
                    o1.k kVar = eg0Var.M;
                    float f7 = eg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.A(eg0Var.t(), eg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (eg0Var.t() * eg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    eg0Var.M.f();
                    o1.k kVar2 = eg0Var.N;
                    kVar2.b = eg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.p.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (eg0Var.r() * eg0Var.J)) - AndroidUtilities.dp(16.0f));
                    eg0Var.N.f();
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
                eg0 eg0Var = this.b;
                w61 w61Var = eg0Var.Q;
                if (w61Var.j) {
                    w61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    eg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    eg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
