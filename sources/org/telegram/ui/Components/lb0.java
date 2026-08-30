package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lb0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        el0 el0Var;
        int i14 = this.a;
        Object obj = this.b;
        switch (i14) {
            case 1:
                vg0 vg0Var = (vg0) obj;
                pg0 pg0Var = vg0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = vg0Var.B;
                    i11 = ((org.telegram.ui.ActionBar.g3) vg0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.g3) vg0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && pg0Var.canScrollVertically(1)) {
                        pg0Var.getChildAt(0);
                        el0 el0Var2 = (el0) pg0Var.K(0);
                        if (el0Var2 != null) {
                            View view = el0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                pg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                sl0 sl0Var = (sl0) obj;
                if (i10 == 0) {
                    if (sl0Var.s2) {
                        sl0Var.s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!sl0Var.s2 && sl0Var.u1) {
                    sl0Var.s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && sl0Var.K1 != null) {
                    fg.d dVar = sl0Var.b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        sl0Var.b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        sl0Var.J1.v0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    sl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = sl0Var.K1;
                    sl0Var.h1(view2, 0.0f, 0.0f, false);
                    sl0Var.K1 = null;
                    sl0Var.k1(null, view2);
                    sl0Var.M1 = false;
                }
                f2.z0 z0Var = sl0Var.X0;
                if (z0Var != null) {
                    z0Var.a(recyclerView, i10);
                }
                boolean z4 = i10 == 1 || i10 == 2;
                sl0Var.H1 = z4;
                if (z4) {
                    sl0Var.I1 = true;
                    break;
                }
                break;
            case 4:
                dn0 dn0Var = (dn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(dn0Var.C.getCurrentFocus());
                }
                dn0Var.a();
                break;
            case 8:
                q61 q61Var = (q61) obj;
                lh.e1 e1Var = q61Var.d;
                if (i10 == 0 && q61Var.D) {
                    int i17 = q61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.g3) q61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (el0Var = (el0) e1Var.K(0)) != null) {
                        View view3 = el0Var.a;
                        if (view3.getTop() > 0) {
                            e1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ph.o1 o1Var = (ph.o1) obj;
                if (i10 == 0 && o1Var.n >= 0.0f && !o1Var.b.canScrollVertically(-1)) {
                    o1Var.n = -1.0f;
                    break;
                }
                break;
            case 17:
                sh.f0 f0Var = (sh.f0) obj;
                if (i10 == 0) {
                    f0Var.e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((uf.r1) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        bl0 bl0Var;
        ViewGroup viewGroup;
        boolean z4;
        ph.s1 s1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        ph.s1 s1Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        switch (this.a) {
            case 0:
                qb0 qb0Var = (qb0) this.b;
                kh.j4 j4Var = qb0Var.b;
                ib0 ib0Var = qb0Var.f;
                for (int i15 = 0; i15 < ib0Var.getChildCount(); i15++) {
                    View childAt = ib0Var.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                hb0 hb0Var = qb0Var.e;
                if (hb0Var != null) {
                    hb0Var.x();
                    break;
                }
                break;
            case 1:
                vg0 vg0Var = (vg0) this.b;
                if (vg0Var.b.getChildCount() > 0) {
                    vg0.t(vg0Var);
                    break;
                }
                break;
            case 2:
                pk0 pk0Var = (pk0) this.b;
                lh.e1 e1Var = pk0Var.b;
                int[] iArr = pk0Var.c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i16, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    pk0.b(pk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i16) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    pk0.b(pk0Var, childAt3, min2);
                }
                for (int i17 = 1; i17 < e1Var.getChildCount() - 1; i17++) {
                    pk0.b(pk0Var, e1Var.getChildAt(i17), 1.0f);
                }
                pk0Var.invalidate();
                break;
            case 3:
                sl0 sl0Var = (sl0) this.b;
                Rect rect = sl0Var.D1;
                f2.z0 z0Var = sl0Var.X0;
                if (z0Var != null) {
                    z0Var.b(recyclerView, i10, i11);
                }
                if (sl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = sl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    sl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                sl0Var.K0(false);
                if (i11 != 0 && (bl0Var = sl0Var.c1) != null) {
                    bl0Var.b();
                }
                fl0 fl0Var = sl0Var.R1;
                if (fl0Var != null) {
                    sl0Var.e1(fl0Var, 700, false);
                    break;
                }
                break;
            case 5:
                cv0.m((cv0) this.b);
                break;
            case 6:
                ((fw0) this.b).U.V();
                break;
            case 7:
                xx0.O((xx0) this.b);
                break;
            case 8:
                ((q61) this.b).K();
                break;
            case 9:
                ((k81) this.b).invalidate();
                break;
            case 10:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.b;
                if (!pVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.s)) {
                        pVar.d.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.e;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.a.H1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.e1 e1Var2 = (org.telegram.ui.web.e1) this.b;
                if (e1Var2.a.H1) {
                    AndroidUtilities.hideKeyboard(e1Var2.fragmentView);
                    break;
                }
                break;
            case 12:
                ph.i1 i1Var = (ph.i1) this.b;
                ph.g1 g1Var = i1Var.c;
                ph.y1 y1Var = i1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.g3) y1Var).keyboardVisible;
                if (z4 && i1Var.b.H1 && (s1Var = i1Var.d) != null && s1Var.d != null) {
                    y1Var.o0();
                }
                if (i1Var.e.M0() + 7 >= g1Var.h() - 1) {
                    g1Var.G();
                    break;
                }
                break;
            case 13:
                ph.o1 o1Var = (ph.o1) this.b;
                ph.n1 n1Var = o1Var.c;
                ph.d1 d1Var = o1Var.b;
                ph.y1 y1Var2 = o1Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (o1Var.n < 0.0f) {
                    i12 = o1Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < d1Var.getChildCount()) {
                            View childAt4 = d1Var.getChildAt(i19);
                            if (childAt4.getY() + childAt4.getHeight() > o1Var.n + d1Var.getPaddingTop()) {
                                d1Var.getClass();
                                i12 = RecyclerView.R(childAt4);
                            } else {
                                i19++;
                            }
                        } else {
                            i12 = -1;
                        }
                    }
                    if (i12 == -1) {
                    }
                }
                int size = n1Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = n1Var.y.keyAt(size);
                        int valueAt = n1Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i18 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i18 >= 0) {
                    o1Var.e.j(i18, true);
                }
                z10 = ((org.telegram.ui.ActionBar.g3) y1Var2).keyboardVisible;
                if (z10 && d1Var.H1 && (s1Var2 = o1Var.f) != null && s1Var2.d != null) {
                    y1Var2.o0();
                    break;
                }
                break;
            case 14:
                df dfVar = (df) this.b;
                View m9 = dfVar.c.getLayoutManager().m(0);
                float y10 = m9 != null ? m9.getY() : 0.0f;
                dfVar.h = y10 >= 0.0f ? y10 : 0.0f;
                dfVar.b();
                break;
            case 15:
                rh.e3 e3Var = (rh.e3) this.b;
                long j10 = e3Var.M;
                int i20 = 0;
                while (true) {
                    if (i20 < e3Var.c.getChildCount()) {
                        if (!(e3Var.c.getChildAt(i20) instanceof t00)) {
                            i20++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.p2) e3Var).currentAccount;
                lh.b0.g(i13).d(j10).a();
                i14 = ((org.telegram.ui.ActionBar.p2) e3Var).currentAccount;
                lh.b0.g(i14).e(j10).a();
                break;
            case 16:
                sh.q qVar = (sh.q) this.b;
                qVar.v.b(qVar.d);
                break;
            case 17:
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) ((sh.f0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 18:
                sh.h0 h0Var = (sh.h0) this.b;
                h0Var.h.J.b(h0Var.d);
                break;
            case 19:
                uf.k.b0((uf.k) this.b);
                break;
            case 20:
                uf.c0 c0Var = (uf.c0) this.b;
                c0Var.b.X1(c0Var, i11);
                c0Var.M();
                break;
        }
    }
}
