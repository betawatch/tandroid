package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((l3) this.b).K.O0.W();
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
                    AndroidUtilities.hideKeyboard(((bo) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ur) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((au) this.b).getParentActivity().getCurrentFocus());
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
                s60 s60Var = (s60) this.b;
                if (i10 == 0) {
                    float f7 = s60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) s60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = s60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            s60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = s60Var.M.getLayoutManager() != null ? s60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            s60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                e70 e70Var = (e70) this.b;
                if (i10 == 1) {
                    e70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(e70Var.f.r);
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
                    AndroidUtilities.hideKeyboard(((t70) this.b).getParentActivity().getCurrentFocus());
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
                    AndroidUtilities.hideKeyboard(((rj0) this.b).Y.getEditText());
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
                    AndroidUtilities.hideKeyboard(((f41) this.b).getParentActivity().getCurrentFocus());
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
        ah.h hVar;
        ah.h hVar2;
        org.telegram.ui.Components.i40 i40Var;
        ah.h hVar3;
        ViewGroup viewGroup;
        ah.h hVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                l3 l3Var = (l3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    l3Var.K.O0.H();
                    h4 h4Var = l3Var.K;
                    u3 u3Var = h4Var.K;
                    if (u3Var != null) {
                        u3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    l3Var.K.f0();
                    h4 h4Var2 = l3Var.K;
                    u3 u3Var2 = h4Var2.K;
                    if (u3Var2 == null || u3Var2.F) {
                        h4Var2.X(h4Var2.I0 - i11);
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
                h4 h4Var3 = (h4) obj;
                if (h4Var3.i0.w.K1) {
                    AndroidUtilities.hideKeyboard(h4Var3.h0.b0);
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
                jv jvVar = (jv) obj;
                org.telegram.ui.Components.ta taVar = jvVar.s;
                if (taVar != null) {
                    jvVar.w = !taVar.Z();
                    taVar.invalidate();
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
                s60 s60Var = (s60) obj;
                if (s60Var.z0 == null) {
                    s60Var.z0 = (tc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) s60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = s60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                s60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(s60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                s60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                s60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (s60Var.A0 < 1.0f) {
                    s60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    s60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                e70 e70Var = (e70) obj;
                int L0 = e70Var.r.L0();
                View childAt = e70Var.n.getChildAt(0);
                e70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < e70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = e70Var.p0) != null) {
                    hVar.f(i10, i11);
                    e70Var.e0();
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
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = l80Var.L) != null) {
                    hVar2.f(i10, i11);
                    l80Var.Y();
                    break;
                }
                break;
            case 19:
                ((bj0) obj).K.invalidate();
                break;
            case 20:
                jj0 jj0Var = (jj0) obj;
                int L02 = jj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(jj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !jj0Var.V && !jj0Var.E && !jj0Var.x.isEmpty() && L02 + abs >= h - 5 && jj0Var.y) {
                    jj0Var.b0();
                    break;
                }
                break;
            case 23:
                aw0 aw0Var = (aw0) obj;
                if (i11 != 0 && (i40Var = aw0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.ny0 ny0Var = aw0Var.Q;
                if (ny0Var != null && ny0Var.s) {
                    org.telegram.ui.Components.ly0 delegate = ny0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        aw0Var.Q.f();
                        break;
                    } else {
                        ec1 ec1Var = aw0Var.c;
                        View F = ec1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : ec1Var.T(F);
                        if (T == null) {
                            aw0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (aw0Var.Q.getDirection() == 0) {
                                aw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                aw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = aw0Var.d;
                            if (!c0Var.c.v(view) || !c0Var.d.v(view)) {
                                aw0Var.Q.f();
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
                gy0 gy0Var = (gy0) obj;
                if (!gy0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(gy0Var.b.N0() - gy0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && gy0Var.b.N0() >= h10 - 10) {
                        gy0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                b41 b41Var = (b41) obj;
                b41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) b41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                f91 f91Var = (f91) obj;
                f91Var.o0(false, true);
                if (f91Var.c.K1) {
                    AndroidUtilities.hideKeyboard(f91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = f91Var.V) != null) {
                    hVar4.f(i10, i11);
                    f91Var.i0();
                    break;
                }
                break;
            case 29:
                wd1 wd1Var = (wd1) obj;
                wd1Var.u0.f1();
                wd1Var.r0 = true;
                break;
        }
    }

    public h3(ub ubVar) {
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
