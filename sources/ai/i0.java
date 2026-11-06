package ai;

import a8.ra;
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
import c8.ha;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.d20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final Paint D;
    public final Paint E;
    public final n1 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final y1 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public d20 O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final h0 a;
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
    public u8.n i0;
    public aa.n j0;
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
    public Bitmap v0;
    public final Path w;
    public final Paint w0;
    public final Path x;
    public final RectF x0;
    public final Paint y;
    public final ra y0;
    public static final xq z0 = new xq(0.05d, 0.7d, 0.1d, 1.0d);
    public static final xq A0 = new xq(0.3d, 0.0d, 0.1d, 1.0d);

    public i0(Activity activity, RectF rectF, RectF rectF2, h0 h0Var) {
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
        this.w = new Path();
        this.x = new Path();
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new n1(0);
        y1 y1Var = new y1(true);
        this.J = y1Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new c0(0);
        this.W = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f0 = handlerThread;
        this.q0 = new RectF();
        int i7 = 2;
        this.r0 = new Paint(2);
        int i10 = 3;
        this.t0 = new Paint(3);
        this.u0 = new Matrix();
        this.w0 = new Paint(2);
        this.x0 = new RectF();
        this.y0 = new ra(this, 1);
        this.a = h0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, R.drawable.msg_qr_scan);
        this.H = o(activity, R.drawable.qr_flashlight);
        this.I = o(activity, R.drawable.qr_gallery);
        y1Var.a(-1);
        y1Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(22.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        Activity W = org.telegram.messenger.g0.W(getContext());
        this.R = a0.g(W != null ? W.getWindow().getDecorView() : this);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g0 = handler;
        handler.post(new b0(this, i7));
        invalidate();
        a(1.0f, 390L, new b0(this, i10));
    }

    public static boolean c() {
        return a0.f() && rc.e(256);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[LOOP:0: B:6:0x0033->B:15:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[Catch: all -> 0x0108, Exception -> 0x010b, TryCatch #4 {Exception -> 0x010b, blocks: (B:38:0x00a0, B:40:0x00ba, B:41:0x00c0, B:46:0x00dc, B:48:0x00e2, B:51:0x00e8, B:53:0x00ec, B:55:0x0100, B:64:0x00d5), top: B:37:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec A[Catch: all -> 0x0108, Exception -> 0x010b, LOOP:2: B:52:0x00ea->B:53:0x00ec, LOOP_END, TryCatch #4 {Exception -> 0x010b, blocks: (B:38:0x00a0, B:40:0x00ba, B:41:0x00c0, B:46:0x00dc, B:48:0x00e2, B:51:0x00e8, B:53:0x00ec, B:55:0x0100, B:64:0x00d5), top: B:37:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q4.q f(Bitmap bitmap, u8.n nVar, aa.n nVar2, d20 d20Var) {
        boolean equals;
        int i7;
        boolean equals2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = 0;
        if (nVar != null && nVar.b.k()) {
            hy0 hy0Var = new hy0(17);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            hy0Var.d = bitmap;
            b7.d dVar = (b7.d) hy0Var.b;
            dVar.a = width2;
            dVar.b = height2;
            SparseArray e12 = nVar.e1(hy0Var);
            for (int i11 = 0; i11 < e12.size(); i11++) {
                u8.m mVar = (u8.m) e12.valueAt(i11);
                String str = mVar.b;
                Point[] pointArr = mVar.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim)) {
                    try {
                        equals2 = Boolean.TRUE.equals(d20Var.a(trim));
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                    if (!equals2) {
                        int length = pointArr != null ? pointArr.length : 0;
                        PointF[] pointFArr = new PointF[length];
                        while (i10 < length) {
                            Point point = pointArr[i10];
                            pointFArr[i10] = new PointF(point.x / width, point.y / height);
                            i10++;
                        }
                        return new q4.q(trim, pointFArr, false, 5);
                    }
                }
                equals2 = false;
                if (!equals2) {
                }
            }
        } else if (nVar2 != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                android.support.v4.media.session.a0 h = nVar2.h(new wf.b(new cc.h(new bc.g(width, height, iArr)), 7));
                String str2 = (String) h.b;
                String trim2 = str2 != null ? str2.trim() : null;
                if (!TextUtils.isEmpty(trim2)) {
                    try {
                        equals = Boolean.TRUE.equals(d20Var.a(trim2));
                    } catch (Throwable th3) {
                        a8.g(th3, true);
                    }
                    if (!equals) {
                        bc.j[] jVarArr = (bc.j[]) h.c;
                        if (jVarArr != null) {
                            i7 = 4;
                            if (jVarArr.length == 4) {
                                PointF[] pointFArr2 = new PointF[i7];
                                while (i10 < i7) {
                                    bc.j jVar = jVarArr[i10];
                                    pointFArr2[i10] = new PointF(jVar.a / width, jVar.b / height);
                                    i10++;
                                }
                                return new q4.q(trim2, pointFArr2, false, 5);
                            }
                        }
                        i7 = 0;
                        PointF[] pointFArr22 = new PointF[i7];
                        while (i10 < i7) {
                        }
                        return new q4.q(trim2, pointFArr22, false, 5);
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

    public static boolean j(RectF rectF, float f10, float f11) {
        return f10 >= rectF.left - ((float) org.telegram.messenger.g0.L(8.0f)) && f10 <= rectF.right + ((float) org.telegram.messenger.g0.L(8.0f)) && f11 >= rectF.top - ((float) org.telegram.messenger.g0.L(8.0f)) && f11 <= rectF.bottom + ((float) org.telegram.messenger.g0.L(8.0f));
    }

    public static i0 k(n41 n41Var, View view, d20 d20Var, c20 c20Var, Runnable runnable) {
        q4 parentLayout = n41Var.getParentLayout();
        FrameLayout overlayContainerView = parentLayout != null ? parentLayout.getOverlayContainerView() : null;
        if (overlayContainerView == null || n41Var.getParentActivity() == null) {
            return null;
        }
        overlayContainerView.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float min = Math.min(view.getWidth(), view.getHeight());
        float width = (view.getWidth() / 2.0f) + (r1[0] - r2[0]);
        float height = (view.getHeight() / 2.0f) + (r1[1] - r2[1]);
        float f10 = min / 2.0f;
        i0 i0Var = new i0(n41Var.getParentActivity(), new RectF(width - f10, height - f10, width + f10, height + f10), new RectF(), new wf.b(3, c20Var, runnable));
        i0Var.setPlainButton(true);
        i0Var.setAccept(d20Var);
        i0Var.setOnGallery(new d0(n41Var, i0Var, d20Var, c20Var, 0));
        overlayContainerView.addView(i0Var, ha.c(-1.0f, -1));
        return i0Var;
    }

    public static String l(Bitmap bitmap, d20 d20Var) {
        u8.n nVar;
        try {
            Context context = org.telegram.messenger.t0.b;
            x1 x1Var = new x1();
            x1Var.a = 256;
            nVar = new u8.n(new t2(context, x1Var));
        } catch (Throwable th2) {
            a8.g(th2, true);
            nVar = null;
        }
        try {
            q4.q f10 = f(bitmap, nVar, new aa.n(20), d20Var);
            return f10 != null ? (String) f10.b : null;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i7) {
        Drawable mutate = context.getDrawable(i7).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(f2 f2Var, int i7, f0 f0Var) {
        if (f2Var.isFinished) {
            return;
        }
        q4 parentLayout = f2Var.getParentLayout();
        if (parentLayout == null || ((parentLayout.getLastFragment() == f2Var && !((ActionBarLayout) parentLayout).B()) || i7 >= 40)) {
            f0Var.run();
        } else {
            org.telegram.messenger.g0.i3(new e0(f2Var, i7, f0Var, 0), 50L);
        }
    }

    public final void a(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f10);
        ofFloat.addUpdateListener(new ah.h(this, 1));
        ofFloat.addListener(new g0(this, runnable));
        ofFloat.setDuration((long) (Math.abs(f10 - this.S) * j3));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
        ofFloat.start();
    }

    public final float b(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.005f) {
            return f11;
        }
        invalidate();
        return ((f11 - f10) * 0.3f) + f10;
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
        float f10;
        float f11;
        float f12;
        float f13;
        Path path;
        int i7;
        boolean z9;
        boolean z10;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float n10 = n();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float T1 = org.telegram.messenger.g0.T1(centerX - width, 0.0f, n10);
        float T12 = org.telegram.messenger.g0.T1(centerY - height, 0.0f, n10);
        float T13 = org.telegram.messenger.g0.T1(centerX + width, getWidth(), n10);
        float T14 = org.telegram.messenger.g0.T1(centerY + height, getHeight(), n10);
        RectF rectF2 = this.e;
        rectF2.set(T1, T12, T13, T14);
        float T15 = org.telegram.messenger.g0.T1(rectF.height() / 2.0f, this.R, n());
        int save = canvas2.save();
        if (this.S < 1.0f) {
            Path path2 = this.w;
            path2.rewind();
            path2.addRoundRect(rectF2, T15, T15, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float l10 = 1.0f - Utilities.l(n() / 0.35f);
        float l11 = Utilities.l(n() / 0.3f);
        Paint paint = this.y;
        if (l11 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (l11 * 255.0f));
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
            int l12 = (int) (Utilities.l((n() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.r0;
            paint2.setAlpha(l12);
            canvas2.drawBitmap(this.o0, (Rect) null, this.q0, paint2);
        }
        float l13 = Utilities.l((n() - 0.15f) / 0.45f);
        if (l13 > 0.0f) {
            float L = org.telegram.messenger.g0.L(14.0f);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * l13));
            int i10 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.r;
            Path path3 = this.x;
            if (i10 >= 29) {
                float width3 = getWidth();
                float height3 = getHeight();
                RectF rectF4 = this.x0;
                rectF4.set(0.0f, 0.0f, width3, height3);
                canvas2.drawDoubleRoundRect(rectF4, 0.0f, 0.0f, rectF3, L, L, paint);
                path = path3;
            } else {
                path3.rewind();
                path = path3;
                path.setFillType(Path.FillType.EVEN_ODD);
                float width4 = getWidth();
                float height4 = getHeight();
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, width4, height4, direction);
                path.addRoundRect(rectF3, L, L, direction);
                canvas2.drawPath(path, paint);
                path.setFillType(Path.FillType.WINDING);
            }
            float f14 = (1.0f - this.n0) * l13;
            f10 = 2.0f;
            if (f14 <= 0.004f) {
                f11 = 0.0f;
                f13 = 1.0f;
            } else {
                float L2 = org.telegram.messenger.g0.L(28.0f);
                f11 = 0.0f;
                Paint paint3 = this.D;
                f13 = 1.0f;
                int i11 = 1;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.v0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(L2));
                    this.v0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f15 = ceil;
                    float f16 = L2 + f15;
                    path4.moveTo(f15, f16);
                    float f17 = L + f15;
                    path4.lineTo(f15, f17);
                    path4.quadTo(f15, f15, f17, f15);
                    path4.lineTo(f16, f15);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(qs.e4);
                    new Canvas(this.v0).drawPath(path4, paint4);
                    this.v0.prepareToDraw();
                }
                Paint paint5 = this.w0;
                paint5.setAlpha((int) (f14 * 255.0f));
                int i12 = 0;
                while (i12 < 4) {
                    if (i12 != i11) {
                        i7 = 2;
                        if (i12 != 2) {
                            z9 = false;
                            z10 = i12 < i7;
                            canvas2.save();
                            canvas2.translate(!z9 ? rectF3.right : rectF3.left, !z10 ? rectF3.bottom : rectF3.top);
                            float f18 = -1.0f;
                            float f19 = !z9 ? -1.0f : 1.0f;
                            if (z10) {
                                f18 = 1.0f;
                            }
                            canvas2.scale(f19, f18);
                            float f20 = -ceil;
                            canvas2.drawBitmap(this.v0, f20, f20, paint5);
                            canvas2.restore();
                            i12++;
                            i11 = 1;
                        }
                    } else {
                        i7 = 2;
                    }
                    z9 = true;
                    if (i12 < i7) {
                    }
                    canvas2.save();
                    canvas2.translate(!z9 ? rectF3.right : rectF3.left, !z10 ? rectF3.bottom : rectF3.top);
                    float f182 = -1.0f;
                    if (!z9) {
                    }
                    if (z10) {
                    }
                    canvas2.scale(f19, f182);
                    float f202 = -ceil;
                    canvas2.drawBitmap(this.v0, f202, f202, paint5);
                    canvas2.restore();
                    i12++;
                    i11 = 1;
                }
            }
            if (this.Q != null) {
                canvas2.save();
                canvas2.translate((getWidth() / 2.0f) - (this.Q.getWidth() / 2.0f), (rectF3.top - org.telegram.messenger.g0.L(36.0f)) - this.Q.getHeight());
                this.K.setAlpha((int) (l13 * 255.0f));
                this.Q.draw(canvas2);
                canvas2.restore();
            }
            float b10 = b(this.n0, this.m0 != null ? f13 : f11);
            this.n0 = b10;
            PointF[] pointFArr = this.m0;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.b) == null || b10 <= f11) {
                f12 = T15;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.b.getLeft();
                float top = textureView.getTop() + this.b.getTop();
                float right = textureView.getRight() + this.b.getLeft();
                float bottom = textureView.getBottom() + this.b.getTop();
                RectF rectF5 = this.s;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.m0.length);
                float f21 = f11;
                float f22 = f21;
                for (int i13 = 0; i13 < min; i13++) {
                    PointF pointF = this.m0[i13];
                    f21 += pointF.x;
                    f22 += pointF.y;
                }
                float f23 = min;
                float width5 = (rectF5.width() * (f21 / f23)) + rectF5.left;
                float height5 = (rectF5.height() * (f22 / f23)) + rectF5.top;
                path.rewind();
                int i14 = 0;
                while (i14 < min) {
                    PointF[] pointFArr2 = this.m0;
                    PointF pointF2 = pointFArr2[((i14 + min) - 1) % min];
                    PointF pointF3 = pointFArr2[i14];
                    int i15 = i14 + 1;
                    PointF pointF4 = pointFArr2[i15 % min];
                    int i16 = min;
                    float width6 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width7 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width8 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height8 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path.moveTo(com.google.android.recaptcha.internal.a.z(width7, width6, 0.18f, width6), com.google.android.recaptcha.internal.a.z(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, com.google.android.recaptcha.internal.a.z(height8, height6, 0.18f, height6));
                    min = i16;
                    i14 = i15;
                    T15 = T15;
                }
                f12 = T15;
                canvas2.save();
                float T16 = org.telegram.messenger.g0.T1(0.5f, 1.1f, this.n0);
                canvas2.scale(T16, T16, width5, height5);
                int i17 = (int) (this.n0 * 255.0f * l13);
                Paint paint6 = this.E;
                paint6.setAlpha(i17);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.a0 = b(this.a0, this.W == 0 ? 0.88f : f13);
            this.b0 = b(this.b0, this.W == 1 ? 0.88f : f13);
            this.c0 = b(this.c0, this.W != 2 ? f13 : 0.88f);
            this.e0 = b(this.e0, this.d0 ? f13 : f11);
            h(canvas2, this.f, this.a0, l13, null);
            h(canvas, this.h, this.b0, l13, this.H);
            if (this.P != null) {
                canvas2 = canvas;
                h(canvas2, this.n, this.c0, l13, this.I);
            } else {
                canvas2 = canvas;
            }
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            f12 = T15;
            f13 = 1.0f;
        }
        canvas2.restoreToCount(save);
        if (l10 <= f11 || this.N) {
            return;
        }
        Canvas canvas3 = canvas2;
        i(f12, l10, canvas3, rectF2, false);
        String str = this.L;
        Drawable drawable = this.G;
        if (str == null) {
            float L3 = ((int) (org.telegram.messenger.g0.L(22.0f) * f13)) / f10;
            drawable.setBounds((int) (rectF2.centerX() - L3), (int) (rectF2.centerY() - L3), (int) (rectF2.centerX() + L3), (int) (rectF2.centerY() + L3));
            drawable.setAlpha((int) (l10 * 255.0f));
            drawable.draw(canvas3);
            return;
        }
        float L4 = ((org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.L(12.0f)) * f13) + rectF2.left;
        float L5 = ((int) (org.telegram.messenger.g0.L(20.0f) * f13)) / f10;
        drawable.setBounds((int) (L4 - L5), (int) (rectF2.centerY() - L5), (int) (L4 + L5), (int) (rectF2.centerY() + L5));
        int i18 = (int) (l10 * 255.0f);
        drawable.setAlpha(i18);
        drawable.draw(canvas3);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f) * f13);
        textPaint.setAlpha(i18);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas3.drawText(this.L, ((org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f)) * f13) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f10), textPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S >= 1.0f && !this.U) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i7 = -1;
            if (actionMasked == 0) {
                if (j(rectF3, x10, y10)) {
                    i7 = 0;
                } else if (j(rectF2, x10, y10)) {
                    i7 = 1;
                } else if (this.P != null && j(rectF, x10, y10)) {
                    i7 = 2;
                }
                this.W = i7;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i10 = this.W;
                    if (i10 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i10 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z9 = this.d0;
                            this.d0 = !z9;
                            cameraSession.setCurrentFlashMode(!z9 ? "torch" : "off");
                            invalidate();
                        }
                    } else if (i10 != 2 || this.P == null) {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y10);
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
                } else if ((this.W == 0 && !j(rectF3, x10, y10)) || ((this.W == 1 && !j(rectF2, x10, y10)) || (this.W == 2 && !j(rectF, x10, y10)))) {
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
                a8.g(th2, true);
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
        a(0.0f, 330L, new b0(this, 0));
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
        this.g0.post(new b0(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f10, float f11, Drawable drawable) {
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f11, canvas, rectF, true);
        if (drawable == this.H && this.e0 > 0.0f) {
            Paint paint = this.y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.e0 * 102.0f * f11));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int L = org.telegram.messenger.g0.L(28.0f);
            float centerX = rectF.centerX();
            float f12 = L / 2.0f;
            drawable.setBounds((int) (centerX - f12), (int) (rectF.centerY() - f12), (int) (rectF.centerX() + f12), (int) (rectF.centerY() + f12));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas);
        } else {
            y1 y1Var = this.J;
            y1Var.setAlpha((int) (f11 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
            y1Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f10, float f11, Canvas canvas, RectF rectF, boolean z9) {
        boolean z10;
        if (f11 <= 0.0f) {
            return;
        }
        int l10 = (int) (Utilities.l(o1.b[3] / 100.0f) * 255.0f);
        Paint paint = this.y;
        if (z9) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z10 = a0.e(this.c);
            } else {
                z10 = false;
            }
            if (z10) {
                Path path = this.x;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                a0.h(this.c, f11);
                a0.c(canvas, this.c);
                canvas.restore();
                paint.setColor((l10 << 24) | 16777215);
                paint.setAlpha((int) (l10 * f11));
                canvas.drawRect(rectF, paint);
                z.b(canvas, rectF, f11);
                canvas.restore();
                this.F.a(f10, f11, 0, canvas, rectF);
            }
        }
        if (!z9 || this.p0 == null) {
            paint.setColor(i0.a.k((l10 << 24) | 16777215, c() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            z.c(canvas, rectF, f10, f11);
        } else {
            Paint paint2 = this.t0;
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            paint.setColor((l10 << 24) | 16777215);
            paint.setAlpha((int) (l10 * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            z.c(canvas, rectF, f10, f11);
        }
        this.F.a(f10, f11, 0, canvas, rectF);
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
        return z0.getInterpolation(Utilities.l(this.S));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        float min = Math.min(i13, r2) * 0.66f;
        float L = ((i12 - i10) / 2.0f) - org.telegram.messenger.g0.L(20.0f);
        float f11 = i13 / 2.0f;
        float f12 = min / 2.0f;
        float f13 = f11 - f12;
        float f14 = L - f12;
        float f15 = f11 + f12;
        float f16 = L + f12;
        RectF rectF = this.r;
        rectF.set(f13, f14, f15, f16);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = rectF.bottom + org.telegram.messenger.g0.L(64.0f);
        if (this.P != null) {
            f10 = (L2 / 2.0f) + org.telegram.messenger.g0.L(35.0f) + f11;
        } else {
            f10 = f11;
        }
        float f17 = L2 / 2.0f;
        float f18 = L2 + L3;
        this.h.set(f10 - f17, L3, f10 + f17, f18);
        float L4 = (f11 - org.telegram.messenger.g0.L(35.0f)) - f17;
        this.n.set(L4 - f17, L3, L4 + f17, f18);
        this.Q = new StaticLayout(hd.M0(2131745862, null), this.K, jg.g.e(72.0f, i13, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = l1.B9;
        int i14 = org.telegram.messenger.g0.m;
        View view = this;
        int i15 = 0;
        while (true) {
            int top = view.getTop() + i15;
            if (!(view.getParent() instanceof View)) {
                float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i14 - top);
                rectF2.set(org.telegram.messenger.g0.L(9.0f), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(49.0f), currentActionBarHeight + org.telegram.messenger.g0.L(20.0f));
                return;
            }
            view = (View) view.getParent();
            i15 = top - view.getScrollY();
        }
    }

    public void setAccept(d20 d20Var) {
        this.O = d20Var;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(o4);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z9) {
        this.N = z9;
        invalidate();
    }
}
