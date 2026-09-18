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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class og0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og0(pg0 pg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                pg0 pg0Var = this.b;
                yo0 yo0Var = pg0Var.R;
                if (yo0Var != null && yo0Var.a()) {
                    pg0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pg0Var.R.draw(canvas);
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
                pg0 pg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        pg0Var.f0 = true;
                        pg0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(pg0Var.h0, 500L);
                    } else {
                        pg0Var.f0 = false;
                        pg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(pg0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pg0Var.f0 = false;
                    pg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(pg0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = pg0Var.V) != null && (kt0Var = photoViewer.c4) != null && kt0Var.rewinding) {
                    kt0Var.setX(motionEvent.getX());
                }
                if (pg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(pg0Var.y.getX(), pg0Var.y.getY());
                    boolean dispatchTouchEvent = pg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        pg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = pg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !pg0Var.s.isInProgress() && pg0Var.v.g0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    pg0Var.w = false;
                    pg0Var.x = false;
                    if (pg0Var.d0) {
                        pg0Var.d0 = false;
                        pg0 pg0Var2 = pg0.p0;
                        vu vuVar = pg0Var2.U;
                        if (vuVar != null) {
                            vuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = pg0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        pg0.j(false);
                    } else {
                        o1.k kVar = pg0Var.M;
                        if (!kVar.f) {
                            float f7 = pg0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (pg0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            pg0Var.M.f();
                        }
                        o1.k kVar2 = pg0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = pg0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - pg0Var.I) - AndroidUtilities.dp(16.0f));
                            pg0Var.N.f();
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
                pg0 pg0Var = this.b;
                pg0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(pg0Var.b, pg0Var.d, pg0Var.c);
                if (pg0Var.H != pg0Var.t() * pg0Var.J || pg0Var.I != pg0Var.r() * pg0Var.J) {
                    WindowManager.LayoutParams layoutParams = pg0Var.c;
                    int t10 = (int) (pg0Var.t() * pg0Var.J);
                    pg0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = pg0Var.c;
                    int r10 = (int) (pg0Var.r() * pg0Var.J);
                    pg0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(pg0Var.b, pg0Var.d, pg0Var.c);
                    o1.k kVar = pg0Var.M;
                    float f7 = pg0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a4.a.A(pg0Var.t(), pg0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (pg0Var.t() * pg0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    pg0Var.M.f();
                    o1.k kVar2 = pg0Var.N;
                    kVar2.b = pg0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.q.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (pg0Var.r() * pg0Var.J)) - AndroidUtilities.dp(16.0f));
                    pg0Var.N.f();
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
                pg0 pg0Var = this.b;
                l71 l71Var = pg0Var.Q;
                if (l71Var.j) {
                    l71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    pg0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    pg0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
