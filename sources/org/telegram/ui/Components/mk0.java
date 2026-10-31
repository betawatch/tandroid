package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mk0 implements s4.r0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public mk0(s4.x xVar) {
        this.b = xVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                s4.x xVar = (s4.x) this.b;
                ew ewVar = xVar.I;
                ((GestureDetector) xVar.N.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = xVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (xVar.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(xVar.x);
                    if (findPointerIndex >= 0) {
                        xVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = xVar.c;
                    if (c1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    xVar.u(xVar.E, findPointerIndex, motionEvent);
                                    xVar.p(c1Var);
                                    xVar.H.removeCallbacks(ewVar);
                                    ewVar.run();
                                    xVar.H.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = xVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == xVar.x) {
                                    xVar.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    xVar.u(xVar.E, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        xVar.r(null, 0);
                        xVar.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        jk0 jk0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                tk0 tk0Var = (tk0) this.b;
                Rect rect = tk0Var.E1;
                boolean z10 = tk0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && tk0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    tk0Var.X0 = false;
                    s4.l0 itemAnimator = tk0Var.getItemAnimator();
                    if ((tk0Var.i1 || itemAnimator == null || !itemAnimator.k()) && tk0Var.E0(y3) && (E = tk0Var.E(x10, y3)) != null && tk0Var.F0(E)) {
                        tk0Var.L1 = E;
                    }
                    if (tk0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - tk0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - tk0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) tk0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    tk0Var.L1 = null;
                                }
                            }
                        }
                    }
                    tk0Var.M1 = -1;
                    View view = tk0Var.L1;
                    if (view != null) {
                        if (tk0Var.f1) {
                            tk0Var.M1 = RecyclerView.S(view);
                        } else {
                            tk0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - tk0Var.L1.getLeft(), motionEvent.getY() - tk0Var.L1.getTop(), 0);
                        if (tk0Var.L1.onTouchEvent(obtain)) {
                            tk0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (tk0Var.L1 != null && !tk0Var.N1) {
                    try {
                        tk0Var.K1.I(motionEvent);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && tk0Var.L1 != null) {
                        lg.k kVar = tk0Var.c1;
                        if (kVar != null) {
                            org.telegram.messenger.i0.r(kVar);
                            tk0Var.c1 = null;
                        }
                        View view2 = tk0Var.L1;
                        tk0Var.j1(view2, 0.0f, 0.0f, false);
                        tk0Var.L1 = null;
                        tk0Var.N1 = false;
                        tk0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (jk0Var = tk0Var.W0) != null && tk0Var.X0) {
                            jk0Var.g();
                            tk0Var.X0 = false;
                            break;
                        }
                    }
                } else if (!tk0Var.N1 && tk0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    lg.k kVar2 = new lg.k(this, x12, y11, 1);
                    tk0Var.c1 = kVar2;
                    org.telegram.messenger.i0.h3(kVar2, ViewConfiguration.getTapTimeout());
                    if (tk0Var.L1.isEnabled()) {
                        View view3 = tk0Var.L1;
                        if (tk0Var.H0(view3, x12 - view3.getX(), y11 - tk0Var.L1.getY())) {
                            tk0Var.k1(tk0Var.M1, tk0Var.L1);
                            org.telegram.ui.Cells.y yVar = tk0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (tk0Var.V0 == null && tk0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                tk0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            tk0Var.y1();
                            break;
                        }
                    }
                    rect.setEmpty();
                    break;
                } else {
                    rect.setEmpty();
                    break;
                }
                break;
            default:
                s4.x xVar = (s4.x) this.b;
                ((GestureDetector) xVar.N.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.t tVar = null;
                if (actionMasked2 == 0) {
                    xVar.x = motionEvent.getPointerId(0);
                    xVar.d = motionEvent.getX();
                    xVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = xVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    xVar.J = VelocityTracker.obtain();
                    if (xVar.c == null) {
                        ArrayList arrayList = xVar.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = xVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.t tVar2 = (s4.t) arrayList.get(size);
                                    if (tVar2.e.a == m10) {
                                        tVar = tVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (tVar != null) {
                            s4.c1 c1Var = tVar.e;
                            xVar.d -= tVar.r;
                            xVar.e -= tVar.s;
                            xVar.l(c1Var, true);
                            if (xVar.a.remove(c1Var.a)) {
                                xVar.y.a(xVar.H, c1Var);
                            }
                            xVar.r(c1Var, tVar.f);
                            xVar.u(xVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    xVar.x = -1;
                    xVar.r(null, 0);
                } else {
                    int i10 = xVar.x;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        xVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = xVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (xVar.c == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // s4.r0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((tk0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((s4.x) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }

    public mk0(Context context, tk0 tk0Var) {
        this.b = tk0Var;
        m2.t tVar = new m2.t(context, (r10) new lk0(this));
        tk0Var.K1 = tVar;
        ((q10) tVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
