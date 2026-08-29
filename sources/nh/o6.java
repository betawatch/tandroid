package nh;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o6 extends View implements o2 {
    public final Paint A;
    public final org.telegram.ui.Components.d6 A0;
    public final Paint B;
    public final org.telegram.ui.Components.d6 B0;
    public final Paint C;
    public final org.telegram.ui.Components.d6 C0;
    public final Matrix D;
    public float D0;
    public final RadialGradient E;
    public final org.telegram.ui.Components.d6 E0;
    public final uc F;
    public final org.telegram.ui.Components.d6 F0;
    public final uc G;
    public final org.telegram.ui.Components.d6 G0;
    public final uc H;
    public final k6 H0;
    public float I;
    public final k6 I0;
    public final org.telegram.ui.Components.d6 J;
    public final Path J0;
    public boolean K;
    public final Path K0;
    public final org.telegram.ui.Components.d6 L;
    public final PointF L0;
    public long M;
    public final PointF M0;
    public long N;
    public final PointF N0;
    public final Path O;
    public final PointF O0;
    public final PointF P;
    public final PointF P0;
    public final PointF Q;
    public final PointF Q0;
    public final PointF R;
    public final PointF R0;
    public final n6 S;
    public final PointF S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public boolean V;
    public boolean W;
    public l6 a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final jq c;
    public float c0;
    public final Drawable d;
    public final org.telegram.ui.Components.d6 d0;
    public final Drawable e;
    public float e0;
    public final Drawable f;
    public float f0;
    public float g0;
    public final Drawable h;
    public float h0;
    public final org.telegram.ui.Components.d6 i0;
    public float j0;
    public boolean k0;
    public final org.telegram.ui.Components.d6 l0;
    public final org.telegram.ui.Components.d6 m0;
    public final Drawable n;
    public boolean n0;
    public final float[] o0;
    public final org.telegram.ui.Components.d6 p0;
    public boolean q0;
    public final Paint r;
    public long r0;
    public final Paint s;
    public boolean s0;
    public boolean t0;
    public float u0;
    public final Paint v;
    public boolean v0;
    public final Paint w;
    public boolean w0;
    public final Paint x;
    public final org.telegram.ui.Components.d6 x0;
    public final Paint y;
    public final org.telegram.ui.Components.d6 y0;
    public final org.telegram.ui.Components.d6 z0;

    public o6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.w = paint3;
        Paint paint4 = new Paint(1);
        this.x = paint4;
        Paint paint5 = new Paint(1);
        this.y = paint5;
        Paint paint6 = new Paint(1);
        this.A = paint6;
        Paint paint7 = new Paint(1);
        this.B = paint7;
        Paint paint8 = new Paint(1);
        this.C = paint8;
        Matrix matrix = new Matrix();
        this.D = matrix;
        this.F = new uc(this);
        this.G = new uc(this);
        this.H = new uc(this);
        jr jrVar = jr.h;
        this.J = new org.telegram.ui.Components.d6(this, 0L, 310L, jrVar);
        this.L = new org.telegram.ui.Components.d6(this, 0L, 330L, jrVar);
        this.O = new Path();
        this.P = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.Q = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.R = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.d0 = new org.telegram.ui.Components.d6(this, 0L, 200L, jr.f);
        this.i0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.j0 = -1.0f;
        this.k0 = true;
        this.l0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.m0 = new org.telegram.ui.Components.d6(this, 0L, 850L, jrVar);
        this.o0 = new float[2];
        this.p0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.x0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.y0 = new org.telegram.ui.Components.d6(this, 0L, 650L, jrVar);
        this.z0 = new org.telegram.ui.Components.d6(this, 0L, 160L, jr.i);
        this.A0 = new org.telegram.ui.Components.d6(this, 0L, 750L, jrVar);
        this.B0 = new org.telegram.ui.Components.d6(this, 0L, 650L, jrVar);
        this.C0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.E0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.F0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.G0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.H0 = new k6(this, 2);
        this.I0 = new k6(this, 3);
        this.J0 = new Path();
        this.K0 = new Path();
        this.L0 = new PointF();
        this.M0 = new PointF();
        this.N0 = new PointF();
        this.O0 = new PointF();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        setWillNotDraw(false);
        n6 n6Var = new n6(this, this);
        this.S = n6Var;
        r0.j0.k(this, n6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        jq jqVar = new jq(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.c = jqVar;
        jqVar.w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        jqVar.e = dp;
        jqVar.f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f9, float f10, double d, float f11, PointF pointF) {
        double d10 = f11;
        pointF.x = (float) ((Math.cos(d) * d10) + f9);
        pointF.y = (float) ((Math.sin(d) * d10) + f10);
    }

    public static void f(Drawable drawable, float f9, float f10) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f9 - max), (int) (f10 - max), (int) (f9 + max), (int) (f10 + max));
    }

    public final boolean b() {
        return this.D0 >= 1.0f;
    }

    public final boolean c(float f9, float f10, float f11, float f12, float f13, boolean z10) {
        return this.n0 ? (!z10 || f12 - f10 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f11 - f9) <= f13 : i7.z5.a(f9, f10, f11, f12) <= f13;
    }

    public final void d(float f9) {
        this.J.g = f9 > 180.0f ? 620L : 310L;
        this.I += f9;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        n6 n6Var = this.S;
        if (n6Var == null || !n6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f9, boolean z10) {
        if (Math.abs(f9 - this.D0) < 0.01f) {
            return;
        }
        this.D0 = f9;
        if (!z10) {
            this.E0.f(f9 > 0.0f && !this.n0, true);
            this.F0.d(f9, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.q0 = false;
        if (!z10) {
            org.telegram.ui.Components.d6 d6Var = this.p0;
            d6Var.getClass();
            d6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        l6 l6Var = this.a;
        ImageReceiver imageReceiver = this.b;
        if (l6Var != null) {
            l6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().w.b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((o7) arrayList2.get(0)).O0 != null) {
                this.b.setImage(ImageLocation.getForPath(((o7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.c, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        MediaController.PhotoEntry photoEntry = (albumEntry == null || (arrayList = albumEntry.photos) == null || arrayList.isEmpty()) ? null : albumEntry.photos.get(0);
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.c, 0L, null, null, 0);
            return;
        }
        if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(this.c);
            return;
        }
        if (photoEntry.isVideo) {
            this.b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.c, 0L, null, null, 0);
            return;
        }
        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        this.b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.c, 0L, null, null, 0);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        char c3;
        float f14;
        float f15;
        Canvas canvas2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        RectF rectF;
        Paint paint;
        float f22;
        RectF rectF2;
        float f23;
        float f24;
        RectF rectF3;
        Canvas canvas3;
        float f25;
        float f26;
        float f27;
        org.telegram.ui.Components.d6 d6Var;
        uc ucVar;
        float f28;
        int i10;
        float f29;
        float f30;
        float f31;
        double d;
        double d10;
        float d11 = this.l0.d(this.n0 ? 1.0f : 0.0f, false);
        float d12 = this.m0.d(this.n0 ? 1.0f : 0.0f, false);
        float f32 = this.j0;
        if (f32 < 0.0f) {
            f32 = this.i0.d(this.k0 ? 1.0f : 0.0f, false);
        }
        float max = Math.max(d11, f32);
        float d13 = this.x0.d(this.s0 ? 1.0f : 0.0f, false);
        float abs = Math.abs(this.u0 - this.e0);
        float dp = AndroidUtilities.dp(64.0f);
        uc ucVar2 = this.F;
        float d14 = this.y0.d((abs >= dp || !(this.n0 || ucVar2.h)) ? 0.0f : 1.0f, false) * d13;
        float d15 = this.z0.d(Math.abs(this.u0 - this.e0) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * d13;
        float clamp = Utilities.clamp((this.u0 - this.e0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.u0 - this.e0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float d16 = this.B0.d(Math.min(Math.abs(this.u0 - this.h0), Math.abs(this.u0 - this.g0)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * d13;
        float f33 = 1.0f - d11;
        float e10 = this.E0.e(this.D0 > 0.0f) * f33;
        float d17 = this.F0.d(this.D0, false);
        float e11 = this.G0.e(b());
        float f34 = this.v0 ? d11 * max * d13 : 0.0f;
        if (f34 > 0.0f) {
            f14 = 1.0f;
            float dp2 = this.e0 - AndroidUtilities.dp(50.0f);
            f15 = 0.0f;
            float dp3 = this.e0 + AndroidUtilities.dp(50.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.A;
            paint2.setStrokeWidth(dp4);
            float dp5 = AndroidUtilities.dp(2.0f);
            Paint paint3 = this.B;
            paint3.setStrokeWidth(dp5);
            f11 = e10;
            float f35 = f34;
            f13 = d12;
            f10 = d16;
            f9 = d15;
            c3 = 1;
            f12 = e11;
            canvas.drawLine(dp3, this.f0, AndroidUtilities.lerp(dp3, this.h0 - AndroidUtilities.dp(30.0f), f34), this.f0, paint3);
            canvas.drawLine(dp3, this.f0, AndroidUtilities.lerp(dp3, this.h0 - AndroidUtilities.dp(30.0f), f35), this.f0, paint2);
            canvas.drawLine(dp2, this.f0, AndroidUtilities.lerp(dp2, this.g0 + AndroidUtilities.dp(30.0f), f35), this.f0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp2, this.f0, AndroidUtilities.lerp(dp2, this.g0 + AndroidUtilities.dp(30.0f), f35), this.f0, paint2);
        } else {
            f9 = d15;
            f10 = d16;
            f11 = e10;
            f12 = e11;
            f13 = d12;
            c3 = 1;
            f14 = 1.0f;
            f15 = 0.0f;
            canvas2 = canvas;
        }
        float f36 = this.e0;
        float lerp = AndroidUtilities.lerp(f36, this.A0.d((AndroidUtilities.dp(4.0f) * clamp) + f36, false), d14);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d11), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d14);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d11), AndroidUtilities.dp(32.0f), d14);
        float lerp4 = AndroidUtilities.lerp(ucVar2.a(this.k0 ? 0.0f : 0.2f), (this.d0.d(this.c0, false) * 0.2f) + f14, d11);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f37 = lerp - lerp2;
        float f38 = this.f0;
        float f39 = lerp + lerp2;
        rectF4.set(f37, f38 - lerp2, f39, f38 + lerp2);
        float f40 = f14 - f12;
        int d18 = i0.a.d(max * f40, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(d18);
        if (f12 > f15) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.e0, this.f0);
            paint4.setAlpha((int) (f40 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f17 = f39;
            f18 = d11;
            f20 = f37;
            f16 = f40;
            f21 = lerp4;
            rectF = rectF4;
            f22 = max;
            f19 = d13;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f16 = f40;
            f17 = f39;
            f18 = d11;
            f19 = d13;
            f20 = f37;
            f21 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f22 = max;
            canvas2.save();
        }
        canvas2.scale(f21, f21, this.e0, this.f0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (f12 > f15) {
            float dp6 = AndroidUtilities.dp(4.0f);
            Paint paint5 = this.C;
            paint5.setStrokeWidth(dp6);
            Path path = this.O;
            path.rewind();
            PointF pointF = this.P;
            f24 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f41 = pointF.x;
            PointF pointF2 = this.Q;
            float f42 = f12 / 0.3f;
            rectF2 = rectF;
            f23 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f41, pointF2.x, Utilities.clamp(f42, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f42, 1.0f, 0.0f)));
            if (f12 > 0.3f) {
                float f43 = pointF2.x;
                PointF pointF3 = this.R;
                float f44 = (f12 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f43, pointF3.x, Utilities.clamp(f44, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f44, 1.0f, 0.0f)));
            }
            canvas2.translate(this.e0, this.f0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f23 = lerp3;
            f24 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f21, 1.0f);
        canvas2.scale(max2, max2, this.e0, this.f0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d14) * AndroidUtilities.dp(5.0f) * f11) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d14) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f11);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f12);
        float f45 = this.e0;
        float f46 = this.f0;
        RectF rectF5 = rectF2;
        rectF5.set(f45 - lerp6, f46 - lerp6, f45 + lerp6, f46 + lerp6);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f11) * 255.0f * f16));
        canvas2.drawCircle(this.e0, this.f0, lerp6, paint6);
        if ((d17 > 0.0f) && ((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d17 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.M;
        float f47 = this.n0 ? 0.0f : 1.0f - f13;
        long j10 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float e12 = this.p0.e(this.q0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e12 * f24, 1.0f - f47) * 255.0f));
        if (e12 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            np.a(this.o0, (SystemClock.elapsedRealtime() - this.r0) % 5400);
            invalidate();
            float[] fArr = this.o0;
            float f48 = fArr[0];
            float f49 = fArr[c3];
            float f50 = (f48 + f49) / 2.0f;
            float abs2 = Math.abs(f49 - f48) / 2.0f;
            if (this.q0) {
                float f51 = min / 2.0f;
                f50 = AndroidUtilities.lerp((-90.0f) + f51, f50, e12);
                abs2 = AndroidUtilities.lerp(f51, abs2, e12);
            }
            float f52 = f50 - abs2;
            float f53 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f52, f53, false, paint7);
        }
        if (this.n0) {
            invalidate();
            long j11 = currentTimeMillis / 1000;
            if (j11 != this.N / 1000) {
                ((ca) this.a).a.F0.a(j11, true);
            }
            if (j10 > 0 && currentTimeMillis >= j10) {
                post(new k6(this, 0));
            }
            this.N = currentTimeMillis;
        }
        canvas3.restore();
        boolean z10 = this.w0;
        uc ucVar3 = this.H;
        if (z10) {
            float a2 = ucVar3.a(0.2f) * f18;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.g0, this.f0);
                canvas3.drawCircle(this.g0, this.f0, AndroidUtilities.dp(22.0f), this.w);
                canvas3.rotate(-getRotation(), this.g0, this.f0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = ucVar3.a(0.2f) * f33 * f16;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.g0, this.f0);
            canvas3.rotate(-getRotation(), this.g0, this.f0);
            this.b.draw(canvas3);
            canvas3.restore();
        }
        float d19 = this.L.d(this.K ? 1.0f : 0.0f, false);
        Paint paint8 = this.x;
        org.telegram.ui.Components.d6 d6Var2 = this.J;
        uc ucVar4 = this.G;
        if (d19 > 0.0f) {
            canvas3.save();
            float a11 = ucVar4.a(0.2f) * d19 * f16;
            canvas3.scale(a11, a11, this.h0, this.f0);
            canvas3.rotate(d6Var2.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d19 < 1.0f) {
            canvas3.save();
            f25 = f16;
            float y8 = org.telegram.messenger.x3.y(1.0f, d19, ucVar4.a(0.2f), f25);
            canvas3.scale(y8, y8, this.h0, this.f0);
            canvas3.rotate(d6Var2.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(22.0f), this.w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f25 = f16;
        }
        if (!this.v0 || b()) {
            f26 = 0.0f;
        } else {
            float f54 = f10;
            f26 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f54), Math.max(f54, d14)) * f19 * f22 * f18;
        }
        float d20 = this.C0.d((this.v0 || !this.n0) ? 0.0f : 1.0f, false);
        int i11 = (f26 > 0.0f ? 1 : (f26 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            Paint paint9 = this.y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.u0, this.f0, f26, paint9);
            float f55 = this.u0;
            float abs3 = 1.0f - ((Math.abs(clamp2) * f19) / 1.3f);
            f30 = 22.0f;
            float clamp3 = Utilities.clamp(abs3, 1.0f, 0.0f);
            float abs4 = Math.abs(lerp - f55);
            if (abs4 >= lerp2 + (f26 * 2.0f) || clamp3 >= 0.6f) {
                f27 = f26;
                d6Var = d6Var2;
                ucVar = ucVar4;
                f28 = d20;
                i10 = i11;
                f29 = f25;
            } else {
                float f56 = lerp2 + f26;
                if (abs4 < f56) {
                    float f57 = lerp2 * lerp2;
                    float f58 = abs4 * abs4;
                    float f59 = f26 * f26;
                    f31 = f26;
                    f28 = d20;
                    i10 = i11;
                    double acos = Math.acos(((f57 + f58) - f59) / ((lerp2 * 2.0f) * abs4));
                    d10 = Math.acos(((f59 + f58) - f57) / (r15 * abs4));
                    d = acos;
                } else {
                    f31 = f26;
                    f28 = d20;
                    i10 = i11;
                    d = 0.0d;
                    d10 = 0.0d;
                }
                double d21 = f55 > lerp ? 0.0d : 3.141592653589793d;
                double d22 = d;
                double acos2 = (float) Math.acos((lerp2 - f31) / abs4);
                double d23 = acos2 - d22;
                double d24 = clamp3;
                double d25 = d23 * d24;
                double d26 = d21 + d22 + d25;
                double d27 = (d21 - d22) - d25;
                double d28 = ((3.141592653589793d - d10) - acos2) * d24;
                double d29 = ((d21 + 3.141592653589793d) - d10) - d28;
                double d30 = (d21 - 3.141592653589793d) + d10 + d28;
                float f60 = this.f0;
                PointF pointF4 = this.L0;
                a(lerp, f60, d26, lerp2, pointF4);
                float f61 = this.f0;
                PointF pointF5 = this.M0;
                a(lerp, f61, d27, lerp2, pointF5);
                float f62 = this.f0;
                PointF pointF6 = this.N0;
                float f63 = f31;
                a(f55, f62, d29, f63, pointF6);
                float f64 = this.f0;
                PointF pointF7 = this.O0;
                a(f55, f64, d30, f63, pointF7);
                f27 = f63;
                f29 = f25;
                d6Var = d6Var2;
                ucVar = ucVar4;
                float min2 = Math.min(1.0f, (abs4 * 2.0f) / f56) * Math.min(clamp3 * 2.4f, i7.z5.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f56);
                float f65 = lerp2 * min2;
                float f66 = f27 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f65, this.P0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f65, this.Q0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f66, this.R0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f66, this.S0);
                float f67 = f18;
                float C = com.google.android.recaptcha.internal.a.C(f19, f22, f67, f9);
                if (C > 0.0f) {
                    Path path2 = this.J0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.P0;
                    float f68 = pointF8.x;
                    float f69 = pointF8.y;
                    f18 = f67;
                    PointF pointF9 = this.R0;
                    path2.cubicTo(f68, f69, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.S0;
                    float f70 = pointF10.x;
                    float f71 = pointF10.y;
                    PointF pointF11 = this.Q0;
                    path2.cubicTo(f70, f71, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f72 = this.f0;
                    rectF3.set(f20, f72 - lerp2, f17, f72 + lerp2);
                    float f73 = f23;
                    canvas3.drawRoundRect(rectF3, f73, f73, paint9);
                } else {
                    f18 = f67;
                }
            }
        } else {
            f27 = f26;
            d6Var = d6Var2;
            ucVar = ucVar4;
            f28 = d20;
            i10 = i11;
            f29 = f25;
            f30 = 22.0f;
        }
        if (i10 > 0 || f28 > 0.0f) {
            float a12 = ucVar3.a(0.2f) * f18 * f29;
            canvas3.save();
            Path path3 = this.K0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.u0, this.f0, f27, Path.Direction.CW);
            }
            if (f28 > 0.0f && this.w0) {
                path3.addCircle(this.g0, this.f0, f28 * AndroidUtilities.dp(f30) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.w0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.g0, this.f0);
                canvas3.drawCircle(this.g0, this.f0, AndroidUtilities.dp(f30), paint8);
                canvas3.rotate(-getRotation(), this.g0, this.f0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = ucVar.a(0.2f) * f29;
            canvas3.save();
            canvas3.scale(a13, a13, this.h0, this.f0);
            canvas3.rotate(d6Var.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(f30), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        n6 n6Var = this.S;
        if (n6Var == null) {
            return;
        }
        boolean b10 = b();
        boolean z11 = this.T;
        boolean z12 = this.n0;
        if (z11 == z12 && this.U == b10 && this.V == this.K && this.W == this.k0 && this.a0 == this.q0 && this.b0 == this.w0) {
            return;
        }
        this.T = z12;
        this.U = b10;
        this.V = this.K;
        this.W = this.k0;
        this.a0 = this.q0;
        this.b0 = this.w0;
        n6Var.i();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f9 = size;
        this.e0 = f9 / 2.0f;
        this.f0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f9 * 0.35f);
        float f10 = this.e0;
        this.g0 = f10 - min;
        float f11 = f10 + min;
        this.h0 = f11;
        float f12 = this.f0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.h0;
        float f14 = this.f0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f, this.g0, this.f0);
        f(this.h, this.g0, this.f0);
        f(this.n, this.g0, this.f0);
        this.b.setImageCoords(this.g0 - AndroidUtilities.dp(20.0f), this.f0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.D;
        matrix.reset();
        matrix.postTranslate(this.e0, this.f0);
        this.E.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        n6 n6Var = this.S;
        if (n6Var != null) {
            n6Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.h0, this.g0);
        float y8 = motionEvent.getY() + 0.0f;
        boolean c3 = c(clamp, y8, this.h0, this.f0, AndroidUtilities.dp(7.0f), true);
        boolean z10 = this.q0;
        uc ucVar = this.H;
        uc ucVar2 = this.F;
        uc ucVar3 = this.G;
        boolean z11 = true;
        if (z10) {
            ucVar2.c(false);
            ucVar3.c(false);
            ucVar.c(false);
        } else if (action == 0 || this.s0) {
            ucVar2.c(c(clamp, y8, this.e0, this.f0, AndroidUtilities.dp(60.0f), false));
            ucVar3.c(c(clamp, y8, this.h0, this.f0, (float) AndroidUtilities.dp(30.0f), true) && !b());
            ucVar.c(c(clamp, y8, this.g0, this.f0, (float) AndroidUtilities.dp(30.0f), false) && !b());
        }
        k6 k6Var = this.I0;
        k6 k6Var2 = this.H0;
        if (action == 0) {
            this.s0 = true;
            this.t0 = ucVar2.h || ucVar3.h;
            System.currentTimeMillis();
            this.u0 = clamp;
            if (Math.abs(clamp - this.e0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(k6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (ucVar3.h) {
                AndroidUtilities.runOnUIThread(k6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.s0) {
                    this.u0 = Utilities.clamp(clamp, this.h0, this.g0);
                    invalidate();
                    if (this.n0 && !this.T0 && c3) {
                        d(180.0f);
                        ((ca) this.a).b();
                    }
                    if (this.n0 && this.v0) {
                        float clamp2 = Utilities.clamp(((this.f0 - AndroidUtilities.dp(48.0f)) - y8) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        gb gbVar = ((ca) this.a).a;
                        gbVar.R0.b(clamp2, true);
                        gbVar.j0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.s0) {
                    this.s0 = false;
                    this.t0 = false;
                    AndroidUtilities.cancelRunOnUIThread(k6Var2);
                    AndroidUtilities.cancelRunOnUIThread(k6Var);
                    boolean z12 = this.n0;
                    if (!z12 && ucVar.h) {
                        gb gbVar2 = ((ca) this.a).a;
                        if (gbVar2.b0 == 0 && !gbVar2.L1 && !gbVar2.M1 && gb.b(gbVar2)) {
                            gbVar2.f(true);
                        }
                    } else if (z12 && this.v0) {
                        if (ucVar.h) {
                            this.v0 = false;
                            this.C0.d(1.0f, true);
                            s3 s3Var = ((ca) this.a).a.P0;
                            s3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            s3Var.invalidate();
                        } else {
                            this.n0 = false;
                            this.r0 = SystemClock.elapsedRealtime();
                            this.q0 = true;
                            ((ca) this.a).d(false);
                        }
                    } else if (ucVar2.h) {
                        if (b()) {
                            ((ca) this.a).a();
                        } else if (!this.k0 && !this.n0 && !this.v0) {
                            ((ca) this.a).c();
                        } else if (this.n0) {
                            this.n0 = false;
                            this.r0 = SystemClock.elapsedRealtime();
                            this.q0 = true;
                            ((ca) this.a).d(false);
                        } else if (gb.d(((ca) this.a).a)) {
                            this.N = 0L;
                            this.M = System.currentTimeMillis();
                            this.w0 = false;
                            ((ca) this.a).e(new k6(this, 1), false);
                        }
                    }
                    this.v0 = false;
                    if (ucVar3.h) {
                        d(180.0f);
                        ((ca) this.a).b();
                    }
                    ucVar2.c(false);
                    ucVar3.c(false);
                    ucVar.c(false);
                    invalidate();
                }
                return false;
            }
            z11 = false;
        }
        this.T0 = c3;
        return z11;
    }

    public void setDelegate(l6 l6Var) {
        this.a = l6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            invalidate();
        }
    }

    @Override // nh.o2
    public void setInvert(float f9) {
        this.s.setColor(i0.a.d(f9, -1, -16777216));
        this.w.setColor(i0.a.d(f9, 1677721600, 369098752));
        this.A.setColor(i0.a.d(f9, 1493172223, 285212671));
        this.B.setColor(i0.a.d(f9, 402653184, 805306368));
        int d = i0.a.d(f9, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), mode));
    }
}
