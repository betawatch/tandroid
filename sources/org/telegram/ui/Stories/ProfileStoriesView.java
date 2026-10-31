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
import i0.b;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u10;
import org.telegram.ui.ex0;
import org.telegram.ui.jx0;
import org.telegram.ui.mw0;
import qh.e0;
import r2.y;
import sg.r;
import th.a3;
import th.b3;
import th.c3;
import th.d5;
import th.e5;
import th.u5;
import th.w5;
import w7.z8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ProfileStoriesView extends View implements us {
    public static final /* synthetic */ int s0 = 0;
    public fi0 D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public d5 K;
    public final u5 L;
    public final e5 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final t5 T;
    public final t5 U;
    public final t5 V;
    public float W;
    public final Paint a;
    public ValueAnimator a0;
    public final Paint b;
    public final Path b0;
    public final int c;
    public final Matrix c0;
    public final long d;
    public final PathMeasure d0;
    public final boolean e;
    public final Path e0;
    public final View f;
    public float f0;
    public float g0;
    public final jx0 h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final t5 l0;
    public final t5 m0;
    public final e6 n;
    public final y n0;
    public final b3 o0;
    public long p0;
    public float q0;
    public int r;
    public float r0;
    public int s;
    public c3 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, jx0 jx0Var, p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        e6 e6Var = new e6(false, true, true);
        this.n = e6Var;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new u5(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        gr grVar = gr.h;
        this.T = new t5(this, 0L, 480L, grVar);
        this.U = new t5(this, 0L, 240L, grVar);
        this.V = new t5(this, 0L, 150L, gr.f);
        this.W = 1.0f;
        this.b0 = new Path();
        this.c0 = new Matrix();
        this.d0 = new PathMeasure();
        this.e0 = new Path();
        this.l0 = new t5(this, 0L, 350L, grVar);
        this.m0 = new t5(this, 0L, 350L, grVar);
        mw0 mw0Var = (mw0) this;
        this.n0 = new y(mw0Var, 8);
        this.o0 = new b3(mw0Var, 0);
        this.c = i10;
        this.d = j10;
        this.e = z10;
        this.f = view;
        this.h = jx0Var;
        jx0Var.getImageReceiver().E1 = new b3(mw0Var, 1);
        this.M = vp.r1(i10).O1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(i0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(t6.w0(t6.bl, p6Var));
        paint2.setStrokeWidth(i0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(t6.w0(t6.d6, p6Var));
        e6Var.w(i0.L(18.0f));
        e6Var.n(0.4f, 320L, grVar);
        e6Var.x(i0.o());
        e6Var.u(-1);
        e6Var.q(true);
        e6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(i0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static c3 d(c3 c3Var, c3 c3Var2, c3 c3Var3) {
        if (c3Var3 == null) {
            return null;
        }
        RectF rectF = c3Var3.n;
        if (c3Var == null && c3Var2 == null) {
            return null;
        }
        if (c3Var != null) {
            RectF rectF2 = c3Var.n;
            if (c3Var2 != null) {
                RectF rectF3 = c3Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? c3Var : c3Var2;
            }
        }
        return c3Var != null ? c3Var : c3Var2;
    }

    private float getExpandRight() {
        return this.i0 - (this.l0.d(this.k0) * i0.L(71.0f));
    }

    public final void a(Canvas canvas, c3 c3Var, c3 c3Var2) {
        if (c3Var2 == null) {
            return;
        }
        RectF rectF = c3Var2.m;
        RectF rectF2 = i0.P;
        rectF2.set(rectF);
        float f7 = -(i0.N(1.66f) * c3Var2.j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = c3Var.m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.S;
        path.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
            path.arcTo(rectF2, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
            float f10 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f10);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f10));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (!w3.b0(d20.s0, this.d)) {
            canvas.drawArc(rectF, f7, f10, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f10) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f11 = f7 + f10;
        float f12 = (((int) f11) / 90) * 90;
        float f13 = (-199.0f) + f12;
        Path path = this.b0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.c0;
        matrix.reset();
        matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.d0;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.e0;
        path2.reset();
        pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void c(Canvas canvas, c3 c3Var, c3 c3Var2, c3 c3Var3, Paint paint) {
        c3 c3Var4 = c3Var;
        RectF rectF = c3Var2.n;
        if (c3Var4 == null && c3Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (c3Var4 != null) {
            RectF rectF2 = c3Var4.n;
            if (c3Var3 != null) {
                RectF rectF3 = c3Var3.n;
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
        if (c3Var4 == null && c3Var3 == null) {
            return;
        }
        if (c3Var4 == null) {
            c3Var4 = c3Var3;
        }
        float centerX4 = c3Var4.n.centerX();
        float width4 = c3Var4.n.width() / 2.0f;
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

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.v5) {
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
        float f7;
        u5 u5Var;
        float f10;
        long j10;
        float f11;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        Paint paint2;
        RectF rectF2;
        u5 u5Var2;
        ArrayList arrayList3;
        float f12;
        float f13;
        float f14;
        ProfileStoriesView profileStoriesView;
        float f15;
        c3 c3Var;
        c3 c3Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ProfileStoriesView profileStoriesView3;
        Paint paint4;
        RectF rectF3;
        Canvas canvas2;
        int i10;
        boolean z10;
        u5 u5Var3;
        Paint paint5;
        float f16;
        ArrayList arrayList4;
        RectF rectF4;
        float f17;
        RectF rectF5;
        RectF rectF6;
        float f18;
        ProfileStoriesView profileStoriesView4;
        Canvas canvas3;
        u5 u5Var4;
        Paint a2;
        Paint paint6;
        int i11;
        ArrayList arrayList5;
        float f19;
        d5 d5Var;
        ProfileStoriesView profileStoriesView5 = this;
        Canvas canvas4 = canvas;
        float e = profileStoriesView5.m0.e(false, profileStoriesView5.g0);
        View view = profileStoriesView5.f;
        float i12 = Utilities.i((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float T1 = i0.T1(i0.N(4.0f), i0.N(3.5f), i12) * profileStoriesView5.H;
        float scaleX = (view.getScaleX() * T1) + view.getX();
        float scaleY = (view.getScaleY() * T1) + view.getY();
        float f20 = T1 * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f20);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f20)) + scaleY;
        RectF rectF7 = profileStoriesView5.P;
        rectF7.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f21 = profileStoriesView5.f0;
        int i13 = 0;
        while (true) {
            arrayList = profileStoriesView5.x;
            if (i13 >= arrayList.size()) {
                break;
            }
            c3 c3Var3 = (c3) arrayList.get(i13);
            float e7 = c3Var3.h.e(false, c3Var3.e);
            c3Var3.j = e7;
            if (e7 > 0.0f || c3Var3.e > 0.0f) {
                c3Var3.i = c3Var3.g.e(false, c3Var3.c);
                c3Var3.k = c3Var3.f.d(c3Var3.d);
                if (i13 > 0 && ((c3) arrayList.get(i13 - 1)).i > c3Var3.i) {
                    Collections.sort(arrayList, new ex0(23));
                    break;
                }
            } else {
                c3Var3.b.R();
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        float i14 = Utilities.i(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f);
        e5 e5Var = profileStoriesView5.M;
        long j11 = profileStoriesView5.d;
        boolean Q = e5Var.Q(j11);
        boolean M = e5Var.M(j11);
        t5 t5Var = profileStoriesView5.V;
        if (!M && (d5Var = profileStoriesView5.K) != null && d5Var.w) {
            profileStoriesView5.E = false;
            profileStoriesView5.F = false;
            t5Var.getClass();
            t5Var.e(true, 0.0f);
        }
        float T12 = i0.T1(0.0f, t5Var.d((M && !Q) || (profileStoriesView5.E && !profileStoriesView5.F)), profileStoriesView5.I);
        canvas4.save();
        float f22 = profileStoriesView5.G;
        canvas4.scale(f22, f22, rectF7.centerX(), rectF7.centerY());
        float T13 = i0.T1(rectF7.centerY(), profileStoriesView5.j0, profileStoriesView5.N);
        profileStoriesView5.K = null;
        t5 t5Var2 = profileStoriesView5.U;
        t5 t5Var3 = profileStoriesView5.T;
        jx0 jx0Var = profileStoriesView5.h;
        u5 u5Var5 = profileStoriesView5.L;
        RectF rectF8 = profileStoriesView5.Q;
        if (T12 > 0.0f) {
            rectF8.set(rectF7);
            f11 = f21;
            rectF8.inset(-i0.N(3.775f), -i0.N(3.775f));
            paint = u5Var5.a(rectF8);
            if (profileStoriesView5.D == null) {
                fi0 fi0Var = new fi0(profileStoriesView5);
                profileStoriesView5.D = fi0Var;
                u5Var = u5Var5;
                f10 = e;
                arrayList2 = arrayList;
                fi0Var.d(null, true, false);
                profileStoriesView5.D.u = w3.b0(d20.s0, j11);
            } else {
                u5Var = u5Var5;
                f10 = e;
                arrayList2 = arrayList;
            }
            if (!e5Var.M(j11) || e5Var.Q(j11)) {
                f19 = 1.0f;
            } else {
                ArrayList F = e5Var.F(j11);
                if (F != null) {
                    if (F.size() > 0) {
                        profileStoriesView5.K = (d5) F.get(0);
                    }
                    float f23 = 0.0f;
                    for (int i15 = 0; i15 < F.size(); i15++) {
                        f23 += ((d5) F.get(i15)).h;
                    }
                    f19 = f23 / F.size();
                } else {
                    f19 = 0.0f;
                }
            }
            profileStoriesView5.D.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * i14 * T12));
            paint.setStrokeWidth(i0.N(2.33f));
            fi0 fi0Var2 = profileStoriesView5.D;
            fi0Var2.t = paint;
            f7 = i12;
            j10 = j11;
            fi0Var2.f((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView5.D.e(true, Utilities.i(f19, 1.0f, 0.0f));
            if (jx0Var.Q) {
                profileStoriesView5.D.a(canvas4);
            }
            paint.setAlpha(alpha);
            profileStoriesView5.E = true;
            boolean z11 = profileStoriesView5.F;
            boolean z12 = profileStoriesView5.D.f >= 0.98f;
            profileStoriesView5.F = z12;
            if (z11 != z12) {
                t5Var3.e(true, profileStoriesView5.s);
                t5Var2.e(true, profileStoriesView5.r);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(gr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                e0 e0Var = new e0(profileStoriesView5, 18);
                ofFloat.addUpdateListener(e0Var);
                ofFloat2.addUpdateListener(e0Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new r(profileStoriesView5, 8));
                animatorSet.start();
            }
        } else {
            f7 = i12;
            u5Var = u5Var5;
            f10 = e;
            j10 = j11;
            f11 = f21;
            arrayList2 = arrayList;
            profileStoriesView5.E = false;
            paint = null;
        }
        Paint paint7 = profileStoriesView5.a;
        Paint paint8 = profileStoriesView5.b;
        RectF rectF9 = profileStoriesView5.R;
        if (T12 < 1.0f) {
            f12 = 255.0f;
            f14 = (1.0f - T12) * Utilities.i(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f);
            f13 = 1.5f;
            float e10 = t5Var3.e(false, profileStoriesView5.s);
            float e11 = t5Var2.e(false, profileStoriesView5.r);
            if (Q) {
                rectF8.set(rectF7);
                rectF8.inset(-i0.N(3.775f), -i0.N(3.775f));
                if (w5.d == null) {
                    u10 u10Var = new u10();
                    w5.d = u10Var;
                    u10Var.a = true;
                    u10Var.b = true;
                    u10Var.c.setStrokeWidth(i0.N(2.0f));
                    w5.d.c.setStyle(Paint.Style.STROKE);
                    w5.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int x02 = t6.x0(null, t6.lk, false);
                int x03 = t6.x0(null, t6.q7, false);
                w5.d.d(b.f(0.25f, x02, x03), x03, 0, 0);
                w5.d.b(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom);
                Paint paint9 = w5.d.c;
                paint9.setStrokeWidth(i0.L(2.0f));
                paint9.setAlpha((int) (f14 * 255.0f));
                if (w3.b0(d20.s0, j10)) {
                    float height = rectF8.height() * 0.32f;
                    canvas4.drawRoundRect(rectF8, height, height, paint9);
                } else {
                    canvas4.drawCircle(rectF8.centerX(), rectF8.centerY(), rectF8.width() / 2.0f, paint9);
                }
            } else if ((profileStoriesView5.w != null || profileStoriesView5.J > 0) && f14 > 0.0f) {
                rectF8.set(rectF7);
                rectF8.inset(-i0.N(3.775f), -i0.N(3.775f));
                rectF9.set(rectF7);
                rectF9.inset(-i0.N(3.41f), -i0.N(3.41f));
                float f24 = f7;
                i0.Z1(rectF8, rectF9, f24, rectF9);
                RectF rectF10 = rectF9;
                float T14 = i0.T1(0.0f, (float) ((i0.N(4.23f) / (rectF7.width() * 3.141592653589793d)) * 360.0d), Utilities.i(e10 - 1.0f, 1.0f, 0.0f) * f14);
                int min = Math.min(profileStoriesView5.s, 50);
                float min2 = Math.min(e10, 50.0f);
                int i16 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i16 = 0;
                }
                float T15 = i0.T1(i16 * 2, T14, f24);
                float max = (360.0f - (Math.max(0.0f, min2) * T15)) / Math.max(1.0f, min2);
                paint7.setColor(b.f(profileStoriesView5.O, 1526726655, 973078528));
                paint7.getAlpha();
                float f25 = (-90.0f) - (T15 / 2.0f);
                int i17 = 0;
                boolean z13 = false;
                while (i17 < min) {
                    if (i17 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        i11 = i17;
                        if (((c3) arrayList5.get(i17)).l) {
                            z13 = true;
                        }
                    } else {
                        i11 = i17;
                        arrayList5 = arrayList2;
                    }
                    i17 = i11 + 1;
                    arrayList2 = arrayList5;
                }
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF11 = i0.P;
                    rectF11.set(rectF10);
                    rectF11.inset(-i0.L(12.0f), -i0.L(12.0f));
                    canvas4.saveLayerAlpha(rectF11, zs.e4, 31);
                    float B = c3.i0.B(profileStoriesView5.W, 1.0f, 2.5f, 1.0f);
                    if (B != 1.0f) {
                        canvas4.save();
                        canvas4.scale(B, B, rectF8.centerX(), rectF8.centerY());
                    }
                    int alpha2 = paint8.getAlpha();
                    paint8.setAlpha((int) (alpha2 * f14));
                    rectF11.set(rectF10);
                    rectF11.inset(-i0.L(3.0f), -i0.L(3.0f));
                    paint8.setStrokeWidth(i0.N(2.5f));
                    rectF3 = rectF8;
                    profileStoriesView5.b(0.0f, 360.0f, canvas4, paint8, rectF10);
                    profileStoriesView3 = profileStoriesView5;
                    paint4 = paint8;
                    canvas2 = canvas4;
                    rectF10 = rectF10;
                    paint4.setAlpha(alpha2);
                    if (B != 1.0f) {
                        canvas2.restore();
                    }
                    arrayList3 = arrayList6;
                } else {
                    profileStoriesView3 = profileStoriesView5;
                    paint4 = paint8;
                    ArrayList arrayList7 = arrayList6;
                    rectF3 = rectF8;
                    canvas2 = canvas4;
                    int i18 = 0;
                    while (i18 < min) {
                        Paint paint10 = paint4;
                        float f26 = i18;
                        float f27 = f25;
                        float f28 = T15;
                        float i19 = 1.0f - Utilities.i(e11 - f26, 1.0f, 0.0f);
                        int i20 = min;
                        float i21 = 1.0f - Utilities.i((min - min2) - f26, 1.0f, 0.0f);
                        if (i21 < 0.0f) {
                            i10 = i18;
                            profileStoriesView4 = profileStoriesView3;
                            canvas3 = canvas2;
                            u5Var3 = u5Var;
                            f25 = f27;
                            arrayList4 = arrayList7;
                            rectF6 = rectF10;
                            f18 = max;
                            rectF5 = rectF3;
                            paint5 = paint10;
                        } else {
                            float B2 = i18 == 0 ? c3.i0.B(profileStoriesView3.W, 1.0f, 2.5f, 1.0f) : 1.0f;
                            RectF rectF12 = rectF3;
                            if (B2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(B2, B2, rectF12.centerX(), rectF12.centerY());
                            }
                            boolean z14 = i18 < arrayList7.size() && ((c3) arrayList7.get(i18)).l;
                            if (i19 < 1.0f) {
                                if (z14) {
                                    u5 u5Var6 = u5Var;
                                    paint6 = paint;
                                    u5Var4 = u5Var6;
                                    a2 = paint10;
                                } else {
                                    u5Var4 = u5Var;
                                    a2 = u5Var4.a(rectF12);
                                    paint6 = a2;
                                }
                                z10 = z14;
                                int alpha3 = a2.getAlpha();
                                i10 = i18;
                                a2.setAlpha((int) m5.A(1.0f, i19, alpha3, f14));
                                a2.setStrokeWidth(i0.N(z10 ? 3.0f : 2.33f));
                                f17 = i19;
                                ProfileStoriesView profileStoriesView6 = profileStoriesView3;
                                Canvas canvas5 = canvas2;
                                Paint paint11 = a2;
                                f16 = f27;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                paint5 = paint10;
                                profileStoriesView6.b(f16, (-max) * i21, canvas5, paint11, rectF4);
                                paint11.setAlpha(alpha3);
                                u5Var3 = u5Var4;
                                paint = paint6;
                            } else {
                                i10 = i18;
                                z10 = z14;
                                u5Var3 = u5Var;
                                paint5 = paint10;
                                f16 = f27;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                f17 = i19;
                            }
                            if (f17 > 0.0f) {
                                Paint paint12 = z10 ? paint5 : paint7;
                                int alpha4 = paint12.getAlpha();
                                paint12.setAlpha((int) (alpha4 * f17 * f14));
                                paint12.setStrokeWidth(i0.N(z10 ? 3.0f : 1.5f));
                                float f29 = (-max) * i21;
                                float f30 = max;
                                rectF5 = rectF4;
                                rectF6 = rectF10;
                                f18 = f30;
                                canvas3 = canvas;
                                profileStoriesView4 = this;
                                profileStoriesView4.b(f16, f29, canvas3, paint12, rectF6);
                                paint12.setAlpha(alpha4);
                            } else {
                                float f31 = max;
                                rectF5 = rectF4;
                                rectF6 = rectF10;
                                f18 = f31;
                                profileStoriesView4 = this;
                                canvas3 = canvas;
                            }
                            if (B2 != 1.0f) {
                                canvas3.restore();
                            }
                            f25 = f16 - ((f28 * i21) + (f18 * i21));
                        }
                        i18 = i10 + 1;
                        canvas2 = canvas3;
                        u5Var = u5Var3;
                        T15 = f28;
                        min = i20;
                        profileStoriesView3 = profileStoriesView4;
                        paint4 = paint5;
                        rectF3 = rectF5;
                        max = f18;
                        rectF10 = rectF6;
                        arrayList7 = arrayList4;
                    }
                    arrayList3 = arrayList7;
                }
                rectF = rectF3;
                rectF2 = rectF10;
                u5Var2 = u5Var;
                paint2 = paint4;
                profileStoriesView5 = profileStoriesView3;
                canvas4 = canvas2;
                if (z13) {
                    w5.k(f14, profileStoriesView5.I, canvas4, rectF2, jx0Var.getImageReceiver().Q0);
                    canvas4.restore();
                }
            }
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            u5Var2 = u5Var;
            arrayList3 = arrayList2;
        } else {
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            u5Var2 = u5Var;
            arrayList3 = arrayList2;
            f12 = 255.0f;
            f13 = 1.5f;
            f14 = i14;
        }
        profileStoriesView5.getExpandRight();
        if (profileStoriesView5.N <= 0.0f || f14 >= 1.0f) {
            profileStoriesView = profileStoriesView5;
            f15 = 18.0f;
        } else {
            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                float f32 = ((c3) arrayList3.get(i22)).j;
                i0.L(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            float f33 = f11;
            int i23 = 0;
            float f34 = 0.0f;
            while (i23 < arrayList8.size()) {
                c3 c3Var4 = (c3) arrayList8.get(i23);
                float f35 = c3Var4.j;
                RectF rectF13 = c3Var4.n;
                int i24 = i23;
                float f36 = c3Var4.k;
                float L = (i0.L(28.0f) / 2.0f) * f35;
                float f37 = profileStoriesView5.f0 + L + f34;
                float L2 = f34 + (i0.L(18.0f) * f35);
                float f38 = f37 + L;
                f33 = Math.max(f33, f38);
                rectF.set(f37 - L, T13 - L, f38, T13 + L);
                float f39 = profileStoriesView5.N;
                float T16 = i0.T1(rectF7.centerX(), rectF.centerX(), f39);
                float T17 = i0.T1(rectF7.centerY(), rectF.centerY(), f39);
                float T18 = i0.T1(Math.min(rectF7.width(), rectF7.height()), Math.min(rectF.width(), rectF.height()), f39) / 2.0f;
                rectF2.set(T16 - T18, T17 - T18, T16 + T18, T17 + T18);
                c3Var4.m.set(rectF2);
                rectF13.set(rectF2);
                float f40 = (-i0.T1(i0.N(2.66f), i0.T1(i0.N(1.33f), i0.N(2.33f), profileStoriesView5.N), profileStoriesView5.N * f36)) * f35;
                rectF13.inset(f40, f40);
                i23 = i24 + 1;
                f14 = f14;
                f34 = L2;
            }
            float f41 = f14;
            f15 = 18.0f;
            paint7.setColor(b.f(profileStoriesView5.N, 1526726655, -2135178036));
            paint7.getAlpha();
            Paint a10 = u5Var2.a(rectF);
            a10.setStrokeWidth(i0.T1(i0.N(2.33f), i0.N(f13), profileStoriesView5.N));
            paint7.setStrokeWidth(i0.T1(i0.N(1.125f), i0.N(f13), profileStoriesView5.N));
            paint2.setStrokeWidth(i0.T1(i0.N(1.125f), i0.N(f13), profileStoriesView5.N));
            int i25 = 0;
            while (i25 < arrayList8.size()) {
                c3 c3Var5 = (c3) arrayList8.get(i25);
                int i26 = i25 - 2;
                c3 c3Var6 = i26 >= 0 ? (c3) arrayList8.get(i26) : null;
                int i27 = i25 - 1;
                c3 d = d(c3Var6, i27 >= 0 ? (c3) arrayList8.get(i27) : null, c3Var5);
                int i28 = i25 + 1;
                int i29 = i25 + 2;
                c3 d10 = d(i28 < arrayList8.size() ? (c3) arrayList8.get(i28) : null, i29 < arrayList8.size() ? (c3) arrayList8.get(i29) : null, c3Var5);
                if (d != null) {
                    RectF rectF14 = d.n;
                    float centerX = rectF14.centerX();
                    RectF rectF15 = c3Var5.n;
                    RectF rectF16 = c3Var5.n;
                    if (Math.abs(centerX - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                        c3Var = null;
                        if (d10 != null) {
                            RectF rectF17 = d10.n;
                            float centerX2 = rectF17.centerX();
                            RectF rectF18 = c3Var5.n;
                            RectF rectF19 = c3Var5.n;
                            if (Math.abs(centerX2 - rectF18.centerX()) < Math.abs((rectF19.width() / 2.0f) - (rectF17.width() / 2.0f)) || Math.abs(rectF17.centerX() - rectF19.centerX()) > (rectF19.width() / 2.0f) + (rectF17.width() / 2.0f)) {
                                c3Var2 = null;
                                if (c3Var5.k < 1.0f) {
                                    int alpha5 = a10.getAlpha();
                                    a10.setAlpha((int) ((1.0f - f41) * (1.0f - c3Var5.k) * alpha5 * c3Var5.j));
                                    profileStoriesView5.c(canvas, c3Var, c3Var5, c3Var2, a10);
                                    paint3 = a10;
                                    paint3.setAlpha(alpha5);
                                } else {
                                    paint3 = a10;
                                }
                                if (c3Var5.k > 0.0f) {
                                    Paint paint13 = c3Var5.l ? paint2 : paint7;
                                    int alpha6 = paint13.getAlpha();
                                    paint13.setAlpha((int) ((1.0f - f41) * alpha6 * c3Var5.j * c3Var5.k));
                                    c(canvas, c3Var, c3Var5, c3Var2, paint13);
                                    profileStoriesView2 = this;
                                    paint13.setAlpha(alpha6);
                                } else {
                                    profileStoriesView2 = this;
                                }
                                a10 = paint3;
                                i25 = i28;
                                profileStoriesView5 = profileStoriesView2;
                            }
                        }
                        c3Var2 = d10;
                        if (c3Var5.k < 1.0f) {
                        }
                        if (c3Var5.k > 0.0f) {
                        }
                        a10 = paint3;
                        i25 = i28;
                        profileStoriesView5 = profileStoriesView2;
                    }
                }
                c3Var = d;
                if (d10 != null) {
                }
                c3Var2 = d10;
                if (c3Var5.k < 1.0f) {
                }
                if (c3Var5.k > 0.0f) {
                }
                a10 = paint3;
                i25 = i28;
                profileStoriesView5 = profileStoriesView2;
            }
            profileStoriesView = profileStoriesView5;
            Paint paint14 = a10;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f41) * profileStoriesView.N * f12), 31);
            canvas4 = canvas;
            for (int size = arrayList8.size() - 1; size >= 0; size--) {
                c3 c3Var7 = (c3) arrayList8.get(size);
                ImageReceiver imageReceiver = c3Var7.b;
                ImageReceiver imageReceiver2 = c3Var7.b;
                if (imageReceiver.Q0) {
                    int saveCount = canvas4.getSaveCount();
                    int i30 = size - 1;
                    int i31 = size - 2;
                    profileStoriesView.a(canvas4, c3Var7, d(i30 >= 0 ? (c3) arrayList8.get(i30) : null, i31 >= 0 ? (c3) arrayList8.get(i31) : null, c3Var7));
                    imageReceiver2.A0(c3Var7.m);
                    imageReceiver2.h(canvas4, null);
                    canvas4.restoreToCount(saveCount);
                }
            }
            canvas4.restore();
            paint = paint14;
            f11 = f33;
        }
        if (paint != null) {
            paint.setStrokeWidth(i0.N(2.3f));
        }
        canvas4.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.N - 0.5f) * 2.0f);
        if (max2 > 0.0f) {
            float T19 = i0.T1(rectF7.right + i0.L(16.0f), f11 + i0.L(12.0f), profileStoriesView.N);
            float T110 = i0.T1(profileStoriesView.getWidth(), f10, profileStoriesView.N);
            float T111 = i0.T1(rectF7.centerY(), profileStoriesView.h0, profileStoriesView.N);
            e6 e6Var = profileStoriesView.n;
            e6Var.setBounds((int) T19, (int) (T111 - i0.L(f15)), (int) T110, (int) (T111 + i0.L(f15)));
            e6Var.B = (int) (max2 * f12);
            e6Var.draw(canvas4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0199, code lost:
    
        if (r3 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        e5 e5Var;
        int i12;
        boolean z12;
        String str;
        int i13;
        int i14;
        TL_stories.StoryItem storyItem;
        int i15;
        int i16;
        int i17;
        if (this.e) {
            return;
        }
        int i18 = this.c;
        long e = d20.i(i18).e();
        long j10 = this.d;
        int i19 = 0;
        boolean z13 = j10 == e;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z14 = vp.r1(i18).O1().z(j10);
        TL_stories.PeerStories y3 = vp.r1(i18).O1().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : z14;
        int max = z14 != null ? Math.max(0, z14.max_read_id) : 0;
        if (y3 != null) {
            max = Math.max(max, y3.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z15 = true;
        int i20 = this.r;
        this.r = 0;
        boolean z16 = z13;
        int i21 = 0;
        while (i19 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i19);
            int i22 = i19;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > max) {
                    this.r++;
                }
                i21++;
            }
            i19 = i22 + 1;
        }
        int i23 = 0;
        while (true) {
            i10 = i20;
            if (i23 >= arrayList.size()) {
                i11 = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i23);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i17 = i23;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i24 = storyItem3.id;
                    i17 = i23;
                    if (y3 != null) {
                        for (int i25 = 0; i25 < y3.stories.size(); i25++) {
                            if (y3.stories.get(i25).id == i24) {
                                storyItem3 = y3.stories.get(i25);
                                break;
                            }
                        }
                    }
                    storyItem3 = storyItem3;
                    boolean z17 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z17) {
                        if (z14 != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 >= z14.stories.size()) {
                                    break;
                                }
                                if (z14.stories.get(i26).id == i24) {
                                    z14.stories.get(i26);
                                    break;
                                }
                                i26++;
                            }
                        }
                    } else if (z17) {
                        continue;
                    }
                } else {
                    i17 = i23;
                }
                int i27 = storyItem3.expire_date;
                if ((i27 == 0 || currentTime <= i27) && (z16 || storyItem3.id > max)) {
                    arrayList3.add(storyItem3);
                    i11 = 3;
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
            i23 = i17 + 1;
            i20 = i10;
        }
        if (arrayList3.size() < i11) {
            for (int i28 = 0; i28 < arrayList.size(); i28 = i15 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i28);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i29 = storyItem4.id;
                    i15 = i28;
                    if (y3 != null) {
                        int i30 = 0;
                        while (true) {
                            if (i30 >= y3.stories.size()) {
                                break;
                            }
                            if (y3.stories.get(i30).id == i29) {
                                storyItem4 = y3.stories.get(i30);
                                break;
                            }
                            i30++;
                        }
                    }
                    boolean z18 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z18) {
                        if (z14 != null) {
                            int i31 = 0;
                            while (true) {
                                if (i31 >= z14.stories.size()) {
                                    break;
                                }
                                if (z14.stories.get(i31).id == i29) {
                                    z14.stories.get(i31);
                                    break;
                                }
                                i31++;
                            }
                        }
                    }
                } else {
                    i15 = i28;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i16 = storyItem4.expire_date) == 0 || currentTime <= i16) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i32 = 0;
        while (true) {
            arrayList2 = this.x;
            int size = arrayList2.size();
            e5Var = this.M;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            c3 c3Var = (c3) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == c3Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                c3Var.e = 0.0f;
            } else {
                c3Var.c = i33;
                c3Var.d = (z16 || !(peerStories == null || storyItem == null || storyItem.id > e5Var.x(j10))) ? z15 : false;
            }
            if (!z10) {
                boolean z19 = z15;
                c3Var.f.f(c3Var.d, z19);
                c3Var.g.e(z19, c3Var.c);
                c3Var.h.e(z19, c3Var.e);
            }
            i32++;
            z15 = true;
        }
        int i34 = 0;
        while (i34 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i34);
            int i35 = 0;
            while (true) {
                if (i35 >= arrayList2.size()) {
                    i35 = i12;
                    break;
                } else if (((c3) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j10;
                c3 c3Var2 = new c3(this, storyItem5);
                c3Var2.c = i34;
                c3Var2.e = 1.0f;
                t5 t5Var = c3Var2.h;
                t5Var.e(true, 0.0f);
                boolean z20 = z16 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                c3Var2.d = z20;
                if (!z10) {
                    c3Var2.f.f(z20, true);
                    c3Var2.g.e(true, c3Var2.c);
                    t5Var.e(true, c3Var2.e);
                }
                arrayList2.add(c3Var2);
            }
            i34++;
            i12 = -1;
        }
        this.w = null;
        int i36 = 0;
        while (true) {
            if (i36 >= arrayList2.size()) {
                break;
            }
            c3 c3Var3 = (c3) arrayList2.get(i36);
            if (c3Var3.e > 0.0f) {
                this.w = c3Var3;
                break;
            }
            i36++;
        }
        ArrayList F = e5Var.F(j10);
        this.J = F == null ? 0 : F.size();
        int max2 = Math.max(arrayList3.size(), i21);
        int i37 = (max2 != 0 || this.J == 0) ? max2 : 1;
        if (z11 && z10 && i37 == this.s + 1 && this.r == i10 + 1) {
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.a0 = ofFloat;
            ofFloat.addUpdateListener(new a3(i21, this, zArr));
            this.a0.addListener(new iw0(18, (Object) this, (Object) zArr));
            z20.j(3.0f, this.a0);
            this.a0.setDuration(400L);
            this.a0.setStartDelay(120L);
            this.a0.start();
        }
        this.s = i37;
        if (i37 > 0) {
            z12 = false;
            str = cd.G(i37, "Stories", new Object[0]);
        } else {
            z12 = false;
            str = "";
        }
        this.n.t(str, (!z10 || cd.X) ? z12 : true, true);
        u5 u5Var = this.L;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i18).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                TLRPC.EmojiStatus emojiStatus = Z1.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    u5Var.c(kp.a(emojiStatus), z10);
                }
            }
            if (Z1 != null) {
                u5Var.getClass();
                TLRPC.PeerColor peerColor = Z1.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    lp lpVar = vp.r1(u5Var.a).s4;
                    u5Var.c(lpVar != null ? null : lpVar.d(i14), z10);
                }
            }
            i14 = -1;
            lp lpVar2 = vp.r1(u5Var.a).s4;
            u5Var.c(lpVar2 != null ? null : lpVar2.d(i14), z10);
        } else {
            TLRPC.Chat L0 = vp.r1(i18).L0(Long.valueOf(-j10));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = L0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    u5Var.c(kp.a(emojiStatus2), z10);
                }
            }
            if (L0 != null) {
                u5Var.getClass();
                TLRPC.PeerColor peerColor2 = L0.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    lp lpVar3 = vp.r1(u5Var.a).s4;
                    u5Var.c(lpVar3 != null ? null : lpVar3.d(i13), z10);
                }
            }
            i13 = -1;
            lp lpVar32 = vp.r1(u5Var.a).s4;
            u5Var.c(lpVar32 != null ? null : lpVar32.d(i13), z10);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.I;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                zs.f(this.c).c(this, zs.v5);
                return;
            } else {
                ((c3) arrayList.get(i10)).b.P();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.y = false;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                zs.f(this.c).n(this, zs.v5);
                return;
            } else {
                ((c3) arrayList.get(i10)).b.R();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N < 0.9f ? this.Q.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.f0 && motionEvent.getX() <= this.g0 && Math.abs(motionEvent.getY() - this.h0) < ((float) i0.L(32.0f));
        b3 b3Var = this.o0;
        if (contains && motionEvent.getAction() == 0) {
            this.p0 = System.currentTimeMillis();
            this.q0 = motionEvent.getX();
            this.r0 = motionEvent.getY();
            i0.r(b3Var);
            i0.h3(b3Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            i0.r(b3Var);
            if (contains && System.currentTimeMillis() - this.p0 <= ViewConfiguration.getTapTimeout() && z8.a(this.q0, this.r0, motionEvent.getX(), motionEvent.getY()) <= i0.L(12.0f)) {
                e5 e5Var = this.M;
                long j10 = this.d;
                if (e5Var.M(j10) || e5Var.K(j10) || !this.x.isEmpty()) {
                    e(this.n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.p0 = -1L;
            i0.r(b3Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (t6.I.q()) {
            return;
        }
        this.O = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.N != f7) {
            this.N = f7;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f7) {
        if (this.I == f7) {
            return;
        }
        this.I = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (this.H == f7) {
            return;
        }
        this.H = f7;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void e(y yVar) {
    }
}
