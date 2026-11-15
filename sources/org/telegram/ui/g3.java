package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g3 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.w4 w4Var2;
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
                    org.telegram.messenger.g0.v1(((an) this.b).m1);
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
                    org.telegram.messenger.g0.v1(((ts) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                p00 p00Var = (p00) this.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + p00Var.p0().getBottom();
                    if (p00Var.w <= 0.5f) {
                        if ((p00Var.c.getLayoutManager() != null ? p00Var.c.getLayoutManager().m(0) : null) != null) {
                            if (p00Var.q0() + r6.getTop() < 0.0f) {
                                p00Var.c.w0(0, Math.round(p00Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        p00Var.c.w0(0, p00Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                j40 j40Var = (j40) this.b;
                if (i7 == 0) {
                    float f10 = j40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.e2) j40Var).actionBar;
                        int bottom = kVar.getBottom();
                        v4.o0 layoutManager = j40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            j40Var.N.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = j40Var.N.getLayoutManager() != null ? j40Var.N.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            j40Var.N.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                w40 w40Var = (w40) this.b;
                if (i7 == 1) {
                    w40Var.f.r.m();
                    org.telegram.messenger.g0.v1(w40Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((c50) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((l50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                y50 y50Var = (y50) this.b;
                if (i7 == 1) {
                    w4Var = ((org.telegram.ui.ActionBar.e2) y50Var).simpleActionBar;
                    if (w4Var.G) {
                        w4Var2 = ((org.telegram.ui.ActionBar.e2) y50Var).simpleActionBar;
                        org.telegram.messenger.g0.v1(w4Var2.getSearchField());
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
                    org.telegram.messenger.g0.v1(((qg0) this.b).U1.getEditText());
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
                    org.telegram.messenger.g0.v1(((ym0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i7 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).actionBar;
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
                    org.telegram.messenger.g0.v1(((oy0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.v() != false) goto L155;
     */
    @Override // v4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.w4 w4Var;
        cz czVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.k kVar;
        dh.g gVar;
        org.telegram.ui.Components.b30 b30Var;
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
                    w4Var = ((org.telegram.ui.ActionBar.e2) y6Var).simpleActionBar;
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
                ((i8) obj).v0();
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
                    lbVar.S.addListener(new org.telegram.ui.Cells.w9(this, i12));
                    lbVar.S.start();
                }
                lbVar.T0(true);
                lbVar.h1();
                break;
            case 10:
                yt ytVar = (yt) obj;
                org.telegram.ui.Components.da daVar = ytVar.u1;
                if (daVar != null) {
                    org.telegram.ui.Components.za0 za0Var = daVar.i0;
                    if (za0Var != null && za0Var.getTop() == daVar.k0) {
                        z11 = true;
                    }
                    ytVar.w1 = !z11;
                    daVar.invalidate();
                    break;
                }
                break;
            case 11:
                hz hzVar = (hz) obj;
                if (hzVar.a.J1 && (czVar = hzVar.L) != null && (f3Var = czVar.b) != null) {
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
                ((p00) obj).s.invalidate();
                break;
            case 13:
                j40 j40Var = (j40) obj;
                if (j40Var.A0 == null) {
                    j40Var.A0 = (jc) j40Var.F0(j40Var.a0);
                }
                int measuredHeight = j40Var.A0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.e2) j40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = j40Var.A0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                j40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(j40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                j40Var.A0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.A0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.A0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (j40Var.B0 < 1.0f) {
                    j40Var.A0.setTranslationY(0.0f);
                    break;
                } else {
                    j40Var.A0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                w40 w40Var = (w40) obj;
                int L0 = w40Var.r.L0();
                View childAt = w40Var.n.getChildAt(0);
                ((te.a) w40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < w40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = w40Var.q0) != null) {
                    gVar.f(i7, i10);
                    w40Var.j0();
                    break;
                }
                break;
            case 19:
                ((bg0) obj).K.invalidate();
                break;
            case 20:
                jg0 jg0Var = (jg0) obj;
                int L02 = jg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(jg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !jg0Var.W && !jg0Var.F && !jg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && jg0Var.E) {
                    jg0Var.h0();
                    break;
                }
                break;
            case 23:
                ym0 ym0Var = (ym0) obj;
                if (ym0Var.K == null) {
                    int L03 = ym0Var.N.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(ym0Var.N.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > ym0Var.N.B() - 2 && !ym0Var.r && !ym0Var.s) {
                        ym0Var.i0(ym0Var.w, ym0Var.x, ym0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                nr0 nr0Var = (nr0) obj;
                if (i10 != 0 && (b30Var = nr0Var.h) != null) {
                    b30Var.a();
                }
                org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                if (rw0Var != null && rw0Var.s) {
                    org.telegram.ui.Components.pw0 delegate = rw0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.z5)) {
                        nr0Var.R.f();
                        break;
                    } else {
                        b61 b61Var = nr0Var.c;
                        View F = b61Var.F((org.telegram.ui.Cells.z5) delegate);
                        v4.e1 T = F == null ? null : b61Var.T(F);
                        if (T == null) {
                            nr0Var.R.f();
                            break;
                        } else {
                            View view = T.a;
                            if (nr0Var.R.getDirection() == 0) {
                                nr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                nr0Var.R.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = nr0Var.d;
                            if (!b0Var.c.e(view) || !b0Var.d.e(view)) {
                                nr0Var.R.f();
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
                pt0 pt0Var = (pt0) obj;
                if (!pt0Var.getMessagesController().J0) {
                    int abs3 = Math.abs(pt0Var.b.N0() - pt0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && pt0Var.b.N0() >= b11 - 10) {
                        pt0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 28:
                ly0 ly0Var = (ly0) obj;
                ly0Var.e.invalidate();
                my0 my0Var = ly0Var.w;
                int i13 = my0.w1;
                my0Var.b.invalidate();
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
