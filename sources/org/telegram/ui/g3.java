package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g3 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.b).M.Q0.V();
                    break;
                }
                break;
            case 5:
                lb lbVar = (lb) this.b;
                if (i7 != 1) {
                    if (i7 == 0) {
                        lbVar.T = false;
                        lbVar.W = false;
                        lbVar.Y0(true);
                        break;
                    }
                } else {
                    lbVar.T = true;
                    lbVar.W = true;
                    break;
                }
                break;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((bn) this.b).m1);
                    break;
                }
                break;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((np) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((rq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ts) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                r00 r00Var = (r00) this.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + r00Var.p0().getBottom();
                    if (r00Var.w <= 0.5f) {
                        if ((r00Var.c.getLayoutManager() != null ? r00Var.c.getLayoutManager().m(0) : null) != null) {
                            if (r00Var.q0() + r6.getTop() < 0.0f) {
                                r00Var.c.w0(0, Math.round(r00Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        r00Var.c.w0(0, r00Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                l40 l40Var = (l40) this.b;
                if (i7 == 0) {
                    float f10 = l40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.g2) l40Var).actionBar;
                        int bottom = kVar.getBottom();
                        v4.p0 layoutManager = l40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            l40Var.N.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = l40Var.N.getLayoutManager() != null ? l40Var.N.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            l40Var.N.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                y40 y40Var = (y40) this.b;
                if (i7 == 1) {
                    y40Var.f.r.m();
                    org.telegram.messenger.g0.v1(y40Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((e50) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((n50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                a60 a60Var = (a60) this.b;
                if (i7 == 1) {
                    z4Var = ((org.telegram.ui.ActionBar.g2) a60Var).simpleActionBar;
                    if (z4Var.G) {
                        z4Var2 = ((org.telegram.ui.ActionBar.g2) a60Var).simpleActionBar;
                        org.telegram.messenger.g0.v1(z4Var2.getSearchField());
                        break;
                    }
                }
                break;
            case 18:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((tg0) this.b).U1.getEditText());
                    break;
                }
                break;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 23:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((an0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i7 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
                    if (premiumPreviewFragment.g0 <= 0.5f) {
                        View m12 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            premiumPreviewFragment.a.w0(0, m12.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.d0 - L2, null);
                        break;
                    }
                }
                break;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ry0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.x() != false) goto L155;
     */
    @Override // v4.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        ez ezVar;
        org.telegram.ui.Cells.g3 g3Var;
        org.telegram.ui.ActionBar.k kVar;
        dh.g gVar;
        org.telegram.ui.Components.j30 j30Var;
        dh.g gVar2;
        int i11 = this.a;
        boolean z10 = false;
        r4 = false;
        boolean z11 = false;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.M.Q0.G();
                    g4 g4Var = k3Var.M;
                    t3 t3Var = g4Var.L;
                    if (t3Var != null) {
                        t3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    k3Var.M.d0();
                    g4 g4Var2 = k3Var.M;
                    t3 t3Var2 = g4Var2.L;
                    if (t3Var2 == null || t3Var2.G) {
                        g4Var2.V(g4Var2.K0 - i10);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj;
                if (!oVar.J && !oVar.r && oVar.d.N0() > oVar.F - 2) {
                    oVar.b0();
                    break;
                }
                break;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.j0.x.J1) {
                    org.telegram.messenger.g0.v1(g4Var3.i0.c0);
                    break;
                }
                break;
            case 3:
                y6 y6Var = (y6) obj;
                if (!y6Var.b.canScrollVertically(-1)) {
                    z4Var = ((org.telegram.ui.ActionBar.g2) y6Var).simpleActionBar;
                    break;
                }
                z10 = true;
                te.a aVar = y6Var.T;
                if (aVar != null) {
                    aVar.a(z10, true);
                    break;
                }
                break;
            case 4:
                ((j8) obj).v0();
                break;
            case 5:
                lb lbVar = (lb) obj;
                lbVar.w.invalidate();
                if (i10 != 0 && lbVar.T && !lbVar.R && lbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = lbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    lbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    lbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    lbVar.S.playTogether(ObjectAnimator.ofFloat(lbVar.N, "alpha", 1.0f));
                    lbVar.S.addListener(new org.telegram.ui.Cells.x9(this, i12));
                    lbVar.S.start();
                }
                lbVar.T0(true);
                lbVar.h1();
                break;
            case 10:
                zt ztVar = (zt) obj;
                org.telegram.ui.Components.ka kaVar = ztVar.u1;
                if (kaVar != null) {
                    org.telegram.ui.Components.hb0 hb0Var = kaVar.i0;
                    if (hb0Var != null && hb0Var.getTop() == kaVar.k0) {
                        z11 = true;
                    }
                    ztVar.w1 = !z11;
                    kaVar.invalidate();
                    break;
                }
                break;
            case 11:
                jz jzVar = (jz) obj;
                if (jzVar.a.J1 && (ezVar = jzVar.L) != null && (g3Var = ezVar.b) != null) {
                    if (!g3Var.e) {
                        g3Var.d();
                        break;
                    } else {
                        g3Var.k(true);
                        break;
                    }
                }
                break;
            case 12:
                ((r00) obj).s.invalidate();
                break;
            case 13:
                l40 l40Var = (l40) obj;
                if (l40Var.A0 == null) {
                    l40Var.A0 = (jc) l40Var.F0(l40Var.a0);
                }
                int measuredHeight = l40Var.A0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.g2) l40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = l40Var.A0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                l40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(l40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                l40Var.A0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.A0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.A0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (l40Var.B0 < 1.0f) {
                    l40Var.A0.setTranslationY(0.0f);
                    break;
                } else {
                    l40Var.A0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                y40 y40Var = (y40) obj;
                int L0 = y40Var.r.L0();
                View childAt = y40Var.n.getChildAt(0);
                ((te.a) y40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < y40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = y40Var.q0) != null) {
                    gVar.f(i7, i10);
                    y40Var.j0();
                    break;
                }
                break;
            case 19:
                ((dg0) obj).K.invalidate();
                break;
            case 20:
                mg0 mg0Var = (mg0) obj;
                int L02 = mg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(mg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !mg0Var.W && !mg0Var.F && !mg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && mg0Var.E) {
                    mg0Var.h0();
                    break;
                }
                break;
            case 23:
                an0 an0Var = (an0) obj;
                if (an0Var.K == null) {
                    int L03 = an0Var.N.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(an0Var.N.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > an0Var.N.B() - 2 && !an0Var.r && !an0Var.s) {
                        an0Var.i0(an0Var.w, an0Var.x, an0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                pr0 pr0Var = (pr0) obj;
                if (i10 != 0 && (j30Var = pr0Var.h) != null) {
                    j30Var.a();
                }
                org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
                if (zw0Var != null && zw0Var.s) {
                    org.telegram.ui.Components.xw0 delegate = zw0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.a6)) {
                        pr0Var.R.f();
                        break;
                    } else {
                        d61 d61Var = pr0Var.c;
                        View F = d61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.f1 T = F == null ? null : d61Var.T(F);
                        if (T == null) {
                            pr0Var.R.f();
                            break;
                        } else {
                            View view = T.a;
                            if (pr0Var.R.getDirection() == 0) {
                                pr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pr0Var.R.setTranslationY(view.getY());
                            }
                            v4.c0 c0Var = pr0Var.d;
                            if (!c0Var.c.e(view) || !c0Var.d.e(view)) {
                                pr0Var.R.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.e0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.x0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                break;
            case 27:
                rt0 rt0Var = (rt0) obj;
                if (!rt0Var.getMessagesController().J0) {
                    int abs3 = Math.abs(rt0Var.b.N0() - rt0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && rt0Var.b.N0() >= b11 - 10) {
                        rt0Var.getMessagesController().H0(false);
                        break;
                    }
                }
                break;
            case 28:
                oy0 oy0Var = (oy0) obj;
                oy0Var.e.invalidate();
                py0 py0Var = oy0Var.w;
                int i13 = py0.w1;
                py0Var.b.invalidate();
                break;
        }
    }

    public g3(lb lbVar) {
        this.a = 5;
        this.b = lbVar;
        org.telegram.messenger.g0.L(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i7) {
    }

    private final void d(RecyclerView recyclerView, int i7) {
    }

    private final void e(RecyclerView recyclerView, int i7, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i7, int i10) {
    }
}
