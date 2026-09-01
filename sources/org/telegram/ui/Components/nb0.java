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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        fl0 fl0Var;
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
                        fl0 fl0Var2 = (fl0) rg0Var.K(0);
                        if (fl0Var2 != null) {
                            View view = fl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                rg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                tl0 tl0Var = (tl0) obj;
                if (i10 == 0) {
                    if (tl0Var.s2) {
                        tl0Var.s2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!tl0Var.s2 && tl0Var.u1) {
                    tl0Var.s2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && tl0Var.K1 != null) {
                    gg.d dVar = tl0Var.b1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        tl0Var.b1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        tl0Var.J1.J(obtain);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    tl0Var.K1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = tl0Var.K1;
                    tl0Var.h1(view2, 0.0f, 0.0f, false);
                    tl0Var.K1 = null;
                    tl0Var.k1(null, view2);
                    tl0Var.M1 = false;
                }
                f2.a1 a1Var = tl0Var.X0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
                }
                boolean z4 = i10 == 1 || i10 == 2;
                tl0Var.H1 = z4;
                if (z4) {
                    tl0Var.I1 = true;
                    break;
                }
                break;
            case 4:
                en0 en0Var = (en0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(en0Var.C.getCurrentFocus());
                }
                en0Var.a();
                break;
            case 8:
                s61 s61Var = (s61) obj;
                mh.d1 d1Var = s61Var.d;
                if (i10 == 0 && s61Var.D) {
                    int i17 = s61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.h3) s61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && d1Var.canScrollVertically(1) && (fl0Var = (fl0) d1Var.K(0)) != null) {
                        View view3 = fl0Var.a;
                        if (view3.getTop() > 0) {
                            d1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                qh.o1 o1Var = (qh.o1) obj;
                if (i10 == 0 && o1Var.n >= 0.0f && !o1Var.b.canScrollVertically(-1)) {
                    o1Var.n = -1.0f;
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
        cl0 cl0Var;
        ViewGroup viewGroup;
        boolean z4;
        qh.s1 s1Var;
        ViewGroup viewGroup2;
        int i12;
        boolean z10;
        qh.s1 s1Var2;
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
                rk0 rk0Var = (rk0) this.b;
                mh.d1 d1Var = rk0Var.b;
                int[] iArr = rk0Var.c0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i16 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i16, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    rk0.b(rk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i16) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    rk0.b(rk0Var, childAt3, min2);
                }
                for (int i17 = 1; i17 < d1Var.getChildCount() - 1; i17++) {
                    rk0.b(rk0Var, d1Var.getChildAt(i17), 1.0f);
                }
                rk0Var.invalidate();
                break;
            case 3:
                tl0 tl0Var = (tl0) this.b;
                Rect rect = tl0Var.D1;
                f2.a1 a1Var = tl0Var.X0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
                }
                if (tl0Var.B1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = tl0Var.A1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    tl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                tl0Var.K0(false);
                if (i11 != 0 && (cl0Var = tl0Var.c1) != null) {
                    cl0Var.b();
                }
                gl0 gl0Var = tl0Var.R1;
                if (gl0Var != null) {
                    tl0Var.e1(gl0Var, 700, false);
                    break;
                }
                break;
            case 5:
                dv0.m((dv0) this.b);
                break;
            case 6:
                ((gw0) this.b).U.V();
                break;
            case 7:
                yx0.O((yx0) this.b);
                break;
            case 8:
                ((s61) this.b).K();
                break;
            case 9:
                ((l81) this.b).invalidate();
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
                qh.i1 i1Var = (qh.i1) this.b;
                qh.g1 g1Var = i1Var.c;
                qh.y1 y1Var = i1Var.r;
                viewGroup = ((org.telegram.ui.ActionBar.h3) y1Var).containerView;
                viewGroup.invalidate();
                z4 = ((org.telegram.ui.ActionBar.h3) y1Var).keyboardVisible;
                if (z4 && i1Var.b.H1 && (s1Var = i1Var.d) != null && s1Var.d != null) {
                    y1Var.o0();
                }
                if (i1Var.e.M0() + 7 >= g1Var.h() - 1) {
                    g1Var.G();
                    break;
                }
                break;
            case 13:
                qh.o1 o1Var = (qh.o1) this.b;
                qh.n1 n1Var = o1Var.c;
                qh.d1 d1Var2 = o1Var.b;
                qh.y1 y1Var2 = o1Var.s;
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) y1Var2).containerView;
                viewGroup2.invalidate();
                int i18 = -1;
                if (o1Var.n < 0.0f) {
                    i12 = o1Var.d.I0();
                } else {
                    int i19 = 0;
                    while (true) {
                        if (i19 < d1Var2.getChildCount()) {
                            View childAt4 = d1Var2.getChildAt(i19);
                            if (childAt4.getY() + childAt4.getHeight() > o1Var.n + d1Var2.getPaddingTop()) {
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
                z10 = ((org.telegram.ui.ActionBar.h3) y1Var2).keyboardVisible;
                if (z10 && d1Var2.H1 && (s1Var2 = o1Var.f) != null && s1Var2.d != null) {
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
