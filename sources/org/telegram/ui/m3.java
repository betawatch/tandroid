package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m3 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View m10;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((q3) this.b).G.K0.W();
                    break;
                }
                break;
            case 4:
                ob obVar = (ob) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        obVar.S = false;
                        obVar.V = false;
                        obVar.T0(true);
                        break;
                    }
                } else {
                    obVar.S = true;
                    obVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tn) this.b).T0);
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
                    AndroidUtilities.hideKeyboard(((jr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                z10 z10Var = (z10) this.b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
                    if (z10Var.v <= 0.5f) {
                        View m11 = z10Var.c.getLayoutManager() != null ? z10Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            z10Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        z10Var.c.v0(0, z10Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                a60 a60Var = (a60) this.b;
                if (i10 == 0) {
                    float f9 = a60Var.w0;
                    if (f9 >= 0.5f && f9 < 1.0f) {
                        lVar2 = ((org.telegram.ui.ActionBar.o2) a60Var).actionBar;
                        int bottom = lVar2.getBottom();
                        f2.w0 layoutManager = a60Var.I.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            a60Var.I.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f9 < 0.5f) {
                        View m12 = a60Var.I.getLayoutManager() != null ? a60Var.I.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            a60Var.I.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                m60 m60Var = (m60) this.b;
                if (i10 == 1) {
                    m60Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(m60Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((t60) this.b).c);
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
                s70 s70Var = (s70) this.b;
                if (i10 == 1) {
                    s70Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(s70Var.d.d);
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
                    rc0 rc0Var = (rc0) this.b;
                    if (rc0Var.n0 && rc0Var.o0) {
                        AndroidUtilities.hideKeyboard(rc0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zi0) this.b).U.getEditText());
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
                    lVar3 = ((org.telegram.ui.ActionBar.o2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + lVar3.getBottom();
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
                    AndroidUtilities.hideKeyboard(((b31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        j00 j00Var;
        org.telegram.ui.Cells.b3 b3Var;
        org.telegram.ui.ActionBar.l lVar;
        lg.e eVar;
        lg.e eVar2;
        org.telegram.ui.Components.g40 g40Var;
        lg.e eVar3;
        ViewGroup viewGroup;
        lg.e eVar4;
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
                r rVar = (r) obj;
                if (!rVar.E && !rVar.r && rVar.d.N0() > rVar.A - 2) {
                    rVar.W();
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
                ((f8) obj).p0();
                break;
            case 4:
                ob obVar = (ob) obj;
                obVar.A.invalidate();
                if (i11 != 0 && obVar.S && !obVar.Q && obVar.M.getTag() == null) {
                    AnimatorSet animatorSet = obVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    obVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    obVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    obVar.R.playTogether(ObjectAnimator.ofFloat(obVar.M, "alpha", 1.0f));
                    obVar.R.addListener(new nh.q5(this, 22));
                    obVar.R.start();
                }
                if (i11 != 0) {
                    obVar.U0(1);
                }
                obVar.O0(true);
                obVar.d1();
                break;
            case 9:
                yu yuVar = (yu) obj;
                org.telegram.ui.Components.sa saVar = yuVar.s;
                if (saVar != null) {
                    yuVar.w = !saVar.Z();
                    saVar.invalidate();
                    break;
                }
                break;
            case 10:
                p00 p00Var = (p00) obj;
                if (p00Var.a.G1 && (j00Var = p00Var.G) != null && (b3Var = j00Var.b) != null) {
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
                ((z10) obj).s.invalidate();
                break;
            case 12:
                a60 a60Var = (a60) obj;
                if (a60Var.v0 == null) {
                    a60Var.v0 = (oc) a60Var.y0(a60Var.V);
                }
                int measuredHeight = a60Var.v0.getMeasuredHeight();
                lVar = ((org.telegram.ui.ActionBar.o2) a60Var).actionBar;
                int measuredHeight2 = measuredHeight - lVar.getMeasuredHeight();
                float top = a60Var.v0.getTop() * (-1);
                float f9 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f9), 0.0f);
                a60Var.w0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(a60Var.w0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                a60Var.v0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                a60Var.v0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                a60Var.v0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (a60Var.w0 < 1.0f) {
                    a60Var.v0.setTranslationY(0.0f);
                    break;
                } else {
                    a60Var.v0.setTranslationY(top - f9);
                    break;
                }
            case 13:
                m60 m60Var = (m60) obj;
                int L0 = m60Var.r.L0();
                View childAt = m60Var.n.getChildAt(0);
                m60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < m60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = m60Var.l0) != null) {
                    eVar.f(i10, i11);
                    m60Var.e0();
                    break;
                }
                break;
            case 16:
                s70 s70Var = (s70) obj;
                s70Var.n.L0();
                View childAt2 = s70Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = s70Var.H) != null) {
                    eVar2.f(i10, i11);
                    s70Var.Y();
                    break;
                }
                break;
            case 19:
                ((ki0) obj).G.invalidate();
                break;
            case 20:
                si0 si0Var = (si0) obj;
                int L02 = si0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(si0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !si0Var.R && !si0Var.A && !si0Var.x.isEmpty() && L02 + abs >= h - 5 && si0Var.y) {
                    si0Var.b0();
                    break;
                }
                break;
            case 23:
                to0.a((to0) obj);
                break;
            case 24:
                vu0 vu0Var = (vu0) obj;
                if (i11 != 0 && (g40Var = vu0Var.h) != null) {
                    g40Var.b(true);
                }
                org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
                if (fy0Var != null && fy0Var.s) {
                    org.telegram.ui.Components.dy0 delegate = fy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.a6)) {
                        vu0Var.M.f();
                        break;
                    } else {
                        wa1 wa1Var = vu0Var.c;
                        View F = wa1Var.F((org.telegram.ui.Cells.a6) delegate);
                        f2.n1 T = F == null ? null : wa1Var.T(F);
                        if (T == null) {
                            vu0Var.M.f();
                            break;
                        } else {
                            View view = T.a;
                            if (vu0Var.M.getDirection() == 0) {
                                vu0Var.M.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                vu0Var.M.setTranslationY(view.getY());
                            }
                            f2.j0 j0Var = vu0Var.d;
                            if (!j0Var.c.M(view) || !j0Var.d.M(view)) {
                                vu0Var.M.f();
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
                bx0 bx0Var = (bx0) obj;
                if (!bx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(bx0Var.b.N0() - bx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && bx0Var.b.N0() >= h10 - 10) {
                        bx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                x21 x21Var = (x21) obj;
                x21Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) x21Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                b81 b81Var = (b81) obj;
                b81Var.o0(false, true);
                if (b81Var.c.G1) {
                    AndroidUtilities.hideKeyboard(b81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = b81Var.R) != null) {
                    eVar4.f(i10, i11);
                    b81Var.i0();
                    break;
                }
                break;
        }
    }

    public m3(ob obVar) {
        this.a = 4;
        this.b = obVar;
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
