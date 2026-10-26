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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bh0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(ch0 ch0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = ch0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                ch0 ch0Var = this.b;
                qp0 qp0Var = ch0Var.R;
                if (qp0Var != null && qp0Var.a()) {
                    ch0Var.R.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.R.draw(canvas);
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
        org.telegram.ui.xs0 xs0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ch0 ch0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        ch0Var.f0 = true;
                        ch0Var.g0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(ch0Var.h0, 500L);
                    } else {
                        ch0Var.f0 = false;
                        ch0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(ch0Var.h0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ch0Var.f0 = false;
                    ch0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(ch0Var.h0);
                } else if (actionMasked == 2 && (photoViewer = ch0Var.V) != null && (xs0Var = photoViewer.c4) != null && xs0Var.rewinding) {
                    xs0Var.setX(motionEvent.getX());
                }
                if (ch0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(ch0Var.y.getX(), ch0Var.y.getY());
                    boolean dispatchTouchEvent = ch0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        ch0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = ch0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !ch0Var.s.isInProgress() && ch0Var.v.g0(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    ch0Var.w = false;
                    ch0Var.x = false;
                    if (ch0Var.d0) {
                        ch0Var.d0 = false;
                        ch0 ch0Var2 = ch0.p0;
                        dv dvVar = ch0Var2.U;
                        if (dvVar != null) {
                            dvVar.G();
                        } else {
                            PhotoViewer photoViewer2 = ch0Var2.V;
                            if (photoViewer2 != null) {
                                photoViewer2.Q0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        ch0.j(false);
                    } else {
                        o1.j jVar = ch0Var.M;
                        if (!jVar.f) {
                            float f7 = ch0Var.K;
                            jVar.b = f7;
                            jVar.c = true;
                            jVar.u.i = (ch0Var.H / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            ch0Var.M.h();
                        }
                        o1.j jVar2 = ch0Var.N;
                        if (!jVar2.f) {
                            jVar2.b = ch0Var.L;
                            jVar2.c = true;
                            jVar2.u.i = a8.ee.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - ch0Var.I) - AndroidUtilities.dp(16.0f));
                            ch0Var.N.h();
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
                ch0 ch0Var = this.b;
                ch0Var.G = null;
                AndroidUtilities.setPreferredMaxRefreshRate(ch0Var.b, ch0Var.d, ch0Var.c);
                if (ch0Var.H != ch0Var.t() * ch0Var.J || ch0Var.I != ch0Var.r() * ch0Var.J) {
                    WindowManager.LayoutParams layoutParams = ch0Var.c;
                    int t10 = (int) (ch0Var.t() * ch0Var.J);
                    ch0Var.H = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = ch0Var.c;
                    int r6 = (int) (ch0Var.r() * ch0Var.J);
                    ch0Var.I = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(ch0Var.b, ch0Var.d, ch0Var.c);
                    o1.j jVar = ch0Var.M;
                    float f7 = ch0Var.K;
                    jVar.b = f7;
                    jVar.c = true;
                    jVar.u.i = a1.g.C(ch0Var.t(), ch0Var.J, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (ch0Var.t() * ch0Var.J)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    ch0Var.M.h();
                    o1.j jVar2 = ch0Var.N;
                    jVar2.b = ch0Var.L;
                    jVar2.c = true;
                    jVar2.u.i = a8.ee.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (ch0Var.r() * ch0Var.J)) - AndroidUtilities.dp(16.0f));
                    ch0Var.N.h();
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
                ch0 ch0Var = this.b;
                j81 j81Var = ch0Var.Q;
                if (j81Var.j) {
                    j81Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    ch0Var.Q.draw(canvas);
                }
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null && photoViewer.b4 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    ch0Var.V.b4.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
