// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lk1 {
    public boolean A;
    public float B;
    public VelocityTracker C;
    public final mt9 D;
    public kk1 E;
    public uj1 F;
    public final rc2 a;
    public int b;
    public long c;
    public k47 d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float n;
    public float o;
    public qa6 r;
    public final ln t;
    public uib u;
    public final u51 x;
    public boolean z;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public int m = gm.L(66.0f);
    public final ArrayList p = new ArrayList();
    public final Path q = new Path();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Paint y = new Paint(1);
    public boolean s = true;

    public lk1(rc2 rc2Var) {
        this.a = rc2Var;
        this.D = new mt9(rc2Var.getContext(), null);
        this.x = new u51(rc2Var);
        this.t = new ln(350L, rc2Var, d53.h);
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
        kk1 kk1Var;
        VelocityTracker velocityTracker;
        boolean z;
        VelocityTracker velocityTracker2;
        uj1 uj1Var;
        if (this.d != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.v;
            float L = (rectF.left + gm.L(7.0f)) - this.n;
            int i = 0;
            while (true) {
                arrayList = this.p;
                if (i >= arrayList.size()) {
                    kk1Var = null;
                    break;
                }
                kk1Var = (kk1) arrayList.get(i);
                if (motionEvent.getX() >= L && motionEvent.getX() <= this.m + L && motionEvent.getY() >= rectF.bottom - gm.L(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                L += gm.L(9.0f) + this.m;
                i++;
            }
            boolean contains = this.w.contains(motionEvent.getX(), motionEvent.getY());
            mt9 mt9Var = this.D;
            u51 u51Var = this.x;
            rc2 rc2Var = this.a;
            byte b = 1;
            if (action == 0) {
                mt9Var.a();
                if (!this.s) {
                    float x = motionEvent.getX();
                    this.B = x;
                    if (rectF.contains(x, motionEvent.getY())) {
                        z = true;
                        this.z = z;
                        if (z && rc2Var.getParent() != null) {
                            rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.A = false;
                        velocityTracker2 = this.C;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.C = null;
                        }
                        this.C = VelocityTracker.obtain();
                        if (kk1Var != null) {
                            kk1Var.n.c(true);
                        }
                        if (contains) {
                            u51Var.c(true);
                        }
                        uj1Var = this.F;
                        if (uj1Var != null) {
                            gm.r(uj1Var);
                            this.F = null;
                        }
                        this.E = kk1Var;
                        if (kk1Var != null) {
                            uj1 uj1Var2 = new uj1(this, kk1Var, b);
                            this.F = uj1Var2;
                            gm.d3(uj1Var2, ViewConfiguration.getLongPressTimeout());
                        }
                        return this.z;
                    }
                }
                z = false;
                this.z = z;
                if (z) {
                    rc2Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.A = false;
                velocityTracker2 = this.C;
                if (velocityTracker2 != null) {
                }
                this.C = VelocityTracker.obtain();
                if (kk1Var != null) {
                }
                if (contains) {
                }
                uj1Var = this.F;
                if (uj1Var != null) {
                }
                this.E = kk1Var;
                if (kk1Var != null) {
                }
                return this.z;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.C;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.z && Math.abs(motionEvent.getX() - this.B) >= gm.e) || this.A) {
                    uj1 uj1Var3 = this.F;
                    if (uj1Var3 != null) {
                        gm.r(uj1Var3);
                        this.F = null;
                    }
                    this.A = true;
                    this.n = Utilities.i(this.n + (this.B - motionEvent.getX()), this.o - (rectF.width() - gm.L(14.0f)), 0.0f);
                    rc2Var.r2();
                    this.B = motionEvent.getX();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((kk1) arrayList.get(i2)).n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                uj1 uj1Var4 = this.F;
                if (uj1Var4 != null) {
                    gm.r(uj1Var4);
                    this.F = null;
                }
                VelocityTracker velocityTracker4 = this.C;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z2 = this.A;
                this.A = false;
                if (action == 1) {
                    if (z2 || kk1Var == null || !kk1Var.n.i) {
                        if (z2 && (velocityTracker = this.C) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            mt9Var.c((int) this.n, 0, (int) (-this.C.getXVelocity()), 0, -2147483647, ConnectionsManager.DEFAULT_DATACENTER_ID, 0, 0);
                        } else if (u51Var.i && rc2Var.getDelegate() != null) {
                            rc2Var.getDelegate().Q1(rc2Var);
                        }
                    } else if (!kk1Var.g) {
                        TLObject tLObject = kk1Var.o;
                        if (rc2Var.getDelegate() != null) {
                            rc2Var.getDelegate().I1(rc2Var, tLObject, false);
                        }
                    } else if (rc2Var.getDelegate() != null) {
                        rc2Var.getDelegate().o2();
                    }
                }
                u51Var.c(false);
                this.z = false;
                VelocityTracker velocityTracker5 = this.C;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.C = null;
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((kk1) arrayList.get(i3)).n.c(false);
                }
                return z2;
            }
        }
        return false;
    }

    public final void b() {
        mt9 mt9Var = this.D;
        if (mt9Var.b()) {
            float f = mt9Var.j;
            this.n = f;
            this.n = Utilities.i(f, this.o - (this.v.width() - gm.L(14.0f)), 0.0f);
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
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        if (this.d != null) {
            b();
            float f11 = 0.0f;
            if (this.g != null) {
                canvas.save();
                float width = (rc2Var.getWidth() - this.g.getWidth()) / 2.0f;
                RectF rectF2 = gm.P;
                rectF2.set((this.h + width) - gm.L(8.66f), gm.L(4.0f), this.i + width + gm.L(8.66f), gm.L(10.66f) + this.j);
                rc2Var.w1(canvas, rectF2, gm.L(11.0f));
                canvas.translate(width, gm.L(7.33f));
                this.f.setColor(cmb.v0(cmb.Yc, rc2Var.cc));
                this.g.draw(canvas);
                canvas.restore();
                f = gm.L(10.66f) + this.j + 0.0f;
            } else {
                f = 0.0f;
            }
            float i6 = Utilities.i(((yc2Var.M2 ? d() ? yc2Var.L1 : 1.0f - yc2Var.L1 : d() ? 1.0f : 0.0f) - 0.3f) / 0.7f, 1.0f, 0.0f);
            if (i6 > 0.0f) {
                int width2 = rc2Var.getWidth() - gm.L(18.0f);
                this.m = (int) (width2 > gm.L(441.0f) ? gm.L(66.0f) : Math.max((width2 / 4.5f) - gm.L(9.0f), gm.L(66.0f)));
                ArrayList arrayList2 = this.p;
                this.o = ((arrayList2.size() - 1) * gm.L(9.0f)) + (arrayList2.size() * r4);
                int min = (int) Math.min(width2, this.m * 6.5f);
                RectF rectF3 = this.v;
                rectF3.set((rc2Var.getWidth() - min) / 2.0f, gm.L(10.0f) + f, (rc2Var.getWidth() + min) / 2.0f, f + gm.L(138.0f));
                this.n = Utilities.i(this.n, this.o - (rectF3.width() - gm.L(14.0f)), 0.0f);
                float abs = Math.abs(i6 - (-1.0f));
                Path path = this.l;
                if (abs < 0.001f) {
                    f5 = 2.0f;
                    i = 1;
                    f4 = 9.0f;
                    f2 = 6.0f;
                    f3 = 8.0f;
                } else {
                    float L = gm.L(16.66f) * 2.0f;
                    f2 = 6.0f;
                    float f12 = rectF3.bottom;
                    path.rewind();
                    f3 = 8.0f;
                    RectF rectF4 = gm.P;
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
                    path.lineTo(rectF3.centerX() + gm.L(8.0f), rectF3.top);
                    path.lineTo(rectF3.centerX(), rectF3.top - gm.L(6.0f));
                    path.lineTo(rectF3.centerX() - gm.L(8.0f), rectF3.top);
                    path.close();
                }
                canvas.save();
                float f20 = (i6 * 0.6f) + 0.4f;
                canvas.scale(f20, f20, rectF3.centerX(), rectF3.top - gm.L(f2));
                int v0 = cmb.v0(cmb.qa, rc2Var.cc);
                Paint paint = this.k;
                paint.setColor(v0);
                paint.setAlpha((int) (i6 * 255.0f));
                paint.setShadowLayer(gm.N(1.0f), 0.0f, gm.N(0.33f), on2.p(-16777216, (int) (27.0f * i6)));
                canvas.drawPath(path, paint);
                canvas.clipPath(path);
                uib uibVar = this.u;
                if (uibVar != null) {
                    arrayList = arrayList2;
                    uibVar.c(rectF3.left + gm.L(17.0f), rectF3.top + gm.L(20.0f), i6, cmb.v0(cmb.F6, rc2Var.cc), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                }
                float d = this.t.d(this.s);
                float L2 = (rectF3.left + gm.L(7.0f)) - this.n;
                float L3 = gm.L(f4) + this.m;
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
                        kk1 kk1Var = (kk1) arrayList.get(i7);
                        canvas2.save();
                        canvas2.translate((i7 * L3) + L2, rectF3.bottom - gm.L(99.0f));
                        int i8 = this.m;
                        float f21 = (1.0f - d) * i6;
                        pc0[] pc0VarArr = kk1Var.b;
                        boolean z4 = kk1Var.g;
                        float f22 = f11;
                        Drawable drawable = kk1Var.h;
                        boolean z5 = z3;
                        ImageReceiver[] imageReceiverArr = kk1Var.c;
                        float f23 = L3;
                        rc2 rc2Var2 = kk1Var.a;
                        int i9 = floor;
                        u51 u51Var = kk1Var.n;
                        int i10 = ceil;
                        uib uibVar2 = kk1Var.k;
                        Paint paint2 = kk1Var.j;
                        canvas2.save();
                        float a = u51Var.a(0.075f);
                        float f24 = i8;
                        float f25 = f24 / f5;
                        canvas2.scale(a, a, f25, gm.L(99.0f) / f5);
                        Paint paint3 = kk1Var.i;
                        paint3.setStrokeWidth(gm.L(2.66f));
                        paint3.setColor(cmb.v0(cmb.qa, rc2Var2.cc));
                        int length = imageReceiverArr.length - 1;
                        while (length >= 0) {
                            int i11 = length;
                            float length2 = (f25 - (((imageReceiverArr.length - 1) * gm.L(7.0f)) / f5)) + (gm.L(7.0f) * i11);
                            float L4 = (gm.L(54.0f) / f5) + gm.L(10.0f);
                            ArrayList arrayList3 = arrayList;
                            RectF rectF5 = rectF3;
                            if (imageReceiverArr.length > i) {
                                canvas2.drawCircle(length2, L4, gm.L(54.0f) / f5, paint3);
                            }
                            imageReceiverArr[i11].i0(length2 - (gm.L(54.0f) / f5), L4 - (gm.L(54.0f) / f5), gm.L(54.0f), gm.L(54.0f));
                            imageReceiverArr[i11].setAlpha(f21);
                            imageReceiverArr[i11].h(canvas2, null);
                            length = i11 - 1;
                            arrayList = arrayList3;
                            rectF3 = rectF5;
                            rc2Var = rc2Var;
                            i = 1;
                        }
                        rc2 rc2Var3 = rc2Var;
                        RectF rectF6 = rectF3;
                        ArrayList arrayList4 = arrayList;
                        if (uibVar2 != null) {
                            uibVar2.p = i8 - gm.L(32.0f);
                            float j = uibVar2.j() + gm.L(drawable != null ? 17.0f : f3);
                            float L5 = gm.L(1.0f) + gm.L(54.0f) + gm.L(10.0f);
                            f8 = 32.0f;
                            i2 = 2;
                            gm.P.set((f24 - j) / f5, L5 - gm.L(14.33f), (f24 + j) / f5, L5);
                            if (!kk1Var.m) {
                                if (z4) {
                                    paint2.setColor(cmb.v(cmb.v0(cmb.qa, rc2Var2.cc), cmb.p1(0.85f, cmb.v0(cmb.x6, rc2Var2.cc))));
                                    kk1Var.m = true;
                                } else {
                                    Drawable drawable2 = imageReceiverArr[z5 ? 1 : 0].n0;
                                    if (drawable2 instanceof BitmapDrawable) {
                                        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                        try {
                                            fArr = new float[3];
                                            on2.j(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2), fArr);
                                            f10 = fArr[1];
                                        } catch (Exception e) {
                                            z2 = true;
                                            fc4.g(e, true);
                                        }
                                        if (f10 > 0.05f && f10 < 0.95f) {
                                            float f26 = fArr[2];
                                            if (f26 > 0.02f && f26 < 0.98f) {
                                                fArr[1] = 0.25f;
                                                fArr[2] = cmb.I.o() ? 0.35f : 0.65f;
                                                paint2.setColor(on2.a(fArr));
                                                z2 = true;
                                                kk1Var.m = z2;
                                            }
                                        }
                                        fArr[1] = f22;
                                        fArr[2] = cmb.I.o() ? 0.38f : 0.7f;
                                        paint2.setColor(on2.a(fArr));
                                        z2 = true;
                                        kk1Var.m = z2;
                                    } else if (!kk1Var.l) {
                                        try {
                                            int b = pc0VarArr[z5 ? 1 : 0].b();
                                            pc0 pc0Var = pc0VarArr[z5 ? 1 : 0];
                                            boolean z6 = pc0Var.g;
                                            int i12 = pc0Var.e;
                                            if (z6) {
                                                f9 = 0.95f;
                                                amb i13 = cmb.I.i(z5);
                                                i12 = cmb.B(cmb.I, i13 != null ? i13.c : 0, i12);
                                            } else {
                                                f9 = 0.95f;
                                            }
                                            int f27 = on2.f(0.5f, b, i12);
                                            float[] fArr2 = new float[3];
                                            on2.j(f27, fArr2);
                                            float f28 = fArr2[1];
                                            if (f28 <= 0.05f || f28 >= f9) {
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.1f, 0.6f, 0.3f);
                                            } else {
                                                fArr2[1] = Utilities.i(f28 - 0.06f, 0.4f, f22);
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.08f, 0.5f, 0.2f);
                                            }
                                            paint2.setColor(on2.a(fArr2));
                                            z = true;
                                        } catch (Exception e2) {
                                            z = true;
                                            fc4.g(e2, true);
                                        }
                                        kk1Var.l = z;
                                    }
                                }
                            }
                            RectF rectF7 = gm.P;
                            canvas2.drawRoundRect(rectF7, gm.L(f3), gm.L(f3), paint2);
                            rectF7.inset((-gm.L(1.0f)) / f5, (-gm.L(1.0f)) / f5);
                            paint3.setStrokeWidth(gm.L(1.0f));
                            canvas2.drawRoundRect(rectF7, gm.L(f3), gm.L(f3), paint3);
                        } else {
                            f8 = 32.0f;
                            i2 = 2;
                        }
                        canvas2.restore();
                        int i14 = this.m;
                        TextPaint textPaint = kk1Var.d;
                        canvas2.save();
                        float a2 = u51Var.a(0.075f);
                        float f29 = i14;
                        canvas2.scale(a2, a2, f29 / f5, gm.L(99.0f) / f5);
                        StaticLayout staticLayout = kk1Var.f;
                        if (staticLayout == null || staticLayout.getWidth() != i14) {
                            CharSequence charSequence = kk1Var.e;
                            kk1Var.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i14).setMaxLines(i2).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                        }
                        if (kk1Var.f != null) {
                            canvas2.save();
                            canvas2.translate((i14 - kk1Var.f.getWidth()) / f5, gm.L(66.33f));
                            i3 = 1;
                            if (imageReceiverArr.length <= 1) {
                                textPaint.setColor(cmb.v0(cmb.Uc, rc2Var2.cc));
                            } else {
                                textPaint.setColor(cmb.v0(cmb.x6, rc2Var2.cc));
                            }
                            textPaint.setAlpha((int) (textPaint.getAlpha() * f21));
                            kk1Var.f.draw(canvas2);
                            canvas2.restore();
                        } else {
                            i3 = 1;
                        }
                        if (uibVar2 != null) {
                            uibVar2.p = i14 - gm.L(f8);
                            float j2 = (f29 - (uibVar2.j() + gm.L(drawable != null ? 17.0f : f3))) / f5;
                            float L6 = gm.L(54.0f) + gm.L(4.165f);
                            if (drawable != null) {
                                drawable.setBounds((int) ((z4 ? uibVar2.j() + gm.L(1.33f) : 0.0f) + j2 + gm.L(3.0f)), (int) hg9.x(drawable.getIntrinsicHeight(), f5, 0.625f, L6), (int) ((drawable.getIntrinsicWidth() * 0.625f) + (z4 ? uibVar2.j() + gm.L(1.33f) : 0.0f) + j2 + gm.L(3.0f)), (int) b10.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                                drawable.draw(canvas2);
                            }
                            float L7 = gm.L(!z4 ? 12.66f : 4.0f) + j2;
                            i4 = i9;
                            i5 = i10;
                            Canvas canvas3 = canvas2;
                            kk1Var.k.c(L7, L6, f21, -1, canvas3);
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
                        rc2Var = rc2Var3;
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
                rc2 rc2Var4 = rc2Var;
                RectF rectF8 = rectF3;
                int i16 = floor;
                if (d > 0.0f) {
                    Path path2 = this.q;
                    path2.rewind();
                    for (int max2 = Math.max(0, i16); max2 < i15; max2++) {
                        float f31 = (max2 * f30) + L2;
                        float f32 = this.m;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addCircle((f32 / 2.0f) + f31, (gm.L(54.0f) / 2.0f) + gm.L(10.0f), gm.L(54.0f) / 2.0f, direction);
                        float f33 = f32 * 0.4f;
                        RectF rectF9 = gm.P;
                        rectF9.set(aq1.z(f32, f33, 2.0f, f31), gm.L(69.0f), td4.e(f32, f33, 2.0f, f31), gm.L(79.0f));
                        path2.addRoundRect(rectF9, gm.L(3.0f), gm.L(3.0f), direction);
                        float f34 = f32 * 0.35f;
                        rectF9.set(aq1.z(f32, f34, 2.0f, f31), gm.L(83.0f), td4.e(f32, f34, 2.0f, f31), gm.L(91.0f));
                        path2.addRoundRect(rectF9, gm.L(2.5f), gm.L(2.5f), direction);
                    }
                    if (this.r == null) {
                        qa6 qa6Var = new qa6();
                        this.r = qa6Var;
                        qa6Var.y = path2;
                        qa6Var.D = false;
                    }
                    int v02 = cmb.v0(cmb.F6, rc2Var4.cc);
                    this.r.g(cmb.p1(f7, v02), cmb.p1(0.15f, v02), cmb.p1(f6, v02), cmb.p1(0.3f, v02));
                    qa6 qa6Var2 = this.r;
                    qa6Var2.t = 1.5f;
                    qa6Var2.setAlpha((int) (d * 255.0f));
                    canvas2.save();
                    rectF = rectF8;
                    canvas2.translate(0.0f, rectF.bottom - gm.L(99.0f));
                    this.r.draw(canvas2);
                    canvas2.restore();
                } else {
                    rectF = rectF8;
                }
                float a3 = this.x.a(0.02f);
                float L8 = rectF.right - gm.L(20.0f);
                float L9 = rectF.top + gm.L(20.0f);
                canvas2.save();
                canvas2.scale(a3, a3, L8, L9);
                float L10 = gm.L(1.33f);
                Paint paint4 = this.y;
                paint4.setStrokeWidth(L10);
                canvas2.drawLine(L8 - gm.L(4.0f), L9 - gm.L(4.0f), L8 + gm.L(4.0f), L9 + gm.L(4.0f), paint4);
                canvas.drawLine(L8 - gm.L(4.0f), L9 + gm.L(4.0f), L8 + gm.L(4.0f), L9 - gm.L(4.0f), paint4);
                this.w.set(L8 - gm.L(12.0f), L9 - gm.L(12.0f), L8 + gm.L(12.0f), L9 + gm.L(12.0f));
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final boolean d() {
        return this.d.i1 && this.p.size() > 0;
    }

    public final void e(k47 k47Var) {
        ArrayList arrayList;
        int i;
        int i2;
        this.b = k47Var.K1;
        this.d = k47Var;
        this.c = k47.B0(k47Var.k);
        oc7.r1(this.b).L0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o = gm.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o);
        textPaint.setTextSize(gm.L(14.0f));
        int i3 = cmb.Yc;
        rc2 rc2Var = this.a;
        textPaint.setColor(cmb.v0(i3, rc2Var.cc));
        this.g = new StaticLayout(jb6.M0(2131752335, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        paint.setColor(cmb.v0(cmb.V5, rc2Var.cc));
        rc2Var.v0 = gm.L(14.66f) + this.j;
        int i5 = 0;
        while (true) {
            arrayList = this.p;
            if (i5 >= arrayList.size()) {
                break;
            }
            kk1 kk1Var = (kk1) arrayList.get(i5);
            int i6 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = kk1Var.c;
                if (i6 < imageReceiverArr.length) {
                    imageReceiverArr[i6].K();
                    i6++;
                }
            }
            i5++;
        }
        arrayList.clear();
        qb7 K0 = oc7.r1(this.b).K0(this.c);
        ArrayList arrayList2 = K0 != null ? new ArrayList(K0.b) : new ArrayList();
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            TLObject tLObject = (TLObject) arrayList2.get(i7);
            if ((tLObject instanceof TLRPC.Chat) && !sd2.r0((TLRPC.Chat) tLObject)) {
                arrayList2.remove(i7);
                i7--;
            }
            i7++;
        }
        boolean z = arrayList2.isEmpty() || (!z8c.h(this.b).p() && arrayList2.size() == 1);
        this.s = z;
        if (!z) {
            int size = arrayList2.size();
            if (!z8c.h(this.b).p() && K0.c > 0) {
                size = Math.min(size - 1, oc7.r1(this.b).l4.Q1.f());
            }
            int min = Math.min(size, 10);
            for (int i8 = 0; i8 < min; i8++) {
                arrayList.add(new kk1(rc2Var, (TLObject) arrayList2.get(i8)));
            }
            if (min < arrayList2.size()) {
                arrayList.add(new kk1(rc2Var, new TLObject[]{(min < 0 || min >= arrayList2.size()) ? null : (TLObject) arrayList2.get(min), (min < 0 || (i2 = min + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i2), (min < 0 || (i = min + 2) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i)}, (arrayList2.size() + K0.c) - min));
            }
        }
        if (this.u == null) {
            uib uibVar = new uib(jb6.M0(this.c > 0 ? 2131745053 : 2131745051, null), 14.0f, gm.o());
            uibVar.o = true;
            this.u = uibVar;
        }
        if (d()) {
            rc2Var.v0 = gm.L(144.0f) + rc2Var.v0;
            this.k.setColor(cmb.v0(cmb.qa, rc2Var.cc));
        }
        float size2 = ((arrayList.size() - 1) * gm.L(9.0f)) + (arrayList.size() * this.m);
        this.o = size2;
        this.n = Utilities.i(this.n, size2, 0.0f);
    }
}
