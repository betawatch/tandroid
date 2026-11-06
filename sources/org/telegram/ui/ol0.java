package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class ol0 extends View {
    public final Paint D;
    public boolean E;
    public boolean F;
    public int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.z4 h;
    public final org.telegram.ui.Components.z4 n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public ol0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = 0.0f;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.h = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.n = new org.telegram.ui.Components.z4(this, 350L, xqVar);
        this.D = new Paint(1);
        this.b = f6Var;
        this.a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, f6Var);
        b(-1, -1, false);
    }

    public final void b(int i7, int i10, boolean z9) {
        org.telegram.messenger.gp gpVar;
        org.telegram.messenger.fp fpVar = null;
        if (i10 >= 0 && i7 >= 0 && (gpVar = org.telegram.messenger.qp.s1(i7).r4) != null) {
            fpVar = gpVar.d(i10);
        }
        c(fpVar, z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        this.d = false;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        if (fpVar == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, f6Var);
            this.f = w02;
            this.e = w02;
        } else {
            boolean a10 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
            this.e = fpVar.c(a10);
            this.f = fpVar.d(a10);
        }
        if (!z9) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int w02;
        boolean z9 = this.d;
        org.telegram.ui.Components.z4 z4Var = this.n;
        org.telegram.ui.Components.z4 z4Var2 = this.h;
        if (z9 && (this.e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b)) || this.f != w02)) {
            this.f = w02;
            this.e = w02;
            z4Var2.a(w02, true);
            z4Var.a(w02, true);
        }
        int a10 = z4Var2.a(this.e, false);
        int a11 = z4Var.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.D;
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
        if (this.c >= 1.0f || this.E) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawColor(this.a);
        }
        paint.setAlpha(this.E ? org.telegram.messenger.qs.e4 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i7 = org.telegram.ui.ActionBar.k6.v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        return i0.a.f(this.c, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.d ? org.telegram.ui.ActionBar.k6.w0(i7, f6Var) : -1);
    }

    public int getColor() {
        return i0.a.f(this.c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, this.b), i0.a.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i7 = org.telegram.ui.ActionBar.k6.s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int w02 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v8, f6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.Components.z4 z4Var = this.h;
        int i10 = z4Var.c;
        org.telegram.ui.Components.z4 z4Var2 = this.n;
        return i0.a.f(this.c, w02, org.telegram.messenger.g0.B(i0.a.f(0.75f, i10, z4Var2.c)) > 0.721f ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var) : org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, z4Var.c, z4Var2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (!this.F) {
            i10 = org.telegram.messenger.camera.q.B(230.0f, org.telegram.messenger.g0.m, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
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
