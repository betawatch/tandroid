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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class zg0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg0(ah0 ah0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ah0 ah0Var = this.b;
                hp0 hp0Var = ah0Var.R;
                if (hp0Var != null && hp0Var.a()) {
                    ah0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ah0Var.R.draw(canvas);
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
        org.telegram.ui.qs0 qs0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ah0 ah0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ah0Var.f0 = true;
                        ah0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ah0Var.h0, 500L);
                    } else {
                        ah0Var.f0 = false;
                        ah0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ah0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ah0Var.f0 = false;
                    ah0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ah0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = ah0Var.V) != null && (qs0Var = photoViewer.c4) != null && qs0Var.rewinding) {
                    qs0Var.setX(motionEvent.getX());
                }
                if (ah0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ah0Var.y.getX(), ah0Var.y.getY());
                    boolean dispatchTouchEvent = ah0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ah0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ah0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !ah0Var.s.isInProgress() && ah0Var.v.k(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ah0Var.w = false;
                    ah0Var.x = false;
                    if (ah0Var.d0) {
                        ah0Var.d0 = false;
                        ah0 ah0Var2 = ah0.p0;
                        cv cvVar = ah0Var2.U;
                        if (cvVar != null) {
                            cvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ah0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.R0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ah0.j(false);
                    } else {
                        o1.k kVar = ah0Var.M;
                        if (!kVar.f) {
                            float f7 = ah0Var.K;
                            kVar.b = f7;
                            kVar.c = true;
                            kVar.u.i = (ah0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            ah0Var.M.h();
                        }
                        o1.k kVar2 = ah0Var.N;
                        if (!kVar2.f) {
                            kVar2.b = ah0Var.L;
                            kVar2.c = true;
                            kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ah0Var.I) - AndroidUtilities.dp(16.0f));
                            ah0Var.N.h();
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
                ah0 ah0Var = this.b;
                ah0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ah0Var.b, ah0Var.d, ah0Var.c);
                if (ah0Var.H != ah0Var.t() * ah0Var.J || ah0Var.I != ah0Var.r() * ah0Var.J) {
                    WindowManager.LayoutParams layoutParams = ah0Var.c;
                    int t10 = (int) (ah0Var.t() * ah0Var.J);
                    ah0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ah0Var.c;
                    int r10 = (int) (ah0Var.r() * ah0Var.J);
                    ah0Var.I = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(ah0Var.b, ah0Var.d, ah0Var.c);
                    o1.k kVar = ah0Var.M;
                    float f7 = ah0Var.K;
                    kVar.b = f7;
                    kVar.c = true;
                    kVar.u.i = a1.g.B(ah0Var.t(), ah0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (ah0Var.t() * ah0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ah0Var.M.h();
                    o1.k kVar2 = ah0Var.N;
                    kVar2.b = ah0Var.L;
                    kVar2.c = true;
                    kVar2.u.i = w7.r.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ah0Var.r() * ah0Var.J)) - AndroidUtilities.dp(16.0f));
                    ah0Var.N.h();
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
                ah0 ah0Var = this.b;
                t71 t71Var = ah0Var.Q;
                if (t71Var.j) {
                    t71Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ah0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ah0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
