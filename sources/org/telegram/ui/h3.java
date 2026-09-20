package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    AndroidUtilities.hideKeyboard(((sr) this.b).getParentActivity().getCurrentFocus());
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
                            r20Var.c.w0(0, m11.getTop(), null);
                            break;
                        }
                    } else {
                        r20Var.c.w0(0, r20Var.r - dp, null);
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
                            s60Var.M.w0(0, m10.getBottom() - bottom, null);
                            break;
                        }
                    } else if (f7 < 0.5f) {
                        View m12 = s60Var.M.getLayoutManager() != null ? s60Var.M.getLayoutManager().m(0) : null;
                        if (m12 != null && m12.getTop() < 0) {
                            s60Var.M.w0(0, m12.getTop(), null);
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
                    kd0 kd0Var = (kd0) this.b;
                    if (kd0Var.r0 && kd0Var.s0) {
                        AndroidUtilities.hideKeyboard(kd0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((uj0) this.b).Y.getEditText());
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
                            premiumPreviewFragment.a.w0(0, m13.getTop(), null);
                            break;
                        }
                    } else {
                        premiumPreviewFragment.a.w0(0, premiumPreviewFragment.c0 - dp2, null);
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

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        z00 z00Var;
        org.telegram.ui.Cells.e3 e3Var;
        org.telegram.ui.ActionBar.k kVar;
        ah.i iVar;
        ah.i iVar2;
        org.telegram.ui.Components.i40 i40Var;
        ah.i iVar3;
        ViewGroup viewGroup;
        ah.i iVar4;
        int i12 = this.a;
        boolean z10 = false;
        z10 = false;
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
                ((i8) obj).p0();
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
                kv kvVar = (kv) obj;
                org.telegram.ui.Components.ua uaVar = kvVar.s;
                if (uaVar != null) {
                    org.telegram.ui.Components.tc0 tc0Var = uaVar.y0;
                    if (tc0Var != null && tc0Var.getTop() == uaVar.A0) {
                        z10 = true;
                    }
                    kvVar.w = !z10;
                    uaVar.invalidate();
                    break;
                }
                break;
            case 10:
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
            case 11:
                ((r20) obj).s.invalidate();
                break;
            case 12:
                s60 s60Var = (s60) obj;
                if (s60Var.z0 == null) {
                    s60Var.z0 = (uc) s60Var.y0(s60Var.Z);
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
                if (Build.VERSION.SDK_INT >= 31 && (iVar = e70Var.p0) != null) {
                    iVar.f(i10, i11);
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
                if (Build.VERSION.SDK_INT >= 31 && (iVar2 = l80Var.L) != null) {
                    iVar2.f(i10, i11);
                    l80Var.Y();
                    break;
                }
                break;
            case 19:
                ((dj0) obj).K.invalidate();
                break;
            case 20:
                mj0 mj0Var = (mj0) obj;
                int L02 = mj0Var.h.L0();
                int abs = L02 != -1 ? Math.abs(mj0Var.h.N0() - L02) + 1 : 0;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && !mj0Var.V && !mj0Var.E && !mj0Var.x.isEmpty() && L02 + abs >= h - 5 && mj0Var.y) {
                    mj0Var.b0();
                    break;
                }
                break;
            case 23:
                aw0 aw0Var = (aw0) obj;
                if (i11 != 0 && (i40Var = aw0Var.h) != null) {
                    i40Var.b(true);
                }
                org.telegram.ui.Components.yy0 yy0Var = aw0Var.Q;
                if (yy0Var != null && yy0Var.s) {
                    org.telegram.ui.Components.wy0 delegate = yy0Var.getDelegate();
                    if (!(delegate instanceof org.telegram.ui.Cells.e6)) {
                        aw0Var.Q.f();
                        break;
                    } else {
                        fc1 fc1Var = aw0Var.c;
                        View G = fc1Var.G((org.telegram.ui.Cells.e6) delegate);
                        s4.c1 U = G == null ? null : fc1Var.U(G);
                        if (U == null) {
                            aw0Var.Q.f();
                            break;
                        } else {
                            View view = U.a;
                            if (aw0Var.Q.getDirection() == 0) {
                                aw0Var.Q.setTranslationY((view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight());
                            } else {
                                aw0Var.Q.setTranslationY(view.getY());
                            }
                            s4.c0 c0Var = aw0Var.d;
                            if (!c0Var.c.J(view) || !c0Var.d.J(view)) {
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
                if (Build.VERSION.SDK_INT >= 31 && (iVar3 = premiumPreviewFragment.u0) != null) {
                    iVar3.f(i10, i11);
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
                b41 b41Var = (b41) obj;
                b41Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.f3) b41Var.v).containerView;
                viewGroup.invalidate();
                break;
            case 28:
                i91 i91Var = (i91) obj;
                i91Var.o0(false, true);
                if (i91Var.c.K1) {
                    AndroidUtilities.hideKeyboard(i91Var.fragmentView);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar4 = i91Var.V) != null) {
                    iVar4.f(i10, i11);
                    i91Var.i0();
                    break;
                }
                break;
            case 29:
                xd1 xd1Var = (xd1) obj;
                xd1Var.u0.g1();
                xd1Var.r0 = true;
                break;
        }
    }

    public h3(vb vbVar) {
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
