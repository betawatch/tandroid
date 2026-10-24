package dh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import v7.v7;
import w7.r;
import zf.f0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class d extends Drawable implements b6 {
    public static final float[] V = new float[8];
    public static Path W = new Path();
    public float E;
    public float F;
    public float G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public final Matrix M;
    public final WeakReference N;
    public BitmapShader O;
    public final RectF P;
    public final RectF Q;
    public final bh.a R;
    public final Rect S;
    public NinePatchDrawable T;
    public long U;
    public float a;
    public float b;
    public eh.a c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s = r6.b;
    public final c v;
    public b w;
    public int x;
    public boolean y;

    public d() {
        c cVar = new c();
        this.v = cVar;
        this.x = 255;
        this.G = 1.0f;
        this.H = new Paint(1);
        this.I = new Paint(1);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Paint(1);
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.M = new Matrix();
        this.N = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new bh.a();
        this.S = new Rect();
        cVar.i = AndroidUtilities.dpf2(1.0f);
        cVar.j = AndroidUtilities.dpf2(0.6666667f);
        this.E = AndroidUtilities.dpf2(1.0f);
        this.F = AndroidUtilities.dpf2(0.33333334f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r4 == r20[7]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == r20[3]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Canvas canvas, float f7, float f10, float[] fArr, float f11, boolean z10, Paint paint) {
        boolean z11;
        float f12;
        if (z10) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (f13 == f14) {
                float f15 = fArr[2];
                if (f14 == f15) {
                }
            }
            z11 = false;
        } else {
            float f16 = fArr[4];
            float f17 = fArr[5];
            if (f16 == f17) {
                float f18 = fArr[6];
                if (f17 == f18) {
                }
            }
            z11 = false;
        }
        float f19 = f11 / 2.0f;
        if (z10) {
            if (z11) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f7, r.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                    float f20 = fArr[0];
                    canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, f20, f20, paint);
                }
                canvas.restore();
                return;
            }
            float f21 = (0.0f + f7) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f21, r.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f10))) {
                f12 = 0.0f;
                canvas.drawRoundRect(0.0f - f19, 0.0f + f19, f7 + f19, f10 + f19, fArr[0], fArr[1], paint);
            } else {
                f12 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f21, f12, f7, r.a((fArr[0] * 2.0f) + f12, f12, f10))) {
                canvas.drawRoundRect(f12 - f19, f12 + f19, f7 + f19, f10 + f19, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, r.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
                float f22 = 0.0f - f19;
                float f23 = fArr[4];
                canvas.drawRoundRect(f22, f22, f7 + f19, f10 - f19, f23, f23, paint);
            }
            canvas.restore();
            return;
        }
        float f24 = (0.0f + f7) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, r.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f24, f10)) {
            float f25 = 0.0f - f19;
            canvas.drawRoundRect(f25, f25, f7 + f19, f10 - f19, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f24, r.a(f10 - (fArr[4] * 2.0f), 0.0f, f10), f7, f10)) {
            float f26 = 0.0f - f19;
            canvas.drawRoundRect(f26, f26, f7 + f19, f10 - f19, fArr[4], fArr[5], paint);
        }
        canvas.restore();
    }

    public static void f(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, r.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, r.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (f0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = W;
        if (path == null) {
            W = new Path();
        } else {
            path.rewind();
        }
        W.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(W);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        bh.a aVar = this.R;
        aVar.b = 0L;
        aVar.a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.v;
        for (float f7 : cVar.b) {
            aVar.c(f7);
        }
        aVar.c(this.E);
        aVar.c(0.0f);
        aVar.c(this.F);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f);
            aVar.a(this.h);
            aVar.c(cVar.i);
            aVar.c(cVar.j);
        }
        long j10 = aVar.a ? -1L : aVar.b;
        if (this.T == null || this.U != j10) {
            this.U = j10;
            NinePatchDrawable b10 = v7.b(null, cVar.b, this.E, this.F, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.T = b10;
            b10.getPadding(this.S);
        }
        return this.T;
    }

    public final void b() {
        Rect rect = this.v.m;
        RectF rectF = this.P;
        rectF.set(rect);
        rectF.offset(this.a, this.b);
        RectF rectF2 = this.Q;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        m();
    }

    public final void c(Canvas canvas, gh.a aVar) {
        int i10;
        c cVar = this.v;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.e) == 255) {
            d(canvas, 0);
            return;
        }
        if (aVar instanceof gh.c) {
            d(canvas, ((gh.c) aVar).a.getColor());
            return;
        }
        if (aVar instanceof gh.b) {
            gh.b bVar = (gh.b) aVar;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.N.get();
            Paint paint = this.J;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.O = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.O = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.d) > 0) {
                NinePatchDrawable a2 = a(0, false);
                int i11 = rect2.left;
                Rect rect3 = this.S;
                a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                a2.setAlpha(this.x);
                a2.draw(canvas);
            }
            if (this.O != null && bitmap != null && !bitmap.isRecycled() && this.x > 0) {
                Matrix matrix = bVar.b;
                Matrix matrix2 = this.M;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.a, -this.b);
                this.O.setLocalMatrix(matrix2);
                paint.setAlpha(this.x);
                cVar.b(canvas, paint);
            }
            int o12 = k6.o1(this.x / 255.0f, this.e);
            if (Color.alpha(o12) > 0) {
                Paint paint2 = this.K;
                paint2.setColor(o12);
                cVar.b(canvas, paint2);
            }
            g(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof gh.d)) {
            gh.d dVar = (gh.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.a);
            return;
        }
        if (aVar instanceof gh.e) {
            c(canvas, ((gh.e) aVar).a);
            return;
        }
        if (aVar == null || (i10 = this.x) == 0) {
            return;
        }
        int o13 = k6.o1(i10 / 255.0f, this.e);
        if (Color.alpha(this.d) > 0 && this.x == 255) {
            float f7 = this.G;
            if (f7 > 0.0f) {
                float f10 = this.E;
                float f11 = this.F;
                int o14 = k6.o1(f7, this.d);
                Paint paint3 = this.L;
                paint3.setShadowLayer(f10, 0.0f, f11, o14);
                cVar.c(canvas, paint3, this.y);
            }
        }
        float f12 = this.a;
        float f13 = this.b;
        float f14 = rect2.left;
        float f15 = f14 + f12;
        float f16 = rect2.top;
        float f17 = f16 + f13;
        float f18 = rect2.right;
        float f19 = f18 + f12;
        float f20 = rect2.bottom;
        float f21 = f20 + f13;
        int i12 = this.x;
        boolean z10 = i12 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
        }
        canvas.save();
        canvas.clipPath(cVar.k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f15, -f17);
        aVar.y(canvas, f15, f17, f19, f21);
        canvas.restore();
        if (Color.alpha(o13) > 0) {
            Paint paint4 = this.H;
            paint4.setColor(o13);
            cVar.b(canvas, paint4);
        }
        g(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    public final void d(Canvas canvas, int i10) {
        int k10 = i0.a.k(this.e, i10);
        if (Color.alpha(k10) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(k10, true);
        Rect rect = this.v.m;
        int i11 = rect.left;
        Rect rect2 = this.S;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.x);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int o12 = k6.o1(this.x / 255.0f, this.f);
        int o13 = k6.o1(this.x / 255.0f, this.h);
        int alpha = Color.alpha(o12);
        c cVar = this.v;
        Paint paint = this.I;
        if (alpha > 0) {
            paint.setColor(o12);
            canvas.drawPath(cVar.n, paint);
        }
        if (Color.alpha(o13) > 0) {
            paint.setColor(o13);
            canvas.drawPath(cVar.o, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        c cVar = this.v;
        h(outline, cVar.m, cVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        c cVar = this.v;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public abstract gh.a i();

    public boolean j() {
        return false;
    }

    public void k() {
        b();
    }

    public void l() {
        b();
    }

    public final void o(eh.a aVar) {
        this.c = aVar;
        updateColors();
        if (aVar instanceof eh.e) {
            eh.e eVar = (eh.e) aVar;
            float f7 = eVar.f;
            float f10 = eVar.h;
            c cVar = this.v;
            cVar.i = f7;
            cVar.j = f10;
            float f11 = eVar.n;
            float f12 = eVar.r;
            this.E = f11;
            this.F = f12;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.v;
        cVar.a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.v;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.v;
        Arrays.fill(cVar.b, f7);
        Arrays.fill(cVar.c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.v;
        float[] fArr = cVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        k();
    }

    public final void s(float f7, float f10, float f11, float f12) {
        c cVar = this.v;
        float[] fArr = cVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        k();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.x = i10;
    }

    public final void t(float f7, float f10) {
        if (this.a == f7 && this.b == f10) {
            return;
        }
        this.a = f7;
        this.b = f10;
        l();
    }

    public final void u(int i10) {
        this.v.f = i10;
        k();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void updateColors() {
        this.s = r6.b;
        eh.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c();
        }
        this.e = this.c.a0();
        this.d = this.c.H();
        this.f = this.c.h();
        this.h = this.c.u();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void m() {
    }

    public d n() {
        return this;
    }

    public void v() {
    }
}
