package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import ei.s;
import org.telegram.messenger.at;
import org.telegram.ui.ActionBar.t6;
import rf.w;
import v7.i7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class g extends ei.f {
    public h D;
    public h E;
    public h F;
    public hi.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final hi.a f;
    public final a h;
    public final i7 n;
    public final i7 r;
    public i7 s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public g(hi.a aVar) {
        h hVar = h.b;
        this.D = hVar;
        this.E = hVar;
        this.F = hVar;
        this.I = at.e4;
        this.K = at.e4;
        this.L = new RectF();
        this.f = aVar;
        this.h = aVar instanceof a ? (a) aVar : null;
        if (aVar instanceof hi.e) {
            i7 cVar = Build.VERSION.SDK_INT >= 29 ? new c(this) : new b(this, false);
            this.n = cVar;
            this.r = cVar;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.n = new f(this);
                this.r = new c(this);
            } else if (i10 >= 31) {
                this.n = new d(this);
                this.r = new c(this);
            } else {
                this.n = new b(this, true);
                this.r = new b(this, false);
            }
        }
        g(this.b);
    }

    public static LinearGradient k(g gVar, h hVar, float f7, float f10, int i10, int i11) {
        int i12 = hVar == null ? -1 : hVar.a;
        float f11 = 0;
        float f12 = f7 - f11;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f13 = 1.0f / i11;
        int i13 = gVar.y;
        boolean z10 = i13 == 1 || i13 == 2;
        if (z10) {
            f11 = f12;
        }
        float f14 = (f11 + (z10 ? -0.0f : 0.0f)) * f13;
        float max2 = (Math.max(max * f13, 0.001f) * (z10 ? -1.0f : 1.0f)) + f14;
        int[] iArr = new int[8];
        w.a(w.i, i10, iArr);
        int i14 = gVar.y;
        return (i14 == 1 || i14 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f14, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f14, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f7, int i10, int i11) {
        return (((float) Math.floor((f7 - r3) / r4)) * i11) + i10;
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
    
        if ((r0 instanceof fi.b) != false) goto L11;
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
        return !(r0 instanceof b);
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
