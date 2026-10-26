package org.telegram.ui.Stories;

import a4.d;
import a8.ic;
import ai.g0;
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
import bh.b;
import bh.b0;
import bi.ce;
import c3.h0;
import di.a8;
import di.g7;
import di.h7;
import di.r4;
import di.s4;
import di.y7;
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
import org.telegram.messenger.t;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.z20;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bz0;
import org.telegram.ui.d3;
import org.telegram.ui.wz0;
import rb.c;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public g7 K;
    public final y7 L;
    public final h7 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final h6 T;
    public final h6 U;
    public final h6 V;
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
    public final wz0 h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public final h6 l0;
    public final h6 m0;
    public final r6 n;
    public final c n0;
    public final r4 o0;
    public long p0;
    public float q0;
    public int r;
    public float r0;
    public int s;
    public s4 v;
    public final ArrayList w;
    public boolean x;
    public bk0 y;

    /* JADX WARN: Type inference failed for: r0v12, types: [di.r4] */
    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, wz0 wz0Var, u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        r6 r6Var = new r6(false, true, true);
        this.n = r6Var;
        Paint paint4 = new Paint(1);
        this.w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new y7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        ds dsVar = ds.h;
        this.T = new h6(this, 0L, 480L, dsVar);
        this.U = new h6(this, 0L, 240L, dsVar);
        this.V = new h6(this, 0L, 150L, ds.f);
        this.W = 1.0f;
        this.b0 = new Path();
        this.c0 = new Matrix();
        this.d0 = new PathMeasure();
        this.e0 = new Path();
        this.l0 = new h6(this, 0L, 350L, dsVar);
        this.m0 = new h6(this, 0L, 350L, dsVar);
        final bz0 bz0Var = (bz0) this;
        this.n0 = new c(bz0Var, 17);
        final int i11 = 0;
        this.o0 = new Runnable() { // from class: di.r4
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                bz0 bz0Var2 = bz0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        ProfileActivity profileActivity = bz0Var2.u0;
                        int i14 = ProfileActivity.R6;
                        profileActivity.E4(false);
                        break;
                    default:
                        bz0Var2.invalidate();
                        break;
                }
            }
        };
        this.c = i10;
        this.d = j10;
        this.e = z10;
        this.f = view;
        this.h = wz0Var;
        final int i12 = 1;
        wz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() { // from class: di.r4
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                bz0 bz0Var2 = bz0Var;
                switch (i122) {
                    case 0:
                        int i13 = ProfileStoriesView.s0;
                        ProfileActivity profileActivity = bz0Var2.u0;
                        int i14 = ProfileActivity.R6;
                        profileActivity.E4(false);
                        break;
                    default:
                        bz0Var2.invalidate();
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
        paint2.setColor(y6.w0(y6.nk, u6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(y6.w0(y6.d6, u6Var));
        r6Var.w(AndroidUtilities.dp(18.0f));
        r6Var.n(0.4f, 320L, dsVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(-1);
        r6Var.q(true);
        r6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static s4 d(s4 s4Var, s4 s4Var2, s4 s4Var3) {
        if (s4Var3 == null) {
            return null;
        }
        RectF rectF = s4Var3.n;
        if (s4Var == null && s4Var2 == null) {
            return null;
        }
        if (s4Var != null) {
            RectF rectF2 = s4Var.n;
            if (s4Var2 != null) {
                RectF rectF3 = s4Var2.n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? s4Var : s4Var2;
            }
        }
        return s4Var != null ? s4Var : s4Var2;
    }

    private float getExpandRight() {
        return this.i0 - (this.l0.e(this.k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, s4 s4Var, s4 s4Var2) {
        if (s4Var2 == null) {
            return;
        }
        RectF rectF = s4Var2.m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * s4Var2.j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = s4Var.m;
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

    public final void c(Canvas canvas, s4 s4Var, s4 s4Var2, s4 s4Var3, Paint paint) {
        s4 s4Var4 = s4Var;
        RectF rectF = s4Var2.n;
        if (s4Var4 == null && s4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (s4Var4 != null) {
            RectF rectF2 = s4Var4.n;
            if (s4Var3 != null) {
                RectF rectF3 = s4Var3.n;
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
        if (s4Var4 == null && s4Var3 == null) {
            return;
        }
        if (s4Var4 == null) {
            s4Var4 = s4Var3;
        }
        float centerX4 = s4Var4.n.centerX();
        float width4 = s4Var4.n.width() / 2.0f;
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0891  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f7;
        y7 y7Var;
        float f10;
        long j10;
        float f11;
        ArrayList arrayList2;
        Paint paint;
        RectF rectF;
        Paint paint2;
        RectF rectF2;
        y7 y7Var2;
        ArrayList arrayList3;
        float f12;
        float f13;
        float f14;
        ProfileStoriesView profileStoriesView;
        float f15;
        s4 s4Var;
        s4 s4Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ProfileStoriesView profileStoriesView3;
        Paint paint4;
        RectF rectF3;
        Canvas canvas2;
        int i10;
        boolean z10;
        y7 y7Var3;
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
        y7 y7Var4;
        Paint a2;
        Paint paint6;
        int i11;
        ArrayList arrayList5;
        float f19;
        g7 g7Var;
        ProfileStoriesView profileStoriesView5 = this;
        Canvas canvas4 = canvas;
        float d = profileStoriesView5.m0.d(profileStoriesView5.g0, false);
        View view = profileStoriesView5.f;
        float clamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * profileStoriesView5.H;
        float scaleX = (view.getScaleX() * lerp) + view.getX();
        float scaleY = (view.getScaleY() * lerp) + view.getY();
        float f20 = lerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f20);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f20)) + scaleY;
        RectF rectF7 = profileStoriesView5.P;
        rectF7.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f21 = profileStoriesView5.f0;
        int i12 = 0;
        while (true) {
            arrayList = profileStoriesView5.w;
            if (i12 >= arrayList.size()) {
                break;
            }
            s4 s4Var3 = (s4) arrayList.get(i12);
            float d10 = s4Var3.h.d(s4Var3.e, false);
            s4Var3.j = d10;
            if (d10 > 0.0f || s4Var3.e > 0.0f) {
                s4Var3.i = s4Var3.g.d(s4Var3.c, false);
                s4Var3.k = s4Var3.f.e(s4Var3.d);
                if (i12 > 0 && ((s4) arrayList.get(i12 - 1)).i > s4Var3.i) {
                    Collections.sort(arrayList, new d(14));
                    break;
                }
            } else {
                s4Var3.b.onDetachedFromWindow();
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        float clamp2 = Utilities.clamp(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f);
        h7 h7Var = profileStoriesView5.M;
        long j11 = profileStoriesView5.d;
        boolean N = h7Var.N(j11);
        boolean K = h7Var.K(j11);
        h6 h6Var = profileStoriesView5.V;
        if (!K && (g7Var = profileStoriesView5.K) != null && g7Var.v) {
            profileStoriesView5.E = false;
            profileStoriesView5.F = false;
            h6Var.getClass();
            h6Var.d(0.0f, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, h6Var.e((K && !N) || (profileStoriesView5.E && !profileStoriesView5.F)), profileStoriesView5.I);
        canvas4.save();
        float f22 = profileStoriesView5.G;
        canvas4.scale(f22, f22, rectF7.centerX(), rectF7.centerY());
        float lerp3 = AndroidUtilities.lerp(rectF7.centerY(), profileStoriesView5.j0, profileStoriesView5.N);
        profileStoriesView5.K = null;
        h6 h6Var2 = profileStoriesView5.U;
        h6 h6Var3 = profileStoriesView5.T;
        wz0 wz0Var = profileStoriesView5.h;
        y7 y7Var5 = profileStoriesView5.L;
        RectF rectF8 = profileStoriesView5.Q;
        if (lerp2 > 0.0f) {
            rectF8.set(rectF7);
            f11 = f21;
            rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            paint = y7Var5.a(rectF8);
            if (profileStoriesView5.y == null) {
                bk0 bk0Var = new bk0(profileStoriesView5);
                profileStoriesView5.y = bk0Var;
                y7Var = y7Var5;
                f10 = d;
                arrayList2 = arrayList;
                bk0Var.d(null, true, false);
                profileStoriesView5.y.u = ChatObject.isForum(UserConfig.selectedAccount, j11);
            } else {
                y7Var = y7Var5;
                f10 = d;
                arrayList2 = arrayList;
            }
            if (!h7Var.K(j11) || h7Var.N(j11)) {
                f19 = 1.0f;
            } else {
                ArrayList E = h7Var.E(j11);
                if (E != null) {
                    if (E.size() > 0) {
                        profileStoriesView5.K = (g7) E.get(0);
                    }
                    float f23 = 0.0f;
                    for (int i13 = 0; i13 < E.size(); i13++) {
                        f23 += ((g7) E.get(i13)).h;
                    }
                    f19 = f23 / E.size();
                } else {
                    f19 = 0.0f;
                }
            }
            profileStoriesView5.y.q = 0;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * clamp2 * lerp2));
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            bk0 bk0Var2 = profileStoriesView5.y;
            bk0Var2.t = paint;
            f7 = clamp;
            j10 = j11;
            bk0Var2.f((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView5.y.e(Utilities.clamp(f19, 1.0f, 0.0f), true);
            if (wz0Var.Q) {
                profileStoriesView5.y.a(canvas4);
            }
            paint.setAlpha(alpha);
            profileStoriesView5.E = true;
            boolean z11 = profileStoriesView5.F;
            boolean z12 = profileStoriesView5.y.f >= 0.98f;
            profileStoriesView5.F = z12;
            if (z11 != z12) {
                h6Var3.d(profileStoriesView5.s, true);
                h6Var2.d(profileStoriesView5.r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                ofFloat.setDuration(100L);
                ofFloat.setInterpolator(ds.g);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(new OvershootInterpolator());
                g0 g0Var = new g0(profileStoriesView5, 19);
                ofFloat.addUpdateListener(g0Var);
                ofFloat2.addUpdateListener(g0Var);
                animatorSet.playSequentially(ofFloat, ofFloat2);
                animatorSet.addListener(new b(profileStoriesView5, 12));
                animatorSet.start();
            }
        } else {
            f7 = clamp;
            y7Var = y7Var5;
            f10 = d;
            j10 = j11;
            f11 = f21;
            arrayList2 = arrayList;
            profileStoriesView5.E = false;
            paint = null;
        }
        Paint paint7 = profileStoriesView5.a;
        Paint paint8 = profileStoriesView5.b;
        RectF rectF9 = profileStoriesView5.R;
        if (lerp2 < 1.0f) {
            f12 = 255.0f;
            f14 = (1.0f - lerp2) * Utilities.clamp(1.0f - (profileStoriesView5.N / 0.2f), 1.0f, 0.0f);
            f13 = 1.5f;
            float d11 = h6Var3.d(profileStoriesView5.s, false);
            float d12 = h6Var2.d(profileStoriesView5.r, false);
            if (N) {
                rectF8.set(rectF7);
                rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (a8.d == null) {
                    z20 z20Var = new z20();
                    a8.d = z20Var;
                    z20Var.a = true;
                    z20Var.b = true;
                    z20Var.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    a8.d.c.setStyle(Paint.Style.STROKE);
                    a8.d.c.setStrokeCap(Paint.Cap.ROUND);
                }
                int x02 = y6.x0(null, y6.xj, false);
                int x03 = y6.x0(null, y6.q7, false);
                a8.d.d(a.f(0.25f, x02, x03), x03, 0, 0);
                a8.d.b(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom);
                Paint paint9 = a8.d.c;
                paint9.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint9.setAlpha((int) (f14 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j10)) {
                    float height = rectF8.height() * 0.32f;
                    canvas4.drawRoundRect(rectF8, height, height, paint9);
                } else {
                    canvas4.drawCircle(rectF8.centerX(), rectF8.centerY(), rectF8.width() / 2.0f, paint9);
                }
            } else if ((profileStoriesView5.v != null || profileStoriesView5.J > 0) && f14 > 0.0f) {
                rectF8.set(rectF7);
                rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF9.set(rectF7);
                rectF9.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                float f24 = f7;
                AndroidUtilities.lerp(rectF8, rectF9, f24, rectF9);
                RectF rectF10 = rectF9;
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (rectF7.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(d11 - 1.0f, 1.0f, 0.0f) * f14);
                int min = Math.min(profileStoriesView5.s, 50);
                float min2 = Math.min(d11, 50.0f);
                int i14 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i14 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i14 * 2, lerp4, f24);
                float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                paint7.setColor(a.f(profileStoriesView5.O, 1526726655, 973078528));
                paint7.getAlpha();
                float f25 = (-90.0f) - (lerp5 / 2.0f);
                int i15 = 0;
                boolean z13 = false;
                while (i15 < min) {
                    if (i15 < arrayList2.size()) {
                        arrayList5 = arrayList2;
                        i11 = i15;
                        if (((s4) arrayList5.get(i15)).l) {
                            z13 = true;
                        }
                    } else {
                        i11 = i15;
                        arrayList5 = arrayList2;
                    }
                    i15 = i11 + 1;
                    arrayList2 = arrayList5;
                }
                ArrayList arrayList6 = arrayList2;
                if (z13) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    rectF11.set(rectF10);
                    rectF11.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas4.saveLayerAlpha(rectF11, 255, 31);
                    float B = h0.B(profileStoriesView5.W, 1.0f, 2.5f, 1.0f);
                    if (B != 1.0f) {
                        canvas4.save();
                        canvas4.scale(B, B, rectF8.centerX(), rectF8.centerY());
                    }
                    int alpha2 = paint8.getAlpha();
                    paint8.setAlpha((int) (alpha2 * f14));
                    rectF11.set(rectF10);
                    rectF11.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint8.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
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
                    int i16 = 0;
                    while (i16 < min) {
                        Paint paint10 = paint4;
                        float f26 = i16;
                        float f27 = f25;
                        float f28 = lerp5;
                        float clamp3 = 1.0f - Utilities.clamp(d12 - f26, 1.0f, 0.0f);
                        int i17 = min;
                        float clamp4 = 1.0f - Utilities.clamp((min - min2) - f26, 1.0f, 0.0f);
                        if (clamp4 < 0.0f) {
                            i10 = i16;
                            profileStoriesView4 = profileStoriesView3;
                            canvas3 = canvas2;
                            y7Var3 = y7Var;
                            f25 = f27;
                            arrayList4 = arrayList7;
                            rectF6 = rectF10;
                            f18 = max;
                            rectF5 = rectF3;
                            paint5 = paint10;
                        } else {
                            float B2 = i16 == 0 ? h0.B(profileStoriesView3.W, 1.0f, 2.5f, 1.0f) : 1.0f;
                            RectF rectF12 = rectF3;
                            if (B2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(B2, B2, rectF12.centerX(), rectF12.centerY());
                            }
                            boolean z14 = i16 < arrayList7.size() && ((s4) arrayList7.get(i16)).l;
                            if (clamp3 < 1.0f) {
                                if (z14) {
                                    y7 y7Var6 = y7Var;
                                    paint6 = paint;
                                    y7Var4 = y7Var6;
                                    a2 = paint10;
                                } else {
                                    y7Var4 = y7Var;
                                    a2 = y7Var4.a(rectF12);
                                    paint6 = a2;
                                }
                                z10 = z14;
                                int alpha3 = a2.getAlpha();
                                i10 = i16;
                                a2.setAlpha((int) t.A(1.0f, clamp3, alpha3, f14));
                                a2.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 2.33f));
                                f17 = clamp3;
                                ProfileStoriesView profileStoriesView6 = profileStoriesView3;
                                Canvas canvas5 = canvas2;
                                Paint paint11 = a2;
                                f16 = f27;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                paint5 = paint10;
                                profileStoriesView6.b(f16, (-max) * clamp4, canvas5, paint11, rectF4);
                                paint11.setAlpha(alpha3);
                                y7Var3 = y7Var4;
                                paint = paint6;
                            } else {
                                i10 = i16;
                                z10 = z14;
                                y7Var3 = y7Var;
                                paint5 = paint10;
                                f16 = f27;
                                arrayList4 = arrayList7;
                                rectF4 = rectF12;
                                f17 = clamp3;
                            }
                            if (f17 > 0.0f) {
                                Paint paint12 = z10 ? paint5 : paint7;
                                int alpha4 = paint12.getAlpha();
                                paint12.setAlpha((int) (alpha4 * f17 * f14));
                                paint12.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                float f29 = (-max) * clamp4;
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
                            f25 = f16 - ((f28 * clamp4) + (f18 * clamp4));
                        }
                        i16 = i10 + 1;
                        canvas2 = canvas3;
                        y7Var = y7Var3;
                        lerp5 = f28;
                        min = i17;
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
                y7Var2 = y7Var;
                paint2 = paint4;
                profileStoriesView5 = profileStoriesView3;
                canvas4 = canvas2;
                if (z13) {
                    a8.k(f14, profileStoriesView5.I, canvas4, rectF2, wz0Var.getImageReceiver().getVisible());
                    canvas4.restore();
                }
            }
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            y7Var2 = y7Var;
            arrayList3 = arrayList2;
        } else {
            rectF = rectF8;
            paint2 = paint8;
            rectF2 = rectF9;
            y7Var2 = y7Var;
            arrayList3 = arrayList2;
            f12 = 255.0f;
            f13 = 1.5f;
            f14 = clamp2;
        }
        profileStoriesView5.getExpandRight();
        if (profileStoriesView5.N <= 0.0f || f14 >= 1.0f) {
            profileStoriesView = profileStoriesView5;
            f15 = 18.0f;
        } else {
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                float f32 = ((s4) arrayList3.get(i18)).j;
                AndroidUtilities.dp(14.0f);
            }
            ArrayList arrayList8 = arrayList3;
            float f33 = f11;
            int i19 = 0;
            float f34 = 0.0f;
            while (i19 < arrayList8.size()) {
                s4 s4Var4 = (s4) arrayList8.get(i19);
                float f35 = s4Var4.j;
                RectF rectF13 = s4Var4.n;
                int i20 = i19;
                float f36 = s4Var4.k;
                float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f35;
                float f37 = profileStoriesView5.f0 + dp + f34;
                float dp2 = f34 + (AndroidUtilities.dp(18.0f) * f35);
                float f38 = f37 + dp;
                f33 = Math.max(f33, f38);
                rectF.set(f37 - dp, lerp3 - dp, f38, lerp3 + dp);
                float f39 = profileStoriesView5.N;
                float lerp6 = AndroidUtilities.lerp(rectF7.centerX(), rectF.centerX(), f39);
                float lerp7 = AndroidUtilities.lerp(rectF7.centerY(), rectF.centerY(), f39);
                float lerp8 = AndroidUtilities.lerp(Math.min(rectF7.width(), rectF7.height()), Math.min(rectF.width(), rectF.height()), f39) / 2.0f;
                rectF2.set(lerp6 - lerp8, lerp7 - lerp8, lerp6 + lerp8, lerp7 + lerp8);
                s4Var4.m.set(rectF2);
                rectF13.set(rectF2);
                float f40 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView5.N), profileStoriesView5.N * f36)) * f35;
                rectF13.inset(f40, f40);
                i19 = i20 + 1;
                f14 = f14;
                f34 = dp2;
            }
            float f41 = f14;
            f15 = 18.0f;
            paint7.setColor(a.f(profileStoriesView5.N, 1526726655, -2135178036));
            paint7.getAlpha();
            Paint a10 = y7Var2.a(rectF);
            a10.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f13), profileStoriesView5.N));
            paint7.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f13), profileStoriesView5.N));
            paint2.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f13), profileStoriesView5.N));
            int i21 = 0;
            while (i21 < arrayList8.size()) {
                s4 s4Var5 = (s4) arrayList8.get(i21);
                int i22 = i21 - 2;
                s4 s4Var6 = i22 >= 0 ? (s4) arrayList8.get(i22) : null;
                int i23 = i21 - 1;
                s4 d13 = d(s4Var6, i23 >= 0 ? (s4) arrayList8.get(i23) : null, s4Var5);
                int i24 = i21 + 1;
                int i25 = i21 + 2;
                s4 d14 = d(i24 < arrayList8.size() ? (s4) arrayList8.get(i24) : null, i25 < arrayList8.size() ? (s4) arrayList8.get(i25) : null, s4Var5);
                if (d13 != null) {
                    RectF rectF14 = d13.n;
                    float centerX = rectF14.centerX();
                    RectF rectF15 = s4Var5.n;
                    RectF rectF16 = s4Var5.n;
                    if (Math.abs(centerX - rectF15.centerX()) < Math.abs((rectF16.width() / 2.0f) - (rectF14.width() / 2.0f)) || Math.abs(rectF14.centerX() - rectF16.centerX()) > (rectF16.width() / 2.0f) + (rectF14.width() / 2.0f)) {
                        s4Var = null;
                        if (d14 != null) {
                            RectF rectF17 = d14.n;
                            float centerX2 = rectF17.centerX();
                            RectF rectF18 = s4Var5.n;
                            RectF rectF19 = s4Var5.n;
                            if (Math.abs(centerX2 - rectF18.centerX()) < Math.abs((rectF19.width() / 2.0f) - (rectF17.width() / 2.0f)) || Math.abs(rectF17.centerX() - rectF19.centerX()) > (rectF19.width() / 2.0f) + (rectF17.width() / 2.0f)) {
                                s4Var2 = null;
                                if (s4Var5.k < 1.0f) {
                                    int alpha5 = a10.getAlpha();
                                    a10.setAlpha((int) ((1.0f - f41) * (1.0f - s4Var5.k) * alpha5 * s4Var5.j));
                                    profileStoriesView5.c(canvas, s4Var, s4Var5, s4Var2, a10);
                                    paint3 = a10;
                                    paint3.setAlpha(alpha5);
                                } else {
                                    paint3 = a10;
                                }
                                if (s4Var5.k > 0.0f) {
                                    Paint paint13 = s4Var5.l ? paint2 : paint7;
                                    int alpha6 = paint13.getAlpha();
                                    paint13.setAlpha((int) ((1.0f - f41) * alpha6 * s4Var5.j * s4Var5.k));
                                    c(canvas, s4Var, s4Var5, s4Var2, paint13);
                                    profileStoriesView2 = this;
                                    paint13.setAlpha(alpha6);
                                } else {
                                    profileStoriesView2 = this;
                                }
                                a10 = paint3;
                                i21 = i24;
                                profileStoriesView5 = profileStoriesView2;
                            }
                        }
                        s4Var2 = d14;
                        if (s4Var5.k < 1.0f) {
                        }
                        if (s4Var5.k > 0.0f) {
                        }
                        a10 = paint3;
                        i21 = i24;
                        profileStoriesView5 = profileStoriesView2;
                    }
                }
                s4Var = d13;
                if (d14 != null) {
                }
                s4Var2 = d14;
                if (s4Var5.k < 1.0f) {
                }
                if (s4Var5.k > 0.0f) {
                }
                a10 = paint3;
                i21 = i24;
                profileStoriesView5 = profileStoriesView2;
            }
            profileStoriesView = profileStoriesView5;
            Paint paint14 = a10;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f41) * profileStoriesView.N * f12), 31);
            canvas4 = canvas;
            for (int size = arrayList8.size() - 1; size >= 0; size--) {
                s4 s4Var7 = (s4) arrayList8.get(size);
                ImageReceiver imageReceiver = s4Var7.b;
                ImageReceiver imageReceiver2 = s4Var7.b;
                if (imageReceiver.getVisible()) {
                    int saveCount = canvas4.getSaveCount();
                    int i26 = size - 1;
                    int i27 = size - 2;
                    profileStoriesView.a(canvas4, s4Var7, d(i26 >= 0 ? (s4) arrayList8.get(i26) : null, i27 >= 0 ? (s4) arrayList8.get(i27) : null, s4Var7));
                    imageReceiver2.setImageCoords(s4Var7.m);
                    imageReceiver2.draw(canvas4);
                    canvas4.restoreToCount(saveCount);
                }
            }
            canvas4.restore();
            paint = paint14;
            f11 = f33;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas4.restore();
        float max2 = Math.max(0.0f, (profileStoriesView.N - 0.5f) * 2.0f);
        if (max2 > 0.0f) {
            float lerp9 = AndroidUtilities.lerp(rectF7.right + AndroidUtilities.dp(16.0f), f11 + AndroidUtilities.dp(12.0f), profileStoriesView.N);
            float lerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f10, profileStoriesView.N);
            float lerp11 = AndroidUtilities.lerp(rectF7.centerY(), profileStoriesView.h0, profileStoriesView.N);
            r6 r6Var = profileStoriesView.n;
            r6Var.setBounds((int) lerp9, (int) (lerp11 - AndroidUtilities.dp(f15)), (int) lerp10, (int) (lerp11 + AndroidUtilities.dp(f15)));
            r6Var.B = (int) (max2 * f12);
            r6Var.draw(canvas4);
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
        int i10;
        int i11;
        ArrayList arrayList2;
        h7 h7Var;
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
        long j10 = this.d;
        int i19 = 0;
        boolean z13 = j10 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories z14 = MessagesController.getInstance(i18).getStoriesController().z(j10);
        TL_stories.PeerStories y3 = MessagesController.getInstance(i18).getStoriesController().y(j10);
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
                    } else if (z18) {
                        continue;
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
            h7Var = this.M;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            s4 s4Var = (s4) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.id == s4Var.a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                s4Var.e = 0.0f;
            } else {
                s4Var.c = i33;
                s4Var.d = (z16 || !(peerStories == null || storyItem == null || storyItem.id > h7Var.x(j10))) ? z15 : false;
            }
            if (!z10) {
                boolean z19 = z15;
                s4Var.f.f(s4Var.d, z19);
                s4Var.g.d(s4Var.c, z19);
                s4Var.h.d(s4Var.e, z19);
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
                } else if (((s4) arrayList2.get(i35)).a == storyItem5.id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j10;
                s4 s4Var2 = new s4(this, storyItem5);
                s4Var2.c = i34;
                s4Var2.e = 1.0f;
                h6 h6Var = s4Var2.h;
                h6Var.d(0.0f, true);
                boolean z20 = z16 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                s4Var2.d = z20;
                if (!z10) {
                    s4Var2.f.f(z20, true);
                    s4Var2.g.d(s4Var2.c, true);
                    h6Var.d(s4Var2.e, true);
                }
                arrayList2.add(s4Var2);
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
            s4 s4Var3 = (s4) arrayList2.get(i36);
            if (s4Var3.e > 0.0f) {
                this.v = s4Var3;
                break;
            }
            i36++;
        }
        ArrayList E = h7Var.E(j10);
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
            ofFloat.addUpdateListener(new b0(3, this, zArr));
            this.a0.addListener(new ce(2, this, zArr));
            d3.m(3.0f, this.a0);
            this.a0.setDuration(400L);
            this.a0.setStartDelay(120L);
            this.a0.start();
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
        y7 y7Var = this.L;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j10));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    y7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                }
            }
            if (user != null) {
                y7Var.getClass();
                TLRPC.PeerColor peerColor = user.profile_color;
                if (peerColor != null) {
                    i14 = peerColor.color;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(y7Var.a).profilePeerColors;
                    y7Var.c(peerColors != null ? null : peerColors.getColor(i14), z10);
                }
            }
            i14 = -1;
            MessagesController.PeerColors peerColors2 = MessagesController.getInstance(y7Var.a).profilePeerColors;
            y7Var.c(peerColors2 != null ? null : peerColors2.getColor(i14), z10);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j10));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    y7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                }
            }
            if (chat != null) {
                y7Var.getClass();
                TLRPC.PeerColor peerColor2 = chat.profile_color;
                if (peerColor2 != null) {
                    i13 = peerColor2.color;
                    MessagesController.PeerColors peerColors3 = MessagesController.getInstance(y7Var.a).profilePeerColors;
                    y7Var.c(peerColors3 != null ? null : peerColors3.getColor(i13), z10);
                }
            }
            i13 = -1;
            MessagesController.PeerColors peerColors32 = MessagesController.getInstance(y7Var.a).profilePeerColors;
            y7Var.c(peerColors32 != null ? null : peerColors32.getColor(i13), z10);
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
                ((s4) arrayList.get(i10)).b.onAttachedToWindow();
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
                ((s4) arrayList.get(i10)).b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N < 0.9f ? this.Q.contains(motionEvent.getX(), motionEvent.getY()) : motionEvent.getX() >= this.f0 && motionEvent.getX() <= this.g0 && Math.abs(motionEvent.getY() - this.h0) < ((float) AndroidUtilities.dp(32.0f));
        r4 r4Var = this.o0;
        if (contains && motionEvent.getAction() == 0) {
            this.p0 = System.currentTimeMillis();
            this.q0 = motionEvent.getX();
            this.r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            AndroidUtilities.runOnUIThread(r4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            if (contains && System.currentTimeMillis() - this.p0 <= ViewConfiguration.getTapTimeout() && ic.a(this.q0, this.r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                h7 h7Var = this.M;
                long j10 = this.d;
                if (h7Var.K(j10) || h7Var.I(j10) || !this.w.isEmpty()) {
                    e(this.n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (y6.I.q()) {
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

    public void e(c cVar) {
    }
}
