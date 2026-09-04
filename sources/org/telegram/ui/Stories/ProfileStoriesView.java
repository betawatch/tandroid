package org.telegram.ui.Stories;

import a4.e;
import a6.i;
import ah.b;
import ah.d0;
import ah.m0;
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
import bi.l9;
import bi.p5;
import bi.p9;
import bi.r5;
import bi.t;
import bi.t8;
import bi.u8;
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
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
import org.telegram.ui.sz0;
import v7.z6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public t8 K;
    public final l9 L;
    public final u8 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final e6 T;
    public final e6 U;
    public final e6 V;
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
    public final n01 h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final e6 l0;
    public final e6 m0;
    public final p6 n;
    public final i n0;
    public final p5 o0;
    public long p0;
    public float q0;
    public int r;
    public float r0;
    public int s;
    public r5 v;
    public final ArrayList w;
    public boolean x;
    public bj0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [bi.p5] */
    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, n01 n01Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        p6 p6Var = new p6(false, true, true, false);
        this.n = p6Var;
        Paint paint4 = new Paint(1);
        this.w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new l9(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        pr prVar = pr.h;
        this.T = new e6(this, 0L, 480L, prVar);
        this.U = new e6(this, 0L, 240L, prVar);
        this.V = new e6(this, 0L, 150L, pr.f);
        this.W = 1.0f;
        this.b0 = new Path();
        this.c0 = new Matrix();
        this.d0 = new PathMeasure();
        this.e0 = new Path();
        this.l0 = new e6(this, 0L, 350L, prVar);
        this.m0 = new e6(this, 0L, 350L, prVar);
        final sz0 sz0Var = (sz0) this;
        this.n0 = new i(sz0Var, 8);
        final int i11 = 0;
        this.o0 = new Runnable() { // from class: bi.p5
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                sz0 sz0Var2 = sz0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        sz0Var2.u0.w4(false);
                        break;
                    default:
                        sz0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j3;
        this.e = z10;
        this.f = view;
        this.h = n01Var;
        final int i12 = 1;
        n01Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: bi.p5
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                sz0 sz0Var2 = sz0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        sz0Var2.u0.w4(false);
                        break;
                    default:
                        sz0Var2.invalidate();
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
        p6Var.t(AndroidUtilities.dp(18.0f));
        p6Var.k(0.4f, 320L, prVar);
        p6Var.u(AndroidUtilities.bold());
        p6Var.r(-1);
        p6Var.n(true);
        p6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static r5 d(r5 r5Var, r5 r5Var2, r5 r5Var3) {
        if (r5Var3 == null) {
            return null;
        }
        RectF rectF = r5Var3.n;
        if (r5Var == null && r5Var2 == null) {
            return null;
        }
        if (r5Var != null) {
            RectF rectF2 = r5Var.n;
            if (r5Var2 != null) {
                RectF rectF3 = r5Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? r5Var : r5Var2;
            }
        }
        return r5Var != null ? r5Var : r5Var2;
    }

    private float getExpandRight() {
        return this.i0 - (this.l0.e(this.k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, r5 r5Var, r5 r5Var2) {
        if (r5Var2 == null) {
            return;
        }
        RectF rectF = r5Var2.m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * r5Var2.j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = r5Var.m;
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

    public final void c(Canvas canvas, r5 r5Var, r5 r5Var2, r5 r5Var3, Paint paint) {
        r5 r5Var4 = r5Var;
        RectF rectF = r5Var2.n;
        if (r5Var4 == null && r5Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (r5Var4 != null) {
            RectF rectF2 = r5Var4.n;
            if (r5Var3 != null) {
                RectF rectF3 = r5Var3.n;
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
        if (r5Var4 == null && r5Var3 == null) {
            return;
        }
        if (r5Var4 == null) {
            r5Var4 = r5Var3;
        }
        float centerX4 = r5Var4.n.centerX();
        float width4 = r5Var4.n.width() / 2.0f;
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08bc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        float f10;
        long j3;
        float f11;
        float f12;
        float f13;
        ArrayList arrayList2;
        l9 l9Var;
        Paint paint;
        RectF rectF;
        Paint paint2;
        l9 l9Var2;
        ArrayList arrayList3;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        ProfileStoriesView profileStoriesView;
        float f18;
        Paint paint4;
        float f19;
        r5 r5Var;
        r5 r5Var2;
        Paint paint5;
        ProfileStoriesView profileStoriesView2;
        ProfileStoriesView profileStoriesView3;
        Paint paint6;
        RectF rectF2;
        ArrayList arrayList4;
        int i10;
        RectF rectF3;
        float f20;
        Paint paint7;
        float f21;
        boolean z10;
        l9 l9Var3;
        ProfileStoriesView profileStoriesView4;
        float f22;
        RectF rectF4;
        RectF rectF5;
        float f23;
        l9 l9Var4;
        Paint a2;
        Paint paint8;
        int i11;
        ArrayList arrayList5;
        float f24;
        t8 t8Var;
        ProfileStoriesView profileStoriesView5 = this;
        Canvas canvas2 = canvas;
        float d = profileStoriesView5.m0.d(profileStoriesView5.g0, false);
        View view = profileStoriesView5.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView5.H;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f25 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f25);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f25)) + scaleY;
        RectF rectF6 = profileStoriesView5.P;
        rectF6.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f26 = profileStoriesView5.f0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView5.w;
            if (i12 >= arrayList.size()) {
                f7 = 2.0f;
                break;
            }
            r5 r5Var3 = (r5) arrayList.get(i12);
            f7 = 2.0f;
            float d10 = r5Var3.h.d(r5Var3.e, false);
            r5Var3.j = d10;
            if (d10 > 0.0f || r5Var3.e > 0.0f) {
                r5Var3.i = r5Var3.g.d(r5Var3.c, false);
                r5Var3.k = r5Var3.f.e(r5Var3.d);
                if (i12 > 0 && ((r5) arrayList.get(i12 - 1)).i > r5Var3.i) {
                    Collections.sort(arrayList, new e(10));
                    break;
                }
            } else {
                r5Var3.b.onDetachedFromWindow();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f);
        u8 u8Var = profileStoriesView5.M;
        long j10 = profileStoriesView5.d;
        boolean N = u8Var.N(j10);
        boolean K = u8Var.K(j10);
        e6 e6Var = profileStoriesView5.V;
        if (!K && (t8Var = profileStoriesView5.K) != null && t8Var.v) {
            profileStoriesView5.E = false;
            profileStoriesView5.F = false;
            e6Var.getClass();
            e6Var.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, e6Var.e((K && !N) || (profileStoriesView5.E && !profileStoriesView5.F)), profileStoriesView5.I);
        canvas2.save();
        float f27 = profileStoriesView5.G;
        canvas2.scale(f27, f27, rectF6.centerX(), rectF6.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF6.centerY(), profileStoriesView5.j0, profileStoriesView5.N);
        profileStoriesView5.K = null;
        e6 e6Var2 = profileStoriesView5.U;
        e6 e6Var3 = profileStoriesView5.T;
        n01 n01Var = profileStoriesView5.h;
        l9 l9Var5 = profileStoriesView5.L;
        RectF rectF7 = profileStoriesView5.Q;
        if (lerp2 > 0.0f) {
            rectF7.set(rectF6);
            f12 = lerp2;
            f13 = f26;
            rectF7.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            paint = l9Var5.a(rectF7);
            if (profileStoriesView5.y == null) {
                bj0 bj0Var = new bj0(profileStoriesView5);
                profileStoriesView5.y = bj0Var;
                f11 = d;
                arrayList2 = arrayList;
                l9Var = l9Var5;
                bj0Var.d(null, true, false);
                profileStoriesView5.y.u = ChatObject.isForum(UserConfig.selectedAccount, j10);
            } else {
                f11 = d;
                arrayList2 = arrayList;
                l9Var = l9Var5;
            }
            if (!u8Var.K(j10) || u8Var.N(j10)) {
                f24 = 1.0f;
            } else {
                ArrayList E = u8Var.E(j10);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView5.K = (t8) E.get(0);
                    }
                    float f28 = 0.0f;
                    for (int i13 = 0; i13 < E.size(); i13++) {
                        f28 += ((t8) E.get(i13)).h;
                    }
                    f24 = f28 / E.size();
                } else {
                    f24 = 0.0f;
                }
            }
            profileStoriesView5.y.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * clamp2 * f12));
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            bj0 bj0Var2 = profileStoriesView5.y;
            bj0Var2.t = paint;
            f10 = clamp;
            j3 = j10;
            bj0Var2.f((int) rectF7.left, (int) rectF7.top, (int) rectF7.right, (int) rectF7.bottom);
            profileStoriesView5.y.e(Utilities.clamp(f24, 1.0f, 0.0f), true);
            if (n01Var.Q) {
                profileStoriesView5.y.a(canvas2);
            }
            paint.setAlpha(alpha);
            profileStoriesView5.E = true;
            boolean z11 = profileStoriesView5.F;
            boolean z12 = profileStoriesView5.y.f >= 0.98f;
            profileStoriesView5.F = z12;
            if (z11 != z12) {
                e6Var3.d(profileStoriesView5.s, true);
                e6Var2.d(profileStoriesView5.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(pr.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                d0 d0Var = new d0(profileStoriesView5, 10);
                ofFloat.addUpdateListener(d0Var);
                ofFloat2.addUpdateListener(d0Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new b(profileStoriesView5, 9));
                animatorSet.start();
            }
        } else {
            f10 = clamp;
            j3 = j10;
            f11 = d;
            f12 = lerp2;
            f13 = f26;
            arrayList2 = arrayList;
            l9Var = l9Var5;
            profileStoriesView5.E = false;
            paint = null;
        }
        Paint paint9 = profileStoriesView5.a;
        Paint paint10 = profileStoriesView5.b;
        RectF rectF8 = profileStoriesView5.R;
        if (f12 < 1.0f) {
            f16 = 12.0f;
            f14 = 255.0f;
            f17 = Utilities.clamp(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f) * (1.0f - f12);
            float d11 = e6Var3.d(profileStoriesView5.s, false);
            float d12 = e6Var2.d(profileStoriesView5.r, false);
            if (N) {
                rectF7.set(rectF6);
                rectF7.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (p9.d == null) {
                    o20 o20Var = new o20();
                    p9.d = o20Var;
                    o20Var.a = true;
                    o20Var.b = true;
                    int w02 = j6.w0(null, j6.xj, false);
                    int w03 = j6.w0(null, j6.q7, false);
                    p9.d.d(a.d(0.25f, w02, w03), w03, 0, 0);
                    p9.d.c.setStrokeWidth(AndroidUtilities.dpf2(f7));
                    p9.d.c.setStyle(Paint.Style.STROKE);
                    p9.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                f15 = 1.5f;
                p9.d.b(rectF7.left, rectF7.top, rectF7.right, rectF7.bottom);
                Paint paint11 = p9.d.c;
                paint11.setStrokeWidth(AndroidUtilities.dp(f7));
                paint11.setAlpha((int) (f17 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j3)) {
                    float height = rectF7.height() * 0.32f;
                    canvas2.drawRoundRect(rectF7, height, height, paint11);
                } else {
                    canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), rectF7.width() / f7, paint11);
                }
            } else {
                f15 = 1.5f;
                if ((profileStoriesView5.v != null || profileStoriesView5.J > 0) && f17 > 0.0f) {
                    rectF7.set(rectF6);
                    rectF7.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                    rectF8.set(rectF6);
                    rectF8.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                    float f29 = f10;
                    AndroidUtilities.lerp(rectF7, rectF8, f29, rectF8);
                    paint2 = paint;
                    float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF6.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f17);
                    int min = Math.min(profileStoriesView5.s, 50);
                    float min2 = Math.min(d11, 50.0f);
                    int i14 = min > 20 ? 3 : 5;
                    if (min <= 1) {
                        i14 = 0;
                    }
                    float lerp5 = AndroidUtilities.lerp(i14 * 2, lerp4, f29);
                    float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                    paint9.setColor(a.d(profileStoriesView5.O, 1526726655, 973078528));
                    paint9.getAlpha();
                    float f30 = (-90.0f) - (lerp5 / f7);
                    int i15 = 0;
                    boolean z13 = false;
                    while (i15 < min) {
                        float f31 = f30;
                        if (i15 < arrayList2.size()) {
                            arrayList5 = arrayList2;
                            i11 = i15;
                            if (((r5) arrayList5.get(i15)).l) {
                                z13 = true;
                            }
                        } else {
                            i11 = i15;
                            arrayList5 = arrayList2;
                        }
                        i15 = i11 + 1;
                        arrayList2 = arrayList5;
                        f30 = f31;
                    }
                    float f32 = f30;
                    ArrayList arrayList6 = arrayList2;
                    if (z13) {
                        RectF rectF9 = AndroidUtilities.rectTmp;
                        rectF9.set(rectF8);
                        rectF9.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                        canvas2.saveLayerAlpha(rectF9, 255, 31);
                        float A = e2.A(profileStoriesView5.W, 1.0f, 2.5f, 1.0f);
                        if (A != 1.0f) {
                            canvas2.save();
                            canvas2.scale(A, A, rectF7.centerX(), rectF7.centerY());
                        }
                        int alpha2 = paint10.getAlpha();
                        paint10.setAlpha((int) (alpha2 * f17));
                        rectF9.set(rectF8);
                        rectF9.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                        paint10.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                        profileStoriesView5.b(0.0f, 360.0f, canvas2, paint10, rectF8);
                        profileStoriesView3 = profileStoriesView5;
                        paint6 = paint10;
                        rectF2 = rectF8;
                        paint6.setAlpha(alpha2);
                        if (A != 1.0f) {
                            canvas2.restore();
                        }
                        arrayList3 = arrayList6;
                    } else {
                        profileStoriesView3 = profileStoriesView5;
                        paint6 = paint10;
                        ArrayList arrayList7 = arrayList6;
                        rectF2 = rectF8;
                        int i16 = 0;
                        while (i16 < min) {
                            float f33 = i16;
                            Paint paint12 = paint6;
                            float f34 = lerp5;
                            float clamp3 = 1.0f - Utilities.clamp(d12 - f33, 1.0f, 0.0f);
                            int i17 = min;
                            float clamp4 = 1.0f - Utilities.clamp((min - min2) - f33, 1.0f, 0.0f);
                            if (clamp4 < 0.0f) {
                                profileStoriesView4 = profileStoriesView3;
                                arrayList4 = arrayList7;
                                i10 = i16;
                                f23 = f32;
                                l9Var3 = l9Var;
                                rectF5 = rectF2;
                                paint7 = paint12;
                                f22 = d12;
                                rectF4 = rectF7;
                            } else {
                                float A2 = i16 == 0 ? e2.A(profileStoriesView3.W, 1.0f, 2.5f, 1.0f) : 1.0f;
                                if (A2 != 1.0f) {
                                    canvas2.save();
                                    canvas2.scale(A2, A2, rectF7.centerX(), rectF7.centerY());
                                }
                                boolean z14 = i16 < arrayList7.size() && ((r5) arrayList7.get(i16)).l;
                                if (clamp3 < 1.0f) {
                                    if (z14) {
                                        l9Var4 = l9Var;
                                        paint8 = paint2;
                                        a2 = paint12;
                                    } else {
                                        l9Var4 = l9Var;
                                        a2 = l9Var4.a(rectF7);
                                        paint8 = a2;
                                    }
                                    RectF rectF10 = rectF7;
                                    int alpha3 = a2.getAlpha();
                                    l9 l9Var6 = l9Var4;
                                    Paint paint13 = a2;
                                    paint13.setAlpha((int) w1.A(1.0f, clamp3, alpha3, f17));
                                    paint13.setStrokeWidth(AndroidUtilities.dpf2(z14 ? 3.0f : 2.33f));
                                    float f35 = f32;
                                    f21 = clamp3;
                                    f20 = f35;
                                    arrayList4 = arrayList7;
                                    paint7 = paint12;
                                    z10 = z14;
                                    l9Var3 = l9Var6;
                                    i10 = i16;
                                    rectF3 = rectF10;
                                    profileStoriesView3.b(f20, (-max) * clamp4, canvas2, paint13, rectF3);
                                    paint13.setAlpha(alpha3);
                                    paint2 = paint8;
                                } else {
                                    arrayList4 = arrayList7;
                                    i10 = i16;
                                    rectF3 = rectF7;
                                    f20 = f32;
                                    paint7 = paint12;
                                    f21 = clamp3;
                                    z10 = z14;
                                    l9Var3 = l9Var;
                                }
                                if (f21 > 0.0f) {
                                    Paint paint14 = z10 ? paint7 : paint9;
                                    int alpha4 = paint14.getAlpha();
                                    paint14.setAlpha((int) (alpha4 * f21 * f17));
                                    paint14.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                    profileStoriesView4 = this;
                                    canvas2 = canvas;
                                    f22 = d12;
                                    rectF4 = rectF3;
                                    rectF5 = rectF2;
                                    profileStoriesView4.b(f20, (-max) * clamp4, canvas2, paint14, rectF5);
                                    paint14.setAlpha(alpha4);
                                } else {
                                    profileStoriesView4 = this;
                                    canvas2 = canvas;
                                    f22 = d12;
                                    rectF4 = rectF3;
                                    rectF5 = rectF2;
                                }
                                if (A2 != 1.0f) {
                                    canvas2.restore();
                                }
                                f23 = f20 - ((f34 * clamp4) + (max * clamp4));
                            }
                            rectF2 = rectF5;
                            l9Var = l9Var3;
                            rectF7 = rectF4;
                            d12 = f22;
                            lerp5 = f34;
                            arrayList7 = arrayList4;
                            f32 = f23;
                            i16 = i10 + 1;
                            profileStoriesView3 = profileStoriesView4;
                            paint6 = paint7;
                            min = i17;
                        }
                        arrayList3 = arrayList7;
                    }
                    paint3 = paint6;
                    profileStoriesView5 = profileStoriesView3;
                    rectF = rectF7;
                    l9Var2 = l9Var;
                    rectF8 = rectF2;
                    if (z13) {
                        p9.k(canvas2, rectF8, f17, n01Var.getImageReceiver().getVisible(), profileStoriesView5.I);
                        canvas2.restore();
                    }
                }
            }
            rectF = rectF7;
            paint2 = paint;
            l9Var2 = l9Var;
            arrayList3 = arrayList2;
            paint3 = paint10;
        } else {
            rectF = rectF7;
            paint2 = paint;
            l9Var2 = l9Var;
            arrayList3 = arrayList2;
            f14 = 255.0f;
            f15 = 1.5f;
            f16 = 12.0f;
            paint3 = paint10;
            f17 = clamp2;
        }
        profileStoriesView5.getExpandRight();
        if (profileStoriesView5.N <= 0.0f || f17 >= 1.0f) {
            profileStoriesView = profileStoriesView5;
            f18 = 18.0f;
            paint4 = paint2;
            f19 = f13;
        } else {
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                float f36 = ((r5) arrayList3.get(i18)).j;
                AndroidUtilities.dp(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            float f37 = f13;
            int i19 = 0;
            float f38 = 0.0f;
            while (i19 < arrayList8.size()) {
                r5 r5Var4 = (r5) arrayList8.get(i19);
                float f39 = r5Var4.j;
                RectF rectF11 = r5Var4.n;
                int i20 = i19;
                float f40 = r5Var4.k;
                float dp = (AndroidUtilities.dp(28.0f) / f7) * f39;
                float f41 = profileStoriesView5.f0 + dp + f38;
                float dp2 = f38 + (AndroidUtilities.dp(18.0f) * f39);
                float f42 = f41 + dp;
                f37 = Math.max(f37, f42);
                rectF.set(f41 - dp, lerp3 - dp, f42, lerp3 + dp);
                float f43 = profileStoriesView5.N;
                float lerp6 = AndroidUtilities.lerp(rectF6.centerX(), rectF.centerX(), f43);
                float lerp7 = AndroidUtilities.lerp(rectF6.centerY(), rectF.centerY(), f43);
                float lerp8 = AndroidUtilities.lerp(Math.min(rectF6.width(), rectF6.height()), Math.min(rectF.width(), rectF.height()), f43) / f7;
                rectF8.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                r5Var4.m.set(rectF8);
                rectF11.set(rectF8);
                float f44 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView5.N), profileStoriesView5.N * f40)) * f39;
                rectF11.inset(f44, f44);
                i19 = i20 + 1;
                f38 = dp2;
            }
            f18 = 18.0f;
            paint9.setColor(a.d(profileStoriesView5.N, 1526726655, -2135178036));
            paint9.getAlpha();
            Paint a10 = l9Var2.a(rectF);
            a10.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f15), profileStoriesView5.N));
            paint9.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f15), profileStoriesView5.N));
            paint3.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f15), profileStoriesView5.N));
            int i21 = 0;
            while (i21 < arrayList8.size()) {
                r5 r5Var5 = (r5) arrayList8.get(i21);
                int i22 = i21 - 2;
                r5 r5Var6 = i22 >= 0 ? (r5) arrayList8.get(i22) : null;
                int i23 = i21 - 1;
                r5 d13 = d(r5Var6, i23 >= 0 ? (r5) arrayList8.get(i23) : null, r5Var5);
                int i24 = i21 + 1;
                int i25 = i21 + 2;
                r5 d14 = d(i24 < arrayList8.size() ? (r5) arrayList8.get(i24) : null, i25 < arrayList8.size() ? (r5) arrayList8.get(i25) : null, r5Var5);
                if (d13 != null) {
                    RectF rectF12 = d13.n;
                    float centerX = rectF12.centerX();
                    RectF rectF13 = r5Var5.n;
                    RectF rectF14 = r5Var5.n;
                    if (Math.abs(centerX - rectF13.centerX()) < Math.abs((rectF14.width() / f7) - (rectF12.width() / f7)) || Math.abs(rectF12.centerX() - rectF14.centerX()) > (rectF14.width() / f7) + (rectF12.width() / f7)) {
                        r5Var = null;
                        if (d14 != null) {
                            RectF rectF15 = d14.n;
                            float centerX2 = rectF15.centerX();
                            RectF rectF16 = r5Var5.n;
                            RectF rectF17 = r5Var5.n;
                            if (Math.abs(centerX2 - rectF16.centerX()) < Math.abs((rectF17.width() / f7) - (rectF15.width() / f7)) || Math.abs(rectF15.centerX() - rectF17.centerX()) > (rectF17.width() / f7) + (rectF15.width() / f7)) {
                                r5Var2 = null;
                                if (r5Var5.k < 1.0f) {
                                    int alpha5 = a10.getAlpha();
                                    a10.setAlpha((int) ((1.0f - f17) * (1.0f - r5Var5.k) * alpha5 * r5Var5.j));
                                    profileStoriesView5.c(canvas, r5Var, r5Var5, r5Var2, a10);
                                    paint5 = a10;
                                    paint5.setAlpha(alpha5);
                                } else {
                                    paint5 = a10;
                                }
                                if (r5Var5.k > 0.0f) {
                                    Paint paint15 = r5Var5.l ? paint3 : paint9;
                                    int alpha6 = paint15.getAlpha();
                                    paint15.setAlpha((int) ((1.0f - f17) * alpha6 * r5Var5.j * r5Var5.k));
                                    c(canvas, r5Var, r5Var5, r5Var2, paint15);
                                    profileStoriesView2 = this;
                                    paint15.setAlpha(alpha6);
                                } else {
                                    profileStoriesView2 = this;
                                }
                                a10 = paint5;
                                i21 = i24;
                                profileStoriesView5 = profileStoriesView2;
                            }
                        }
                        r5Var2 = d14;
                        if (r5Var5.k < 1.0f) {
                        }
                        if (r5Var5.k > 0.0f) {
                        }
                        a10 = paint5;
                        i21 = i24;
                        profileStoriesView5 = profileStoriesView2;
                    }
                }
                r5Var = d13;
                if (d14 != null) {
                }
                r5Var2 = d14;
                if (r5Var5.k < 1.0f) {
                }
                if (r5Var5.k > 0.0f) {
                }
                a10 = paint5;
                i21 = i24;
                profileStoriesView5 = profileStoriesView2;
            }
            profileStoriesView = profileStoriesView5;
            paint4 = a10;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f17) * profileStoriesView.N * f14), 31);
            canvas2 = canvas;
            for (int size = arrayList8.size() - 1; size >= 0; size--) {
                r5 r5Var7 = (r5) arrayList8.get(size);
                ImageReceiver imageReceiver = r5Var7.b;
                ImageReceiver imageReceiver2 = r5Var7.b;
                if (imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i26 = size - 1;
                    int i27 = size - 2;
                    profileStoriesView.a(canvas2, r5Var7, d(i26 >= 0 ? (r5) arrayList8.get(i26) : null, i27 >= 0 ? (r5) arrayList8.get(i27) : null, r5Var7));
                    imageReceiver2.setImageCoords(r5Var7.m);
                    imageReceiver2.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            f19 = f37;
        }
        if (paint4 != null) {
            paint4.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.N - 0.5f) * f7);
        if (max2 > 0.0f) {
            float lerp9 = AndroidUtilities.lerp(rectF6.right + AndroidUtilities.dp(16.0f), f19 + AndroidUtilities.dp(f16), profileStoriesView.N);
            float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f11, profileStoriesView.N);
            float lerp11 = AndroidUtilities.lerp(rectF6.centerY(), profileStoriesView.h0, profileStoriesView.N);
            p6 p6Var = profileStoriesView.n;
            p6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f18)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f18)));
            p6Var.w = (int) (max2 * f14);
            p6Var.draw(canvas2);
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
        u8 u8Var;
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
            u8Var = this.M;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            r5 r5Var = (r5) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == r5Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                r5Var.e = 0.0f;
            } else {
                r5Var.c = i33;
                r5Var.d = z14 || !(peerStories == null || storyItem == null || storyItem.id > u8Var.x(j3));
            }
            if (!z10) {
                r5Var.f.f(r5Var.d, true);
                r5Var.g.d(r5Var.c, true);
                r5Var.h.d(r5Var.e, true);
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
                } else if (((r5) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j3;
                r5 r5Var2 = new r5(this, storyItem5);
                r5Var2.c = i34;
                r5Var2.e = 1.0f;
                e6 e6Var = r5Var2.h;
                e6Var.d(0.0f, true);
                boolean z17 = z14 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                r5Var2.d = z17;
                if (!z10) {
                    r5Var2.f.f(z17, true);
                    r5Var2.g.d(r5Var2.c, true);
                    e6Var.d(r5Var2.e, true);
                }
                arrayList2.add(r5Var2);
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
            r5 r5Var3 = (r5) arrayList2.get(i36);
            if (r5Var3.e > 0.0f) {
                this.v = r5Var3;
                break;
            }
            i36++;
        }
        ArrayList E = u8Var.E(j3);
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
            ofFloat.addUpdateListener(new m0(2, this, zArr));
            this.a0.addListener(new t(1, this, zArr));
            this.a0.setInterpolator(new OvershootInterpolator(3.0f));
            this.a0.setDuration(400L);
            this.a0.setStartDelay(120L);
            this.a0.start();
        }
        this.s = i37;
        this.n.q(i37 > 0 ? LocaleController.formatPluralString("Stories", i37, new Object[0]) : "", z10 && !LocaleController.isRTL, true);
        l9 l9Var = this.L;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j3));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    l9Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                }
            }
            if (user != null) {
                l9Var.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(l9Var.a).profilePeerColors;
                    l9Var.c(peerColors != null ? null : peerColors.getColor(i14), z10);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(l9Var.a).profilePeerColors;
            l9Var.c(peerColors2 != null ? null : peerColors2.getColor(i14), z10);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j3));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    l9Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                }
            }
            if (chat != null) {
                l9Var.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(l9Var.a).profilePeerColors;
                    l9Var.c(peerColors3 != null ? null : peerColors3.getColor(i13), z10);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(l9Var.a).profilePeerColors;
            l9Var.c(peerColors32 != null ? null : peerColors32.getColor(i13), z10);
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
                ((r5) arrayList.get(i10)).b.onAttachedToWindow();
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
                ((r5) arrayList.get(i10)).b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N < 0.9f ? this.Q.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.f0 && motionEvent.getX() <= this.g0 && Math.abs(motionEvent.getY() - this.h0) < ((float) AndroidUtilities.dp(32.0f));
        p5 p5Var = this.o0;
        if (contains && motionEvent.getAction() == 0) {
            this.p0 = System.currentTimeMillis();
            this.q0 = motionEvent.getX();
            this.r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(p5Var);
            AndroidUtilities.runOnUIThread(p5Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(p5Var);
            if (contains && System.currentTimeMillis() - this.p0 <= ViewConfiguration.getTapTimeout() && z6.a(this.q0, this.r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                u8 u8Var = this.M;
                long j3 = this.d;
                if (u8Var.K(j3) || u8Var.I(j3) || !this.w.isEmpty()) {
                    e(this.n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(p5Var);
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

    public void e(i iVar) {
    }
}
