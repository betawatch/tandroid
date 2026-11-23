package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qk(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l2.f0 f0Var;
        t60 t60Var;
        switch (this.a) {
            case 0:
                zk zkVar = (zk) this.b;
                zkVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                zkVar.e0();
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
                b50 b50Var = (b50) this.b;
                if (b50Var.P == null || b50Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = b50Var.c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    b50Var.D0 = false;
                    b50Var.B0 = motionEvent.getPointerId(0);
                    b50Var.C0 = -1;
                    int i7 = b50Var.R.a;
                    if (i7 == 5) {
                        ImageView imageView = b50Var.I;
                        zi.u0 u0Var = b50Var.P;
                        if (u0Var != null && i7 == 5) {
                            boolean z10 = b50Var.k0;
                            b50Var.k0 = !z10;
                            zi.u0.v();
                            if (u0Var.a0 == 5 && (f0Var = u0Var.W) != null) {
                                f0Var.T(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.f20 f20Var = b50Var.U;
                            if (f20Var != null) {
                                f20Var.t = b50Var.k0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.o10.n(imageView.animate(), b50Var.k0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.t0 t0Var = b50Var.R;
                        if (t0Var.a == 3 && !t0Var.f) {
                            b50Var.B0 = motionEvent.getPointerId(0);
                            b50Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            b50Var.z0 = hypot;
                            b50Var.D0 = hypot > 0.0f;
                            b50Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && b50Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(b50Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(b50Var.C0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            b50Var.v();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / b50Var.z0;
                            zi.m0 m0Var = b50Var.S;
                            float f10 = m0Var == null ? 1.0f : m0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            b50Var.A0 = max;
                            b50Var.P.y(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && b50Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == b50Var.B0 || pointerId == b50Var.C0) {
                            b50Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && b50Var.D0) {
                        b50Var.v();
                    }
                }
                return true;
            case 3:
                a70 a70Var = (a70) ((WeakReference) this.b).get();
                if (a70Var == null || (t60Var = a70Var.m) == null || !t60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    a70Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    a70Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = a70Var.s0;
                    if (view2 != null) {
                        a70Var.s0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    a70Var.r0 = null;
                } else if (actionMasked == 3) {
                    View view3 = a70Var.s0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        a70Var.s0 = null;
                    }
                    view.setOnTouchListener(null);
                    a70Var.r0 = null;
                }
                return true;
            case 4:
                v90 v90Var = (v90) this.b;
                v90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, v90Var.getListView(), v90Var.x, null, v90Var.a);
            case 5:
                qa0 qa0Var = (qa0) this.b;
                qa0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qa0Var.d0.a(true);
                }
                return true;
            default:
                kw0 kw0Var = (kw0) this.b;
                if (kw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, kw0Var.n1, kw0Var.C1, kw0Var.h2, kw0Var.J0);
        }
    }
}
