package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lb0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        vk0 vk0Var;
        int i14 = this.a;
        sg.r1 r1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 1:
                pg0 pg0Var = (pg0) obj;
                jg0 jg0Var = pg0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = pg0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && jg0Var.canScrollVertically(1)) {
                        jg0Var.getChildAt(0);
                        vk0 vk0Var2 = (vk0) jg0Var.K(0);
                        if (vk0Var2 != null) {
                            View view = vk0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                jg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                ll0 ll0Var = (ll0) obj;
                if (i10 == 0) {
                    if (ll0Var.v2) {
                        ll0Var.v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!ll0Var.v2 && ll0Var.x1) {
                    ll0Var.v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && ll0Var.N1 != null) {
                    dl0 dl0Var = ll0Var.e1;
                    if (dl0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dl0Var);
                        ll0Var.e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        ll0Var.M1.h(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    ll0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = ll0Var.N1;
                    ll0Var.g1(view2, 0.0f, 0.0f, false);
                    ll0Var.N1 = null;
                    ll0Var.j1(null, view2);
                    ll0Var.P1 = false;
                }
                s4.s0 s0Var = ll0Var.a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                ll0Var.K1 = z10;
                if (z10) {
                    ll0Var.L1 = true;
                    break;
                }
                break;
            case 4:
                vm0 vm0Var = (vm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(vm0Var.F.getCurrentFocus());
                }
                vm0Var.a();
                break;
            case 8:
                o61 o61Var = (o61) obj;
                bi.o0 o0Var = o61Var.d;
                if (i10 == 0 && o61Var.G) {
                    int i17 = o61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) o61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && o0Var.canScrollVertically(1) && (vk0Var = (vk0) o0Var.K(0)) != null) {
                        View view3 = vk0Var.a;
                        if (view3.getTop() > 0) {
                            o0Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 12:
                sg.u0 u0Var = (sg.u0) obj;
                if (i10 == 1) {
                    u0Var.d3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        sg.r1 r1Var2 = (sg.r1) u0Var.getChildAt(i18);
                        if (r1Var == null || r1Var2.a > r1Var.a) {
                            r1Var = r1Var2;
                        }
                    }
                    if (r1Var != null) {
                        u0Var.v1(r1Var, true);
                        u0Var.d3 = false;
                        u0Var.v0(0, r1Var.getTop() - ((u0Var.getMeasuredHeight() - r1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    u0Var.w1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(u0Var.e3);
                    break;
                }
                break;
            case 13:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.a1) obj).Y.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        sk0 sk0Var;
        float f7;
        boolean z10;
        float y3;
        int measuredHeight;
        switch (this.a) {
            case 0:
                qb0 qb0Var = (qb0) this.b;
                org.telegram.ui.w8 w8Var = qb0Var.b;
                ib0 ib0Var = qb0Var.f;
                for (int i12 = 0; i12 < ib0Var.getChildCount(); i12++) {
                    View childAt = ib0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
                    }
                }
                hb0 hb0Var = qb0Var.e;
                if (hb0Var != null) {
                    hb0Var.x();
                    break;
                }
                break;
            case 1:
                pg0 pg0Var = (pg0) this.b;
                if (pg0Var.b.getChildCount() > 0) {
                    pg0.t(pg0Var);
                    break;
                }
                break;
            case 2:
                fk0 fk0Var = (fk0) this.b;
                bi.o0 o0Var = fk0Var.b;
                int[] iArr = fk0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fk0.b(fk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fk0.b(fk0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < o0Var.getChildCount() - 1; i14++) {
                    fk0.b(fk0Var, o0Var.getChildAt(i14), 1.0f);
                }
                fk0Var.invalidate();
                break;
            case 3:
                ll0 ll0Var = (ll0) this.b;
                Rect rect = ll0Var.G1;
                s4.s0 s0Var = ll0Var.a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (ll0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = ll0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    ll0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                ll0Var.K0(false);
                if (i11 != 0 && (sk0Var = ll0Var.f1) != null) {
                    sk0Var.b();
                }
                wk0 wk0Var = ll0Var.U1;
                if (wk0Var != null) {
                    ll0Var.d1(wk0Var, 700, false);
                    break;
                }
                break;
            case 5:
                bv0.m((bv0) this.b);
                break;
            case 6:
                ((dw0) this.b).X.V();
                break;
            case 7:
                ux0.O((ux0) this.b);
                break;
            case 8:
                ((o61) this.b).L();
                break;
            case 9:
                ((h81) this.b).invalidate();
                break;
            case 10:
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.b;
                if (!qVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(qVar.s)) {
                        qVar.d.d();
                    } else {
                        org.telegram.ui.web.j jVar = qVar.e;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (qVar.a.K1) {
                    AndroidUtilities.hideKeyboard(qVar.fragmentView);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.b;
                if (i1Var.a.K1) {
                    AndroidUtilities.hideKeyboard(i1Var.fragmentView);
                    break;
                }
                break;
            case 12:
                sg.u0 u0Var = (sg.u0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    u0Var.v1(null, true);
                }
                u0Var.invalidate();
                break;
            case 14:
                ((uh.f) this.b).R();
                break;
            case 15:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                xh.n nVar = (xh.n) this.b;
                xh.e eVar = nVar.C;
                if (nVar.x && !nVar.w && c0Var != null) {
                    if (nVar.f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 16:
                yh.g4 g4Var = (yh.g4) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < g4Var.n.getChildCount()) {
                        if (g4Var.n.getChildAt(i15) instanceof t00) {
                            g4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.wl.q(g4Var.h.animate().alpha((g4Var.K && g4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), pr.h, 320L);
                break;
            case 17:
                ((yh.f4) this.b).Z();
                break;
            case 18:
                zh.g gVar = (zh.g) this.b;
                if (gVar.a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < gVar.e.getChildCount(); i16++) {
                            if (!(gVar.e.getChildAt(i16) instanceof t00)) {
                            }
                        }
                        break;
                    }
                    zh.g.e0(gVar);
                    break;
                }
                break;
            case 19:
                zh.s0 s0Var2 = (zh.s0) this.b;
                bh.f fVar = s0Var2.s0;
                View view = s0Var2.q0;
                FrameLayout frameLayout = s0Var2.l0;
                ll0 ll0Var2 = s0Var2.d;
                int childCount = ll0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt4 = ll0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt4);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f7 = childAt4.getY();
                            } else if (R == 0) {
                                y3 = childAt4.getY();
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
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new mr0(14, s0Var2, z11)).start();
                }
                s0Var2.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && fVar != null) {
                    fVar.f(i10, i11);
                    if (i17 >= 31 && fVar != null) {
                        s0Var2.Q(1);
                        break;
                    }
                }
                break;
            case 20:
                ((zh.w3) this.b).Y.e();
                break;
            case 21:
                zh.s7 s7Var = (zh.s7) this.b;
                d61 d61Var = s7Var.a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < d61Var.getChildCount(); i18++) {
                        if (!(d61Var.getChildAt(i18) instanceof t00)) {
                        }
                    }
                    break;
                }
                s7Var.h.run();
                break;
        }
    }
}
