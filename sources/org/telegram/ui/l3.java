package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l3 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m9;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((p3) this.b).H.L0.W();
                    break;
                }
                break;
            case 4:
                sb sbVar = (sb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        sbVar.T = false;
                        sbVar.W = false;
                        sbVar.T0(true);
                        break;
                    }
                } else {
                    sbVar.T = true;
                    sbVar.W = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((xn) this.b).U0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                l20 l20Var = (l20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) l20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (l20Var.v <= 0.5f) {
                        View m10 = l20Var.c.getLayoutManager() != null ? l20Var.c.getLayoutManager().m(0) : null;
                        if (m10 != null && m10.getTop() < 0) {
                            l20Var.c.v0(0, m10.getTop(), null);
                            break;
                        }
                    } else {
                        l20Var.c.v0(0, l20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                m60 m60Var = (m60) this.b;
                if (i10 == 0) {
                    float f10 = m60Var.x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) m60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.v0 layoutManager = m60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            m60Var.J.v0(0, m9.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = m60Var.J.getLayoutManager() != null ? m60Var.J.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            m60Var.J.v0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                y60 y60Var = (y60) this.b;
                if (i10 == 1) {
                    y60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(y60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((e70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((m70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                c80 c80Var = (c80) this.b;
                if (i10 == 1) {
                    c80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(c80Var.d.d);
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
                    ad0 ad0Var = (ad0) this.b;
                    if (ad0Var.o0 && ad0Var.p0) {
                        AndroidUtilities.hideKeyboard(ad0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((hj0) this.b).V.getEditText());
                    break;
                }
                break;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((NotificationsCustomSettingsActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                if (i10 == 0) {
                    kVar3 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.c0 <= 0.5f) {
                        View m12 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            premiumPreviewFragment.a.v0(0, m12.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.v0(0, premiumPreviewFragment.Z - dp2, null);
                        break;
                    }
                }
                break;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        v00 v00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        ng.e eVar;
        ng.e eVar2;
        org.telegram.ui.Components.k40 k40Var;
        ng.e eVar3;
        ViewGroup viewGroup;
        ng.e eVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                p3 p3Var = (p3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    p3Var.H.L0.H();
                    l4 l4Var = p3Var.H;
                    y3 y3Var = l4Var.H;
                    if (y3Var != null) {
                        y3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = l4Var.c0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    p3Var.H.f0();
                    l4 l4Var2 = p3Var.H;
                    y3 y3Var2 = l4Var2.H;
                    if (y3Var2 == null || y3Var2.C) {
                        l4Var2.X(l4Var2.F0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                r rVar = (r) obj;
                if (!rVar.F && !rVar.r && rVar.d.N0() > rVar.B - 2) {
                    rVar.W();
                    break;
                }
                break;
            case 2:
                l4 l4Var3 = (l4) obj;
                if (l4Var3.f0.w.H1) {
                    AndroidUtilities.hideKeyboard(l4Var3.e0.V);
                    break;
                }
                break;
            case 3:
                ((j8) obj).p0();
                break;
            case 4:
                sb sbVar = (sb) obj;
                sbVar.B.invalidate();
                if (i11 != 0 && sbVar.T && !sbVar.R && sbVar.N.getTag() == null) {
                    AnimatorSet animatorSet = sbVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    sbVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    sbVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    sbVar.S.playTogether(ObjectAnimator.ofFloat(sbVar.N, "alpha", 1.0f));
                    sbVar.S.addListener(new s5(this, 13));
                    sbVar.S.start();
                }
                if (i11 != 0) {
                    sbVar.U0(1);
                }
                sbVar.O0(true);
                sbVar.d1();
                break;
            case 9:
                gv gvVar = (gv) obj;
                org.telegram.ui.Components.na naVar = gvVar.s;
                if (naVar != null) {
                    gvVar.w = !naVar.Z();
                    naVar.invalidate();
                    break;
                }
                break;
            case 10:
                b10 b10Var = (b10) obj;
                if (b10Var.a.H1 && (v00Var = b10Var.H) != null && (d3Var = v00Var.b) != null) {
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
                ((l20) obj).s.invalidate();
                break;
            case 12:
                m60 m60Var = (m60) obj;
                if (m60Var.w0 == null) {
                    m60Var.w0 = (uc) m60Var.y0(m60Var.W);
                }
                int measuredHeight = m60Var.w0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.p2) m60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = m60Var.w0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                m60Var.x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(m60Var.x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                m60Var.w0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                m60Var.w0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                m60Var.w0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (m60Var.x0 < 1.0f) {
                    m60Var.w0.setTranslationY(0.0f);
                    break;
                } else {
                    m60Var.w0.setTranslationY(top - f10);
                    break;
                }
            case 13:
                y60 y60Var = (y60) obj;
                int L0 = y60Var.r.L0();
                View childAt = y60Var.n.getChildAt(0);
                y60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < y60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = y60Var.m0) != null) {
                    eVar.f(i10, i11);
                    y60Var.e0();
                    break;
                }
                break;
            case 16:
                c80 c80Var = (c80) obj;
                c80Var.n.L0();
                View childAt2 = c80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = c80Var.I) != null) {
                    eVar2.f(i10, i11);
                    c80Var.Y();
                    break;
                }
                break;
            case 19:
                ((si0) obj).H.invalidate();
                break;
            case 20:
                aj0 aj0Var = (aj0) obj;
                int L02 = aj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(aj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !aj0Var.S && !aj0Var.B && !aj0Var.x.isEmpty() && L02 + abs >= h - 5 && aj0Var.y) {
                    aj0Var.b0();
                    break;
                }
                break;
            case 23:
                bp0.a((bp0) obj);
                break;
            case 24:
                fv0 fv0Var = (fv0) obj;
                if (i11 != 0 && (k40Var = fv0Var.h) != null) {
                    k40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
                if (qy0Var != null && qy0Var.s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        fv0Var.N.f();
                        break;
                    } else {
                        jb1 jb1Var = fv0Var.c;
                        View F = jb1Var.F((org.telegram.ui.Cells.c6) delegate);
                        f2.l1 T = F == null ? null : jb1Var.T(F);
                        if (T == null) {
                            fv0Var.N.f();
                            break;
                        } else {
                            View view = T.a;
                            if (fv0Var.N.getDirection() == 0) {
                                fv0Var.N.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                fv0Var.N.setTranslationY(view.getY());
                            }
                            f2.i0 i0Var = fv0Var.d;
                            if (!i0Var.c.V(view) || !i0Var.d.V(view)) {
                                fv0Var.N.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.a0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.r0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 26:
                mx0 mx0Var = (mx0) obj;
                if (!mx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(mx0Var.b.N0() - mx0Var.b.L0()) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && mx0Var.b.N0() >= h9 - 10) {
                        mx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                j31 j31Var = (j31) obj;
                j31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) j31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                o81 o81Var = (o81) obj;
                o81Var.o0(false, true);
                if (o81Var.c.H1) {
                    AndroidUtilities.hideKeyboard(o81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = o81Var.S) != null) {
                    eVar4.f(i10, i11);
                    o81Var.i0();
                    break;
                }
                break;
        }
    }

    public l3(sb sbVar) {
        this.a = 4;
        this.b = sbVar;
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
