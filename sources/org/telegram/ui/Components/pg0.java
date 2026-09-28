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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class pg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg0(qg0 qg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                qg0 qg0Var = this.b;
                zo0 zo0Var = qg0Var.R;
                if (zo0Var != null && zo0Var.a()) {
                    qg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    qg0Var.R.draw(canvas);
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
        org.telegram.ui.ct0 ct0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                qg0 qg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        qg0Var.f0 = true;
                        qg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(qg0Var.h0, 500L);
                    } else {
                        qg0Var.f0 = false;
                        qg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(qg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    qg0Var.f0 = false;
                    qg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(qg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = qg0Var.V) != null && (ct0Var = photoViewer.c4) != null && ct0Var.rewinding) {
                    ct0Var.setX(motionEvent.getX());
                }
                if (qg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(qg0Var.y.getX(), qg0Var.y.getY());
                    boolean dispatchTouchEvent = qg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        qg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = qg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !qg0Var.s.isInProgress() && qg0Var.v.g0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    qg0Var.w = false;
                    qg0Var.x = false;
                    if (qg0Var.d0) {
                        qg0Var.d0 = false;
                        qg0 qg0Var2 = qg0.p0;
                        xu xuVar = qg0Var2.U;
                        if (xuVar != null) {
                            xuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = qg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        qg0.j(false);
                    } else {
                        o1.k kVar = qg0Var.M;
                        if (!kVar.f) {
                            float f7 = qg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (qg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            qg0Var.M.f();
                        }
                        o1.k kVar2 = qg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = qg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - qg0Var.I) - AndroidUtilities.dp(16.0f));
                            qg0Var.N.f();
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
                qg0 qg0Var = this.b;
                qg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(qg0Var.b, qg0Var.d, qg0Var.c);
                if (qg0Var.H != qg0Var.t() * qg0Var.J || qg0Var.I != qg0Var.r() * qg0Var.J) {
                    WindowManager.LayoutParams layoutParams = qg0Var.c;
                    int t10 = (int) (qg0Var.t() * qg0Var.J);
                    qg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = qg0Var.c;
                    int r10 = (int) (qg0Var.r() * qg0Var.J);
                    qg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(qg0Var.b, qg0Var.d, qg0Var.c);
                    o1.k kVar = qg0Var.M;
                    float f7 = qg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.B(qg0Var.t(), qg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (qg0Var.t() * qg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    qg0Var.M.f();
                    o1.k kVar2 = qg0Var.N;
                    kVar2.b = qg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (qg0Var.r() * qg0Var.J)) - AndroidUtilities.dp(16.0f));
                    qg0Var.N.f();
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
                qg0 qg0Var = this.b;
                m71 m71Var = qg0Var.Q;
                if (m71Var.j) {
                    m71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    qg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    qg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
