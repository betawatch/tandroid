package di;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class l7 extends View implements x2 {
    public boolean A0;
    public final org.telegram.ui.Components.e6 B0;
    public final org.telegram.ui.Components.e6 C0;
    public final org.telegram.ui.Components.e6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.e6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.e6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.e6 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.e6 I0;
    public final org.telegram.ui.Components.zc J;
    public final org.telegram.ui.Components.e6 J0;
    public final org.telegram.ui.Components.zc K;
    public final org.telegram.ui.Components.e6 K0;
    public final org.telegram.ui.Components.zc L;
    public final i7 L0;
    public float M;
    public final i7 M0;
    public final org.telegram.ui.Components.e6 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.e6 P;
    public final PointF P0;
    public long Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public final Path S;
    public final PointF S0;
    public final PointF T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final k7 W;
    public final PointF W0;
    public boolean X0;
    public j7 a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final oq c;
    public boolean c0;
    public final Drawable d;
    public boolean d0;
    public final Drawable e;
    public boolean e0;
    public final Drawable f;
    public boolean f0;
    public float g0;
    public final Drawable h;
    public final org.telegram.ui.Components.e6 h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public final org.telegram.ui.Components.e6 m0;
    public final Drawable n;
    public float n0;
    public boolean o0;
    public final org.telegram.ui.Components.e6 p0;
    public final org.telegram.ui.Components.e6 q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public final float[] s0;
    public final org.telegram.ui.Components.e6 t0;
    public boolean u0;
    public final Paint v;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public float y0;
    public boolean z0;

    public l7(Activity activity) {
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
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new org.telegram.ui.Components.zc(this);
        this.K = new org.telegram.ui.Components.zc(this);
        this.L = new org.telegram.ui.Components.zc(this);
        pr prVar = pr.h;
        this.N = new org.telegram.ui.Components.e6(this, 0L, 310L, prVar);
        this.P = new org.telegram.ui.Components.e6(this, 0L, 330L, prVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.h0 = new org.telegram.ui.Components.e6(this, 0L, 200L, pr.f);
        this.m0 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.n0 = -1.0f;
        this.o0 = true;
        this.p0 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.q0 = new org.telegram.ui.Components.e6(this, 0L, 850L, prVar);
        this.s0 = new float[2];
        this.t0 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.B0 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.C0 = new org.telegram.ui.Components.e6(this, 0L, 650L, prVar);
        this.D0 = new org.telegram.ui.Components.e6(this, 0L, 160L, pr.i);
        this.E0 = new org.telegram.ui.Components.e6(this, 0L, 750L, prVar);
        this.F0 = new org.telegram.ui.Components.e6(this, 0L, 650L, prVar);
        this.G0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.I0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.J0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.K0 = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.L0 = new i7(this, 2);
        this.M0 = new i7(this, 3);
        this.N0 = new Path();
        this.O0 = new Path();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        setWillNotDraw(false);
        k7 k7Var = new k7(this, this);
        this.W = k7Var;
        r0.i0.k(this, k7Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.I = radialGradient;
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
        oq oqVar = new oq(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.c = oqVar;
        oqVar.w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        oqVar.e = dp;
        oqVar.f = dp2;
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

    public static void a(float f7, float f10, double d, float f11, PointF pointF) {
        double d10 = f11;
        pointF.x = (float) ((Math.cos(d) * d10) + f7);
        pointF.y = (float) ((Math.sin(d) * d10) + f10);
    }

    public static void f(Drawable drawable, float f7, float f10) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f7 - max), (int) (f10 - max), (int) (f7 + max), (int) (f10 + max));
    }

    public final boolean b() {
        return this.H0 >= 1.0f;
    }

    public final boolean c(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        return this.r0 ? (!z10 || f12 - f10 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f11 - f7) <= f13 : v7.z6.a(f7, f10, f11, f12) <= f13;
    }

    public final void d(float f7) {
        this.N.g = f7 > 180.0f ? 620L : 310L;
        this.M += f7;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        k7 k7Var = this.W;
        if (k7Var == null || !k7Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f7, boolean z10) {
        if (Math.abs(f7 - this.H0) < 0.01f) {
            return;
        }
        this.H0 = f7;
        if (!z10) {
            this.I0.f(f7 > 0.0f && !this.r0, true);
            this.J0.d(f7, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.u0 = false;
        if (!z10) {
            org.telegram.ui.Components.e6 e6Var = this.t0;
            e6Var.getClass();
            e6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        j7 j7Var = this.a;
        ImageReceiver imageReceiver = this.b;
        if (j7Var != null) {
            j7Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().w.b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((o8) arrayList2.get(0)).O0 != null) {
                this.b.setImage(ImageLocation.getForPath(((o8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.c, 0L, null, null, 0);
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
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        char c10;
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
        org.telegram.ui.Components.e6 e6Var;
        org.telegram.ui.Components.zc zcVar;
        float f28;
        int i10;
        float f29;
        float f30;
        float f31;
        double d;
        double d10;
        float d11 = this.p0.d(this.r0 ? 1.0f : 0.0f, false);
        float d12 = this.q0.d(this.r0 ? 1.0f : 0.0f, false);
        float f32 = this.n0;
        if (f32 < 0.0f) {
            f32 = this.m0.d(this.o0 ? 1.0f : 0.0f, false);
        }
        float max = Math.max(d11, f32);
        float d13 = this.B0.d(this.w0 ? 1.0f : 0.0f, false);
        float abs = Math.abs(this.y0 - this.i0);
        float dp = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.zc zcVar2 = this.J;
        float d14 = this.C0.d((abs >= dp || !(this.r0 || zcVar2.h)) ? 0.0f : 1.0f, false) * d13;
        float d15 = this.D0.d(Math.abs(this.y0 - this.i0) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * d13;
        float clamp = Utilities.clamp((this.y0 - this.i0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.y0 - this.i0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float d16 = this.F0.d(Math.min(Math.abs(this.y0 - this.l0), Math.abs(this.y0 - this.k0)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * d13;
        float f33 = 1.0f - d11;
        float e7 = this.I0.e(this.H0 > 0.0f) * f33;
        float d17 = this.J0.d(this.H0, false);
        float e10 = this.K0.e(b());
        float f34 = this.z0 ? d11 * max * d13 : 0.0f;
        if (f34 > 0.0f) {
            f14 = 1.0f;
            float dp2 = this.i0 - AndroidUtilities.dp(50.0f);
            f15 = 0.0f;
            float dp3 = this.i0 + AndroidUtilities.dp(50.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.E;
            paint2.setStrokeWidth(dp4);
            float dp5 = AndroidUtilities.dp(2.0f);
            Paint paint3 = this.F;
            paint3.setStrokeWidth(dp5);
            f11 = e7;
            float f35 = f34;
            f13 = d12;
            f10 = d16;
            f7 = d15;
            c10 = 1;
            f12 = e10;
            canvas.drawLine(dp3, this.j0, AndroidUtilities.lerp(dp3, this.l0 - AndroidUtilities.dp(30.0f), f34), this.j0, paint3);
            canvas.drawLine(dp3, this.j0, AndroidUtilities.lerp(dp3, this.l0 - AndroidUtilities.dp(30.0f), f35), this.j0, paint2);
            canvas.drawLine(dp2, this.j0, AndroidUtilities.lerp(dp2, this.k0 + AndroidUtilities.dp(30.0f), f35), this.j0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp2, this.j0, AndroidUtilities.lerp(dp2, this.k0 + AndroidUtilities.dp(30.0f), f35), this.j0, paint2);
        } else {
            f7 = d15;
            f10 = d16;
            f11 = e7;
            f12 = e10;
            f13 = d12;
            c10 = 1;
            f14 = 1.0f;
            f15 = 0.0f;
            canvas2 = canvas;
        }
        float f36 = this.i0;
        float lerp = AndroidUtilities.lerp(f36, this.E0.d((AndroidUtilities.dp(4.0f) * clamp) + f36, false), d14);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d11), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d14);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d11), AndroidUtilities.dp(32.0f), d14);
        float lerp4 = AndroidUtilities.lerp(zcVar2.a(this.o0 ? 0.0f : 0.2f), (this.h0.d(this.g0, false) * 0.2f) + f14, d11);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f37 = lerp - lerp2;
        float f38 = this.j0;
        float f39 = lerp + lerp2;
        rectF4.set(f37, f38 - lerp2, f39, f38 + lerp2);
        float f40 = f14 - f12;
        int d18 = i0.a.d(max * f40, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(d18);
        if (f12 > f15) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.i0, this.j0);
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
        canvas2.scale(f21, f21, this.i0, this.j0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (f12 > f15) {
            float dp6 = AndroidUtilities.dp(4.0f);
            Paint paint5 = this.G;
            paint5.setStrokeWidth(dp6);
            Path path = this.S;
            path.rewind();
            PointF pointF = this.T;
            f24 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f41 = pointF.x;
            PointF pointF2 = this.U;
            float f42 = f12 / 0.3f;
            rectF2 = rectF;
            f23 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f41, pointF2.x, Utilities.clamp(f42, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f42, 1.0f, 0.0f)));
            if (f12 > 0.3f) {
                float f43 = pointF2.x;
                PointF pointF3 = this.V;
                float f44 = (f12 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f43, pointF3.x, Utilities.clamp(f44, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f44, 1.0f, 0.0f)));
            }
            canvas2.translate(this.i0, this.j0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f23 = lerp3;
            f24 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f21, 1.0f);
        canvas2.scale(max2, max2, this.i0, this.j0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d14) * AndroidUtilities.dp(5.0f) * f11) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d14) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f11);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f12);
        float f45 = this.i0;
        float f46 = this.j0;
        RectF rectF5 = rectF2;
        rectF5.set(f45 - lerp6, f46 - lerp6, f45 + lerp6, f46 + lerp6);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f11) * 255.0f * f16));
        canvas2.drawCircle(this.i0, this.j0, lerp6, paint6);
        if ((d17 > 0.0f) && ((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d17 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.Q;
        float f47 = this.r0 ? 0.0f : 1.0f - f13;
        long j3 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float e11 = this.t0.e(this.u0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e11 * f24, 1.0f - f47) * 255.0f));
        if (e11 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            sp.a(this.s0, (SystemClock.elapsedRealtime() - this.v0) % 5400);
            invalidate();
            float[] fArr = this.s0;
            float f48 = fArr[0];
            float f49 = fArr[c10];
            float f50 = (f48 + f49) / 2.0f;
            float abs2 = Math.abs(f49 - f48) / 2.0f;
            if (this.u0) {
                float f51 = min / 2.0f;
                f50 = AndroidUtilities.lerp((-90.0f) + f51, f50, e11);
                abs2 = AndroidUtilities.lerp(f51, abs2, e11);
            }
            float f52 = f50 - abs2;
            float f53 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f52, f53, false, paint7);
        }
        if (this.r0) {
            invalidate();
            long j10 = currentTimeMillis / 1000;
            if (j10 != this.R / 1000) {
                ((jb) this.a).a.J0.a(j10, true);
            }
            if (j3 > 0 && currentTimeMillis >= j3) {
                post(new i7(this, 0));
            }
            this.R = currentTimeMillis;
        }
        canvas3.restore();
        boolean z10 = this.A0;
        org.telegram.ui.Components.zc zcVar3 = this.L;
        if (z10) {
            float a2 = zcVar3.a(0.2f) * f18;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.k0, this.j0);
                canvas3.drawCircle(this.k0, this.j0, AndroidUtilities.dp(22.0f), this.w);
                canvas3.rotate(-getRotation(), this.k0, this.j0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = zcVar3.a(0.2f) * f33 * f16;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.k0, this.j0);
            canvas3.rotate(-getRotation(), this.k0, this.j0);
            this.b.draw(canvas3);
            canvas3.restore();
        }
        float d19 = this.P.d(this.O ? 1.0f : 0.0f, false);
        Paint paint8 = this.x;
        org.telegram.ui.Components.e6 e6Var2 = this.N;
        org.telegram.ui.Components.zc zcVar4 = this.K;
        if (d19 > 0.0f) {
            canvas3.save();
            float a11 = zcVar4.a(0.2f) * d19 * f16;
            canvas3.scale(a11, a11, this.l0, this.j0);
            canvas3.rotate(e6Var2.d(this.M, false) - getRotation(), this.l0, this.j0);
            canvas3.drawCircle(this.l0, this.j0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d19 < 1.0f) {
            canvas3.save();
            f25 = f16;
            float A = org.telegram.messenger.w1.A(1.0f, d19, zcVar4.a(0.2f), f25);
            canvas3.scale(A, A, this.l0, this.j0);
            canvas3.rotate(e6Var2.d(this.M, false) - getRotation(), this.l0, this.j0);
            canvas3.drawCircle(this.l0, this.j0, AndroidUtilities.dp(22.0f), this.w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f25 = f16;
        }
        if (!this.z0 || b()) {
            f26 = 0.0f;
        } else {
            float f54 = f10;
            f26 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f54), Math.max(f54, d14)) * f19 * f22 * f18;
        }
        float d20 = this.G0.d((this.z0 || !this.r0) ? 0.0f : 1.0f, false);
        int i11 = (f26 > 0.0f ? 1 : (f26 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            Paint paint9 = this.y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.y0, this.j0, f26, paint9);
            float f55 = this.y0;
            float abs3 = 1.0f - ((Math.abs(clamp2) * f19) / 1.3f);
            f30 = 22.0f;
            float clamp3 = Utilities.clamp(abs3, 1.0f, 0.0f);
            float abs4 = Math.abs(lerp - f55);
            if (abs4 >= lerp2 + (f26 * 2.0f) || clamp3 >= 0.6f) {
                f27 = f26;
                e6Var = e6Var2;
                zcVar = zcVar4;
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
                float f60 = this.j0;
                PointF pointF4 = this.P0;
                a(lerp, f60, d26, lerp2, pointF4);
                float f61 = this.j0;
                PointF pointF5 = this.Q0;
                a(lerp, f61, d27, lerp2, pointF5);
                float f62 = this.j0;
                PointF pointF6 = this.R0;
                float f63 = f31;
                a(f55, f62, d29, f63, pointF6);
                float f64 = this.j0;
                PointF pointF7 = this.S0;
                a(f55, f64, d30, f63, pointF7);
                f27 = f63;
                f29 = f25;
                e6Var = e6Var2;
                zcVar = zcVar4;
                float min2 = Math.min(1.0f, (abs4 * 2.0f) / f56) * Math.min(clamp3 * 2.4f, v7.z6.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f56);
                float f65 = lerp2 * min2;
                float f66 = f27 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f65, this.T0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f65, this.U0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f66, this.V0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f66, this.W0);
                float f67 = f18;
                float C = com.google.android.gms.internal.vision.e2.C(f19, f22, f67, f7);
                if (C > 0.0f) {
                    Path path2 = this.N0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.T0;
                    float f68 = pointF8.x;
                    float f69 = pointF8.y;
                    f18 = f67;
                    PointF pointF9 = this.V0;
                    path2.cubicTo(f68, f69, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.W0;
                    float f70 = pointF10.x;
                    float f71 = pointF10.y;
                    PointF pointF11 = this.U0;
                    path2.cubicTo(f70, f71, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f72 = this.j0;
                    rectF3.set(f20, f72 - lerp2, f17, f72 + lerp2);
                    float f73 = f23;
                    canvas3.drawRoundRect(rectF3, f73, f73, paint9);
                } else {
                    f18 = f67;
                }
            }
        } else {
            f27 = f26;
            e6Var = e6Var2;
            zcVar = zcVar4;
            f28 = d20;
            i10 = i11;
            f29 = f25;
            f30 = 22.0f;
        }
        if (i10 > 0 || f28 > 0.0f) {
            float a12 = zcVar3.a(0.2f) * f18 * f29;
            canvas3.save();
            Path path3 = this.O0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.y0, this.j0, f27, Path.Direction.CW);
            }
            if (f28 > 0.0f && this.A0) {
                path3.addCircle(this.k0, this.j0, f28 * AndroidUtilities.dp(f30) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.A0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.k0, this.j0);
                canvas3.drawCircle(this.k0, this.j0, AndroidUtilities.dp(f30), paint8);
                canvas3.rotate(-getRotation(), this.k0, this.j0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = zcVar.a(0.2f) * f29;
            canvas3.save();
            canvas3.scale(a13, a13, this.l0, this.j0);
            canvas3.rotate(e6Var.d(this.M, false) - getRotation(), this.l0, this.j0);
            canvas3.drawCircle(this.l0, this.j0, AndroidUtilities.dp(f30), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        k7 k7Var = this.W;
        if (k7Var == null) {
            return;
        }
        boolean b10 = b();
        boolean z11 = this.a0;
        boolean z12 = this.r0;
        if (z11 == z12 && this.b0 == b10 && this.c0 == this.O && this.d0 == this.o0 && this.e0 == this.u0 && this.f0 == this.A0) {
            return;
        }
        this.a0 = z12;
        this.b0 = b10;
        this.c0 = this.O;
        this.d0 = this.o0;
        this.e0 = this.u0;
        this.f0 = this.A0;
        k7Var.i();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.i0 = f7 / 2.0f;
        this.j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.i0;
        this.k0 = f10 - min;
        float f11 = f10 + min;
        this.l0 = f11;
        float f12 = this.j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.l0;
        float f14 = this.j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f, this.k0, this.j0);
        f(this.h, this.k0, this.j0);
        f(this.n, this.k0, this.j0);
        this.b.setImageCoords(this.k0 - AndroidUtilities.dp(20.0f), this.j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.i0, this.j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        k7 k7Var = this.W;
        if (k7Var != null) {
            k7Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.l0, this.k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.l0, this.j0, AndroidUtilities.dp(7.0f), true);
        boolean z10 = this.u0;
        org.telegram.ui.Components.zc zcVar = this.L;
        org.telegram.ui.Components.zc zcVar2 = this.J;
        org.telegram.ui.Components.zc zcVar3 = this.K;
        boolean z11 = true;
        if (z10) {
            zcVar2.c(false);
            zcVar3.c(false);
            zcVar.c(false);
        } else if (action == 0 || this.w0) {
            zcVar2.c(c(clamp, y3, this.i0, this.j0, AndroidUtilities.dp(60.0f), false));
            zcVar3.c(c(clamp, y3, this.l0, this.j0, (float) AndroidUtilities.dp(30.0f), true) && !b());
            zcVar.c(c(clamp, y3, this.k0, this.j0, (float) AndroidUtilities.dp(30.0f), false) && !b());
        }
        i7 i7Var = this.M0;
        i7 i7Var2 = this.L0;
        if (action == 0) {
            this.w0 = true;
            this.x0 = zcVar2.h || zcVar3.h;
            System.currentTimeMillis();
            this.y0 = clamp;
            if (Math.abs(clamp - this.i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(i7Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (zcVar3.h) {
                AndroidUtilities.runOnUIThread(i7Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.w0) {
                    this.y0 = Utilities.clamp(clamp, this.l0, this.k0);
                    invalidate();
                    if (this.r0 && !this.X0 && c10) {
                        d(180.0f);
                        ((jb) this.a).b();
                    }
                    if (this.r0 && this.z0) {
                        float clamp2 = Utilities.clamp(((this.j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        pc pcVar = ((jb) this.a).a;
                        pcVar.V0.b(clamp2, true);
                        pcVar.j0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.w0) {
                    this.w0 = false;
                    this.x0 = false;
                    AndroidUtilities.cancelRunOnUIThread(i7Var2);
                    AndroidUtilities.cancelRunOnUIThread(i7Var);
                    boolean z12 = this.r0;
                    if (!z12 && zcVar.h) {
                        pc pcVar2 = ((jb) this.a).a;
                        if (pcVar2.f0 == 0 && !pcVar2.P1 && !pcVar2.Q1 && pc.b(pcVar2)) {
                            pcVar2.f(true);
                        }
                    } else if (z12 && this.z0) {
                        if (zcVar.h) {
                            this.z0 = false;
                            this.G0.d(1.0f, true);
                            c4 c4Var = ((jb) this.a).a.T0;
                            c4Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            c4Var.invalidate();
                        } else {
                            this.r0 = false;
                            this.v0 = SystemClock.elapsedRealtime();
                            this.u0 = true;
                            ((jb) this.a).d(false);
                        }
                    } else if (zcVar2.h) {
                        if (b()) {
                            ((jb) this.a).a();
                        } else if (!this.o0 && !this.r0 && !this.z0) {
                            ((jb) this.a).c();
                        } else if (this.r0) {
                            this.r0 = false;
                            this.v0 = SystemClock.elapsedRealtime();
                            this.u0 = true;
                            ((jb) this.a).d(false);
                        } else if (pc.d(((jb) this.a).a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((jb) this.a).e(new i7(this, 1), false);
                        }
                    }
                    this.z0 = false;
                    if (zcVar3.h) {
                        d(180.0f);
                        ((jb) this.a).b();
                    }
                    zcVar2.c(false);
                    zcVar3.c(false);
                    zcVar.c(false);
                    invalidate();
                }
                return false;
            }
            z11 = false;
        }
        this.X0 = c10;
        return z11;
    }

    public void setDelegate(j7 j7Var) {
        this.a = j7Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override // di.x2
    public void setInvert(float f7) {
        this.s.setColor(i0.a.d(f7, -1, -16777216));
        this.w.setColor(i0.a.d(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.d(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.d(f7, 402653184, 805306368));
        int d = i0.a.d(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), mode));
    }
}
