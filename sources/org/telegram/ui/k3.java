package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                ac acVar = (ac) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        acVar.S = false;
                        acVar.V = false;
                        acVar.T0(true);
                        break;
                    }
                } else {
                    acVar.S = true;
                    acVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fo) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((fu) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                v20 v20Var = (v20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (v20Var.v <= 0.5f) {
                        View m11 = v20Var.c.getLayoutManager() != null ? v20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            v20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        v20Var.c.v0(0, v20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                x60 x60Var = (x60) this.b;
                if (i10 == 0) {
                    float f7 = x60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) x60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = x60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            x60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = x60Var.M.getLayoutManager() != null ? x60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            x60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                j70 j70Var = (j70) this.b;
                if (i10 == 1) {
                    j70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(j70Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((p70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((y70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                p80 p80Var = (p80) this.b;
                if (i10 == 1) {
                    p80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(p80Var.d.d);
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
                    nd0 nd0Var = (nd0) this.b;
                    if (nd0Var.r0 && nd0Var.s0) {
                        AndroidUtilities.hideKeyboard(nd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((xj0) this.b).Y.getEditText());
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
                    kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
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
                    AndroidUtilities.hideKeyboard(((l41) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((ce1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        f10 f10Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        bh.f fVar;
        bh.f fVar2;
        org.telegram.ui.Components.v40 v40Var;
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
                    k4 k4Var = o3Var.K;
                    x3 x3Var = k4Var.K;
                    if (x3Var != null) {
                        x3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    o3Var.K.f0();
                    k4 k4Var2 = o3Var.K;
                    x3 x3Var2 = k4Var2.K;
                    if (x3Var2 == null || x3Var2.F) {
                        k4Var2.X(k4Var2.I0 - i11);
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
                k4 k4Var3 = (k4) obj;
                if (k4Var3.i0.w.I1) {
                    AndroidUtilities.hideKeyboard(k4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((l8) obj).p0();
                break;
            case 4:
                ac acVar = (ac) obj;
                acVar.v.invalidate();
                if (i11 != 0 && acVar.S && !acVar.Q && acVar.M.getTag() == null) {
                    AnimatorSet animatorSet = acVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    acVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    acVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    acVar.R.playTogether(ObjectAnimator.ofFloat(acVar.M, "alpha", 1.0f));
                    acVar.R.addListener(new u0(this, 17));
                    acVar.R.start();
                }
                acVar.O0(true);
                acVar.c1();
                break;
            case 9:
                ov ovVar = (ov) obj;
                org.telegram.ui.Components.xa xaVar = ovVar.s;
                if (xaVar != null) {
                    ovVar.w = !xaVar.Z();
                    xaVar.invalidate();
                    break;
                }
                break;
            case 10:
                l10 l10Var = (l10) obj;
                if (l10Var.a.I1 && (f10Var = l10Var.K) != null && (e3Var = f10Var.b) != null) {
                    if (!e3Var.e) {
                        e3Var.d();
                        break;
                    } else {
                        e3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((v20) obj).s.invalidate();
                break;
            case 12:
                x60 x60Var = (x60) obj;
                if (x60Var.z0 == null) {
                    x60Var.z0 = (ad) x60Var.y0(x60Var.Z);
                }
                int measuredHeight = x60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) x60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = x60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                x60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(x60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                x60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                x60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                x60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (x60Var.A0 < 1.0f) {
                    x60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    x60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                j70 j70Var = (j70) obj;
                int L0 = j70Var.r.L0();
                View childAt = j70Var.n.getChildAt(0);
                j70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < j70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = j70Var.p0) != null) {
                    fVar.f(i10, i11);
                    j70Var.e0();
                    break;
                }
                break;
            case 16:
                p80 p80Var = (p80) obj;
                p80Var.n.L0();
                View childAt2 = p80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = p80Var.L) != null) {
                    fVar2.f(i10, i11);
                    p80Var.Y();
                    break;
                }
                break;
            case 19:
                ((hj0) obj).K.invalidate();
                break;
            case 20:
                qj0 qj0Var = (qj0) obj;
                int L02 = qj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(qj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !qj0Var.V && !qj0Var.E && !qj0Var.x.isEmpty() && L02 + abs >= h - 5 && qj0Var.y) {
                    qj0Var.b0();
                    break;
                }
                break;
            case 23:
                gw0 gw0Var = (gw0) obj;
                if (i11 != 0 && (v40Var = gw0Var.h) != null) {
                    v40Var.b(true);
                }
                org.telegram.ui.Components.kz0 kz0Var = gw0Var.Q;
                if (kz0Var != null && kz0Var.s) {
                    org.telegram.ui.Components.iz0 delegate = kz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        gw0Var.Q.f();
                        break;
                    } else {
                        kc1 kc1Var = gw0Var.c;
                        View F = kc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.b1 T = F == null ? null : kc1Var.T(F);
                        if (T == null) {
                            gw0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (gw0Var.Q.getDirection() == 0) {
                                gw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                gw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = gw0Var.d;
                            if (!b0Var.c.H(view) || !b0Var.d.H(view)) {
                                gw0Var.Q.f();
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
                my0 my0Var = (my0) obj;
                if (!my0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(my0Var.b.N0() - my0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && my0Var.b.N0() >= h10 - 10) {
                        my0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                h41 h41Var = (h41) obj;
                h41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) h41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                o91 o91Var = (o91) obj;
                o91Var.o0(false, true);
                if (o91Var.c.I1) {
                    AndroidUtilities.hideKeyboard(o91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = o91Var.V) != null) {
                    fVar4.f(i10, i11);
                    o91Var.i0();
                    break;
                }
                break;
            case 29:
                ce1 ce1Var = (ce1) obj;
                ce1Var.u0.f1();
                ce1Var.r0 = true;
                break;
        }
    }

    public k3(ac acVar) {
        this.a = 4;
        this.b = acVar;
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
