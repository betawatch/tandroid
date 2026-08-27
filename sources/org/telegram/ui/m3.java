package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m3 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((q3) this.b).G.K0.W();
                    break;
                }
                break;
            case 4:
                qb qbVar = (qb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        qbVar.S = false;
                        qbVar.V = false;
                        qbVar.T0(true);
                        break;
                    }
                } else {
                    qbVar.S = true;
                    qbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rn) this.b).T0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                a20 a20Var = (a20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (a20Var.v <= 0.5f) {
                        View m11 = a20Var.c.getLayoutManager() != null ? a20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            a20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        a20Var.c.v0(0, a20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                c60 c60Var = (c60) this.b;
                if (i10 == 0) {
                    float f10 = c60Var.w0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) c60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.x0 layoutManager = c60Var.I.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            c60Var.I.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m12 = c60Var.I.getLayoutManager() != null ? c60Var.I.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            c60Var.I.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                o60 o60Var = (o60) this.b;
                if (i10 == 1) {
                    o60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(o60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u60) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((c70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                t70 t70Var = (t70) this.b;
                if (i10 == 1) {
                    t70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(t70Var.d.d);
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
                    tc0 tc0Var = (tc0) this.b;
                    if (tc0Var.n0 && tc0Var.o0) {
                        AndroidUtilities.hideKeyboard(tc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((dj0) this.b).U.getEditText());
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
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.b0 <= 0.5f) {
                        View m13 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m13 != null && m13.getTop() < 0) {
                            premiumPreviewFragment.a.v0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.v0(0, premiumPreviewFragment.Y - dp2, null);
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
        }
    }

    @Override // f2.b1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        k00 k00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.k kVar;
        jg.e eVar;
        jg.e eVar2;
        org.telegram.ui.Components.x30 x30Var;
        jg.e eVar3;
        ViewGroup viewGroup;
        jg.e eVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                q3 q3Var = (q3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    q3Var.G.K0.H();
                    m4 m4Var = q3Var.G;
                    z3 z3Var = m4Var.G;
                    if (z3Var != null) {
                        z3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = m4Var.b0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    q3Var.G.f0();
                    m4 m4Var2 = q3Var.G;
                    z3 z3Var2 = m4Var2.G;
                    if (z3Var2 == null || z3Var2.B) {
                        m4Var2.X(m4Var2.E0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                q qVar = (q) obj;
                if (!qVar.E && !qVar.r && qVar.d.N0() > qVar.A - 2) {
                    qVar.W();
                    break;
                }
                break;
            case 2:
                m4 m4Var3 = (m4) obj;
                if (m4Var3.e0.w.G1) {
                    AndroidUtilities.hideKeyboard(m4Var3.d0.U);
                    break;
                }
                break;
            case 3:
                ((h8) obj).p0();
                break;
            case 4:
                qb qbVar = (qb) obj;
                qbVar.A.invalidate();
                if (i11 != 0 && qbVar.S && !qbVar.Q && qbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = qbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    qbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    qbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    qbVar.R.playTogether(ObjectAnimator.ofFloat(qbVar.M, "alpha", 1.0f));
                    qbVar.R.addListener(new lh.h9(this, 22));
                    qbVar.R.start();
                }
                if (i11 != 0) {
                    qbVar.U0(1);
                }
                qbVar.O0(true);
                qbVar.d1();
                break;
            case 9:
                av avVar = (av) obj;
                org.telegram.ui.Components.la laVar = avVar.s;
                if (laVar != null) {
                    avVar.w = !laVar.Z();
                    laVar.invalidate();
                    break;
                }
                break;
            case 10:
                q00 q00Var = (q00) obj;
                if (q00Var.a.G1 && (k00Var = q00Var.G) != null && (b3Var = k00Var.b) != null) {
                    if (!b3Var.e) {
                        b3Var.d();
                        break;
                    } else {
                        b3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((a20) obj).s.invalidate();
                break;
            case 12:
                c60 c60Var = (c60) obj;
                if (c60Var.v0 == null) {
                    c60Var.v0 = (qc) c60Var.y0(c60Var.V);
                }
                int measuredHeight = c60Var.v0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) c60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = c60Var.v0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                c60Var.w0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(c60Var.w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                c60Var.v0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                c60Var.v0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                c60Var.v0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (c60Var.w0 < 1.0f) {
                    c60Var.v0.setTranslationY(0.0f);
                    break;
                } else {
                    c60Var.v0.setTranslationY(top - f10);
                    break;
                }
            case 13:
                o60 o60Var = (o60) obj;
                int L0 = o60Var.r.L0();
                View childAt = o60Var.n.getChildAt(0);
                o60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < o60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = o60Var.l0) != null) {
                    eVar.f(i10, i11);
                    o60Var.e0();
                    break;
                }
                break;
            case 16:
                t70 t70Var = (t70) obj;
                t70Var.n.L0();
                View childAt2 = t70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = t70Var.H) != null) {
                    eVar2.f(i10, i11);
                    t70Var.Y();
                    break;
                }
                break;
            case 19:
                ((ni0) obj).G.invalidate();
                break;
            case 20:
                vi0 vi0Var = (vi0) obj;
                int L02 = vi0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(vi0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !vi0Var.R && !vi0Var.A && !vi0Var.x.isEmpty() && L02 + abs >= h - 5 && vi0Var.y) {
                    vi0Var.b0();
                    break;
                }
                break;
            case 23:
                vo0.a((vo0) obj);
                break;
            case 24:
                yu0 yu0Var = (yu0) obj;
                if (i11 != 0 && (x30Var = yu0Var.h) != null) {
                    x30Var.b(true);
                }
                org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
                if (wx0Var != null && wx0Var.s) {
                    org.telegram.ui.Components.ux0 delegate = wx0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.z5)) {
                        yu0Var.M.f();
                        break;
                    } else {
                        ta1 ta1Var = yu0Var.c;
                        View F = ta1Var.F((org.telegram.ui.Cells.z5) delegate);
                        f2.o1 T = F == null ? null : ta1Var.T(F);
                        if (T == null) {
                            yu0Var.M.f();
                            break;
                        } else {
                            View view = T.a;
                            if (yu0Var.M.getDirection() == 0) {
                                yu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                yu0Var.M.setTranslationY(view.getY());
                            }
                            f2.k0 k0Var = yu0Var.d;
                            if (!k0Var.c.I(view) || !k0Var.d.I(view)) {
                                yu0Var.M.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.Z.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.q0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 26:
                cx0 cx0Var = (cx0) obj;
                if (!cx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(cx0Var.b.N0() - cx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && cx0Var.b.N0() >= h10 - 10) {
                        cx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                w21 w21Var = (w21) obj;
                w21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) w21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                x71 x71Var = (x71) obj;
                x71Var.o0(false, true);
                if (x71Var.c.G1) {
                    AndroidUtilities.hideKeyboard(x71Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = x71Var.R) != null) {
                    eVar4.f(i10, i11);
                    x71Var.i0();
                    break;
                }
                break;
        }
    }

    public m3(qb qbVar) {
        this.a = 4;
        this.b = qbVar;
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
