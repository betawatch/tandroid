package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l3 extends f2.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i9 == 0) {
                    ((p3) this.b).G.K0.W();
                    break;
                }
                break;
            case 4:
                pb pbVar = (pb) this.b;
                if (i9 != 1) {
                    if (i9 == 0) {
                        pbVar.S = false;
                        pbVar.V = false;
                        pbVar.T0(true);
                        break;
                    }
                } else {
                    pbVar.S = true;
                    pbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((qn) this.b).T0);
                    break;
                }
                break;
            case 6:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((bq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((jr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                x10 x10Var = (x10) this.b;
                if (i9 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (x10Var.v <= 0.5f) {
                        View m11 = x10Var.c.getLayoutManager() != null ? x10Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            x10Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        x10Var.c.v0(0, x10Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                y50 y50Var = (y50) this.b;
                if (i9 == 0) {
                    float f10 = y50Var.w0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.z0 layoutManager = y50Var.I.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            y50Var.I.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m12 = y50Var.I.getLayoutManager() != null ? y50Var.I.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            y50Var.I.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                k60 k60Var = (k60) this.b;
                if (i9 == 1) {
                    k60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(k60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((r60) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((z60) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                q70 q70Var = (q70) this.b;
                if (i9 == 1) {
                    q70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(q70Var.d.d);
                    break;
                }
                break;
            case 17:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 18:
                if (i9 == 1) {
                    pc0 pc0Var = (pc0) this.b;
                    if (pc0Var.n0 && pc0Var.o0) {
                        AndroidUtilities.hideKeyboard(pc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((bj0) this.b).U.getEditText());
                    break;
                }
                break;
            case 22:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i9 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.b0 <= 0.5f) {
                        View m13 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m13 != null && m13.getTop() < 0) {
                            premiumPreviewFragment.a.v0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.v0(0, premiumPreviewFragment.Y - dp2, null);
                        break;
                    }
                }
                break;
            case 28:
                if (i9 == 1) {
                    AndroidUtilities.hideKeyboard(((b31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.d1
    public void b(RecyclerView recyclerView, int i9, int i10) {
        h00 h00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        ig.e eVar;
        ig.e eVar2;
        org.telegram.ui.Components.s30 s30Var;
        ig.e eVar3;
        ViewGroup viewGroup;
        ig.e eVar4;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                p3 p3Var = (p3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    p3Var.G.K0.H();
                    l4 l4Var = p3Var.G;
                    y3 y3Var = l4Var.G;
                    if (y3Var != null) {
                        y3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.b0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    p3Var.G.f0();
                    l4 l4Var2 = p3Var.G;
                    y3 y3Var2 = l4Var2.G;
                    if (y3Var2 == null || y3Var2.B) {
                        l4Var2.X(l4Var2.E0 - i10);
                        break;
                    }
                }
                break;
            case 1:
                p pVar = (p) obj;
                if (!pVar.E && !pVar.r && pVar.d.N0() > pVar.A - 2) {
                    pVar.V();
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.e0.w.G1) {
                    AndroidUtilities.hideKeyboard(l4Var3.d0.U);
                    break;
                }
                break;
            case 3:
                ((g8) obj).o0();
                break;
            case 4:
                pb pbVar = (pb) obj;
                pbVar.A.invalidate();
                if (i10 != 0 && pbVar.S && !pbVar.Q && pbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = pbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    pbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    pbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    pbVar.R.playTogether(ObjectAnimator.ofFloat(pbVar.M, "alpha", 1.0f));
                    pbVar.R.addListener(new mh.x(this, 20));
                    pbVar.R.start();
                }
                if (i10 != 0) {
                    pbVar.U0(1);
                }
                pbVar.O0(true);
                pbVar.d1();
                break;
            case 9:
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.na naVar = xuVar.s;
                if (naVar != null) {
                    xuVar.w = !naVar.Z();
                    naVar.invalidate();
                    break;
                }
                break;
            case 10:
                n00 n00Var = (n00) obj;
                if (n00Var.a.G1 && (h00Var = n00Var.G) != null && (d3Var = h00Var.b) != null) {
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
                ((x10) obj).s.invalidate();
                break;
            case 12:
                y50 y50Var = (y50) obj;
                if (y50Var.v0 == null) {
                    y50Var.v0 = (pc) y50Var.x0(y50Var.V);
                }
                int measuredHeight = y50Var.v0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = y50Var.v0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                y50Var.w0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(y50Var.w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                y50Var.v0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                y50Var.v0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                y50Var.v0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (y50Var.w0 < 1.0f) {
                    y50Var.v0.setTranslationY(0.0f);
                    break;
                } else {
                    y50Var.v0.setTranslationY(top - f10);
                    break;
                }
            case 13:
                k60 k60Var = (k60) obj;
                int L0 = k60Var.r.L0();
                View childAt = k60Var.n.getChildAt(0);
                k60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < k60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = k60Var.l0) != null) {
                    eVar.f(i9, i10);
                    k60Var.d0();
                    break;
                }
                break;
            case 16:
                q70 q70Var = (q70) obj;
                q70Var.n.L0();
                View childAt2 = q70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = q70Var.H) != null) {
                    eVar2.f(i9, i10);
                    q70Var.X();
                    break;
                }
                break;
            case 19:
                ((li0) obj).G.invalidate();
                break;
            case 20:
                ti0 ti0Var = (ti0) obj;
                int L02 = ti0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(ti0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !ti0Var.R && !ti0Var.A && !ti0Var.x.isEmpty() && L02 + abs >= h - 5 && ti0Var.y) {
                    ti0Var.a0();
                    break;
                }
                break;
            case 23:
                uo0.a((uo0) obj);
                break;
            case 24:
                xu0 xu0Var = (xu0) obj;
                if (i10 != 0 && (s30Var = xu0Var.h) != null) {
                    s30Var.b(true);
                }
                org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
                if (ux0Var != null && ux0Var.s) {
                    org.telegram.ui.Components.sx0 delegate = ux0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        xu0Var.M.f();
                        break;
                    } else {
                        va1 va1Var = xu0Var.c;
                        View F = va1Var.F((org.telegram.ui.Cells.c6) delegate);
                        f2.q1 T = F == null ? null : va1Var.T(F);
                        if (T == null) {
                            xu0Var.M.f();
                            break;
                        } else {
                            View view = T.a;
                            if (xu0Var.M.getDirection() == 0) {
                                xu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                xu0Var.M.setTranslationY(view.getY());
                            }
                            f2.m0 m0Var = xu0Var.d;
                            if (!m0Var.c.G(view) || !m0Var.d.G(view)) {
                                xu0Var.M.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.q0) != null) {
                    eVar3.f(i9, i10);
                    premiumPreviewFragment.i0();
                    break;
                }
                break;
            case 26:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(cx0Var.b.N0() - cx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && cx0Var.b.N0() >= h10 - 10) {
                        cx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                x21 x21Var = (x21) obj;
                x21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) x21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                z71 z71Var = (z71) obj;
                z71Var.n0(false, true);
                if (z71Var.c.G1) {
                    AndroidUtilities.hideKeyboard(z71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = z71Var.R) != null) {
                    eVar4.f(i9, i10);
                    z71Var.h0();
                    break;
                }
                break;
        }
    }

    public l3(pb pbVar) {
        this.a = 4;
        this.b = pbVar;
        AndroidUtilities.dp(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i9) {
    }

    private final void d(RecyclerView recyclerView, int i9) {
    }

    private final void e(RecyclerView recyclerView, int i9, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i9, int i10) {
    }
}
