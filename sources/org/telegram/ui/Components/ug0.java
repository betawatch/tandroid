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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ug0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ug0(Object obj, int i10) {
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
            case 0:
                ah0 ah0Var = (ah0) obj;
                tg0 tg0Var = ah0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = ah0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.e3) ah0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.e3) ah0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && tg0Var.canScrollVertically(1)) {
                        tg0Var.getChildAt(0);
                        gl0 gl0Var2 = (gl0) tg0Var.K(0);
                        if (gl0Var2 != null) {
                            View view = gl0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                tg0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
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
                    wl0Var.h1(view2, 0.0f, 0.0f, false);
                    wl0Var.N1 = null;
                    wl0Var.k1(null, view2);
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
            case 3:
                in0 in0Var = (in0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(in0Var.F.getCurrentFocus());
                }
                in0Var.a();
                break;
            case 7:
                b71 b71Var = (b71) obj;
                ai.w0 w0Var = b71Var.d;
                if (i10 == 0 && b71Var.G) {
                    int i17 = b71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.e3) b71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (gl0Var = (gl0) w0Var.K(0)) != null) {
                        View view3 = gl0Var.a;
                        if (view3.getTop() > 0) {
                            w0Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 11:
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
                        s0Var2.w1(n1Var, true);
                        s0Var2.d3 = false;
                        s0Var2.v0(0, n1Var.getTop() - ((s0Var2.getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var2.x1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var2.e3);
                    break;
                }
                break;
            case 12:
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
                ah0 ah0Var = (ah0) this.b;
                if (ah0Var.b.getChildCount() > 0) {
                    ah0.t(ah0Var);
                    break;
                }
                break;
            case 1:
                qk0 qk0Var = (qk0) this.b;
                ai.w0 w0Var = qk0Var.b;
                int[] iArr = qk0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    qk0.b(qk0Var, childAt, min);
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    qk0.b(qk0Var, childAt2, min2);
                }
                for (int i13 = 1; i13 < w0Var.getChildCount() - 1; i13++) {
                    qk0.b(qk0Var, w0Var.getChildAt(i13), 1.0f);
                }
                qk0Var.invalidate();
                break;
            case 2:
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
                wl0Var.L0(false);
                if (i11 != 0 && (dl0Var = wl0Var.f1) != null) {
                    dl0Var.b();
                }
                hl0 hl0Var = wl0Var.U1;
                if (hl0Var != null) {
                    wl0Var.e1(hl0Var, 700, false);
                    break;
                }
                break;
            case 4:
                nv0.m((nv0) this.b);
                break;
            case 5:
                ((pw0) this.b).X.V();
                break;
            case 6:
                fy0.O((fy0) this.b);
                break;
            case 7:
                ((b71) this.b).L();
                break;
            case 8:
                ((v81) this.b).invalidate();
                break;
            case 9:
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
                if (oVar.a.K1) {
                    AndroidUtilities.hideKeyboard(oVar.fragmentView);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                if (g1Var.a.K1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    break;
                }
                break;
            case 11:
                rg.s0 s0Var2 = (rg.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var2.w1(null, true);
                }
                s0Var2.invalidate();
                break;
            case 13:
                ((th.f) this.b).R();
                break;
            case 14:
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
            case 15:
                xh.i4 i4Var = (xh.i4) this.b;
                int i14 = 0;
                while (true) {
                    if (i14 < i4Var.n.getChildCount()) {
                        if (i4Var.n.getChildAt(i14) instanceof u00) {
                            i4Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                org.telegram.messenger.ok.s(i4Var.h.animate().alpha((i4Var.K && i4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), rr.h, 320L);
                break;
            case 16:
                ((xh.h4) this.b).Z();
                break;
            case 17:
                yh.g gVar = (yh.g) this.b;
                if (gVar.a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < gVar.e.getChildCount(); i15++) {
                            if (!(gVar.e.getChildAt(i15) instanceof u00)) {
                            }
                        }
                        break;
                    }
                    yh.g.e0(gVar);
                    break;
                }
                break;
            case 18:
                yh.s0 s0Var3 = (yh.s0) this.b;
                ah.h hVar = s0Var3.s0;
                View view = s0Var3.q0;
                FrameLayout frameLayout = s0Var3.l0;
                wl0 wl0Var2 = s0Var3.d;
                int childCount = wl0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt3 = wl0Var2.getChildAt(childCount);
                        int R = RecyclerView.R(childAt3);
                        if (R >= 0) {
                            if (R == 2) {
                                y3 = childAt3.getY();
                                measuredHeight = frameLayout.getMeasuredHeight();
                                break;
                            } else if (R == 1) {
                                f7 = childAt3.getY();
                            } else if (R == 0) {
                                y3 = childAt3.getY();
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
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new yr0(14, s0Var3, z11)).start();
                }
                s0Var3.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && hVar != null) {
                    hVar.f(i10, i11);
                    if (i16 >= 31 && hVar != null) {
                        s0Var3.Q(1);
                        break;
                    }
                }
                break;
            case 19:
                ((yh.x3) this.b).Y.e();
                break;
            case 20:
                yh.t7 t7Var = (yh.t7) this.b;
                r61 r61Var = t7Var.a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < r61Var.getChildCount(); i17++) {
                        if (!(r61Var.getChildAt(i17) instanceof u00)) {
                        }
                    }
                    break;
                }
                t7Var.h.run();
                break;
            case 21:
                ((zg.t) this.b).c(true);
                break;
        }
    }
}
