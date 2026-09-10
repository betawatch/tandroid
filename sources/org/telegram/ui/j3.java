package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View m10;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((n3) this.b).K.O0.W();
                    break;
                }
                break;
            case 4:
                wb wbVar = (wb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        wbVar.W = false;
                        wbVar.Z = false;
                        wbVar.T0(true);
                        break;
                    }
                } else {
                    wbVar.W = true;
                    wbVar.Z = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((eo) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((wr) this.b).getParentActivity().getCurrentFocus());
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
                s20 s20Var = (s20) this.b;
                if (i10 == 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
                    if (s20Var.v <= 0.5f) {
                        View m11 = s20Var.c.getLayoutManager() != null ? s20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            s20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        s20Var.c.v0(0, s20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                s60 s60Var = (s60) this.b;
                if (i10 == 0) {
                    float f7 = s60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        lVar2 = ((org.telegram.ui.ActionBar.p2) s60Var).actionBar;
                        int bottom = lVar2.getBottom();
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
                    AndroidUtilities.hideKeyboard(((k70) this.b).c);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 16:
                k80 k80Var = (k80) this.b;
                if (i10 == 1) {
                    k80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(k80Var.d.d);
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
                    AndroidUtilities.hideKeyboard(((sj0) this.b).Y.getEditText());
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
                    lVar3 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    int dp2 = AndroidUtilities.dp(16.0f) + lVar3.getBottom();
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
                    AndroidUtilities.hideKeyboard(((k41) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 29:
                if (i10 == 0) {
                    ((ae1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        b10 b10Var;
        org.telegram.ui.Cells.d3 d3Var;
        org.telegram.ui.ActionBar.l lVar;
        zg.e eVar;
        zg.e eVar2;
        org.telegram.ui.Components.s40 s40Var;
        zg.e eVar3;
        ViewGroup viewGroup;
        zg.e eVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                n3 n3Var = (n3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    n3Var.K.O0.H();
                    j4 j4Var = n3Var.K;
                    w3 w3Var = j4Var.K;
                    if (w3Var != null) {
                        w3Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    n3Var.K.f0();
                    j4 j4Var2 = n3Var.K;
                    w3 w3Var2 = j4Var2.K;
                    if (w3Var2 == null || w3Var2.F) {
                        j4Var2.X(j4Var2.I0 - i11);
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
                j4 j4Var3 = (j4) obj;
                if (j4Var3.i0.w.K1) {
                    AndroidUtilities.hideKeyboard(j4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((h8) obj).p0();
                break;
            case 4:
                wb wbVar = (wb) obj;
                wbVar.E.invalidate();
                if (i11 != 0 && wbVar.W && !wbVar.U && wbVar.Q.getTag() == null) {
                    AnimatorSet animatorSet = wbVar.V;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wbVar.Q.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wbVar.V = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wbVar.V.playTogether(ObjectAnimator.ofFloat(wbVar.Q, "alpha", 1.0f));
                    wbVar.V.addListener(new org.telegram.ui.Cells.v5(this, 4));
                    wbVar.V.start();
                }
                if (i11 != 0) {
                    wbVar.U0(1);
                }
                wbVar.O0(true);
                wbVar.d1();
                break;
            case 9:
                lv lvVar = (lv) obj;
                org.telegram.ui.Components.ua uaVar = lvVar.s;
                if (uaVar != null) {
                    lvVar.w = !uaVar.Z();
                    uaVar.invalidate();
                    break;
                }
                break;
            case 10:
                h10 h10Var = (h10) obj;
                if (h10Var.a.K1 && (b10Var = h10Var.K) != null && (d3Var = b10Var.b) != null) {
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
                ((s20) obj).s.invalidate();
                break;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.z0 == null) {
                    s60Var.z0 = (vc) s60Var.y0(s60Var.Z);
                }
                int measuredHeight = s60Var.z0.getMeasuredHeight();
                lVar = ((org.telegram.ui.ActionBar.p2) s60Var).actionBar;
                int measuredHeight2 = measuredHeight - lVar.getMeasuredHeight();
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
                if (Build.VERSION.SDK_INT >= 31 && (eVar = e70Var.p0) != null) {
                    eVar.f(i10, i11);
                    e70Var.e0();
                    break;
                }
                break;
            case 16:
                k80 k80Var = (k80) obj;
                k80Var.n.L0();
                View childAt2 = k80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = k80Var.L) != null) {
                    eVar2.f(i10, i11);
                    k80Var.Y();
                    break;
                }
                break;
            case 19:
                ((cj0) obj).K.invalidate();
                break;
            case 20:
                kj0 kj0Var = (kj0) obj;
                int L02 = kj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(kj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !kj0Var.V && !kj0Var.E && !kj0Var.x.isEmpty() && L02 + abs >= h - 5 && kj0Var.y) {
                    kj0Var.b0();
                    break;
                }
                break;
            case 23:
                bw0 bw0Var = (bw0) obj;
                if (i11 != 0 && (s40Var = bw0Var.h) != null) {
                    s40Var.b(true);
                }
                org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
                if (zy0Var != null && zy0Var.s) {
                    org.telegram.ui.Components.xy0 delegate = zy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.e6)) {
                        bw0Var.Q.f();
                        break;
                    } else {
                        ic1 ic1Var = bw0Var.c;
                        View F = ic1Var.F((org.telegram.ui.Cells.e6) delegate);
                        s4.c1 T = F == null ? null : ic1Var.T(F);
                        if (T == null) {
                            bw0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (bw0Var.Q.getDirection() == 0) {
                                bw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                bw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = bw0Var.d;
                            if (!c0Var.c.o(view) || !c0Var.d.o(view)) {
                                bw0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = premiumPreviewFragment.u0) != null) {
                    eVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 25:
                ky0 ky0Var = (ky0) obj;
                if (!ky0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(ky0Var.b.N0() - ky0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && ky0Var.b.N0() >= h10 - 10) {
                        ky0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 26:
                g41 g41Var = (g41) obj;
                g41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) g41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                k91 k91Var = (k91) obj;
                k91Var.o0(false, true);
                if (k91Var.c.K1) {
                    AndroidUtilities.hideKeyboard(k91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = k91Var.V) != null) {
                    eVar4.f(i10, i11);
                    k91Var.i0();
                    break;
                }
                break;
            case 29:
                ae1 ae1Var = (ae1) obj;
                ae1Var.u0.e1();
                ae1Var.r0 = true;
                break;
        }
    }

    public j3(wb wbVar) {
        this.a = 4;
        this.b = wbVar;
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
