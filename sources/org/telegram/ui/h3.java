package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h3 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i3 == 0) {
                    ((l3) this.b).M.Q0.V();
                    break;
                }
                break;
            case 5:
                kb kbVar = (kb) this.b;
                if (i3 != 1) {
                    if (i3 == 0) {
                        kbVar.T = false;
                        kbVar.W = false;
                        kbVar.Y0(true);
                        break;
                    }
                } else {
                    kbVar.T = true;
                    kbVar.W = true;
                    break;
                }
                break;
            case 6:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((wm) this.b).m1);
                    break;
                }
                break;
            case 7:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((ip) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((nq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((os) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                l00 l00Var = (l00) this.b;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + l00Var.p0().getBottom();
                    if (l00Var.w <= 0.5f) {
                        if ((l00Var.c.getLayoutManager() != null ? l00Var.c.getLayoutManager().m(0) : null) != null) {
                            if (l00Var.q0() + r6.getTop() < 0.0f) {
                                l00Var.c.w0(0, Math.round(l00Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        l00Var.c.w0(0, l00Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                e40 e40Var = (e40) this.b;
                if (i3 == 0) {
                    float f10 = e40Var.B0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                        int bottom = kVar.getBottom();
                        u4.o0 layoutManager = e40Var.N.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            e40Var.N.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = e40Var.N.getLayoutManager() != null ? e40Var.N.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            e40Var.N.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                r40 r40Var = (r40) this.b;
                if (i3 == 1) {
                    r40Var.f.r.m();
                    org.telegram.messenger.g0.v1(r40Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((y40) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((g50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                t50 t50Var = (t50) this.b;
                if (i3 == 1) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) t50Var).simpleActionBar;
                    if (y4Var.G) {
                        y4Var2 = ((org.telegram.ui.ActionBar.d2) t50Var).simpleActionBar;
                        org.telegram.messenger.g0.v1(y4Var2.getSearchField());
                        break;
                    }
                }
                break;
            case 18:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((kg0) this.b).R1.getEditText());
                    break;
                }
                break;
            case 22:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 23:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((sm0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i3 == 0) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
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
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((gy0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.s() != false) goto L155;
     */
    @Override // u4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        zy zyVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.k kVar;
        eh.g gVar;
        org.telegram.ui.Components.u20 u20Var;
        eh.g gVar2;
        int i11 = this.a;
        boolean z10 = false;
        r4 = false;
        boolean z11 = false;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.M.Q0.G();
                    i4 i4Var = l3Var.M;
                    u3 u3Var = i4Var.L;
                    if (u3Var != null) {
                        u3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.M.d0();
                    i4 i4Var2 = l3Var.M;
                    u3 u3Var2 = i4Var2.L;
                    if (u3Var2 == null || u3Var2.G) {
                        i4Var2.V(i4Var2.K0 - i10);
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
                i4 i4Var3 = (i4) obj;
                if (i4Var3.j0.x.J1) {
                    org.telegram.messenger.g0.v1(i4Var3.i0.c0);
                    break;
                }
                break;
            case 3:
                z6 z6Var = (z6) obj;
                if (!z6Var.b.canScrollVertically(-1)) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) z6Var).simpleActionBar;
                    break;
                }
                z10 = true;
                qe.a aVar = z6Var.T;
                if (aVar != null) {
                    aVar.a(z10, true);
                    break;
                }
                break;
            case 4:
                ((i8) obj).v0();
                break;
            case 5:
                kb kbVar = (kb) obj;
                kbVar.w.invalidate();
                if (i10 != 0 && kbVar.T && !kbVar.R && kbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = kbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    kbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    kbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    kbVar.S.playTogether(ObjectAnimator.ofFloat(kbVar.N, "alpha", 1.0f));
                    kbVar.S.addListener(new org.telegram.ui.Cells.w9(this, i12));
                    kbVar.S.start();
                }
                kbVar.T0(true);
                kbVar.h1();
                break;
            case 10:
                ut utVar = (ut) obj;
                org.telegram.ui.Components.ga gaVar = utVar.r1;
                if (gaVar != null) {
                    org.telegram.ui.Components.ta0 ta0Var = gaVar.i0;
                    if (ta0Var != null && ta0Var.getTop() == gaVar.k0) {
                        z11 = true;
                    }
                    utVar.t1 = !z11;
                    gaVar.invalidate();
                    break;
                }
                break;
            case 11:
                ez ezVar = (ez) obj;
                if (ezVar.a.J1 && (zyVar = ezVar.L) != null && (f3Var = zyVar.b) != null) {
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
                ((l00) obj).s.invalidate();
                break;
            case 13:
                e40 e40Var = (e40) obj;
                if (e40Var.A0 == null) {
                    e40Var.A0 = (ic) e40Var.F0(e40Var.a0);
                }
                int measuredHeight = e40Var.A0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = e40Var.A0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                e40Var.B0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(e40Var.B0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                e40Var.A0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                e40Var.A0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                e40Var.A0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (e40Var.B0 < 1.0f) {
                    e40Var.A0.setTranslationY(0.0f);
                    break;
                } else {
                    e40Var.A0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                r40 r40Var = (r40) obj;
                int L0 = r40Var.r.L0();
                View childAt = r40Var.n.getChildAt(0);
                ((qe.a) r40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < r40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = r40Var.q0) != null) {
                    gVar.f(i3, i10);
                    r40Var.j0();
                    break;
                }
                break;
            case 19:
                ((vf0) obj).K.invalidate();
                break;
            case 20:
                dg0 dg0Var = (dg0) obj;
                int L02 = dg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(dg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !dg0Var.W && !dg0Var.F && !dg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && dg0Var.E) {
                    dg0Var.h0();
                    break;
                }
                break;
            case 23:
                sm0 sm0Var = (sm0) obj;
                if (sm0Var.K == null) {
                    int L03 = sm0Var.N.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(sm0Var.N.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > sm0Var.N.B() - 2 && !sm0Var.r && !sm0Var.s) {
                        sm0Var.i0(sm0Var.w, sm0Var.x, sm0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                fr0 fr0Var = (fr0) obj;
                if (i10 != 0 && (u20Var = fr0Var.h) != null) {
                    u20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                if (ow0Var != null && ow0Var.s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.z5)) {
                        fr0Var.R.f();
                        break;
                    } else {
                        u51 u51Var = fr0Var.c;
                        View F = u51Var.F((org.telegram.ui.Cells.z5) delegate);
                        u4.d1 T = F == null ? null : u51Var.T(F);
                        if (T == null) {
                            fr0Var.R.f();
                            break;
                        } else {
                            View view = T.a;
                            if (fr0Var.R.getDirection() == 0) {
                                fr0Var.R.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fr0Var.R.setTranslationY(view.getY());
                            }
                            u4.b0 b0Var = fr0Var.d;
                            if (!b0Var.c.O(view) || !b0Var.d.O(view)) {
                                fr0Var.R.f();
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
                    gVar2.f(i3, i10);
                    premiumPreviewFragment.o0();
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.w0((PrivacyControlActivity) obj);
                break;
            case 27:
                it0 it0Var = (it0) obj;
                if (!it0Var.getMessagesController().J0) {
                    int abs3 = Math.abs(it0Var.b.N0() - it0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && it0Var.b.N0() >= b11 - 10) {
                        it0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 28:
                dy0 dy0Var = (dy0) obj;
                dy0Var.e.invalidate();
                ey0 ey0Var = dy0Var.w;
                int i13 = ey0.t1;
                ey0Var.b.invalidate();
                break;
        }
    }

    public h3(kb kbVar) {
        this.a = 5;
        this.b = kbVar;
        org.telegram.messenger.g0.L(100.0f);
    }

    private final void c(RecyclerView recyclerView, int i3) {
    }

    private final void d(RecyclerView recyclerView, int i3) {
    }

    private final void e(RecyclerView recyclerView, int i3, int i10) {
    }

    private final void f(RecyclerView recyclerView, int i3, int i10) {
    }
}
