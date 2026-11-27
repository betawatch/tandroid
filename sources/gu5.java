// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gu5 implements u79 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    public gu5(d79 d79Var, Context context) {
        this.b = d79Var;
        xh4 xh4Var = new xh4(context, new w69(this));
        d79Var.L1 = xh4Var;
        ((su4) xh4Var.b).t = false;
    }

    @Override // u79
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                lu5 lu5Var = (lu5) this.b;
                zz3 zz3Var = lu5Var.J;
                ((GestureDetector) lu5Var.O.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = lu5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (lu5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(lu5Var.x);
                    if (findPointerIndex >= 0) {
                        lu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    f89 f89Var = lu5Var.c;
                    if (f89Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    lu5Var.t(lu5Var.F, findPointerIndex, motionEvent);
                                    lu5Var.p(f89Var);
                                    lu5Var.I.removeCallbacks(zz3Var);
                                    zz3Var.run();
                                    lu5Var.I.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = lu5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == lu5Var.x) {
                                    lu5Var.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    lu5Var.t(lu5Var.F, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        lu5Var.q(null, 0);
                        lu5Var.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0285  */
    @Override // u79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        VelocityTracker velocityTracker;
        View F;
        u69 u69Var;
        byte b = this.a;
        Object obj = this.b;
        hu5 hu5Var = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                lu5 lu5Var = (lu5) obj;
                ((GestureDetector) lu5Var.O.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    lu5Var.x = motionEvent.getPointerId(0);
                    lu5Var.d = motionEvent.getX();
                    lu5Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker2 = lu5Var.K;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    lu5Var.K = VelocityTracker.obtain();
                    if (lu5Var.c == null) {
                        ArrayList arrayList = lu5Var.G;
                        if (!arrayList.isEmpty()) {
                            View m = lu5Var.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    hu5 hu5Var2 = (hu5) arrayList.get(size);
                                    if (hu5Var2.e.a == m) {
                                        hu5Var = hu5Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (hu5Var != null) {
                            f89 f89Var = hu5Var.e;
                            lu5Var.d -= hu5Var.r;
                            lu5Var.e -= hu5Var.s;
                            lu5Var.l(f89Var, true);
                            if (lu5Var.a.remove(f89Var.a)) {
                                lu5Var.y.a(lu5Var.I, f89Var);
                            }
                            lu5Var.q(f89Var, hu5Var.f);
                            lu5Var.t(lu5Var.F, 0, motionEvent);
                        }
                    }
                } else {
                    if (actionMasked == 3 || actionMasked == 1) {
                        lu5Var.x = -1;
                        z = false;
                        lu5Var.q(null, 0);
                        velocityTracker = lu5Var.K;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (lu5Var.c == null) {
                            return true;
                        }
                        return z;
                    }
                    int i = lu5Var.x;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        lu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                z = false;
                velocityTracker = lu5Var.K;
                if (velocityTracker != null) {
                }
                if (lu5Var.c == null) {
                }
                break;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                d79 d79Var = (d79) obj;
                Rect rect = d79Var.F1;
                boolean z2 = d79Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && d79Var.M1 == null && z2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    d79Var.Y0 = false;
                    o79 itemAnimator = d79Var.getItemAnimator();
                    if ((d79Var.j1 || itemAnimator == null || !itemAnimator.k()) && d79Var.G0(y) && (F = d79Var.F(x, y)) != null && d79Var.H0(F)) {
                        d79Var.M1 = F;
                    }
                    if (d79Var.M1 instanceof ViewGroup) {
                        float x2 = motionEvent.getX() - d79Var.M1.getLeft();
                        float y2 = motionEvent.getY() - d79Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) d79Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x2 < childAt.getLeft() || x2 > childAt.getRight() || y2 < childAt.getTop() || y2 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    d79Var.M1 = null;
                                }
                            }
                        }
                    }
                    d79Var.N1 = -1;
                    View view = d79Var.M1;
                    if (view != null) {
                        if (d79Var.g1) {
                            d79Var.N1 = RecyclerView.T(view);
                        } else {
                            d79Var.N1 = RecyclerView.S(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - d79Var.M1.getLeft(), motionEvent.getY() - d79Var.M1.getTop(), 0);
                        if (d79Var.M1.onTouchEvent(obtain)) {
                            d79Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (d79Var.M1 != null && !d79Var.O1) {
                    try {
                        d79Var.L1.E(motionEvent);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (d79Var.O1 || d79Var.M1 == null) {
                        rect.setEmpty();
                    } else {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        ct4 ct4Var = new ct4(this, x3, y3, b2);
                        d79Var.d1 = ct4Var;
                        hl.d3(ct4Var, ViewConfiguration.getTapTimeout());
                        if (d79Var.M1.isEnabled()) {
                            View view2 = d79Var.M1;
                            if (d79Var.J0(view2, x3 - view2.getX(), y3 - d79Var.M1.getY())) {
                                d79Var.m1(d79Var.N1, d79Var.M1);
                                hf0 hf0Var = d79Var.C1;
                                if (hf0Var != null) {
                                    Drawable current = hf0Var.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (d79Var.W0 == null && d79Var.V0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    d79Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                d79Var.z1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z2) && d79Var.M1 != null) {
                    ct4 ct4Var2 = d79Var.d1;
                    if (ct4Var2 != null) {
                        hl.r(ct4Var2);
                        d79Var.d1 = null;
                    }
                    View view3 = d79Var.M1;
                    d79Var.l1(view3, 0.0f, 0.0f, false);
                    d79Var.M1 = null;
                    d79Var.O1 = false;
                    d79Var.o1(view3, motionEvent);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (u69Var = d79Var.X0) != null && d79Var.Y0) {
                        u69Var.f();
                        d79Var.Y0 = false;
                        return false;
                    }
                }
                return false;
        }
    }

    @Override // u79
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((lu5) obj).q(null, 0);
                    break;
                }
                break;
            default:
                ((d79) obj).K0(true);
                break;
        }
    }

    public gu5(lu5 lu5Var) {
        this.b = lu5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
