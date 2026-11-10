package a5;

import a8.wa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final k g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final a0.f o;

    public n() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = qs.e4;
        this.m = null;
        this.n = null;
        this.o = new a0.f(0);
        this.g = new k();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i7, int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        Matrix matrix2 = kVar.a;
        ArrayList arrayList = kVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.a;
        matrix3.preConcat(kVar.j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            l lVar = (l) arrayList.get(i13);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i7, i10);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f12 = i7 / this.j;
                float f13 = i10 / this.k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c10], fArr[1]);
                boolean z9 = c10;
                i11 = i13;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[z9 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f14) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    i0.d[] dVarArr = mVar.a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f15 = jVar.i;
                        if (f15 != 0.0f || jVar.j != 1.0f) {
                            float f16 = jVar.k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (jVar.j + f16) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z9);
                            float length = this.f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        wa waVar = jVar.f;
                        if (((Shader) waVar.c) == null && waVar.b == 0) {
                            f11 = 255.0f;
                            i12 = 16777215;
                        } else {
                            if (this.e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) waVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(qs.e4);
                                int i14 = waVar.b;
                                float f21 = jVar.h;
                                PorterDuff.Mode mode = q.w;
                                f11 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        wa waVar2 = jVar.d;
                        if (((Shader) waVar2.c) != null || waVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = jVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.n);
                            Shader shader2 = (Shader) waVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(qs.e4);
                                int i15 = waVar2.b;
                                float f22 = jVar.g;
                                PorterDuff.Mode mode2 = q.w;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c10 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.l = i7;
    }

    public n(n nVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = qs.e4;
        this.m = null;
        this.n = null;
        a0.f fVar = new a0.f(0);
        this.o = fVar;
        this.g = new k(nVar.g, fVar);
        this.a = new Path(nVar.a);
        this.b = new Path(nVar.b);
        this.h = nVar.h;
        this.i = nVar.i;
        this.j = nVar.j;
        this.k = nVar.k;
        this.l = nVar.l;
        this.m = nVar.m;
        String str = nVar.m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.n = nVar.n;
    }
}
