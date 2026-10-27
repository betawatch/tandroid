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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hm0 implements s4.t0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public hm0(s4.z zVar) {
        this.b = zVar;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                s4.z zVar = (s4.z) this.b;
                dy0 dy0Var = zVar.I;
                ((GestureDetector) zVar.N.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = zVar.J;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (zVar.w != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(zVar.w);
                    if (findPointerIndex >= 0) {
                        zVar.j(actionMasked, findPointerIndex, motionEvent);
                    }
                    s4.e1 e1Var = zVar.c;
                    if (e1Var != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    zVar.u(zVar.E, findPointerIndex, motionEvent);
                                    zVar.p(e1Var);
                                    zVar.H.removeCallbacks(dy0Var);
                                    dy0Var.run();
                                    zVar.H.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = zVar.J;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == zVar.w) {
                                    zVar.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    zVar.u(zVar.E, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        zVar.r(null, 0);
                        zVar.w = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.t0
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        View E;
        dm0 dm0Var;
        int findPointerIndex;
        switch (this.a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                nm0 nm0Var = (nm0) this.b;
                Rect rect = nm0Var.E1;
                boolean z10 = nm0Var.getScrollState() == 0;
                if ((actionMasked == 0 || actionMasked == 5) && nm0Var.L1 == null && z10) {
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    nm0Var.X0 = false;
                    s4.m0 itemAnimator = nm0Var.getItemAnimator();
                    if ((nm0Var.i1 || itemAnimator == null || !itemAnimator.k()) && nm0Var.E0(y3) && (E = nm0Var.E(x9, y3)) != null && nm0Var.F0(E)) {
                        nm0Var.L1 = E;
                    }
                    if (nm0Var.L1 instanceof ViewGroup) {
                        float x10 = motionEvent.getX() - nm0Var.L1.getLeft();
                        float y10 = motionEvent.getY() - nm0Var.L1.getTop();
                        ViewGroup viewGroup = (ViewGroup) nm0Var.L1;
                        int childCount = viewGroup.getChildCount() - 1;
                        while (true) {
                            if (childCount >= 0) {
                                View childAt = viewGroup.getChildAt(childCount);
                                if (x10 < childAt.getLeft() || x10 > childAt.getRight() || y10 < childAt.getTop() || y10 > childAt.getBottom() || !childAt.isClickable()) {
                                    childCount--;
                                } else {
                                    nm0Var.L1 = null;
                                }
                            }
                        }
                    }
                    nm0Var.M1 = -1;
                    View view = nm0Var.L1;
                    if (view != null) {
                        if (nm0Var.f1) {
                            nm0Var.M1 = RecyclerView.S(view);
                        } else {
                            nm0Var.M1 = RecyclerView.R(view);
                        }
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), motionEvent.getX() - nm0Var.L1.getLeft(), motionEvent.getY() - nm0Var.L1.getTop(), 0);
                        if (nm0Var.L1.onTouchEvent(obtain)) {
                            nm0Var.N1 = true;
                        }
                        obtain.recycle();
                    }
                }
                if (nm0Var.L1 != null && !nm0Var.N1) {
                    try {
                        nm0Var.K1.g0(motionEvent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (actionMasked != 0 && actionMasked != 5) {
                    if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || !z10) && nm0Var.L1 != null) {
                        em0 em0Var = nm0Var.c1;
                        if (em0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(em0Var);
                            nm0Var.c1 = null;
                        }
                        View view2 = nm0Var.L1;
                        nm0Var.k1(view2, 0.0f, 0.0f, false);
                        nm0Var.L1 = null;
                        nm0Var.N1 = false;
                        nm0Var.n1(motionEvent, view2);
                        if ((actionMasked == 1 || actionMasked == 6 || actionMasked == 3) && (dm0Var = nm0Var.W0) != null && nm0Var.X0) {
                            dm0Var.g();
                            nm0Var.X0 = false;
                            break;
                        }
                    }
                } else if (!nm0Var.N1 && nm0Var.L1 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    em0 em0Var2 = new em0(this, x11, y11, 0);
                    nm0Var.c1 = em0Var2;
                    AndroidUtilities.runOnUIThread(em0Var2, ViewConfiguration.getTapTimeout());
                    if (nm0Var.L1.isEnabled()) {
                        View view3 = nm0Var.L1;
                        if (nm0Var.H0(view3, x11 - view3.getX(), y11 - nm0Var.L1.getY())) {
                            nm0Var.l1(nm0Var.M1, nm0Var.L1);
                            org.telegram.ui.Cells.y yVar = nm0Var.B1;
                            if (yVar != null) {
                                Drawable current = yVar.getCurrent();
                                if (current instanceof TransitionDrawable) {
                                    if (nm0Var.V0 == null && nm0Var.U0 == null) {
                                        ((TransitionDrawable) current).resetTransition();
                                    } else {
                                        ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                                    }
                                }
                                nm0Var.B1.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            nm0Var.B1();
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
                s4.z zVar = (s4.z) this.b;
                ((GestureDetector) zVar.N.b).onTouchEvent(motionEvent);
                int actionMasked2 = motionEvent.getActionMasked();
                s4.v vVar = null;
                if (actionMasked2 == 0) {
                    zVar.w = motionEvent.getPointerId(0);
                    zVar.d = motionEvent.getX();
                    zVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = zVar.J;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    zVar.J = VelocityTracker.obtain();
                    if (zVar.c == null) {
                        ArrayList arrayList = zVar.F;
                        if (!arrayList.isEmpty()) {
                            View m10 = zVar.m(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    s4.v vVar2 = (s4.v) arrayList.get(size);
                                    if (vVar2.e.a == m10) {
                                        vVar = vVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (vVar != null) {
                            s4.e1 e1Var = vVar.e;
                            zVar.d -= vVar.r;
                            zVar.e -= vVar.s;
                            zVar.l(e1Var, true);
                            if (zVar.a.remove(e1Var.a)) {
                                zVar.x.a(zVar.H, e1Var);
                            }
                            zVar.r(e1Var, vVar.f);
                            zVar.u(zVar.E, 0, motionEvent);
                        }
                    }
                } else if (actionMasked2 == 3 || actionMasked2 == 1) {
                    zVar.w = -1;
                    zVar.r(null, 0);
                } else {
                    int i10 = zVar.w;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                        zVar.j(actionMasked2, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = zVar.J;
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

    @Override // s4.t0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                ((nm0) this.b).I0(true);
                break;
            default:
                if (z10) {
                    ((s4.z) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }

    public hm0(Context context, nm0 nm0Var) {
        this.b = nm0Var;
        jg.i iVar = new jg.i(context, new gm0(this));
        nm0Var.K1 = iVar;
        ((v20) iVar.a).t = false;
    }

    private final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
