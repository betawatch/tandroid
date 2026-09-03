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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mb0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        dl0 dl0Var;
        int i14 = this.a;
        Object obj = this.b;
        switch (i14) {
            case 1:
                wg0 wg0Var = (wg0) obj;
                qg0 qg0Var = wg0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = wg0Var.B;
                    i11 = ((org.telegram.ui.ActionBar.g3) wg0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.g3) wg0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && qg0Var.canScrollVertically(1)) {
                        qg0Var.getChildAt(0);
                        dl0 dl0Var2 = (dl0) qg0Var.K(0);
                        if (dl0Var2 != null) {
                            View view = dl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                qg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                rl0 rl0Var = (rl0) obj;
                if (i10 == 0) {
                    if (rl0Var.s2) {
                        rl0Var.s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!rl0Var.s2 && rl0Var.u1) {
                    rl0Var.s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && rl0Var.K1 != null) {
                    fg.d dVar = rl0Var.b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        rl0Var.b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        rl0Var.J1.w2(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    rl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = rl0Var.K1;
                    rl0Var.g1(view2, 0.0f, 0.0f, false);
                    rl0Var.K1 = null;
                    rl0Var.j1(null, view2);
                    rl0Var.M1 = false;
                }
                f2.z0 z0Var = rl0Var.X0;
                if (z0Var != null) {
                    z0Var.a(recyclerView, i10);
                }
                boolean z4 = i10 == 1 || i10 == 2;
                rl0Var.H1 = z4;
                if (z4) {
                    rl0Var.I1 = true;
                    break;
                }
                break;
            case 4:
                cn0 cn0Var = (cn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(cn0Var.C.getCurrentFocus());
                }
                cn0Var.a();
                break;
            case 8:
                q61 q61Var = (q61) obj;
                lh.e1 e1Var = q61Var.d;
                if (i10 == 0 && q61Var.D) {
                    int i17 = q61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.g3) q61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (dl0Var = (dl0) e1Var.K(0)) != null) {
                        View view3 = dl0Var.a;
                        if (view3.getTop() > 0) {
                            e1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ph.n1 n1Var = (ph.n1) obj;
                if (i10 == 0 && n1Var.n >= 0.0f && !n1Var.b.canScrollVertically(-1)) {
                    n1Var.n = -1.0f;
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
        al0 al0Var;
        ViewGroup viewGroup;
        boolean z4;
        ph.r1 r1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        ph.r1 r1Var2;
        int i13;
        int i14;
        ViewGroup viewGroup3;
        switch (this.a) {
            case 0:
                rb0 rb0Var = (rb0) this.b;
                kh.i4 i4Var = rb0Var.b;
                jb0 jb0Var = rb0Var.f;
                for (int i15 = 0; i15 < jb0Var.getChildCount(); i15++) {
                    View childAt = jb0Var.getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Z3(i4Var.getMeasuredWidth(), i4Var.getBackgroundSizeY());
                    }
                }
                ib0 ib0Var = rb0Var.e;
                if (ib0Var != null) {
                    ib0Var.x();
                    break;
                }
                break;
            case 1:
                wg0 wg0Var = (wg0) this.b;
                if (wg0Var.b.getChildCount() > 0) {
                    wg0.t(wg0Var);
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
                rl0 rl0Var = (rl0) this.b;
                Rect rect = rl0Var.D1;
                f2.z0 z0Var = rl0Var.X0;
                if (z0Var != null) {
                    z0Var.b(recyclerView, i10, i11);
                }
                if (rl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = rl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    rl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                rl0Var.K0(false);
                if (i11 != 0 && (al0Var = rl0Var.c1) != null) {
                    al0Var.b();
                }
                el0 el0Var = rl0Var.R1;
                if (el0Var != null) {
                    rl0Var.d1(el0Var, 700, false);
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
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                if (g1Var.a.H1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    break;
                }
                break;
            case 12:
                ph.h1 h1Var = (ph.h1) this.b;
                ph.f1 f1Var = h1Var.c;
                ph.y1 y1Var = h1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.g3) y1Var).keyboardVisible;
                if (z4 && h1Var.b.H1 && (r1Var = h1Var.d) != null && r1Var.d != null) {
                    y1Var.o0();
                }
                if (h1Var.e.M0() + 7 >= f1Var.h() - 1) {
                    f1Var.G();
                    break;
                }
                break;
            case 13:
                ph.n1 n1Var = (ph.n1) this.b;
                ph.m1 m1Var = n1Var.c;
                ph.d1 d1Var = n1Var.b;
                ph.y1 y1Var2 = n1Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (n1Var.n < 0.0f) {
                    i12 = n1Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < d1Var.getChildCount()) {
                            View childAt4 = d1Var.getChildAt(i19);
                            if (childAt4.getY() + childAt4.getHeight() > n1Var.n + d1Var.getPaddingTop()) {
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
                z10 = ((org.telegram.ui.ActionBar.g3) y1Var2).keyboardVisible;
                if (z10 && d1Var.H1 && (r1Var2 = n1Var.f) != null && r1Var2.d != null) {
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
                rh.d3 d3Var = (rh.d3) this.b;
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
                lh.b0.g(i13).d(j10).a();
                i14 = ((org.telegram.ui.ActionBar.p2) d3Var).currentAccount;
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
