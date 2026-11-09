package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.k kVar2;
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
                    org.telegram.messenger.g0.v1(((qq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((ss) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                q00 q00Var = (q00) this.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + q00Var.p0().getBottom();
                    if (q00Var.w <= 0.5f) {
                        if ((q00Var.c.getLayoutManager() != null ? q00Var.c.getLayoutManager().m(0) : null) != null) {
                            if (q00Var.q0() + r6.getTop() < 0.0f) {
                                q00Var.c.w0(0, Math.round(q00Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        q00Var.c.w0(0, q00Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                l40 l40Var = (l40) this.b;
                if (i7 == 0) {
                    float f10 = l40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.f2) l40Var).actionBar;
                        int bottom = kVar.getBottom();
                        v4.n0 layoutManager = l40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            l40Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = l40Var.M.getLayoutManager() != null ? l40Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            l40Var.M.w0(0, m11.getTop(), null);
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
                    org.telegram.messenger.g0.v1(((f50) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((o50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                b60 b60Var = (b60) this.b;
                if (i7 == 1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) b60Var).simpleActionBar;
                    if (y4Var.F) {
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) b60Var).simpleActionBar;
                        org.telegram.messenger.g0.v1(y4Var2.getSearchField());
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
                    org.telegram.messenger.g0.v1(((sg0) this.b).Q1.getEditText());
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
                    org.telegram.messenger.g0.v1(((zm0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i7 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
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
                    org.telegram.messenger.g0.v1(((ty0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.t() != false) goto L155;
     */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        dz dzVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.k kVar;
        dh.g gVar;
        org.telegram.ui.Components.z20 z20Var;
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
                    y4Var = ((org.telegram.ui.ActionBar.f2) y6Var).simpleActionBar;
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
                yt ytVar = (yt) obj;
                org.telegram.ui.Components.ha haVar = ytVar.q1;
                if (haVar != null) {
                    org.telegram.ui.Components.za0 za0Var = haVar.h0;
                    if (za0Var != null && za0Var.getTop() == haVar.j0) {
                        z10 = true;
                    }
                    ytVar.s1 = !z10;
                    haVar.invalidate();
                    break;
                }
                break;
            case 11:
                iz izVar = (iz) obj;
                if (izVar.a.I1 && (dzVar = izVar.K) != null && (f3Var = dzVar.b) != null) {
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
                ((q00) obj).s.invalidate();
                break;
            case 13:
                l40 l40Var = (l40) obj;
                if (l40Var.z0 == null) {
                    l40Var.z0 = (kc) l40Var.F0(l40Var.Z);
                }
                int measuredHeight = l40Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.f2) l40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = l40Var.z0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                l40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(l40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                l40Var.z0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.z0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                l40Var.z0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (l40Var.A0 < 1.0f) {
                    l40Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    l40Var.z0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                y40 y40Var = (y40) obj;
                int L0 = y40Var.r.L0();
                View childAt = y40Var.n.getChildAt(0);
                ((te.a) y40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < y40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = y40Var.p0) != null) {
                    gVar.f(i7, i10);
                    y40Var.j0();
                    break;
                }
                break;
            case 19:
                ((dg0) obj).J.invalidate();
                break;
            case 20:
                lg0 lg0Var = (lg0) obj;
                int L02 = lg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(lg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !lg0Var.V && !lg0Var.E && !lg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && lg0Var.D) {
                    lg0Var.h0();
                    break;
                }
                break;
            case 23:
                zm0 zm0Var = (zm0) obj;
                if (zm0Var.J == null) {
                    int L03 = zm0Var.M.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(zm0Var.M.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > zm0Var.M.B() - 2 && !zm0Var.r && !zm0Var.s) {
                        zm0Var.i0(zm0Var.w, zm0Var.x, zm0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                rr0 rr0Var = (rr0) obj;
                if (i10 != 0 && (z20Var = rr0Var.h) != null) {
                    z20Var.a();
                }
                org.telegram.ui.Components.pw0 pw0Var = rr0Var.Q;
                if (pw0Var != null && pw0Var.s) {
                    org.telegram.ui.Components.nw0 delegate = pw0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.a6)) {
                        rr0Var.Q.f();
                        break;
                    } else {
                        f61 f61Var = rr0Var.c;
                        View F = f61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.d1 T = F == null ? null : f61Var.T(F);
                        if (T == null) {
                            rr0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (rr0Var.Q.getDirection() == 0) {
                                rr0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rr0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = rr0Var.d;
                            if (!b0Var.c.e(view) || !b0Var.d.e(view)) {
                                rr0Var.Q.f();
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
                ut0 ut0Var = (ut0) obj;
                if (!ut0Var.getMessagesController().I0) {
                    int abs3 = Math.abs(ut0Var.b.N0() - ut0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && ut0Var.b.N0() >= b11 - 10) {
                        ut0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 28:
                qy0 qy0Var = (qy0) obj;
                qy0Var.e.invalidate();
                ry0 ry0Var = qy0Var.w;
                int i12 = ry0.s1;
                ry0Var.b.invalidate();
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
