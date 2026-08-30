package cg;

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
import j7.n5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class p1 extends TextureView {
    public o1 a;
    public i2 b;
    public final d1 c;
    public n1 d;
    public final m0 e;
    public final e2 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public p1(Context context, d1 d1Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = d1Var;
        d1Var.f = this;
        setSurfaceTextureListener(new l1(this, baVar));
        this.e = new m0(this);
        j1 j1Var = new j1(this, 0);
        e2 e2Var = new e2();
        Paint paint = new Paint(1);
        e2Var.c = paint;
        Paint paint2 = new Paint(1);
        e2Var.d = paint2;
        Paint paint3 = new Paint(1);
        e2Var.e = paint3;
        Paint paint4 = new Paint(1);
        e2Var.f = paint4;
        Paint paint5 = new Paint(1);
        e2Var.g = paint5;
        e2Var.m = new ArrayList();
        e2Var.n = new ArrayList();
        e2Var.p = new float[2];
        e2Var.a = this;
        e2Var.b = j1Var;
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
        this.f = e2Var;
        d1Var.a = new o5.i(this, 8);
    }

    public final void a() {
        j1 j1Var = new j1(this, 2);
        m0 m0Var = this.e;
        m0Var.g = new h1(m0Var.a.getPainting().g.a, 0.0d, 1.0d);
        m0Var.l = true;
        m0Var.a(new d(), false, j1Var);
    }

    public final void b() {
        p1 p1Var;
        e2 e2Var = this.f;
        if (e2Var == null || (p1Var = e2Var.a) == null || p1Var.getPainting() == null || e2Var.h == null) {
            return;
        }
        d1 painting = p1Var.getPainting();
        painting.f.f(new z0(painting, 0));
        e2Var.m.clear();
        e2Var.n.clear();
        e2Var.h = null;
    }

    public final Bitmap c(boolean z4, boolean z10) {
        if (this.x instanceof l) {
            this.f.e();
        }
        n1 n1Var = this.d;
        if (n1Var == null || !n1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            n1Var.postRunnable(new x0(n1Var, z4, z10, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            e2 e2Var = this.f;
            Paint paint = e2Var.c;
            ArrayList arrayList = e2Var.m;
            p1 p1Var = e2Var.a;
            if (p1Var == null || p1Var.getPainting() == null) {
                return;
            }
            jv0 jv0Var = p1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d2 d2Var = (d2) arrayList.get(i10);
                if (d2Var.c && !d2Var.b) {
                    e2Var.b(canvas, jv0Var, d2Var);
                }
            }
            s1 s1Var = e2Var.h;
            if (s1Var != null && s1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (e2Var.h.b / jv0Var.a) * canvas.getWidth(), (e2Var.h.c / jv0Var.b) * canvas.getHeight());
            }
            s1 s1Var2 = e2Var.h;
            if (s1Var2 == null || s1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (e2Var.h.b / jv0Var.a), canvas.getHeight() * (e2Var.h.c / jv0Var.b), canvas.getWidth() * (e2Var.h.i / jv0Var.a), canvas.getHeight() * (e2Var.h.j / jv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (e2Var.h.d / jv0Var.a), canvas2.getHeight() * (e2Var.h.e / jv0Var.b), canvas2.getWidth() * (e2Var.h.i / jv0Var.a), canvas2.getHeight() * (e2Var.h.j / jv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                d2 d2Var2 = (d2) arrayList.get(i11);
                if (d2Var2.c && d2Var2.b) {
                    e2Var.b(canvas2, jv0Var, d2Var2);
                }
            }
            s1 s1Var3 = e2Var.h;
            if (s1Var3 == null || s1Var3.h == 0.0f) {
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
        n1 n1Var;
        boolean z4;
        float f10;
        boolean z10;
        ?? r42;
        int i10;
        float f11;
        ?? r72;
        o1 o1Var;
        int i11;
        float f12;
        float f13;
        float f14;
        float sqrt;
        char c3 = 1;
        if (motionEvent.getPointerCount() > 1 || (n1Var = this.d) == null || !n1Var.f || !n1Var.h) {
            return;
        }
        d2 d2Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            e2 e2Var = this.f;
            getScaleX();
            ArrayList arrayList = e2Var.n;
            ArrayList arrayList2 = e2Var.m;
            j1 j1Var = e2Var.b;
            float[] fArr = e2Var.p;
            p1 p1Var = e2Var.a;
            if (p1Var == null || p1Var.getPainting() == null || e2Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = p1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            e2Var.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            j1Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        e2Var.k = null;
                        return;
                    }
                    return;
                }
                d2 d2Var2 = e2Var.k;
                if (d2Var2 == null) {
                    a2 a2Var = e2Var.l;
                    if (a2Var != null) {
                        if (a2Var.b) {
                            e2Var.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + e2Var.i;
                        a2 a2Var2 = e2Var.l;
                        float f18 = f17 - a2Var2.d;
                        float f19 = (fArr[1] + e2Var.j) - a2Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            d2 d2Var3 = (d2) arrayList.get(i12);
                            d2Var3.b(d2Var3.d + f18, d2Var3.e + f19);
                        }
                    }
                } else {
                    if (d2Var2.b) {
                        e2Var.d(false);
                    }
                    e2Var.k.b(fArr[0] + e2Var.i, fArr[1] + e2Var.j);
                }
                p1Var.getPainting().k(e2Var.h);
                j1Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                d2 d2Var4 = (d2) arrayList2.get(i13);
                if (d2Var4.c) {
                    fArr[r92] = f15;
                    fArr[c3] = f16;
                    if (d2Var4.b) {
                        e2Var.c(f15, f16, r92);
                    }
                    double a2 = n6.a(d2Var4.d, d2Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (d2Var == null || a2 < d)) {
                        d2Var = d2Var4;
                        d = a2;
                    }
                }
                i13++;
                c3 = 1;
                r92 = 0;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            e2Var.c(f15, f16, false);
            if (d2Var == null) {
                s1 s1Var = e2Var.h;
                if (s1Var != null) {
                    if (s1Var.a.o() == 0 || e2Var.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - e2Var.h.c, 2.0d) + Math.pow(f13 - e2Var.h.b, 2.0d));
                        s1 s1Var2 = e2Var.h;
                    } else if (e2Var.h.a.o() == 1 || e2Var.h.a.o() == 3) {
                        s1 s1Var3 = e2Var.h;
                        float f20 = s1Var3.b;
                        float f21 = s1Var3.d;
                        float f22 = s1Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = s1Var3.c;
                        float f25 = s1Var3.e;
                        float f26 = (f24 - f25) - f22;
                        float f27 = f20 + f21 + f22;
                        float f28 = f24 + f25 + f22;
                        if (f16 > f26 && f16 < f28) {
                            if (f15 < f23) {
                                sqrt = f23 - f15;
                            } else {
                                if (f15 > f27) {
                                    sqrt = f15 - f27;
                                }
                                sqrt = 0.0f;
                            }
                            f14 = 30.0f;
                            if (e2Var.h.a.o() == 3) {
                            }
                        } else if (f15 >= f23 || f15 <= f27) {
                            double d10 = f15 - f23;
                            f14 = 30.0f;
                            double d11 = f16 - f26;
                            double d12 = f15 - f27;
                            double d13 = f16 - f28;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (e2Var.h.a.o() == 3) {
                                s1 s1Var4 = e2Var.h;
                                float a10 = e2.a(f15, f16, s1Var4.b, s1Var4.c, s1Var4.i, s1Var4.j);
                                f13 = f15;
                                f12 = f16;
                                sqrt = Math.min(sqrt, a10);
                            } else {
                                f13 = f15;
                                f12 = f16;
                            }
                        } else {
                            if (f16 < f26) {
                                sqrt = f26 - f16;
                            } else {
                                if (f16 > f28) {
                                    sqrt = f16 - f28;
                                }
                                sqrt = 0.0f;
                            }
                            f14 = 30.0f;
                            if (e2Var.h.a.o() == 3) {
                            }
                        }
                    } else if (e2Var.h.a.o() == 4) {
                        jv0 jv0Var = p1Var.getPainting().g;
                        s1 s1Var5 = e2Var.h;
                        float a11 = e2.a(f15, f16, s1Var5.b, s1Var5.c, s1Var5.i, s1Var5.j);
                        s1 s1Var6 = e2Var.h;
                        if (Math.min(a11, e2.a(f15, f16, s1Var6.d, s1Var6.e, s1Var6.i, s1Var6.j)) - (e2Var.h.f / 2.0f) < Math.min(jv0Var.a, jv0Var.b) * 0.1f) {
                            f13 = f15;
                            f12 = f16;
                        }
                    }
                }
                e2Var.e();
                return;
            }
            f12 = f16;
            f13 = f15;
            fArr[0] = f13;
            fArr[1] = f12;
            e2Var.k = d2Var;
            if (d2Var != null) {
                if (d2Var.b) {
                    e2Var.c(f13, f12, false);
                }
                d2 d2Var5 = e2Var.k;
                e2Var.i = d2Var5.d - fArr[0];
                e2Var.j = d2Var5.e - fArr[1];
                return;
            }
            a2 a2Var3 = e2Var.l;
            if (a2Var3 != null) {
                if (a2Var3.b) {
                    e2Var.c(f13, f12, false);
                }
                a2 a2Var4 = e2Var.l;
                e2Var.i = a2Var4.d - fArr[0];
                e2Var.j = a2Var4.e - fArr[1];
                return;
            }
            return;
        }
        final m0 m0Var = this.e;
        float scaleX = getScaleX();
        if (m0Var.x != null || m0Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float height2 = m0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = m0Var.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        m0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - m0Var.v;
        m0Var.w = k7.n.a(m0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (m0Var.a.getCurrentBrush() != null && (m0Var.a.getCurrentBrush() instanceof a)) {
            m0Var.w = 1.0f - m0Var.w;
        }
        m0Var.v = System.currentTimeMillis();
        float f29 = m0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f29 = Math.max(0.1f, m0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z4 = true;
                if (m0Var.a.getCurrentBrush() != null) {
                    f29 = (AndroidUtilities.lerp(m0Var.a.getCurrentBrush().j(), 1.0f, k7.n.a(m0Var.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = m0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f29;
                h1 h1Var = new h1(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (m0Var.z) {
                            m0Var.z = false;
                            return;
                        }
                        m0Var.l = false;
                        m0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                        d1 painting = m0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!m0Var.e) {
                                o1 o1Var2 = m0Var.a.a;
                                if (o1Var2 == null || o1Var2.d()) {
                                    h1Var.d = true;
                                    e1 e1Var = new e1();
                                    Vector vector = new Vector();
                                    e1Var.b = vector;
                                    vector.add(h1Var);
                                    m0Var.b(e1Var);
                                }
                                m0Var.n = 0;
                            } else if (m0Var.n > 0) {
                                m0Var.c(m0Var.a.getCurrentBrush().j(), true);
                                if (m0Var.a.getCurrentBrush() instanceof a) {
                                    final float f30 = m0Var.k;
                                    final h1 h1Var2 = m0Var.m[m0Var.n - 1];
                                    h1 h1Var3 = m0Var.h;
                                    double d17 = h1Var3 == null ? d16 : h1Var3.c;
                                    final float currentWeight = m0Var.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = m0Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    m0Var.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cg.f0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            m0 m0Var2 = m0.this;
                                            m0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f30;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            h1 h1Var4 = h1Var2;
                                            double d20 = h1Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = h1Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            m0Var2.b(new e1(new h1[]{new h1(d24, d27, d28), new h1((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = h1Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            m0Var2.b(new e1(new h1[]{new h1((d31 * d32) + d30, (d32 * d33) + d25, d28), new h1((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    m0Var.r.addListener(new l0(m0Var, 0));
                                    m0Var.r.setDuration(240L);
                                    m0Var.r.setInterpolator(nr.h);
                                    m0Var.r.start();
                                }
                            }
                            r72 = 0;
                            m0Var.a.getPainting().c(null, m0Var.a.getCurrentColor(), true, new g0(m0Var, 0 == true ? 1 : 0));
                            m0Var.n = r72;
                            m0Var.o = r72;
                            m0Var.j = r72;
                            m0Var.b = r72;
                            m0Var.p = 0.0d;
                            m0Var.q = 0.0d;
                            o1Var = m0Var.a.a;
                            if (o1Var == null) {
                                o1Var.e();
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
                        ofFloat2.addUpdateListener(new w0(painting, i14));
                        painting.L.addListener(new c1(painting, i14));
                        painting.L.setInterpolator(nr.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
                        r72 = 0;
                        m0Var.n = r72;
                        m0Var.o = r72;
                        m0Var.j = r72;
                        m0Var.b = r72;
                        m0Var.p = 0.0d;
                        m0Var.q = 0.0d;
                        o1Var = m0Var.a.a;
                        if (o1Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (m0Var.z) {
                            m0Var.z = false;
                            return;
                        }
                        m0Var.l = false;
                        m0Var.s.c();
                        d1 painting2 = m0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new y0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                        d1 painting3 = m0Var.a.getPainting();
                        painting3.f.f(new z0(painting3, i11));
                        m0Var.n = 0;
                        m0Var.o = 0;
                        m0Var.j = false;
                        m0Var.b = false;
                        m0Var.p = 0.0d;
                        m0Var.q = 0.0d;
                        m mVar = m0Var.A;
                        if (mVar != null) {
                            m0Var.a.g(mVar);
                            m0Var.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (m0Var.z) {
                    if (!m0Var.b) {
                        m0Var.b = true;
                        m0Var.e = false;
                        m0Var.c = true;
                        m0Var.g = h1Var;
                        m0Var.d = System.currentTimeMillis();
                        m0Var.m[0] = h1Var;
                        m0Var.n = 1;
                        m0Var.o = 1;
                        m0Var.j = false;
                        m0Var.f = true;
                        m0Var.l = true;
                        AndroidUtilities.runOnUIThread(m0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = h1Var.a(m0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (m0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || m0Var.n > 4)) {
                        m0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                    }
                    if (!m0Var.e) {
                        o1 o1Var3 = m0Var.a.a;
                        if (o1Var3 != null) {
                            o1Var3.f();
                        }
                        m0Var.e = true;
                        if (z4 && (m0Var.a.getCurrentBrush() instanceof f)) {
                            m0Var.A = m0Var.a.getCurrentBrush();
                            m0Var.a.g((m) yh.k(1, m.a));
                        }
                    }
                    m0Var.m[m0Var.n] = h1Var;
                    if (m0Var.a.getPainting() == null || !m0Var.a.getPainting().G) {
                        f10 = a12;
                        if (System.currentTimeMillis() - m0Var.d > 3000) {
                            m0Var.s.c();
                            d1 painting4 = m0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new y0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((m0Var.a.getCurrentBrush() instanceof f) || (m0Var.a.getCurrentBrush() instanceof c)) {
                            z1 z1Var = m0Var.s;
                            boolean z11 = f10 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (z1Var) {
                                z1Var.b.add(new w1(d14, d15));
                                z10 = z1Var.b.size() >= 8;
                            }
                            if (z10) {
                                DispatchQueue dispatchQueue = z1.m;
                                t1 t1Var = z1Var.l;
                                AtomicBoolean atomicBoolean = z1Var.k;
                                if (!z1Var.j.get()) {
                                    if (atomicBoolean.get() && !z1Var.d && z11) {
                                        dispatchQueue.cancelRunnable(t1Var);
                                        dispatchQueue.postRunnable(t1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(t1Var, 150L);
                                        i10 = m0Var.n + r42;
                                        m0Var.n = i10;
                                        m0Var.o += r42;
                                        if (i10 != 3) {
                                            h1[] h1VarArr = m0Var.m;
                                            h1 h1Var4 = h1VarArr[2];
                                            double d19 = h1Var4.b;
                                            h1 h1Var5 = h1VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - h1Var5.b, h1Var4.a - h1Var5.a);
                                            if (m0Var.j) {
                                                float a13 = k7.n.a(f10 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = m0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f11 = scaleX;
                                                    m0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), kh.a2.a(d23, d22, Math.cos(d21) * d20));
                                                    m0Var.c(m0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                m0Var.k = atan2;
                                                m0Var.j = r42;
                                            }
                                            f11 = scaleX;
                                            m0Var.c(m0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f11 = scaleX;
                                        }
                                        m0Var.g = h1Var;
                                        if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                                            m0Var.h = h1Var;
                                        }
                                        m0Var.w = k7.n.a((currentTimeMillis / 75.0f) + m0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f10 = a12;
                    }
                    r42 = 1;
                    i10 = m0Var.n + r42;
                    m0Var.n = i10;
                    m0Var.o += r42;
                    if (i10 != 3) {
                    }
                    m0Var.g = h1Var;
                    if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                    }
                    m0Var.w = k7.n.a((currentTimeMillis / 75.0f) + m0Var.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (m0Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = m0Var.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f29;
        h1 h1Var6 = new h1(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (m0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        n1 n1Var = this.d;
        if (n1Var == null) {
            return;
        }
        n1Var.postRunnable(new a1.e(11, this, runnable));
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

    public d1 getPainting() {
        return this.c;
    }

    public i2 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new j1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        d1 d1Var = this.c;
        float width = d1Var != null ? getWidth() / d1Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        jv0 jv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-jv0Var.a) / 2.0f, (-jv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            e2 e2Var = this.f;
            e2Var.getClass();
            Matrix matrix2 = new Matrix();
            e2Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            m0 m0Var = this.e;
            m0Var.getClass();
            Matrix matrix3 = new Matrix();
            m0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        n1 n1Var = this.d;
        d1Var.y = n5.c(n5.b(n1Var.n, n1Var.r), n5.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z4 = this.x instanceof l;
        e2 e2Var = this.f;
        if (z4) {
            e2Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = e2Var.n;
            ArrayList arrayList2 = e2Var.m;
            p1 p1Var = e2Var.a;
            if (p1Var == null || p1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            e2Var.h = new s1(l.p(o10));
            jv0 jv0Var = p1Var.getPainting().g;
            s1 s1Var = e2Var.h;
            float f10 = jv0Var.a;
            s1Var.b = f10 / 2.0f;
            float f11 = jv0Var.b;
            s1Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            s1Var.e = min;
            s1Var.d = min;
            e2Var.h.f = p1Var.getCurrentWeight();
            e2Var.h.g = AndroidUtilities.dp(32.0f);
            e2Var.h.l = f1.e(UserConfig.selectedAccount).k;
            if (e2Var.h.a.o() == 4) {
                s1 s1Var2 = e2Var.h;
                float f12 = jv0Var.a / 2.0f;
                s1Var2.d = f12;
                s1Var2.b = f12;
                s1Var2.i = f12 + 1.0f;
                float f13 = jv0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                s1Var2.c = f15;
                float f16 = f13 / 2.0f;
                s1Var2.j = f16;
                s1Var2.e = f14 * 2.0f;
                s1Var2.k = Math.abs(f15 - f16);
                a2 a2Var = new a2(e2Var, 0);
                arrayList2.add(a2Var);
                b2 b2Var = new b2(e2Var, a2Var, 0);
                arrayList2.add(b2Var);
                arrayList.add(b2Var);
                b2 b2Var2 = new b2(e2Var, a2Var, 1);
                arrayList2.add(b2Var2);
                arrayList.add(b2Var2);
            }
            if (e2Var.h.a.o() == 0) {
                arrayList2.add(new a2(e2Var, 1));
            }
            if (e2Var.h.a.o() == 2) {
                arrayList2.add(new a2(e2Var, 2));
            }
            if (e2Var.h.a.o() == 1 || e2Var.h.a.o() == 3) {
                arrayList2.add(new c2(e2Var, e2Var.h, false, false));
                arrayList2.add(new c2(e2Var, e2Var.h, true, false));
                arrayList2.add(new c2(e2Var, e2Var.h, false, true));
                arrayList2.add(new c2(e2Var, e2Var.h, true, true));
                arrayList2.add(new a2(e2Var, 3, false));
            }
            if (e2Var.h.a.o() == 3) {
                s1 s1Var3 = e2Var.h;
                s1Var3.i = (s1Var3.d * 0.8f) + s1Var3.b;
                s1Var3.j = (s1Var3.e * 1.2f) + s1Var3.c + s1Var3.f;
                a2 a2Var2 = new a2(e2Var, 4);
                arrayList2.add(a2Var2);
                a2Var2.b = false;
                arrayList.add(a2Var2);
            }
            e2Var.l = new a2(e2Var, 5, false);
            if (e2Var.h.a.o() != 4) {
                e2Var.l.c = false;
            }
            a2 a2Var3 = e2Var.l;
            a2Var3.b = false;
            arrayList.add(a2Var3);
            arrayList2.add(e2Var.l);
            p1Var.getPainting().k(e2Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.v = e2.c.u(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.x instanceof l) {
            e2 e2Var = this.f;
            p1 p1Var = e2Var.a;
            s1 s1Var = e2Var.h;
            if (s1Var == null || s1Var.f == p1Var.getCurrentWeight()) {
                return;
            }
            e2Var.h.f = p1Var.getCurrentWeight();
            p1Var.getPainting().k(e2Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            e2 e2Var = this.f;
            if (e2Var.h != null) {
                e2Var.a.getPainting().k(e2Var.h);
            }
        }
    }

    public void setDelegate(o1 o1Var) {
        this.a = o1Var;
    }

    public void setUndoStore(i2 i2Var) {
        this.b = i2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
