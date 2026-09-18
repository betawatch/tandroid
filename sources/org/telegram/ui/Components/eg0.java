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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class eg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg0(fg0 fg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                fg0 fg0Var = this.b;
                lo0 lo0Var = fg0Var.R;
                if (lo0Var != null && lo0Var.a()) {
                    fg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fg0Var.R.draw(canvas);
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
        org.telegram.ui.mt0 mt0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                fg0 fg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        fg0Var.f0 = true;
                        fg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(fg0Var.h0, 500L);
                    } else {
                        fg0Var.f0 = false;
                        fg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(fg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fg0Var.f0 = false;
                    fg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(fg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = fg0Var.V) != null && (mt0Var = photoViewer.c4) != null && mt0Var.rewinding) {
                    mt0Var.setX(motionEvent.getX());
                }
                if (fg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(fg0Var.y.getX(), fg0Var.y.getY());
                    boolean dispatchTouchEvent = fg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        fg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = fg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !fg0Var.s.isInProgress() && fg0Var.v.y(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    fg0Var.w = false;
                    fg0Var.x = false;
                    if (fg0Var.d0) {
                        fg0Var.d0 = false;
                        fg0 fg0Var2 = fg0.p0;
                        vu vuVar = fg0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = fg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        fg0.j(false);
                    } else {
                        o1.k kVar = fg0Var.M;
                        if (!kVar.f) {
                            float f7 = fg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (fg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            fg0Var.M.f();
                        }
                        o1.k kVar2 = fg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = fg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.p.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
                            fg0Var.N.f();
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
                fg0 fg0Var = this.b;
                fg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(fg0Var.b, fg0Var.d, fg0Var.c);
                if (fg0Var.H != fg0Var.t() * fg0Var.J || fg0Var.I != fg0Var.r() * fg0Var.J) {
                    WindowManager.LayoutParams layoutParams = fg0Var.c;
                    int t10 = (int) (fg0Var.t() * fg0Var.J);
                    fg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = fg0Var.c;
                    int r10 = (int) (fg0Var.r() * fg0Var.J);
                    fg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(fg0Var.b, fg0Var.d, fg0Var.c);
                    o1.k kVar = fg0Var.M;
                    float f7 = fg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.A(fg0Var.t(), fg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (fg0Var.t() * fg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    fg0Var.M.f();
                    o1.k kVar2 = fg0Var.N;
                    kVar2.b = fg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.p.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (fg0Var.r() * fg0Var.J)) - AndroidUtilities.dp(16.0f));
                    fg0Var.N.f();
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
                fg0 fg0Var = this.b;
                x61 x61Var = fg0Var.Q;
                if (x61Var.j) {
                    x61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    fg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    fg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
