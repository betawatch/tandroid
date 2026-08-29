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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ag0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag0(bg0 bg0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                bg0 bg0Var = this.b;
                eo0 eo0Var = bg0Var.N;
                if (eo0Var != null && eo0Var.a()) {
                    bg0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    bg0Var.N.draw(canvas);
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
        org.telegram.ui.gs0 gs0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                bg0 bg0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        bg0Var.b0 = true;
                        bg0Var.c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(bg0Var.d0, 500L);
                    } else {
                        bg0Var.b0 = false;
                        bg0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(bg0Var.d0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    bg0Var.b0 = false;
                    bg0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(bg0Var.d0);
                } else if (actionMasked == 2 && (photoViewer = bg0Var.R) != null && (gs0Var = photoViewer.Y3) != null && gs0Var.rewinding) {
                    gs0Var.setX(motionEvent.getX());
                }
                if (bg0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(bg0Var.y.getX(), bg0Var.y.getY());
                    boolean dispatchTouchEvent = bg0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        bg0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = bg0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !bg0Var.s.isInProgress() && bg0Var.v.r(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    bg0Var.w = false;
                    bg0Var.x = false;
                    if (bg0Var.Z) {
                        bg0Var.Z = false;
                        bg0 bg0Var2 = bg0.l0;
                        mu muVar = bg0Var2.Q;
                        if (muVar != null) {
                            muVar.G();
                        } else {
                            PhotoViewer photoViewer2 = bg0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        bg0.j(false);
                    } else {
                        o1.k kVar = bg0Var.I;
                        if (!kVar.f) {
                            float f9 = bg0Var.G;
                            kVar.b = f9;
                            kVar.c = true;
                            kVar.u.i = (bg0Var.D / 2.0f) + f9 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            bg0Var.I.f();
                        }
                        o1.k kVar2 = bg0Var.J;
                        if (!kVar2.f) {
                            kVar2.b = bg0Var.H;
                            kVar2.c = true;
                            kVar2.u.i = i7.w.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
                            bg0Var.J.f();
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
                bg0 bg0Var = this.b;
                bg0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(bg0Var.b, bg0Var.d, bg0Var.c);
                if (bg0Var.D != bg0Var.t() * bg0Var.F || bg0Var.E != bg0Var.r() * bg0Var.F) {
                    WindowManager.LayoutParams layoutParams = bg0Var.c;
                    int t10 = (int) (bg0Var.t() * bg0Var.F);
                    bg0Var.D = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = bg0Var.c;
                    int r6 = (int) (bg0Var.r() * bg0Var.F);
                    bg0Var.E = r6;
                    layoutParams2.height = r6;
                    AndroidUtilities.updateViewLayout(bg0Var.b, bg0Var.d, bg0Var.c);
                    o1.k kVar = bg0Var.I;
                    float f9 = bg0Var.G;
                    kVar.b = f9;
                    kVar.c = true;
                    kVar.u.i = a4.w.d(bg0Var.t(), bg0Var.F, 2.0f, f9) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (bg0Var.t() * bg0Var.F)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    bg0Var.I.f();
                    o1.k kVar2 = bg0Var.J;
                    kVar2.b = bg0Var.H;
                    kVar2.c = true;
                    kVar2.u.i = i7.w.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (bg0Var.r() * bg0Var.F)) - AndroidUtilities.dp(16.0f));
                    bg0Var.J.f();
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
                bg0 bg0Var = this.b;
                n61 n61Var = bg0Var.M;
                if (n61Var.j) {
                    n61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    bg0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    bg0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
