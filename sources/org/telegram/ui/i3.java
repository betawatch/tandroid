package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                    AndroidUtilities.hideKeyboard(((xn) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lq) this.b).getParentActivity().getCurrentFocus());
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
                    AndroidUtilities.hideKeyboard(((xt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                o20 o20Var = (o20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) o20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (o20Var.v <= 0.5f) {
                        View m11 = o20Var.c.getLayoutManager() != null ? o20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            o20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        o20Var.c.v0(0, o20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                p60 p60Var = (p60) this.b;
                if (i10 == 0) {
                    float f7 = p60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) p60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = p60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            p60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = p60Var.M.getLayoutManager() != null ? p60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            p60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                b70 b70Var = (b70) this.b;
                if (i10 == 1) {
                    b70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(b70Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((i70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((q70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                i80 i80Var = (i80) this.b;
                if (i10 == 1) {
                    i80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(i80Var.d.d);
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
                    dd0 dd0Var = (dd0) this.b;
                    if (dd0Var.r0 && dd0Var.s0) {
                        AndroidUtilities.hideKeyboard(dd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((lj0) this.b).Y.getEditText());
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
                    kVar3 = ((org.telegram.ui.ActionBar.n2) premiumPreviewFragment).actionBar;
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
                    AndroidUtilities.hideKeyboard(((x31) this.b).getParentActivity().getCurrentFocus());
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
        w00 w00Var;
        org.telegram.ui.Cells.d3 d3Var;
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
                p pVar = (p) obj;
                if (!pVar.I && !pVar.r && pVar.d.N0() > pVar.E - 2) {
                    pVar.W();
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
                    ubVar.R.addListener(new u4(this, 14));
                    ubVar.R.start();
                }
                ubVar.O0(true);
                ubVar.c1();
                break;
            case 9:
                gv gvVar = (gv) obj;
                org.telegram.ui.Components.va vaVar = gvVar.s;
                if (vaVar != null) {
                    gvVar.w = !vaVar.Z();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                c10 c10Var = (c10) obj;
                if (c10Var.a.K1 && (w00Var = c10Var.K) != null && (d3Var = w00Var.b) != null) {
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
                ((o20) obj).s.invalidate();
                break;
            case 12:
                p60 p60Var = (p60) obj;
                if (p60Var.z0 == null) {
                    p60Var.z0 = (tc) p60Var.y0(p60Var.Z);
                }
                int measuredHeight = p60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) p60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = p60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                p60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(p60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                p60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                p60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                p60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (p60Var.A0 < 1.0f) {
                    p60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    p60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                b70 b70Var = (b70) obj;
                int L0 = b70Var.r.L0();
                View childAt = b70Var.n.getChildAt(0);
                b70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < b70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = b70Var.p0) != null) {
                    hVar.f(i10, i11);
                    b70Var.e0();
                    break;
                }
                break;
            case 16:
                i80 i80Var = (i80) obj;
                i80Var.n.L0();
                View childAt2 = i80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = i80Var.L) != null) {
                    hVar2.f(i10, i11);
                    i80Var.Y();
                    break;
                }
                break;
            case 19:
                ((wi0) obj).K.invalidate();
                break;
            case 20:
                ej0 ej0Var = (ej0) obj;
                int L02 = ej0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(ej0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !ej0Var.V && !ej0Var.E && !ej0Var.x.isEmpty() && L02 + abs >= h - 5 && ej0Var.y) {
                    ej0Var.b0();
                    break;
                }
                break;
            case 23:
                tv0 tv0Var = (tv0) obj;
                if (i11 != 0 && (j40Var = tv0Var.h) != null) {
                    j40Var.b(true);
                }
                org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
                if (my0Var != null && my0Var.s) {
                    org.telegram.ui.Components.ky0 delegate = my0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        tv0Var.Q.f();
                        break;
                    } else {
                        wb1 wb1Var = tv0Var.c;
                        View F = wb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : wb1Var.T(F);
                        if (T == null) {
                            tv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (tv0Var.Q.getDirection() == 0) {
                                tv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                tv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = tv0Var.d;
                            if (!c0Var.c.v(view) || !c0Var.d.v(view)) {
                                tv0Var.Q.f();
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
                zx0 zx0Var = (zx0) obj;
                if (!zx0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(zx0Var.b.N0() - zx0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && zx0Var.b.N0() >= h10 - 10) {
                        zx0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                t31 t31Var = (t31) obj;
                t31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) t31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                x81 x81Var = (x81) obj;
                x81Var.o0(false, true);
                if (x81Var.c.K1) {
                    AndroidUtilities.hideKeyboard(x81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = x81Var.V) != null) {
                    hVar4.f(i10, i11);
                    x81Var.i0();
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
