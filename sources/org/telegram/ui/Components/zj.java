package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l2.i0 i0Var;
        f60 f60Var;
        switch (this.a) {
            case 0:
                ik ikVar = (ik) this.b;
                ikVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                ikVar.e0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.b).b;
                if (motionEvent.getActionMasked() != 1 || g1Var == null || !g1Var.isShowing()) {
                    return false;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                g1Var.d(true);
                return false;
            case 2:
                n40 n40Var = (n40) this.b;
                if (n40Var.O == null || n40Var.Q == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = n40Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    n40Var.B0 = false;
                    n40Var.z0 = motionEvent.getPointerId(0);
                    n40Var.A0 = -1;
                    int i7 = n40Var.Q.a;
                    if (i7 == 5) {
                        ImageView imageView = n40Var.H;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && i7 == 5) {
                            boolean z9 = n40Var.i0;
                            n40Var.i0 = !z9;
                            wi.t0.u();
                            if (t0Var.Z == 5 && (i0Var = t0Var.V) != null) {
                                i0Var.T(!z9 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.j20 j20Var = n40Var.T;
                            if (j20Var != null) {
                                j20Var.t = n40Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.camera.q.k(imageView.animate(), n40Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = n40Var.Q;
                        if (s0Var.a == 3 && !s0Var.f) {
                            n40Var.z0 = motionEvent.getPointerId(0);
                            n40Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            n40Var.x0 = hypot;
                            n40Var.B0 = hypot > 0.0f;
                            n40Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && n40Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(n40Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(n40Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            n40Var.u();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / n40Var.x0;
                            wi.l0 l0Var = n40Var.R;
                            float f10 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            n40Var.y0 = max;
                            n40Var.O.x(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && n40Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == n40Var.z0 || pointerId == n40Var.A0) {
                            n40Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && n40Var.B0) {
                        n40Var.u();
                    }
                }
                return true;
            case 3:
                k60 k60Var = (k60) ((WeakReference) this.b).get();
                if (k60Var == null || (f60Var = k60Var.m) == null || !f60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    k60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = k60Var.p0;
                    if (view2 != null) {
                        k60Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    k60Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = k60Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        k60Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    k60Var.o0 = null;
                }
                return true;
            case 4:
                g90 g90Var = (g90) this.b;
                g90Var.getClass();
                return org.telegram.ui.ks.p().r(motionEvent, g90Var.getListView(), g90Var.x, null, g90Var.a);
            case 5:
                ca0 ca0Var = (ca0) this.b;
                ca0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ca0Var.c0.a(true);
                }
                return true;
            default:
                yv0 yv0Var = (yv0) this.b;
                if (yv0Var.I1) {
                    return false;
                }
                return org.telegram.ui.ks.p().r(motionEvent, yv0Var.j1, yv0Var.y1, yv0Var.d2, yv0Var.I0);
        }
    }
}
