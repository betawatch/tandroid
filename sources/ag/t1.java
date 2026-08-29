package ag;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import i7.z5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class t1 extends TextureView {
    public s1 a;
    public n2 b;
    public final f1 c;
    public r1 d;
    public final n0 e;
    public final i2 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public t1(Context context, f1 f1Var, Bitmap bitmap, Bitmap bitmap2, ga gaVar) {
        super(context);
        int i10 = 0;
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = f1Var;
        f1Var.f = this;
        setSurfaceTextureListener(new n1(this, gaVar));
        this.e = new n0(this);
        l1 l1Var = new l1(this, i10);
        i2 i2Var = new i2();
        Paint paint = new Paint(1);
        i2Var.c = paint;
        Paint paint2 = new Paint(1);
        i2Var.d = paint2;
        Paint paint3 = new Paint(1);
        i2Var.e = paint3;
        Paint paint4 = new Paint(1);
        i2Var.f = paint4;
        Paint paint5 = new Paint(1);
        i2Var.g = paint5;
        i2Var.m = new ArrayList();
        i2Var.n = new ArrayList();
        i2Var.p = new float[2];
        i2Var.a = this;
        i2Var.b = l1Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = i2Var;
        f1Var.a = new o1(this, i10);
    }

    public final void a() {
        l1 l1Var = new l1(this, 2);
        n0 n0Var = this.e;
        n0Var.g = new j1(n0Var.a.getPainting().g.a, 0.0d, 1.0d);
        n0Var.l = true;
        n0Var.a(new d(), false, l1Var);
    }

    public final void b() {
        t1 t1Var;
        i2 i2Var = this.f;
        if (i2Var == null || (t1Var = i2Var.a) == null || t1Var.getPainting() == null || i2Var.h == null) {
            return;
        }
        f1 painting = t1Var.getPainting();
        painting.f.f(new b1(painting, 0));
        i2Var.m.clear();
        i2Var.n.clear();
        i2Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        r1 r1Var = this.d;
        if (r1Var == null || !r1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            r1Var.postRunnable(new z0(r1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            i2 i2Var = this.f;
            Paint paint = i2Var.c;
            ArrayList arrayList = i2Var.m;
            t1 t1Var = i2Var.a;
            if (t1Var == null || t1Var.getPainting() == null) {
                return;
            }
            bv0 bv0Var = t1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                h2 h2Var = (h2) arrayList.get(i10);
                if (h2Var.c && !h2Var.b) {
                    i2Var.b(canvas, bv0Var, h2Var);
                }
            }
            w1 w1Var = i2Var.h;
            if (w1Var != null && w1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (i2Var.h.b / bv0Var.a) * canvas.getWidth(), (i2Var.h.c / bv0Var.b) * canvas.getHeight());
            }
            w1 w1Var2 = i2Var.h;
            if (w1Var2 == null || w1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (i2Var.h.b / bv0Var.a), canvas.getHeight() * (i2Var.h.c / bv0Var.b), canvas.getWidth() * (i2Var.h.i / bv0Var.a), canvas.getHeight() * (i2Var.h.j / bv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (i2Var.h.d / bv0Var.a), canvas2.getHeight() * (i2Var.h.e / bv0Var.b), canvas2.getWidth() * (i2Var.h.i / bv0Var.a), canvas2.getHeight() * (i2Var.h.j / bv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                h2 h2Var2 = (h2) arrayList.get(i11);
                if (h2Var2.c && h2Var2.b) {
                    i2Var.b(canvas2, bv0Var, h2Var2);
                }
            }
            w1 w1Var3 = i2Var.h;
            if (w1Var3 == null || w1Var3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x025e, code lost:
    
        if (((r7 - java.lang.Math.min(r2.d, r2.e)) - (r0.h.f / 2.0f)) < org.telegram.messenger.AndroidUtilities.dp(30.0f)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0226, code lost:
    
        if (r5 < org.telegram.messenger.AndroidUtilities.dp(r12)) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        r1 r1Var;
        boolean z10;
        float f9;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        s1 s1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        char c3 = 1;
        if (motionEvent.getPointerCount() > 1 || (r1Var = this.d) == null || !r1Var.f || !r1Var.h) {
            return;
        }
        h2 h2Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r9 = 0;
        if (this.x instanceof l) {
            i2 i2Var = this.f;
            getScaleX();
            ArrayList arrayList = i2Var.n;
            ArrayList arrayList2 = i2Var.m;
            l1 l1Var = i2Var.b;
            float[] fArr = i2Var.p;
            t1 t1Var = i2Var.a;
            if (t1Var == null || t1Var.getPainting() == null || i2Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x4 = motionEvent.getX();
            float height = t1Var.getHeight() - motionEvent.getY();
            fArr[0] = x4;
            fArr[1] = height;
            i2Var.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            l1Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        i2Var.k = null;
                        return;
                    }
                    return;
                }
                h2 h2Var2 = i2Var.k;
                if (h2Var2 == null) {
                    e2 e2Var = i2Var.l;
                    if (e2Var != null) {
                        if (e2Var.b) {
                            i2Var.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + i2Var.i;
                        e2 e2Var2 = i2Var.l;
                        float f17 = f16 - e2Var2.d;
                        float f18 = (fArr[1] + i2Var.j) - e2Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            h2 h2Var3 = (h2) arrayList.get(i12);
                            h2Var3.b(h2Var3.d + f17, h2Var3.e + f18);
                        }
                    }
                } else {
                    if (h2Var2.b) {
                        i2Var.d(false);
                    }
                    i2Var.k.b(fArr[0] + i2Var.i, fArr[1] + i2Var.j);
                }
                t1Var.getPainting().k(i2Var.h);
                l1Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                h2 h2Var4 = (h2) arrayList2.get(i13);
                if (h2Var4.c) {
                    fArr[r9] = f14;
                    fArr[c3] = f15;
                    if (h2Var4.b) {
                        i2Var.c(f14, f15, r9);
                    }
                    double a2 = z5.a(h2Var4.d, h2Var4.e, fArr[r9], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (h2Var == null || a2 < d)) {
                        h2Var = h2Var4;
                        d = a2;
                    }
                }
                i13++;
                c3 = 1;
                r9 = 0;
            }
            fArr[0] = f14;
            fArr[1] = f15;
            i2Var.c(f14, f15, false);
            if (h2Var == null) {
                w1 w1Var = i2Var.h;
                if (w1Var != null) {
                    if (w1Var.a.o() == 0 || i2Var.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - i2Var.h.c, 2.0d) + Math.pow(f12 - i2Var.h.b, 2.0d));
                        w1 w1Var2 = i2Var.h;
                    } else if (i2Var.h.a.o() == 1 || i2Var.h.a.o() == 3) {
                        w1 w1Var3 = i2Var.h;
                        float f19 = w1Var3.b;
                        float f20 = w1Var3.d;
                        float f21 = w1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = w1Var3.c;
                        float f24 = w1Var3.e;
                        float f25 = (f23 - f24) - f21;
                        float f26 = f19 + f20 + f21;
                        float f27 = f23 + f24 + f21;
                        if (f15 > f25 && f15 < f27) {
                            if (f14 < f22) {
                                sqrt = f22 - f14;
                            } else {
                                if (f14 > f26) {
                                    sqrt = f14 - f26;
                                }
                                sqrt = 0.0f;
                            }
                            f13 = 30.0f;
                            if (i2Var.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (i2Var.h.a.o() == 3) {
                                w1 w1Var4 = i2Var.h;
                                float a10 = i2.a(f14, f15, w1Var4.b, w1Var4.c, w1Var4.i, w1Var4.j);
                                f12 = f14;
                                f11 = f15;
                                sqrt = Math.min(sqrt, a10);
                            } else {
                                f12 = f14;
                                f11 = f15;
                            }
                        } else {
                            if (f15 < f25) {
                                sqrt = f25 - f15;
                            } else {
                                if (f15 > f27) {
                                    sqrt = f15 - f27;
                                }
                                sqrt = 0.0f;
                            }
                            f13 = 30.0f;
                            if (i2Var.h.a.o() == 3) {
                            }
                        }
                    } else if (i2Var.h.a.o() == 4) {
                        bv0 bv0Var = t1Var.getPainting().g;
                        w1 w1Var5 = i2Var.h;
                        float a11 = i2.a(f14, f15, w1Var5.b, w1Var5.c, w1Var5.i, w1Var5.j);
                        w1 w1Var6 = i2Var.h;
                        if (Math.min(a11, i2.a(f14, f15, w1Var6.d, w1Var6.e, w1Var6.i, w1Var6.j)) - (i2Var.h.f / 2.0f) < Math.min(bv0Var.a, bv0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                i2Var.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            i2Var.k = h2Var;
            if (h2Var != null) {
                if (h2Var.b) {
                    i2Var.c(f12, f11, false);
                }
                h2 h2Var5 = i2Var.k;
                i2Var.i = h2Var5.d - fArr[0];
                i2Var.j = h2Var5.e - fArr[1];
                return;
            }
            e2 e2Var3 = i2Var.l;
            if (e2Var3 != null) {
                if (e2Var3.b) {
                    i2Var.c(f12, f11, false);
                }
                e2 e2Var4 = i2Var.l;
                i2Var.i = e2Var4.d - fArr[0];
                i2Var.j = e2Var4.e - fArr[1];
                return;
            }
            return;
        }
        final n0 n0Var = this.e;
        float scaleX = getScaleX();
        if (n0Var.x != null || n0Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float height2 = n0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = n0Var.u;
        fArr2[0] = x10;
        fArr2[1] = height2;
        n0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - n0Var.v;
        n0Var.w = i7.w.a(n0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (n0Var.a.getCurrentBrush() != null && (n0Var.a.getCurrentBrush() instanceof a)) {
            n0Var.w = 1.0f - n0Var.w;
        }
        n0Var.v = System.currentTimeMillis();
        float f28 = n0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f28 = Math.max(0.1f, n0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (n0Var.a.getCurrentBrush() != null) {
                    f28 = (AndroidUtilities.lerp(n0Var.a.getCurrentBrush().j(), 1.0f, i7.w.a(n0Var.o / 16.0f, 0.0f, 1.0f)) * (f28 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = n0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f28;
                j1 j1Var = new j1(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (n0Var.z) {
                            n0Var.z = false;
                            return;
                        }
                        n0Var.l = false;
                        n0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(n0Var.y);
                        f1 painting = n0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!n0Var.e) {
                                s1 s1Var2 = n0Var.a.a;
                                if (s1Var2 == null || s1Var2.d()) {
                                    j1Var.d = true;
                                    g1 g1Var = new g1();
                                    Vector vector = new Vector();
                                    g1Var.b = vector;
                                    vector.add(j1Var);
                                    n0Var.b(g1Var);
                                }
                                n0Var.n = 0;
                            } else if (n0Var.n > 0) {
                                n0Var.c(n0Var.a.getCurrentBrush().j(), true);
                                if (n0Var.a.getCurrentBrush() instanceof a) {
                                    final float f29 = n0Var.k;
                                    final j1 j1Var2 = n0Var.m[n0Var.n - 1];
                                    j1 j1Var3 = n0Var.h;
                                    double d17 = j1Var3 == null ? d16 : j1Var3.c;
                                    final float currentWeight = n0Var.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = n0Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    n0Var.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.g0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            n0 n0Var2 = n0.this;
                                            n0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f29;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            j1 j1Var4 = j1Var2;
                                            double d20 = j1Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = j1Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            n0Var2.b(new g1(new j1[]{new j1(d24, d27, d28), new j1((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = j1Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            n0Var2.b(new g1(new j1[]{new j1((d31 * d32) + d30, (d32 * d33) + d25, d28), new j1((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    n0Var.r.addListener(new m0(n0Var, 0));
                                    n0Var.r.setDuration(240L);
                                    n0Var.r.setInterpolator(jr.h);
                                    n0Var.r.start();
                                }
                            }
                            r72 = 0;
                            n0Var.a.getPainting().c(null, n0Var.a.getCurrentColor(), true, new h0(n0Var, 0 == true ? 1 : 0));
                            n0Var.n = r72;
                            n0Var.o = r72;
                            n0Var.j = r72;
                            n0Var.b = r72;
                            n0Var.p = 0.0d;
                            n0Var.q = 0.0d;
                            s1Var = n0Var.a.a;
                            if (s1Var == null) {
                                s1Var.e();
                                return;
                            }
                            return;
                        }
                        ValueAnimator valueAnimator2 = painting.L;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        painting.L = ofFloat2;
                        int i14 = 1;
                        ofFloat2.addUpdateListener(new y0(painting, i14));
                        painting.L.addListener(new e1(painting, i14));
                        painting.L.setInterpolator(jr.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
                        r72 = 0;
                        n0Var.n = r72;
                        n0Var.o = r72;
                        n0Var.j = r72;
                        n0Var.b = r72;
                        n0Var.p = 0.0d;
                        n0Var.q = 0.0d;
                        s1Var = n0Var.a.a;
                        if (s1Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (n0Var.z) {
                            n0Var.z = false;
                            return;
                        }
                        n0Var.l = false;
                        n0Var.s.c();
                        f1 painting2 = n0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new a1(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(n0Var.y);
                        f1 painting3 = n0Var.a.getPainting();
                        painting3.f.f(new b1(painting3, i11));
                        n0Var.n = 0;
                        n0Var.o = 0;
                        n0Var.j = false;
                        n0Var.b = false;
                        n0Var.p = 0.0d;
                        n0Var.q = 0.0d;
                        m mVar = n0Var.A;
                        if (mVar != null) {
                            n0Var.a.g(mVar);
                            n0Var.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (n0Var.z) {
                    if (!n0Var.b) {
                        n0Var.b = true;
                        n0Var.e = false;
                        n0Var.c = true;
                        n0Var.g = j1Var;
                        n0Var.d = System.currentTimeMillis();
                        n0Var.m[0] = j1Var;
                        n0Var.n = 1;
                        n0Var.o = 1;
                        n0Var.j = false;
                        n0Var.f = true;
                        n0Var.l = true;
                        AndroidUtilities.runOnUIThread(n0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = j1Var.a(n0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (n0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || n0Var.n > 4)) {
                        n0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(n0Var.y);
                    }
                    if (!n0Var.e) {
                        s1 s1Var3 = n0Var.a.a;
                        if (s1Var3 != null) {
                            s1Var3.f();
                        }
                        n0Var.e = true;
                        if (z10 && (n0Var.a.getCurrentBrush() instanceof f)) {
                            n0Var.A = n0Var.a.getCurrentBrush();
                            n0Var.a.g((m) j7.l1.j(1, m.a));
                        }
                    }
                    n0Var.m[n0Var.n] = j1Var;
                    if (n0Var.a.getPainting() == null || !n0Var.a.getPainting().G) {
                        f9 = a12;
                        if (System.currentTimeMillis() - n0Var.d > 3000) {
                            n0Var.s.c();
                            f1 painting4 = n0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new a1(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((n0Var.a.getCurrentBrush() instanceof f) || (n0Var.a.getCurrentBrush() instanceof c)) {
                            d2 d2Var = n0Var.s;
                            boolean z12 = f9 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (d2Var) {
                                d2Var.b.add(new a2(d14, d15));
                                z11 = d2Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = d2.m;
                                x1 x1Var = d2Var.l;
                                AtomicBoolean atomicBoolean = d2Var.k;
                                if (!d2Var.j.get()) {
                                    if (atomicBoolean.get() && !d2Var.d && z12) {
                                        dispatchQueue.cancelRunnable(x1Var);
                                        dispatchQueue.postRunnable(x1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(x1Var, 150L);
                                        i10 = n0Var.n + r42;
                                        n0Var.n = i10;
                                        n0Var.o += r42;
                                        if (i10 != 3) {
                                            j1[] j1VarArr = n0Var.m;
                                            j1 j1Var4 = j1VarArr[2];
                                            double d19 = j1Var4.b;
                                            j1 j1Var5 = j1VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - j1Var5.b, j1Var4.a - j1Var5.a);
                                            if (n0Var.j) {
                                                float a13 = i7.w.a(f9 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = n0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f10 = scaleX;
                                                    n0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), j7.l1.b(d23, d22, Math.cos(d21) * d20));
                                                    n0Var.c(n0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                n0Var.k = atan2;
                                                n0Var.j = r42;
                                            }
                                            f10 = scaleX;
                                            n0Var.c(n0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f10 = scaleX;
                                        }
                                        n0Var.g = j1Var;
                                        if (f9 > AndroidUtilities.dp(8.0f) / f10) {
                                            n0Var.h = j1Var;
                                        }
                                        n0Var.w = i7.w.a((currentTimeMillis / 75.0f) + n0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f9 = a12;
                    }
                    r42 = 1;
                    i10 = n0Var.n + r42;
                    n0Var.n = i10;
                    n0Var.o += r42;
                    if (i10 != 3) {
                    }
                    n0Var.g = j1Var;
                    if (f9 > AndroidUtilities.dp(8.0f) / f10) {
                    }
                    n0Var.w = i7.w.a((currentTimeMillis / 75.0f) + n0Var.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (n0Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = n0Var.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f28;
        j1 j1Var6 = new j1(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (n0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        r1 r1Var = this.d;
        if (r1Var == null) {
            return;
        }
        r1Var.postRunnable(new a1.e(5, this, runnable));
    }

    public m getCurrentBrush() {
        return this.x;
    }

    public int getCurrentColor() {
        return this.w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public f1 getPainting() {
        return this.c;
    }

    public n2 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new l1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        f1 f1Var = this.c;
        float width = f1Var != null ? getWidth() / f1Var.g.a : 1.0f;
        float f9 = width > 0.0f ? width : 1.0f;
        bv0 bv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f9, -f9);
        matrix.preTranslate((-bv0Var.a) / 2.0f, (-bv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            i2 i2Var = this.f;
            i2Var.getClass();
            Matrix matrix2 = new Matrix();
            i2Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            n0 n0Var = this.e;
            n0Var.getClass();
            Matrix matrix3 = new Matrix();
            n0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        r1 r1Var = this.d;
        f1Var.y = h7.r.c(h7.r.b(r1Var.n, r1Var.r), h7.r.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        i2 i2Var = this.f;
        if (z10) {
            i2Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = i2Var.n;
            ArrayList arrayList2 = i2Var.m;
            t1 t1Var = i2Var.a;
            if (t1Var == null || t1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            i2Var.h = new w1(l.p(o10));
            bv0 bv0Var = t1Var.getPainting().g;
            w1 w1Var = i2Var.h;
            float f9 = bv0Var.a;
            w1Var.b = f9 / 2.0f;
            float f10 = bv0Var.b;
            w1Var.c = f10 / 2.0f;
            float min = Math.min(f9, f10) / 5.0f;
            w1Var.e = min;
            w1Var.d = min;
            i2Var.h.f = t1Var.getCurrentWeight();
            i2Var.h.g = AndroidUtilities.dp(32.0f);
            i2Var.h.l = h1.e(UserConfig.selectedAccount).k;
            if (i2Var.h.a.o() == 4) {
                w1 w1Var2 = i2Var.h;
                float f11 = bv0Var.a / 2.0f;
                w1Var2.d = f11;
                w1Var2.b = f11;
                w1Var2.i = f11 + 1.0f;
                float f12 = bv0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                w1Var2.c = f14;
                float f15 = f12 / 2.0f;
                w1Var2.j = f15;
                w1Var2.e = f13 * 2.0f;
                w1Var2.k = Math.abs(f14 - f15);
                e2 e2Var = new e2(i2Var, 0);
                arrayList2.add(e2Var);
                f2 f2Var = new f2(i2Var, e2Var, 0);
                arrayList2.add(f2Var);
                arrayList.add(f2Var);
                f2 f2Var2 = new f2(i2Var, e2Var, 1);
                arrayList2.add(f2Var2);
                arrayList.add(f2Var2);
            }
            if (i2Var.h.a.o() == 0) {
                arrayList2.add(new e2(i2Var, 1));
            }
            if (i2Var.h.a.o() == 2) {
                arrayList2.add(new e2(i2Var, 2));
            }
            if (i2Var.h.a.o() == 1 || i2Var.h.a.o() == 3) {
                arrayList2.add(new g2(i2Var, i2Var.h, false, false));
                arrayList2.add(new g2(i2Var, i2Var.h, true, false));
                arrayList2.add(new g2(i2Var, i2Var.h, false, true));
                arrayList2.add(new g2(i2Var, i2Var.h, true, true));
                arrayList2.add(new e2(i2Var, 3, false));
            }
            if (i2Var.h.a.o() == 3) {
                w1 w1Var3 = i2Var.h;
                w1Var3.i = (w1Var3.d * 0.8f) + w1Var3.b;
                w1Var3.j = (w1Var3.e * 1.2f) + w1Var3.c + w1Var3.f;
                e2 e2Var2 = new e2(i2Var, 4);
                arrayList2.add(e2Var2);
                e2Var2.b = false;
                arrayList.add(e2Var2);
            }
            i2Var.l = new e2(i2Var, 5, false);
            if (i2Var.h.a.o() != 4) {
                i2Var.l.c = false;
            }
            e2 e2Var3 = i2Var.l;
            e2Var3.b = false;
            arrayList.add(e2Var3);
            arrayList2.add(i2Var.l);
            t1Var.getPainting().k(i2Var.h);
        }
    }

    public void setBrushSize(float f9) {
        float f10 = this.c.g.a;
        this.v = com.google.android.recaptcha.internal.a.x(f10, 0.043945312f, f9, 0.00390625f * f10);
        if (this.x instanceof l) {
            i2 i2Var = this.f;
            t1 t1Var = i2Var.a;
            w1 w1Var = i2Var.h;
            if (w1Var == null || w1Var.f == t1Var.getCurrentWeight()) {
                return;
            }
            i2Var.h.f = t1Var.getCurrentWeight();
            t1Var.getPainting().k(i2Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            i2 i2Var = this.f;
            if (i2Var.h != null) {
                i2Var.a.getPainting().k(i2Var.h);
            }
        }
    }

    public void setDelegate(s1 s1Var) {
        this.a = s1Var;
    }

    public void setUndoStore(n2 n2Var) {
        this.b = n2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
