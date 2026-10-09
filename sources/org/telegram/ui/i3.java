package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i3 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.t0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View m10;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((m3) this.b).K.O0.V();
                    break;
                }
                break;
            case 4:
                vb vbVar = (vb) this.b;
                if (i10 != 1) {
                    if (i10 == 0) {
                        vbVar.S = false;
                        vbVar.V = false;
                        vbVar.T0(true);
                        break;
                    }
                } else {
                    vbVar.S = true;
                    vbVar.V = true;
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((zn) this.b).X0);
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((nq) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 7:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((tr) this.b).getParentActivity().getCurrentFocus());
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
                p20 p20Var = (p20) this.b;
                if (i10 == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) p20Var).actionBar;
                    int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
                    if (p20Var.v <= 0.5f) {
                        View m11 = p20Var.c.getLayoutManager() != null ? p20Var.c.getLayoutManager().m(0) : null;
                        if (m11 != null && m11.getTop() < 0) {
                            p20Var.c.v0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        p20Var.c.v0(0, p20Var.r - dp, null);
                        break;
                    }
                }
                break;
            case 12:
                q60 q60Var = (q60) this.b;
                if (i10 == 0) {
                    float f7 = q60Var.A0;
                    if (f7 >= 0.5f && f7 < 1.0f) {
                        kVar2 = ((org.telegram.ui.ActionBar.n2) q60Var).actionBar;
                        int bottom = kVar2.getBottom();
                        s4.p0 layoutManager = q60Var.M.getLayoutManager();
                        if (layoutManager != null && (m10 = layoutManager.m(0)) != null) {
                            q60Var.M.v0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = q60Var.M.getLayoutManager() != null ? q60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            q60Var.M.v0(0, m12.getTop(), null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                c70 c70Var = (c70) this.b;
                if (i10 == 1) {
                    c70Var.f.r.hideActionMode();
                    AndroidUtilities.hideKeyboard(c70Var.f.r);
                    break;
                }
                break;
            case 14:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((j70) this.b).c);
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
                    hd0 hd0Var = (hd0) this.b;
                    if (hd0Var.r0 && hd0Var.s0) {
                        AndroidUtilities.hideKeyboard(hd0Var.getParentActivity().getCurrentFocus());
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
                    ((xd1) this.b).r0 = false;
                    break;
                }
                break;
        }
    }

    @Override // s4.t0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        ah.h hVar;
        ah.h hVar2;
        org.telegram.ui.Components.z40 z40Var;
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
                    m3Var.K.O0.G();
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
                if (i4Var3.i0.w.I1) {
                    AndroidUtilities.hideKeyboard(i4Var3.h0.b0);
                    break;
                }
                break;
            case 3:
                ((g8) obj).p0();
                break;
            case 4:
                vb vbVar = (vb) obj;
                vbVar.v.invalidate();
                if (i11 != 0 && vbVar.S && !vbVar.Q && vbVar.M.getTag() == null) {
                    AnimatorSet animatorSet = vbVar.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    vbVar.M.setTag(1);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    vbVar.R = animatorSet2;
                    animatorSet2.setDuration(150L);
                    vbVar.R.playTogether(ObjectAnimator.ofFloat(vbVar.M, "alpha", 1.0f));
                    vbVar.R.addListener(new t4(this, 14));
                    vbVar.R.start();
                }
                vbVar.O0(true);
                vbVar.c1();
                break;
            case 9:
                iv ivVar = (iv) obj;
                org.telegram.ui.Components.ya yaVar = ivVar.s;
                if (yaVar != null) {
                    ivVar.w = !yaVar.Z();
                    yaVar.invalidate();
                    break;
                }
                break;
            case 10:
                f10 f10Var = (f10) obj;
                if (f10Var.a.I1 && (z00Var = f10Var.K) != null && (e3Var = z00Var.b) != null) {
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
                ((p20) obj).s.invalidate();
                break;
            case 12:
                q60 q60Var = (q60) obj;
                if (q60Var.z0 == null) {
                    q60Var.z0 = (uc) q60Var.y0(q60Var.Z);
                }
                int measuredHeight = q60Var.z0.getMeasuredHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) q60Var).actionBar;
                int measuredHeight2 = measuredHeight - kVar.getMeasuredHeight();
                float top = q60Var.z0.getTop() * (-1);
                float f7 = measuredHeight2;
                float max = Math.max(Math.min(1.0f, top / f7), 0.0f);
                q60Var.A0 = max;
                float min = Math.min(max * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(q60Var.A0 - 0.45f, 0.0f) * 2.0f, 1.0f);
                q60Var.z0.b.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.z0.f.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                q60Var.z0.c.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (q60Var.A0 < 1.0f) {
                    q60Var.z0.setTranslationY(0.0f);
                    break;
                } else {
                    q60Var.z0.setTranslationY(top - f7);
                    break;
                }
            case 13:
                c70 c70Var = (c70) obj;
                int L0 = c70Var.r.L0();
                View childAt = c70Var.n.getChildAt(0);
                c70Var.e.b(L0 != 0 || (childAt != null ? childAt.getTop() : 0) < c70Var.n.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (hVar = c70Var.p0) != null) {
                    hVar.f(i10, i11);
                    c70Var.e0();
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
                ((dj0) obj).K.invalidate();
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
                aw0 aw0Var = (aw0) obj;
                if (i11 != 0 && (z40Var = aw0Var.h) != null) {
                    z40Var.b(true);
                }
                org.telegram.ui.Components.oz0 oz0Var = aw0Var.Q;
                if (oz0Var != null && oz0Var.s) {
                    org.telegram.ui.Components.mz0 delegate = oz0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.d6)) {
                        aw0Var.Q.f();
                        break;
                    } else {
                        fc1 fc1Var = aw0Var.c;
                        View F = fc1Var.F((org.telegram.ui.Cells.d6) delegate);
                        s4.d1 T = F == null ? null : fc1Var.T(F);
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
                            s4.d0 d0Var = aw0Var.d;
                            if (!d0Var.c.r(view) || !d0Var.d.r(view)) {
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
                i91 i91Var = (i91) obj;
                i91Var.o0(false, true);
                if (i91Var.c.I1) {
                    AndroidUtilities.hideKeyboard(i91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar4 = i91Var.V) != null) {
                    hVar4.f(i10, i11);
                    i91Var.i0();
                    break;
                }
                break;
            case 29:
                xd1 xd1Var = (xd1) obj;
                xd1Var.u0.f1();
                xd1Var.r0 = true;
                break;
        }
    }

    public i3(vb vbVar) {
        this.a = 4;
        this.b = vbVar;
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
