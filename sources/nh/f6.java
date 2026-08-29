package nh;

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
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class f6 extends FrameLayout {
    public static final /* synthetic */ int x0 = 0;
    public e0 A;
    public qb B;
    public final org.telegram.ui.Components.ga C;
    public final e6 D;
    public long E;
    public long F;
    public final a6 G;
    public final a6 H;
    public final a6 I;
    public g9 J;
    public boolean K;
    public final org.telegram.ui.Components.d6 L;
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
    public final org.telegram.ui.Components.d6 b0;
    public final Rect c;
    public boolean c0;
    public o7 d;
    public final Matrix d0;
    public x61 e;
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
    public l61 n;
    public boolean n0;
    public final Matrix o0;
    public final Matrix p0;
    public float q0;
    public TextureView r;
    public boolean r0;
    public ef0 s;
    public boolean s0;
    public long t0;
    public Runnable u0;
    public g9 v;
    public final HashSet v0;
    public bg.f3 w;
    public j0 w0;
    public x61 x;
    public x61 y;

    public f6(Context context, org.telegram.ui.Components.ga gaVar, e6 e6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new a6(this, 2);
        this.G = new a6(this, 3);
        this.H = new a6(this, 4);
        this.I = new a6(this, 5);
        this.L = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.a0 = true;
        this.b0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.g);
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
        this.C = gaVar;
        this.D = e6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f6 f6Var, o7 o7Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (o7Var != null) {
            int measuredWidth = f6Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : f6Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (o7Var.K) {
                Bitmap bitmap = o7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = o7Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(o7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = f6Var.getContext().getContentResolver().loadThumbnail(o7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && o7Var.K && o7Var.N == null) {
                        f6Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = o7Var.Z0;
                        if (file == null) {
                            file = o7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        b9.d dVar = new b9.d(f6Var, o7Var, j11, file.getPath(), 4);
                        boolean z10 = o7Var.K;
                        bitmapArr[0] = o7.q(dVar, measuredWidth, i10, !z10 ? o7Var.Q : 0, !z10);
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
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(f6Var, bitmapArr, o7Var, zArr, 17));
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
        org.telegram.ui.ActionBar.e6 k9;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return wn.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.b4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(qf.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.f6 N0 = !z10 ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = N0.d;
            SparseIntArray Q0 = str3 == null ? org.telegram.ui.ActionBar.g6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.g6.nl;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    sparseIntArray.put(i11, iArr[i11]);
                }
            }
            k9 = N0.k(false);
            if (k9 == null) {
                k9.c(Q0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < Q0.size(); i12++) {
                    sparseIntArray.put(Q0.keyAt(i12), Q0.valueAt(i12));
                }
            }
            a5.j H = org.telegram.ui.ActionBar.g6.H(N0, sparseIntArray, strArr[0], 0, true);
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
        iArr = org.telegram.ui.ActionBar.g6.nl;
        if (iArr != null) {
        }
        k9 = N0.k(false);
        if (k9 == null) {
        }
        a5.j H2 = org.telegram.ui.ActionBar.g6.H(N0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
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
        int i12 = h.get(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.g6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.g6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.g6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        final yb0 yb0Var = new yb0();
        yb0Var.g = false;
        yb0Var.t(yb0Var.u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        yb0Var.o(i12, i14, i16, i18, 0, true);
        yb0Var.v(0);
        final int f9 = yb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: nh.y5
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((of.a) pair.second).b;
                org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                if (longValue != b4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                yb0 yb0Var2 = yb0Var;
                yb0Var2.t(bitmap, i19);
                yb0Var2.u(f9);
                yb0Var2.s(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th2) {
                org.telegram.tgnet.k.a(this, th2);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return yb0Var;
    }

    private void setupCollage(o7 o7Var) {
        qb qbVar = this.B;
        if (qbVar != null) {
            qbVar.setCollage(o7Var != null ? o7Var.T : null);
        }
    }

    private void setupImage(o7 o7Var) {
        Utilities.searchQueue.postRunnable(new b6(1, this, o7Var));
    }

    public abstract void b();

    public final void c() {
        float f9;
        o7 o7Var;
        x61 x61Var = this.e;
        float f10 = 0.0f;
        if (x61Var != null) {
            x61Var.X((this.K || ((o7Var = this.d) != null && o7Var.Y)) ? 0.0f : o7Var != null ? o7Var.P : 1.0f);
        }
        x61 x61Var2 = this.x;
        if (x61Var2 != null) {
            if (this.K) {
                f9 = 0.0f;
            } else {
                o7 o7Var2 = this.d;
                f9 = o7Var2 != null ? o7Var2.u0 : 1.0f;
            }
            x61Var2.X(f9);
        }
        x61 x61Var3 = this.y;
        if (x61Var3 != null) {
            if (!this.K) {
                o7 o7Var3 = this.d;
                f10 = o7Var3 != null ? o7Var3.G : 1.0f;
            }
            x61Var3.X(f10);
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setMuted(this.K);
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
        o7 o7Var = this.d;
        fArr[0] = o7Var.k0;
        fArr[1] = o7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        i7.z5.a(this.U, this.V, fArr[0], fArr[1]);
        o7 o7Var2 = this.d;
        fArr[0] = o7Var2.k0 / 2.0f;
        fArr[1] = o7Var2.l0;
        matrix.mapPoints(fArr);
        i7.z5.a(this.U, this.V, fArr[0], fArr[1]);
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
            float d = ((drawable instanceof yb0) && ((yb0) drawable).u == null) ? 0.0f : this.L.d(1.0f, false);
            Drawable drawable2 = this.N;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                o7.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (d * 255.0f));
            o7.j(canvas, this.O, getWidth(), getHeight());
            if (this.c0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.P);
        }
        j0 j0Var = this.w0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.a0 && this.d != null && !j()) {
            float e10 = this.b0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    o7 o7Var = this.d;
                    int i10 = o7Var.k0;
                    int i11 = o7Var.l0;
                    int i12 = o7Var.Q;
                    MediaController.CropState cropState = o7Var.m0;
                    if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f9 = cropState.cropPw;
                    float f10 = cropState.cropPh;
                    float f11 = i10;
                    float f12 = i11;
                    canvas2.clipRect(((-i10) * f9) / 2.0f, ((-i11) * f10) / 2.0f, (f9 * f11) / 2.0f, (f10 * f12) / 2.0f);
                    float f13 = this.d.m0.cropScale;
                    canvas2.scale(f13, f13);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f11, cropState2.cropPy * f12);
                    canvas2.rotate(this.d.m0.cropRotate + r0.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    o7 o7Var2 = this.d;
                    canvas2.translate((-o7Var2.k0) / 2.0f, (-o7Var2.l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                o7 o7Var3 = this.d;
                int i13 = o7Var3.k0;
                int i14 = o7Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i13, i14);
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
        gb gbVar = ((va) this).y0;
        wa waVar = gbVar.Y0;
        boolean z10 = false;
        if (waVar == null || !waVar.K1) {
            cf0 cf0Var = gbVar.y1;
            xb0 xb0Var = cf0Var.E;
            if (cf0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    cf0Var.y = false;
                    cf0Var.A = System.currentTimeMillis();
                    cf0Var.B = motionEvent.getX();
                    cf0Var.C = motionEvent.getY();
                    ef0 ef0Var = cf0Var.w;
                    if (ef0Var != null) {
                        cf0Var.D = ef0Var.getEnhanceValue();
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
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    if (!cf0Var.y && System.currentTimeMillis() - cf0Var.A <= ViewConfiguration.getLongPressTimeout() && Math.abs(cf0Var.C - y8) < Math.abs(cf0Var.B - x4) && Math.abs(cf0Var.B - x4) > AndroidUtilities.touchSlop) {
                        cf0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(xb0Var);
                        cf0Var.r = true;
                        cf0Var.invalidate();
                    }
                    if (cf0Var.y) {
                        float f9 = x4 - cf0Var.B;
                        if (cf0Var.w == null) {
                            cf0Var.x.run();
                        }
                        ef0 ef0Var2 = cf0Var.w;
                        if (ef0Var2 == null) {
                            cf0Var.y = false;
                        } else {
                            float enhanceValue = ef0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f9 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(cf0Var.D * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(cf0Var);
                                    cf0Var.D = clamp;
                                }
                            } else {
                                try {
                                    cf0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                cf0Var.D = clamp;
                            }
                            cf0Var.w.setEnhanceValue(clamp);
                            ef0 ef0Var3 = cf0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((ef0Var3 == null ? 0.0f : ef0Var3.getEnhanceValue()) * 100.0f), cf0Var.b, cf0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            cf0Var.f = staticLayout;
                            cf0Var.h = staticLayout.getLineCount() > 0 ? cf0Var.f.getLineWidth(0) : 0.0f;
                            cf0Var.n = cf0Var.f.getLineCount() > 0 ? cf0Var.f.getLineLeft(0) : 0.0f;
                            cf0Var.invalidate();
                        }
                    }
                    cf0Var.B = x4;
                    cf0Var.C = y8;
                } else if (action == 1 || action == 3) {
                    cf0Var.y = false;
                    cf0Var.A = -1L;
                    ef0 ef0Var4 = cf0Var.w;
                    if (ef0Var4 != null) {
                        cf0Var.D = ef0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(xb0Var, 600L);
                }
            } else if (cf0Var.r) {
                cf0Var.r = false;
                cf0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o7 o7Var;
        o7 o7Var2;
        l61 l61Var = this.n;
        if (view == l61Var && (o7Var2 = this.d) != null && o7Var2.u) {
            return false;
        }
        if ((view != l61Var && view != this.r) || (o7Var = this.d) == null || o7Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            o7 o7Var3 = this.d;
            int i10 = o7Var3.k0;
            int i11 = o7Var3.l0;
            int i12 = o7Var3.Q;
            MediaController.CropState cropState = o7Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f9 = cropState.cropPw;
            float f10 = cropState.cropPh;
            canvas.clipRect(((-i10) * f9) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f9) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            o7 o7Var4 = this.d;
            canvas.translate((-o7Var4.k0) / 2.0f, (-o7Var4.l0) / 2.0f);
        }
        canvas.concat(this.d0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 1;
        }
        return o7Var.l0;
    }

    public int getContentWidth() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 1;
        }
        return o7Var.k0;
    }

    public long getCurrentPosition() {
        x61 x61Var = this.e;
        if (x61Var != null) {
            return x61Var.o();
        }
        x61 x61Var2 = this.x;
        if (x61Var2 != null) {
            return x61Var2.o();
        }
        x61 x61Var3 = this.y;
        if (x61Var3 != null) {
            return x61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        o7 o7Var = this.d;
        if (o7Var != null) {
            double d = o7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        x61 x61Var = this.e;
        if (x61Var == null || x61Var.q() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.q();
    }

    public int getOrientation() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 0;
        }
        return o7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public l61 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        l61 l61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (l61Var = this.n) != null) {
                    bitmapArr[i10] = l61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new z5(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        o7 o7Var;
        return (this.A == null || (o7Var = this.d) == null || !o7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.v0.contains(-9982);
    }

    public final void l(o7 o7Var) {
        this.d = o7Var;
        if (o7Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o7Var.K) {
            setupImage(o7Var);
            if (o7Var.A0 == 0 && o7Var.B0 == 0) {
                o7Var.z(new a6((va) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(o7Var);
            r();
        }
        b();
        u(o7Var);
        p(o7Var, false);
        s(o7Var, null, false);
    }

    public final void m(long j10) {
        x61 x61Var = this.e;
        if (x61Var != null) {
            x61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            x61 x61Var2 = this.x;
            if (x61Var2 != null) {
                x61Var2.M(j10, false);
            } else {
                x61 x61Var3 = this.y;
                if (x61Var3 != null) {
                    x61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(o7 o7Var, m9 m9Var, long j10) {
        this.d = o7Var;
        if (o7Var == null) {
            t(null, m9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o7Var.v()) {
            setupImage(null);
            t(null, m9Var, j10);
            setupCollage(o7Var);
        } else if (o7Var.K) {
            setupImage(o7Var);
            setupCollage(null);
            t(o7Var, m9Var, j10);
            if (o7Var.A0 == 0 && o7Var.B0 == 0) {
                o7Var.z(new a6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, m9Var, 0L);
            setupImage(o7Var);
            r();
        }
        b();
        u(o7Var);
        p(o7Var, false);
        s(o7Var, null, false);
    }

    public final void o(TextureView textureView, ef0 ef0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = ef0Var;
        this.r = textureView;
        if (ef0Var != null) {
            int i10 = this.Q;
            int i11 = this.R;
            qz qzVar = ef0Var.h0;
            if (qzVar != null) {
                qzVar.i(i10, i11);
            } else {
                ef0Var.F0 = i10;
                ef0Var.G0 = i11;
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

    public final void p(o7 o7Var, boolean z10) {
        boolean z11;
        x61 x61Var = this.y;
        if (x61Var != null) {
            x61Var.C();
            this.y.I();
            this.y = null;
        }
        if (o7Var == null) {
            return;
        }
        qb qbVar = this.B;
        boolean z12 = false;
        if (qbVar != null) {
            String str = o7Var.y;
            String str2 = o7Var.A;
            String str3 = o7Var.B;
            long j10 = o7Var.C;
            long j11 = o7Var.D;
            float f9 = o7Var.E;
            float f10 = o7Var.F;
            float f11 = o7Var.G;
            if (!TextUtils.equals(qbVar.K, str)) {
                jb jbVar = qbVar.T;
                if (jbVar != null) {
                    jbVar.a();
                    qbVar.T = null;
                    qbVar.Q = false;
                }
                qbVar.K = str;
                qbVar.p();
            }
            qbVar.K = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            qbVar.J = !isEmpty;
            if (isEmpty) {
                qbVar.L = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (qbVar.J) {
                qbVar.N = j10;
                qbVar.M = j11 - ((long) (j10 * f9));
                qbVar.O = f9;
                qbVar.P = f10;
                qbVar.R = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, qbVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    qbVar.I0 = staticLayout;
                    qbVar.J0 = staticLayout.getLineCount() > 0 ? qbVar.I0.getLineWidth(0) : 0.0f;
                    qbVar.K0 = qbVar.I0.getLineCount() > 0 ? qbVar.I0.getLineLeft(0) : 0.0f;
                } else {
                    qbVar.J0 = 0.0f;
                    qbVar.I0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, qbVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    qbVar.M0 = staticLayout2;
                    qbVar.N0 = staticLayout2.getLineCount() > 0 ? qbVar.M0.getLineWidth(0) : 0.0f;
                    qbVar.O0 = qbVar.M0.getLineCount() > 0 ? qbVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    qbVar.N0 = 0.0f;
                    qbVar.M0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                qbVar.a0.f(qbVar.J, true);
            }
            qbVar.invalidate();
        } else {
            z11 = true;
        }
        if (o7Var.y != null) {
            x61 x61Var2 = new x61();
            this.y = x61Var2;
            x61Var2.y = z11;
            x61Var2.F = new d6(this, 0);
            x61Var2.E(Uri.fromFile(new File(o7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (o7Var.Z * getDuration());
                this.e.M(duration, false);
                this.B.setProgress(duration);
            }
            w(true);
        }
        gb gbVar = ((va) this).y0;
        ja jaVar = gbVar.r1;
        if (jaVar != null) {
            o7 o7Var2 = gbVar.G1;
            if (o7Var2 != null && o7Var2.y != null) {
                z12 = true;
            }
            jaVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                o7Var.y = null;
                o7Var.z = null;
                o7Var.A = null;
                o7Var.B = null;
                o7Var.D = 0L;
                o7Var.C = 0L;
                o7Var.E = 0.0f;
                o7Var.F = 1.0f;
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
                            o7 o7Var2 = this.d;
                            o7Var2.y = null;
                            o7Var2.z = null;
                            o7Var2.A = null;
                            o7Var2.B = null;
                            o7Var2.D = 0L;
                            o7Var2.C = 0L;
                            o7Var2.E = 0.0f;
                            o7Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                o7 o7Var3 = this.d;
                o7Var3.A = null;
                o7Var3.B = null;
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
                o7 o7Var4 = this.d;
                o7Var4.D = 0L;
                if (o7Var4.K) {
                    o7Var4.D = (long) (o7Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        o7 o7Var5 = ((d0) obj).n;
                        if (o7Var5 != null && o7Var5.K) {
                            duration = this.A.getDuration();
                            break;
                        }
                    }
                }
                o7 o7Var6 = this.d;
                duration = o7Var6.K ? getDuration() : o7Var6.C;
                qb qbVar = this.B;
                int maxCount = qbVar == null ? 1 : qbVar.getMaxCount();
                o7 o7Var7 = this.d;
                o7Var7.F = o7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        o7 o7Var = this.d;
        int i10 = o7Var.A0;
        Paint paint = this.P;
        if (i10 == 0 || o7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new c6(this, measuredHeight, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f9 = measuredHeight;
            o7 o7Var2 = this.d;
            int i11 = o7Var2.A0;
            this.Q = i11;
            int i12 = o7Var2.B0;
            this.R = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f9, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            l61 l61Var = this.n;
            if (l61Var != null) {
                int i13 = this.Q;
                int i14 = this.R;
                qz qzVar = l61Var.b;
                if (qzVar == null) {
                    l61Var.n = i13;
                    l61Var.r = i14;
                } else {
                    qzVar.i(i13, i14);
                }
            }
            ef0 ef0Var = this.s;
            if (ef0Var != null) {
                int i15 = this.Q;
                int i16 = this.R;
                qz qzVar2 = ef0Var.h0;
                if (qzVar2 != null) {
                    qzVar2.i(i15, i16);
                } else {
                    ef0Var.F0 = i15;
                    ef0Var.G0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(o7 o7Var, bg.f3 f3Var, boolean z10) {
        x61 x61Var;
        if (o7Var == null || o7Var.o0 == null) {
            x61 x61Var2 = this.x;
            if (x61Var2 != null) {
                x61Var2.C();
                this.x.I();
                this.x = null;
            }
            qb qbVar = this.B;
            if (qbVar != null) {
                qbVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.G);
            return;
        }
        x61 x61Var3 = this.x;
        if (x61Var3 != null) {
            x61Var3.I();
            this.x = null;
        }
        x61 x61Var4 = new x61();
        this.x = x61Var4;
        x61Var4.y = true;
        x61Var4.F = new m5.i(this, 28);
        this.x.E(Uri.fromFile(o7Var.o0), "other");
        c();
        this.w = f3Var;
        if (f3Var != null && (x61Var = this.x) != null) {
            x61Var.W(f3Var.q0);
        }
        this.B.n(o7Var.o0.getAbsolutePath(), o7Var.q0, o7Var.r0, o7Var.s0, o7Var.t0, o7Var.u0, z10);
        y(true);
    }

    public void set(o7 o7Var) {
        n(o7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.g0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.A = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.w0 != j0Var) {
            this.w0 = j0Var;
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

    public void setVideoTimelineView(qb qbVar) {
        this.B = qbVar;
        if (qbVar != null) {
            qbVar.setDelegate(new ha.c(this, 29));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(o7 o7Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ma maVar;
        if (o7Var == null || o7Var.v()) {
            x61 x61Var = this.e;
            if (x61Var != null) {
                x61Var.C();
                this.e.I();
                this.e = null;
            }
            e6 e6Var = this.D;
            if (e6Var == null || !e6Var.g) {
                l61 l61Var = this.n;
                if (l61Var != null) {
                    l61Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new a6(this, 6)).start();
                }
            } else {
                e6Var.a(null);
            }
            qb qbVar = this.B;
            if (qbVar != null) {
                qbVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        x61 x61Var2 = this.e;
        if (x61Var2 != null) {
            x61Var2.I();
            this.e = null;
        }
        int i10 = 0;
        x61 x61Var3 = new x61();
        this.e = x61Var3;
        x61Var3.y = true;
        x61Var3.F = new l3.g0(this, o7Var, new Runnable[]{runnable}, 10);
        l61 l61Var2 = this.n;
        if (l61Var2 != null) {
            l61Var2.clearAnimation();
            l61 l61Var3 = this.n;
            qz qzVar = l61Var3.b;
            if (qzVar != null) {
                qzVar.postRunnable(new nz(qzVar, i10));
            }
            l61Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new l61(getContext(), this.e);
        this.C.e();
        l61 l61Var4 = this.n;
        org.telegram.ui.Components.ga gaVar = o7Var.u ? null : this.C;
        l61Var4.s = gaVar;
        qz qzVar2 = l61Var4.b;
        if (qzVar2 != null && (maVar = qzVar2.E) != null) {
            org.telegram.ui.Components.ga gaVar2 = maVar.t;
            if (gaVar2 != null && gaVar2.m != null) {
                gaVar2.m = null;
            }
            maVar.t = gaVar;
            if (gaVar != null && gaVar.m != maVar) {
                gaVar.m = maVar;
                gaVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        e6 e6Var2 = this.D;
        if (e6Var2 == null || !e6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, i7.f6.e(-2, -2, 51));
        } else {
            e6Var2.a(this.n);
        }
        b0 b0Var = new b0(this, 5);
        n7 n7Var = o7Var.d1;
        if (n7Var != null) {
            b0Var.run(n7Var);
        } else if (!o7Var.K || Build.VERSION.SDK_INT < 24) {
            n7 n7Var2 = new n7();
            o7Var.d1 = n7Var2;
            b0Var.run(n7Var2);
        } else {
            Utilities.globalQueue.postRunnable(new j7(o7Var, b0Var, i10));
        }
        File file = o7Var.Z0;
        if (file == null) {
            file = o7Var.L;
        }
        this.e.E(Uri.fromFile(file), "other");
        this.e.Q(this.v0.isEmpty());
        this.e.O(true);
        if (o7Var.h) {
            j10 = (long) ((o7Var.Z * o7Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.M(j10, false);
        }
        c();
        w(true);
        boolean z10 = o7Var.u && (arrayList = o7Var.v) != null && arrayList.size() == 1 && ((MessageObject) o7Var.v.get(0)).type == 5;
        qb qbVar2 = this.B;
        File file2 = o7Var.Z0;
        if (file2 == null) {
            file2 = o7Var.L;
        }
        qbVar2.o(z10, file2.getAbsolutePath(), getDuration(), o7Var.P);
        this.B.setVideoLeft(o7Var.Z);
        this.B.setVideoRight(o7Var.a0);
        qb qbVar3 = this.B;
        if (qbVar3 == null || j10 <= 0) {
            return;
        }
        qbVar3.setProgress(j10);
    }

    public final void u(o7 o7Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (o7Var == null) {
            this.O = null;
            return;
        }
        long j10 = o7Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.O = null;
            return;
        }
        Drawable e10 = e(this.O, o7Var.a, j10, o7Var.y0);
        o7Var.x0 = e10;
        this.O = e10;
        if (this.N != e10) {
            this.N = null;
        }
        if (e10 != null) {
            e10.setCallback(this);
        }
        org.telegram.ui.Components.ga gaVar = this.C;
        if (gaVar != null) {
            Drawable drawable2 = this.O;
            if (drawable2 == null) {
                gaVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                gaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.O.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f9 = intrinsicWidth;
                float f10 = intrinsicHeight;
                float max = Math.max(100.0f / f9, 100.0f / f10);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f9 * max);
                    intrinsicHeight = (int) (f10 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.O.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.O.draw(new Canvas(createBitmap));
                gaVar.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f9;
        PointF pointF;
        if (this.g0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.i0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f9 = i7.z5.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f9 = 0.0f;
            }
            boolean z11 = this.l0;
            PointF pointF3 = this.h0;
            if (z11 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.j0 = f9;
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
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.j0;
                        if (f14 != 0.0f) {
                            float f15 = f9 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.k0);
                        float f16 = this.q0 + degrees;
                        this.q0 = f16;
                        if (!this.n0) {
                            boolean z12 = Math.abs(f16) > 20.0f;
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
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.m0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.m0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
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
                        gb gbVar = ((va) this).y0;
                        gbVar.k1.a(true, false, gbVar.e0);
                        gbVar.k1.b(gbVar.Y0.getText());
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
                this.j0 = f9;
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
        long o10;
        boolean z11;
        if (this.y == null || this.d == null) {
            return;
        }
        boolean z12 = true;
        if (this.e == null && this.x == null && !j()) {
            this.y.Q(this.v0.isEmpty());
            this.y.O(true);
            long o11 = this.y.o();
            if (!z10 || this.y.q() == -9223372036854775807L) {
                return;
            }
            float q6 = o11 / this.y.q();
            o7 o7Var = this.d;
            if ((q6 < o7Var.E || q6 > o7Var.F) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.y.L(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            o10 = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            x61 x61Var = this.e;
            if (x61Var == null) {
                x61Var = this.x;
            }
            o10 = x61Var.o();
            z11 = x61Var.z();
        }
        o7 o7Var2 = this.d;
        float f9 = o7Var2.F;
        float f10 = o7Var2.E;
        long j10 = o7Var2.C;
        long j11 = (long) ((f9 - f10) * j10);
        if (z11) {
            long j12 = o7Var2.D;
            if (o10 >= j12) {
            }
        }
        z12 = false;
        long j13 = o10 - (o7Var2.D - ((long) (f10 * j10)));
        if (this.y.z() != z12) {
            this.y.Q(z12);
            this.y.L(j13);
        } else if (z10) {
            if (Math.abs(this.y.o() - j13) > (j() ? 300 : 120)) {
                this.y.L(j13);
            }
        }
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.v0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        x61 x61Var = this.e;
        if (x61Var != null) {
            x61Var.Q(hashSet.isEmpty());
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long o10;
        boolean z11;
        if (this.x == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.x.Q(this.v0.isEmpty());
            this.x.O(true);
            bg.f3 f3Var = this.w;
            if (f3Var != null && !f3Var.x0) {
                f3Var.x0 = true;
                f3Var.y0.f(true, true);
                f3Var.invalidate();
            }
            long o11 = this.x.o();
            if (!z10 || this.x.q() == -9223372036854775807L) {
                return;
            }
            float q6 = o11 / this.x.q();
            o7 o7Var = this.d;
            if ((q6 < o7Var.s0 || q6 > o7Var.t0) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.x.M(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            o10 = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            o10 = this.e.o();
            z11 = this.e.z();
        }
        o7 o7Var2 = this.d;
        float f9 = o7Var2.t0;
        float f10 = o7Var2.s0;
        float f11 = o7Var2.q0;
        long j10 = (long) ((f9 - f10) * f11);
        long j11 = o7Var2.r0;
        boolean z12 = o10 >= j11 && o10 <= j10 + j11;
        boolean z13 = z11 && z12;
        long j12 = (o10 - j11) + ((long) (f10 * f11));
        bg.f3 f3Var2 = this.w;
        if (f3Var2 != null && f3Var2.x0 != z12) {
            f3Var2.x0 = z12;
            f3Var2.invalidate();
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
