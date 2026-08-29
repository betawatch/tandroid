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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h00 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h00(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        vk0 vk0Var;
        int i14 = this.a;
        Object obj = this.b;
        switch (i14) {
            case 1:
                ja0 ja0Var = (ja0) obj;
                ja0Var.T2 = i10 != 0;
                ja0Var.U2 = i10 == 1;
                break;
            case 3:
                lg0 lg0Var = (lg0) obj;
                fg0 fg0Var = lg0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = lg0Var.A;
                    i11 = ((org.telegram.ui.ActionBar.f3) lg0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) lg0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && fg0Var.canScrollVertically(1)) {
                        fg0Var.getChildAt(0);
                        vk0 vk0Var2 = (vk0) fg0Var.K(0);
                        if (vk0Var2 != null) {
                            View view = vk0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                fg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                jl0 jl0Var = (jl0) obj;
                if (i10 == 0) {
                    if (jl0Var.r2) {
                        jl0Var.r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!jl0Var.r2 && jl0Var.t1) {
                    jl0Var.r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && jl0Var.J1 != null) {
                    dg.d dVar = jl0Var.a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        jl0Var.a1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        jl0Var.I1.r(obtain);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    jl0Var.J1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = jl0Var.J1;
                    jl0Var.h1(view2, 0.0f, 0.0f, false);
                    jl0Var.J1 = null;
                    jl0Var.k1(null, view2);
                    jl0Var.L1 = false;
                }
                f2.a1 a1Var = jl0Var.W0;
                if (a1Var != null) {
                    a1Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                jl0Var.G1 = z10;
                if (z10) {
                    jl0Var.H1 = true;
                    break;
                }
                break;
            case 6:
                tm0 tm0Var = (tm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(tm0Var.B.getCurrentFocus());
                }
                tm0Var.a();
                break;
            case 10:
                f61 f61Var = (f61) obj;
                jh.e1 e1Var = f61Var.d;
                if (i10 == 0 && f61Var.C) {
                    int i17 = f61Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) f61Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && e1Var.canScrollVertically(1) && (vk0Var = (vk0) e1Var.K(0)) != null) {
                        View view3 = vk0Var.a;
                        if (view3.getTop() > 0) {
                            e1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 17:
                qh.f0 f0Var = (qh.f0) obj;
                if (i10 == 0) {
                    f0Var.e = !f0Var.d.canScrollVertically(-1);
                    f0Var.d.canScrollVertically(1);
                    break;
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sf.u1) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        String str;
        TLRPC.User user;
        String str2;
        sk0 sk0Var;
        int i12;
        int i13;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                j00.F((j00) this.b);
                break;
            case 1:
                ja0 ja0Var = (ja0) this.b;
                f2.w0 layoutManager = ja0Var.getLayoutManager();
                ka0 ka0Var = ja0Var.X2;
                da0 da0Var = ka0Var.d;
                int N0 = layoutManager == da0Var ? da0Var.N0() : ka0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    rf.v0 v0Var = ka0Var.f;
                    if (N0 > v0Var.H0 - 5 && v0Var.q0 == 0 && (str = v0Var.o0) != null && str.length() != 0 && (user = v0Var.s0) != null && (str2 = v0Var.n0) != null) {
                        v0Var.T(true, user, str2, v0Var.o0);
                    }
                }
                boolean z10 = !ja0Var.canScrollVertically(-1);
                ja0Var.canScrollVertically(1);
                ka0Var.n(z10);
                ka0Var.b();
                break;
            case 2:
                lb0 lb0Var = (lb0) this.b;
                ih.j4 j4Var = lb0Var.b;
                eb0 eb0Var = lb0Var.f;
                for (int i14 = 0; i14 < eb0Var.getChildCount(); i14++) {
                    View childAt = eb0Var.getChildAt(i14);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
                    }
                }
                db0 db0Var = lb0Var.e;
                if (db0Var != null) {
                    db0Var.x();
                    break;
                }
                break;
            case 3:
                lg0 lg0Var = (lg0) this.b;
                if (lg0Var.b.getChildCount() > 0) {
                    lg0.t(lg0Var);
                    break;
                }
                break;
            case 4:
                fk0 fk0Var = (fk0) this.b;
                jh.e1 e1Var = fk0Var.b;
                int[] iArr = fk0Var.b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i15 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i15, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    fk0.b(fk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i15) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    fk0.b(fk0Var, childAt3, min2);
                }
                for (int i16 = 1; i16 < e1Var.getChildCount() - 1; i16++) {
                    fk0.b(fk0Var, e1Var.getChildAt(i16), 1.0f);
                }
                fk0Var.invalidate();
                break;
            case 5:
                jl0 jl0Var = (jl0) this.b;
                Rect rect = jl0Var.C1;
                f2.a1 a1Var = jl0Var.W0;
                if (a1Var != null) {
                    a1Var.b(recyclerView, i10, i11);
                }
                if (jl0Var.A1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = jl0Var.z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    jl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                jl0Var.K0(false);
                if (i11 != 0 && (sk0Var = jl0Var.b1) != null) {
                    sk0Var.b();
                }
                wk0 wk0Var = jl0Var.Q1;
                if (wk0Var != null) {
                    jl0Var.e1(wk0Var, 700, false);
                    break;
                }
                break;
            case 7:
                uu0.m((uu0) this.b);
                break;
            case 8:
                ((wv0) this.b).T.V();
                break;
            case 9:
                nx0.O((nx0) this.b);
                break;
            case 10:
                ((f61) this.b).K();
                break;
            case 11:
                ((y71) this.b).invalidate();
                break;
            case 12:
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
                if (pVar.a.G1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                if (d1Var.a.G1) {
                    AndroidUtilities.hideKeyboard(d1Var.fragmentView);
                    break;
                }
                break;
            case 14:
                gf gfVar = (gf) this.b;
                View m10 = gfVar.c.getLayoutManager().m(0);
                float y8 = m10 != null ? m10.getY() : 0.0f;
                gfVar.h = y8 >= 0.0f ? y8 : 0.0f;
                gfVar.b();
                break;
            case 15:
                ph.d3 d3Var = (ph.d3) this.b;
                long j10 = d3Var.L;
                int i17 = 0;
                while (true) {
                    if (i17 < d3Var.c.getChildCount()) {
                        if (!(d3Var.c.getChildAt(i17) instanceof p00)) {
                            i17++;
                        }
                    } else if (recyclerView.canScrollVertically(1)) {
                    }
                }
                i12 = ((org.telegram.ui.ActionBar.o2) d3Var).currentAccount;
                jh.b0.g(i12).d(j10).a();
                i13 = ((org.telegram.ui.ActionBar.o2) d3Var).currentAccount;
                jh.b0.g(i13).e(j10).a();
                break;
            case 16:
                qh.q qVar = (qh.q) this.b;
                qVar.v.b(qVar.d);
                break;
            case 17:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((qh.f0) this.b).f).containerView;
                viewGroup.invalidate();
                break;
            case 18:
                qh.h0 h0Var = (qh.h0) this.b;
                h0Var.h.I.b(h0Var.d);
                break;
            case 19:
                sf.l.b0((sf.l) this.b);
                break;
            case 20:
                sf.d0 d0Var = (sf.d0) this.b;
                d0Var.b.X1(d0Var, i11);
                d0Var.L();
                break;
        }
    }
}
