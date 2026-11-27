// default package

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e98 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e98(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        a aVar;
        byte b = this.a;
        cm8 cm8Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    hl.t1(((l98) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 2:
                ui8 ui8Var = (ui8) obj;
                oi8 oi8Var = ui8Var.l1;
                if (i == 0) {
                    int L = hl.L(13.0f);
                    int i2 = ui8Var.y1;
                    int i3 = ui8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && oi8Var.canScrollVertically(1) && (n69Var = (n69) oi8Var.L(0)) != null) {
                        View view = n69Var.a;
                        if (view.getTop() > hl.L(7.0f)) {
                            oi8Var.y0(0, view.getTop() - hl.L(7.0f), null);
                            break;
                        }
                    }
                }
                break;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                if (i == 0) {
                    aVar = ((e) premiumPreviewFragment).actionBar;
                    int L2 = hl.L(16.0f) + aVar.getBottom();
                    float f = premiumPreviewFragment.g0;
                    d79 d79Var = premiumPreviewFragment.a;
                    if (f > 0.5f) {
                        d79Var.y0(0, premiumPreviewFragment.d0 - L2, null);
                        break;
                    } else {
                        View m = d79Var.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m != null && m.getTop() < 0) {
                            premiumPreviewFragment.a.y0(0, m.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 4:
                rk8 rk8Var = (rk8) obj;
                if (i == 1) {
                    rk8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i4 = 0; i4 < recyclerView.getChildCount(); i4++) {
                        cm8 cm8Var2 = (cm8) rk8Var.getChildAt(i4);
                        if (cm8Var == null || cm8Var2.a > cm8Var.a) {
                            cm8Var = cm8Var2;
                        }
                    }
                    if (cm8Var != null) {
                        rk8Var.A1(cm8Var, true);
                        rk8Var.l3 = false;
                        rk8Var.y0(0, cm8Var.getTop() - ((rk8Var.getMeasuredHeight() - cm8Var.getMeasuredHeight()) / 2), hl.H);
                    }
                    rk8Var.B1();
                    break;
                } else {
                    hl.r(rk8Var.m3);
                    break;
                }
                break;
            case 7:
                if (i == 0) {
                    ((pz8) obj).w = false;
                    break;
                }
                break;
            case 9:
                d79 d79Var2 = (d79) obj;
                boolean z = d79Var2.u2;
                if (i == 0) {
                    if (z) {
                        d79Var2.u2 = false;
                        jn7.e().k(100, 512);
                    }
                } else if (!z && d79Var2.w1) {
                    d79Var2.u2 = true;
                    jn7.e().k(99, 512);
                }
                if (i != 0 && d79Var2.M1 != null) {
                    ct4 ct4Var = d79Var2.d1;
                    if (ct4Var != null) {
                        hl.r(ct4Var);
                        d79Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        d79Var2.L1.E(obtain);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    d79Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view2 = d79Var2.M1;
                    d79Var2.l1(view2, 0.0f, 0.0f, false);
                    d79Var2.M1 = null;
                    d79Var2.o1(view2, null);
                    d79Var2.O1 = false;
                }
                v79 v79Var = d79Var2.Z0;
                if (v79Var != null) {
                    v79Var.a(recyclerView, i);
                }
                boolean z2 = i == 1 || i == 2;
                d79Var2.J1 = z2;
                if (z2) {
                    d79Var2.K1 = true;
                    break;
                }
                break;
            case 13:
                if (i == 1) {
                    hl.t1(((ee9) obj).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 14:
                aw9 aw9Var = (aw9) obj;
                if (i == 1) {
                    hl.t1(aw9Var.G.getCurrentFocus());
                }
                aw9Var.a();
                break;
            case 15:
                if (i == 0) {
                    r1a r1aVar = (r1a) obj;
                    if (r1aVar.d2) {
                        r1aVar.d2 = false;
                        break;
                    }
                }
                break;
            case 18:
                if (i == 1) {
                    hl.t1(((t2a) obj).T1.getEditText());
                    break;
                }
                break;
            case 19:
                z3a z3aVar = (z3a) obj;
                if (i == 0) {
                    z3aVar.W = true;
                    z3aVar.invalidate();
                }
                if (i == 1) {
                    z3aVar.W = false;
                    lp lpVar = z3aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) lpVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) lpVar.c).cancel();
                        lpVar.c = null;
                    }
                    hl.t1(z3aVar);
                    break;
                }
                break;
            case 20:
                if (i == 0) {
                    tba tbaVar = (tba) obj;
                    if (tbaVar.F != null) {
                        sla slaVar = tbaVar.d;
                        if (slaVar == null || !slaVar.x()) {
                            float f2 = tbaVar.Y;
                            if (f2 > 0.0f && f2 < 1.0f) {
                                q9c q9cVar = tbaVar.c;
                                if (f2 >= 0.5f) {
                                    q9cVar.y0(0, (int) (-(tbaVar.a0 - tbaVar.Z)), k43.h);
                                    break;
                                } else {
                                    q9cVar.y0(0, (int) Math.ceil(tbaVar.Z - tbaVar.b0), k43.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        if (r10.z() != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    @Override // v79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lg5 lg5Var;
        tq3 tq3Var;
        k69 k69Var;
        float f;
        Object[] objArr;
        float y;
        int measuredHeight;
        jla jlaVar;
        byte b = this.a;
        boolean z = false;
        boolean z2 = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                l98 l98Var = (l98) obj;
                if (l98Var.K == null) {
                    int K0 = l98Var.N.K0();
                    int abs = K0 == -1 ? 0 : Math.abs(l98Var.N.M0() - K0) + 1;
                    if (abs > 0 && K0 + abs > l98Var.N.A() - 2 && !l98Var.r && !l98Var.s) {
                        l98Var.h0(l98Var.w, l98Var.x, l98Var.a, true);
                        break;
                    }
                }
                break;
            case 1:
                wh8 wh8Var = (wh8) obj;
                if (i2 != 0 && (lg5Var = wh8Var.h) != null) {
                    lg5Var.a();
                }
                zeb zebVar = wh8Var.R;
                if (zebVar != null && zebVar.s) {
                    xeb delegate = zebVar.getDelegate();
                    if (delegate instanceof zh8) {
                        qob qobVar = wh8Var.c;
                        View G = qobVar.G((zh8) delegate);
                        f89 U = G != null ? qobVar.U(G) : null;
                        if (U != null) {
                            View view = U.a;
                            int direction = wh8Var.R.getDirection();
                            zeb zebVar2 = wh8Var.R;
                            if (direction == 0) {
                                zebVar2.setTranslationY((view.getY() - hl.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zebVar2.setTranslationY(view.getY());
                            }
                            x46 x46Var = wh8Var.d;
                            if (!x46Var.c.p0(view) || !x46Var.d.p0(view)) {
                                wh8Var.R.e();
                                break;
                            }
                        } else {
                            wh8Var.R.e();
                            break;
                        }
                    } else {
                        wh8Var.R.e();
                        break;
                    }
                }
                break;
            case 2:
                ui8 ui8Var = (ui8) obj;
                if (ui8Var.l1.getChildCount() > 0) {
                    ui8Var.H0();
                    break;
                }
                break;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (tq3Var = premiumPreviewFragment.x0) != null) {
                    tq3Var.f(i, i2);
                    premiumPreviewFragment.m0();
                    break;
                }
                break;
            case 4:
                rk8 rk8Var = (rk8) obj;
                if (recyclerView.getScrollState() == 1) {
                    rk8Var.A1(null, true);
                }
                rk8Var.invalidate();
                break;
            case 5:
                ((PrivacyControlActivity) obj).P0();
                break;
            case 6:
                vn8 vn8Var = (vn8) obj;
                if (!vn8Var.getMessagesController().z0) {
                    int abs2 = Math.abs(vn8Var.b.M0() - vn8Var.b.K0()) + 1;
                    int b2 = recyclerView.getAdapter().b();
                    if (abs2 > 0 && vn8Var.b.M0() >= b2 - 10) {
                        vn8Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 7:
                pz8 pz8Var = (pz8) obj;
                if (!pz8Var.w) {
                    pz8Var.h.a(pz8Var.f(pz8Var.c()), true);
                    break;
                }
                break;
            case 8:
                i49 i49Var = (i49) obj;
                gu guVar = i49Var.b;
                int[] iArr = i49Var.g0;
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(iArr);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i3, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    if (childAt instanceof g49) {
                        ((g49) childAt).h = min;
                    } else {
                        childAt.setScaleX(min);
                        childAt.setScaleY(min);
                    }
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(iArr);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i3) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    if (childAt2 instanceof g49) {
                        ((g49) childAt2).h = min2;
                    } else {
                        childAt2.setScaleX(min2);
                        childAt2.setScaleY(min2);
                    }
                }
                for (int i4 = 1; i4 < guVar.getChildCount() - 1; i4++) {
                    View childAt3 = guVar.getChildAt(i4);
                    if (childAt3 instanceof g49) {
                        ((g49) childAt3).h = 1.0f;
                    } else {
                        childAt3.setScaleX(1.0f);
                        childAt3.setScaleY(1.0f);
                    }
                }
                i49Var.invalidate();
                break;
            case 9:
                d79 d79Var = (d79) obj;
                Rect rect = d79Var.F1;
                v79 v79Var = d79Var.Z0;
                if (v79Var != null) {
                    v79Var.b(recyclerView, i, i2);
                }
                if (d79Var.D1 != -1) {
                    rect.offset(-i, -i2);
                    hf0 hf0Var = d79Var.C1;
                    if (hf0Var != null) {
                        hf0Var.setBounds(rect);
                    }
                    d79Var.invalidate();
                } else {
                    rect.setEmpty();
                }
                d79Var.N0(false);
                if (i2 != 0 && (k69Var = d79Var.e1) != null) {
                    k69Var.c();
                }
                o69 o69Var = d79Var.T1;
                if (o69Var != null) {
                    d79Var.g1(o69Var, 700, false);
                    break;
                }
                break;
            case 10:
                mb9 mb9Var = (mb9) obj;
                mb9Var.e.invalidate();
                nb9 nb9Var = mb9Var.w;
                int i5 = nb9.v1;
                nb9Var.b.invalidate();
                break;
            case 11:
                nd9 nd9Var = (nd9) obj;
                if (nd9Var.a0()) {
                    nd9Var.e.o(false);
                    break;
                }
                break;
            case 12:
                ((md9) obj).Z0();
                break;
            case 15:
                r1a r1aVar = (r1a) obj;
                r1aVar.f1();
                if (r1aVar.n1.J1 && !r1aVar.d2) {
                    hl.t1(r1aVar.b);
                    break;
                }
                break;
            case 16:
                h2a h2aVar = (h2a) obj;
                if (h2aVar.a1()) {
                    h2aVar.T1.a();
                    break;
                }
                break;
            case 17:
                ((k2a) obj).Z0();
                break;
            case 19:
                z3a z3aVar = (z3a) obj;
                z3aVar.a();
                z3aVar.invalidate();
                break;
            case 20:
                tba tbaVar = (tba) obj;
                tbaVar.n0(false, true);
                tbaVar.o0();
                if (tbaVar.c.J1) {
                    hl.t1(tbaVar.fragmentView);
                    break;
                }
                break;
            case 21:
                ((dka) obj).F0();
                break;
            case 22:
                wka wkaVar = (wka) obj;
                if (recyclerView == wkaVar.H) {
                    wkaVar.S += i2;
                }
                if (wkaVar.Q == null && wkaVar.R == 0) {
                    wkaVar.C();
                    break;
                }
                break;
            case 23:
                ((wqa) obj).S1.W();
                break;
            case 24:
                gra graVar = (gra) obj;
                View view2 = graVar.l2;
                FrameLayout frameLayout = graVar.g2;
                d79 d79Var2 = graVar.n1;
                for (int childCount = d79Var2.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt4 = d79Var2.getChildAt(childCount);
                    int S = RecyclerView.S(childAt4);
                    if (S >= 0) {
                        if (S == 2) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        } else if (S == 1) {
                            f = childAt4.getY();
                            objArr = true;
                            float height = frameLayout.getHeight() + f;
                            if (objArr != false && height >= 0.0f) {
                                z2 = false;
                            }
                            if (graVar.q2 != z2) {
                                graVar.q2 = z2;
                                if (z2) {
                                    view2.setVisibility(0);
                                }
                                view2.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new q38((byte) 17, (Object) graVar, z2)).start();
                            }
                            graVar.E1 = f <= 0.0f ? 0 : hl.L(6.0f);
                            frameLayout.setVisibility(objArr == true ? 0 : 8);
                            frameLayout.setTranslationY(f);
                            break;
                        } else if (S == 0) {
                            y = childAt4.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        f = y - measuredHeight;
                        objArr = true;
                        float height2 = frameLayout.getHeight() + f;
                        if (objArr != false) {
                            z2 = false;
                        }
                        if (graVar.q2 != z2) {
                        }
                        graVar.E1 = f <= 0.0f ? 0 : hl.L(6.0f);
                        frameLayout.setVisibility(objArr == true ? 0 : 8);
                        frameLayout.setTranslationY(f);
                    }
                }
                f = 0.0f;
                objArr = false;
                float height22 = frameLayout.getHeight() + f;
                if (objArr != false) {
                }
                if (graVar.q2 != z2) {
                }
                graVar.E1 = f <= 0.0f ? 0 : hl.L(6.0f);
                frameLayout.setVisibility(objArr == true ? 0 : 8);
                frameLayout.setTranslationY(f);
            case 25:
                ((wua) obj).T1.h();
                break;
            case 26:
                nza nzaVar = (nza) obj;
                fm0 fm0Var = nzaVar.Y;
                if (!nzaVar.c.canScrollVertically(-1)) {
                    jlaVar = ((e) nzaVar).simpleActionBar;
                    break;
                }
                z = true;
                fm0Var.a(z, true);
                break;
            case 27:
                kza kzaVar = (kza) obj;
                q9c q9cVar = kzaVar.a;
                if (q9cVar.canScrollVertically(1)) {
                    for (int i6 = 0; i6 < q9cVar.getChildCount(); i6++) {
                        if (!(q9cVar.getChildAt(i6) instanceof tk4)) {
                        }
                    }
                    break;
                }
                kzaVar.h.run();
                break;
            case 28:
                w1b w1bVar = (w1b) obj;
                if (w1bVar.v0.size() != w1bVar.w0.size() && !w1bVar.A0 && w1bVar.U.M0() > w1bVar.X.d0 - 20) {
                    w1bVar.j0();
                    break;
                }
                break;
            case 29:
                ((s4b) obj).V0();
                break;
        }
    }

    private final void c(RecyclerView recyclerView, int i) {
    }
}
