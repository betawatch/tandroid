package org.telegram.ui.Stories;

import a3.u;
import a7.h;
import ai.e1;
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
import bh.f;
import bh.j;
import c6.i;
import ci.uc;
import ei.k4;
import ei.l4;
import ei.q7;
import ei.s7;
import ei.y6;
import ei.z6;
import i0.a;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.t3;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.nv0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ProfileStoriesView extends View implements cs {
    public static final /* synthetic */ int t0 = 0;
    public gh0 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public y6 L;
    public final q7 M;
    public final z6 N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final u5 U;
    public final u5 V;
    public final u5 W;
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
    public final nv0 h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final u5 m0;
    public final g6 n;
    public final u5 n0;
    public final i o0;
    public final k4 p0;
    public long q0;
    public int r;
    public float r0;
    public int s;
    public float s0;
    public l4 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i3, long j10, boolean z10, View view, nv0 nv0Var, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        g6 g6Var = new g6(false, true, true);
        this.n = g6Var;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new q7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        xq xqVar = xq.h;
        this.U = new u5(this, 0L, 480L, xqVar);
        this.V = new u5(this, 0L, 240L, xqVar);
        this.W = new u5(this, 0L, 150L, xq.f);
        this.a0 = 1.0f;
        this.c0 = new Path();
        this.d0 = new Matrix();
        this.e0 = new PathMeasure();
        this.f0 = new Path();
        this.m0 = new u5(this, 0L, 350L, xqVar);
        this.n0 = new u5(this, 0L, 350L, xqVar);
        tu0 tu0Var = (tu0) this;
        this.o0 = new i(tu0Var, 22);
        this.p0 = new k4(tu0Var, 0);
        this.c = i3;
        this.d = j10;
        this.e = z10;
        this.f = view;
        this.h = nv0Var;
        nv0Var.getImageReceiver().F1 = new k4(tu0Var, 1);
        this.N = hp.s1(i3).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(k6.w0(k6.bl, e6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(k6.w0(k6.d6, e6Var));
        g6Var.w(g0.L(18.0f));
        g6Var.n(0.4f, 320L, xqVar);
        g6Var.x(g0.o());
        g6Var.u(-1);
        g6Var.q(true);
        g6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static l4 d(l4 l4Var, l4 l4Var2, l4 l4Var3) {
        if (l4Var3 == null) {
            return null;
        }
        RectF rectF = l4Var3.n;
        if (l4Var == null && l4Var2 == null) {
            return null;
        }
        if (l4Var != null) {
            RectF rectF2 = l4Var.n;
            if (l4Var2 != null) {
                RectF rectF3 = l4Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? l4Var : l4Var2;
            }
        }
        return l4Var != null ? l4Var : l4Var2;
    }

    private float getExpandRight() {
        return this.j0 - (this.m0.d(this.l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, l4 l4Var, l4 l4Var2) {
        if (l4Var2 == null) {
            return;
        }
        RectF rectF = l4Var2.m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * l4Var2.j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = l4Var.m;
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
        if (!t3.b0(h10.t0, this.d)) {
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

    public final void c(Canvas canvas, l4 l4Var, l4 l4Var2, l4 l4Var3, Paint paint) {
        l4 l4Var4 = l4Var;
        RectF rectF = l4Var2.n;
        if (l4Var4 == null && l4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (l4Var4 != null) {
            RectF rectF2 = l4Var4.n;
            if (l4Var3 != null) {
                RectF rectF3 = l4Var3.n;
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
        if (l4Var4 == null && l4Var3 == null) {
            return;
        }
        if (l4Var4 == null) {
            l4Var4 = l4Var3;
        }
        float centerX4 = l4Var4.n.centerX();
        float width4 = l4Var4.n.width() / 2.0f;
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.v5) {
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
        q7 q7Var;
        float f11;
        long j10;
        float f12;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        Paint paint2;
        RectF rectF2;
        q7 q7Var2;
        ArrayList arrayList3;
        float f13;
        float f14;
        float f15;
        ProfileStoriesView profileStoriesView;
        float f16;
        l4 l4Var;
        l4 l4Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ProfileStoriesView profileStoriesView3;
        Paint paint4;
        RectF rectF3;
        Canvas canvas2;
        int i3;
        boolean z10;
        q7 q7Var3;
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
        q7 q7Var4;
        Paint a10;
        Paint paint6;
        int i10;
        ArrayList arrayList5;
        float f20;
        y6 y6Var;
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
            l4 l4Var3 = (l4) arrayList.get(i12);
            float e11 = l4Var3.h.e(false, l4Var3.e);
            l4Var3.j = e11;
            if (e11 > 0.0f || l4Var3.e > 0.0f) {
                l4Var3.i = l4Var3.g.e(false, l4Var3.c);
                l4Var3.k = l4Var3.f.d(l4Var3.d);
                if (i12 > 0 && ((l4) arrayList.get(i12 - 1)).i > l4Var3.i) {
                    Collections.sort(arrayList, new u(14));
                    break;
                }
            } else {
                l4Var3.b.R();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float i13 = Utilities.i(1.0f - (profileStoriesView5.O / 0.2f), 1.0f, 0.0f);
        z6 z6Var = profileStoriesView5.N;
        long j11 = profileStoriesView5.d;
        boolean Q = z6Var.Q(j11);
        boolean M = z6Var.M(j11);
        u5 u5Var = profileStoriesView5.W;
        if (!M && (y6Var = profileStoriesView5.L) != null && y6Var.w) {
            profileStoriesView5.F = false;
            profileStoriesView5.G = false;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
        }
        float T12 = g0.T1(0.0f, u5Var.d((M && !Q) || (profileStoriesView5.F && !profileStoriesView5.G)), profileStoriesView5.J);
        canvas4.save();
        float f23 = profileStoriesView5.H;
        canvas4.scale(f23, f23, rectF7.centerX(), rectF7.centerY());
        float T13 = g0.T1(rectF7.centerY(), profileStoriesView5.k0, profileStoriesView5.O);
        profileStoriesView5.L = null;
        u5 u5Var2 = profileStoriesView5.V;
        u5 u5Var3 = profileStoriesView5.U;
        nv0 nv0Var = profileStoriesView5.h;
        q7 q7Var5 = profileStoriesView5.M;
        RectF rectF8 = profileStoriesView5.R;
        if (T12 > 0.0f) {
            rectF8.set(rectF7);
            f12 = f22;
            rectF8.inset(-g0.N(3.775f), -g0.N(3.775f));
            paint = q7Var5.a(rectF8);
            if (profileStoriesView5.E == null) {
                gh0 gh0Var = new gh0(profileStoriesView5);
                profileStoriesView5.E = gh0Var;
                q7Var = q7Var5;
                f11 = e10;
                arrayList2 = arrayList;
                gh0Var.d(null, true, false);
                profileStoriesView5.E.u = t3.b0(h10.t0, j11);
            } else {
                q7Var = q7Var5;
                f11 = e10;
                arrayList2 = arrayList;
            }
            if (!z6Var.M(j11) || z6Var.Q(j11)) {
                f20 = 1.0f;
            } else {
                ArrayList F = z6Var.F(j11);
                if (F != null) {
                    if (F.size() > 0) {
                        profileStoriesView5.L = (y6) F.get(0);
                    }
                    float f24 = 0.0f;
                    for (int i14 = 0; i14 < F.size(); i14++) {
                        f24 += ((y6) F.get(i14)).h;
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
            gh0 gh0Var2 = profileStoriesView5.E;
            gh0Var2.t = paint;
            f10 = i11;
            j10 = j11;
            gh0Var2.f((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView5.E.e(true, Utilities.i(f20, 1.0f, 0.0f));
            if (nv0Var.R) {
                profileStoriesView5.E.a(canvas4);
            }
            paint.setAlpha(alpha);
            profileStoriesView5.F = true;
            boolean z11 = profileStoriesView5.G;
            boolean z12 = profileStoriesView5.E.f >= 0.98f;
            profileStoriesView5.G = z12;
            if (z11 != z12) {
                u5Var3.e(true, profileStoriesView5.s);
                u5Var2.e(true, profileStoriesView5.r);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(xq.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                f fVar = new f(profileStoriesView5, 20);
                ofFloat.addUpdateListener(fVar);
                ofFloat2.addUpdateListener(fVar);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new e1(profileStoriesView5, 13));
                animatorSet.start();
            }
        } else {
            f10 = i11;
            q7Var = q7Var5;
            f11 = e10;
            j10 = j11;
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
            float e12 = u5Var3.e(false, profileStoriesView5.s);
            float e13 = u5Var2.e(false, profileStoriesView5.r);
            if (Q) {
                rectF8.set(rectF7);
                rectF8.inset(-g0.N(3.775f), -g0.N(3.775f));
                if (s7.d == null) {
                    b10 b10Var = new b10();
                    s7.d = b10Var;
                    b10Var.a = true;
                    b10Var.b = true;
                    b10Var.c.setStrokeWidth(g0.N(2.0f));
                    s7.d.c.setStyle(Paint.Style.STROKE);
                    s7.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int x02 = k6.x0(null, k6.lk, false);
                int x03 = k6.x0(null, k6.q7, false);
                s7.d.d(a.f(0.25f, x02, x03), x03, 0, 0);
                s7.d.b(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom);
                Paint paint9 = s7.d.c;
                paint9.setStrokeWidth(g0.L(2.0f));
                paint9.setAlpha((int) (f15 * 255.0f));
                if (t3.b0(h10.t0, j10)) {
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
                        if (((l4) arrayList5.get(i16)).l) {
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
                    canvas4.saveLayerAlpha(rectF11, hs.e4, 31);
                    float z14 = com.google.android.recaptcha.internal.a.z(profileStoriesView5.a0, 1.0f, 2.5f, 1.0f);
                    if (z14 != 1.0f) {
                        canvas4.save();
                        canvas4.scale(z14, z14, rectF8.centerX(), rectF8.centerY());
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
                    if (z14 != 1.0f) {
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
                            i3 = i17;
                            profileStoriesView4 = profileStoriesView3;
                            canvas3 = canvas2;
                            q7Var3 = q7Var;
                            f26 = f28;
                            arrayList4 = arrayList7;
                            rectF6 = rectF10;
                            f19 = max;
                            rectF5 = rectF3;
                            paint5 = paint10;
                        } else {
                            float z15 = i17 == 0 ? com.google.android.recaptcha.internal.a.z(profileStoriesView3.a0, 1.0f, 2.5f, 1.0f) : 1.0f;
                            RectF rectF12 = rectF3;
                            if (z15 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(z15, z15, rectF12.centerX(), rectF12.centerY());
                            }
                            boolean z16 = i17 < arrayList7.size() && ((l4) arrayList7.get(i17)).l;
                            if (i18 < 1.0f) {
                                if (z16) {
                                    q7 q7Var6 = q7Var;
                                    paint6 = paint;
                                    q7Var4 = q7Var6;
                                    a10 = paint10;
                                } else {
                                    q7Var4 = q7Var;
                                    a10 = q7Var4.a(rectF12);
                                    paint6 = a10;
                                }
                                z10 = z16;
                                int alpha3 = a10.getAlpha();
                                i3 = i17;
                                a10.setAlpha((int) k5.A(1.0f, i18, alpha3, f15));
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
                                q7Var3 = q7Var4;
                                paint = paint6;
                            } else {
                                i3 = i17;
                                z10 = z16;
                                q7Var3 = q7Var;
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
                            if (z15 != 1.0f) {
                                canvas3.restore();
                            }
                            f26 = f17 - ((f29 * i20) + (f19 * i20));
                        }
                        i17 = i3 + 1;
                        canvas2 = canvas3;
                        q7Var = q7Var3;
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
                q7Var2 = q7Var;
                paint2 = paint4;
                profileStoriesView5 = profileStoriesView3;
                canvas4 = canvas2;
                if (z13) {
                    s7.k(f15, profileStoriesView5.J, canvas4, rectF2, nv0Var.getImageReceiver().R0);
                    canvas4.restore();
                }
            }
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            q7Var2 = q7Var;
            arrayList3 = arrayList2;
        } else {
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            q7Var2 = q7Var;
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
                float f33 = ((l4) arrayList3.get(i21)).j;
                g0.L(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            float f34 = f12;
            int i22 = 0;
            float f35 = 0.0f;
            while (i22 < arrayList8.size()) {
                l4 l4Var4 = (l4) arrayList8.get(i22);
                float f36 = l4Var4.j;
                RectF rectF13 = l4Var4.n;
                int i23 = i22;
                float f37 = l4Var4.k;
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
                l4Var4.m.set(rectF2);
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
            Paint a11 = q7Var2.a(rectF);
            a11.setStrokeWidth(g0.T1(g0.N(2.33f), g0.N(f14), profileStoriesView5.O));
            paint7.setStrokeWidth(g0.T1(g0.N(1.125f), g0.N(f14), profileStoriesView5.O));
            paint2.setStrokeWidth(g0.T1(g0.N(1.125f), g0.N(f14), profileStoriesView5.O));
            int i24 = 0;
            while (i24 < arrayList8.size()) {
                l4 l4Var5 = (l4) arrayList8.get(i24);
                int i25 = i24 - 2;
                l4 l4Var6 = i25 >= 0 ? (l4) arrayList8.get(i25) : null;
                int i26 = i24 - 1;
                l4 d = d(l4Var6, i26 >= 0 ? (l4) arrayList8.get(i26) : null, l4Var5);
                int i27 = i24 + 1;
                int i28 = i24 + 2;
                l4 d10 = d(i27 < arrayList8.size() ? (l4) arrayList8.get(i27) : null, i28 < arrayList8.size() ? (l4) arrayList8.get(i28) : null, l4Var5);
                if (d != null) {
                    RectF rectF14 = d.n;
                    float centerX = rectF14.centerX();
                    RectF rectF15 = l4Var5.n;
                    RectF rectF16 = l4Var5.n;
                    if (Math.abs(centerX - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                        l4Var = null;
                        if (d10 != null) {
                            RectF rectF17 = d10.n;
                            float centerX2 = rectF17.centerX();
                            RectF rectF18 = l4Var5.n;
                            RectF rectF19 = l4Var5.n;
                            if (Math.abs(centerX2 - rectF18.centerX()) < Math.abs((rectF19.width() / 2.0f) - (rectF17.width() / 2.0f)) || Math.abs(rectF17.centerX() - rectF19.centerX()) > (rectF19.width() / 2.0f) + (rectF17.width() / 2.0f)) {
                                l4Var2 = null;
                                if (l4Var5.k < 1.0f) {
                                    int alpha5 = a11.getAlpha();
                                    a11.setAlpha((int) ((1.0f - f42) * (1.0f - l4Var5.k) * alpha5 * l4Var5.j));
                                    profileStoriesView5.c(canvas, l4Var, l4Var5, l4Var2, a11);
                                    paint3 = a11;
                                    paint3.setAlpha(alpha5);
                                } else {
                                    paint3 = a11;
                                }
                                if (l4Var5.k > 0.0f) {
                                    Paint paint13 = l4Var5.l ? paint2 : paint7;
                                    int alpha6 = paint13.getAlpha();
                                    paint13.setAlpha((int) ((1.0f - f42) * alpha6 * l4Var5.j * l4Var5.k));
                                    c(canvas, l4Var, l4Var5, l4Var2, paint13);
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
                        l4Var2 = d10;
                        if (l4Var5.k < 1.0f) {
                        }
                        if (l4Var5.k > 0.0f) {
                        }
                        a11 = paint3;
                        i24 = i27;
                        profileStoriesView5 = profileStoriesView2;
                    }
                }
                l4Var = d;
                if (d10 != null) {
                }
                l4Var2 = d10;
                if (l4Var5.k < 1.0f) {
                }
                if (l4Var5.k > 0.0f) {
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
                l4 l4Var7 = (l4) arrayList8.get(size);
                ImageReceiver imageReceiver = l4Var7.b;
                ImageReceiver imageReceiver2 = l4Var7.b;
                if (imageReceiver.R0) {
                    int saveCount = canvas4.getSaveCount();
                    int i29 = size - 1;
                    int i30 = size - 2;
                    profileStoriesView.a(canvas4, l4Var7, d(i29 >= 0 ? (l4) arrayList8.get(i29) : null, i30 >= 0 ? (l4) arrayList8.get(i30) : null, l4Var7));
                    imageReceiver2.A0(l4Var7.m);
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
            g6 g6Var = profileStoriesView.n;
            g6Var.setBounds((int) T19, (int) (T111 - g0.L(f16)), (int) T110, (int) (T111 + g0.L(f16)));
            g6Var.B = (int) (max2 * f13);
            g6Var.draw(canvas4);
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
        int i3;
        int i10;
        ArrayList arrayList2;
        z6 z6Var;
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
        long e10 = h10.i(i17).e();
        long j10 = this.d;
        int i18 = 0;
        boolean z13 = j10 == e10;
        int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
        TL_stories.PeerStories z14 = hp.s1(i17).P1().z(j10);
        TL_stories.PeerStories y9 = hp.s1(i17).P1().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : z14;
        int max = z14 != null ? Math.max(0, z14.max_read_id) : 0;
        if (y9 != null) {
            max = Math.max(max, y9.max_read_id);
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
            i3 = i19;
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
                    if (y9 != null) {
                        for (int i24 = 0; i24 < y9.stories.size(); i24++) {
                            if (y9.stories.get(i24).id == i23) {
                                storyItem3 = y9.stories.get(i24);
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
            i19 = i3;
        }
        if (arrayList3.size() < i10) {
            for (int i27 = 0; i27 < arrayList.size(); i27 = i14 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i27);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i28 = storyItem4.id;
                    i14 = i27;
                    if (y9 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 >= y9.stories.size()) {
                                break;
                            }
                            if (y9.stories.get(i29).id == i28) {
                                storyItem4 = y9.stories.get(i29);
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
            z6Var = this.N;
            i11 = -1;
            if (i31 >= size) {
                break;
            }
            l4 l4Var = (l4) arrayList2.get(i31);
            int i32 = 0;
            while (true) {
                if (i32 >= arrayList3.size()) {
                    i32 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i32);
                    if (storyItem.id == l4Var.a) {
                        break;
                    } else {
                        i32++;
                    }
                }
            }
            if (i32 == -1) {
                l4Var.e = 0.0f;
            } else {
                l4Var.c = i32;
                l4Var.d = (z16 || !(peerStories == null || storyItem == null || storyItem.id > z6Var.x(j10))) ? z15 : false;
            }
            if (!z10) {
                boolean z19 = z15;
                l4Var.f.f(l4Var.d, z19);
                l4Var.g.e(z19, l4Var.c);
                l4Var.h.e(z19, l4Var.e);
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
                } else if (((l4) arrayList2.get(i34)).a == storyItem5.id) {
                    break;
                } else {
                    i34++;
                }
            }
            if (i34 == i11) {
                storyItem5.dialogId = j10;
                l4 l4Var2 = new l4(this, storyItem5);
                l4Var2.c = i33;
                l4Var2.e = 1.0f;
                u5 u5Var = l4Var2.h;
                u5Var.e(true, 0.0f);
                boolean z20 = z16 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                l4Var2.d = z20;
                if (!z10) {
                    l4Var2.f.f(z20, true);
                    l4Var2.g.e(true, l4Var2.c);
                    u5Var.e(true, l4Var2.e);
                }
                arrayList2.add(l4Var2);
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
            l4 l4Var3 = (l4) arrayList2.get(i35);
            if (l4Var3.e > 0.0f) {
                this.w = l4Var3;
                break;
            }
            i35++;
        }
        ArrayList F = z6Var.F(j10);
        this.K = F == null ? 0 : F.size();
        int max2 = Math.max(arrayList3.size(), i20);
        int i36 = (max2 != 0 || this.K == 0) ? max2 : 1;
        if (z11 && z10 && i36 == this.s + 1 && this.r == i3 + 1) {
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b0 = ofFloat;
            ofFloat.addUpdateListener(new uc(3, this, zArr));
            this.b0.addListener(new j(3, this, zArr));
            q.i(3.0f, this.b0);
            this.b0.setDuration(400L);
            this.b0.setStartDelay(120L);
            this.b0.start();
        }
        this.s = i36;
        if (i36 > 0) {
            z12 = false;
            str = bd.G(i36, "Stories", new Object[0]);
        } else {
            z12 = false;
            str = "";
        }
        if (z10 && !bd.a0) {
            z12 = true;
        }
        this.n.t(str, z12, true);
        q7 q7Var = this.M;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(i17).a2(Long.valueOf(j10));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    q7Var.c(wo.a(emojiStatus), z10);
                }
            }
            if (a22 != null) {
                q7Var.getClass();
                TLRPC.PeerColor peerColor = a22.profile_color;
                if (peerColor != null) {
                    i13 = peerColor.color;
                    xo xoVar = hp.s1(q7Var.a).r4;
                    q7Var.c(xoVar != null ? null : xoVar.d(i13), z10);
                }
            }
            i13 = -1;
            xo xoVar2 = hp.s1(q7Var.a).r4;
            q7Var.c(xoVar2 != null ? null : xoVar2.d(i13), z10);
        } else {
            TLRPC.Chat M0 = hp.s1(i17).M0(Long.valueOf(-j10));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    q7Var.c(wo.a(emojiStatus2), z10);
                }
            }
            if (M0 != null) {
                q7Var.getClass();
                TLRPC.PeerColor peerColor2 = M0.profile_color;
                if (peerColor2 != null) {
                    i12 = peerColor2.color;
                    xo xoVar3 = hp.s1(q7Var.a).r4;
                    q7Var.c(xoVar3 != null ? null : xoVar3.d(i12), z10);
                }
            }
            i12 = -1;
            xo xoVar32 = hp.s1(q7Var.a).r4;
            q7Var.c(xoVar32 != null ? null : xoVar32.d(i12), z10);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i3 >= arrayList.size()) {
                hs.f(this.c).c(this, hs.v5);
                return;
            } else {
                ((l4) arrayList.get(i3)).b.P();
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        this.y = false;
        while (true) {
            ArrayList arrayList = this.x;
            if (i3 >= arrayList.size()) {
                hs.f(this.c).n(this, hs.v5);
                return;
            } else {
                ((l4) arrayList.get(i3)).b.R();
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.O < 0.9f ? this.R.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.g0 && motionEvent.getX() <= this.h0 && Math.abs(motionEvent.getY() - this.i0) < ((float) g0.L(32.0f));
        k4 k4Var = this.p0;
        if (contains && motionEvent.getAction() == 0) {
            this.q0 = System.currentTimeMillis();
            this.r0 = motionEvent.getX();
            this.s0 = motionEvent.getY();
            g0.r(k4Var);
            g0.i3(k4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(k4Var);
            if (contains && System.currentTimeMillis() - this.q0 <= ViewConfiguration.getTapTimeout() && h.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                z6 z6Var = this.N;
                long j10 = this.d;
                if (z6Var.M(j10) || z6Var.K(j10) || !this.x.isEmpty()) {
                    e(this.o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.q0 = -1L;
            g0.r(k4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (k6.I.q()) {
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
