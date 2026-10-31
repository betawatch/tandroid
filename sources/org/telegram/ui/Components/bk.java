package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i2.i0 i0Var;
        u60 u60Var;
        switch (this.a) {
            case 0:
                kk kkVar = (kk) this.b;
                kkVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                kkVar.c0();
                return false;
            case 1:
                org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) ((k.a) this.b).b;
                if (motionEvent.getActionMasked() != 1 || k1Var == null || !k1Var.isShowing()) {
                    return false;
                }
                Rect rect = org.telegram.messenger.i0.Q;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                k1Var.d(true);
                return false;
            case 2:
                d50 d50Var = (d50) this.b;
                if (d50Var.O == null || d50Var.Q == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = d50Var.a0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    d50Var.B0 = false;
                    d50Var.z0 = motionEvent.getPointerId(0);
                    d50Var.A0 = -1;
                    int i10 = d50Var.Q.a;
                    if (i10 == 5) {
                        ImageView imageView = d50Var.H;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && i10 == 5) {
                            boolean z10 = d50Var.i0;
                            d50Var.i0 = !z10;
                            li.x0.u();
                            if (x0Var.Z == 5 && (i0Var = x0Var.V) != null) {
                                i0Var.S(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.x20 x20Var = d50Var.T;
                            if (x20Var != null) {
                                x20Var.t = d50Var.i0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.z20.l(imageView.animate(), d50Var.i0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        li.w0 w0Var = d50Var.Q;
                        if (w0Var.a == 3 && !w0Var.f) {
                            d50Var.z0 = motionEvent.getPointerId(0);
                            d50Var.A0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            d50Var.x0 = hypot;
                            d50Var.B0 = hypot > 0.0f;
                            d50Var.y0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && d50Var.B0) {
                        int findPointerIndex = motionEvent.findPointerIndex(d50Var.z0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(d50Var.A0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            d50Var.u();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / d50Var.x0;
                            li.p0 p0Var = d50Var.R;
                            float f7 = p0Var == null ? 1.0f : p0Var.c;
                            float max = f7 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f7 - 1.0f))) : 0.0f;
                            d50Var.y0 = max;
                            d50Var.O.x(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && d50Var.B0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == d50Var.z0 || pointerId == d50Var.A0) {
                            d50Var.u();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && d50Var.B0) {
                        d50Var.u();
                    }
                }
                return true;
            case 3:
                z60 z60Var = (z60) ((WeakReference) this.b).get();
                if (z60Var == null || (u60Var = z60Var.m) == null || !u60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    z60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    z60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = z60Var.p0;
                    if (view2 != null) {
                        z60Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    z60Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = z60Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        z60Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    z60Var.o0 = null;
                }
                return true;
            case 4:
                y90 y90Var = (y90) this.b;
                y90Var.getClass();
                return org.telegram.ui.lt.p().r(motionEvent, y90Var.getListView(), y90Var.x, null, y90Var.a);
            case 5:
                ua0 ua0Var = (ua0) this.b;
                ua0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ua0Var.c0.a(true);
                }
                return true;
            default:
                cx0 cx0Var = (cx0) this.b;
                if (cx0Var.I1) {
                    return false;
                }
                return org.telegram.ui.lt.p().r(motionEvent, cx0Var.j1, cx0Var.y1, cx0Var.d2, cx0Var.I0);
        }
    }
}
