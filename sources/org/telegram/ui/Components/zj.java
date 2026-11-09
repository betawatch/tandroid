package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        g60 g60Var;
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
                o40 o40Var = (o40) this.b;
                if (o40Var.O == null || o40Var.Q == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = o40Var.b0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    o40Var.C0 = false;
                    o40Var.A0 = motionEvent.getPointerId(0);
                    o40Var.B0 = -1;
                    int i7 = o40Var.Q.a;
                    if (i7 == 5) {
                        ImageView imageView = o40Var.H;
                        wi.t0 t0Var = o40Var.O;
                        if (t0Var != null && i7 == 5) {
                            boolean z9 = o40Var.j0;
                            o40Var.j0 = !z9;
                            wi.t0.v();
                            if (t0Var.a0 == 5 && (i0Var = t0Var.W) != null) {
                                i0Var.T(!z9 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.j20 j20Var = o40Var.T;
                            if (j20Var != null) {
                                j20Var.t = o40Var.j0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.camera.q.k(imageView.animate(), o40Var.j0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        wi.s0 s0Var = o40Var.Q;
                        if (s0Var.a == 3 && !s0Var.f) {
                            o40Var.A0 = motionEvent.getPointerId(0);
                            o40Var.B0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            o40Var.y0 = hypot;
                            o40Var.C0 = hypot > 0.0f;
                            o40Var.z0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && o40Var.C0) {
                        int findPointerIndex = motionEvent.findPointerIndex(o40Var.A0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(o40Var.B0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            o40Var.v();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / o40Var.y0;
                            wi.l0 l0Var = o40Var.R;
                            float f10 = l0Var == null ? 1.0f : l0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            o40Var.z0 = max;
                            o40Var.O.y(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && o40Var.C0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == o40Var.A0 || pointerId == o40Var.B0) {
                            o40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && o40Var.C0) {
                        o40Var.v();
                    }
                }
                return true;
            case 3:
                l60 l60Var = (l60) ((WeakReference) this.b).get();
                if (l60Var == null || (g60Var = l60Var.m) == null || !g60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    l60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    l60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = l60Var.p0;
                    if (view2 != null) {
                        l60Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    l60Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = l60Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        l60Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    l60Var.o0 = null;
                }
                return true;
            case 4:
                h90 h90Var = (h90) this.b;
                h90Var.getClass();
                return org.telegram.ui.ms.p().r(motionEvent, h90Var.getListView(), h90Var.x, null, h90Var.a);
            case 5:
                da0 da0Var = (da0) this.b;
                da0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    da0Var.c0.a(true);
                }
                return true;
            default:
                zv0 zv0Var = (zv0) this.b;
                if (zv0Var.I1) {
                    return false;
                }
                return org.telegram.ui.ms.p().r(motionEvent, zv0Var.j1, zv0Var.y1, zv0Var.d2, zv0Var.I0);
        }
    }
}
