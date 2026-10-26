package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.m71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o0 extends FrameLayout {
    public final Paint E;
    public final v1 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final j2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public Utilities.CallbackReturn O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final n0 a;
    public float a0;
    public CameraView b;
    public float b0;
    public Object c;
    public float c0;
    public final RectF d;
    public boolean d0;
    public final RectF e;
    public float e0;
    public final RectF f;
    public final HandlerThread f0;
    public final Handler g0;
    public final RectF h;
    public volatile boolean h0;
    public s8.n i0;
    public za.c j0;
    public Bitmap k0;
    public boolean l0;
    public PointF[] m0;
    public final RectF n;
    public float n0;
    public Bitmap o0;
    public Bitmap p0;
    public final RectF q0;
    public final RectF r;
    public final Paint r0;
    public final RectF s;
    public BitmapShader s0;
    public final Paint t0;
    public final Matrix u0;
    public final Path v;
    public Bitmap v0;
    public final Path w;
    public final Paint w0;
    public final Paint x;
    public final RectF x0;
    public final Paint y;
    public final m0 y0;
    public static final ds z0 = new ds(0.05d, 0.7d, 0.1d, 1.0d);
    public static final ds A0 = new ds(0.3d, 0.0d, 0.1d, 1.0d);

    public o0(Activity activity, RectF rectF, RectF rectF2, n0 n0Var) {
        super(activity);
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f = rectF4;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.v = new Path();
        this.w = new Path();
        this.x = new Paint(1);
        Paint paint = new Paint(1);
        this.y = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new v1(0);
        j2 j2Var = new j2(true);
        this.J = j2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new d0(0);
        this.W = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f0 = handlerThread;
        this.q0 = new RectF();
        this.r0 = new Paint(2);
        this.t0 = new Paint(3);
        this.u0 = new Matrix();
        this.w0 = new Paint(2);
        this.x0 = new RectF();
        this.y0 = new m0(this);
        this.a = n0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, R.drawable.msg_qr_scan);
        this.H = o(activity, R.drawable.qr_flashlight);
        this.I = o(activity, R.drawable.qr_gallery);
        j2Var.a(-1);
        j2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        this.R = b0.g(findActivity != null ? findActivity.getWindow().getDecorView() : this);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g0 = handler;
        handler.post(new c0(this, 2));
        invalidate();
        a(1.0f, 390L, new c0(this, 3));
    }

    public static boolean c() {
        return b0.f() && LiteMode.isEnabled(256);
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:6:0x0032->B:15:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[Catch: all -> 0x0106, Exception -> 0x0109, TryCatch #4 {Exception -> 0x0109, blocks: (B:38:0x009e, B:40:0x00b9, B:41:0x00bf, B:46:0x00db, B:48:0x00e1, B:51:0x00e7, B:53:0x00eb, B:55:0x00ff, B:64:0x00d4, B:60:0x00c7), top: B:37:0x009e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb A[Catch: all -> 0x0106, Exception -> 0x0109, LOOP:2: B:52:0x00e9->B:53:0x00eb, LOOP_END, TryCatch #4 {Exception -> 0x0109, blocks: (B:38:0x009e, B:40:0x00b9, B:41:0x00bf, B:46:0x00db, B:48:0x00e1, B:51:0x00e7, B:53:0x00eb, B:55:0x00ff, B:64:0x00d4, B:60:0x00c7), top: B:37:0x009e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rf.b f(Bitmap bitmap, s8.n nVar, za.c cVar, Utilities.CallbackReturn callbackReturn) {
        boolean equals;
        int i10;
        boolean equals2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = 0;
        if (nVar != null && nVar.b.k()) {
            k6.c cVar2 = new k6.c(28);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            cVar2.d = bitmap;
            a3.l lVar = (a3.l) cVar2.b;
            lVar.a = width2;
            lVar.b = height2;
            SparseArray e12 = nVar.e1(cVar2);
            for (int i12 = 0; i12 < e12.size(); i12++) {
                s8.m mVar = (s8.m) e12.valueAt(i12);
                String str = mVar.b;
                Point[] pointArr = mVar.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim)) {
                    try {
                        equals2 = Boolean.TRUE.equals(callbackReturn.run(trim));
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    if (!equals2) {
                        int length = pointArr != null ? pointArr.length : 0;
                        PointF[] pointFArr = new PointF[length];
                        while (i11 < length) {
                            Point point = pointArr[i11];
                            pointFArr[i11] = new PointF(point.x / width, point.y / height);
                            i11++;
                        }
                        return new rf.b(4, trim, pointFArr);
                    }
                }
                equals2 = false;
                if (!equals2) {
                }
            }
        } else if (cVar != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                a8.h0 M = cVar.M(new n4.s(new fc.f(new ec.g(width, height, iArr)), 15));
                String str2 = (String) M.b;
                String trim2 = str2 != null ? str2.trim() : null;
                if (!TextUtils.isEmpty(trim2)) {
                    try {
                        equals = Boolean.TRUE.equals(callbackReturn.run(trim2));
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                    }
                    if (!equals) {
                        ec.j[] jVarArr = (ec.j[]) M.c;
                        if (jVarArr != null) {
                            i10 = 4;
                            if (jVarArr.length == 4) {
                                PointF[] pointFArr2 = new PointF[i10];
                                while (i11 < i10) {
                                    ec.j jVar = jVarArr[i11];
                                    pointFArr2[i11] = new PointF(jVar.a / width, jVar.b / height);
                                    i11++;
                                }
                                return new rf.b(4, trim2, pointFArr2);
                            }
                        }
                        i10 = 0;
                        PointF[] pointFArr22 = new PointF[i10];
                        while (i11 < i10) {
                        }
                        return new rf.b(4, trim2, pointFArr22);
                    }
                }
                equals = false;
                if (!equals) {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean j(RectF rectF, float f7, float f10) {
        return f7 >= rectF.left - ((float) AndroidUtilities.dp(8.0f)) && f7 <= rectF.right + ((float) AndroidUtilities.dp(8.0f)) && f10 >= rectF.top - ((float) AndroidUtilities.dp(8.0f)) && f10 <= rectF.bottom + ((float) AndroidUtilities.dp(8.0f));
    }

    public static o0 k(m71 m71Var, View view, Utilities.CallbackReturn callbackReturn, Utilities.Callback callback, Runnable runnable) {
        j5 parentLayout = m71Var.getParentLayout();
        FrameLayout overlayContainerView = parentLayout != null ? parentLayout.getOverlayContainerView() : null;
        if (overlayContainerView == null || m71Var.getParentActivity() == null) {
            return null;
        }
        overlayContainerView.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float min = Math.min(view.getWidth(), view.getHeight());
        float width = (view.getWidth() / 2.0f) + (r1[0] - r2[0]);
        float height = (view.getHeight() / 2.0f) + (r1[1] - r2[1]);
        float f7 = min / 2.0f;
        o0 o0Var = new o0(m71Var.getParentActivity(), new RectF(width - f7, height - f7, width + f7, height + f7), new RectF(), new i0(callback, runnable));
        o0Var.setPlainButton(true);
        o0Var.setAccept(callbackReturn);
        o0Var.setOnGallery(new e0(m71Var, o0Var, callbackReturn, callback, 0));
        overlayContainerView.addView(o0Var, gb1.g(-1.0f, -1));
        return o0Var;
    }

    public static String l(Bitmap bitmap, Utilities.CallbackReturn callbackReturn) {
        s8.n nVar;
        try {
            Context context = ApplicationLoader.applicationContext;
            x1 x1Var = new x1();
            x1Var.a = 256;
            nVar = new s8.n(new t2(context, x1Var));
        } catch (Throwable th2) {
            FileLog.e(th2);
            nVar = null;
        }
        try {
            rf.b f7 = f(bitmap, nVar, new za.c(28), callbackReturn);
            return f7 != null ? (String) f7.b : null;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i10) {
        Drawable mutate = context.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(r2 r2Var, int i10, j0 j0Var) {
        if (r2Var.isFinished) {
            return;
        }
        j5 parentLayout = r2Var.getParentLayout();
        if (parentLayout == null || ((parentLayout.getLastFragment() == r2Var && !((ActionBarLayout) parentLayout).A()) || i10 >= 40)) {
            j0Var.run();
        } else {
            AndroidUtilities.runOnUIThread(new h0(r2Var, i10, j0Var, 0), 50L);
        }
    }

    public final void a(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f7);
        ofFloat.addUpdateListener(new g0(this, 0));
        ofFloat.addListener(new l0(this, runnable));
        ofFloat.setDuration((long) (Math.abs(f7 - this.S) * j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
        ofFloat.start();
    }

    public final float b(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path path;
        int i10;
        boolean z10;
        boolean z11;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float n10 = n();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float lerp = AndroidUtilities.lerp(centerX - width, 0.0f, n10);
        float lerp2 = AndroidUtilities.lerp(centerY - height, 0.0f, n10);
        float lerp3 = AndroidUtilities.lerp(centerX + width, getWidth(), n10);
        float lerp4 = AndroidUtilities.lerp(centerY + height, getHeight(), n10);
        RectF rectF2 = this.e;
        rectF2.set(lerp, lerp2, lerp3, lerp4);
        float lerp5 = AndroidUtilities.lerp(rectF.height() / 2.0f, this.R, n());
        int save = canvas2.save();
        if (this.S < 1.0f) {
            Path path2 = this.v;
            path2.rewind();
            path2.addRoundRect(rectF2, lerp5, lerp5, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float clamp01 = 1.0f - Utilities.clamp01(n() / 0.35f);
        float clamp012 = Utilities.clamp01(n() / 0.3f);
        Paint paint = this.x;
        if (clamp012 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (clamp012 * 255.0f));
            canvas2.drawRect(rectF2, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.S < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.o0 != null) {
            int clamp013 = (int) (Utilities.clamp01((n() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.r0;
            paint2.setAlpha(clamp013);
            canvas2.drawBitmap(this.o0, (Rect) null, this.q0, paint2);
        }
        float clamp014 = Utilities.clamp01((n() - 0.15f) / 0.45f);
        if (clamp014 > 0.0f) {
            float dp = AndroidUtilities.dp(14.0f);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * clamp014));
            int i11 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.r;
            Path path3 = this.w;
            if (i11 >= 29) {
                float width3 = getWidth();
                float height3 = getHeight();
                RectF rectF4 = this.x0;
                rectF4.set(0.0f, 0.0f, width3, height3);
                canvas2.drawDoubleRoundRect(rectF4, 0.0f, 0.0f, rectF3, dp, dp, paint);
                path = path3;
            } else {
                path3.rewind();
                path = path3;
                path.setFillType(Path.FillType.EVEN_ODD);
                float width4 = getWidth();
                float height4 = getHeight();
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, width4, height4, direction);
                path.addRoundRect(rectF3, dp, dp, direction);
                canvas2.drawPath(path, paint);
                path.setFillType(Path.FillType.WINDING);
            }
            float f13 = (1.0f - this.n0) * clamp014;
            f7 = 2.0f;
            if (f13 <= 0.004f) {
                f10 = 0.0f;
                f12 = 1.0f;
            } else {
                float dp2 = AndroidUtilities.dp(28.0f);
                f10 = 0.0f;
                Paint paint3 = this.y;
                f12 = 1.0f;
                int i12 = 1;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.v0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(dp2));
                    this.v0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f14 = ceil;
                    float f15 = dp2 + f14;
                    path4.moveTo(f14, f15);
                    float f16 = dp + f14;
                    path4.lineTo(f14, f16);
                    path4.quadTo(f14, f14, f16, f14);
                    path4.lineTo(f15, f14);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(255);
                    new Canvas(this.v0).drawPath(path4, paint4);
                    this.v0.prepareToDraw();
                }
                Paint paint5 = this.w0;
                paint5.setAlpha((int) (f13 * 255.0f));
                int i13 = 0;
                while (i13 < 4) {
                    if (i13 != i12) {
                        i10 = 2;
                        if (i13 != 2) {
                            z10 = false;
                            z11 = i13 < i10;
                            canvas2.save();
                            canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                            float f17 = -1.0f;
                            float f18 = !z10 ? -1.0f : 1.0f;
                            if (z11) {
                                f17 = 1.0f;
                            }
                            canvas2.scale(f18, f17);
                            float f19 = -ceil;
                            canvas2.drawBitmap(this.v0, f19, f19, paint5);
                            canvas2.restore();
                            i13++;
                            i12 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                    z10 = true;
                    if (i13 < i10) {
                    }
                    canvas2.save();
                    canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                    float f172 = -1.0f;
                    if (!z10) {
                    }
                    if (z11) {
                    }
                    canvas2.scale(f18, f172);
                    float f192 = -ceil;
                    canvas2.drawBitmap(this.v0, f192, f192, paint5);
                    canvas2.restore();
                    i13++;
                    i12 = 1;
                }
            }
            if (this.Q != null) {
                canvas2.save();
                canvas2.translate((getWidth() / 2.0f) - (this.Q.getWidth() / 2.0f), (rectF3.top - AndroidUtilities.dp(36.0f)) - this.Q.getHeight());
                this.K.setAlpha((int) (clamp014 * 255.0f));
                this.Q.draw(canvas2);
                canvas2.restore();
            }
            float b10 = b(this.n0, this.m0 != null ? f12 : f10);
            this.n0 = b10;
            PointF[] pointFArr = this.m0;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.b) == null || b10 <= f10) {
                f11 = lerp5;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.b.getLeft();
                float top = textureView.getTop() + this.b.getTop();
                float right = textureView.getRight() + this.b.getLeft();
                float bottom = textureView.getBottom() + this.b.getTop();
                RectF rectF5 = this.s;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.m0.length);
                float f20 = f10;
                float f21 = f20;
                for (int i14 = 0; i14 < min; i14++) {
                    PointF pointF = this.m0[i14];
                    f20 += pointF.x;
                    f21 += pointF.y;
                }
                float f22 = min;
                float width5 = (rectF5.width() * (f20 / f22)) + rectF5.left;
                float height5 = (rectF5.height() * (f21 / f22)) + rectF5.top;
                path.rewind();
                int i15 = 0;
                while (i15 < min) {
                    PointF[] pointFArr2 = this.m0;
                    PointF pointF2 = pointFArr2[((i15 + min) - 1) % min];
                    PointF pointF3 = pointFArr2[i15];
                    int i16 = i15 + 1;
                    PointF pointF4 = pointFArr2[i16 % min];
                    int i17 = min;
                    float width6 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width7 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width8 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height8 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path.moveTo(c3.h0.z(width7, width6, 0.18f, width6), c3.h0.z(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, c3.h0.z(height8, height6, 0.18f, height6));
                    min = i17;
                    i15 = i16;
                    lerp5 = lerp5;
                }
                f11 = lerp5;
                canvas2.save();
                float lerp6 = AndroidUtilities.lerp(0.5f, 1.1f, this.n0);
                canvas2.scale(lerp6, lerp6, width5, height5);
                int i18 = (int) (this.n0 * 255.0f * clamp014);
                Paint paint6 = this.E;
                paint6.setAlpha(i18);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.a0 = b(this.a0, this.W == 0 ? 0.88f : f12);
            this.b0 = b(this.b0, this.W == 1 ? 0.88f : f12);
            this.c0 = b(this.c0, this.W != 2 ? f12 : 0.88f);
            this.e0 = b(this.e0, this.d0 ? f12 : f10);
            h(canvas2, this.f, this.a0, clamp014, null);
            h(canvas, this.h, this.b0, clamp014, this.H);
            if (this.P != null) {
                canvas2 = canvas;
                h(canvas2, this.n, this.c0, clamp014, this.I);
            } else {
                canvas2 = canvas;
            }
        } else {
            f7 = 2.0f;
            f10 = 0.0f;
            f11 = lerp5;
            f12 = 1.0f;
        }
        canvas2.restoreToCount(save);
        if (clamp01 <= f10 || this.N) {
            return;
        }
        Canvas canvas3 = canvas2;
        i(f11, clamp01, canvas3, rectF2, false);
        String str = this.L;
        Drawable drawable = this.G;
        if (str == null) {
            float dp3 = ((int) (AndroidUtilities.dp(22.0f) * f12)) / f7;
            drawable.setBounds((int) (rectF2.centerX() - dp3), (int) (rectF2.centerY() - dp3), (int) (rectF2.centerX() + dp3), (int) (rectF2.centerY() + dp3));
            drawable.setAlpha((int) (clamp01 * 255.0f));
            drawable.draw(canvas3);
            return;
        }
        float dp4 = ((AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(12.0f)) * f12) + rectF2.left;
        float dp5 = ((int) (AndroidUtilities.dp(20.0f) * f12)) / f7;
        drawable.setBounds((int) (dp4 - dp5), (int) (rectF2.centerY() - dp5), (int) (dp4 + dp5), (int) (rectF2.centerY() + dp5));
        int i19 = (int) (clamp01 * 255.0f);
        drawable.setAlpha(i19);
        drawable.draw(canvas3);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f) * f12);
        textPaint.setAlpha(i19);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas3.drawText(this.L, ((AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f)) * f12) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S >= 1.0f && !this.U) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i10 = -1;
            if (actionMasked == 0) {
                if (j(rectF3, x9, y3)) {
                    i10 = 0;
                } else if (j(rectF2, x9, y3)) {
                    i10 = 1;
                } else if (this.P != null && j(rectF, x9, y3)) {
                    i10 = 2;
                }
                this.W = i10;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i11 = this.W;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z10 = this.d0;
                            this.d0 = !z10;
                            cameraSession.setCurrentFlashMode(!z10 ? "torch" : "off");
                            invalidate();
                        }
                    } else if (i11 != 2 || this.P == null) {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x9, (int) y3);
                        }
                    } else {
                        performHapticFeedback(3);
                        this.P.run();
                    }
                    this.W = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.W = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.W == 0 && !j(rectF3, x9, y3)) || ((this.W == 1 && !j(rectF2, x9, y3)) || (this.W == 2 && !j(rectF, x9, y3)))) {
                    this.W = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        this.h0 = false;
        Matrix matrix = this.u0;
        RectF rectF = this.q0;
        CameraView cameraView = this.b;
        if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
            try {
                this.o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.o0 = null;
            }
            if (this.o0 != null) {
                rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                if (c()) {
                    Bitmap bitmap = this.o0;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.o0.getHeight() / 8), true);
                    this.p0 = createScaledBitmap;
                    Utilities.stackBlurBitmap(createScaledBitmap, 6);
                    Bitmap bitmap2 = this.p0;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    matrix.setScale(rectF.width() / this.p0.getWidth(), rectF.height() / this.p0.getHeight());
                    matrix.postTranslate(rectF.left, rectF.top);
                    this.s0.setLocalMatrix(matrix);
                    this.t0.setShader(this.s0);
                }
            }
        }
        m();
        a(0.0f, 330L, new c0(this, 0));
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.g0.removeCallbacksAndMessages(null);
        this.g0.post(new c0(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f10, canvas, rectF, true);
        if (drawable == this.H && this.e0 > 0.0f) {
            Paint paint = this.x;
            paint.setColor(-1);
            paint.setAlpha((int) (this.e0 * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int dp = AndroidUtilities.dp(28.0f);
            float centerX = rectF.centerX();
            float f11 = dp / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            j2 j2Var = this.J;
            j2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            j2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int clamp01 = (int) (Utilities.clamp01(w1.b[3] / 100.0f) * 255.0f);
        Paint paint = this.x;
        if (z10) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z11 = b0.e(this.c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.w;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                b0.h(this.c, f10);
                b0.c(canvas, this.c);
                canvas.restore();
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                a0.b(canvas, rectF, f10);
                canvas.restore();
                this.F.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (!z10 || this.p0 == null) {
            paint.setColor(i0.a.k((clamp01 << 24) | 16777215, c() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            a0.c(canvas, rectF, f7, f10);
        } else {
            Paint paint2 = this.t0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((clamp01 << 24) | 16777215);
            paint.setAlpha((int) (clamp01 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            a0.c(canvas, rectF, f7, f10);
        }
        this.F.a(canvas, rectF, f7, 0, f10);
    }

    public final void m() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.d0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.U) {
            return 1.0f - A0.getInterpolation(1.0f - this.S);
        }
        return z0.getInterpolation(Utilities.clamp01(this.S));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        float min = Math.min(i14, r2) * 0.66f;
        float dp = ((i13 - i11) / 2.0f) - AndroidUtilities.dp(20.0f);
        float f10 = i14 / 2.0f;
        float f11 = min / 2.0f;
        float f12 = f10 - f11;
        float f13 = dp - f11;
        float f14 = f10 + f11;
        float f15 = dp + f11;
        RectF rectF = this.r;
        rectF.set(f12, f13, f14, f15);
        float dp2 = AndroidUtilities.dp(56.0f);
        float dp3 = rectF.bottom + AndroidUtilities.dp(64.0f);
        if (this.P != null) {
            f7 = (dp2 / 2.0f) + AndroidUtilities.dp(35.0f) + f10;
        } else {
            f7 = f10;
        }
        float f16 = dp2 / 2.0f;
        float f17 = dp2 + dp3;
        this.h.set(f7 - f16, dp3, f7 + f16, f17);
        float dp4 = (f10 - AndroidUtilities.dp(35.0f)) - f16;
        this.n.set(dp4 - f16, dp3, dp4 + f16, f17);
        this.Q = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.K, org.telegram.messenger.t.c(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = t1.C9;
        int i15 = AndroidUtilities.statusBarHeight;
        View view = this;
        int i16 = 0;
        while (true) {
            int top = view.getTop() + i16;
            if (!(view.getParent() instanceof View)) {
                float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i15 - top);
                rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
                return;
            }
            view = (View) view.getParent();
            i16 = top - view.getScrollY();
        }
    }

    public void setAccept(Utilities.CallbackReturn<String, Boolean> callbackReturn) {
        this.O = callbackReturn;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(bold);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.N = z10;
        invalidate();
    }
}
