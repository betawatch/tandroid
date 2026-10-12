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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kc0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        wl0 wl0Var;
        int i14 = this.a;
        sg.p1 p1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 1:
                qh0 qh0Var = (qh0) obj;
                kh0 kh0Var = qh0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = qh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.e3) qh0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) qh0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && kh0Var.canScrollVertically(1)) {
                        kh0Var.getChildAt(0);
                        wl0 wl0Var2 = (wl0) kh0Var.K(0);
                        if (wl0Var2 != null) {
                            View view = wl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                kh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
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
                        mm0Var.K1.Y0(obtain);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    mm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = mm0Var.L1;
                    mm0Var.h1(view2, 0.0f, 0.0f, false);
                    mm0Var.L1 = null;
                    mm0Var.k1(null, view2);
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
            case 4:
                yn0 yn0Var = (yn0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(yn0Var.F.getCurrentFocus());
                }
                yn0Var.a();
                break;
            case 8:
                q71 q71Var = (q71) obj;
                bi.o0 o0Var = q71Var.d;
                if (i10 == 0 && q71Var.G) {
                    int i17 = q71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.e3) q71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && o0Var.canScrollVertically(1) && (wl0Var = (wl0) o0Var.K(0)) != null) {
                        View view3 = wl0Var.a;
                        if (view3.getTop() > 0) {
                            o0Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 15:
                sg.t0 t0Var = (sg.t0) obj;
                if (i10 == 1) {
                    t0Var.b3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        sg.p1 p1Var2 = (sg.p1) t0Var.getChildAt(i18);
                        if (p1Var == null || p1Var2.a > p1Var.a) {
                            p1Var = p1Var2;
                        }
                    }
                    if (p1Var != null) {
                        t0Var.x1(p1Var, true);
                        t0Var.b3 = false;
                        t0Var.v0(0, p1Var.getTop() - ((t0Var.getMeasuredHeight() - p1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    t0Var.y1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(t0Var.c3);
                    break;
                }
                break;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ug.z0) obj).Y.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        tl0 tl0Var;
        org.telegram.ui.Wallet.v4 v4Var;
        boolean z10;
        float f7;
        float y3;
        int measuredHeight;
        switch (this.a) {
            case 0:
                pc0 pc0Var = (pc0) this.b;
                org.telegram.ui.z8 z8Var = pc0Var.b;
                hc0 hc0Var = pc0Var.f;
                for (int i12 = 0; i12 < hc0Var.getChildCount(); i12++) {
                    View childAt = hc0Var.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        ((org.telegram.ui.Cells.u1) childAt).Z3(z8Var.getMeasuredWidth(), z8Var.getBackgroundSizeY());
                    }
                }
                gc0 gc0Var = pc0Var.e;
                if (gc0Var != null) {
                    gc0Var.w();
                    break;
                }
                break;
            case 1:
                qh0 qh0Var = (qh0) this.b;
                if (qh0Var.b.getChildCount() > 0) {
                    qh0.v(qh0Var);
                    break;
                }
                break;
            case 2:
                gl0 gl0Var = (gl0) this.b;
                bi.o0 o0Var = gl0Var.b;
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
                for (int i14 = 1; i14 < o0Var.getChildCount() - 1; i14++) {
                    gl0.b(gl0Var, o0Var.getChildAt(i14), 1.0f);
                }
                gl0Var.invalidate();
                break;
            case 3:
                mm0 mm0Var = (mm0) this.b;
                Rect rect = mm0Var.E1;
                s4.r0 r0Var = mm0Var.Y0;
                if (r0Var != null) {
                    r0Var.b(recyclerView, i10, i11);
                }
                if (mm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = mm0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
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
                    mm0Var.e1(xl0Var, 700, false);
                    break;
                }
                break;
            case 5:
                bw0.n((bw0) this.b);
                break;
            case 6:
                ((dx0) this.b).X.V();
                break;
            case 7:
                ty0.P((ty0) this.b);
                break;
            case 8:
                ((q71) this.b).M();
                break;
            case 9:
                ((j91) this.b).invalidate();
                break;
            case 10:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (v4Var = z4Var.o0) != null && v4Var.f) {
                    v4Var.d = true;
                }
                z4Var.C0();
                break;
            case 11:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i11;
                break;
            case 12:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) this.b;
                if (r8Var.a.I1) {
                    AndroidUtilities.hideKeyboard(r8Var.M);
                    break;
                }
                break;
            case 13:
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
                if (oVar.a.I1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                if (g1Var.a.I1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    break;
                }
                break;
            case 15:
                sg.t0 t0Var = (sg.t0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    t0Var.x1(null, true);
                }
                t0Var.invalidate();
                break;
            case 17:
                ((uh.f) this.b).S();
                break;
            case 18:
                s4.b0 b0Var = (s4.b0) recyclerView.getLayoutManager();
                xh.l lVar = (xh.l) this.b;
                xh.e eVar = lVar.C;
                if (lVar.x && !lVar.w && b0Var != null) {
                    if (lVar.f.h() - b0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 19:
                yh.g4 g4Var = (yh.g4) this.b;
                int i15 = 0;
                while (true) {
                    if (i15 < g4Var.n.getChildCount()) {
                        if (g4Var.n.getChildAt(i15) instanceof f10) {
                            g4Var.d.g(false);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.yh.s(g4Var.h.animate().alpha((g4Var.K && g4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), es.h, 320L);
                break;
            case 20:
                ((yh.f4) this.b).a0();
                break;
            case 21:
                zh.g gVar = (zh.g) this.b;
                if (gVar.a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < gVar.e.getChildCount(); i16++) {
                            if (!(gVar.e.getChildAt(i16) instanceof f10)) {
                            }
                        }
                        break;
                    }
                    zh.g.e0(gVar);
                    break;
                }
                break;
            case 22:
                zh.r0 r0Var2 = (zh.r0) this.b;
                bh.f fVar = r0Var2.s0;
                View view = r0Var2.q0;
                FrameLayout frameLayout = r0Var2.l0;
                mm0 mm0Var2 = r0Var2.d;
                int childCount = mm0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt4 = mm0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt4);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            } else if (R == 1) {
                                f7 = childAt4.getY();
                            } else if (R == 0) {
                                y3 = childAt4.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                            }
                        }
                        childCount--;
                    } else {
                        z10 = false;
                        f7 = 0.0f;
                    }
                }
                f7 = y3 - measuredHeight;
                z10 = true;
                boolean z11 = !z10 || ((float) frameLayout.getHeight()) + f7 < 0.0f;
                if (r0Var2.x0 != z11) {
                    r0Var2.x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new sn0(17, r0Var2, z11)).start();
                }
                r0Var2.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && fVar != null) {
                    fVar.f(i10, i11);
                    if (i17 >= 31 && fVar != null) {
                        r0Var2.R(1);
                        break;
                    }
                }
                break;
            case 23:
                ((zh.r3) this.b).Y.e();
                break;
            case 24:
                zh.m7 m7Var = (zh.m7) this.b;
                h71 h71Var = m7Var.a;
                if (h71Var.canScrollVertically(1)) {
                    for (int i18 = 0; i18 < h71Var.getChildCount(); i18++) {
                        if (!(h71Var.getChildAt(i18) instanceof f10)) {
                        }
                    }
                    break;
                }
                m7Var.h.run();
                break;
        }
    }
}
