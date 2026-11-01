package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.i5 i5Var2;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.b).L.P0.V();
                    break;
                }
                break;
            case 5:
                sb sbVar = (sb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        sbVar.S = false;
                        sbVar.V = false;
                        sbVar.Y0(true);
                        break;
                    }
                } else {
                    sbVar.S = true;
                    sbVar.V = true;
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((un) this.b).l1);
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((iq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((pr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((qt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                o10 o10Var = (o10) this.b;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(16.0f) + o10Var.p0().getBottom();
                    if (o10Var.w <= 0.5f) {
                        if ((o10Var.c.getLayoutManager() != null ? o10Var.c.getLayoutManager().m(0) : null) != null) {
                            if (o10Var.q0() + r6.getTop() < 0.0f) {
                                o10Var.c.w0(0, Math.round(o10Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        o10Var.c.w0(0, o10Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                h50 h50Var = (h50) this.b;
                if (i10 == 0) {
                    float f7 = h50Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        lVar = ((org.telegram.ui.ActionBar.k2) h50Var).actionBar;
                        int bottom = lVar.getBottom();
                        s4.n0 layoutManager = h50Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            h50Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m11 = h50Var.M.getLayoutManager() != null ? h50Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            h50Var.M.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                u50 u50Var = (u50) this.b;
                if (i10 == 1) {
                    u50Var.f.r.m();
                    org.telegram.messenger.i0.v1(u50Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((b60) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((j60) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                x60 x60Var = (x60) this.b;
                if (i10 == 1) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) x60Var).simpleActionBar;
                    if (i5Var.F) {
                        i5Var2 = ((org.telegram.ui.ActionBar.k2) x60Var).simpleActionBar;
                        org.telegram.messenger.i0.v1(i5Var2.getSearchField());
                        break;
                    }
                }
                break;
            case 18:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 21:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((uh0) this.b).Q1.getEditText());
                    break;
                }
                break;
            case 22:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 23:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((jo0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i10 == 0) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                    int L2 = org.telegram.messenger.i0.L(16.0f) + lVar2.getBottom();
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
            case 28:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((e01) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ec, code lost:
    
        if (r8.s() != false) goto L155;
     */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.i5 i5Var;
        c00 c00Var;
        org.telegram.ui.Cells.h3 h3Var;
        org.telegram.ui.ActionBar.l lVar;
        tg.f fVar;
        org.telegram.ui.Components.q30 q30Var;
        tg.f fVar2;
        int i12 = this.a;
        boolean z10 = false;
        r4 = false;
        boolean z11 = false;
        Object obj = this.b;
        switch (i12) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.L.P0.G();
                    h4 h4Var = l3Var.L;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.L.d0();
                    h4 h4Var2 = l3Var.L;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.V(h4Var2.J0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                n nVar = (n) obj;
                if (!nVar.I && !nVar.r && nVar.d.N0() > nVar.E - 2) {
                    nVar.b0();
                    break;
                }
                break;
            case 2:
                h4 h4Var3 = (h4) obj;
                if (h4Var3.i0.x.I1) {
                    org.telegram.messenger.i0.v1(h4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                y6 y6Var = (y6) obj;
                if (!y6Var.b.canScrollVertically(-1)) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
                    break;
                }
                z10 = true;
                fe.b bVar = y6Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    break;
                }
                break;
            case 4:
                ((h8) obj).v0();
                break;
            case 5:
                sb sbVar = (sb) obj;
                sbVar.w.invalidate();
                if (i11 != 0 && sbVar.S && !sbVar.Q && sbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = sbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    sbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    sbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    sbVar.R.playTogether(ObjectAnimator.ofFloat(sbVar.M, "alpha", 1.0f));
                    sbVar.R.addListener(new s9(this, 11));
                    sbVar.R.start();
                }
                sbVar.T0(true);
                sbVar.h1();
                break;
            case 10:
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.ba baVar = yuVar.q1;
                if (baVar != null) {
                    org.telegram.ui.Components.rb0 rb0Var = baVar.h0;
                    if (rb0Var != null && rb0Var.getTop() == baVar.j0) {
                        z11 = true;
                    }
                    yuVar.s1 = !z11;
                    baVar.invalidate();
                    break;
                }
                break;
            case 11:
                h00 h00Var = (h00) obj;
                if (h00Var.a.I1 && (c00Var = h00Var.K) != null && (h3Var = c00Var.b) != null) {
                    if (!h3Var.e) {
                        h3Var.d();
                        break;
                    } else {
                        h3Var.k(true);
                        break;
                    }
                }
                break;
            case 12:
                ((o10) obj).s.invalidate();
                break;
            case 13:
                h50 h50Var = (h50) obj;
                if (h50Var.z0 == null) {
                    h50Var.z0 = (sc) h50Var.F0(h50Var.Z);
                }
                int measuredHeight = h50Var.z0.getMeasuredHeight();
                lVar = ((org.telegram.ui.ActionBar.k2) h50Var).actionBar;
                int measuredHeight2 = measuredHeight - lVar.getMeasuredHeight();
                float top = h50Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                h50Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(h50Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                h50Var.z0.b.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                h50Var.z0.f.setAlpha(org.telegram.messenger.i0.T1(1.0f, 0.0f, min));
                h50Var.z0.c.setAlpha(org.telegram.messenger.i0.T1(0.0f, 1.0f, min2));
                if (h50Var.A0 < 1.0f) {
                    h50Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    h50Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 14:
                u50 u50Var = (u50) obj;
                int L0 = u50Var.r.L0();
                View childAt = u50Var.n.getChildAt(0);
                ((fe.b) u50Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < u50Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = u50Var.p0) != null) {
                    fVar.f(i10, i11);
                    u50Var.j0();
                    break;
                }
                break;
            case 19:
                ((ih0) obj).J.invalidate();
                break;
            case 20:
                qh0 qh0Var = (qh0) obj;
                int L02 = qh0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(qh0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !qh0Var.V && !qh0Var.E && !qh0Var.y.isEmpty() && L02 + abs >= b10 - 5 && qh0Var.D) {
                    qh0Var.h0();
                    break;
                }
                break;
            case 23:
                jo0 jo0Var = (jo0) obj;
                if (jo0Var.J == null) {
                    int L03 = jo0Var.M.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(jo0Var.M.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > jo0Var.M.B() - 2 && !jo0Var.r && !jo0Var.s) {
                        jo0Var.i0(jo0Var.w, jo0Var.x, jo0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                zs0 zs0Var = (zs0) obj;
                if (i11 != 0 && (q30Var = zs0Var.h) != null) {
                    q30Var.b(true);
                }
                org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
                if (tx0Var != null && tx0Var.s) {
                    org.telegram.ui.Components.rx0 delegate = tx0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.e6)) {
                        zs0Var.Q.f();
                        break;
                    } else {
                        u71 u71Var = zs0Var.c;
                        View F = u71Var.F((org.telegram.ui.Cells.e6) delegate);
                        s4.c1 T = F == null ? null : u71Var.T(F);
                        if (T == null) {
                            zs0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (zs0Var.Q.getDirection() == 0) {
                                zs0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zs0Var.Q.setTranslationY(view.getY());
                            }
                            s4.a0 a0Var = zs0Var.d;
                            if (!a0Var.c.S(view) || !a0Var.d.S(view)) {
                                zs0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = premiumPreviewFragment.w0) != null) {
                    fVar2.f(i10, i11);
                    premiumPreviewFragment.o0();
                    break;
                }
                break;
            case 26:
                zu0 zu0Var = (zu0) obj;
                if (!zu0Var.getMessagesController().I0) {
                    int abs3 = Math.abs(zu0Var.b.N0() - zu0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && zu0Var.b.N0() >= b11 - 10) {
                        zu0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 27:
                a01 a01Var = (a01) obj;
                a01Var.e.invalidate();
                b01 b01Var = a01Var.w;
                int i13 = b01.s1;
                b01Var.b.invalidate();
                break;
            case 29:
                ((r31) obj).d1();
                break;
        }
    }

    public h3(sb sbVar) {
        this.a = 5;
        this.b = sbVar;
        org.telegram.messenger.i0.L(100.0f);
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
