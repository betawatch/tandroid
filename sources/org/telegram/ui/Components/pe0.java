package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pe0 implements org.telegram.ui.ActionBar.t4 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public z2 K;
    public final Context a;
    public final View b;
    public final oe0 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final dh.c e;
    public final ui.d f;
    public final gh.a h;
    public final gh.a n;
    public final org.telegram.ui.ActionBar.h6 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public boolean w;
    public boolean y;
    public boolean x = true;
    public int F = -1;

    public pe0(Activity activity, View view, oe0 oe0Var, org.telegram.ui.ActionBar.j5 j5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = activity;
        this.b = view;
        this.c = oe0Var;
        this.d = j5Var;
        this.e = cVar;
        this.f = dVar;
        this.h = aVar;
        this.n = piVar;
        this.r = h6Var;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, activity, h6Var);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        this.c.W(rectF);
        if (this.x) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.r)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new ne0(this, runnable, 0));
        this.s.a(frameLayout, c8.ma.o(-1, i7));
        this.G = org.telegram.messenger.g0.L(i7) + this.G;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean f() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final fh.g g(org.telegram.ui.ActionBar.j5 j5Var) {
        fh.g c10 = this.e.c(j5Var, null, false);
        c10.p(this.h);
        org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getButtonsGlassBackgroundColor() {
        return this.n.A2();
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final gh.a getButtonsGlassColorProvider() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getMenuExtraBelow() {
        return this.E;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final gh.a getMenuGlassColorProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final View getMenuHostView() {
        return this.c.k0();
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final org.telegram.ui.ActionBar.h6 getMenuResourcesProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final View getMenuView() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final org.telegram.ui.ActionBar.j5 getOpenMenuOverlay() {
        if (this.w) {
            return this.d;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void h(org.telegram.ui.ActionBar.j5 j5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10 = j5Var != null;
        this.w = z10;
        this.c.T(z10);
    }

    public final void i() {
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (j5Var.d == this && j5Var.e == null && (j5Var.I || j5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        oe0 oe0Var = this.c;
        oe0Var.W(rectF);
        ji.r k02 = oe0Var.k0();
        int[] iArr = new int[2];
        k02.getLocationInWindow(iArr);
        Rect rect = new Rect();
        k02.getWindowVisibleDisplayFrame(rect);
        float L = org.telegram.messenger.g0.L(24.0f) + this.G;
        int i7 = this.H;
        if (i7 > 0) {
            L = Math.min(L, i7);
        }
        int i10 = this.F;
        int min = i10 > 0 ? Math.min(rect.bottom, i10) : rect.bottom;
        float f10 = iArr[1];
        float f11 = min - (rectF.bottom + f10);
        float f12 = (f10 + rectF.top) - rect.top;
        int i11 = 0;
        boolean z10 = f11 < L && f11 <= f12;
        this.x = z10;
        if (z10 && f12 < L) {
            i11 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.E = i11;
        this.I = null;
        j5Var.setOnClosed(new me0(this, 1));
        j5Var.d(this, null, this.s);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f;
        if (dVar != null) {
            dVar.j(f10);
        }
        z2 z2Var = this.K;
        if (z2Var != null) {
            z2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.y = true;
        }
        if (!this.y || f10 >= 0.06f) {
            return;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (j5Var.I || !this.w) {
            return;
        }
        this.y = false;
        j5Var.post(new me0(this, 0));
    }
}
