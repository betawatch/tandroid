package di;

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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.io;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class a7 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public i0 A0;
    public e0 E;
    public uc F;
    public final org.telegram.ui.Components.la G;
    public final z6 H;
    public long I;
    public long J;
    public final y6 K;
    public final y6 L;
    public final y6 M;
    public ga N;
    public boolean O;
    public final org.telegram.ui.Components.g6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap a;
    public final float[] a0;
    public final Rect b;
    public float b0;
    public final Rect c;
    public float c0;
    public k8 d;
    public float d0;
    public h81 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.g6 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public x71 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public ig0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public ga v;
    public boolean v0;
    public rg.d2 w;
    public boolean w0;
    public h81 x;
    public long x0;
    public h81 y;
    public Runnable y0;
    public final HashSet z0;

    public a7(Context context, org.telegram.ui.Components.la laVar, z6 z6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new y6(this, 1);
        this.K = new y6(this, 2);
        this.L = new y6(this, 3);
        this.M = new y6(this, 4);
        this.P = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.g6(this, 0L, 320L, es.g);
        this.g0 = false;
        this.h0 = new Matrix();
        this.i0 = new Matrix();
        this.j0 = new Matrix();
        this.k0 = true;
        this.l0 = new PointF();
        this.m0 = new PointF();
        this.s0 = new Matrix();
        this.t0 = new Matrix();
        this.z0 = new HashSet();
        this.G = laVar;
        this.H = z6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(a7 a7Var, k8 k8Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (k8Var != null) {
            int measuredWidth = a7Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : a7Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (k8Var.K) {
                Bitmap bitmap = k8Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = k8Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(k8Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = a7Var.getContext().getContentResolver().loadThumbnail(k8Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && k8Var.K && k8Var.N == null) {
                        a7Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = k8Var.Z0;
                        if (file == null) {
                            file = k8Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        w6 w6Var = new w6(a7Var, k8Var, j11, file.getPath(), 0);
                        boolean z10 = k8Var.K;
                        bitmapArr[0] = k8.q(w6Var, measuredWidth, i10, !z10 ? k8Var.Q : 0, !z10);
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
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(a7Var, bitmapArr, k8Var, zArr, 5));
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
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
    public static Drawable f(Drawable drawable, int i10, TLRPC.WallPaper wallPaper, boolean z10) {
        int[] iArr;
        org.telegram.ui.ActionBar.e6 k10;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return io.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.b4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(gg.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.O0(string) == null || org.telegram.ui.ActionBar.g6.O0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.O0(string2) == null || !org.telegram.ui.ActionBar.g6.O0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.f6 O0 = !z10 ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = O0.d;
            SparseIntArray R0 = str3 == null ? org.telegram.ui.ActionBar.g6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.R0(new File(O0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.g6.ql;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    sparseIntArray.put(i11, iArr[i11]);
                }
            }
            k10 = O0.k(false);
            if (k10 == null) {
                k10.c(R0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < R0.size(); i12++) {
                    sparseIntArray.put(R0.keyAt(i12), R0.valueAt(i12));
                }
            }
            com.google.android.gms.internal.cast.z5 H = org.telegram.ui.ActionBar.g6.H(O0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) H.c;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) H.b;
        }
        str = string;
        if (!z10) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = O0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.g6.ql;
        if (iArr != null) {
        }
        k10 = O0.k(false);
        if (k10 == null) {
        }
        com.google.android.gms.internal.cast.z5 H2 = org.telegram.ui.ActionBar.g6.H(O0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.c;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.g6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.g6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.g6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.g6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.g6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        final cd0 cd0Var = new cd0();
        cd0Var.g = false;
        cd0Var.t(cd0Var.u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        cd0Var.o(i12, i14, i16, i18, 0, true);
        cd0Var.v(0);
        final int f7 = cd0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: di.u6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((eg.a) pair.second).b;
                org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                if (longValue != b4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                cd0 cd0Var2 = cd0Var;
                cd0Var2.t(bitmap, i19);
                cd0Var2.u(f7);
                cd0Var2.s(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th2) {
                org.telegram.tgnet.l.a(this, th2);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.l.b(this, tL_error);
            }
        });
        return cd0Var;
    }

    private void setupCollage(k8 k8Var) {
        uc ucVar = this.F;
        if (ucVar != null) {
            ucVar.setCollage(k8Var != null ? k8Var.T : null);
        }
    }

    private void setupImage(k8 k8Var) {
        Utilities.searchQueue.postRunnable(new x6(1, this, k8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        k8 k8Var;
        h81 h81Var = this.e;
        float f10 = 0.0f;
        if (h81Var != null) {
            h81Var.W((this.O || ((k8Var = this.d) != null && k8Var.Y)) ? 0.0f : k8Var != null ? k8Var.P : 1.0f);
        }
        h81 h81Var2 = this.x;
        if (h81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                k8 k8Var2 = this.d;
                f7 = k8Var2 != null ? k8Var2.u0 : 1.0f;
            }
            h81Var2.W(f7);
        }
        h81 h81Var3 = this.y;
        if (h81Var3 != null) {
            if (!this.O) {
                k8 k8Var3 = this.d;
                f10 = k8Var3 != null ? k8Var3.G : 1.0f;
            }
            h81Var3.W(f10);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.a0;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.b0 = fArr[0];
        this.c0 = fArr[1];
        k8 k8Var = this.d;
        fArr[0] = k8Var.k0;
        fArr[1] = k8Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        v7.f7.a(this.b0, this.c0, fArr[0], fArr[1]);
        k8 k8Var2 = this.d;
        fArr[0] = k8Var2.k0 / 2.0f;
        fArr[1] = k8Var2.l0;
        matrix.mapPoints(fArr);
        v7.f7.a(this.b0, this.c0, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.S != null) {
            if (this.g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            float d = ((drawable instanceof cd0) && ((cd0) drawable).u == null) ? 0.0f : this.P.d(1.0f, false);
            Drawable drawable2 = this.R;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                k8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (d * 255.0f));
            k8.j(canvas, this.S, getWidth(), getHeight());
            if (this.g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        i0 i0Var = this.A0;
        if (i0Var != null) {
            i0Var.d.b(canvas2, true);
        } else if (this.e0 && this.d != null && !j()) {
            float e = this.f0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    k8 k8Var = this.d;
                    int i10 = k8Var.k0;
                    int i11 = k8Var.l0;
                    int i12 = k8Var.Q;
                    MediaController.CropState cropState = k8Var.m0;
                    if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f7 = cropState.cropPw;
                    float f10 = cropState.cropPh;
                    float f11 = i10;
                    float f12 = i11;
                    canvas2.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                    float f13 = this.d.m0.cropScale;
                    canvas2.scale(f13, f13);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                    canvas2.rotate(this.d.m0.cropRotate + r0.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    k8 k8Var2 = this.d;
                    canvas2.translate((-k8Var2.k0) / 2.0f, (-k8Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                k8 k8Var3 = this.d;
                int i13 = k8Var3.k0;
                int i14 = k8Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x017d, code lost:
    
        if (r1 != false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        kc kcVar = ((yb) this).C0;
        ac acVar = kcVar.c1;
        boolean z10 = false;
        if (acVar == null || !acVar.O1) {
            gg0 gg0Var = kcVar.C1;
            yc0 yc0Var = gg0Var.I;
            if (gg0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    gg0Var.y = false;
                    gg0Var.E = System.currentTimeMillis();
                    gg0Var.F = motionEvent.getX();
                    gg0Var.G = motionEvent.getY();
                    ig0 ig0Var = gg0Var.w;
                    if (ig0Var != null) {
                        gg0Var.H = ig0Var.getEnhanceValue();
                    }
                    z10 = true;
                    if (motionEvent.getAction() == 0) {
                        this.x0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.x0 <= ViewConfiguration.getTapTimeout() && (runnable = this.y0) != null) {
                            runnable.run();
                        }
                        this.x0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.x0 = 0L;
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
                    float y3 = motionEvent.getY();
                    if (!gg0Var.y && System.currentTimeMillis() - gg0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(gg0Var.G - y3) < Math.abs(gg0Var.F - x10) && Math.abs(gg0Var.F - x10) > AndroidUtilities.touchSlop) {
                        gg0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(yc0Var);
                        gg0Var.r = true;
                        gg0Var.invalidate();
                    }
                    if (gg0Var.y) {
                        float f7 = x10 - gg0Var.F;
                        if (gg0Var.w == null) {
                            gg0Var.x.run();
                        }
                        ig0 ig0Var2 = gg0Var.w;
                        if (ig0Var2 == null) {
                            gg0Var.y = false;
                        } else {
                            float enhanceValue = ig0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f7 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(gg0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(gg0Var);
                                    gg0Var.H = clamp;
                                }
                            } else {
                                try {
                                    gg0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                gg0Var.H = clamp;
                            }
                            gg0Var.w.setEnhanceValue(clamp);
                            ig0 ig0Var3 = gg0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((ig0Var3 == null ? 0.0f : ig0Var3.getEnhanceValue()) * 100.0f), gg0Var.b, gg0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            gg0Var.f = staticLayout;
                            gg0Var.h = staticLayout.getLineCount() > 0 ? gg0Var.f.getLineWidth(0) : 0.0f;
                            gg0Var.n = gg0Var.f.getLineCount() > 0 ? gg0Var.f.getLineLeft(0) : 0.0f;
                            gg0Var.invalidate();
                        }
                    }
                    gg0Var.F = x10;
                    gg0Var.G = y3;
                } else if (action == 1 || action == 3) {
                    gg0Var.y = false;
                    gg0Var.E = -1L;
                    ig0 ig0Var4 = gg0Var.w;
                    if (ig0Var4 != null) {
                        gg0Var.H = ig0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(yc0Var, 600L);
                }
            } else if (gg0Var.r) {
                gg0Var.r = false;
                gg0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        k8 k8Var;
        k8 k8Var2;
        x71 x71Var = this.n;
        if (view == x71Var && (k8Var2 = this.d) != null && k8Var2.u) {
            return false;
        }
        if ((view != x71Var && view != this.r) || (k8Var = this.d) == null || k8Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            k8 k8Var3 = this.d;
            int i10 = k8Var3.k0;
            int i11 = k8Var3.l0;
            int i12 = k8Var3.Q;
            MediaController.CropState cropState = k8Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f7 = cropState.cropPw;
            float f10 = cropState.cropPh;
            canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            k8 k8Var4 = this.d;
            canvas.translate((-k8Var4.k0) / 2.0f, (-k8Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.l0;
    }

    public int getContentWidth() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.k0;
    }

    public long getCurrentPosition() {
        h81 h81Var = this.e;
        if (h81Var != null) {
            return h81Var.n();
        }
        h81 h81Var2 = this.x;
        if (h81Var2 != null) {
            return h81Var2.n();
        }
        h81 h81Var3 = this.y;
        if (h81Var3 != null) {
            return h81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        k8 k8Var = this.d;
        if (k8Var != null) {
            double d = k8Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        h81 h81Var = this.e;
        if (h81Var == null || h81Var.p() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.p();
    }

    public int getOrientation() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 0;
        }
        return k8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public x71 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        x71 x71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (x71Var = this.n) != null) {
                    bitmapArr[i10] = x71Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i10].getWidth(), dp2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new v6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        k8 k8Var;
        return (this.E == null || (k8Var = this.d) == null || !k8Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(k8 k8Var) {
        this.d = k8Var;
        if (k8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (k8Var.K) {
            setupImage(k8Var);
            if (k8Var.A0 == 0 && k8Var.B0 == 0) {
                k8Var.z(new y6(this, 0));
            } else {
                r();
            }
        } else {
            setupImage(k8Var);
            r();
        }
        b();
        u(k8Var);
        p(k8Var, false);
        s(k8Var, null, false);
    }

    public final void m(long j10) {
        h81 h81Var = this.e;
        if (h81Var != null) {
            h81Var.L(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            h81 h81Var2 = this.x;
            if (h81Var2 != null) {
                h81Var2.L(j10, false);
            } else {
                h81 h81Var3 = this.y;
                if (h81Var3 != null) {
                    h81Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(k8 k8Var, ma maVar, long j10) {
        this.d = k8Var;
        if (k8Var == null) {
            t(null, maVar, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (k8Var.v()) {
            setupImage(null);
            t(null, maVar, j10);
            setupCollage(k8Var);
        } else if (k8Var.K) {
            setupImage(k8Var);
            setupCollage(null);
            t(k8Var, maVar, j10);
            if (k8Var.A0 == 0 && k8Var.B0 == 0) {
                k8Var.z(new y6(this, 0));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, maVar, 0L);
            setupImage(k8Var);
            r();
        }
        b();
        u(k8Var);
        p(k8Var, false);
        s(k8Var, null, false);
    }

    public final void o(TextureView textureView, ig0 ig0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = ig0Var;
        this.r = textureView;
        if (ig0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            h00 h00Var = ig0Var.l0;
            if (h00Var != null) {
                h00Var.i(i10, i11);
            } else {
                ig0Var.J0 = i10;
                ig0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.k0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(k8 k8Var, boolean z10) {
        boolean z11;
        h81 h81Var = this.y;
        if (h81Var != null) {
            h81Var.B();
            this.y.H();
            this.y = null;
        }
        if (k8Var == null) {
            return;
        }
        uc ucVar = this.F;
        boolean z12 = false;
        if (ucVar != null) {
            String str = k8Var.y;
            String str2 = k8Var.A;
            String str3 = k8Var.B;
            long j10 = k8Var.C;
            long j11 = k8Var.D;
            float f7 = k8Var.E;
            float f10 = k8Var.F;
            float f11 = k8Var.G;
            if (!TextUtils.equals(ucVar.O, str)) {
                nc ncVar = ucVar.a0;
                if (ncVar != null) {
                    ncVar.a();
                    ucVar.a0 = null;
                    ucVar.U = false;
                }
                ucVar.O = str;
                ucVar.p();
            }
            ucVar.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            ucVar.N = !isEmpty;
            if (isEmpty) {
                ucVar.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (ucVar.N) {
                ucVar.R = j10;
                ucVar.Q = j11 - ((long) (j10 * f7));
                ucVar.S = f7;
                ucVar.T = f10;
                ucVar.V = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, ucVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ucVar.M0 = staticLayout;
                    ucVar.N0 = staticLayout.getLineCount() > 0 ? ucVar.M0.getLineWidth(0) : 0.0f;
                    ucVar.O0 = ucVar.M0.getLineCount() > 0 ? ucVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    ucVar.N0 = 0.0f;
                    ucVar.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, ucVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ucVar.Q0 = staticLayout2;
                    ucVar.R0 = staticLayout2.getLineCount() > 0 ? ucVar.Q0.getLineWidth(0) : 0.0f;
                    ucVar.S0 = ucVar.Q0.getLineCount() > 0 ? ucVar.Q0.getLineLeft(0) : 0.0f;
                } else {
                    ucVar.R0 = 0.0f;
                    ucVar.Q0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                ucVar.e0.f(ucVar.N, true);
            }
            ucVar.invalidate();
        } else {
            z11 = true;
        }
        if (k8Var.y != null) {
            h81 h81Var2 = new h81();
            this.y = h81Var2;
            h81Var2.y = z11;
            h81Var2.J = new qb.c(this, 16);
            h81Var2.D(Uri.fromFile(new File(k8Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (k8Var.Z * getDuration());
                this.e.L(duration, false);
                this.F.setProgress(duration);
            }
            z11 = true;
            w(true);
        }
        kc kcVar = ((yb) this).C0;
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            k8 k8Var2 = kcVar.K1;
            if (k8Var2 != null && k8Var2.y != null) {
                z12 = z11;
            }
            mbVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        k8 k8Var = this.d;
        if (k8Var != null) {
            k8Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                k8Var.y = null;
                k8Var.z = null;
                k8Var.A = null;
                k8Var.B = null;
                k8Var.D = 0L;
                k8Var.C = 0L;
                k8Var.E = 0.0f;
                k8Var.F = 1.0f;
            } else {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.id != 0) {
                    this.d.z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.z;
                    inputDocument.id = document.id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            k8 k8Var2 = this.d;
                            k8Var2.y = null;
                            k8Var2.z = null;
                            k8Var2.A = null;
                            k8Var2.B = null;
                            k8Var2.D = 0L;
                            k8Var2.C = 0L;
                            k8Var2.E = 0.0f;
                            k8Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                k8 k8Var3 = this.d;
                k8Var3.A = null;
                k8Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i11);
                        i11++;
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
                k8 k8Var4 = this.d;
                k8Var4.D = 0L;
                if (k8Var4.K) {
                    k8Var4.D = (long) (k8Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        k8 k8Var5 = ((d0) obj).n;
                        if (k8Var5 != null && k8Var5.K) {
                            duration = this.E.getDuration();
                            break;
                        }
                    }
                }
                k8 k8Var6 = this.d;
                duration = k8Var6.K ? getDuration() : k8Var6.C;
                uc ucVar = this.F;
                int maxCount = ucVar == null ? 1 : ucVar.getMaxCount();
                k8 k8Var7 = this.d;
                k8Var7.F = k8Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        k8 k8Var = this.d;
        int i10 = k8Var.A0;
        Paint paint = this.T;
        if (i10 == 0 || k8Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new k4(this, measuredHeight, 1).run(m0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f7 = measuredHeight;
            k8 k8Var2 = this.d;
            int i11 = k8Var2.A0;
            this.U = i11;
            int i12 = k8Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            x71 x71Var = this.n;
            if (x71Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                h00 h00Var = x71Var.b;
                if (h00Var == null) {
                    x71Var.n = i13;
                    x71Var.r = i14;
                } else {
                    h00Var.i(i13, i14);
                }
            }
            ig0 ig0Var = this.s;
            if (ig0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                h00 h00Var2 = ig0Var.l0;
                if (h00Var2 != null) {
                    h00Var2.i(i15, i16);
                } else {
                    ig0Var.J0 = i15;
                    ig0Var.K0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(k8 k8Var, rg.d2 d2Var, boolean z10) {
        h81 h81Var;
        if (k8Var == null || k8Var.o0 == null) {
            h81 h81Var2 = this.x;
            if (h81Var2 != null) {
                h81Var2.B();
                this.x.H();
                this.x = null;
            }
            uc ucVar = this.F;
            if (ucVar != null) {
                ucVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.K);
            return;
        }
        h81 h81Var3 = this.x;
        if (h81Var3 != null) {
            h81Var3.H();
            this.x = null;
        }
        h81 h81Var4 = new h81();
        this.x = h81Var4;
        h81Var4.y = true;
        h81Var4.J = new a6.i(this, 15);
        this.x.D(Uri.fromFile(k8Var.o0), "other");
        c();
        this.w = d2Var;
        if (d2Var != null && (h81Var = this.x) != null) {
            h81Var.V(d2Var.u0);
        }
        this.F.n(k8Var.o0.getAbsolutePath(), k8Var.q0, k8Var.r0, k8Var.s0, k8Var.t0, k8Var.u0, z10);
        y(true);
    }

    public void set(k8 k8Var) {
        n(k8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.k0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.E = e0Var;
    }

    public void setCropEditorDrawing(i0 i0Var) {
        if (this.A0 != i0Var) {
            this.A0 = i0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.y0 = runnable;
    }

    public void setVideoTimelineView(uc ucVar) {
        this.F = ucVar;
        if (ucVar != null) {
            ucVar.setDelegate(new ya.c(this, 16));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(k8 k8Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ra raVar;
        int i10 = 5;
        if (k8Var == null || k8Var.v()) {
            h81 h81Var = this.e;
            if (h81Var != null) {
                h81Var.B();
                this.e.H();
                this.e = null;
            }
            z6 z6Var = this.H;
            if (z6Var == null || !z6Var.g) {
                x71 x71Var = this.n;
                if (x71Var != null) {
                    x71Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new y6(this, i10)).start();
                }
            } else {
                z6Var.a(null);
            }
            uc ucVar = this.F;
            if (ucVar != null) {
                ucVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.K);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        h81 h81Var2 = this.e;
        if (h81Var2 != null) {
            h81Var2.H();
            this.e = null;
        }
        int i11 = 0;
        h81 h81Var3 = new h81();
        this.e = h81Var3;
        h81Var3.y = true;
        h81Var3.J = new androidx.biometric.e(this, k8Var, new Runnable[]{runnable});
        x71 x71Var2 = this.n;
        if (x71Var2 != null) {
            x71Var2.clearAnimation();
            x71 x71Var3 = this.n;
            h00 h00Var = x71Var3.b;
            if (h00Var != null) {
                h00Var.postRunnable(new e00(h00Var, i11));
            }
            x71Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new x71(getContext(), this.e);
        this.G.e();
        x71 x71Var4 = this.n;
        org.telegram.ui.Components.la laVar = k8Var.u ? null : this.G;
        x71Var4.s = laVar;
        h00 h00Var2 = x71Var4.b;
        if (h00Var2 != null && (raVar = h00Var2.I) != null) {
            org.telegram.ui.Components.la laVar2 = raVar.t;
            if (laVar2 != null && laVar2.m != null) {
                laVar2.m = null;
            }
            raVar.t = laVar;
            if (laVar != null && laVar.m != raVar) {
                laVar.m = raVar;
                laVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        z6 z6Var2 = this.H;
        if (z6Var2 == null || !z6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, w7.a6.e(-2, -2, 51));
        } else {
            z6Var2.a(this.n);
        }
        bi.o1 o1Var = new bi.o1(this, 13);
        j8 j8Var = k8Var.d1;
        if (j8Var != null) {
            o1Var.run(j8Var);
        } else if (!k8Var.K || Build.VERSION.SDK_INT < 24) {
            j8 j8Var2 = new j8();
            k8Var.d1 = j8Var2;
            o1Var.run(j8Var2);
        } else {
            Utilities.globalQueue.postRunnable(new f8(k8Var, o1Var, i11));
        }
        File file = k8Var.Z0;
        if (file == null) {
            file = k8Var.L;
        }
        this.e.D(Uri.fromFile(file), "other");
        this.e.P(this.z0.isEmpty());
        this.e.N(true);
        long j11 = k8Var.h ? (long) ((k8Var.Z * k8Var.h0) + j10) : j10;
        if (j11 > 0) {
            this.e.L(j11, false);
        }
        c();
        w(true);
        boolean z10 = k8Var.u && (arrayList = k8Var.v) != null && arrayList.size() == 1 && ((MessageObject) k8Var.v.get(0)).type == 5;
        uc ucVar2 = this.F;
        File file2 = k8Var.Z0;
        if (file2 == null) {
            file2 = k8Var.L;
        }
        ucVar2.o(z10, file2.getAbsolutePath(), getDuration(), k8Var.P);
        this.F.setVideoLeft(k8Var.Z);
        this.F.setVideoRight(k8Var.a0);
        uc ucVar3 = this.F;
        if (ucVar3 == null || j11 <= 0) {
            return;
        }
        ucVar3.setProgress(j11);
    }

    public final void u(k8 k8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (k8Var == null) {
            this.S = null;
            return;
        }
        long j10 = k8Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e = e(this.S, k8Var.a, j10, k8Var.y0);
        k8Var.x0 = e;
        this.S = e;
        if (this.R != e) {
            this.R = null;
        }
        if (e != null) {
            e.setCallback(this);
        }
        org.telegram.ui.Components.la laVar = this.G;
        if (laVar != null) {
            Drawable drawable2 = this.S;
            if (drawable2 == null) {
                laVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                laVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.S.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f7 = intrinsicWidth;
                float f10 = intrinsicHeight;
                float max = Math.max(100.0f / f7, 100.0f / f10);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f7 * max);
                    intrinsicHeight = (int) (f10 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.S.draw(new Canvas(createBitmap));
                laVar.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f7;
        PointF pointF;
        if (this.k0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = v7.f7.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z11 = this.p0;
            PointF pointF3 = this.l0;
            if (z11 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.n0 = f7;
                this.o0 = d;
                this.p0 = z10;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.s0;
                if (actionMasked == 0) {
                    this.u0 = 0.0f;
                    this.v0 = false;
                    invalidate();
                    this.w0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.o0);
                        float f16 = this.u0 + degrees;
                        this.u0 = f16;
                        if (!this.r0) {
                            boolean z12 = Math.abs(f16) > 20.0f;
                            this.r0 = z12;
                            if (!z12) {
                                d(matrix);
                                this.r0 = (((float) Math.round(this.d0 / 90.0f)) * 90.0f) - this.d0 > 20.0f;
                            }
                            if (!this.v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.v0 = true;
                            }
                        }
                        if (this.r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.d0 / 90.0f) * 90.0f) - this.d0;
                    if (this.r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.b0, this.c0);
                            if (!this.v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.v0 = true;
                            }
                        } else {
                            this.v0 = false;
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
                        this.q0 = false;
                        kc kcVar = ((yb) this).C0;
                        kcVar.o1.a(true, false, kcVar.i0);
                        kcVar.o1.b(kcVar.c1.getText());
                    }
                    this.w0 = false;
                    this.r0 = false;
                    this.u0 = 0.0f;
                    this.v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.n0 = f7;
                this.o0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.S == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r2 <= (r11 + r9)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z10) {
        long n10;
        boolean y3;
        if (this.y == null || this.d == null) {
            return;
        }
        boolean z11 = true;
        if (this.e == null && this.x == null && !j()) {
            this.y.P(this.z0.isEmpty());
            this.y.N(true);
            long n11 = this.y.n();
            if (!z10 || this.y.p() == -9223372036854775807L) {
                return;
            }
            float p5 = n11 / this.y.p();
            k8 k8Var = this.d;
            if ((p5 < k8Var.E || p5 > k8Var.F) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.y.K(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            n10 = this.E.getPositionWithOffset();
            y3 = this.E.q0;
        } else {
            h81 h81Var = this.e;
            if (h81Var == null) {
                h81Var = this.x;
            }
            n10 = h81Var.n();
            y3 = h81Var.y();
        }
        k8 k8Var2 = this.d;
        float f7 = k8Var2.F;
        float f10 = k8Var2.E;
        long j10 = k8Var2.C;
        long j11 = (long) ((f7 - f10) * j10);
        if (y3) {
            long j12 = k8Var2.D;
            if (n10 >= j12) {
            }
        }
        z11 = false;
        long j13 = n10 - (k8Var2.D - ((long) (f10 * j10)));
        if (this.y.y() != z11) {
            this.y.P(z11);
            this.y.K(j13);
        } else if (z10) {
            if (Math.abs(this.y.n() - j13) > (j() ? 300 : 120)) {
                this.y.K(j13);
            }
        }
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        h81 h81Var = this.e;
        if (h81Var != null) {
            h81Var.P(hashSet.isEmpty());
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long n10;
        boolean y3;
        if (this.x == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.x.P(this.z0.isEmpty());
            this.x.N(true);
            rg.d2 d2Var = this.w;
            if (d2Var != null && !d2Var.B0) {
                d2Var.B0 = true;
                d2Var.C0.f(true, true);
                d2Var.invalidate();
            }
            long n11 = this.x.n();
            if (!z10 || this.x.p() == -9223372036854775807L) {
                return;
            }
            float p5 = n11 / this.x.p();
            k8 k8Var = this.d;
            if ((p5 < k8Var.s0 || p5 > k8Var.t0) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.x.L(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            n10 = this.E.getPositionWithOffset();
            y3 = this.E.q0;
        } else {
            n10 = this.e.n();
            y3 = this.e.y();
        }
        k8 k8Var2 = this.d;
        float f7 = k8Var2.t0;
        float f10 = k8Var2.s0;
        float f11 = k8Var2.q0;
        long j10 = (long) ((f7 - f10) * f11);
        long j11 = k8Var2.r0;
        boolean z11 = n10 >= j11 && n10 <= j10 + j11;
        boolean z12 = y3 && z11;
        long j12 = (n10 - j11) + ((long) (f10 * f11));
        rg.d2 d2Var2 = this.w;
        if (d2Var2 != null && d2Var2.B0 != z11) {
            d2Var2.B0 = z11;
            d2Var2.invalidate();
        }
        if (this.x.y() != z12) {
            this.x.P(z12);
            this.x.L(j12, false);
        } else if (z10) {
            if (Math.abs(this.x.n() - j12) > (j() ? 300 : 120)) {
                this.x.L(j12, false);
            }
        }
    }
}
