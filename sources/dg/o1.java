package dg;

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
import j7.z6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class o1 extends TextureView {
    public n1 a;
    public h2 b;
    public final c1 c;
    public m1 d;
    public final m0 e;
    public final d2 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public o1(Context context, c1 c1Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = c1Var;
        c1Var.f = this;
        setSurfaceTextureListener(new k1(this, baVar));
        this.e = new m0(this);
        i1 i1Var = new i1(this, 0);
        d2 d2Var = new d2();
        Paint paint = new Paint(1);
        d2Var.c = paint;
        Paint paint2 = new Paint(1);
        d2Var.d = paint2;
        Paint paint3 = new Paint(1);
        d2Var.e = paint3;
        Paint paint4 = new Paint(1);
        d2Var.f = paint4;
        Paint paint5 = new Paint(1);
        d2Var.g = paint5;
        d2Var.m = new ArrayList();
        d2Var.n = new ArrayList();
        d2Var.p = new float[2];
        d2Var.a = this;
        d2Var.b = i1Var;
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
        this.f = d2Var;
        c1Var.a = new o5.i(this, 9);
    }

    public final void a() {
        i1 i1Var = new i1(this, 2);
        m0 m0Var = this.e;
        m0Var.g = new g1(m0Var.a.getPainting().g.a, 0.0d, 1.0d);
        m0Var.l = true;
        m0Var.a(new d(), false, i1Var);
    }

    public final void b() {
        o1 o1Var;
        d2 d2Var = this.f;
        if (d2Var == null || (o1Var = d2Var.a) == null || o1Var.getPainting() == null || d2Var.h == null) {
            return;
        }
        c1 painting = o1Var.getPainting();
        painting.f.f(new y0(painting, 0));
        d2Var.m.clear();
        d2Var.n.clear();
        d2Var.h = null;
    }

    public final Bitmap c(boolean z4, boolean z10) {
        if (this.x instanceof l) {
            this.f.e();
        }
        m1 m1Var = this.d;
        if (m1Var == null || !m1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            m1Var.postRunnable(new w0(m1Var, z4, z10, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            d2 d2Var = this.f;
            Paint paint = d2Var.c;
            ArrayList arrayList = d2Var.m;
            o1 o1Var = d2Var.a;
            if (o1Var == null || o1Var.getPainting() == null) {
                return;
            }
            kv0 kv0Var = o1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                c2 c2Var = (c2) arrayList.get(i10);
                if (c2Var.c && !c2Var.b) {
                    d2Var.b(canvas, kv0Var, c2Var);
                }
            }
            r1 r1Var = d2Var.h;
            if (r1Var != null && r1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (d2Var.h.b / kv0Var.a) * canvas.getWidth(), (d2Var.h.c / kv0Var.b) * canvas.getHeight());
            }
            r1 r1Var2 = d2Var.h;
            if (r1Var2 == null || r1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (d2Var.h.b / kv0Var.a), canvas.getHeight() * (d2Var.h.c / kv0Var.b), canvas.getWidth() * (d2Var.h.i / kv0Var.a), canvas.getHeight() * (d2Var.h.j / kv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (d2Var.h.d / kv0Var.a), canvas2.getHeight() * (d2Var.h.e / kv0Var.b), canvas2.getWidth() * (d2Var.h.i / kv0Var.a), canvas2.getHeight() * (d2Var.h.j / kv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                c2 c2Var2 = (c2) arrayList.get(i11);
                if (c2Var2.c && c2Var2.b) {
                    d2Var.b(canvas2, kv0Var, c2Var2);
                }
            }
            r1 r1Var3 = d2Var.h;
            if (r1Var3 == null || r1Var3.h == 0.0f) {
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
        m1 m1Var;
        boolean z4;
        float f10;
        boolean z10;
        ?? r42;
        int i10;
        float f11;
        ?? r72;
        n1 n1Var;
        int i11;
        float f12;
        float f13;
        float f14;
        float sqrt;
        char c3 = 1;
        if (motionEvent.getPointerCount() > 1 || (m1Var = this.d) == null || !m1Var.f || !m1Var.h) {
            return;
        }
        c2 c2Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            d2 d2Var = this.f;
            getScaleX();
            ArrayList arrayList = d2Var.n;
            ArrayList arrayList2 = d2Var.m;
            i1 i1Var = d2Var.b;
            float[] fArr = d2Var.p;
            o1 o1Var = d2Var.a;
            if (o1Var == null || o1Var.getPainting() == null || d2Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = o1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            d2Var.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            i1Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        d2Var.k = null;
                        return;
                    }
                    return;
                }
                c2 c2Var2 = d2Var.k;
                if (c2Var2 == null) {
                    z1 z1Var = d2Var.l;
                    if (z1Var != null) {
                        if (z1Var.b) {
                            d2Var.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + d2Var.i;
                        z1 z1Var2 = d2Var.l;
                        float f18 = f17 - z1Var2.d;
                        float f19 = (fArr[1] + d2Var.j) - z1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            c2 c2Var3 = (c2) arrayList.get(i12);
                            c2Var3.b(c2Var3.d + f18, c2Var3.e + f19);
                        }
                    }
                } else {
                    if (c2Var2.b) {
                        d2Var.d(false);
                    }
                    d2Var.k.b(fArr[0] + d2Var.i, fArr[1] + d2Var.j);
                }
                o1Var.getPainting().k(d2Var.h);
                i1Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                c2 c2Var4 = (c2) arrayList2.get(i13);
                if (c2Var4.c) {
                    fArr[r92] = f15;
                    fArr[c3] = f16;
                    if (c2Var4.b) {
                        d2Var.c(f15, f16, r92);
                    }
                    double a2 = o6.a(c2Var4.d, c2Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (c2Var == null || a2 < d)) {
                        c2Var = c2Var4;
                        d = a2;
                    }
                }
                i13++;
                c3 = 1;
                r92 = 0;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            d2Var.c(f15, f16, false);
            if (c2Var == null) {
                r1 r1Var = d2Var.h;
                if (r1Var != null) {
                    if (r1Var.a.o() == 0 || d2Var.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - d2Var.h.c, 2.0d) + Math.pow(f13 - d2Var.h.b, 2.0d));
                        r1 r1Var2 = d2Var.h;
                    } else if (d2Var.h.a.o() == 1 || d2Var.h.a.o() == 3) {
                        r1 r1Var3 = d2Var.h;
                        float f20 = r1Var3.b;
                        float f21 = r1Var3.d;
                        float f22 = r1Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = r1Var3.c;
                        float f25 = r1Var3.e;
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
                            if (d2Var.h.a.o() == 3) {
                            }
                        } else if (f15 >= f23 || f15 <= f27) {
                            double d10 = f15 - f23;
                            f14 = 30.0f;
                            double d11 = f16 - f26;
                            double d12 = f15 - f27;
                            double d13 = f16 - f28;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (d2Var.h.a.o() == 3) {
                                r1 r1Var4 = d2Var.h;
                                float a10 = d2.a(f15, f16, r1Var4.b, r1Var4.c, r1Var4.i, r1Var4.j);
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
                            if (d2Var.h.a.o() == 3) {
                            }
                        }
                    } else if (d2Var.h.a.o() == 4) {
                        kv0 kv0Var = o1Var.getPainting().g;
                        r1 r1Var5 = d2Var.h;
                        float a11 = d2.a(f15, f16, r1Var5.b, r1Var5.c, r1Var5.i, r1Var5.j);
                        r1 r1Var6 = d2Var.h;
                        if (Math.min(a11, d2.a(f15, f16, r1Var6.d, r1Var6.e, r1Var6.i, r1Var6.j)) - (d2Var.h.f / 2.0f) < Math.min(kv0Var.a, kv0Var.b) * 0.1f) {
                            f13 = f15;
                            f12 = f16;
                        }
                    }
                }
                d2Var.e();
                return;
            }
            f12 = f16;
            f13 = f15;
            fArr[0] = f13;
            fArr[1] = f12;
            d2Var.k = c2Var;
            if (c2Var != null) {
                if (c2Var.b) {
                    d2Var.c(f13, f12, false);
                }
                c2 c2Var5 = d2Var.k;
                d2Var.i = c2Var5.d - fArr[0];
                d2Var.j = c2Var5.e - fArr[1];
                return;
            }
            z1 z1Var3 = d2Var.l;
            if (z1Var3 != null) {
                if (z1Var3.b) {
                    d2Var.c(f13, f12, false);
                }
                z1 z1Var4 = d2Var.l;
                d2Var.i = z1Var4.d - fArr[0];
                d2Var.j = z1Var4.e - fArr[1];
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
        m0Var.w = k7.o.a(m0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
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
                    f29 = (AndroidUtilities.lerp(m0Var.a.getCurrentBrush().j(), 1.0f, k7.o.a(m0Var.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = m0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f29;
                g1 g1Var = new g1(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (m0Var.z) {
                            m0Var.z = false;
                            return;
                        }
                        m0Var.l = false;
                        m0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                        c1 painting = m0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!m0Var.e) {
                                n1 n1Var2 = m0Var.a.a;
                                if (n1Var2 == null || n1Var2.d()) {
                                    g1Var.d = true;
                                    d1 d1Var = new d1();
                                    Vector vector = new Vector();
                                    d1Var.b = vector;
                                    vector.add(g1Var);
                                    m0Var.b(d1Var);
                                }
                                m0Var.n = 0;
                            } else if (m0Var.n > 0) {
                                m0Var.c(m0Var.a.getCurrentBrush().j(), true);
                                if (m0Var.a.getCurrentBrush() instanceof a) {
                                    final float f30 = m0Var.k;
                                    final g1 g1Var2 = m0Var.m[m0Var.n - 1];
                                    g1 g1Var3 = m0Var.h;
                                    double d17 = g1Var3 == null ? d16 : g1Var3.c;
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
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dg.f0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            m0 m0Var2 = m0.this;
                                            m0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f30;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            g1 g1Var4 = g1Var2;
                                            double d20 = g1Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = g1Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            m0Var2.b(new d1(new g1[]{new g1(d24, d27, d28), new g1((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = g1Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            m0Var2.b(new d1(new g1[]{new g1((d31 * d32) + d30, (d32 * d33) + d25, d28), new g1((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
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
                                    m0Var.r.setInterpolator(pr.h);
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
                            n1Var = m0Var.a.a;
                            if (n1Var == null) {
                                n1Var.e();
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
                        ofFloat2.addUpdateListener(new v0(painting, i14));
                        painting.L.addListener(new b1(painting, i14));
                        painting.L.setInterpolator(pr.h);
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
                        n1Var = m0Var.a.a;
                        if (n1Var == null) {
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
                        c1 painting2 = m0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new x0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                        c1 painting3 = m0Var.a.getPainting();
                        painting3.f.f(new y0(painting3, i11));
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
                        m0Var.g = g1Var;
                        m0Var.d = System.currentTimeMillis();
                        m0Var.m[0] = g1Var;
                        m0Var.n = 1;
                        m0Var.o = 1;
                        m0Var.j = false;
                        m0Var.f = true;
                        m0Var.l = true;
                        AndroidUtilities.runOnUIThread(m0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = g1Var.a(m0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (m0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || m0Var.n > 4)) {
                        m0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(m0Var.y);
                    }
                    if (!m0Var.e) {
                        n1 n1Var3 = m0Var.a.a;
                        if (n1Var3 != null) {
                            n1Var3.f();
                        }
                        m0Var.e = true;
                        if (z4 && (m0Var.a.getCurrentBrush() instanceof f)) {
                            m0Var.A = m0Var.a.getCurrentBrush();
                            m0Var.a.g((m) yh.j(1, m.a));
                        }
                    }
                    m0Var.m[m0Var.n] = g1Var;
                    if (m0Var.a.getPainting() == null || !m0Var.a.getPainting().G) {
                        f10 = a12;
                        if (System.currentTimeMillis() - m0Var.d > 3000) {
                            m0Var.s.c();
                            c1 painting4 = m0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new x0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((m0Var.a.getCurrentBrush() instanceof f) || (m0Var.a.getCurrentBrush() instanceof c)) {
                            y1 y1Var = m0Var.s;
                            boolean z11 = f10 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (y1Var) {
                                y1Var.b.add(new v1(d14, d15));
                                z10 = y1Var.b.size() >= 8;
                            }
                            if (z10) {
                                DispatchQueue dispatchQueue = y1.m;
                                s1 s1Var = y1Var.l;
                                AtomicBoolean atomicBoolean = y1Var.k;
                                if (!y1Var.j.get()) {
                                    if (atomicBoolean.get() && !y1Var.d && z11) {
                                        dispatchQueue.cancelRunnable(s1Var);
                                        dispatchQueue.postRunnable(s1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(s1Var, 150L);
                                        i10 = m0Var.n + r42;
                                        m0Var.n = i10;
                                        m0Var.o += r42;
                                        if (i10 != 3) {
                                            g1[] g1VarArr = m0Var.m;
                                            g1 g1Var4 = g1VarArr[2];
                                            double d19 = g1Var4.b;
                                            g1 g1Var5 = g1VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - g1Var5.b, g1Var4.a - g1Var5.a);
                                            if (m0Var.j) {
                                                float a13 = k7.o.a(f10 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = m0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f11 = scaleX;
                                                    m0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), l.d.a(d23, d22, Math.cos(d21) * d20));
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
                                        m0Var.g = g1Var;
                                        if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                                            m0Var.h = g1Var;
                                        }
                                        m0Var.w = k7.o.a((currentTimeMillis / 75.0f) + m0Var.w, 0.6f, 1.0f);
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
                    m0Var.g = g1Var;
                    if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                    }
                    m0Var.w = k7.o.a((currentTimeMillis / 75.0f) + m0Var.w, 0.6f, 1.0f);
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
        g1 g1Var6 = new g1(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (m0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        m1 m1Var = this.d;
        if (m1Var == null) {
            return;
        }
        m1Var.postRunnable(new a1.e(16, this, runnable));
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

    public c1 getPainting() {
        return this.c;
    }

    public h2 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new i1(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        c1 c1Var = this.c;
        float width = c1Var != null ? getWidth() / c1Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        kv0 kv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-kv0Var.a) / 2.0f, (-kv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            d2 d2Var = this.f;
            d2Var.getClass();
            Matrix matrix2 = new Matrix();
            d2Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            m0 m0Var = this.e;
            m0Var.getClass();
            Matrix matrix3 = new Matrix();
            m0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        m1 m1Var = this.d;
        c1Var.y = z6.c(z6.b(m1Var.n, m1Var.r), z6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z4 = this.x instanceof l;
        d2 d2Var = this.f;
        if (z4) {
            d2Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = d2Var.n;
            ArrayList arrayList2 = d2Var.m;
            o1 o1Var = d2Var.a;
            if (o1Var == null || o1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            d2Var.h = new r1(l.p(o10));
            kv0 kv0Var = o1Var.getPainting().g;
            r1 r1Var = d2Var.h;
            float f10 = kv0Var.a;
            r1Var.b = f10 / 2.0f;
            float f11 = kv0Var.b;
            r1Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            r1Var.e = min;
            r1Var.d = min;
            d2Var.h.f = o1Var.getCurrentWeight();
            d2Var.h.g = AndroidUtilities.dp(32.0f);
            d2Var.h.l = e1.e(UserConfig.selectedAccount).k;
            if (d2Var.h.a.o() == 4) {
                r1 r1Var2 = d2Var.h;
                float f12 = kv0Var.a / 2.0f;
                r1Var2.d = f12;
                r1Var2.b = f12;
                r1Var2.i = f12 + 1.0f;
                float f13 = kv0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                r1Var2.c = f15;
                float f16 = f13 / 2.0f;
                r1Var2.j = f16;
                r1Var2.e = f14 * 2.0f;
                r1Var2.k = Math.abs(f15 - f16);
                z1 z1Var = new z1(d2Var, 0);
                arrayList2.add(z1Var);
                a2 a2Var = new a2(d2Var, z1Var, 0);
                arrayList2.add(a2Var);
                arrayList.add(a2Var);
                a2 a2Var2 = new a2(d2Var, z1Var, 1);
                arrayList2.add(a2Var2);
                arrayList.add(a2Var2);
            }
            if (d2Var.h.a.o() == 0) {
                arrayList2.add(new z1(d2Var, 1));
            }
            if (d2Var.h.a.o() == 2) {
                arrayList2.add(new z1(d2Var, 2));
            }
            if (d2Var.h.a.o() == 1 || d2Var.h.a.o() == 3) {
                arrayList2.add(new b2(d2Var, d2Var.h, false, false));
                arrayList2.add(new b2(d2Var, d2Var.h, true, false));
                arrayList2.add(new b2(d2Var, d2Var.h, false, true));
                arrayList2.add(new b2(d2Var, d2Var.h, true, true));
                arrayList2.add(new z1(d2Var, 3, false));
            }
            if (d2Var.h.a.o() == 3) {
                r1 r1Var3 = d2Var.h;
                r1Var3.i = (r1Var3.d * 0.8f) + r1Var3.b;
                r1Var3.j = (r1Var3.e * 1.2f) + r1Var3.c + r1Var3.f;
                z1 z1Var2 = new z1(d2Var, 4);
                arrayList2.add(z1Var2);
                z1Var2.b = false;
                arrayList.add(z1Var2);
            }
            d2Var.l = new z1(d2Var, 5, false);
            if (d2Var.h.a.o() != 4) {
                d2Var.l.c = false;
            }
            z1 z1Var3 = d2Var.l;
            z1Var3.b = false;
            arrayList.add(z1Var3);
            arrayList2.add(d2Var.l);
            o1Var.getPainting().k(d2Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.v = e2.c.u(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.x instanceof l) {
            d2 d2Var = this.f;
            o1 o1Var = d2Var.a;
            r1 r1Var = d2Var.h;
            if (r1Var == null || r1Var.f == o1Var.getCurrentWeight()) {
                return;
            }
            d2Var.h.f = o1Var.getCurrentWeight();
            o1Var.getPainting().k(d2Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            d2 d2Var = this.f;
            if (d2Var.h != null) {
                d2Var.a.getPainting().k(d2Var.h);
            }
        }
    }

    public void setDelegate(n1 n1Var) {
        this.a = n1Var;
    }

    public void setUndoStore(h2 h2Var) {
        this.b = h2Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
