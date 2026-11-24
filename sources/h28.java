// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class h28 extends View {
    public final Paint E;
    public boolean F;
    public boolean G;
    public int a;
    public final ylb b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public final km h;
    public final km n;
    public int r;
    public int s;
    public int w;
    public int x;
    public RadialGradient y;

    public h28(Context context, ylb ylbVar) {
        super(context);
        this.c = 0.0f;
        d53 d53Var = d53.h;
        this.h = new km(this, 350L, d53Var);
        this.n = new km(this, 350L, d53Var);
        this.E = new Paint(1);
        this.b = ylbVar;
        this.a = cmb.v0(cmb.r8, ylbVar);
        b(-1, -1, false);
    }

    public final void b(int i, int i2, boolean z) {
        fc7 fc7Var;
        ec7 ec7Var = null;
        if (i2 >= 0 && i >= 0 && (fc7Var = oc7.r1(i).F3) != null) {
            ec7Var = fc7Var.d(i2);
        }
        c(ec7Var, z);
    }

    public final void c(ec7 ec7Var, boolean z) {
        this.d = false;
        ylb ylbVar = this.b;
        if (ec7Var == null) {
            this.d = true;
            int v0 = cmb.v0(cmb.r8, ylbVar);
            this.f = v0;
            this.e = v0;
        } else {
            boolean a = ylbVar != null ? ylbVar.a() : cmb.I.o();
            this.e = ec7Var.c(a);
            this.f = ec7Var.d(a);
        }
        if (!z) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int v0;
        boolean z = this.d;
        km kmVar = this.n;
        km kmVar2 = this.h;
        if (z && (this.e != (v0 = cmb.v0(cmb.r8, this.b)) || this.f != v0)) {
            this.f = v0;
            this.e = v0;
            kmVar2.a(v0, true);
            kmVar.a(v0, true);
        }
        int a = kmVar2.a(this.e, false);
        int a2 = kmVar.a(this.f, false);
        RadialGradient radialGradient = this.y;
        Paint paint = this.E;
        if (radialGradient == null || this.r != a || this.s != a2 || this.w != getWidth() || this.x != getHeight()) {
            this.w = getWidth();
            this.x = getHeight();
            float f = this.w;
            float f2 = f / 2.0f;
            float f3 = this.x;
            float f4 = f3 * 0.4f;
            Typeface typeface = gm.a;
            float f5 = f - 0.0f;
            float f6 = f3 - 0.0f;
            float sqrt = ((float) Math.sqrt((f6 * f6) + (f5 * f5))) * 0.75f;
            this.s = a2;
            this.r = a;
            RadialGradient radialGradient2 = new RadialGradient(f2, f4, sqrt, new int[]{a2, a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        paint.setAlpha(this.F ? nm7.d4 : (int) (this.c * 255.0f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i = cmb.u8;
        ylb ylbVar = this.b;
        return on2.f(this.c, cmb.v0(i, ylbVar), this.d ? cmb.v0(i, ylbVar) : -1);
    }

    public int getColor() {
        return on2.f(this.c, cmb.v0(cmb.r8, this.b), on2.f(0.75f, this.h.c, this.n.c));
    }

    public int getTabsViewBackgroundColor() {
        int i = cmb.r8;
        ylb ylbVar = this.b;
        int v0 = gm.B(cmb.v0(i, ylbVar)) > 0.721f ? cmb.v0(cmb.u8, ylbVar) : cmb.a(0.08f, -0.08f, cmb.v0(i, ylbVar));
        km kmVar = this.h;
        int i2 = kmVar.c;
        km kmVar2 = this.n;
        return on2.f(this.c, v0, gm.B(on2.f(0.75f, i2, kmVar2.c)) > 0.721f ? cmb.v0(cmb.u6, ylbVar) : cmb.a(0.08f, -0.08f, on2.f(0.75f, kmVar.c, kmVar2.c)));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.G) {
            i2 = wi8.E(230.0f, gm.m, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }

    public void setProgressToGradient(float f) {
        if (Math.abs(this.c - f) > 0.001f) {
            this.c = f;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
