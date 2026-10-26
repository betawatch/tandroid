package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ml extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        vl0 vl0Var;
        int top;
        int i11;
        int i12;
        vl0 vl0Var2;
        int i13;
        vl0 vl0Var3;
        org.telegram.ui.Wallet.n8 n8Var;
        int i14 = this.a;
        tg.p1 p1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 0:
                if (i10 == 1) {
                    sl slVar = (sl) obj;
                    if (slVar.i0 && slVar.j0) {
                        AndroidUtilities.hideKeyboard(slVar.b.getCurrentFocus());
                        break;
                    }
                }
                break;
            case 1:
                go goVar = (go) obj;
                org.telegram.ui.za1 za1Var = goVar.s;
                ti tiVar = goVar.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (vl0Var = (vl0) za1Var.K(1)) != null && (top = (vl0Var.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        za1Var.w0(0, top, null);
                    }
                    int i15 = goVar.W0;
                    if (i15 >= 0) {
                        go.N(goVar, i15);
                        goVar.W0 = -1;
                        break;
                    }
                }
                break;
            case 7:
                fb0 fb0Var = (fb0) obj;
                fb0Var.f3 = i10 != 0;
                fb0Var.g3 = i10 == 1;
                break;
            case 9:
                nh0 nh0Var = (nh0) obj;
                hh0 hh0Var = nh0Var.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int i16 = nh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.k3) nh0Var).backgroundPaddingTop;
                    int i17 = (i16 - i11) - dp2;
                    i12 = ((org.telegram.ui.ActionBar.k3) nh0Var).backgroundPaddingTop;
                    if (i12 + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && hh0Var.canScrollVertically(1) && (vl0Var2 = (vl0) hh0Var.K(0)) != null) {
                        View view = vl0Var2.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            hh0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                mm0 mm0Var = (mm0) obj;
                if (i10 == 0) {
                    if (mm0Var.t2) {
                        mm0Var.t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!mm0Var.t2 && mm0Var.v1) {
                    mm0Var.t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && mm0Var.L1 != null) {
                    dm0 dm0Var = mm0Var.c1;
                    if (dm0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(dm0Var);
                        mm0Var.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        mm0Var.K1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.k1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.n1(null, view2);
                    mm0Var.N1 = false;
                }
                s4.u0 u0Var = mm0Var.Y0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                mm0Var.I1 = z10;
                if (z10) {
                    mm0Var.J1 = true;
                    break;
                }
                break;
            case 12:
                co0 co0Var = (co0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(co0Var.F.getCurrentFocus());
                }
                co0Var.a();
                break;
            case 17:
                b81 b81Var = (b81) obj;
                bi.r1 r1Var = b81Var.d;
                if (i10 == 0 && b81Var.G) {
                    int i18 = b81Var.y;
                    i13 = ((org.telegram.ui.ActionBar.k3) b81Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i18 < AndroidUtilities.statusBarHeight * 2 && r1Var.canScrollVertically(1) && (vl0Var3 = (vl0) r1Var.K(0)) != null) {
                        View view3 = vl0Var3.a;
                        if (view3.getTop() > 0) {
                            r1Var.w0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 19:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.m5) obj).i0) != null) {
                    n8Var.a();
                    break;
                }
                break;
            case 24:
                tg.s0 s0Var = (tg.s0) obj;
                if (i10 == 1) {
                    s0Var.l3 = true;
                }
                if (i10 == 0) {
                    for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                        tg.p1 p1Var2 = (tg.p1) s0Var.getChildAt(i19);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.l3 = false;
                        s0Var.w0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var.m3);
                    break;
                }
                break;
            case 25:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vg.z0) obj).Y.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // s4.u0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        t40 t40Var;
        String str;
        TLRPC.User user;
        String str2;
        sl0 sl0Var;
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.a) {
            case 1:
                go goVar = (go) this.b;
                jg.e0 e0Var = goVar.w;
                goVar.b.e2(goVar, i11);
                un unVar = goVar.x;
                if (unVar != null && unVar.s) {
                    rz0 delegate = unVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.za1 za1Var = goVar.s;
                        View F = za1Var.F((org.telegram.ui.Cells.h6) delegate);
                        s4.e1 T = F == null ? null : za1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (unVar.getDirection() == 0) {
                                unVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                unVar.setTranslationY(view.getY());
                            }
                            if (b10 < e0Var.L0() || b10 > e0Var.N0()) {
                                unVar.f();
                            }
                        } else {
                            unVar.f();
                        }
                    } else {
                        unVar.f();
                    }
                }
                if (i11 != 0 && (t40Var = goVar.y) != null) {
                    t40Var.b(true);
                    break;
                }
                break;
            case 2:
                ho hoVar = (ho) this.b;
                hoVar.b.e2(hoVar, i11);
                break;
            case 3:
                yp ypVar = (yp) this.b;
                if (ypVar.x.M0() + 10 >= ypVar.h.h()) {
                    ypVar.B();
                    break;
                }
                break;
            case 4:
                aw awVar = (aw) this.b;
                qv qvVar = awVar.f;
                if (qvVar != null && awVar.h.I1 && qvVar.w) {
                    qvVar.w = false;
                    qvVar.invalidate();
                    break;
                }
                break;
            case 5:
                s00 s00Var = (s00) this.b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                break;
            case 6:
                v00.G((v00) this.b);
                break;
            case 7:
                fb0 fb0Var = (fb0) this.b;
                s4.p0 layoutManager = fb0Var.getLayoutManager();
                gb0 gb0Var = fb0Var.j3;
                za0 za0Var = gb0Var.d;
                int N0 = layoutManager == za0Var ? za0Var.N0() : gb0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    ig.j1 j1Var = gb0Var.f;
                    if (N0 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z10 = !fb0Var.canScrollVertically(-1);
                fb0Var.canScrollVertically(1);
                gb0Var.n(z10);
                gb0Var.b();
                break;
            case 8:
                hc0 hc0Var = (hc0) this.b;
                org.telegram.ui.a9 a9Var = hc0Var.b;
                ac0 ac0Var = hc0Var.f;
                for (int i12 = 0; i12 < ac0Var.getChildCount(); i12++) {
                    View childAt = ac0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).b4(a9Var.getMeasuredWidth(), a9Var.getBackgroundSizeY());
                    }
                }
                zb0 zb0Var = hc0Var.e;
                if (zb0Var != null) {
                    zb0Var.w();
                    break;
                }
                break;
            case 9:
                nh0 nh0Var = (nh0) this.b;
                if (nh0Var.b.getChildCount() > 0) {
                    nh0.u(nh0Var);
                    break;
                }
                break;
            case 10:
                fl0 fl0Var = (fl0) this.b;
                bi.r1 r1Var = fl0Var.b;
                int[] iArr = fl0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fl0.b(fl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fl0.b(fl0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < r1Var.getChildCount() - 1; i14++) {
                    fl0.b(fl0Var, r1Var.getChildAt(i14), 1.0f);
                }
                fl0Var.invalidate();
                break;
            case 11:
                mm0 mm0Var = (mm0) this.b;
                Rect rect = mm0Var.E1;
                s4.u0 u0Var = mm0Var.Y0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i10, i11);
                }
                if (mm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = mm0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    mm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                mm0Var.L0(false);
                if (i11 != 0 && (sl0Var = mm0Var.d1) != null) {
                    sl0Var.b();
                }
                wl0 wl0Var = mm0Var.S1;
                if (wl0Var != null) {
                    mm0Var.e1(wl0Var, 700, false);
                    break;
                }
                break;
            case 13:
                ew0.m((ew0) this.b);
                break;
            case 14:
                lw0 lw0Var = (lw0) this.b;
                if (recyclerView == lw0Var.G) {
                    lw0Var.R += i11;
                }
                if (lw0Var.P == null && lw0Var.Q == 0) {
                    lw0Var.B();
                    break;
                }
                break;
            case 15:
                ((kx0) this.b).X.W();
                break;
            case 16:
                cz0.Q((cz0) this.b);
                break;
            case 17:
                ((b81) this.b).L();
                break;
            case 18:
                ((t91) this.b).invalidate();
                break;
            case 19:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (i5Var = m5Var.q0) != null && i5Var.f) {
                    i5Var.d = true;
                }
                m5Var.P0();
                break;
            case 20:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i11;
                break;
            case 21:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.b;
                if (r9Var.a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.N);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.b;
                if (!pVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.v)) {
                        pVar.e.d();
                    } else {
                        org.telegram.ui.web.j jVar = pVar.f;
                        if (jVar != null) {
                            jVar.d();
                        }
                    }
                }
                if (pVar.a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                if (f1Var.a.I1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    break;
                }
                break;
            case 24:
                tg.s0 s0Var = (tg.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                break;
            case 26:
                ((vh.f) this.b).R();
                break;
            case 27:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                yh.k kVar = (yh.k) this.b;
                yh.e eVar = kVar.C;
                if (kVar.x && !kVar.w && c0Var != null) {
                    if (kVar.f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 28:
                zh.h4 h4Var = (zh.h4) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < h4Var.n.getChildCount()) {
                        if (h4Var.n.getChildAt(i15) instanceof c10) {
                            h4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.vh.q(h4Var.h.animate().alpha((h4Var.K && h4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), ds.h, 320L);
                break;
            case 29:
                ((zh.g4) this.b).Z();
                break;
        }
    }
}
