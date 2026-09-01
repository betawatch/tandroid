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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg0(ng0 ng0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ng0 ng0Var = this.b;
                po0 po0Var = ng0Var.O;
                if (po0Var != null && po0Var.a()) {
                    ng0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ng0Var.O.draw(canvas);
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
        org.telegram.ui.rs0 rs0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ng0 ng0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ng0Var.c0 = true;
                        ng0Var.d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ng0Var.e0, 500L);
                    } else {
                        ng0Var.c0 = false;
                        ng0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ng0Var.e0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ng0Var.c0 = false;
                    ng0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ng0Var.e0);
                } else if (actionMasked == 2 && (photoViewer = ng0Var.S) != null && (rs0Var = photoViewer.Z3) != null && rs0Var.rewinding) {
                    rs0Var.setX(motionEvent.getX());
                }
                if (ng0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ng0Var.y.getX(), ng0Var.y.getY());
                    boolean dispatchTouchEvent = ng0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ng0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ng0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z4 = !ng0Var.s.isInProgress() && ng0Var.v.J(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ng0Var.w = false;
                    ng0Var.x = false;
                    if (ng0Var.a0) {
                        ng0Var.a0 = false;
                        ng0 ng0Var2 = ng0.m0;
                        ru ruVar = ng0Var2.R;
                        if (ruVar != null) {
                            ruVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ng0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ng0.j(false);
                    } else {
                        o1.j jVar = ng0Var.J;
                        if (!jVar.f) {
                            float f10 = ng0Var.H;
                            jVar.b = f10;
                            jVar.c = true;
                            jVar.u.i = (ng0Var.E / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            ng0Var.J.f();
                        }
                        o1.j jVar2 = ng0Var.K;
                        if (!jVar2.f) {
                            jVar2.b = ng0Var.I;
                            jVar2.c = true;
                            jVar2.u.i = k7.o.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ng0Var.F) - AndroidUtilities.dp(16.0f));
                            ng0Var.K.f();
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
                ng0 ng0Var = this.b;
                ng0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ng0Var.b, ng0Var.d, ng0Var.c);
                if (ng0Var.E != ng0Var.t() * ng0Var.G || ng0Var.F != ng0Var.r() * ng0Var.G) {
                    WindowManager.LayoutParams layoutParams = ng0Var.c;
                    int t6 = (int) (ng0Var.t() * ng0Var.G);
                    ng0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = ng0Var.c;
                    int r10 = (int) (ng0Var.r() * ng0Var.G);
                    ng0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ng0Var.b, ng0Var.d, ng0Var.c);
                    o1.j jVar = ng0Var.J;
                    float f10 = ng0Var.H;
                    jVar.b = f10;
                    jVar.c = true;
                    jVar.u.i = android.support.v4.media.a.d(ng0Var.t(), ng0Var.G, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (ng0Var.t() * ng0Var.G)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ng0Var.J.f();
                    o1.j jVar2 = ng0Var.K;
                    jVar2.b = ng0Var.I;
                    jVar2.c = true;
                    jVar2.u.i = k7.o.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ng0Var.r() * ng0Var.G)) - AndroidUtilities.dp(16.0f));
                    ng0Var.K.f();
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
                ng0 ng0Var = this.b;
                a71 a71Var = ng0Var.N;
                if (a71Var.j) {
                    a71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ng0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ng0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
