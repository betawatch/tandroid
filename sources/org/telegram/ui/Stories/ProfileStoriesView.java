package org.telegram.ui.Stories;

import a5.f;
import a9.i;
import ag.r1;
import ag.t2;
import ag.u;
import ag.x1;
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
import com.google.android.recaptcha.internal.a;
import h7.y;
import i0.b;
import java.util.ArrayList;
import java.util.Collections;
import jh.f4;
import jh.g4;
import jh.j7;
import jh.l7;
import jh.r6;
import jh.s6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int o0 = 0;
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public int F;
    public r6 G;
    public final j7 H;
    public final s6 I;
    public float J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final Path O;
    public final y5 P;
    public final y5 Q;
    public final y5 R;
    public float S;
    public ValueAnimator T;
    public final Path U;
    public final Matrix V;
    public final PathMeasure W;
    public final Paint a;
    public final Path a0;
    public final Paint b;
    public float b0;
    public final int c;
    public float c0;
    public final long d;
    public float d0;
    public final boolean e;
    public float e0;
    public final View f;
    public float f0;
    public boolean g0;
    public final iz0 h;
    public final y5 h0;
    public final y5 i0;
    public final i j0;
    public final f4 k0;
    public long l0;
    public float m0;
    public final i6 n;
    public float n0;
    public int r;
    public int s;
    public g4 v;
    public final ArrayList w;
    public boolean x;
    public si0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [jh.f4] */
    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, iz0 iz0Var, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        i6 i6Var = new i6(false, true, true, false);
        this.n = i6Var;
        Paint paint4 = new Paint(1);
        this.w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.C = 1.0f;
        this.D = 1.0f;
        this.H = new j7(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Path();
        er erVar = er.h;
        this.P = new y5(this, 0L, 480L, erVar);
        this.Q = new y5(this, 0L, 240L, erVar);
        this.R = new y5(this, 0L, 150L, er.f);
        this.S = 1.0f;
        this.U = new Path();
        this.V = new Matrix();
        this.W = new PathMeasure();
        this.a0 = new Path();
        this.h0 = new y5(this, 0L, 350L, erVar);
        this.i0 = new y5(this, 0L, 350L, erVar);
        final oy0 oy0Var = (oy0) this;
        this.j0 = new i(oy0Var, 22);
        final int i11 = 0;
        this.k0 = new Runnable() { // from class: jh.f4
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                oy0 oy0Var2 = oy0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.o0;
                        oy0Var2.q0.w4(false);
                        break;
                    default:
                        oy0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j10;
        this.e = z10;
        this.f = view;
        this.h = iz0Var;
        final int i12 = 1;
        iz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: jh.f4
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                oy0 oy0Var2 = oy0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.o0;
                        oy0Var2.q0.w4(false);
                        break;
                    default:
                        oy0Var2.invalidate();
                        break;
                }
            }
        });
        this.I = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(g6.v0(g6.nk, c6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(g6.v0(g6.d6, c6Var));
        i6Var.t(AndroidUtilities.dp(18.0f));
        i6Var.k(0.4f, 320L, erVar);
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(-1);
        i6Var.n(true);
        i6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static g4 d(g4 g4Var, g4 g4Var2, g4 g4Var3) {
        if (g4Var3 == null) {
            return null;
        }
        RectF rectF = g4Var3.n;
        if (g4Var == null && g4Var2 == null) {
            return null;
        }
        if (g4Var != null) {
            RectF rectF2 = g4Var.n;
            if (g4Var2 != null) {
                RectF rectF3 = g4Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? g4Var : g4Var2;
            }
        }
        return g4Var != null ? g4Var : g4Var2;
    }

    private float getExpandRight() {
        return this.e0 - (this.h0.e(this.g0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, g4 g4Var, g4 g4Var2) {
        if (g4Var2 == null) {
            return;
        }
        RectF rectF = g4Var2.m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f10 = -(AndroidUtilities.dpf2(1.66f) * g4Var2.j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = g4Var.m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.O;
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
        if (!ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
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
        Path path = this.U;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.V;
        matrix.reset();
        matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.W;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.a0;
        path2.reset();
        pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void c(Canvas canvas, g4 g4Var, g4 g4Var2, g4 g4Var3, Paint paint) {
        g4 g4Var4 = g4Var;
        RectF rectF = g4Var2.n;
        if (g4Var4 == null && g4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (g4Var4 != null) {
            RectF rectF2 = g4Var4.n;
            if (g4Var3 != null) {
                RectF rectF3 = g4Var3.n;
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
        if (g4Var4 == null && g4Var3 == null) {
            return;
        }
        if (g4Var4 == null) {
            g4Var4 = g4Var3;
        }
        float centerX4 = g4Var4.n.centerX();
        float width4 = g4Var4.n.width() / 2.0f;
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated) {
            f(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f10;
        float f11;
        float f12;
        long j10;
        float f13;
        ArrayList arrayList2;
        j7 j7Var;
        y5 y5Var;
        Paint paint;
        Paint paint2;
        RectF rectF;
        ArrayList arrayList3;
        float f14;
        float f15;
        float f16;
        float f17;
        ProfileStoriesView profileStoriesView;
        float f18;
        float f19;
        float max;
        g4 g4Var;
        g4 g4Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ArrayList arrayList4;
        boolean z10;
        int i10;
        float f20;
        float f21;
        int i11;
        ProfileStoriesView profileStoriesView3;
        RectF rectF2;
        RectF rectF3;
        float f22;
        Paint paint4;
        iz0 iz0Var;
        ArrayList arrayList5;
        y5 y5Var2;
        float f23;
        Paint paint5;
        r6 r6Var;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        float d = profileStoriesView4.i0.d(profileStoriesView4.c0, false);
        View view = profileStoriesView4.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView4.D;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f24 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f24);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f24)) + scaleY;
        RectF rectF4 = profileStoriesView4.L;
        rectF4.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f25 = profileStoriesView4.b0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView4.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i12);
            float d10 = g4Var3.h.d(g4Var3.e, false);
            g4Var3.j = d10;
            if (d10 > 0.0f || g4Var3.e > 0.0f) {
                g4Var3.i = g4Var3.g.d(g4Var3.c, false);
                g4Var3.k = g4Var3.f.e(g4Var3.d);
                if (i12 > 0 && ((g4) arrayList.get(i12 - 1)).i > g4Var3.i) {
                    Collections.sort(arrayList, new f(28));
                    break;
                }
            } else {
                g4Var3.b.onDetachedFromWindow();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView4.J / 0.2f), 1.0f, 0.0f);
        s6 s6Var = profileStoriesView4.I;
        long j11 = profileStoriesView4.d;
        boolean N = s6Var.N(j11);
        boolean K = s6Var.K(j11);
        y5 y5Var3 = profileStoriesView4.R;
        if (!K && (r6Var = profileStoriesView4.G) != null && r6Var.v) {
            profileStoriesView4.A = false;
            profileStoriesView4.B = false;
            y5Var3.getClass();
            y5Var3.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, y5Var3.e((K && !N) || (profileStoriesView4.A && !profileStoriesView4.B)), profileStoriesView4.E);
        canvas2.save();
        float f26 = profileStoriesView4.C;
        canvas2.scale(f26, f26, rectF4.centerX(), rectF4.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView4.f0, profileStoriesView4.J);
        profileStoriesView4.G = null;
        y5 y5Var4 = profileStoriesView4.Q;
        y5 y5Var5 = profileStoriesView4.P;
        iz0 iz0Var2 = profileStoriesView4.h;
        j7 j7Var2 = profileStoriesView4.H;
        RectF rectF5 = profileStoriesView4.M;
        if (lerp2 > 0.0f) {
            rectF5.set(rectF4);
            f11 = lerp3;
            f13 = f25;
            rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint a2 = j7Var2.a(rectF5);
            if (profileStoriesView4.y == null) {
                si0 si0Var = new si0(profileStoriesView4);
                profileStoriesView4.y = si0Var;
                f12 = d;
                j7Var = j7Var2;
                y5Var2 = y5Var4;
                si0Var.d(null, true, false);
                profileStoriesView4.y.u = ChatObject.isForum(UserConfig.selectedAccount, j11);
            } else {
                f12 = d;
                j7Var = j7Var2;
                y5Var2 = y5Var4;
            }
            if (!s6Var.K(j11) || s6Var.N(j11)) {
                f23 = 1.0f;
            } else {
                ArrayList E = s6Var.E(j11);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView4.G = (r6) E.get(0);
                    }
                    float f27 = 0.0f;
                    for (int i13 = 0; i13 < E.size(); i13++) {
                        f27 += ((r6) E.get(i13)).h;
                    }
                    f23 = f27 / E.size();
                } else {
                    f23 = 0.0f;
                }
            }
            profileStoriesView4.y.q = 0;
            int alpha = a2.getAlpha();
            a2.setAlpha((int) (alpha * clamp2 * lerp2));
            a2.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            si0 si0Var2 = profileStoriesView4.y;
            si0Var2.t = a2;
            arrayList2 = arrayList;
            f10 = clamp;
            si0Var2.f((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
            y5Var = y5Var2;
            profileStoriesView4.y.e(Utilities.clamp(f23, 1.0f, 0.0f), true);
            if (iz0Var2.M) {
                profileStoriesView4.y.a(canvas2);
            }
            a2.setAlpha(alpha);
            profileStoriesView4.A = true;
            boolean z11 = profileStoriesView4.B;
            boolean z12 = profileStoriesView4.y.f >= 0.98f;
            profileStoriesView4.B = z12;
            if (z11 != z12) {
                y5Var5.d(profileStoriesView4.s, true);
                y5Var.d(profileStoriesView4.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                paint5 = a2;
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(er.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                j10 = j11;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                u uVar = new u(profileStoriesView4, 22);
                ofFloat.addUpdateListener(uVar);
                ofFloat2.addUpdateListener(uVar);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new r1(profileStoriesView4, 17));
                animatorSet.start();
            } else {
                paint5 = a2;
                j10 = j11;
            }
            paint = paint5;
        } else {
            f10 = clamp;
            f11 = lerp3;
            f12 = d;
            j10 = j11;
            f13 = f25;
            arrayList2 = arrayList;
            j7Var = j7Var2;
            y5Var = y5Var4;
            profileStoriesView4.A = false;
            paint = null;
        }
        Paint paint6 = profileStoriesView4.a;
        Paint paint7 = profileStoriesView4.b;
        RectF rectF6 = profileStoriesView4.N;
        if (lerp2 < 1.0f) {
            f14 = 12.0f;
            f15 = 255.0f;
            float clamp3 = Utilities.clamp(1.0f - (profileStoriesView4.J / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            f16 = 1.5f;
            float d11 = y5Var5.d(profileStoriesView4.s, false);
            float d12 = y5Var.d(profileStoriesView4.r, false);
            if (N) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (l7.d == null) {
                    c20 c20Var = new c20();
                    l7.d = c20Var;
                    c20Var.a = true;
                    c20Var.b = true;
                    int w02 = g6.w0(null, g6.xj, false);
                    int w03 = g6.w0(null, g6.q7, false);
                    l7.d.d(b.d(0.25f, w02, w03), w03, 0, 0);
                    l7.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    l7.d.c.setStyle(Paint.Style.STROKE);
                    l7.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                l7.d.b(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
                Paint paint8 = l7.d.c;
                paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint8.setAlpha((int) (clamp3 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j10)) {
                    float height = rectF5.height() * 0.32f;
                    canvas2.drawRoundRect(rectF5, height, height, paint8);
                } else {
                    canvas2.drawCircle(rectF5.centerX(), rectF5.centerY(), rectF5.width() / 2.0f, paint8);
                }
            } else if ((profileStoriesView4.v != null || profileStoriesView4.F > 0) && clamp3 > 0.0f) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF6.set(rectF4);
                rectF6.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                float f28 = f10;
                AndroidUtilities.lerp(rectF5, rectF6, f28, rectF6);
                float f29 = clamp3;
                Paint paint9 = paint;
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF4.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f29);
                int min = Math.min(profileStoriesView4.s, 50);
                float min2 = Math.min(d11, 50.0f);
                int i14 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i14 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i14 * 2, lerp4, f28);
                float max2 = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                paint6.setColor(b.d(profileStoriesView4.K, 1526726655, 973078528));
                paint6.getAlpha();
                float f30 = (-90.0f) - (lerp5 / 2.0f);
                boolean z13 = false;
                int i15 = 0;
                while (i15 < min) {
                    if (i15 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        iz0Var = iz0Var2;
                        if (((g4) arrayList5.get(i15)).l) {
                            z13 = true;
                        }
                    } else {
                        iz0Var = iz0Var2;
                        arrayList5 = arrayList2;
                    }
                    i15++;
                    arrayList2 = arrayList5;
                    iz0Var2 = iz0Var;
                }
                iz0 iz0Var3 = iz0Var2;
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF7 = AndroidUtilities.rectTmp;
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF7, 255, 31);
                    float A = a.A(profileStoriesView4.S, 1.0f, 2.5f, 1.0f);
                    if (A != 1.0f) {
                        canvas2.save();
                        canvas2.scale(A, A, rectF5.centerX(), rectF5.centerY());
                    }
                    int alpha2 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha2 * f29));
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint7.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView4.b(0.0f, 360.0f, canvas2, paint7, rectF6);
                    paint7.setAlpha(alpha2);
                    if (A != 1.0f) {
                        canvas2.restore();
                    }
                    arrayList3 = arrayList6;
                    rectF = rectF5;
                    paint2 = paint7;
                    profileStoriesView4 = profileStoriesView4;
                    f17 = f29;
                    paint = paint9;
                    rectF6 = rectF6;
                } else {
                    ProfileStoriesView profileStoriesView5 = profileStoriesView4;
                    Paint paint10 = paint7;
                    RectF rectF8 = rectF6;
                    RectF rectF9 = rectF5;
                    int i16 = 0;
                    while (true) {
                        arrayList4 = arrayList6;
                        if (i16 >= min) {
                            break;
                        }
                        float f31 = i16;
                        Paint paint11 = paint10;
                        float f32 = lerp5;
                        float clamp4 = 1.0f - Utilities.clamp(d12 - f31, 1.0f, 0.0f);
                        float clamp5 = 1.0f - Utilities.clamp((min - min2) - f31, 1.0f, 0.0f);
                        if (clamp5 < 0.0f) {
                            profileStoriesView3 = profileStoriesView5;
                            arrayList6 = arrayList4;
                            rectF2 = rectF9;
                            i10 = min;
                            f22 = f30;
                            f21 = f29;
                            rectF3 = rectF8;
                            i11 = i16;
                        } else {
                            float A2 = i16 == 0 ? a.A(profileStoriesView5.S, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (A2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(A2, A2, rectF9.centerX(), rectF9.centerY());
                            }
                            boolean z14 = i16 < arrayList4.size() && ((g4) arrayList4.get(i16)).l;
                            if (clamp4 < 1.0f) {
                                j7 j7Var3 = j7Var;
                                if (z14) {
                                    paint4 = paint11;
                                } else {
                                    paint9 = j7Var3.a(rectF9);
                                    paint4 = paint9;
                                }
                                z10 = z14;
                                int alpha3 = paint4.getAlpha();
                                i10 = min;
                                f21 = f29;
                                Paint paint12 = paint4;
                                paint12.setAlpha((int) y1.z(1.0f, clamp4, alpha3, f21));
                                paint12.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 2.33f));
                                ProfileStoriesView profileStoriesView6 = profileStoriesView5;
                                f20 = f30;
                                i11 = i16;
                                arrayList6 = arrayList4;
                                j7Var = j7Var3;
                                profileStoriesView6.b(f20, (-max2) * clamp5, canvas2, paint12, rectF9);
                                paint12.setAlpha(alpha3);
                            } else {
                                arrayList6 = arrayList4;
                                z10 = z14;
                                i10 = min;
                                f20 = f30;
                                f21 = f29;
                                i11 = i16;
                            }
                            if (clamp4 > 0.0f) {
                                Paint paint13 = z10 ? paint11 : paint6;
                                int alpha4 = paint13.getAlpha();
                                paint13.setAlpha((int) (alpha4 * clamp4 * f21));
                                paint13.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF2 = rectF9;
                                rectF3 = rectF8;
                                profileStoriesView3.b(f20, (-max2) * clamp5, canvas2, paint13, rectF3);
                                paint13.setAlpha(alpha4);
                            } else {
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF2 = rectF9;
                                rectF3 = rectF8;
                            }
                            if (A2 != 1.0f) {
                                canvas2.restore();
                            }
                            f22 = f20 - ((f32 * clamp5) + (max2 * clamp5));
                        }
                        i16 = i11 + 1;
                        f30 = f22;
                        rectF8 = rectF3;
                        f29 = f21;
                        rectF9 = rectF2;
                        lerp5 = f32;
                        min = i10;
                        profileStoriesView5 = profileStoriesView3;
                        paint10 = paint11;
                    }
                    arrayList3 = arrayList4;
                    rectF = rectF9;
                    paint2 = paint10;
                    profileStoriesView4 = profileStoriesView5;
                    f17 = f29;
                    rectF6 = rectF8;
                    paint = paint9;
                }
                if (z13) {
                    l7.k(canvas2, rectF6, f17, iz0Var3.getImageReceiver().getVisible(), profileStoriesView4.E);
                    canvas2.restore();
                }
            }
            paint2 = paint7;
            rectF = rectF5;
            f17 = clamp3;
            arrayList3 = arrayList2;
            paint = paint;
        } else {
            paint2 = paint7;
            rectF = rectF5;
            arrayList3 = arrayList2;
            f14 = 12.0f;
            f15 = 255.0f;
            f16 = 1.5f;
            f17 = clamp2;
        }
        profileStoriesView4.getExpandRight();
        if (profileStoriesView4.J > 0.0f) {
            ArrayList arrayList7 = arrayList3;
            j7 j7Var4 = j7Var;
            Paint paint14 = paint2;
            if (f17 < 1.0f) {
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    float f33 = ((g4) arrayList7.get(i17)).j;
                    AndroidUtilities.dp(14.0f);
                }
                float f34 = f13;
                int i18 = 0;
                float f35 = 0.0f;
                while (i18 < arrayList7.size()) {
                    g4 g4Var4 = (g4) arrayList7.get(i18);
                    float f36 = g4Var4.j;
                    RectF rectF10 = g4Var4.n;
                    int i19 = i18;
                    float f37 = g4Var4.k;
                    float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f36;
                    float f38 = profileStoriesView4.b0 + dp + f35;
                    float dp2 = f35 + (AndroidUtilities.dp(18.0f) * f36);
                    float f39 = f38 + dp;
                    f34 = Math.max(f34, f39);
                    rectF.set(f38 - dp, f11 - dp, f39, f11 + dp);
                    float f40 = profileStoriesView4.J;
                    float lerp6 = AndroidUtilities.lerp(rectF4.centerX(), rectF.centerX(), f40);
                    float lerp7 = AndroidUtilities.lerp(rectF4.centerY(), rectF.centerY(), f40);
                    float lerp8 = AndroidUtilities.lerp(Math.min(rectF4.width(), rectF4.height()), Math.min(rectF.width(), rectF.height()), f40) / 2.0f;
                    rectF6.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                    g4Var4.m.set(rectF6);
                    rectF10.set(rectF6);
                    float f41 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.J), profileStoriesView4.J * f37)) * f36;
                    rectF10.inset(f41, f41);
                    i18 = i19 + 1;
                    f35 = dp2;
                    f17 = f17;
                }
                float f42 = f17;
                f18 = 18.0f;
                paint6.setColor(b.d(profileStoriesView4.J, 1526726655, -2135178036));
                paint6.getAlpha();
                Paint a3 = j7Var4.a(rectF);
                a3.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f16), profileStoriesView4.J));
                paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f16), profileStoriesView4.J));
                paint14.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f16), profileStoriesView4.J));
                int i20 = 0;
                while (i20 < arrayList7.size()) {
                    g4 g4Var5 = (g4) arrayList7.get(i20);
                    int i21 = i20 - 2;
                    g4 g4Var6 = i21 >= 0 ? (g4) arrayList7.get(i21) : null;
                    int i22 = i20 - 1;
                    g4 d13 = d(g4Var6, i22 >= 0 ? (g4) arrayList7.get(i22) : null, g4Var5);
                    int i23 = i20 + 1;
                    int i24 = i20 + 2;
                    g4 d14 = d(i23 < arrayList7.size() ? (g4) arrayList7.get(i23) : null, i24 < arrayList7.size() ? (g4) arrayList7.get(i24) : null, g4Var5);
                    if (d13 != null) {
                        RectF rectF11 = d13.n;
                        float centerX = rectF11.centerX();
                        RectF rectF12 = g4Var5.n;
                        RectF rectF13 = g4Var5.n;
                        if (Math.abs(centerX - rectF12.centerX()) < Math.abs((rectF13.width() / 2.0f) - (rectF11.width() / 2.0f)) || Math.abs(rectF11.centerX() - rectF13.centerX()) > (rectF13.width() / 2.0f) + (rectF11.width() / 2.0f)) {
                            g4Var = null;
                            if (d14 != null) {
                                RectF rectF14 = d14.n;
                                float centerX2 = rectF14.centerX();
                                RectF rectF15 = g4Var5.n;
                                RectF rectF16 = g4Var5.n;
                                if (Math.abs(centerX2 - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                                    g4Var2 = null;
                                    if (g4Var5.k < 1.0f) {
                                        int alpha5 = a3.getAlpha();
                                        a3.setAlpha((int) ((1.0f - f42) * (1.0f - g4Var5.k) * alpha5 * g4Var5.j));
                                        profileStoriesView4.c(canvas, g4Var, g4Var5, g4Var2, a3);
                                        paint3 = a3;
                                        paint3.setAlpha(alpha5);
                                    } else {
                                        paint3 = a3;
                                    }
                                    if (g4Var5.k > 0.0f) {
                                        Paint paint15 = g4Var5.l ? paint14 : paint6;
                                        int alpha6 = paint15.getAlpha();
                                        paint15.setAlpha((int) ((1.0f - f42) * alpha6 * g4Var5.j * g4Var5.k));
                                        c(canvas, g4Var, g4Var5, g4Var2, paint15);
                                        profileStoriesView2 = this;
                                        paint15.setAlpha(alpha6);
                                    } else {
                                        profileStoriesView2 = this;
                                    }
                                    i20 = i23;
                                    a3 = paint3;
                                    profileStoriesView4 = profileStoriesView2;
                                }
                            }
                            g4Var2 = d14;
                            if (g4Var5.k < 1.0f) {
                            }
                            if (g4Var5.k > 0.0f) {
                            }
                            i20 = i23;
                            a3 = paint3;
                            profileStoriesView4 = profileStoriesView2;
                        }
                    }
                    g4Var = d13;
                    if (d14 != null) {
                    }
                    g4Var2 = d14;
                    if (g4Var5.k < 1.0f) {
                    }
                    if (g4Var5.k > 0.0f) {
                    }
                    i20 = i23;
                    a3 = paint3;
                    profileStoriesView4 = profileStoriesView2;
                }
                profileStoriesView = profileStoriesView4;
                Paint paint16 = a3;
                canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f42) * profileStoriesView.J * f15), 31);
                canvas2 = canvas;
                for (int size = arrayList7.size() - 1; size >= 0; size--) {
                    g4 g4Var7 = (g4) arrayList7.get(size);
                    ImageReceiver imageReceiver = g4Var7.b;
                    ImageReceiver imageReceiver2 = g4Var7.b;
                    if (imageReceiver.getVisible()) {
                        int saveCount = canvas2.getSaveCount();
                        int i25 = size - 1;
                        g4 g4Var8 = i25 >= 0 ? (g4) arrayList7.get(i25) : null;
                        int i26 = size - 2;
                        profileStoriesView.a(canvas2, g4Var7, d(g4Var8, i26 >= 0 ? (g4) arrayList7.get(i26) : null, g4Var7));
                        imageReceiver2.setImageCoords(g4Var7.m);
                        imageReceiver2.draw(canvas2);
                        canvas2.restoreToCount(saveCount);
                    }
                }
                canvas2.restore();
                paint = paint16;
                f19 = f34;
                if (paint != null) {
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
                }
                canvas2.restore();
                max = Math.max(0.0f, (profileStoriesView.J - 0.5f) * 2.0f);
                if (max <= 0.0f) {
                    float lerp9 = AndroidUtilities.lerp(rectF4.right + AndroidUtilities.dp(16.0f), f19 + AndroidUtilities.dp(f14), profileStoriesView.J);
                    float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f12, profileStoriesView.J);
                    float lerp11 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView.d0, profileStoriesView.J);
                    i6 i6Var = profileStoriesView.n;
                    i6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f18)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f18)));
                    i6Var.w = (int) (max * f15);
                    i6Var.draw(canvas2);
                    return;
                }
                return;
            }
        }
        profileStoriesView = profileStoriesView4;
        f18 = 18.0f;
        f19 = f13;
        if (paint != null) {
        }
        canvas2.restore();
        max = Math.max(0.0f, (profileStoriesView.J - 0.5f) * 2.0f);
        if (max <= 0.0f) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        if (r3 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        s6 s6Var;
        int i12;
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
        long clientUserId = UserConfig.getInstance(i18).getClientUserId();
        long j10 = this.d;
        int i19 = 0;
        boolean z12 = j10 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z13 = MessagesController.getInstance(i18).getStoriesController().z(j10);
        TL_stories.PeerStories y10 = MessagesController.getInstance(i18).getStoriesController().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : z13;
        int max = z13 != null ? Math.max(0, z13.max_read_id) : 0;
        if (y10 != null) {
            max = Math.max(max, y10.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        int i20 = this.r;
        this.r = 0;
        boolean z14 = z12;
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
                    if (y10 != null) {
                        for (int i25 = 0; i25 < y10.stories.size(); i25++) {
                            if (y10.stories.get(i25).id == i24) {
                                storyItem3 = y10.stories.get(i25);
                                break;
                            }
                        }
                    }
                    storyItem3 = storyItem3;
                    boolean z15 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z15) {
                        if (z13 != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 >= z13.stories.size()) {
                                    break;
                                }
                                if (z13.stories.get(i26).id == i24) {
                                    z13.stories.get(i26);
                                    break;
                                }
                                i26++;
                            }
                        }
                    } else if (z15) {
                        continue;
                    }
                } else {
                    i17 = i23;
                }
                int i27 = storyItem3.expire_date;
                if ((i27 == 0 || currentTime <= i27) && (z14 || storyItem3.id > max)) {
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
                    if (y10 != null) {
                        int i30 = 0;
                        while (true) {
                            if (i30 >= y10.stories.size()) {
                                break;
                            }
                            if (y10.stories.get(i30).id == i29) {
                                storyItem4 = y10.stories.get(i30);
                                break;
                            }
                            i30++;
                        }
                    }
                    boolean z16 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z16) {
                        if (z13 != null) {
                            int i31 = 0;
                            while (true) {
                                if (i31 >= z13.stories.size()) {
                                    break;
                                }
                                if (z13.stories.get(i31).id == i29) {
                                    z13.stories.get(i31);
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
            arrayList2 = this.w;
            int size = arrayList2.size();
            s6Var = this.I;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            g4 g4Var = (g4) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == g4Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                g4Var.e = 0.0f;
            } else {
                g4Var.c = i33;
                g4Var.d = z14 || !(peerStories == null || storyItem == null || storyItem.id > s6Var.x(j10));
            }
            if (!z10) {
                g4Var.f.f(g4Var.d, true);
                g4Var.g.d(g4Var.c, true);
                g4Var.h.d(g4Var.e, true);
            }
            i32++;
        }
        int i34 = 0;
        while (i34 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i34);
            int i35 = 0;
            while (true) {
                if (i35 >= arrayList2.size()) {
                    i35 = -1;
                    break;
                } else if (((g4) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j10;
                g4 g4Var2 = new g4(this, storyItem5);
                g4Var2.c = i34;
                g4Var2.e = 1.0f;
                y5 y5Var = g4Var2.h;
                y5Var.d(0.0f, true);
                boolean z17 = z14 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                g4Var2.d = z17;
                if (!z10) {
                    g4Var2.f.f(z17, true);
                    g4Var2.g.d(g4Var2.c, true);
                    y5Var.d(g4Var2.e, true);
                }
                arrayList2.add(g4Var2);
            }
            i34++;
            i12 = -1;
        }
        this.v = null;
        int i36 = 0;
        while (true) {
            if (i36 >= arrayList2.size()) {
                break;
            }
            g4 g4Var3 = (g4) arrayList2.get(i36);
            if (g4Var3.e > 0.0f) {
                this.v = g4Var3;
                break;
            }
            i36++;
        }
        ArrayList E = s6Var.E(j10);
        this.F = E == null ? 0 : E.size();
        int max2 = Math.max(arrayList3.size(), i21);
        int i37 = (max2 != 0 || this.F == 0) ? max2 : 1;
        if (z11 && z10 && i37 == this.s + 1 && this.r == i10 + 1) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new t2(5, this, zArr));
            this.T.addListener(new x1(5, this, zArr));
            this.T.setInterpolator(new OvershootInterpolator(3.0f));
            this.T.setDuration(400L);
            this.T.setStartDelay(120L);
            this.T.start();
        }
        this.s = i37;
        this.n.q(i37 > 0 ? LocaleController.formatPluralString("Stories", i37, new Object[0]) : "", z10 && !LocaleController.isRTL, true);
        j7 j7Var = this.H;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j10));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    j7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                }
            }
            if (user != null) {
                j7Var.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(j7Var.a).profilePeerColors;
                    j7Var.c(peerColors != null ? null : peerColors.getColor(i14), z10);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(j7Var.a).profilePeerColors;
            j7Var.c(peerColors2 != null ? null : peerColors2.getColor(i14), z10);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j10));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    j7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                }
            }
            if (chat != null) {
                j7Var.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(j7Var.a).profilePeerColors;
                    j7Var.c(peerColors3 != null ? null : peerColors3.getColor(i13), z10);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(j7Var.a).profilePeerColors;
            j7Var.c(peerColors32 != null ? null : peerColors32.getColor(i13), z10);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.E;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((g4) arrayList.get(i10)).b.onAttachedToWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.x = false;
        while (true) {
            ArrayList arrayList = this.w;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((g4) arrayList.get(i10)).b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.J < 0.9f ? this.M.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.b0 && motionEvent.getX() <= this.c0 && Math.abs(motionEvent.getY() - this.d0) < ((float) AndroidUtilities.dp(32.0f));
        f4 f4Var = this.k0;
        if (contains && motionEvent.getAction() == 0) {
            this.l0 = System.currentTimeMillis();
            this.m0 = motionEvent.getX();
            this.n0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            AndroidUtilities.runOnUIThread(f4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            if (contains && System.currentTimeMillis() - this.l0 <= ViewConfiguration.getTapTimeout() && y.a(this.m0, this.n0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                s6 s6Var = this.I;
                long j10 = this.d;
                if (s6Var.K(j10) || s6Var.I(j10) || !this.w.isEmpty()) {
                    e(this.j0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.l0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (g6.I.q()) {
            return;
        }
        this.K = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.J != f10) {
            this.J = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.D == f10) {
            return;
        }
        this.D = f10;
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
