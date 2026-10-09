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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh0(gh0 gh0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = gh0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                gh0 gh0Var = this.b;
                pp0 pp0Var = gh0Var.R;
                if (pp0Var != null && pp0Var.a()) {
                    gh0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    gh0Var.R.draw(canvas);
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
                gh0 gh0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        gh0Var.f0 = true;
                        gh0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(gh0Var.h0, 500L);
                    } else {
                        gh0Var.f0 = false;
                        gh0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(gh0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    gh0Var.f0 = false;
                    gh0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(gh0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = gh0Var.V) != null && (kt0Var = photoViewer.c4) != null && kt0Var.rewinding) {
                    kt0Var.setX(motionEvent.getX());
                }
                if (gh0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(gh0Var.y.getX(), gh0Var.y.getY());
                    boolean dispatchTouchEvent = gh0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        gh0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = gh0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !gh0Var.s.isInProgress() && gh0Var.v.T0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    gh0Var.w = false;
                    gh0Var.x = false;
                    if (gh0Var.d0) {
                        gh0Var.d0 = false;
                        gh0 gh0Var2 = gh0.p0;
                        lv lvVar = gh0Var2.U;
                        if (lvVar != null) {
                            lvVar.H();
                        } else {
                            PhotoViewer photoViewer2 = gh0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        gh0.j(false);
                    } else {
                        o1.k kVar = gh0Var.M;
                        if (!kVar.f) {
                            float f7 = gh0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (gh0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            gh0Var.M.h();
                        }
                        o1.k kVar2 = gh0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = gh0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.o.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - gh0Var.I) - AndroidUtilities.dp(16.0f));
                            gh0Var.N.h();
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
                gh0 gh0Var = this.b;
                gh0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(gh0Var.b, gh0Var.d, gh0Var.c);
                if (gh0Var.H != gh0Var.t() * gh0Var.J || gh0Var.I != gh0Var.r() * gh0Var.J) {
                    WindowManager.LayoutParams layoutParams = gh0Var.c;
                    int t10 = (int) (gh0Var.t() * gh0Var.J);
                    gh0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = gh0Var.c;
                    int r10 = (int) (gh0Var.r() * gh0Var.J);
                    gh0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(gh0Var.b, gh0Var.d, gh0Var.c);
                    o1.k kVar = gh0Var.M;
                    float f7 = gh0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a1.g.B(gh0Var.t(), gh0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (gh0Var.t() * gh0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    gh0Var.M.h();
                    o1.k kVar2 = gh0Var.N;
                    kVar2.b = gh0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.o.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (gh0Var.r() * gh0Var.J)) - AndroidUtilities.dp(16.0f));
                    gh0Var.N.h();
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
                gh0 gh0Var = this.b;
                b81 b81Var = gh0Var.Q;
                if (b81Var.j) {
                    b81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    gh0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    gh0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
