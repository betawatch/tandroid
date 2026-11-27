// default package

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ae8 implements o27 {
    public int E;
    public int G;
    public int H;
    public Runnable I;
    public Runnable J;
    public te2 K;
    public final Activity a;
    public final View b;
    public final li1 c;
    public final ula d;
    public final ll0 e;
    public final pz4 f;
    public final bl0 h;
    public final kq1 n;
    public final vnb r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public boolean w;
    public boolean y;
    public boolean x = true;
    public int F = -1;

    public ae8(Activity activity, View view, li1 li1Var, ula ulaVar, ll0 ll0Var, pz4 pz4Var, bl0 bl0Var, kq1 kq1Var, vnb vnbVar) {
        this.a = activity;
        this.b = view;
        this.c = li1Var;
        this.d = ulaVar;
        this.e = ll0Var;
        this.f = pz4Var;
        this.h = bl0Var;
        this.n = kq1Var;
        this.r = vnbVar;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, vnbVar, activity);
    }

    @Override // o27
    public final boolean a() {
        return true;
    }

    @Override // o27
    public final void b(ula ulaVar, s7 s7Var) {
        boolean z = ulaVar != null;
        this.w = z;
        this.c.f0(z);
    }

    @Override // o27
    public final boolean c(s7 s7Var, RectF rectF) {
        this.c.m0(rectF);
        if (this.x) {
            rectF.bottom += hl.L(6.0f);
            return true;
        }
        rectF.top -= hl.L(6.0f);
        return true;
    }

    @Override // o27
    public final boolean d() {
        return true;
    }

    public final void e(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(aob.f0(aob.p1(0.12f, aob.v0(aob.E8, this.r)), 2, -1));
        frameLayout.setMinimumWidth(hl.L(220.0f));
        frameLayout.setOnClickListener(new zd8(this, runnable, (byte) 0));
        this.s.a(frameLayout, tre.o(-1, i));
        this.G = hl.L(i) + this.G;
    }

    @Override // o27
    public final boolean f() {
        return true;
    }

    @Override // o27
    public final boolean g() {
        return false;
    }

    @Override // o27
    public final int getButtonsGlassBackgroundColor() {
        return this.n.Q1();
    }

    @Override // o27
    public final bl0 getButtonsGlassColorProvider() {
        return this.n;
    }

    @Override // o27
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override // o27
    public final int getMenuDimAlpha() {
        return 51;
    }

    @Override // o27
    public final int getMenuExtraBelow() {
        return this.E;
    }

    @Override // o27
    public final bl0 getMenuGlassColorProvider() {
        return this.h;
    }

    @Override // o27
    public final View getMenuHostView() {
        return this.c.x0();
    }

    @Override // o27
    public final int getMenuMaxHeight() {
        return this.H;
    }

    @Override // o27
    public final vnb getMenuResourcesProvider() {
        return this.r;
    }

    @Override // o27
    public final int getMenuRise() {
        return 0;
    }

    @Override // o27
    public final View getMenuView() {
        return this.b;
    }

    @Override // o27
    public final ula getOpenMenuOverlay() {
        if (this.w) {
            return this.d;
        }
        return null;
    }

    @Override // o27
    public final boolean h() {
        return this.x;
    }

    @Override // o27
    public final jl0 i(ula ulaVar) {
        jl0 c = this.e.c(ulaVar, null, false);
        c.p(this.h);
        ik8.r(c, hl.L(22.0f), 6.0f);
        return c;
    }

    public final void j() {
        ula ulaVar = this.d;
        if (ulaVar.d(this)) {
            return;
        }
        RectF rectF = new RectF();
        li1 li1Var = this.c;
        li1Var.m0(rectF);
        View x0 = li1Var.x0();
        int[] iArr = new int[2];
        x0.getLocationInWindow(iArr);
        Rect rect = new Rect();
        x0.getWindowVisibleDisplayFrame(rect);
        float L = hl.L(24.0f) + this.G;
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
            i4 = (int) Math.max(0.0f, Math.min(f2 - hl.L(8.0f), L - f3));
        }
        this.E = i4;
        this.I = null;
        ulaVar.setOnClosed(new yd8(this, (byte) 1));
        ulaVar.e(this, null, this.s);
    }

    @Override // o27
    public final void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.f;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
        te2 te2Var = this.K;
        if (te2Var != null) {
            ((vnc) te2Var.b).setEditMenuProgress(f);
        }
        if (f > 0.9f) {
            this.y = true;
        }
        if (!this.y || f >= 0.06f) {
            return;
        }
        ula ulaVar = this.d;
        if (ulaVar.I || !this.w) {
            return;
        }
        this.y = false;
        ulaVar.post(new yd8(this, (byte) 0));
    }
}
