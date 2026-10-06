package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
            case 5:
                wb wbVar = (wb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        wbVar.S = false;
                        wbVar.V = false;
                        wbVar.T0(true);
                        break;
                    }
                } else {
                    wbVar.S = true;
                    wbVar.V = true;
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yn) this.b).V0);
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((mq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 8:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rr) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 9:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zt) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 12:
                r20 r20Var = (r20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) r20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (r20Var.v <= 0.5f) {
                        if ((r20Var.c.getLayoutManager() != null ? r20Var.c.getLayoutManager().m(0) : null) != null) {
                            if (r20Var.t0() + r6.getTop() < 0.0f) {
                                r20Var.c.w0(0, Math.round(r20Var.t0() + r6.getTop()), null);
                                break;
                            }
                        }
                    } else {
                        r20Var.c.w0(0, r20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 13:
                r60 r60Var = (r60) this.b;
                if (i10 == 0) {
                    float f7 = r60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) r60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.o0 layoutManager = r60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            r60Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m11 = r60Var.M.getLayoutManager() != null ? r60Var.M.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            r60Var.M.w0(0, m11.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                d70 d70Var = (d70) this.b;
                if (i10 == 1) {
                    d70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(d70Var.f.r);
                    break;
                }
                break;
            case 15:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((k70) this.b).c);
                    break;
                }
                break;
            case 16:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((s70) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 17:
                k80 k80Var = (k80) this.b;
                if (i10 == 1) {
                    k80Var.d.d.hideActionMode();
                    AndroidUtilities.hideKeyboard(k80Var.d.d);
                    break;
                }
                break;
            case 18:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((LanguageSelectActivity) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 19:
                if (i10 == 1) {
                    gd0 gd0Var = (gd0) this.b;
                    if (gd0Var.r0 && gd0Var.s0) {
                        AndroidUtilities.hideKeyboard(gd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 22:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((oj0) this.b).Y.getEditText());
                    break;
                }
                break;
            case 23:
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
                    if (premiumPreviewFragment.f0 <= 0.5f) {
                        View m12 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            premiumPreviewFragment.a.w0(0, m12.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.c0 - dp2, null);
                        break;
                    }
                }
                break;
            case 28:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((w31) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x02df, code lost:
    
        if (r8.s() != false) goto L148;
     */
    @Override // s4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar2;
        ah.i iVar;
        ah.i iVar2;
        org.telegram.ui.Components.m40 m40Var;
        ah.i iVar3;
        ViewGroup viewGroup;
        int i12 = this.a;
        boolean z10 = false;
        r4 = false;
        boolean z11 = false;
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
                    qVar.U();
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
                a7 a7Var = (a7) obj;
                if (!a7Var.b.canScrollVertically(-1)) {
                    kVar = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
                    break;
                }
                z10 = true;
                le.b bVar = a7Var.S;
                if (bVar != null) {
                    bVar.a(z10, true);
                    break;
                }
                break;
            case 4:
                ((k8) obj).p0();
                break;
            case 5:
                wb wbVar = (wb) obj;
                wbVar.v.invalidate();
                if (i11 != 0 && wbVar.S && !wbVar.Q && wbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = wbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    wbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    wbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    wbVar.R.playTogether(ObjectAnimator.ofFloat(wbVar.M, "alpha", 1.0f));
                    wbVar.R.addListener(new u4(this, 14));
                    wbVar.R.start();
                }
                wbVar.O0(true);
                wbVar.c1();
                break;
            case 10:
                jv jvVar = (jv) obj;
                org.telegram.ui.Components.wa waVar = jvVar.s;
                if (waVar != null) {
                    org.telegram.ui.Components.xc0 xc0Var = waVar.y0;
                    if (xc0Var != null && xc0Var.getTop() == waVar.A0) {
                        z11 = true;
                    }
                    jvVar.w = !z11;
                    waVar.invalidate();
                    break;
                }
                break;
            case 11:
                f10 f10Var = (f10) obj;
                if (f10Var.a.K1 && (z00Var = f10Var.K) != null && (e3Var = z00Var.b) != null) {
                    if (!e3Var.e) {
                        e3Var.d();
                        break;
                    } else {
                        e3Var.k(true);
                        break;
                    }
                }
                break;
            case 12:
                ((r20) obj).s.invalidate();
                break;
            case 13:
                r60 r60Var = (r60) obj;
                if (r60Var.z0 == null) {
                    r60Var.z0 = (vc) r60Var.y0(r60Var.Z);
                }
                int measuredHeight = r60Var.z0.getMeasuredHeight();
                kVar2 = ((org.telegram.ui.ActionBar.n2) r60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar2.getMeasuredHeight();
                float top = r60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                r60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(r60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                r60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                r60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                r60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (r60Var.A0 < 1.0f) {
                    r60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    r60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 14:
                d70 d70Var = (d70) obj;
                int L0 = d70Var.r.L0();
                View childAt = d70Var.n.getChildAt(0);
                ((le.b) d70Var.e.c).a(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < d70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (iVar = d70Var.p0) != null) {
                    iVar.f(i10, i11);
                    d70Var.e0();
                    break;
                }
                break;
            case 17:
                k80 k80Var = (k80) obj;
                k80Var.n.L0();
                View childAt2 = k80Var.h.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.getTop();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = k80Var.L) != null) {
                    iVar2.f(i10, i11);
                    k80Var.X();
                    break;
                }
                break;
            case 20:
                ((zi0) obj).K.invalidate();
                break;
            case 21:
                hj0 hj0Var = (hj0) obj;
                int L02 = hj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(hj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !hj0Var.V && !hj0Var.E && !hj0Var.x.isEmpty() && L02 + abs >= h - 5 && hj0Var.y) {
                    hj0Var.b0();
                    break;
                }
                break;
            case 24:
                uv0 uv0Var = (uv0) obj;
                if (i11 != 0 && (m40Var = uv0Var.h) != null) {
                    m40Var.b(true);
                }
                org.telegram.ui.Components.jz0 jz0Var = uv0Var.Q;
                if (jz0Var != null && jz0Var.s) {
                    org.telegram.ui.Components.hz0 delegate = jz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        uv0Var.Q.f();
                        break;
                    } else {
                        xb1 xb1Var = uv0Var.c;
                        View F = xb1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.c1 T = F == null ? null : xb1Var.T(F);
                        if (T == null) {
                            uv0Var.Q.f();
                            break;
                        } else {
                            View view = T.a;
                            if (uv0Var.Q.getDirection() == 0) {
                                uv0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                uv0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = uv0Var.d;
                            if (!c0Var.c.D(view) || !c0Var.d.D(view)) {
                                uv0Var.Q.f();
                                break;
                            }
                        }
                    }
                }
                break;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.d0.invalidate();
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.u0) != null) {
                    iVar3.f(i10, i11);
                    premiumPreviewFragment.j0();
                    break;
                }
                break;
            case 26:
                by0 by0Var = (by0) obj;
                if (!by0Var.getMessagesController().blockedEndReached) {
                    int abs2 = Math.abs(by0Var.b.N0() - by0Var.b.L0()) + 1;
                    int h10 = recyclerView.getAdapter().h();
                    if (abs2 > 0 && by0Var.b.N0() >= h10 - 10) {
                        by0Var.getMessagesController().getBlockedPeers(false);
                        break;
                    }
                }
                break;
            case 27:
                s31 s31Var = (s31) obj;
                s31Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) s31Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 29:
                y81 y81Var = (y81) obj;
                y81Var.m0(false, true);
                if (y81Var.c.K1) {
                    AndroidUtilities.hideKeyboard(y81Var.fragmentView);
                    break;
                }
                break;
        }
    }

    public i3(wb wbVar) {
        this.a = 5;
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
