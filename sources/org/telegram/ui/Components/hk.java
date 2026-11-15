package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l2.f0 f0Var;
        i60 i60Var;
        switch (this.a) {
            case 0:
                qk qkVar = (qk) this.b;
                qkVar.getClass();
                if (motionEvent.getActionMasked() != 1 || view.hasFocus()) {
                    return false;
                }
                qkVar.e0();
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
                q40 q40Var = (q40) this.b;
                if (q40Var.P == null || q40Var.R == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = q40Var.c0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    q40Var.D0 = false;
                    q40Var.B0 = motionEvent.getPointerId(0);
                    q40Var.C0 = -1;
                    int i7 = q40Var.R.a;
                    if (i7 == 5) {
                        ImageView imageView = q40Var.I;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && i7 == 5) {
                            boolean z10 = q40Var.k0;
                            q40Var.k0 = !z10;
                            zi.v0.v();
                            if (v0Var.a0 == 5 && (f0Var = v0Var.W) != null) {
                                f0Var.T(!z10 ? 0.0f : 1.0f);
                            }
                            org.telegram.messenger.g20 g20Var = q40Var.U;
                            if (g20Var != null) {
                                g20Var.t = q40Var.k0;
                            }
                            imageView.animate().cancel();
                            org.telegram.messenger.i20.m(imageView.animate(), q40Var.k0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        zi.u0 u0Var = q40Var.R;
                        if (u0Var.a == 3 && !u0Var.f) {
                            q40Var.B0 = motionEvent.getPointerId(0);
                            q40Var.C0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            q40Var.z0 = hypot;
                            q40Var.D0 = hypot > 0.0f;
                            q40Var.A0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && q40Var.D0) {
                        int findPointerIndex = motionEvent.findPointerIndex(q40Var.B0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(q40Var.C0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            q40Var.v();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / q40Var.z0;
                            zi.m0 m0Var = q40Var.S;
                            float f10 = m0Var == null ? 1.0f : m0Var.c;
                            float max = f10 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f10 - 1.0f))) : 0.0f;
                            q40Var.A0 = max;
                            q40Var.P.y(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && q40Var.D0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == q40Var.B0 || pointerId == q40Var.C0) {
                            q40Var.v();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && q40Var.D0) {
                        q40Var.v();
                    }
                }
                return true;
            case 3:
                m60 m60Var = (m60) ((WeakReference) this.b).get();
                if (m60Var == null || (i60Var = m60Var.m) == null || !i60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    m60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    m60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = m60Var.p0;
                    if (view2 != null) {
                        m60Var.p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    m60Var.o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = m60Var.p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        m60Var.p0 = null;
                    }
                    view.setOnTouchListener(null);
                    m60Var.o0 = null;
                }
                return true;
            case 4:
                j90 j90Var = (j90) this.b;
                j90Var.getClass();
                return org.telegram.ui.ns.p().r(motionEvent, j90Var.getListView(), j90Var.x, null, j90Var.a);
            case 5:
                ea0 ea0Var = (ea0) this.b;
                ea0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ea0Var.d0.a(true);
                }
                return true;
            default:
                bw0 bw0Var = (bw0) this.b;
                if (bw0Var.M1) {
                    return false;
                }
                return org.telegram.ui.ns.p().r(motionEvent, bw0Var.n1, bw0Var.C1, bw0Var.h2, bw0Var.J0);
        }
    }
}
