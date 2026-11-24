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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class da1 extends d {
    public yla E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public ca1 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final byte T;
    public boolean U;
    public ln8 V;
    public ye0 W;
    public final byte X;
    public ValueAnimator Y;
    public float Z;
    public gi3 a;
    public float a0;
    public ba1 b;
    public yla b0;
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
    public da1(int i) {
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
        if (e0()) {
            Utilities.e.c(new u91(this, (byte) 5));
        }
        int o = gba.o();
        if (o == 0) {
            this.T = (byte) 8;
        } else if (o != 1) {
            this.T = (byte) 40;
        } else {
            this.T = (byte) 24;
        }
    }

    public static Bitmap d0(Bitmap bitmap) {
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

    public static Bitmap f0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void h0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static z91 i0(Activity activity, int i, ca1 ca1Var) {
        if (activity == null) {
            return null;
        }
        z91 z91Var = new z91(activity, new ui5[]{new ActionBarLayout(activity, false)}, i, ca1Var);
        z91Var.z0(false);
        gl.j3(z91Var, false);
        gl.p3(z91Var, -16777216, false, null);
        z91Var.z0(false);
        z91Var.getWindow().addFlags(512);
        z91Var.show();
        return z91Var;
    }

    public static PointF[] j0(Point[] pointArr, int i, int i2) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            Point point = pointArr[i3];
            pointFArr[i3] = new PointF(point.x / i, point.y / i2);
        }
        return pointFArr;
    }

    public final void c0() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.d = cameraView;
        cameraView.setUseMaxPreview(true);
        this.d.setOptimizeForBarcode(true);
        this.d.setDelegate(new sg0(this, (byte) 25));
        ((ViewGroup) this.fragmentView).addView(this.d, 0, nme.c(-1.0f, -1));
        if (this.X != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.y;
        a aVar = this.actionBar;
        byte b = this.X;
        zq7 zq7Var = null;
        byte b2 = 0;
        if (z) {
            aVar.H(-1, false);
            this.actionBar.G(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (b == 0) {
            zkb.l(aVar, 1, bkb.y6, null);
            zkb.l(this.actionBar, 3, bkb.t8, null);
            zkb.l(this.actionBar, 5, bkb.z8, null);
        } else {
            aVar.H(bkb.w0(null, bkb.y6, false), false);
            this.actionBar.G(bkb.w0(null, bkb.t8, false), false);
            this.actionBar.setTitleColor(bkb.w0(null, bkb.z8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!gl.O1() && !e0()) {
            a aVar2 = this.actionBar;
            if (aVar2.J && aVar2.w == null) {
                View view = new View(aVar2.getContext());
                aVar2.w = view;
                zkb.h(bkb.w8, aVar2.K0, view);
                aVar2.addView(aVar2.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.w.getLayoutParams();
                layoutParams.height = gl.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                aVar2.w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 16));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        aa1 aa1Var = new aa1(this, context);
        aa1Var.setOnTouchListener(new p8((byte) 21));
        this.fragmentView = aa1Var;
        if (e0()) {
            this.fragmentView.postDelayed(new u91(this, (byte) 4), 450L);
        } else {
            c0();
        }
        a aVar3 = this.actionBar;
        if (b == 0) {
            int i = bkb.c6;
            zkb.h(i, null, aVar3);
            zkb.h(i, null, this.fragmentView);
        } else {
            aVar3.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.H(-1, false);
            this.actionBar.G(587202559, false);
            aa1Var.setBackgroundColor(-16777216);
            aa1Var.addView(this.actionBar);
        }
        if (b == 2 || b == 3) {
            this.actionBar.setTitle(k96.M0(2131753882, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(b46.c());
        paint2.setColor(bm2.o(-1, 40));
        ba1 ba1Var = new ba1(context, paint2);
        this.b = ba1Var;
        ba1Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        aa1Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (b == 3) {
            textView.setTextColor(bkb.w0(null, bkb.C6, false));
        } else {
            zkb.X(textView, bkb.C6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        aa1Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (b == 0) {
            this.b.setText(k96.M0(2131747277, null));
            this.c.setText(k96.M0(2131747276, null));
            zkb.X(this.b, bkb.F6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (b == 1 || b == 3) {
                this.b.setText(k96.M0(2131753882, null));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753885, null));
                String[] strArr = {k96.M0(2131753890, null), k96.M0(2131753880, null)};
                int i2 = 0;
                for (int i3 = 2; i2 < i3; i3 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i4 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i4);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new cl((byte) 0));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i4, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new g4c(strArr[i2], 0), i4, indexOf2, 33);
                    spannableStringBuilder.setSpan(new z3c(gl.o()), i4, indexOf2, 33);
                    i2++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(gl.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (b == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(gl.L(10.0f), 0, gl.L(10.0f), gl.L(10.0f));
            zq7Var = null;
            this.h.setText(k96.M0(2131753884, null));
            aa1Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(bkb.K(gl.L(60.0f), 587202559));
            aa1Var.addView(this.s);
            this.s.setOnClickListener(new x91(this, b2));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            zq7Var = ((LaunchActivity) parentActivity).t1;
        }
        if (zq7Var != null && this.a == null) {
            gi3 gi3Var = new gi3(zq7Var);
            zq7Var.b.add(gi3Var);
            zq7Var.a();
            this.a = gi3Var;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final boolean e0() {
        byte b = this.X;
        return b == 1 || b == 2 || b == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(Bitmap bitmap) {
        da1 da1Var;
        vf7 j;
        o1 o1Var = this.e0;
        if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                Size previewSize = this.d.getPreviewSize();
                vf7 vf7Var = null;
                byte b = this.X;
                if (b == 0) {
                    try {
                        j = MrzRecognizer.j(bitmap);
                    } catch (Exception unused) {
                    }
                    if (j != null) {
                        vf7Var = j;
                        if (vf7Var == null && !TextUtils.isEmpty(vf7Var.b) && !TextUtils.isEmpty(vf7Var.c) && !TextUtils.isEmpty(vf7Var.e) && vf7Var.k != 0 && ((vf7Var.h != 0 || vf7Var.o) && vf7Var.n != 0)) {
                            this.O = true;
                            CameraController.getInstance().stopPreview(this.d.getCameraSession());
                            gl.d3(new q21(this, vf7Var, (byte) 11));
                            return;
                        }
                        da1Var = this;
                    }
                    vf7 i = MrzRecognizer.i(bitmap);
                    if (i != null) {
                        vf7Var = i;
                    }
                    if (vf7Var == null) {
                    }
                    da1Var = this;
                } else {
                    int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                    da1Var = this;
                    try {
                        mv6 k0 = da1Var.k0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                        boolean z = da1Var.O;
                        if (z) {
                            da1Var.R++;
                        }
                        if (k0 != null) {
                            da1Var.Q = 0;
                            String str = (String) k0.b;
                            da1Var.S = str;
                            if (!z) {
                                da1Var.O = true;
                                da1Var.U = da1Var.N.W0(str, new u91(da1Var, (byte) 7));
                                da1Var.P = SystemClock.elapsedRealtime();
                                gl.d3(new u91(da1Var, (byte) 8));
                            }
                            gl.d3(new q21(da1Var, k0, (byte) 9));
                        } else if (z) {
                            int i2 = da1Var.Q + 1;
                            da1Var.Q = i2;
                            if (i2 > 4 && !da1Var.U) {
                                da1Var.O = false;
                                da1Var.R = 0;
                                da1Var.S = null;
                                gl.d3(new u91(da1Var, (byte) 8));
                                gl.e3(o1Var, 500L);
                                return;
                            }
                        }
                        if (((da1Var.R == 0 && k0 != null && ((RectF) k0.c) == null && !da1Var.U) || (SystemClock.elapsedRealtime() - da1Var.P > 1000 && !da1Var.U)) && da1Var.S != null) {
                            CameraView cameraView = da1Var.d;
                            if (cameraView != null && cameraView.getCameraSession() != null && b != 3) {
                                CameraController.getInstance().stopPreview(da1Var.d.getCameraSession());
                            }
                            gl.d3(new q21(da1Var, da1Var.S, (byte) 10));
                            if (b == 3) {
                                gl.d3(new u91(da1Var, (byte) 0));
                            }
                        } else if (da1Var.O) {
                            da1Var.f.postDelayed(new u91(da1Var, (byte) 1), Math.max(16L, (1000 / da1Var.T) - ((long) da1Var.f0)));
                        }
                    } catch (Throwable unused2) {
                        gl.d3(new u91(da1Var, (byte) 6));
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        float f = da1Var.f0;
                        long j2 = da1Var.g0;
                        float f2 = (f * j2) + elapsedRealtime2;
                        long j3 = j2 + 1;
                        da1Var.g0 = j3;
                        da1Var.f0 = f2 / j3;
                        da1Var.g0 = Math.max(j3, 30L);
                        if (da1Var.O) {
                        }
                    }
                }
            } catch (Throwable unused3) {
                da1Var = this;
            }
            long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
            float f3 = da1Var.f0;
            long j22 = da1Var.g0;
            float f22 = (f3 * j22) + elapsedRealtime22;
            long j32 = j22 + 1;
            da1Var.g0 = j32;
            da1Var.f0 = f22 / j32;
            da1Var.g0 = Math.max(j32, 30L);
            if (da1Var.O) {
                gl.e3(o1Var, 500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (e0()) {
            return arrayList;
        }
        arrayList.add(new blb(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        return arrayList;
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
    public final mv6 k0(Size size, int i, int i2, int i3, Bitmap bitmap) {
        mv6 mv6Var;
        mv6 mv6Var2;
        int i4;
        int i5;
        gg6 gg6Var;
        ?? r5;
        ?? r2;
        xl3 xl3Var;
        mv6 mv6Var3 = null;
        try {
            RectF rectF = new RectF();
            ye0 ye0Var = this.W;
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            try {
                if (ye0Var == null || !ye0Var.b.k()) {
                    mv6Var2 = null;
                    if (this.V != null) {
                        if (bitmap != null) {
                            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                            gg6Var = new ky8(bitmap.getWidth(), bitmap.getHeight(), iArr);
                            int width = bitmap.getWidth();
                            i5 = bitmap.getHeight();
                            i4 = width;
                        } else {
                            pb8 pb8Var = new pb8(size.getWidth(), size.getHeight(), i, i2, i3, i3);
                            i4 = size.getWidth();
                            i5 = size.getHeight();
                            gg6Var = pb8Var;
                        }
                        xl3 q = this.V.q(new tg2((Object) new mv6(gg6Var), (byte) 9));
                        wa9[] wa9VarArr = (wa9[]) q.b;
                        String str = (String) q.c;
                        if (wa9VarArr.length == 0) {
                            r5 = null;
                            rectF = null;
                        } else {
                            float f3 = Float.MIN_VALUE;
                            float f4 = Float.MAX_VALUE;
                            for (wa9 wa9Var : wa9VarArr) {
                                float f5 = wa9Var.a;
                                float f6 = wa9Var.b;
                                f2 = Math.min(f2, f5);
                                f = Math.max(f, wa9Var.a);
                                f4 = Math.min(f4, f6);
                                f3 = Math.max(f3, f6);
                            }
                            rectF.set(f2, f4, f, f3);
                            if (wa9VarArr.length == 4) {
                                r5 = new PointF[4];
                                for (int i7 = 0; i7 < 4; i7++) {
                                    wa9 wa9Var2 = wa9VarArr[i7];
                                    r5[i7] = new PointF(wa9Var2.a / i4, wa9Var2.b / i5);
                                }
                            } else {
                                r5 = null;
                            }
                        }
                        r2 = str;
                    } else {
                        i4 = 1;
                        i5 = 1;
                        mv6 mv6Var4 = mv6Var2;
                        r5 = mv6Var4;
                        r2 = mv6Var4;
                    }
                } else {
                    if (bitmap != null) {
                        xl3Var = new xl3((byte) 4);
                        int width2 = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        xl3Var.d = bitmap;
                        pc0 pc0Var = (pc0) xl3Var.b;
                        pc0Var.a = width2;
                        pc0Var.b = height;
                        i4 = bitmap.getWidth();
                        i5 = bitmap.getHeight();
                    } else {
                        xl3Var = new xl3((byte) 4);
                        ByteBuffer wrap = ByteBuffer.wrap(null);
                        int width3 = size.getWidth();
                        int height2 = size.getHeight();
                        if (wrap == null) {
                            throw new IllegalArgumentException("Null image data supplied.");
                        }
                        if (wrap.capacity() < width3 * height2) {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                        xl3Var.c = wrap;
                        pc0 pc0Var2 = (pc0) xl3Var.b;
                        pc0Var2.a = width3;
                        pc0Var2.b = height2;
                        i4 = size.getWidth();
                        i5 = size.getWidth();
                    }
                    SparseArray h = this.W.h(xl3Var);
                    if (h.size() > 0) {
                        xe0 xe0Var = (xe0) h.valueAt(0);
                        String str2 = xe0Var.b;
                        Point[] pointArr = xe0Var.e;
                        r5 = j0(pointArr, i4, i5);
                        if (pointArr.length == 0) {
                            rectF = null;
                            mv6Var2 = null;
                            r2 = str2;
                        } else {
                            int length = pointArr.length;
                            float f7 = Float.MIN_VALUE;
                            float f8 = Float.MAX_VALUE;
                            while (i6 < length) {
                                Point point = pointArr[i6];
                                mv6 mv6Var5 = mv6Var3;
                                f2 = Math.min(f2, point.x);
                                f = Math.max(f, point.x);
                                f8 = Math.min(f8, point.y);
                                f7 = Math.max(f7, point.y);
                                i6++;
                                mv6Var3 = mv6Var5;
                            }
                            mv6Var2 = mv6Var3;
                            rectF.set(f2, f8, f, f7);
                            r2 = str2;
                        }
                    } else {
                        mv6Var2 = null;
                        if (bitmap != null) {
                            Bitmap d0 = d0(bitmap);
                            bitmap.recycle();
                            xl3 xl3Var2 = new xl3((byte) 4);
                            int width4 = d0.getWidth();
                            int height3 = d0.getHeight();
                            xl3Var2.d = d0;
                            pc0 pc0Var3 = (pc0) xl3Var2.b;
                            pc0Var3.a = width4;
                            pc0Var3.b = height3;
                            i4 = d0.getWidth();
                            i5 = d0.getHeight();
                            SparseArray h2 = this.W.h(xl3Var2);
                            if (h2.size() > 0) {
                                xe0 xe0Var2 = (xe0) h2.valueAt(0);
                                String str3 = xe0Var2.b;
                                Point[] pointArr2 = xe0Var2.e;
                                r5 = j0(pointArr2, i4, i5);
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
                                Bitmap f0 = f0(d0);
                                d0.recycle();
                                xl3 xl3Var3 = new xl3((byte) 4);
                                int width5 = f0.getWidth();
                                int height4 = f0.getHeight();
                                xl3Var3.d = f0;
                                pc0 pc0Var4 = (pc0) xl3Var3.b;
                                pc0Var4.a = width5;
                                pc0Var4.b = height4;
                                int width6 = d0.getWidth();
                                int height5 = d0.getHeight();
                                SparseArray h3 = this.W.h(xl3Var3);
                                if (h3.size() > 0) {
                                    xe0 xe0Var3 = (xe0) h3.valueAt(0);
                                    String str4 = xe0Var3.b;
                                    Point[] pointArr3 = xe0Var3.e;
                                    r5 = j0(pointArr3, width6, height5);
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
                        mv6 mv6Var42 = mv6Var2;
                        r5 = mv6Var42;
                        r2 = mv6Var42;
                    }
                }
                if (TextUtils.isEmpty(r2)) {
                    gl.d3(new u91(this, (byte) 6));
                    return mv6Var2;
                }
                if (this.X == 2 && !r2.startsWith("tg://login?token=")) {
                    gl.d3(new u91(this, (byte) 6));
                    return mv6Var2;
                }
                mv6 mv6Var6 = new mv6((byte) 13);
                if (rectF != null) {
                    float L = gl.L(25.0f);
                    float L2 = gl.L(15.0f);
                    rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                    float f13 = i4;
                    float f14 = i5;
                    rectF.set(rectF.left / f13, rectF.top / f14, rectF.right / f13, rectF.bottom / f14);
                }
                mv6Var6.d = r5;
                mv6Var6.c = rectF;
                mv6Var6.b = r2;
                return mv6Var6;
            } catch (Throwable unused) {
                gl.d3(new u91(this, (byte) 6));
                return mv6Var;
            }
        } catch (Throwable unused2) {
            mv6Var = mv6Var3;
        }
    }

    public final void l0() {
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
            Point b1 = gl.b1();
            mv6 k0 = k0(null, 0, 0, 0, fl5.G(null, intent.getData(), b1.x, b1.y, true));
            if (k0 != null) {
                ca1 ca1Var = this.N;
                if (ca1Var != null) {
                    ca1Var.G((String) k0.b);
                }
                finishFragment();
            }
        } catch (Throwable th) {
            fa4.g(th, true);
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
        gi3 gi3Var = this.a;
        if (gi3Var != null) {
            zq7 zq7Var = (zq7) gi3Var.a;
            if (zq7Var.b.remove(gi3Var)) {
                zq7Var.a();
            }
            this.a = null;
        }
        ye0 ye0Var = this.W;
        if (ye0Var != null) {
            ye0Var.d();
        }
    }
}
