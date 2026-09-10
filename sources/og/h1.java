package og;

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
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import v7.a7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class h1 extends TextureView {
    public g1 a;
    public y1 b;
    public final v0 c;
    public f1 d;
    public final g0 e;
    public final u1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public h1(Context context, v0 v0Var, Bitmap bitmap, Bitmap bitmap2, ia iaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = v0Var;
        v0Var.f = this;
        setSurfaceTextureListener(new d1(this, iaVar));
        this.e = new g0(this);
        b1 b1Var = new b1(this, 0);
        u1 u1Var = new u1();
        Paint paint = new Paint(1);
        u1Var.c = paint;
        Paint paint2 = new Paint(1);
        u1Var.d = paint2;
        Paint paint3 = new Paint(1);
        u1Var.e = paint3;
        Paint paint4 = new Paint(1);
        u1Var.f = paint4;
        Paint paint5 = new Paint(1);
        u1Var.g = paint5;
        u1Var.m = new ArrayList();
        u1Var.n = new ArrayList();
        u1Var.p = new float[2];
        u1Var.a = this;
        u1Var.b = b1Var;
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
        this.f = u1Var;
        v0Var.a = new l2.h(this, 7);
    }

    public final void a() {
        b1 b1Var = new b1(this, 2);
        g0 g0Var = this.e;
        g0Var.g = new z0(g0Var.a.getPainting().g.a, 0.0d, 1.0d);
        g0Var.l = true;
        g0Var.a(new d(), false, b1Var);
    }

    public final void b() {
        h1 h1Var;
        u1 u1Var = this.f;
        if (u1Var == null || (h1Var = u1Var.a) == null || h1Var.getPainting() == null || u1Var.h == null) {
            return;
        }
        v0 painting = h1Var.getPainting();
        painting.f.f(new r0(painting, 0));
        u1Var.m.clear();
        u1Var.n.clear();
        u1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        f1 f1Var = this.d;
        if (f1Var == null || !f1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            f1Var.postRunnable(new p0(f1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            u1 u1Var = this.f;
            Paint paint = u1Var.c;
            ArrayList arrayList = u1Var.m;
            h1 h1Var = u1Var.a;
            if (h1Var == null || h1Var.getPainting() == null) {
                return;
            }
            tv0 tv0Var = h1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                t1 t1Var = (t1) arrayList.get(i10);
                if (t1Var.c && !t1Var.b) {
                    u1Var.b(canvas, tv0Var, t1Var);
                }
            }
            k1 k1Var = u1Var.h;
            if (k1Var != null && k1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (u1Var.h.b / tv0Var.a) * canvas.getWidth(), (u1Var.h.c / tv0Var.b) * canvas.getHeight());
            }
            k1 k1Var2 = u1Var.h;
            if (k1Var2 == null || k1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (u1Var.h.b / tv0Var.a), canvas.getHeight() * (u1Var.h.c / tv0Var.b), canvas.getWidth() * (u1Var.h.i / tv0Var.a), canvas.getHeight() * (u1Var.h.j / tv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (u1Var.h.d / tv0Var.a), canvas2.getHeight() * (u1Var.h.e / tv0Var.b), canvas2.getWidth() * (u1Var.h.i / tv0Var.a), canvas2.getHeight() * (u1Var.h.j / tv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t1 t1Var2 = (t1) arrayList.get(i11);
                if (t1Var2.c && t1Var2.b) {
                    u1Var.b(canvas2, tv0Var, t1Var2);
                }
            }
            k1 k1Var3 = u1Var.h;
            if (k1Var3 == null || k1Var3.h == 0.0f) {
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
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        f1 f1Var;
        boolean z10;
        float f7;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        g1 g1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        char c10 = 1;
        if (motionEvent.getPointerCount() > 1 || (f1Var = this.d) == null || !f1Var.f || !f1Var.h) {
            return;
        }
        t1 t1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            u1 u1Var = this.f;
            getScaleX();
            ArrayList arrayList = u1Var.n;
            ArrayList arrayList2 = u1Var.m;
            b1 b1Var = u1Var.b;
            float[] fArr = u1Var.p;
            h1 h1Var = u1Var.a;
            if (h1Var == null || h1Var.getPainting() == null || u1Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = h1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            u1Var.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            b1Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        u1Var.k = null;
                        return;
                    }
                    return;
                }
                t1 t1Var2 = u1Var.k;
                if (t1Var2 == null) {
                    q1 q1Var = u1Var.l;
                    if (q1Var != null) {
                        if (q1Var.b) {
                            u1Var.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + u1Var.i;
                        q1 q1Var2 = u1Var.l;
                        float f17 = f16 - q1Var2.d;
                        float f18 = (fArr[1] + u1Var.j) - q1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            t1 t1Var3 = (t1) arrayList.get(i12);
                            t1Var3.b(t1Var3.d + f17, t1Var3.e + f18);
                        }
                    }
                } else {
                    if (t1Var2.b) {
                        u1Var.d(false);
                    }
                    u1Var.k.b(fArr[0] + u1Var.i, fArr[1] + u1Var.j);
                }
                h1Var.getPainting().k(u1Var.h);
                b1Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                t1 t1Var4 = (t1) arrayList2.get(i13);
                if (t1Var4.c) {
                    fArr[r92] = f14;
                    fArr[c10] = f15;
                    if (t1Var4.b) {
                        u1Var.c(f14, f15, r92);
                    }
                    double a2 = a7.a(t1Var4.d, t1Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (t1Var == null || a2 < d)) {
                        t1Var = t1Var4;
                        d = a2;
                    }
                }
                i13++;
                c10 = 1;
                r92 = 0;
            }
            fArr[0] = f14;
            fArr[1] = f15;
            u1Var.c(f14, f15, false);
            if (t1Var == null) {
                k1 k1Var = u1Var.h;
                if (k1Var != null) {
                    if (k1Var.a.o() == 0 || u1Var.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - u1Var.h.c, 2.0d) + Math.pow(f12 - u1Var.h.b, 2.0d));
                        k1 k1Var2 = u1Var.h;
                    } else if (u1Var.h.a.o() == 1 || u1Var.h.a.o() == 3) {
                        k1 k1Var3 = u1Var.h;
                        float f19 = k1Var3.b;
                        float f20 = k1Var3.d;
                        float f21 = k1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = k1Var3.c;
                        float f24 = k1Var3.e;
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
                            if (u1Var.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (u1Var.h.a.o() == 3) {
                                k1 k1Var4 = u1Var.h;
                                float a10 = u1.a(f14, f15, k1Var4.b, k1Var4.c, k1Var4.i, k1Var4.j);
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
                            if (u1Var.h.a.o() == 3) {
                            }
                        }
                    } else if (u1Var.h.a.o() == 4) {
                        tv0 tv0Var = h1Var.getPainting().g;
                        k1 k1Var5 = u1Var.h;
                        float a11 = u1.a(f14, f15, k1Var5.b, k1Var5.c, k1Var5.i, k1Var5.j);
                        k1 k1Var6 = u1Var.h;
                        if (Math.min(a11, u1.a(f14, f15, k1Var6.d, k1Var6.e, k1Var6.i, k1Var6.j)) - (u1Var.h.f / 2.0f) < Math.min(tv0Var.a, tv0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                u1Var.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            u1Var.k = t1Var;
            if (t1Var != null) {
                if (t1Var.b) {
                    u1Var.c(f12, f11, false);
                }
                t1 t1Var5 = u1Var.k;
                u1Var.i = t1Var5.d - fArr[0];
                u1Var.j = t1Var5.e - fArr[1];
                return;
            }
            q1 q1Var3 = u1Var.l;
            if (q1Var3 != null) {
                if (q1Var3.b) {
                    u1Var.c(f12, f11, false);
                }
                q1 q1Var4 = u1Var.l;
                u1Var.i = q1Var4.d - fArr[0];
                u1Var.j = q1Var4.e - fArr[1];
                return;
            }
            return;
        }
        final g0 g0Var = this.e;
        float scaleX = getScaleX();
        if (g0Var.x != null || g0Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float height2 = g0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = g0Var.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        g0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - g0Var.v;
        g0Var.w = w7.q.a(g0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (g0Var.a.getCurrentBrush() != null && (g0Var.a.getCurrentBrush() instanceof a)) {
            g0Var.w = 1.0f - g0Var.w;
        }
        g0Var.v = System.currentTimeMillis();
        float f28 = g0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f28 = Math.max(0.1f, g0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (g0Var.a.getCurrentBrush() != null) {
                    f28 = (AndroidUtilities.lerp(g0Var.a.getCurrentBrush().j(), 1.0f, w7.q.a(g0Var.o / 16.0f, 0.0f, 1.0f)) * (f28 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = g0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f28;
                z0 z0Var = new z0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (g0Var.z) {
                            g0Var.z = false;
                            return;
                        }
                        g0Var.l = false;
                        g0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(g0Var.y);
                        v0 painting = g0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!g0Var.e) {
                                g1 g1Var2 = g0Var.a.a;
                                if (g1Var2 == null || g1Var2.d()) {
                                    z0Var.d = true;
                                    w0 w0Var = new w0();
                                    Vector vector = new Vector();
                                    w0Var.b = vector;
                                    vector.add(z0Var);
                                    g0Var.b(w0Var);
                                }
                                g0Var.n = 0;
                            } else if (g0Var.n > 0) {
                                g0Var.c(g0Var.a.getCurrentBrush().j(), true);
                                if (g0Var.a.getCurrentBrush() instanceof a) {
                                    final float f29 = g0Var.k;
                                    final z0 z0Var2 = g0Var.m[g0Var.n - 1];
                                    z0 z0Var3 = g0Var.h;
                                    double d17 = z0Var3 == null ? d16 : z0Var3.c;
                                    final float currentWeight = g0Var.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = g0Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    g0Var.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: og.b0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            g0 g0Var2 = g0.this;
                                            g0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f29;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            z0 z0Var4 = z0Var2;
                                            double d20 = z0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = z0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            g0Var2.b(new w0(new z0[]{new z0(d24, d27, d28), new z0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = z0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            g0Var2.b(new w0(new z0[]{new z0((d31 * d32) + d30, (d32 * d33) + d25, d28), new z0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    g0Var.r.addListener(new bi.h(g0Var, 16));
                                    g0Var.r.setDuration(240L);
                                    g0Var.r.setInterpolator(wr.h);
                                    g0Var.r.start();
                                }
                            }
                            r72 = 0;
                            g0Var.a.getPainting().c(null, g0Var.a.getCurrentColor(), true, new c0(g0Var, 0 == true ? 1 : 0));
                            g0Var.n = r72;
                            g0Var.o = r72;
                            g0Var.j = r72;
                            g0Var.b = r72;
                            g0Var.p = 0.0d;
                            g0Var.q = 0.0d;
                            g1Var = g0Var.a.a;
                            if (g1Var == null) {
                                g1Var.e();
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
                        ofFloat2.addUpdateListener(new o0(painting, i14));
                        painting.L.addListener(new t0(painting, i14));
                        painting.L.setInterpolator(wr.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
                        r72 = 0;
                        g0Var.n = r72;
                        g0Var.o = r72;
                        g0Var.j = r72;
                        g0Var.b = r72;
                        g0Var.p = 0.0d;
                        g0Var.q = 0.0d;
                        g1Var = g0Var.a.a;
                        if (g1Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (g0Var.z) {
                            g0Var.z = false;
                            return;
                        }
                        g0Var.l = false;
                        g0Var.s.c();
                        v0 painting2 = g0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new q0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(g0Var.y);
                        v0 painting3 = g0Var.a.getPainting();
                        painting3.f.f(new r0(painting3, i11));
                        g0Var.n = 0;
                        g0Var.o = 0;
                        g0Var.j = false;
                        g0Var.b = false;
                        g0Var.p = 0.0d;
                        g0Var.q = 0.0d;
                        m mVar = g0Var.A;
                        if (mVar != null) {
                            g0Var.a.g(mVar);
                            g0Var.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (g0Var.z) {
                    if (!g0Var.b) {
                        g0Var.b = true;
                        g0Var.e = false;
                        g0Var.c = true;
                        g0Var.g = z0Var;
                        g0Var.d = System.currentTimeMillis();
                        g0Var.m[0] = z0Var;
                        g0Var.n = 1;
                        g0Var.o = 1;
                        g0Var.j = false;
                        g0Var.f = true;
                        g0Var.l = true;
                        AndroidUtilities.runOnUIThread(g0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = z0Var.a(g0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (g0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || g0Var.n > 4)) {
                        g0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(g0Var.y);
                    }
                    if (!g0Var.e) {
                        g1 g1Var3 = g0Var.a.a;
                        if (g1Var3 != null) {
                            g1Var3.f();
                        }
                        g0Var.e = true;
                        if (z10 && (g0Var.a.getCurrentBrush() instanceof f)) {
                            g0Var.A = g0Var.a.getCurrentBrush();
                            g0Var.a.g((m) r6.g(1, m.a));
                        }
                    }
                    g0Var.m[g0Var.n] = z0Var;
                    if (g0Var.a.getPainting() == null || !g0Var.a.getPainting().G) {
                        f7 = a12;
                        if (System.currentTimeMillis() - g0Var.d > 3000) {
                            g0Var.s.c();
                            v0 painting4 = g0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new q0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((g0Var.a.getCurrentBrush() instanceof f) || (g0Var.a.getCurrentBrush() instanceof c)) {
                            p1 p1Var = g0Var.s;
                            boolean z12 = f7 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (p1Var) {
                                p1Var.b.add(new m1(d14, d15));
                                z11 = p1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = p1.m;
                                l1 l1Var = p1Var.l;
                                AtomicBoolean atomicBoolean = p1Var.k;
                                if (!p1Var.j.get()) {
                                    if (atomicBoolean.get() && !p1Var.d && z12) {
                                        dispatchQueue.cancelRunnable(l1Var);
                                        dispatchQueue.postRunnable(l1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(l1Var, 150L);
                                        i10 = g0Var.n + r42;
                                        g0Var.n = i10;
                                        g0Var.o += r42;
                                        if (i10 != 3) {
                                            z0[] z0VarArr = g0Var.m;
                                            z0 z0Var4 = z0VarArr[2];
                                            double d19 = z0Var4.b;
                                            z0 z0Var5 = z0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - z0Var5.b, z0Var4.a - z0Var5.a);
                                            if (g0Var.j) {
                                                float a13 = w7.q.a(f7 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = g0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f10 = scaleX;
                                                    g0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), hc.b.f(d23, d22, Math.cos(d21) * d20));
                                                    g0Var.c(g0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                g0Var.k = atan2;
                                                g0Var.j = r42;
                                            }
                                            f10 = scaleX;
                                            g0Var.c(g0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f10 = scaleX;
                                        }
                                        g0Var.g = z0Var;
                                        if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                                            g0Var.h = z0Var;
                                        }
                                        g0Var.w = w7.q.a((currentTimeMillis / 75.0f) + g0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f7 = a12;
                    }
                    r42 = 1;
                    i10 = g0Var.n + r42;
                    g0Var.n = i10;
                    g0Var.o += r42;
                    if (i10 != 3) {
                    }
                    g0Var.g = z0Var;
                    if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                    }
                    g0Var.w = w7.q.a((currentTimeMillis / 75.0f) + g0Var.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (g0Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = g0Var.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f28;
        z0 z0Var6 = new z0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (g0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        f1 f1Var = this.d;
        if (f1Var == null) {
            return;
        }
        f1Var.postRunnable(new m4.w(10, this, runnable));
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

    public v0 getPainting() {
        return this.c;
    }

    public y1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new b1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        v0 v0Var = this.c;
        float width = v0Var != null ? getWidth() / v0Var.g.a : 1.0f;
        float f7 = width > 0.0f ? width : 1.0f;
        tv0 tv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f7, -f7);
        matrix.preTranslate((-tv0Var.a) / 2.0f, (-tv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            u1 u1Var = this.f;
            u1Var.getClass();
            Matrix matrix2 = new Matrix();
            u1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            g0 g0Var = this.e;
            g0Var.getClass();
            Matrix matrix3 = new Matrix();
            g0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        f1 f1Var = this.d;
        v0Var.y = w7.h0.c(w7.h0.b(f1Var.n, f1Var.r), w7.h0.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        u1 u1Var = this.f;
        if (z10) {
            u1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = u1Var.n;
            ArrayList arrayList2 = u1Var.m;
            h1 h1Var = u1Var.a;
            if (h1Var == null || h1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            u1Var.h = new k1(l.p(o9));
            tv0 tv0Var = h1Var.getPainting().g;
            k1 k1Var = u1Var.h;
            float f7 = tv0Var.a;
            k1Var.b = f7 / 2.0f;
            float f10 = tv0Var.b;
            k1Var.c = f10 / 2.0f;
            float min = Math.min(f7, f10) / 5.0f;
            k1Var.e = min;
            k1Var.d = min;
            u1Var.h.f = h1Var.getCurrentWeight();
            u1Var.h.g = AndroidUtilities.dp(32.0f);
            u1Var.h.l = x0.e(UserConfig.selectedAccount).k;
            if (u1Var.h.a.o() == 4) {
                k1 k1Var2 = u1Var.h;
                float f11 = tv0Var.a / 2.0f;
                k1Var2.d = f11;
                k1Var2.b = f11;
                k1Var2.i = f11 + 1.0f;
                float f12 = tv0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                k1Var2.c = f14;
                float f15 = f12 / 2.0f;
                k1Var2.j = f15;
                k1Var2.e = f13 * 2.0f;
                k1Var2.k = Math.abs(f14 - f15);
                q1 q1Var = new q1(u1Var, 0);
                arrayList2.add(q1Var);
                r1 r1Var = new r1(u1Var, q1Var, 0);
                arrayList2.add(r1Var);
                arrayList.add(r1Var);
                r1 r1Var2 = new r1(u1Var, q1Var, 1);
                arrayList2.add(r1Var2);
                arrayList.add(r1Var2);
            }
            if (u1Var.h.a.o() == 0) {
                arrayList2.add(new q1(u1Var, 1));
            }
            if (u1Var.h.a.o() == 2) {
                arrayList2.add(new q1(u1Var, 2));
            }
            if (u1Var.h.a.o() == 1 || u1Var.h.a.o() == 3) {
                arrayList2.add(new s1(u1Var, u1Var.h, false, false));
                arrayList2.add(new s1(u1Var, u1Var.h, true, false));
                arrayList2.add(new s1(u1Var, u1Var.h, false, true));
                arrayList2.add(new s1(u1Var, u1Var.h, true, true));
                arrayList2.add(new q1(u1Var, 3, false));
            }
            if (u1Var.h.a.o() == 3) {
                k1 k1Var3 = u1Var.h;
                k1Var3.i = (k1Var3.d * 0.8f) + k1Var3.b;
                k1Var3.j = (k1Var3.e * 1.2f) + k1Var3.c + k1Var3.f;
                q1 q1Var2 = new q1(u1Var, 4);
                arrayList2.add(q1Var2);
                q1Var2.b = false;
                arrayList.add(q1Var2);
            }
            u1Var.l = new q1(u1Var, 5, false);
            if (u1Var.h.a.o() != 4) {
                u1Var.l.c = false;
            }
            q1 q1Var3 = u1Var.l;
            q1Var3.b = false;
            arrayList.add(q1Var3);
            arrayList2.add(u1Var.l);
            h1Var.getPainting().k(u1Var.h);
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.c.g.a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.x instanceof l) {
            u1 u1Var = this.f;
            h1 h1Var = u1Var.a;
            k1 k1Var = u1Var.h;
            if (k1Var == null || k1Var.f == h1Var.getCurrentWeight()) {
                return;
            }
            u1Var.h.f = h1Var.getCurrentWeight();
            h1Var.getPainting().k(u1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            u1 u1Var = this.f;
            if (u1Var.h != null) {
                u1Var.a.getPainting().k(u1Var.h);
            }
        }
    }

    public void setDelegate(g1 g1Var) {
        this.a = g1Var;
    }

    public void setUndoStore(y1 y1Var) {
        this.b = y1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
