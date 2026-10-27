package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i3 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.b).L.P0.V();
                    break;
                }
                break;
            case 5:
                wb wbVar = (wb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        wbVar.S = false;
                        wbVar.V = false;
                        wbVar.U0(true);
                        break;
                    }
                } else {
                    wbVar.S = true;
                    wbVar.V = true;
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wn) this.b).j1);
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((iq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((mr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                f20 f20Var = (f20) this.b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(16.0f) + f20Var.l0().getBottom();
                    if (f20Var.v <= 0.5f) {
                        if ((f20Var.c.getLayoutManager() != null ? f20Var.c.getLayoutManager().m(0) : null) != null) {
                            if (f20Var.m0() + r6.getTop() < 0.0f) {
                                f20Var.c.w0(0, Math.round(f20Var.m0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        f20Var.c.w0(0, f20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 13:
                g60 g60Var = (g60) this.b;
                if (i10 == 0) {
                    float f7 = g60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                        int bottom = kVar.getBottom();
                        s4.p0 layoutManager = g60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            g60Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m11 = g60Var.M.getLayoutManager() != null ? g60Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            g60Var.M.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                t60 t60Var = (t60) this.b;
                if (i10 == 1) {
                    t60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(t60Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((z60) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((h70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                y70 y70Var = (y70) this.b;
                if (i10 == 1) {
                    r5Var = ((org.telegram.ui.ActionBar.r2) y70Var).simpleActionBar;
                    if (r5Var.F) {
                        r5Var2 = ((org.telegram.ui.ActionBar.r2) y70Var).simpleActionBar;
                        AndroidUtilities.hideKeyboard(r5Var2.getSearchField());
                        break;
                    }
                }
                break;
            case 18:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 19:
                if (i10 == 1) {
                    rc0 rc0Var = (rc0) this.b;
                    if (rc0Var.q0 && rc0Var.r0) {
                        AndroidUtilities.hideKeyboard(rc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ej0) this.b).Y.getEditText());
                    break;
                }
                break;
            case 23:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i10 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m12 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            premiumPreviewFragment.a.w0(0, m12.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.c0 - dp2, null);
                        break;
                    }
                }
                break;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((a31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    f81 f81Var = (f81) this.b;
                    if (f81Var.E != null) {
                        org.telegram.ui.ActionBar.y5 y5Var = f81Var.d;
                        if (y5Var == null || !y5Var.w()) {
                            float f10 = f81Var.X;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    f81Var.c.w0(0, (int) Math.ceil(f81Var.Y - f81Var.a0), org.telegram.ui.Components.ds.h);
                                    break;
                                } else {
                                    f81Var.c.w0(0, (int) (-(f81Var.Z - f81Var.Y)), org.telegram.ui.Components.ds.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02bc, code lost:
    
        if (r8.o() != false) goto L139;
     */
    @Override // s4.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.r5 r5Var;
        k00 k00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.k kVar;
        ch.f fVar;
        org.telegram.ui.Components.t40 t40Var;
        ch.f fVar2;
        ViewGroup viewGroup;
        int i12 = this.a;
        boolean z10 = false;
        r4 = false;
        boolean z11 = false;
        Object obj = this.b;
        switch (i12) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.L.P0.G();
                    j4 j4Var = m3Var.L;
                    v3 v3Var = j4Var.K;
                    if (v3Var != null) {
                        v3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    m3Var.L.f0();
                    j4 j4Var2 = m3Var.L;
                    v3 v3Var2 = j4Var2.K;
                    if (v3Var2 == null || v3Var2.F) {
                        j4Var2.X(j4Var2.J0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.r && oVar.d.N0() > oVar.E - 2) {
                    oVar.X();
                    break;
                }
                break;
            case 2:
                j4 j4Var3 = (j4) obj;
                if (j4Var3.i0.w.I1) {
                    AndroidUtilities.hideKeyboard(j4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                c7 c7Var = (c7) obj;
                if (!c7Var.b.canScrollVertically(-1)) {
                    r5Var = ((org.telegram.ui.ActionBar.r2) c7Var).simpleActionBar;
                    break;
                }
                z10 = true;
                oe.b bVar = c7Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    break;
                }
                break;
            case 4:
                ((n8) obj).r0();
                break;
            case 5:
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
                    wbVar.R.addListener(new kg.e(this, 21));
                    wbVar.R.start();
                }
                wbVar.P0(true);
                wbVar.d1();
                break;
            case 10:
                xu xuVar = (xu) obj;
                org.telegram.ui.Components.va vaVar = xuVar.s;
                if (vaVar != null) {
                    org.telegram.ui.Components.ed0 ed0Var = vaVar.n0;
                    if (ed0Var != null && ed0Var.getTop() == vaVar.p0) {
                        z11 = true;
                    }
                    xuVar.w = !z11;
                    vaVar.invalidate();
                    break;
                }
                break;
            case 11:
                q00 q00Var = (q00) obj;
                if (q00Var.a.I1 && (k00Var = q00Var.K) != null && (b3Var = k00Var.b) != null) {
                    if (!b3Var.e) {
                        b3Var.d();
                        break;
                    } else {
                        b3Var.k(true);
                        break;
                    }
                }
                break;
            case 12:
                ((f20) obj).s.invalidate();
                break;
            case 13:
                g60 g60Var = (g60) obj;
                if (g60Var.z0 == null) {
                    g60Var.z0 = (uc) g60Var.B0(g60Var.Z);
                }
                int measuredHeight = g60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.r2) g60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = g60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                g60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(g60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                g60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                g60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                g60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (g60Var.A0 < 1.0f) {
                    g60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    g60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 14:
                t60 t60Var = (t60) obj;
                int L0 = t60Var.r.L0();
                View childAt = t60Var.n.getChildAt(0);
                ((oe.b) t60Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < t60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = t60Var.p0) != null) {
                    fVar.f(i10, i11);
                    t60Var.f0();
                    break;
                }
                break;
            case 20:
                ((pi0) obj).J.invalidate();
                break;
            case 21:
                xi0 xi0Var = (xi0) obj;
                int L02 = xi0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(xi0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !xi0Var.V && !xi0Var.E && !xi0Var.x.isEmpty() && L02 + abs >= h - 5 && xi0Var.y) {
                    xi0Var.d0();
                    break;
                }
                break;
            case 24:
                ov0 ov0Var = (ov0) obj;
                if (i11 != 0 && (t40Var = ov0Var.h) != null) {
                    t40Var.b(true);
                }
                org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
                if (uz0Var != null && uz0Var.s) {
                    org.telegram.ui.Components.sz0 delegate = uz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.h6)) {
                        ov0Var.Q.f();
                        break;
                    } else {
                        bb1 bb1Var = ov0Var.c;
                        View F = bb1Var.F((org.telegram.ui.Cells.h6) delegate);
                        s4.e1 T = F == null ? null : bb1Var.T(F);
                        if (T == null) {
                            ov0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (ov0Var.Q.getDirection() == 0) {
                                ov0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                ov0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = ov0Var.d;
                            if (!c0Var.c.O(view) || !c0Var.d.O(view)) {
                                ov0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.x0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.k0();
                    break;
                }
                break;
            case 26:
                ux0 ux0Var = (ux0) obj;
                if (!ux0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(ux0Var.b.N0() - ux0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && ux0Var.b.N0() >= h10 - 10) {
                        ux0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                w21 w21Var = (w21) obj;
                w21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.k3) w21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                f81 f81Var = (f81) obj;
                f81Var.n0(false, true);
                f81Var.o0();
                if (f81Var.c.I1) {
                    AndroidUtilities.hideKeyboard(f81Var.fragmentView);
                    break;
                }
                break;
        }
    }

    public i3(wb wbVar) {
        this.a = 5;
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
