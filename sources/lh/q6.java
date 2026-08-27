package lh;

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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class q6 extends FrameLayout {
    public static final /* synthetic */ int x0 = 0;
    public e0 A;
    public cc B;
    public final org.telegram.ui.Components.z9 C;
    public final p6 D;
    public long E;
    public long F;
    public final m6 G;
    public final m6 H;
    public final m6 I;
    public s9 J;
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
    public z7 d;
    public final Matrix d0;
    public m61 e;
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
    public a61 n;
    public boolean n0;
    public final Matrix o0;
    public final Matrix p0;
    public float q0;
    public TextureView r;
    public boolean r0;
    public ve0 s;
    public boolean s0;
    public long t0;
    public Runnable u0;
    public s9 v;
    public final HashSet v0;
    public zf.c2 w;
    public j0 w0;
    public m61 x;
    public m61 y;

    public q6(Context context, org.telegram.ui.Components.z9 z9Var, p6 p6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new m6(this, 2);
        this.G = new m6(this, 3);
        this.H = new m6(this, 4);
        this.I = new m6(this, 5);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.a0 = true;
        this.b0 = new org.telegram.ui.Components.y5(this, 0L, 320L, er.g);
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
        this.C = z9Var;
        this.D = p6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(q6 q6Var, z7 z7Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (z7Var != null) {
            int measuredWidth = q6Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : q6Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (z7Var.K) {
                Bitmap bitmap = z7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = z7Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(z7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = q6Var.getContext().getContentResolver().loadThumbnail(z7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && z7Var.K && z7Var.N == null) {
                        q6Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = z7Var.Z0;
                        if (file == null) {
                            file = z7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        a9.d dVar = new a9.d(q6Var, z7Var, j11, file.getPath(), 4);
                        boolean z10 = z7Var.K;
                        bitmapArr[0] = z7.q(dVar, measuredWidth, i10, !z10 ? z7Var.Q : 0, !z10);
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
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(q6Var, bitmapArr, z7Var, zArr, 15));
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
            return un.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.b4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(of.b.d(wallPaper.settings.emoticon));
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
            k10 = N0.k(false);
            if (k10 == null) {
                k10.c(Q0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < Q0.size(); i12++) {
                    sparseIntArray.put(Q0.keyAt(i12), Q0.valueAt(i12));
                }
            }
            af.h H = org.telegram.ui.ActionBar.g6.H(N0, sparseIntArray, strArr[0], 0, true);
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
        k10 = N0.k(false);
        if (k10 == null) {
        }
        af.h H2 = org.telegram.ui.ActionBar.g6.H(N0, sparseIntArray2, strArr2[0], 0, true);
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
        final nb0 nb0Var = new nb0();
        nb0Var.g = false;
        nb0Var.t(nb0Var.u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        nb0Var.o(i12, i14, i16, i18, 0, true);
        nb0Var.v(0);
        final int f10 = nb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: lh.k6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((mf.a) pair.second).b;
                org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                if (longValue != b4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                nb0 nb0Var2 = nb0Var;
                nb0Var2.t(bitmap, i19);
                nb0Var2.u(f10);
                nb0Var2.s(1.0f);
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
        return nb0Var;
    }

    private void setupCollage(z7 z7Var) {
        cc ccVar = this.B;
        if (ccVar != null) {
            ccVar.setCollage(z7Var != null ? z7Var.T : null);
        }
    }

    private void setupImage(z7 z7Var) {
        Utilities.searchQueue.postRunnable(new jh.p6(24, this, z7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        z7 z7Var;
        m61 m61Var = this.e;
        float f11 = 0.0f;
        if (m61Var != null) {
            m61Var.X((this.K || ((z7Var = this.d) != null && z7Var.Y)) ? 0.0f : z7Var != null ? z7Var.P : 1.0f);
        }
        m61 m61Var2 = this.x;
        if (m61Var2 != null) {
            if (this.K) {
                f10 = 0.0f;
            } else {
                z7 z7Var2 = this.d;
                f10 = z7Var2 != null ? z7Var2.u0 : 1.0f;
            }
            m61Var2.X(f10);
        }
        m61 m61Var3 = this.y;
        if (m61Var3 != null) {
            if (!this.K) {
                z7 z7Var3 = this.d;
                f11 = z7Var3 != null ? z7Var3.G : 1.0f;
            }
            m61Var3.X(f11);
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
        z7 z7Var = this.d;
        fArr[0] = z7Var.k0;
        fArr[1] = z7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        h7.y.a(this.U, this.V, fArr[0], fArr[1]);
        z7 z7Var2 = this.d;
        fArr[0] = z7Var2.k0 / 2.0f;
        fArr[1] = z7Var2.l0;
        matrix.mapPoints(fArr);
        h7.y.a(this.U, this.V, fArr[0], fArr[1]);
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
            float d = ((drawable instanceof nb0) && ((nb0) drawable).u == null) ? 0.0f : this.L.d(1.0f, false);
            Drawable drawable2 = this.N;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                z7.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (d * 255.0f));
            z7.j(canvas, this.O, getWidth(), getHeight());
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
            float e9 = this.b0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    z7 z7Var = this.d;
                    int i10 = z7Var.k0;
                    int i11 = z7Var.l0;
                    int i12 = z7Var.Q;
                    MediaController.CropState cropState = z7Var.m0;
                    if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f10 = cropState.cropPw;
                    float f11 = cropState.cropPh;
                    float f12 = i10;
                    float f13 = i11;
                    canvas2.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.cropScale;
                    canvas2.scale(f14, f14);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                    canvas2.rotate(this.d.m0.cropRotate + r0.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    z7 z7Var2 = this.d;
                    canvas2.translate((-z7Var2.k0) / 2.0f, (-z7Var2.l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - e9) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                z7 z7Var3 = this.d;
                int i13 = z7Var3.k0;
                int i14 = z7Var3.l0;
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
        sb sbVar = ((hb) this).y0;
        ib ibVar = sbVar.Y0;
        boolean z10 = false;
        if (ibVar == null || !ibVar.K1) {
            te0 te0Var = sbVar.y1;
            mb0 mb0Var = te0Var.E;
            if (te0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    te0Var.y = false;
                    te0Var.A = System.currentTimeMillis();
                    te0Var.B = motionEvent.getX();
                    te0Var.C = motionEvent.getY();
                    ve0 ve0Var = te0Var.w;
                    if (ve0Var != null) {
                        te0Var.D = ve0Var.getEnhanceValue();
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
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (!te0Var.y && System.currentTimeMillis() - te0Var.A <= ViewConfiguration.getLongPressTimeout() && Math.abs(te0Var.C - y10) < Math.abs(te0Var.B - x8) && Math.abs(te0Var.B - x8) > AndroidUtilities.touchSlop) {
                        te0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(mb0Var);
                        te0Var.r = true;
                        te0Var.invalidate();
                    }
                    if (te0Var.y) {
                        float f10 = x8 - te0Var.B;
                        if (te0Var.w == null) {
                            te0Var.x.run();
                        }
                        ve0 ve0Var2 = te0Var.w;
                        if (ve0Var2 == null) {
                            te0Var.y = false;
                        } else {
                            float enhanceValue = ve0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f10 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(te0Var.D * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(te0Var);
                                    te0Var.D = clamp;
                                }
                            } else {
                                try {
                                    te0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                te0Var.D = clamp;
                            }
                            te0Var.w.setEnhanceValue(clamp);
                            ve0 ve0Var3 = te0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((ve0Var3 == null ? 0.0f : ve0Var3.getEnhanceValue()) * 100.0f), te0Var.b, te0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            te0Var.f = staticLayout;
                            te0Var.h = staticLayout.getLineCount() > 0 ? te0Var.f.getLineWidth(0) : 0.0f;
                            te0Var.n = te0Var.f.getLineCount() > 0 ? te0Var.f.getLineLeft(0) : 0.0f;
                            te0Var.invalidate();
                        }
                    }
                    te0Var.B = x8;
                    te0Var.C = y10;
                } else if (action == 1 || action == 3) {
                    te0Var.y = false;
                    te0Var.A = -1L;
                    ve0 ve0Var4 = te0Var.w;
                    if (ve0Var4 != null) {
                        te0Var.D = ve0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(mb0Var, 600L);
                }
            } else if (te0Var.r) {
                te0Var.r = false;
                te0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z7 z7Var;
        z7 z7Var2;
        a61 a61Var = this.n;
        if (view == a61Var && (z7Var2 = this.d) != null && z7Var2.u) {
            return false;
        }
        if ((view != a61Var && view != this.r) || (z7Var = this.d) == null || z7Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            z7 z7Var3 = this.d;
            int i10 = z7Var3.k0;
            int i11 = z7Var3.l0;
            int i12 = z7Var3.Q;
            MediaController.CropState cropState = z7Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f10 = cropState.cropPw;
            float f11 = cropState.cropPh;
            canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            z7 z7Var4 = this.d;
            canvas.translate((-z7Var4.k0) / 2.0f, (-z7Var4.l0) / 2.0f);
        }
        canvas.concat(this.d0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 1;
        }
        return z7Var.l0;
    }

    public int getContentWidth() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 1;
        }
        return z7Var.k0;
    }

    public long getCurrentPosition() {
        m61 m61Var = this.e;
        if (m61Var != null) {
            return m61Var.o();
        }
        m61 m61Var2 = this.x;
        if (m61Var2 != null) {
            return m61Var2.o();
        }
        m61 m61Var3 = this.y;
        if (m61Var3 != null) {
            return m61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        z7 z7Var = this.d;
        if (z7Var != null) {
            double d = z7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        m61 m61Var = this.e;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.q();
    }

    public int getOrientation() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 0;
        }
        return z7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public a61 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        a61 a61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (a61Var = this.n) != null) {
                    bitmapArr[i10] = a61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new l6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        z7 z7Var;
        return (this.A == null || (z7Var = this.d) == null || !z7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.v0.contains(-9982);
    }

    public final void l(z7 z7Var) {
        this.d = z7Var;
        if (z7Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (z7Var.K) {
            setupImage(z7Var);
            if (z7Var.A0 == 0 && z7Var.B0 == 0) {
                z7Var.z(new m6((hb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(z7Var);
            r();
        }
        b();
        u(z7Var);
        p(z7Var, false);
        s(z7Var, null, false);
    }

    public final void m(long j10) {
        m61 m61Var = this.e;
        if (m61Var != null) {
            m61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            m61 m61Var2 = this.x;
            if (m61Var2 != null) {
                m61Var2.M(j10, false);
            } else {
                m61 m61Var3 = this.y;
                if (m61Var3 != null) {
                    m61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(z7 z7Var, y9 y9Var, long j10) {
        this.d = z7Var;
        if (z7Var == null) {
            t(null, y9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (z7Var.v()) {
            setupImage(null);
            t(null, y9Var, j10);
            setupCollage(z7Var);
        } else if (z7Var.K) {
            setupImage(z7Var);
            setupCollage(null);
            t(z7Var, y9Var, j10);
            if (z7Var.A0 == 0 && z7Var.B0 == 0) {
                z7Var.z(new m6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, y9Var, 0L);
            setupImage(z7Var);
            r();
        }
        b();
        u(z7Var);
        p(z7Var, false);
        s(z7Var, null, false);
    }

    public final void o(TextureView textureView, ve0 ve0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = ve0Var;
        this.r = textureView;
        if (ve0Var != null) {
            int i10 = this.Q;
            int i11 = this.R;
            jz jzVar = ve0Var.h0;
            if (jzVar != null) {
                jzVar.i(i10, i11);
            } else {
                ve0Var.F0 = i10;
                ve0Var.G0 = i11;
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

    public final void p(z7 z7Var, boolean z10) {
        boolean z11;
        m61 m61Var = this.y;
        if (m61Var != null) {
            m61Var.C();
            this.y.I();
            this.y = null;
        }
        if (z7Var == null) {
            return;
        }
        cc ccVar = this.B;
        boolean z12 = false;
        if (ccVar != null) {
            String str = z7Var.y;
            String str2 = z7Var.A;
            String str3 = z7Var.B;
            long j10 = z7Var.C;
            long j11 = z7Var.D;
            float f10 = z7Var.E;
            float f11 = z7Var.F;
            float f12 = z7Var.G;
            if (!TextUtils.equals(ccVar.K, str)) {
                vb vbVar = ccVar.T;
                if (vbVar != null) {
                    vbVar.a();
                    ccVar.T = null;
                    ccVar.Q = false;
                }
                ccVar.K = str;
                ccVar.p();
            }
            ccVar.K = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            ccVar.J = !isEmpty;
            if (isEmpty) {
                ccVar.L = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (ccVar.J) {
                ccVar.N = j10;
                ccVar.M = j11 - ((long) (j10 * f10));
                ccVar.O = f10;
                ccVar.P = f11;
                ccVar.R = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, ccVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.I0 = staticLayout;
                    ccVar.J0 = staticLayout.getLineCount() > 0 ? ccVar.I0.getLineWidth(0) : 0.0f;
                    ccVar.K0 = ccVar.I0.getLineCount() > 0 ? ccVar.I0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.J0 = 0.0f;
                    ccVar.I0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, ccVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.M0 = staticLayout2;
                    ccVar.N0 = staticLayout2.getLineCount() > 0 ? ccVar.M0.getLineWidth(0) : 0.0f;
                    ccVar.O0 = ccVar.M0.getLineCount() > 0 ? ccVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.N0 = 0.0f;
                    ccVar.M0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                ccVar.a0.f(ccVar.J, true);
            }
            ccVar.invalidate();
        } else {
            z11 = true;
        }
        if (z7Var.y != null) {
            m61 m61Var2 = new m61();
            this.y = m61Var2;
            m61Var2.y = z11;
            m61Var2.F = new a9.i(this, 26);
            m61Var2.E(Uri.fromFile(new File(z7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (z7Var.Z * getDuration());
                this.e.M(duration, false);
                this.B.setProgress(duration);
            }
            w(true);
        }
        sb sbVar = ((hb) this).y0;
        va vaVar = sbVar.r1;
        if (vaVar != null) {
            z7 z7Var2 = sbVar.G1;
            if (z7Var2 != null && z7Var2.y != null) {
                z12 = true;
            }
            vaVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        z7 z7Var = this.d;
        if (z7Var != null) {
            z7Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                z7Var.y = null;
                z7Var.z = null;
                z7Var.A = null;
                z7Var.B = null;
                z7Var.D = 0L;
                z7Var.C = 0L;
                z7Var.E = 0.0f;
                z7Var.F = 1.0f;
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
                            z7 z7Var2 = this.d;
                            z7Var2.y = null;
                            z7Var2.z = null;
                            z7Var2.A = null;
                            z7Var2.B = null;
                            z7Var2.D = 0L;
                            z7Var2.C = 0L;
                            z7Var2.E = 0.0f;
                            z7Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                z7 z7Var3 = this.d;
                z7Var3.A = null;
                z7Var3.B = null;
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
                z7 z7Var4 = this.d;
                z7Var4.D = 0L;
                if (z7Var4.K) {
                    z7Var4.D = (long) (z7Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        z7 z7Var5 = ((d0) obj).n;
                        if (z7Var5 != null && z7Var5.K) {
                            duration = this.A.getDuration();
                            break;
                        }
                    }
                }
                z7 z7Var6 = this.d;
                duration = z7Var6.K ? getDuration() : z7Var6.C;
                cc ccVar = this.B;
                int maxCount = ccVar == null ? 1 : ccVar.getMaxCount();
                z7 z7Var7 = this.d;
                z7Var7.F = z7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        z7 z7Var = this.d;
        int i10 = z7Var.A0;
        Paint paint = this.P;
        if (i10 == 0 || z7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new o6(this, measuredHeight, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            z7 z7Var2 = this.d;
            int i11 = z7Var2.A0;
            this.Q = i11;
            int i12 = z7Var2.B0;
            this.R = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            a61 a61Var = this.n;
            if (a61Var != null) {
                int i13 = this.Q;
                int i14 = this.R;
                jz jzVar = a61Var.b;
                if (jzVar == null) {
                    a61Var.n = i13;
                    a61Var.r = i14;
                } else {
                    jzVar.i(i13, i14);
                }
            }
            ve0 ve0Var = this.s;
            if (ve0Var != null) {
                int i15 = this.Q;
                int i16 = this.R;
                jz jzVar2 = ve0Var.h0;
                if (jzVar2 != null) {
                    jzVar2.i(i15, i16);
                } else {
                    ve0Var.F0 = i15;
                    ve0Var.G0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(z7 z7Var, zf.c2 c2Var, boolean z10) {
        m61 m61Var;
        if (z7Var == null || z7Var.o0 == null) {
            m61 m61Var2 = this.x;
            if (m61Var2 != null) {
                m61Var2.C();
                this.x.I();
                this.x = null;
            }
            cc ccVar = this.B;
            if (ccVar != null) {
                ccVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.G);
            return;
        }
        m61 m61Var3 = this.x;
        if (m61Var3 != null) {
            m61Var3.I();
            this.x = null;
        }
        m61 m61Var4 = new m61();
        this.x = m61Var4;
        m61Var4.y = true;
        m61Var4.F = new ga.c(this, 23);
        this.x.E(Uri.fromFile(z7Var.o0), "other");
        c();
        this.w = c2Var;
        if (c2Var != null && (m61Var = this.x) != null) {
            m61Var.W(c2Var.q0);
        }
        this.B.n(z7Var.o0.getAbsolutePath(), z7Var.q0, z7Var.r0, z7Var.s0, z7Var.t0, z7Var.u0, z10);
        y(true);
    }

    public void set(z7 z7Var) {
        n(z7Var, null, 0L);
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

    public void setVideoTimelineView(cc ccVar) {
        this.B = ccVar;
        if (ccVar != null) {
            ccVar.setDelegate(new ae.b(this, 25));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(z7 z7Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.fa faVar;
        if (z7Var == null || z7Var.v()) {
            m61 m61Var = this.e;
            if (m61Var != null) {
                m61Var.C();
                this.e.I();
                this.e = null;
            }
            p6 p6Var = this.D;
            if (p6Var == null || !p6Var.g) {
                a61 a61Var = this.n;
                if (a61Var != null) {
                    a61Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new m6(this, 6)).start();
                }
            } else {
                p6Var.a(null);
            }
            cc ccVar = this.B;
            if (ccVar != null) {
                ccVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        m61 m61Var2 = this.e;
        if (m61Var2 != null) {
            m61Var2.I();
            this.e = null;
        }
        int i10 = 0;
        m61 m61Var3 = new m61();
        this.e = m61Var3;
        m61Var3.y = true;
        m61Var3.F = new j9.a(this, z7Var, new Runnable[]{runnable}, 9);
        a61 a61Var2 = this.n;
        if (a61Var2 != null) {
            a61Var2.clearAnimation();
            a61 a61Var3 = this.n;
            jz jzVar = a61Var3.b;
            if (jzVar != null) {
                jzVar.postRunnable(new gz(jzVar, i10));
            }
            a61Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new a61(getContext(), this.e);
        this.C.e();
        a61 a61Var4 = this.n;
        org.telegram.ui.Components.z9 z9Var = z7Var.u ? null : this.C;
        a61Var4.s = z9Var;
        jz jzVar2 = a61Var4.b;
        if (jzVar2 != null && (faVar = jzVar2.E) != null) {
            org.telegram.ui.Components.z9 z9Var2 = faVar.t;
            if (z9Var2 != null && z9Var2.m != null) {
                z9Var2.m = null;
            }
            faVar.t = z9Var;
            if (z9Var != null && z9Var.m != faVar) {
                z9Var.m = faVar;
                z9Var.d();
            }
        }
        this.n.setOpaque(false);
        b();
        p6 p6Var2 = this.D;
        if (p6Var2 == null || !p6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, h7.z5.e(-2, -2, 51));
        } else {
            p6Var2.a(this.n);
        }
        n6 n6Var = new n6(this, i10);
        y7 y7Var = z7Var.d1;
        if (y7Var != null) {
            n6Var.run(y7Var);
        } else if (!z7Var.K || Build.VERSION.SDK_INT < 24) {
            y7 y7Var2 = new y7();
            z7Var.d1 = y7Var2;
            n6Var.run(y7Var2);
        } else {
            Utilities.globalQueue.postRunnable(new u7(z7Var, n6Var, i10));
        }
        File file = z7Var.Z0;
        if (file == null) {
            file = z7Var.L;
        }
        this.e.E(Uri.fromFile(file), "other");
        this.e.Q(this.v0.isEmpty());
        this.e.O(true);
        if (z7Var.h) {
            j10 = (long) ((z7Var.Z * z7Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.M(j10, false);
        }
        c();
        w(true);
        boolean z10 = z7Var.u && (arrayList = z7Var.v) != null && arrayList.size() == 1 && ((MessageObject) z7Var.v.get(0)).type == 5;
        cc ccVar2 = this.B;
        File file2 = z7Var.Z0;
        if (file2 == null) {
            file2 = z7Var.L;
        }
        ccVar2.o(z10, file2.getAbsolutePath(), getDuration(), z7Var.P);
        this.B.setVideoLeft(z7Var.Z);
        this.B.setVideoRight(z7Var.a0);
        cc ccVar3 = this.B;
        if (ccVar3 == null || j10 <= 0) {
            return;
        }
        ccVar3.setProgress(j10);
    }

    public final void u(z7 z7Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (z7Var == null) {
            this.O = null;
            return;
        }
        long j10 = z7Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.O = null;
            return;
        }
        Drawable e9 = e(this.O, z7Var.a, j10, z7Var.y0);
        z7Var.x0 = e9;
        this.O = e9;
        if (this.N != e9) {
            this.N = null;
        }
        if (e9 != null) {
            e9.setCallback(this);
        }
        org.telegram.ui.Components.z9 z9Var = this.C;
        if (z9Var != null) {
            Drawable drawable2 = this.O;
            if (drawable2 == null) {
                z9Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                z9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                z9Var.f(createBitmap, true);
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
                f10 = h7.y.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                        sb sbVar = ((hb) this).y0;
                        sbVar.k1.a(true, false, sbVar.e0);
                        sbVar.k1.b(sbVar.Y0.getText());
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
            z7 z7Var = this.d;
            if ((q6 < z7Var.E || q6 > z7Var.F) && System.currentTimeMillis() - this.F > 500) {
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
            m61 m61Var = this.e;
            if (m61Var == null) {
                m61Var = this.x;
            }
            o10 = m61Var.o();
            z11 = m61Var.z();
        }
        z7 z7Var2 = this.d;
        float f10 = z7Var2.F;
        float f11 = z7Var2.E;
        long j10 = z7Var2.C;
        long j11 = (long) ((f10 - f11) * j10);
        if (z11) {
            long j12 = z7Var2.D;
            if (o10 >= j12) {
            }
        }
        z12 = false;
        long j13 = o10 - (z7Var2.D - ((long) (f11 * j10)));
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
        m61 m61Var = this.e;
        if (m61Var != null) {
            m61Var.Q(hashSet.isEmpty());
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
            zf.c2 c2Var = this.w;
            if (c2Var != null && !c2Var.x0) {
                c2Var.x0 = true;
                c2Var.y0.f(true, true);
                c2Var.invalidate();
            }
            long o11 = this.x.o();
            if (!z10 || this.x.q() == -9223372036854775807L) {
                return;
            }
            float q6 = o11 / this.x.q();
            z7 z7Var = this.d;
            if ((q6 < z7Var.s0 || q6 > z7Var.t0) && System.currentTimeMillis() - this.F > 500) {
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
        z7 z7Var2 = this.d;
        float f10 = z7Var2.t0;
        float f11 = z7Var2.s0;
        float f12 = z7Var2.q0;
        long j10 = (long) ((f10 - f11) * f12);
        long j11 = z7Var2.r0;
        boolean z12 = o10 >= j11 && o10 <= j10 + j11;
        boolean z13 = z11 && z12;
        long j12 = (o10 - j11) + ((long) (f11 * f12));
        zf.c2 c2Var2 = this.w;
        if (c2Var2 != null && c2Var2.x0 != z12) {
            c2Var2.x0 = z12;
            c2Var2.invalidate();
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
