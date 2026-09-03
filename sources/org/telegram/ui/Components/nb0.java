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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nb0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        el0 el0Var;
        int i14 = this.a;
        Object obj = this.b;
        switch (i14) {
            case 1:
                xg0 xg0Var = (xg0) obj;
                rg0 rg0Var = xg0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = xg0Var.B;
                    i11 = ((org.telegram.ui.ActionBar.h3) xg0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.h3) xg0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && rg0Var.canScrollVertically(1)) {
                        rg0Var.getChildAt(0);
                        el0 el0Var2 = (el0) rg0Var.K(0);
                        if (el0Var2 != null) {
                            View view = el0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                rg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
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
                    gg.d dVar = sl0Var.b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        sl0Var.b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        sl0Var.J1.J(obtain);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    sl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = sl0Var.K1;
                    sl0Var.g1(view2, 0.0f, 0.0f, false);
                    sl0Var.K1 = null;
                    sl0Var.j1(null, view2);
                    sl0Var.M1 = false;
                }
                f2.a1 a1Var = sl0Var.X0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
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
                r61 r61Var = (r61) obj;
                mh.d1 d1Var = r61Var.d;
                if (i10 == 0 && r61Var.D) {
                    int i17 = r61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && d1Var.canScrollVertically(1) && (el0Var = (el0) d1Var.K(0)) != null) {
                        View view3 = el0Var.a;
                        if (view3.getTop() > 0) {
                            d1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                qh.n1 n1Var = (qh.n1) obj;
                if (i10 == 0 && n1Var.n >= 0.0f && !n1Var.b.canScrollVertically(-1)) {
                    n1Var.n = -1.0f;
                    break;
                }
                break;
            case 17:
                th.f0 f0Var = (th.f0) obj;
                if (i10 == 0) {
                    f0Var.e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vf.r1) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        bl0 bl0Var;
        ViewGroup viewGroup;
        boolean z4;
        qh.r1 r1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        qh.r1 r1Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        switch (this.a) {
            case 0:
                sb0 sb0Var = (sb0) this.b;
                lh.j4 j4Var = sb0Var.b;
                kb0 kb0Var = sb0Var.f;
                for (int i15 = 0; i15 < kb0Var.getChildCount(); i15++) {
                    View childAt = kb0Var.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        ((org.telegram.ui.Cells.t1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                jb0 jb0Var = sb0Var.e;
                if (jb0Var != null) {
                    jb0Var.x();
                    break;
                }
                break;
            case 1:
                xg0 xg0Var = (xg0) this.b;
                if (xg0Var.b.getChildCount() > 0) {
                    xg0.t(xg0Var);
                    break;
                }
                break;
            case 2:
                qk0 qk0Var = (qk0) this.b;
                mh.d1 d1Var = qk0Var.b;
                int[] iArr = qk0Var.c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i16, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    qk0.b(qk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i16) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    qk0.b(qk0Var, childAt3, min2);
                }
                for (int i17 = 1; i17 < d1Var.getChildCount() - 1; i17++) {
                    qk0.b(qk0Var, d1Var.getChildAt(i17), 1.0f);
                }
                qk0Var.invalidate();
                break;
            case 3:
                sl0 sl0Var = (sl0) this.b;
                Rect rect = sl0Var.D1;
                f2.a1 a1Var = sl0Var.X0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
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
                    sl0Var.d1(fl0Var, 700, false);
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
                ((r61) this.b).K();
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
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                if (f1Var.a.H1) {
                    AndroidUtilities.hideKeyboard(f1Var.fragmentView);
                    break;
                }
                break;
            case 12:
                qh.h1 h1Var = (qh.h1) this.b;
                qh.f1 f1Var2 = h1Var.c;
                qh.x1 x1Var = h1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) x1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.h3) x1Var).keyboardVisible;
                if (z4 && h1Var.b.H1 && (r1Var = h1Var.d) != null && r1Var.d != null) {
                    x1Var.o0();
                }
                if (h1Var.e.M0() + 7 >= f1Var2.h() - 1) {
                    f1Var2.G();
                    break;
                }
                break;
            case 13:
                qh.n1 n1Var = (qh.n1) this.b;
                qh.m1 m1Var = n1Var.c;
                qh.d1 d1Var2 = n1Var.b;
                qh.x1 x1Var2 = n1Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) x1Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (n1Var.n < 0.0f) {
                    i12 = n1Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < d1Var2.getChildCount()) {
                            View childAt4 = d1Var2.getChildAt(i19);
                            if (childAt4.getY() + childAt4.getHeight() > n1Var.n + d1Var2.getPaddingTop()) {
                                d1Var2.getClass();
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
                int size = m1Var.y.size() - 1;
                while (true) {
                    if (size >= 0) {
                        int keyAt = m1Var.y.keyAt(size);
                        int valueAt = m1Var.y.valueAt(size);
                        if (i12 >= keyAt) {
                            i18 = valueAt;
                        } else {
                            size--;
                        }
                    }
                }
                if (i18 >= 0) {
                    n1Var.e.j(i18, true);
                }
                z10 = ((org.telegram.ui.ActionBar.h3) x1Var2).keyboardVisible;
                if (z10 && d1Var2.H1 && (r1Var2 = n1Var.f) != null && r1Var2.d != null) {
                    x1Var2.o0();
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
                sh.d3 d3Var = (sh.d3) this.b;
                long j10 = d3Var.M;
                int i20 = 0;
                while (true) {
                    if (i20 < d3Var.c.getChildCount()) {
                        if (!(d3Var.c.getChildAt(i20) instanceof u00)) {
                            i20++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i13 = ((org.telegram.ui.ActionBar.p2) d3Var).currentAccount;
                mh.a0.g(i13).d(j10).a();
                i14 = ((org.telegram.ui.ActionBar.p2) d3Var).currentAccount;
                mh.a0.g(i14).e(j10).a();
                break;
            case 16:
                th.q qVar = (th.q) this.b;
                qVar.v.b(qVar.d);
                break;
            case 17:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((th.f0) this.b).f).containerView;
                viewGroup3.invalidate();
                break;
            case 18:
                th.h0 h0Var = (th.h0) this.b;
                h0Var.h.J.b(h0Var.d);
                break;
            case 19:
                vf.k.b0((vf.k) this.b);
                break;
            case 20:
                vf.c0 c0Var = (vf.c0) this.b;
                c0Var.b.X1(c0Var, i11);
                c0Var.M();
                break;
        }
    }
}
