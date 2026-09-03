package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a4 implements org.telegram.ui.ActionBar.l2, org.telegram.ui.ActionBar.t3 {
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public boolean E;
    public float F;
    public boolean G;
    public final /* synthetic */ n4 H;
    public final AnimationNotificationsLocker a = new AnimationNotificationsLocker();
    public org.telegram.ui.ActionBar.p2 b;
    public final z3 c;
    public View d;
    public org.telegram.ui.ActionBar.j3 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public nh.k3 v;
    public float w;
    public float x;
    public ValueAnimator y;

    public a4(n4 n4Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.H = n4Var;
        this.b = p2Var;
        p2Var.getResourceProvider();
        z3 z3Var = new z3(this, p2Var.getContext());
        this.c = z3Var;
        new ph.i3(z3Var, true, new y3(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.m3 a() {
        org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3();
        n4 n4Var = this.H;
        m3Var.E = n4Var.e0.getTitle();
        m3Var.J = n4Var;
        r3 r3Var = n4Var.r0[0];
        Bitmap bitmap = null;
        m3Var.q = (r3Var == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var.getActionBarColor();
        r3 r3Var2 = n4Var.r0[0];
        m3Var.r = (r3Var2 == null || !SharedConfig.adaptableColorInBrowser) ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : r3Var2.getBackgroundColor();
        m3Var.n = true;
        m3Var.I = !this.C ? 0.0f : n4Var.r0[0].getProgress();
        r3 r3Var3 = n4Var.r0[0];
        m3Var.c = r3Var3;
        if (r3Var3 != null && r3Var3.getWebView() != null) {
            bitmap = n4Var.r0[0].getWebView().getFavicon();
        }
        m3Var.F = bitmap;
        r3 r3Var4 = m3Var.c;
        if (r3Var4 != null) {
            m3Var.g = r3Var4.getWidth();
            m3Var.h = m3Var.c.getHeight();
        }
        m3Var.i = l();
        m3Var.D = org.telegram.ui.ActionBar.j6.I.q();
        return m3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean attachedToParent() {
        return this.c.isAttachedToWindow();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean b() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final boolean c(org.telegram.ui.ActionBar.j3 j3Var) {
        this.e = j3Var;
        if (j3Var != null) {
            this.f = true;
        }
        return true;
    }

    public final ValueAnimator d(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
        ofFloat.addUpdateListener(new x3(this, 0));
        return ofFloat;
    }

    @Override // org.telegram.ui.ActionBar.l2, android.content.DialogInterface
    public final void dismiss() {
        dismiss(true);
    }

    public final void e(boolean z4, yt0 yt0Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z4 ? 1.0f : 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new x3(this, 2));
        this.B.addListener(new androidx.fragment.app.g(this, z4, yt0Var, 3));
        this.B.setInterpolator(org.telegram.ui.Components.mr.h);
        this.B.setDuration(250L);
        this.B.start();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new x3(this, 1));
        this.y.addListener(new cg.l0(this, 27));
        this.y.setInterpolator(org.telegram.ui.Components.mr.h);
        this.y.setDuration(320L);
        this.y.start();
    }

    public final void g(org.telegram.ui.ActionBar.p2 p2Var) {
        zn znVar;
        lk lkVar;
        this.r = false;
        this.b = p2Var;
        p2Var.getResourceProvider();
        if ((p2Var instanceof zn) && (lkVar = (znVar = (zn) p2Var).V) != null) {
            lkVar.P();
            znVar.V.n0(true, false, true);
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var == null) {
            z3 z3Var = this.c;
            AndroidUtilities.removeFromParent(z3Var);
            if (p2Var.getLayoutContainer() != null) {
                p2Var.getLayoutContainer().addView(z3Var);
            }
        } else if (!j3Var.e) {
            j3Var.e = true;
            try {
                j3Var.show();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        n4 n4Var = this.H;
        r3 r3Var = n4Var.r0[0];
        if (r3Var != null && r3Var.B) {
            if (r3Var.getWebView() != null) {
                r3Var.getWebView().onResume();
            }
            r3Var.B = false;
        }
        r3 r3Var2 = n4Var.r0[1];
        if (r3Var2 != null && r3Var2.B) {
            if (r3Var2.getWebView() != null) {
                r3Var2.getWebView().onResume();
            }
            r3Var2.B = false;
        }
        n4.Y0.add(n4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.telegram.ui.Components.qc getBulletinFactory() {
        FrameLayout frameLayout;
        n4 n4Var = this.H;
        if (n4Var.r0[0].f()) {
            if (n4Var.r0[0].getWebView() != null) {
                frameLayout = n4Var.r0[0].f;
                return new org.telegram.ui.Components.qc(frameLayout, null);
            }
            return null;
        }
        r3 r3Var = n4Var.r0[0];
        TLRPC.WebPage webPage = r3Var.c.B;
        frameLayout = r3Var;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final int getNavigationBarColor(int i10) {
        float min = this.n ? 0.0f : Math.min(this.w, 1.0f - this.x) * (1.0f - this.F);
        int j10 = j();
        o0 o0Var = this.H.e0;
        if (o0Var != null) {
            j10 = i0.a.d(o0Var.U, j10, o0Var.x);
        }
        return i0.a.d(min, i10, j10);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final View getWindowView() {
        return this.c;
    }

    public final void h() {
        if (this.s != isFullyVisible()) {
            this.s = isFullyVisible();
            org.telegram.ui.ActionBar.p2 p2Var = this.b;
            if (p2Var == null || !(p2Var.getParentLayout() instanceof ActionBarLayout)) {
                z3 z3Var = this.c;
                if (z3Var.getParent() instanceof View) {
                    ((View) z3Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.b.getParentLayout();
            org.telegram.ui.ActionBar.w wVar = actionBarLayout.s;
            if (wVar != null) {
                wVar.invalidate();
            }
            org.telegram.ui.ActionBar.w wVar2 = actionBarLayout.w;
            if (wVar2 != null) {
                wVar2.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        z3 z3Var = this.c;
        AndroidUtilities.setLightStatusBar(j3Var != null ? j3Var.b : z3Var, isAttachedLightStatusBar());
        org.telegram.ui.ActionBar.j3 j3Var2 = this.e;
        if (j3Var2 == null) {
            LaunchActivity.D1.H(true, true, true);
            AndroidUtilities.setLightNavigationBar(z3Var, AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false))) >= 0.721f);
            return;
        }
        int navigationBarColor = j3Var2.a.getNavigationBarColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        j3Var2.d.setColor(navigationBarColor);
        j3Var2.c.invalidate();
        AndroidUtilities.setNavigationBarColor(j3Var2, navigationBarColor);
        AndroidUtilities.setLightNavigationBar(j3Var2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
        LaunchActivity.D1.H(true, true, true);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isAttachedLightStatusBar() {
        int d;
        float min = this.n ? 0.0f : (1.0f - this.F) * Math.min(this.w, 1.0f - this.x);
        if (this.C && min > 0.25f) {
            if (SharedConfig.adaptableColorInBrowser) {
                n4 n4Var = this.H;
                d = i0.a.d(1.0f - (n4Var.r0[0].getVisibility() == 0 ? 1.0f - (n4Var.r0[0].getTranslationX() / n4Var.r0[0].getWidth()) : 0.0f), n4Var.r0[0].getActionBarColor(), n4Var.r0[1].getActionBarColor());
            } else {
                d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            if (AndroidUtilities.computePerceivedBrightness(d) >= 0.721f) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isFullyVisible() {
        return this.D && this.x <= 0.0f && this.w >= 1.0f && this.F <= 0.0f && !this.n && !this.h;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean isShown() {
        z3 z3Var;
        return !this.h && !this.r && this.w > 0.5f && (z3Var = this.c) != null && z3Var.isAttachedToWindow() && AndroidUtilities.lerp(z3Var.E0.l() - AndroidUtilities.dp(20.0f), 0, Utilities.clamp01(z3Var.x0.c)) < z3Var.getHeight() && this.F < 1.0f;
    }

    public final int j() {
        if (!SharedConfig.adaptableColorInBrowser) {
            return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sk, false);
        }
        n4 n4Var = this.H;
        return i0.a.d(1.0f - (n4Var.r0[0].getVisibility() != 0 ? 0.0f : 1.0f - (n4Var.r0[0].getTranslationX() / n4Var.r0[0].getWidth())), n4Var.r0[0].getBackgroundColor(), n4Var.r0[1].getBackgroundColor());
    }

    public final int k() {
        int dp = AndroidUtilities.dp(16.0f);
        View view = this.d;
        return org.telegram.messenger.y3.z(20.0f, l(), dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight()));
    }

    public final int l() {
        n4 n4Var = this.H;
        int i10 = 0;
        r3 r3Var = n4Var.r0[0];
        float translationX = (r3Var == null || r3Var.getVisibility() != 0) ? 0.0f : 1.0f - (n4Var.r0[0].getTranslationX() / n4Var.r0[0].getWidth());
        float f10 = 1.0f - translationX;
        r3 r3Var2 = n4Var.r0[0];
        if (r3Var2 != null && r3Var2.getVisibility() == 0) {
            i10 = (int) (n4Var.r0[0].getAlpha() * n4Var.r0[0].getListTop() * translationX);
        }
        r3 r3Var3 = n4Var.r0[1];
        if (r3Var3 == null || r3Var3.getVisibility() != 0) {
            return i10;
        }
        return i10 + ((int) (n4Var.r0[1].getAlpha() * n4Var.r0[1].getListTop() * f10));
    }

    public final void m() {
        n4 n4Var = this.H;
        n4Var.r0[0].setLastVisible(this.G);
        n4Var.r0[1].setLastVisible(false);
    }

    public final void n() {
        View view = this.d;
        if (view == null) {
            return;
        }
        view.setTranslationY(Math.max(1.0f - this.w, this.n ? 0.0f : this.x) * k());
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean onAttachedBackPressed() {
        n4 n4Var = this.H;
        if (n4Var.l0) {
            AndroidUtilities.hideKeyboard(this.c);
            return true;
        }
        o0 o0Var = n4Var.e0;
        if (o0Var.Q) {
            o0Var.h(false);
            return true;
        }
        if (o0Var.T) {
            o0Var.k(false);
            return true;
        }
        if (n4Var.J()) {
            r3 r3Var = n4Var.r0[0];
            if (r3Var.s) {
                if (r3Var.f() && r3Var.getWebView() != null) {
                    r3Var.getWebView().goBack();
                }
                return true;
            }
        }
        if (n4Var.a0.size() > 1) {
            n4Var.G();
            return true;
        }
        dismiss(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final void release() {
        this.r = true;
        n4 n4Var = this.H;
        r3 r3Var = n4Var.r0[0];
        if (r3Var != null && r3Var.h) {
            o3 o3Var = r3Var.e;
            o3Var.setSwipeOffsetY((-o3Var.f) + o3Var.e);
            n4Var.r0[0].h = false;
        }
        r3 r3Var2 = n4Var.r0[0];
        if (r3Var2 != null && !r3Var2.B) {
            if (r3Var2.getWebView() != null) {
                r3Var2.getWebView().onPause();
            }
            r3Var2.B = true;
        }
        r3 r3Var3 = n4Var.r0[1];
        if (r3Var3 != null && !r3Var3.B) {
            if (r3Var3.getWebView() != null) {
                r3Var3.getWebView().onPause();
            }
            r3Var3.B = true;
        }
        org.telegram.ui.ActionBar.j3 j3Var = this.e;
        if (j3Var != null) {
            j3Var.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.b;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            if (this.e == null) {
                AndroidUtilities.removeFromParent(this.c);
            }
        }
        nh.k3 k3Var = this.v;
        if (k3Var != null) {
            k3Var.run();
            this.v = null;
        }
        n4.Y0.remove(n4Var);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setLastVisible(boolean z4) {
        this.G = z4;
        n4 n4Var = this.H;
        n4Var.r0[0].setLastVisible(z4);
        n4Var.r0[1].setLastVisible(false);
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setOnDismissListener(Runnable runnable) {
        this.v = (nh.k3) runnable;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void dismiss(boolean z4) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.n = z4;
        if (z4) {
            LaunchActivity.D1.v0.b(this);
        } else {
            e(true, new yt0(this, 10));
        }
        i();
        h();
    }

    @Override // org.telegram.ui.ActionBar.t3
    public final org.telegram.ui.ActionBar.u3 getWindowView() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.l2
    public final void setKeyboardHeightFromParent(int i10) {
    }
}
