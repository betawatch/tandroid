package kh;

import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class r6 extends FrameLayout {
    public static final /* synthetic */ int x0 = 0;
    public f0 A;
    public gc B;
    public final org.telegram.ui.Components.ba C;
    public final q6 D;
    public long E;
    public long F;
    public final o6 G;
    public final o6 H;
    public final o6 I;
    public v9 J;
    public boolean K;
    public final org.telegram.ui.Components.y5 L;
    public final Paint M;
    public Drawable N;
    public Drawable O;
    public final Paint P;
    public int Q;
    public int R;
    public final Matrix S;
    public final float[] T;
    public float U;
    public float V;
    public float W;
    public Bitmap a;
    public boolean a0;
    public final Rect b;
    public final org.telegram.ui.Components.y5 b0;
    public final Rect c;
    public boolean c0;
    public a8 d;
    public final Matrix d0;
    public k61 e;
    public final Matrix e0;
    public int f;
    public final Matrix f0;
    public boolean g0;
    public int h;
    public final PointF h0;
    public final PointF i0;
    public float j0;
    public double k0;
    public boolean l0;
    public boolean m0;
    public y51 n;
    public boolean n0;
    public final Matrix o0;
    public final Matrix p0;
    public float q0;
    public TextureView r;
    public boolean r0;
    public qe0 s;
    public boolean s0;
    public long t0;
    public Runnable u0;
    public v9 v;
    public final HashSet v0;
    public yf.b2 w;
    public k0 w0;
    public k61 x;
    public k61 y;

    public r6(Context context, org.telegram.ui.Components.ba baVar, q6 q6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new o6(this, 2);
        this.G = new o6(this, 3);
        this.H = new o6(this, 4);
        this.I = new o6(this, 5);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.a0 = true;
        this.b0 = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.g);
        this.c0 = false;
        this.d0 = new Matrix();
        this.e0 = new Matrix();
        this.f0 = new Matrix();
        this.g0 = true;
        this.h0 = new PointF();
        this.i0 = new PointF();
        this.o0 = new Matrix();
        this.p0 = new Matrix();
        this.v0 = new HashSet();
        this.C = baVar;
        this.D = q6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(r6 r6Var, a8 a8Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (a8Var != null) {
            int measuredWidth = r6Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : r6Var.getMeasuredWidth();
            int i9 = (int) ((measuredWidth * 16) / 9.0f);
            if (a8Var.K) {
                Bitmap bitmap = a8Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = a8Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(a8Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = r6Var.getContext().getContentResolver().loadThumbnail(a8Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i9), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && a8Var.K && a8Var.N == null) {
                        r6Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = a8Var.Z0;
                        if (file == null) {
                            file = a8Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        c3.g gVar = new c3.g(r6Var, a8Var, j11, file.getPath(), 2);
                        boolean z10 = a8Var.K;
                        bitmapArr[0] = a8.q(gVar, measuredWidth, i9, !z10 ? a8Var.Q : 0, !z10);
                        zArr[0] = false;
                    }
                }
            }
            j10 = -1;
            j11 = j10;
            if (j11 >= 0) {
            }
            if (bitmapArr[0] == null) {
            }
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(r6Var, bitmapArr, a8Var, zArr, 15));
    }

    public static Drawable e(Drawable drawable, int i9, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i9, wallPaper, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable f(Drawable drawable, int i9, TLRPC.WallPaper wallPaper, boolean z10) {
        int[] iArr;
        org.telegram.ui.ActionBar.d6 k10;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return tn.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.b4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i9).getTheme(nf.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i9, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.e6 N0 = !z10 ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = N0.d;
            SparseIntArray Q0 = str3 == null ? org.telegram.ui.ActionBar.f6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.f6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.f6.nl;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    sparseIntArray.put(i10, iArr[i10]);
                }
            }
            k10 = N0.k(false);
            if (k10 == null) {
                k10.c(Q0, sparseIntArray);
            } else {
                for (int i11 = 0; i11 < Q0.size(); i11++) {
                    sparseIntArray.put(Q0.keyAt(i11), Q0.valueAt(i11));
                }
            }
            b3.b H = org.telegram.ui.ActionBar.f6.H(N0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) H.b;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) H.a;
        }
        str = string;
        if (!z10) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = N0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.f6.nl;
        if (iArr != null) {
        }
        k10 = N0.k(false);
        if (k10 == null) {
        }
        b3.b H2 = org.telegram.ui.ActionBar.f6.H(N0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i9, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.f6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i9, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i9, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.f6.Nd;
        int i11 = h.get(i10, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.f6.Od;
        int i13 = h.get(i12, org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.f6.Pd;
        int i15 = h.get(i14, org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.f6.Qd;
        int i17 = h.get(i16, org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        final jb0 jb0Var = new jb0();
        jb0Var.g = false;
        jb0Var.t(jb0Var.u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        jb0Var.o(i11, i13, i15, i17, 0, true);
        jb0Var.v(0);
        final int f10 = jb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: kh.m6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((lf.a) pair.second).b;
                org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                if (longValue != b4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i18 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                jb0 jb0Var2 = jb0Var;
                jb0Var2.t(bitmap, i18);
                jb0Var2.u(f10);
                jb0Var2.s(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th) {
                org.telegram.tgnet.k.a(this, th);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return jb0Var;
    }

    private void setupCollage(a8 a8Var) {
        gc gcVar = this.B;
        if (gcVar != null) {
            gcVar.setCollage(a8Var != null ? a8Var.T : null);
        }
    }

    private void setupImage(a8 a8Var) {
        Utilities.searchQueue.postRunnable(new ih.j7(18, this, a8Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        a8 a8Var;
        k61 k61Var = this.e;
        float f11 = 0.0f;
        if (k61Var != null) {
            k61Var.X((this.K || ((a8Var = this.d) != null && a8Var.Y)) ? 0.0f : a8Var != null ? a8Var.P : 1.0f);
        }
        k61 k61Var2 = this.x;
        if (k61Var2 != null) {
            if (this.K) {
                f10 = 0.0f;
            } else {
                a8 a8Var2 = this.d;
                f10 = a8Var2 != null ? a8Var2.u0 : 1.0f;
            }
            k61Var2.X(f10);
        }
        k61 k61Var3 = this.y;
        if (k61Var3 != null) {
            if (!this.K) {
                a8 a8Var3 = this.d;
                f11 = a8Var3 != null ? a8Var3.G : 1.0f;
            }
            k61Var3.X(f11);
        }
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.setMuted(this.K);
        }
    }

    public final void d(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.T;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.U = fArr[0];
        this.V = fArr[1];
        a8 a8Var = this.d;
        fArr[0] = a8Var.k0;
        fArr[1] = a8Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        g7.w.a(this.U, this.V, fArr[0], fArr[1]);
        a8 a8Var2 = this.d;
        fArr[0] = a8Var2.k0 / 2.0f;
        fArr[1] = a8Var2.l0;
        matrix.mapPoints(fArr);
        g7.w.a(this.U, this.V, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O != null) {
            if (this.c0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.O;
            float d = ((drawable instanceof jb0) && ((jb0) drawable).u == null) ? 0.0f : this.L.d(1.0f, false);
            Drawable drawable2 = this.N;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                a8.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (d * 255.0f));
            a8.j(canvas, this.O, getWidth(), getHeight());
            if (this.c0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.P);
        }
        k0 k0Var = this.w0;
        if (k0Var != null) {
            k0Var.d.b(canvas2, true);
        } else if (this.a0 && this.d != null && !j()) {
            float e10 = this.b0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    a8 a8Var = this.d;
                    int i9 = a8Var.k0;
                    int i10 = a8Var.l0;
                    int i11 = a8Var.Q;
                    MediaController.CropState cropState = a8Var.m0;
                    if (((i11 + cropState.transformRotation) / 90) % 2 == 1) {
                        i10 = i9;
                        i9 = i10;
                    }
                    float f10 = cropState.cropPw;
                    float f11 = cropState.cropPh;
                    float f12 = i9;
                    float f13 = i10;
                    canvas2.clipRect(((-i9) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.cropScale;
                    canvas2.scale(f14, f14);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                    canvas2.rotate(this.d.m0.cropRotate + r0.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    a8 a8Var2 = this.d;
                    canvas2.translate((-a8Var2.k0) / 2.0f, (-a8Var2.l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                a8 a8Var3 = this.d;
                int i12 = a8Var3.k0;
                int i13 = a8Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0181, code lost:
    
        if (r1 != false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        wb wbVar = ((kb) this).y0;
        mb mbVar = wbVar.Y0;
        boolean z10 = false;
        if (mbVar == null || !mbVar.K1) {
            oe0 oe0Var = wbVar.y1;
            ib0 ib0Var = oe0Var.E;
            if (oe0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    oe0Var.y = false;
                    oe0Var.A = System.currentTimeMillis();
                    oe0Var.B = motionEvent.getX();
                    oe0Var.C = motionEvent.getY();
                    qe0 qe0Var = oe0Var.w;
                    if (qe0Var != null) {
                        oe0Var.D = qe0Var.getEnhanceValue();
                    }
                    z10 = true;
                    if (motionEvent.getAction() == 0) {
                        this.t0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.t0 <= ViewConfiguration.getTapTimeout() && (runnable = this.u0) != null) {
                            runnable.run();
                        }
                        this.t0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.t0 = 0L;
                    }
                    if (!z10) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                if (action == 2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (!oe0Var.y && System.currentTimeMillis() - oe0Var.A <= ViewConfiguration.getLongPressTimeout() && Math.abs(oe0Var.C - y10) < Math.abs(oe0Var.B - x10) && Math.abs(oe0Var.B - x10) > AndroidUtilities.touchSlop) {
                        oe0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(ib0Var);
                        oe0Var.r = true;
                        oe0Var.invalidate();
                    }
                    if (oe0Var.y) {
                        float f10 = x10 - oe0Var.B;
                        if (oe0Var.w == null) {
                            oe0Var.x.run();
                        }
                        qe0 qe0Var2 = oe0Var.w;
                        if (qe0Var2 == null) {
                            oe0Var.y = false;
                        } else {
                            float enhanceValue = qe0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f10 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(oe0Var.D * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(oe0Var);
                                    oe0Var.D = clamp;
                                }
                            } else {
                                try {
                                    oe0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                oe0Var.D = clamp;
                            }
                            oe0Var.w.setEnhanceValue(clamp);
                            qe0 qe0Var3 = oe0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((qe0Var3 == null ? 0.0f : qe0Var3.getEnhanceValue()) * 100.0f), oe0Var.b, oe0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            oe0Var.f = staticLayout;
                            oe0Var.h = staticLayout.getLineCount() > 0 ? oe0Var.f.getLineWidth(0) : 0.0f;
                            oe0Var.n = oe0Var.f.getLineCount() > 0 ? oe0Var.f.getLineLeft(0) : 0.0f;
                            oe0Var.invalidate();
                        }
                    }
                    oe0Var.B = x10;
                    oe0Var.C = y10;
                } else if (action == 1 || action == 3) {
                    oe0Var.y = false;
                    oe0Var.A = -1L;
                    qe0 qe0Var4 = oe0Var.w;
                    if (qe0Var4 != null) {
                        oe0Var.D = qe0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(ib0Var, 600L);
                }
            } else if (oe0Var.r) {
                oe0Var.r = false;
                oe0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a8 a8Var;
        a8 a8Var2;
        y51 y51Var = this.n;
        if (view == y51Var && (a8Var2 = this.d) != null && a8Var2.u) {
            return false;
        }
        if ((view != y51Var && view != this.r) || (a8Var = this.d) == null || a8Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            a8 a8Var3 = this.d;
            int i9 = a8Var3.k0;
            int i10 = a8Var3.l0;
            int i11 = a8Var3.Q;
            MediaController.CropState cropState = a8Var3.m0;
            if (((i11 + cropState.transformRotation) / 90) % 2 == 1) {
                i10 = i9;
                i9 = i10;
            }
            float f10 = cropState.cropPw;
            float f11 = cropState.cropPh;
            canvas.clipRect(((-i9) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i9 * f10) / 2.0f, (i10 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            a8 a8Var4 = this.d;
            canvas.translate((-a8Var4.k0) / 2.0f, (-a8Var4.l0) / 2.0f);
        }
        canvas.concat(this.d0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 1;
        }
        return a8Var.l0;
    }

    public int getContentWidth() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 1;
        }
        return a8Var.k0;
    }

    public long getCurrentPosition() {
        k61 k61Var = this.e;
        if (k61Var != null) {
            return k61Var.o();
        }
        k61 k61Var2 = this.x;
        if (k61Var2 != null) {
            return k61Var2.o();
        }
        k61 k61Var3 = this.y;
        if (k61Var3 != null) {
            return k61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        a8 a8Var = this.d;
        if (a8Var != null) {
            double d = a8Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        k61 k61Var = this.e;
        if (k61Var == null || k61Var.q() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.q();
    }

    public int getOrientation() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 0;
        }
        return a8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public y51 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        y51 y51Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i9 = 0; i9 < viewArr.length; i9++) {
            View view = viewArr[i9];
            if (view != null && view.getWidth() >= 0 && viewArr[i9].getHeight() > 0) {
                View view2 = viewArr[i9];
                if (view2 == this && (y51Var = this.n) != null) {
                    bitmapArr[i9] = y51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i9] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i9] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i9]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i9].getWidth(), dp2 / viewArr[i9].getHeight());
                    canvas.scale(max, max);
                    viewArr[i9].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new n6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        a8 a8Var;
        return (this.A == null || (a8Var = this.d) == null || !a8Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.v0.contains(-9982);
    }

    public final void l(a8 a8Var) {
        this.d = a8Var;
        if (a8Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.K) {
            setupImage(a8Var);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6((kb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(a8Var);
            r();
        }
        b();
        u(a8Var);
        p(a8Var, false);
        s(a8Var, null, false);
    }

    public final void m(long j10) {
        k61 k61Var = this.e;
        if (k61Var != null) {
            k61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            k61 k61Var2 = this.x;
            if (k61Var2 != null) {
                k61Var2.M(j10, false);
            } else {
                k61 k61Var3 = this.y;
                if (k61Var3 != null) {
                    k61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(a8 a8Var, ba baVar, long j10) {
        this.d = a8Var;
        if (a8Var == null) {
            t(null, baVar, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.v()) {
            setupImage(null);
            t(null, baVar, j10);
            setupCollage(a8Var);
        } else if (a8Var.K) {
            setupImage(a8Var);
            setupCollage(null);
            t(a8Var, baVar, j10);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, baVar, 0L);
            setupImage(a8Var);
            r();
        }
        b();
        u(a8Var);
        p(a8Var, false);
        s(a8Var, null, false);
    }

    public final void o(TextureView textureView, qe0 qe0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = qe0Var;
        this.r = textureView;
        if (qe0Var != null) {
            int i9 = this.Q;
            int i10 = this.R;
            hz hzVar = qe0Var.h0;
            if (hzVar != null) {
                hzVar.i(i9, i10);
            } else {
                qe0Var.F0 = i9;
                qe0Var.G0 = i10;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.g0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(a8 a8Var, boolean z10) {
        boolean z11;
        k61 k61Var = this.y;
        if (k61Var != null) {
            k61Var.C();
            this.y.I();
            this.y = null;
        }
        if (a8Var == null) {
            return;
        }
        gc gcVar = this.B;
        boolean z12 = false;
        if (gcVar != null) {
            String str = a8Var.y;
            String str2 = a8Var.A;
            String str3 = a8Var.B;
            long j10 = a8Var.C;
            long j11 = a8Var.D;
            float f10 = a8Var.E;
            float f11 = a8Var.F;
            float f12 = a8Var.G;
            if (!TextUtils.equals(gcVar.K, str)) {
                zb zbVar = gcVar.T;
                if (zbVar != null) {
                    zbVar.a();
                    gcVar.T = null;
                    gcVar.Q = false;
                }
                gcVar.K = str;
                gcVar.p();
            }
            gcVar.K = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            gcVar.J = !isEmpty;
            if (isEmpty) {
                gcVar.L = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (gcVar.J) {
                gcVar.N = j10;
                gcVar.M = j11 - ((long) (j10 * f10));
                gcVar.O = f10;
                gcVar.P = f11;
                gcVar.R = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, gcVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    gcVar.I0 = staticLayout;
                    gcVar.J0 = staticLayout.getLineCount() > 0 ? gcVar.I0.getLineWidth(0) : 0.0f;
                    gcVar.K0 = gcVar.I0.getLineCount() > 0 ? gcVar.I0.getLineLeft(0) : 0.0f;
                } else {
                    gcVar.J0 = 0.0f;
                    gcVar.I0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, gcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    gcVar.M0 = staticLayout2;
                    gcVar.N0 = staticLayout2.getLineCount() > 0 ? gcVar.M0.getLineWidth(0) : 0.0f;
                    gcVar.O0 = gcVar.M0.getLineCount() > 0 ? gcVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    gcVar.N0 = 0.0f;
                    gcVar.M0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                gcVar.a0.f(gcVar.J, true);
            }
            gcVar.invalidate();
        } else {
            z11 = true;
        }
        if (a8Var.y != null) {
            k61 k61Var2 = new k61();
            this.y = k61Var2;
            k61Var2.y = z11;
            k61Var2.F = new android.support.v4.media.c(this, 22);
            k61Var2.E(Uri.fromFile(new File(a8Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (a8Var.Z * getDuration());
                this.e.M(duration, false);
                this.B.setProgress(duration);
            }
            w(true);
        }
        wb wbVar = ((kb) this).y0;
        ya yaVar = wbVar.r1;
        if (yaVar != null) {
            a8 a8Var2 = wbVar.G1;
            if (a8Var2 != null && a8Var2.y != null) {
                z12 = true;
            }
            yaVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        a8 a8Var = this.d;
        if (a8Var != null) {
            a8Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                a8Var.y = null;
                a8Var.z = null;
                a8Var.A = null;
                a8Var.B = null;
                a8Var.D = 0L;
                a8Var.C = 0L;
                a8Var.E = 0.0f;
                a8Var.F = 1.0f;
            } else {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.id != 0) {
                    this.d.z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.z;
                    inputDocument.id = document.id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i9 = 0;
                if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            a8 a8Var2 = this.d;
                            a8Var2.y = null;
                            a8Var2.z = null;
                            a8Var2.A = null;
                            a8Var2.B = null;
                            a8Var2.D = 0L;
                            a8Var2.C = 0L;
                            a8Var2.E = 0.0f;
                            a8Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                a8 a8Var3 = this.d;
                a8Var3.A = null;
                a8Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                        i10++;
                        TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                            this.d.A = documentAttribute2.performer;
                            if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                this.d.B = documentAttribute2.title;
                            }
                            this.d.C = (long) (documentAttribute2.duration * 1000.0d);
                        } else if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                            this.d.B = documentAttribute2.file_name;
                        }
                    }
                }
                a8 a8Var4 = this.d;
                a8Var4.D = 0L;
                if (a8Var4.K) {
                    a8Var4.D = (long) (a8Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        Object obj = arrayList2.get(i9);
                        i9++;
                        a8 a8Var5 = ((e0) obj).n;
                        if (a8Var5 != null && a8Var5.K) {
                            duration = this.A.getDuration();
                            break;
                        }
                    }
                }
                a8 a8Var6 = this.d;
                duration = a8Var6.K ? getDuration() : a8Var6.C;
                gc gcVar = this.B;
                int maxCount = gcVar == null ? 1 : gcVar.getMaxCount();
                a8 a8Var7 = this.d;
                a8Var7.F = a8Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        a8 a8Var = this.d;
        int i9 = a8Var.A0;
        Paint paint = this.P;
        if (i9 == 0 || a8Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new p6(this, measuredHeight, 0).run(o0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            a8 a8Var2 = this.d;
            int i10 = a8Var2.A0;
            this.Q = i10;
            int i11 = a8Var2.B0;
            this.R = i11;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y51 y51Var = this.n;
            if (y51Var != null) {
                int i12 = this.Q;
                int i13 = this.R;
                hz hzVar = y51Var.b;
                if (hzVar == null) {
                    y51Var.n = i12;
                    y51Var.r = i13;
                } else {
                    hzVar.i(i12, i13);
                }
            }
            qe0 qe0Var = this.s;
            if (qe0Var != null) {
                int i14 = this.Q;
                int i15 = this.R;
                hz hzVar2 = qe0Var.h0;
                if (hzVar2 != null) {
                    hzVar2.i(i14, i15);
                } else {
                    qe0Var.F0 = i14;
                    qe0Var.G0 = i15;
                }
            }
        }
        invalidate();
    }

    public final void s(a8 a8Var, yf.b2 b2Var, boolean z10) {
        k61 k61Var;
        if (a8Var == null || a8Var.o0 == null) {
            k61 k61Var2 = this.x;
            if (k61Var2 != null) {
                k61Var2.C();
                this.x.I();
                this.x = null;
            }
            gc gcVar = this.B;
            if (gcVar != null) {
                gcVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.G);
            return;
        }
        k61 k61Var3 = this.x;
        if (k61Var3 != null) {
            k61Var3.I();
            this.x = null;
        }
        k61 k61Var4 = new k61();
        this.x = k61Var4;
        k61Var4.y = true;
        k61Var4.F = new fa.c(this, 25);
        this.x.E(Uri.fromFile(a8Var.o0), "other");
        c();
        this.w = b2Var;
        if (b2Var != null && (k61Var = this.x) != null) {
            k61Var.W(b2Var.q0);
        }
        this.B.n(a8Var.o0.getAbsolutePath(), a8Var.q0, a8Var.r0, a8Var.s0, a8Var.t0, a8Var.u0, z10);
        y(true);
    }

    public void set(a8 a8Var) {
        n(a8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.g0 = z10;
    }

    public void setCollageView(f0 f0Var) {
        this.A = f0Var;
    }

    public void setCropEditorDrawing(k0 k0Var) {
        if (this.w0 != k0Var) {
            this.w0 = k0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.a0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.u0 = runnable;
    }

    public void setVideoTimelineView(gc gcVar) {
        this.B = gcVar;
        if (gcVar != null) {
            gcVar.setDelegate(new xa.c(this, 24));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 8) {
            set(null);
        }
    }

    public final void t(a8 a8Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        if (a8Var == null || a8Var.v()) {
            k61 k61Var = this.e;
            if (k61Var != null) {
                k61Var.C();
                this.e.I();
                this.e = null;
            }
            q6 q6Var = this.D;
            if (q6Var == null || !q6Var.g) {
                y51 y51Var = this.n;
                if (y51Var != null) {
                    y51Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new o6(this, 6)).start();
                }
            } else {
                q6Var.a(null);
            }
            gc gcVar = this.B;
            if (gcVar != null) {
                gcVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        k61 k61Var2 = this.e;
        if (k61Var2 != null) {
            k61Var2.I();
            this.e = null;
        }
        int i9 = 0;
        k61 k61Var3 = new k61();
        this.e = k61Var3;
        k61Var3.y = true;
        k61Var3.F = new j4.c(this, a8Var, new Runnable[]{runnable}, 9);
        y51 y51Var2 = this.n;
        if (y51Var2 != null) {
            y51Var2.clearAnimation();
            y51 y51Var3 = this.n;
            hz hzVar = y51Var3.b;
            if (hzVar != null) {
                hzVar.postRunnable(new ez(hzVar, i9));
            }
            y51Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new y51(getContext(), this.e);
        this.C.e();
        y51 y51Var4 = this.n;
        org.telegram.ui.Components.ba baVar = a8Var.u ? null : this.C;
        y51Var4.s = baVar;
        hz hzVar2 = y51Var4.b;
        if (hzVar2 != null && (haVar = hzVar2.E) != null) {
            org.telegram.ui.Components.ba baVar2 = haVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            haVar.t = baVar;
            if (baVar != null && baVar.m != haVar) {
                baVar.m = haVar;
                baVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        q6 q6Var2 = this.D;
        if (q6Var2 == null || !q6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, g7.e6.e(-2, -2, 51));
        } else {
            q6Var2.a(this.n);
        }
        bg.i iVar = new bg.i(this, 28);
        z7 z7Var = a8Var.d1;
        if (z7Var != null) {
            iVar.run(z7Var);
        } else if (!a8Var.K || Build.VERSION.SDK_INT < 24) {
            z7 z7Var2 = new z7();
            a8Var.d1 = z7Var2;
            iVar.run(z7Var2);
        } else {
            Utilities.globalQueue.postRunnable(new v7(a8Var, iVar, i9));
        }
        File file = a8Var.Z0;
        if (file == null) {
            file = a8Var.L;
        }
        this.e.E(Uri.fromFile(file), "other");
        this.e.Q(this.v0.isEmpty());
        this.e.O(true);
        if (a8Var.h) {
            j10 = (long) ((a8Var.Z * a8Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.M(j10, false);
        }
        c();
        w(true);
        boolean z10 = a8Var.u && (arrayList = a8Var.v) != null && arrayList.size() == 1 && ((MessageObject) a8Var.v.get(0)).type == 5;
        gc gcVar2 = this.B;
        File file2 = a8Var.Z0;
        if (file2 == null) {
            file2 = a8Var.L;
        }
        gcVar2.o(z10, file2.getAbsolutePath(), getDuration(), a8Var.P);
        this.B.setVideoLeft(a8Var.Z);
        this.B.setVideoRight(a8Var.a0);
        gc gcVar3 = this.B;
        if (gcVar3 == null || j10 <= 0) {
            return;
        }
        gcVar3.setProgress(j10);
    }

    public final void u(a8 a8Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (a8Var == null) {
            this.O = null;
            return;
        }
        long j10 = a8Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.O = null;
            return;
        }
        Drawable e10 = e(this.O, a8Var.a, j10, a8Var.y0);
        a8Var.x0 = e10;
        this.O = e10;
        if (this.N != e10) {
            this.N = null;
        }
        if (e10 != null) {
            e10.setCallback(this);
        }
        org.telegram.ui.Components.ba baVar = this.C;
        if (baVar != null) {
            Drawable drawable2 = this.O;
            if (drawable2 == null) {
                baVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.O.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f10 = intrinsicWidth;
                float f11 = intrinsicHeight;
                float max = Math.max(100.0f / f10, 100.0f / f11);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f10 * max);
                    intrinsicHeight = (int) (f11 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.O.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.O.draw(new Canvas(createBitmap));
                baVar.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f10;
        PointF pointF;
        if (this.g0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.i0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = g7.w.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z11 = this.l0;
            PointF pointF3 = this.h0;
            if (z11 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.j0 = f10;
                this.k0 = d;
                this.l0 = z10;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.o0;
                if (actionMasked == 0) {
                    this.q0 = 0.0f;
                    this.r0 = false;
                    invalidate();
                    this.s0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.s0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.j0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.k0);
                        float f17 = this.q0 + degrees;
                        this.q0 = f17;
                        if (!this.n0) {
                            boolean z12 = Math.abs(f17) > 20.0f;
                            this.n0 = z12;
                            if (!z12) {
                                d(matrix);
                                this.n0 = (((float) Math.round(this.W / 90.0f)) * 90.0f) - this.W > 20.0f;
                            }
                            if (!this.r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.r0 = true;
                            }
                        }
                        if (this.n0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.m0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.m0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.p0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.S;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.W / 90.0f) * 90.0f) - this.W;
                    if (this.n0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.U, this.V);
                            if (!this.r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.r0 = true;
                            }
                        } else {
                            this.r0 = false;
                        }
                    }
                    this.d.n0.set(matrix2);
                    this.d.j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.m0 = false;
                        wb wbVar = ((kb) this).y0;
                        wbVar.k1.a(true, false, wbVar.e0);
                        wbVar.k1.b(wbVar.Y0.getText());
                    }
                    this.s0 = false;
                    this.n0 = false;
                    this.q0 = 0.0f;
                    this.r0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.j0 = f10;
                this.k0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r2 <= (r11 + r9)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z10) {
        long o6;
        boolean z11;
        if (this.y == null || this.d == null) {
            return;
        }
        boolean z12 = true;
        if (this.e == null && this.x == null && !j()) {
            this.y.Q(this.v0.isEmpty());
            this.y.O(true);
            long o9 = this.y.o();
            if (!z10 || this.y.q() == -9223372036854775807L) {
                return;
            }
            float q10 = o9 / this.y.q();
            a8 a8Var = this.d;
            if ((q10 < a8Var.E || q10 > a8Var.F) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.y.L(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            o6 = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            k61 k61Var = this.e;
            if (k61Var == null) {
                k61Var = this.x;
            }
            o6 = k61Var.o();
            z11 = k61Var.z();
        }
        a8 a8Var2 = this.d;
        float f10 = a8Var2.F;
        float f11 = a8Var2.E;
        long j10 = a8Var2.C;
        long j11 = (long) ((f10 - f11) * j10);
        if (z11) {
            long j12 = a8Var2.D;
            if (o6 >= j12) {
            }
        }
        z12 = false;
        long j13 = o6 - (a8Var2.D - ((long) (f11 * j10)));
        if (this.y.z() != z12) {
            this.y.Q(z12);
            this.y.L(j13);
        } else if (z10) {
            if (Math.abs(this.y.o() - j13) > (j() ? 300 : 120)) {
                this.y.L(j13);
            }
        }
    }

    public final void x(int i9, boolean z10) {
        HashSet hashSet = this.v0;
        if (z10) {
            hashSet.add(Integer.valueOf(i9));
        } else {
            hashSet.remove(Integer.valueOf(i9));
        }
        k61 k61Var = this.e;
        if (k61Var != null) {
            k61Var.Q(hashSet.isEmpty());
        }
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long o6;
        boolean z11;
        if (this.x == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.x.Q(this.v0.isEmpty());
            this.x.O(true);
            yf.b2 b2Var = this.w;
            if (b2Var != null && !b2Var.x0) {
                b2Var.x0 = true;
                b2Var.y0.f(true, true);
                b2Var.invalidate();
            }
            long o9 = this.x.o();
            if (!z10 || this.x.q() == -9223372036854775807L) {
                return;
            }
            float q10 = o9 / this.x.q();
            a8 a8Var = this.d;
            if ((q10 < a8Var.s0 || q10 > a8Var.t0) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.x.M(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            o6 = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            o6 = this.e.o();
            z11 = this.e.z();
        }
        a8 a8Var2 = this.d;
        float f10 = a8Var2.t0;
        float f11 = a8Var2.s0;
        float f12 = a8Var2.q0;
        long j10 = (long) ((f10 - f11) * f12);
        long j11 = a8Var2.r0;
        boolean z12 = o6 >= j11 && o6 <= j10 + j11;
        boolean z13 = z11 && z12;
        long j12 = (o6 - j11) + ((long) (f11 * f12));
        yf.b2 b2Var2 = this.w;
        if (b2Var2 != null && b2Var2.x0 != z12) {
            b2Var2.x0 = z12;
            b2Var2.invalidate();
        }
        if (this.x.z() != z13) {
            this.x.Q(z13);
            this.x.M(j12, false);
        } else if (z10) {
            if (Math.abs(this.x.o() - j12) > (j() ? 300 : 120)) {
                this.x.M(j12, false);
            }
        }
    }
}
