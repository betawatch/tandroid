package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.b).K.O0.W();
                    break;
                }
                break;
            case 4:
                ub ubVar = (ub) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        ubVar.S = false;
                        ubVar.V = false;
                        ubVar.T0(true);
                        break;
                    }
                } else {
                    ubVar.S = true;
                    ubVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wn) this.b).X0);
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
                    AndroidUtilities.hideKeyboard(((pr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                m20 m20Var = (m20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) m20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (m20Var.v <= 0.5f) {
                        View m11 = m20Var.c.getLayoutManager() != null ? m20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            m20Var.c.v0(0, m11.getTop(), null);
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
                    float f7 = n60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.m2) n60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = n60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            n60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = n60Var.M.getLayoutManager() != null ? n60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            n60Var.M.v0(0, m12.getTop(), null);
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
                    AndroidUtilities.hideKeyboard(((g70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((o70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                g80 g80Var = (g80) this.b;
                if (i10 == 1) {
                    g80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(g80Var.d.d);
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
                    cd0 cd0Var = (cd0) this.b;
                    if (cd0Var.r0 && cd0Var.s0) {
                        AndroidUtilities.hideKeyboard(cd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((kj0) this.b).Y.getEditText());
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
                    kVar3 = ((org.telegram.ui.ActionBar.m2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + kVar3.getBottom();
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m13 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m13 != null && m13.getTop() < 0) {
                            premiumPreviewFragment.a.v0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.v0(0, premiumPreviewFragment.c0 - dp2, null);
                        break;
                    }
                }
                break;
            case 27:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((od1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        v00 v00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        ah.h hVar;
        ah.h hVar2;
        org.telegram.ui.Components.j40 j40Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                m3 m3Var = (m3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    m3Var.K.O0.H();
                    i4 i4Var = m3Var.K;
                    v3 v3Var = i4Var.K;
                    if (v3Var != null) {
                        v3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    m3Var.K.f0();
                    i4 i4Var2 = m3Var.K;
                    v3 v3Var2 = i4Var2.K;
                    if (v3Var2 == null || v3Var2.F) {
                        i4Var2.X(i4Var2.I0 - i11);
                        break;
                    }
                }
                break;
            case 1:
                q qVar = (q) obj;
                if (!qVar.I && !qVar.r && qVar.d.N0() > qVar.E - 2) {
                    qVar.W();
                    break;
                }
                break;
            case 2:
                i4 i4Var3 = (i4) obj;
                if (i4Var3.i0.w.K1) {
                    AndroidUtilities.hideKeyboard(i4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((h8) obj).p0();
                break;
            case 4:
                ub ubVar = (ub) obj;
                ubVar.v.invalidate();
                if (i11 != 0 && ubVar.S && !ubVar.Q && ubVar.M.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.R.playTogether(ObjectAnimator.ofFloat(ubVar.M, "alpha", 1.0f));
                    ubVar.R.addListener(new t4(this, 14));
                    ubVar.R.start();
                }
                ubVar.O0(true);
                ubVar.c1();
                break;
            case 9:
                fv fvVar = (fv) obj;
                org.telegram.ui.Components.va vaVar = fvVar.s;
                if (vaVar != null) {
                    fvVar.w = !vaVar.Z();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                b10 b10Var = (b10) obj;
                if (b10Var.a.K1 && (v00Var = b10Var.K) != null && (e3Var = v00Var.b) != null) {
                    if (!e3Var.e) {
                        e3Var.d();
                        break;
                    } else {
                        e3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((m20) obj).s.invalidate();
                break;
            case 12:
                n60 n60Var = (n60) obj;
                if (n60Var.z0 == null) {
                    n60Var.z0 = (tc) n60Var.y0(n60Var.Z);
                }
                int measuredHeight = n60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.m2) n60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = n60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                n60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(n60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                n60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                n60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (n60Var.A0 < 1.0f) {
                    n60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    n60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                z60 z60Var = (z60) obj;
                int L0 = z60Var.r.L0();
                View childAt = z60Var.n.getChildAt(0);
                z60Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < z60Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = z60Var.p0) != null) {
                    hVar.f(i10, i11);
                    z60Var.e0();
                    break;
                }
                break;
            case 16:
                g80 g80Var = (g80) obj;
                g80Var.n.L0();
                View childAt2 = g80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = g80Var.L) != null) {
                    hVar2.f(i10, i11);
                    g80Var.Y();
                    break;
                }
                break;
            case 19:
                ((vi0) obj).K.invalidate();
                break;
            case 20:
                dj0 dj0Var = (dj0) obj;
                int L02 = dj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(dj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !dj0Var.V && !dj0Var.E && !dj0Var.x.isEmpty() && L02 + abs >= h - 5 && dj0Var.y) {
                    dj0Var.b0();
                    break;
                }
                break;
            case 23:
                rv0 rv0Var = (rv0) obj;
                if (i11 != 0 && (j40Var = rv0Var.h) != null) {
                    j40Var.b(true);
                }
                org.telegram.ui.Components.xy0 xy0Var = rv0Var.Q;
                if (xy0Var != null && xy0Var.s) {
                    org.telegram.ui.Components.vy0 delegate = xy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        rv0Var.Q.f();
                        break;
                    } else {
                        wb1 wb1Var = rv0Var.c;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : wb1Var.T(F);
                        if (T == null) {
                            rv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (rv0Var.Q.getDirection() == 0) {
                                rv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                rv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = rv0Var.d;
                            if (!c0Var.c.H(view) || !c0Var.d.H(view)) {
                                rv0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = premiumPreviewFragment.u0) != null) {
                    hVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(yx0Var.b.N0() - yx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && yx0Var.b.N0() >= h10 - 10) {
                        yx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                s31 s31Var = (s31) obj;
                s31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.e3) s31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                z81 z81Var = (z81) obj;
                z81Var.o0(false, true);
                if (z81Var.c.K1) {
                    AndroidUtilities.hideKeyboard(z81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = z81Var.V) != null) {
                    hVar4.f(i10, i11);
                    z81Var.i0();
                    break;
                }
                break;
            case 29:
                od1 od1Var = (od1) obj;
                od1Var.u0.f1();
                od1Var.r0 = true;
                break;
        }
    }

    public i3(ub ubVar) {
        this.a = 4;
        this.b = ubVar;
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
