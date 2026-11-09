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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jj0 implements v4.r0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public jj0(v4.y yVar) {
        this.b = yVar;
    }

    @Override // v4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                v4.y yVar = (v4.y) this.b;
                tg.y yVar2 = yVar.I;
                ((GestureDetector) yVar.N.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.x);
                    if (findPointerIndex >= 0) {
                        yVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.d1 d1Var = yVar.c;
                    if (d1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    yVar.u(yVar.E, findPointerIndex, motionEvent);
                                    yVar.p(d1Var);
                                    yVar.H.removeCallbacks(yVar2);
                                    yVar2.run();
                                    yVar.H.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = yVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == yVar.x) {
                                    yVar.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    yVar.u(yVar.E, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        yVar.r(null, 0);
                        yVar.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        fj0 fj0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                qj0 qj0Var = (qj0) this.b;
                Rect rect = qj0Var.E1;
                boolean z9 = qj0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && qj0Var.L1 == null && z9) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    qj0Var.X0 = false;
                    v4.l0 itemAnimator = qj0Var.getItemAnimator();
                    if ((qj0Var.i1 || itemAnimator == null || !itemAnimator.k()) && qj0Var.E0(y10) && (E = qj0Var.E(x10, y10)) != null && qj0Var.F0(E)) {
                        qj0Var.L1 = E;
                    }
                    if (qj0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - qj0Var.L1.getLeft();
                        float y11 = motionEvent.getY() - qj0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) qj0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y11 < childAt.getTop() || y11 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    qj0Var.L1 = null;
                                }
                            }
                        }
                    }
                    qj0Var.M1 = -1;
                    View view = qj0Var.L1;
                    if (view != null) {
                        if (qj0Var.f1) {
                            qj0Var.M1 = RecyclerView.S(view);
                        } else {
                            qj0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - qj0Var.L1.getLeft(), motionEvent.getY() - qj0Var.L1.getTop(), 0);
                        if (qj0Var.L1.onTouchEvent(obtain)) {
                            qj0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (qj0Var.L1 != null && !qj0Var.N1) {
                    try {
                        qj0Var.K1.n0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z9) && qj0Var.L1 != null) {
                        gj0 gj0Var = qj0Var.c1;
                        if (gj0Var != null) {
                            org.telegram.messenger.g0.r(gj0Var);
                            qj0Var.c1 = null;
                        }
                        View view2 = qj0Var.L1;
                        qj0Var.j1(view2, 0.0f, 0.0f, false);
                        qj0Var.L1 = null;
                        qj0Var.N1 = false;
                        qj0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (fj0Var = qj0Var.W0) != null && qj0Var.X0) {
                            fj0Var.i();
                            qj0Var.X0 = false;
                            break;
                        }
                    }
                } else if (!qj0Var.N1 && qj0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    gj0 gj0Var2 = new gj0(this, x12, y12, 0);
                    qj0Var.c1 = gj0Var2;
                    org.telegram.messenger.g0.i3(gj0Var2, ViewConfiguration.getTapTimeout());
                    if (qj0Var.L1.isEnabled()) {
                        View view3 = qj0Var.L1;
                        if (qj0Var.H0(view3, x12 - view3.getX(), y12 - qj0Var.L1.getY())) {
                            qj0Var.k1(qj0Var.M1, qj0Var.L1);
                            org.telegram.ui.Cells.y yVar = qj0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (qj0Var.V0 == null && qj0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                qj0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            qj0Var.y1();
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
                v4.y yVar2 = (v4.y) this.b;
                ((GestureDetector) yVar2.N.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.x = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.J = VelocityTracker.obtain();
                    if (yVar2.c == null) {
                        ArrayList arrayList = yVar2.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = yVar2.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    v4.u uVar2 = (v4.u) arrayList.get(size);
                                    if (uVar2.e.a == m10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            v4.d1 d1Var = uVar.e;
                            yVar2.d -= uVar.r;
                            yVar2.e -= uVar.s;
                            yVar2.l(d1Var, true);
                            if (yVar2.a.remove(d1Var.a)) {
                                yVar2.y.a(yVar2.H, d1Var);
                            }
                            yVar2.r(d1Var, uVar.f);
                            yVar2.u(yVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    yVar2.x = -1;
                    yVar2.r(null, 0);
                } else {
                    int i7 = yVar2.x;
                    if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                        yVar2.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = yVar2.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (yVar2.c == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // v4.r0
    public final void c(boolean z9) {
        switch (this.a) {
            case 0:
                ((qj0) this.b).I0(true);
                break;
            default:
                if (z9) {
                    ((v4.y) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }

    public jj0(Context context, qj0 qj0Var) {
        this.b = qj0Var;
        rt rtVar = new rt(context, new ij0(this));
        qj0Var.K1 = rtVar;
        ((b10) rtVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
