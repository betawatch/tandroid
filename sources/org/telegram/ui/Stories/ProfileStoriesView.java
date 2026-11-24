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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class ProfileStoriesView extends View implements gk7 {
    public static final /* synthetic */ int t0 = 0;
    public ty8 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public f2b L;
    public final v2b M;
    public final g2b N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final lm U;
    public final lm V;
    public final lm W;
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
    public final oc6 f;
    public final Path f0;
    public float g0;
    public final xm8 h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final lm m0;
    public final gn n;
    public final lm n0;
    public final pj4 o0;
    public final yr8 p0;
    public long q0;
    public int r;
    public float r0;
    public int s;
    public float s0;
    public zr8 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i, long j, boolean z, oc6 oc6Var, xm8 xm8Var, wjb wjbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        gn gnVar = new gn(false, true, true);
        this.n = gnVar;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new v2b(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        s33 s33Var = s33.h;
        this.U = new lm(this, 0L, 480L, s33Var);
        this.V = new lm(this, 0L, 240L, s33Var);
        this.W = new lm(this, 0L, 150L, s33.f);
        this.a0 = 1.0f;
        this.c0 = new Path();
        this.d0 = new Matrix();
        this.e0 = new PathMeasure();
        this.f0 = new Path();
        this.m0 = new lm(this, 0L, 350L, s33Var);
        this.n0 = new lm(this, 0L, 350L, s33Var);
        an8 an8Var = (an8) this;
        this.o0 = new pj4(an8Var, (byte) 28);
        this.p0 = new yr8(an8Var, (byte) 0);
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = oc6Var;
        this.h = xm8Var;
        xm8Var.getImageReceiver().F1 = new yr8(an8Var, (byte) 1);
        this.N = na7.q1(i).M1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(gl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(bkb.v0(bkb.dl, wjbVar));
        paint2.setStrokeWidth(gl.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(bkb.v0(bkb.c6, wjbVar));
        gnVar.w(gl.L(18.0f));
        gnVar.n(0.4f, 320L, s33Var);
        gnVar.x(gl.o());
        gnVar.u(-1);
        gnVar.q(true);
        gnVar.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(gl.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static zr8 d(zr8 zr8Var, zr8 zr8Var2, zr8 zr8Var3) {
        if (zr8Var3 == null) {
            return null;
        }
        RectF rectF = zr8Var3.n;
        if (zr8Var == null) {
            if (zr8Var2 != null) {
                return zr8Var2;
            }
            return null;
        }
        RectF rectF2 = zr8Var.n;
        if (zr8Var2 != null) {
            RectF rectF3 = zr8Var2.n;
            if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) <= Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                return zr8Var2;
            }
        }
        return zr8Var;
    }

    private float getExpandRight() {
        return this.j0 - (this.m0.d(this.l0) * gl.L(71.0f));
    }

    public final void a(Canvas canvas, zr8 zr8Var, zr8 zr8Var2) {
        if (zr8Var2 == null) {
            return;
        }
        RectF rectF = zr8Var2.m;
        RectF rectF2 = gl.P;
        rectF2.set(rectF);
        float f = -(gl.N(1.66f) * zr8Var2.j);
        rectF2.inset(f, f);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = zr8Var.m;
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
        if (!hc2.b0(y6c.t0, this.d)) {
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

    public final void c(Canvas canvas, zr8 zr8Var, zr8 zr8Var2, zr8 zr8Var3, Paint paint) {
        zr8 zr8Var4 = zr8Var;
        RectF rectF = zr8Var2.n;
        if (zr8Var4 != null) {
            RectF rectF2 = zr8Var4.n;
            if (zr8Var3 != null) {
                RectF rectF3 = zr8Var3.n;
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
            if (zr8Var3 == null) {
                b(0.0f, 360.0f, canvas, paint, rectF);
                return;
            }
            zr8Var4 = zr8Var3;
        }
        RectF rectF4 = zr8Var4.n;
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

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x5) {
            f(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        v2b v2bVar;
        float f3;
        long j;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        v2b v2bVar2;
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
        zr8 zr8Var;
        zr8 zr8Var2;
        Paint paint4;
        xm8 xm8Var;
        ArrayList arrayList5;
        boolean z;
        ArrayList arrayList6;
        float f9;
        RectF rectF3;
        float f10;
        Paint paint5;
        int i;
        float f11;
        v2b v2bVar3;
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
        f2b f2bVar;
        ProfileStoriesView profileStoriesView3 = this;
        Canvas canvas3 = canvas;
        float e = profileStoriesView3.n0.e(false, profileStoriesView3.h0);
        oc6 oc6Var = profileStoriesView3.f;
        float i2 = Utilities.i((oc6Var.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float R1 = gl.R1(gl.N(4.0f), gl.N(3.5f), i2) * profileStoriesView3.I;
        float scaleX = (oc6Var.getScaleX() * R1) + oc6Var.getX();
        float scaleY = (oc6Var.getScaleY() * R1) + oc6Var.getY();
        float f15 = R1 * 2.0f;
        float scaleX2 = oc6Var.getScaleX() * (oc6Var.getWidth() - f15);
        float scaleY2 = (oc6Var.getScaleY() * (oc6Var.getHeight() - f15)) + scaleY;
        RectF rectF6 = profileStoriesView3.Q;
        rectF6.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f16 = profileStoriesView3.g0;
        int i3 = 0;
        while (true) {
            arrayList = profileStoriesView3.x;
            if (i3 >= arrayList.size()) {
                break;
            }
            zr8 zr8Var3 = (zr8) arrayList.get(i3);
            float e2 = zr8Var3.h.e(false, zr8Var3.e);
            zr8Var3.j = e2;
            if (e2 > 0.0f || zr8Var3.e > 0.0f) {
                zr8Var3.i = zr8Var3.g.e(false, zr8Var3.c);
                zr8Var3.k = zr8Var3.f.d(zr8Var3.d);
                if (i3 > 0 && ((zr8) arrayList.get(i3 - 1)).i > zr8Var3.i) {
                    Collections.sort(arrayList, new fx7((byte) 7));
                    break;
                }
            } else {
                zr8Var3.b.K();
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        float i4 = Utilities.i(1.0f - (profileStoriesView3.O / 0.2f), 1.0f, 0.0f);
        g2b g2bVar = profileStoriesView3.N;
        long j2 = profileStoriesView3.d;
        boolean P = g2bVar.P(j2);
        boolean L = g2bVar.L(j2);
        lm lmVar = profileStoriesView3.W;
        if (!L && (f2bVar = profileStoriesView3.L) != null && f2bVar.w) {
            profileStoriesView3.F = false;
            profileStoriesView3.G = false;
            lmVar.getClass();
            lmVar.e(true, 0.0f);
        }
        float R12 = gl.R1(0.0f, lmVar.d((L && !P) || (profileStoriesView3.F && !profileStoriesView3.G)), profileStoriesView3.J);
        canvas3.save();
        float f17 = profileStoriesView3.H;
        canvas3.scale(f17, f17, rectF6.centerX(), rectF6.centerY());
        float R13 = gl.R1(rectF6.centerY(), profileStoriesView3.k0, profileStoriesView3.O);
        profileStoriesView3.L = null;
        lm lmVar2 = profileStoriesView3.V;
        lm lmVar3 = profileStoriesView3.U;
        xm8 xm8Var2 = profileStoriesView3.h;
        v2b v2bVar4 = profileStoriesView3.M;
        RectF rectF7 = profileStoriesView3.R;
        if (R12 > 0.0f) {
            rectF7.set(rectF6);
            f2 = R12;
            rectF7.inset(-gl.N(3.775f), -gl.N(3.775f));
            Paint a2 = v2bVar4.a(rectF7);
            if (profileStoriesView3.E == null) {
                ty8 ty8Var = new ty8(profileStoriesView3);
                profileStoriesView3.E = ty8Var;
                v2bVar = v2bVar4;
                f3 = e;
                arrayList2 = arrayList;
                ty8Var.d(null, true, false);
                profileStoriesView3.E.s = hc2.b0(y6c.t0, j2);
            } else {
                v2bVar = v2bVar4;
                f3 = e;
                arrayList2 = arrayList;
            }
            if (!g2bVar.L(j2) || g2bVar.P(j2)) {
                f14 = 1.0f;
            } else {
                ArrayList E = g2bVar.E(j2);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView3.L = (f2b) E.get(0);
                    }
                    float f18 = 0.0f;
                    for (int i5 = 0; i5 < E.size(); i5++) {
                        f18 += ((f2b) E.get(i5)).h;
                    }
                    f14 = f18 / E.size();
                } else {
                    f14 = 0.0f;
                }
            }
            profileStoriesView3.E.q = 0;
            int alpha = a2.getAlpha();
            a2.setAlpha((int) (alpha * i4 * f2));
            a2.setStrokeWidth(gl.N(2.33f));
            ty8 ty8Var2 = profileStoriesView3.E;
            ty8Var2.r = a2;
            f = i2;
            j = j2;
            ty8Var2.f((int) rectF7.left, (int) rectF7.top, (int) rectF7.right, (int) rectF7.bottom);
            profileStoriesView3.E.e(true, Utilities.i(f14, 1.0f, 0.0f));
            if (xm8Var2.R) {
                profileStoriesView3.E.a(canvas3);
            }
            a2.setAlpha(alpha);
            profileStoriesView3.F = true;
            boolean z2 = profileStoriesView3.G;
            boolean z3 = profileStoriesView3.E.f >= 0.98f;
            profileStoriesView3.G = z3;
            if (z2 != z3) {
                lmVar3.e(true, profileStoriesView3.s);
                lmVar2.e(true, profileStoriesView3.r);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(s33.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                u28 u28Var = new u28(profileStoriesView3, (byte) 19);
                ofFloat.addUpdateListener(u28Var);
                ofFloat2.addUpdateListener(u28Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new l48(profileStoriesView3, (byte) 24));
                animatorSet.start();
            }
            paint = a2;
        } else {
            f = i2;
            f2 = R12;
            v2bVar = v2bVar4;
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
            float e3 = lmVar3.e(false, profileStoriesView3.s);
            float e4 = lmVar2.e(false, profileStoriesView3.r);
            if (P) {
                rectF7.set(rectF6);
                rectF7.inset(-gl.N(3.775f), -gl.N(3.775f));
                if (x2b.d == null) {
                    kz4 kz4Var = new kz4();
                    x2b.d = kz4Var;
                    kz4Var.a = true;
                    kz4Var.b = true;
                    kz4Var.c.setStrokeWidth(gl.N(2.0f));
                    x2b.d.c.setStyle(Paint.Style.STROKE);
                    x2b.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int w0 = bkb.w0(null, bkb.nk, false);
                int w02 = bkb.w0(null, bkb.p7, false);
                x2b.d.d(bm2.f(0.25f, w0, w02), w02, 0, 0);
                x2b.d.b(rectF7.left, rectF7.top, rectF7.right, rectF7.bottom);
                Paint paint10 = x2b.d.c;
                paint10.setStrokeWidth(gl.L(2.0f));
                paint10.setAlpha((int) (f6 * 255.0f));
                if (hc2.b0(y6c.t0, j)) {
                    float height = rectF7.height() * 0.32f;
                    canvas3.drawRoundRect(rectF7, height, height, paint10);
                } else {
                    canvas3.drawCircle(rectF7.centerX(), rectF7.centerY(), rectF7.width() / 2.0f, paint10);
                }
            } else if ((profileStoriesView3.w != null || profileStoriesView3.K > 0) && f6 > 0.0f) {
                rectF7.set(rectF6);
                rectF7.inset(-gl.N(3.775f), -gl.N(3.775f));
                rectF8.set(rectF6);
                rectF8.inset(-gl.N(3.41f), -gl.N(3.41f));
                float f19 = f;
                gl.X1(rectF7, rectF8, f19, rectF8);
                RectF rectF9 = rectF8;
                Paint paint11 = paint;
                float R14 = gl.R1(0.0f, (float) ((gl.N(4.23f) / (rectF6.width() * 3.141592653589793d)) * 360.0d), Utilities.i(e3 - 1.0f, 1.0f, 0.0f) * f6);
                int min = Math.min(profileStoriesView3.s, 50);
                float min2 = Math.min(e3, 50.0f);
                int i6 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i6 = 0;
                }
                float R15 = gl.R1(i6 << 1, R14, f19);
                float max = (360.0f - (Math.max(0.0f, min2) * R15)) / Math.max(1.0f, min2);
                paint8.setColor(bm2.f(profileStoriesView3.P, 1526726655, 973078528));
                paint8.getAlpha();
                float f20 = (-90.0f) - (R15 / 2.0f);
                boolean z4 = false;
                int i7 = 0;
                while (true) {
                    xm8Var = xm8Var2;
                    if (i7 >= min) {
                        break;
                    }
                    if (i7 < arrayList2.size()) {
                        ArrayList arrayList8 = arrayList2;
                        arrayList7 = arrayList8;
                        if (((zr8) arrayList8.get(i7)).l) {
                            z4 = true;
                        }
                    } else {
                        arrayList7 = arrayList2;
                    }
                    i7++;
                    xm8Var2 = xm8Var;
                    arrayList2 = arrayList7;
                }
                ArrayList arrayList9 = arrayList2;
                if (z4) {
                    RectF rectF10 = gl.P;
                    rectF10.set(rectF9);
                    rectF10.inset(-gl.L(12.0f), -gl.L(12.0f));
                    canvas3.saveLayerAlpha(rectF10, kk7.d4, 31);
                    float z5 = oo1.z(profileStoriesView3.a0, 1.0f, 2.5f, 1.0f);
                    if (z5 != 1.0f) {
                        canvas3.save();
                        canvas3.scale(z5, z5, rectF7.centerX(), rectF7.centerY());
                    }
                    int alpha2 = paint9.getAlpha();
                    paint9.setAlpha((int) (alpha2 * f6));
                    rectF10.set(rectF9);
                    rectF10.inset(-gl.L(3.0f), -gl.L(3.0f));
                    paint9.setStrokeWidth(gl.N(2.5f));
                    profileStoriesView3.b(0.0f, 360.0f, canvas3, paint9, rectF9);
                    paint9.setAlpha(alpha2);
                    if (z5 != 1.0f) {
                        canvas3.restore();
                    }
                    paint3 = paint8;
                    arrayList3 = arrayList9;
                    rectF = rectF7;
                    rectF2 = rectF9;
                    v2bVar2 = v2bVar;
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
                            v2bVar3 = v2bVar;
                            f13 = max;
                            rectF4 = rectF7;
                            paint5 = paint14;
                            f11 = min2;
                            paint6 = paint15;
                        } else {
                            float z6 = i8 == 0 ? oo1.z(profileStoriesView4.a0, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (z6 != 1.0f) {
                                canvas4.save();
                                canvas4.scale(z6, z6, rectF7.centerX(), rectF7.centerY());
                            }
                            if (i8 < arrayList9.size()) {
                                arrayList5 = arrayList9;
                                if (((zr8) arrayList5.get(i8)).l) {
                                    z = true;
                                    if (i9 >= 1.0f) {
                                        v2b v2bVar5 = v2bVar;
                                        if (z) {
                                            a = paint11;
                                            paint7 = paint14;
                                        } else {
                                            a = v2bVar5.a(rectF7);
                                            paint7 = a;
                                        }
                                        f9 = R15;
                                        int alpha3 = paint7.getAlpha();
                                        arrayList6 = arrayList5;
                                        Paint paint16 = paint7;
                                        paint16.setAlpha((int) tb4.z(1.0f, i9, alpha3, f6));
                                        paint16.setStrokeWidth(gl.N(z ? 3.0f : 2.33f));
                                        f12 = i9;
                                        rectF3 = rectF7;
                                        paint5 = paint14;
                                        f11 = min2;
                                        paint6 = paint15;
                                        f10 = f22;
                                        i = min;
                                        v2bVar3 = v2bVar5;
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
                                        v2bVar3 = v2bVar;
                                        paint6 = paint15;
                                        f12 = i9;
                                    }
                                    if (f12 <= 0.0f) {
                                        Paint paint17 = z ? paint5 : paint6;
                                        int alpha4 = paint17.getAlpha();
                                        paint17.setAlpha((int) (alpha4 * f12 * f6));
                                        paint17.setStrokeWidth(gl.N(z ? 3.0f : 1.5f));
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
                        v2bVar = v2bVar3;
                        min = i;
                    }
                    paint3 = paint13;
                    arrayList3 = arrayList9;
                    rectF = rectF7;
                    rectF2 = rectF9;
                    v2bVar2 = v2bVar;
                    paint2 = paint12;
                    profileStoriesView3 = profileStoriesView4;
                    canvas3 = canvas4;
                    paint = paint11;
                }
                if (z4) {
                    x2b.k(f6, profileStoriesView3.J, canvas3, rectF2, xm8Var.getImageReceiver().R0);
                    canvas3.restore();
                }
            }
            rectF = rectF7;
            v2bVar2 = v2bVar;
            arrayList3 = arrayList2;
            paint2 = paint9;
            rectF2 = rectF8;
            paint3 = paint8;
            paint = paint;
        } else {
            rectF = rectF7;
            v2bVar2 = v2bVar;
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
                float f24 = ((zr8) arrayList4.get(i11)).j;
                gl.L(14.0f);
                i11++;
            }
            float f25 = f16;
            int i12 = 0;
            float f26 = 0.0f;
            while (i12 < arrayList4.size()) {
                zr8 zr8Var4 = (zr8) arrayList4.get(i12);
                float f27 = zr8Var4.j;
                RectF rectF11 = zr8Var4.n;
                int i13 = i12;
                float f28 = zr8Var4.k;
                float L2 = (gl.L(28.0f) / 2.0f) * f27;
                float f29 = profileStoriesView3.g0 + L2 + f26;
                float L3 = f26 + (gl.L(18.0f) * f27);
                float f30 = f29 + L2;
                float max2 = Math.max(f25, f30);
                rectF.set(f29 - L2, R13 - L2, f30, R13 + L2);
                float f31 = profileStoriesView3.O;
                float R16 = gl.R1(rectF6.centerX(), rectF.centerX(), f31);
                float R17 = gl.R1(rectF6.centerY(), rectF.centerY(), f31);
                float R18 = gl.R1(Math.min(rectF6.width(), rectF6.height()), Math.min(rectF.width(), rectF.height()), f31) / 2.0f;
                rectF2.set(R16 - R18, R17 - R18, R16 + R18, R17 + R18);
                zr8Var4.m.set(rectF2);
                rectF11.set(rectF2);
                float f32 = (-gl.R1(gl.N(2.66f), gl.R1(gl.N(1.33f), gl.N(2.33f), profileStoriesView3.O), profileStoriesView3.O * f28)) * f27;
                rectF11.inset(f32, f32);
                i12 = i13 + 1;
                f25 = max2;
                f26 = L3;
            }
            f7 = 18.0f;
            paint3.setColor(bm2.f(profileStoriesView3.O, 1526726655, -2135178036));
            paint3.getAlpha();
            Paint a3 = v2bVar2.a(rectF);
            a3.setStrokeWidth(gl.R1(gl.N(2.33f), gl.N(f5), profileStoriesView3.O));
            paint3.setStrokeWidth(gl.R1(gl.N(1.125f), gl.N(f5), profileStoriesView3.O));
            paint2.setStrokeWidth(gl.R1(gl.N(1.125f), gl.N(f5), profileStoriesView3.O));
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                zr8 zr8Var5 = (zr8) arrayList4.get(i14);
                int i15 = i14 - 2;
                zr8 zr8Var6 = i15 >= 0 ? (zr8) arrayList4.get(i15) : null;
                int i16 = i14 - 1;
                zr8 d = d(zr8Var6, i16 >= 0 ? (zr8) arrayList4.get(i16) : null, zr8Var5);
                int i17 = i14 + 1;
                int i18 = i14 + 2;
                zr8 d2 = d(i17 < arrayList4.size() ? (zr8) arrayList4.get(i17) : null, i18 < arrayList4.size() ? (zr8) arrayList4.get(i18) : null, zr8Var5);
                if (d != null) {
                    RectF rectF12 = d.n;
                    float centerX = rectF12.centerX();
                    RectF rectF13 = zr8Var5.n;
                    RectF rectF14 = zr8Var5.n;
                    if (Math.abs(centerX - rectF13.centerX()) < Math.abs((rectF14.width() / 2.0f) - (rectF12.width() / 2.0f)) || Math.abs(rectF12.centerX() - rectF14.centerX()) > (rectF14.width() / 2.0f) + (rectF12.width() / 2.0f)) {
                        zr8Var = null;
                        if (d2 != null) {
                            RectF rectF15 = d2.n;
                            float centerX2 = rectF15.centerX();
                            RectF rectF16 = zr8Var5.n;
                            RectF rectF17 = zr8Var5.n;
                            if (Math.abs(centerX2 - rectF16.centerX()) < Math.abs((rectF17.width() / 2.0f) - (rectF15.width() / 2.0f)) || Math.abs(rectF15.centerX() - rectF17.centerX()) > (rectF17.width() / 2.0f) + (rectF15.width() / 2.0f)) {
                                zr8Var2 = null;
                                if (zr8Var5.k < 1.0f) {
                                    int alpha5 = a3.getAlpha();
                                    a3.setAlpha((int) ((1.0f - f6) * (1.0f - zr8Var5.k) * alpha5 * zr8Var5.j));
                                    profileStoriesView3.c(canvas, zr8Var, zr8Var5, zr8Var2, a3);
                                    paint4 = a3;
                                    paint4.setAlpha(alpha5);
                                } else {
                                    paint4 = a3;
                                }
                                if (zr8Var5.k > 0.0f) {
                                    Paint paint18 = zr8Var5.l ? paint2 : paint3;
                                    int alpha6 = paint18.getAlpha();
                                    paint18.setAlpha((int) ((1.0f - f6) * alpha6 * zr8Var5.j * zr8Var5.k));
                                    profileStoriesView3 = this;
                                    profileStoriesView3.c(canvas, zr8Var, zr8Var5, zr8Var2, paint18);
                                    paint18.setAlpha(alpha6);
                                } else {
                                    profileStoriesView3 = this;
                                }
                                i14 = i17;
                                a3 = paint4;
                            }
                        }
                        zr8Var2 = d2;
                        if (zr8Var5.k < 1.0f) {
                        }
                        if (zr8Var5.k > 0.0f) {
                        }
                        i14 = i17;
                        a3 = paint4;
                    }
                }
                zr8Var = d;
                if (d2 != null) {
                }
                zr8Var2 = d2;
                if (zr8Var5.k < 1.0f) {
                }
                if (zr8Var5.k > 0.0f) {
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
                zr8 zr8Var7 = (zr8) arrayList4.get(size);
                ImageReceiver imageReceiver = zr8Var7.b;
                ImageReceiver imageReceiver2 = zr8Var7.b;
                if (imageReceiver.R0) {
                    int saveCount = canvas3.getSaveCount();
                    int i19 = size - 1;
                    int i20 = size - 2;
                    profileStoriesView.a(canvas3, zr8Var7, d(i19 >= 0 ? (zr8) arrayList4.get(i19) : null, i20 >= 0 ? (zr8) arrayList4.get(i20) : null, zr8Var7));
                    imageReceiver2.k0(zr8Var7.m);
                    imageReceiver2.h(canvas3, null);
                    canvas3.restoreToCount(saveCount);
                }
            }
            canvas3.restore();
            paint = paint19;
            f8 = f33;
        }
        if (paint != null) {
            paint.setStrokeWidth(gl.N(2.3f));
        }
        canvas3.restore();
        float max3 = Math.max(0.0f, (profileStoriesView.O - 0.5f) * 2.0f);
        if (max3 > 0.0f) {
            float R19 = gl.R1(rectF6.right + gl.L(16.0f), f8 + gl.L(12.0f), profileStoriesView.O);
            float R110 = gl.R1(profileStoriesView.getWidth(), f3, profileStoriesView.O);
            float R111 = gl.R1(rectF6.centerY(), profileStoriesView.i0, profileStoriesView.O);
            gn gnVar = profileStoriesView.n;
            gnVar.setBounds((int) R19, (int) (R111 - gl.L(f7)), (int) R110, (int) (R111 + gl.L(f7)));
            gnVar.C = (int) (max3 * f4);
            gnVar.draw(canvas3);
        }
    }

    public final void f(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        g2b g2bVar;
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
        long e = y6c.h(i7).e();
        long j = this.d;
        int i8 = 0;
        boolean z4 = j == e;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        TL_stories.PeerStories y = na7.q1(i7).M1().y(j);
        TL_stories.PeerStories x = na7.q1(i7).M1().x(j);
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
            g2bVar = this.N;
            i3 = -1;
            if (i21 >= size) {
                break;
            }
            zr8 zr8Var = (zr8) arrayList2.get(i21);
            int i22 = 0;
            while (true) {
                if (i22 >= arrayList3.size()) {
                    i22 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i22);
                    if (storyItem.id == zr8Var.a) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            if (i22 == -1) {
                zr8Var.e = 0.0f;
            } else {
                zr8Var.c = i22;
                zr8Var.d = (z6 || !(peerStories == null || storyItem == null || storyItem.id > g2bVar.w(j))) ? z5 : false;
            }
            if (!z) {
                boolean z9 = z5;
                zr8Var.f.f(zr8Var.d, z9);
                zr8Var.g.e(z9, zr8Var.c);
                zr8Var.h.e(z9, zr8Var.e);
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
                } else if (((zr8) arrayList2.get(i24)).a == storyItem5.id) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i24 == i3) {
                storyItem5.dialogId = j;
                zr8 zr8Var2 = new zr8(this, storyItem5);
                zr8Var2.c = i23;
                zr8Var2.e = 1.0f;
                lm lmVar = zr8Var2.h;
                lmVar.e(true, 0.0f);
                boolean z10 = z6 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                zr8Var2.d = z10;
                if (!z) {
                    zr8Var2.f.f(z10, true);
                    zr8Var2.g.e(true, zr8Var2.c);
                    lmVar.e(true, zr8Var2.e);
                }
                arrayList2.add(zr8Var2);
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
            zr8 zr8Var3 = (zr8) arrayList2.get(i25);
            if (zr8Var3.e > 0.0f) {
                this.w = zr8Var3;
                break;
            }
            i25++;
        }
        ArrayList E = g2bVar.E(j);
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
            ofFloat.addUpdateListener(new pk(this, zArr, (byte) 21));
            this.b0.addListener(new eh8(this, zArr, (byte) 3));
            b00.n(3.0f, this.b0);
            this.b0.setDuration(400L);
            this.b0.setStartDelay(120L);
            this.b0.start();
        }
        this.s = i26;
        if (i26 > 0) {
            z3 = false;
            str = k96.G(i26, "Stories", new Object[0]);
        } else {
            z3 = false;
            str = "";
        }
        if (z && !k96.a0) {
            z3 = true;
        }
        this.n.t(str, z3, true);
        v2b v2bVar = this.M;
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(j));
            if (V1 != null) {
                TLRPC.EmojiStatus emojiStatus = V1.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    v2bVar.c(da7.a(emojiStatus), z);
                }
            }
            v2bVar.getClass();
            int i27 = (V1 == null || (peerColor2 = V1.profile_color) == null) ? -1 : peerColor2.color;
            ea7 ea7Var = na7.q1(v2bVar.a).F3;
            v2bVar.c(ea7Var == null ? null : ea7Var.d(i27), z);
        } else {
            TLRPC.Chat K0 = na7.q1(i7).K0(Long.valueOf(-j));
            if (K0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = K0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    v2bVar.c(da7.a(emojiStatus2), z);
                }
            }
            v2bVar.getClass();
            int i28 = (K0 == null || (peerColor = K0.profile_color) == null) ? -1 : peerColor.color;
            ea7 ea7Var2 = na7.q1(v2bVar.a).F3;
            v2bVar.c(ea7Var2 == null ? null : ea7Var2.d(i28), z);
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
                kk7.f(this.c).b(this, kk7.x5);
                return;
            } else {
                ((zr8) arrayList.get(i)).b.I();
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
                kk7.f(this.c).n(this, kk7.x5);
                return;
            } else {
                ((zr8) arrayList.get(i)).b.K();
                i++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.O < 0.9f ? this.R.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.g0 && motionEvent.getX() <= this.h0 && Math.abs(motionEvent.getY() - this.i0) < ((float) gl.L(32.0f));
        yr8 yr8Var = this.p0;
        if (contains && motionEvent.getAction() == 0) {
            this.q0 = System.currentTimeMillis();
            this.r0 = motionEvent.getX();
            this.s0 = motionEvent.getY();
            gl.r(yr8Var);
            gl.d3(yr8Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            gl.r(yr8Var);
            if (contains && System.currentTimeMillis() - this.q0 <= ViewConfiguration.getTapTimeout() && loe.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) <= gl.L(12.0f)) {
                g2b g2bVar = this.N;
                long j = this.d;
                if (g2bVar.L(j) || g2bVar.J(j) || !this.x.isEmpty()) {
                    e(this.o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.q0 = -1L;
            gl.r(yr8Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f) {
        if (bkb.I.o()) {
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

    public void e(pj4 pj4Var) {
    }
}
