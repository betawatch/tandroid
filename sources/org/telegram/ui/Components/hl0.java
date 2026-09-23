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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hl0 implements s4.r0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public hl0(s4.y yVar) {
        this.b = yVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                s4.y yVar = (s4.y) this.b;
                qg.b0 b0Var = yVar.I;
                ((GestureDetector) yVar.N.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yVar.w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(yVar.w);
                    if (findPointerIndex >= 0) {
                        yVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.c1 c1Var = yVar.c;
                    if (c1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    yVar.s(yVar.E, findPointerIndex, motionEvent);
                                    yVar.n(c1Var);
                                    yVar.H.removeCallbacks(b0Var);
                                    b0Var.run();
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
                                if (motionEvent.getPointerId(actionIndex) == yVar.w) {
                                    yVar.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    yVar.s(yVar.E, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        yVar.p(null, 0);
                        yVar.w = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.r0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        dl0 dl0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ml0 ml0Var = (ml0) this.b;
                Rect rect = ml0Var.G1;
                boolean z10 = ml0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && ml0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ml0Var.Z0 = false;
                    s4.m0 itemAnimator = ml0Var.getItemAnimator();
                    if ((ml0Var.k1 || itemAnimator == null || !itemAnimator.k()) && ml0Var.E0(y3) && (E = ml0Var.E(x10, y3)) != null && ml0Var.F0(E)) {
                        ml0Var.N1 = E;
                    }
                    if (ml0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ml0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - ml0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ml0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    ml0Var.N1 = null;
                                }
                            }
                        }
                    }
                    ml0Var.O1 = -1;
                    View view = ml0Var.N1;
                    if (view != null) {
                        if (ml0Var.h1) {
                            ml0Var.O1 = RecyclerView.S(view);
                        } else {
                            ml0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ml0Var.N1.getLeft(), motionEvent.getY() - ml0Var.N1.getTop(), 0);
                        if (ml0Var.N1.onTouchEvent(obtain)) {
                            ml0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ml0Var.N1 != null && !ml0Var.P1) {
                    try {
                        ml0Var.M1.y(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked == 0 || actionMasked == 5) {
                    if (ml0Var.P1 || ml0Var.N1 == null) {
                        rect.setEmpty();
                    } else {
                        float x12 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        el0 el0Var = new el0(this, x12, y11, 0);
                        ml0Var.e1 = el0Var;
                        AndroidUtilities.runOnUIThread(el0Var, ViewConfiguration.getTapTimeout());
                        if (ml0Var.N1.isEnabled()) {
                            View view2 = ml0Var.N1;
                            if (ml0Var.H0(view2, x12 - view2.getX(), y11 - ml0Var.N1.getY())) {
                                ml0Var.i1(ml0Var.O1, ml0Var.N1);
                                org.telegram.ui.Cells.z zVar = ml0Var.D1;
                                if (zVar != null) {
                                    Drawable current = zVar.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (ml0Var.X0 == null && ml0Var.W0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    ml0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                ml0Var.v1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ml0Var.N1 != null) {
                    el0 el0Var2 = ml0Var.e1;
                    if (el0Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(el0Var2);
                        ml0Var.e1 = null;
                    }
                    View view3 = ml0Var.N1;
                    ml0Var.h1(view3, 0.0f, 0.0f, false);
                    ml0Var.N1 = null;
                    ml0Var.P1 = false;
                    ml0Var.k1(motionEvent, view3);
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dl0Var = ml0Var.Y0) != null && ml0Var.Z0) {
                        dl0Var.g();
                        ml0Var.Z0 = false;
                    }
                }
                return false;
            default:
                s4.y yVar = (s4.y) this.b;
                ((GestureDetector) yVar.N.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar.w = motionEvent.getPointerId(0);
                    yVar.d = motionEvent.getX();
                    yVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar.J = VelocityTracker.obtain();
                    if (yVar.c == null) {
                        ArrayList arrayList = yVar.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.u uVar2 = (s4.u) arrayList.get(size);
                                    if (uVar2.e.a == k10) {
                                        uVar = uVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (uVar != null) {
                            s4.c1 c1Var = uVar.e;
                            yVar.d -= uVar.r;
                            yVar.e -= uVar.s;
                            yVar.j(c1Var, true);
                            if (yVar.a.remove(c1Var.a)) {
                                yVar.x.a(yVar.H, c1Var);
                            }
                            yVar.p(c1Var, uVar.f);
                            yVar.s(yVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    yVar.w = -1;
                    yVar.p(null, 0);
                } else {
                    int i10 = yVar.w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = yVar.J;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return yVar.c != null;
        }
    }

    @Override // s4.r0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((ml0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((s4.y) this.b).p(null, 0);
                    break;
                }
                break;
        }
    }

    public hl0(ml0 ml0Var, Context context) {
        this.b = ml0Var;
        org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, new gl0(this));
        ml0Var.M1 = jaVar;
        ((l20) jaVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
