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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class qg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg0(rg0 rg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                rg0 rg0Var = this.b;
                zo0 zo0Var = rg0Var.R;
                if (zo0Var != null && zo0Var.a()) {
                    rg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    rg0Var.R.draw(canvas);
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
        org.telegram.ui.kt0 kt0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                rg0 rg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        rg0Var.f0 = true;
                        rg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(rg0Var.h0, 500L);
                    } else {
                        rg0Var.f0 = false;
                        rg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(rg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    rg0Var.f0 = false;
                    rg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(rg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = rg0Var.V) != null && (kt0Var = photoViewer.c4) != null && kt0Var.rewinding) {
                    kt0Var.setX(motionEvent.getX());
                }
                if (rg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(rg0Var.y.getX(), rg0Var.y.getY());
                    boolean dispatchTouchEvent = rg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        rg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = rg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !rg0Var.s.isInProgress() && rg0Var.v.J(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    rg0Var.w = false;
                    rg0Var.x = false;
                    if (rg0Var.d0) {
                        rg0Var.d0 = false;
                        rg0 rg0Var2 = rg0.p0;
                        vu vuVar = rg0Var2.U;
                        if (vuVar != null) {
                            vuVar.G();
                        } else {
                            PhotoViewer photoViewer2 = rg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        rg0.j(false);
                    } else {
                        o1.k kVar = rg0Var.M;
                        if (!kVar.f) {
                            float f7 = rg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (rg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            rg0Var.M.f();
                        }
                        o1.k kVar2 = rg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = rg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - rg0Var.I) - AndroidUtilities.dp(16.0f));
                            rg0Var.N.f();
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
                rg0 rg0Var = this.b;
                rg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(rg0Var.b, rg0Var.d, rg0Var.c);
                if (rg0Var.H != rg0Var.t() * rg0Var.J || rg0Var.I != rg0Var.r() * rg0Var.J) {
                    WindowManager.LayoutParams layoutParams = rg0Var.c;
                    int t10 = (int) (rg0Var.t() * rg0Var.J);
                    rg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = rg0Var.c;
                    int r10 = (int) (rg0Var.r() * rg0Var.J);
                    rg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(rg0Var.b, rg0Var.d, rg0Var.c);
                    o1.k kVar = rg0Var.M;
                    float f7 = rg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.A(rg0Var.t(), rg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (rg0Var.t() * rg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    rg0Var.M.f();
                    o1.k kVar2 = rg0Var.N;
                    kVar2.b = rg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (rg0Var.r() * rg0Var.J)) - AndroidUtilities.dp(16.0f));
                    rg0Var.N.f();
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
                rg0 rg0Var = this.b;
                n71 n71Var = rg0Var.Q;
                if (n71Var.j) {
                    n71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    rg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    rg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
