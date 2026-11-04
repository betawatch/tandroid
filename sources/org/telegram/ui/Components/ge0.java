package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ge0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge0(ie0 ie0Var, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = ie0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ie0 ie0Var = this.b;
                tm0 tm0Var = ie0Var.S;
                if (tm0Var != null && tm0Var.a()) {
                    ie0Var.S.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ie0Var.S.draw(canvas);
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
        org.telegram.ui.yo0 yo0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ie0 ie0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ie0Var.g0 = true;
                        ie0Var.h0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        org.telegram.messenger.g0.i3(ie0Var.i0, 500L);
                    } else {
                        ie0Var.g0 = false;
                        ie0Var.a();
                        org.telegram.messenger.g0.r(ie0Var.i0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ie0Var.g0 = false;
                    ie0Var.a();
                    org.telegram.messenger.g0.r(ie0Var.i0);
                } else if (actionMasked == 2 && (photoViewer = ie0Var.W) != null && (yo0Var = photoViewer.d4) != null && yo0Var.rewinding) {
                    yo0Var.setX(motionEvent.getX());
                }
                if (ie0Var.E != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ie0Var.E.getX(), ie0Var.E.getY());
                    boolean dispatchTouchEvent = ie0Var.E.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ie0Var.E = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ie0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !ie0Var.s.isInProgress() && ie0Var.w.y(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ie0Var.x = false;
                    ie0Var.y = false;
                    if (ie0Var.e0) {
                        ie0Var.e0 = false;
                        ie0 ie0Var2 = ie0.q0;
                        ut utVar = ie0Var2.V;
                        if (utVar != null) {
                            utVar.I0();
                        } else {
                            PhotoViewer photoViewer2 = ie0Var2.W;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.B().F0();
                            }
                        }
                        ie0.b(false);
                    } else {
                        q1.g gVar = ie0Var.N;
                        if (!gVar.f) {
                            float f10 = ie0Var.L;
                            gVar.b = f10;
                            gVar.c = true;
                            gVar.m.i = (ie0Var.I / 2.0f) + f10 >= ((float) org.telegram.messenger.g0.q.x) / 2.0f ? (r1 - r6) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                            ie0Var.N.h();
                        }
                        q1.g gVar2 = ie0Var.O;
                        if (!gVar2.f) {
                            gVar2.b = ie0Var.M;
                            gVar2.c = true;
                            gVar2.m.i = b8.be.a(r1, org.telegram.messenger.g0.L(16.0f), (org.telegram.messenger.g0.q.y - ie0Var.J) - org.telegram.messenger.g0.L(16.0f));
                            ie0Var.O.h();
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
                org.telegram.messenger.g0.v(getContext(), configuration);
                ie0 ie0Var = this.b;
                ie0Var.H = null;
                org.telegram.messenger.g0.y3(ie0Var.b, ie0Var.d, ie0Var.c);
                if (ie0Var.I != ie0Var.t() * ie0Var.K || ie0Var.J != ie0Var.p() * ie0Var.K) {
                    WindowManager.LayoutParams layoutParams = ie0Var.c;
                    int t10 = (int) (ie0Var.t() * ie0Var.K);
                    ie0Var.I = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ie0Var.c;
                    int p10 = (int) (ie0Var.p() * ie0Var.K);
                    ie0Var.J = p10;
                    layoutParams2.height = p10;
                    org.telegram.messenger.g0.T3(ie0Var.b, ie0Var.d, ie0Var.c);
                    q1.g gVar = ie0Var.N;
                    float f10 = ie0Var.L;
                    gVar.b = f10;
                    gVar.c = true;
                    gVar.m.i = a1.g.e(ie0Var.t(), ie0Var.K, 2.0f, f10) >= org.telegram.messenger.g0.q.x / 2.0f ? (r4 - (ie0Var.t() * ie0Var.K)) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
                    ie0Var.N.h();
                    q1.g gVar2 = ie0Var.O;
                    gVar2.b = ie0Var.M;
                    gVar2.c = true;
                    gVar2.m.i = b8.be.a(r1, org.telegram.messenger.g0.L(16.0f), (r3.y - (ie0Var.p() * ie0Var.K)) - org.telegram.messenger.g0.L(16.0f));
                    ie0Var.O.h();
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
                ie0 ie0Var = this.b;
                d51 d51Var = ie0Var.R;
                if (d51Var.j) {
                    d51Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ie0Var.R.draw(canvas);
                }
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null && photoViewer.c4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ie0Var.W.c4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
