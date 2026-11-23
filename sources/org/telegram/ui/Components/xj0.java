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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xj0 implements v4.t0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public xj0(v4.z zVar) {
        this.b = zVar;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                v4.z zVar = (v4.z) this.b;
                s4.s0 s0Var = zVar.J;
                ((GestureDetector) zVar.O.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.x);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    v4.f1 f1Var = zVar.c;
                    if (f1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    zVar.u(zVar.F, findPointerIndex, motionEvent);
                                    zVar.p(f1Var);
                                    zVar.I.removeCallbacks(s0Var);
                                    s0Var.run();
                                    zVar.I.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = zVar.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == zVar.x) {
                                    zVar.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    zVar.u(zVar.F, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        zVar.r(null, 0);
                        zVar.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.t0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        tj0 tj0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ek0 ek0Var = (ek0) this.b;
                Rect rect = ek0Var.F1;
                boolean z10 = ek0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && ek0Var.M1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ek0Var.Y0 = false;
                    v4.n0 itemAnimator = ek0Var.getItemAnimator();
                    if ((ek0Var.j1 || itemAnimator == null || !itemAnimator.k()) && ek0Var.E0(y10) && (E = ek0Var.E(x10, y10)) != null && ek0Var.F0(E)) {
                        ek0Var.M1 = E;
                    }
                    if (ek0Var.M1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ek0Var.M1.getLeft();
                        float y11 = motionEvent.getY() - ek0Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ek0Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y11 < childAt.getTop() || y11 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    ek0Var.M1 = null;
                                }
                            }
                        }
                    }
                    ek0Var.N1 = -1;
                    View view = ek0Var.M1;
                    if (view != null) {
                        if (ek0Var.g1) {
                            ek0Var.N1 = RecyclerView.S(view);
                        } else {
                            ek0Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ek0Var.M1.getLeft(), motionEvent.getY() - ek0Var.M1.getTop(), 0);
                        if (ek0Var.M1.onTouchEvent(obtain)) {
                            ek0Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ek0Var.M1 != null && !ek0Var.O1) {
                    try {
                        ek0Var.L1.w0(motionEvent);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ek0Var.M1 != null) {
                        uj0 uj0Var = ek0Var.d1;
                        if (uj0Var != null) {
                            org.telegram.messenger.g0.r(uj0Var);
                            ek0Var.d1 = null;
                        }
                        View view2 = ek0Var.M1;
                        ek0Var.j1(view2, 0.0f, 0.0f, false);
                        ek0Var.M1 = null;
                        ek0Var.O1 = false;
                        ek0Var.m1(view2, motionEvent);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (tj0Var = ek0Var.X0) != null && ek0Var.Y0) {
                            tj0Var.j();
                            ek0Var.Y0 = false;
                            break;
                        }
                    }
                } else if (!ek0Var.O1 && ek0Var.M1 != null) {
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    uj0 uj0Var2 = new uj0(this, x12, y12, 0);
                    ek0Var.d1 = uj0Var2;
                    org.telegram.messenger.g0.h3(uj0Var2, ViewConfiguration.getTapTimeout());
                    if (ek0Var.M1.isEnabled()) {
                        View view3 = ek0Var.M1;
                        if (ek0Var.H0(view3, x12 - view3.getX(), y12 - ek0Var.M1.getY())) {
                            ek0Var.k1(ek0Var.N1, ek0Var.M1);
                            org.telegram.ui.Cells.y yVar = ek0Var.C1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (ek0Var.W0 == null && ek0Var.V0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                ek0Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            ek0Var.y1();
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
                v4.z zVar = (v4.z) this.b;
                ((GestureDetector) zVar.O.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                v4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.x = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.K;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.K = VelocityTracker.obtain();
                    if (zVar.c == null) {
                        ArrayList arrayList = zVar.G;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    v4.v vVar2 = (v4.v) arrayList.get(size);
                                    if (vVar2.e.a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            v4.f1 f1Var = vVar.e;
                            zVar.d -= vVar.r;
                            zVar.e -= vVar.s;
                            zVar.l(f1Var, true);
                            if (zVar.a.remove(f1Var.a)) {
                                zVar.y.a(zVar.I, f1Var);
                            }
                            zVar.r(f1Var, vVar.f);
                            zVar.u(zVar.F, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    zVar.x = -1;
                    zVar.r(null, 0);
                } else {
                    int i7 = zVar.x;
                    if (i7 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i7)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = zVar.K;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (zVar.c == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // v4.t0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((ek0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((v4.z) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }

    public xj0(Context context, ek0 ek0Var) {
        this.b = ek0Var;
        qf qfVar = new qf(context, new wj0(this));
        ek0Var.L1 = qfVar;
        ((o10) qfVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
