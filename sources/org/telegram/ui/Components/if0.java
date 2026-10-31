package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class if0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ if0(jf0 jf0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = jf0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                jf0 jf0Var = this.b;
                rn0 rn0Var = jf0Var.R;
                if (rn0Var != null && rn0Var.a()) {
                    jf0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jf0Var.R.draw(canvas);
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
        org.telegram.ui.rq0 rq0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                jf0 jf0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        jf0Var.f0 = true;
                        jf0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        org.telegram.messenger.i0.h3(jf0Var.h0, 500L);
                    } else {
                        jf0Var.f0 = false;
                        jf0Var.a();
                        org.telegram.messenger.i0.r(jf0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    jf0Var.f0 = false;
                    jf0Var.a();
                    org.telegram.messenger.i0.r(jf0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = jf0Var.V) != null && (rq0Var = photoViewer.c4) != null && rq0Var.rewinding) {
                    rq0Var.setX(motionEvent.getX());
                }
                if (jf0Var.D != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(jf0Var.D.getX(), jf0Var.D.getY());
                    boolean dispatchTouchEvent = jf0Var.D.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        jf0Var.D = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = jf0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !jf0Var.s.isInProgress() && jf0Var.w.I(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    jf0Var.x = false;
                    jf0Var.y = false;
                    if (jf0Var.d0) {
                        jf0Var.d0 = false;
                        jf0 jf0Var2 = jf0.p0;
                        hu huVar = jf0Var2.U;
                        if (huVar != null) {
                            huVar.I0();
                        } else {
                            PhotoViewer photoViewer2 = jf0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.B().F0();
                            }
                        }
                        jf0.b(false);
                    } else {
                        o1.j jVar = jf0Var.M;
                        if (!jVar.f) {
                            float f7 = jf0Var.K;
                            jVar.b = f7;
                            jVar.c = true;
                            jVar.m.i = (jf0Var.H / 2.0f) + f7 >= ((float) org.telegram.messenger.i0.q.x) / 2.0f ? (r1 - r6) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
                            jf0Var.M.h();
                        }
                        o1.j jVar2 = jf0Var.N;
                        if (!jVar2.f) {
                            jVar2.b = jf0Var.L;
                            jVar2.c = true;
                            jVar2.m.i = w7.u.a(r1, org.telegram.messenger.i0.L(16.0f), (org.telegram.messenger.i0.q.y - jf0Var.I) - org.telegram.messenger.i0.L(16.0f));
                            jf0Var.N.h();
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
                org.telegram.messenger.i0.v(getContext(), configuration);
                jf0 jf0Var = this.b;
                jf0Var.G = null;
                org.telegram.messenger.i0.x3(jf0Var.b, jf0Var.d, jf0Var.c);
                if (jf0Var.H != jf0Var.t() * jf0Var.J || jf0Var.I != jf0Var.p() * jf0Var.J) {
                    WindowManager.LayoutParams layoutParams = jf0Var.c;
                    int t10 = (int) (jf0Var.t() * jf0Var.J);
                    jf0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = jf0Var.c;
                    int p5 = (int) (jf0Var.p() * jf0Var.J);
                    jf0Var.I = p5;
                    layoutParams2.height = p5;
                    org.telegram.messenger.i0.S3(jf0Var.b, jf0Var.d, jf0Var.c);
                    o1.j jVar = jf0Var.M;
                    float f7 = jf0Var.K;
                    jVar.b = f7;
                    jVar.c = true;
                    jVar.m.i = a1.g.A(jf0Var.t(), jf0Var.J, 2.0f, f7) >= org.telegram.messenger.i0.q.x / 2.0f ? (r4 - (jf0Var.t() * jf0Var.J)) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
                    jf0Var.M.h();
                    o1.j jVar2 = jf0Var.N;
                    jVar2.b = jf0Var.L;
                    jVar2.c = true;
                    jVar2.m.i = w7.u.a(r1, org.telegram.messenger.i0.L(16.0f), (r3.y - (jf0Var.p() * jf0Var.J)) - org.telegram.messenger.i0.L(16.0f));
                    jf0Var.N.h();
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
                jf0 jf0Var = this.b;
                m61 m61Var = jf0Var.Q;
                if (m61Var.j) {
                    m61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    jf0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    jf0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
