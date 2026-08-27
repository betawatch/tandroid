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
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z implements a1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public z(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                a8.b bVar = f0Var.E;
                ((GestureDetector) f0Var.J.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = f0Var.F;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (f0Var.w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(f0Var.w);
                    if (findPointerIndex >= 0) {
                        f0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    o1 o1Var = f0Var.c;
                    if (o1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    f0Var.s(f0Var.A, findPointerIndex, motionEvent);
                                    f0Var.n(o1Var);
                                    f0Var.D.removeCallbacks(bVar);
                                    bVar.run();
                                    f0Var.D.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = f0Var.F;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == f0Var.w) {
                                    f0Var.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    f0Var.s(f0Var.A, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        f0Var.p(null, 0);
                        f0Var.w = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // f2.a1
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        View E;
        sk0 sk0Var;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                ((GestureDetector) f0Var.J.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                a0 a0Var = null;
                if (actionMasked == 0) {
                    f0Var.w = motionEvent.getPointerId(0);
                    f0Var.d = motionEvent.getX();
                    f0Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = f0Var.F;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    f0Var.F = VelocityTracker.obtain();
                    if (f0Var.c == null) {
                        ArrayList arrayList = f0Var.B;
                        if (!arrayList.isEmpty()) {
                            View k10 = f0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    a0 a0Var2 = (a0) arrayList.get(size);
                                    if (a0Var2.e.a == k10) {
                                        a0Var = a0Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (a0Var != null) {
                            o1 o1Var = a0Var.e;
                            f0Var.d -= a0Var.r;
                            f0Var.e -= a0Var.s;
                            f0Var.j(o1Var, true);
                            if (f0Var.a.remove(o1Var.a)) {
                                f0Var.x.a(f0Var.D, o1Var);
                            }
                            f0Var.p(o1Var, a0Var.f);
                            f0Var.s(f0Var.A, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    f0Var.w = -1;
                    f0Var.p(null, 0);
                } else {
                    int i10 = f0Var.w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        f0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = f0Var.F;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return f0Var.c != null;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                zk0 zk0Var = (zk0) this.b;
                Rect rect = zk0Var.C1;
                boolean z10 = zk0Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && zk0Var.J1 == null && z10) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    zk0Var.V0 = false;
                    v0 itemAnimator = zk0Var.getItemAnimator();
                    if ((zk0Var.g1 || itemAnimator == null || !itemAnimator.k()) && zk0Var.E0(y10) && (E = zk0Var.E(x8, y10)) != null && zk0Var.F0(E)) {
                        zk0Var.J1 = E;
                    }
                    if (zk0Var.J1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - zk0Var.J1.getLeft();
                        float y11 = motionEvent.getY() - zk0Var.J1.getTop();
                        ViewGroup viewGroup = (ViewGroup) zk0Var.J1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x10 < childAt.getLeft() || x10 > childAt.getRight() || y11 < childAt.getTop() || y11 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    zk0Var.J1 = null;
                                }
                            }
                        }
                    }
                    zk0Var.K1 = -1;
                    View view = zk0Var.J1;
                    if (view != null) {
                        if (zk0Var.d1) {
                            zk0Var.K1 = RecyclerView.S(view);
                        } else {
                            zk0Var.K1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - zk0Var.J1.getLeft(), motionEvent.getY() - zk0Var.J1.getTop(), 0);
                        if (zk0Var.J1.onTouchEvent(obtain)) {
                            zk0Var.L1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (zk0Var.J1 != null && !zk0Var.L1) {
                    try {
                        zk0Var.I1.P(motionEvent);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (zk0Var.L1 || zk0Var.J1 == null) {
                        rect.setEmpty();
                    } else {
                        float x11 = motionEvent.getX();
                        float y12 = motionEvent.getY();
                        bg.d dVar = new bg.d(this, x11, y12, 1);
                        zk0Var.a1 = dVar;
                        AndroidUtilities.runOnUIThread(dVar, ViewConfiguration.getTapTimeout());
                        if (zk0Var.J1.isEnabled()) {
                            View view2 = zk0Var.J1;
                            if (zk0Var.H0(view2, x11 - view2.getX(), y12 - zk0Var.J1.getY())) {
                                zk0Var.i1(zk0Var.K1, zk0Var.J1);
                                org.telegram.ui.Cells.z zVar = zk0Var.z1;
                                if (zVar != null) {
                                    Drawable current = zVar.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (zk0Var.T0 == null && zk0Var.S0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    zk0Var.z1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                zk0Var.v1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z10) && zk0Var.J1 != null) {
                    bg.d dVar2 = zk0Var.a1;
                    if (dVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar2);
                        zk0Var.a1 = null;
                    }
                    View view3 = zk0Var.J1;
                    zk0Var.h1(view3, 0.0f, 0.0f, false);
                    zk0Var.J1 = null;
                    zk0Var.L1 = false;
                    zk0Var.k1(motionEvent, view3);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (sk0Var = zk0Var.U0) != null && zk0Var.V0) {
                        sk0Var.i();
                        zk0Var.V0 = false;
                    }
                }
                return false;
        }
    }

    @Override // f2.a1
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    ((f0) this.b).p(null, 0);
                    break;
                }
                break;
            default:
                ((zk0) this.b).I0(true);
                break;
        }
    }

    public z(zk0 zk0Var, Context context) {
        this.b = zk0Var;
        n1.d dVar = new n1.d(context, new uk0(this));
        zk0Var.I1 = dVar;
        ((y10) dVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
