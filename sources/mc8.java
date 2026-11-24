// default package

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mc8 implements h27 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public mf2 K;
    public final Activity a;
    public final View b;
    public final kj1 c;
    public final bka d;
    public final km0 e;
    public final lz4 f;
    public final am0 h;
    public final jr1 n;
    public final ylb r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public boolean w;
    public boolean y;
    public boolean x = true;
    public int F = -1;

    public mc8(Activity activity, View view, kj1 kj1Var, bka bkaVar, km0 km0Var, lz4 lz4Var, am0 am0Var, jr1 jr1Var, ylb ylbVar) {
        this.a = activity;
        this.b = view;
        this.c = kj1Var;
        this.d = bkaVar;
        this.e = km0Var;
        this.f = lz4Var;
        this.h = am0Var;
        this.n = jr1Var;
        this.r = ylbVar;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, ylbVar, activity);
    }

    @Override // h27
    public final boolean a() {
        return true;
    }

    @Override // h27
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z = bkaVar != null;
        this.w = z;
        this.c.d0(z);
    }

    @Override // h27
    public final boolean c(r7 r7Var, RectF rectF) {
        this.c.l0(rectF);
        if (this.x) {
            rectF.bottom += gm.L(6.0f);
            return true;
        }
        rectF.top -= gm.L(6.0f);
        return true;
    }

    @Override // h27
    public final boolean d() {
        return false;
    }

    public final void e(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(cmb.f0(cmb.p1(0.12f, cmb.v0(cmb.D8, this.r)), 2, -1));
        frameLayout.setMinimumWidth(gm.L(220.0f));
        frameLayout.setOnClickListener(new lc8(this, runnable, (byte) 0));
        this.s.a(frameLayout, qoe.o(-1, i));
        this.G = gm.L(i) + this.G;
    }

    @Override // h27
    public final boolean f() {
        return true;
    }

    @Override // h27
    public final boolean g() {
        return true;
    }

    @Override // h27
    public final int getButtonsGlassBackgroundColor() {
        return this.n.K1();
    }

    @Override // h27
    public final am0 getButtonsGlassColorProvider() {
        return this.n;
    }

    @Override // h27
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override // h27
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override // h27
    public final int getMenuExtraBelow() {
        return this.E;
    }

    @Override // h27
    public final am0 getMenuGlassColorProvider() {
        return this.h;
    }

    @Override // h27
    public final View getMenuHostView() {
        return this.c.v0();
    }

    @Override // h27
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override // h27
    public final ylb getMenuResourcesProvider() {
        return this.r;
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
        if (this.w) {
            return this.d;
        }
        return null;
    }

    @Override // h27
    public final boolean h() {
        return this.x;
    }

    @Override // h27
    public final im0 i(bka bkaVar) {
        im0 c = this.e.c(bkaVar, null, false);
        c.p(this.h);
        wi8.r(c, gm.L(22.0f), 6.0f);
        return c;
    }

    public final void j() {
        bka bkaVar = this.d;
        if (bkaVar.d(this)) {
            return;
        }
        RectF rectF = new RectF();
        kj1 kj1Var = this.c;
        kj1Var.l0(rectF);
        View v0 = kj1Var.v0();
        int[] iArr = new int[2];
        v0.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v0.getWindowVisibleDisplayFrame(rect);
        float L = gm.L(24.0f) + this.G;
        int i = this.H;
        if (i > 0) {
            L = Math.min(L, i);
        }
        int i2 = this.F;
        int i3 = rect.bottom;
        if (i2 > 0) {
            i3 = Math.min(i3, i2);
        }
        float f = iArr[1];
        float f2 = i3 - (rectF.bottom + f);
        float f3 = (f + rectF.top) - rect.top;
        int i4 = 0;
        boolean z = f2 < L && f2 <= f3;
        this.x = z;
        if (z && f3 < L) {
            i4 = (int) Math.max(0.0f, Math.min(f2 - gm.L(8.0f), L - f3));
        }
        this.E = i4;
        this.I = null;
        bkaVar.setOnClosed(new kc8(this, (byte) 1));
        bkaVar.e(this, null, this.s);
    }

    @Override // h27
    public final void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = this.f;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
        mf2 mf2Var = this.K;
        if (mf2Var != null) {
            ((jlc) mf2Var.b).setEditMenuProgress(f);
        }
        if (f > 0.9f) {
            this.y = true;
        }
        if (!this.y || f >= 0.06f) {
            return;
        }
        bka bkaVar = this.d;
        if (bkaVar.I || !this.w) {
            return;
        }
        this.y = false;
        bkaVar.post(new kc8(this, (byte) 0));
    }
}
