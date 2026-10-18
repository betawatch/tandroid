package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k3 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((o3) this.b).K.O0.V();
                    break;
                }
                break;
            case 4:
                xb xbVar = (xb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        xbVar.S = false;
                        xbVar.V = false;
                        xbVar.T0(true);
                        break;
                    }
                } else {
                    xbVar.S = true;
                    xbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sn) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                a20 a20Var = (a20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (a20Var.v <= 0.5f) {
                        View m11 = a20Var.c.getLayoutManager() != null ? a20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            a20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        a20Var.c.v0(0, a20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                b60 b60Var = (b60) this.b;
                if (i10 == 0) {
                    float f7 = b60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) b60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = b60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            b60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = b60Var.M.getLayoutManager() != null ? b60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            b60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                n60 n60Var = (n60) this.b;
                if (i10 == 1) {
                    n60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(n60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u60) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                t70 t70Var = (t70) this.b;
                if (i10 == 1) {
                    t70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(t70Var.d.d);
                    break;
                }
                break;
            case 17:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 18:
                if (i10 == 1) {
                    pc0 pc0Var = (pc0) this.b;
                    if (pc0Var.r0 && pc0Var.s0) {
                        AndroidUtilities.hideKeyboard(pc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dj0) this.b).Y.getEditText());
                    break;
                }
                break;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m13 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m13 != null && m13.getTop() < 0) {
                            premiumPreviewFragment.a.v0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.v0(0, premiumPreviewFragment.c0 - dp2, null);
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t21) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((mc1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        j00 j00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        bh.f fVar;
        bh.f fVar2;
        org.telegram.ui.Components.r40 r40Var;
        bh.f fVar3;
        ViewGroup viewGroup;
        bh.f fVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                o3 o3Var = (o3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    o3Var.K.O0.G();
                    l4 l4Var = o3Var.K;
                    x3 x3Var = l4Var.K;
                    if (x3Var != null) {
                        x3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    o3Var.K.f0();
                    l4 l4Var2 = o3Var.K;
                    x3 x3Var2 = l4Var2.K;
                    if (x3Var2 == null || x3Var2.F) {
                        l4Var2.X(l4Var2.I0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                p pVar = (p) obj;
                if (!pVar.I && !pVar.r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.i0.w.I1) {
                    AndroidUtilities.hideKeyboard(l4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((k8) obj).p0();
                break;
            case 4:
                xb xbVar = (xb) obj;
                xbVar.v.invalidate();
                if (i11 != 0 && xbVar.S && !xbVar.Q && xbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = xbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    xbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    xbVar.R.playTogether(ObjectAnimator.ofFloat(xbVar.M, "alpha", 1.0f));
                    xbVar.R.addListener(new m.a(this, 19));
                    xbVar.R.start();
                }
                xbVar.O0(true);
                xbVar.c1();
                break;
            case 9:
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.va vaVar = xuVar.s;
                if (vaVar != null) {
                    xuVar.w = !vaVar.Z();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                p00 p00Var = (p00) obj;
                if (p00Var.a.I1 && (j00Var = p00Var.K) != null && (d3Var = j00Var.b) != null) {
                    if (!d3Var.e) {
                        d3Var.d();
                        break;
                    } else {
                        d3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((a20) obj).s.invalidate();
                break;
            case 12:
                b60 b60Var = (b60) obj;
                if (b60Var.z0 == null) {
                    b60Var.z0 = (vc) b60Var.y0(b60Var.Z);
                }
                int measuredHeight = b60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) b60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = b60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                b60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(b60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                b60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                b60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                b60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (b60Var.A0 < 1.0f) {
                    b60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    b60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                n60 n60Var = (n60) obj;
                int L0 = n60Var.r.L0();
                View childAt = n60Var.n.getChildAt(0);
                n60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < n60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = n60Var.p0) != null) {
                    fVar.f(i10, i11);
                    n60Var.e0();
                    break;
                }
                break;
            case 16:
                t70 t70Var = (t70) obj;
                t70Var.n.L0();
                View childAt2 = t70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = t70Var.L) != null) {
                    fVar2.f(i10, i11);
                    t70Var.Y();
                    break;
                }
                break;
            case 19:
                ((oi0) obj).K.invalidate();
                break;
            case 20:
                wi0 wi0Var = (wi0) obj;
                int L02 = wi0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(wi0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !wi0Var.V && !wi0Var.E && !wi0Var.x.isEmpty() && L02 + abs >= h - 5 && wi0Var.y) {
                    wi0Var.b0();
                    break;
                }
                break;
            case 23:
                hv0 hv0Var = (hv0) obj;
                if (i11 != 0 && (r40Var = hv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
                if (gz0Var != null && gz0Var.s) {
                    org.telegram.ui.Components.ez0 delegate = gz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        hv0Var.Q.f();
                        break;
                    } else {
                        ua1 ua1Var = hv0Var.c;
                        View F = ua1Var.F((org.telegram.ui.Cells.c6) delegate);
                        s4.b1 T = F == null ? null : ua1Var.T(F);
                        if (T == null) {
                            hv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (hv0Var.Q.getDirection() == 0) {
                                hv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                hv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = hv0Var.d;
                            if (!b0Var.c.X(view) || !b0Var.d.X(view)) {
                                hv0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(mx0Var.b.N0() - mx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && mx0Var.b.N0() >= h10 - 10) {
                        mx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                p21 p21Var = (p21) obj;
                p21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) p21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                z71 z71Var = (z71) obj;
                z71Var.o0(false, true);
                if (z71Var.c.I1) {
                    AndroidUtilities.hideKeyboard(z71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = z71Var.V) != null) {
                    fVar4.f(i10, i11);
                    z71Var.i0();
                    break;
                }
                break;
            case 29:
                mc1 mc1Var = (mc1) obj;
                mc1Var.u0.f1();
                mc1Var.r0 = true;
                break;
        }
    }

    public k3(xb xbVar) {
        this.a = 4;
        this.b = xbVar;
        AndroidUtilities.dp(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i10) {
    }

    private final void d(RecyclerView recyclerView, int i10) {
    }

    private final void e(RecyclerView recyclerView, int i10, int i11) {
    }

    private final void f(RecyclerView recyclerView, int i10, int i11) {
    }
}
