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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kn extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        int i10;
        int i11;
        int i12;
        ik0 ik0Var;
        int i13 = this.a;
        zf.n1 n1Var = null;
        Object obj = this.b;
        switch (i13) {
            case 5:
                v90 v90Var = (v90) obj;
                v90Var.T2 = i9 != 0;
                v90Var.U2 = i9 == 1;
                break;
            case 7:
                ag0 ag0Var = (ag0) obj;
                uf0 uf0Var = ag0Var.b;
                if (i9 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i14 = ag0Var.A;
                    i10 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                    int i15 = (i14 - i10) - dp;
                    i11 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                    if (i11 + i15 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && uf0Var.canScrollVertically(1)) {
                        uf0Var.getChildAt(0);
                        ik0 ik0Var2 = (ik0) uf0Var.K(0);
                        if (ik0Var2 != null) {
                            View view = ik0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                uf0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                wk0 wk0Var = (wk0) obj;
                if (i9 == 0) {
                    if (wk0Var.r2) {
                        wk0Var.r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!wk0Var.r2 && wk0Var.t1) {
                    wk0Var.r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i9 != 0 && wk0Var.J1 != null) {
                    ag.d dVar = wk0Var.a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        wk0Var.a1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        wk0Var.I1.a1(obtain);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    wk0Var.J1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = wk0Var.J1;
                    wk0Var.h1(view2, 0.0f, 0.0f, false);
                    wk0Var.J1 = null;
                    wk0Var.k1(null, view2);
                    wk0Var.L1 = false;
                }
                f2.d1 d1Var = wk0Var.W0;
                if (d1Var != null) {
                    d1Var.a(recyclerView, i9);
                }
                boolean z10 = i9 == 1 || i9 == 2;
                wk0Var.G1 = z10;
                if (z10) {
                    wk0Var.H1 = true;
                    break;
                }
                break;
            case 10:
                gm0 gm0Var = (gm0) obj;
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(gm0Var.B.getCurrentFocus());
                }
                gm0Var.a();
                break;
            case 14:
                s51 s51Var = (s51) obj;
                gh.f1 f1Var = s51Var.d;
                if (i9 == 0 && s51Var.C) {
                    int i16 = s51Var.y;
                    i12 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i12 + i16 < AndroidUtilities.statusBarHeight * 2 && f1Var.canScrollVertically(1) && (ik0Var = (ik0) f1Var.K(0)) != null) {
                        View view3 = ik0Var.a;
                        if (view3.getTop() > 0) {
                            f1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 20:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((pf.t1) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                zf.s0 s0Var = (zf.s0) obj;
                if (i9 == 1) {
                    s0Var.Z2 = true;
                }
                if (i9 == 0) {
                    for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
                        zf.n1 n1Var2 = (zf.n1) s0Var.getChildAt(i17);
                        if (n1Var == null || n1Var2.a > n1Var.a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var.w1(n1Var, true);
                        s0Var.Z2 = false;
                        s0Var.v0(0, n1Var.getTop() - ((s0Var.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.x1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var.a3);
                    break;
                }
                break;
        }
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        String str;
        TLRPC.User user;
        String str2;
        fk0 fk0Var;
        switch (this.a) {
            case 0:
                ln lnVar = (ln) this.b;
                lnVar.b.X1(lnVar, i10);
                break;
            case 1:
                cp cpVar = (cp) this.b;
                if (cpVar.x.M0() + 10 >= cpVar.h.h()) {
                    cpVar.w();
                    break;
                }
                break;
            case 2:
                dv dvVar = (dv) this.b;
                tu tuVar = dvVar.f;
                if (tuVar != null && dvVar.h.G1 && tuVar.w) {
                    tuVar.w = false;
                    tuVar.invalidate();
                    break;
                }
                break;
            case 3:
                vz vzVar = (vz) this.b;
                vzVar.B.invalidate();
                vzVar.invalidate();
                break;
            case 4:
                yz.F((yz) this.b);
                break;
            case 5:
                v90 v90Var = (v90) this.b;
                f2.z0 layoutManager = v90Var.getLayoutManager();
                w90 w90Var = v90Var.X2;
                p90 p90Var = w90Var.d;
                int N0 = layoutManager == p90Var ? p90Var.N0() : w90Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    of.f1 f1Var = w90Var.f;
                    if (N0 > f1Var.H0 - 5 && f1Var.q0 == 0 && (str = f1Var.o0) != null && str.length() != 0 && (user = f1Var.s0) != null && (str2 = f1Var.n0) != null) {
                        f1Var.T(true, user, str2, f1Var.o0);
                    }
                }
                boolean z10 = !v90Var.canScrollVertically(-1);
                v90Var.canScrollVertically(1);
                w90Var.n(z10);
                w90Var.b();
                break;
            case 6:
                wa0 wa0Var = (wa0) this.b;
                fh.x4 x4Var = wa0Var.b;
                pa0 pa0Var = wa0Var.f;
                for (int i11 = 0; i11 < pa0Var.getChildCount(); i11++) {
                    View childAt = pa0Var.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(x4Var.getMeasuredWidth(), x4Var.getBackgroundSizeY());
                    }
                }
                oa0 oa0Var = wa0Var.e;
                if (oa0Var != null) {
                    oa0Var.x();
                    break;
                }
                break;
            case 7:
                ag0 ag0Var = (ag0) this.b;
                if (ag0Var.b.getChildCount() > 0) {
                    ag0.t(ag0Var);
                    break;
                }
                break;
            case 8:
                uj0 uj0Var = (uj0) this.b;
                gh.f1 f1Var2 = uj0Var.b;
                int[] iArr = uj0Var.b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    uj0.b(uj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    uj0.b(uj0Var, childAt3, min2);
                }
                for (int i13 = 1; i13 < f1Var2.getChildCount() - 1; i13++) {
                    uj0.b(uj0Var, f1Var2.getChildAt(i13), 1.0f);
                }
                uj0Var.invalidate();
                break;
            case 9:
                wk0 wk0Var = (wk0) this.b;
                Rect rect = wk0Var.C1;
                f2.d1 d1Var = wk0Var.W0;
                if (d1Var != null) {
                    d1Var.b(recyclerView, i9, i10);
                }
                if (wk0Var.A1 != -1) {
                    rect.offset(-i9, -i10);
                    org.telegram.ui.Cells.z zVar = wk0Var.z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    wk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                wk0Var.K0(false);
                if (i10 != 0 && (fk0Var = wk0Var.b1) != null) {
                    fk0Var.b();
                }
                jk0 jk0Var = wk0Var.Q1;
                if (jk0Var != null) {
                    wk0Var.e1(jk0Var, 700, false);
                    break;
                }
                break;
            case 11:
                iu0.m((iu0) this.b);
                break;
            case 12:
                ((mv0) this.b).T.V();
                break;
            case 13:
                cx0.N((cx0) this.b);
                break;
            case 14:
                ((s51) this.b).K();
                break;
            case 15:
                ((m71) this.b).invalidate();
                break;
            case 16:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.b;
                if (!oVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.s)) {
                        oVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.a.G1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                if (c1Var.a.G1) {
                    AndroidUtilities.hideKeyboard(c1Var.fragmentView);
                    break;
                }
                break;
            case 18:
                pf.l.a0((pf.l) this.b);
                break;
            case 19:
                pf.e0 e0Var = (pf.e0) this.b;
                e0Var.b.X1(e0Var, i10);
                e0Var.L();
                break;
            case 21:
                zf.s0 s0Var = (zf.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.w1(null, true);
                }
                s0Var.invalidate();
                break;
        }
    }
}
