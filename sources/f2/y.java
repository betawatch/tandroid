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
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y implements y0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public y(e0 e0Var) {
        this.b = e0Var;
    }

    @Override // f2.y0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                androidx.activity.i iVar = e0Var.F;
                ((GestureDetector) e0Var.K.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = e0Var.G;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (e0Var.w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(e0Var.w);
                    if (findPointerIndex >= 0) {
                        e0Var.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    l1 l1Var = e0Var.c;
                    if (l1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    e0Var.s(e0Var.B, findPointerIndex, motionEvent);
                                    e0Var.n(l1Var);
                                    e0Var.E.removeCallbacks(iVar);
                                    iVar.run();
                                    e0Var.E.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = e0Var.G;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == e0Var.w) {
                                    e0Var.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    e0Var.s(e0Var.B, actionIndex, motionEvent);
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

    @Override // f2.y0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        View E;
        ll0 ll0Var;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                ((GestureDetector) e0Var.K.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                z zVar = null;
                if (actionMasked == 0) {
                    e0Var.w = motionEvent.getPointerId(0);
                    e0Var.d = motionEvent.getX();
                    e0Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = e0Var.G;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    e0Var.G = VelocityTracker.obtain();
                    if (e0Var.c == null) {
                        ArrayList arrayList = e0Var.C;
                        if (!arrayList.isEmpty()) {
                            View k10 = e0Var.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    z zVar2 = (z) arrayList.get(size);
                                    if (zVar2.e.a == k10) {
                                        zVar = zVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (zVar != null) {
                            l1 l1Var = zVar.e;
                            e0Var.d -= zVar.r;
                            e0Var.e -= zVar.s;
                            e0Var.j(l1Var, true);
                            if (e0Var.a.remove(l1Var.a)) {
                                e0Var.x.a(e0Var.E, l1Var);
                            }
                            e0Var.p(l1Var, zVar.f);
                            e0Var.s(e0Var.B, 0, motionEvent);
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
                VelocityTracker velocityTracker2 = e0Var.G;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return e0Var.c != null;
            default:
                int actionMasked2 = motionEvent.getActionMasked();
                sl0 sl0Var = (sl0) this.b;
                Rect rect = sl0Var.D1;
                boolean z4 = sl0Var.getScrollState() == 0;
                if ((actionMasked2 == 0 || actionMasked2 == 5) && sl0Var.K1 == null && z4) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    sl0Var.W0 = false;
                    t0 itemAnimator = sl0Var.getItemAnimator();
                    if ((sl0Var.h1 || itemAnimator == null || !itemAnimator.k()) && sl0Var.E0(y10) && (E = sl0Var.E(x10, y10)) != null && sl0Var.F0(E)) {
                        sl0Var.K1 = E;
                    }
                    if (sl0Var.K1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - sl0Var.K1.getLeft();
                        float y11 = motionEvent.getY() - sl0Var.K1.getTop();
                        ViewGroup viewGroup = (ViewGroup) sl0Var.K1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y11 < childAt.getTop() || y11 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    sl0Var.K1 = null;
                                }
                            }
                        }
                    }
                    sl0Var.L1 = -1;
                    View view = sl0Var.K1;
                    if (view != null) {
                        if (sl0Var.e1) {
                            sl0Var.L1 = RecyclerView.S(view);
                        } else {
                            sl0Var.L1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - sl0Var.K1.getLeft(), motionEvent.getY() - sl0Var.K1.getTop(), 0);
                        if (sl0Var.K1.onTouchEvent(obtain)) {
                            sl0Var.M1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (sl0Var.K1 != null && !sl0Var.M1) {
                    try {
                        sl0Var.J1.v0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    if (sl0Var.M1 || sl0Var.K1 == null) {
                        rect.setEmpty();
                    } else {
                        float x12 = motionEvent.getX();
                        float y12 = motionEvent.getY();
                        fg.d dVar = new fg.d(this, x12, y12, 1);
                        sl0Var.b1 = dVar;
                        AndroidUtilities.runOnUIThread(dVar, ViewConfiguration.getTapTimeout());
                        if (sl0Var.K1.isEnabled()) {
                            View view2 = sl0Var.K1;
                            if (sl0Var.H0(view2, x12 - view2.getX(), y12 - sl0Var.K1.getY())) {
                                sl0Var.i1(sl0Var.L1, sl0Var.K1);
                                org.telegram.ui.Cells.z zVar3 = sl0Var.A1;
                                if (zVar3 != null) {
                                    Drawable current = zVar3.getCurrent();
                                    if (current instanceof TransitionDrawable) {
                                        if (sl0Var.U0 == null && sl0Var.T0 == null) {
                                            ((TransitionDrawable) current).resetTransition();
                                        } else {
                                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                        }
                                    }
                                    sl0Var.A1.setHotspot(motionEvent.getX(), motionEvent.getY());
                                }
                                sl0Var.v1();
                            }
                        }
                        rect.setEmpty();
                    }
                } else if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3 || !z4) && sl0Var.K1 != null) {
                    fg.d dVar2 = sl0Var.b1;
                    if (dVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar2);
                        sl0Var.b1 = null;
                    }
                    View view3 = sl0Var.K1;
                    sl0Var.h1(view3, 0.0f, 0.0f, false);
                    sl0Var.K1 = null;
                    sl0Var.M1 = false;
                    sl0Var.k1(motionEvent, view3);
                    if ((actionMasked2 == 1 || actionMasked2 == 6 || actionMasked2 == 3) && (ll0Var = sl0Var.V0) != null && sl0Var.W0) {
                        ll0Var.h();
                        sl0Var.W0 = false;
                    }
                }
                return false;
        }
    }

    @Override // f2.y0
    public final void c(boolean z4) {
        switch (this.a) {
            case 0:
                if (z4) {
                    ((e0) this.b).p(null, 0);
                    break;
                }
                break;
            default:
                ((sl0) this.b).I0(true);
                break;
        }
    }

    public y(sl0 sl0Var, Context context) {
        this.b = sl0Var;
        ja.c cVar = new ja.c(context, new nl0(this));
        sl0Var.J1 = cVar;
        ((l20) cVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
