// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class bz4 extends ky4 {
    public cz4 E;
    public cz4 F;
    public cz4 G;
    public oz4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final mz4 f;
    public final wy4 h;
    public final rne n;
    public final rne r;
    public rne s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public bz4(mz4 mz4Var) {
        cz4 cz4Var = cz4.b;
        this.E = cz4Var;
        this.F = cz4Var;
        this.G = cz4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = mz4Var;
        this.h = mz4Var instanceof wy4 ? (wy4) mz4Var : null;
        char c = mz4Var instanceof qz4 ? (char) 2 : (char) 1;
        int i = Build.VERSION.SDK_INT;
        if (c == 2) {
            rne yy4Var = i >= 29 ? new yy4(this) : new xy4(this, false);
            this.n = yy4Var;
            this.r = yy4Var;
        } else if (i >= 33) {
            this.n = new az4(this);
            this.r = new yy4(this);
        } else if (i >= 31) {
            this.n = new zy4(this);
            this.r = new yy4(this);
        } else {
            this.n = new xy4(this, true);
            this.r = new xy4(this, false);
        }
        g(this.b);
    }

    public static float k(float f, int i, int i2) {
        return (((float) Math.floor((f - r3) / r4)) * i2) + i;
    }

    @Override // ky4
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r0 instanceof xy4) != false) goto L10;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.c <= 0) {
            return;
        }
        canvas.save();
        canvas.clipRect(bounds);
        canvas.translate(bounds.left, bounds.top);
        if (!canvas.isHardwareAccelerated()) {
            rne rneVar = this.s;
            rneVar.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // ky4
    public final boolean e() {
        return this.s.d();
    }

    @Override // ky4
    public final void f(int i) {
        this.s.e(i / 255.0f);
        invalidateSelf();
    }

    @Override // ky4
    public final void g(lz4 lz4Var) {
        boolean z = lz4Var.a;
        rne rneVar = this.r;
        rne rneVar2 = z ? this.n : rneVar;
        rne rneVar3 = this.s;
        if (rneVar3 != rneVar2) {
            if (rneVar3 != null) {
                rneVar3.b();
            }
            this.s = rneVar2;
            rneVar2.e(this.c / 255.0f);
            if (this.s == rneVar) {
                this.x = true;
            } else {
                this.w = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ky4
    public final boolean j() {
        this.s.getClass();
        return !(r0 instanceof xy4);
    }

    public final LinearGradient l(cz4 cz4Var, float f, float f2, int i, int i2) {
        int i3 = cz4Var == null ? -1 : cz4Var.a;
        float f3 = 0.0f;
        float f4 = f - 0.0f;
        float max = Math.max(0.0f, f4 - f2);
        if (i3 != -1) {
            max = Math.min(i3, max);
        }
        float f5 = 1.0f / i2;
        int i4 = this.y;
        boolean z = i4 == 1 || i4 == 2;
        if (z) {
            f3 = -0.0f;
        } else {
            f4 = 0.0f;
        }
        float f6 = (f4 + f3) * f5;
        float max2 = (Math.max(max * f5, 0.001f) * (z ? -1.0f : 1.0f)) + f6;
        int[] iArr = new int[8];
        n15.a(n15.i, i, iArr);
        int i5 = this.y;
        return (i5 == 1 || i5 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f6, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f6, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override // ky4
    public final void updateColors() {
        oz4 oz4Var = this.H;
        if (oz4Var != null) {
            this.I = aob.p1(this.J / 255.0f, oz4Var.b);
            this.K = aob.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
