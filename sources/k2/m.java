package k2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import b4.e0;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class m {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final j g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final a0.f o;

    public m() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new a0.f(0);
        this.g = new j();
        this.a = new Path();
        this.b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        int i13;
        float f11;
        Matrix matrix2 = jVar.a;
        ArrayList arrayList = jVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c3 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.j;
                float f13 = i11 / this.k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c3], fArr[1]);
                i12 = i14;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f14) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    i0.d[] dVarArr = lVar.a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.i;
                        if (f15 != 0.0f || iVar.j != 1.0f) {
                            float f16 = iVar.k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.j + f16) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, false);
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
                        e0 e0Var = iVar.f;
                        if (((Shader) e0Var.c) == null && e0Var.b == 0) {
                            i13 = 16777215;
                            f11 = 255.0f;
                        } else {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) e0Var.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = e0Var.b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        e0 e0Var2 = iVar.d;
                        if (((Shader) e0Var2.c) != null || e0Var2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.n);
                            Shader shader2 = (Shader) e0Var2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = e0Var2.b;
                                float f22 = iVar.g;
                                PorterDuff.Mode mode2 = p.s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c3 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c3 = 0;
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

    public void setRootAlpha(int i10) {
        this.l = i10;
    }

    public m(m mVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        a0.f fVar = new a0.f(0);
        this.o = fVar;
        this.g = new j(mVar.g, fVar);
        this.a = new Path(mVar.a);
        this.b = new Path(mVar.b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.j = mVar.j;
        this.k = mVar.k;
        this.l = mVar.l;
        this.m = mVar.m;
        String str = mVar.m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.n = mVar.n;
    }
}
