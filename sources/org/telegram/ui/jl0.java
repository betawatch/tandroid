package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class jl0 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.x4 h;
    public final org.telegram.ui.Components.x4 n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public jl0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.n = new org.telegram.ui.Components.x4(this, 350L, xqVar);
        this.E = new Paint(1);
        this.b = e6Var;
        this.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, e6Var);
        b(-1, -1, false);
    }

    public final void b(int i3, int i10, boolean z10) {
        org.telegram.messenger.xo xoVar;
        org.telegram.messenger.wo woVar = null;
        if (i10 >= 0 && i3 >= 0 && (xoVar = org.telegram.messenger.hp.s1(i3).r4) != null) {
            woVar = xoVar.d(i10);
        }
        c(woVar, z10);
    }

    public final void c(org.telegram.messenger.wo woVar, boolean z10) {
        this.d = false;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        if (woVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, e6Var);
            this.f = w02;
            this.e = w02;
        } else {
            boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
            this.e = woVar.c(a10);
            this.f = woVar.d(a10);
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
        org.telegram.ui.Components.x4 x4Var = this.n;
        org.telegram.ui.Components.x4 x4Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b)) || this.f != w02)) {
            this.f = w02;
            this.e = w02;
            x4Var2.a(w02, true);
            x4Var.a(w02, true);
        }
        int a10 = x4Var2.a(this.e, false);
        int a11 = x4Var.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a10 || this.s != a11 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f10 = this.w;
            float f11 = f10 / 2.0f;
            float f12 = this.x;
            float f13 = f12 * 0.4f;
            Typeface typeface = org.telegram.messenger.g0.a;
            float f14 = f10 - 0.0f;
            float f15 = f12 - 0.0f;
            float sqrt = ((float) Math.sqrt((f15 * f15) + (f14 * f14))) * 0.75f;
            this.s = a11;
            this.r = a10;
            RadialGradient radialGradient2 = new RadialGradient(f11, f13, sqrt, new int[]{a11, a10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.y = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.c >= 1.0f || this.F) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        }
        paint.setAlpha(this.F ? org.telegram.messenger.hs.e4 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i3 = org.telegram.ui.ActionBar.k6.v8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        return i0.a.f(this.c, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.d ? org.telegram.ui.ActionBar.k6.w0(i3, e6Var) : -1);
    }

    public int getColor() {
        return i0.a.f(this.c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b), i0.a.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i3 = org.telegram.ui.ActionBar.k6.s8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int w02 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, e6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.Components.x4 x4Var = this.h;
        int i10 = x4Var.c;
        org.telegram.ui.Components.x4 x4Var2 = this.n;
        return i0.a.f(this.c, w02, org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, x4Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, e6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, x4Var.c, x4Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        if (!this.G) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.m, TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.c - f10) > 0.001f) {
            this.c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
