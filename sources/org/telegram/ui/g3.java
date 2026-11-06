package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    org.telegram.messenger.g0.v1(((an) this.b).l1);
                    break;
                }
                break;
            case 7:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kp) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((oq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((qs) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                o00 o00Var = (o00) this.b;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(16.0f) + o00Var.p0().getBottom();
                    if (o00Var.w <= 0.5f) {
                        if ((o00Var.c.getLayoutManager() != null ? o00Var.c.getLayoutManager().m(0) : null) != null) {
                            if (o00Var.q0() + r6.getTop() < 0.0f) {
                                o00Var.c.w0(0, Math.round(o00Var.q0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        o00Var.c.w0(0, o00Var.r - L, null);
                        break;
                    }
                }
                break;
            case 13:
                j40 j40Var = (j40) this.b;
                if (i7 == 0) {
                    float f10 = j40Var.A0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar = ((org.telegram.ui.ActionBar.f2) j40Var).actionBar;
                        int bottom = kVar.getBottom();
                        v4.n0 layoutManager = j40Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            j40Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = j40Var.M.getLayoutManager() != null ? j40Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            j40Var.M.w0(0, m11.getTop(), null);
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
                    org.telegram.messenger.g0.v1(((d50) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((m50) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                z50 z50Var = (z50) this.b;
                if (i7 == 1) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) z50Var).simpleActionBar;
                    if (y4Var.F) {
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) z50Var).simpleActionBar;
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
                    org.telegram.messenger.g0.v1(((qg0) this.b).Q1.getEditText());
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
                    org.telegram.messenger.g0.v1(((xm0) this.b).getParentActivity().getCurrentFocus());
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
                    org.telegram.messenger.g0.v1(((qy0) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ea, code lost:
    
        if (r8.s() != false) goto L155;
     */
    @Override // v4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.y4 y4Var;
        bz bzVar;
        org.telegram.ui.Cells.f3 f3Var;
        org.telegram.ui.ActionBar.k kVar;
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
                wt wtVar = (wt) obj;
                org.telegram.ui.Components.ha haVar = wtVar.q1;
                if (haVar != null) {
                    org.telegram.ui.Components.ya0 ya0Var = haVar.h0;
                    if (ya0Var != null && ya0Var.getTop() == haVar.j0) {
                        z10 = true;
                    }
                    wtVar.s1 = !z10;
                    haVar.invalidate();
                    break;
                }
                break;
            case 11:
                gz gzVar = (gz) obj;
                if (gzVar.a.I1 && (bzVar = gzVar.K) != null && (f3Var = bzVar.b) != null) {
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
                ((o00) obj).s.invalidate();
                break;
            case 13:
                j40 j40Var = (j40) obj;
                if (j40Var.z0 == null) {
                    j40Var.z0 = (kc) j40Var.F0(j40Var.Z);
                }
                int measuredHeight = j40Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.f2) j40Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = j40Var.z0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                j40Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(j40Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                j40Var.z0.b.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.z0.f.setAlpha(org.telegram.messenger.g0.T1(1.0f, 0.0f, min));
                j40Var.z0.c.setAlpha(org.telegram.messenger.g0.T1(0.0f, 1.0f, min2));
                if (j40Var.A0 < 1.0f) {
                    j40Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    j40Var.z0.setTranslationY(top - f10);
                    break;
                }
            case 14:
                w40 w40Var = (w40) obj;
                int L0 = w40Var.r.L0();
                View childAt = w40Var.n.getChildAt(0);
                ((te.a) w40Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < w40Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (gVar = w40Var.p0) != null) {
                    gVar.f(i7, i10);
                    w40Var.j0();
                    break;
                }
                break;
            case 19:
                ((bg0) obj).J.invalidate();
                break;
            case 20:
                jg0 jg0Var = (jg0) obj;
                int L02 = jg0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(jg0Var.h.N0() - L02) + 1 : 0;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && !jg0Var.V && !jg0Var.E && !jg0Var.y.isEmpty() && L02 + abs >= b10 - 5 && jg0Var.D) {
                    jg0Var.h0();
                    break;
                }
                break;
            case 23:
                xm0 xm0Var = (xm0) obj;
                if (xm0Var.J == null) {
                    int L03 = xm0Var.M.L0();
                    int abs2 = L03 == -1 ? 0 : Math.abs(xm0Var.M.N0() - L03) + 1;
                    if (abs2 > 0 && L03 + abs2 > xm0Var.M.B() - 2 && !xm0Var.r && !xm0Var.s) {
                        xm0Var.i0(xm0Var.w, xm0Var.x, xm0Var.a == 1, true);
                        break;
                    }
                }
                break;
            case 24:
                pr0 pr0Var = (pr0) obj;
                if (i10 != 0 && (y20Var = pr0Var.h) != null) {
                    y20Var.a();
                }
                org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
                if (ow0Var != null && ow0Var.s) {
                    org.telegram.ui.Components.mw0 delegate = ow0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.a6)) {
                        pr0Var.Q.f();
                        break;
                    } else {
                        e61 e61Var = pr0Var.c;
                        View F = e61Var.F((org.telegram.ui.Cells.a6) delegate);
                        v4.d1 T = F == null ? null : e61Var.T(F);
                        if (T == null) {
                            pr0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (pr0Var.Q.getDirection() == 0) {
                                pr0Var.Q.setTranslationY((view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight());
                            } else {
                                pr0Var.Q.setTranslationY(view.getY());
                            }
                            v4.b0 b0Var = pr0Var.d;
                            if (!b0Var.c.e(view) || !b0Var.d.e(view)) {
                                pr0Var.Q.f();
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
                st0 st0Var = (st0) obj;
                if (!st0Var.getMessagesController().I0) {
                    int abs3 = Math.abs(st0Var.b.N0() - st0Var.b.L0()) + 1;
                    int b11 = recyclerView.getAdapter().b();
                    if (abs3 > 0 && st0Var.b.N0() >= b11 - 10) {
                        st0Var.getMessagesController().F0(false);
                        break;
                    }
                }
                break;
            case 28:
                ny0 ny0Var = (ny0) obj;
                ny0Var.e.invalidate();
                oy0 oy0Var = ny0Var.w;
                int i12 = oy0.s1;
                oy0Var.b.invalidate();
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
