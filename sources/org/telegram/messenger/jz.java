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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class jz extends Drawable {
    public static float v;
    public static float w;
    public static long x;
    public static hc y;
    public static WeakReference z;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public ImageReceiver k;
    public int m;
    public Integer n;
    public org.telegram.ui.ActionBar.e6 o;
    public float p;
    public static final int[] u = new int[2];
    public static boolean A = lc.e(32);
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

    public static void a(jz jzVar, Object obj, Paint paint) {
        jzVar.a.add(obj);
        jzVar.b.put(obj, new Paint(paint));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jz clone() {
        jz jzVar = new jz();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i3 >= arrayList.size()) {
                jzVar.e = this.e;
                jzVar.f = this.f;
                return jzVar;
            }
            jzVar.a.add(arrayList.get(i3));
            Paint paint = (Paint) this.b.get(arrayList.get(i3));
            if (paint != null) {
                Paint paint2 = new Paint();
                paint2.setColor(paint.getColor());
                paint2.setStrokeCap(paint.getStrokeCap());
                paint2.setStrokeJoin(paint.getStrokeJoin());
                paint2.setStrokeWidth(paint.getStrokeWidth());
                paint2.setStyle(paint.getStyle());
                jzVar.b.put(arrayList.get(i3), paint2);
            }
            i3++;
        }
    }

    public final void c(Canvas canvas, boolean z10, int i3, long j10, float f10, float f11, float f12, float f13) {
        int i10;
        int i11 = this.m;
        if (i11 >= 0) {
            f(i11, this.o, this.p, z10);
        }
        float f14 = ((int) f12) / this.e;
        float f15 = ((int) f13) / this.f;
        float max = this.s ? Math.max(f14, f15) : Math.min(f14, f15);
        LinearGradient[] linearGradientArr = this.i;
        if (linearGradientArr[i3] != null) {
            float f16 = w;
            if (f16 > 0.0f && A) {
                if (z10) {
                    long j11 = j10 - x;
                    long j12 = j11 > 64 ? 64L : j11;
                    if (j12 > 0) {
                        x = j10;
                        v = a1.g.e(j12, f16, 1800.0f, v);
                        while (true) {
                            float f17 = v;
                            float f18 = w * 2.0f;
                            if (f17 < f18) {
                                break;
                            } else {
                                v = f17 - f18;
                            }
                        }
                    }
                } else if (y == null || z.get() == this) {
                    long j13 = j10 - x;
                    long j14 = j13 <= 64 ? j13 : 64L;
                    long j15 = j14 < 0 ? 0L : j14;
                    x = j10;
                    v = a1.g.e(j15, w, 1800.0f, v);
                    while (true) {
                        float f19 = v;
                        float f20 = w;
                        if (f19 < f20 / 2.0f) {
                            break;
                        } else {
                            v = f19 - f20;
                        }
                    }
                    z = new WeakReference(this);
                    hc hcVar = y;
                    if (hcVar != null) {
                        g0.r(hcVar);
                    }
                    hc hcVar2 = new hc(14);
                    y = hcVar2;
                    g0.i3(hcVar2, ((int) (1000.0f / g0.r)) - 1);
                }
                ImageReceiver imageReceiver = this.k;
                if (imageReceiver == null || z10) {
                    i10 = 0;
                } else {
                    View view = imageReceiver.e;
                    int[] iArr = u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i10 = iArr[0];
                }
                int i12 = z10 ? i3 + 1 : 0;
                Matrix[] matrixArr = this.j;
                Matrix matrix = matrixArr[i12];
                if (matrix != null) {
                    matrix.reset();
                    if (z10) {
                        matrixArr[i12].postTranslate(((-i10) + v) - f10, 0.0f);
                    } else {
                        matrixArr[i12].postTranslate(((-i10) + v) - f10, 0.0f);
                    }
                    float f21 = 1.0f / max;
                    matrixArr[i12].postScale(f21, f21);
                    linearGradientArr[i12].setLocalMatrix(matrixArr[i12]);
                    ImageReceiver imageReceiver2 = this.k;
                    if (imageReceiver2 != null && !z10) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.s || this.t) {
            canvas.translate(com.google.android.recaptcha.internal.a.c(this.e, max, f12, 2.0f), com.google.android.recaptcha.internal.a.c(this.f, max, f13, 2.0f));
        }
        canvas.scale(max, max);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj instanceof Matrix) {
                canvas.save();
                canvas.concat((Matrix) obj);
            } else if (obj == null) {
                canvas.restore();
            } else {
                Paint paint = (Paint) this.r.get(i13);
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
                } else if (obj instanceof dz) {
                    dz dzVar = (dz) obj;
                    canvas.drawLine(dzVar.a, dzVar.b, dzVar.c, dzVar.d, paint);
                } else if (obj instanceof cz) {
                    cz czVar = (cz) obj;
                    canvas.drawCircle(czVar.a, czVar.b, czVar.c, paint);
                } else if (obj instanceof ez) {
                    canvas.drawOval(((ez) obj).a, paint);
                } else if (obj instanceof gz) {
                    gz gzVar = (gz) obj;
                    RectF rectF = gzVar.a;
                    float f22 = gzVar.b;
                    canvas.drawRoundRect(rectF, f22, f22, paint);
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

    public final void e(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.m = i3;
        this.o = e6Var;
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
    public final void f(int i3, org.telegram.ui.ActionBar.e6 e6Var, float f10, boolean z10) {
        BitmapShader bitmapShader;
        Integer num = this.n;
        int w02 = num == null ? org.telegram.ui.ActionBar.k6.w0(i3, e6Var) : num.intValue();
        this.o = e6Var;
        int[] iArr = this.l;
        if (iArr[z10 ? 1 : 0] != w02) {
            this.p = f10;
            this.m = i3;
            iArr[z10 ? 1 : 0] = w02;
            w = g0.q.x * 2;
            boolean z11 = A;
            HashMap hashMap = this.b;
            if (!z11) {
                int o10 = i0.a.o(w02, 70);
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
            float L = g0.L(180.0f) / w;
            int argb = Color.argb((int) ((Color.alpha(w02) / 2) * this.p), Color.red(w02), Color.green(w02), Color.blue(w02));
            float f11 = (1.0f - L) / 2.0f;
            float f12 = L / 2.0f;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
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
    public final void setAlpha(int i3) {
        this.q = i3 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
