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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rf0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(sf0 sf0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = sf0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                sf0 sf0Var = this.b;
                un0 un0Var = sf0Var.N;
                if (un0Var != null && un0Var.a()) {
                    sf0Var.N.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sf0Var.N.draw(canvas);
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
        org.telegram.ui.is0 is0Var;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                sf0 sf0Var = this.b;
                if (actionMasked == 0 || actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 1) {
                        sf0Var.b0 = true;
                        sf0Var.c0 = new float[]{motionEvent.getX(), motionEvent.getY()};
                        AndroidUtilities.runOnUIThread(sf0Var.d0, 500L);
                    } else {
                        sf0Var.b0 = false;
                        sf0Var.i();
                        AndroidUtilities.cancelRunOnUIThread(sf0Var.d0);
                    }
                }
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sf0Var.b0 = false;
                    sf0Var.i();
                    AndroidUtilities.cancelRunOnUIThread(sf0Var.d0);
                } else if (actionMasked == 2 && (photoViewer = sf0Var.R) != null && (is0Var = photoViewer.Y3) != null && is0Var.rewinding) {
                    is0Var.setX(motionEvent.getX());
                }
                if (sf0Var.y != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(sf0Var.y.getX(), sf0Var.y.getY());
                    boolean dispatchTouchEvent = sf0Var.y.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                        sf0Var.y = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = sf0Var.s.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !sf0Var.s.isInProgress() && sf0Var.v.P(motionEvent);
                if (actionMasked == 1 || actionMasked == 3 || actionMasked == 6) {
                    sf0Var.w = false;
                    sf0Var.x = false;
                    if (sf0Var.Z) {
                        sf0Var.Z = false;
                        sf0 sf0Var2 = sf0.l0;
                        fu fuVar = sf0Var2.Q;
                        if (fuVar != null) {
                            fuVar.H();
                        } else {
                            PhotoViewer photoViewer2 = sf0Var2.R;
                            if (photoViewer2 != null) {
                                photoViewer2.P0();
                                MediaController.getInstance().tryResumePausedAudio();
                            }
                        }
                        sf0.j(false);
                    } else {
                        o1.j jVar = sf0Var.I;
                        if (!jVar.f) {
                            float f10 = sf0Var.G;
                            jVar.b = f10;
                            jVar.c = true;
                            jVar.u.i = (sf0Var.D / 2.0f) + f10 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r1 - r6) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                            sf0Var.I.f();
                        }
                        o1.j jVar2 = sf0Var.J;
                        if (!jVar2.f) {
                            jVar2.b = sf0Var.H;
                            jVar2.c = true;
                            jVar2.u.i = h7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - sf0Var.E) - AndroidUtilities.dp(16.0f));
                            sf0Var.J.f();
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
                sf0 sf0Var = this.b;
                sf0Var.C = null;
                AndroidUtilities.setPreferredMaxRefreshRate(sf0Var.b, sf0Var.d, sf0Var.c);
                if (sf0Var.D != sf0Var.t() * sf0Var.F || sf0Var.E != sf0Var.r() * sf0Var.F) {
                    WindowManager.LayoutParams layoutParams = sf0Var.c;
                    int t10 = (int) (sf0Var.t() * sf0Var.F);
                    sf0Var.D = t10;
                    layoutParams.width = t10;
                    WindowManager.LayoutParams layoutParams2 = sf0Var.c;
                    int r10 = (int) (sf0Var.r() * sf0Var.F);
                    sf0Var.E = r10;
                    layoutParams2.height = r10;
                    AndroidUtilities.updateViewLayout(sf0Var.b, sf0Var.d, sf0Var.c);
                    o1.j jVar = sf0Var.I;
                    float f10 = sf0Var.G;
                    jVar.b = f10;
                    jVar.c = true;
                    jVar.u.i = a9.p.d(sf0Var.t(), sf0Var.F, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (sf0Var.t() * sf0Var.F)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                    sf0Var.I.f();
                    o1.j jVar2 = sf0Var.J;
                    jVar2.b = sf0Var.H;
                    jVar2.c = true;
                    jVar2.u.i = h7.n.a(r1, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (sf0Var.r() * sf0Var.F)) - AndroidUtilities.dp(16.0f));
                    sf0Var.J.f();
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
                sf0 sf0Var = this.b;
                c61 c61Var = sf0Var.M;
                if (c61Var.j) {
                    c61Var.setBounds(getLeft(), getTop(), getRight(), getBottom());
                    sf0Var.M.draw(canvas);
                }
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null && photoViewer.X3 != null) {
                    canvas.save();
                    canvas.translate(getLeft(), getTop());
                    sf0Var.R.X3.draw(canvas, getRight() - getLeft(), getBottom() - getTop());
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
