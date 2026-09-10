package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class al0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        fl0 fl0Var;
        int i12 = this.a;
        qg.p1 p1Var = null;
        Object obj = this.b;
        switch (i12) {
            case 0:
                vl0 vl0Var = (vl0) obj;
                if (i10 == 0) {
                    if (vl0Var.v2) {
                        vl0Var.v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!vl0Var.v2 && vl0Var.x1) {
                    vl0Var.v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && vl0Var.N1 != null) {
                    nl0 nl0Var = vl0Var.e1;
                    if (nl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(nl0Var);
                        vl0Var.e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        vl0Var.M1.B(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    vl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view = vl0Var.N1;
                    vl0Var.g1(view, 0.0f, 0.0f, false);
                    vl0Var.N1 = null;
                    vl0Var.j1(null, view);
                    vl0Var.P1 = false;
                }
                s4.s0 s0Var = vl0Var.a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                vl0Var.K1 = z10;
                if (z10) {
                    vl0Var.L1 = true;
                    break;
                }
                break;
            case 1:
                fn0 fn0Var = (fn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(fn0Var.F.getCurrentFocus());
                }
                fn0Var.a();
                break;
            case 5:
                b71 b71Var = (b71) obj;
                bi.y1 y1Var = b71Var.d;
                if (i10 == 0 && b71Var.G) {
                    int i13 = b71Var.y;
                    i11 = ((org.telegram.ui.ActionBar.h3) b71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i11 + i13 < AndroidUtilities.statusBarHeight * 2 && y1Var.canScrollVertically(1) && (fl0Var = (fl0) y1Var.K(0)) != null) {
                        View view2 = fl0Var.a;
                        if (view2.getTop() > 0) {
                            y1Var.v0(0, view2.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                qg.v0 v0Var = (qg.v0) obj;
                if (i10 == 1) {
                    v0Var.d3 = true;
                }
                if (i10 == 0) {
                    for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                        qg.p1 p1Var2 = (qg.p1) v0Var.getChildAt(i14);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        v0Var.v1(p1Var, true);
                        v0Var.d3 = false;
                        v0Var.v0(0, p1Var.getTop() - ((v0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    v0Var.w1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(v0Var.e3);
                    break;
                }
            case 10:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sg.c1) obj).Y.getEditText());
                    break;
                }
                break;
            case 21:
                zh.z3 z3Var = (zh.z3) obj;
                if (i10 == 0) {
                    z3Var.V = true;
                    z3Var.invalidate();
                }
                if (i10 == 1) {
                    z3Var.V = false;
                    a5.a aVar = z3Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) aVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) aVar.c).cancel();
                        aVar.c = null;
                    }
                    AndroidUtilities.hideKeyboard(z3Var);
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        cl0 cl0Var;
        float f7;
        boolean z10;
        float y3;
        int measuredHeight;
        switch (this.a) {
            case 0:
                vl0 vl0Var = (vl0) this.b;
                Rect rect = vl0Var.G1;
                s4.s0 s0Var = vl0Var.a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (vl0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = vl0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    vl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                vl0Var.K0(false);
                if (i11 != 0 && (cl0Var = vl0Var.f1) != null) {
                    cl0Var.b();
                }
                gl0 gl0Var = vl0Var.U1;
                if (gl0Var != null) {
                    vl0Var.d1(gl0Var, 700, false);
                    break;
                }
                break;
            case 2:
                mv0.m((mv0) this.b);
                break;
            case 3:
                ((pw0) this.b).X.V();
                break;
            case 4:
                hy0.O((hy0) this.b);
                break;
            case 5:
                ((b71) this.b).L();
                break;
            case 6:
                ((u81) this.b).invalidate();
                break;
            case 7:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.b;
                if (!pVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.a.K1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.b;
                if (h1Var.a.K1) {
                    AndroidUtilities.hideKeyboard(h1Var.fragmentView);
                    break;
                }
                break;
            case 9:
                qg.v0 v0Var = (qg.v0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    v0Var.v1(null, true);
                }
                v0Var.invalidate();
                break;
            case 11:
                ((sh.f) this.b).R();
                break;
            case 12:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                vh.p pVar2 = (vh.p) this.b;
                vh.f fVar = pVar2.C;
                if (pVar2.x && !pVar2.w && c0Var != null) {
                    if (pVar2.f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(fVar);
                        AndroidUtilities.runOnUIThread(fVar);
                        break;
                    }
                }
                break;
            case 13:
                wh.h4 h4Var = (wh.h4) this.b;
                int i12 = 0;
                while (true) {
                    if (i12 < h4Var.n.getChildCount()) {
                        if (h4Var.n.getChildAt(i12) instanceof a10) {
                            h4Var.d.g(false);
                        } else {
                            i12++;
                        }
                    }
                }
                org.telegram.messenger.em.q(h4Var.h.animate().alpha((h4Var.K && h4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), wr.h, 320L);
                break;
            case 14:
                ((wh.g4) this.b).Z();
                break;
            case 15:
                xh.h hVar = (xh.h) this.b;
                if (hVar.a == 1) {
                    if (hVar.e.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < hVar.e.getChildCount(); i13++) {
                            if (!(hVar.e.getChildAt(i13) instanceof a10)) {
                            }
                        }
                        break;
                    }
                    xh.h.e0(hVar);
                    break;
                }
                break;
            case 16:
                xh.s0 s0Var2 = (xh.s0) this.b;
                zg.e eVar = s0Var2.s0;
                View view = s0Var2.q0;
                FrameLayout frameLayout = s0Var2.l0;
                vl0 vl0Var2 = s0Var2.d;
                int childCount = vl0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = vl0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f7 = childAt.getY();
                            } else if (R == 0) {
                                y3 = childAt.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        f7 = 0.0f;
                        z10 = false;
                    }
                }
                f7 = y3 - measuredHeight;
                z10 = true;
                boolean z11 = !z10 || ((float) frameLayout.getHeight()) + f7 < 0.0f;
                if (s0Var2.x0 != z11) {
                    s0Var2.x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new bs0(13, s0Var2, z11)).start();
                }
                s0Var2.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 31 && eVar != null) {
                    eVar.f(i10, i11);
                    if (i14 >= 31 && eVar != null) {
                        s0Var2.Q(1);
                        break;
                    }
                }
                break;
            case 17:
                ((xh.x3) this.b).Y.e();
                break;
            case 18:
                xh.w7 w7Var = (xh.w7) this.b;
                r61 r61Var = w7Var.a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < r61Var.getChildCount(); i15++) {
                        if (!(r61Var.getChildAt(i15) instanceof a10)) {
                        }
                    }
                    break;
                }
                w7Var.h.run();
                break;
            case 19:
                ((yg.v) this.b).c(true);
                break;
            case 20:
                org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this.b;
                nxVar.invalidate();
                nxVar.c();
                bi.x4 x4Var = nxVar.J;
                if (x4Var != null) {
                    x4Var.e(true);
                    break;
                }
                break;
            case 21:
                zh.z3 z3Var = (zh.z3) this.b;
                z3Var.c();
                z3Var.invalidate();
                break;
        }
    }
}
