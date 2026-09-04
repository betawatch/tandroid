package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                        ubVar.W = false;
                        ubVar.Z = false;
                        ubVar.T0(true);
                        break;
                    }
                } else {
                    ubVar.W = true;
                    ubVar.Z = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((co) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((qq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((vr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((bu) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 11:
                r20 r20Var = (r20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v <= 0.5f) {
                        View m11 = r20Var.c.getLayoutManager() != null ? r20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            r20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        r20Var.c.v0(0, r20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                t60 t60Var = (t60) this.b;
                if (i10 == 0) {
                    float f7 = t60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) t60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = t60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            t60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = t60Var.M.getLayoutManager() != null ? t60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            t60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                f70 f70Var = (f70) this.b;
                if (i10 == 1) {
                    f70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(f70Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((l70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((u70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                l80 l80Var = (l80) this.b;
                if (i10 == 1) {
                    l80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(l80Var.d.d);
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
                    id0 id0Var = (id0) this.b;
                    if (id0Var.r0 && id0Var.s0) {
                        AndroidUtilities.hideKeyboard(id0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tj0) this.b).Y.getEditText());
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
                    AndroidUtilities.hideKeyboard(((h41) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((wd1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.k kVar;
        bh.f fVar;
        bh.f fVar2;
        org.telegram.ui.Components.i40 i40Var;
        bh.f fVar3;
        ViewGroup viewGroup;
        bh.f fVar4;
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
                ubVar.E.invalidate();
                if (i11 != 0 && ubVar.W && !ubVar.U && ubVar.Q.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.V;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.Q.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.V = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.V.playTogether(ObjectAnimator.ofFloat(ubVar.Q, "alpha", 1.0f));
                    ubVar.V.addListener(new s0(this, 17));
                    ubVar.V.start();
                }
                if (i11 != 0) {
                    ubVar.U0(1);
                }
                ubVar.O0(true);
                ubVar.d1();
                break;
            case 9:
                kv kvVar = (kv) obj;
                org.telegram.ui.Components.va vaVar = kvVar.s;
                if (vaVar != null) {
                    kvVar.w = !vaVar.Z();
                    vaVar.invalidate();
                    break;
                }
                break;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.a.K1 && (z00Var = f10Var.K) != null && (d3Var = z00Var.b) != null) {
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
                ((r20) obj).s.invalidate();
                break;
            case 12:
                t60 t60Var = (t60) obj;
                if (t60Var.z0 == null) {
                    t60Var.z0 = (uc) t60Var.y0(t60Var.Z);
                }
                int measuredHeight = t60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) t60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = t60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                t60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(t60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                t60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                t60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                t60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (t60Var.A0 < 1.0f) {
                    t60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    t60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                f70 f70Var = (f70) obj;
                int L0 = f70Var.r.L0();
                View childAt = f70Var.n.getChildAt(0);
                f70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < f70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (fVar = f70Var.p0) != null) {
                    fVar.f(i10, i11);
                    f70Var.e0();
                    break;
                }
                break;
            case 16:
                l80 l80Var = (l80) obj;
                l80Var.n.L0();
                View childAt2 = l80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = l80Var.L) != null) {
                    fVar2.f(i10, i11);
                    l80Var.Y();
                    break;
                }
                break;
            case 19:
                ((cj0) obj).K.invalidate();
                break;
            case 20:
                lj0 lj0Var = (lj0) obj;
                int L02 = lj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(lj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !lj0Var.V && !lj0Var.E && !lj0Var.x.isEmpty() && L02 + abs >= h - 5 && lj0Var.y) {
                    lj0Var.b0();
                    break;
                }
                break;
            case 23:
                zv0 zv0Var = (zv0) obj;
                if (i11 != 0 && (i40Var = zv0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
                if (my0Var != null && my0Var.s) {
                    org.telegram.ui.Components.ky0 delegate = my0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.c6)) {
                        zv0Var.Q.f();
                        break;
                    } else {
                        ec1 ec1Var = zv0Var.c;
                        View F = ec1Var.F((org.telegram.ui.Cells.c6) delegate);
                        s4.c1 T = F == null ? null : ec1Var.T(F);
                        if (T == null) {
                            zv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (zv0Var.Q.getDirection() == 0) {
                                zv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                zv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = zv0Var.d;
                            if (!c0Var.c.D(view) || !c0Var.d.D(view)) {
                                zv0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = premiumPreviewFragment.u0) != null) {
                    fVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                hy0 hy0Var = (hy0) obj;
                if (!hy0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(hy0Var.b.N0() - hy0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && hy0Var.b.N0() >= h10 - 10) {
                        hy0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                d41 d41Var = (d41) obj;
                d41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) d41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                i91 i91Var = (i91) obj;
                i91Var.o0(false, true);
                if (i91Var.c.K1) {
                    AndroidUtilities.hideKeyboard(i91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar4 = i91Var.V) != null) {
                    fVar4.f(i10, i11);
                    i91Var.i0();
                    break;
                }
                break;
            case 29:
                wd1 wd1Var = (wd1) obj;
                wd1Var.u0.e1();
                wd1Var.r0 = true;
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
