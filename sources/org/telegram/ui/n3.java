package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n3 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n3(Object obj, int i10) {
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
                    ((r3) this.b).H.L0.W();
                    break;
                }
                break;
            case 4:
                ub ubVar = (ub) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        ubVar.T = false;
                        ubVar.W = false;
                        ubVar.T0(true);
                        break;
                    }
                } else {
                    ubVar.T = true;
                    ubVar.W = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zn) this.b).U0);
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
                    AndroidUtilities.hideKeyboard(((rr) this.b).getParentActivity().getCurrentFocus());
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
                n20 n20Var = (n20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) n20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (n20Var.v <= 0.5f) {
                        View m10 = n20Var.c.getLayoutManager() != null ? n20Var.c.getLayoutManager().m(0) : null;
                        if (m10 != null && m10.getTop() < 0) {
                            n20Var.c.v0(0, m10.getTop(), null);
                            break;
                        }
                    } else {
                        n20Var.c.v0(0, n20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                o60 o60Var = (o60) this.b;
                if (i10 == 0) {
                    float f10 = o60Var.x0;
                    if (f10 >= 0.5f && f10 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) o60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        f2.v0 layoutManager = o60Var.J.getLayoutManager();
                        if (layoutManager != null && (m9 = layoutManager.m(0)) != null) {
                            o60Var.J.v0(0, m9.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f10 < 0.5f) {
                        View m11 = o60Var.J.getLayoutManager() != null ? o60Var.J.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            o60Var.J.v0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                a70 a70Var = (a70) this.b;
                if (i10 == 1) {
                    a70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(a70Var.f.r);
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
                e80 e80Var = (e80) this.b;
                if (i10 == 1) {
                    e80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(e80Var.d.d);
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
                    if (cd0Var.o0 && cd0Var.p0) {
                        AndroidUtilities.hideKeyboard(cd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((jj0) this.b).V.getEditText());
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

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        w00 w00Var;
        org.telegram.ui.Cells.c3 c3Var;
        org.telegram.ui.ActionBar.k kVar;
        ng.e eVar;
        ng.e eVar2;
        org.telegram.ui.Components.l40 l40Var;
        ng.e eVar3;
        ViewGroup viewGroup;
        ng.e eVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                r3 r3Var = (r3) obj;
                if (recyclerView.getChildCount() != 0) {
                    recyclerView.invalidate();
                    r3Var.H.L0.H();
                    n4 n4Var = r3Var.H;
                    a4 a4Var = n4Var.H;
                    if (a4Var != null) {
                        a4Var.c.invalidate();
                    } else {
                        ArticleViewer$WindowView articleViewer$WindowView = n4Var.c0;
                        if (articleViewer$WindowView != null) {
                            articleViewer$WindowView.invalidate();
                        }
                    }
                    r3Var.H.f0();
                    n4 n4Var2 = r3Var.H;
                    a4 a4Var2 = n4Var2.H;
                    if (a4Var2 == null || a4Var2.C) {
                        n4Var2.X(n4Var2.F0 - i11);
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
                n4 n4Var3 = (n4) obj;
                if (n4Var3.f0.w.H1) {
                    AndroidUtilities.hideKeyboard(n4Var3.e0.V);
                    break;
                }
                break;
            case 3:
                ((l8) obj).p0();
                break;
            case 4:
                ub ubVar = (ub) obj;
                ubVar.B.invalidate();
                if (i11 != 0 && ubVar.T && !ubVar.R && ubVar.N.getTag() == null) {
                    AnimatorSet animatorSet = ubVar.S;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ubVar.N.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ubVar.S = animatorSet2;
                    animatorSet2.setDuration(150L);
                    ubVar.S.playTogether(ObjectAnimator.ofFloat(ubVar.N, "alpha", 1.0f));
                    ubVar.S.addListener(new u5(this, 13));
                    ubVar.S.start();
                }
                if (i11 != 0) {
                    ubVar.U0(1);
                }
                ubVar.O0(true);
                ubVar.d1();
                break;
            case 9:
                iv ivVar = (iv) obj;
                org.telegram.ui.Components.na naVar = ivVar.s;
                if (naVar != null) {
                    ivVar.w = !naVar.Z();
                    naVar.invalidate();
                    break;
                }
                break;
            case 10:
                c10 c10Var = (c10) obj;
                if (c10Var.a.H1 && (w00Var = c10Var.H) != null && (c3Var = w00Var.b) != null) {
                    if (!c3Var.e) {
                        c3Var.d();
                        break;
                    } else {
                        c3Var.k(true);
                        break;
                    }
                }
                break;
            case 11:
                ((n20) obj).s.invalidate();
                break;
            case 12:
                o60 o60Var = (o60) obj;
                if (o60Var.w0 == null) {
                    o60Var.w0 = (wc) o60Var.y0(o60Var.W);
                }
                int measuredHeight = o60Var.w0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.p2) o60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = o60Var.w0.getTop() * (-1);
                float f10 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f10), 0.0f);
                o60Var.x0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(o60Var.x0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                o60Var.w0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                o60Var.w0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                o60Var.w0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (o60Var.x0 < 1.0f) {
                    o60Var.w0.setTranslationY(0.0f);
                    break;
                } else {
                    o60Var.w0.setTranslationY(top - f10);
                    break;
                }
            case 13:
                a70 a70Var = (a70) obj;
                int L0 = a70Var.r.L0();
                View childAt = a70Var.n.getChildAt(0);
                a70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < a70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (eVar = a70Var.m0) != null) {
                    eVar.f(i10, i11);
                    a70Var.e0();
                    break;
                }
                break;
            case 16:
                e80 e80Var = (e80) obj;
                e80Var.n.L0();
                View childAt2 = e80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = e80Var.I) != null) {
                    eVar2.f(i10, i11);
                    e80Var.Y();
                    break;
                }
                break;
            case 19:
                ((ui0) obj).H.invalidate();
                break;
            case 20:
                cj0 cj0Var = (cj0) obj;
                int L02 = cj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(cj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !cj0Var.S && !cj0Var.B && !cj0Var.x.isEmpty() && L02 + abs >= h - 5 && cj0Var.y) {
                    cj0Var.b0();
                    break;
                }
                break;
            case 23:
                mv0 mv0Var = (mv0) obj;
                if (i11 != 0 && (l40Var = mv0Var.h) != null) {
                    l40Var.b(true);
                }
                org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                if (qy0Var != null && qy0Var.s) {
                    org.telegram.ui.Components.oy0 delegate = qy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.b6)) {
                        mv0Var.N.f();
                        break;
                    } else {
                        rb1 rb1Var = mv0Var.c;
                        View F = rb1Var.F((org.telegram.ui.Cells.b6) delegate);
                        f2.l1 T = F == null ? null : rb1Var.T(F);
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
                            f2.i0 i0Var = mv0Var.d;
                            if (!i0Var.c.W(view) || !i0Var.d.W(view)) {
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
                viewGroup = ((org.telegram.ui.ActionBar.g3) p31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                w81 w81Var = (w81) obj;
                w81Var.o0(false, true);
                if (w81Var.c.H1) {
                    AndroidUtilities.hideKeyboard(w81Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar4 = w81Var.S) != null) {
                    eVar4.f(i10, i11);
                    w81Var.i0();
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

    public n3(ub ubVar) {
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
