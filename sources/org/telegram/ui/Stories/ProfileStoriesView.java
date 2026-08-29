package org.telegram.ui.Stories;

import ag.m0;
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
import bg.b3;
import bg.c3;
import bg.q1;
import ha.c;
import i0.a;
import i7.z5;
import java.util.ArrayList;
import java.util.Collections;
import lh.e4;
import lh.f4;
import lh.g4;
import lh.j7;
import lh.l7;
import lh.r6;
import lh.s6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
    public final d6 P;
    public final d6 Q;
    public final d6 R;
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
    public final d6 h0;
    public final d6 i0;
    public final c j0;
    public final f4 k0;
    public long l0;
    public float m0;
    public final n6 n;
    public float n0;
    public int r;
    public int s;
    public g4 v;
    public final ArrayList w;
    public boolean x;
    public bj0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [lh.f4] */
    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, iz0 iz0Var, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true, false);
        this.n = n6Var;
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
        jr jrVar = jr.h;
        this.P = new d6(this, 0L, 480L, jrVar);
        this.Q = new d6(this, 0L, 240L, jrVar);
        this.R = new d6(this, 0L, 150L, jr.f);
        this.S = 1.0f;
        this.U = new Path();
        this.V = new Matrix();
        this.W = new PathMeasure();
        this.a0 = new Path();
        this.h0 = new d6(this, 0L, 350L, jrVar);
        this.i0 = new d6(this, 0L, 350L, jrVar);
        final oy0 oy0Var = (oy0) this;
        this.j0 = new c(oy0Var, 25);
        final int i11 = 0;
        this.k0 = new Runnable() { // from class: lh.f4
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
        iz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: lh.f4
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
        n6Var.t(AndroidUtilities.dp(18.0f));
        n6Var.k(0.4f, 320L, jrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(-1);
        n6Var.n(true);
        n6Var.setCallback(this);
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
        float f9 = -(AndroidUtilities.dpf2(1.66f) * g4Var2.j);
        rectF2.inset(f9, f9);
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
            float f10 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f10);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f10));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f9, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (!ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            canvas.drawArc(rectF, f9, f10, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f10) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f11 = f9 + f10;
        float f12 = (((int) f11) / 90) * 90;
        float f13 = (-199.0f) + f12;
        Path path = this.U;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.V;
        matrix.reset();
        matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.W;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.a0;
        path2.reset();
        pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
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

    /* JADX WARN: Removed duplicated region for block: B:112:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x08a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f9;
        float f10;
        float f11;
        long j10;
        float f12;
        ArrayList arrayList2;
        j7 j7Var;
        Paint paint;
        Paint paint2;
        RectF rectF;
        j7 j7Var2;
        ArrayList arrayList3;
        float f13;
        float f14;
        float f15;
        ProfileStoriesView profileStoriesView;
        float f16;
        float f17;
        g4 g4Var;
        Paint paint3;
        boolean z10;
        float f18;
        j7 j7Var3;
        Paint paint4;
        float f19;
        ArrayList arrayList4;
        ProfileStoriesView profileStoriesView2;
        float f20;
        RectF rectF2;
        RectF rectF3;
        float f21;
        j7 j7Var4;
        Paint paint5;
        int i10;
        ArrayList arrayList5;
        float f22;
        r6 r6Var;
        ProfileStoriesView profileStoriesView3 = this;
        Canvas canvas2 = canvas;
        int i11 = 0;
        float d = profileStoriesView3.i0.d(profileStoriesView3.c0, false);
        View view = profileStoriesView3.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView3.D;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f23 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f23);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f23)) + scaleY;
        RectF rectF4 = profileStoriesView3.L;
        rectF4.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f24 = profileStoriesView3.b0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView3.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            g4 g4Var2 = (g4) arrayList.get(i12);
            float d10 = g4Var2.h.d(g4Var2.e, false);
            g4Var2.j = d10;
            if (d10 > 0.0f || g4Var2.e > 0.0f) {
                g4Var2.i = g4Var2.g.d(g4Var2.c, false);
                g4Var2.k = g4Var2.f.e(g4Var2.d);
                if (i12 > 0 && ((g4) arrayList.get(i12 - 1)).i > g4Var2.i) {
                    Collections.sort(arrayList, new e4(i11));
                    break;
                }
            } else {
                g4Var2.b.onDetachedFromWindow();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView3.J / 0.2f), 1.0f, 0.0f);
        s6 s6Var = profileStoriesView3.I;
        long j11 = profileStoriesView3.d;
        boolean N = s6Var.N(j11);
        boolean K = s6Var.K(j11);
        d6 d6Var = profileStoriesView3.R;
        if (!K && (r6Var = profileStoriesView3.G) != null && r6Var.v) {
            profileStoriesView3.A = false;
            profileStoriesView3.B = false;
            d6Var.getClass();
            d6Var.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, d6Var.e((K && !N) || (profileStoriesView3.A && !profileStoriesView3.B)), profileStoriesView3.E);
        canvas2.save();
        float f25 = profileStoriesView3.C;
        canvas2.scale(f25, f25, rectF4.centerX(), rectF4.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView3.f0, profileStoriesView3.J);
        profileStoriesView3.G = null;
        d6 d6Var2 = profileStoriesView3.Q;
        d6 d6Var3 = profileStoriesView3.P;
        iz0 iz0Var = profileStoriesView3.h;
        j7 j7Var5 = profileStoriesView3.H;
        RectF rectF5 = profileStoriesView3.M;
        if (lerp2 > 0.0f) {
            rectF5.set(rectF4);
            f10 = lerp3;
            f12 = f24;
            rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            paint = j7Var5.a(rectF5);
            if (profileStoriesView3.y == null) {
                bj0 bj0Var = new bj0(profileStoriesView3);
                profileStoriesView3.y = bj0Var;
                f11 = d;
                arrayList2 = arrayList;
                j7Var = j7Var5;
                bj0Var.d(null, true, false);
                profileStoriesView3.y.u = ChatObject.isForum(UserConfig.selectedAccount, j11);
            } else {
                f11 = d;
                arrayList2 = arrayList;
                j7Var = j7Var5;
            }
            if (!s6Var.K(j11) || s6Var.N(j11)) {
                f22 = 1.0f;
            } else {
                ArrayList E = s6Var.E(j11);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView3.G = (r6) E.get(0);
                    }
                    float f26 = 0.0f;
                    for (int i13 = 0; i13 < E.size(); i13++) {
                        f26 += ((r6) E.get(i13)).h;
                    }
                    f22 = f26 / E.size();
                } else {
                    f22 = 0.0f;
                }
            }
            profileStoriesView3.y.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * clamp2 * lerp2));
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            bj0 bj0Var2 = profileStoriesView3.y;
            bj0Var2.t = paint;
            f9 = clamp;
            j10 = j11;
            bj0Var2.f((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
            profileStoriesView3.y.e(Utilities.clamp(f22, 1.0f, 0.0f), true);
            if (iz0Var.M) {
                profileStoriesView3.y.a(canvas2);
            }
            paint.setAlpha(alpha);
            profileStoriesView3.A = true;
            boolean z11 = profileStoriesView3.B;
            boolean z12 = profileStoriesView3.y.f >= 0.98f;
            profileStoriesView3.B = z12;
            if (z11 != z12) {
                d6Var3.d(profileStoriesView3.s, true);
                d6Var2.d(profileStoriesView3.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(jr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                q1 q1Var = new q1(profileStoriesView3, 28);
                ofFloat.addUpdateListener(q1Var);
                ofFloat2.addUpdateListener(q1Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new m0(profileStoriesView3, 20));
                animatorSet.start();
            }
        } else {
            f9 = clamp;
            f10 = lerp3;
            f11 = d;
            j10 = j11;
            f12 = f24;
            arrayList2 = arrayList;
            j7Var = j7Var5;
            profileStoriesView3.A = false;
            paint = null;
        }
        Paint paint6 = profileStoriesView3.a;
        Paint paint7 = profileStoriesView3.b;
        RectF rectF6 = profileStoriesView3.N;
        if (lerp2 < 1.0f) {
            f13 = 255.0f;
            f14 = 1.5f;
            f15 = Utilities.clamp(1.0f - (profileStoriesView3.J / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            float d11 = d6Var3.d(profileStoriesView3.s, false);
            float d12 = d6Var2.d(profileStoriesView3.r, false);
            if (N) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (l7.d == null) {
                    k20 k20Var = new k20();
                    l7.d = k20Var;
                    k20Var.a = true;
                    k20Var.b = true;
                    int w02 = g6.w0(null, g6.xj, false);
                    int w03 = g6.w0(null, g6.q7, false);
                    l7.d.d(a.d(0.25f, w02, w03), w03, 0, 0);
                    l7.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    l7.d.c.setStyle(Paint.Style.STROKE);
                    l7.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                l7.d.b(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
                Paint paint8 = l7.d.c;
                paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint8.setAlpha((int) (f15 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j10)) {
                    float height = rectF5.height() * 0.32f;
                    canvas2.drawRoundRect(rectF5, height, height, paint8);
                } else {
                    canvas2.drawCircle(rectF5.centerX(), rectF5.centerY(), rectF5.width() / 2.0f, paint8);
                }
            } else if ((profileStoriesView3.v != null || profileStoriesView3.F > 0) && f15 > 0.0f) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF6.set(rectF4);
                rectF6.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                float f27 = f9;
                AndroidUtilities.lerp(rectF5, rectF6, f27, rectF6);
                Paint paint9 = paint;
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF4.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f15);
                int min = Math.min(profileStoriesView3.s, 50);
                float min2 = Math.min(d11, 50.0f);
                int i14 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i14 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i14 * 2, lerp4, f27);
                float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                paint6.setColor(a.d(profileStoriesView3.K, 1526726655, 973078528));
                paint6.getAlpha();
                float f28 = (-90.0f) - (lerp5 / 2.0f);
                int i15 = 0;
                boolean z13 = false;
                while (i15 < min) {
                    if (i15 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        i10 = i15;
                        if (((g4) arrayList5.get(i15)).l) {
                            z13 = true;
                        }
                    } else {
                        i10 = i15;
                        arrayList5 = arrayList2;
                    }
                    i15 = i10 + 1;
                    arrayList2 = arrayList5;
                }
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF7 = AndroidUtilities.rectTmp;
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF7, 255, 31);
                    float A = com.google.android.recaptcha.internal.a.A(profileStoriesView3.S, 1.0f, 2.5f, 1.0f);
                    if (A != 1.0f) {
                        canvas2.save();
                        canvas2.scale(A, A, rectF5.centerX(), rectF5.centerY());
                    }
                    int alpha2 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha2 * f15));
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint7.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView3.b(0.0f, 360.0f, canvas2, paint7, rectF6);
                    paint7.setAlpha(alpha2);
                    if (A != 1.0f) {
                        canvas2.restore();
                    }
                    rectF = rectF5;
                    arrayList3 = arrayList6;
                    paint2 = paint7;
                    profileStoriesView3 = profileStoriesView3;
                    rectF6 = rectF6;
                    paint = paint9;
                    j7Var2 = j7Var;
                } else {
                    ProfileStoriesView profileStoriesView4 = profileStoriesView3;
                    Paint paint10 = paint7;
                    RectF rectF8 = rectF6;
                    RectF rectF9 = rectF5;
                    ArrayList arrayList7 = arrayList6;
                    int i16 = 0;
                    while (i16 < min) {
                        float f29 = i16;
                        Paint paint11 = paint10;
                        float f30 = lerp5;
                        float clamp3 = 1.0f - Utilities.clamp(d12 - f29, 1.0f, 0.0f);
                        int i17 = min;
                        float clamp4 = 1.0f - Utilities.clamp((min - min2) - f29, 1.0f, 0.0f);
                        if (clamp4 < 0.0f) {
                            profileStoriesView2 = profileStoriesView4;
                            f21 = f28;
                            j7Var3 = j7Var;
                            paint4 = paint11;
                            arrayList4 = arrayList7;
                            f20 = min2;
                            rectF2 = rectF9;
                            rectF3 = rectF8;
                        } else {
                            float A2 = i16 == 0 ? com.google.android.recaptcha.internal.a.A(profileStoriesView4.S, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (A2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(A2, A2, rectF9.centerX(), rectF9.centerY());
                            }
                            boolean z14 = i16 < arrayList7.size() && ((g4) arrayList7.get(i16)).l;
                            if (clamp3 < 1.0f) {
                                if (z14) {
                                    j7Var4 = j7Var;
                                    paint5 = paint11;
                                } else {
                                    j7Var4 = j7Var;
                                    paint9 = j7Var4.a(rectF9);
                                    paint5 = paint9;
                                }
                                z10 = z14;
                                int alpha3 = paint5.getAlpha();
                                j7 j7Var6 = j7Var4;
                                Paint paint12 = paint5;
                                paint12.setAlpha((int) x3.y(1.0f, clamp3, alpha3, f15));
                                paint12.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 2.33f));
                                arrayList4 = arrayList7;
                                paint4 = paint11;
                                f19 = clamp3;
                                f18 = f28;
                                j7Var3 = j7Var6;
                                profileStoriesView4.b(f18, (-max) * clamp4, canvas2, paint12, rectF9);
                                paint12.setAlpha(alpha3);
                            } else {
                                z10 = z14;
                                f18 = f28;
                                j7Var3 = j7Var;
                                paint4 = paint11;
                                f19 = clamp3;
                                arrayList4 = arrayList7;
                            }
                            if (f19 > 0.0f) {
                                Paint paint13 = z10 ? paint4 : paint6;
                                int alpha4 = paint13.getAlpha();
                                paint13.setAlpha((int) (alpha4 * f19 * f15));
                                paint13.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                profileStoriesView2 = this;
                                canvas2 = canvas;
                                f20 = min2;
                                rectF2 = rectF9;
                                rectF3 = rectF8;
                                profileStoriesView2.b(f18, (-max) * clamp4, canvas2, paint13, rectF3);
                                paint13.setAlpha(alpha4);
                            } else {
                                profileStoriesView2 = this;
                                canvas2 = canvas;
                                f20 = min2;
                                rectF2 = rectF9;
                                rectF3 = rectF8;
                            }
                            if (A2 != 1.0f) {
                                canvas2.restore();
                            }
                            f21 = f18 - ((f30 * clamp4) + (max * clamp4));
                        }
                        i16++;
                        profileStoriesView4 = profileStoriesView2;
                        rectF8 = rectF3;
                        paint10 = paint4;
                        rectF9 = rectF2;
                        min2 = f20;
                        lerp5 = f30;
                        arrayList7 = arrayList4;
                        min = i17;
                        j7Var = j7Var3;
                        f28 = f21;
                    }
                    arrayList3 = arrayList7;
                    rectF = rectF9;
                    paint2 = paint10;
                    profileStoriesView3 = profileStoriesView4;
                    rectF6 = rectF8;
                    j7Var2 = j7Var;
                    paint = paint9;
                }
                if (z13) {
                    l7.k(canvas2, rectF6, f15, iz0Var.getImageReceiver().getVisible(), profileStoriesView3.E);
                    canvas2.restore();
                }
            }
            paint2 = paint7;
            rectF = rectF5;
            j7Var2 = j7Var;
            arrayList3 = arrayList2;
            paint = paint;
        } else {
            paint2 = paint7;
            rectF = rectF5;
            j7Var2 = j7Var;
            arrayList3 = arrayList2;
            f13 = 255.0f;
            f14 = 1.5f;
            f15 = clamp2;
        }
        profileStoriesView3.getExpandRight();
        if (profileStoriesView3.J <= 0.0f || f15 >= 1.0f) {
            profileStoriesView = profileStoriesView3;
            f16 = 18.0f;
        } else {
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                float f31 = ((g4) arrayList3.get(i18)).j;
                AndroidUtilities.dp(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            int i19 = 0;
            float f32 = 0.0f;
            while (true) {
                f17 = f12;
                if (i19 >= arrayList8.size()) {
                    break;
                }
                g4 g4Var3 = (g4) arrayList8.get(i19);
                float f33 = g4Var3.j;
                RectF rectF10 = g4Var3.n;
                int i20 = i19;
                float f34 = g4Var3.k;
                float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f33;
                float f35 = profileStoriesView3.b0 + dp + f32;
                float dp2 = f32 + (AndroidUtilities.dp(18.0f) * f33);
                float f36 = f35 + dp;
                f12 = Math.max(f17, f36);
                rectF.set(f35 - dp, f10 - dp, f36, f10 + dp);
                float f37 = profileStoriesView3.J;
                float lerp6 = AndroidUtilities.lerp(rectF4.centerX(), rectF.centerX(), f37);
                float lerp7 = AndroidUtilities.lerp(rectF4.centerY(), rectF.centerY(), f37);
                float lerp8 = AndroidUtilities.lerp(Math.min(rectF4.width(), rectF4.height()), Math.min(rectF.width(), rectF.height()), f37) / 2.0f;
                rectF6.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                g4Var3.m.set(rectF6);
                rectF10.set(rectF6);
                float f38 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView3.J), profileStoriesView3.J * f34)) * f33;
                rectF10.inset(f38, f38);
                i19 = i20 + 1;
                f32 = dp2;
            }
            f16 = 18.0f;
            paint6.setColor(a.d(profileStoriesView3.J, 1526726655, -2135178036));
            paint6.getAlpha();
            Paint a2 = j7Var2.a(rectF);
            a2.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f14), profileStoriesView3.J));
            paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f14), profileStoriesView3.J));
            paint2.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f14), profileStoriesView3.J));
            int i21 = 0;
            while (i21 < arrayList8.size()) {
                g4 g4Var4 = (g4) arrayList8.get(i21);
                int i22 = i21 - 2;
                int i23 = i21 - 1;
                g4 d13 = d(i22 >= 0 ? (g4) arrayList8.get(i22) : null, i23 >= 0 ? (g4) arrayList8.get(i23) : null, g4Var4);
                int i24 = i21 + 1;
                int i25 = i21 + 2;
                g4 d14 = d(i24 < arrayList8.size() ? (g4) arrayList8.get(i24) : null, i25 < arrayList8.size() ? (g4) arrayList8.get(i25) : null, g4Var4);
                if (d13 != null) {
                    RectF rectF11 = d13.n;
                    float centerX = rectF11.centerX();
                    RectF rectF12 = g4Var4.n;
                    RectF rectF13 = g4Var4.n;
                    if (Math.abs(centerX - rectF12.centerX()) < Math.abs((rectF13.width() / 2.0f) - (rectF11.width() / 2.0f)) || Math.abs(rectF11.centerX() - rectF13.centerX()) > (rectF13.width() / 2.0f) + (rectF11.width() / 2.0f)) {
                        d13 = null;
                    }
                }
                if (d14 != null) {
                    RectF rectF14 = d14.n;
                    float centerX2 = rectF14.centerX();
                    RectF rectF15 = g4Var4.n;
                    RectF rectF16 = g4Var4.n;
                    if (Math.abs(centerX2 - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                        g4Var = null;
                        if (g4Var4.k >= 1.0f) {
                            int alpha5 = a2.getAlpha();
                            a2.setAlpha((int) ((1.0f - f15) * (1.0f - g4Var4.k) * alpha5 * g4Var4.j));
                            profileStoriesView3.c(canvas, d13, g4Var4, g4Var, a2);
                            paint3 = a2;
                            paint3.setAlpha(alpha5);
                        } else {
                            paint3 = a2;
                        }
                        if (g4Var4.k <= 0.0f) {
                            Paint paint14 = g4Var4.l ? paint2 : paint6;
                            int alpha6 = paint14.getAlpha();
                            paint14.setAlpha((int) ((1.0f - f15) * alpha6 * g4Var4.j * g4Var4.k));
                            profileStoriesView3 = this;
                            profileStoriesView3.c(canvas, d13, g4Var4, g4Var, paint14);
                            paint14.setAlpha(alpha6);
                        } else {
                            profileStoriesView3 = this;
                        }
                        i21 = i24;
                        a2 = paint3;
                    }
                }
                g4Var = d14;
                if (g4Var4.k >= 1.0f) {
                }
                if (g4Var4.k <= 0.0f) {
                }
                i21 = i24;
                a2 = paint3;
            }
            Paint paint15 = a2;
            f12 = f17;
            profileStoriesView = profileStoriesView3;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView3.getWidth(), profileStoriesView3.getHeight(), (int) ((1.0f - f15) * profileStoriesView3.J * f13), 31);
            canvas2 = canvas;
            for (int size = arrayList8.size() - 1; size >= 0; size--) {
                g4 g4Var5 = (g4) arrayList8.get(size);
                ImageReceiver imageReceiver = g4Var5.b;
                ImageReceiver imageReceiver2 = g4Var5.b;
                if (imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i26 = size - 1;
                    int i27 = size - 2;
                    profileStoriesView.a(canvas2, g4Var5, d(i26 >= 0 ? (g4) arrayList8.get(i26) : null, i27 >= 0 ? (g4) arrayList8.get(i27) : null, g4Var5));
                    imageReceiver2.setImageCoords(g4Var5.m);
                    imageReceiver2.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            paint = paint15;
        }
        float f39 = f12;
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.J - 0.5f) * 2.0f);
        if (max2 > 0.0f) {
            float lerp9 = AndroidUtilities.lerp(rectF4.right + AndroidUtilities.dp(16.0f), f39 + AndroidUtilities.dp(12.0f), profileStoriesView.J);
            float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f11, profileStoriesView.J);
            float lerp11 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView.d0, profileStoriesView.J);
            n6 n6Var = profileStoriesView.n;
            n6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f16)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f16)));
            n6Var.w = (int) (max2 * f13);
            n6Var.draw(canvas2);
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
        TL_stories.PeerStories y8 = MessagesController.getInstance(i18).getStoriesController().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : z13;
        int max = z13 != null ? Math.max(0, z13.max_read_id) : 0;
        if (y8 != null) {
            max = Math.max(max, y8.max_read_id);
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
                    if (y8 != null) {
                        for (int i25 = 0; i25 < y8.stories.size(); i25++) {
                            if (y8.stories.get(i25).id == i24) {
                                storyItem3 = y8.stories.get(i25);
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
                    if (y8 != null) {
                        int i30 = 0;
                        while (true) {
                            if (i30 >= y8.stories.size()) {
                                break;
                            }
                            if (y8.stories.get(i30).id == i29) {
                                storyItem4 = y8.stories.get(i30);
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
                d6 d6Var = g4Var2.h;
                d6Var.d(0.0f, true);
                boolean z17 = z14 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                g4Var2.d = z17;
                if (!z10) {
                    g4Var2.f.f(z17, true);
                    g4Var2.g.d(g4Var2.c, true);
                    d6Var.d(g4Var2.e, true);
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
            ofFloat.addUpdateListener(new b3(6, this, zArr));
            this.T.addListener(new c3(6, this, zArr));
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
            if (contains && System.currentTimeMillis() - this.l0 <= ViewConfiguration.getTapTimeout() && z5.a(this.m0, this.n0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
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

    public void setActionBarActionMode(float f9) {
        if (g6.I.q()) {
            return;
        }
        this.K = f9;
        invalidate();
    }

    public void setExpandProgress(float f9) {
        if (this.J != f9) {
            this.J = f9;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f9) {
        if (this.E == f9) {
            return;
        }
        this.E = f9;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f9) {
        if (this.D == f9) {
            return;
        }
        this.D = f9;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public void e(c cVar) {
    }
}
