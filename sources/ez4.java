// default package

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ez4 implements o27 {
    public final eg0 a;
    public final ol0 b;
    public final vnb c;
    public final int d;
    public FrameLayout e;
    public View f;
    public ula h;
    public boolean n;
    public boolean r;

    public ez4(eg0 eg0Var, ol0 ol0Var, vnb vnbVar, int i) {
        this.a = eg0Var;
        this.b = ol0Var;
        this.c = vnbVar;
        this.d = i;
    }

    @Override // o27
    public final boolean a() {
        return this.n;
    }

    @Override // o27
    public final void b(ula ulaVar, s7 s7Var) {
        boolean z = ulaVar != null;
        this.r = z;
        this.e.setVisibility(z ? 4 : 0);
    }

    @Override // o27
    public final boolean c(s7 s7Var, RectF rectF) {
        int i = this.d;
        rectF.set(i, i, this.e.getWidth() - i, this.e.getHeight() - i);
        return true;
    }

    @Override // o27
    public final boolean d() {
        return true;
    }

    public final boolean e(FrameLayout frameLayout, View view, boolean z, ula ulaVar, fu5 fu5Var) {
        FrameLayout frameLayout2;
        if (ulaVar == null || ulaVar.I || !frameLayout.isAttachedToWindow() || frameLayout.getWidth() <= 0 || !(fu5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            return false;
        }
        if (this.r && (frameLayout2 = this.e) != null && frameLayout2 != frameLayout) {
            frameLayout2.setVisibility(0);
        }
        this.e = frameLayout;
        this.f = view;
        this.n = z;
        this.h = ulaVar;
        fu5Var.p = new cx0(ulaVar, (byte) 1);
        ulaVar.e(this, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) fu5Var.A);
        return true;
    }

    @Override // o27
    public final boolean f() {
        return true;
    }

    @Override // o27
    public final boolean g() {
        return true;
    }

    @Override // o27
    public final int getButtonsGlassBackgroundColor() {
        ol0 ol0Var = this.b;
        return ol0Var.a(ol0Var.e);
    }

    @Override // o27
    public final bl0 getButtonsGlassColorProvider() {
        return this.b;
    }

    @Override // o27
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override // o27
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override // o27
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override // o27
    public final bl0 getMenuGlassColorProvider() {
        return this.b;
    }

    @Override // o27
    public final View getMenuHostView() {
        return this.e;
    }

    @Override // o27
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override // o27
    public final vnb getMenuResourcesProvider() {
        return this.c;
    }

    @Override // o27
    public final int getMenuRise() {
        return hl.L(8.0f);
    }

    @Override // o27
    public final View getMenuView() {
        return this.f;
    }

    @Override // o27
    public final ula getOpenMenuOverlay() {
        if (this.r) {
            return this.h;
        }
        return null;
    }

    @Override // o27
    public final boolean h() {
        return false;
    }

    @Override // o27
    public final jl0 i(ula ulaVar) {
        jl0 c = this.a.d.c(ulaVar, null, false);
        c.p(this.b);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    @Override // o27
    public final void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.a.e;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }
}
