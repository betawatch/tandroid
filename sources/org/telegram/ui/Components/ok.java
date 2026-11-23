package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        l2.g0 g0Var;
        q60 q60Var;
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
                            if (u0Var.a0 == 5 && (g0Var = u0Var.W) != null) {
                                g0Var.U(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.d20 d20Var = y40Var.U;
                            if (d20Var != null) {
                                d20Var.t = y40Var.k0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.m10.n(imageView.animate(), y40Var.k0 ? 1.0f : 0.0f, 180L);
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
                x60 x60Var = (x60) ((WeakReference) this.b).get();
                if (x60Var == null || (q60Var = x60Var.m) == null || !q60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    x60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    x60Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = x60Var.s0;
                    if (view2 != null) {
                        x60Var.s0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    x60Var.r0 = null;
                } else if (actionMasked == 3) {
                    View view3 = x60Var.s0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        x60Var.s0 = null;
                    }
                    view.setOnTouchListener(null);
                    x60Var.r0 = null;
                }
                return true;
            case 4:
                s90 s90Var = (s90) this.b;
                s90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, s90Var.getListView(), s90Var.x, null, s90Var.a);
            case 5:
                na0 na0Var = (na0) this.b;
                na0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    na0Var.d0.a(true);
                }
                return true;
            default:
                jw0 jw0Var = (jw0) this.b;
                if (jw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, jw0Var.n1, jw0Var.C1, jw0Var.h2, jw0Var.J0);
        }
    }
}
