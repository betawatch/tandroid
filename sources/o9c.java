// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o9c {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final l9c g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final ps o;

    public o9c(o9c o9cVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = kk7.d4;
        this.m = null;
        this.n = null;
        ps psVar = new ps(0);
        this.o = psVar;
        this.g = new l9c(o9cVar.g, psVar);
        this.a = new Path(o9cVar.a);
        this.b = new Path(o9cVar.b);
        this.h = o9cVar.h;
        this.i = o9cVar.i;
        this.j = o9cVar.j;
        this.k = o9cVar.k;
        this.l = o9cVar.l;
        this.m = o9cVar.m;
        String str = o9cVar.m;
        if (str != null) {
            psVar.put(str, this);
        }
        this.n = o9cVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l9c l9cVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = l9cVar.a;
        ArrayList arrayList = l9cVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = l9cVar.a;
        matrix3.preConcat(l9cVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            m9c m9cVar = (m9c) arrayList.get(i5);
            if (m9cVar instanceof l9c) {
                a((l9c) m9cVar, matrix3, canvas, i, i2);
            } else if (m9cVar instanceof n9c) {
                n9c n9cVar = (n9c) m9cVar;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    ky7[] ky7VarArr = n9cVar.a;
                    if (ky7VarArr != null) {
                        mqe.f(ky7VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (n9cVar instanceof j9c) {
                        path2.setFillType(n9cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        k9c k9cVar = (k9c) n9cVar;
                        float f6 = k9cVar.i;
                        if (f6 != 0.0f || k9cVar.j != 1.0f) {
                            float f7 = k9cVar.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (k9cVar.j + f7) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.f = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure4 = this.f;
                            if (f10 > f11) {
                                pathMeasure4.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure4.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        kp kpVar = k9cVar.f;
                        if (((Shader) kpVar.c) == null && kpVar.b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) kpVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(k9cVar.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(kk7.d4);
                                int i6 = kpVar.b;
                                float f12 = k9cVar.h;
                                PorterDuff.Mode mode = r9c.w;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(k9cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        kp kpVar2 = k9cVar.d;
                        if (((Shader) kpVar2.c) != null || kpVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = k9cVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = k9cVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(k9cVar.n);
                            Shader shader2 = (Shader) kpVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(k9cVar.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(kk7.d4);
                                int i7 = kpVar2.b;
                                float f13 = k9cVar.g;
                                PorterDuff.Mode mode2 = r9c.w;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(k9cVar.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public o9c() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = kk7.d4;
        this.m = null;
        this.n = null;
        this.o = new ps(0);
        this.g = new l9c();
        this.a = new Path();
        this.b = new Path();
    }
}
