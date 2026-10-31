package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import ei.s;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import rf.w;
import v7.i7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f extends ei.f {
    public g D;
    public g E;
    public g F;
    public hi.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final hi.a f;
    public final ei.d h;
    public final i7 n;
    public final i7 r;
    public i7 s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public f(hi.a aVar) {
        g gVar = g.b;
        this.D = gVar;
        this.E = gVar;
        this.F = gVar;
        this.I = zs.e4;
        this.K = zs.e4;
        this.L = new RectF();
        this.f = aVar;
        this.h = aVar instanceof ei.d ? (ei.d) aVar : null;
        if (aVar instanceof hi.e) {
            i7 bVar = Build.VERSION.SDK_INT >= 29 ? new b(this) : new a(this, false);
            this.n = bVar;
            this.r = bVar;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.n = new e(this);
                this.r = new b(this);
            } else if (i10 >= 31) {
                this.n = new c(this);
                this.r = new b(this);
            } else {
                this.n = new a(this, true);
                this.r = new a(this, false);
            }
        }
        g(this.b);
    }

    public static float k(float f7, int i10, int i11) {
        return (((float) Math.floor((f7 - r3) / r4)) * i11) + i10;
    }

    public static LinearGradient l(f fVar, g gVar, float f7, float f10, int i10, int i11) {
        int i12 = gVar == null ? -1 : gVar.a;
        float f11 = 0;
        float f12 = f7 - f11;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f13 = 1.0f / i11;
        int i13 = fVar.y;
        boolean z10 = i13 == 1 || i13 == 2;
        if (z10) {
            f11 = f12;
        }
        float f14 = (f11 + (z10 ? -0.0f : 0.0f)) * f13;
        float max2 = (Math.max(max * f13, 0.001f) * (z10 ? -1.0f : 1.0f)) + f14;
        int[] iArr = new int[8];
        w.a(w.i, i10, iArr);
        int i14 = fVar.y;
        return (i14 == 1 || i14 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f14, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f14, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // ei.f
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.L;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r0 instanceof fi.a) != false) goto L11;
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
            i7 i7Var = this.s;
            i7Var.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // ei.f
    public final boolean e() {
        return this.s.d();
    }

    @Override // ei.f
    public final void f(int i10) {
        this.s.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override // ei.f
    public final void g(s sVar) {
        boolean z10 = sVar.a;
        i7 i7Var = this.r;
        i7 i7Var2 = z10 ? this.n : i7Var;
        i7 i7Var3 = this.s;
        if (i7Var3 != i7Var2) {
            if (i7Var3 != null) {
                i7Var3.b();
            }
            this.s = i7Var2;
            i7Var2.e(this.c / 255.0f);
            if (this.s == i7Var) {
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

    @Override // ei.f
    public final boolean j() {
        this.s.getClass();
        return !(r0 instanceof a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override // ei.f
    public final void updateColors() {
        hi.c cVar = this.G;
        if (cVar != null) {
            this.H = t6.r1(this.I / 255.0f, cVar.b);
            this.J = t6.r1(this.K / 255.0f, this.G.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
