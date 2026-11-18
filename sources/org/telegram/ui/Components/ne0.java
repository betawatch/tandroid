package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ne0 implements org.telegram.ui.ActionBar.u4 {
    public int F;
    public int G;
    public Runnable H;
    public Runnable I;
    public y2 J;
    public final View a;
    public final me0 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final dh.c d;
    public final ui.d e;
    public final gh.a f;
    public final gh.a h;
    public final org.telegram.ui.ActionBar.i6 n;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout r;
    public boolean s;
    public boolean x;
    public int y;
    public boolean w = true;
    public int E = -1;

    public ne0(Activity activity, View view, me0 me0Var, org.telegram.ui.ActionBar.k5 k5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = view;
        this.b = me0Var;
        this.c = k5Var;
        this.d = cVar;
        this.e = dVar;
        this.f = aVar;
        this.h = piVar;
        this.n = i6Var;
        this.r = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, i6Var);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean b(org.telegram.ui.ActionBar.r0 r0Var, RectF rectF) {
        this.b.W(rectF);
        if (this.w) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.n)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new y7(22, this, runnable));
        this.r.a(frameLayout, c8.ma.o(-1, i7));
        this.F = org.telegram.messenger.g0.L(i7) + this.F;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final boolean f() {
        return this.w;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final fh.g g(org.telegram.ui.ActionBar.k5 k5Var) {
        fh.g c10 = this.d.c(k5Var, null, false);
        c10.p(this.f);
        org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final int getButtonsGlassBackgroundColor() {
        return this.h.A2();
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final gh.a getButtonsGlassColorProvider() {
        return this.h;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ int getMenuAnchorTint() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final int getMenuExtraBelow() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final gh.a getMenuGlassColorProvider() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final View getMenuHostView() {
        return this.b.k0();
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final int getMenuMaxHeight() {
        return this.G;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final org.telegram.ui.ActionBar.i6 getMenuResourcesProvider() {
        return this.n;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final /* synthetic */ int getMenuRise() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final View getMenuView() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final org.telegram.ui.ActionBar.k5 getOpenMenuOverlay() {
        if (this.s) {
            return this.c;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final void h(org.telegram.ui.ActionBar.k5 k5Var, org.telegram.ui.ActionBar.r0 r0Var) {
        boolean z10 = k5Var != null;
        this.s = z10;
        this.b.T(z10);
    }

    public final void i() {
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var.d == this && k5Var.e == null && (k5Var.I || k5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        me0 me0Var = this.b;
        me0Var.W(rectF);
        ji.p k02 = me0Var.k0();
        int[] iArr = new int[2];
        k02.getLocationInWindow(iArr);
        Rect rect = new Rect();
        k02.getWindowVisibleDisplayFrame(rect);
        float L = org.telegram.messenger.g0.L(24.0f) + this.F;
        int i7 = this.G;
        if (i7 > 0) {
            L = Math.min(L, i7);
        }
        int i10 = this.E;
        int min = i10 > 0 ? Math.min(rect.bottom, i10) : rect.bottom;
        float f10 = iArr[1];
        float f11 = min - (rectF.bottom + f10);
        float f12 = (f10 + rectF.top) - rect.top;
        int i11 = 0;
        boolean z10 = f11 < L && f11 <= f12;
        this.w = z10;
        if (z10 && f12 < L) {
            i11 = (int) Math.max(0.0f, Math.min(f11 - org.telegram.messenger.g0.L(8.0f), L - f12));
        }
        this.y = i11;
        this.H = null;
        k5Var.setOnClosed(new le0(this, 1));
        k5Var.d(this, null, this.r);
    }

    @Override // org.telegram.ui.ActionBar.u4
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.e;
        if (dVar != null) {
            dVar.j(f10);
        }
        y2 y2Var = this.J;
        if (y2Var != null) {
            y2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.x = true;
        }
        if (!this.x || f10 >= 0.06f) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var.I || !this.s) {
            return;
        }
        this.x = false;
        k5Var.post(new le0(this, 0));
    }
}
