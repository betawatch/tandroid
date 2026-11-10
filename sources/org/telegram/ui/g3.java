package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g3 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                if (i7 == 0) {
                    ((k3) this.b).L.P0.V();
                    break;
                }
                break;
            case 5:
                mb mbVar = (mb) this.b;
                if (i7 != 1) {
                    if (i7 == 0) {
                        mbVar.S = false;
                        mbVar.V = false;
                        mbVar.Y0(true);
                        break;
                    }
                } else {
                    mbVar.S = true;
                    mbVar.V = true;
                    break;
                }
                break;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((cn) this.b).l1);
                    break;
                }
                break;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((mp) this.b).getParentActivity().getCurrentFocus());
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
                m40 m40Var = (m40) this.b;
                if (i7 == 0) {
                    float f10 = m40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        lVar = ((org.telegram.ui.ActionBar.f2) m40Var).actionBar;
                        int bottom = lVar.getBottom();
                        v4.n0 layoutManager = m40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            m40Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = m40Var.M.getLayoutManager() != null ? m40Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            m40Var.M.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                z40 z40Var = (z40) this.b;
                if (i7 == 1) {
                    z40Var.f.r.m();
                    org.telegram.messenger.g0.v1(z40Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((g50) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((p50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                c60 c60Var = (c60) this.b;
                if (i7 == 1) {
                    z4Var = ((org.telegram.ui.ActionBar.f2) c60Var).simpleActionBar;
                    if (z4Var.F) {
                        z4Var2 = ((org.telegram.ui.ActionBar.f2) c60Var).simpleActionBar;
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
                    org.telegram.messenger.g0.v1(((tg0) this.b).T1.getEditText());
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
                    lVar2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + lVar2.getBottom();
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m12 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            premiumPreviewFragment.a.w0(0, m12.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.c0 - L2, null);
                        break;
                    }
                }
                break;
            case 29:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((uy0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.u() != false) goto L155;
     */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        ez ezVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.l lVar;
        dh.g gVar;
        org.telegram.ui.Components.y20 y20Var;
        dh.g gVar2;
        int i11 = this.a;
        boolean z9 = false;
        r4 = false;
        boolean z10 = false;
        Object obj = this.b;
        switch (i11) {
            case 0:
                k3 k3Var = (k3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    k3Var.L.P0.G();
                    g4 g4Var = k3Var.L;
                    t3 t3Var = g4Var.K;
                    if (t3Var != null) {
                        t3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    k3Var.L.d0();
                    g4 g4Var2 = k3Var.L;
                    t3 t3Var2 = g4Var2.K;
                    if (t3Var2 == null || t3Var2.F) {
                        g4Var2.V(g4Var2.J0 - i10);
                        break;
                    }
                }
                break;
            case 1:
                o oVar = (o) obj;
                if (!oVar.I && !oVar.r && oVar.d.N0() > oVar.E - 2) {
                    oVar.b0();
                    break;
                }
                break;
            case 2:
                g4 g4Var3 = (g4) obj;
                if (g4Var3.i0.x.I1) {
                    org.telegram.messenger.g0.v1(g4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                y6 y6Var = (y6) obj;
                if (!y6Var.b.canScrollVertically(-1)) {
                    z4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
                    break;
                }
                z9 = true;
                te.a aVar = y6Var.S;
                if (aVar != null) {
                    aVar.a(z9, true);
                    break;
                }
                break;
            case 4:
                ((h8) obj).v0();
                break;
            case 5:
                mb mbVar = (mb) obj;
                mbVar.w.invalidate();
                if (i10 != 0 && mbVar.S && !mbVar.Q && mbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = mbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    mbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    mbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    mbVar.R.playTogether(ObjectAnimator.ofFloat(mbVar.M, "alpha", 1.0f));
                    mbVar.R.addListener(new va(this, false ? 1 : 0));
                    mbVar.R.start();
                }
                mbVar.T0(true);
                mbVar.h1();
                break;
            case 10:
                zt ztVar = (zt) obj;
                org.telegram.ui.Components.ga gaVar = ztVar.t1;
                if (gaVar != null) {
                    org.telegram.ui.Components.ya0 ya0Var = gaVar.h0;
                    if (ya0Var != null && ya0Var.getTop() == gaVar.j0) {
                        z10 = true;
                    }
                    ztVar.v1 = !z10;
                    gaVar.invalidate();
                    break;
                }
                break;
            case 11:
                jz jzVar = (jz) obj;
                if (jzVar.a.I1 && (ezVar = jzVar.K) != null && (f3Var = ezVar.b) != null) {
                    if (!f3Var.e) {
                        f3Var.d();
                        break;
                    } else {
                        f3Var.k(true);
                        break;
                    }
                }
                break;
            case 12:
                ((r00) obj).s.invalidate();
                break;
            case 13:
                m40 m40Var = (m40) obj;
                if (m40Var.z0 == null) {
                    m40Var.z0 = (kc) m40Var.F0(m40Var.Z);
                }
                int measuredHeight = m40Var.z0.getMeasuredHeight();
                lVar = ((org.telegram.ui.ActionBar.f2) m40Var).actionBar;
                int measuredHeight2 = measuredHeight - lVar.getMeasuredHeight();
                float top = m40Var.z0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                m40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(m40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                m40Var.z0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.z0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                m40Var.z0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (m40Var.A0 < 1.0f) {
                    m40Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    m40Var.z0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                z40 z40Var = (z40) obj;
                int L0 = z40Var.r.L0();
                View childAt = z40Var.n.getChildAt(0);
                ((te.a) z40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < z40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = z40Var.p0) != null) {
                    gVar.f(i7, i10);
                    z40Var.j0();
                    break;
                }
                break;
            case 19:
                ((eg0) obj).J.invalidate();
                break;
            case 20:
                mg0 mg0Var = (mg0) obj;
                int L02 = mg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(mg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !mg0Var.V && !mg0Var.E && !mg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && mg0Var.D) {
                    mg0Var.h0();
                    break;
                }
                break;
            case 23:
                an0 an0Var = (an0) obj;
                if (an0Var.J == null) {
                    int L03 = an0Var.M.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(an0Var.M.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > an0Var.M.B() - 2 && !an0Var.r && !an0Var.s) {
                        an0Var.i0(an0Var.w, an0Var.x, an0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                sr0 sr0Var = (sr0) obj;
                if (i10 != 0 && (y20Var = sr0Var.h) != null) {
                    y20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                if (ow0Var != null && ow0Var.s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.a6)) {
                        sr0Var.Q.f();
                        break;
                    } else {
                        g61 g61Var = sr0Var.c;
                        View F = g61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.d1 T = F == null ? null : g61Var.T(F);
                        if (T == null) {
                            sr0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (sr0Var.Q.getDirection() == 0) {
                                sr0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                sr0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = sr0Var.d;
                            if (!b0Var.c.e(view) || !b0Var.d.e(view)) {
                                sr0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (gVar2 = premiumPreviewFragment.w0) != null) {
                    gVar2.f(i7, i10);
                    premiumPreviewFragment.o0();
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                break;
            case 27:
                vt0 vt0Var = (vt0) obj;
                if (!vt0Var.getMessagesController().I0) {
                    int abs3 = Math.abs(vt0Var.b.N0() - vt0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && vt0Var.b.N0() >= b11 - 10) {
                        vt0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 28:
                ry0 ry0Var = (ry0) obj;
                ry0Var.e.invalidate();
                sy0 sy0Var = ry0Var.w;
                int i12 = sy0.v1;
                sy0Var.b.invalidate();
                break;
        }
    }

    public g3(mb mbVar) {
        this.a = 5;
        this.b = mbVar;
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
