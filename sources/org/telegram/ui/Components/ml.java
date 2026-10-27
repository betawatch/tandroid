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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        wl0 wl0Var;
        int top;
        int i11;
        int i12;
        wl0 wl0Var2;
        int i13;
        wl0 wl0Var3;
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
                org.telegram.ui.bb1 bb1Var = goVar.s;
                ti tiVar = goVar.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = tiVar.getBackgroundPaddingTop();
                    if (((tiVar.e2[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (wl0Var = (wl0) bb1Var.K(1)) != null && (top = (wl0Var.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        bb1Var.w0(0, top, null);
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
                gb0 gb0Var = (gb0) obj;
                gb0Var.f3 = i10 != 0;
                gb0Var.g3 = i10 == 1;
                break;
            case 9:
                oh0 oh0Var = (oh0) obj;
                ih0 ih0Var = oh0Var.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int i16 = oh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.k3) oh0Var).backgroundPaddingTop;
                    int i17 = (i16 - i11) - dp2;
                    i12 = ((org.telegram.ui.ActionBar.k3) oh0Var).backgroundPaddingTop;
                    if (i12 + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ih0Var.canScrollVertically(1) && (wl0Var2 = (wl0) ih0Var.K(0)) != null) {
                        View view = wl0Var2.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            ih0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                nm0 nm0Var = (nm0) obj;
                if (i10 == 0) {
                    if (nm0Var.t2) {
                        nm0Var.t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!nm0Var.t2 && nm0Var.v1) {
                    nm0Var.t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && nm0Var.L1 != null) {
                    em0 em0Var = nm0Var.c1;
                    if (em0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(em0Var);
                        nm0Var.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        nm0Var.K1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    nm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = nm0Var.L1;
                    nm0Var.k1(view2, 0.0f, 0.0f, false);
                    nm0Var.L1 = null;
                    nm0Var.n1(null, view2);
                    nm0Var.N1 = false;
                }
                s4.u0 u0Var = nm0Var.Y0;
                if (u0Var != null) {
                    u0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                nm0Var.I1 = z10;
                if (z10) {
                    nm0Var.J1 = true;
                    break;
                }
                break;
            case 12:
                do0 do0Var = (do0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(do0Var.F.getCurrentFocus());
                }
                do0Var.a();
                break;
            case 17:
                c81 c81Var = (c81) obj;
                bi.r1 r1Var = c81Var.d;
                if (i10 == 0 && c81Var.G) {
                    int i18 = c81Var.y;
                    i13 = ((org.telegram.ui.ActionBar.k3) c81Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i18 < AndroidUtilities.statusBarHeight * 2 && r1Var.canScrollVertically(1) && (wl0Var3 = (wl0) r1Var.K(0)) != null) {
                        View view3 = wl0Var3.a;
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
        tl0 tl0Var;
        org.telegram.ui.Wallet.i5 i5Var;
        switch (this.a) {
            case 1:
                go goVar = (go) this.b;
                jg.e0 e0Var = goVar.w;
                goVar.b.f2(goVar, i11);
                un unVar = goVar.x;
                if (unVar != null && unVar.s) {
                    sz0 delegate = unVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.bb1 bb1Var = goVar.s;
                        View F = bb1Var.F((org.telegram.ui.Cells.h6) delegate);
                        s4.e1 T = F == null ? null : bb1Var.T(F);
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
                hoVar.b.f2(hoVar, i11);
                break;
            case 3:
                zp zpVar = (zp) this.b;
                if (zpVar.x.M0() + 10 >= zpVar.h.h()) {
                    zpVar.B();
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
                gb0 gb0Var = (gb0) this.b;
                s4.p0 layoutManager = gb0Var.getLayoutManager();
                hb0 hb0Var = gb0Var.j3;
                ab0 ab0Var = hb0Var.d;
                int N0 = layoutManager == ab0Var ? ab0Var.N0() : hb0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    ig.j1 j1Var = hb0Var.f;
                    if (N0 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z10 = !gb0Var.canScrollVertically(-1);
                gb0Var.canScrollVertically(1);
                hb0Var.n(z10);
                hb0Var.b();
                break;
            case 8:
                ic0 ic0Var = (ic0) this.b;
                org.telegram.ui.a9 a9Var = ic0Var.b;
                bc0 bc0Var = ic0Var.f;
                for (int i12 = 0; i12 < bc0Var.getChildCount(); i12++) {
                    View childAt = bc0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).b4(a9Var.getMeasuredWidth(), a9Var.getBackgroundSizeY());
                    }
                }
                ac0 ac0Var = ic0Var.e;
                if (ac0Var != null) {
                    ac0Var.w();
                    break;
                }
                break;
            case 9:
                oh0 oh0Var = (oh0) this.b;
                if (oh0Var.b.getChildCount() > 0) {
                    oh0.u(oh0Var);
                    break;
                }
                break;
            case 10:
                gl0 gl0Var = (gl0) this.b;
                bi.r1 r1Var = gl0Var.b;
                int[] iArr = gl0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    gl0.b(gl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    gl0.b(gl0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < r1Var.getChildCount() - 1; i14++) {
                    gl0.b(gl0Var, r1Var.getChildAt(i14), 1.0f);
                }
                gl0Var.invalidate();
                break;
            case 11:
                nm0 nm0Var = (nm0) this.b;
                Rect rect = nm0Var.E1;
                s4.u0 u0Var = nm0Var.Y0;
                if (u0Var != null) {
                    u0Var.b(recyclerView, i10, i11);
                }
                if (nm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.y yVar = nm0Var.B1;
                    if (yVar != null) {
                        yVar.setBounds(rect);
                    }
                    nm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                nm0Var.L0(false);
                if (i11 != 0 && (tl0Var = nm0Var.d1) != null) {
                    tl0Var.b();
                }
                xl0 xl0Var = nm0Var.S1;
                if (xl0Var != null) {
                    nm0Var.e1(xl0Var, 700, false);
                    break;
                }
                break;
            case 13:
                fw0.m((fw0) this.b);
                break;
            case 14:
                mw0 mw0Var = (mw0) this.b;
                if (recyclerView == mw0Var.G) {
                    mw0Var.R += i11;
                }
                if (mw0Var.P == null && mw0Var.Q == 0) {
                    mw0Var.B();
                    break;
                }
                break;
            case 15:
                ((lx0) this.b).X.W();
                break;
            case 16:
                dz0.Q((dz0) this.b);
                break;
            case 17:
                ((c81) this.b).L();
                break;
            case 18:
                ((u91) this.b).invalidate();
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
                org.telegram.messenger.wh.q(h4Var.h.animate().alpha((h4Var.K && h4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), ds.h, 320L);
                break;
            case 29:
                ((zh.g4) this.b).Z();
                break;
        }
    }
}
