package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ok(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l2.f0 f0Var;
        r60 r60Var;
        switch (this.a) {
            case 0:
                xk xkVar = (xk) this.b;
                xkVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                xkVar.e0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) ((k.a) this.b).b;
                if (motionEvent.getActionMasked() != 1 || h1Var == null || !h1Var.isShowing()) {
                    return false;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                h1Var.d(true);
                return false;
            case 2:
                y40 y40Var = (y40) this.b;
                if (y40Var.P == null || y40Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = y40Var.c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    y40Var.D0 = false;
                    y40Var.B0 = motionEvent.getPointerId(0);
                    y40Var.C0 = -1;
                    int i7 = y40Var.R.a;
                    if (i7 == 5) {
                        ImageView imageView = y40Var.I;
                        zi.u0 u0Var = y40Var.P;
                        if (u0Var != null && i7 == 5) {
                            boolean z10 = y40Var.k0;
                            y40Var.k0 = !z10;
                            zi.u0.v();
                            if (u0Var.a0 == 5 && (f0Var = u0Var.W) != null) {
                                f0Var.T(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.e20 e20Var = y40Var.U;
                            if (e20Var != null) {
                                e20Var.t = y40Var.k0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.n10.n(imageView.animate(), y40Var.k0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.t0 t0Var = y40Var.R;
                        if (t0Var.a == 3 && !t0Var.f) {
                            y40Var.B0 = motionEvent.getPointerId(0);
                            y40Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            y40Var.z0 = hypot;
                            y40Var.D0 = hypot > 0.0f;
                            y40Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && y40Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(y40Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(y40Var.C0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            y40Var.v();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / y40Var.z0;
                            zi.m0 m0Var = y40Var.S;
                            float f10 = m0Var == null ? 1.0f : m0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            y40Var.A0 = max;
                            y40Var.P.y(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && y40Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == y40Var.B0 || pointerId == y40Var.C0) {
                            y40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && y40Var.D0) {
                        y40Var.v();
                    }
                }
                return true;
            case 3:
                y60 y60Var = (y60) ((WeakReference) this.b).get();
                if (y60Var == null || (r60Var = y60Var.m) == null || !r60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    y60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    y60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = y60Var.s0;
                    if (view2 != null) {
                        y60Var.s0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    y60Var.r0 = null;
                } else if (actionMasked == 3) {
                    View view3 = y60Var.s0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        y60Var.s0 = null;
                    }
                    view.setOnTouchListener(null);
                    y60Var.r0 = null;
                }
                return true;
            case 4:
                t90 t90Var = (t90) this.b;
                t90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, t90Var.getListView(), t90Var.x, null, t90Var.a);
            case 5:
                oa0 oa0Var = (oa0) this.b;
                oa0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    oa0Var.d0.a(true);
                }
                return true;
            default:
                iw0 iw0Var = (iw0) this.b;
                if (iw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, iw0Var.n1, iw0Var.C1, iw0Var.h2, iw0Var.J0);
        }
    }
}
