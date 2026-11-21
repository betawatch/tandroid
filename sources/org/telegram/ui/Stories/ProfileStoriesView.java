package org.telegram.ui.Stories;

import a3.c;
import a8.w9;
import ah.g;
import ah.l;
import ai.k0;
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
import ch.w;
import com.google.android.gms.internal.vision.e2;
import d6.i;
import fi.a4;
import fi.b4;
import fi.g7;
import fi.i7;
import fi.o6;
import fi.p6;
import i0.a;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bp;
import org.telegram.messenger.cp;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.cv0;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements fs {
    public static final /* synthetic */ int t0 = 0;
    public sh0 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public o6 L;
    public final g7 M;
    public final p6 N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final d6 U;
    public final d6 V;
    public final d6 W;
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
    public final View f;
    public final Path f0;
    public float g0;
    public final wv0 h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final d6 m0;
    public final n6 n;
    public final d6 n0;
    public final i o0;
    public final a4 p0;
    public long q0;
    public int r;
    public float r0;
    public int s;
    public float s0;
    public b4 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z10, View view, wv0 wv0Var, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true);
        this.n = n6Var;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new g7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        nr nrVar = nr.h;
        this.U = new d6(this, 0L, 480L, nrVar);
        this.V = new d6(this, 0L, 240L, nrVar);
        this.W = new d6(this, 0L, 150L, nr.f);
        this.a0 = 1.0f;
        this.c0 = new Path();
        this.d0 = new Matrix();
        this.e0 = new PathMeasure();
        this.f0 = new Path();
        this.m0 = new d6(this, 0L, 350L, nrVar);
        this.n0 = new d6(this, 0L, 350L, nrVar);
        cv0 cv0Var = (cv0) this;
        this.o0 = new i(cv0Var, 21);
        this.p0 = new a4(cv0Var, 0);
        this.c = i7;
        this.d = j3;
        this.e = z10;
        this.f = view;
        this.h = wv0Var;
        wv0Var.getImageReceiver().F1 = new a4(cv0Var, 1);
        this.N = mp.u1(i7).R1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(m6.w0(m6.el, h6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(m6.w0(m6.d6, h6Var));
        n6Var.w(g0.L(18.0f));
        n6Var.n(0.4f, 320L, nrVar);
        n6Var.x(g0.o());
        n6Var.u(-1);
        n6Var.q(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static b4 d(b4 b4Var, b4 b4Var2, b4 b4Var3) {
        if (b4Var3 == null) {
            return null;
        }
        RectF rectF = b4Var3.n;
        if (b4Var == null && b4Var2 == null) {
            return null;
        }
        if (b4Var != null) {
            RectF rectF2 = b4Var.n;
            if (b4Var2 != null) {
                RectF rectF3 = b4Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? b4Var : b4Var2;
            }
        }
        return b4Var != null ? b4Var : b4Var2;
    }

    private float getExpandRight() {
        return this.j0 - (this.m0.d(this.l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, b4 b4Var, b4 b4Var2) {
        if (b4Var2 == null) {
            return;
        }
        RectF rectF = b4Var2.m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * b4Var2.j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = b4Var.m;
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
            float f11 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f11);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f11));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (!v3.b0(j10.t0, this.d)) {
            canvas.drawArc(rectF, f10, f11, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f11) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f12 = f10 + f11;
        float f13 = (((int) f12) / 90) * 90;
        float f14 = (-199.0f) + f13;
        Path path = this.c0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.d0;
        matrix.reset();
        matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.e0;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.f0;
        path2.reset();
        pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void c(Canvas canvas, b4 b4Var, b4 b4Var2, b4 b4Var3, Paint paint) {
        b4 b4Var4 = b4Var;
        RectF rectF = b4Var2.n;
        if (b4Var4 == null && b4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (b4Var4 != null) {
            RectF rectF2 = b4Var4.n;
            if (b4Var3 != null) {
                RectF rectF3 = b4Var3.n;
                float centerX = rectF2.centerX();
                float width = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width2 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width3 = rectF3.width() / 2.0f;
                boolean z10 = centerX > centerX2;
                float degrees = (float) (z10 ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2)));
                boolean z11 = centerX3 > centerX2;
                float degrees2 = (float) (z11 ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2)));
                if (z10 && z11) {
                    float max = Math.max(degrees, degrees2);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(degrees2 + 180.0f, 180.0f - (degrees + degrees2), canvas, paint, rectF);
                    b(degrees, (180.0f - degrees2) - degrees, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(degrees + 180.0f, 180.0f - (degrees2 + degrees), canvas, paint, rectF);
                    b(degrees2, (180.0f - degrees2) - degrees, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(degrees, degrees2);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        if (b4Var4 == null && b4Var3 == null) {
            return;
        }
        if (b4Var4 == null) {
            b4Var4 = b4Var3;
        }
        float centerX4 = b4Var4.n.centerX();
        float width4 = b4Var4.n.width() / 2.0f;
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.y5) {
            f(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x088f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        g7 g7Var;
        float f11;
        long j3;
        float f12;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        Paint paint2;
        RectF rectF2;
        g7 g7Var2;
        ArrayList arrayList3;
        float f13;
        float f14;
        float f15;
        ProfileStoriesView profileStoriesView;
        float f16;
        b4 b4Var;
        b4 b4Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ProfileStoriesView profileStoriesView3;
        Paint paint4;
        RectF rectF3;
        Canvas canvas2;
        int i7;
        boolean z10;
        g7 g7Var3;
        Paint paint5;
        float f17;
        ArrayList arrayList4;
        RectF rectF4;
        float f18;
        RectF rectF5;
        RectF rectF6;
        float f19;
        ProfileStoriesView profileStoriesView4;
        Canvas canvas3;
        g7 g7Var4;
        Paint a10;
        Paint paint6;
        int i10;
        ArrayList arrayList5;
        float f20;
        o6 o6Var;
        ProfileStoriesView profileStoriesView5 = this;
        Canvas canvas4 = canvas;
        float e10 = profileStoriesView5.n0.e(false, profileStoriesView5.h0);
        View view = profileStoriesView5.f;
        float i11 = Utilities.i((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float T1 = g0.T1(g0.N(4.0f), g0.N(3.5f), i11) * profileStoriesView5.I;
        float scaleX = (view.getScaleX() * T1) + view.getX();
        float scaleY = (view.getScaleY() * T1) + view.getY();
        float f21 = T1 * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f21);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f21)) + scaleY;
        RectF rectF7 = profileStoriesView5.Q;
        rectF7.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f22 = profileStoriesView5.g0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView5.x;
            if (i12 >= arrayList.size()) {
                break;
            }
            b4 b4Var3 = (b4) arrayList.get(i12);
            float e11 = b4Var3.h.e(false, b4Var3.e);
            b4Var3.j = e11;
            if (e11 > 0.0f || b4Var3.e > 0.0f) {
                b4Var3.i = b4Var3.g.e(false, b4Var3.c);
                b4Var3.k = b4Var3.f.d(b4Var3.d);
                if (i12 > 0 && ((b4) arrayList.get(i12 - 1)).i > b4Var3.i) {
                    Collections.sort(arrayList, new c(24));
                    break;
                }
            } else {
                b4Var3.b.R();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float i13 = Utilities.i(1.0f - (profileStoriesView5.O / 0.2f), 1.0f, 0.0f);
        p6 p6Var = profileStoriesView5.N;
        long j10 = profileStoriesView5.d;
        boolean Q = p6Var.Q(j10);
        boolean M = p6Var.M(j10);
        d6 d6Var = profileStoriesView5.W;
        if (!M && (o6Var = profileStoriesView5.L) != null && o6Var.w) {
            profileStoriesView5.F = false;
            profileStoriesView5.G = false;
            d6Var.getClass();
            d6Var.e(true, 0.0f);
        }
        float T12 = g0.T1(0.0f, d6Var.d((M && !Q) || (profileStoriesView5.F && !profileStoriesView5.G)), profileStoriesView5.J);
        canvas4.save();
        float f23 = profileStoriesView5.H;
        canvas4.scale(f23, f23, rectF7.centerX(), rectF7.centerY());
        float T13 = g0.T1(rectF7.centerY(), profileStoriesView5.k0, profileStoriesView5.O);
        profileStoriesView5.L = null;
        d6 d6Var2 = profileStoriesView5.V;
        d6 d6Var3 = profileStoriesView5.U;
        wv0 wv0Var = profileStoriesView5.h;
        g7 g7Var5 = profileStoriesView5.M;
        RectF rectF8 = profileStoriesView5.R;
        if (T12 > 0.0f) {
            rectF8.set(rectF7);
            f12 = f22;
            rectF8.inset(-g0.N(3.775f), -g0.N(3.775f));
            paint = g7Var5.a(rectF8);
            if (profileStoriesView5.E == null) {
                sh0 sh0Var = new sh0(profileStoriesView5);
                profileStoriesView5.E = sh0Var;
                g7Var = g7Var5;
                f11 = e10;
                arrayList2 = arrayList;
                sh0Var.d(null, true, false);
                profileStoriesView5.E.u = v3.b0(j10.t0, j10);
            } else {
                g7Var = g7Var5;
                f11 = e10;
                arrayList2 = arrayList;
            }
            if (!p6Var.M(j10) || p6Var.Q(j10)) {
                f20 = 1.0f;
            } else {
                ArrayList F = p6Var.F(j10);
                if (F != null) {
                    if (F.size() > 0) {
                        profileStoriesView5.L = (o6) F.get(0);
                    }
                    float f24 = 0.0f;
                    for (int i14 = 0; i14 < F.size(); i14++) {
                        f24 += ((o6) F.get(i14)).h;
                    }
                    f20 = f24 / F.size();
                } else {
                    f20 = 0.0f;
                }
            }
            profileStoriesView5.E.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * i13 * T12));
            paint.setStrokeWidth(g0.N(2.33f));
            sh0 sh0Var2 = profileStoriesView5.E;
            sh0Var2.t = paint;
            f10 = i11;
            j3 = j10;
            sh0Var2.f((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView5.E.e(true, Utilities.i(f20, 1.0f, 0.0f));
            if (wv0Var.R) {
                profileStoriesView5.E.a(canvas4);
            }
            paint.setAlpha(alpha);
            profileStoriesView5.F = true;
            boolean z11 = profileStoriesView5.G;
            boolean z12 = profileStoriesView5.E.f >= 0.98f;
            profileStoriesView5.G = z12;
            if (z11 != z12) {
                d6Var3.e(true, profileStoriesView5.s);
                d6Var2.e(true, profileStoriesView5.r);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(nr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                g gVar = new g(profileStoriesView5, 20);
                ofFloat.addUpdateListener(gVar);
                ofFloat2.addUpdateListener(gVar);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new k0(profileStoriesView5, 13));
                animatorSet.start();
            }
        } else {
            f10 = i11;
            g7Var = g7Var5;
            f11 = e10;
            j3 = j10;
            f12 = f22;
            arrayList2 = arrayList;
            profileStoriesView5.F = false;
            paint = null;
        }
        Paint paint7 = profileStoriesView5.a;
        Paint paint8 = profileStoriesView5.b;
        RectF rectF9 = profileStoriesView5.S;
        if (T12 < 1.0f) {
            f13 = 255.0f;
            f15 = (1.0f - T12) * Utilities.i(1.0f - (profileStoriesView5.O / 0.2f), 1.0f, 0.0f);
            f14 = 1.5f;
            float e12 = d6Var3.e(false, profileStoriesView5.s);
            float e13 = d6Var2.e(false, profileStoriesView5.r);
            if (Q) {
                rectF8.set(rectF7);
                rectF8.inset(-g0.N(3.775f), -g0.N(3.775f));
                if (i7.d == null) {
                    s10 s10Var = new s10();
                    i7.d = s10Var;
                    s10Var.a = true;
                    s10Var.b = true;
                    s10Var.c.setStrokeWidth(g0.N(2.0f));
                    i7.d.c.setStyle(Paint.Style.STROKE);
                    i7.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int x02 = m6.x0(null, m6.ok, false);
                int x03 = m6.x0(null, m6.q7, false);
                i7.d.d(a.f(0.25f, x02, x03), x03, 0, 0);
                i7.d.b(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom);
                Paint paint9 = i7.d.c;
                paint9.setStrokeWidth(g0.L(2.0f));
                paint9.setAlpha((int) (f15 * 255.0f));
                if (v3.b0(j10.t0, j3)) {
                    float height = rectF8.height() * 0.32f;
                    canvas4.drawRoundRect(rectF8, height, height, paint9);
                } else {
                    canvas4.drawCircle(rectF8.centerX(), rectF8.centerY(), rectF8.width() / 2.0f, paint9);
                }
            } else if ((profileStoriesView5.w != null || profileStoriesView5.K > 0) && f15 > 0.0f) {
                rectF8.set(rectF7);
                rectF8.inset(-g0.N(3.775f), -g0.N(3.775f));
                rectF9.set(rectF7);
                rectF9.inset(-g0.N(3.41f), -g0.N(3.41f));
                float f25 = f10;
                g0.Z1(rectF8, rectF9, f25, rectF9);
                RectF rectF10 = rectF9;
                float T14 = g0.T1(0.0f, (float) ((g0.N(4.23f) / (rectF7.width() * 3.141592653589793d)) * 360.0d), Utilities.i(e12 - 1.0f, 1.0f, 0.0f) * f15);
                int min = Math.min(profileStoriesView5.s, 50);
                float min2 = Math.min(e12, 50.0f);
                int i15 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i15 = 0;
                }
                float T15 = g0.T1(i15 * 2, T14, f25);
                float max = (360.0f - (Math.max(0.0f, min2) * T15)) / Math.max(1.0f, min2);
                paint7.setColor(a.f(profileStoriesView5.P, 1526726655, 973078528));
                paint7.getAlpha();
                float f26 = (-90.0f) - (T15 / 2.0f);
                int i16 = 0;
                boolean z13 = false;
                while (i16 < min) {
                    if (i16 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        i10 = i16;
                        if (((b4) arrayList5.get(i16)).l) {
                            z13 = true;
                        }
                    } else {
                        i10 = i16;
                        arrayList5 = arrayList2;
                    }
                    i16 = i10 + 1;
                    arrayList2 = arrayList5;
                }
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF11 = g0.P;
                    rectF11.set(rectF10);
                    rectF11.inset(-g0.L(12.0f), -g0.L(12.0f));
                    canvas4.saveLayerAlpha(rectF11, ks.e4, 31);
                    float A = e2.A(profileStoriesView5.a0, 1.0f, 2.5f, 1.0f);
                    if (A != 1.0f) {
                        canvas4.save();
                        canvas4.scale(A, A, rectF8.centerX(), rectF8.centerY());
                    }
                    int alpha2 = paint8.getAlpha();
                    paint8.setAlpha((int) (alpha2 * f15));
                    rectF11.set(rectF10);
                    rectF11.inset(-g0.L(3.0f), -g0.L(3.0f));
                    paint8.setStrokeWidth(g0.N(2.5f));
                    rectF3 = rectF8;
                    profileStoriesView5.b(0.0f, 360.0f, canvas4, paint8, rectF10);
                    profileStoriesView3 = profileStoriesView5;
                    paint4 = paint8;
                    canvas2 = canvas4;
                    rectF10 = rectF10;
                    paint4.setAlpha(alpha2);
                    if (A != 1.0f) {
                        canvas2.restore();
                    }
                    arrayList3 = arrayList6;
                } else {
                    profileStoriesView3 = profileStoriesView5;
                    paint4 = paint8;
                    ArrayList arrayList7 = arrayList6;
                    rectF3 = rectF8;
                    canvas2 = canvas4;
                    int i17 = 0;
                    while (i17 < min) {
                        Paint paint10 = paint4;
                        float f27 = i17;
                        float f28 = f26;
                        float f29 = T15;
                        float i18 = 1.0f - Utilities.i(e13 - f27, 1.0f, 0.0f);
                        int i19 = min;
                        float i20 = 1.0f - Utilities.i((min - min2) - f27, 1.0f, 0.0f);
                        if (i20 < 0.0f) {
                            i7 = i17;
                            profileStoriesView4 = profileStoriesView3;
                            canvas3 = canvas2;
                            g7Var3 = g7Var;
                            f26 = f28;
                            arrayList4 = arrayList7;
                            rectF6 = rectF10;
                            f19 = max;
                            rectF5 = rectF3;
                            paint5 = paint10;
                        } else {
                            float A2 = i17 == 0 ? e2.A(profileStoriesView3.a0, 1.0f, 2.5f, 1.0f) : 1.0f;
                            RectF rectF12 = rectF3;
                            if (A2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(A2, A2, rectF12.centerX(), rectF12.centerY());
                            }
                            boolean z14 = i17 < arrayList7.size() && ((b4) arrayList7.get(i17)).l;
                            if (i18 < 1.0f) {
                                if (z14) {
                                    g7 g7Var6 = g7Var;
                                    paint6 = paint;
                                    g7Var4 = g7Var6;
                                    a10 = paint10;
                                } else {
                                    g7Var4 = g7Var;
                                    a10 = g7Var4.a(rectF12);
                                    paint6 = a10;
                                }
                                z10 = z14;
                                int alpha3 = a10.getAlpha();
                                i7 = i17;
                                a10.setAlpha((int) f3.A(1.0f, i18, alpha3, f15));
                                a10.setStrokeWidth(g0.N(z10 ? 3.0f : 2.33f));
                                f18 = i18;
                                ProfileStoriesView profileStoriesView6 = profileStoriesView3;
                                Canvas canvas5 = canvas2;
                                Paint paint11 = a10;
                                f17 = f28;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                paint5 = paint10;
                                profileStoriesView6.b(f17, (-max) * i20, canvas5, paint11, rectF4);
                                paint11.setAlpha(alpha3);
                                g7Var3 = g7Var4;
                                paint = paint6;
                            } else {
                                i7 = i17;
                                z10 = z14;
                                g7Var3 = g7Var;
                                paint5 = paint10;
                                f17 = f28;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                f18 = i18;
                            }
                            if (f18 > 0.0f) {
                                Paint paint12 = z10 ? paint5 : paint7;
                                int alpha4 = paint12.getAlpha();
                                paint12.setAlpha((int) (alpha4 * f18 * f15));
                                paint12.setStrokeWidth(g0.N(z10 ? 3.0f : 1.5f));
                                float f30 = (-max) * i20;
                                float f31 = max;
                                rectF5 = rectF4;
                                rectF6 = rectF10;
                                f19 = f31;
                                canvas3 = canvas;
                                profileStoriesView4 = this;
                                profileStoriesView4.b(f17, f30, canvas3, paint12, rectF6);
                                paint12.setAlpha(alpha4);
                            } else {
                                float f32 = max;
                                rectF5 = rectF4;
                                rectF6 = rectF10;
                                f19 = f32;
                                profileStoriesView4 = this;
                                canvas3 = canvas;
                            }
                            if (A2 != 1.0f) {
                                canvas3.restore();
                            }
                            f26 = f17 - ((f29 * i20) + (f19 * i20));
                        }
                        i17 = i7 + 1;
                        canvas2 = canvas3;
                        g7Var = g7Var3;
                        T15 = f29;
                        min = i19;
                        profileStoriesView3 = profileStoriesView4;
                        paint4 = paint5;
                        rectF3 = rectF5;
                        max = f19;
                        rectF10 = rectF6;
                        arrayList7 = arrayList4;
                    }
                    arrayList3 = arrayList7;
                }
                rectF = rectF3;
                rectF2 = rectF10;
                g7Var2 = g7Var;
                paint2 = paint4;
                profileStoriesView5 = profileStoriesView3;
                canvas4 = canvas2;
                if (z13) {
                    i7.k(f15, profileStoriesView5.J, canvas4, rectF2, wv0Var.getImageReceiver().R0);
                    canvas4.restore();
                }
            }
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            g7Var2 = g7Var;
            arrayList3 = arrayList2;
        } else {
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            g7Var2 = g7Var;
            arrayList3 = arrayList2;
            f13 = 255.0f;
            f14 = 1.5f;
            f15 = i13;
        }
        profileStoriesView5.getExpandRight();
        if (profileStoriesView5.O <= 0.0f || f15 >= 1.0f) {
            profileStoriesView = profileStoriesView5;
            f16 = 18.0f;
        } else {
            for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                float f33 = ((b4) arrayList3.get(i21)).j;
                g0.L(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            float f34 = f12;
            int i22 = 0;
            float f35 = 0.0f;
            while (i22 < arrayList8.size()) {
                b4 b4Var4 = (b4) arrayList8.get(i22);
                float f36 = b4Var4.j;
                RectF rectF13 = b4Var4.n;
                int i23 = i22;
                float f37 = b4Var4.k;
                float L = (g0.L(28.0f) / 2.0f) * f36;
                float f38 = profileStoriesView5.g0 + L + f35;
                float L2 = f35 + (g0.L(18.0f) * f36);
                float f39 = f38 + L;
                f34 = Math.max(f34, f39);
                rectF.set(f38 - L, T13 - L, f39, T13 + L);
                float f40 = profileStoriesView5.O;
                float T16 = g0.T1(rectF7.centerX(), rectF.centerX(), f40);
                float T17 = g0.T1(rectF7.centerY(), rectF.centerY(), f40);
                float T18 = g0.T1(Math.min(rectF7.width(), rectF7.height()), Math.min(rectF.width(), rectF.height()), f40) / 2.0f;
                rectF2.set(T16 - T18, T17 - T18, T16 + T18, T17 + T18);
                b4Var4.m.set(rectF2);
                rectF13.set(rectF2);
                float f41 = (-g0.T1(g0.N(2.66f), g0.T1(g0.N(1.33f), g0.N(2.33f), profileStoriesView5.O), profileStoriesView5.O * f37)) * f36;
                rectF13.inset(f41, f41);
                i22 = i23 + 1;
                f15 = f15;
                f35 = L2;
            }
            float f42 = f15;
            f16 = 18.0f;
            paint7.setColor(a.f(profileStoriesView5.O, 1526726655, -2135178036));
            paint7.getAlpha();
            Paint a11 = g7Var2.a(rectF);
            a11.setStrokeWidth(g0.T1(g0.N(2.33f), g0.N(f14), profileStoriesView5.O));
            paint7.setStrokeWidth(g0.T1(g0.N(1.125f), g0.N(f14), profileStoriesView5.O));
            paint2.setStrokeWidth(g0.T1(g0.N(1.125f), g0.N(f14), profileStoriesView5.O));
            int i24 = 0;
            while (i24 < arrayList8.size()) {
                b4 b4Var5 = (b4) arrayList8.get(i24);
                int i25 = i24 - 2;
                b4 b4Var6 = i25 >= 0 ? (b4) arrayList8.get(i25) : null;
                int i26 = i24 - 1;
                b4 d = d(b4Var6, i26 >= 0 ? (b4) arrayList8.get(i26) : null, b4Var5);
                int i27 = i24 + 1;
                int i28 = i24 + 2;
                b4 d2 = d(i27 < arrayList8.size() ? (b4) arrayList8.get(i27) : null, i28 < arrayList8.size() ? (b4) arrayList8.get(i28) : null, b4Var5);
                if (d != null) {
                    RectF rectF14 = d.n;
                    float centerX = rectF14.centerX();
                    RectF rectF15 = b4Var5.n;
                    RectF rectF16 = b4Var5.n;
                    if (Math.abs(centerX - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                        b4Var = null;
                        if (d2 != null) {
                            RectF rectF17 = d2.n;
                            float centerX2 = rectF17.centerX();
                            RectF rectF18 = b4Var5.n;
                            RectF rectF19 = b4Var5.n;
                            if (Math.abs(centerX2 - rectF18.centerX()) < Math.abs((rectF19.width() / 2.0f) - (rectF17.width() / 2.0f)) || Math.abs(rectF17.centerX() - rectF19.centerX()) > (rectF19.width() / 2.0f) + (rectF17.width() / 2.0f)) {
                                b4Var2 = null;
                                if (b4Var5.k < 1.0f) {
                                    int alpha5 = a11.getAlpha();
                                    a11.setAlpha((int) ((1.0f - f42) * (1.0f - b4Var5.k) * alpha5 * b4Var5.j));
                                    profileStoriesView5.c(canvas, b4Var, b4Var5, b4Var2, a11);
                                    paint3 = a11;
                                    paint3.setAlpha(alpha5);
                                } else {
                                    paint3 = a11;
                                }
                                if (b4Var5.k > 0.0f) {
                                    Paint paint13 = b4Var5.l ? paint2 : paint7;
                                    int alpha6 = paint13.getAlpha();
                                    paint13.setAlpha((int) ((1.0f - f42) * alpha6 * b4Var5.j * b4Var5.k));
                                    c(canvas, b4Var, b4Var5, b4Var2, paint13);
                                    profileStoriesView2 = this;
                                    paint13.setAlpha(alpha6);
                                } else {
                                    profileStoriesView2 = this;
                                }
                                a11 = paint3;
                                i24 = i27;
                                profileStoriesView5 = profileStoriesView2;
                            }
                        }
                        b4Var2 = d2;
                        if (b4Var5.k < 1.0f) {
                        }
                        if (b4Var5.k > 0.0f) {
                        }
                        a11 = paint3;
                        i24 = i27;
                        profileStoriesView5 = profileStoriesView2;
                    }
                }
                b4Var = d;
                if (d2 != null) {
                }
                b4Var2 = d2;
                if (b4Var5.k < 1.0f) {
                }
                if (b4Var5.k > 0.0f) {
                }
                a11 = paint3;
                i24 = i27;
                profileStoriesView5 = profileStoriesView2;
            }
            profileStoriesView = profileStoriesView5;
            Paint paint14 = a11;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f42) * profileStoriesView.O * f13), 31);
            canvas4 = canvas;
            for (int size = arrayList8.size() - 1; size >= 0; size--) {
                b4 b4Var7 = (b4) arrayList8.get(size);
                ImageReceiver imageReceiver = b4Var7.b;
                ImageReceiver imageReceiver2 = b4Var7.b;
                if (imageReceiver.R0) {
                    int saveCount = canvas4.getSaveCount();
                    int i29 = size - 1;
                    int i30 = size - 2;
                    profileStoriesView.a(canvas4, b4Var7, d(i29 >= 0 ? (b4) arrayList8.get(i29) : null, i30 >= 0 ? (b4) arrayList8.get(i30) : null, b4Var7));
                    imageReceiver2.A0(b4Var7.m);
                    imageReceiver2.h(canvas4, null);
                    canvas4.restoreToCount(saveCount);
                }
            }
            canvas4.restore();
            paint = paint14;
            f12 = f34;
        }
        if (paint != null) {
            paint.setStrokeWidth(g0.N(2.3f));
        }
        canvas4.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.O - 0.5f) * 2.0f);
        if (max2 > 0.0f) {
            float T19 = g0.T1(rectF7.right + g0.L(16.0f), f12 + g0.L(12.0f), profileStoriesView.O);
            float T110 = g0.T1(profileStoriesView.getWidth(), f11, profileStoriesView.O);
            float T111 = g0.T1(rectF7.centerY(), profileStoriesView.i0, profileStoriesView.O);
            n6 n6Var = profileStoriesView.n;
            n6Var.setBounds((int) T19, (int) (T111 - g0.L(f16)), (int) T110, (int) (T111 + g0.L(f16)));
            n6Var.C = (int) (max2 * f13);
            n6Var.draw(canvas4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i7;
        int i10;
        ArrayList arrayList2;
        p6 p6Var;
        int i11;
        boolean z12;
        String str;
        int i12;
        int i13;
        TL_stories.StoryItem storyItem;
        int i14;
        int i15;
        int i16;
        if (this.e) {
            return;
        }
        int i17 = this.c;
        long e10 = j10.i(i17).e();
        long j3 = this.d;
        int i18 = 0;
        boolean z13 = j3 == e10;
        int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
        TL_stories.PeerStories z14 = mp.u1(i17).R1().z(j3);
        TL_stories.PeerStories y10 = mp.u1(i17).R1().y(j3);
        TL_stories.PeerStories peerStories = j3 == 0 ? null : z14;
        int max = z14 != null ? Math.max(0, z14.max_read_id) : 0;
        if (y10 != null) {
            max = Math.max(max, y10.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z15 = true;
        int i19 = this.r;
        this.r = 0;
        boolean z16 = z13;
        int i20 = 0;
        while (i18 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i18);
            int i21 = i18;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > max) {
                    this.r++;
                }
                i20++;
            }
            i18 = i21 + 1;
        }
        int i22 = 0;
        while (true) {
            i7 = i19;
            if (i22 >= arrayList.size()) {
                i10 = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i22);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i16 = i22;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i23 = storyItem3.id;
                    i16 = i22;
                    if (y10 != null) {
                        for (int i24 = 0; i24 < y10.stories.size(); i24++) {
                            if (y10.stories.get(i24).id == i23) {
                                storyItem3 = y10.stories.get(i24);
                                break;
                            }
                        }
                    }
                    storyItem3 = storyItem3;
                    boolean z17 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z17) {
                        if (z14 != null) {
                            int i25 = 0;
                            while (true) {
                                if (i25 >= z14.stories.size()) {
                                    break;
                                }
                                if (z14.stories.get(i25).id == i23) {
                                    z14.stories.get(i25);
                                    break;
                                }
                                i25++;
                            }
                        }
                    } else if (z17) {
                        continue;
                    }
                } else {
                    i16 = i22;
                }
                int i26 = storyItem3.expire_date;
                if ((i26 == 0 || currentTime <= i26) && (z16 || storyItem3.id > max)) {
                    arrayList3.add(storyItem3);
                    i10 = 3;
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
            i22 = i16 + 1;
            i19 = i7;
        }
        if (arrayList3.size() < i10) {
            for (int i27 = 0; i27 < arrayList.size(); i27 = i14 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i27);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i28 = storyItem4.id;
                    i14 = i27;
                    if (y10 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 >= y10.stories.size()) {
                                break;
                            }
                            if (y10.stories.get(i29).id == i28) {
                                storyItem4 = y10.stories.get(i29);
                                break;
                            }
                            i29++;
                        }
                    }
                    boolean z18 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z18) {
                        if (z14 != null) {
                            int i30 = 0;
                            while (true) {
                                if (i30 >= z14.stories.size()) {
                                    break;
                                }
                                if (z14.stories.get(i30).id == i28) {
                                    z14.stories.get(i30);
                                    break;
                                }
                                i30++;
                            }
                        }
                    } else if (z18) {
                        continue;
                    }
                } else {
                    i14 = i27;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i15 = storyItem4.expire_date) == 0 || currentTime <= i15) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i31 = 0;
        while (true) {
            arrayList2 = this.x;
            int size = arrayList2.size();
            p6Var = this.N;
            i11 = -1;
            if (i31 >= size) {
                break;
            }
            b4 b4Var = (b4) arrayList2.get(i31);
            int i32 = 0;
            while (true) {
                if (i32 >= arrayList3.size()) {
                    i32 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i32);
                    if (storyItem.id == b4Var.a) {
                        break;
                    } else {
                        i32++;
                    }
                }
            }
            if (i32 == -1) {
                b4Var.e = 0.0f;
            } else {
                b4Var.c = i32;
                b4Var.d = (z16 || !(peerStories == null || storyItem == null || storyItem.id > p6Var.x(j3))) ? z15 : false;
            }
            if (!z10) {
                boolean z19 = z15;
                b4Var.f.f(b4Var.d, z19);
                b4Var.g.e(z19, b4Var.c);
                b4Var.h.e(z19, b4Var.e);
            }
            i31++;
            z15 = true;
        }
        int i33 = 0;
        while (i33 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i33);
            int i34 = 0;
            while (true) {
                if (i34 >= arrayList2.size()) {
                    i34 = i11;
                    break;
                } else if (((b4) arrayList2.get(i34)).a == storyItem5.id) {
                    break;
                } else {
                    i34++;
                }
            }
            if (i34 == i11) {
                storyItem5.dialogId = j3;
                b4 b4Var2 = new b4(this, storyItem5);
                b4Var2.c = i33;
                b4Var2.e = 1.0f;
                d6 d6Var = b4Var2.h;
                d6Var.e(true, 0.0f);
                boolean z20 = z16 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                b4Var2.d = z20;
                if (!z10) {
                    b4Var2.f.f(z20, true);
                    b4Var2.g.e(true, b4Var2.c);
                    d6Var.e(true, b4Var2.e);
                }
                arrayList2.add(b4Var2);
            }
            i33++;
            i11 = -1;
        }
        this.w = null;
        int i35 = 0;
        while (true) {
            if (i35 >= arrayList2.size()) {
                break;
            }
            b4 b4Var3 = (b4) arrayList2.get(i35);
            if (b4Var3.e > 0.0f) {
                this.w = b4Var3;
                break;
            }
            i35++;
        }
        ArrayList F = p6Var.F(j3);
        this.K = F == null ? 0 : F.size();
        int max2 = Math.max(arrayList3.size(), i20);
        int i36 = (max2 != 0 || this.K == 0) ? max2 : 1;
        if (z11 && z10 && i36 == this.s + 1 && this.r == i7 + 1) {
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b0 = ofFloat;
            ofFloat.addUpdateListener(new w(3, this, zArr));
            this.b0.addListener(new l(3, this, zArr));
            c0.q(3.0f, this.b0);
            this.b0.setDuration(400L);
            this.b0.setStartDelay(120L);
            this.b0.start();
        }
        this.s = i36;
        if (i36 > 0) {
            z12 = false;
            str = gd.G(i36, "Stories", new Object[0]);
        } else {
            z12 = false;
            str = "";
        }
        if (z10 && !gd.a0) {
            z12 = true;
        }
        this.n.t(str, z12, true);
        g7 g7Var = this.M;
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(i17).c2(Long.valueOf(j3));
            if (c22 != null) {
                TLRPC.EmojiStatus emojiStatus = c22.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    g7Var.c(bp.a(emojiStatus), z10);
                }
            }
            if (c22 != null) {
                g7Var.getClass();
                TLRPC.PeerColor peerColor = c22.profile_color;
                if (peerColor != null) {
                    i13 = peerColor.color;
                    cp cpVar = mp.u1(g7Var.a).u4;
                    g7Var.c(cpVar != null ? null : cpVar.d(i13), z10);
                }
            }
            i13 = -1;
            cp cpVar2 = mp.u1(g7Var.a).u4;
            g7Var.c(cpVar2 != null ? null : cpVar2.d(i13), z10);
        } else {
            TLRPC.Chat O0 = mp.u1(i17).O0(Long.valueOf(-j3));
            if (O0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = O0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    g7Var.c(bp.a(emojiStatus2), z10);
                }
            }
            if (O0 != null) {
                g7Var.getClass();
                TLRPC.PeerColor peerColor2 = O0.profile_color;
                if (peerColor2 != null) {
                    i12 = peerColor2.color;
                    cp cpVar3 = mp.u1(g7Var.a).u4;
                    g7Var.c(cpVar3 != null ? null : cpVar3.d(i12), z10);
                }
            }
            i12 = -1;
            cp cpVar32 = mp.u1(g7Var.a).u4;
            g7Var.c(cpVar32 != null ? null : cpVar32.d(i12), z10);
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i7 >= arrayList.size()) {
                ks.f(this.c).c(this, ks.y5);
                return;
            } else {
                ((b4) arrayList.get(i7)).b.P();
                i7++;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.y = false;
        while (true) {
            ArrayList arrayList = this.x;
            if (i7 >= arrayList.size()) {
                ks.f(this.c).n(this, ks.y5);
                return;
            } else {
                ((b4) arrayList.get(i7)).b.R();
                i7++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.O < 0.9f ? this.R.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.g0 && motionEvent.getX() <= this.h0 && Math.abs(motionEvent.getY() - this.i0) < ((float) g0.L(32.0f));
        a4 a4Var = this.p0;
        if (contains && motionEvent.getAction() == 0) {
            this.q0 = System.currentTimeMillis();
            this.r0 = motionEvent.getX();
            this.s0 = motionEvent.getY();
            g0.r(a4Var);
            g0.h3(a4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(a4Var);
            if (contains && System.currentTimeMillis() - this.q0 <= ViewConfiguration.getTapTimeout() && w9.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                p6 p6Var = this.N;
                long j3 = this.d;
                if (p6Var.M(j3) || p6Var.K(j3) || !this.x.isEmpty()) {
                    e(this.o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.q0 = -1L;
            g0.r(a4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (m6.I.q()) {
            return;
        }
        this.P = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.J == f10) {
            return;
        }
        this.J = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.I == f10) {
            return;
        }
        this.I = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void e(i iVar) {
    }
}
