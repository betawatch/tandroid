package kh;

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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class z6 extends View implements r2 {
    public final Paint A;
    public final org.telegram.ui.Components.y5 A0;
    public final Paint B;
    public final org.telegram.ui.Components.y5 B0;
    public final Paint C;
    public final org.telegram.ui.Components.y5 C0;
    public final Matrix D;
    public float D0;
    public final RadialGradient E;
    public final org.telegram.ui.Components.y5 E0;
    public final org.telegram.ui.Components.pc F;
    public final org.telegram.ui.Components.y5 F0;
    public final org.telegram.ui.Components.pc G;
    public final org.telegram.ui.Components.y5 G0;
    public final org.telegram.ui.Components.pc H;
    public final w6 H0;
    public float I;
    public final w6 I0;
    public final org.telegram.ui.Components.y5 J;
    public final Path J0;
    public boolean K;
    public final Path K0;
    public final org.telegram.ui.Components.y5 L;
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
    public final y6 S;
    public final PointF S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public boolean V;
    public boolean W;
    public x6 a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final fq c;
    public float c0;
    public final Drawable d;
    public final org.telegram.ui.Components.y5 d0;
    public final Drawable e;
    public float e0;
    public final Drawable f;
    public float f0;
    public float g0;
    public final Drawable h;
    public float h0;
    public final org.telegram.ui.Components.y5 i0;
    public float j0;
    public boolean k0;
    public final org.telegram.ui.Components.y5 l0;
    public final org.telegram.ui.Components.y5 m0;
    public final Drawable n;
    public boolean n0;
    public final float[] o0;
    public final org.telegram.ui.Components.y5 p0;
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
    public final org.telegram.ui.Components.y5 x0;
    public final Paint y;
    public final org.telegram.ui.Components.y5 y0;
    public final org.telegram.ui.Components.y5 z0;

    public z6(Activity activity) {
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
        this.F = new org.telegram.ui.Components.pc(this);
        this.G = new org.telegram.ui.Components.pc(this);
        this.H = new org.telegram.ui.Components.pc(this);
        gr grVar = gr.h;
        this.J = new org.telegram.ui.Components.y5(this, 0L, 310L, grVar);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 330L, grVar);
        this.O = new Path();
        this.P = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.Q = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.R = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.d0 = new org.telegram.ui.Components.y5(this, 0L, 200L, gr.f);
        this.i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.j0 = -1.0f;
        this.k0 = true;
        this.l0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 850L, grVar);
        this.o0 = new float[2];
        this.p0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.x0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.y0 = new org.telegram.ui.Components.y5(this, 0L, 650L, grVar);
        this.z0 = new org.telegram.ui.Components.y5(this, 0L, 160L, gr.i);
        this.A0 = new org.telegram.ui.Components.y5(this, 0L, 750L, grVar);
        this.B0 = new org.telegram.ui.Components.y5(this, 0L, 650L, grVar);
        this.C0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.E0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.F0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.G0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.H0 = new w6(this, 2);
        this.I0 = new w6(this, 3);
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
        y6 y6Var = new y6(this, this);
        this.S = y6Var;
        r0.j0.k(this, y6Var);
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
        fq fqVar = new fq(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.c = fqVar;
        fqVar.w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        fqVar.e = dp;
        fqVar.f = dp2;
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

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d9 = f12;
        pointF.x = (float) ((Math.cos(d) * d9) + f10);
        pointF.y = (float) ((Math.sin(d) * d9) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        return this.D0 >= 1.0f;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        return this.n0 ? (!z10 || f13 - f11 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f12 - f10) <= f14 : g7.w.a(f10, f11, f12, f13) <= f14;
    }

    public final void d(float f10) {
        this.J.g = f10 > 180.0f ? 620L : 310L;
        this.I += f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        y6 y6Var = this.S;
        if (y6Var == null || !y6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f10, boolean z10) {
        if (Math.abs(f10 - this.D0) < 0.01f) {
            return;
        }
        this.D0 = f10;
        if (!z10) {
            this.E0.f(f10 > 0.0f && !this.n0, true);
            this.F0.d(f10, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.q0 = false;
        if (!z10) {
            org.telegram.ui.Components.y5 y5Var = this.p0;
            y5Var.getClass();
            y5Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        x6 x6Var = this.a;
        ImageReceiver imageReceiver = this.b;
        if (x6Var != null) {
            x6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().w.b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((a8) arrayList2.get(0)).O0 != null) {
                this.b.setImage(ImageLocation.getForPath(((a8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.c, 0L, null, null, 0);
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        char c10;
        float f15;
        float f16;
        Canvas canvas2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        RectF rectF;
        Paint paint;
        float f23;
        RectF rectF2;
        float f24;
        float f25;
        RectF rectF3;
        Canvas canvas3;
        float f26;
        float f27;
        float f28;
        org.telegram.ui.Components.y5 y5Var;
        org.telegram.ui.Components.pc pcVar;
        float f29;
        int i9;
        float f30;
        float f31;
        float f32;
        double d;
        double d9;
        float d10 = this.l0.d(this.n0 ? 1.0f : 0.0f, false);
        float d11 = this.m0.d(this.n0 ? 1.0f : 0.0f, false);
        float f33 = this.j0;
        if (f33 < 0.0f) {
            f33 = this.i0.d(this.k0 ? 1.0f : 0.0f, false);
        }
        float max = Math.max(d10, f33);
        float d12 = this.x0.d(this.s0 ? 1.0f : 0.0f, false);
        float abs = Math.abs(this.u0 - this.e0);
        float dp = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.pc pcVar2 = this.F;
        float d13 = this.y0.d((abs >= dp || !(this.n0 || pcVar2.h)) ? 0.0f : 1.0f, false) * d12;
        float d14 = this.z0.d(Math.abs(this.u0 - this.e0) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * d12;
        float clamp = Utilities.clamp((this.u0 - this.e0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.u0 - this.e0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float d15 = this.B0.d(Math.min(Math.abs(this.u0 - this.h0), Math.abs(this.u0 - this.g0)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * d12;
        float f34 = 1.0f - d10;
        float e10 = this.E0.e(this.D0 > 0.0f) * f34;
        float d16 = this.F0.d(this.D0, false);
        float e11 = this.G0.e(b());
        float f35 = this.v0 ? d10 * max * d12 : 0.0f;
        if (f35 > 0.0f) {
            f15 = 1.0f;
            float dp2 = this.e0 - AndroidUtilities.dp(50.0f);
            f16 = 0.0f;
            float dp3 = this.e0 + AndroidUtilities.dp(50.0f);
            float dp4 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.A;
            paint2.setStrokeWidth(dp4);
            float dp5 = AndroidUtilities.dp(2.0f);
            Paint paint3 = this.B;
            paint3.setStrokeWidth(dp5);
            f12 = e10;
            float f36 = f35;
            f14 = d11;
            f11 = d15;
            f10 = d14;
            c10 = 1;
            f13 = e11;
            canvas.drawLine(dp3, this.f0, AndroidUtilities.lerp(dp3, this.h0 - AndroidUtilities.dp(30.0f), f35), this.f0, paint3);
            canvas.drawLine(dp3, this.f0, AndroidUtilities.lerp(dp3, this.h0 - AndroidUtilities.dp(30.0f), f36), this.f0, paint2);
            canvas.drawLine(dp2, this.f0, AndroidUtilities.lerp(dp2, this.g0 + AndroidUtilities.dp(30.0f), f36), this.f0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp2, this.f0, AndroidUtilities.lerp(dp2, this.g0 + AndroidUtilities.dp(30.0f), f36), this.f0, paint2);
        } else {
            f10 = d14;
            f11 = d15;
            f12 = e10;
            f13 = e11;
            f14 = d11;
            c10 = 1;
            f15 = 1.0f;
            f16 = 0.0f;
            canvas2 = canvas;
        }
        float f37 = this.e0;
        float lerp = AndroidUtilities.lerp(f37, this.A0.d((AndroidUtilities.dp(4.0f) * clamp) + f37, false), d13);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d10), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d13);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d10), AndroidUtilities.dp(32.0f), d13);
        float lerp4 = AndroidUtilities.lerp(pcVar2.a(this.k0 ? 0.0f : 0.2f), (this.d0.d(this.c0, false) * 0.2f) + f15, d10);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f38 = lerp - lerp2;
        float f39 = this.f0;
        float f40 = lerp + lerp2;
        rectF4.set(f38, f39 - lerp2, f40, f39 + lerp2);
        float f41 = f15 - f13;
        int d17 = i0.a.d(max * f41, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(d17);
        if (f13 > f16) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.e0, this.f0);
            paint4.setAlpha((int) (f41 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f18 = f40;
            f19 = d10;
            f21 = f38;
            f17 = f41;
            f22 = lerp4;
            rectF = rectF4;
            f23 = max;
            f20 = d12;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f17 = f41;
            f18 = f40;
            f19 = d10;
            f20 = d12;
            f21 = f38;
            f22 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f23 = max;
            canvas2.save();
        }
        canvas2.scale(f22, f22, this.e0, this.f0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (f13 > f16) {
            float dp6 = AndroidUtilities.dp(4.0f);
            Paint paint5 = this.C;
            paint5.setStrokeWidth(dp6);
            Path path = this.O;
            path.rewind();
            PointF pointF = this.P;
            f25 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f42 = pointF.x;
            PointF pointF2 = this.Q;
            float f43 = f13 / 0.3f;
            rectF2 = rectF;
            f24 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f42, pointF2.x, Utilities.clamp(f43, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f43, 1.0f, 0.0f)));
            if (f13 > 0.3f) {
                float f44 = pointF2.x;
                PointF pointF3 = this.R;
                float f45 = (f13 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f44, pointF3.x, Utilities.clamp(f45, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f45, 1.0f, 0.0f)));
            }
            canvas2.translate(this.e0, this.f0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f24 = lerp3;
            f25 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f22, 1.0f);
        canvas2.scale(max2, max2, this.e0, this.f0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d13) * AndroidUtilities.dp(5.0f) * f12) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d13) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f12);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f13);
        float f46 = this.e0;
        float f47 = this.f0;
        RectF rectF5 = rectF2;
        rectF5.set(f46 - lerp6, f47 - lerp6, f46 + lerp6, f47 + lerp6);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f12) * 255.0f * f17));
        canvas2.drawCircle(this.e0, this.f0, lerp6, paint6);
        if ((d16 > 0.0f) && ((f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d16 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.M;
        float f48 = this.n0 ? 0.0f : 1.0f - f14;
        long j10 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float e12 = this.p0.e(this.q0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e12 * f25, 1.0f - f48) * 255.0f));
        if (e12 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            jp.a(this.o0, (SystemClock.elapsedRealtime() - this.r0) % 5400);
            invalidate();
            float[] fArr = this.o0;
            float f49 = fArr[0];
            float f50 = fArr[c10];
            float f51 = (f49 + f50) / 2.0f;
            float abs2 = Math.abs(f50 - f49) / 2.0f;
            if (this.q0) {
                float f52 = min / 2.0f;
                f51 = AndroidUtilities.lerp((-90.0f) + f52, f51, e12);
                abs2 = AndroidUtilities.lerp(f52, abs2, e12);
            }
            float f53 = f51 - abs2;
            float f54 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f53, f54, false, paint7);
        }
        if (this.n0) {
            invalidate();
            long j11 = currentTimeMillis / 1000;
            if (j11 != this.N / 1000) {
                ((ra) this.a).a.F0.a(j11, true);
            }
            if (j10 > 0 && currentTimeMillis >= j10) {
                post(new w6(this, 0));
            }
            this.N = currentTimeMillis;
        }
        canvas3.restore();
        boolean z10 = this.w0;
        org.telegram.ui.Components.pc pcVar3 = this.H;
        if (z10) {
            float a2 = pcVar3.a(0.2f) * f19;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.g0, this.f0);
                canvas3.drawCircle(this.g0, this.f0, AndroidUtilities.dp(22.0f), this.w);
                canvas3.rotate(-getRotation(), this.g0, this.f0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a3 = pcVar3.a(0.2f) * f34 * f17;
        if (a3 > 0.0f) {
            canvas3.save();
            canvas3.scale(a3, a3, this.g0, this.f0);
            canvas3.rotate(-getRotation(), this.g0, this.f0);
            this.b.draw(canvas3);
            canvas3.restore();
        }
        float d18 = this.L.d(this.K ? 1.0f : 0.0f, false);
        Paint paint8 = this.x;
        org.telegram.ui.Components.y5 y5Var2 = this.J;
        org.telegram.ui.Components.pc pcVar4 = this.G;
        if (d18 > 0.0f) {
            canvas3.save();
            float a10 = pcVar4.a(0.2f) * d18 * f17;
            canvas3.scale(a10, a10, this.h0, this.f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d18 < 1.0f) {
            canvas3.save();
            f26 = f17;
            float y10 = org.telegram.messenger.l0.y(1.0f, d18, pcVar4.a(0.2f), f26);
            canvas3.scale(y10, y10, this.h0, this.f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(22.0f), this.w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f26 = f17;
        }
        if (!this.v0 || b()) {
            f27 = 0.0f;
        } else {
            float f55 = f11;
            f27 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f55), Math.max(f55, d13)) * f20 * f23 * f19;
        }
        float d19 = this.C0.d((this.v0 || !this.n0) ? 0.0f : 1.0f, false);
        int i10 = (f27 > 0.0f ? 1 : (f27 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint9 = this.y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.u0, this.f0, f27, paint9);
            float f56 = this.u0;
            float abs3 = 1.0f - ((Math.abs(clamp2) * f20) / 1.3f);
            f31 = 22.0f;
            float clamp3 = Utilities.clamp(abs3, 1.0f, 0.0f);
            float abs4 = Math.abs(lerp - f56);
            if (abs4 >= lerp2 + (f27 * 2.0f) || clamp3 >= 0.6f) {
                f28 = f27;
                y5Var = y5Var2;
                pcVar = pcVar4;
                f29 = d19;
                i9 = i10;
                f30 = f26;
            } else {
                float f57 = lerp2 + f27;
                if (abs4 < f57) {
                    float f58 = lerp2 * lerp2;
                    float f59 = abs4 * abs4;
                    float f60 = f27 * f27;
                    f32 = f27;
                    f29 = d19;
                    i9 = i10;
                    double acos = Math.acos(((f58 + f59) - f60) / ((lerp2 * 2.0f) * abs4));
                    d9 = Math.acos(((f60 + f59) - f58) / (r15 * abs4));
                    d = acos;
                } else {
                    f32 = f27;
                    f29 = d19;
                    i9 = i10;
                    d = 0.0d;
                    d9 = 0.0d;
                }
                double d20 = f56 > lerp ? 0.0d : 3.141592653589793d;
                double d21 = d;
                double acos2 = (float) Math.acos((lerp2 - f32) / abs4);
                double d22 = acos2 - d21;
                double d23 = clamp3;
                double d24 = d22 * d23;
                double d25 = d20 + d21 + d24;
                double d26 = (d20 - d21) - d24;
                double d27 = ((3.141592653589793d - d9) - acos2) * d23;
                double d28 = ((d20 + 3.141592653589793d) - d9) - d27;
                double d29 = (d20 - 3.141592653589793d) + d9 + d27;
                float f61 = this.f0;
                PointF pointF4 = this.L0;
                a(lerp, f61, d25, lerp2, pointF4);
                float f62 = this.f0;
                PointF pointF5 = this.M0;
                a(lerp, f62, d26, lerp2, pointF5);
                float f63 = this.f0;
                PointF pointF6 = this.N0;
                float f64 = f32;
                a(f56, f63, d28, f64, pointF6);
                float f65 = this.f0;
                PointF pointF7 = this.O0;
                a(f56, f65, d29, f64, pointF7);
                f28 = f64;
                f30 = f26;
                y5Var = y5Var2;
                pcVar = pcVar4;
                float min2 = Math.min(1.0f, (abs4 * 2.0f) / f57) * Math.min(clamp3 * 2.4f, g7.w.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f57);
                float f66 = lerp2 * min2;
                float f67 = f28 * min2;
                a(pointF4.x, pointF4.y, d25 - 1.5707963705062866d, f66, this.P0);
                a(pointF5.x, pointF5.y, d26 + 1.5707963705062866d, f66, this.Q0);
                a(pointF6.x, pointF6.y, d28 + 1.5707963705062866d, f67, this.R0);
                a(pointF7.x, pointF7.y, d29 - 1.5707963705062866d, f67, this.S0);
                float f68 = f19;
                float C = e2.c.C(f20, f23, f68, f10);
                if (C > 0.0f) {
                    Path path2 = this.J0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.P0;
                    float f69 = pointF8.x;
                    float f70 = pointF8.y;
                    f19 = f68;
                    PointF pointF9 = this.R0;
                    path2.cubicTo(f69, f70, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.S0;
                    float f71 = pointF10.x;
                    float f72 = pointF10.y;
                    PointF pointF11 = this.Q0;
                    path2.cubicTo(f71, f72, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f73 = this.f0;
                    rectF3.set(f21, f73 - lerp2, f18, f73 + lerp2);
                    float f74 = f24;
                    canvas3.drawRoundRect(rectF3, f74, f74, paint9);
                } else {
                    f19 = f68;
                }
            }
        } else {
            f28 = f27;
            y5Var = y5Var2;
            pcVar = pcVar4;
            f29 = d19;
            i9 = i10;
            f30 = f26;
            f31 = 22.0f;
        }
        if (i9 > 0 || f29 > 0.0f) {
            float a11 = pcVar3.a(0.2f) * f19 * f30;
            canvas3.save();
            Path path3 = this.K0;
            path3.rewind();
            if (i9 > 0) {
                path3.addCircle(this.u0, this.f0, f28, Path.Direction.CW);
            }
            if (f29 > 0.0f && this.w0) {
                path3.addCircle(this.g0, this.f0, f29 * AndroidUtilities.dp(f31) * a11, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.w0) {
                canvas3.save();
                canvas3.scale(a11, a11, this.g0, this.f0);
                canvas3.drawCircle(this.g0, this.f0, AndroidUtilities.dp(f31), paint8);
                canvas3.rotate(-getRotation(), this.g0, this.f0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a12 = pcVar.a(0.2f) * f30;
            canvas3.save();
            canvas3.scale(a12, a12, this.h0, this.f0);
            canvas3.rotate(y5Var.d(this.I, false) - getRotation(), this.h0, this.f0);
            canvas3.drawCircle(this.h0, this.f0, AndroidUtilities.dp(f31), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        y6 y6Var = this.S;
        if (y6Var == null) {
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
        y6Var.i();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(100.0f);
        float f10 = size;
        this.e0 = f10 / 2.0f;
        this.f0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f10 * 0.35f);
        float f11 = this.e0;
        this.g0 = f11 - min;
        float f12 = f11 + min;
        this.h0 = f12;
        float f13 = this.f0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f12 - dp2), (int) (f13 - dp2), (int) (f12 + dp2), (int) (f13 + dp2));
        float f14 = this.h0;
        float f15 = this.f0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f14 - dp3), (int) (f15 - dp3), (int) (f14 + dp3), (int) (f15 + dp3));
        f(this.f, this.g0, this.f0);
        f(this.h, this.g0, this.f0);
        f(this.n, this.g0, this.f0);
        this.b.setImageCoords(this.g0 - AndroidUtilities.dp(20.0f), this.f0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.D;
        matrix.reset();
        matrix.postTranslate(this.e0, this.f0);
        this.E.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        y6 y6Var = this.S;
        if (y6Var != null) {
            y6Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.h0, this.g0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y10, this.h0, this.f0, AndroidUtilities.dp(7.0f), true);
        boolean z10 = this.q0;
        org.telegram.ui.Components.pc pcVar = this.H;
        org.telegram.ui.Components.pc pcVar2 = this.F;
        org.telegram.ui.Components.pc pcVar3 = this.G;
        boolean z11 = true;
        if (z10) {
            pcVar2.c(false);
            pcVar3.c(false);
            pcVar.c(false);
        } else if (action == 0 || this.s0) {
            pcVar2.c(c(clamp, y10, this.e0, this.f0, AndroidUtilities.dp(60.0f), false));
            pcVar3.c(c(clamp, y10, this.h0, this.f0, (float) AndroidUtilities.dp(30.0f), true) && !b());
            pcVar.c(c(clamp, y10, this.g0, this.f0, (float) AndroidUtilities.dp(30.0f), false) && !b());
        }
        w6 w6Var = this.I0;
        w6 w6Var2 = this.H0;
        if (action == 0) {
            this.s0 = true;
            this.t0 = pcVar2.h || pcVar3.h;
            System.currentTimeMillis();
            this.u0 = clamp;
            if (Math.abs(clamp - this.e0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(w6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (pcVar3.h) {
                AndroidUtilities.runOnUIThread(w6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.s0) {
                    this.u0 = Utilities.clamp(clamp, this.h0, this.g0);
                    invalidate();
                    if (this.n0 && !this.T0 && c10) {
                        d(180.0f);
                        ((ra) this.a).b();
                    }
                    if (this.n0 && this.v0) {
                        float clamp2 = Utilities.clamp(((this.f0 - AndroidUtilities.dp(48.0f)) - y10) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        wb wbVar = ((ra) this.a).a;
                        wbVar.R0.b(clamp2, true);
                        wbVar.j0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.s0) {
                    this.s0 = false;
                    this.t0 = false;
                    AndroidUtilities.cancelRunOnUIThread(w6Var2);
                    AndroidUtilities.cancelRunOnUIThread(w6Var);
                    boolean z12 = this.n0;
                    if (!z12 && pcVar.h) {
                        wb wbVar2 = ((ra) this.a).a;
                        if (wbVar2.b0 == 0 && !wbVar2.L1 && !wbVar2.M1 && wb.b(wbVar2)) {
                            wbVar2.f(true);
                        }
                    } else if (z12 && this.v0) {
                        if (pcVar.h) {
                            this.v0 = false;
                            this.C0.d(1.0f, true);
                            v3 v3Var = ((ra) this.a).a.P0;
                            v3Var.a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            v3Var.invalidate();
                        } else {
                            this.n0 = false;
                            this.r0 = SystemClock.elapsedRealtime();
                            this.q0 = true;
                            ((ra) this.a).d(false);
                        }
                    } else if (pcVar2.h) {
                        if (b()) {
                            ((ra) this.a).a();
                        } else if (!this.k0 && !this.n0 && !this.v0) {
                            ((ra) this.a).c();
                        } else if (this.n0) {
                            this.n0 = false;
                            this.r0 = SystemClock.elapsedRealtime();
                            this.q0 = true;
                            ((ra) this.a).d(false);
                        } else if (wb.d(((ra) this.a).a)) {
                            this.N = 0L;
                            this.M = System.currentTimeMillis();
                            this.w0 = false;
                            ((ra) this.a).e(new w6(this, 1), false);
                        }
                    }
                    this.v0 = false;
                    if (pcVar3.h) {
                        d(180.0f);
                        ((ra) this.a).b();
                    }
                    pcVar2.c(false);
                    pcVar3.c(false);
                    pcVar.c(false);
                    invalidate();
                }
                return false;
            }
            z11 = false;
        }
        this.T0 = c10;
        return z11;
    }

    public void setDelegate(x6 x6Var) {
        this.a = x6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            invalidate();
        }
    }

    @Override // kh.r2
    public void setInvert(float f10) {
        this.s.setColor(i0.a.d(f10, -1, -16777216));
        this.w.setColor(i0.a.d(f10, 1677721600, 369098752));
        this.A.setColor(i0.a.d(f10, 1493172223, 285212671));
        this.B.setColor(i0.a.d(f10, 402653184, 805306368));
        int d = i0.a.d(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), mode));
    }
}
