package org.telegram.ui.Stories;

import a3.c;
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
import cg.l0;
import dg.o1;
import dg.y2;
import i0.a;
import java.util.ArrayList;
import java.util.Collections;
import k7.n6;
import nh.e4;
import nh.f4;
import nh.g4;
import nh.k7;
import nh.m7;
import nh.s6;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tz0;
import org.telegram.ui.zy0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int p0 = 0;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public int G;
    public s6 H;
    public final k7 I;
    public final t6 J;
    public float K;
    public float L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final Path P;
    public final z5 Q;
    public final z5 R;
    public final z5 S;
    public float T;
    public ValueAnimator U;
    public final Path V;
    public final Matrix W;
    public final Paint a;
    public final PathMeasure a0;
    public final Paint b;
    public final Path b0;
    public final int c;
    public float c0;
    public final long d;
    public float d0;
    public final boolean e;
    public float e0;
    public final View f;
    public float f0;
    public float g0;
    public final tz0 h;
    public boolean h0;
    public final z5 i0;
    public final z5 j0;
    public final c k0;
    public final f4 l0;
    public long m0;
    public final j6 n;
    public float n0;
    public float o0;
    public int r;
    public int s;
    public g4 v;
    public final ArrayList w;
    public boolean x;
    public kj0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [nh.f4] */
    public ProfileStoriesView(Context context, int i10, long j10, boolean z4, View view, tz0 tz0Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        j6 j6Var = new j6(false, true, true, false);
        this.n = j6Var;
        Paint paint4 = new Paint(1);
        this.w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.D = 1.0f;
        this.E = 1.0f;
        this.I = new k7(this);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new Path();
        nr nrVar = nr.h;
        this.Q = new z5(this, 0L, 480L, nrVar);
        this.R = new z5(this, 0L, 240L, nrVar);
        this.S = new z5(this, 0L, 150L, nr.f);
        this.T = 1.0f;
        this.V = new Path();
        this.W = new Matrix();
        this.a0 = new PathMeasure();
        this.b0 = new Path();
        this.i0 = new z5(this, 0L, 350L, nrVar);
        this.j0 = new z5(this, 0L, 350L, nrVar);
        final zy0 zy0Var = (zy0) this;
        this.k0 = new c(zy0Var, 26);
        final int i11 = 0;
        this.l0 = new Runnable() { // from class: nh.f4
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                zy0 zy0Var2 = zy0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.p0;
                        zy0Var2.r0.w4(false);
                        break;
                    default:
                        zy0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j10;
        this.e = z4;
        this.f = view;
        this.h = tz0Var;
        final int i12 = 1;
        tz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: nh.f4
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                zy0 zy0Var2 = zy0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.p0;
                        zy0Var2.r0.w4(false);
                        break;
                    default:
                        zy0Var2.invalidate();
                        break;
                }
            }
        });
        this.J = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        j6Var.t(AndroidUtilities.dp(18.0f));
        j6Var.k(0.4f, 320L, nrVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(-1);
        j6Var.n(true);
        j6Var.setCallback(this);
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
        return this.f0 - (this.i0.e(this.h0) * AndroidUtilities.dp(71.0f));
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
        Path path = this.P;
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
        Path path = this.V;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.W;
        matrix.reset();
        matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.a0;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.b0;
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
                boolean z4 = centerX > centerX2;
                float degrees = (float) (z4 ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2)));
                boolean z10 = centerX3 > centerX2;
                float degrees2 = (float) (z10 ? Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2)) : Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2)));
                if (z4 && z10) {
                    float max = Math.max(degrees, degrees2);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z4) {
                    b(degrees2 + 180.0f, 180.0f - (degrees + degrees2), canvas, paint, rectF);
                    b(degrees, (180.0f - degrees2) - degrees, canvas, paint, rectF);
                    return;
                } else if (z10) {
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
        k7 k7Var;
        z5 z5Var;
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
        boolean z4;
        int i10;
        float f20;
        float f21;
        int i11;
        ProfileStoriesView profileStoriesView3;
        RectF rectF2;
        RectF rectF3;
        float f22;
        k7 k7Var2;
        Paint paint4;
        tz0 tz0Var;
        ArrayList arrayList5;
        z5 z5Var2;
        float f23;
        Paint paint5;
        s6 s6Var;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        int i12 = 0;
        float d = profileStoriesView4.j0.d(profileStoriesView4.d0, false);
        View view = profileStoriesView4.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView4.E;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f24 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f24);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f24)) + scaleY;
        RectF rectF4 = profileStoriesView4.M;
        rectF4.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f25 = profileStoriesView4.c0;
        int i13 = 0;
        while (true) {
            arrayList = profileStoriesView4.w;
            if (i13 >= arrayList.size()) {
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i13);
            float d10 = g4Var3.h.d(g4Var3.e, false);
            g4Var3.j = d10;
            if (d10 > 0.0f || g4Var3.e > 0.0f) {
                g4Var3.i = g4Var3.g.d(g4Var3.c, false);
                g4Var3.k = g4Var3.f.e(g4Var3.d);
                if (i13 > 0 && ((g4) arrayList.get(i13 - 1)).i > g4Var3.i) {
                    Collections.sort(arrayList, new e4(i12));
                    break;
                }
            } else {
                g4Var3.b.onDetachedFromWindow();
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView4.K / 0.2f), 1.0f, 0.0f);
        t6 t6Var = profileStoriesView4.J;
        long j11 = profileStoriesView4.d;
        boolean N = t6Var.N(j11);
        boolean K = t6Var.K(j11);
        z5 z5Var3 = profileStoriesView4.S;
        if (!K && (s6Var = profileStoriesView4.H) != null && s6Var.v) {
            profileStoriesView4.B = false;
            profileStoriesView4.C = false;
            z5Var3.getClass();
            z5Var3.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, z5Var3.e((K && !N) || (profileStoriesView4.B && !profileStoriesView4.C)), profileStoriesView4.F);
        canvas2.save();
        float f26 = profileStoriesView4.D;
        canvas2.scale(f26, f26, rectF4.centerX(), rectF4.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView4.g0, profileStoriesView4.K);
        profileStoriesView4.H = null;
        z5 z5Var4 = profileStoriesView4.R;
        z5 z5Var5 = profileStoriesView4.Q;
        tz0 tz0Var2 = profileStoriesView4.h;
        k7 k7Var3 = profileStoriesView4.I;
        RectF rectF5 = profileStoriesView4.N;
        if (lerp2 > 0.0f) {
            rectF5.set(rectF4);
            f11 = lerp3;
            f13 = f25;
            rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint a2 = k7Var3.a(rectF5);
            if (profileStoriesView4.y == null) {
                kj0 kj0Var = new kj0(profileStoriesView4);
                profileStoriesView4.y = kj0Var;
                f12 = d;
                k7Var = k7Var3;
                z5Var2 = z5Var4;
                kj0Var.d(null, true, false);
                profileStoriesView4.y.u = ChatObject.isForum(UserConfig.selectedAccount, j11);
            } else {
                f12 = d;
                k7Var = k7Var3;
                z5Var2 = z5Var4;
            }
            if (!t6Var.K(j11) || t6Var.N(j11)) {
                f23 = 1.0f;
            } else {
                ArrayList E = t6Var.E(j11);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView4.H = (s6) E.get(0);
                    }
                    float f27 = 0.0f;
                    for (int i14 = 0; i14 < E.size(); i14++) {
                        f27 += ((s6) E.get(i14)).h;
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
            kj0 kj0Var2 = profileStoriesView4.y;
            kj0Var2.t = a2;
            arrayList2 = arrayList;
            f10 = clamp;
            kj0Var2.f((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
            z5Var = z5Var2;
            profileStoriesView4.y.e(Utilities.clamp(f23, 1.0f, 0.0f), true);
            if (tz0Var2.N) {
                profileStoriesView4.y.a(canvas2);
            }
            a2.setAlpha(alpha);
            profileStoriesView4.B = true;
            boolean z10 = profileStoriesView4.C;
            boolean z11 = profileStoriesView4.y.f >= 0.98f;
            profileStoriesView4.C = z11;
            if (z10 != z11) {
                z5Var5.d(profileStoriesView4.s, true);
                z5Var.d(profileStoriesView4.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                paint5 = a2;
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(nr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                j10 = j11;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                o1 o1Var = new o1(profileStoriesView4, 28);
                ofFloat.addUpdateListener(o1Var);
                ofFloat2.addUpdateListener(o1Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new l0(profileStoriesView4, 21));
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
            k7Var = k7Var3;
            z5Var = z5Var4;
            profileStoriesView4.B = false;
            paint = null;
        }
        Paint paint6 = profileStoriesView4.a;
        Paint paint7 = profileStoriesView4.b;
        RectF rectF6 = profileStoriesView4.O;
        if (lerp2 < 1.0f) {
            f14 = 12.0f;
            f15 = 255.0f;
            float clamp3 = Utilities.clamp(1.0f - (profileStoriesView4.K / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            f16 = 1.5f;
            float d11 = z5Var5.d(profileStoriesView4.s, false);
            float d12 = z5Var.d(profileStoriesView4.r, false);
            if (N) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (m7.d == null) {
                    p20 p20Var = new p20();
                    m7.d = p20Var;
                    p20Var.a = true;
                    p20Var.b = true;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false);
                    m7.d.d(a.d(0.25f, w02, w03), w03, 0, 0);
                    m7.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    m7.d.c.setStyle(Paint.Style.STROKE);
                    m7.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                m7.d.b(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
                Paint paint8 = m7.d.c;
                paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint8.setAlpha((int) (clamp3 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j10)) {
                    float height = rectF5.height() * 0.32f;
                    canvas2.drawRoundRect(rectF5, height, height, paint8);
                } else {
                    canvas2.drawCircle(rectF5.centerX(), rectF5.centerY(), rectF5.width() / 2.0f, paint8);
                }
            } else if ((profileStoriesView4.v != null || profileStoriesView4.G > 0) && clamp3 > 0.0f) {
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
                int i15 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i15 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i15 * 2, lerp4, f28);
                float max2 = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                paint6.setColor(a.d(profileStoriesView4.L, 1526726655, 973078528));
                paint6.getAlpha();
                float f30 = (-90.0f) - (lerp5 / 2.0f);
                boolean z12 = false;
                int i16 = 0;
                while (i16 < min) {
                    if (i16 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        tz0Var = tz0Var2;
                        if (((g4) arrayList5.get(i16)).l) {
                            z12 = true;
                        }
                    } else {
                        tz0Var = tz0Var2;
                        arrayList5 = arrayList2;
                    }
                    i16++;
                    arrayList2 = arrayList5;
                    tz0Var2 = tz0Var;
                }
                tz0 tz0Var3 = tz0Var2;
                ArrayList arrayList6 = arrayList2;
                if (z12) {
                    RectF rectF7 = AndroidUtilities.rectTmp;
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF7, 255, 31);
                    float x10 = e2.c.x(profileStoriesView4.T, 1.0f, 2.5f, 1.0f);
                    if (x10 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(x10, x10, rectF5.centerX(), rectF5.centerY());
                    }
                    int alpha2 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha2 * f29));
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint7.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView4.b(0.0f, 360.0f, canvas2, paint7, rectF6);
                    paint7.setAlpha(alpha2);
                    if (x10 != 1.0f) {
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
                    int i17 = 0;
                    while (true) {
                        arrayList4 = arrayList6;
                        if (i17 >= min) {
                            break;
                        }
                        float f31 = i17;
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
                            i11 = i17;
                        } else {
                            float x11 = i17 == 0 ? e2.c.x(profileStoriesView5.T, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (x11 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(x11, x11, rectF9.centerX(), rectF9.centerY());
                            }
                            boolean z13 = i17 < arrayList4.size() && ((g4) arrayList4.get(i17)).l;
                            if (clamp4 < 1.0f) {
                                if (z13) {
                                    k7Var2 = k7Var;
                                    paint4 = paint11;
                                } else {
                                    k7Var2 = k7Var;
                                    paint9 = k7Var2.a(rectF9);
                                    paint4 = paint9;
                                }
                                z4 = z13;
                                int alpha3 = paint4.getAlpha();
                                k7 k7Var4 = k7Var2;
                                i10 = min;
                                f21 = f29;
                                Paint paint12 = paint4;
                                paint12.setAlpha((int) y3.y(1.0f, clamp4, alpha3, f21));
                                paint12.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 2.33f));
                                ProfileStoriesView profileStoriesView6 = profileStoriesView5;
                                f20 = f30;
                                i11 = i17;
                                arrayList6 = arrayList4;
                                k7Var = k7Var4;
                                profileStoriesView6.b(f20, (-max2) * clamp5, canvas2, paint12, rectF9);
                                paint12.setAlpha(alpha3);
                            } else {
                                arrayList6 = arrayList4;
                                z4 = z13;
                                i10 = min;
                                f20 = f30;
                                f21 = f29;
                                i11 = i17;
                            }
                            if (clamp4 > 0.0f) {
                                Paint paint13 = z4 ? paint11 : paint6;
                                int alpha4 = paint13.getAlpha();
                                paint13.setAlpha((int) (alpha4 * clamp4 * f21));
                                paint13.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 1.5f));
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
                            if (x11 != 1.0f) {
                                canvas2.restore();
                            }
                            f22 = f20 - ((f32 * clamp5) + (max2 * clamp5));
                        }
                        i17 = i11 + 1;
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
                if (z12) {
                    m7.k(canvas2, rectF6, f17, tz0Var3.getImageReceiver().getVisible(), profileStoriesView4.F);
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
        if (profileStoriesView4.K > 0.0f) {
            ArrayList arrayList7 = arrayList3;
            k7 k7Var5 = k7Var;
            Paint paint14 = paint2;
            if (f17 < 1.0f) {
                for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                    float f33 = ((g4) arrayList7.get(i18)).j;
                    AndroidUtilities.dp(14.0f);
                }
                float f34 = f13;
                int i19 = 0;
                float f35 = 0.0f;
                while (i19 < arrayList7.size()) {
                    g4 g4Var4 = (g4) arrayList7.get(i19);
                    float f36 = g4Var4.j;
                    RectF rectF10 = g4Var4.n;
                    int i20 = i19;
                    float f37 = g4Var4.k;
                    float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f36;
                    float f38 = profileStoriesView4.c0 + dp + f35;
                    float dp2 = f35 + (AndroidUtilities.dp(18.0f) * f36);
                    float f39 = f38 + dp;
                    f34 = Math.max(f34, f39);
                    rectF.set(f38 - dp, f11 - dp, f39, f11 + dp);
                    float f40 = profileStoriesView4.K;
                    float lerp6 = AndroidUtilities.lerp(rectF4.centerX(), rectF.centerX(), f40);
                    float lerp7 = AndroidUtilities.lerp(rectF4.centerY(), rectF.centerY(), f40);
                    float lerp8 = AndroidUtilities.lerp(Math.min(rectF4.width(), rectF4.height()), Math.min(rectF.width(), rectF.height()), f40) / 2.0f;
                    rectF6.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                    g4Var4.m.set(rectF6);
                    rectF10.set(rectF6);
                    float f41 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.K), profileStoriesView4.K * f37)) * f36;
                    rectF10.inset(f41, f41);
                    i19 = i20 + 1;
                    f35 = dp2;
                    f17 = f17;
                }
                float f42 = f17;
                f18 = 18.0f;
                paint6.setColor(a.d(profileStoriesView4.K, 1526726655, -2135178036));
                paint6.getAlpha();
                Paint a10 = k7Var5.a(rectF);
                a10.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f16), profileStoriesView4.K));
                paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f16), profileStoriesView4.K));
                paint14.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f16), profileStoriesView4.K));
                int i21 = 0;
                while (i21 < arrayList7.size()) {
                    g4 g4Var5 = (g4) arrayList7.get(i21);
                    int i22 = i21 - 2;
                    g4 g4Var6 = i22 >= 0 ? (g4) arrayList7.get(i22) : null;
                    int i23 = i21 - 1;
                    g4 d13 = d(g4Var6, i23 >= 0 ? (g4) arrayList7.get(i23) : null, g4Var5);
                    int i24 = i21 + 1;
                    int i25 = i21 + 2;
                    g4 d14 = d(i24 < arrayList7.size() ? (g4) arrayList7.get(i24) : null, i25 < arrayList7.size() ? (g4) arrayList7.get(i25) : null, g4Var5);
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
                                        int alpha5 = a10.getAlpha();
                                        a10.setAlpha((int) ((1.0f - f42) * (1.0f - g4Var5.k) * alpha5 * g4Var5.j));
                                        profileStoriesView4.c(canvas, g4Var, g4Var5, g4Var2, a10);
                                        paint3 = a10;
                                        paint3.setAlpha(alpha5);
                                    } else {
                                        paint3 = a10;
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
                                    i21 = i24;
                                    a10 = paint3;
                                    profileStoriesView4 = profileStoriesView2;
                                }
                            }
                            g4Var2 = d14;
                            if (g4Var5.k < 1.0f) {
                            }
                            if (g4Var5.k > 0.0f) {
                            }
                            i21 = i24;
                            a10 = paint3;
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
                    i21 = i24;
                    a10 = paint3;
                    profileStoriesView4 = profileStoriesView2;
                }
                profileStoriesView = profileStoriesView4;
                Paint paint16 = a10;
                canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f42) * profileStoriesView.K * f15), 31);
                canvas2 = canvas;
                for (int size = arrayList7.size() - 1; size >= 0; size--) {
                    g4 g4Var7 = (g4) arrayList7.get(size);
                    ImageReceiver imageReceiver = g4Var7.b;
                    ImageReceiver imageReceiver2 = g4Var7.b;
                    if (imageReceiver.getVisible()) {
                        int saveCount = canvas2.getSaveCount();
                        int i26 = size - 1;
                        g4 g4Var8 = i26 >= 0 ? (g4) arrayList7.get(i26) : null;
                        int i27 = size - 2;
                        profileStoriesView.a(canvas2, g4Var7, d(g4Var8, i27 >= 0 ? (g4) arrayList7.get(i27) : null, g4Var7));
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
                max = Math.max(0.0f, (profileStoriesView.K - 0.5f) * 2.0f);
                if (max <= 0.0f) {
                    float lerp9 = AndroidUtilities.lerp(rectF4.right + AndroidUtilities.dp(16.0f), f19 + AndroidUtilities.dp(f14), profileStoriesView.K);
                    float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f12, profileStoriesView.K);
                    float lerp11 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView.e0, profileStoriesView.K);
                    j6 j6Var = profileStoriesView.n;
                    j6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f18)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f18)));
                    j6Var.w = (int) (max * f15);
                    j6Var.draw(canvas2);
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
        max = Math.max(0.0f, (profileStoriesView.K - 0.5f) * 2.0f);
        if (max <= 0.0f) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        if (r3 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z4, boolean z10) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        t6 t6Var;
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
        boolean z11 = j10 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z12 = MessagesController.getInstance(i18).getStoriesController().z(j10);
        TL_stories.PeerStories y10 = MessagesController.getInstance(i18).getStoriesController().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : z12;
        int max = z12 != null ? Math.max(0, z12.max_read_id) : 0;
        if (y10 != null) {
            max = Math.max(max, y10.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        int i20 = this.r;
        this.r = 0;
        boolean z13 = z11;
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
                    boolean z14 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z14) {
                        if (z12 != null) {
                            int i26 = 0;
                            while (true) {
                                if (i26 >= z12.stories.size()) {
                                    break;
                                }
                                if (z12.stories.get(i26).id == i24) {
                                    z12.stories.get(i26);
                                    break;
                                }
                                i26++;
                            }
                        }
                    } else if (z14) {
                        continue;
                    }
                } else {
                    i17 = i23;
                }
                int i27 = storyItem3.expire_date;
                if ((i27 == 0 || currentTime <= i27) && (z13 || storyItem3.id > max)) {
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
                    boolean z15 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z15) {
                        if (z12 != null) {
                            int i31 = 0;
                            while (true) {
                                if (i31 >= z12.stories.size()) {
                                    break;
                                }
                                if (z12.stories.get(i31).id == i29) {
                                    z12.stories.get(i31);
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
            t6Var = this.J;
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
                g4Var.d = z13 || !(peerStories == null || storyItem == null || storyItem.id > t6Var.x(j10));
            }
            if (!z4) {
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
                z5 z5Var = g4Var2.h;
                z5Var.d(0.0f, true);
                boolean z16 = z13 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                g4Var2.d = z16;
                if (!z4) {
                    g4Var2.f.f(z16, true);
                    g4Var2.g.d(g4Var2.c, true);
                    z5Var.d(g4Var2.e, true);
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
        ArrayList E = t6Var.E(j10);
        this.G = E == null ? 0 : E.size();
        int max2 = Math.max(arrayList3.size(), i21);
        int i37 = (max2 != 0 || this.G == 0) ? max2 : 1;
        if (z10 && z4 && i37 == this.s + 1 && this.r == i10 + 1) {
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new ag.a(7, this, zArr));
            this.U.addListener(new y2(6, this, zArr));
            this.U.setInterpolator(new OvershootInterpolator(3.0f));
            this.U.setDuration(400L);
            this.U.setStartDelay(120L);
            this.U.start();
        }
        this.s = i37;
        this.n.q(i37 > 0 ? LocaleController.formatPluralString("Stories", i37, new Object[0]) : "", z4 && !LocaleController.isRTL, true);
        k7 k7Var = this.I;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j10));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    k7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z4);
                }
            }
            if (user != null) {
                k7Var.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(k7Var.a).profilePeerColors;
                    k7Var.c(peerColors != null ? null : peerColors.getColor(i14), z4);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(k7Var.a).profilePeerColors;
            k7Var.c(peerColors2 != null ? null : peerColors2.getColor(i14), z4);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j10));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    k7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z4);
                }
            }
            if (chat != null) {
                k7Var.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(k7Var.a).profilePeerColors;
                    k7Var.c(peerColors3 != null ? null : peerColors3.getColor(i13), z4);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(k7Var.a).profilePeerColors;
            k7Var.c(peerColors32 != null ? null : peerColors32.getColor(i13), z4);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.F;
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
        boolean contains = this.K < 0.9f ? this.N.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.c0 && motionEvent.getX() <= this.d0 && Math.abs(motionEvent.getY() - this.e0) < ((float) AndroidUtilities.dp(32.0f));
        f4 f4Var = this.l0;
        if (contains && motionEvent.getAction() == 0) {
            this.m0 = System.currentTimeMillis();
            this.n0 = motionEvent.getX();
            this.o0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            AndroidUtilities.runOnUIThread(f4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            if (contains && System.currentTimeMillis() - this.m0 <= ViewConfiguration.getTapTimeout() && n6.a(this.n0, this.o0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                t6 t6Var = this.J;
                long j10 = this.d;
                if (t6Var.K(j10) || t6Var.I(j10) || !this.w.isEmpty()) {
                    e(this.k0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.m0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            return;
        }
        this.L = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.K != f10) {
            this.K = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.F == f10) {
            return;
        }
        this.F = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
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
