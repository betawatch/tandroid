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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg0(mg0 mg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = mg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                mg0 mg0Var = this.b;
                no0 no0Var = mg0Var.O;
                if (no0Var != null && no0Var.a()) {
                    mg0Var.O.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    mg0Var.O.draw(canvas);
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
        org.telegram.ui.ws0 ws0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                mg0 mg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        mg0Var.c0 = true;
                        mg0Var.d0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(mg0Var.e0, 500L);
                    } else {
                        mg0Var.c0 = false;
                        mg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(mg0Var.e0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    mg0Var.c0 = false;
                    mg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(mg0Var.e0);
                } else if (actionMasked == 2 && (photoViewer = mg0Var.S) != null && (ws0Var = photoViewer.Z3) != null && ws0Var.rewinding) {
                    ws0Var.setX(motionEvent.getX());
                }
                if (mg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(mg0Var.y.getX(), mg0Var.y.getY());
                    boolean dispatchTouchEvent = mg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        mg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = mg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z4 = !mg0Var.s.isInProgress() && mg0Var.v.w2(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    mg0Var.w = false;
                    mg0Var.x = false;
                    if (mg0Var.a0) {
                        mg0Var.a0 = false;
                        mg0 mg0Var2 = mg0.m0;
                        ou ouVar = mg0Var2.R;
                        if (ouVar != null) {
                            ouVar.G();
                        } else {
                            PhotoViewer photoViewer2 = mg0Var2.S;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        mg0.j(false);
                    } else {
                        o1.j jVar = mg0Var.J;
                        if (!jVar.f) {
                            float f10 = mg0Var.H;
                            jVar.b = f10;
                            jVar.c = true;
                            jVar.u.i = (mg0Var.E / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            mg0Var.J.f();
                        }
                        o1.j jVar2 = mg0Var.K;
                        if (!jVar2.f) {
                            jVar2.b = mg0Var.I;
                            jVar2.c = true;
                            jVar2.u.i = k7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - mg0Var.F) - AndroidUtilities.dp(16.0f));
                            mg0Var.K.f();
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
                mg0 mg0Var = this.b;
                mg0Var.D = null;
                AndroidUtilities.setPreferredMaxRefreshRate(mg0Var.b, mg0Var.d, mg0Var.c);
                if (mg0Var.E != mg0Var.t() * mg0Var.G || mg0Var.F != mg0Var.r() * mg0Var.G) {
                    WindowManager.LayoutParams layoutParams = mg0Var.c;
                    int t6 = (int) (mg0Var.t() * mg0Var.G);
                    mg0Var.E = t6;
                    layoutParams.width = t6;
                    WindowManager.LayoutParams layoutParams2 = mg0Var.c;
                    int r10 = (int) (mg0Var.r() * mg0Var.G);
                    mg0Var.F = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(mg0Var.b, mg0Var.d, mg0Var.c);
                    o1.j jVar = mg0Var.J;
                    float f10 = mg0Var.H;
                    jVar.b = f10;
                    jVar.c = true;
                    jVar.u.i = android.support.v4.media.a.d(mg0Var.t(), mg0Var.G, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (mg0Var.t() * mg0Var.G)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    mg0Var.J.f();
                    o1.j jVar2 = mg0Var.K;
                    jVar2.b = mg0Var.I;
                    jVar2.c = true;
                    jVar2.u.i = k7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (mg0Var.r() * mg0Var.G)) - AndroidUtilities.dp(16.0f));
                    mg0Var.K.f();
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
                mg0 mg0Var = this.b;
                y61 y61Var = mg0Var.N;
                if (y61Var.j) {
                    y61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    mg0Var.N.draw(canvas);
                }
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null && photoViewer.Y3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    mg0Var.S.Y3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
