package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j3 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i10) {
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
                    ((n3) this.b).L.P0.V();
                    break;
                }
                break;
            case 4:
                vb vbVar = (vb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        vbVar.S = false;
                        vbVar.V = false;
                        vbVar.T0(true);
                        break;
                    }
                } else {
                    vbVar.S = true;
                    vbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((sn) this.b).j1);
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
                    AndroidUtilities.hideKeyboard(((rt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                b20 b20Var = (b20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) b20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (b20Var.v <= 0.5f) {
                        View m11 = b20Var.c.getLayoutManager() != null ? b20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            b20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        b20Var.c.v0(0, b20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                d60 d60Var = (d60) this.b;
                if (i10 == 0) {
                    float f7 = d60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = d60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            d60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = d60Var.M.getLayoutManager() != null ? d60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            d60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                p60 p60Var = (p60) this.b;
                if (i10 == 1) {
                    p60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(p60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w60) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                x70 x70Var = (x70) this.b;
                if (i10 == 1) {
                    x70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(x70Var.d.d);
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
                    sc0 sc0Var = (sc0) this.b;
                    if (sc0Var.r0 && sc0Var.s0) {
                        AndroidUtilities.hideKeyboard(sc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fj0) this.b).Y.getEditText());
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
                    AndroidUtilities.hideKeyboard(((v21) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((qc1) this.b).s0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        k00 k00Var;
        org.telegram.ui.Cells.c3 c3Var;
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
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.L.P0.G();
                    k4 k4Var = n3Var.L;
                    w3 w3Var = k4Var.K;
                    if (w3Var != null) {
                        w3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    n3Var.L.f0();
                    k4 k4Var2 = n3Var.L;
                    w3 w3Var2 = k4Var2.K;
                    if (w3Var2 == null || w3Var2.F) {
                        k4Var2.X(k4Var2.J0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.r && oVar.d.N0() > oVar.E - 2) {
                    oVar.W();
                    break;
                }
                break;
            case 2:
                k4 k4Var3 = (k4) obj;
                if (k4Var3.i0.w.I1) {
                    AndroidUtilities.hideKeyboard(k4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((k8) obj).p0();
                break;
            case 4:
                vb vbVar = (vb) obj;
                vbVar.v.invalidate();
                if (i11 != 0 && vbVar.S && !vbVar.Q && vbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = vbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    vbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    vbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    vbVar.R.playTogether(ObjectAnimator.ofFloat(vbVar.M, "alpha", 1.0f));
                    vbVar.R.addListener(new m.a(this, 19));
                    vbVar.R.start();
                }
                vbVar.O0(true);
                vbVar.c1();
                break;
            case 9:
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.va vaVar = yuVar.s;
                if (vaVar != null) {
                    yuVar.w = !vaVar.Y();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                q00 q00Var = (q00) obj;
                if (q00Var.a.I1 && (k00Var = q00Var.K) != null && (c3Var = k00Var.b) != null) {
                    if (!c3Var.e) {
                        c3Var.d();
                        break;
                    } else {
                        c3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((b20) obj).s.invalidate();
                break;
            case 12:
                d60 d60Var = (d60) obj;
                if (d60Var.z0 == null) {
                    d60Var.z0 = (tc) d60Var.A0(d60Var.Z);
                }
                int measuredHeight = d60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) d60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = d60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                d60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(d60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                d60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                d60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (d60Var.A0 < 1.0f) {
                    d60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    d60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                p60 p60Var = (p60) obj;
                int L0 = p60Var.r.L0();
                View childAt = p60Var.n.getChildAt(0);
                p60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < p60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = p60Var.p0) != null) {
                    fVar.f(i10, i11);
                    p60Var.e0();
                    break;
                }
                break;
            case 16:
                x70 x70Var = (x70) obj;
                x70Var.n.L0();
                View childAt2 = x70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = x70Var.L) != null) {
                    fVar2.f(i10, i11);
                    x70Var.Y();
                    break;
                }
                break;
            case 19:
                ((qi0) obj).J.invalidate();
                break;
            case 20:
                yi0 yi0Var = (yi0) obj;
                int L02 = yi0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(yi0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !yi0Var.V && !yi0Var.E && !yi0Var.x.isEmpty() && L02 + abs >= h - 5 && yi0Var.y) {
                    yi0Var.c0();
                    break;
                }
                break;
            case 23:
                iv0 iv0Var = (iv0) obj;
                if (i11 != 0 && (r40Var = iv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.lz0 lz0Var = iv0Var.Q;
                if (lz0Var != null && lz0Var.s) {
                    org.telegram.ui.Components.jz0 delegate = lz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        iv0Var.Q.f();
                        break;
                    } else {
                        xa1 xa1Var = iv0Var.c;
                        View F = xa1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.b1 T = F == null ? null : xa1Var.T(F);
                        if (T == null) {
                            iv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (iv0Var.Q.getDirection() == 0) {
                                iv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                iv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = iv0Var.d;
                            if (!b0Var.c.X(view) || !b0Var.d.X(view)) {
                                iv0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.x0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                ox0 ox0Var = (ox0) obj;
                if (!ox0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(ox0Var.b.N0() - ox0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && ox0Var.b.N0() >= h10 - 10) {
                        ox0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                r21 r21Var = (r21) obj;
                r21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) r21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                c81 c81Var = (c81) obj;
                c81Var.q0(false, true);
                if (c81Var.c.I1) {
                    AndroidUtilities.hideKeyboard(c81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = c81Var.X) != null) {
                    fVar4.f(i10, i11);
                    c81Var.k0();
                    break;
                }
                break;
            case 29:
                qc1 qc1Var = (qc1) obj;
                qc1Var.v0.g1();
                qc1Var.s0 = true;
                break;
        }
    }

    public j3(vb vbVar) {
        this.a = 4;
        this.b = vbVar;
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
