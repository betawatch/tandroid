package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.b).K.O0.W();
                    break;
                }
                break;
            case 4:
                wb wbVar = (wb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        wbVar.S = false;
                        wbVar.V = false;
                        wbVar.T0(true);
                        break;
                    }
                } else {
                    wbVar.S = true;
                    wbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bo) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ur) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((cu) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                t20 t20Var = (t20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (t20Var.v <= 0.5f) {
                        View m11 = t20Var.c.getLayoutManager() != null ? t20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            t20Var.c.w0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        t20Var.c.w0(0, t20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                u60 u60Var = (u60) this.b;
                if (i10 == 0) {
                    float f7 = u60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) u60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = u60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            u60Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = u60Var.M.getLayoutManager() != null ? u60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            u60Var.M.w0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                g70 g70Var = (g70) this.b;
                if (i10 == 1) {
                    g70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(g70Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((v70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                n80 n80Var = (n80) this.b;
                if (i10 == 1) {
                    n80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(n80Var.d.d);
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
                    kd0 kd0Var = (kd0) this.b;
                    if (kd0Var.r0 && kd0Var.s0) {
                        AndroidUtilities.hideKeyboard(kd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tj0) this.b).Y.getEditText());
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
                    kVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m13 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m13 != null && m13.getTop() < 0) {
                            premiumPreviewFragment.a.w0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.c0 - dp2, null);
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((g41) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((xd1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        b10 b10Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        ah.i iVar;
        ah.i iVar2;
        org.telegram.ui.Components.i40 i40Var;
        ah.i iVar3;
        ViewGroup viewGroup;
        ah.i iVar4;
        int i12 = this.a;
        boolean z10 = false;
        z10 = false;
        Object obj = this.b;
        switch (i12) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.H();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.K.f0();
                    h4 h4Var2 = l3Var.K;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.X(h4Var2.I0 - i11);
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
                h4 h4Var3 = (h4) obj;
                if (h4Var3.i0.w.K1) {
                    AndroidUtilities.hideKeyboard(h4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((j8) obj).p0();
                break;
            case 4:
                wb wbVar = (wb) obj;
                wbVar.v.invalidate();
                if (i11 != 0 && wbVar.S && !wbVar.Q && wbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = wbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wbVar.R.playTogether(ObjectAnimator.ofFloat(wbVar.M, "alpha", 1.0f));
                    wbVar.R.addListener(new t4(this, 14));
                    wbVar.R.start();
                }
                wbVar.O0(true);
                wbVar.c1();
                break;
            case 9:
                lv lvVar = (lv) obj;
                org.telegram.ui.Components.ta taVar = lvVar.s;
                if (taVar != null) {
                    org.telegram.ui.Components.lc0 lc0Var = taVar.y0;
                    if (lc0Var != null && lc0Var.getTop() == taVar.A0) {
                        z10 = true;
                    }
                    lvVar.w = !z10;
                    taVar.invalidate();
                    break;
                }
                break;
            case 10:
                h10 h10Var = (h10) obj;
                if (h10Var.a.K1 && (b10Var = h10Var.K) != null && (d3Var = b10Var.b) != null) {
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
                ((t20) obj).s.invalidate();
                break;
            case 12:
                u60 u60Var = (u60) obj;
                if (u60Var.z0 == null) {
                    u60Var.z0 = (vc) u60Var.y0(u60Var.Z);
                }
                int measuredHeight = u60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) u60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = u60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                u60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(u60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                u60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                u60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                u60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (u60Var.A0 < 1.0f) {
                    u60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    u60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                g70 g70Var = (g70) obj;
                int L0 = g70Var.r.L0();
                View childAt = g70Var.n.getChildAt(0);
                g70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < g70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = g70Var.p0) != null) {
                    iVar.f(i10, i11);
                    g70Var.e0();
                    break;
                }
                break;
            case 16:
                n80 n80Var = (n80) obj;
                n80Var.n.L0();
                View childAt2 = n80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = n80Var.L) != null) {
                    iVar2.f(i10, i11);
                    n80Var.Y();
                    break;
                }
                break;
            case 19:
                ((dj0) obj).K.invalidate();
                break;
            case 20:
                lj0 lj0Var = (lj0) obj;
                int L02 = lj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(lj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !lj0Var.V && !lj0Var.E && !lj0Var.x.isEmpty() && L02 + abs >= h - 5 && lj0Var.y) {
                    lj0Var.b0();
                    break;
                }
                break;
            case 23:
                cw0 cw0Var = (cw0) obj;
                if (i11 != 0 && (i40Var = cw0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
                if (oy0Var != null && oy0Var.s) {
                    org.telegram.ui.Components.my0 delegate = oy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        cw0Var.Q.f();
                        break;
                    } else {
                        fc1 fc1Var = cw0Var.c;
                        View G = fc1Var.G((org.telegram.ui.Cells.c6) delegate);
                        s4.c1 U = G == null ? null : fc1Var.U(G);
                        if (U == null) {
                            cw0Var.Q.f();
                            break;
                        } else {
                            View view = U.a;
                            if (cw0Var.Q.getDirection() == 0) {
                                cw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                cw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = cw0Var.d;
                            if (!c0Var.c.v(view) || !c0Var.d.v(view)) {
                                cw0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                iy0 iy0Var = (iy0) obj;
                if (!iy0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(iy0Var.b.N0() - iy0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && iy0Var.b.N0() >= h10 - 10) {
                        iy0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                c41 c41Var = (c41) obj;
                c41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) c41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                g91 g91Var = (g91) obj;
                g91Var.o0(false, true);
                if (g91Var.c.K1) {
                    AndroidUtilities.hideKeyboard(g91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar4 = g91Var.V) != null) {
                    iVar4.f(i10, i11);
                    g91Var.i0();
                    break;
                }
                break;
            case 29:
                xd1 xd1Var = (xd1) obj;
                xd1Var.u0.g1();
                xd1Var.r0 = true;
                break;
        }
    }

    public h3(wb wbVar) {
        this.a = 4;
        this.b = wbVar;
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
