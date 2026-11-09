package fh;

import a8.aa;
import a8.m7;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import oi.q;
import oi.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.s6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g extends oi.e implements b6 {
    public static Path g0 = new Path();
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float J;
    public int K;
    public int L;
    public h O;
    public boolean P;
    public final f Q;
    public a R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int X;
    public aa Y;
    public boolean Z;
    public ri.a a0;
    public boolean b0;
    public final d c0;
    public b d0;
    public c e0;
    public final ri.a f;
    public e f0;
    public final ri.a h;
    public final ri.a n;
    public ri.a r;
    public gh.a w;
    public int x;
    public int y;
    public boolean s = true;
    public float I = -1.0f;
    public int M = s6.b;
    public final l N = new l();

    public g(ri.a aVar, ri.a aVar2, ri.a aVar3) {
        f fVar = new f();
        this.Q = fVar;
        this.V = 1.0f;
        this.X = q.G;
        this.Z = true;
        this.c0 = new d(this);
        this.f = aVar;
        this.h = aVar2;
        this.n = aVar3;
        r rVar = this.b;
        if (!rVar.a) {
            aVar = aVar3;
        } else if (!this.W || !rVar.b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.r = aVar;
        fVar.i = g0.N(1.0f);
        fVar.j = g0.N(0.6666667f);
        this.T = g0.N(1.0f);
        this.U = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (m7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = g0;
        if (path == null) {
            g0 = new Path();
        } else {
            path.rewind();
        }
        g0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(g0);
    }

    public static ri.a v(ri.a aVar) {
        while (aVar instanceof ri.g) {
            aVar = ((ri.g) aVar).a;
        }
        return aVar;
    }

    @Override // oi.e
    public final void a() {
        aa o4 = o();
        e eVar = this.f0;
        if (o4 != eVar || eVar == null) {
            return;
        }
        eVar.e();
    }

    @Override // oi.e
    public final void b(Rect rect) {
        rect.set(this.Q.m);
    }

    @Override // oi.e
    public final int c() {
        return this.K;
    }

    @Override // oi.e
    public final int d() {
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ri.a aVar;
        int i7 = s6.b;
        if (this.M != i7) {
            this.M = i7;
            try {
                updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        int i10 = q.G;
        if (this.X != i10) {
            this.X = i10;
            r f10 = q.f();
            if (!Objects.equals(this.b, f10)) {
                this.b = f10;
                g(f10);
            }
        }
        f fVar = this.Q;
        if (fVar.m.isEmpty()) {
            return;
        }
        aa o4 = o();
        ri.a aVar2 = this.r;
        if (o4 == this.f0 && !canvas.isHardwareAccelerated()) {
            ri.a v = v(v(this.r));
            if (Build.VERSION.SDK_INT >= 29 && (v instanceof ri.f) && (aVar = ((ri.f) v).a) != null) {
                v = v(aVar);
            }
            aVar2 = v;
            o4 = k(aVar2);
        }
        o4.b(canvas, aVar2);
        float f11 = this.c / 255.0f;
        Rect rect = fVar.m;
        if (!fVar.e()) {
            this.N.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.b, m(), f11);
            return;
        }
        Path path = fVar.k;
        long j3 = fVar.x;
        float f12 = rect.left;
        float f13 = rect.top;
        float f14 = rect.right;
        float f15 = rect.bottom;
        h m10 = m();
        l lVar = this.N;
        lVar.getClass();
        float f16 = f15 - f13;
        if (f14 - f12 < 1.0f || f16 < 1.0f || f11 <= 0.0f) {
            return;
        }
        if (m10.a()) {
            lVar.d(canvas, 2, path, j3, f12, f13, f14, f15, m10, m10.f, f11);
        }
        if (m10.a > 0.05f) {
            int i11 = m10.b;
            if ((i11 >>> 24) != 0) {
                lVar.d(canvas, 0, path, j3, f12, f13, f14, f15, m10, i11, f11);
            }
        }
        if (m10.c > 0.05f) {
            int i12 = m10.d;
            if ((i12 >>> 24) != 0) {
                lVar.d(canvas, 1, path, j3, f12, f13, f14, f15, m10, i12, f11);
            }
        }
        if (m10.g > 0.05f) {
            int i13 = m10.h;
            if ((i13 >>> 24) != 0) {
                lVar.d(canvas, 3, path, j3, f12, f13, f14, f15, m10, i13, f11);
            }
        }
    }

    @Override // oi.e
    public final boolean e() {
        aa o4 = o();
        e eVar = this.f0;
        return o4 != eVar || eVar == null || eVar.c();
    }

    @Override // oi.e
    public final void f(int i7) {
        e eVar = this.f0;
        if (eVar != null) {
            eVar.f(i7 / 255.0f);
        }
    }

    @Override // oi.e
    public final void g(r rVar) {
        this.Z = true;
        updateColors();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        f fVar = this.Q;
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
        f fVar = this.Q;
        int i7 = fVar.d;
        rect.set(i7, i7, i7, i7);
        return fVar.e;
    }

    @Override // oi.e
    public final void h() {
        e eVar = this.f0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override // oi.e
    public final boolean j() {
        aa o4 = o();
        e eVar = this.f0;
        return o4 == eVar && eVar != null;
    }

    public final aa k(ri.a aVar) {
        ri.a v = v(aVar);
        if (Color.alpha(this.y) == 255 || (v instanceof ri.c)) {
            return this.c0;
        }
        if (v instanceof ri.b) {
            if (this.d0 == null) {
                this.d0 = new b(this);
            }
            return this.d0;
        }
        if (this.e0 == null) {
            this.e0 = new c(this);
        }
        return this.e0;
    }

    public final h m() {
        h hVar;
        if (this.O == null) {
            boolean z9 = this.P;
            f fVar = this.Q;
            if (z9) {
                float f10 = fVar.i;
                int i7 = this.D;
                hVar = new h(0.0f, 0, 0.0f, 0, this.H, this.G, (f10 + fVar.j) / 2.0f, i0.a.f(0.5f, i7, this.E));
            } else {
                hVar = new h(fVar.i, this.D, fVar.j, this.E, this.H, this.G, 0.0f, 0);
            }
            this.O = hVar;
        }
        return this.O;
    }

    public final void n() {
        e eVar = this.f0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final aa o() {
        aa k10;
        if (this.Z) {
            r rVar = this.b;
            ri.a aVar = !rVar.a ? this.n : (this.W && rVar.b && Build.VERSION.SDK_INT >= 33) ? this.f : this.h;
            if (this.r != aVar) {
                this.r = aVar;
                e eVar = this.f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.a v = v(this.r);
        boolean z9 = Color.alpha(this.y) == 255;
        if (this.Y == null || this.Z || this.a0 != v || this.b0 != z9) {
            this.Z = false;
            this.a0 = v;
            this.b0 = z9;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 29 || !(this.r instanceof dh.b) || (v instanceof ri.c) || (v instanceof ri.b)) {
                k10 = k(v);
            } else {
                if (this.f0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.s);
                    eVar2.f(this.c / 255.0f);
                    eVar2.d();
                    this.f0 = eVar2;
                }
                k10 = this.f0;
            }
            e eVar3 = this.f0;
            if (eVar3 != null) {
                eVar3.h(k10 == eVar3 && this.W && this.b.b && i7 >= 33);
            }
            aa aaVar = this.Y;
            if (aaVar != k10 && aaVar != null) {
                aaVar.a();
            }
            this.Y = k10;
        }
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.Q;
        fVar.a.set(rect);
        fVar.a();
        n();
    }

    public final void p(gh.a aVar) {
        this.w = aVar;
        if (this.I < 0.0f) {
            this.I = this.T;
            this.J = this.U;
        }
        updateColors();
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            float f10 = eVar.f;
            float f11 = eVar.h;
            f fVar = this.Q;
            fVar.i = f10;
            fVar.j = f11;
            this.O = null;
            float c10 = eVar.c();
            float b10 = eVar.b();
            this.T = c10;
            this.U = b10;
        }
    }

    public final void q(int i7) {
        f fVar = this.Q;
        if (fVar.d != i7) {
            fVar.d = i7;
            fVar.a();
            n();
        }
    }

    public final void r(float f10) {
        f fVar = this.Q;
        Arrays.fill(fVar.b, f10);
        Arrays.fill(fVar.c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.Q;
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

    public final void t(float f10, float f11, float f12, float f13, boolean z9) {
        f fVar = this.Q;
        float[] fArr = fVar.b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        float f14 = z9 ? 0.0f : f12;
        fArr[5] = f14;
        fArr[4] = f14;
        float f15 = z9 ? 0.0f : f13;
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

    public final void u(int i7) {
        this.Q.f = i7;
        n();
    }

    @Override // oi.e, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.M = s6.b;
        gh.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof gh.b) {
            ((gh.b) aVar).d();
        }
        this.y = this.w.e1();
        this.x = this.w.R0();
        this.D = this.w.A();
        this.E = this.w.O();
        this.F = this.w.C0();
        this.G = this.w.M();
        this.H = this.w.v0();
        gh.a aVar2 = this.w;
        if (aVar2 instanceof gh.e) {
            gh.e eVar = (gh.e) aVar2;
            float c10 = eVar.c();
            float b10 = eVar.b();
            this.T = c10;
            this.U = b10;
        } else if (aVar2.o0() >= 0.0f) {
            float o02 = this.w.o0();
            float j02 = this.w.j0();
            this.T = o02;
            this.U = j02;
        } else {
            float f10 = this.I;
            if (f10 >= 0.0f) {
                float f11 = this.J;
                this.T = f10;
                this.U = f11;
            }
        }
        this.O = null;
        e eVar2 = this.f0;
        if (eVar2 != null) {
            eVar2.h = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
