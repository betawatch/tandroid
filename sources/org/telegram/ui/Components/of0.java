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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class of0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of0(pf0 pf0Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = pf0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                pf0 pf0Var = this.b;
                tn0 tn0Var = pf0Var.N;
                if (tn0Var != null && tn0Var.a()) {
                    pf0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pf0Var.N.draw(canvas);
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
        org.telegram.ui.hs0 hs0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                pf0 pf0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        pf0Var.b0 = true;
                        pf0Var.c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(pf0Var.d0, 500L);
                    } else {
                        pf0Var.b0 = false;
                        pf0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(pf0Var.d0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pf0Var.b0 = false;
                    pf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pf0Var.d0);
                } else if (actionMasked == 2 && (photoViewer = pf0Var.R) != null && (hs0Var = photoViewer.Y3) != null && hs0Var.rewinding) {
                    hs0Var.setX(motionEvent.getX());
                }
                if (pf0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pf0Var.y.getX(), pf0Var.y.getY());
                    boolean dispatchTouchEvent = pf0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        pf0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = pf0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !pf0Var.s.isInProgress() && pf0Var.v.a1(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pf0Var.w = false;
                    pf0Var.x = false;
                    if (pf0Var.Z) {
                        pf0Var.Z = false;
                        pf0 pf0Var2 = pf0.l0;
                        gu guVar = pf0Var2.Q;
                        if (guVar != null) {
                            guVar.G();
                        } else {
                            PhotoViewer photoViewer2 = pf0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        pf0.j(false);
                    } else {
                        o1.j jVar = pf0Var.I;
                        if (!jVar.f) {
                            float f10 = pf0Var.G;
                            jVar.b = f10;
                            jVar.c = true;
                            jVar.u.i = (pf0Var.D / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            pf0Var.I.f();
                        }
                        o1.j jVar2 = pf0Var.J;
                        if (!jVar2.f) {
                            jVar2.b = pf0Var.H;
                            jVar2.c = true;
                            jVar2.u.i = g7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pf0Var.E) - AndroidUtilities.dp(16.0f));
                            pf0Var.J.f();
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
                pf0 pf0Var = this.b;
                pf0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(pf0Var.b, pf0Var.d, pf0Var.c);
                if (pf0Var.D != pf0Var.t() * pf0Var.F || pf0Var.E != pf0Var.r() * pf0Var.F) {
                    WindowManager.LayoutParams layoutParams = pf0Var.c;
                    int t10 = (int) (pf0Var.t() * pf0Var.F);
                    pf0Var.D = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = pf0Var.c;
                    int r10 = (int) (pf0Var.r() * pf0Var.F);
                    pf0Var.E = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, pf0Var.c);
                    o1.j jVar = pf0Var.I;
                    float f10 = pf0Var.G;
                    jVar.b = f10;
                    jVar.c = true;
                    jVar.u.i = aa.d.d(pf0Var.t(), pf0Var.F, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (pf0Var.t() * pf0Var.F)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    pf0Var.I.f();
                    o1.j jVar2 = pf0Var.J;
                    jVar2.b = pf0Var.H;
                    jVar2.c = true;
                    jVar2.u.i = g7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pf0Var.r() * pf0Var.F)) - AndroidUtilities.dp(16.0f));
                    pf0Var.J.f();
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
                pf0 pf0Var = this.b;
                a61 a61Var = pf0Var.M;
                if (a61Var.j) {
                    a61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pf0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    pf0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
