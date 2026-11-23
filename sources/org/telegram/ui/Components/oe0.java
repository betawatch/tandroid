package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oe0 implements org.telegram.ui.ActionBar.t4 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public y2 K;
    public final Context a;
    public final View b;
    public final ne0 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final dh.c e;
    public final ui.d f;
    public final gh.a h;
    public final gh.a n;
    public final org.telegram.ui.ActionBar.i6 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public boolean w;
    public boolean y;
    public boolean x = true;
    public int F = -1;

    public oe0(Activity activity, View view, ne0 ne0Var, org.telegram.ui.ActionBar.k5 k5Var, dh.c cVar, ui.d dVar, gh.a aVar, org.telegram.ui.pi piVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = activity;
        this.b = view;
        this.c = ne0Var;
        this.d = k5Var;
        this.e = cVar;
        this.f = dVar;
        this.h = aVar;
        this.n = piVar;
        this.r = i6Var;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, activity, i6Var);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final boolean b(org.telegram.ui.ActionBar.q0 q0Var, RectF rectF) {
        this.c.E1(rectF);
        if (this.x) {
            rectF.bottom += org.telegram.messenger.g0.L(6.0f);
            return true;
        }
        rectF.top -= org.telegram.messenger.g0.L(6.0f);
        return true;
    }

    public final void c(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.r)), 2, -1));
        frameLayout.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
        frameLayout.setOnClickListener(new me0(this, runnable, 0));
        this.s.a(frameLayout, c8.na.o(-1, i7));
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
    public final fh.g g(org.telegram.ui.ActionBar.k5 k5Var) {
        fh.g c10 = this.e.c(k5Var, null, false);
        c10.p(this.h);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(22.0f), 6.0f);
        return c10;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getButtonsGlassBackgroundColor() {
        return this.n.x2();
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
        return this.c.v2();
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final org.telegram.ui.ActionBar.i6 getMenuResourcesProvider() {
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
    public final org.telegram.ui.ActionBar.k5 getOpenMenuOverlay() {
        if (this.w) {
            return this.d;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void h(org.telegram.ui.ActionBar.k5 k5Var, org.telegram.ui.ActionBar.q0 q0Var) {
        boolean z10 = k5Var != null;
        this.w = z10;
        this.c.s1(z10);
    }

    public final void i() {
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (k5Var.d == this && k5Var.e == null && (k5Var.I || k5Var.S)) {
            return;
        }
        RectF rectF = new RectF();
        ne0 ne0Var = this.c;
        ne0Var.E1(rectF);
        ji.q v22 = ne0Var.v2();
        int[] iArr = new int[2];
        v22.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v22.getWindowVisibleDisplayFrame(rect);
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
        k5Var.setOnClosed(new le0(this, 1));
        k5Var.d(this, null, this.s);
    }

    @Override // org.telegram.ui.ActionBar.t4
    public final void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = this.f;
        if (dVar != null) {
            dVar.j(f10);
        }
        y2 y2Var = this.K;
        if (y2Var != null) {
            y2Var.a(Float.valueOf(f10));
        }
        if (f10 > 0.9f) {
            this.y = true;
        }
        if (!this.y || f10 >= 0.06f) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (k5Var.I || !this.w) {
            return;
        }
        this.y = false;
        k5Var.post(new le0(this, 0));
    }
}
