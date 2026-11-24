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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ds5 implements h49 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public ds5(o39 o39Var, Context context) {
        this.b = o39Var;
        z24 z24Var = new z24(context, new h39(this));
        o39Var.L1 = z24Var;
        ((os4) z24Var.b).t = false;
    }

    @Override // h49
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                is5 is5Var = (is5) this.b;
                ez3 ez3Var = is5Var.J;
                ((GestureDetector) is5Var.O.a).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = is5Var.K;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (is5Var.x != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(is5Var.x);
                    if (findPointerIndex >= 0) {
                        is5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s49 s49Var = is5Var.c;
                    if (s49Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    is5Var.t(is5Var.F, findPointerIndex, motionEvent);
                                    is5Var.p(s49Var);
                                    is5Var.I.removeCallbacks(ez3Var);
                                    ez3Var.run();
                                    is5Var.I.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = is5Var.K;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == is5Var.x) {
                                    is5Var.x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    is5Var.t(is5Var.F, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        is5Var.q(null, 0);
                        is5Var.x = -1;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0285  */
    @Override // h49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        VelocityTracker velocityTracker;
        View E;
        f39 f39Var;
        byte b = this.a;
        Object obj = this.b;
        es5 es5Var = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                is5 is5Var = (is5) obj;
                ((GestureDetector) is5Var.O.a).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    is5Var.x = motionEvent.getPointerId(0);
                    is5Var.d = motionEvent.getX();
                    is5Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker2 = is5Var.K;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    is5Var.K = VelocityTracker.obtain();
                    if (is5Var.c == null) {
                        ArrayList arrayList = is5Var.G;
                        if (!arrayList.isEmpty()) {
                            View m = is5Var.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    es5 es5Var2 = (es5) arrayList.get(size);
                                    if (es5Var2.e.a == m) {
                                        es5Var = es5Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (es5Var != null) {
                            s49 s49Var = es5Var.e;
                            is5Var.d -= es5Var.r;
                            is5Var.e -= es5Var.s;
                            is5Var.l(s49Var, true);
                            if (is5Var.a.remove(s49Var.a)) {
                                is5Var.y.a(is5Var.I, s49Var);
                            }
                            is5Var.q(s49Var, es5Var.f);
                            is5Var.t(is5Var.F, 0, motionEvent);
                        }
                    }
                } else {
                    if (actionMasked == 3 || actionMasked == 1) {
                        is5Var.x = -1;
                        z = false;
                        is5Var.q(null, 0);
                        velocityTracker = is5Var.K;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (is5Var.c == null) {
                            return true;
                        }
                        return z;
                    }
                    int i = is5Var.x;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        is5Var.j(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                z = false;
                velocityTracker = is5Var.K;
                if (velocityTracker != null) {
                }
                if (is5Var.c == null) {
                }
                break;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                o39 o39Var = (o39) obj;
                Rect rect = o39Var.F1;
                boolean z2 = o39Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && o39Var.M1 == null && z2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    o39Var.Y0 = false;
                    b49 itemAnimator = o39Var.getItemAnimator();
                    if ((o39Var.j1 || itemAnimator == null || !itemAnimator.k()) && o39Var.F0(y) && (E = o39Var.E(x, y)) != null && o39Var.G0(E)) {
                        o39Var.M1 = E;
                    }
                    if (o39Var.M1 instanceof ViewGroup) {
                        float x2 = motionEvent.getX() - o39Var.M1.getLeft();
                        float y2 = motionEvent.getY() - o39Var.M1.getTop();
                        ViewGroup viewGroup = (ViewGroup) o39Var.M1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x2 < childAt.getLeft() || x2 > childAt.getRight() || y2 < childAt.getTop() || y2 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    o39Var.M1 = null;
                                }
                            }
                        }
                    }
                    o39Var.N1 = -1;
                    View view = o39Var.M1;
                    if (view != null) {
                        if (o39Var.g1) {
                            o39Var.N1 = RecyclerView.S(view);
                        } else {
                            o39Var.N1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - o39Var.M1.getLeft(), motionEvent.getY() - o39Var.M1.getTop(), 0);
                        if (o39Var.M1.onTouchEvent(obtain)) {
                            o39Var.O1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (o39Var.M1 != null && !o39Var.O1) {
                    try {
                        o39Var.L1.X(motionEvent);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (o39Var.O1 || o39Var.M1 == null) {
                        rect.setEmpty();
                    } else {
                        float x3 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        yq4 yq4Var = new yq4(this, x3, y3, b2);
                        o39Var.d1 = yq4Var;
                        gl.e3(yq4Var, ViewConfiguration.getTapTimeout());
                        if (o39Var.M1.isEnabled()) {
                            View view2 = o39Var.M1;
                            if (o39Var.I0(view2, x3 - view2.getX(), y3 - o39Var.M1.getY())) {
                                o39Var.l1(o39Var.N1, o39Var.M1);
                                ff0 ff0Var = o39Var.C1;
                                if (ff0Var != null) {
                                    Drawable current = ff0Var.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (o39Var.W0 == null && o39Var.V0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    o39Var.C1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                o39Var.y1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z2) && o39Var.M1 != null) {
                    yq4 yq4Var2 = o39Var.d1;
                    if (yq4Var2 != null) {
                        gl.r(yq4Var2);
                        o39Var.d1 = null;
                    }
                    View view3 = o39Var.M1;
                    o39Var.k1(view3, 0.0f, 0.0f, false);
                    o39Var.M1 = null;
                    o39Var.O1 = false;
                    o39Var.n1(view3, motionEvent);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (f39Var = o39Var.X0) != null && o39Var.Y0) {
                        f39Var.f();
                        o39Var.Y0 = false;
                        return false;
                    }
                }
                return false;
        }
    }

    @Override // h49
    public final void c(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ((is5) obj).q(null, 0);
                    break;
                }
                break;
            default:
                ((o39) obj).J0(true);
                break;
        }
    }

    public ds5(is5 is5Var) {
        this.b = is5Var;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
