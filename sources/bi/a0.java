package bi;

import ai.e3;
import ai.z3;
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
import b8.mf;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a0 extends FrameLayout {
    public static final xq A0 = new xq(0.05d, 0.7d, 0.1d, 1.0d);
    public static final xq B0 = new xq(0.3d, 0.0d, 0.1d, 1.0d);
    public final Paint E;
    public final Paint F;
    public final c1 G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final w1 K;
    public final TextPaint L;
    public String M;
    public final TextPaint N;
    public boolean O;
    public v10 P;
    public Runnable Q;
    public StaticLayout R;
    public final float S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final z a;
    public int a0;
    public CameraView b;
    public float b0;
    public Object c;
    public float c0;
    public final RectF d;
    public float d0;
    public final RectF e;
    public boolean e0;
    public final RectF f;
    public float f0;
    public final HandlerThread g0;
    public final RectF h;
    public final Handler h0;
    public volatile boolean i0;
    public t8.n j0;
    public c6.i k0;
    public Bitmap l0;
    public boolean m0;
    public final RectF n;
    public PointF[] n0;
    public float o0;
    public Bitmap p0;
    public Bitmap q0;
    public final RectF r;
    public final RectF r0;
    public final RectF s;
    public final Paint s0;
    public BitmapShader t0;
    public final Paint u0;
    public final Matrix v0;
    public final Path w;
    public Bitmap w0;
    public final Path x;
    public final Paint x0;
    public final Paint y;
    public final RectF y0;
    public final a3.o z0;

    public a0(Activity activity, RectF rectF, RectF rectF2, z zVar) {
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
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new c1(0);
        w1 w1Var = new w1(true);
        this.K = w1Var;
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        this.N = new TextPaint(1);
        this.P = new x(0);
        this.a0 = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.d0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.g0 = handlerThread;
        this.r0 = new RectF();
        int i3 = 2;
        this.s0 = new Paint(2);
        int i10 = 3;
        this.u0 = new Paint(3);
        this.v0 = new Matrix();
        this.x0 = new Paint(2);
        this.y0 = new RectF();
        this.z0 = new a3.o(this, 11);
        this.a = zVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.H = o(activity, R.drawable.msg_qr_scan);
        this.I = o(activity, R.drawable.qr_flashlight);
        this.J = o(activity, R.drawable.qr_gallery);
        w1Var.a(-1);
        w1Var.b(-1);
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
        this.S = v.g(W != null ? W.getWindow().getDecorView() : this);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.h0 = handler;
        handler.post(new w(this, i3));
        invalidate();
        a(1.0f, 390L, new w(this, i10));
    }

    public static boolean c() {
        return v.f() && lc.e(256);
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
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x0103, Exception -> 0x0106, TryCatch #4 {Exception -> 0x0106, blocks: (B:38:0x009e, B:40:0x00b7, B:41:0x00bd, B:46:0x00d9, B:48:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00fd, B:64:0x00d2, B:60:0x00c5), top: B:37:0x009e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[Catch: all -> 0x0103, Exception -> 0x0106, LOOP:2: B:52:0x00e7->B:53:0x00e9, LOOP_END, TryCatch #4 {Exception -> 0x0106, blocks: (B:38:0x009e, B:40:0x00b7, B:41:0x00bd, B:46:0x00d9, B:48:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00fd, B:64:0x00d2, B:60:0x00c5), top: B:37:0x009e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p4.q f(Bitmap bitmap, t8.n nVar, c6.i iVar, v10 v10Var) {
        boolean equals;
        int i3;
        boolean equals2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = 0;
        if (nVar != null && nVar.b.k()) {
            p7.d dVar = new p7.d(11);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            dVar.c = bitmap;
            a7.d dVar2 = (a7.d) dVar.b;
            dVar2.a = width2;
            dVar2.b = height2;
            SparseArray e12 = nVar.e1(dVar);
            for (int i11 = 0; i11 < e12.size(); i11++) {
                t8.m mVar = (t8.m) e12.valueAt(i11);
                String str = mVar.b;
                Point[] pointArr = mVar.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim)) {
                    try {
                        equals2 = Boolean.TRUE.equals(v10Var.a(trim));
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
                        return new p4.q(trim, pointFArr);
                    }
                }
                equals2 = false;
                if (!equals2) {
                }
            }
        } else if (iVar != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                p7.d z10 = iVar.z(new ua.b(new zb.f(new yb.g(width, height, iArr))));
                String str2 = (String) z10.b;
                String trim2 = str2 != null ? str2.trim() : null;
                if (!TextUtils.isEmpty(trim2)) {
                    try {
                        equals = Boolean.TRUE.equals(v10Var.a(trim2));
                    } catch (Throwable th3) {
                        a8.g(th3, true);
                    }
                    if (!equals) {
                        yb.j[] jVarArr = (yb.j[]) z10.d;
                        if (jVarArr != null) {
                            i3 = 4;
                            if (jVarArr.length == 4) {
                                PointF[] pointFArr2 = new PointF[i3];
                                while (i10 < i3) {
                                    yb.j jVar = jVarArr[i10];
                                    pointFArr2[i10] = new PointF(jVar.a / width, jVar.b / height);
                                    i10++;
                                }
                                return new p4.q(trim2, pointFArr2);
                            }
                        }
                        i3 = 0;
                        PointF[] pointFArr22 = new PointF[i3];
                        while (i10 < i3) {
                        }
                        return new p4.q(trim2, pointFArr22);
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

    public static a0 k(h41 h41Var, View view, v10 v10Var, u10 u10Var, Runnable runnable) {
        q4 parentLayout = h41Var.getParentLayout();
        FrameLayout overlayContainerView = parentLayout != null ? parentLayout.getOverlayContainerView() : null;
        if (overlayContainerView == null || h41Var.getParentActivity() == null) {
            return null;
        }
        overlayContainerView.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float min = Math.min(view.getWidth(), view.getHeight());
        float width = (view.getWidth() / 2.0f) + (r1[0] - r2[0]);
        float height = (view.getHeight() / 2.0f) + (r1[1] - r2[1]);
        float f10 = min / 2.0f;
        a0 a0Var = new a0(h41Var.getParentActivity(), new RectF(width - f10, height - f10, width + f10, height + f10), new RectF(), new tf.b(u10Var, runnable));
        a0Var.setPlainButton(true);
        a0Var.setAccept(v10Var);
        a0Var.setOnGallery(new z3(h41Var, a0Var, v10Var, u10Var, 3));
        overlayContainerView.addView(a0Var, mf.c(-1.0f, -1));
        return a0Var;
    }

    public static String l(Bitmap bitmap, v10 v10Var) {
        t8.n nVar;
        try {
            Context context = org.telegram.messenger.t0.b;
            x1 x1Var = new x1();
            x1Var.a = 256;
            nVar = new t8.n(new t2(context, x1Var));
        } catch (Throwable th2) {
            a8.g(th2, true);
            nVar = null;
        }
        try {
            p4.q f10 = f(bitmap, nVar, new c6.i(9), v10Var);
            return f10 != null ? (String) f10.a : null;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i3) {
        Drawable mutate = context.getDrawable(i3).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(d2 d2Var, int i3, y yVar) {
        if (d2Var.isFinished) {
            return;
        }
        q4 parentLayout = d2Var.getParentLayout();
        if (parentLayout == null || ((parentLayout.getLastFragment() == d2Var && !((ActionBarLayout) parentLayout).B()) || i3 >= 40)) {
            yVar.run();
        } else {
            org.telegram.messenger.g0.i3(new e3(d2Var, i3, yVar, 1), 50L);
        }
    }

    public final void a(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f10);
        ofFloat.addUpdateListener(new bh.f(this, 1));
        ofFloat.addListener(new androidx.fragment.app.g(this, runnable));
        ofFloat.setDuration((long) (Math.abs(f10 - this.T) * j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.U = ofFloat;
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
        int i3;
        boolean z10;
        boolean z11;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float n4 = n();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float T1 = org.telegram.messenger.g0.T1(centerX - width, 0.0f, n4);
        float T12 = org.telegram.messenger.g0.T1(centerY - height, 0.0f, n4);
        float T13 = org.telegram.messenger.g0.T1(centerX + width, getWidth(), n4);
        float T14 = org.telegram.messenger.g0.T1(centerY + height, getHeight(), n4);
        RectF rectF2 = this.e;
        rectF2.set(T1, T12, T13, T14);
        float T15 = org.telegram.messenger.g0.T1(rectF.height() / 2.0f, this.S, n());
        int save = canvas2.save();
        if (this.T < 1.0f) {
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
        if (this.T < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.p0 != null) {
            int l12 = (int) (Utilities.l((n() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.s0;
            paint2.setAlpha(l12);
            canvas2.drawBitmap(this.p0, (Rect) null, this.r0, paint2);
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
                RectF rectF4 = this.y0;
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
            float f14 = (1.0f - this.o0) * l13;
            f10 = 2.0f;
            if (f14 <= 0.004f) {
                f11 = 0.0f;
                f13 = 1.0f;
            } else {
                float L2 = org.telegram.messenger.g0.L(28.0f);
                f11 = 0.0f;
                Paint paint3 = this.E;
                f13 = 1.0f;
                int i11 = 1;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.w0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(L2));
                    this.w0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f15 = ceil;
                    float f16 = L2 + f15;
                    path4.moveTo(f15, f16);
                    float f17 = L + f15;
                    path4.lineTo(f15, f17);
                    path4.quadTo(f15, f15, f17, f15);
                    path4.lineTo(f16, f15);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(hs.e4);
                    new Canvas(this.w0).drawPath(path4, paint4);
                    this.w0.prepareToDraw();
                }
                Paint paint5 = this.x0;
                paint5.setAlpha((int) (f14 * 255.0f));
                int i12 = 0;
                while (i12 < 4) {
                    if (i12 != i11) {
                        i3 = 2;
                        if (i12 != 2) {
                            z10 = false;
                            z11 = i12 < i3;
                            canvas2.save();
                            canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                            float f18 = -1.0f;
                            float f19 = !z10 ? -1.0f : 1.0f;
                            if (z11) {
                                f18 = 1.0f;
                            }
                            canvas2.scale(f19, f18);
                            float f20 = -ceil;
                            canvas2.drawBitmap(this.w0, f20, f20, paint5);
                            canvas2.restore();
                            i12++;
                            i11 = 1;
                        }
                    } else {
                        i3 = 2;
                    }
                    z10 = true;
                    if (i12 < i3) {
                    }
                    canvas2.save();
                    canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                    float f182 = -1.0f;
                    if (!z10) {
                    }
                    if (z11) {
                    }
                    canvas2.scale(f19, f182);
                    float f202 = -ceil;
                    canvas2.drawBitmap(this.w0, f202, f202, paint5);
                    canvas2.restore();
                    i12++;
                    i11 = 1;
                }
            }
            if (this.R != null) {
                canvas2.save();
                canvas2.translate((getWidth() / 2.0f) - (this.R.getWidth() / 2.0f), (rectF3.top - org.telegram.messenger.g0.L(36.0f)) - this.R.getHeight());
                this.L.setAlpha((int) (l13 * 255.0f));
                this.R.draw(canvas2);
                canvas2.restore();
            }
            float b10 = b(this.o0, this.n0 != null ? f13 : f11);
            this.o0 = b10;
            PointF[] pointFArr = this.n0;
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
                int min = Math.min(4, this.n0.length);
                float f21 = f11;
                float f22 = f21;
                for (int i13 = 0; i13 < min; i13++) {
                    PointF pointF = this.n0[i13];
                    f21 += pointF.x;
                    f22 += pointF.y;
                }
                float f23 = min;
                float width5 = (rectF5.width() * (f21 / f23)) + rectF5.left;
                float height5 = (rectF5.height() * (f22 / f23)) + rectF5.top;
                path.rewind();
                int i14 = 0;
                while (i14 < min) {
                    PointF[] pointFArr2 = this.n0;
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
                    path.moveTo(com.google.android.recaptcha.internal.a.y(width7, width6, 0.18f, width6), com.google.android.recaptcha.internal.a.y(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, com.google.android.recaptcha.internal.a.y(height8, height6, 0.18f, height6));
                    min = i16;
                    i14 = i15;
                    T15 = T15;
                }
                f12 = T15;
                canvas2.save();
                float T16 = org.telegram.messenger.g0.T1(0.5f, 1.1f, this.o0);
                canvas2.scale(T16, T16, width5, height5);
                int i17 = (int) (this.o0 * 255.0f * l13);
                Paint paint6 = this.F;
                paint6.setAlpha(i17);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.b0 = b(this.b0, this.a0 == 0 ? 0.88f : f13);
            this.c0 = b(this.c0, this.a0 == 1 ? 0.88f : f13);
            this.d0 = b(this.d0, this.a0 != 2 ? f13 : 0.88f);
            this.f0 = b(this.f0, this.e0 ? f13 : f11);
            h(canvas2, this.f, this.b0, l13, null);
            h(canvas, this.h, this.c0, l13, this.I);
            if (this.Q != null) {
                canvas2 = canvas;
                h(canvas2, this.n, this.d0, l13, this.J);
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
        if (l10 <= f11 || this.O) {
            return;
        }
        Canvas canvas3 = canvas2;
        i(f12, l10, canvas3, rectF2, false);
        String str = this.M;
        Drawable drawable = this.H;
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
        TextPaint textPaint = this.N;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f) * f13);
        textPaint.setAlpha(i18);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas3.drawText(this.M, ((org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f)) * f13) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f10), textPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T >= 1.0f && !this.V) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i3 = -1;
            if (actionMasked == 0) {
                if (j(rectF3, x10, y9)) {
                    i3 = 0;
                } else if (j(rectF2, x10, y9)) {
                    i3 = 1;
                } else if (this.Q != null && j(rectF, x10, y9)) {
                    i3 = 2;
                }
                this.a0 = i3;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i10 = this.a0;
                    if (i10 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i10 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z10 = this.e0;
                            this.e0 = !z10;
                            cameraSession.setCurrentFlashMode(!z10 ? "torch" : "off");
                            invalidate();
                        }
                    } else if (i10 != 2 || this.Q == null) {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y9);
                        }
                    } else {
                        performHapticFeedback(3);
                        this.Q.run();
                    }
                    this.a0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.a0 = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.a0 == 0 && !j(rectF3, x10, y9)) || ((this.a0 == 1 && !j(rectF2, x10, y9)) || (this.a0 == 2 && !j(rectF, x10, y9)))) {
                    this.a0 = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (this.V || this.W) {
            return;
        }
        this.V = true;
        this.i0 = false;
        Matrix matrix = this.v0;
        RectF rectF = this.r0;
        CameraView cameraView = this.b;
        if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
            try {
                this.p0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
            } catch (Throwable th2) {
                a8.g(th2, true);
                this.p0 = null;
            }
            if (this.p0 != null) {
                rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                if (c()) {
                    Bitmap bitmap = this.p0;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.p0.getHeight() / 8), true);
                    this.q0 = createScaledBitmap;
                    Utilities.stackBlurBitmap(createScaledBitmap, 6);
                    Bitmap bitmap2 = this.q0;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    matrix.setScale(rectF.width() / this.q0.getWidth(), rectF.height() / this.q0.getHeight());
                    matrix.postTranslate(rectF.left, rectF.top);
                    this.t0.setLocalMatrix(matrix);
                    this.u0.setShader(this.t0);
                }
            }
        }
        m();
        a(0.0f, 330L, new w(this, 0));
    }

    public final void g() {
        if (this.W) {
            return;
        }
        this.W = true;
        this.i0 = false;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        m();
        this.h0.removeCallbacksAndMessages(null);
        this.h0.post(new w(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f10, float f11, Drawable drawable) {
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f11, canvas, rectF, true);
        if (drawable == this.I && this.f0 > 0.0f) {
            Paint paint = this.y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f0 * 102.0f * f11));
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
            w1 w1Var = this.K;
            w1Var.setAlpha((int) (f11 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
            w1Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f10, float f11, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        if (f11 <= 0.0f) {
            return;
        }
        int l10 = (int) (Utilities.l(d1.b[3] / 100.0f) * 255.0f);
        Paint paint = this.y;
        if (z10) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z11 = v.e(this.c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.x;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                v.h(this.c, f11);
                v.c(canvas, this.c);
                canvas.restore();
                paint.setColor((l10 << 24) | 16777215);
                paint.setAlpha((int) (l10 * f11));
                canvas.drawRect(rectF, paint);
                u.b(canvas, rectF, f11);
                canvas.restore();
                this.G.a(f10, f11, 0, canvas, rectF);
            }
        }
        if (!z10 || this.q0 == null) {
            paint.setColor(i0.a.k((l10 << 24) | 16777215, c() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        } else {
            Paint paint2 = this.u0;
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            paint.setColor((l10 << 24) | 16777215);
            paint.setAlpha((int) (l10 * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        }
        this.G.a(f10, f11, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.e0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.V) {
            return 1.0f - B0.getInterpolation(1.0f - this.T);
        }
        return A0.getInterpolation(Utilities.l(this.T));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float f10;
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
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
        if (this.Q != null) {
            f10 = (L2 / 2.0f) + org.telegram.messenger.g0.L(35.0f) + f11;
        } else {
            f10 = f11;
        }
        float f17 = L2 / 2.0f;
        float f18 = L2 + L3;
        this.h.set(f10 - f17, L3, f10 + f17, f18);
        float L4 = (f11 - org.telegram.messenger.g0.L(35.0f)) - f17;
        this.n.set(L4 - f17, L3, L4 + f17, f18);
        this.R = new StaticLayout(bd.M0(2131745871, null), this.L, p1.d(72.0f, i13, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = a1.C9;
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

    public void setAccept(v10 v10Var) {
        this.P = v10Var;
    }

    public void setButtonLabel(String str) {
        this.M = str;
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.N;
        textPaint.setTypeface(o10);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.Q = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.O = z10;
        invalidate();
    }
}
