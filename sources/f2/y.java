package f2;

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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y implements z0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public y(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                ag.q1 q1Var = e0Var.E;
                ((GestureDetector) e0Var.J.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = e0Var.F;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (e0Var.w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(e0Var.w);
                    if (findPointerIndex >= 0) {
                        e0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    n1 n1Var = e0Var.c;
                    if (n1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    e0Var.s(e0Var.A, findPointerIndex, motionEvent);
                                    e0Var.n(n1Var);
                                    e0Var.D.removeCallbacks(q1Var);
                                    q1Var.run();
                                    e0Var.D.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = e0Var.F;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == e0Var.w) {
                                    e0Var.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    e0Var.s(e0Var.A, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        e0Var.p(null, 0);
                        e0Var.w = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.z0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        View E;
        cl0 cl0Var;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                ((GestureDetector) e0Var.J.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                z zVar = null;
                if (actionMasked == 0) {
                    e0Var.w = motionEvent.getPointerId(0);
                    e0Var.d = motionEvent.getX();
                    e0Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = e0Var.F;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    e0Var.F = VelocityTracker.obtain();
                    if (e0Var.c == null) {
                        ArrayList arrayList = e0Var.B;
                        if (!arrayList.isEmpty()) {
                            View k9 = e0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    z zVar2 = (z) arrayList.get(size);
                                    if (zVar2.e.a == k9) {
                                        zVar = zVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (zVar != null) {
                            n1 n1Var = zVar.e;
                            e0Var.d -= zVar.r;
                            e0Var.e -= zVar.s;
                            e0Var.j(n1Var, true);
                            if (e0Var.a.remove(n1Var.a)) {
                                e0Var.x.a(e0Var.D, n1Var);
                            }
                            e0Var.p(n1Var, zVar.f);
                            e0Var.s(e0Var.A, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    e0Var.w = -1;
                    e0Var.p(null, 0);
                } else {
                    int i10 = e0Var.w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        e0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = e0Var.F;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return e0Var.c != null;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                jl0 jl0Var = (jl0) this.b;
                Rect rect = jl0Var.C1;
                boolean z10 = jl0Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && jl0Var.J1 == null && z10) {
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    jl0Var.V0 = false;
                    u0 itemAnimator = jl0Var.getItemAnimator();
                    if ((jl0Var.g1 || itemAnimator == null || !itemAnimator.k()) && jl0Var.E0(y8) && (E = jl0Var.E(x4, y8)) != null && jl0Var.F0(E)) {
                        jl0Var.J1 = E;
                    }
                    if (jl0Var.J1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - jl0Var.J1.getLeft();
                        float y10 = motionEvent.getY() - jl0Var.J1.getTop();
                        ViewGroup viewGroup = (ViewGroup) jl0Var.J1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x10 < childAt.getLeft() || x10 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    jl0Var.J1 = null;
                                }
                            }
                        }
                    }
                    jl0Var.K1 = -1;
                    View view = jl0Var.J1;
                    if (view != null) {
                        if (jl0Var.d1) {
                            jl0Var.K1 = RecyclerView.S(view);
                        } else {
                            jl0Var.K1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - jl0Var.J1.getLeft(), motionEvent.getY() - jl0Var.J1.getTop(), 0);
                        if (jl0Var.J1.onTouchEvent(obtain)) {
                            jl0Var.L1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (jl0Var.J1 != null && !jl0Var.L1) {
                    try {
                        jl0Var.I1.r(motionEvent);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (jl0Var.L1 || jl0Var.J1 == null) {
                        rect.setEmpty();
                    } else {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        dg.d dVar = new dg.d(this, x11, y11, 1);
                        jl0Var.a1 = dVar;
                        AndroidUtilities.runOnUIThread(dVar, ViewConfiguration.getTapTimeout());
                        if (jl0Var.J1.isEnabled()) {
                            View view2 = jl0Var.J1;
                            if (jl0Var.H0(view2, x11 - view2.getX(), y11 - jl0Var.J1.getY())) {
                                jl0Var.i1(jl0Var.K1, jl0Var.J1);
                                org.telegram.ui.Cells.z zVar3 = jl0Var.z1;
                                if (zVar3 != null) {
                                    Drawable current = zVar3.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (jl0Var.T0 == null && jl0Var.S0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    jl0Var.z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                jl0Var.v1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z10) && jl0Var.J1 != null) {
                    dg.d dVar2 = jl0Var.a1;
                    if (dVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar2);
                        jl0Var.a1 = null;
                    }
                    View view3 = jl0Var.J1;
                    jl0Var.h1(view3, 0.0f, 0.0f, false);
                    jl0Var.J1 = null;
                    jl0Var.L1 = false;
                    jl0Var.k1(motionEvent, view3);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (cl0Var = jl0Var.U0) != null && jl0Var.V0) {
                        cl0Var.h();
                        jl0Var.V0 = false;
                    }
                }
                return false;
        }
    }

    @Override // f2.z0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    ((e0) this.b).p(null, 0);
                    break;
                }
                break;
            default:
                ((jl0) this.b).I0(true);
                break;
        }
    }

    public y(jl0 jl0Var, Context context) {
        this.b = jl0Var;
        o4.g gVar = new o4.g(context, (h20) new el0(this));
        jl0Var.I1 = gVar;
        ((g20) gVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
