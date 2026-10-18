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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class kv extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        sl0 sl0Var;
        org.telegram.ui.Wallet.n8 n8Var;
        int i14 = this.a;
        sg.p1 p1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 3:
                hb0 hb0Var = (hb0) obj;
                hb0Var.V2 = i10 != 0;
                hb0Var.W2 = i10 == 1;
                break;
            case 5:
                kh0 kh0Var = (kh0) obj;
                eh0 eh0Var = kh0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = kh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.f3) kh0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) kh0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && eh0Var.canScrollVertically(1)) {
                        eh0Var.getChildAt(0);
                        sl0 sl0Var2 = (sl0) eh0Var.K(0);
                        if (sl0Var2 != null) {
                            View view = sl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                eh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                im0 im0Var = (im0) obj;
                if (i10 == 0) {
                    if (im0Var.t2) {
                        im0Var.t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!im0Var.t2 && im0Var.v1) {
                    im0Var.t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && im0Var.L1 != null) {
                    am0 am0Var = im0Var.c1;
                    if (am0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(am0Var);
                        im0Var.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        im0Var.K1.j0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    im0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = im0Var.L1;
                    im0Var.h1(view2, 0.0f, 0.0f, false);
                    im0Var.L1 = null;
                    im0Var.k1(null, view2);
                    im0Var.N1 = false;
                }
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                im0Var.I1 = z10;
                if (z10) {
                    im0Var.J1 = true;
                    break;
                }
                break;
            case 8:
                tn0 tn0Var = (tn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(tn0Var.F.getCurrentFocus());
                }
                tn0Var.a();
                break;
            case 12:
                j71 j71Var = (j71) obj;
                ai.u1 u1Var = j71Var.d;
                if (i10 == 0 && j71Var.G) {
                    int i17 = j71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) j71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (sl0Var = (sl0) u1Var.K(0)) != null) {
                        View view3 = sl0Var.a;
                        if (view3.getTop() > 0) {
                            u1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.n5) obj).h0) != null) {
                    n8Var.a();
                    break;
                }
                break;
            case 19:
                sg.t0 t0Var = (sg.t0) obj;
                if (i10 == 1) {
                    t0Var.b3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        sg.p1 p1Var2 = (sg.p1) t0Var.getChildAt(i18);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.b3 = false;
                        t0Var.v0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(t0Var.c3);
                    break;
                }
                break;
            case 20:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.y0) obj).Y.getEditText());
                    break;
                }
                break;
            case 25:
                zh.c cVar = (zh.c) obj;
                cVar.c0 = i10 == 1;
                if (i10 != 0) {
                    cVar.a0 = zh.c.b();
                }
                cVar.invalidate();
                break;
            case 26:
                if (i10 == 0) {
                    ((zh.d0) obj).v = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        String str;
        TLRPC.User user;
        String str2;
        pl0 pl0Var;
        org.telegram.ui.Wallet.j5 j5Var;
        switch (this.a) {
            case 0:
                aw awVar = (aw) this.b;
                qv qvVar = awVar.f;
                if (qvVar != null && awVar.h.I1 && qvVar.w) {
                    qvVar.w = false;
                    qvVar.invalidate();
                    break;
                }
                break;
            case 1:
                s00 s00Var = (s00) this.b;
                s00Var.F.invalidate();
                s00Var.invalidate();
                break;
            case 2:
                v00.H((v00) this.b);
                break;
            case 3:
                hb0 hb0Var = (hb0) this.b;
                s4.n0 layoutManager = hb0Var.getLayoutManager();
                ib0 ib0Var = hb0Var.Z2;
                bb0 bb0Var = ib0Var.d;
                int N0 = layoutManager == bb0Var ? bb0Var.N0() : ib0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    hg.j1 j1Var = ib0Var.f;
                    if (N0 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z10 = !hb0Var.canScrollVertically(-1);
                hb0Var.canScrollVertically(1);
                ib0Var.n(z10);
                ib0Var.b();
                break;
            case 4:
                ic0 ic0Var = (ic0) this.b;
                org.telegram.ui.y8 y8Var = ic0Var.b;
                bc0 bc0Var = ic0Var.f;
                for (int i12 = 0; i12 < bc0Var.getChildCount(); i12++) {
                    View childAt = bc0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                ac0 ac0Var = ic0Var.e;
                if (ac0Var != null) {
                    ac0Var.w();
                    break;
                }
                break;
            case 5:
                kh0 kh0Var = (kh0) this.b;
                if (kh0Var.b.getChildCount() > 0) {
                    kh0.v(kh0Var);
                    break;
                }
                break;
            case 6:
                cl0 cl0Var = (cl0) this.b;
                ai.u1 u1Var = cl0Var.b;
                int[] iArr = cl0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    cl0.b(cl0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    cl0.b(cl0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < u1Var.getChildCount() - 1; i14++) {
                    cl0.b(cl0Var, u1Var.getChildAt(i14), 1.0f);
                }
                cl0Var.invalidate();
                break;
            case 7:
                im0 im0Var = (im0) this.b;
                Rect rect = im0Var.E1;
                s4.r0 r0Var = im0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (im0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = im0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    im0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                im0Var.L0(false);
                if (i11 != 0 && (pl0Var = im0Var.d1) != null) {
                    pl0Var.b();
                }
                tl0 tl0Var = im0Var.S1;
                if (tl0Var != null) {
                    im0Var.e1(tl0Var, 700, false);
                    break;
                }
                break;
            case 9:
                wv0.n((wv0) this.b);
                break;
            case 10:
                ((yw0) this.b).X.V();
                break;
            case 11:
                oy0.P((oy0) this.b);
                break;
            case 12:
                ((j71) this.b).M();
                break;
            case 13:
                ((b91) this.b).invalidate();
                break;
            case 14:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (j5Var = n5Var.p0) != null && j5Var.f) {
                    j5Var.d = true;
                }
                n5Var.M0();
                break;
            case 15:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i11;
                break;
            case 16:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.b;
                if (r9Var.a.I1) {
                    AndroidUtilities.hideKeyboard(r9Var.M);
                    break;
                }
                break;
            case 17:
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
                if (qVar.a.I1) {
                    AndroidUtilities.hideKeyboard(qVar.fragmentView);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                if (g1Var.a.I1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    break;
                }
                break;
            case 19:
                sg.t0 t0Var = (sg.t0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                break;
            case 21:
                ((uh.f) this.b).S();
                break;
            case 22:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.k kVar = (xh.k) this.b;
                xh.e eVar = kVar.C;
                if (kVar.x && !kVar.w && b0Var != null) {
                    if (kVar.f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 23:
                yh.g4 g4Var = (yh.g4) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < g4Var.n.getChildCount()) {
                        if (g4Var.n.getChildAt(i15) instanceof b10) {
                            g4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.lk.t(g4Var.h.animate().alpha((g4Var.K && g4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), bs.h, 320L);
                break;
            case 24:
                ((yh.f4) this.b).a0();
                break;
            case 25:
                zh.c cVar = (zh.c) this.b;
                if (i11 != 0) {
                    cVar.a0 = zh.c.b();
                    cVar.invalidate();
                    break;
                }
                break;
            case 26:
                zh.d0 d0Var = (zh.d0) this.b;
                if (!d0Var.v) {
                    d0Var.h.a(d0Var.f(d0Var.c()), true);
                    break;
                }
                break;
        }
    }
}
