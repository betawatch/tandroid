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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class rz extends Drawable {
    public static float v;
    public static float w;
    public static long x;
    public static pd y;
    public static WeakReference z;
    public Paint c;
    public Paint d;
    public int e;
    public int f;
    public ImageReceiver k;
    public int m;
    public Integer n;
    public org.telegram.ui.ActionBar.f6 o;
    public float p;
    public static final int[] u = new int[2];
    public static boolean A = rc.e(32);
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

    public static void a(rz rzVar, Object obj, Paint paint) {
        rzVar.a.add(obj);
        rzVar.b.put(obj, new Paint(paint));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rz clone() {
        rz rzVar = new rz();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                rzVar.e = this.e;
                rzVar.f = this.f;
                return rzVar;
            }
            rzVar.a.add(arrayList.get(i7));
            Paint paint = (Paint) this.b.get(arrayList.get(i7));
            if (paint != null) {
                Paint paint2 = new Paint();
                paint2.setColor(paint.getColor());
                paint2.setStrokeCap(paint.getStrokeCap());
                paint2.setStrokeJoin(paint.getStrokeJoin());
                paint2.setStrokeWidth(paint.getStrokeWidth());
                paint2.setStyle(paint.getStyle());
                rzVar.b.put(arrayList.get(i7), paint2);
            }
            i7++;
        }
    }

    public final void c(Canvas canvas, boolean z9, int i7, long j3, float f10, float f11, float f12, float f13) {
        int i10;
        int i11 = this.m;
        if (i11 >= 0) {
            f(i11, this.o, this.p, z9);
        }
        float f14 = ((int) f12) / this.e;
        float f15 = ((int) f13) / this.f;
        float max = this.s ? Math.max(f14, f15) : Math.min(f14, f15);
        LinearGradient[] linearGradientArr = this.i;
        if (linearGradientArr[i7] != null) {
            float f16 = w;
            if (f16 > 0.0f && A) {
                if (z9) {
                    long j10 = j3 - x;
                    long j11 = j10 > 64 ? 64L : j10;
                    if (j11 > 0) {
                        x = j3;
                        v = a8.p0.f(j11, f16, 1800.0f, v);
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
                    long j12 = j3 - x;
                    long j13 = j12 <= 64 ? j12 : 64L;
                    long j14 = j13 < 0 ? 0L : j13;
                    x = j3;
                    v = a8.p0.f(j14, w, 1800.0f, v);
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
                    pd pdVar = y;
                    if (pdVar != null) {
                        g0.r(pdVar);
                    }
                    pd pdVar2 = new pd(10);
                    y = pdVar2;
                    g0.i3(pdVar2, ((int) (1000.0f / g0.r)) - 1);
                }
                ImageReceiver imageReceiver = this.k;
                if (imageReceiver == null || z9) {
                    i10 = 0;
                } else {
                    View view = imageReceiver.e;
                    int[] iArr = u;
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    i10 = iArr[0];
                }
                int i12 = z9 ? i7 + 1 : 0;
                Matrix[] matrixArr = this.j;
                Matrix matrix = matrixArr[i12];
                if (matrix != null) {
                    matrix.reset();
                    if (z9) {
                        matrixArr[i12].postTranslate(((-i10) + v) - f10, 0.0f);
                    } else {
                        matrixArr[i12].postTranslate(((-i10) + v) - f10, 0.0f);
                    }
                    float f21 = 1.0f / max;
                    matrixArr[i12].postScale(f21, f21);
                    linearGradientArr[i12].setLocalMatrix(matrixArr[i12]);
                    ImageReceiver imageReceiver2 = this.k;
                    if (imageReceiver2 != null && !z9) {
                        imageReceiver2.invalidate();
                    }
                }
            }
        }
        canvas.save();
        canvas.translate(f10, f11);
        if (!this.s || this.t) {
            canvas.translate(com.google.android.recaptcha.internal.a.w(this.e, max, f12, 2.0f), com.google.android.recaptcha.internal.a.w(this.f, max, f13, 2.0f));
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
                if (z9) {
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
                } else if (obj instanceof lz) {
                    lz lzVar = (lz) obj;
                    canvas.drawLine(lzVar.a, lzVar.b, lzVar.c, lzVar.d, paint);
                } else if (obj instanceof kz) {
                    kz kzVar = (kz) obj;
                    canvas.drawCircle(kzVar.a, kzVar.b, kzVar.c, paint);
                } else if (obj instanceof mz) {
                    canvas.drawOval(((mz) obj).a, paint);
                } else if (obj instanceof oz) {
                    oz ozVar = (oz) obj;
                    RectF rectF = ozVar.a;
                    float f22 = ozVar.b;
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

    public final void e(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.m = i7;
        this.o = f6Var;
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
    public final void f(int i7, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z9) {
        BitmapShader bitmapShader;
        Integer num = this.n;
        int w02 = num == null ? org.telegram.ui.ActionBar.k6.w0(i7, f6Var) : num.intValue();
        this.o = f6Var;
        int[] iArr = this.l;
        if (iArr[z9 ? 1 : 0] != w02) {
            this.p = f10;
            this.m = i7;
            iArr[z9 ? 1 : 0] = w02;
            w = g0.q.x * 2;
            boolean z10 = A;
            HashMap hashMap = this.b;
            if (!z10) {
                int o4 = i0.a.o(w02, 70);
                if (z9) {
                    if (this.d == null) {
                        this.d = new Paint(1);
                    }
                    this.d.setShader(null);
                    this.d.setColor(o4);
                    return;
                }
                for (Paint paint : hashMap.values()) {
                    paint.setShader(null);
                    paint.setColor(o4);
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
            linearGradientArr[z9 ? 1 : 0] = linearGradient;
            if (Build.VERSION.SDK_INT >= 28) {
                bitmapShader = new LinearGradient(0.0f, 0.0f, w, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
            } else {
                Bitmap[] bitmapArr = this.g;
                Bitmap bitmap = bitmapArr[z9 ? 1 : 0];
                Canvas[] canvasArr = this.h;
                if (bitmap == null) {
                    bitmapArr[z9 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    canvasArr[z9 ? 1 : 0] = new Canvas(bitmapArr[z9 ? 1 : 0]);
                }
                canvasArr[z9 ? 1 : 0].drawColor(argb);
                bitmapShader = new BitmapShader(bitmapArr[z9 ? 1 : 0], tileMode, tileMode);
            }
            Matrix matrix = new Matrix();
            this.j[z9 ? 1 : 0] = matrix;
            linearGradientArr[z9 ? 1 : 0].setLocalMatrix(matrix);
            if (z9) {
                if (this.d == null) {
                    this.d = new Paint(1);
                }
                this.d.setShader(new ComposeShader(linearGradientArr[z9 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
            } else {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((Paint) it.next()).setShader(new ComposeShader(linearGradientArr[z9 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
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
    public final void setAlpha(int i7) {
        this.q = i7 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
