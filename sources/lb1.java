// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class lb1 extends d {
    public zna E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public kb1 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final byte T;
    public boolean U;
    public ai4 V;
    public yf0 W;
    public final byte X;
    public ValueAnimator Y;
    public float Z;
    public lj4 a;
    public float a0;
    public jb1 b;
    public zna b0;
    public TextView c;
    public float c0;
    public CameraView d;
    public RectF d0;
    public final HandlerThread e;
    public final o1 e0;
    public Handler f;
    public float f0;
    public long g0;
    public TextView h;
    public final Paint n;
    public final Paint r;
    public ImageView s;
    public AnimatorSet w;
    public float x;
    public boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public lb1(int i) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.n = new Paint();
        this.r = new Paint(1);
        this.x = 0.5f;
        this.y = false;
        this.E = null;
        this.F = 0.0f;
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        this.J = new PointF[4];
        for (int i2 = 0; i2 < 4; i2++) {
            this.G[i2] = new PointF(-1.0f, -1.0f);
            this.H[i2] = new PointF(-1.0f, -1.0f);
            this.I[i2] = new PointF(-1.0f, -1.0f);
            this.J[i2] = new PointF(-1.0f, -1.0f);
        }
        this.K = new RectF();
        this.L = new RectF();
        this.M = 0L;
        this.Q = 0;
        this.R = 0;
        this.U = false;
        this.V = null;
        this.W = null;
        this.Z = 0.0f;
        this.a0 = 0.0f;
        this.c0 = 0.0f;
        this.e0 = new o1(this, (byte) 11);
        this.f0 = 0.0f;
        this.g0 = 0L;
        this.X = i;
        if (f0()) {
            Utilities.e.c(new db1(this, (byte) 5));
        }
        int o = gda.o();
        if (o == 0) {
            this.T = (byte) 8;
        } else if (o != 1) {
            this.T = (byte) 40;
        } else {
            this.T = (byte) 24;
        }
    }

    public static Bitmap e0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap g0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void i0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static hb1 j0(Activity activity, int i, kb1 kb1Var) {
        if (activity == null) {
            return null;
        }
        hb1 hb1Var = new hb1(activity, new tk5[]{new ActionBarLayout(activity, false)}, i, kb1Var);
        hb1Var.z0(false);
        gm.i3(hb1Var, false);
        gm.o3(hb1Var, -16777216, false, null);
        hb1Var.z0(false);
        hb1Var.getWindow().addFlags(512);
        hb1Var.show();
        return hb1Var;
    }

    public static PointF[] k0(Point[] pointArr, int i, int i2) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            Point point = pointArr[i3];
            pointFArr[i3] = new PointF(point.x / i, point.y / i2);
        }
        return pointFArr;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.y;
        a aVar = this.actionBar;
        byte b = this.X;
        bt7 bt7Var = null;
        if (z) {
            aVar.H(-1, false);
            this.actionBar.G(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (b == 0) {
            anb.l(aVar, 1, cmb.y6, null);
            anb.l(this.actionBar, 3, cmb.t8, null);
            anb.l(this.actionBar, 5, cmb.z8, null);
        } else {
            aVar.H(cmb.w0(null, cmb.y6, false), false);
            this.actionBar.G(cmb.w0(null, cmb.t8, false), false);
            this.actionBar.setTitleColor(cmb.w0(null, cmb.z8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!gm.O1() && !f0()) {
            a aVar2 = this.actionBar;
            if (aVar2.J && aVar2.w == null) {
                View view = new View(aVar2.getContext());
                aVar2.w = view;
                anb.h(cmb.w8, aVar2.K0, view);
                aVar2.addView(aVar2.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.w.getLayoutParams();
                layoutParams.height = gm.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                aVar2.w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 17));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        ib1 ib1Var = new ib1(this, context);
        ib1Var.setOnTouchListener(new p8((byte) 21));
        this.fragmentView = ib1Var;
        if (f0()) {
            this.fragmentView.postDelayed(new db1(this, (byte) 4), 450L);
        } else {
            d0();
        }
        a aVar3 = this.actionBar;
        if (b == 0) {
            int i = cmb.c6;
            anb.h(i, null, aVar3);
            anb.h(i, null, this.fragmentView);
        } else {
            aVar3.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.H(-1, false);
            this.actionBar.G(587202559, false);
            ib1Var.setBackgroundColor(-16777216);
            ib1Var.addView(this.actionBar);
        }
        if (b == 2 || b == 3) {
            this.actionBar.setTitle(jb6.M0(2131753850, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(b66.c());
        paint2.setColor(on2.p(-1, 40));
        jb1 jb1Var = new jb1(context, paint2);
        this.b = jb1Var;
        jb1Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        ib1Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (b == 3) {
            textView.setTextColor(cmb.w0(null, cmb.C6, false));
        } else {
            anb.X(textView, cmb.C6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        ib1Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (b == 0) {
            this.b.setText(jb6.M0(2131747203, null));
            this.c.setText(jb6.M0(2131747202, null));
            anb.X(this.b, cmb.F6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (b == 1 || b == 3) {
                this.b.setText(jb6.M0(2131753850, null));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753853, null));
                String[] strArr = {jb6.M0(2131753858, null), jb6.M0(2131753848, null)};
                int i2 = 0;
                for (int i3 = 2; i2 < i3; i3 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i4 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i4);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new cm((byte) 0));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i4, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new g6c(strArr[i2], 0), i4, indexOf2, 33);
                    spannableStringBuilder.setSpan(new z5c(gm.o()), i4, indexOf2, 33);
                    i2++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(gm.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (b == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(gm.L(10.0f), 0, gm.L(10.0f), gm.L(10.0f));
            bt7Var = null;
            this.h.setText(jb6.M0(2131753852, null));
            ib1Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(cmb.K(gm.L(60.0f), 587202559));
            ib1Var.addView(this.s);
            this.s.setOnClickListener(new k81(this, (byte) 3));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            bt7Var = ((LaunchActivity) parentActivity).t1;
        }
        if (bt7Var != null && this.a == null) {
            lj4 lj4Var = new lj4(bt7Var);
            bt7Var.b.add(lj4Var);
            bt7Var.a();
            this.a = lj4Var;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final void d0() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.d = cameraView;
        cameraView.setUseMaxPreview(true);
        this.d.setOptimizeForBarcode(true);
        this.d.setDelegate(new xg0(this, (byte) 28));
        ((ViewGroup) this.fragmentView).addView(this.d, 0, qoe.c(-1.0f, -1));
        if (this.X != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    public final boolean f0() {
        byte b = this.X;
        return b == 1 || b == 2 || b == 3;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (f0()) {
            return arrayList;
        }
        arrayList.add(new cnb(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(Bitmap bitmap) {
        lb1 lb1Var;
        yh7 j;
        o1 o1Var = this.e0;
        if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                Size previewSize = this.d.getPreviewSize();
                yh7 yh7Var = null;
                byte b = this.X;
                if (b == 0) {
                    try {
                        j = MrzRecognizer.j(bitmap);
                    } catch (Exception unused) {
                    }
                    if (j != null) {
                        yh7Var = j;
                        if (yh7Var == null && !TextUtils.isEmpty(yh7Var.b) && !TextUtils.isEmpty(yh7Var.c) && !TextUtils.isEmpty(yh7Var.e) && yh7Var.k != 0 && ((yh7Var.h != 0 || yh7Var.o) && yh7Var.n != 0)) {
                            this.O = true;
                            CameraController.getInstance().stopPreview(this.d.getCameraSession());
                            gm.c3(new y31(this, yh7Var, (byte) 12));
                            return;
                        }
                        lb1Var = this;
                    }
                    yh7 i = MrzRecognizer.i(bitmap);
                    if (i != null) {
                        yh7Var = i;
                    }
                    if (yh7Var == null) {
                    }
                    lb1Var = this;
                } else {
                    int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                    lb1Var = this;
                    try {
                        mx6 l0 = lb1Var.l0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                        boolean z = lb1Var.O;
                        if (z) {
                            lb1Var.R++;
                        }
                        if (l0 != null) {
                            lb1Var.Q = 0;
                            String str = (String) l0.b;
                            lb1Var.S = str;
                            if (!z) {
                                lb1Var.O = true;
                                lb1Var.U = lb1Var.N.X(str, new db1(lb1Var, (byte) 7));
                                lb1Var.P = SystemClock.elapsedRealtime();
                                gm.c3(new db1(lb1Var, (byte) 8));
                            }
                            gm.c3(new y31(lb1Var, l0, (byte) 10));
                        } else if (z) {
                            int i2 = lb1Var.Q + 1;
                            lb1Var.Q = i2;
                            if (i2 > 4 && !lb1Var.U) {
                                lb1Var.O = false;
                                lb1Var.R = 0;
                                lb1Var.S = null;
                                gm.c3(new db1(lb1Var, (byte) 8));
                                gm.d3(o1Var, 500L);
                                return;
                            }
                        }
                        if (((lb1Var.R == 0 && l0 != null && ((RectF) l0.c) == null && !lb1Var.U) || (SystemClock.elapsedRealtime() - lb1Var.P > 1000 && !lb1Var.U)) && lb1Var.S != null) {
                            CameraView cameraView = lb1Var.d;
                            if (cameraView != null && cameraView.getCameraSession() != null && b != 3) {
                                CameraController.getInstance().stopPreview(lb1Var.d.getCameraSession());
                            }
                            gm.c3(new y31(lb1Var, lb1Var.S, (byte) 11));
                            if (b == 3) {
                                gm.c3(new db1(lb1Var, (byte) 0));
                            }
                        } else if (lb1Var.O) {
                            lb1Var.f.postDelayed(new db1(lb1Var, (byte) 1), Math.max(16L, (1000 / lb1Var.T) - ((long) lb1Var.f0)));
                        }
                    } catch (Throwable unused2) {
                        gm.c3(new db1(lb1Var, (byte) 6));
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        float f = lb1Var.f0;
                        long j2 = lb1Var.g0;
                        float f2 = (f * j2) + elapsedRealtime2;
                        long j3 = j2 + 1;
                        lb1Var.g0 = j3;
                        lb1Var.f0 = f2 / j3;
                        lb1Var.g0 = Math.max(j3, 30L);
                        if (lb1Var.O) {
                        }
                    }
                }
            } catch (Throwable unused3) {
                lb1Var = this;
            }
            long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
            float f3 = lb1Var.f0;
            long j22 = lb1Var.g0;
            float f22 = (f3 * j22) + elapsedRealtime22;
            long j32 = j22 + 1;
            lb1Var.g0 = j32;
            lb1Var.f0 = f22 / j32;
            lb1Var.g0 = Math.max(j32, 30L);
            if (lb1Var.O) {
                gm.d3(o1Var, 500L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.graphics.PointF[]] */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.graphics.PointF[]] */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.graphics.PointF[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.PointF[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final mx6 l0(Size size, int i, int i2, int i3, Bitmap bitmap) {
        mx6 mx6Var;
        mx6 mx6Var2;
        int i4;
        int i5;
        gi6 gi6Var;
        ?? r5;
        ?? r2;
        in3 in3Var;
        mx6 mx6Var3 = null;
        try {
            RectF rectF = new RectF();
            yf0 yf0Var = this.W;
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            try {
                if (yf0Var == null || !yf0Var.b.k()) {
                    mx6Var2 = null;
                    if (this.V != null) {
                        if (bitmap != null) {
                            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                            gi6Var = new l09(bitmap.getWidth(), bitmap.getHeight(), iArr);
                            int width = bitmap.getWidth();
                            i5 = bitmap.getHeight();
                            i4 = width;
                        } else {
                            sd8 sd8Var = new sd8(size.getWidth(), size.getHeight(), i, i2, i3, i3);
                            i4 = size.getWidth();
                            i5 = size.getHeight();
                            gi6Var = sd8Var;
                        }
                        in3 o = this.V.o(new lx6((Object) new mx6(gi6Var), (byte) 8));
                        wc9[] wc9VarArr = (wc9[]) o.b;
                        String str = (String) o.c;
                        if (wc9VarArr.length == 0) {
                            r5 = null;
                            rectF = null;
                        } else {
                            float f3 = Float.MIN_VALUE;
                            float f4 = Float.MAX_VALUE;
                            for (wc9 wc9Var : wc9VarArr) {
                                float f5 = wc9Var.a;
                                float f6 = wc9Var.b;
                                f2 = Math.min(f2, f5);
                                f = Math.max(f, wc9Var.a);
                                f4 = Math.min(f4, f6);
                                f3 = Math.max(f3, f6);
                            }
                            rectF.set(f2, f4, f, f3);
                            if (wc9VarArr.length == 4) {
                                r5 = new PointF[4];
                                for (int i7 = 0; i7 < 4; i7++) {
                                    wc9 wc9Var2 = wc9VarArr[i7];
                                    r5[i7] = new PointF(wc9Var2.a / i4, wc9Var2.b / i5);
                                }
                            } else {
                                r5 = null;
                            }
                        }
                        r2 = str;
                    } else {
                        i4 = 1;
                        i5 = 1;
                        mx6 mx6Var4 = mx6Var2;
                        r5 = mx6Var4;
                        r2 = mx6Var4;
                    }
                } else {
                    if (bitmap != null) {
                        in3Var = new in3((byte) 4);
                        int width2 = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        in3Var.d = bitmap;
                        pd0 pd0Var = (pd0) in3Var.b;
                        pd0Var.a = width2;
                        pd0Var.b = height;
                        i4 = bitmap.getWidth();
                        i5 = bitmap.getHeight();
                    } else {
                        in3Var = new in3((byte) 4);
                        ByteBuffer wrap = ByteBuffer.wrap(null);
                        int width3 = size.getWidth();
                        int height2 = size.getHeight();
                        if (wrap == null) {
                            throw new IllegalArgumentException("Null image data supplied.");
                        }
                        if (wrap.capacity() < width3 * height2) {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                        in3Var.c = wrap;
                        pd0 pd0Var2 = (pd0) in3Var.b;
                        pd0Var2.a = width3;
                        pd0Var2.b = height2;
                        i4 = size.getWidth();
                        i5 = size.getWidth();
                    }
                    SparseArray h = this.W.h(in3Var);
                    if (h.size() > 0) {
                        xf0 xf0Var = (xf0) h.valueAt(0);
                        String str2 = xf0Var.b;
                        Point[] pointArr = xf0Var.e;
                        r5 = k0(pointArr, i4, i5);
                        if (pointArr.length == 0) {
                            rectF = null;
                            mx6Var2 = null;
                            r2 = str2;
                        } else {
                            int length = pointArr.length;
                            float f7 = Float.MIN_VALUE;
                            float f8 = Float.MAX_VALUE;
                            while (i6 < length) {
                                Point point = pointArr[i6];
                                mx6 mx6Var5 = mx6Var3;
                                f2 = Math.min(f2, point.x);
                                f = Math.max(f, point.x);
                                f8 = Math.min(f8, point.y);
                                f7 = Math.max(f7, point.y);
                                i6++;
                                mx6Var3 = mx6Var5;
                            }
                            mx6Var2 = mx6Var3;
                            rectF.set(f2, f8, f, f7);
                            r2 = str2;
                        }
                    } else {
                        mx6Var2 = null;
                        if (bitmap != null) {
                            Bitmap e0 = e0(bitmap);
                            bitmap.recycle();
                            in3 in3Var2 = new in3((byte) 4);
                            int width4 = e0.getWidth();
                            int height3 = e0.getHeight();
                            in3Var2.d = e0;
                            pd0 pd0Var3 = (pd0) in3Var2.b;
                            pd0Var3.a = width4;
                            pd0Var3.b = height3;
                            i4 = e0.getWidth();
                            i5 = e0.getHeight();
                            SparseArray h2 = this.W.h(in3Var2);
                            if (h2.size() > 0) {
                                xf0 xf0Var2 = (xf0) h2.valueAt(0);
                                String str3 = xf0Var2.b;
                                Point[] pointArr2 = xf0Var2.e;
                                r5 = k0(pointArr2, i4, i5);
                                if (pointArr2.length == 0) {
                                    rectF = null;
                                    r2 = str3;
                                } else {
                                    int length2 = pointArr2.length;
                                    float f9 = Float.MIN_VALUE;
                                    float f10 = Float.MAX_VALUE;
                                    while (i6 < length2) {
                                        Point point2 = pointArr2[i6];
                                        f2 = Math.min(f2, point2.x);
                                        f = Math.max(f, point2.x);
                                        f10 = Math.min(f10, point2.y);
                                        f9 = Math.max(f9, point2.y);
                                        i6++;
                                    }
                                    rectF.set(f2, f10, f, f9);
                                    r2 = str3;
                                }
                            } else {
                                Bitmap g0 = g0(e0);
                                e0.recycle();
                                in3 in3Var3 = new in3((byte) 4);
                                int width5 = g0.getWidth();
                                int height4 = g0.getHeight();
                                in3Var3.d = g0;
                                pd0 pd0Var4 = (pd0) in3Var3.b;
                                pd0Var4.a = width5;
                                pd0Var4.b = height4;
                                int width6 = e0.getWidth();
                                int height5 = e0.getHeight();
                                SparseArray h3 = this.W.h(in3Var3);
                                if (h3.size() > 0) {
                                    xf0 xf0Var3 = (xf0) h3.valueAt(0);
                                    String str4 = xf0Var3.b;
                                    Point[] pointArr3 = xf0Var3.e;
                                    r5 = k0(pointArr3, width6, height5);
                                    if (pointArr3.length == 0) {
                                        rectF = null;
                                    } else {
                                        int length3 = pointArr3.length;
                                        float f11 = Float.MIN_VALUE;
                                        float f12 = Float.MAX_VALUE;
                                        while (i6 < length3) {
                                            Point point3 = pointArr3[i6];
                                            f2 = Math.min(f2, point3.x);
                                            f = Math.max(f, point3.x);
                                            f12 = Math.min(f12, point3.y);
                                            f11 = Math.max(f11, point3.y);
                                            i6++;
                                        }
                                        rectF.set(f2, f12, f, f11);
                                    }
                                    i5 = height5;
                                    r2 = str4;
                                    i4 = width6;
                                } else {
                                    i4 = width6;
                                    i5 = height5;
                                }
                            }
                        }
                        mx6 mx6Var42 = mx6Var2;
                        r5 = mx6Var42;
                        r2 = mx6Var42;
                    }
                }
                if (TextUtils.isEmpty(r2)) {
                    gm.c3(new db1(this, (byte) 6));
                    return mx6Var2;
                }
                if (this.X == 2 && !r2.startsWith("tg://login?token=")) {
                    gm.c3(new db1(this, (byte) 6));
                    return mx6Var2;
                }
                mx6 mx6Var6 = new mx6((byte) 13);
                if (rectF != null) {
                    float L = gm.L(25.0f);
                    float L2 = gm.L(15.0f);
                    rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                    float f13 = i4;
                    float f14 = i5;
                    rectF.set(rectF.left / f13, rectF.top / f14, rectF.right / f13, rectF.bottom / f14);
                }
                mx6Var6.d = r5;
                mx6Var6.c = rectF;
                mx6Var6.b = r2;
                return mx6Var6;
            } catch (Throwable unused) {
                gm.c3(new db1(this, (byte) 6));
                return mx6Var;
            }
        } catch (Throwable unused2) {
            mx6Var = mx6Var3;
        }
    }

    public final void m0() {
        if (this.d0 == null) {
            this.d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f = width;
        float height = this.fragmentView.getHeight();
        this.d0.set(((width - min) / 2.0f) / f, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point b1 = gm.b1();
            mx6 l0 = l0(null, 0, 0, 0, fn5.G(null, intent.getData(), b1.x, b1.y, true));
            if (l0 != null) {
                kb1 kb1Var = this.N;
                if (kb1Var != null) {
                    kb1Var.v((String) l0.b);
                }
                finishFragment();
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        lj4 lj4Var = this.a;
        if (lj4Var != null) {
            bt7 bt7Var = (bt7) lj4Var.a;
            if (bt7Var.b.remove(lj4Var)) {
                bt7Var.a();
            }
            this.a = null;
        }
        yf0 yf0Var = this.W;
        if (yf0Var != null) {
            yf0Var.d();
        }
    }
}
