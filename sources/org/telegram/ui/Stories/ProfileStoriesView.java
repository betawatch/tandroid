package org.telegram.ui.Stories;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class ProfileStoriesView extends View implements fn7 {
    public static final /* synthetic */ int t0 = 0;
    public g29 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public b6b L;
    public final r6b M;
    public final c6b N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final mm U;
    public final mm V;
    public final mm W;
    public final Paint a;
    public float a0;
    public final Paint b;
    public ValueAnimator b0;
    public final int c;
    public final Path c0;
    public final long d;
    public final Matrix d0;
    public final boolean e;
    public final PathMeasure e0;
    public final d26 f;
    public final Path f0;
    public float g0;
    public final iq8 h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final mm m0;
    public final hn n;
    public final mm n0;
    public final xh4 o0;
    public final hv8 p0;
    public long q0;
    public int r;
    public float r0;
    public int s;
    public float s0;
    public iv8 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i, long j, boolean z, d26 d26Var, iq8 iq8Var, vnb vnbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        hn hnVar = new hn(false, true, true);
        this.n = hnVar;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new r6b(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        k43 k43Var = k43.h;
        this.U = new mm(this, 0L, 480L, k43Var);
        this.V = new mm(this, 0L, 240L, k43Var);
        this.W = new mm(this, 0L, 150L, k43.f);
        this.a0 = 1.0f;
        this.c0 = new Path();
        this.d0 = new Matrix();
        this.e0 = new PathMeasure();
        this.f0 = new Path();
        this.m0 = new mm(this, 0L, 350L, k43Var);
        this.n0 = new mm(this, 0L, 350L, k43Var);
        lq8 lq8Var = (lq8) this;
        this.o0 = new xh4(lq8Var, (byte) 25);
        this.p0 = new hv8(lq8Var, (byte) 0);
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = d26Var;
        this.h = iq8Var;
        iq8Var.getImageReceiver().F1 = new hv8(lq8Var, (byte) 1);
        this.N = uc7.s1(i).O1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(hl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(aob.v0(aob.el, vnbVar));
        paint2.setStrokeWidth(hl.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(aob.v0(aob.d6, vnbVar));
        hnVar.w(hl.L(18.0f));
        hnVar.n(0.4f, 320L, k43Var);
        hnVar.x(hl.o());
        hnVar.u(-1);
        hnVar.q(true);
        hnVar.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(hl.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static iv8 d(iv8 iv8Var, iv8 iv8Var2, iv8 iv8Var3) {
        if (iv8Var3 == null) {
            return null;
        }
        RectF rectF = iv8Var3.n;
        if (iv8Var == null) {
            if (iv8Var2 != null) {
                return iv8Var2;
            }
            return null;
        }
        RectF rectF2 = iv8Var.n;
        if (iv8Var2 != null) {
            RectF rectF3 = iv8Var2.n;
            if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) <= Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                return iv8Var2;
            }
        }
        return iv8Var;
    }

    private float getExpandRight() {
        return this.j0 - (this.m0.d(this.l0) * hl.L(71.0f));
    }

    public final void a(Canvas canvas, iv8 iv8Var, iv8 iv8Var2) {
        if (iv8Var2 == null) {
            return;
        }
        RectF rectF = iv8Var2.m;
        RectF rectF2 = hl.P;
        rectF2.set(rectF);
        float f = -(hl.N(1.66f) * iv8Var2.j);
        rectF2.inset(f, f);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = iv8Var.m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.T;
        path.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
            path.arcTo(rectF2, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
            float f2 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f2);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f2));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        if (!xc2.b0(yac.t0, this.d)) {
            canvas.drawArc(rectF, f, f2, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f2) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f3 = f + f2;
        float f4 = (((int) f3) / 90) * 90;
        float f5 = (-199.0f) + f4;
        Path path = this.c0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.d0;
        matrix.reset();
        matrix.postRotate(f4, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.e0;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.f0;
        path2.reset();
        pathMeasure.getSegment(((f3 - f5) / 360.0f) * length, length * (((f3 - f2) - f5) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void c(Canvas canvas, iv8 iv8Var, iv8 iv8Var2, iv8 iv8Var3, Paint paint) {
        iv8 iv8Var4 = iv8Var;
        RectF rectF = iv8Var2.n;
        if (iv8Var4 != null) {
            RectF rectF2 = iv8Var4.n;
            if (iv8Var3 != null) {
                RectF rectF3 = iv8Var3.n;
                float centerX = rectF2.centerX();
                float width = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width2 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width3 = rectF3.width() / 2.0f;
                boolean z = centerX > centerX2;
                float degrees = (float) (z ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2)));
                boolean z2 = centerX3 > centerX2;
                float degrees2 = (float) (z2 ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2)));
                if (z) {
                    if (z2) {
                        float max = Math.max(degrees, degrees2);
                        b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                        return;
                    } else {
                        b(degrees2 + 180.0f, 180.0f - (degrees + degrees2), canvas, paint, rectF);
                        b(degrees, (180.0f - degrees2) - degrees, canvas, paint, rectF);
                        return;
                    }
                }
                if (z2) {
                    b(degrees + 180.0f, 180.0f - (degrees2 + degrees), canvas, paint, rectF);
                    b(degrees2, (180.0f - degrees2) - degrees, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(degrees, degrees2);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        } else {
            if (iv8Var3 == null) {
                b(0.0f, 360.0f, canvas, paint, rectF);
                return;
            }
            iv8Var4 = iv8Var3;
        }
        RectF rectF4 = iv8Var4.n;
        float centerX4 = rectF4.centerX();
        float width4 = rectF4.width() / 2.0f;
        float centerX5 = rectF.centerX();
        if (Math.abs(centerX4 - centerX5) > width4 + (rectF.width() / 2.0f)) {
            b(0.0f, 360.0f, canvas, paint, rectF);
        } else if (centerX4 > centerX5) {
            float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 + r7) + (centerX4 - width4)) / 2.0f) - centerX5) / r7));
            b(degrees3, 360.0f - (2.0f * degrees3), canvas, paint, rectF);
        } else {
            float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 - r7) + (centerX4 + width4)) / 2.0f) - centerX5) / r7));
            b(degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), canvas, paint, rectF);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y5) {
            f(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        r6b r6bVar;
        float f3;
        long j;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        r6b r6bVar2;
        ArrayList arrayList3;
        float f4;
        float f5;
        Paint paint2;
        RectF rectF2;
        Paint paint3;
        float f6;
        ProfileStoriesView profileStoriesView;
        float f7;
        float f8;
        ArrayList arrayList4;
        iv8 iv8Var;
        iv8 iv8Var2;
        Paint paint4;
        iq8 iq8Var;
        ArrayList arrayList5;
        boolean z;
        ArrayList arrayList6;
        float f9;
        RectF rectF3;
        float f10;
        Paint paint5;
        int i;
        float f11;
        r6b r6bVar3;
        Paint paint6;
        float f12;
        ProfileStoriesView profileStoriesView2;
        Canvas canvas2;
        float f13;
        RectF rectF4;
        RectF rectF5;
        Paint a;
        Paint paint7;
        ArrayList arrayList7;
        float f14;
        b6b b6bVar;
        ProfileStoriesView profileStoriesView3 = this;
        Canvas canvas3 = canvas;
        float e = profileStoriesView3.n0.e(false, profileStoriesView3.h0);
        d26 d26Var = profileStoriesView3.f;
        float i2 = Utilities.i((d26Var.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float R1 = hl.R1(hl.N(4.0f), hl.N(3.5f), i2) * profileStoriesView3.I;
        float scaleX = (d26Var.getScaleX() * R1) + d26Var.getX();
        float scaleY = (d26Var.getScaleY() * R1) + d26Var.getY();
        float f15 = R1 * 2.0f;
        float scaleX2 = d26Var.getScaleX() * (d26Var.getWidth() - f15);
        float scaleY2 = (d26Var.getScaleY() * (d26Var.getHeight() - f15)) + scaleY;
        RectF rectF6 = profileStoriesView3.Q;
        rectF6.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f16 = profileStoriesView3.g0;
        int i3 = 0;
        while (true) {
            arrayList = profileStoriesView3.x;
            if (i3 >= arrayList.size()) {
                break;
            }
            iv8 iv8Var3 = (iv8) arrayList.get(i3);
            float e2 = iv8Var3.h.e(false, iv8Var3.e);
            iv8Var3.j = e2;
            if (e2 > 0.0f || iv8Var3.e > 0.0f) {
                iv8Var3.i = iv8Var3.g.e(false, iv8Var3.c);
                iv8Var3.k = iv8Var3.f.d(iv8Var3.d);
                if (i3 > 0 && ((iv8) arrayList.get(i3 - 1)).i > iv8Var3.i) {
                    Collections.sort(arrayList, new qq7((byte) 10));
                    break;
                }
            } else {
                iv8Var3.b.K();
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        float i4 = Utilities.i(1.0f - (profileStoriesView3.O / 0.2f), 1.0f, 0.0f);
        c6b c6bVar = profileStoriesView3.N;
        long j2 = profileStoriesView3.d;
        boolean P = c6bVar.P(j2);
        boolean L = c6bVar.L(j2);
        mm mmVar = profileStoriesView3.W;
        if (!L && (b6bVar = profileStoriesView3.L) != null && b6bVar.w) {
            profileStoriesView3.F = false;
            profileStoriesView3.G = false;
            mmVar.getClass();
            mmVar.e(true, 0.0f);
        }
        float R12 = hl.R1(0.0f, mmVar.d((L && !P) || (profileStoriesView3.F && !profileStoriesView3.G)), profileStoriesView3.J);
        canvas3.save();
        float f17 = profileStoriesView3.H;
        canvas3.scale(f17, f17, rectF6.centerX(), rectF6.centerY());
        float R13 = hl.R1(rectF6.centerY(), profileStoriesView3.k0, profileStoriesView3.O);
        profileStoriesView3.L = null;
        mm mmVar2 = profileStoriesView3.V;
        mm mmVar3 = profileStoriesView3.U;
        iq8 iq8Var2 = profileStoriesView3.h;
        r6b r6bVar4 = profileStoriesView3.M;
        RectF rectF7 = profileStoriesView3.R;
        if (R12 > 0.0f) {
            rectF7.set(rectF6);
            f2 = R12;
            rectF7.inset(-hl.N(3.775f), -hl.N(3.775f));
            Paint a2 = r6bVar4.a(rectF7);
            if (profileStoriesView3.E == null) {
                g29 g29Var = new g29(profileStoriesView3);
                profileStoriesView3.E = g29Var;
                r6bVar = r6bVar4;
                f3 = e;
                arrayList2 = arrayList;
                g29Var.d(null, true, false);
                profileStoriesView3.E.s = xc2.b0(yac.t0, j2);
            } else {
                r6bVar = r6bVar4;
                f3 = e;
                arrayList2 = arrayList;
            }
            if (!c6bVar.L(j2) || c6bVar.P(j2)) {
                f14 = 1.0f;
            } else {
                ArrayList E = c6bVar.E(j2);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView3.L = (b6b) E.get(0);
                    }
                    float f18 = 0.0f;
                    for (int i5 = 0; i5 < E.size(); i5++) {
                        f18 += ((b6b) E.get(i5)).h;
                    }
                    f14 = f18 / E.size();
                } else {
                    f14 = 0.0f;
                }
            }
            profileStoriesView3.E.q = 0;
            int alpha = a2.getAlpha();
            a2.setAlpha((int) (alpha * i4 * f2));
            a2.setStrokeWidth(hl.N(2.33f));
            g29 g29Var2 = profileStoriesView3.E;
            g29Var2.r = a2;
            f = i2;
            j = j2;
            g29Var2.f((int) rectF7.left, (int) rectF7.top, (int) rectF7.right, (int) rectF7.bottom);
            profileStoriesView3.E.e(true, Utilities.i(f14, 1.0f, 0.0f));
            if (iq8Var2.R) {
                profileStoriesView3.E.a(canvas3);
            }
            a2.setAlpha(alpha);
            profileStoriesView3.F = true;
            boolean z2 = profileStoriesView3.G;
            boolean z3 = profileStoriesView3.E.f >= 0.98f;
            profileStoriesView3.G = z3;
            if (z2 != z3) {
                mmVar3.e(true, profileStoriesView3.s);
                mmVar2.e(true, profileStoriesView3.r);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(k43.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                pv7 pv7Var = new pv7(profileStoriesView3, (byte) 22);
                ofFloat.addUpdateListener(pv7Var);
                ofFloat2.addUpdateListener(pv7Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new n88(profileStoriesView3, (byte) 23));
                animatorSet.start();
            }
            paint = a2;
        } else {
            f = i2;
            f2 = R12;
            r6bVar = r6bVar4;
            f3 = e;
            j = j2;
            arrayList2 = arrayList;
            profileStoriesView3.F = false;
            paint = null;
        }
        Paint paint8 = profileStoriesView3.a;
        Paint paint9 = profileStoriesView3.b;
        RectF rectF8 = profileStoriesView3.S;
        if (f2 < 1.0f) {
            f4 = 255.0f;
            f6 = (1.0f - f2) * Utilities.i(1.0f - (profileStoriesView3.O / 0.2f), 1.0f, 0.0f);
            f5 = 1.5f;
            float e3 = mmVar3.e(false, profileStoriesView3.s);
            float e4 = mmVar2.e(false, profileStoriesView3.r);
            if (P) {
                rectF7.set(rectF6);
                rectF7.inset(-hl.N(3.775f), -hl.N(3.775f));
                if (t6b.d == null) {
                    o15 o15Var = new o15();
                    t6b.d = o15Var;
                    o15Var.a = true;
                    o15Var.b = true;
                    o15Var.c.setStrokeWidth(hl.N(2.0f));
                    t6b.d.c.setStyle(Paint.Style.STROKE);
                    t6b.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int w0 = aob.w0(null, aob.ok, false);
                int w02 = aob.w0(null, aob.q7, false);
                t6b.d.d(vm2.f(0.25f, w0, w02), w02, 0, 0);
                t6b.d.b(rectF7.left, rectF7.top, rectF7.right, rectF7.bottom);
                Paint paint10 = t6b.d.c;
                paint10.setStrokeWidth(hl.L(2.0f));
                paint10.setAlpha((int) (f6 * 255.0f));
                if (xc2.b0(yac.t0, j)) {
                    float height = rectF7.height() * 0.32f;
                    canvas3.drawRoundRect(rectF7, height, height, paint10);
                } else {
                    canvas3.drawCircle(rectF7.centerX(), rectF7.centerY(), rectF7.width() / 2.0f, paint10);
                }
            } else if ((profileStoriesView3.w != null || profileStoriesView3.K > 0) && f6 > 0.0f) {
                rectF7.set(rectF6);
                rectF7.inset(-hl.N(3.775f), -hl.N(3.775f));
                rectF8.set(rectF6);
                rectF8.inset(-hl.N(3.41f), -hl.N(3.41f));
                float f19 = f;
                hl.X1(rectF7, rectF8, f19, rectF8);
                RectF rectF9 = rectF8;
                Paint paint11 = paint;
                float R14 = hl.R1(0.0f, (float) ((hl.N(4.23f) / (rectF6.width() * 3.141592653589793d)) * 360.0d), Utilities.i(e3 - 1.0f, 1.0f, 0.0f) * f6);
                int min = Math.min(profileStoriesView3.s, 50);
                float min2 = Math.min(e3, 50.0f);
                int i6 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i6 = 0;
                }
                float R15 = hl.R1(i6 << 1, R14, f19);
                float max = (360.0f - (Math.max(0.0f, min2) * R15)) / Math.max(1.0f, min2);
                paint8.setColor(vm2.f(profileStoriesView3.P, 1526726655, 973078528));
                paint8.getAlpha();
                float f20 = (-90.0f) - (R15 / 2.0f);
                boolean z4 = false;
                int i7 = 0;
                while (true) {
                    iq8Var = iq8Var2;
                    if (i7 >= min) {
                        break;
                    }
                    if (i7 < arrayList2.size()) {
                        ArrayList arrayList8 = arrayList2;
                        arrayList7 = arrayList8;
                        if (((iv8) arrayList8.get(i7)).l) {
                            z4 = true;
                        }
                    } else {
                        arrayList7 = arrayList2;
                    }
                    i7++;
                    iq8Var2 = iq8Var;
                    arrayList2 = arrayList7;
                }
                ArrayList arrayList9 = arrayList2;
                if (z4) {
                    RectF rectF10 = hl.P;
                    rectF10.set(rectF9);
                    rectF10.inset(-hl.L(12.0f), -hl.L(12.0f));
                    canvas3.saveLayerAlpha(rectF10, jn7.d4, 31);
                    float z5 = bp1.z(profileStoriesView3.a0, 1.0f, 2.5f, 1.0f);
                    if (z5 != 1.0f) {
                        canvas3.save();
                        canvas3.scale(z5, z5, rectF7.centerX(), rectF7.centerY());
                    }
                    int alpha2 = paint9.getAlpha();
                    paint9.setAlpha((int) (alpha2 * f6));
                    rectF10.set(rectF9);
                    rectF10.inset(-hl.L(3.0f), -hl.L(3.0f));
                    paint9.setStrokeWidth(hl.N(2.5f));
                    profileStoriesView3.b(0.0f, 360.0f, canvas3, paint9, rectF9);
                    paint9.setAlpha(alpha2);
                    if (z5 != 1.0f) {
                        canvas3.restore();
                    }
                    paint3 = paint8;
                    arrayList3 = arrayList9;
                    rectF = rectF7;
                    rectF2 = rectF9;
                    r6bVar2 = r6bVar;
                    paint = paint11;
                    paint2 = paint9;
                    profileStoriesView3 = profileStoriesView3;
                    canvas3 = canvas3;
                } else {
                    ProfileStoriesView profileStoriesView4 = profileStoriesView3;
                    Paint paint12 = paint9;
                    Paint paint13 = paint8;
                    Canvas canvas4 = canvas3;
                    int i8 = 0;
                    while (i8 < min) {
                        float f21 = i8;
                        Paint paint14 = paint12;
                        float f22 = f20;
                        float i9 = 1.0f - Utilities.i(e4 - f21, 1.0f, 0.0f);
                        Paint paint15 = paint13;
                        float i10 = 1.0f - Utilities.i((min - min2) - f21, 1.0f, 0.0f);
                        if (i10 < 0.0f) {
                            profileStoriesView2 = profileStoriesView4;
                            canvas2 = canvas4;
                            f9 = R15;
                            f20 = f22;
                            rectF5 = rectF9;
                            arrayList6 = arrayList9;
                            i = min;
                            r6bVar3 = r6bVar;
                            f13 = max;
                            rectF4 = rectF7;
                            paint5 = paint14;
                            f11 = min2;
                            paint6 = paint15;
                        } else {
                            float z6 = i8 == 0 ? bp1.z(profileStoriesView4.a0, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (z6 != 1.0f) {
                                canvas4.save();
                                canvas4.scale(z6, z6, rectF7.centerX(), rectF7.centerY());
                            }
                            if (i8 < arrayList9.size()) {
                                arrayList5 = arrayList9;
                                if (((iv8) arrayList5.get(i8)).l) {
                                    z = true;
                                    if (i9 >= 1.0f) {
                                        r6b r6bVar5 = r6bVar;
                                        if (z) {
                                            a = paint11;
                                            paint7 = paint14;
                                        } else {
                                            a = r6bVar5.a(rectF7);
                                            paint7 = a;
                                        }
                                        f9 = R15;
                                        int alpha3 = paint7.getAlpha();
                                        arrayList6 = arrayList5;
                                        Paint paint16 = paint7;
                                        paint16.setAlpha((int) qd4.z(1.0f, i9, alpha3, f6));
                                        paint16.setStrokeWidth(hl.N(z ? 3.0f : 2.33f));
                                        f12 = i9;
                                        rectF3 = rectF7;
                                        paint5 = paint14;
                                        f11 = min2;
                                        paint6 = paint15;
                                        f10 = f22;
                                        i = min;
                                        r6bVar3 = r6bVar5;
                                        profileStoriesView4.b(f10, (-max) * i10, canvas4, paint16, rectF3);
                                        paint16.setAlpha(alpha3);
                                        paint11 = a;
                                    } else {
                                        arrayList6 = arrayList5;
                                        f9 = R15;
                                        rectF3 = rectF7;
                                        f10 = f22;
                                        paint5 = paint14;
                                        i = min;
                                        f11 = min2;
                                        r6bVar3 = r6bVar;
                                        paint6 = paint15;
                                        f12 = i9;
                                    }
                                    if (f12 <= 0.0f) {
                                        Paint paint17 = z ? paint5 : paint6;
                                        int alpha4 = paint17.getAlpha();
                                        paint17.setAlpha((int) (alpha4 * f12 * f6));
                                        paint17.setStrokeWidth(hl.N(z ? 3.0f : 1.5f));
                                        float f23 = (-max) * i10;
                                        profileStoriesView2 = this;
                                        canvas2 = canvas;
                                        f13 = max;
                                        rectF4 = rectF3;
                                        rectF5 = rectF9;
                                        profileStoriesView2.b(f10, f23, canvas2, paint17, rectF5);
                                        paint17.setAlpha(alpha4);
                                    } else {
                                        profileStoriesView2 = this;
                                        canvas2 = canvas;
                                        f13 = max;
                                        rectF4 = rectF3;
                                        rectF5 = rectF9;
                                    }
                                    if (z6 != 1.0f) {
                                        canvas2.restore();
                                    }
                                    f20 = f10 - ((f9 * i10) + (f13 * i10));
                                }
                            } else {
                                arrayList5 = arrayList9;
                            }
                            z = false;
                            if (i9 >= 1.0f) {
                            }
                            if (f12 <= 0.0f) {
                            }
                            if (z6 != 1.0f) {
                            }
                            f20 = f10 - ((f9 * i10) + (f13 * i10));
                        }
                        i8++;
                        canvas4 = canvas2;
                        rectF9 = rectF5;
                        paint13 = paint6;
                        min2 = f11;
                        R15 = f9;
                        arrayList9 = arrayList6;
                        profileStoriesView4 = profileStoriesView2;
                        paint12 = paint5;
                        rectF7 = rectF4;
                        max = f13;
                        r6bVar = r6bVar3;
                        min = i;
                    }
                    paint3 = paint13;
                    arrayList3 = arrayList9;
                    rectF = rectF7;
                    rectF2 = rectF9;
                    r6bVar2 = r6bVar;
                    paint2 = paint12;
                    profileStoriesView3 = profileStoriesView4;
                    canvas3 = canvas4;
                    paint = paint11;
                }
                if (z4) {
                    t6b.k(f6, profileStoriesView3.J, canvas3, rectF2, iq8Var.getImageReceiver().R0);
                    canvas3.restore();
                }
            }
            rectF = rectF7;
            r6bVar2 = r6bVar;
            arrayList3 = arrayList2;
            paint2 = paint9;
            rectF2 = rectF8;
            paint3 = paint8;
            paint = paint;
        } else {
            rectF = rectF7;
            r6bVar2 = r6bVar;
            arrayList3 = arrayList2;
            f4 = 255.0f;
            f5 = 1.5f;
            paint2 = paint9;
            rectF2 = rectF8;
            paint3 = paint8;
            f6 = i4;
        }
        profileStoriesView3.getExpandRight();
        if (profileStoriesView3.O <= 0.0f || f6 >= 1.0f) {
            profileStoriesView = profileStoriesView3;
            f7 = 18.0f;
            f8 = f16;
        } else {
            int i11 = 0;
            while (true) {
                arrayList4 = arrayList3;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                float f24 = ((iv8) arrayList4.get(i11)).j;
                hl.L(14.0f);
                i11++;
            }
            float f25 = f16;
            int i12 = 0;
            float f26 = 0.0f;
            while (i12 < arrayList4.size()) {
                iv8 iv8Var4 = (iv8) arrayList4.get(i12);
                float f27 = iv8Var4.j;
                RectF rectF11 = iv8Var4.n;
                int i13 = i12;
                float f28 = iv8Var4.k;
                float L2 = (hl.L(28.0f) / 2.0f) * f27;
                float f29 = profileStoriesView3.g0 + L2 + f26;
                float L3 = f26 + (hl.L(18.0f) * f27);
                float f30 = f29 + L2;
                float max2 = Math.max(f25, f30);
                rectF.set(f29 - L2, R13 - L2, f30, R13 + L2);
                float f31 = profileStoriesView3.O;
                float R16 = hl.R1(rectF6.centerX(), rectF.centerX(), f31);
                float R17 = hl.R1(rectF6.centerY(), rectF.centerY(), f31);
                float R18 = hl.R1(Math.min(rectF6.width(), rectF6.height()), Math.min(rectF.width(), rectF.height()), f31) / 2.0f;
                rectF2.set(R16 - R18, R17 - R18, R16 + R18, R17 + R18);
                iv8Var4.m.set(rectF2);
                rectF11.set(rectF2);
                float f32 = (-hl.R1(hl.N(2.66f), hl.R1(hl.N(1.33f), hl.N(2.33f), profileStoriesView3.O), profileStoriesView3.O * f28)) * f27;
                rectF11.inset(f32, f32);
                i12 = i13 + 1;
                f25 = max2;
                f26 = L3;
            }
            f7 = 18.0f;
            paint3.setColor(vm2.f(profileStoriesView3.O, 1526726655, -2135178036));
            paint3.getAlpha();
            Paint a3 = r6bVar2.a(rectF);
            a3.setStrokeWidth(hl.R1(hl.N(2.33f), hl.N(f5), profileStoriesView3.O));
            paint3.setStrokeWidth(hl.R1(hl.N(1.125f), hl.N(f5), profileStoriesView3.O));
            paint2.setStrokeWidth(hl.R1(hl.N(1.125f), hl.N(f5), profileStoriesView3.O));
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                iv8 iv8Var5 = (iv8) arrayList4.get(i14);
                int i15 = i14 - 2;
                iv8 iv8Var6 = i15 >= 0 ? (iv8) arrayList4.get(i15) : null;
                int i16 = i14 - 1;
                iv8 d = d(iv8Var6, i16 >= 0 ? (iv8) arrayList4.get(i16) : null, iv8Var5);
                int i17 = i14 + 1;
                int i18 = i14 + 2;
                iv8 d2 = d(i17 < arrayList4.size() ? (iv8) arrayList4.get(i17) : null, i18 < arrayList4.size() ? (iv8) arrayList4.get(i18) : null, iv8Var5);
                if (d != null) {
                    RectF rectF12 = d.n;
                    float centerX = rectF12.centerX();
                    RectF rectF13 = iv8Var5.n;
                    RectF rectF14 = iv8Var5.n;
                    if (Math.abs(centerX - rectF13.centerX()) < Math.abs((rectF14.width() / 2.0f) - (rectF12.width() / 2.0f)) || Math.abs(rectF12.centerX() - rectF14.centerX()) > (rectF14.width() / 2.0f) + (rectF12.width() / 2.0f)) {
                        iv8Var = null;
                        if (d2 != null) {
                            RectF rectF15 = d2.n;
                            float centerX2 = rectF15.centerX();
                            RectF rectF16 = iv8Var5.n;
                            RectF rectF17 = iv8Var5.n;
                            if (Math.abs(centerX2 - rectF16.centerX()) < Math.abs((rectF17.width() / 2.0f) - (rectF15.width() / 2.0f)) || Math.abs(rectF15.centerX() - rectF17.centerX()) > (rectF17.width() / 2.0f) + (rectF15.width() / 2.0f)) {
                                iv8Var2 = null;
                                if (iv8Var5.k < 1.0f) {
                                    int alpha5 = a3.getAlpha();
                                    a3.setAlpha((int) ((1.0f - f6) * (1.0f - iv8Var5.k) * alpha5 * iv8Var5.j));
                                    profileStoriesView3.c(canvas, iv8Var, iv8Var5, iv8Var2, a3);
                                    paint4 = a3;
                                    paint4.setAlpha(alpha5);
                                } else {
                                    paint4 = a3;
                                }
                                if (iv8Var5.k > 0.0f) {
                                    Paint paint18 = iv8Var5.l ? paint2 : paint3;
                                    int alpha6 = paint18.getAlpha();
                                    paint18.setAlpha((int) ((1.0f - f6) * alpha6 * iv8Var5.j * iv8Var5.k));
                                    profileStoriesView3 = this;
                                    profileStoriesView3.c(canvas, iv8Var, iv8Var5, iv8Var2, paint18);
                                    paint18.setAlpha(alpha6);
                                } else {
                                    profileStoriesView3 = this;
                                }
                                i14 = i17;
                                a3 = paint4;
                            }
                        }
                        iv8Var2 = d2;
                        if (iv8Var5.k < 1.0f) {
                        }
                        if (iv8Var5.k > 0.0f) {
                        }
                        i14 = i17;
                        a3 = paint4;
                    }
                }
                iv8Var = d;
                if (d2 != null) {
                }
                iv8Var2 = d2;
                if (iv8Var5.k < 1.0f) {
                }
                if (iv8Var5.k > 0.0f) {
                }
                i14 = i17;
                a3 = paint4;
            }
            Paint paint19 = a3;
            float f33 = f25;
            profileStoriesView = profileStoriesView3;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView3.getWidth(), profileStoriesView3.getHeight(), (int) ((1.0f - f6) * profileStoriesView3.O * f4), 31);
            canvas3 = canvas;
            for (int size = arrayList4.size() - 1; size >= 0; size--) {
                iv8 iv8Var7 = (iv8) arrayList4.get(size);
                ImageReceiver imageReceiver = iv8Var7.b;
                ImageReceiver imageReceiver2 = iv8Var7.b;
                if (imageReceiver.R0) {
                    int saveCount = canvas3.getSaveCount();
                    int i19 = size - 1;
                    int i20 = size - 2;
                    profileStoriesView.a(canvas3, iv8Var7, d(i19 >= 0 ? (iv8) arrayList4.get(i19) : null, i20 >= 0 ? (iv8) arrayList4.get(i20) : null, iv8Var7));
                    imageReceiver2.k0(iv8Var7.m);
                    imageReceiver2.h(canvas3, null);
                    canvas3.restoreToCount(saveCount);
                }
            }
            canvas3.restore();
            paint = paint19;
            f8 = f33;
        }
        if (paint != null) {
            paint.setStrokeWidth(hl.N(2.3f));
        }
        canvas3.restore();
        float max3 = Math.max(0.0f, (profileStoriesView.O - 0.5f) * 2.0f);
        if (max3 > 0.0f) {
            float R19 = hl.R1(rectF6.right + hl.L(16.0f), f8 + hl.L(12.0f), profileStoriesView.O);
            float R110 = hl.R1(profileStoriesView.getWidth(), f3, profileStoriesView.O);
            float R111 = hl.R1(rectF6.centerY(), profileStoriesView.i0, profileStoriesView.O);
            hn hnVar = profileStoriesView.n;
            hnVar.setBounds((int) R19, (int) (R111 - hl.L(f7)), (int) R110, (int) (R111 + hl.L(f7)));
            hnVar.C = (int) (max3 * f4);
            hnVar.draw(canvas3);
        }
    }

    public final void f(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        c6b c6bVar;
        int i3;
        boolean z3;
        String str;
        TLRPC.PeerColor peerColor;
        TLRPC.PeerColor peerColor2;
        TL_stories.StoryItem storyItem;
        int i4;
        int i5;
        int i6;
        if (this.e) {
            return;
        }
        int i7 = this.c;
        long e = yac.h(i7).e();
        long j = this.d;
        int i8 = 0;
        boolean z4 = j == e;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        TL_stories.PeerStories y = uc7.s1(i7).O1().y(j);
        TL_stories.PeerStories x = uc7.s1(i7).O1().x(j);
        TL_stories.PeerStories peerStories = j == 0 ? null : y;
        int max = y != null ? Math.max(0, y.max_read_id) : 0;
        if (x != null) {
            max = Math.max(max, x.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z5 = true;
        int i9 = this.r;
        this.r = 0;
        boolean z6 = z4;
        int i10 = 0;
        while (i8 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i8);
            int i11 = i8;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > max) {
                    this.r++;
                }
                i10++;
            }
            i8 = i11 + 1;
        }
        int i12 = 0;
        while (true) {
            i = i9;
            if (i12 >= arrayList.size()) {
                i2 = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i12);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i6 = i12;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i13 = storyItem3.id;
                    i6 = i12;
                    if (x != null) {
                        for (int i14 = 0; i14 < x.stories.size(); i14++) {
                            if (x.stories.get(i14).id == i13) {
                                storyItem3 = x.stories.get(i14);
                                break;
                            }
                        }
                    }
                    storyItem3 = storyItem3;
                    boolean z7 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z7) {
                        if (y != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= y.stories.size()) {
                                    break;
                                }
                                if (y.stories.get(i15).id == i13) {
                                    y.stories.get(i15);
                                    break;
                                }
                                i15++;
                            }
                        }
                    } else if (z7) {
                        continue;
                    }
                } else {
                    i6 = i12;
                }
                int i16 = storyItem3.expire_date;
                if ((i16 == 0 || currentTime <= i16) && (z6 || storyItem3.id > max)) {
                    arrayList3.add(storyItem3);
                    i2 = 3;
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
            i12 = i6 + 1;
            i9 = i;
        }
        if (arrayList3.size() < i2) {
            for (int i17 = 0; i17 < arrayList.size(); i17 = i4 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i17);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i18 = storyItem4.id;
                    i4 = i17;
                    if (x != null) {
                        int i19 = 0;
                        while (true) {
                            if (i19 >= x.stories.size()) {
                                break;
                            }
                            if (x.stories.get(i19).id == i18) {
                                storyItem4 = x.stories.get(i19);
                                break;
                            }
                            i19++;
                        }
                    }
                    boolean z8 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z8) {
                        if (y != null) {
                            int i20 = 0;
                            while (true) {
                                if (i20 >= y.stories.size()) {
                                    break;
                                }
                                if (y.stories.get(i20).id == i18) {
                                    y.stories.get(i20);
                                    break;
                                }
                                i20++;
                            }
                        }
                    } else if (z8) {
                        continue;
                    }
                } else {
                    i4 = i17;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i5 = storyItem4.expire_date) == 0 || currentTime <= i5) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i21 = 0;
        while (true) {
            arrayList2 = this.x;
            int size = arrayList2.size();
            c6bVar = this.N;
            i3 = -1;
            if (i21 >= size) {
                break;
            }
            iv8 iv8Var = (iv8) arrayList2.get(i21);
            int i22 = 0;
            while (true) {
                if (i22 >= arrayList3.size()) {
                    i22 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i22);
                    if (storyItem.id == iv8Var.a) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            if (i22 == -1) {
                iv8Var.e = 0.0f;
            } else {
                iv8Var.c = i22;
                iv8Var.d = (z6 || !(peerStories == null || storyItem == null || storyItem.id > c6bVar.w(j))) ? z5 : false;
            }
            if (!z) {
                boolean z9 = z5;
                iv8Var.f.f(iv8Var.d, z9);
                iv8Var.g.e(z9, iv8Var.c);
                iv8Var.h.e(z9, iv8Var.e);
            }
            i21++;
            z5 = true;
        }
        int i23 = 0;
        while (i23 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i23);
            int i24 = 0;
            while (true) {
                if (i24 >= arrayList2.size()) {
                    i24 = i3;
                    break;
                } else if (((iv8) arrayList2.get(i24)).a == storyItem5.id) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i24 == i3) {
                storyItem5.dialogId = j;
                iv8 iv8Var2 = new iv8(this, storyItem5);
                iv8Var2.c = i23;
                iv8Var2.e = 1.0f;
                mm mmVar = iv8Var2.h;
                mmVar.e(true, 0.0f);
                boolean z10 = z6 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                iv8Var2.d = z10;
                if (!z) {
                    iv8Var2.f.f(z10, true);
                    iv8Var2.g.e(true, iv8Var2.c);
                    mmVar.e(true, iv8Var2.e);
                }
                arrayList2.add(iv8Var2);
            }
            i23++;
            i3 = -1;
        }
        this.w = null;
        int i25 = 0;
        while (true) {
            if (i25 >= arrayList2.size()) {
                break;
            }
            iv8 iv8Var3 = (iv8) arrayList2.get(i25);
            if (iv8Var3.e > 0.0f) {
                this.w = iv8Var3;
                break;
            }
            i25++;
        }
        ArrayList E = c6bVar.E(j);
        this.K = E == null ? 0 : E.size();
        int max2 = Math.max(arrayList3.size(), i10);
        int i26 = (max2 != 0 || this.K == 0) ? max2 : 1;
        if (z2 && z && i26 == this.s + 1 && this.r == i + 1) {
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b0 = ofFloat;
            ofFloat.addUpdateListener(new lk(this, zArr, (byte) 21));
            this.b0.addListener(new wd8(this, zArr, (byte) 4));
            c00.o(3.0f, this.b0);
            this.b0.setDuration(400L);
            this.b0.setStartDelay(120L);
            this.b0.start();
        }
        this.s = i26;
        if (i26 > 0) {
            z3 = false;
            str = ob6.G(i26, "Stories", new Object[0]);
        } else {
            z3 = false;
            str = "";
        }
        if (z && !ob6.a0) {
            z3 = true;
        }
        this.n.t(str, z3, true);
        r6b r6bVar = this.M;
        if (j >= 0) {
            TLRPC.User X1 = uc7.s1(i7).X1(Long.valueOf(j));
            if (X1 != null) {
                TLRPC.EmojiStatus emojiStatus = X1.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    r6bVar.c(kc7.a(emojiStatus), z);
                }
            }
            r6bVar.getClass();
            int i27 = (X1 == null || (peerColor2 = X1.profile_color) == null) ? -1 : peerColor2.color;
            lc7 lc7Var = uc7.s1(r6bVar.a).G3;
            r6bVar.c(lc7Var == null ? null : lc7Var.d(i27), z);
        } else {
            TLRPC.Chat M0 = uc7.s1(i7).M0(Long.valueOf(-j));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    r6bVar.c(kc7.a(emojiStatus2), z);
                }
            }
            r6bVar.getClass();
            int i28 = (M0 == null || (peerColor = M0.profile_color) == null) ? -1 : peerColor.color;
            lc7 lc7Var2 = uc7.s1(r6bVar.a).G3;
            r6bVar.c(lc7Var2 == null ? null : lc7Var2.d(i28), z);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.J;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                jn7.f(this.c).b(this, jn7.y5);
                return;
            } else {
                ((iv8) arrayList.get(i)).b.I();
                i++;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.y = false;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                jn7.f(this.c).n(this, jn7.y5);
                return;
            } else {
                ((iv8) arrayList.get(i)).b.K();
                i++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.O < 0.9f ? this.R.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.g0 && motionEvent.getX() <= this.h0 && Math.abs(motionEvent.getY() - this.i0) < ((float) hl.L(32.0f));
        hv8 hv8Var = this.p0;
        if (contains && motionEvent.getAction() == 0) {
            this.q0 = System.currentTimeMillis();
            this.r0 = motionEvent.getX();
            this.s0 = motionEvent.getY();
            hl.r(hv8Var);
            hl.d3(hv8Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            hl.r(hv8Var);
            if (contains && System.currentTimeMillis() - this.q0 <= ViewConfiguration.getTapTimeout() && dte.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) <= hl.L(12.0f)) {
                c6b c6bVar = this.N;
                long j = this.d;
                if (c6bVar.L(j) || c6bVar.J(j) || !this.x.isEmpty()) {
                    e(this.o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.q0 = -1L;
            hl.r(hv8Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f) {
        if (aob.I.o()) {
            return;
        }
        this.P = f;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.O != f) {
            this.O = f;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f) {
        if (this.J == f) {
            return;
        }
        this.J = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.I == f) {
            return;
        }
        this.I = f;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void e(xh4 xh4Var) {
    }
}
