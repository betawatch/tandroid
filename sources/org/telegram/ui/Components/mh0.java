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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mh0 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.t0
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        int i12;
        int i13;
        am0 am0Var;
        int i14 = this.a;
        rg.o1 o1Var = null;
        Object obj = this.b;
        switch (i14) {
            case 0:
                sh0 sh0Var = (sh0) obj;
                lh0 lh0Var = sh0Var.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    int i15 = sh0Var.E;
                    i11 = ((org.telegram.ui.ActionBar.f3) sh0Var).backgroundPaddingTop;
                    int i16 = (i15 - i11) - dp;
                    i12 = ((org.telegram.ui.ActionBar.f3) sh0Var).backgroundPaddingTop;
                    if (i12 + i16 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && lh0Var.canScrollVertically(1)) {
                        lh0Var.getChildAt(0);
                        am0 am0Var2 = (am0) lh0Var.K(0);
                        if (am0Var2 != null) {
                            View view = am0Var2.a;
                            if (view.getTop() > AndroidUtilities.dp(7.0f)) {
                                lh0Var.v0(0, view.getTop() - AndroidUtilities.dp(7.0f), null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                qm0 qm0Var = (qm0) obj;
                if (i10 == 0) {
                    if (qm0Var.t2) {
                        qm0Var.t2 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    }
                } else if (!qm0Var.t2 && qm0Var.v1) {
                    qm0Var.t2 = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                if (i10 != 0 && qm0Var.L1 != null) {
                    im0 im0Var = qm0Var.c1;
                    if (im0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(im0Var);
                        qm0Var.c1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        qm0Var.K1.T0(obtain);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    qm0Var.L1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = qm0Var.L1;
                    qm0Var.h1(view2, 0.0f, 0.0f, false);
                    qm0Var.L1 = null;
                    qm0Var.k1(null, view2);
                    qm0Var.N1 = false;
                }
                s4.t0 t0Var = qm0Var.Y0;
                if (t0Var != null) {
                    t0Var.a(recyclerView, i10);
                }
                boolean z10 = i10 == 1 || i10 == 2;
                qm0Var.I1 = z10;
                if (z10) {
                    qm0Var.J1 = true;
                    break;
                }
                break;
            case 3:
                bo0 bo0Var = (bo0) obj;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(bo0Var.F.getCurrentFocus());
                }
                bo0Var.a();
                break;
            case 7:
                t71 t71Var = (t71) obj;
                ai.w0 w0Var = t71Var.d;
                if (i10 == 0 && t71Var.G) {
                    int i17 = t71Var.y;
                    i13 = ((org.telegram.ui.ActionBar.f3) t71Var).backgroundPaddingTop;
                    if (AndroidUtilities.dp(13.0f) + i13 + i17 < AndroidUtilities.statusBarHeight * 2 && w0Var.canScrollVertically(1) && (am0Var = (am0) w0Var.K(0)) != null) {
                        View view3 = am0Var.a;
                        if (view3.getTop() > 0) {
                            w0Var.v0(0, view3.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                rg.s0 s0Var = (rg.s0) obj;
                if (i10 == 1) {
                    s0Var.b3 = true;
                }
                if (i10 == 0) {
                    for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                        rg.o1 o1Var2 = (rg.o1) s0Var.getChildAt(i18);
                        if (o1Var == null || o1Var2.a > o1Var.a) {
                            o1Var = o1Var2;
                        }
                    }
                    if (o1Var != null) {
                        s0Var.x1(o1Var, true);
                        s0Var.b3 = false;
                        s0Var.v0(0, o1Var.getTop() - ((s0Var.getMeasuredHeight() - o1Var.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                    }
                    s0Var.y1();
                    break;
                } else {
                    AndroidUtilities.cancelRunOnUIThread(s0Var.c3);
                    break;
                }
                break;
            case 15:
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
    @Override // s4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        xl0 xl0Var;
        org.telegram.ui.Wallet.v4 v4Var;
        boolean z10;
        float f7;
        float y3;
        int measuredHeight;
        switch (this.a) {
            case 0:
                sh0 sh0Var = (sh0) this.b;
                if (sh0Var.b.getChildCount() > 0) {
                    sh0.v(sh0Var);
                    break;
                }
                break;
            case 1:
                kl0 kl0Var = (kl0) this.b;
                ai.w0 w0Var = kl0Var.b;
                int[] iArr = kl0Var.f0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i12 = iArr[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i12, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    kl0.b(kl0Var, childAt, min);
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i12) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    kl0.b(kl0Var, childAt2, min2);
                }
                for (int i13 = 1; i13 < w0Var.getChildCount() - 1; i13++) {
                    kl0.b(kl0Var, w0Var.getChildAt(i13), 1.0f);
                }
                kl0Var.invalidate();
                break;
            case 2:
                qm0 qm0Var = (qm0) this.b;
                Rect rect = qm0Var.E1;
                s4.t0 t0Var = qm0Var.Y0;
                if (t0Var != null) {
                    t0Var.b(recyclerView, i10, i11);
                }
                if (qm0Var.C1 != -1) {
                    rect.offset(-i10, -i11);
                    org.telegram.ui.Cells.z zVar = qm0Var.B1;
                    if (zVar != null) {
                        zVar.setBounds(rect);
                    }
                    qm0Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                qm0Var.L0(false);
                if (i11 != 0 && (xl0Var = qm0Var.d1) != null) {
                    xl0Var.b();
                }
                bm0 bm0Var = qm0Var.S1;
                if (bm0Var != null) {
                    qm0Var.e1(bm0Var, 700, false);
                    break;
                }
                break;
            case 4:
                fw0.o((fw0) this.b);
                break;
            case 5:
                ((hx0) this.b).X.V();
                break;
            case 6:
                xy0.P((xy0) this.b);
                break;
            case 7:
                ((t71) this.b).M();
                break;
            case 8:
                ((n91) this.b).invalidate();
                break;
            case 9:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.b;
                if (i11 != 0 && recyclerView.getScrollState() == 1 && (v4Var = a5Var.o0) != null && v4Var.f) {
                    v4Var.d = true;
                }
                a5Var.C0();
                break;
            case 10:
                int[] iArr2 = (int[]) this.b;
                iArr2[0] = iArr2[0] + i11;
                break;
            case 11:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.b;
                if (s8Var.a.I1) {
                    AndroidUtilities.hideKeyboard(s8Var.M);
                    break;
                }
                break;
            case 12:
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
            case 13:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                if (g1Var.a.I1) {
                    AndroidUtilities.hideKeyboard(g1Var.fragmentView);
                    break;
                }
                break;
            case 14:
                rg.s0 s0Var = (rg.s0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    s0Var.x1(null, true);
                }
                s0Var.invalidate();
                break;
            case 16:
                ((th.f) this.b).S();
                break;
            case 17:
                s4.d0 d0Var = (s4.d0) recyclerView.getLayoutManager();
                wh.l lVar = (wh.l) this.b;
                wh.e eVar = lVar.C;
                if (lVar.x && !lVar.w && d0Var != null) {
                    if (lVar.f.h() - d0Var.N0() < 10) {
                        AndroidUtilities.cancelRunOnUIThread(eVar);
                        AndroidUtilities.runOnUIThread(eVar);
                        break;
                    }
                }
                break;
            case 18:
                xh.i4 i4Var = (xh.i4) this.b;
                int i14 = 0;
                while (true) {
                    if (i14 < i4Var.n.getChildCount()) {
                        if (i4Var.n.getChildAt(i14) instanceof j10) {
                            i4Var.d.g(false);
                        } else {
                            i14++;
                        }
                    }
                }
                org.telegram.messenger.bi.t(i4Var.h.animate().alpha((i4Var.K && i4Var.n.canScrollVertically(-1)) ? 1.0f : 0.0f), hs.h, 320L);
                break;
            case 19:
                ((xh.h4) this.b).a0();
                break;
            case 20:
                yh.g gVar = (yh.g) this.b;
                if (gVar.a == 1) {
                    if (gVar.e.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < gVar.e.getChildCount(); i15++) {
                            if (!(gVar.e.getChildAt(i15) instanceof j10)) {
                            }
                        }
                        break;
                    }
                    yh.g.e0(gVar);
                    break;
                }
                break;
            case 21:
                yh.r0 r0Var = (yh.r0) this.b;
                ah.h hVar = r0Var.s0;
                View view = r0Var.q0;
                FrameLayout frameLayout = r0Var.l0;
                qm0 qm0Var2 = r0Var.d;
                int childCount = qm0Var2.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt3 = qm0Var2.getChildAt(childCount);
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
                        z10 = false;
                        f7 = 0.0f;
                    }
                }
                z10 = true;
                boolean z11 = !z10 || ((float) frameLayout.getHeight()) + f7 < 0.0f;
                if (r0Var.x0 != z11) {
                    r0Var.x0 = z11;
                    if (z11) {
                        view.setVisibility(0);
                    }
                    view.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new ds0(16, r0Var, z11)).start();
                }
                r0Var.K = f7 <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
                frameLayout.setVisibility(z10 ? 0 : 8);
                frameLayout.setTranslationY(f7);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 31 && hVar != null) {
                    hVar.f(i10, i11);
                    if (i16 >= 31 && hVar != null) {
                        r0Var.R(1);
                        break;
                    }
                }
                break;
            case 22:
                ((yh.s3) this.b).Y.e();
                break;
            case 23:
                yh.m7 m7Var = (yh.m7) this.b;
                k71 k71Var = m7Var.a;
                if (k71Var.canScrollVertically(1)) {
                    for (int i17 = 0; i17 < k71Var.getChildCount(); i17++) {
                        if (!(k71Var.getChildAt(i17) instanceof j10)) {
                        }
                    }
                    break;
                }
                m7Var.h.run();
                break;
            case 24:
                ((zg.t) this.b).c(true);
                break;
        }
    }
}
