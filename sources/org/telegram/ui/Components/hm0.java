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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hm0 implements s4.q0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public hm0(s4.y yVar) {
        this.b = yVar;
    }

    @Override // s4.q0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                s4.y yVar = (s4.y) this.b;
                org.telegram.ui.Wallet.m4 m4Var = yVar.I;
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
                    s4.b1 b1Var = yVar.c;
                    if (b1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    yVar.s(yVar.E, findPointerIndex, motionEvent);
                                    yVar.n(b1Var);
                                    yVar.H.removeCallbacks(m4Var);
                                    m4Var.run();
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

    @Override // s4.q0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        dm0 dm0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                mm0 mm0Var = (mm0) this.b;
                Rect rect = mm0Var.E1;
                boolean z10 = mm0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && mm0Var.L1 == null && z10) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    mm0Var.X0 = false;
                    s4.l0 itemAnimator = mm0Var.getItemAnimator();
                    if ((mm0Var.i1 || itemAnimator == null || !itemAnimator.k()) && mm0Var.E0(y3) && (E = mm0Var.E(x10, y3)) != null && mm0Var.F0(E)) {
                        mm0Var.L1 = E;
                    }
                    if (mm0Var.L1 instanceof ViewGroup) {
                        float x11 = motionEvent.getX() - mm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - mm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) mm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x11 < childAt.getLeft() || x11 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    mm0Var.L1 = null;
                                }
                            }
                        }
                    }
                    mm0Var.M1 = -1;
                    View view = mm0Var.L1;
                    if (view != null) {
                        if (mm0Var.f1) {
                            mm0Var.M1 = RecyclerView.S(view);
                        } else {
                            mm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - mm0Var.L1.getLeft(), motionEvent.getY() - mm0Var.L1.getTop(), 0);
                        if (mm0Var.L1.onTouchEvent(obtain)) {
                            mm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (mm0Var.L1 != null && !mm0Var.N1) {
                    try {
                        mm0Var.K1.k(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && mm0Var.L1 != null) {
                        em0 em0Var = mm0Var.c1;
                        if (em0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(em0Var);
                            mm0Var.c1 = null;
                        }
                        View view2 = mm0Var.L1;
                        mm0Var.j1(view2, 0.0f, 0.0f, false);
                        mm0Var.L1 = null;
                        mm0Var.N1 = false;
                        mm0Var.m1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dm0Var = mm0Var.W0) != null && mm0Var.X0) {
                            dm0Var.h();
                            mm0Var.X0 = false;
                            break;
                        }
                    }
                } else if (!mm0Var.N1 && mm0Var.L1 != null) {
                    float x12 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    em0 em0Var2 = new em0(this, x12, y11, 0);
                    mm0Var.c1 = em0Var2;
                    AndroidUtilities.runOnUIThread(em0Var2, ViewConfiguration.getTapTimeout());
                    if (mm0Var.L1.isEnabled()) {
                        View view3 = mm0Var.L1;
                        if (mm0Var.H0(view3, x12 - view3.getX(), y11 - mm0Var.L1.getY())) {
                            mm0Var.k1(mm0Var.M1, mm0Var.L1);
                            org.telegram.ui.Cells.y yVar = mm0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (mm0Var.V0 == null && mm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                mm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            mm0Var.B1();
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
                s4.y yVar2 = (s4.y) this.b;
                ((GestureDetector) yVar2.N.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.u uVar = null;
                if (actionMasked2 == 0) {
                    yVar2.w = motionEvent.getPointerId(0);
                    yVar2.d = motionEvent.getX();
                    yVar2.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yVar2.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yVar2.J = VelocityTracker.obtain();
                    if (yVar2.c == null) {
                        ArrayList arrayList = yVar2.F;
                        if (!arrayList.isEmpty()) {
                            View k10 = yVar2.k(motionEvent);
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
                            s4.b1 b1Var = uVar.e;
                            yVar2.d -= uVar.r;
                            yVar2.e -= uVar.s;
                            yVar2.j(b1Var, true);
                            if (yVar2.a.remove(b1Var.a)) {
                                yVar2.x.a(yVar2.H, b1Var);
                            }
                            yVar2.p(b1Var, uVar.f);
                            yVar2.s(yVar2.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    yVar2.w = -1;
                    yVar2.p(null, 0);
                } else {
                    int i10 = yVar2.w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        yVar2.h(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = yVar2.J;
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

    @Override // s4.q0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((mm0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((s4.y) this.b).p(null, 0);
                    break;
                }
                break;
        }
    }

    public hm0(mm0 mm0Var, Context context) {
        this.b = mm0Var;
        le.b bVar = new le.b(context, (u20) new gm0(this));
        mm0Var.K1 = bVar;
        ((t20) bVar.b).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
