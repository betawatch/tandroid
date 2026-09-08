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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gl0 implements s4.r0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public gl0(s4.y yVar) {
        this.b = yVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                s4.y yVar = (s4.y) this.b;
                rg.b0 b0Var = yVar.I;
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
        cl0 cl0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                ll0 ll0Var = (ll0) this.b;
                Rect rect = ll0Var.G1;
                boolean z10 = ll0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && ll0Var.N1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ll0Var.Z0 = false;
                    s4.m0 itemAnimator = ll0Var.getItemAnimator();
                    if ((ll0Var.k1 || itemAnimator == null || !itemAnimator.k()) && ll0Var.E0(y3) && (E = ll0Var.E(x10, y3)) != null && ll0Var.F0(E)) {
                        ll0Var.N1 = E;
                    }
                    if (ll0Var.N1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - ll0Var.N1.getLeft();
                        float y10 = motionEvent.getY() - ll0Var.N1.getTop();
                        ViewGroup viewGroup = (ViewGroup) ll0Var.N1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    ll0Var.N1 = null;
                                }
                            }
                        }
                    }
                    ll0Var.O1 = -1;
                    View view = ll0Var.N1;
                    if (view != null) {
                        if (ll0Var.h1) {
                            ll0Var.O1 = RecyclerView.S(view);
                        } else {
                            ll0Var.O1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - ll0Var.N1.getLeft(), motionEvent.getY() - ll0Var.N1.getTop(), 0);
                        if (ll0Var.N1.onTouchEvent(obtain)) {
                            ll0Var.P1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (ll0Var.N1 != null && !ll0Var.P1) {
                    try {
                        ll0Var.M1.h(motionEvent);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (actionMasked == 0 || actionMasked == 5) {
                    if (ll0Var.P1 || ll0Var.N1 == null) {
                        rect.setEmpty();
                    } else {
                        float x12 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        dl0 dl0Var = new dl0(this, x12, y11, 0);
                        ll0Var.e1 = dl0Var;
                        AndroidUtilities.runOnUIThread(dl0Var, ViewConfiguration.getTapTimeout());
                        if (ll0Var.N1.isEnabled()) {
                            View view2 = ll0Var.N1;
                            if (ll0Var.H0(view2, x12 - view2.getX(), y11 - ll0Var.N1.getY())) {
                                ll0Var.h1(ll0Var.O1, ll0Var.N1);
                                org.telegram.ui.Cells.z zVar = ll0Var.D1;
                                if (zVar != null) {
                                    Drawable current = zVar.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (ll0Var.X0 == null && ll0Var.W0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    ll0Var.D1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                ll0Var.u1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && ll0Var.N1 != null) {
                    dl0 dl0Var2 = ll0Var.e1;
                    if (dl0Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(dl0Var2);
                        ll0Var.e1 = null;
                    }
                    View view3 = ll0Var.N1;
                    ll0Var.g1(view3, 0.0f, 0.0f, false);
                    ll0Var.N1 = null;
                    ll0Var.P1 = false;
                    ll0Var.j1(motionEvent, view3);
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (cl0Var = ll0Var.Y0) != null && ll0Var.Z0) {
                        cl0Var.h();
                        ll0Var.Z0 = false;
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
                ((ll0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((s4.y) this.b).p(null, 0);
                    break;
                }
                break;
        }
    }

    public gl0(ll0 ll0Var, Context context) {
        this.b = ll0Var;
        mg.n nVar = new mg.n(context, new fl0(this));
        ll0Var.M1 = nVar;
        ((k20) nVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
