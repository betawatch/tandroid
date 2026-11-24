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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class e99 extends TextureView {
    public boolean E;
    public d99 a;
    public b7c b;
    public final hw7 c;
    public c99 d;
    public final yp5 e;
    public final mba f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public u11 y;

    public e99(Context context, hw7 hw7Var, Bitmap bitmap, Bitmap bitmap2, sm0 sm0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = hw7Var;
        hw7Var.f = this;
        setSurfaceTextureListener(new a99(this, sm0Var));
        this.e = new yp5(this);
        y89 y89Var = new y89(this, (byte) 0);
        mba mbaVar = new mba();
        Paint paint = new Paint(1);
        mbaVar.c = paint;
        Paint paint2 = new Paint(1);
        mbaVar.d = paint2;
        Paint paint3 = new Paint(1);
        mbaVar.e = paint3;
        Paint paint4 = new Paint(1);
        mbaVar.f = paint4;
        Paint paint5 = new Paint(1);
        mbaVar.g = paint5;
        mbaVar.m = new ArrayList();
        mbaVar.n = new ArrayList();
        mbaVar.p = new float[2];
        mbaVar.a = this;
        mbaVar.b = y89Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gm.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(gm.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(gm.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{gm.L(8.0f), gm.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = mbaVar;
        hw7Var.a = new x59(this, (byte) 2);
    }

    public final void a() {
        y89 y89Var = new y89(this, (byte) 2);
        yp5 yp5Var = this.e;
        yp5Var.g = new jf8(yp5Var.a.getPainting().g.a, 0.0d, 1.0d);
        yp5Var.l = true;
        yp5Var.a(new q11(), false, y89Var);
    }

    public final void b() {
        e99 e99Var;
        mba mbaVar = this.f;
        if (mbaVar == null || (e99Var = mbaVar.a) == null || e99Var.getPainting() == null || mbaVar.h == null) {
            return;
        }
        hw7 painting = e99Var.getPainting();
        painting.f.f(new ew7(painting, (byte) 0));
        mbaVar.m.clear();
        mbaVar.n.clear();
        mbaVar.h = null;
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof t11) {
            this.f.e();
        }
        c99 c99Var = this.d;
        if (c99Var == null || !c99Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            c99Var.postRunnable(new hy6(c99Var, z, z2, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            Paint paint = mbaVar.c;
            ArrayList arrayList = mbaVar.m;
            e99 e99Var = mbaVar.a;
            if (e99Var == null || e99Var.getPainting() == null) {
                return;
            }
            xka xkaVar = e99Var.getPainting().g;
            for (int i = 0; i < arrayList.size(); i++) {
                lba lbaVar = (lba) arrayList.get(i);
                if (lbaVar.c && !lbaVar.b) {
                    mbaVar.b(canvas, xkaVar, lbaVar);
                }
            }
            dba dbaVar = mbaVar.h;
            if (dbaVar != null && dbaVar.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r0.h) / 3.141592653589793d) * 180.0d), (mbaVar.h.b / xkaVar.a) * canvas.getWidth(), (mbaVar.h.c / xkaVar.b) * canvas.getHeight());
            }
            dba dbaVar2 = mbaVar.h;
            if (dbaVar2 == null || dbaVar2.a.n() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (mbaVar.h.b / xkaVar.a), canvas.getHeight() * (mbaVar.h.c / xkaVar.b), canvas.getWidth() * (mbaVar.h.i / xkaVar.a), canvas.getHeight() * (mbaVar.h.j / xkaVar.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (mbaVar.h.d / xkaVar.a), canvas2.getHeight() * (mbaVar.h.e / xkaVar.b), canvas2.getWidth() * (mbaVar.h.i / xkaVar.a), canvas2.getHeight() * (mbaVar.h.j / xkaVar.b), paint);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                lba lbaVar2 = (lba) arrayList.get(i2);
                if (lbaVar2.c && lbaVar2.b) {
                    mbaVar.b(canvas2, xkaVar, lbaVar2);
                }
            }
            dba dbaVar3 = mbaVar.h;
            if (dbaVar3 == null || dbaVar3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x024e, code lost:
    
        if (((r7 - java.lang.Math.min(r0.d, r0.e)) - (r1.h.f / 2.0f)) >= gm.L(30.0f)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        if (r5 < gm.L(r34)) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        c99 c99Var;
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
        if (motionEvent.getPointerCount() > 1 || (c99Var = this.d) == null || !c99Var.f || !c99Var.h) {
            return;
        }
        lba lbaVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            getScaleX();
            ArrayList arrayList = mbaVar.n;
            ArrayList arrayList2 = mbaVar.m;
            y89 y89Var = mbaVar.b;
            float[] fArr = mbaVar.p;
            e99 e99Var = mbaVar.a;
            if (e99Var == null || e99Var.getPainting() == null || mbaVar.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float height = e99Var.getHeight() - motionEvent.getY();
            fArr[0] = x;
            fArr[1] = height;
            mbaVar.o.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            y89Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        mbaVar.k = null;
                        return;
                    }
                    return;
                }
                lba lbaVar2 = mbaVar.k;
                if (lbaVar2 == null) {
                    iba ibaVar = mbaVar.l;
                    if (ibaVar != null) {
                        if (ibaVar.b) {
                            mbaVar.c(f4, f5, false);
                        }
                        float f6 = fArr[0] + mbaVar.i;
                        iba ibaVar2 = mbaVar.l;
                        float f7 = f6 - ibaVar2.d;
                        float f8 = (fArr[1] + mbaVar.j) - ibaVar2.e;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            lba lbaVar3 = (lba) arrayList.get(i4);
                            lbaVar3.b(lbaVar3.d + f7, lbaVar3.e + f8);
                        }
                    }
                } else {
                    if (lbaVar2.b) {
                        mbaVar.d(false);
                    }
                    mbaVar.k.b(fArr[0] + mbaVar.i, fArr[1] + mbaVar.j);
                }
                e99Var.getPainting().k(mbaVar.h);
                y89Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                lba lbaVar4 = (lba) arrayList2.get(i5);
                if (lbaVar4.c) {
                    fArr[0] = f4;
                    fArr[i3] = f5;
                    if (lbaVar4.b) {
                        mbaVar.c(f4, f5, false);
                    }
                    double a = oqe.a(lbaVar4.d, lbaVar4.e, fArr[0], fArr[i3]);
                    i2 = i3;
                    if (a < gm.L(40.0f) && (lbaVar == null || a < d)) {
                        lbaVar = lbaVar4;
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
            mbaVar.c(f4, f5, false);
            if (lbaVar == null) {
                dba dbaVar = mbaVar.h;
                if (dbaVar != null) {
                    if (dbaVar.a.n() == 0 || mbaVar.h.a.n() == 2) {
                        f = f4;
                        f2 = f5;
                        double sqrt2 = Math.sqrt(Math.pow(f2 - mbaVar.h.c, 2.0d) + Math.pow(f - mbaVar.h.b, 2.0d));
                        dba dbaVar2 = mbaVar.h;
                    } else if (mbaVar.h.a.n() == i6 || mbaVar.h.a.n() == 3) {
                        dba dbaVar3 = mbaVar.h;
                        float f9 = dbaVar3.b;
                        float f10 = dbaVar3.d;
                        float f11 = dbaVar3.f / 2.0f;
                        float f12 = (f9 - f10) - f11;
                        float f13 = dbaVar3.c;
                        float f14 = dbaVar3.e;
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
                        if (mbaVar.h.a.n() == 3) {
                            dba dbaVar4 = mbaVar.h;
                            f = f4;
                            f2 = f5;
                            sqrt = Math.min(sqrt, mba.a(f4, f5, dbaVar4.b, dbaVar4.c, dbaVar4.i, dbaVar4.j));
                        } else {
                            f = f4;
                            f2 = f5;
                        }
                    } else if (mbaVar.h.a.n() == 4) {
                        xka xkaVar = e99Var.getPainting().g;
                        dba dbaVar5 = mbaVar.h;
                        float a2 = mba.a(f4, f5, dbaVar5.b, dbaVar5.c, dbaVar5.i, dbaVar5.j);
                        dba dbaVar6 = mbaVar.h;
                        if (Math.min(a2, mba.a(f4, f5, dbaVar6.d, dbaVar6.e, dbaVar6.i, dbaVar6.j)) - (mbaVar.h.f / 2.0f) < Math.min(xkaVar.a, xkaVar.b) * 0.1f) {
                            f = f4;
                            f2 = f5;
                        }
                    }
                }
                mbaVar.e();
                return;
            }
            f = f4;
            f2 = f5;
            fArr[0] = f;
            fArr[1] = f2;
            mbaVar.k = lbaVar;
            if (lbaVar != null) {
                if (lbaVar.b) {
                    mbaVar.c(f, f2, false);
                }
                lba lbaVar5 = mbaVar.k;
                mbaVar.i = lbaVar5.d - fArr[0];
                mbaVar.j = lbaVar5.e - fArr[1];
                return;
            }
            iba ibaVar3 = mbaVar.l;
            if (ibaVar3 != null) {
                if (ibaVar3.b) {
                    mbaVar.c(f, f2, false);
                }
                iba ibaVar4 = mbaVar.l;
                mbaVar.i = ibaVar4.d - fArr[0];
                mbaVar.j = ibaVar4.e - fArr[1];
                return;
            }
            return;
        }
        final yp5 yp5Var = this.e;
        float scaleX = getScaleX();
        if (yp5Var.x != null || yp5Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float height2 = yp5Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = yp5Var.u;
        fArr2[0] = x2;
        fArr2[1] = height2;
        yp5Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - yp5Var.v;
        yp5Var.w = pqe.a(yp5Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (yp5Var.a.getCurrentBrush() != null && (yp5Var.a.getCurrentBrush() instanceof n11)) {
            yp5Var.w = 1.0f - yp5Var.w;
        }
        yp5Var.v = System.currentTimeMillis();
        float f18 = yp5Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f18 = Math.max(0.1f, yp5.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z = true;
                if (yp5Var.a.getCurrentBrush() != null) {
                    f18 = (gm.R1(yp5Var.a.getCurrentBrush().i(), 1.0f, pqe.a(yp5Var.o / 16.0f, 0.0f, 1.0f)) * (f18 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = yp5Var.u;
                double d6 = fArr3[0];
                double d7 = fArr3[1];
                double d8 = f18;
                jf8 jf8Var = new jf8(d6, d7, d8);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (yp5Var.z) {
                            yp5Var.z = false;
                            return;
                        }
                        yp5Var.l = false;
                        yp5Var.s.c();
                        gm.r(yp5Var.y);
                        hw7 painting = yp5Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!yp5Var.e) {
                                d99 d99Var = yp5Var.a.a;
                                if (d99Var == null || d99Var.F()) {
                                    jf8Var.d = true;
                                    f08 f08Var = new f08();
                                    Vector vector = new Vector();
                                    f08Var.b = vector;
                                    vector.add(jf8Var);
                                    yp5Var.b(f08Var);
                                }
                                yp5Var.n = 0;
                            } else if (yp5Var.n > 0) {
                                yp5Var.c(true, yp5Var.a.getCurrentBrush().i());
                                if (yp5Var.a.getCurrentBrush() instanceof n11) {
                                    final float f19 = yp5Var.k;
                                    final jf8 jf8Var2 = yp5Var.m[yp5Var.n - 1];
                                    jf8 jf8Var3 = yp5Var.h;
                                    double d9 = jf8Var3 == null ? d8 : jf8Var3.c;
                                    final float currentWeight = yp5Var.a.getCurrentWeight() * ((float) d9) * 12.0f;
                                    ValueAnimator valueAnimator = yp5Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    yp5Var.r = ofFloat;
                                    final double d10 = d9;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: up5
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            yp5 yp5Var2 = yp5.this;
                                            yp5Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d11 = f19;
                                            double cos = Math.cos(d11 - 2.5918139392115793d);
                                            double sin = Math.sin(d11 - 2.748893571891069d);
                                            jf8 jf8Var4 = jf8Var2;
                                            double d12 = jf8Var4.a;
                                            double d13 = currentWeight;
                                            double d14 = cos * d13;
                                            float[] fArr5 = fArr4;
                                            double d15 = fArr5[0];
                                            double d16 = (d14 * d15) + d12;
                                            double d17 = jf8Var4.b;
                                            double d18 = sin * d13;
                                            double d19 = (d15 * d18) + d17;
                                            double d20 = d10;
                                            double d21 = floatValue;
                                            yp5Var2.b(new f08(new jf8[]{new jf8(d16, d19, d20), new jf8((d14 * d21) + d12, (d18 * d21) + d17, d20, 0)}));
                                            double cos2 = Math.cos(d11 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d11 + 2.748893571891069d);
                                            double d22 = jf8Var4.a;
                                            double d23 = cos2 * d13;
                                            double d24 = fArr5[0];
                                            double d25 = sin2 * d13;
                                            yp5Var2.b(new f08(new jf8[]{new jf8((d23 * d24) + d22, (d24 * d25) + d17, d20), new jf8((d23 * d21) + d22, (d25 * d21) + d17, d20, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                xx0.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    yp5Var.r.addListener(new v85(yp5Var, (byte) 5));
                                    yp5Var.r.setDuration(240L);
                                    yp5Var.r.setInterpolator(d53.h);
                                    yp5Var.r.start();
                                }
                            }
                            yp5Var.a.getPainting().c(null, yp5Var.a.getCurrentColor(), true, new vp5(yp5Var, objArr3 == true ? 1 : 0));
                        } else {
                            ValueAnimator valueAnimator2 = painting.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            painting.L = ofFloat2;
                            byte b2 = 1;
                            ofFloat2.addUpdateListener(new cw7(painting, b2));
                            painting.L.addListener(new gw7(painting, b2));
                            painting.L.setInterpolator(d53.h);
                            painting.L.setDuration(350L);
                            painting.L.start();
                            xx0.n.a();
                        }
                        yp5Var.n = 0;
                        yp5Var.o = 0;
                        yp5Var.j = false;
                        yp5Var.b = false;
                        yp5Var.p = 0.0d;
                        yp5Var.q = 0.0d;
                        d99 d99Var2 = yp5Var.a.a;
                        if (d99Var2 != null) {
                            d99Var2.Q();
                            return;
                        }
                        return;
                    }
                    if (actionMasked2 != 2) {
                        if (actionMasked2 == 3) {
                            if (yp5Var.z) {
                                yp5Var.z = false;
                                return;
                            }
                            yp5Var.l = false;
                            yp5Var.s.c();
                            hw7 painting2 = yp5Var.a.getPainting();
                            if (painting2.L != null) {
                                b = 1;
                            } else {
                                b = 1;
                                painting2.f.f(new dw7(painting2, objArr2 == true ? 1 : 0, b));
                            }
                            gm.r(yp5Var.y);
                            hw7 painting3 = yp5Var.a.getPainting();
                            painting3.f.f(new ew7(painting3, b));
                            yp5Var.n = 0;
                            yp5Var.o = 0;
                            yp5Var.j = false;
                            yp5Var.b = false;
                            yp5Var.p = 0.0d;
                            yp5Var.q = 0.0d;
                            u11 u11Var = yp5Var.A;
                            if (u11Var != null) {
                                yp5Var.a.g(u11Var);
                                yp5Var.A = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (yp5Var.z) {
                    if (!yp5Var.b) {
                        yp5Var.b = true;
                        yp5Var.e = false;
                        yp5Var.c = true;
                        yp5Var.g = jf8Var;
                        yp5Var.d = System.currentTimeMillis();
                        yp5Var.m[0] = jf8Var;
                        yp5Var.n = 1;
                        yp5Var.o = 1;
                        yp5Var.j = false;
                        yp5Var.f = true;
                        yp5Var.l = true;
                        gm.d3(yp5Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a3 = jf8Var.a(yp5Var.g);
                    if (a3 >= gm.L(5.0f) / scaleX) {
                        if (yp5Var.l && (a3 > gm.L(6.0f) / scaleX || yp5Var.n > 4)) {
                            yp5Var.l = false;
                            gm.r(yp5Var.y);
                        }
                        if (!yp5Var.e) {
                            d99 d99Var3 = yp5Var.a.a;
                            if (d99Var3 != null) {
                                d99Var3.T();
                            }
                            yp5Var.e = true;
                            if (z && (yp5Var.a.getCurrentBrush() instanceof s11)) {
                                yp5Var.A = yp5Var.a.getCurrentBrush();
                                yp5Var.a.g((u11) aq1.m(1, u11.a));
                            }
                        }
                        yp5Var.m[yp5Var.n] = jf8Var;
                        if (yp5Var.a.getPainting() == null || !yp5Var.a.getPainting().G) {
                            if (System.currentTimeMillis() - yp5Var.d > 3000) {
                                yp5Var.s.c();
                                hw7 painting4 = yp5Var.a.getPainting();
                                if (painting4.L == null) {
                                    painting4.f.f(new dw7(painting4, objArr == true ? 1 : 0, (byte) 1));
                                }
                            } else if ((yp5Var.a.getCurrentBrush() instanceof s11) || (yp5Var.a.getCurrentBrush() instanceof p11)) {
                                hba hbaVar = yp5Var.s;
                                boolean z3 = a3 > ((float) gm.L(6.0f)) / scaleX;
                                synchronized (hbaVar) {
                                    hbaVar.b.add(new fba(d6, d7));
                                    z2 = hbaVar.b.size() >= 8;
                                }
                                if (z2) {
                                    np3 np3Var = hba.m;
                                    eba ebaVar = hbaVar.l;
                                    AtomicBoolean atomicBoolean = hbaVar.k;
                                    if (!hbaVar.j.get()) {
                                        if (atomicBoolean.get() && !hbaVar.d && z3) {
                                            np3Var.cancelRunnable(ebaVar);
                                            np3Var.postRunnable(ebaVar, 150L);
                                        }
                                        if (!atomicBoolean.get()) {
                                            r5 = 1;
                                            atomicBoolean.set(true);
                                            np3Var.postRunnable(ebaVar, 150L);
                                            i = yp5Var.n + r5;
                                            yp5Var.n = i;
                                            yp5Var.o += r5;
                                            if (i == 3) {
                                                jf8[] jf8VarArr = yp5Var.m;
                                                jf8 jf8Var4 = jf8VarArr[2];
                                                double d11 = jf8Var4.b;
                                                jf8 jf8Var5 = jf8VarArr[r5];
                                                float atan2 = (float) Math.atan2(d11 - jf8Var5.b, jf8Var4.a - jf8Var5.a);
                                                if (yp5Var.j) {
                                                    float a4 = pqe.a(a3 / (gm.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                    if (a4 > 0.4f) {
                                                        double d12 = 1.0f - a4;
                                                        double d13 = yp5Var.k;
                                                        double d14 = a4;
                                                        double d15 = atan2;
                                                        yp5Var.k = (float) Math.atan2((Math.sin(d15) * d14) + (Math.sin(d13) * d12), wi8.d(d15, d14, Math.cos(d13) * d12));
                                                    }
                                                } else {
                                                    yp5Var.k = atan2;
                                                    yp5Var.j = r5;
                                                }
                                                yp5Var.c(false, yp5Var.a.getCurrentBrush().i());
                                            }
                                            yp5Var.g = jf8Var;
                                            if (a3 > gm.L(8.0f) / scaleX) {
                                                yp5Var.h = jf8Var;
                                            }
                                            yp5Var.w = pqe.a((currentTimeMillis / 75.0f) + yp5Var.w, 0.6f, 1.0f);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        r5 = 1;
                        i = yp5Var.n + r5;
                        yp5Var.n = i;
                        yp5Var.o += r5;
                        if (i == 3) {
                        }
                        yp5Var.g = jf8Var;
                        if (a3 > gm.L(8.0f) / scaleX) {
                        }
                        yp5Var.w = pqe.a((currentTimeMillis / 75.0f) + yp5Var.w, 0.6f, 1.0f);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (yp5Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = yp5Var.u;
        double d62 = fArr32[0];
        double d72 = fArr32[1];
        double d82 = f18;
        jf8 jf8Var6 = new jf8(d62, d72, d82);
        if (actionMasked2 != 0) {
        }
        if (yp5Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        c99 c99Var = this.d;
        if (c99Var == null) {
            return;
        }
        c99Var.postRunnable(new ey8(this, runnable, (byte) 11));
    }

    public u11 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public hw7 getPainting() {
        return this.c;
    }

    public b7c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new y89(this, (byte) 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        hw7 hw7Var = this.c;
        float width = hw7Var != null ? getWidth() / hw7Var.g.a : 1.0f;
        float f = width > 0.0f ? width : 1.0f;
        xka xkaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f, -f);
        matrix.preTranslate((-xkaVar.a) / 2.0f, (-xkaVar.b) / 2.0f);
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            mbaVar.getClass();
            Matrix matrix2 = new Matrix();
            mbaVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            yp5 yp5Var = this.e;
            yp5Var.getClass();
            Matrix matrix3 = new Matrix();
            yp5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        c99 c99Var = this.d;
        hw7Var.y = pke.c(pke.b(c99Var.n, c99Var.r), pke.a(matrix));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBrush(u11 u11Var) {
        boolean z = this.y instanceof t11;
        mba mbaVar = this.f;
        if (z) {
            mbaVar.e();
        }
        this.y = u11Var;
        i();
        this.c.q(this.y);
        u11 u11Var2 = this.y;
        if (u11Var2 instanceof t11) {
            int n = ((t11) u11Var2).n();
            ArrayList arrayList = mbaVar.n;
            ArrayList arrayList2 = mbaVar.m;
            e99 e99Var = mbaVar.a;
            if (e99Var == null || e99Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            mbaVar.h = new dba(t11.o(n));
            xka xkaVar = e99Var.getPainting().g;
            dba dbaVar = mbaVar.h;
            float f = xkaVar.a;
            dbaVar.b = f / 2.0f;
            float f2 = xkaVar.b;
            dbaVar.c = f2 / 2.0f;
            float min = Math.min(f, f2) / 5.0f;
            dbaVar.e = min;
            dbaVar.d = min;
            mbaVar.h.f = e99Var.getCurrentWeight();
            mbaVar.h.g = gm.L(32.0f);
            mbaVar.h.l = m58.e(z8c.t0).k;
            byte b = 4;
            byte b2 = 1;
            byte b3 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (mbaVar.h.a.n() == 4) {
                dba dbaVar2 = mbaVar.h;
                float f3 = xkaVar.a / 2.0f;
                dbaVar2.d = f3;
                dbaVar2.b = f3;
                dbaVar2.i = f3 + 1.0f;
                float f4 = xkaVar.b;
                float f5 = f4 / 3.0f;
                float f6 = 1.0f * f5;
                dbaVar2.c = f6;
                float f7 = f4 / 2.0f;
                dbaVar2.j = f7;
                dbaVar2.e = f5 * 2.0f;
                dbaVar2.k = Math.abs(f6 - f7);
                iba ibaVar = new iba(mbaVar, b3);
                arrayList2.add(ibaVar);
                jba jbaVar = new jba(mbaVar, ibaVar, objArr3 == true ? 1 : 0);
                arrayList2.add(jbaVar);
                arrayList.add(jbaVar);
                jba jbaVar2 = new jba(mbaVar, ibaVar, b2);
                arrayList2.add(jbaVar2);
                arrayList.add(jbaVar2);
            }
            if (mbaVar.h.a.n() == 0) {
                arrayList2.add(new iba(mbaVar, b2));
            }
            byte b4 = 2;
            if (mbaVar.h.a.n() == 2) {
                arrayList2.add(new iba(mbaVar, b4));
            }
            byte b5 = 3;
            if (mbaVar.h.a.n() == 1 || mbaVar.h.a.n() == 3) {
                arrayList2.add(new kba(mbaVar, mbaVar.h, false, false));
                arrayList2.add(new kba(mbaVar, mbaVar.h, true, false));
                arrayList2.add(new kba(mbaVar, mbaVar.h, false, true));
                arrayList2.add(new kba(mbaVar, mbaVar.h, true, true));
                arrayList2.add(new iba(mbaVar, b5, objArr == true ? 1 : 0));
            }
            if (mbaVar.h.a.n() == 3) {
                dba dbaVar3 = mbaVar.h;
                dbaVar3.i = (dbaVar3.d * 0.8f) + dbaVar3.b;
                dbaVar3.j = (dbaVar3.e * 1.2f) + dbaVar3.c + dbaVar3.f;
                iba ibaVar2 = new iba(mbaVar, b);
                arrayList2.add(ibaVar2);
                ibaVar2.b = false;
                arrayList.add(ibaVar2);
            }
            mbaVar.l = new iba(mbaVar, (byte) 5, objArr2 == true ? 1 : 0);
            if (mbaVar.h.a.n() != 4) {
                mbaVar.l.c = false;
            }
            iba ibaVar3 = mbaVar.l;
            ibaVar3.b = false;
            arrayList.add(ibaVar3);
            arrayList2.add(mbaVar.l);
            e99Var.getPainting().k(mbaVar.h);
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = b10.w(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            e99 e99Var = mbaVar.a;
            dba dbaVar = mbaVar.h;
            if (dbaVar == null || dbaVar.f == e99Var.getCurrentWeight()) {
                return;
            }
            mbaVar.h.f = e99Var.getCurrentWeight();
            e99Var.getPainting().k(mbaVar.h);
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof t11) {
            mba mbaVar = this.f;
            if (mbaVar.h != null) {
                mbaVar.a.getPainting().k(mbaVar.h);
            }
        }
    }

    public void setDelegate(d99 d99Var) {
        this.a = d99Var;
    }

    public void setUndoStore(b7c b7cVar) {
        this.b = b7cVar;
    }

    public void g(u11 u11Var) {
    }

    public void setQueue(np3 np3Var) {
    }
}
