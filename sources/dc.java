// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class dc implements h27 {
    public final int a;
    public final View b;
    public final bka c;
    public final ylb d;
    public final sm2 e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public boolean h;
    public Drawable n;
    public final int[] r = new int[2];
    public int s = TLObject.FLAG_31;
    public final cc w = new cc(this, 0);
    public ViewTreeObserver x;

    public dc(int i, View view, sm2 sm2Var, ylb ylbVar) {
        this.a = i;
        this.b = view;
        this.e = sm2Var;
        this.c = (bka) sm2Var.b;
        this.d = ylbVar;
        this.f = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 4, ylbVar, view.getContext());
    }

    @Override // h27
    public final boolean a() {
        return false;
    }

    @Override // h27
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z;
        boolean z2 = this.h;
        boolean z3 = bkaVar != null;
        this.h = z3;
        float f = z3 ? 0.0f : 1.0f;
        View view = this.b;
        view.setAlpha(f);
        ad adVar = (ad) this;
        int i = tc.h;
        if (cmb.p1(0.06f, cmb.v0(cmb.Ke, adVar.d)) != 0 && (z = this.h) != z2) {
            if (z) {
                this.n = view.getBackground();
                view.setBackground(null);
            } else {
                Drawable drawable = this.n;
                if (drawable != null) {
                    view.setBackground(drawable);
                    this.n = null;
                }
            }
        }
        ViewTreeObserver viewTreeObserver = this.x;
        cc ccVar = this.w;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeOnPreDrawListener(ccVar);
            }
            this.x = null;
        }
        if (this.h) {
            int[] iArr = this.r;
            view.getLocationInWindow(iArr);
            this.s = iArr[1];
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.x = viewTreeObserver2;
            viewTreeObserver2.addOnPreDrawListener(ccVar);
        }
        if (this.h) {
            return;
        }
        wc wcVar = adVar.E;
        if (wcVar.a.isFocused()) {
            gm.t1(wcVar.a);
        }
        wcVar.a.clearFocus();
    }

    @Override // h27
    public final boolean c(r7 r7Var, RectF rectF) {
        View view = this.b;
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        return true;
    }

    @Override // h27
    public final boolean d() {
        return true;
    }

    @Override // h27
    public final boolean f() {
        return false;
    }

    @Override // h27
    public final boolean g() {
        return true;
    }

    @Override // h27
    public final int getButtonsGlassBackgroundColor() {
        return ((jr1) this.e.f).K1();
    }

    @Override // h27
    public final am0 getButtonsGlassColorProvider() {
        return (jr1) this.e.f;
    }

    @Override // h27
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override // h27
    public final am0 getMenuGlassColorProvider() {
        return (am0) this.e.e;
    }

    @Override // h27
    public final View getMenuHostView() {
        return this.b;
    }

    @Override // h27
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override // h27
    public final ylb getMenuResourcesProvider() {
        return this.d;
    }

    @Override // h27
    public final int getMenuRise() {
        return 0;
    }

    @Override // h27
    public final View getMenuView() {
        return this.b;
    }

    @Override // h27
    public final bka getOpenMenuOverlay() {
        if (this.h) {
            return this.c;
        }
        return null;
    }

    @Override // h27
    public final boolean h() {
        return true;
    }

    @Override // h27
    public final im0 i(bka bkaVar) {
        sm2 sm2Var = this.e;
        im0 c = ((km0) sm2Var.c).c(bkaVar, null, false);
        c.p((am0) sm2Var.e);
        wi8.r(c, gm.L(22.0f), 6.0f);
        return c;
    }

    @Override // h27
    public final void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = (lz4) this.e.d;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }
}
