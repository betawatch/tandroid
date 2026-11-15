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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nj0 implements v4.s0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public nj0(v4.y yVar) {
        this.b = yVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                v4.y yVar = (v4.y) this.b;
                s4.s0 s0Var = yVar.J;
                ((GestureDetector) yVar.O.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.x);
                    if (findPointerIndex >= 0) {
                        yVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.e1 e1Var = yVar.c;
                    if (e1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    yVar.u(yVar.F, findPointerIndex, motionEvent);
                                    yVar.p(e1Var);
                                    yVar.I.removeCallbacks(s0Var);
                                    s0Var.run();
                                    yVar.I.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = yVar.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == yVar.x) {
                                    yVar.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    yVar.u(yVar.F, actionIndex, motionEvent);
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

    @Override // v4.s0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        jj0 jj0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                uj0 uj0Var = (uj0) this.b;
                Rect rect = uj0Var.F1;
                boolean z10 = uj0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && uj0Var.M1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    uj0Var.Y0 = false;
                    v4.m0 itemAnimator = uj0Var.getItemAnimator();
                    if ((uj0Var.j1 || itemAnimator == null || !itemAnimator.k()) && uj0Var.E0(y10) && (E = uj0Var.E(x10, y10)) != null && uj0Var.F0(E)) {
                        uj0Var.M1 = E;
                    }
                    if (uj0Var.M1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - uj0Var.M1.getLeft();
                        float y11 = motionEvent.getY() - uj0Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) uj0Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y11 < childAt.getTop() || y11 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    uj0Var.M1 = null;
                                }
                            }
                        }
                    }
                    uj0Var.N1 = -1;
                    View view = uj0Var.M1;
                    if (view != null) {
                        if (uj0Var.g1) {
                            uj0Var.N1 = RecyclerView.S(view);
                        } else {
                            uj0Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - uj0Var.M1.getLeft(), motionEvent.getY() - uj0Var.M1.getTop(), 0);
                        if (uj0Var.M1.onTouchEvent(obtain)) {
                            uj0Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (uj0Var.M1 != null && !uj0Var.O1) {
                    try {
                        uj0Var.L1.B0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && uj0Var.M1 != null) {
                        kj0 kj0Var = uj0Var.d1;
                        if (kj0Var != null) {
                            org.telegram.messenger.g0.r(kj0Var);
                            uj0Var.d1 = null;
                        }
                        View view2 = uj0Var.M1;
                        uj0Var.j1(view2, 0.0f, 0.0f, false);
                        uj0Var.M1 = null;
                        uj0Var.O1 = false;
                        uj0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (jj0Var = uj0Var.X0) != null && uj0Var.Y0) {
                            jj0Var.i();
                            uj0Var.Y0 = false;
                            break;
                        }
                    }
                } else if (!uj0Var.O1 && uj0Var.M1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    kj0 kj0Var2 = new kj0(this, x12, y12, 0);
                    uj0Var.d1 = kj0Var2;
                    org.telegram.messenger.g0.i3(kj0Var2, ViewConfiguration.getTapTimeout());
                    if (uj0Var.M1.isEnabled()) {
                        View view3 = uj0Var.M1;
                        if (uj0Var.H0(view3, x12 - view3.getX(), y12 - uj0Var.M1.getY())) {
                            uj0Var.k1(uj0Var.N1, uj0Var.M1);
                            org.telegram.ui.Cells.y yVar = uj0Var.C1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (uj0Var.W0 == null && uj0Var.V0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                uj0Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            uj0Var.y1();
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
                ((GestureDetector) yVar2.O.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.x = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.K;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.K = VelocityTracker.obtain();
                    if (yVar2.c == null) {
                        ArrayList arrayList = yVar2.G;
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
                            v4.e1 e1Var = uVar.e;
                            yVar2.d -= uVar.r;
                            yVar2.e -= uVar.s;
                            yVar2.l(e1Var, true);
                            if (yVar2.a.remove(e1Var.a)) {
                                yVar2.y.a(yVar2.I, e1Var);
                            }
                            yVar2.r(e1Var, uVar.f);
                            yVar2.u(yVar2.F, 0, motionEvent);
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
                VelocityTracker velocityTracker2 = yVar2.K;
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

    @Override // v4.s0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((uj0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((v4.y) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }

    public nj0(Context context, uj0 uj0Var) {
        this.b = uj0Var;
        ff ffVar = new ff(context, new mj0(this));
        uj0Var.L1 = ffVar;
        ((e10) ffVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
