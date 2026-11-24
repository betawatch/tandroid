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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cu5 implements j69 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public cu5(r59 r59Var, Context context) {
        this.b = r59Var;
        ai4 ai4Var = new ai4(context, new k59(this));
        r59Var.L1 = ai4Var;
        ((pu4) ai4Var.b).t = false;
    }

    @Override // j69
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                hu5 hu5Var = (hu5) this.b;
                o04 o04Var = hu5Var.J;
                ((GestureDetector) hu5Var.O.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = hu5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (hu5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(hu5Var.x);
                    if (findPointerIndex >= 0) {
                        hu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    u69 u69Var = hu5Var.c;
                    if (u69Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    hu5Var.t(hu5Var.F, findPointerIndex, motionEvent);
                                    hu5Var.p(u69Var);
                                    hu5Var.I.removeCallbacks(o04Var);
                                    o04Var.run();
                                    hu5Var.I.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = hu5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == hu5Var.x) {
                                    hu5Var.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    hu5Var.t(hu5Var.F, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        hu5Var.q(null, 0);
                        hu5Var.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0285  */
    @Override // j69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        VelocityTracker velocityTracker;
        View E;
        i59 i59Var;
        byte b = this.a;
        Object obj = this.b;
        du5 du5Var = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                hu5 hu5Var = (hu5) obj;
                ((GestureDetector) hu5Var.O.a).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    hu5Var.x = motionEvent.getPointerId(0);
                    hu5Var.d = motionEvent.getX();
                    hu5Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker2 = hu5Var.K;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    hu5Var.K = VelocityTracker.obtain();
                    if (hu5Var.c == null) {
                        ArrayList arrayList = hu5Var.G;
                        if (!arrayList.isEmpty()) {
                            View m = hu5Var.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    du5 du5Var2 = (du5) arrayList.get(size);
                                    if (du5Var2.e.a == m) {
                                        du5Var = du5Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (du5Var != null) {
                            u69 u69Var = du5Var.e;
                            hu5Var.d -= du5Var.r;
                            hu5Var.e -= du5Var.s;
                            hu5Var.l(u69Var, true);
                            if (hu5Var.a.remove(u69Var.a)) {
                                hu5Var.y.a(hu5Var.I, u69Var);
                            }
                            hu5Var.q(u69Var, du5Var.f);
                            hu5Var.t(hu5Var.F, 0, motionEvent);
                        }
                    }
                } else {
                    if (actionMasked == 3 || actionMasked == 1) {
                        hu5Var.x = -1;
                        z = false;
                        hu5Var.q(null, 0);
                        velocityTracker = hu5Var.K;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (hu5Var.c == null) {
                            return true;
                        }
                        return z;
                    }
                    int i = hu5Var.x;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        hu5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                z = false;
                velocityTracker = hu5Var.K;
                if (velocityTracker != null) {
                }
                if (hu5Var.c == null) {
                }
                break;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                r59 r59Var = (r59) obj;
                Rect rect = r59Var.F1;
                boolean z2 = r59Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && r59Var.M1 == null && z2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    r59Var.Y0 = false;
                    d69 itemAnimator = r59Var.getItemAnimator();
                    if ((r59Var.j1 || itemAnimator == null || !itemAnimator.k()) && r59Var.F0(y) && (E = r59Var.E(x, y)) != null && r59Var.G0(E)) {
                        r59Var.M1 = E;
                    }
                    if (r59Var.M1 instanceof ViewGroup) {
                        float x2 = motionEvent.getX() - r59Var.M1.getLeft();
                        float y2 = motionEvent.getY() - r59Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) r59Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x2 < childAt.getLeft() || x2 > childAt.getRight() || y2 < childAt.getTop() || y2 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    r59Var.M1 = null;
                                }
                            }
                        }
                    }
                    r59Var.N1 = -1;
                    View view = r59Var.M1;
                    if (view != null) {
                        if (r59Var.g1) {
                            r59Var.N1 = RecyclerView.S(view);
                        } else {
                            r59Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - r59Var.M1.getLeft(), motionEvent.getY() - r59Var.M1.getTop(), 0);
                        if (r59Var.M1.onTouchEvent(obtain)) {
                            r59Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (r59Var.M1 != null && !r59Var.O1) {
                    try {
                        r59Var.L1.I(motionEvent);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (r59Var.O1 || r59Var.M1 == null) {
                        rect.setEmpty();
                    } else {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        zs4 zs4Var = new zs4(this, x3, y3, b2);
                        r59Var.d1 = zs4Var;
                        gm.d3(zs4Var, ViewConfiguration.getTapTimeout());
                        if (r59Var.M1.isEnabled()) {
                            View view2 = r59Var.M1;
                            if (r59Var.I0(view2, x3 - view2.getX(), y3 - r59Var.M1.getY())) {
                                r59Var.l1(r59Var.N1, r59Var.M1);
                                fg0 fg0Var = r59Var.C1;
                                if (fg0Var != null) {
                                    Drawable current = fg0Var.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (r59Var.W0 == null && r59Var.V0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    r59Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                r59Var.y1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z2) && r59Var.M1 != null) {
                    zs4 zs4Var2 = r59Var.d1;
                    if (zs4Var2 != null) {
                        gm.r(zs4Var2);
                        r59Var.d1 = null;
                    }
                    View view3 = r59Var.M1;
                    r59Var.k1(view3, 0.0f, 0.0f, false);
                    r59Var.M1 = null;
                    r59Var.O1 = false;
                    r59Var.n1(view3, motionEvent);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (i59Var = r59Var.X0) != null && r59Var.Y0) {
                        i59Var.i();
                        r59Var.Y0 = false;
                        return false;
                    }
                }
                return false;
        }
    }

    @Override // j69
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((hu5) obj).q(null, 0);
                    break;
                }
                break;
            default:
                ((r59) obj).J0(true);
                break;
        }
    }

    public cu5(hu5 hu5Var) {
        this.b = hu5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
