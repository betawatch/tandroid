package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k2.i0 i0Var;
        b60 b60Var;
        switch (this.a) {
            case 0:
                hk hkVar = (hk) this.b;
                hkVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                hkVar.e0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) ((k.a) this.b).b;
                if (motionEvent.getActionMasked() != 1 || f1Var == null || !f1Var.isShowing()) {
                    return false;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                f1Var.d(true);
                return false;
            case 2:
                j40 j40Var = (j40) this.b;
                if (j40Var.P == null || j40Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = j40Var.b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    j40Var.C0 = false;
                    j40Var.A0 = motionEvent.getPointerId(0);
                    j40Var.B0 = -1;
                    int i3 = j40Var.R.a;
                    if (i3 == 5) {
                        ImageView imageView = j40Var.I;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && i3 == 5) {
                            boolean z10 = j40Var.j0;
                            j40Var.j0 = !z10;
                            wi.t0.u();
                            if (t0Var.Z == 5 && (i0Var = t0Var.V) != null) {
                                i0Var.R(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.b20 b20Var = j40Var.U;
                            if (b20Var != null) {
                                b20Var.t = j40Var.j0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.camera.q.k(imageView.animate(), j40Var.j0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = j40Var.R;
                        if (s0Var.a == 3 && !s0Var.f) {
                            j40Var.A0 = motionEvent.getPointerId(0);
                            j40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            j40Var.y0 = hypot;
                            j40Var.C0 = hypot > 0.0f;
                            j40Var.z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && j40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(j40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(j40Var.B0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            j40Var.u();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / j40Var.y0;
                            wi.l0 l0Var = j40Var.S;
                            float f10 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            j40Var.z0 = max;
                            j40Var.P.x(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && j40Var.C0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == j40Var.A0 || pointerId == j40Var.B0) {
                            j40Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && j40Var.C0) {
                        j40Var.u();
                    }
                }
                return true;
            case 3:
                f60 f60Var = (f60) ((WeakReference) this.b).get();
                if (f60Var == null || (b60Var = f60Var.m) == null || !b60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    f60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    f60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = f60Var.p0;
                    if (view2 != null) {
                        f60Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    f60Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = f60Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        f60Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    f60Var.o0 = null;
                }
                return true;
            case 4:
                c90 c90Var = (c90) this.b;
                c90Var.getClass();
                return org.telegram.ui.is.p().r(motionEvent, c90Var.getListView(), c90Var.x, null, c90Var.a);
            case 5:
                x90 x90Var = (x90) this.b;
                x90Var.getClass();
                if (motionEvent.getAction() == 1) {
                    x90Var.d0.a(true);
                }
                return true;
            default:
                xv0 xv0Var = (xv0) this.b;
                if (xv0Var.J1) {
                    return false;
                }
                return org.telegram.ui.is.p().r(motionEvent, xv0Var.k1, xv0Var.z1, xv0Var.e2, xv0Var.J0);
        }
    }
}
