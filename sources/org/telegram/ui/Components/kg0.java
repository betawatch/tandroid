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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kg0(lg0 lg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = lg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                lg0 lg0Var = this.b;
                oo0 oo0Var = lg0Var.O;
                if (oo0Var != null && oo0Var.a()) {
                    lg0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    lg0Var.O.draw(canvas);
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
        org.telegram.ui.ps0 ps0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                lg0 lg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        lg0Var.c0 = true;
                        lg0Var.d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(lg0Var.e0, 500L);
                    } else {
                        lg0Var.c0 = false;
                        lg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(lg0Var.e0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    lg0Var.c0 = false;
                    lg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(lg0Var.e0);
                } else if (actionMasked == 2 && (photoViewer = lg0Var.S) != null && (ps0Var = photoViewer.Z3) != null && ps0Var.rewinding) {
                    ps0Var.setX(motionEvent.getX());
                }
                if (lg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(lg0Var.y.getX(), lg0Var.y.getY());
                    boolean dispatchTouchEvent = lg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        lg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = lg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z4 = !lg0Var.s.isInProgress() && lg0Var.v.v0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    lg0Var.w = false;
                    lg0Var.x = false;
                    if (lg0Var.a0) {
                        lg0Var.a0 = false;
                        lg0 lg0Var2 = lg0.m0;
                        pu puVar = lg0Var2.R;
                        if (puVar != null) {
                            puVar.G();
                        } else {
                            PhotoViewer photoViewer2 = lg0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        lg0.j(false);
                    } else {
                        o1.j jVar = lg0Var.J;
                        if (!jVar.f) {
                            float f10 = lg0Var.H;
                            jVar.b = f10;
                            jVar.c = true;
                            jVar.u.i = (lg0Var.E / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            lg0Var.J.f();
                        }
                        o1.j jVar2 = lg0Var.K;
                        if (!jVar2.f) {
                            jVar2.b = lg0Var.I;
                            jVar2.c = true;
                            jVar2.u.i = k7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - lg0Var.F) - AndroidUtilities.dp(16.0f));
                            lg0Var.K.f();
                        }
                    }
                }
                return onTouchEvent || z4;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 0:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                lg0 lg0Var = this.b;
                lg0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(lg0Var.b, lg0Var.d, lg0Var.c);
                if (lg0Var.E != lg0Var.t() * lg0Var.G || lg0Var.F != lg0Var.r() * lg0Var.G) {
                    WindowManager.LayoutParams layoutParams = lg0Var.c;
                    int t6 = (int) (lg0Var.t() * lg0Var.G);
                    lg0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = lg0Var.c;
                    int r10 = (int) (lg0Var.r() * lg0Var.G);
                    lg0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(lg0Var.b, lg0Var.d, lg0Var.c);
                    o1.j jVar = lg0Var.J;
                    float f10 = lg0Var.H;
                    jVar.b = f10;
                    jVar.c = true;
                    jVar.u.i = android.support.v4.media.a.d(lg0Var.t(), lg0Var.G, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (lg0Var.t() * lg0Var.G)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    lg0Var.J.f();
                    o1.j jVar2 = lg0Var.K;
                    jVar2.b = lg0Var.I;
                    jVar2.c = true;
                    jVar2.u.i = k7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (lg0Var.r() * lg0Var.G)) - AndroidUtilities.dp(16.0f));
                    lg0Var.K.f();
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
                lg0 lg0Var = this.b;
                y61 y61Var = lg0Var.N;
                if (y61Var.j) {
                    y61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    lg0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    lg0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
