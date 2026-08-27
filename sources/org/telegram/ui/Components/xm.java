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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xm extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        int top;
        int i11;
        int i12;
        int i13;
        lk0 lk0Var2;
        int i14 = this.a;
        Object obj = this.b;
        switch (i14) {
            case 0:
                in inVar = (in) obj;
                ta1 ta1Var = inVar.s;
                gi giVar = inVar.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
                    if (((giVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (lk0Var = (lk0) ta1Var.K(1)) != null && (top = (lk0Var.a.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(65.0f)) > 0) {
                        ta1Var.v0(0, top, null);
                    }
                    int i15 = inVar.S0;
                    if (i15 >= 0) {
                        in.K(inVar, i15);
                        inVar.S0 = -1;
                        break;
                    }
                }
                break;
            case 6:
                z90 z90Var = (z90) obj;
                z90Var.T2 = i10 != 0;
                z90Var.U2 = i10 == 1;
                break;
            case 8:
                cg0 cg0Var = (cg0) obj;
                wf0 wf0Var = cg0Var.b;
                if (i10 == 0) {
                    int dp2 = AndroidUtilities.dp(13.0f);
                    int i16 = cg0Var.A;
                    i11 = ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop;
                    int i17 = (i16 - i11) - dp2;
                    i12 = ((org.telegram.ui.ActionBar.e3) cg0Var).backgroundPaddingTop;
                    if (i12 + i17 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wf0Var.canScrollVertically(1)) {
                        wf0Var.getChildAt(0);
                        lk0 lk0Var3 = (lk0) wf0Var.K(0);
                        if (lk0Var3 != null) {
                            View view = lk0Var3.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                wf0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 10:
                zk0 zk0Var = (zk0) obj;
                if (i10 == 0) {
                    if (zk0Var.r2) {
                        zk0Var.r2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zk0Var.r2 && zk0Var.t1) {
                    zk0Var.r2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zk0Var.J1 != null) {
                    bg.d dVar = zk0Var.a1;
                    if (dVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(dVar);
                        zk0Var.a1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zk0Var.I1.P(obtain);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    zk0Var.J1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = zk0Var.J1;
                    zk0Var.h1(view2, 0.0f, 0.0f, false);
                    zk0Var.J1 = null;
                    zk0Var.k1(null, view2);
                    zk0Var.L1 = false;
                }
                f2.b1 b1Var = zk0Var.W0;
                if (b1Var != null) {
                    b1Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                zk0Var.G1 = z10;
                if (z10) {
                    zk0Var.H1 = true;
                    break;
                }
                break;
            case 11:
                jm0 jm0Var = (jm0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(jm0Var.B.getCurrentFocus());
                }
                jm0Var.a();
                break;
            case 15:
                u51 u51Var = (u51) obj;
                hh.f1 f1Var = u51Var.d;
                if (i10 == 0 && u51Var.C) {
                    int i18 = u51Var.y;
                    i13 = ((org.telegram.ui.ActionBar.e3) u51Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i18 < AndroidUtilities.statusBarHeight * 2 && f1Var.canScrollVertically(1) && (lk0Var2 = (lk0) f1Var.K(0)) != null) {
                        View view3 = lk0Var2.a;
                        if (view3.getTop() > 0) {
                            f1Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qf.s1) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        x30 x30Var;
        String str;
        TLRPC.User user;
        String str2;
        ik0 ik0Var;
        switch (this.a) {
            case 0:
                in inVar = (in) this.b;
                zi ziVar = inVar.w;
                inVar.b.X1(inVar, i11);
                ym ymVar = inVar.x;
                if (ymVar != null && ymVar.s) {
                    ux0 delegate = ymVar.getDelegate();
                    if (delegate instanceof org.telegram.ui.Cells.z5) {
                        ta1 ta1Var = inVar.s;
                        View F = ta1Var.F((org.telegram.ui.Cells.z5) delegate);
                        f2.o1 T = F == null ? null : ta1Var.T(F);
                        if (T != null) {
                            View view = T.a;
                            int b10 = T.b();
                            if (ymVar.getDirection() == 0) {
                                ymVar.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                ymVar.setTranslationY(view.getY());
                            }
                            if (b10 < ziVar.L0() || b10 > ziVar.N0()) {
                                ymVar.f();
                            }
                        } else {
                            ymVar.f();
                        }
                    } else {
                        ymVar.f();
                    }
                }
                if (i11 != 0 && (x30Var = inVar.y) != null) {
                    x30Var.b(true);
                    break;
                }
                break;
            case 1:
                jn jnVar = (jn) this.b;
                jnVar.b.X1(jnVar, i11);
                break;
            case 2:
                ap apVar = (ap) this.b;
                if (apVar.x.M0() + 10 >= apVar.h.h()) {
                    apVar.x();
                    break;
                }
                break;
            case 3:
                cv cvVar = (cv) this.b;
                su suVar = cvVar.f;
                if (suVar != null && cvVar.h.G1 && suVar.w) {
                    suVar.w = false;
                    suVar.invalidate();
                    break;
                }
                break;
            case 4:
                yz yzVar = (yz) this.b;
                yzVar.B.invalidate();
                yzVar.invalidate();
                break;
            case 5:
                b00.G((b00) this.b);
                break;
            case 6:
                z90 z90Var = (z90) this.b;
                f2.x0 layoutManager = z90Var.getLayoutManager();
                aa0 aa0Var = z90Var.X2;
                t90 t90Var = aa0Var.d;
                int N0 = layoutManager == t90Var ? t90Var.N0() : aa0Var.c.N0();
                if ((N0 == -1 ? 0 : N0) > 0) {
                    pf.u0 u0Var = aa0Var.f;
                    if (N0 > u0Var.H0 - 5 && u0Var.q0 == 0 && (str = u0Var.o0) != null && str.length() != 0 && (user = u0Var.s0) != null && (str2 = u0Var.n0) != null) {
                        u0Var.T(true, user, str2, u0Var.o0);
                    }
                }
                boolean z10 = !z90Var.canScrollVertically(-1);
                z90Var.canScrollVertically(1);
                aa0Var.n(z10);
                aa0Var.b();
                break;
            case 7:
                ab0 ab0Var = (ab0) this.b;
                gh.q4 q4Var = ab0Var.b;
                ta0 ta0Var = ab0Var.f;
                for (int i12 = 0; i12 < ta0Var.getChildCount(); i12++) {
                    View childAt = ta0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        ((org.telegram.ui.Cells.s1) childAt).Y3(q4Var.getMeasuredWidth(), q4Var.getBackgroundSizeY());
                    }
                }
                sa0 sa0Var = ab0Var.e;
                if (sa0Var != null) {
                    sa0Var.x();
                    break;
                }
                break;
            case 8:
                cg0 cg0Var = (cg0) this.b;
                if (cg0Var.b.getChildCount() > 0) {
                    cg0.u(cg0Var);
                    break;
                }
                break;
            case 9:
                wj0 wj0Var = (wj0) this.b;
                hh.f1 f1Var = wj0Var.b;
                int[] iArr = wj0Var.b0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    wj0.b(wj0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    wj0.b(wj0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < f1Var.getChildCount() - 1; i14++) {
                    wj0.b(wj0Var, f1Var.getChildAt(i14), 1.0f);
                }
                wj0Var.invalidate();
                break;
            case 10:
                zk0 zk0Var = (zk0) this.b;
                Rect rect = zk0Var.C1;
                f2.b1 b1Var = zk0Var.W0;
                if (b1Var != null) {
                    b1Var.b(recyclerView, i10, i11);
                }
                if (zk0Var.A1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = zk0Var.z1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    zk0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                zk0Var.K0(false);
                if (i11 != 0 && (ik0Var = zk0Var.b1) != null) {
                    ik0Var.b();
                }
                mk0 mk0Var = zk0Var.Q1;
                if (mk0Var != null) {
                    zk0Var.e1(mk0Var, 700, false);
                    break;
                }
                break;
            case 12:
                lu0.m((lu0) this.b);
                break;
            case 13:
                ((ov0) this.b).T.V();
                break;
            case 14:
                ex0.O((ex0) this.b);
                break;
            case 15:
                ((u51) this.b).L();
                break;
            case 16:
                ((o71) this.b).invalidate();
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
                if (pVar.a.G1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                if (d1Var.a.G1) {
                    AndroidUtilities.hideKeyboard(d1Var.fragmentView);
                    break;
                }
                break;
            case 19:
                qf.m.b0((qf.m) this.b);
                break;
            case 20:
                qf.e0 e0Var = (qf.e0) this.b;
                e0Var.b.X1(e0Var, i11);
                e0Var.M();
                break;
        }
    }
}
