package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                    AndroidUtilities.hideKeyboard(((qn) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ot) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                y10 y10Var = (y10) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (y10Var.v <= 0.5f) {
                        View m11 = y10Var.c.getLayoutManager() != null ? y10Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            y10Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        y10Var.c.v0(0, y10Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                z50 z50Var = (z50) this.b;
                if (i10 == 0) {
                    float f7 = z50Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) z50Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.n0 layoutManager = z50Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            z50Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = z50Var.M.getLayoutManager() != null ? z50Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            z50Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                l60 l60Var = (l60) this.b;
                if (i10 == 1) {
                    l60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(l60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s60) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((a70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                r70 r70Var = (r70) this.b;
                if (i10 == 1) {
                    r70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(r70Var.d.d);
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
                    nc0 nc0Var = (nc0) this.b;
                    if (nc0Var.r0 && nc0Var.s0) {
                        AndroidUtilities.hideKeyboard(nc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bj0) this.b).Y.getEditText());
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
                    AndroidUtilities.hideKeyboard(((r21) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((kc1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.r0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        h00 h00Var;
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
                vu vuVar = (vu) obj;
                org.telegram.ui.Components.va vaVar = vuVar.s;
                if (vaVar != null) {
                    vuVar.w = !vaVar.Z();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                n00 n00Var = (n00) obj;
                if (n00Var.a.I1 && (h00Var = n00Var.K) != null && (d3Var = h00Var.b) != null) {
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
                ((y10) obj).s.invalidate();
                break;
            case 12:
                z50 z50Var = (z50) obj;
                if (z50Var.z0 == null) {
                    z50Var.z0 = (tc) z50Var.y0(z50Var.Z);
                }
                int measuredHeight = z50Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) z50Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = z50Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                z50Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(z50Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                z50Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                z50Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                z50Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (z50Var.A0 < 1.0f) {
                    z50Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    z50Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                l60 l60Var = (l60) obj;
                int L0 = l60Var.r.L0();
                View childAt = l60Var.n.getChildAt(0);
                l60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < l60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = l60Var.p0) != null) {
                    fVar.f(i10, i11);
                    l60Var.e0();
                    break;
                }
                break;
            case 16:
                r70 r70Var = (r70) obj;
                r70Var.n.L0();
                View childAt2 = r70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = r70Var.L) != null) {
                    fVar2.f(i10, i11);
                    r70Var.Y();
                    break;
                }
                break;
            case 19:
                ((mi0) obj).J.invalidate();
                break;
            case 20:
                ui0 ui0Var = (ui0) obj;
                int L02 = ui0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(ui0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !ui0Var.V && !ui0Var.E && !ui0Var.x.isEmpty() && L02 + abs >= h - 5 && ui0Var.y) {
                    ui0Var.b0();
                    break;
                }
                break;
            case 23:
                fv0 fv0Var = (fv0) obj;
                if (i11 != 0 && (r40Var = fv0Var.h) != null) {
                    r40Var.b(true);
                }
                org.telegram.ui.Components.iz0 iz0Var = fv0Var.Q;
                if (iz0Var != null && iz0Var.s) {
                    org.telegram.ui.Components.gz0 delegate = iz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        fv0Var.Q.f();
                        break;
                    } else {
                        sa1 sa1Var = fv0Var.c;
                        View F = sa1Var.F((org.telegram.ui.Cells.c6) delegate);
                        s4.b1 T = F == null ? null : sa1Var.T(F);
                        if (T == null) {
                            fv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (fv0Var.Q.getDirection() == 0) {
                                fv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.b0 b0Var = fv0Var.d;
                            if (!b0Var.c.X(view) || !b0Var.d.X(view)) {
                                fv0Var.Q.f();
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
                kx0 kx0Var = (kx0) obj;
                if (!kx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(kx0Var.b.N0() - kx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && kx0Var.b.N0() >= h10 - 10) {
                        kx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                n21 n21Var = (n21) obj;
                n21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) n21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                x71 x71Var = (x71) obj;
                x71Var.o0(false, true);
                if (x71Var.c.I1) {
                    AndroidUtilities.hideKeyboard(x71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = x71Var.W) != null) {
                    fVar4.f(i10, i11);
                    x71Var.i0();
                    break;
                }
                break;
            case 29:
                kc1 kc1Var = (kc1) obj;
                kc1Var.u0.f1();
                kc1Var.r0 = true;
                break;
        }
    }

    public k3(vb vbVar) {
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
