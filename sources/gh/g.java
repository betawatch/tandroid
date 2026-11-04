package gh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import b8.mc;
import b8.w9;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import pi.q;
import pi.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends pi.e implements z5 {
    public static Path h0 = new Path();
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float K;
    public int L;
    public int M;
    public h P;
    public boolean Q;
    public final f R;
    public a S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public int Y;
    public mc Z;
    public boolean a0;
    public si.a b0;
    public boolean c0;
    public final d d0;
    public b e0;
    public final si.a f;
    public c f0;
    public e g0;
    public final si.a h;
    public final si.a n;
    public si.a r;
    public hh.a w;
    public int x;
    public int y;
    public boolean s = true;
    public float J = -1.0f;
    public int N = r6.b;
    public final l O = new l();

    public g(si.a aVar, si.a aVar2, si.a aVar3) {
        f fVar = new f();
        this.R = fVar;
        this.W = 1.0f;
        this.Y = q.G;
        this.a0 = true;
        this.d0 = new d(this);
        this.f = aVar;
        this.h = aVar2;
        this.n = aVar3;
        r rVar = this.b;
        if (!rVar.a) {
            aVar = aVar3;
        } else if (!this.X || !rVar.b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.r = aVar;
        fVar.i = g0.N(1.0f);
        fVar.j = g0.N(0.6666667f);
        this.U = g0.N(1.0f);
        this.V = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (w9.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = h0;
        if (path == null) {
            h0 = new Path();
        } else {
            path.rewind();
        }
        h0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(h0);
    }

    public static si.a v(si.a aVar) {
        while (aVar instanceof si.g) {
            aVar = ((si.g) aVar).a;
        }
        return aVar;
    }

    @Override // pi.e
    public final void a() {
        mc o10 = o();
        e eVar = this.g0;
        if (o10 != eVar || eVar == null) {
            return;
        }
        eVar.e();
    }

    @Override // pi.e
    public final void b(Rect rect) {
        rect.set(this.R.m);
    }

    @Override // pi.e
    public final int c() {
        return this.L;
    }

    @Override // pi.e
    public final int d() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        si.a aVar;
        int i3 = r6.b;
        if (this.N != i3) {
            this.N = i3;
            try {
                updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        int i10 = q.G;
        if (this.Y != i10) {
            this.Y = i10;
            r f10 = q.f();
            if (!Objects.equals(this.b, f10)) {
                this.b = f10;
                g(f10);
            }
        }
        f fVar = this.R;
        if (fVar.m.isEmpty()) {
            return;
        }
        mc o10 = o();
        si.a aVar2 = this.r;
        if (o10 == this.g0 && !canvas.isHardwareAccelerated()) {
            si.a v = v(v(this.r));
            if (Build.VERSION.SDK_INT >= 29 && (v instanceof si.f) && (aVar = ((si.f) v).a) != null) {
                v = v(aVar);
            }
            aVar2 = v;
            o10 = k(aVar2);
        }
        o10.b(canvas, aVar2);
        float f11 = this.c / 255.0f;
        Rect rect = fVar.m;
        if (!fVar.e()) {
            this.O.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.b, m(), f11);
            return;
        }
        Path path = fVar.k;
        long j10 = fVar.x;
        float f12 = rect.left;
        float f13 = rect.top;
        float f14 = rect.right;
        float f15 = rect.bottom;
        h m10 = m();
        l lVar = this.O;
        lVar.getClass();
        float f16 = f15 - f13;
        if (f14 - f12 < 1.0f || f16 < 1.0f || f11 <= 0.0f) {
            return;
        }
        if (m10.a()) {
            lVar.d(canvas, 2, path, j10, f12, f13, f14, f15, m10, m10.f, f11);
        }
        if (m10.a > 0.05f) {
            int i11 = m10.b;
            if ((i11 >>> 24) != 0) {
                lVar.d(canvas, 0, path, j10, f12, f13, f14, f15, m10, i11, f11);
            }
        }
        if (m10.c > 0.05f) {
            int i12 = m10.d;
            if ((i12 >>> 24) != 0) {
                lVar.d(canvas, 1, path, j10, f12, f13, f14, f15, m10, i12, f11);
            }
        }
        if (m10.g > 0.05f) {
            int i13 = m10.h;
            if ((i13 >>> 24) != 0) {
                lVar.d(canvas, 3, path, j10, f12, f13, f14, f15, m10, i13, f11);
            }
        }
    }

    @Override // pi.e
    public final boolean e() {
        mc o10 = o();
        e eVar = this.g0;
        return o10 != eVar || eVar == null || eVar.c();
    }

    @Override // pi.e
    public final void f(int i3) {
        e eVar = this.g0;
        if (eVar != null) {
            eVar.f(i3 / 255.0f);
        }
    }

    @Override // pi.e
    public final void g(r rVar) {
        this.a0 = true;
        updateColors();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        f fVar = this.R;
        if (!fVar.e()) {
            l(outline, fVar.m, fVar.b);
        } else if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(fVar.k);
        } else {
            RectF rectF = fVar.s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.b[0]);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        f fVar = this.R;
        int i3 = fVar.d;
        rect.set(i3, i3, i3, i3);
        return fVar.e;
    }

    @Override // pi.e
    public final void h() {
        e eVar = this.g0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override // pi.e
    public final boolean j() {
        mc o10 = o();
        e eVar = this.g0;
        return o10 == eVar && eVar != null;
    }

    public final mc k(si.a aVar) {
        si.a v = v(aVar);
        if (Color.alpha(this.y) == 255 || (v instanceof si.c)) {
            return this.d0;
        }
        if (v instanceof si.b) {
            if (this.e0 == null) {
                this.e0 = new b(this);
            }
            return this.e0;
        }
        if (this.f0 == null) {
            this.f0 = new c(this);
        }
        return this.f0;
    }

    public final h m() {
        h hVar;
        if (this.P == null) {
            boolean z10 = this.Q;
            f fVar = this.R;
            if (z10) {
                float f10 = fVar.i;
                int i3 = this.E;
                hVar = new h(0.0f, 0, 0.0f, 0, this.I, this.H, (f10 + fVar.j) / 2.0f, i0.a.f(0.5f, i3, this.F));
            } else {
                hVar = new h(fVar.i, this.E, fVar.j, this.F, this.I, this.H, 0.0f, 0);
            }
            this.P = hVar;
        }
        return this.P;
    }

    public final void n() {
        e eVar = this.g0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final mc o() {
        mc k10;
        if (this.a0) {
            r rVar = this.b;
            si.a aVar = !rVar.a ? this.n : (this.X && rVar.b && Build.VERSION.SDK_INT >= 33) ? this.f : this.h;
            if (this.r != aVar) {
                this.r = aVar;
                e eVar = this.g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        si.a v = v(this.r);
        boolean z10 = Color.alpha(this.y) == 255;
        if (this.Z == null || this.a0 || this.b0 != v || this.c0 != z10) {
            this.a0 = false;
            this.b0 = v;
            this.c0 = z10;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 29 || !(this.r instanceof eh.b) || (v instanceof si.c) || (v instanceof si.b)) {
                k10 = k(v);
            } else {
                if (this.g0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.s);
                    eVar2.f(this.c / 255.0f);
                    eVar2.d();
                    this.g0 = eVar2;
                }
                k10 = this.g0;
            }
            e eVar3 = this.g0;
            if (eVar3 != null) {
                eVar3.h(k10 == eVar3 && this.X && this.b.b && i3 >= 33);
            }
            mc mcVar = this.Z;
            if (mcVar != k10 && mcVar != null) {
                mcVar.a();
            }
            this.Z = k10;
        }
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.R;
        fVar.a.set(rect);
        fVar.a();
        n();
    }

    public final void p(hh.a aVar) {
        this.w = aVar;
        if (this.J < 0.0f) {
            this.J = this.U;
            this.K = this.V;
        }
        updateColors();
        if (aVar instanceof hh.e) {
            hh.e eVar = (hh.e) aVar;
            float f10 = eVar.f;
            float f11 = eVar.h;
            f fVar = this.R;
            fVar.i = f10;
            fVar.j = f11;
            this.P = null;
            float c2 = eVar.c();
            float b10 = eVar.b();
            this.U = c2;
            this.V = b10;
        }
    }

    public final void q(int i3) {
        f fVar = this.R;
        if (fVar.d != i3) {
            fVar.d = i3;
            fVar.a();
            n();
        }
    }

    public final void r(float f10) {
        f fVar = this.R;
        Arrays.fill(fVar.b, f10);
        Arrays.fill(fVar.c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.R;
        float[] fArr = fVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        fVar.a();
        n();
    }

    public final void t(float f10, float f11, float f12, float f13, boolean z10) {
        f fVar = this.R;
        float[] fArr = fVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        float f14 = z10 ? 0.0f : f12;
        fArr[5] = f14;
        fArr[4] = f14;
        float f15 = z10 ? 0.0f : f13;
        fArr[7] = f15;
        fArr[6] = f15;
        float[] fArr2 = fVar.c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        fVar.a();
        n();
    }

    public final void u(int i3) {
        this.R.f = i3;
        n();
    }

    @Override // pi.e, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.N = r6.b;
        hh.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof hh.b) {
            ((hh.b) aVar).d();
        }
        this.y = this.w.w0();
        this.x = this.w.u0();
        this.E = this.w.x();
        this.F = this.w.M();
        this.G = this.w.c0();
        this.H = this.w.F();
        this.I = this.w.a0();
        hh.a aVar2 = this.w;
        if (aVar2 instanceof hh.e) {
            hh.e eVar = (hh.e) aVar2;
            float c2 = eVar.c();
            float b10 = eVar.b();
            this.U = c2;
            this.V = b10;
        } else if (aVar2.W() >= 0.0f) {
            float W = this.w.W();
            float O = this.w.O();
            this.U = W;
            this.V = O;
        } else {
            float f10 = this.J;
            if (f10 >= 0.0f) {
                float f11 = this.K;
                this.U = f10;
                this.V = f11;
            }
        }
        this.P = null;
        e eVar2 = this.g0;
        if (eVar2 != null) {
            eVar2.h = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
