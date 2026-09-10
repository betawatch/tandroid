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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ng0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng0(og0 og0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = og0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                og0 og0Var = this.b;
                to0 to0Var = og0Var.R;
                if (to0Var != null && to0Var.a()) {
                    og0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    og0Var.R.draw(canvas);
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
                og0 og0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        og0Var.f0 = true;
                        og0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(og0Var.h0, 500L);
                    } else {
                        og0Var.f0 = false;
                        og0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(og0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    og0Var.f0 = false;
                    og0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(og0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = og0Var.V) != null && (jt0Var = photoViewer.c4) != null && jt0Var.rewinding) {
                    jt0Var.setX(motionEvent.getX());
                }
                if (og0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(og0Var.y.getX(), og0Var.y.getY());
                    boolean dispatchTouchEvent = og0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        og0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = og0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !og0Var.s.isInProgress() && og0Var.v.B(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    og0Var.w = false;
                    og0Var.x = false;
                    if (og0Var.d0) {
                        og0Var.d0 = false;
                        og0 og0Var2 = og0.p0;
                        zu zuVar = og0Var2.U;
                        if (zuVar != null) {
                            zuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = og0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        og0.j(false);
                    } else {
                        o1.k kVar = og0Var.M;
                        if (!kVar.f) {
                            float f7 = og0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (og0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            og0Var.M.f();
                        }
                        o1.k kVar2 = og0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = og0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - og0Var.I) - AndroidUtilities.dp(16.0f));
                            og0Var.N.f();
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
                og0 og0Var = this.b;
                og0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(og0Var.b, og0Var.d, og0Var.c);
                if (og0Var.H != og0Var.t() * og0Var.J || og0Var.I != og0Var.r() * og0Var.J) {
                    WindowManager.LayoutParams layoutParams = og0Var.c;
                    int t10 = (int) (og0Var.t() * og0Var.J);
                    og0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = og0Var.c;
                    int r10 = (int) (og0Var.r() * og0Var.J);
                    og0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(og0Var.b, og0Var.d, og0Var.c);
                    o1.k kVar = og0Var.M;
                    float f7 = og0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.A(og0Var.t(), og0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (og0Var.t() * og0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    og0Var.M.f();
                    o1.k kVar2 = og0Var.N;
                    kVar2.b = og0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (og0Var.r() * og0Var.J)) - AndroidUtilities.dp(16.0f));
                    og0Var.N.f();
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
                og0 og0Var = this.b;
                j71 j71Var = og0Var.Q;
                if (j71Var.j) {
                    j71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    og0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    og0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
