package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l3 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
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
                    AndroidUtilities.hideKeyboard(((kq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                m20 m20Var = (m20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) m20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (m20Var.v <= 0.5f) {
                        View m10 = m20Var.c.getLayoutManager() != null ? m20Var.c.getLayoutManager().m(0) : null;
                        if (m10 != null && m10.getTop() < 0) {
                            m20Var.c.v0(0, m10.getTop(), null);
                            break;
                        }
                    } else {
                        m20Var.c.v0(0, m20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                n60 n60Var = (n60) this.b;
                if (i10 == 0) {
                    float f10 = n60Var.x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) n60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.w0 layoutManager = n60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            n60Var.J.v0(0, m9.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = n60Var.J.getLayoutManager() != null ? n60Var.J.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            n60Var.J.v0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                z60 z60Var = (z60) this.b;
                if (i10 == 1) {
                    z60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(z60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((f70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((n70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                d80 d80Var = (d80) this.b;
                if (i10 == 1) {
                    d80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(d80Var.d.d);
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
                    bd0 bd0Var = (bd0) this.b;
                    if (bd0Var.o0 && bd0Var.p0) {
                        AndroidUtilities.hideKeyboard(bd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ij0) this.b).V.getEditText());
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
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((jd1) this.b).o0 = false;
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        v00 v00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        og.e eVar;
        og.e eVar2;
        org.telegram.ui.Components.m40 m40Var;
        og.e eVar3;
        ViewGroup viewGroup;
        og.e eVar4;
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
                hv hvVar = (hv) obj;
                org.telegram.ui.Components.na naVar = hvVar.s;
                if (naVar != null) {
                    hvVar.w = !naVar.Z();
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
                ((m20) obj).s.invalidate();
                break;
            case 12:
                n60 n60Var = (n60) obj;
                if (n60Var.w0 == null) {
                    n60Var.w0 = (tc) n60Var.y0(n60Var.W);
                }
                int measuredHeight = n60Var.w0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.p2) n60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = n60Var.w0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                n60Var.x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(n60Var.x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                n60Var.w0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.w0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.w0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (n60Var.x0 < 1.0f) {
                    n60Var.w0.setTranslationY(0.0f);
                    break;
                } else {
                    n60Var.w0.setTranslationY(top - f10);
                    break;
                }
            case 13:
                z60 z60Var = (z60) obj;
                int L0 = z60Var.r.L0();
                View childAt = z60Var.n.getChildAt(0);
                z60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < z60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = z60Var.m0) != null) {
                    eVar.f(i10, i11);
                    z60Var.e0();
                    break;
                }
                break;
            case 16:
                d80 d80Var = (d80) obj;
                d80Var.n.L0();
                View childAt2 = d80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = d80Var.I) != null) {
                    eVar2.f(i10, i11);
                    d80Var.Y();
                    break;
                }
                break;
            case 19:
                ((ti0) obj).H.invalidate();
                break;
            case 20:
                bj0 bj0Var = (bj0) obj;
                int L02 = bj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(bj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !bj0Var.S && !bj0Var.B && !bj0Var.x.isEmpty() && L02 + abs >= h - 5 && bj0Var.y) {
                    bj0Var.b0();
                    break;
                }
                break;
            case 23:
                mv0 mv0Var = (mv0) obj;
                if (i11 != 0 && (m40Var = mv0Var.h) != null) {
                    m40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                if (qy0Var != null && qy0Var.s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        mv0Var.N.f();
                        break;
                    } else {
                        qb1 qb1Var = mv0Var.c;
                        View F = qb1Var.F((org.telegram.ui.Cells.c6) delegate);
                        f2.m1 T = F == null ? null : qb1Var.T(F);
                        if (T == null) {
                            mv0Var.N.f();
                            break;
                        } else {
                            View view = T.a;
                            if (mv0Var.N.getDirection() == 0) {
                                mv0Var.N.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                mv0Var.N.setTranslationY(view.getY());
                            }
                            f2.j0 j0Var = mv0Var.d;
                            if (!j0Var.c.V(view) || !j0Var.d.V(view)) {
                                mv0Var.N.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.a0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.r0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                tx0 tx0Var = (tx0) obj;
                if (!tx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(tx0Var.b.N0() - tx0Var.b.L0()) + 1;
                    int h9 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && tx0Var.b.N0() >= h9 - 10) {
                        tx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                p31 p31Var = (p31) obj;
                p31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) p31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                v81 v81Var = (v81) obj;
                v81Var.o0(false, true);
                if (v81Var.c.H1) {
                    AndroidUtilities.hideKeyboard(v81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = v81Var.S) != null) {
                    eVar4.f(i10, i11);
                    v81Var.i0();
                    break;
                }
                break;
            case 29:
                jd1 jd1Var = (jd1) obj;
                jd1Var.r0.e1();
                jd1Var.o0 = true;
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
