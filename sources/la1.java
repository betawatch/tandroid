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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class la1 extends e {
    public vpa E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public ka1 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final byte T;
    public boolean U;
    public aj3 V;
    public af0 W;
    public final byte X;
    public ValueAnimator Y;
    public float Z;
    public xh4 a;
    public float a0;
    public ja1 b;
    public vpa b0;
    public TextView c;
    public float c0;
    public CameraView d;
    public RectF d0;
    public final HandlerThread e;
    public final p1 e0;
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
    public la1(int i) {
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
        this.e0 = new p1(this, (byte) 11);
        this.f0 = 0.0f;
        this.g0 = 0L;
        this.X = i;
        if (e0()) {
            Utilities.e.c(new da1(this, (byte) 7));
        }
        int o = xea.o();
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

    public static ha1 i0(Activity activity, int i, ka1 ka1Var) {
        if (activity == null) {
            return null;
        }
        ha1 ha1Var = new ha1(activity, new wk5[]{new ActionBarLayout(activity, false)}, i, ka1Var);
        ha1Var.A0(false);
        hl.i3(ha1Var, false);
        hl.o3(ha1Var, -16777216, false, null);
        ha1Var.A0(false);
        ha1Var.getWindow().addFlags(512);
        ha1Var.show();
        return ha1Var;
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
        this.d.setDelegate(new tg0(this, (byte) 27));
        ((ViewGroup) this.fragmentView).addView(this.d, 0, tre.c(-1.0f, -1));
        if (this.X != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.y;
        a aVar = this.actionBar;
        byte b = this.X;
        fu7 fu7Var = null;
        if (z) {
            aVar.H(-1, false);
            this.actionBar.G(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (b == 0) {
            yob.l(aVar, 1, aob.z6, null);
            yob.l(this.actionBar, 3, aob.u8, null);
            yob.l(this.actionBar, 5, aob.A8, null);
        } else {
            aVar.H(aob.w0(null, aob.z6, false), false);
            this.actionBar.G(aob.w0(null, aob.u8, false), false);
            this.actionBar.setTitleColor(aob.w0(null, aob.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!hl.O1() && !e0()) {
            a aVar2 = this.actionBar;
            if (aVar2.J && aVar2.w == null) {
                View view = new View(aVar2.getContext());
                aVar2.w = view;
                yob.h(aob.x8, aVar2.K0, view);
                aVar2.addView(aVar2.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.w.getLayoutParams();
                layoutParams.height = hl.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                aVar2.w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 17));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        ia1 ia1Var = new ia1(this, context);
        ia1Var.setOnTouchListener(new q8((byte) 21));
        this.fragmentView = ia1Var;
        if (e0()) {
            this.fragmentView.postDelayed(new da1(this, (byte) 6), 450L);
        } else {
            c0();
        }
        a aVar3 = this.actionBar;
        if (b == 0) {
            int i = aob.d6;
            yob.h(i, null, aVar3);
            yob.h(i, null, this.fragmentView);
        } else {
            aVar3.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.H(-1, false);
            this.actionBar.G(587202559, false);
            ia1Var.setBackgroundColor(-16777216);
            ia1Var.addView(this.actionBar);
        }
        if (b == 2 || b == 3) {
            this.actionBar.setTitle(ob6.M0(2131753878, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(f66.c());
        paint2.setColor(vm2.o(-1, 40));
        ja1 ja1Var = new ja1(context, paint2);
        this.b = ja1Var;
        ja1Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        ia1Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (b == 3) {
            textView.setTextColor(aob.w0(null, aob.D6, false));
        } else {
            yob.X(textView, aob.D6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        ia1Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (b == 0) {
            this.b.setText(ob6.M0(2131747197, null));
            this.c.setText(ob6.M0(2131747196, null));
            yob.X(this.b, aob.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (b == 1 || b == 3) {
                this.b.setText(ob6.M0(2131753878, null));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753881, null));
                String[] strArr = {ob6.M0(2131753886, null), ob6.M0(2131753876, null)};
                int i2 = 0;
                for (int i3 = 2; i2 < i3; i3 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i4 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i4);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new dl((byte) 0));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i4, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new f8c(strArr[i2], 0), i4, indexOf2, 33);
                    spannableStringBuilder.setSpan(new y7c(hl.o()), i4, indexOf2, 33);
                    i2++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(hl.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (b == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(hl.L(10.0f), 0, hl.L(10.0f), hl.L(10.0f));
            fu7Var = null;
            this.h.setText(ob6.M0(2131753880, null));
            ia1Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(aob.K(hl.L(60.0f), 587202559));
            ia1Var.addView(this.s);
            this.s.setOnClickListener(new r81(this, (byte) 2));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            fu7Var = ((LaunchActivity) parentActivity).t1;
        }
        if (fu7Var != null && this.a == null) {
            xh4 xh4Var = new xh4((Object) fu7Var, (byte) 18);
            fu7Var.b.add(xh4Var);
            fu7Var.a();
            this.a = xh4Var;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final boolean e0() {
        byte b = this.X;
        return b == 1 || b == 2 || b == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x001c, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0022, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0025, code lost:
    
        if (r5 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.b) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0035, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.c) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003d, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.e) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0041, code lost:
    
        if (r5.k == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        if (r5.h != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0049, code lost:
    
        if (r5.o == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004d, code lost:
    
        if (r5.n == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x004f, code lost:
    
        r15.O = true;
        org.telegram.messenger.camera.CameraController.getInstance().stopPreview(r15.d.getCameraSession());
        hl.c3(new z21(r15, r5, 11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0024, code lost:
    
        r5 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(Bitmap bitmap) {
        ei7 ei7Var;
        p1 p1Var = this.e0;
        if (this.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                Size previewSize = this.d.getPreviewSize();
                ei7 ei7Var2 = null;
                byte b = this.X;
                if (b == 0) {
                    try {
                        ei7Var = MrzRecognizer.j(bitmap);
                    } catch (Exception unused) {
                    }
                } else {
                    int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                    rx6 k0 = k0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z = this.O;
                    if (z) {
                        this.R++;
                    }
                    if (k0 != null) {
                        this.Q = 0;
                        String str = (String) k0.b;
                        this.S = str;
                        if (!z) {
                            this.O = true;
                            this.U = this.N.B(str, new da1(this, (byte) 0));
                            this.P = SystemClock.elapsedRealtime();
                            hl.c3(new da1(this, (byte) 1));
                        }
                        hl.c3(new z21(this, k0, (byte) 9));
                    } else if (z) {
                        int i = this.Q + 1;
                        this.Q = i;
                        if (i > 4 && !this.U) {
                            this.O = false;
                            this.R = 0;
                            this.S = null;
                            hl.c3(new da1(this, (byte) 1));
                            hl.d3(p1Var, 500L);
                            return;
                        }
                    }
                    if (((this.R == 0 && k0 != null && ((RectF) k0.c) == null && !this.U) || (SystemClock.elapsedRealtime() - this.P > 1000 && !this.U)) && this.S != null) {
                        CameraView cameraView = this.d;
                        if (cameraView != null && cameraView.getCameraSession() != null && b != 3) {
                            CameraController.getInstance().stopPreview(this.d.getCameraSession());
                        }
                        hl.c3(new z21(this, this.S, (byte) 10));
                        if (b == 3) {
                            hl.c3(new da1(this, (byte) 2));
                        }
                    } else if (this.O) {
                        this.f.postDelayed(new da1(this, (byte) 3), Math.max(16L, (1000 / this.T) - ((long) this.f0)));
                    }
                }
            } catch (Throwable unused2) {
                hl.c3(new da1(this, (byte) 8));
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            float f = this.f0;
            long j = this.g0;
            float f2 = (f * j) + elapsedRealtime2;
            long j2 = j + 1;
            this.g0 = j2;
            this.f0 = f2 / j2;
            this.g0 = Math.max(j2, 30L);
            if (this.O) {
                return;
            }
            hl.d3(p1Var, 500L);
            return;
        }
        return;
        ei7Var = MrzRecognizer.i(bitmap);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (e0()) {
            return arrayList;
        }
        arrayList.add(new apb(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
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
    public final rx6 k0(Size size, int i, int i2, int i3, Bitmap bitmap) {
        rx6 rx6Var;
        RectF rectF;
        af0 af0Var;
        float f;
        float f2;
        int i4;
        rx6 rx6Var2;
        int i5;
        int i6;
        ki6 ki6Var;
        ?? r5;
        ?? r2;
        pm3 pm3Var;
        rx6 rx6Var3 = null;
        try {
            rectF = new RectF();
            af0Var = this.W;
            f = Float.MIN_VALUE;
            f2 = Float.MAX_VALUE;
            i4 = 0;
        } catch (Throwable unused) {
            rx6Var = rx6Var3;
        }
        try {
            if (af0Var == null || !af0Var.b.k()) {
                rx6Var2 = null;
                if (this.V != null) {
                    if (bitmap != null) {
                        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                        ki6Var = new x19(bitmap.getWidth(), bitmap.getHeight(), iArr);
                        int width = bitmap.getWidth();
                        i6 = bitmap.getHeight();
                        i5 = width;
                    } else {
                        ef8 ef8Var = new ef8(size.getWidth(), size.getHeight(), i, i2, i3, i3);
                        i5 = size.getWidth();
                        i6 = size.getHeight();
                        ki6Var = ef8Var;
                    }
                    pm3 U = this.V.U(new lh2((Object) new rx6(ki6Var), (byte) 9));
                    ke9[] ke9VarArr = (ke9[]) U.b;
                    String str = (String) U.c;
                    if (ke9VarArr.length == 0) {
                        r5 = null;
                        rectF = null;
                    } else {
                        float f3 = Float.MIN_VALUE;
                        float f4 = Float.MAX_VALUE;
                        for (ke9 ke9Var : ke9VarArr) {
                            float f5 = ke9Var.a;
                            float f6 = ke9Var.b;
                            f2 = Math.min(f2, f5);
                            f = Math.max(f, ke9Var.a);
                            f4 = Math.min(f4, f6);
                            f3 = Math.max(f3, f6);
                        }
                        rectF.set(f2, f4, f, f3);
                        if (ke9VarArr.length == 4) {
                            r5 = new PointF[4];
                            for (int i7 = 0; i7 < 4; i7++) {
                                ke9 ke9Var2 = ke9VarArr[i7];
                                r5[i7] = new PointF(ke9Var2.a / i5, ke9Var2.b / i6);
                            }
                        } else {
                            r5 = null;
                        }
                    }
                    r2 = str;
                } else {
                    i5 = 1;
                    i6 = 1;
                    rx6 rx6Var4 = rx6Var2;
                    r5 = rx6Var4;
                    r2 = rx6Var4;
                }
            } else {
                if (bitmap != null) {
                    pm3Var = new pm3((byte) 4);
                    int width2 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    pm3Var.d = bitmap;
                    rc0 rc0Var = (rc0) pm3Var.b;
                    rc0Var.a = width2;
                    rc0Var.b = height;
                    i5 = bitmap.getWidth();
                    i6 = bitmap.getHeight();
                } else {
                    pm3Var = new pm3((byte) 4);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width3 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width3 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    pm3Var.c = wrap;
                    rc0 rc0Var2 = (rc0) pm3Var.b;
                    rc0Var2.a = width3;
                    rc0Var2.b = height2;
                    i5 = size.getWidth();
                    i6 = size.getWidth();
                }
                SparseArray h = this.W.h(pm3Var);
                if (h.size() > 0) {
                    ze0 ze0Var = (ze0) h.valueAt(0);
                    String str2 = ze0Var.b;
                    Point[] pointArr = ze0Var.e;
                    r5 = j0(pointArr, i5, i6);
                    if (pointArr.length == 0) {
                        rectF = null;
                        rx6Var2 = null;
                        r2 = str2;
                    } else {
                        int length = pointArr.length;
                        float f7 = Float.MIN_VALUE;
                        float f8 = Float.MAX_VALUE;
                        while (i4 < length) {
                            Point point = pointArr[i4];
                            rx6 rx6Var5 = rx6Var3;
                            f2 = Math.min(f2, point.x);
                            f = Math.max(f, point.x);
                            f8 = Math.min(f8, point.y);
                            f7 = Math.max(f7, point.y);
                            i4++;
                            rx6Var3 = rx6Var5;
                        }
                        rx6Var2 = rx6Var3;
                        rectF.set(f2, f8, f, f7);
                        r2 = str2;
                    }
                } else {
                    rx6Var2 = null;
                    if (bitmap != null) {
                        Bitmap d0 = d0(bitmap);
                        bitmap.recycle();
                        pm3 pm3Var2 = new pm3((byte) 4);
                        int width4 = d0.getWidth();
                        int height3 = d0.getHeight();
                        pm3Var2.d = d0;
                        rc0 rc0Var3 = (rc0) pm3Var2.b;
                        rc0Var3.a = width4;
                        rc0Var3.b = height3;
                        i5 = d0.getWidth();
                        i6 = d0.getHeight();
                        SparseArray h2 = this.W.h(pm3Var2);
                        if (h2.size() > 0) {
                            ze0 ze0Var2 = (ze0) h2.valueAt(0);
                            String str3 = ze0Var2.b;
                            Point[] pointArr2 = ze0Var2.e;
                            r5 = j0(pointArr2, i5, i6);
                            if (pointArr2.length == 0) {
                                rectF = null;
                                r2 = str3;
                            } else {
                                int length2 = pointArr2.length;
                                float f9 = Float.MIN_VALUE;
                                float f10 = Float.MAX_VALUE;
                                while (i4 < length2) {
                                    Point point2 = pointArr2[i4];
                                    f2 = Math.min(f2, point2.x);
                                    f = Math.max(f, point2.x);
                                    f10 = Math.min(f10, point2.y);
                                    f9 = Math.max(f9, point2.y);
                                    i4++;
                                }
                                rectF.set(f2, f10, f, f9);
                                r2 = str3;
                            }
                        } else {
                            Bitmap f0 = f0(d0);
                            d0.recycle();
                            pm3 pm3Var3 = new pm3((byte) 4);
                            int width5 = f0.getWidth();
                            int height4 = f0.getHeight();
                            pm3Var3.d = f0;
                            rc0 rc0Var4 = (rc0) pm3Var3.b;
                            rc0Var4.a = width5;
                            rc0Var4.b = height4;
                            int width6 = d0.getWidth();
                            int height5 = d0.getHeight();
                            SparseArray h3 = this.W.h(pm3Var3);
                            if (h3.size() > 0) {
                                ze0 ze0Var3 = (ze0) h3.valueAt(0);
                                String str4 = ze0Var3.b;
                                Point[] pointArr3 = ze0Var3.e;
                                r5 = j0(pointArr3, width6, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f11 = Float.MIN_VALUE;
                                    float f12 = Float.MAX_VALUE;
                                    while (i4 < length3) {
                                        Point point3 = pointArr3[i4];
                                        f2 = Math.min(f2, point3.x);
                                        f = Math.max(f, point3.x);
                                        f12 = Math.min(f12, point3.y);
                                        f11 = Math.max(f11, point3.y);
                                        i4++;
                                    }
                                    rectF.set(f2, f12, f, f11);
                                }
                                i6 = height5;
                                r2 = str4;
                                i5 = width6;
                            } else {
                                i5 = width6;
                                i6 = height5;
                            }
                        }
                    }
                    rx6 rx6Var42 = rx6Var2;
                    r5 = rx6Var42;
                    r2 = rx6Var42;
                }
            }
            if (TextUtils.isEmpty(r2)) {
                hl.c3(new da1(this, (byte) 8));
                return rx6Var2;
            }
            if (this.X == 2 && !r2.startsWith("tg://login?token=")) {
                hl.c3(new da1(this, (byte) 8));
                return rx6Var2;
            }
            rx6 rx6Var6 = new rx6((byte) 13);
            if (rectF != null) {
                float L = hl.L(25.0f);
                float L2 = hl.L(15.0f);
                rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                float f13 = i5;
                float f14 = i6;
                rectF.set(rectF.left / f13, rectF.top / f14, rectF.right / f13, rectF.bottom / f14);
            }
            rx6Var6.d = r5;
            rx6Var6.c = rectF;
            rx6Var6.b = r2;
            return rx6Var6;
        } catch (Throwable unused2) {
            hl.c3(new da1(this, (byte) 8));
            return rx6Var;
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point b1 = hl.b1();
            rx6 k0 = k0(null, 0, 0, 0, in5.G(null, intent.getData(), b1.x, b1.y, true));
            if (k0 != null) {
                ka1 ka1Var = this.N;
                if (ka1Var != null) {
                    ka1Var.q((String) k0.b);
                }
                finishFragment();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        xh4 xh4Var = this.a;
        if (xh4Var != null) {
            fu7 fu7Var = (fu7) xh4Var.b;
            if (fu7Var.b.remove(xh4Var)) {
                fu7Var.a();
            }
            this.a = null;
        }
        af0 af0Var = this.W;
        if (af0Var != null) {
            af0Var.d();
        }
    }
}
