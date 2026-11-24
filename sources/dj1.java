// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dj1 {
    public boolean A;
    public float B;
    public VelocityTracker C;
    public final kr9 D;
    public cj1 E;
    public aj1 F;
    public final gb2 a;
    public int b;
    public long c;
    public k27 d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float n;
    public float o;
    public r86 r;
    public final lm t;
    public tgb u;
    public final n41 x;
    public boolean z;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public int m = gl.L(66.0f);
    public final ArrayList p = new ArrayList();
    public final Path q = new Path();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Paint y = new Paint(1);
    public boolean s = true;

    public dj1(gb2 gb2Var) {
        this.a = gb2Var;
        this.D = new kr9(gb2Var.getContext(), null);
        this.x = new n41(gb2Var);
        this.t = new lm(350L, gb2Var, s33.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        ArrayList arrayList;
        cj1 cj1Var;
        VelocityTracker velocityTracker;
        boolean z;
        VelocityTracker velocityTracker2;
        aj1 aj1Var;
        byte b = 0;
        if (this.d != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.v;
            float L = (rectF.left + gl.L(7.0f)) - this.n;
            int i = 0;
            while (true) {
                arrayList = this.p;
                if (i >= arrayList.size()) {
                    cj1Var = null;
                    break;
                }
                cj1Var = (cj1) arrayList.get(i);
                if (motionEvent.getX() >= L && motionEvent.getX() <= this.m + L && motionEvent.getY() >= rectF.bottom - gl.L(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                L += gl.L(9.0f) + this.m;
                i++;
            }
            boolean contains = this.w.contains(motionEvent.getX(), motionEvent.getY());
            kr9 kr9Var = this.D;
            n41 n41Var = this.x;
            gb2 gb2Var = this.a;
            if (action == 0) {
                kr9Var.a();
                if (!this.s) {
                    float x = motionEvent.getX();
                    this.B = x;
                    if (rectF.contains(x, motionEvent.getY())) {
                        z = true;
                        this.z = z;
                        if (z && gb2Var.getParent() != null) {
                            gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.A = false;
                        velocityTracker2 = this.C;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.C = null;
                        }
                        this.C = VelocityTracker.obtain();
                        if (cj1Var != null) {
                            cj1Var.n.c(true);
                        }
                        if (contains) {
                            n41Var.c(true);
                        }
                        aj1Var = this.F;
                        if (aj1Var != null) {
                            gl.r(aj1Var);
                            this.F = null;
                        }
                        this.E = cj1Var;
                        if (cj1Var != null) {
                            aj1 aj1Var2 = new aj1(this, cj1Var, b);
                            this.F = aj1Var2;
                            gl.d3(aj1Var2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.z;
                    }
                }
                z = false;
                this.z = z;
                if (z) {
                    gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.A = false;
                velocityTracker2 = this.C;
                if (velocityTracker2 != null) {
                }
                this.C = VelocityTracker.obtain();
                if (cj1Var != null) {
                }
                if (contains) {
                }
                aj1Var = this.F;
                if (aj1Var != null) {
                }
                this.E = cj1Var;
                if (cj1Var != null) {
                }
                return this.z;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.C;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.z && Math.abs(motionEvent.getX() - this.B) >= gl.e) || this.A) {
                    aj1 aj1Var3 = this.F;
                    if (aj1Var3 != null) {
                        gl.r(aj1Var3);
                        this.F = null;
                    }
                    this.A = true;
                    this.n = Utilities.i(this.n + (this.B - motionEvent.getX()), this.o - (rectF.width() - gl.L(14.0f)), 0.0f);
                    gb2Var.r2();
                    this.B = motionEvent.getX();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((cj1) arrayList.get(i2)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                aj1 aj1Var4 = this.F;
                if (aj1Var4 != null) {
                    gl.r(aj1Var4);
                    this.F = null;
                }
                VelocityTracker velocityTracker4 = this.C;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z2 = this.A;
                this.A = false;
                if (action == 1) {
                    if (z2 || cj1Var == null || !cj1Var.n.i) {
                        if (z2 && (velocityTracker = this.C) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            kr9Var.c((int) this.n, 0, (int) (-this.C.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (n41Var.i && gb2Var.getDelegate() != null) {
                            gb2Var.getDelegate().e2(gb2Var);
                        }
                    } else if (!cj1Var.g) {
                        TLObject tLObject = cj1Var.o;
                        if (gb2Var.getDelegate() != null) {
                            gb2Var.getDelegate().W1(gb2Var, tLObject, false);
                        }
                    } else if (gb2Var.getDelegate() != null) {
                        gb2Var.getDelegate().C2();
                    }
                }
                n41Var.c(false);
                this.z = false;
                VelocityTracker velocityTracker5 = this.C;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.C = null;
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((cj1) arrayList.get(i3)).n.c(false);
                }
                return z2;
            }
        }
        return false;
    }

    public final void b() {
        kr9 kr9Var = this.D;
        if (kr9Var.b()) {
            float f = kr9Var.j;
            this.n = f;
            this.n = Utilities.i(f, this.o - (this.v.width() - gl.L(14.0f)), 0.0f);
            this.a.r2();
        }
    }

    public final void c(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        Canvas canvas2;
        ArrayList arrayList;
        float f6;
        float f7;
        RectF rectF;
        float f8;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        float f9;
        boolean z2;
        float[] fArr;
        float f10;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        if (this.d != null) {
            b();
            float f11 = 0.0f;
            if (this.g != null) {
                canvas.save();
                float width = (gb2Var.getWidth() - this.g.getWidth()) / 2.0f;
                RectF rectF2 = gl.P;
                rectF2.set((this.h + width) - gl.L(8.66f), gl.L(4.0f), this.i + width + gl.L(8.66f), gl.L(10.66f) + this.j);
                gb2Var.w1(canvas, rectF2, gl.L(11.0f));
                canvas.translate(width, gl.L(7.33f));
                this.f.setColor(bkb.v0(bkb.Yc, gb2Var.cc));
                this.g.draw(canvas);
                canvas.restore();
                f = gl.L(10.66f) + this.j + 0.0f;
            } else {
                f = 0.0f;
            }
            float i6 = Utilities.i(((nb2Var.M2 ? d() ? nb2Var.L1 : 1.0f - nb2Var.L1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
            if (i6 > 0.0f) {
                int width2 = gb2Var.getWidth() - gl.L(18.0f);
                this.m = (int) (width2 > gl.L(441.0f) ? gl.L(66.0f) : Math.max((width2 / 4.5f) - gl.L(9.0f), gl.L(66.0f)));
                ArrayList arrayList2 = this.p;
                this.o = ((arrayList2.size() - 1) * gl.L(9.0f)) + (arrayList2.size() * r4);
                int min = (int) Math.min(width2, this.m * 6.5f);
                RectF rectF3 = this.v;
                rectF3.set((gb2Var.getWidth() - min) / 2.0f, gl.L(10.0f) + f, (gb2Var.getWidth() + min) / 2.0f, f + gl.L(138.0f));
                this.n = Utilities.i(this.n, this.o - (rectF3.width() - gl.L(14.0f)), 0.0f);
                float abs = Math.abs(i6 - (-1.0f));
                Path path = this.l;
                if (abs < 0.001f) {
                    f5 = 2.0f;
                    i = 1;
                    f4 = 9.0f;
                    f2 = 6.0f;
                    f3 = 8.0f;
                } else {
                    float L = gl.L(16.66f) * 2.0f;
                    f2 = 6.0f;
                    float f12 = rectF3.bottom;
                    path.rewind();
                    f3 = 8.0f;
                    RectF rectF4 = gl.P;
                    f4 = 9.0f;
                    float f13 = rectF3.left;
                    f5 = 2.0f;
                    float f14 = rectF3.top;
                    i = 1;
                    rectF4.set(f13, f14, f13 + L, f14 + L);
                    path.arcTo(rectF4, -90.0f, -90.0f);
                    float f15 = rectF3.left;
                    float f16 = f12 - L;
                    rectF4.set(f15, f16, f15 + L, f12);
                    path.arcTo(rectF4, -180.0f, -90.0f);
                    float f17 = rectF3.right;
                    rectF4.set(f17 - L, f16, f17, f12);
                    path.arcTo(rectF4, -270.0f, -90.0f);
                    float f18 = rectF3.right;
                    float f19 = rectF3.top;
                    rectF4.set(f18 - L, f19, f18, L + f19);
                    path.arcTo(rectF4, 0.0f, -90.0f);
                    path.lineTo(rectF3.centerX() + gl.L(8.0f), rectF3.top);
                    path.lineTo(rectF3.centerX(), rectF3.top - gl.L(6.0f));
                    path.lineTo(rectF3.centerX() - gl.L(8.0f), rectF3.top);
                    path.close();
                }
                canvas.save();
                float f20 = (i6 * 0.6f) + 0.4f;
                canvas.scale(f20, f20, rectF3.centerX(), rectF3.top - gl.L(f2));
                int v0 = bkb.v0(bkb.qa, gb2Var.cc);
                Paint paint = this.k;
                paint.setColor(v0);
                paint.setAlpha((int) (i6 * 255.0f));
                paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33f), bm2.o(-16777216, (int) (27.0f * i6)));
                canvas.drawPath(path, paint);
                canvas.clipPath(path);
                tgb tgbVar = this.u;
                if (tgbVar != null) {
                    arrayList = arrayList2;
                    tgbVar.c(rectF3.left + gl.L(17.0f), rectF3.top + gl.L(20.0f), i6, bkb.v0(bkb.F6, gb2Var.cc), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                }
                float d = this.t.d(this.s);
                float L2 = (rectF3.left + gl.L(7.0f)) - this.n;
                float L3 = gl.L(f4) + this.m;
                int floor = (int) Math.floor(((rectF3.left - min) - L2) / L3);
                int ceil = (int) Math.ceil((rectF3.right - L2) / L3);
                boolean z3 = false;
                if (d < 1.0f) {
                    int max = Math.max(0, floor);
                    f7 = 0.05f;
                    while (true) {
                        int i7 = max;
                        if (i7 >= Math.min(ceil + 1, arrayList.size())) {
                            break;
                        }
                        cj1 cj1Var = (cj1) arrayList.get(i7);
                        canvas2.save();
                        canvas2.translate((i7 * L3) + L2, rectF3.bottom - gl.L(99.0f));
                        int i8 = this.m;
                        float f21 = (1.0f - d) * i6;
                        pb0[] pb0VarArr = cj1Var.b;
                        boolean z4 = cj1Var.g;
                        float f22 = f11;
                        Drawable drawable = cj1Var.h;
                        boolean z5 = z3;
                        ImageReceiver[] imageReceiverArr = cj1Var.c;
                        float f23 = L3;
                        gb2 gb2Var2 = cj1Var.a;
                        int i9 = floor;
                        n41 n41Var = cj1Var.n;
                        int i10 = ceil;
                        tgb tgbVar2 = cj1Var.k;
                        Paint paint2 = cj1Var.j;
                        canvas2.save();
                        float a = n41Var.a(0.075f);
                        float f24 = i8;
                        float f25 = f24 / f5;
                        canvas2.scale(a, a, f25, gl.L(99.0f) / f5);
                        Paint paint3 = cj1Var.i;
                        paint3.setStrokeWidth(gl.L(2.66f));
                        paint3.setColor(bkb.v0(bkb.qa, gb2Var2.cc));
                        int length = imageReceiverArr.length - 1;
                        while (length >= 0) {
                            int i11 = length;
                            float length2 = (f25 - (((imageReceiverArr.length - 1) * gl.L(7.0f)) / f5)) + (gl.L(7.0f) * i11);
                            float L4 = (gl.L(54.0f) / f5) + gl.L(10.0f);
                            ArrayList arrayList3 = arrayList;
                            RectF rectF5 = rectF3;
                            if (imageReceiverArr.length > i) {
                                canvas2.drawCircle(length2, L4, gl.L(54.0f) / f5, paint3);
                            }
                            imageReceiverArr[i11].i0(length2 - (gl.L(54.0f) / f5), L4 - (gl.L(54.0f) / f5), gl.L(54.0f), gl.L(54.0f));
                            imageReceiverArr[i11].setAlpha(f21);
                            imageReceiverArr[i11].h(canvas2, null);
                            length = i11 - 1;
                            arrayList = arrayList3;
                            rectF3 = rectF5;
                            gb2Var = gb2Var;
                            i = 1;
                        }
                        gb2 gb2Var3 = gb2Var;
                        RectF rectF6 = rectF3;
                        ArrayList arrayList4 = arrayList;
                        if (tgbVar2 != null) {
                            tgbVar2.p = i8 - gl.L(32.0f);
                            float j = tgbVar2.j() + gl.L(drawable != null ? 17.0f : f3);
                            float L5 = gl.L(1.0f) + gl.L(54.0f) + gl.L(10.0f);
                            f8 = 32.0f;
                            i2 = 2;
                            gl.P.set((f24 - j) / f5, L5 - gl.L(14.33f), (f24 + j) / f5, L5);
                            if (!cj1Var.m) {
                                if (z4) {
                                    paint2.setColor(bkb.v(bkb.v0(bkb.qa, gb2Var2.cc), bkb.p1(0.85f, bkb.v0(bkb.x6, gb2Var2.cc))));
                                    cj1Var.m = true;
                                } else {
                                    Drawable drawable2 = imageReceiverArr[z5 ? 1 : 0].n0;
                                    if (drawable2 instanceof BitmapDrawable) {
                                        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                        try {
                                            int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                            fArr = new float[3];
                                            bm2.c(Color.red(pixel), Color.green(pixel), Color.blue(pixel), fArr);
                                            f10 = fArr[1];
                                        } catch (Exception e) {
                                            z2 = true;
                                            fa4.g(e, true);
                                        }
                                        if (f10 > 0.05f && f10 < 0.95f) {
                                            float f26 = fArr[2];
                                            if (f26 > 0.02f && f26 < 0.98f) {
                                                fArr[1] = 0.25f;
                                                fArr[2] = bkb.I.o() ? 0.35f : 0.65f;
                                                paint2.setColor(bm2.a(fArr));
                                                z2 = true;
                                                cj1Var.m = z2;
                                            }
                                        }
                                        fArr[1] = f22;
                                        fArr[2] = bkb.I.o() ? 0.38f : 0.7f;
                                        paint2.setColor(bm2.a(fArr));
                                        z2 = true;
                                        cj1Var.m = z2;
                                    } else if (!cj1Var.l) {
                                        try {
                                            int b = pb0VarArr[z5 ? 1 : 0].b();
                                            pb0 pb0Var = pb0VarArr[z5 ? 1 : 0];
                                            boolean z6 = pb0Var.g;
                                            int i12 = pb0Var.e;
                                            if (z6) {
                                                f9 = 0.95f;
                                                zjb i13 = bkb.I.i(z5);
                                                i12 = bkb.B(bkb.I, i13 != null ? i13.c : 0, i12);
                                            } else {
                                                f9 = 0.95f;
                                            }
                                            int f27 = bm2.f(0.5f, b, i12);
                                            float[] fArr2 = new float[3];
                                            bm2.c(Color.red(f27), Color.green(f27), Color.blue(f27), fArr2);
                                            float f28 = fArr2[1];
                                            if (f28 <= 0.05f || f28 >= f9) {
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.1f, 0.6f, 0.3f);
                                            } else {
                                                fArr2[1] = Utilities.i(f28 - 0.06f, 0.4f, f22);
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.08f, 0.5f, 0.2f);
                                            }
                                            paint2.setColor(bm2.a(fArr2));
                                            z = true;
                                        } catch (Exception e2) {
                                            z = true;
                                            fa4.g(e2, true);
                                        }
                                        cj1Var.l = z;
                                    }
                                }
                            }
                            RectF rectF7 = gl.P;
                            canvas2.drawRoundRect(rectF7, gl.L(f3), gl.L(f3), paint2);
                            rectF7.inset((-gl.L(1.0f)) / f5, (-gl.L(1.0f)) / f5);
                            paint3.setStrokeWidth(gl.L(1.0f));
                            canvas2.drawRoundRect(rectF7, gl.L(f3), gl.L(f3), paint3);
                        } else {
                            f8 = 32.0f;
                            i2 = 2;
                        }
                        canvas2.restore();
                        int i14 = this.m;
                        TextPaint textPaint = cj1Var.d;
                        canvas2.save();
                        float a2 = n41Var.a(0.075f);
                        float f29 = i14;
                        canvas2.scale(a2, a2, f29 / f5, gl.L(99.0f) / f5);
                        StaticLayout staticLayout = cj1Var.f;
                        if (staticLayout == null || staticLayout.getWidth() != i14) {
                            CharSequence charSequence = cj1Var.e;
                            cj1Var.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i14).setMaxLines(i2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                        }
                        if (cj1Var.f != null) {
                            canvas2.save();
                            canvas2.translate((i14 - cj1Var.f.getWidth()) / f5, gl.L(66.33f));
                            i3 = 1;
                            if (imageReceiverArr.length <= 1) {
                                textPaint.setColor(bkb.v0(bkb.Uc, gb2Var2.cc));
                            } else {
                                textPaint.setColor(bkb.v0(bkb.x6, gb2Var2.cc));
                            }
                            textPaint.setAlpha((int) (textPaint.getAlpha() * f21));
                            cj1Var.f.draw(canvas2);
                            canvas2.restore();
                        } else {
                            i3 = 1;
                        }
                        if (tgbVar2 != null) {
                            tgbVar2.p = i14 - gl.L(f8);
                            float j2 = (f29 - (tgbVar2.j() + gl.L(drawable != null ? 17.0f : f3))) / f5;
                            float L6 = gl.L(54.0f) + gl.L(4.165f);
                            if (drawable != null) {
                                drawable.setBounds((int) ((z4 ? tgbVar2.j() + gl.L(1.33f) : 0.0f) + j2 + gl.L(3.0f)), (int) de9.x(drawable.getIntrinsicHeight(), f5, 0.625f, L6), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z4 ? tgbVar2.j() + gl.L(1.33f) : 0.0f) + j2 + gl.L(3.0f)), (int) b00.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                                drawable.draw(canvas2);
                            }
                            float L7 = gl.L(!z4 ? 12.66f : 4.0f) + j2;
                            i4 = i9;
                            i5 = i10;
                            Canvas canvas3 = canvas2;
                            cj1Var.k.c(L7, L6, f21, -1, canvas3);
                            canvas2 = canvas3;
                        } else {
                            i4 = i9;
                            i5 = i10;
                        }
                        canvas2.restore();
                        canvas2.restore();
                        max = i7 + 1;
                        floor = i4;
                        ceil = i5;
                        i = i3;
                        L3 = f23;
                        arrayList = arrayList4;
                        rectF3 = rectF6;
                        gb2Var = gb2Var3;
                        f11 = 0.0f;
                        z3 = false;
                        f5 = 2.0f;
                    }
                    f6 = 0.1f;
                } else {
                    f6 = 0.1f;
                    f7 = 0.05f;
                }
                float f30 = L3;
                int i15 = ceil;
                gb2 gb2Var4 = gb2Var;
                RectF rectF8 = rectF3;
                int i16 = floor;
                if (d > 0.0f) {
                    Path path2 = this.q;
                    path2.rewind();
                    for (int max2 = Math.max(0, i16); max2 < i15; max2++) {
                        float f31 = (max2 * f30) + L2;
                        float f32 = this.m;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addCircle((f32 / 2.0f) + f31, (gl.L(54.0f) / 2.0f) + gl.L(10.0f), gl.L(54.0f) / 2.0f, direction);
                        float f33 = f32 * 0.4f;
                        RectF rectF9 = gl.P;
                        rectF9.set(oo1.z(f32, f33, 2.0f, f31), gl.L(69.0f), tb4.e(f32, f33, 2.0f, f31), gl.L(79.0f));
                        path2.addRoundRect(rectF9, gl.L(3.0f), gl.L(3.0f), direction);
                        float f34 = f32 * 0.35f;
                        rectF9.set(oo1.z(f32, f34, 2.0f, f31), gl.L(83.0f), tb4.e(f32, f34, 2.0f, f31), gl.L(91.0f));
                        path2.addRoundRect(rectF9, gl.L(2.5f), gl.L(2.5f), direction);
                    }
                    if (this.r == null) {
                        r86 r86Var = new r86();
                        this.r = r86Var;
                        r86Var.y = path2;
                        r86Var.D = false;
                    }
                    int v02 = bkb.v0(bkb.F6, gb2Var4.cc);
                    this.r.g(bkb.p1(f7, v02), bkb.p1(0.15f, v02), bkb.p1(f6, v02), bkb.p1(0.3f, v02));
                    r86 r86Var2 = this.r;
                    r86Var2.t = 1.5f;
                    r86Var2.setAlpha((int) (d * 255.0f));
                    canvas2.save();
                    rectF = rectF8;
                    canvas2.translate(0.0f, rectF.bottom - gl.L(99.0f));
                    this.r.draw(canvas2);
                    canvas2.restore();
                } else {
                    rectF = rectF8;
                }
                float a3 = this.x.a(0.02f);
                float L8 = rectF.right - gl.L(20.0f);
                float L9 = rectF.top + gl.L(20.0f);
                canvas2.save();
                canvas2.scale(a3, a3, L8, L9);
                float L10 = gl.L(1.33f);
                Paint paint4 = this.y;
                paint4.setStrokeWidth(L10);
                canvas2.drawLine(L8 - gl.L(4.0f), L9 - gl.L(4.0f), L8 + gl.L(4.0f), L9 + gl.L(4.0f), paint4);
                canvas.drawLine(L8 - gl.L(4.0f), L9 + gl.L(4.0f), L8 + gl.L(4.0f), L9 - gl.L(4.0f), paint4);
                this.w.set(L8 - gl.L(12.0f), L9 - gl.L(12.0f), L8 + gl.L(12.0f), L9 + gl.L(12.0f));
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final boolean d() {
        return this.d.i1 && this.p.size() > 0;
    }

    public final void e(k27 k27Var) {
        ArrayList arrayList;
        int i;
        int i2;
        this.b = k27Var.K1;
        this.d = k27Var;
        this.c = k27.B0(k27Var.k);
        na7.q1(this.b).K0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o = gl.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o);
        textPaint.setTextSize(gl.L(14.0f));
        int i3 = bkb.Yc;
        gb2 gb2Var = this.a;
        textPaint.setColor(bkb.v0(i3, gb2Var.cc));
        this.g = new StaticLayout(k96.M0(2131752379, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = r0.getWidth();
        this.i = 0.0f;
        for (int i4 = 0; i4 < this.g.getLineCount(); i4++) {
            this.h = Math.min(this.h, this.g.getLineLeft(i4));
            this.i = Math.max(this.i, this.g.getLineRight(i4));
        }
        this.j = this.g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.y;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(bkb.v0(bkb.V5, gb2Var.cc));
        gb2Var.v0 = gl.L(14.66f) + this.j;
        int i5 = 0;
        while (true) {
            arrayList = this.p;
            if (i5 >= arrayList.size()) {
                break;
            }
            cj1 cj1Var = (cj1) arrayList.get(i5);
            int i6 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = cj1Var.c;
                if (i6 < imageReceiverArr.length) {
                    imageReceiverArr[i6].K();
                    i6++;
                }
            }
            i5++;
        }
        arrayList.clear();
        p97 J0 = na7.q1(this.b).J0(this.c);
        ArrayList arrayList2 = J0 != null ? new ArrayList(J0.b) : new ArrayList();
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if ((tLObject instanceof TLRPC.Chat) && !hc2.r0((TLRPC.Chat) tLObject)) {
                arrayList2.remove(i7);
                i7--;
            }
            i7++;
        }
        boolean z = arrayList2.isEmpty() || (!y6c.h(this.b).p() && arrayList2.size() == 1);
        this.s = z;
        if (!z) {
            int size = arrayList2.size();
            if (!y6c.h(this.b).p() && J0.c > 0) {
                size = Math.min(size - 1, na7.q1(this.b).k4.Q1.f());
            }
            int min = Math.min(size, 10);
            for (int i8 = 0; i8 < min; i8++) {
                arrayList.add(new cj1(gb2Var, (TLObject) arrayList2.get(i8)));
            }
            if (min < arrayList2.size()) {
                arrayList.add(new cj1(gb2Var, new TLObject[]{(min < 0 || min >= arrayList2.size()) ? null : (TLObject) arrayList2.get(min), (min < 0 || (i2 = min + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i2), (min < 0 || (i = min + 2) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i)}, (arrayList2.size() + J0.c) - min));
            }
        }
        if (this.u == null) {
            tgb tgbVar = new tgb(k96.M0(this.c > 0 ? 2131745127 : 2131745125, null), 14.0f, gl.o());
            tgbVar.o = true;
            this.u = tgbVar;
        }
        if (d()) {
            gb2Var.v0 = gl.L(144.0f) + gb2Var.v0;
            this.k.setColor(bkb.v0(bkb.qa, gb2Var.cc));
        }
        float size2 = ((arrayList.size() - 1) * gl.L(9.0f)) + (arrayList.size() * this.m);
        this.o = size2;
        this.n = Utilities.i(this.n, size2, 0.0f);
    }
}
