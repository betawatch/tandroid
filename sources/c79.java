// default package

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
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class c79 extends TextureView {
    public boolean E;
    public b79 a;
    public b5c b;
    public final gu7 c;
    public a79 d;
    public final yn5 e;
    public final m9a f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public m01 y;

    public c79(Context context, gu7 gu7Var, Bitmap bitmap, Bitmap bitmap2, sl0 sl0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = gu7Var;
        gu7Var.f = this;
        setSurfaceTextureListener(new y69(this, sl0Var));
        this.e = new yn5(this);
        w69 w69Var = new w69(this, (byte) 0);
        m9a m9aVar = new m9a();
        Paint paint = new Paint(1);
        m9aVar.c = paint;
        Paint paint2 = new Paint(1);
        m9aVar.d = paint2;
        Paint paint3 = new Paint(1);
        m9aVar.e = paint3;
        Paint paint4 = new Paint(1);
        m9aVar.f = paint4;
        Paint paint5 = new Paint(1);
        m9aVar.g = paint5;
        m9aVar.m = new ArrayList();
        m9aVar.n = new ArrayList();
        m9aVar.p = new float[2];
        m9aVar.a = this;
        m9aVar.b = w69Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gl.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(gl.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(gl.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{gl.L(8.0f), gl.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = m9aVar;
        gu7Var.a = new u39(this, (byte) 2);
    }

    public final void a() {
        w69 w69Var = new w69(this, (byte) 2);
        yn5 yn5Var = this.e;
        yn5Var.g = new hd8(yn5Var.a.getPainting().g.a, 0.0d, 1.0d);
        yn5Var.l = true;
        yn5Var.a(new i01(), false, w69Var);
    }

    public final void b() {
        c79 c79Var;
        m9a m9aVar = this.f;
        if (m9aVar == null || (c79Var = m9aVar.a) == null || c79Var.getPainting() == null || m9aVar.h == null) {
            return;
        }
        gu7 painting = c79Var.getPainting();
        painting.f.f(new du7(painting, (byte) 0));
        m9aVar.m.clear();
        m9aVar.n.clear();
        m9aVar.h = null;
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof l01) {
            this.f.e();
        }
        a79 a79Var = this.d;
        if (a79Var == null || !a79Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            a79Var.postRunnable(new hw6(a79Var, z, z2, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            Paint paint = m9aVar.c;
            ArrayList arrayList = m9aVar.m;
            c79 c79Var = m9aVar.a;
            if (c79Var == null || c79Var.getPainting() == null) {
                return;
            }
            via viaVar = c79Var.getPainting().g;
            for (int i = 0; i < arrayList.size(); i++) {
                l9a l9aVar = (l9a) arrayList.get(i);
                if (l9aVar.c && !l9aVar.b) {
                    m9aVar.b(canvas, viaVar, l9aVar);
                }
            }
            d9a d9aVar = m9aVar.h;
            if (d9aVar != null && d9aVar.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r0.h) / 3.141592653589793d) * 180.0d), (m9aVar.h.b / viaVar.a) * canvas.getWidth(), (m9aVar.h.c / viaVar.b) * canvas.getHeight());
            }
            d9a d9aVar2 = m9aVar.h;
            if (d9aVar2 == null || d9aVar2.a.n() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (m9aVar.h.b / viaVar.a), canvas.getHeight() * (m9aVar.h.c / viaVar.b), canvas.getWidth() * (m9aVar.h.i / viaVar.a), canvas.getHeight() * (m9aVar.h.j / viaVar.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (m9aVar.h.d / viaVar.a), canvas2.getHeight() * (m9aVar.h.e / viaVar.b), canvas2.getWidth() * (m9aVar.h.i / viaVar.a), canvas2.getHeight() * (m9aVar.h.j / viaVar.b), paint);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                l9a l9aVar2 = (l9a) arrayList.get(i2);
                if (l9aVar2.c && l9aVar2.b) {
                    m9aVar.b(canvas2, viaVar, l9aVar2);
                }
            }
            d9a d9aVar3 = m9aVar.h;
            if (d9aVar3 == null || d9aVar3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x024e, code lost:
    
        if (((r7 - java.lang.Math.min(r0.d, r0.e)) - (r1.h.f / 2.0f)) >= gl.L(30.0f)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        if (r5 < gl.L(r34)) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        a79 a79Var;
        boolean z;
        boolean z2;
        ?? r5;
        int i;
        byte b;
        float f;
        float f2;
        float f3;
        float sqrt;
        int i2;
        int i3 = 1;
        if (motionEvent.getPointerCount() > 1 || (a79Var = this.d) == null || !a79Var.f || !a79Var.h) {
            return;
        }
        l9a l9aVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            getScaleX();
            ArrayList arrayList = m9aVar.n;
            ArrayList arrayList2 = m9aVar.m;
            w69 w69Var = m9aVar.b;
            float[] fArr = m9aVar.p;
            c79 c79Var = m9aVar.a;
            if (c79Var == null || c79Var.getPainting() == null || m9aVar.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float height = c79Var.getHeight() - motionEvent.getY();
            fArr[0] = x;
            fArr[1] = height;
            m9aVar.o.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            w69Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        m9aVar.k = null;
                        return;
                    }
                    return;
                }
                l9a l9aVar2 = m9aVar.k;
                if (l9aVar2 == null) {
                    i9a i9aVar = m9aVar.l;
                    if (i9aVar != null) {
                        if (i9aVar.b) {
                            m9aVar.c(f4, f5, false);
                        }
                        float f6 = fArr[0] + m9aVar.i;
                        i9a i9aVar2 = m9aVar.l;
                        float f7 = f6 - i9aVar2.d;
                        float f8 = (fArr[1] + m9aVar.j) - i9aVar2.e;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            l9a l9aVar3 = (l9a) arrayList.get(i4);
                            l9aVar3.b(l9aVar3.d + f7, l9aVar3.e + f8);
                        }
                    }
                } else {
                    if (l9aVar2.b) {
                        m9aVar.d(false);
                    }
                    m9aVar.k.b(fArr[0] + m9aVar.i, fArr[1] + m9aVar.j);
                }
                c79Var.getPainting().k(m9aVar.h);
                w69Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                l9a l9aVar4 = (l9a) arrayList2.get(i5);
                if (l9aVar4.c) {
                    fArr[0] = f4;
                    fArr[i3] = f5;
                    if (l9aVar4.b) {
                        m9aVar.c(f4, f5, false);
                    }
                    double a = loe.a(l9aVar4.d, l9aVar4.e, fArr[0], fArr[i3]);
                    i2 = i3;
                    if (a < gl.L(40.0f) && (l9aVar == null || a < d)) {
                        l9aVar = l9aVar4;
                        d = a;
                    }
                } else {
                    i2 = i3;
                }
                i5++;
                i3 = i2;
            }
            int i6 = i3;
            fArr[0] = f4;
            fArr[i6] = f5;
            m9aVar.c(f4, f5, false);
            if (l9aVar == null) {
                d9a d9aVar = m9aVar.h;
                if (d9aVar != null) {
                    if (d9aVar.a.n() == 0 || m9aVar.h.a.n() == 2) {
                        f = f4;
                        f2 = f5;
                        double sqrt2 = Math.sqrt(Math.pow(f2 - m9aVar.h.c, 2.0d) + Math.pow(f - m9aVar.h.b, 2.0d));
                        d9a d9aVar2 = m9aVar.h;
                    } else if (m9aVar.h.a.n() == i6 || m9aVar.h.a.n() == 3) {
                        d9a d9aVar3 = m9aVar.h;
                        float f9 = d9aVar3.b;
                        float f10 = d9aVar3.d;
                        float f11 = d9aVar3.f / 2.0f;
                        float f12 = (f9 - f10) - f11;
                        float f13 = d9aVar3.c;
                        float f14 = d9aVar3.e;
                        float f15 = (f13 - f14) - f11;
                        float f16 = f9 + f10 + f11;
                        float f17 = f13 + f14 + f11;
                        if (f5 > f15 && f5 < f17) {
                            if (f4 < f12) {
                                sqrt = f12 - f4;
                            } else {
                                if (f4 > f16) {
                                    sqrt = f4 - f16;
                                }
                                f3 = 30.0f;
                                sqrt = 0.0f;
                            }
                            f3 = 30.0f;
                        } else if (f4 >= f12 || f4 <= f16) {
                            double d2 = f4 - f12;
                            f3 = 30.0f;
                            double d3 = f5 - f15;
                            double d4 = f4 - f16;
                            double d5 = f5 - f17;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d), Math.pow(d3, 2.0d) + Math.pow(d4, 2.0d)), Math.min(Math.pow(d2, 2.0d) + Math.pow(d5, 2.0d), Math.pow(d5, 2.0d) + Math.pow(d4, 2.0d))));
                        } else {
                            if (f5 < f15) {
                                sqrt = f15 - f5;
                            } else {
                                if (f5 > f17) {
                                    sqrt = f5 - f17;
                                }
                                f3 = 30.0f;
                                sqrt = 0.0f;
                            }
                            f3 = 30.0f;
                        }
                        if (m9aVar.h.a.n() == 3) {
                            d9a d9aVar4 = m9aVar.h;
                            f = f4;
                            f2 = f5;
                            sqrt = Math.min(sqrt, m9a.a(f4, f5, d9aVar4.b, d9aVar4.c, d9aVar4.i, d9aVar4.j));
                        } else {
                            f = f4;
                            f2 = f5;
                        }
                    } else if (m9aVar.h.a.n() == 4) {
                        via viaVar = c79Var.getPainting().g;
                        d9a d9aVar5 = m9aVar.h;
                        float a2 = m9a.a(f4, f5, d9aVar5.b, d9aVar5.c, d9aVar5.i, d9aVar5.j);
                        d9a d9aVar6 = m9aVar.h;
                        if (Math.min(a2, m9a.a(f4, f5, d9aVar6.d, d9aVar6.e, d9aVar6.i, d9aVar6.j)) - (m9aVar.h.f / 2.0f) < Math.min(viaVar.a, viaVar.b) * 0.1f) {
                            f = f4;
                            f2 = f5;
                        }
                    }
                }
                m9aVar.e();
                return;
            }
            f = f4;
            f2 = f5;
            fArr[0] = f;
            fArr[1] = f2;
            m9aVar.k = l9aVar;
            if (l9aVar != null) {
                if (l9aVar.b) {
                    m9aVar.c(f, f2, false);
                }
                l9a l9aVar5 = m9aVar.k;
                m9aVar.i = l9aVar5.d - fArr[0];
                m9aVar.j = l9aVar5.e - fArr[1];
                return;
            }
            i9a i9aVar3 = m9aVar.l;
            if (i9aVar3 != null) {
                if (i9aVar3.b) {
                    m9aVar.c(f, f2, false);
                }
                i9a i9aVar4 = m9aVar.l;
                m9aVar.i = i9aVar4.d - fArr[0];
                m9aVar.j = i9aVar4.e - fArr[1];
                return;
            }
            return;
        }
        final yn5 yn5Var = this.e;
        float scaleX = getScaleX();
        if (yn5Var.x != null || yn5Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float height2 = yn5Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = yn5Var.u;
        fArr2[0] = x2;
        fArr2[1] = height2;
        yn5Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - yn5Var.v;
        yn5Var.w = moe.a(yn5Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (yn5Var.a.getCurrentBrush() != null && (yn5Var.a.getCurrentBrush() instanceof f01)) {
            yn5Var.w = 1.0f - yn5Var.w;
        }
        yn5Var.v = System.currentTimeMillis();
        float f18 = yn5Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f18 = Math.max(0.1f, yn5.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z = true;
                if (yn5Var.a.getCurrentBrush() != null) {
                    f18 = (gl.R1(yn5Var.a.getCurrentBrush().i(), 1.0f, moe.a(yn5Var.o / 16.0f, 0.0f, 1.0f)) * (f18 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = yn5Var.u;
                double d6 = fArr3[0];
                double d7 = fArr3[1];
                double d8 = f18;
                hd8 hd8Var = new hd8(d6, d7, d8);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (yn5Var.z) {
                            yn5Var.z = false;
                            return;
                        }
                        yn5Var.l = false;
                        yn5Var.s.c();
                        gl.r(yn5Var.y);
                        gu7 painting = yn5Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!yn5Var.e) {
                                b79 b79Var = yn5Var.a.a;
                                if (b79Var == null || b79Var.x()) {
                                    hd8Var.d = true;
                                    dy7 dy7Var = new dy7();
                                    Vector vector = new Vector();
                                    dy7Var.b = vector;
                                    vector.add(hd8Var);
                                    yn5Var.b(dy7Var);
                                }
                                yn5Var.n = 0;
                            } else if (yn5Var.n > 0) {
                                yn5Var.c(true, yn5Var.a.getCurrentBrush().i());
                                if (yn5Var.a.getCurrentBrush() instanceof f01) {
                                    final float f19 = yn5Var.k;
                                    final hd8 hd8Var2 = yn5Var.m[yn5Var.n - 1];
                                    hd8 hd8Var3 = yn5Var.h;
                                    double d9 = hd8Var3 == null ? d8 : hd8Var3.c;
                                    final float currentWeight = yn5Var.a.getCurrentWeight() * ((float) d9) * 12.0f;
                                    ValueAnimator valueAnimator = yn5Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    yn5Var.r = ofFloat;
                                    final double d10 = d9;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: un5
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            yn5 yn5Var2 = yn5.this;
                                            yn5Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d11 = f19;
                                            double cos = Math.cos(d11 - 2.5918139392115793d);
                                            double sin = Math.sin(d11 - 2.748893571891069d);
                                            hd8 hd8Var4 = hd8Var2;
                                            double d12 = hd8Var4.a;
                                            double d13 = currentWeight;
                                            double d14 = cos * d13;
                                            float[] fArr5 = fArr4;
                                            double d15 = fArr5[0];
                                            double d16 = (d14 * d15) + d12;
                                            double d17 = hd8Var4.b;
                                            double d18 = sin * d13;
                                            double d19 = (d15 * d18) + d17;
                                            double d20 = d10;
                                            double d21 = floatValue;
                                            yn5Var2.b(new dy7(new hd8[]{new hd8(d16, d19, d20), new hd8((d14 * d21) + d12, (d18 * d21) + d17, d20, 0)}));
                                            double cos2 = Math.cos(d11 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d11 + 2.748893571891069d);
                                            double d22 = hd8Var4.a;
                                            double d23 = cos2 * d13;
                                            double d24 = fArr5[0];
                                            double d25 = sin2 * d13;
                                            yn5Var2.b(new dy7(new hd8[]{new hd8((d23 * d24) + d22, (d24 * d25) + d17, d20), new hd8((d23 * d21) + d22, (d25 * d21) + d17, d20, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                pw0.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    yn5Var.r.addListener(new v85(yn5Var, (byte) 3));
                                    yn5Var.r.setDuration(240L);
                                    yn5Var.r.setInterpolator(s33.h);
                                    yn5Var.r.start();
                                }
                            }
                            yn5Var.a.getPainting().c(null, yn5Var.a.getCurrentColor(), true, new vn5(yn5Var, objArr3 == true ? 1 : 0));
                        } else {
                            ValueAnimator valueAnimator2 = painting.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            painting.L = ofFloat2;
                            byte b2 = 1;
                            ofFloat2.addUpdateListener(new bu7(painting, b2));
                            painting.L.addListener(new fu7(painting, b2));
                            painting.L.setInterpolator(s33.h);
                            painting.L.setDuration(350L);
                            painting.L.start();
                            pw0.n.a();
                        }
                        yn5Var.n = 0;
                        yn5Var.o = 0;
                        yn5Var.j = false;
                        yn5Var.b = false;
                        yn5Var.p = 0.0d;
                        yn5Var.q = 0.0d;
                        b79 b79Var2 = yn5Var.a.a;
                        if (b79Var2 != null) {
                            b79Var2.P();
                            return;
                        }
                        return;
                    }
                    if (actionMasked2 != 2) {
                        if (actionMasked2 == 3) {
                            if (yn5Var.z) {
                                yn5Var.z = false;
                                return;
                            }
                            yn5Var.l = false;
                            yn5Var.s.c();
                            gu7 painting2 = yn5Var.a.getPainting();
                            if (painting2.L != null) {
                                b = 1;
                            } else {
                                b = 1;
                                painting2.f.f(new cu7(painting2, objArr2 == true ? 1 : 0, b));
                            }
                            gl.r(yn5Var.y);
                            gu7 painting3 = yn5Var.a.getPainting();
                            painting3.f.f(new du7(painting3, b));
                            yn5Var.n = 0;
                            yn5Var.o = 0;
                            yn5Var.j = false;
                            yn5Var.b = false;
                            yn5Var.p = 0.0d;
                            yn5Var.q = 0.0d;
                            m01 m01Var = yn5Var.A;
                            if (m01Var != null) {
                                yn5Var.a.g(m01Var);
                                yn5Var.A = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (yn5Var.z) {
                    if (!yn5Var.b) {
                        yn5Var.b = true;
                        yn5Var.e = false;
                        yn5Var.c = true;
                        yn5Var.g = hd8Var;
                        yn5Var.d = System.currentTimeMillis();
                        yn5Var.m[0] = hd8Var;
                        yn5Var.n = 1;
                        yn5Var.o = 1;
                        yn5Var.j = false;
                        yn5Var.f = true;
                        yn5Var.l = true;
                        gl.d3(yn5Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a3 = hd8Var.a(yn5Var.g);
                    if (a3 >= gl.L(5.0f) / scaleX) {
                        if (yn5Var.l && (a3 > gl.L(6.0f) / scaleX || yn5Var.n > 4)) {
                            yn5Var.l = false;
                            gl.r(yn5Var.y);
                        }
                        if (!yn5Var.e) {
                            b79 b79Var3 = yn5Var.a.a;
                            if (b79Var3 != null) {
                                b79Var3.T();
                            }
                            yn5Var.e = true;
                            if (z && (yn5Var.a.getCurrentBrush() instanceof k01)) {
                                yn5Var.A = yn5Var.a.getCurrentBrush();
                                yn5Var.a.g((m01) oo1.m(1, m01.a));
                            }
                        }
                        yn5Var.m[yn5Var.n] = hd8Var;
                        if (yn5Var.a.getPainting() == null || !yn5Var.a.getPainting().G) {
                            if (System.currentTimeMillis() - yn5Var.d > 3000) {
                                yn5Var.s.c();
                                gu7 painting4 = yn5Var.a.getPainting();
                                if (painting4.L == null) {
                                    painting4.f.f(new cu7(painting4, objArr == true ? 1 : 0, (byte) 1));
                                }
                            } else if ((yn5Var.a.getCurrentBrush() instanceof k01) || (yn5Var.a.getCurrentBrush() instanceof h01)) {
                                h9a h9aVar = yn5Var.s;
                                boolean z3 = a3 > ((float) gl.L(6.0f)) / scaleX;
                                synchronized (h9aVar) {
                                    h9aVar.b.add(new f9a(d6, d7));
                                    z2 = h9aVar.b.size() >= 8;
                                }
                                if (z2) {
                                    do3 do3Var = h9a.m;
                                    e9a e9aVar = h9aVar.l;
                                    AtomicBoolean atomicBoolean = h9aVar.k;
                                    if (!h9aVar.j.get()) {
                                        if (atomicBoolean.get() && !h9aVar.d && z3) {
                                            do3Var.cancelRunnable(e9aVar);
                                            do3Var.postRunnable(e9aVar, 150L);
                                        }
                                        if (!atomicBoolean.get()) {
                                            r5 = 1;
                                            atomicBoolean.set(true);
                                            do3Var.postRunnable(e9aVar, 150L);
                                            i = yn5Var.n + r5;
                                            yn5Var.n = i;
                                            yn5Var.o += r5;
                                            if (i == 3) {
                                                hd8[] hd8VarArr = yn5Var.m;
                                                hd8 hd8Var4 = hd8VarArr[2];
                                                double d11 = hd8Var4.b;
                                                hd8 hd8Var5 = hd8VarArr[r5];
                                                float atan2 = (float) Math.atan2(d11 - hd8Var5.b, hd8Var4.a - hd8Var5.a);
                                                if (yn5Var.j) {
                                                    float a4 = moe.a(a3 / (gl.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                    if (a4 > 0.4f) {
                                                        double d12 = 1.0f - a4;
                                                        double d13 = yn5Var.k;
                                                        double d14 = a4;
                                                        double d15 = atan2;
                                                        yn5Var.k = (float) Math.atan2((Math.sin(d15) * d14) + (Math.sin(d13) * d12), ug8.d(d15, d14, Math.cos(d13) * d12));
                                                    }
                                                } else {
                                                    yn5Var.k = atan2;
                                                    yn5Var.j = r5;
                                                }
                                                yn5Var.c(false, yn5Var.a.getCurrentBrush().i());
                                            }
                                            yn5Var.g = hd8Var;
                                            if (a3 > gl.L(8.0f) / scaleX) {
                                                yn5Var.h = hd8Var;
                                            }
                                            yn5Var.w = moe.a((currentTimeMillis / 75.0f) + yn5Var.w, 0.6f, 1.0f);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        r5 = 1;
                        i = yn5Var.n + r5;
                        yn5Var.n = i;
                        yn5Var.o += r5;
                        if (i == 3) {
                        }
                        yn5Var.g = hd8Var;
                        if (a3 > gl.L(8.0f) / scaleX) {
                        }
                        yn5Var.w = moe.a((currentTimeMillis / 75.0f) + yn5Var.w, 0.6f, 1.0f);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (yn5Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = yn5Var.u;
        double d62 = fArr32[0];
        double d72 = fArr32[1];
        double d82 = f18;
        hd8 hd8Var6 = new hd8(d62, d72, d82);
        if (actionMasked2 != 0) {
        }
        if (yn5Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        a79 a79Var = this.d;
        if (a79Var == null) {
            return;
        }
        a79Var.postRunnable(new lw8(this, runnable, (byte) 9));
    }

    public m01 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public gu7 getPainting() {
        return this.c;
    }

    public b5c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new w69(this, (byte) 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        gu7 gu7Var = this.c;
        float width = gu7Var != null ? getWidth() / gu7Var.g.a : 1.0f;
        float f = width > 0.0f ? width : 1.0f;
        via viaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f, -f);
        matrix.preTranslate((-viaVar.a) / 2.0f, (-viaVar.b) / 2.0f);
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            m9aVar.getClass();
            Matrix matrix2 = new Matrix();
            m9aVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            yn5 yn5Var = this.e;
            yn5Var.getClass();
            Matrix matrix3 = new Matrix();
            yn5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        a79 a79Var = this.d;
        gu7Var.y = oie.c(oie.b(a79Var.n, a79Var.r), oie.a(matrix));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBrush(m01 m01Var) {
        boolean z = this.y instanceof l01;
        m9a m9aVar = this.f;
        if (z) {
            m9aVar.e();
        }
        this.y = m01Var;
        i();
        this.c.q(this.y);
        m01 m01Var2 = this.y;
        if (m01Var2 instanceof l01) {
            int n = ((l01) m01Var2).n();
            ArrayList arrayList = m9aVar.n;
            ArrayList arrayList2 = m9aVar.m;
            c79 c79Var = m9aVar.a;
            if (c79Var == null || c79Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            m9aVar.h = new d9a(l01.o(n));
            via viaVar = c79Var.getPainting().g;
            d9a d9aVar = m9aVar.h;
            float f = viaVar.a;
            d9aVar.b = f / 2.0f;
            float f2 = viaVar.b;
            d9aVar.c = f2 / 2.0f;
            float min = Math.min(f, f2) / 5.0f;
            d9aVar.e = min;
            d9aVar.d = min;
            m9aVar.h.f = c79Var.getCurrentWeight();
            m9aVar.h.g = gl.L(32.0f);
            m9aVar.h.l = k38.e(y6c.t0).k;
            byte b = 4;
            byte b2 = 1;
            byte b3 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (m9aVar.h.a.n() == 4) {
                d9a d9aVar2 = m9aVar.h;
                float f3 = viaVar.a / 2.0f;
                d9aVar2.d = f3;
                d9aVar2.b = f3;
                d9aVar2.i = f3 + 1.0f;
                float f4 = viaVar.b;
                float f5 = f4 / 3.0f;
                float f6 = 1.0f * f5;
                d9aVar2.c = f6;
                float f7 = f4 / 2.0f;
                d9aVar2.j = f7;
                d9aVar2.e = f5 * 2.0f;
                d9aVar2.k = Math.abs(f6 - f7);
                i9a i9aVar = new i9a(m9aVar, b3);
                arrayList2.add(i9aVar);
                j9a j9aVar = new j9a(m9aVar, i9aVar, objArr3 == true ? 1 : 0);
                arrayList2.add(j9aVar);
                arrayList.add(j9aVar);
                j9a j9aVar2 = new j9a(m9aVar, i9aVar, b2);
                arrayList2.add(j9aVar2);
                arrayList.add(j9aVar2);
            }
            if (m9aVar.h.a.n() == 0) {
                arrayList2.add(new i9a(m9aVar, b2));
            }
            byte b4 = 2;
            if (m9aVar.h.a.n() == 2) {
                arrayList2.add(new i9a(m9aVar, b4));
            }
            byte b5 = 3;
            if (m9aVar.h.a.n() == 1 || m9aVar.h.a.n() == 3) {
                arrayList2.add(new k9a(m9aVar, m9aVar.h, false, false));
                arrayList2.add(new k9a(m9aVar, m9aVar.h, true, false));
                arrayList2.add(new k9a(m9aVar, m9aVar.h, false, true));
                arrayList2.add(new k9a(m9aVar, m9aVar.h, true, true));
                arrayList2.add(new i9a(m9aVar, b5, objArr == true ? 1 : 0));
            }
            if (m9aVar.h.a.n() == 3) {
                d9a d9aVar3 = m9aVar.h;
                d9aVar3.i = (d9aVar3.d * 0.8f) + d9aVar3.b;
                d9aVar3.j = (d9aVar3.e * 1.2f) + d9aVar3.c + d9aVar3.f;
                i9a i9aVar2 = new i9a(m9aVar, b);
                arrayList2.add(i9aVar2);
                i9aVar2.b = false;
                arrayList.add(i9aVar2);
            }
            m9aVar.l = new i9a(m9aVar, (byte) 5, objArr2 == true ? 1 : 0);
            if (m9aVar.h.a.n() != 4) {
                m9aVar.l.c = false;
            }
            i9a i9aVar3 = m9aVar.l;
            i9aVar3.b = false;
            arrayList.add(i9aVar3);
            arrayList2.add(m9aVar.l);
            c79Var.getPainting().k(m9aVar.h);
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = b00.w(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            c79 c79Var = m9aVar.a;
            d9a d9aVar = m9aVar.h;
            if (d9aVar == null || d9aVar.f == c79Var.getCurrentWeight()) {
                return;
            }
            m9aVar.h.f = c79Var.getCurrentWeight();
            c79Var.getPainting().k(m9aVar.h);
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof l01) {
            m9a m9aVar = this.f;
            if (m9aVar.h != null) {
                m9aVar.a.getPainting().k(m9aVar.h);
            }
        }
    }

    public void setDelegate(b79 b79Var) {
        this.a = b79Var;
    }

    public void setUndoStore(b5c b5cVar) {
        this.b = b5cVar;
    }

    public void g(m01 m01Var) {
    }

    public void setQueue(do3 do3Var) {
    }
}
