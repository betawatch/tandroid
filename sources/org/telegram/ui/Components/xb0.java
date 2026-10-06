package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class xb0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        il0 il0Var;
        int i14 = this.a;
        rg.p1 p1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 1:
                ch0 ch0Var = (ch0) obj;
                wg0 wg0Var = ch0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = ch0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.f3) ch0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) ch0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && wg0Var.canScrollVertically(1)) {
                        wg0Var.getChildAt(0);
                        il0 il0Var2 = (il0) wg0Var.K(0);
                        if (il0Var2 != null) {
                            View view = il0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                wg0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                zl0 zl0Var = (zl0) obj;
                if (i10 == 0) {
                    if (zl0Var.v2) {
                        zl0Var.v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!zl0Var.v2 && zl0Var.x1) {
                    zl0Var.v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && zl0Var.N1 != null) {
                    ql0 ql0Var = zl0Var.e1;
                    if (ql0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ql0Var);
                        zl0Var.e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        zl0Var.M1.G(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    zl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = zl0Var.N1;
                    zl0Var.j1(view2, 0.0f, 0.0f, false);
                    zl0Var.N1 = null;
                    zl0Var.m1(null, view2);
                    zl0Var.P1 = false;
                }
                s4.s0 s0Var = zl0Var.a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                zl0Var.K1 = z10;
                if (z10) {
                    zl0Var.L1 = true;
                    break;
                }
                break;
            case 4:
                on0 on0Var = (on0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(on0Var.F.getCurrentFocus());
                }
                on0Var.a();
                break;
            case 9:
                o71 o71Var = (o71) obj;
                ai.w0 w0Var = o71Var.d;
                if (i10 == 0 && o71Var.G) {
                    int i17 = o71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) o71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (il0Var = (il0) w0Var.K(0)) != null) {
                        View view3 = il0Var.a;
                        if (view3.getTop() > 0) {
                            w0Var.w0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                rg.t0 t0Var = (rg.t0) obj;
                if (i10 == 1) {
                    t0Var.k3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        rg.p1 p1Var2 = (rg.p1) t0Var.getChildAt(i18);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.k3 = false;
                        t0Var.w0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(t0Var.l3);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tg.z0) obj).Y.getEditText());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        r0 = r0 - r1;
     */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        fl0 fl0Var;
        float f7;
        boolean z10;
        float y3;
        int measuredHeight;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                cc0 cc0Var = (cc0) this.b;
                org.telegram.ui.y8 y8Var = cc0Var.b;
                ub0 ub0Var = cc0Var.f;
                for (int i12 = 0; i12 < ub0Var.getChildCount(); i12++) {
                    View childAt = ub0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
                    }
                }
                tb0 tb0Var = cc0Var.e;
                if (tb0Var != null) {
                    tb0Var.x();
                    break;
                }
                break;
            case 1:
                ch0 ch0Var = (ch0) this.b;
                if (ch0Var.b.getChildCount() > 0) {
                    ch0.t(ch0Var);
                    break;
                }
                break;
            case 2:
                sk0 sk0Var = (sk0) this.b;
                ai.w0 w0Var = sk0Var.b;
                int[] iArr = sk0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    sk0.b(sk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    sk0.b(sk0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < w0Var.getChildCount() - 1; i14++) {
                    sk0.b(sk0Var, w0Var.getChildAt(i14), 1.0f);
                }
                sk0Var.invalidate();
                break;
            case 3:
                zl0 zl0Var = (zl0) this.b;
                Rect rect = zl0Var.G1;
                s4.s0 s0Var = zl0Var.a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (zl0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = zl0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    zl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                zl0Var.M0(false);
                if (i11 != 0 && (fl0Var = zl0Var.f1) != null) {
                    fl0Var.b();
                }
                jl0 jl0Var = zl0Var.U1;
                if (jl0Var != null) {
                    zl0Var.e1(jl0Var, 700, false);
                    break;
                }
                break;
            case 5:
                uv0.m((uv0) this.b);
                break;
            case 6:
                bw0 bw0Var = (bw0) this.b;
                if (recyclerView == bw0Var.G) {
                    bw0Var.R += i11;
                }
                if (bw0Var.P == null && bw0Var.Q == 0) {
                    bw0Var.B();
                    break;
                }
                break;
            case 7:
                ((bx0) this.b).X.V();
                break;
            case 8:
                ry0.M((ry0) this.b);
                break;
            case 9:
                ((o71) this.b).J();
                break;
            case 10:
                ((g91) this.b).invalidate();
                break;
            case 11:
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.b;
                if (!oVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(oVar.v)) {
                        oVar.e.d();
                    } else {
                        org.telegram.ui.web.i iVar = oVar.f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (oVar.a.K1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.b;
                if (h1Var.a.K1) {
                    AndroidUtilities.hideKeyboard(h1Var.fragmentView);
                    break;
                }
                break;
            case 13:
                rg.t0 t0Var = (rg.t0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                break;
            case 15:
                ((th.f) this.b).P();
                break;
            case 16:
                s4.c0 c0Var = (s4.c0) recyclerView.getLayoutManager();
                wh.n nVar = (wh.n) this.b;
                wh.e eVar = nVar.C;
                if (nVar.x && !nVar.w && c0Var != null) {
                    if (nVar.f.h() - c0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 17:
                xh.i4 i4Var = (xh.i4) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < i4Var.n.getChildCount()) {
                        if (i4Var.n.getChildAt(i15) instanceof w00) {
                            i4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.bi.r(i4Var.h.animate().alpha((i4Var.K && i4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), tr.h, 320L);
                break;
            case 18:
                ((xh.h4) this.b).Y();
                break;
            case 19:
                yh.g gVar = (yh.g) this.b;
                rg.s1 s1Var = gVar.n;
                if (!recyclerView.canScrollVertically(1)) {
                    gVar.removeCallbacks(s1Var);
                    gVar.post(s1Var);
                    break;
                }
                break;
            case 20:
                yh.t0 t0Var2 = (yh.t0) this.b;
                View view = t0Var2.q0;
                FrameLayout frameLayout = t0Var2.l0;
                zl0 zl0Var2 = t0Var2.d;
                boolean z12 = true;
                int childCount = zl0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt4 = zl0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt4);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (R == 1) {
                                f7 = childAt4.getY();
                            } else if (R == 0) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            }
                        }
                        childCount--;
                    } else {
                        f7 = 0.0f;
                        z10 = false;
                    }
                }
                z10 = true;
                float height = frameLayout.getHeight() + f7;
                if (z10 && height >= 0.0f) {
                    z12 = false;
                }
                if (t0Var2.v0 != z12) {
                    t0Var2.v0 = z12;
                    if (z12) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z12 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new fs0(14, t0Var2, z12)).start();
                }
                t0Var2.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                break;
            case 21:
                ((yh.y3) this.b).Y.e();
                break;
            case 22:
                yh.z7 z7Var = (yh.z7) this.b;
                le.b bVar = z7Var.V;
                if (!z7Var.c.canScrollVertically(-1)) {
                    kVar = ((org.telegram.ui.ActionBar.n2) z7Var).actionBar;
                    if (!kVar.s()) {
                        z11 = false;
                        bVar.a(z11, true);
                        break;
                    }
                }
                z11 = true;
                bVar.a(z11, true);
            case 23:
                yh.w7 w7Var = (yh.w7) this.b;
                e71 e71Var = w7Var.a;
                if (e71Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < e71Var.getChildCount(); i16++) {
                        if (!(e71Var.getChildAt(i16) instanceof w00)) {
                        }
                    }
                    break;
                }
                w7Var.h.run();
                break;
            case 24:
                ((zg.r) this.b).c(true);
                break;
        }
    }
}
