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
import com.google.android.gms.internal.vision.e2;
import i0.a;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.vz0;
import qg.o;
import sg.p;
import v7.a7;
import yg.b;
import zh.a6;
import zh.b3;
import zh.c3;
import zh.d3;
import zh.e3;
import zh.h5;
import zh.i5;
import zh.y5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public h5 K;
    public final y5 L;
    public final i5 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final d6 T;
    public final d6 U;
    public final d6 V;
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
    public final s01 h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final d6 l0;
    public final d6 m0;
    public final n6 n;
    public final d3 n0;
    public final c3 o0;
    public long p0;
    public float q0;
    public int r;
    public float r0;
    public int s;
    public e3 v;
    public final ArrayList w;
    public boolean x;
    public lj0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [zh.c3] */
    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, s01 s01Var, f6 f6Var) {
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
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new y5(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        wr wrVar = wr.h;
        this.T = new d6(this, 0L, 480L, wrVar);
        this.U = new d6(this, 0L, 240L, wrVar);
        this.V = new d6(this, 0L, 150L, wr.f);
        this.W = 1.0f;
        this.b0 = new Path();
        this.c0 = new Matrix();
        this.d0 = new PathMeasure();
        this.e0 = new Path();
        this.l0 = new d6(this, 0L, 350L, wrVar);
        this.m0 = new d6(this, 0L, 350L, wrVar);
        final vz0 vz0Var = (vz0) this;
        this.n0 = new d3(vz0Var);
        final int i11 = 0;
        this.o0 = new Runnable() { // from class: zh.c3
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                vz0 vz0Var2 = vz0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        vz0Var2.u0.w4(false);
                        break;
                    default:
                        vz0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j3;
        this.e = z10;
        this.f = view;
        this.h = s01Var;
        final int i12 = 1;
        s01Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: zh.c3
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                vz0 vz0Var2 = vz0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        vz0Var2.u0.w4(false);
                        break;
                    default:
                        vz0Var2.invalidate();
                        break;
                }
            }
        });
        this.M = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(j6.v0(j6.nk, f6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(j6.v0(j6.d6, f6Var));
        n6Var.t(AndroidUtilities.dp(18.0f));
        n6Var.k(0.4f, 320L, wrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(-1);
        n6Var.n(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static e3 d(e3 e3Var, e3 e3Var2, e3 e3Var3) {
        if (e3Var3 == null) {
            return null;
        }
        RectF rectF = e3Var3.n;
        if (e3Var == null && e3Var2 == null) {
            return null;
        }
        if (e3Var != null) {
            RectF rectF2 = e3Var.n;
            if (e3Var2 != null) {
                RectF rectF3 = e3Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? e3Var : e3Var2;
            }
        }
        return e3Var != null ? e3Var : e3Var2;
    }

    private float getExpandRight() {
        return this.i0 - (this.l0.e(this.k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, e3 e3Var, e3 e3Var2) {
        if (e3Var2 == null) {
            return;
        }
        RectF rectF = e3Var2.m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * e3Var2.j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = e3Var.m;
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
        if (!ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
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

    public final void c(Canvas canvas, e3 e3Var, e3 e3Var2, e3 e3Var3, Paint paint) {
        e3 e3Var4 = e3Var;
        RectF rectF = e3Var2.n;
        if (e3Var4 == null && e3Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (e3Var4 != null) {
            RectF rectF2 = e3Var4.n;
            if (e3Var3 != null) {
                RectF rectF3 = e3Var3.n;
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
        if (e3Var4 == null && e3Var3 == null) {
            return;
        }
        if (e3Var4 == null) {
            e3Var4 = e3Var3;
        }
        float centerX4 = e3Var4.n.centerX();
        float width4 = e3Var4.n.width() / 2.0f;
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        float f10;
        float f11;
        long j3;
        float f12;
        ArrayList arrayList2;
        y5 y5Var;
        d6 d6Var;
        Paint paint;
        Paint paint2;
        RectF rectF;
        ArrayList arrayList3;
        float f13;
        float f14;
        float f15;
        float f16;
        ProfileStoriesView profileStoriesView;
        float f17;
        float f18;
        float max;
        e3 e3Var;
        e3 e3Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ArrayList arrayList4;
        boolean z10;
        int i10;
        float f19;
        float f20;
        int i11;
        ProfileStoriesView profileStoriesView3;
        RectF rectF2;
        RectF rectF3;
        float f21;
        y5 y5Var2;
        Paint paint4;
        s01 s01Var;
        ArrayList arrayList5;
        d6 d6Var2;
        float f22;
        Paint paint5;
        h5 h5Var;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        float d = profileStoriesView4.m0.d(profileStoriesView4.g0, false);
        View view = profileStoriesView4.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView4.H;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f23 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f23);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f23)) + scaleY;
        RectF rectF4 = profileStoriesView4.P;
        rectF4.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f24 = profileStoriesView4.f0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView4.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            e3 e3Var3 = (e3) arrayList.get(i12);
            float d10 = e3Var3.h.d(e3Var3.e, false);
            e3Var3.j = d10;
            if (d10 > 0.0f || e3Var3.e > 0.0f) {
                e3Var3.i = e3Var3.g.d(e3Var3.c, false);
                e3Var3.k = e3Var3.f.e(e3Var3.d);
                if (i12 > 0 && ((e3) arrayList.get(i12 - 1)).i > e3Var3.i) {
                    Collections.sort(arrayList, new p(25));
                    break;
                }
            } else {
                e3Var3.b.onDetachedFromWindow();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView4.N / 0.2f), 1.0f, 0.0f);
        i5 i5Var = profileStoriesView4.M;
        long j10 = profileStoriesView4.d;
        boolean N = i5Var.N(j10);
        boolean K = i5Var.K(j10);
        d6 d6Var3 = profileStoriesView4.V;
        if (!K && (h5Var = profileStoriesView4.K) != null && h5Var.v) {
            profileStoriesView4.E = false;
            profileStoriesView4.F = false;
            d6Var3.getClass();
            d6Var3.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, d6Var3.e((K && !N) || (profileStoriesView4.E && !profileStoriesView4.F)), profileStoriesView4.I);
        canvas2.save();
        float f25 = profileStoriesView4.G;
        canvas2.scale(f25, f25, rectF4.centerX(), rectF4.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView4.j0, profileStoriesView4.N);
        profileStoriesView4.K = null;
        d6 d6Var4 = profileStoriesView4.U;
        d6 d6Var5 = profileStoriesView4.T;
        s01 s01Var2 = profileStoriesView4.h;
        y5 y5Var3 = profileStoriesView4.L;
        RectF rectF5 = profileStoriesView4.Q;
        if (lerp2 > 0.0f) {
            rectF5.set(rectF4);
            f10 = lerp3;
            f12 = f24;
            rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint a2 = y5Var3.a(rectF5);
            if (profileStoriesView4.y == null) {
                lj0 lj0Var = new lj0(profileStoriesView4);
                profileStoriesView4.y = lj0Var;
                f11 = d;
                y5Var = y5Var3;
                d6Var2 = d6Var4;
                lj0Var.d(null, true, false);
                profileStoriesView4.y.u = ChatObject.isForum(UserConfig.selectedAccount, j10);
            } else {
                f11 = d;
                y5Var = y5Var3;
                d6Var2 = d6Var4;
            }
            if (!i5Var.K(j10) || i5Var.N(j10)) {
                f22 = 1.0f;
            } else {
                ArrayList E = i5Var.E(j10);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView4.K = (h5) E.get(0);
                    }
                    float f26 = 0.0f;
                    for (int i13 = 0; i13 < E.size(); i13++) {
                        f26 += ((h5) E.get(i13)).h;
                    }
                    f22 = f26 / E.size();
                } else {
                    f22 = 0.0f;
                }
            }
            profileStoriesView4.y.q = 0;
            int alpha = a2.getAlpha();
            a2.setAlpha((int) (alpha * clamp2 * lerp2));
            a2.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            lj0 lj0Var2 = profileStoriesView4.y;
            lj0Var2.t = a2;
            arrayList2 = arrayList;
            f7 = clamp;
            lj0Var2.f((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
            d6Var = d6Var2;
            profileStoriesView4.y.e(Utilities.clamp(f22, 1.0f, 0.0f), true);
            if (s01Var2.Q) {
                profileStoriesView4.y.a(canvas2);
            }
            a2.setAlpha(alpha);
            profileStoriesView4.E = true;
            boolean z11 = profileStoriesView4.F;
            boolean z12 = profileStoriesView4.y.f >= 0.98f;
            profileStoriesView4.F = z12;
            if (z11 != z12) {
                d6Var5.d(profileStoriesView4.s, true);
                d6Var.d(profileStoriesView4.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                paint5 = a2;
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(wr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                j3 = j10;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                o oVar = new o(profileStoriesView4, 23);
                ofFloat.addUpdateListener(oVar);
                ofFloat2.addUpdateListener(oVar);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new b(profileStoriesView4, 9));
                animatorSet.start();
            } else {
                paint5 = a2;
                j3 = j10;
            }
            paint = paint5;
        } else {
            f7 = clamp;
            f10 = lerp3;
            f11 = d;
            j3 = j10;
            f12 = f24;
            arrayList2 = arrayList;
            y5Var = y5Var3;
            d6Var = d6Var4;
            profileStoriesView4.E = false;
            paint = null;
        }
        Paint paint6 = profileStoriesView4.a;
        Paint paint7 = profileStoriesView4.b;
        RectF rectF6 = profileStoriesView4.R;
        if (lerp2 < 1.0f) {
            f13 = 12.0f;
            f14 = 255.0f;
            float clamp3 = Utilities.clamp(1.0f - (profileStoriesView4.N / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            f15 = 1.5f;
            float d11 = d6Var5.d(profileStoriesView4.s, false);
            float d12 = d6Var.d(profileStoriesView4.r, false);
            if (N) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (a6.d == null) {
                    x20 x20Var = new x20();
                    a6.d = x20Var;
                    x20Var.a = true;
                    x20Var.b = true;
                    int w02 = j6.w0(null, j6.xj, false);
                    int w03 = j6.w0(null, j6.q7, false);
                    a6.d.d(a.d(0.25f, w02, w03), w03, 0, 0);
                    a6.d.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    a6.d.c.setStyle(Paint.Style.STROKE);
                    a6.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                a6.d.b(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
                Paint paint8 = a6.d.c;
                paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint8.setAlpha((int) (clamp3 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j3)) {
                    float height = rectF5.height() * 0.32f;
                    canvas2.drawRoundRect(rectF5, height, height, paint8);
                } else {
                    canvas2.drawCircle(rectF5.centerX(), rectF5.centerY(), rectF5.width() / 2.0f, paint8);
                }
            } else if ((profileStoriesView4.v != null || profileStoriesView4.J > 0) && clamp3 > 0.0f) {
                rectF5.set(rectF4);
                rectF5.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF6.set(rectF4);
                rectF6.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                float f27 = f7;
                AndroidUtilities.lerp(rectF5, rectF6, f27, rectF6);
                float f28 = clamp3;
                Paint paint9 = paint;
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF4.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f28);
                int min = Math.min(profileStoriesView4.s, 50);
                float min2 = Math.min(d11, 50.0f);
                int i14 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i14 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i14 * 2, lerp4, f27);
                float max2 = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                paint6.setColor(a.d(profileStoriesView4.O, 1526726655, 973078528));
                paint6.getAlpha();
                float f29 = (-90.0f) - (lerp5 / 2.0f);
                boolean z13 = false;
                int i15 = 0;
                while (i15 < min) {
                    if (i15 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        s01Var = s01Var2;
                        if (((e3) arrayList5.get(i15)).l) {
                            z13 = true;
                        }
                    } else {
                        s01Var = s01Var2;
                        arrayList5 = arrayList2;
                    }
                    i15++;
                    arrayList2 = arrayList5;
                    s01Var2 = s01Var;
                }
                s01 s01Var3 = s01Var2;
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF7 = AndroidUtilities.rectTmp;
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF7, 255, 31);
                    float A = e2.A(profileStoriesView4.W, 1.0f, 2.5f, 1.0f);
                    if (A != 1.0f) {
                        canvas2.save();
                        canvas2.scale(A, A, rectF5.centerX(), rectF5.centerY());
                    }
                    int alpha2 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha2 * f28));
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
                    f16 = f28;
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
                        float f30 = i16;
                        Paint paint11 = paint10;
                        float f31 = lerp5;
                        float clamp4 = 1.0f - Utilities.clamp(d12 - f30, 1.0f, 0.0f);
                        float clamp5 = 1.0f - Utilities.clamp((min - min2) - f30, 1.0f, 0.0f);
                        if (clamp5 < 0.0f) {
                            profileStoriesView3 = profileStoriesView5;
                            arrayList6 = arrayList4;
                            rectF2 = rectF9;
                            i10 = min;
                            f21 = f29;
                            f20 = f28;
                            rectF3 = rectF8;
                            i11 = i16;
                        } else {
                            float A2 = i16 == 0 ? e2.A(profileStoriesView5.W, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (A2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(A2, A2, rectF9.centerX(), rectF9.centerY());
                            }
                            boolean z14 = i16 < arrayList4.size() && ((e3) arrayList4.get(i16)).l;
                            if (clamp4 < 1.0f) {
                                if (z14) {
                                    y5Var2 = y5Var;
                                    paint4 = paint11;
                                } else {
                                    y5Var2 = y5Var;
                                    paint9 = y5Var2.a(rectF9);
                                    paint4 = paint9;
                                }
                                z10 = z14;
                                int alpha3 = paint4.getAlpha();
                                y5 y5Var4 = y5Var2;
                                i10 = min;
                                f20 = f28;
                                Paint paint12 = paint4;
                                paint12.setAlpha((int) a2.A(1.0f, clamp4, alpha3, f20));
                                paint12.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 2.33f));
                                ProfileStoriesView profileStoriesView6 = profileStoriesView5;
                                f19 = f29;
                                i11 = i16;
                                arrayList6 = arrayList4;
                                y5Var = y5Var4;
                                profileStoriesView6.b(f19, (-max2) * clamp5, canvas2, paint12, rectF9);
                                paint12.setAlpha(alpha3);
                            } else {
                                arrayList6 = arrayList4;
                                z10 = z14;
                                i10 = min;
                                f19 = f29;
                                f20 = f28;
                                i11 = i16;
                            }
                            if (clamp4 > 0.0f) {
                                Paint paint13 = z10 ? paint11 : paint6;
                                int alpha4 = paint13.getAlpha();
                                paint13.setAlpha((int) (alpha4 * clamp4 * f20));
                                paint13.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF2 = rectF9;
                                rectF3 = rectF8;
                                profileStoriesView3.b(f19, (-max2) * clamp5, canvas2, paint13, rectF3);
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
                            f21 = f19 - ((f31 * clamp5) + (max2 * clamp5));
                        }
                        i16 = i11 + 1;
                        f29 = f21;
                        rectF8 = rectF3;
                        f28 = f20;
                        rectF9 = rectF2;
                        lerp5 = f31;
                        min = i10;
                        profileStoriesView5 = profileStoriesView3;
                        paint10 = paint11;
                    }
                    arrayList3 = arrayList4;
                    rectF = rectF9;
                    paint2 = paint10;
                    profileStoriesView4 = profileStoriesView5;
                    f16 = f28;
                    rectF6 = rectF8;
                    paint = paint9;
                }
                if (z13) {
                    a6.k(canvas2, rectF6, f16, s01Var3.getImageReceiver().getVisible(), profileStoriesView4.I);
                    canvas2.restore();
                }
            }
            paint2 = paint7;
            rectF = rectF5;
            f16 = clamp3;
            arrayList3 = arrayList2;
            paint = paint;
        } else {
            paint2 = paint7;
            rectF = rectF5;
            arrayList3 = arrayList2;
            f13 = 12.0f;
            f14 = 255.0f;
            f15 = 1.5f;
            f16 = clamp2;
        }
        profileStoriesView4.getExpandRight();
        if (profileStoriesView4.N > 0.0f) {
            ArrayList arrayList7 = arrayList3;
            y5 y5Var5 = y5Var;
            Paint paint14 = paint2;
            if (f16 < 1.0f) {
                for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                    float f32 = ((e3) arrayList7.get(i17)).j;
                    AndroidUtilities.dp(14.0f);
                }
                float f33 = f12;
                int i18 = 0;
                float f34 = 0.0f;
                while (i18 < arrayList7.size()) {
                    e3 e3Var4 = (e3) arrayList7.get(i18);
                    float f35 = e3Var4.j;
                    RectF rectF10 = e3Var4.n;
                    int i19 = i18;
                    float f36 = e3Var4.k;
                    float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f35;
                    float f37 = profileStoriesView4.f0 + dp + f34;
                    float dp2 = f34 + (AndroidUtilities.dp(18.0f) * f35);
                    float f38 = f37 + dp;
                    f33 = Math.max(f33, f38);
                    rectF.set(f37 - dp, f10 - dp, f38, f10 + dp);
                    float f39 = profileStoriesView4.N;
                    float lerp6 = AndroidUtilities.lerp(rectF4.centerX(), rectF.centerX(), f39);
                    float lerp7 = AndroidUtilities.lerp(rectF4.centerY(), rectF.centerY(), f39);
                    float lerp8 = AndroidUtilities.lerp(Math.min(rectF4.width(), rectF4.height()), Math.min(rectF.width(), rectF.height()), f39) / 2.0f;
                    rectF6.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                    e3Var4.m.set(rectF6);
                    rectF10.set(rectF6);
                    float f40 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.N), profileStoriesView4.N * f36)) * f35;
                    rectF10.inset(f40, f40);
                    i18 = i19 + 1;
                    f34 = dp2;
                    f16 = f16;
                }
                float f41 = f16;
                f17 = 18.0f;
                paint6.setColor(a.d(profileStoriesView4.N, 1526726655, -2135178036));
                paint6.getAlpha();
                Paint a10 = y5Var5.a(rectF);
                a10.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f15), profileStoriesView4.N));
                paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f15), profileStoriesView4.N));
                paint14.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f15), profileStoriesView4.N));
                int i20 = 0;
                while (i20 < arrayList7.size()) {
                    e3 e3Var5 = (e3) arrayList7.get(i20);
                    int i21 = i20 - 2;
                    e3 e3Var6 = i21 >= 0 ? (e3) arrayList7.get(i21) : null;
                    int i22 = i20 - 1;
                    e3 d13 = d(e3Var6, i22 >= 0 ? (e3) arrayList7.get(i22) : null, e3Var5);
                    int i23 = i20 + 1;
                    int i24 = i20 + 2;
                    e3 d14 = d(i23 < arrayList7.size() ? (e3) arrayList7.get(i23) : null, i24 < arrayList7.size() ? (e3) arrayList7.get(i24) : null, e3Var5);
                    if (d13 != null) {
                        RectF rectF11 = d13.n;
                        float centerX = rectF11.centerX();
                        RectF rectF12 = e3Var5.n;
                        RectF rectF13 = e3Var5.n;
                        if (Math.abs(centerX - rectF12.centerX()) < Math.abs((rectF13.width() / 2.0f) - (rectF11.width() / 2.0f)) || Math.abs(rectF11.centerX() - rectF13.centerX()) > (rectF13.width() / 2.0f) + (rectF11.width() / 2.0f)) {
                            e3Var = null;
                            if (d14 != null) {
                                RectF rectF14 = d14.n;
                                float centerX2 = rectF14.centerX();
                                RectF rectF15 = e3Var5.n;
                                RectF rectF16 = e3Var5.n;
                                if (Math.abs(centerX2 - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                                    e3Var2 = null;
                                    if (e3Var5.k < 1.0f) {
                                        int alpha5 = a10.getAlpha();
                                        a10.setAlpha((int) ((1.0f - f41) * (1.0f - e3Var5.k) * alpha5 * e3Var5.j));
                                        profileStoriesView4.c(canvas, e3Var, e3Var5, e3Var2, a10);
                                        paint3 = a10;
                                        paint3.setAlpha(alpha5);
                                    } else {
                                        paint3 = a10;
                                    }
                                    if (e3Var5.k > 0.0f) {
                                        Paint paint15 = e3Var5.l ? paint14 : paint6;
                                        int alpha6 = paint15.getAlpha();
                                        paint15.setAlpha((int) ((1.0f - f41) * alpha6 * e3Var5.j * e3Var5.k));
                                        c(canvas, e3Var, e3Var5, e3Var2, paint15);
                                        profileStoriesView2 = this;
                                        paint15.setAlpha(alpha6);
                                    } else {
                                        profileStoriesView2 = this;
                                    }
                                    i20 = i23;
                                    a10 = paint3;
                                    profileStoriesView4 = profileStoriesView2;
                                }
                            }
                            e3Var2 = d14;
                            if (e3Var5.k < 1.0f) {
                            }
                            if (e3Var5.k > 0.0f) {
                            }
                            i20 = i23;
                            a10 = paint3;
                            profileStoriesView4 = profileStoriesView2;
                        }
                    }
                    e3Var = d13;
                    if (d14 != null) {
                    }
                    e3Var2 = d14;
                    if (e3Var5.k < 1.0f) {
                    }
                    if (e3Var5.k > 0.0f) {
                    }
                    i20 = i23;
                    a10 = paint3;
                    profileStoriesView4 = profileStoriesView2;
                }
                profileStoriesView = profileStoriesView4;
                Paint paint16 = a10;
                canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f41) * profileStoriesView.N * f14), 31);
                canvas2 = canvas;
                for (int size = arrayList7.size() - 1; size >= 0; size--) {
                    e3 e3Var7 = (e3) arrayList7.get(size);
                    ImageReceiver imageReceiver = e3Var7.b;
                    ImageReceiver imageReceiver2 = e3Var7.b;
                    if (imageReceiver.getVisible()) {
                        int saveCount = canvas2.getSaveCount();
                        int i25 = size - 1;
                        e3 e3Var8 = i25 >= 0 ? (e3) arrayList7.get(i25) : null;
                        int i26 = size - 2;
                        profileStoriesView.a(canvas2, e3Var7, d(e3Var8, i26 >= 0 ? (e3) arrayList7.get(i26) : null, e3Var7));
                        imageReceiver2.setImageCoords(e3Var7.m);
                        imageReceiver2.draw(canvas2);
                        canvas2.restoreToCount(saveCount);
                    }
                }
                canvas2.restore();
                paint = paint16;
                f18 = f33;
                if (paint != null) {
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
                }
                canvas2.restore();
                max = Math.max(0.0f, (profileStoriesView.N - 0.5f) * 2.0f);
                if (max <= 0.0f) {
                    float lerp9 = AndroidUtilities.lerp(rectF4.right + AndroidUtilities.dp(16.0f), f18 + AndroidUtilities.dp(f13), profileStoriesView.N);
                    float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f11, profileStoriesView.N);
                    float lerp11 = AndroidUtilities.lerp(rectF4.centerY(), profileStoriesView.h0, profileStoriesView.N);
                    n6 n6Var = profileStoriesView.n;
                    n6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f17)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f17)));
                    n6Var.w = (int) (max * f14);
                    n6Var.draw(canvas2);
                    return;
                }
                return;
            }
        }
        profileStoriesView = profileStoriesView4;
        f17 = 18.0f;
        f18 = f12;
        if (paint != null) {
        }
        canvas2.restore();
        max = Math.max(0.0f, (profileStoriesView.N - 0.5f) * 2.0f);
        if (max <= 0.0f) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        if (r3 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        i5 i5Var;
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
        long j3 = this.d;
        int i19 = 0;
        boolean z12 = j3 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z13 = MessagesController.getInstance(i18).getStoriesController().z(j3);
        TL_stories.PeerStories y3 = MessagesController.getInstance(i18).getStoriesController().y(j3);
        TL_stories.PeerStories peerStories = j3 == 0 ? null : z13;
        int max = z13 != null ? Math.max(0, z13.max_read_id) : 0;
        if (y3 != null) {
            max = Math.max(max, y3.max_read_id);
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
                    if (y3 != null) {
                        for (int i25 = 0; i25 < y3.stories.size(); i25++) {
                            if (y3.stories.get(i25).id == i24) {
                                storyItem3 = y3.stories.get(i25);
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
            i5Var = this.M;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            e3 e3Var = (e3) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == e3Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                e3Var.e = 0.0f;
            } else {
                e3Var.c = i33;
                e3Var.d = z14 || !(peerStories == null || storyItem == null || storyItem.id > i5Var.x(j3));
            }
            if (!z10) {
                e3Var.f.f(e3Var.d, true);
                e3Var.g.d(e3Var.c, true);
                e3Var.h.d(e3Var.e, true);
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
                } else if (((e3) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j3;
                e3 e3Var2 = new e3(this, storyItem5);
                e3Var2.c = i34;
                e3Var2.e = 1.0f;
                d6 d6Var = e3Var2.h;
                d6Var.d(0.0f, true);
                boolean z17 = z14 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                e3Var2.d = z17;
                if (!z10) {
                    e3Var2.f.f(z17, true);
                    e3Var2.g.d(e3Var2.c, true);
                    d6Var.d(e3Var2.e, true);
                }
                arrayList2.add(e3Var2);
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
            e3 e3Var3 = (e3) arrayList2.get(i36);
            if (e3Var3.e > 0.0f) {
                this.v = e3Var3;
                break;
            }
            i36++;
        }
        ArrayList E = i5Var.E(j3);
        this.J = E == null ? 0 : E.size();
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
            ofFloat.addUpdateListener(new b3(0, this, zArr));
            this.a0.addListener(new vv0(23, (Object) this, (Object) zArr));
            this.a0.setInterpolator(new OvershootInterpolator(3.0f));
            this.a0.setDuration(400L);
            this.a0.setStartDelay(120L);
            this.a0.start();
        }
        this.s = i37;
        this.n.q(i37 > 0 ? LocaleController.formatPluralString("Stories", i37, new Object[0]) : "", z10 && !LocaleController.isRTL, true);
        y5 y5Var = this.L;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j3));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    y5Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                }
            }
            if (user != null) {
                y5Var.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(y5Var.a).profilePeerColors;
                    y5Var.c(peerColors != null ? null : peerColors.getColor(i14), z10);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(y5Var.a).profilePeerColors;
            y5Var.c(peerColors2 != null ? null : peerColors2.getColor(i14), z10);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j3));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    y5Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                }
            }
            if (chat != null) {
                y5Var.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(y5Var.a).profilePeerColors;
                    y5Var.c(peerColors3 != null ? null : peerColors3.getColor(i13), z10);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(y5Var.a).profilePeerColors;
            y5Var.c(peerColors32 != null ? null : peerColors32.getColor(i13), z10);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.I;
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
                ((e3) arrayList.get(i10)).b.onAttachedToWindow();
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
                ((e3) arrayList.get(i10)).b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N < 0.9f ? this.Q.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.f0 && motionEvent.getX() <= this.g0 && Math.abs(motionEvent.getY() - this.h0) < ((float) AndroidUtilities.dp(32.0f));
        c3 c3Var = this.o0;
        if (contains && motionEvent.getAction() == 0) {
            this.p0 = System.currentTimeMillis();
            this.q0 = motionEvent.getX();
            this.r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            AndroidUtilities.runOnUIThread(c3Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            if (contains && System.currentTimeMillis() - this.p0 <= ViewConfiguration.getTapTimeout() && a7.a(this.q0, this.r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                i5 i5Var = this.M;
                long j3 = this.d;
                if (i5Var.K(j3) || i5Var.I(j3) || !this.w.isEmpty()) {
                    e(this.n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(c3Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (j6.I.q()) {
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

    public void e(d3 d3Var) {
    }
}
