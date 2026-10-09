package org.telegram.ui.Stories;

import a4.d;
import a6.i;
import ai.a;
import ai.b;
import ai.fa;
import ai.i6;
import ai.ja;
import ai.l9;
import ai.m9;
import ai.x;
import ai.z;
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
import org.telegram.messenger.bi;
import org.telegram.messenger.q;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;
import org.telegram.ui.rz0;
import v7.z6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public l9 K;
    public final fa L;
    public final m9 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final g6 T;
    public final g6 U;
    public final g6 V;
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
    public final l01 h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final g6 l0;
    public final g6 m0;
    public final q6 n;
    public final i n0;
    public final ai.g6 o0;
    public long p0;
    public float q0;
    public int r;
    public float r0;
    public int s;
    public i6 v;
    public final ArrayList w;
    public boolean x;
    public gk0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [ai.g6] */
    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, l01 l01Var, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        q6 q6Var = new q6(false, true, true);
        this.n = q6Var;
        Paint paint4 = new Paint(1);
        this.w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new fa(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        hs hsVar = hs.h;
        this.T = new g6(this, 0L, 480L, hsVar);
        this.U = new g6(this, 0L, 240L, hsVar);
        this.V = new g6(this, 0L, 150L, hs.f);
        this.W = 1.0f;
        this.b0 = new Path();
        this.c0 = new Matrix();
        this.d0 = new PathMeasure();
        this.e0 = new Path();
        this.l0 = new g6(this, 0L, 350L, hsVar);
        this.m0 = new g6(this, 0L, 350L, hsVar);
        final rz0 rz0Var = (rz0) this;
        this.n0 = new i(rz0Var, 3);
        final int i11 = 0;
        this.o0 = new Runnable() { // from class: ai.g6
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                rz0 rz0Var2 = rz0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        rz0Var2.u0.w4(false);
                        break;
                    default:
                        rz0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j3;
        this.e = z10;
        this.f = view;
        this.h = l01Var;
        final int i12 = 1;
        l01Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: ai.g6
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                rz0 rz0Var2 = rz0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        rz0Var2.u0.w4(false);
                        break;
                    default:
                        rz0Var2.invalidate();
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
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.nk, e6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var));
        q6Var.w(AndroidUtilities.dp(18.0f));
        q6Var.n(0.4f, 320L, hsVar);
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(-1);
        q6Var.q(true);
        q6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static i6 d(i6 i6Var, i6 i6Var2, i6 i6Var3) {
        if (i6Var3 == null) {
            return null;
        }
        RectF rectF = i6Var3.n;
        if (i6Var == null && i6Var2 == null) {
            return null;
        }
        if (i6Var != null) {
            RectF rectF2 = i6Var.n;
            if (i6Var2 != null) {
                RectF rectF3 = i6Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? i6Var : i6Var2;
            }
        }
        return i6Var != null ? i6Var : i6Var2;
    }

    private float getExpandRight() {
        return this.i0 - (this.l0.e(this.k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, i6 i6Var, i6 i6Var2) {
        if (i6Var2 == null) {
            return;
        }
        RectF rectF = i6Var2.m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * i6Var2.j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = i6Var.m;
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

    public final void c(Canvas canvas, i6 i6Var, i6 i6Var2, i6 i6Var3, Paint paint) {
        i6 i6Var4 = i6Var;
        RectF rectF = i6Var2.n;
        if (i6Var4 == null && i6Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (i6Var4 != null) {
            RectF rectF2 = i6Var4.n;
            if (i6Var3 != null) {
                RectF rectF3 = i6Var3.n;
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
        if (i6Var4 == null && i6Var3 == null) {
            return;
        }
        if (i6Var4 == null) {
            i6Var4 = i6Var3;
        }
        float centerX4 = i6Var4.n.centerX();
        float width4 = i6Var4.n.width() / 2.0f;
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x089f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        float f10;
        long j3;
        fa faVar;
        float f11;
        float f12;
        ArrayList arrayList2;
        Paint paint;
        Paint paint2;
        RectF rectF;
        RectF rectF2;
        fa faVar2;
        ArrayList arrayList3;
        float f13;
        float f14;
        i6 i6Var;
        float f15;
        ProfileStoriesView profileStoriesView;
        float f16;
        i6 i6Var2;
        i6 i6Var3;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        RectF rectF3;
        float f17;
        float f18;
        int i10;
        Paint paint4;
        RectF rectF4;
        fa faVar3;
        char c10;
        float f19;
        ProfileStoriesView profileStoriesView3;
        float f20;
        RectF rectF5;
        RectF rectF6;
        fa faVar4;
        Paint a2;
        l01 l01Var;
        ArrayList arrayList4;
        float f21;
        l9 l9Var;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        float d = profileStoriesView4.m0.d(profileStoriesView4.g0, false);
        View view = profileStoriesView4.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView4.H;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f22 = 2.0f;
        float f23 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f23);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f23)) + scaleY;
        RectF rectF7 = profileStoriesView4.P;
        rectF7.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f24 = profileStoriesView4.f0;
        int i11 = 0;
        while (true) {
            arrayList = profileStoriesView4.w;
            if (i11 >= arrayList.size()) {
                f7 = f22;
                break;
            }
            i6 i6Var4 = (i6) arrayList.get(i11);
            f7 = f22;
            float d10 = i6Var4.h.d(i6Var4.e, false);
            i6Var4.j = d10;
            if (d10 > 0.0f || i6Var4.e > 0.0f) {
                i6Var4.i = i6Var4.g.d(i6Var4.c, false);
                i6Var4.k = i6Var4.f.e(i6Var4.d);
                if (i11 > 0 && ((i6) arrayList.get(i11 - 1)).i > i6Var4.i) {
                    Collections.sort(arrayList, new d(6));
                    break;
                }
            } else {
                i6Var4.b.onDetachedFromWindow();
                arrayList.remove(i11);
                i11--;
            }
            i11++;
            f22 = f7;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView4.N / 0.2f), 1.0f, 0.0f);
        m9 m9Var = profileStoriesView4.M;
        long j10 = profileStoriesView4.d;
        boolean N = m9Var.N(j10);
        boolean K = m9Var.K(j10);
        g6 g6Var = profileStoriesView4.V;
        if (!K && (l9Var = profileStoriesView4.K) != null && l9Var.v) {
            profileStoriesView4.E = false;
            profileStoriesView4.F = false;
            g6Var.getClass();
            g6Var.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, g6Var.e((K && !N) || (profileStoriesView4.E && !profileStoriesView4.F)), profileStoriesView4.I);
        canvas2.save();
        float f25 = profileStoriesView4.G;
        canvas2.scale(f25, f25, rectF7.centerX(), rectF7.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF7.centerY(), profileStoriesView4.j0, profileStoriesView4.N);
        profileStoriesView4.K = null;
        g6 g6Var2 = profileStoriesView4.U;
        g6 g6Var3 = profileStoriesView4.T;
        l01 l01Var2 = profileStoriesView4.h;
        fa faVar5 = profileStoriesView4.L;
        RectF rectF8 = profileStoriesView4.Q;
        if (lerp2 > 0.0f) {
            rectF8.set(rectF7);
            f12 = f24;
            rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            paint = faVar5.a(rectF8);
            if (profileStoriesView4.y == null) {
                gk0 gk0Var = new gk0(profileStoriesView4);
                profileStoriesView4.y = gk0Var;
                faVar = faVar5;
                f11 = d;
                arrayList2 = arrayList;
                gk0Var.d(null, true, false);
                profileStoriesView4.y.u = ChatObject.isForum(UserConfig.selectedAccount, j10);
            } else {
                faVar = faVar5;
                f11 = d;
                arrayList2 = arrayList;
            }
            if (!m9Var.K(j10) || m9Var.N(j10)) {
                f21 = 1.0f;
            } else {
                ArrayList E = m9Var.E(j10);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView4.K = (l9) E.get(0);
                    }
                    float f26 = 0.0f;
                    for (int i12 = 0; i12 < E.size(); i12++) {
                        f26 += ((l9) E.get(i12)).h;
                    }
                    f21 = f26 / E.size();
                } else {
                    f21 = 0.0f;
                }
            }
            profileStoriesView4.y.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * clamp2 * lerp2));
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            gk0 gk0Var2 = profileStoriesView4.y;
            gk0Var2.t = paint;
            f10 = clamp;
            j3 = j10;
            gk0Var2.f((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView4.y.e(Utilities.clamp(f21, 1.0f, 0.0f), true);
            if (l01Var2.Q) {
                profileStoriesView4.y.a(canvas2);
            }
            paint.setAlpha(alpha);
            profileStoriesView4.E = true;
            boolean z10 = profileStoriesView4.F;
            boolean z11 = profileStoriesView4.y.f >= 0.98f;
            profileStoriesView4.F = z11;
            if (z10 != z11) {
                g6Var3.d(profileStoriesView4.s, true);
                g6Var2.d(profileStoriesView4.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(hs.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                a aVar = new a(profileStoriesView4, 9);
                ofFloat.addUpdateListener(aVar);
                ofFloat2.addUpdateListener(aVar);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new b(profileStoriesView4, 6));
                animatorSet.start();
            }
        } else {
            f10 = clamp;
            j3 = j10;
            faVar = faVar5;
            f11 = d;
            f12 = f24;
            arrayList2 = arrayList;
            profileStoriesView4.E = false;
            paint = null;
        }
        Paint paint5 = profileStoriesView4.a;
        Paint paint6 = profileStoriesView4.b;
        RectF rectF9 = profileStoriesView4.R;
        if (lerp2 < 1.0f) {
            f13 = 255.0f;
            f15 = (1.0f - lerp2) * Utilities.clamp(1.0f - (profileStoriesView4.N / 0.2f), 1.0f, 0.0f);
            float d11 = g6Var3.d(profileStoriesView4.s, false);
            float d12 = g6Var2.d(profileStoriesView4.r, false);
            if (N) {
                rectF8.set(rectF7);
                rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (ja.d == null) {
                    f30 f30Var = new f30();
                    ja.d = f30Var;
                    f30Var.a = true;
                    f30Var.b = true;
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.xj, false);
                    int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false);
                    ja.d.d(i0.a.d(0.25f, x02, x03), x03, 0, 0);
                    ja.d.c.setStrokeWidth(AndroidUtilities.dpf2(f7));
                    ja.d.c.setStyle(Paint.Style.STROKE);
                    ja.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                f14 = 1.5f;
                ja.d.b(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom);
                Paint paint7 = ja.d.c;
                paint7.setStrokeWidth(AndroidUtilities.dp(f7));
                paint7.setAlpha((int) (f15 * 255.0f));
                rectF3 = rectF9;
                if (ChatObject.isForum(UserConfig.selectedAccount, j3)) {
                    float height = rectF8.height() * 0.32f;
                    canvas2.drawRoundRect(rectF8, height, height, paint7);
                } else {
                    canvas2.drawCircle(rectF8.centerX(), rectF8.centerY(), rectF8.width() / f7, paint7);
                }
            } else {
                rectF3 = rectF9;
                f14 = 1.5f;
                if ((profileStoriesView4.v != null || profileStoriesView4.J > 0) && f15 > 0.0f) {
                    rectF8.set(rectF7);
                    rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                    rectF3.set(rectF7);
                    rectF3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                    float f27 = f10;
                    AndroidUtilities.lerp(rectF8, rectF3, f27, rectF3);
                    Paint paint8 = paint;
                    float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF7.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f15);
                    int min = Math.min(profileStoriesView4.s, 50);
                    float min2 = Math.min(d11, 50.0f);
                    int i13 = min > 20 ? 3 : 5;
                    if (min <= 1) {
                        i13 = 0;
                    }
                    float lerp5 = AndroidUtilities.lerp(i13 * 2, lerp4, f27);
                    float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                    paint5.setColor(i0.a.d(profileStoriesView4.O, 1526726655, 973078528));
                    paint5.getAlpha();
                    float f28 = (-90.0f) - (lerp5 / f7);
                    int i14 = 0;
                    boolean z12 = false;
                    while (i14 < min) {
                        if (i14 < arrayList2.size()) {
                            arrayList4 = arrayList2;
                            l01Var = l01Var2;
                            if (((i6) arrayList4.get(i14)).l) {
                                z12 = true;
                            }
                        } else {
                            l01Var = l01Var2;
                            arrayList4 = arrayList2;
                        }
                        i14++;
                        arrayList2 = arrayList4;
                        l01Var2 = l01Var;
                    }
                    l01 l01Var3 = l01Var2;
                    arrayList3 = arrayList2;
                    if (z12) {
                        RectF rectF10 = AndroidUtilities.rectTmp;
                        rectF10.set(rectF3);
                        rectF10.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                        canvas2.saveLayerAlpha(rectF10, 255, 31);
                        float z13 = e2.z(profileStoriesView4.W, 1.0f, 2.5f, 1.0f);
                        if (z13 != 1.0f) {
                            canvas2.save();
                            canvas2.scale(z13, z13, rectF8.centerX(), rectF8.centerY());
                        }
                        int alpha2 = paint6.getAlpha();
                        paint6.setAlpha((int) (alpha2 * f15));
                        rectF10.set(rectF3);
                        rectF10.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                        paint6.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                        i6Var = null;
                        profileStoriesView4.b(0.0f, 360.0f, canvas2, paint6, rectF3);
                        paint6.setAlpha(alpha2);
                        if (z13 != 1.0f) {
                            canvas2.restore();
                        }
                        paint2 = paint6;
                        profileStoriesView4 = profileStoriesView4;
                        rectF2 = rectF8;
                        paint = paint8;
                        faVar2 = faVar;
                        rectF = rectF3;
                    } else {
                        ProfileStoriesView profileStoriesView5 = profileStoriesView4;
                        RectF rectF11 = rectF3;
                        Paint paint9 = paint6;
                        i6Var = null;
                        float f29 = f28;
                        int i15 = 0;
                        while (i15 < min) {
                            float f30 = i15;
                            Paint paint10 = paint9;
                            float f31 = f29;
                            float clamp3 = 1.0f - Utilities.clamp(d12 - f30, 1.0f, 0.0f);
                            float clamp4 = 1.0f - Utilities.clamp((min - min2) - f30, 1.0f, 0.0f);
                            if (clamp4 < 0.0f) {
                                profileStoriesView3 = profileStoriesView5;
                                rectF6 = rectF11;
                                f29 = f31;
                                c10 = 0;
                                i10 = min;
                                paint4 = paint10;
                                f20 = max;
                                rectF5 = rectF8;
                                faVar3 = faVar;
                                f19 = lerp5;
                            } else {
                                float z14 = i15 == 0 ? e2.z(profileStoriesView5.W, 1.0f, 2.5f, 1.0f) : 1.0f;
                                if (z14 != 1.0f) {
                                    canvas2.save();
                                    canvas2.scale(z14, z14, rectF8.centerX(), rectF8.centerY());
                                }
                                boolean z15 = i15 < arrayList3.size() && ((i6) arrayList3.get(i15)).l;
                                if (clamp3 < 1.0f) {
                                    if (z15) {
                                        faVar4 = faVar;
                                        a2 = paint10;
                                    } else {
                                        faVar4 = faVar;
                                        a2 = faVar4.a(rectF8);
                                        paint8 = a2;
                                    }
                                    f19 = lerp5;
                                    int alpha3 = a2.getAlpha();
                                    fa faVar6 = faVar4;
                                    a2.setAlpha((int) q.z(1.0f, clamp3, alpha3, f15));
                                    a2.setStrokeWidth(AndroidUtilities.dpf2(z15 ? 3.0f : 2.33f));
                                    f17 = clamp3;
                                    f18 = f31;
                                    i10 = min;
                                    paint4 = paint10;
                                    Paint paint11 = a2;
                                    rectF4 = rectF8;
                                    faVar3 = faVar6;
                                    c10 = 0;
                                    profileStoriesView5.b(f18, (-max) * clamp4, canvas2, paint11, rectF4);
                                    paint11.setAlpha(alpha3);
                                } else {
                                    f17 = clamp3;
                                    f18 = f31;
                                    i10 = min;
                                    paint4 = paint10;
                                    rectF4 = rectF8;
                                    faVar3 = faVar;
                                    c10 = 0;
                                    f19 = lerp5;
                                }
                                if (f17 > 0.0f) {
                                    Paint paint12 = z15 ? paint4 : paint5;
                                    int alpha4 = paint12.getAlpha();
                                    paint12.setAlpha((int) (alpha4 * f17 * f15));
                                    paint12.setStrokeWidth(AndroidUtilities.dpf2(z15 ? 3.0f : 1.5f));
                                    float f32 = (-max) * clamp4;
                                    profileStoriesView3 = this;
                                    canvas2 = canvas;
                                    f20 = max;
                                    rectF5 = rectF4;
                                    rectF6 = rectF11;
                                    profileStoriesView3.b(f18, f32, canvas2, paint12, rectF6);
                                    paint12.setAlpha(alpha4);
                                } else {
                                    profileStoriesView3 = this;
                                    canvas2 = canvas;
                                    f20 = max;
                                    rectF5 = rectF4;
                                    rectF6 = rectF11;
                                }
                                if (z14 != 1.0f) {
                                    canvas2.restore();
                                }
                                f29 = f18 - ((f19 * clamp4) + (f20 * clamp4));
                            }
                            i15++;
                            profileStoriesView5 = profileStoriesView3;
                            rectF11 = rectF6;
                            paint9 = paint4;
                            lerp5 = f19;
                            min = i10;
                            faVar = faVar3;
                            rectF8 = rectF5;
                            max = f20;
                        }
                        paint2 = paint9;
                        profileStoriesView4 = profileStoriesView5;
                        rectF2 = rectF8;
                        faVar2 = faVar;
                        rectF = rectF11;
                        paint = paint8;
                    }
                    if (z12) {
                        ja.k(canvas2, rectF, f15, l01Var3.getImageReceiver().getVisible(), profileStoriesView4.I);
                        canvas2.restore();
                    }
                }
            }
            paint2 = paint6;
            rectF2 = rectF8;
            faVar2 = faVar;
            arrayList3 = arrayList2;
            i6Var = null;
            rectF = rectF3;
            paint = paint;
        } else {
            paint2 = paint6;
            rectF = rectF9;
            rectF2 = rectF8;
            faVar2 = faVar;
            arrayList3 = arrayList2;
            f13 = 255.0f;
            f14 = 1.5f;
            i6Var = null;
            f15 = clamp2;
        }
        profileStoriesView4.getExpandRight();
        if (profileStoriesView4.N <= 0.0f || f15 >= 1.0f) {
            profileStoriesView = profileStoriesView4;
            f16 = 18.0f;
        } else {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                float f33 = ((i6) arrayList3.get(i16)).j;
                AndroidUtilities.dp(14.0f);
            }
            float f34 = f12;
            int i17 = 0;
            float f35 = 0.0f;
            while (i17 < arrayList3.size()) {
                i6 i6Var5 = (i6) arrayList3.get(i17);
                float f36 = i6Var5.j;
                RectF rectF12 = i6Var5.n;
                int i18 = i17;
                float f37 = i6Var5.k;
                float dp = (AndroidUtilities.dp(28.0f) / f7) * f36;
                float f38 = profileStoriesView4.f0 + dp + f35;
                float dp2 = f35 + (AndroidUtilities.dp(18.0f) * f36);
                float f39 = f38 + dp;
                f34 = Math.max(f34, f39);
                rectF2.set(f38 - dp, lerp3 - dp, f39, lerp3 + dp);
                float f40 = profileStoriesView4.N;
                float lerp6 = AndroidUtilities.lerp(rectF7.centerX(), rectF2.centerX(), f40);
                float lerp7 = AndroidUtilities.lerp(rectF7.centerY(), rectF2.centerY(), f40);
                float lerp8 = AndroidUtilities.lerp(Math.min(rectF7.width(), rectF7.height()), Math.min(rectF2.width(), rectF2.height()), f40) / f7;
                rectF.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                i6Var5.m.set(rectF);
                rectF12.set(rectF);
                float f41 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.N), profileStoriesView4.N * f37)) * f36;
                rectF12.inset(f41, f41);
                i17 = i18 + 1;
                f35 = dp2;
            }
            f16 = 18.0f;
            paint5.setColor(i0.a.d(profileStoriesView4.N, 1526726655, -2135178036));
            paint5.getAlpha();
            Paint a10 = faVar2.a(rectF2);
            a10.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f14), profileStoriesView4.N));
            paint5.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f14), profileStoriesView4.N));
            paint2.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f14), profileStoriesView4.N));
            int i19 = 0;
            while (i19 < arrayList3.size()) {
                i6 i6Var6 = (i6) arrayList3.get(i19);
                int i20 = i19 - 2;
                i6 i6Var7 = i20 >= 0 ? (i6) arrayList3.get(i20) : i6Var;
                int i21 = i19 - 1;
                i6 d13 = d(i6Var7, i21 >= 0 ? (i6) arrayList3.get(i21) : i6Var, i6Var6);
                int i22 = i19 + 1;
                int i23 = i19 + 2;
                i6 d14 = d(i22 < arrayList3.size() ? (i6) arrayList3.get(i22) : i6Var, i23 < arrayList3.size() ? (i6) arrayList3.get(i23) : i6Var, i6Var6);
                if (d13 != null) {
                    RectF rectF13 = d13.n;
                    float centerX = rectF13.centerX();
                    RectF rectF14 = i6Var6.n;
                    RectF rectF15 = i6Var6.n;
                    if (Math.abs(centerX - rectF14.centerX()) < Math.abs((rectF15.width() / f7) - (rectF13.width() / f7)) || Math.abs(rectF13.centerX() - rectF15.centerX()) > (rectF15.width() / f7) + (rectF13.width() / f7)) {
                        i6Var2 = i6Var;
                        if (d14 != null) {
                            RectF rectF16 = d14.n;
                            float centerX2 = rectF16.centerX();
                            RectF rectF17 = i6Var6.n;
                            RectF rectF18 = i6Var6.n;
                            if (Math.abs(centerX2 - rectF17.centerX()) < Math.abs((rectF18.width() / f7) - (rectF16.width() / f7)) || Math.abs(rectF16.centerX() - rectF18.centerX()) > (rectF18.width() / f7) + (rectF16.width() / f7)) {
                                i6Var3 = i6Var;
                                if (i6Var6.k < 1.0f) {
                                    int alpha5 = a10.getAlpha();
                                    a10.setAlpha((int) ((1.0f - f15) * (1.0f - i6Var6.k) * alpha5 * i6Var6.j));
                                    profileStoriesView4.c(canvas, i6Var2, i6Var6, i6Var3, a10);
                                    paint3 = a10;
                                    paint3.setAlpha(alpha5);
                                } else {
                                    paint3 = a10;
                                }
                                if (i6Var6.k > 0.0f) {
                                    Paint paint13 = i6Var6.l ? paint2 : paint5;
                                    int alpha6 = paint13.getAlpha();
                                    paint13.setAlpha((int) ((1.0f - f15) * alpha6 * i6Var6.j * i6Var6.k));
                                    c(canvas, i6Var2, i6Var6, i6Var3, paint13);
                                    profileStoriesView2 = this;
                                    paint13.setAlpha(alpha6);
                                } else {
                                    profileStoriesView2 = this;
                                }
                                a10 = paint3;
                                i19 = i22;
                                profileStoriesView4 = profileStoriesView2;
                            }
                        }
                        i6Var3 = d14;
                        if (i6Var6.k < 1.0f) {
                        }
                        if (i6Var6.k > 0.0f) {
                        }
                        a10 = paint3;
                        i19 = i22;
                        profileStoriesView4 = profileStoriesView2;
                    }
                }
                i6Var2 = d13;
                if (d14 != null) {
                }
                i6Var3 = d14;
                if (i6Var6.k < 1.0f) {
                }
                if (i6Var6.k > 0.0f) {
                }
                a10 = paint3;
                i19 = i22;
                profileStoriesView4 = profileStoriesView2;
            }
            profileStoriesView = profileStoriesView4;
            Paint paint14 = a10;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f15) * profileStoriesView.N * f13), 31);
            canvas2 = canvas;
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                i6 i6Var8 = (i6) arrayList3.get(size);
                ImageReceiver imageReceiver = i6Var8.b;
                ImageReceiver imageReceiver2 = i6Var8.b;
                if (imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i24 = size - 1;
                    int i25 = size - 2;
                    profileStoriesView.a(canvas2, i6Var8, d(i24 >= 0 ? (i6) arrayList3.get(i24) : i6Var, i25 >= 0 ? (i6) arrayList3.get(i25) : i6Var, i6Var8));
                    imageReceiver2.setImageCoords(i6Var8.m);
                    imageReceiver2.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            f12 = f34;
            paint = paint14;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.N - 0.5f) * f7);
        if (max2 > 0.0f) {
            float lerp9 = AndroidUtilities.lerp(rectF7.right + AndroidUtilities.dp(16.0f), f12 + AndroidUtilities.dp(12.0f), profileStoriesView.N);
            float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f11, profileStoriesView.N);
            float lerp11 = AndroidUtilities.lerp(rectF7.centerY(), profileStoriesView.h0, profileStoriesView.N);
            q6 q6Var = profileStoriesView.n;
            q6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f16)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f16)));
            q6Var.B = (int) (max2 * f13);
            q6Var.draw(canvas2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0199, code lost:
    
        if (r3 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:229:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        m9 m9Var;
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
        long clientUserId = UserConfig.getInstance(i18).getClientUserId();
        long j3 = this.d;
        int i19 = 0;
        boolean z13 = j3 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z14 = MessagesController.getInstance(i18).getStoriesController().z(j3);
        TL_stories.PeerStories y3 = MessagesController.getInstance(i18).getStoriesController().y(j3);
        TL_stories.PeerStories peerStories = j3 == 0 ? null : z14;
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
            arrayList2 = this.w;
            int size = arrayList2.size();
            m9Var = this.M;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            i6 i6Var = (i6) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == i6Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                i6Var.e = 0.0f;
            } else {
                i6Var.c = i33;
                i6Var.d = (z16 || !(peerStories == null || storyItem == null || storyItem.id > m9Var.x(j3))) ? z15 : false;
            }
            if (!z10) {
                boolean z19 = z15;
                i6Var.f.f(i6Var.d, z19);
                i6Var.g.d(i6Var.c, z19);
                i6Var.h.d(i6Var.e, z19);
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
                } else if (((i6) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j3;
                i6 i6Var2 = new i6(this, storyItem5);
                i6Var2.c = i34;
                i6Var2.e = 1.0f;
                g6 g6Var = i6Var2.h;
                g6Var.d(0.0f, true);
                boolean z20 = z16 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                i6Var2.d = z20;
                if (!z10) {
                    i6Var2.f.f(z20, true);
                    i6Var2.g.d(i6Var2.c, true);
                    g6Var.d(i6Var2.e, true);
                }
                arrayList2.add(i6Var2);
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
            i6 i6Var3 = (i6) arrayList2.get(i36);
            if (i6Var3.e > 0.0f) {
                this.v = i6Var3;
                break;
            }
            i36++;
        }
        ArrayList E = m9Var.E(j3);
        this.J = E == null ? 0 : E.size();
        int max2 = Math.max(arrayList3.size(), i21);
        int i37 = (max2 != 0 || this.J == 0) ? max2 : 1;
        if (z11 && z10) {
            int i38 = 1;
            if (i37 == this.s + 1 && this.r == i10 + 1) {
                ValueAnimator valueAnimator = this.a0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean[] zArr = {false};
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.a0 = ofFloat;
                ofFloat.addUpdateListener(new x(i38, this, zArr));
                this.a0.addListener(new z(1, this, zArr));
                bi.l(3.0f, this.a0);
                this.a0.setDuration(400L);
                this.a0.setStartDelay(120L);
                this.a0.start();
            }
        }
        this.s = i37;
        if (i37 > 0) {
            z12 = false;
            str = LocaleController.formatPluralString("Stories", i37, new Object[0]);
        } else {
            z12 = false;
            str = "";
        }
        if (z10 && !LocaleController.isRTL) {
            z12 = true;
        }
        this.n.t(str, z12, true);
        fa faVar = this.L;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j3));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    faVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                }
            }
            if (user != null) {
                faVar.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(faVar.a).profilePeerColors;
                    faVar.c(peerColors != null ? null : peerColors.getColor(i14), z10);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(faVar.a).profilePeerColors;
            faVar.c(peerColors2 != null ? null : peerColors2.getColor(i14), z10);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j3));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    faVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                }
            }
            if (chat != null) {
                faVar.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(faVar.a).profilePeerColors;
                    faVar.c(peerColors3 != null ? null : peerColors3.getColor(i13), z10);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(faVar.a).profilePeerColors;
            faVar.c(peerColors32 != null ? null : peerColors32.getColor(i13), z10);
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
                ((i6) arrayList.get(i10)).b.onAttachedToWindow();
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
                ((i6) arrayList.get(i10)).b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N < 0.9f ? this.Q.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.f0 && motionEvent.getX() <= this.g0 && Math.abs(motionEvent.getY() - this.h0) < ((float) AndroidUtilities.dp(32.0f));
        ai.g6 g6Var = this.o0;
        if (contains && motionEvent.getAction() == 0) {
            this.p0 = System.currentTimeMillis();
            this.q0 = motionEvent.getX();
            this.r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            if (contains && System.currentTimeMillis() - this.p0 <= ViewConfiguration.getTapTimeout() && z6.a(this.q0, this.r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                m9 m9Var = this.M;
                long j3 = this.d;
                if (m9Var.K(j3) || m9Var.I(j3) || !this.w.isEmpty()) {
                    e(this.n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (org.telegram.ui.ActionBar.i6.I.q()) {
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
