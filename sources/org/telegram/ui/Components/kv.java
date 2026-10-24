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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        wl0 wl0Var;
        int i13;
        wl0 wl0Var2;
        org.telegram.ui.Wallet.o8 o8Var;
        int i14 = this.a;
        sg.p1 p1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 3:
                ib0 ib0Var = (ib0) obj;
                ib0Var.Y2 = i10 != 0;
                ib0Var.Z2 = i10 == 1;
                break;
            case 5:
                oh0 oh0Var = (oh0) obj;
                ih0 ih0Var = oh0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = oh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.h3) oh0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.h3) oh0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ih0Var.canScrollVertically(1) && (wl0Var = (wl0) ih0Var.K(0)) != null) {
                        View view = wl0Var.a;
                        if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                            ih0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 7:
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
                    em0 em0Var = mm0Var.c1;
                    if (em0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(em0Var);
                        mm0Var.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        mm0Var.K1.k(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.j1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.m1(null, view2);
                    mm0Var.N1 = false;
                }
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                mm0Var.I1 = z10;
                if (z10) {
                    mm0Var.J1 = true;
                    break;
                }
                break;
            case 8:
                xn0 xn0Var = (xn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(xn0Var.F.getCurrentFocus());
                }
                xn0Var.a();
                break;
            case 12:
                s71 s71Var = (s71) obj;
                ai.u1 u1Var = s71Var.d;
                if (i10 == 0 && s71Var.G) {
                    int i17 = s71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.h3) s71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && u1Var.canScrollVertically(1) && (wl0Var2 = (wl0) u1Var.K(0)) != null) {
                        View view3 = wl0Var2.a;
                        if (view3.getTop() > 0) {
                            u1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.o5) obj).h0) != null) {
                    o8Var.a();
                    break;
                }
                break;
            case 19:
                sg.s0 s0Var = (sg.s0) obj;
                if (i10 == 1) {
                    s0Var.e3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        sg.p1 p1Var2 = (sg.p1) s0Var.getChildAt(i18);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        s0Var.C1(p1Var, true);
                        s0Var.e3 = false;
                        s0Var.v0(0, p1Var.getTop() - ((s0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.D1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var.f3);
                    break;
                }
                break;
            case 20:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.x0) obj).Y.getEditText());
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
                    ((zh.k0) obj).v = false;
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
        tl0 tl0Var;
        org.telegram.ui.Wallet.k5 k5Var;
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
                v00.F((v00) this.b);
                break;
            case 3:
                ib0 ib0Var = (ib0) this.b;
                s4.n0 layoutManager = ib0Var.getLayoutManager();
                jb0 jb0Var = ib0Var.c3;
                cb0 cb0Var = jb0Var.d;
                int N0 = layoutManager == cb0Var ? cb0Var.N0() : jb0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    hg.j1 j1Var = jb0Var.f;
                    if (N0 > j1Var.M0 - 5 && j1Var.u0 == 0 && (str = j1Var.s0) != null && str.length() != 0 && (user = j1Var.w0) != null && (str2 = j1Var.r0) != null) {
                        j1Var.T(true, user, str2, j1Var.s0);
                    }
                }
                boolean z10 = !ib0Var.canScrollVertically(-1);
                ib0Var.canScrollVertically(1);
                jb0Var.n(z10);
                jb0Var.b();
                break;
            case 4:
                lc0 lc0Var = (lc0) this.b;
                org.telegram.ui.y8 y8Var = lc0Var.b;
                ec0 ec0Var = lc0Var.f;
                for (int i12 = 0; i12 < ec0Var.getChildCount(); i12++) {
                    View childAt = ec0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Y3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                dc0 dc0Var = lc0Var.e;
                if (dc0Var != null) {
                    dc0Var.w();
                    break;
                }
                break;
            case 5:
                oh0 oh0Var = (oh0) this.b;
                if (oh0Var.b.getChildCount() > 0) {
                    oh0.v(oh0Var);
                    break;
                }
                break;
            case 6:
                gl0 gl0Var = (gl0) this.b;
                ai.u1 u1Var = gl0Var.b;
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
                for (int i14 = 1; i14 < u1Var.getChildCount() - 1; i14++) {
                    gl0.b(gl0Var, u1Var.getChildAt(i14), 1.0f);
                }
                gl0Var.invalidate();
                break;
            case 7:
                mm0 mm0Var = (mm0) this.b;
                Rect rect = mm0Var.E1;
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
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
                if (i11 != 0 && (tl0Var = mm0Var.d1) != null) {
                    tl0Var.b();
                }
                xl0 xl0Var = mm0Var.S1;
                if (xl0Var != null) {
                    mm0Var.f1(xl0Var, 700, false);
                    break;
                }
                break;
            case 9:
                bw0.m((bw0) this.b);
                break;
            case 10:
                ((dx0) this.b).X.V();
                break;
            case 11:
                ty0.Q((ty0) this.b);
                break;
            case 12:
                ((s71) this.b).L();
                break;
            case 13:
                ((k91) this.b).invalidate();
                break;
            case 14:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (k5Var = o5Var.p0) != null && k5Var.f) {
                    k5Var.d = true;
                }
                o5Var.O0();
                break;
            case 15:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i11;
                break;
            case 16:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) this.b;
                if (s9Var.a.I1) {
                    AndroidUtilities.hideKeyboard(s9Var.M);
                    break;
                }
                break;
            case 17:
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
                if (pVar.a.I1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
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
                sg.s0 s0Var = (sg.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.C1(null, true);
                }
                s0Var.invalidate();
                break;
            case 21:
                ((uh.f) this.b).R();
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
                org.telegram.messenger.sl.t(g4Var.h.animate().alpha((g4Var.K && g4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), bs.h, 320L);
                break;
            case 24:
                ((yh.f4) this.b).Z();
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
                zh.k0 k0Var = (zh.k0) this.b;
                if (!k0Var.v) {
                    k0Var.h.a(k0Var.f(k0Var.c()), true);
                    break;
                }
                break;
        }
    }
}
