package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c00 extends Drawable {
    public static float v;
    public static float w;
    public static long x;
    public static rz y;
    public static WeakReference z;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public ImageReceiver k;
    public int m;
    public Integer n;
    public org.telegram.ui.ActionBar.p6 o;
    public float p;
    public static final int[] u = new int[2];
    public static boolean A = sc.e(32);
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final Bitmap[] g = new Bitmap[3];
    public final Canvas[] h = new Canvas[3];
    public final LinearGradient[] i = new LinearGradient[3];
    public final Matrix[] j = new Matrix[3];
    public final int[] l = new int[2];
    public float q = 1.0f;
    public final SparseArray r = new SparseArray();
    public boolean s = true;
    public boolean t = false;

    public static void a(c00 c00Var, Object obj, Paint paint) {
        c00Var.a.add(obj);
        c00Var.b.put(obj, new Paint(paint));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c00 clone() {
        c00 c00Var = new c00();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                c00Var.e = this.e;
                c00Var.f = this.f;
                return c00Var;
            }
            c00Var.a.add(arrayList.get(i10));
            Paint paint = (Paint) this.b.get(arrayList.get(i10));
            if (paint != null) {
                Paint paint2 = new Paint();
                paint2.setColor(paint.getColor());
                paint2.setStrokeCap(paint.getStrokeCap());
                paint2.setStrokeJoin(paint.getStrokeJoin());
                paint2.setStrokeWidth(paint.getStrokeWidth());
                paint2.setStyle(paint.getStyle());
                c00Var.b.put(arrayList.get(i10), paint2);
            }
            i10++;
        }
    }

    public final void c(Canvas canvas, boolean z10, int i10, long j10, float f7, float f10, float f11, float f12) {
        int i11;
        int i12 = this.m;
        if (i12 >= 0) {
            f(i12, this.o, this.p, z10);
        }
        float f13 = ((int) f11) / this.e;
        float f14 = ((int) f12) / this.f;
        float max = this.s ? Math.max(f13, f14) : Math.min(f13, f14);
        LinearGradient[] linearGradientArr = this.i;
        if (linearGradientArr[i10] != null) {
            float f15 = w;
            if (f15 > 0.0f && A) {
                if (z10) {
                    long j11 = j10 - x;
                    long j12 = j11 > 64 ? 64L : j11;
                    if (j12 > 0) {
                        x = j10;
                        v = a1.g.A(j12, f15, 1800.0f, v);
                        while (true) {
                            float f16 = v;
                            float f17 = w * 2.0f;
                            if (f16 < f17) {
                                break;
                            } else {
                                v = f16 - f17;
                            }
                        }
                    }
                } else if (y == null || z.get() == this) {
                    long j13 = j10 - x;
                    long j14 = j13 <= 64 ? j13 : 64L;
                    long j15 = j14 < 0 ? 0L : j14;
                    x = j10;
                    v = a1.g.A(j15, w, 1800.0f, v);
                    while (true) {
                        float f18 = v;
                        float f19 = w;
                        if (f18 < f19 / 2.0f) {
                            break;
                        } else {
                            v = f18 - f19;
                        }
                    }
                    z = new WeakReference(this);
                    rz rzVar = y;
                    if (rzVar != null) {
                        i0.r(rzVar);
                    }
                    rz rzVar2 = new rz(1);
                    y = rzVar2;
                    i0.h3(rzVar2, ((int) (1000.0f / i0.r)) - 1);
                }
                ImageReceiver imageReceiver = this.k;
                if (imageReceiver == null || z10) {
                    i11 = 0;
                } else {
                    View view = imageReceiver.e;
                    int[] iArr = u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i11 = iArr[0];
                }
                int i13 = z10 ? i10 + 1 : 0;
                Matrix[] matrixArr = this.j;
                Matrix matrix = matrixArr[i13];
                if (matrix != null) {
                    matrix.reset();
                    if (z10) {
                        matrixArr[i13].postTranslate(((-i11) + v) - f7, 0.0f);
                    } else {
                        matrixArr[i13].postTranslate(((-i11) + v) - f7, 0.0f);
                    }
                    float f20 = 1.0f / max;
                    matrixArr[i13].postScale(f20, f20);
                    linearGradientArr[i13].setLocalMatrix(matrixArr[i13]);
                    ImageReceiver imageReceiver2 = this.k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f7, f10);
        if (!this.s || this.t) {
            canvas.translate(c3.i0.g(this.e, max, f11, 2.0f), c3.i0.g(this.f, max, f12, 2.0f));
        }
        canvas.scale(max, max);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = arrayList.get(i14);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.r.get(i14);
                if (paint == null) {
                    paint = this.c;
                }
                if (z10) {
                    paint = this.d;
                } else if (paint == null) {
                    paint = (Paint) this.b.get(obj);
                }
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.q * alpha));
                if (obj instanceof Path) {
                    canvas.drawPath((Path) obj, paint);
                } else if (obj instanceof Rect) {
                    canvas.drawRect((Rect) obj, paint);
                } else if (obj instanceof RectF) {
                    canvas.drawRect((RectF) obj, paint);
                } else if (obj instanceof wz) {
                    wz wzVar = (wz) obj;
                    canvas.drawLine(wzVar.a, wzVar.b, wzVar.c, wzVar.d, paint);
                } else if (obj instanceof vz) {
                    vz vzVar = (vz) obj;
                    canvas.drawCircle(vzVar.a, vzVar.b, vzVar.c, paint);
                } else if (obj instanceof xz) {
                    canvas.drawOval(((xz) obj).a, paint);
                } else if (obj instanceof zz) {
                    zz zzVar = (zz) obj;
                    RectF rectF = zzVar.a;
                    float f21 = zzVar.b;
                    canvas.drawRoundRect(rectF, f21, f21, paint);
                }
                paint.setAlpha(alpha);
            }
        }
        canvas.restore();
    }

    public final void d() {
        this.t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
    }

    public final void e(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.m = i10;
        this.o = p6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [android.graphics.LinearGradient] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    public final void f(int i10, org.telegram.ui.ActionBar.p6 p6Var, float f7, boolean z10) {
        BitmapShader bitmapShader;
        Integer num = this.n;
        int w02 = num == null ? org.telegram.ui.ActionBar.t6.w0(i10, p6Var) : num.intValue();
        this.o = p6Var;
        int[] iArr = this.l;
        if (iArr[z10 ? 1 : 0] != w02) {
            this.p = f7;
            this.m = i10;
            iArr[z10 ? 1 : 0] = w02;
            w = i0.q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.b;
            if (!z11) {
                int o10 = i0.b.o(w02, 70);
                if (z10) {
                    if (this.d == null) {
                        this.d = new Paint(1);
                    }
                    this.d.setShader(null);
                    this.d.setColor(o10);
                    return;
                }
                for (Paint paint : hashMap.values()) {
                    paint.setShader(null);
                    paint.setColor(o10);
                }
                return;
            }
            float L = i0.L(180.0f) / w;
            int argb = Color.argb((int) ((Color.alpha(w02) / 2) * this.p), Color.red(w02), Color.green(w02), Color.blue(w02));
            float f10 = (1.0f - L) / 2.0f;
            float f11 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f10 - f11, f10, f11 + f10, 1.0f}, tileMode);
            LinearGradient[] linearGradientArr = this.i;
            linearGradientArr[z10 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.g;
                Bitmap bitmap = bitmapArr[z10 ? 1 : 0];
                Canvas[] canvasArr = this.h;
                if (bitmap == null) {
                    bitmapArr[z10 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    canvasArr[z10 ? 1 : 0] = new Canvas(bitmapArr[z10 ? 1 : 0]);
                }
                canvasArr[z10 ? 1 : 0].drawColor(argb);
                bitmapShader = new BitmapShader(bitmapArr[z10 ? 1 : 0], tileMode, tileMode);
            }
            Matrix matrix = new Matrix();
            this.j[z10 ? 1 : 0] = matrix;
            linearGradientArr[z10 ? 1 : 0].setLocalMatrix(matrix);
            if (z10) {
                if (this.d == null) {
                    this.d = new Paint(1);
                }
                this.d.setShader(new ComposeShader(linearGradientArr[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
            } else {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((Paint) it.next()).setShader(new ComposeShader(linearGradientArr[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.q = i10 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
