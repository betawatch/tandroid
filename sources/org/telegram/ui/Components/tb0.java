package org.telegram.ui.Components;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tb0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        gl0 gl0Var;
        int i14 = this.a;
        rg.n1 n1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 2:
                ah0 ah0Var = (ah0) obj;
                ug0 ug0Var = ah0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = ah0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.f3) ah0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) ah0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && ug0Var.canScrollVertically(1)) {
                        ug0Var.getChildAt(0);
                        gl0 gl0Var2 = (gl0) ug0Var.L(0);
                        if (gl0Var2 != null) {
                            View view = gl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                ug0Var.w0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                wl0 wl0Var = (wl0) obj;
                if (i10 == 0) {
                    if (wl0Var.v2) {
                        wl0Var.v2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!wl0Var.v2 && wl0Var.x1) {
                    wl0Var.v2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && wl0Var.N1 != null) {
                    ol0 ol0Var = wl0Var.e1;
                    if (ol0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ol0Var);
                        wl0Var.e1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        wl0Var.M1.g0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    wl0Var.N1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = wl0Var.N1;
                    wl0Var.i1(view2, 0.0f, 0.0f, false);
                    wl0Var.N1 = null;
                    wl0Var.l1(null, view2);
                    wl0Var.P1 = false;
                }
                s4.s0 s0Var = wl0Var.a1;
                if (s0Var != null) {
                    s0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                wl0Var.K1 = z10;
                if (z10) {
                    wl0Var.L1 = true;
                    break;
                }
                break;
            case 5:
                jn0 jn0Var = (jn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(jn0Var.F.getCurrentFocus());
                }
                jn0Var.a();
                break;
            case 9:
                d71 d71Var = (d71) obj;
                ai.w0 w0Var = d71Var.d;
                if (i10 == 0 && d71Var.G) {
                    int i17 = d71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) d71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (gl0Var = (gl0) w0Var.L(0)) != null) {
                        View view3 = gl0Var.a;
                        if (view3.getTop() > 0) {
                            w0Var.w0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                rg.s0 s0Var2 = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var2.d3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        rg.n1 n1Var2 = (rg.n1) s0Var2.getChildAt(i18);
                        if (n1Var == null || n1Var2.a > n1Var.a) {
                            n1Var = n1Var2;
                        }
                    }
                    if (n1Var != null) {
                        s0Var2.x1(n1Var, true);
                        s0Var2.d3 = false;
                        s0Var2.w0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.y1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var2.e3);
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        r3 = r3 - r4;
     */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        dl0 dl0Var;
        float f7;
        boolean z10;
        float y3;
        int measuredHeight;
        switch (this.a) {
            case 0:
                yb0 yb0Var = (yb0) this.b;
                org.telegram.ui.x8 x8Var = yb0Var.b;
                qb0 qb0Var = yb0Var.f;
                for (int i12 = 0; i12 < qb0Var.getChildCount(); i12++) {
                    View childAt = qb0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(x8Var.getMeasuredWidth(), x8Var.getBackgroundSizeY());
                    }
                }
                pb0 pb0Var = yb0Var.e;
                if (pb0Var != null) {
                    pb0Var.x();
                    break;
                }
                break;
            case 1:
                fg0 fg0Var = (fg0) this.b;
                if (recyclerView == fg0Var.C0) {
                    fg0Var.D0 += i11;
                    break;
                }
                break;
            case 2:
                ah0 ah0Var = (ah0) this.b;
                if (ah0Var.b.getChildCount() > 0) {
                    ah0.t(ah0Var);
                    break;
                }
                break;
            case 3:
                qk0 qk0Var = (qk0) this.b;
                ai.w0 w0Var = qk0Var.b;
                int[] iArr = qk0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i13 = iArr[0];
                    View childAt2 = recyclerView.getChildAt(0);
                    childAt2.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i13, 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    qk0.b(qk0Var, childAt2, min);
                    View childAt3 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt3.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i13) - (childAt3.getWidth() + iArr[0]), 0.0f)) / childAt3.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    qk0.b(qk0Var, childAt3, min2);
                }
                for (int i14 = 1; i14 < w0Var.getChildCount() - 1; i14++) {
                    qk0.b(qk0Var, w0Var.getChildAt(i14), 1.0f);
                }
                qk0Var.invalidate();
                break;
            case 4:
                wl0 wl0Var = (wl0) this.b;
                Rect rect = wl0Var.G1;
                s4.s0 s0Var = wl0Var.a1;
                if (s0Var != null) {
                    s0Var.b(recyclerView, i10, i11);
                }
                if (wl0Var.E1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = wl0Var.D1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    wl0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                wl0Var.M0(false);
                if (i11 != 0 && (dl0Var = wl0Var.f1) != null) {
                    dl0Var.b();
                }
                hl0 hl0Var = wl0Var.U1;
                if (hl0Var != null) {
                    wl0Var.f1(hl0Var, 700, false);
                    break;
                }
                break;
            case 6:
                ov0.m((ov0) this.b);
                break;
            case 7:
                ((qw0) this.b).X.V();
                break;
            case 8:
                hy0.O((hy0) this.b);
                break;
            case 9:
                ((d71) this.b).L();
                break;
            case 10:
                ((w81) this.b).invalidate();
                break;
            case 11:
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) this.b;
                if (!pVar.a.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(pVar.v)) {
                        pVar.e.d();
                    } else {
                        org.telegram.ui.web.i iVar = pVar.f;
                        if (iVar != null) {
                            iVar.d();
                        }
                    }
                }
                if (pVar.a.K1) {
                    AndroidUtilities.hideKeyboard(pVar.fragmentView);
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
                rg.s0 s0Var2 = (rg.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.x1(null, true);
                }
                s0Var2.invalidate();
                break;
            case 15:
                ((th.f) this.b).R();
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
                        if (i4Var.n.getChildAt(i15) instanceof t00) {
                            i4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.wh.r(i4Var.h.animate().alpha((i4Var.K && i4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), qr.h, 320L);
                break;
            case 18:
                ((xh.h4) this.b).Z();
                break;
            case 19:
                yh.g gVar = (yh.g) this.b;
                if (gVar.a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < gVar.e.getChildCount(); i16++) {
                            if (!(gVar.e.getChildAt(i16) instanceof t00)) {
                            }
                        }
                        break;
                    }
                    yh.g.e0(gVar);
                    break;
                }
                break;
            case 20:
                yh.s0 s0Var3 = (yh.s0) this.b;
                ah.i iVar2 = s0Var3.s0;
                View view = s0Var3.q0;
                FrameLayout frameLayout = s0Var3.l0;
                wl0 wl0Var2 = s0Var3.d;
                int childCount = wl0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt4 = wl0Var2.getChildAt(childCount);
                        int S = RecyclerView.S(childAt4);
                        if (S >= 0) {
                            if (S == 2) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (S == 1) {
                                f7 = childAt4.getY();
                            } else if (S == 0) {
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
                boolean z11 = !z10 || ((float) frameLayout.getHeight()) + f7 < 0.0f;
                if (s0Var3.x0 != z11) {
                    s0Var3.x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new es0(13, s0Var3, z11)).start();
                }
                s0Var3.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && iVar2 != null) {
                    iVar2.f(i10, i11);
                    if (i17 >= 31 && iVar2 != null) {
                        s0Var3.Q(1);
                        break;
                    }
                }
                break;
            case 21:
                ((yh.y3) this.b).Y.e();
                break;
            case 22:
                yh.s7 s7Var = (yh.s7) this.b;
                t61 t61Var = s7Var.a;
                if (t61Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < t61Var.getChildCount(); i18++) {
                        if (!(t61Var.getChildAt(i18) instanceof t00)) {
                        }
                    }
                    break;
                }
                s7Var.h.run();
                break;
            case 23:
                ((zg.t) this.b).c(true);
                break;
        }
    }
}
