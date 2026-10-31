package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class an0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.w4 h;
    public final org.telegram.ui.Components.w4 n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public an0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.n = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.D = new Paint(1);
        this.b = p6Var;
        this.a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, p6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        org.telegram.messenger.lp lpVar;
        org.telegram.messenger.kp kpVar = null;
        if (i11 >= 0 && i10 >= 0 && (lpVar = org.telegram.messenger.vp.r1(i10).s4) != null) {
            kpVar = lpVar.d(i11);
        }
        c(kpVar, z10);
    }

    public final void c(org.telegram.messenger.kp kpVar, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        if (kpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, p6Var);
            this.f = w02;
            this.e = w02;
        } else {
            boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
            this.e = kpVar.c(a2);
            this.f = kpVar.d(a2);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.w4 w4Var = this.n;
        org.telegram.ui.Components.w4 w4Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.b)) || this.f != w02)) {
            this.f = w02;
            this.e = w02;
            w4Var2.a(w02, true);
            w4Var.a(w02, true);
        }
        int a2 = w4Var2.a(this.e, false);
        int a10 = w4Var.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.D;
        if (radialGradient == null || this.r != a2 || this.s != a10 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f7 = this.w;
            float f10 = f7 / 2.0f;
            float f11 = this.x;
            float f12 = f11 * 0.4f;
            Typeface typeface = org.telegram.messenger.i0.a;
            float f13 = f7 - 0.0f;
            float f14 = f11 - 0.0f;
            float sqrt = ((float) Math.sqrt((f14 * f14) + (f13 * f13))) * 0.75f;
            this.s = a10;
            this.r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f10, f12, sqrt, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c >= 1.0f || this.E) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        }
        paint.setAlpha(this.E ? org.telegram.messenger.zs.e4 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10 = org.telegram.ui.ActionBar.t6.v8;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        return i0.b.f(this.c, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.d ? org.telegram.ui.ActionBar.t6.w0(i10, p6Var) : -1);
    }

    public int getColor() {
        return i0.b.f(this.c, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, this.b), i0.b.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i10 = org.telegram.ui.ActionBar.t6.s8;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int w02 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) > 0.721f ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v8, p6Var) : org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.Components.w4 w4Var = this.h;
        int i11 = w4Var.c;
        org.telegram.ui.Components.w4 w4Var2 = this.n;
        return i0.b.f(this.c, w02, org.telegram.messenger.i0.B(i0.b.f(0.75f, i11, w4Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var) : org.telegram.ui.ActionBar.t6.b(0.08f, -0.08f, i0.b.f(0.75f, w4Var.c, w4Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.z20.B(230.0f, org.telegram.messenger.i0.m, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.c - f7) > 0.001f) {
            this.c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
