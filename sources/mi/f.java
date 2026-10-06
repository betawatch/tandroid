package mi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import li.q;
import org.telegram.ui.ActionBar.i6;
import w7.z;
import yf.y;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class f extends li.e {
    public final oi.a e;
    public final li.c f;
    public final z g;
    public final z h;
    public z i;
    public boolean j = true;
    public boolean k = true;
    public int l = 1;
    public g m;
    public g n;
    public g o;
    public fh.c p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final RectF u;

    public f(oi.a aVar) {
        g gVar = g.b;
        this.m = gVar;
        this.n = gVar;
        this.o = gVar;
        this.r = 255;
        this.t = 255;
        this.u = new RectF();
        this.e = aVar;
        this.f = aVar instanceof li.c ? (li.c) aVar : null;
        if (aVar instanceof oi.b) {
            z bVar = Build.VERSION.SDK_INT >= 29 ? new b(this) : new a(this, false);
            this.g = bVar;
            this.h = bVar;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.g = new e(this);
                this.h = new b(this);
            } else if (i10 >= 31) {
                this.g = new c(this);
                this.h = new b(this);
            } else {
                this.g = new a(this, true);
                this.h = new a(this, false);
            }
        }
        g(this.a);
    }

    public static float l(float f7, int i10, int i11) {
        return (((float) Math.floor((f7 - r3) / r4)) * i11) + i10;
    }

    public static LinearGradient m(f fVar, g gVar, float f7, float f10, int i10, int i11) {
        int i12 = gVar == null ? -1 : gVar.a;
        float f11 = 0;
        float f12 = f7 - f11;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f13 = 1.0f / i11;
        int i13 = fVar.l;
        boolean z10 = i13 == 1 || i13 == 2;
        if (z10) {
            f11 = f12;
        }
        float f14 = (f11 + (z10 ? -0.0f : 0.0f)) * f13;
        float max2 = (Math.max(max * f13, 0.001f) * (z10 ? -1.0f : 1.0f)) + f14;
        int[] iArr = new int[8];
        y.a(y.i, i10, iArr);
        int i14 = fVar.l;
        return (i14 == 1 || i14 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f14, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f14, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // li.e
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.i.b();
            return;
        }
        RectF rectF = this.u;
        rectF.set(bounds);
        rectF.offset(this.c, this.d);
        this.i.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r0 instanceof mi.a) != false) goto L11;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.b <= 0) {
            return;
        }
        canvas.save();
        canvas.clipRect(bounds);
        canvas.translate(bounds.left, bounds.top);
        if (!canvas.isHardwareAccelerated()) {
            z zVar = this.i;
            zVar.getClass();
        }
        this.i.c(canvas);
        canvas.restore();
    }

    @Override // li.e
    public final boolean e() {
        return this.i.d();
    }

    @Override // li.e
    public final void f(int i10) {
        this.i.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override // li.e
    public final void g(q qVar) {
        boolean z10 = qVar.a;
        z zVar = this.h;
        z zVar2 = z10 ? this.g : zVar;
        z zVar3 = this.i;
        if (zVar3 != zVar2) {
            if (zVar3 != null) {
                zVar3.b();
            }
            this.i = zVar2;
            zVar2.e(this.b / 255.0f);
            if (this.i == zVar) {
                this.k = true;
            } else {
                this.j = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // li.e
    public final boolean j() {
        this.i.getClass();
        return !(r0 instanceof a);
    }

    @Override // li.e
    public final void k() {
        fh.c cVar = this.p;
        if (cVar != null) {
            this.q = i6.l1(this.r / 255.0f, cVar.b);
            this.s = i6.l1(this.t / 255.0f, this.p.b);
        }
        this.j = true;
        this.k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
        this.k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
