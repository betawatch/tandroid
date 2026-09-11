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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.go;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class d7 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public j0 A0;
    public e0 E;
    public zc F;
    public final org.telegram.ui.Components.ja G;
    public final c7 H;
    public long I;
    public long J;
    public final z6 K;
    public final z6 L;
    public final z6 M;
    public ka N;
    public boolean O;
    public final org.telegram.ui.Components.e6 P;
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
    public o8 d;
    public float d0;
    public g71 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.e6 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public u61 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public jf0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public ka v;
    public boolean v0;
    public rg.d2 w;
    public boolean w0;
    public g71 x;
    public long x0;
    public g71 y;
    public Runnable y0;
    public final HashSet z0;

    public d7(Context context, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new z6(this, 2);
        this.K = new z6(this, 3);
        this.L = new z6(this, 4);
        this.M = new z6(this, 5);
        this.P = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.g);
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
        this.G = jaVar;
        this.H = c7Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(d7 d7Var, o8 o8Var) {
        long j3;
        long j10;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (o8Var != null) {
            int measuredWidth = d7Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : d7Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (o8Var.K) {
                Bitmap bitmap = o8Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = o8Var.N) != null && str.startsWith("vthumb://")) {
                    j3 = Long.parseLong(o8Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = d7Var.getContext().getContentResolver().loadThumbnail(o8Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j3) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j3), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j10 = j3;
                    if (j10 >= 0 && o8Var.K && o8Var.N == null) {
                        d7Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = o8Var.Z0;
                        if (file == null) {
                            file = o8Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        y6 y6Var = new y6(d7Var, o8Var, j10, file.getPath(), 0);
                        boolean z10 = o8Var.K;
                        bitmapArr[0] = o8.q(y6Var, measuredWidth, i10, !z10 ? o8Var.Q : 0, !z10);
                        zArr[0] = false;
                    }
                }
            }
            j3 = -1;
            j10 = j3;
            if (j10 >= 0) {
            }
            if (bitmapArr[0] == null) {
            }
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(d7Var, bitmapArr, o8Var, zArr, 5));
    }

    public static Drawable e(Drawable drawable, int i10, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j3);
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
        org.telegram.ui.ActionBar.h6 k10;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return go.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.d4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(gg.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.i6 N0 = !z10 ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = N0.d;
            SparseIntArray Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.j6.nl;
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
            cf.c H = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray, strArr[0], 0, true);
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
        iArr = org.telegram.ui.ActionBar.j6.nl;
        if (iArr != null) {
        }
        k10 = N0.k(false);
        if (k10 == null) {
        }
        cf.c H2 = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.d4 d4Var, final boolean z10) {
        if (d4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.d4.e(z10), d4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.c4) d4Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = d4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final dc0 dc0Var = new dc0();
        dc0Var.g = false;
        dc0Var.t(dc0Var.u, d4Var.k(z10 ? 1 : 0).settings.intensity);
        dc0Var.o(i12, i14, i16, i18, 0, true);
        dc0Var.v(0);
        final int f7 = dc0Var.f();
        d4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: di.w6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((dg.a) pair.second).b;
                org.telegram.ui.ActionBar.d4 d4Var2 = org.telegram.ui.ActionBar.d4.this;
                if (longValue != d4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = d4Var2.k(z10 ? 1 : 0).settings.intensity;
                dc0 dc0Var2 = dc0Var;
                dc0Var2.t(bitmap, i19);
                dc0Var2.u(f7);
                dc0Var2.s(1.0f);
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
        return dc0Var;
    }

    private void setupCollage(o8 o8Var) {
        zc zcVar = this.F;
        if (zcVar != null) {
            zcVar.setCollage(o8Var != null ? o8Var.T : null);
        }
    }

    private void setupImage(o8 o8Var) {
        Utilities.searchQueue.postRunnable(new bi.s8(29, this, o8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        o8 o8Var;
        g71 g71Var = this.e;
        float f10 = 0.0f;
        if (g71Var != null) {
            g71Var.W((this.O || ((o8Var = this.d) != null && o8Var.Y)) ? 0.0f : o8Var != null ? o8Var.P : 1.0f);
        }
        g71 g71Var2 = this.x;
        if (g71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                o8 o8Var2 = this.d;
                f7 = o8Var2 != null ? o8Var2.u0 : 1.0f;
            }
            g71Var2.W(f7);
        }
        g71 g71Var3 = this.y;
        if (g71Var3 != null) {
            if (!this.O) {
                o8 o8Var3 = this.d;
                f10 = o8Var3 != null ? o8Var3.G : 1.0f;
            }
            g71Var3.W(f10);
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
        o8 o8Var = this.d;
        fArr[0] = o8Var.k0;
        fArr[1] = o8Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        v7.z6.a(this.b0, this.c0, fArr[0], fArr[1]);
        o8 o8Var2 = this.d;
        fArr[0] = o8Var2.k0 / 2.0f;
        fArr[1] = o8Var2.l0;
        matrix.mapPoints(fArr);
        v7.z6.a(this.b0, this.c0, fArr[0], fArr[1]);
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
            float d = ((drawable instanceof dc0) && ((dc0) drawable).u == null) ? 0.0f : this.P.d(1.0f, false);
            Drawable drawable2 = this.R;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                o8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (d * 255.0f));
            o8.j(canvas, this.S, getWidth(), getHeight());
            if (this.g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        j0 j0Var = this.A0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.e0 && this.d != null && !j()) {
            float e7 = this.f0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    o8 o8Var = this.d;
                    int i10 = o8Var.k0;
                    int i11 = o8Var.l0;
                    int i12 = o8Var.Q;
                    MediaController.CropState cropState = o8Var.m0;
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
                    o8 o8Var2 = this.d;
                    canvas2.translate((-o8Var2.k0) / 2.0f, (-o8Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                o8 o8Var3 = this.d;
                int i13 = o8Var3.k0;
                int i14 = o8Var3.l0;
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
        pc pcVar = ((dc) this).C0;
        fc fcVar = pcVar.c1;
        boolean z10 = false;
        if (fcVar == null || !fcVar.O1) {
            hf0 hf0Var = pcVar.C1;
            cc0 cc0Var = hf0Var.I;
            if (hf0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    hf0Var.y = false;
                    hf0Var.E = System.currentTimeMillis();
                    hf0Var.F = motionEvent.getX();
                    hf0Var.G = motionEvent.getY();
                    jf0 jf0Var = hf0Var.w;
                    if (jf0Var != null) {
                        hf0Var.H = jf0Var.getEnhanceValue();
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
                    if (!hf0Var.y && System.currentTimeMillis() - hf0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(hf0Var.G - y3) < Math.abs(hf0Var.F - x10) && Math.abs(hf0Var.F - x10) > AndroidUtilities.touchSlop) {
                        hf0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(cc0Var);
                        hf0Var.r = true;
                        hf0Var.invalidate();
                    }
                    if (hf0Var.y) {
                        float f7 = x10 - hf0Var.F;
                        if (hf0Var.w == null) {
                            hf0Var.x.run();
                        }
                        jf0 jf0Var2 = hf0Var.w;
                        if (jf0Var2 == null) {
                            hf0Var.y = false;
                        } else {
                            float enhanceValue = jf0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f7 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(hf0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(hf0Var);
                                    hf0Var.H = clamp;
                                }
                            } else {
                                try {
                                    hf0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                hf0Var.H = clamp;
                            }
                            hf0Var.w.setEnhanceValue(clamp);
                            jf0 jf0Var3 = hf0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((jf0Var3 == null ? 0.0f : jf0Var3.getEnhanceValue()) * 100.0f), hf0Var.b, hf0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            hf0Var.f = staticLayout;
                            hf0Var.h = staticLayout.getLineCount() > 0 ? hf0Var.f.getLineWidth(0) : 0.0f;
                            hf0Var.n = hf0Var.f.getLineCount() > 0 ? hf0Var.f.getLineLeft(0) : 0.0f;
                            hf0Var.invalidate();
                        }
                    }
                    hf0Var.F = x10;
                    hf0Var.G = y3;
                } else if (action == 1 || action == 3) {
                    hf0Var.y = false;
                    hf0Var.E = -1L;
                    jf0 jf0Var4 = hf0Var.w;
                    if (jf0Var4 != null) {
                        hf0Var.H = jf0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(cc0Var, 600L);
                }
            } else if (hf0Var.r) {
                hf0Var.r = false;
                hf0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o8 o8Var;
        o8 o8Var2;
        u61 u61Var = this.n;
        if (view == u61Var && (o8Var2 = this.d) != null && o8Var2.u) {
            return false;
        }
        if ((view != u61Var && view != this.r) || (o8Var = this.d) == null || o8Var.m0 == null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            o8 o8Var3 = this.d;
            int i10 = o8Var3.k0;
            int i11 = o8Var3.l0;
            int i12 = o8Var3.Q;
            MediaController.CropState cropState = o8Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f7 = cropState.cropPw;
            float f10 = cropState.cropPh;
            canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            o8 o8Var4 = this.d;
            canvas.translate((-o8Var4.k0) / 2.0f, (-o8Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 1;
        }
        return o8Var.l0;
    }

    public int getContentWidth() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 1;
        }
        return o8Var.k0;
    }

    public long getCurrentPosition() {
        g71 g71Var = this.e;
        if (g71Var != null) {
            return g71Var.n();
        }
        g71 g71Var2 = this.x;
        if (g71Var2 != null) {
            return g71Var2.n();
        }
        g71 g71Var3 = this.y;
        if (g71Var3 != null) {
            return g71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        o8 o8Var = this.d;
        if (o8Var != null) {
            double d = o8Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        g71 g71Var = this.e;
        if (g71Var == null || g71Var.p() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.p();
    }

    public int getOrientation() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 0;
        }
        return o8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public u61 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        u61 u61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (u61Var = this.n) != null) {
                    bitmapArr[i10] = u61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new x6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        o8 o8Var;
        return (this.E == null || (o8Var = this.d) == null || !o8Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(o8 o8Var) {
        this.d = o8Var;
        if (o8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o8Var.K) {
            setupImage(o8Var);
            if (o8Var.A0 == 0 && o8Var.B0 == 0) {
                o8Var.z(new z6((dc) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(o8Var);
            r();
        }
        b();
        u(o8Var);
        p(o8Var, false);
        s(o8Var, null, false);
    }

    public final void m(long j3) {
        g71 g71Var = this.e;
        if (g71Var != null) {
            g71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            g71 g71Var2 = this.x;
            if (g71Var2 != null) {
                g71Var2.L(j3, false);
            } else {
                g71 g71Var3 = this.y;
                if (g71Var3 != null) {
                    g71Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(o8 o8Var, qa qaVar, long j3) {
        this.d = o8Var;
        if (o8Var == null) {
            t(null, qaVar, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o8Var.v()) {
            setupImage(null);
            t(null, qaVar, j3);
            setupCollage(o8Var);
        } else if (o8Var.K) {
            setupImage(o8Var);
            setupCollage(null);
            t(o8Var, qaVar, j3);
            if (o8Var.A0 == 0 && o8Var.B0 == 0) {
                o8Var.z(new z6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, qaVar, 0L);
            setupImage(o8Var);
            r();
        }
        b();
        u(o8Var);
        p(o8Var, false);
        s(o8Var, null, false);
    }

    public final void o(TextureView textureView, jf0 jf0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = jf0Var;
        this.r = textureView;
        if (jf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            vz vzVar = jf0Var.l0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                jf0Var.J0 = i10;
                jf0Var.K0 = i11;
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

    public final void p(o8 o8Var, boolean z10) {
        boolean z11;
        g71 g71Var = this.y;
        if (g71Var != null) {
            g71Var.B();
            this.y.H();
            this.y = null;
        }
        if (o8Var == null) {
            return;
        }
        zc zcVar = this.F;
        boolean z12 = false;
        if (zcVar != null) {
            String str = o8Var.y;
            String str2 = o8Var.A;
            String str3 = o8Var.B;
            long j3 = o8Var.C;
            long j10 = o8Var.D;
            float f7 = o8Var.E;
            float f10 = o8Var.F;
            float f11 = o8Var.G;
            if (!TextUtils.equals(zcVar.O, str)) {
                sc scVar = zcVar.a0;
                if (scVar != null) {
                    scVar.a();
                    zcVar.a0 = null;
                    zcVar.U = false;
                }
                zcVar.O = str;
                zcVar.p();
            }
            zcVar.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            zcVar.N = !isEmpty;
            if (isEmpty) {
                zcVar.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (zcVar.N) {
                zcVar.R = j3;
                zcVar.Q = j10 - ((long) (j3 * f7));
                zcVar.S = f7;
                zcVar.T = f10;
                zcVar.V = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, zcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    zcVar.M0 = staticLayout;
                    zcVar.N0 = staticLayout.getLineCount() > 0 ? zcVar.M0.getLineWidth(0) : 0.0f;
                    zcVar.O0 = zcVar.M0.getLineCount() > 0 ? zcVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    zcVar.N0 = 0.0f;
                    zcVar.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, zcVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    zcVar.Q0 = staticLayout2;
                    zcVar.R0 = staticLayout2.getLineCount() > 0 ? zcVar.Q0.getLineWidth(0) : 0.0f;
                    zcVar.S0 = zcVar.Q0.getLineCount() > 0 ? zcVar.Q0.getLineLeft(0) : 0.0f;
                } else {
                    zcVar.R0 = 0.0f;
                    zcVar.Q0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                zcVar.e0.f(zcVar.N, true);
            }
            zcVar.invalidate();
        } else {
            z11 = true;
        }
        if (o8Var.y != null) {
            g71 g71Var2 = new g71();
            this.y = g71Var2;
            g71Var2.y = z11;
            g71Var2.J = new a6.i(this, 16);
            g71Var2.D(Uri.fromFile(new File(o8Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (o8Var.Z * getDuration());
                this.e.L(duration, false);
                this.F.setProgress(duration);
            }
            w(true);
        }
        pc pcVar = ((dc) this).C0;
        rb rbVar = pcVar.v1;
        if (rbVar != null) {
            o8 o8Var2 = pcVar.K1;
            if (o8Var2 != null && o8Var2.y != null) {
                z12 = true;
            }
            rbVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                o8Var.y = null;
                o8Var.z = null;
                o8Var.A = null;
                o8Var.B = null;
                o8Var.D = 0L;
                o8Var.C = 0L;
                o8Var.E = 0.0f;
                o8Var.F = 1.0f;
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
                            o8 o8Var2 = this.d;
                            o8Var2.y = null;
                            o8Var2.z = null;
                            o8Var2.A = null;
                            o8Var2.B = null;
                            o8Var2.D = 0L;
                            o8Var2.C = 0L;
                            o8Var2.E = 0.0f;
                            o8Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                o8 o8Var3 = this.d;
                o8Var3.A = null;
                o8Var3.B = null;
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
                o8 o8Var4 = this.d;
                o8Var4.D = 0L;
                if (o8Var4.K) {
                    o8Var4.D = (long) (o8Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        o8 o8Var5 = ((d0) obj).n;
                        if (o8Var5 != null && o8Var5.K) {
                            duration = this.E.getDuration();
                            break;
                        }
                    }
                }
                o8 o8Var6 = this.d;
                duration = o8Var6.K ? getDuration() : o8Var6.C;
                zc zcVar = this.F;
                int maxCount = zcVar == null ? 1 : zcVar.getMaxCount();
                o8 o8Var7 = this.d;
                o8Var7.F = o8Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        o8 o8Var = this.d;
        int i10 = o8Var.A0;
        Paint paint = this.T;
        if (i10 == 0 || o8Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new a7(this, measuredHeight, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f7 = measuredHeight;
            o8 o8Var2 = this.d;
            int i11 = o8Var2.A0;
            this.U = i11;
            int i12 = o8Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            u61 u61Var = this.n;
            if (u61Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                vz vzVar = u61Var.b;
                if (vzVar == null) {
                    u61Var.n = i13;
                    u61Var.r = i14;
                } else {
                    vzVar.i(i13, i14);
                }
            }
            jf0 jf0Var = this.s;
            if (jf0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                vz vzVar2 = jf0Var.l0;
                if (vzVar2 != null) {
                    vzVar2.i(i15, i16);
                } else {
                    jf0Var.J0 = i15;
                    jf0Var.K0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(o8 o8Var, rg.d2 d2Var, boolean z10) {
        g71 g71Var;
        if (o8Var == null || o8Var.o0 == null) {
            g71 g71Var2 = this.x;
            if (g71Var2 != null) {
                g71Var2.B();
                this.x.H();
                this.x = null;
            }
            zc zcVar = this.F;
            if (zcVar != null) {
                zcVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.K);
            return;
        }
        g71 g71Var3 = this.x;
        if (g71Var3 != null) {
            g71Var3.H();
            this.x = null;
        }
        g71 g71Var4 = new g71();
        this.x = g71Var4;
        g71Var4.y = true;
        g71Var4.J = new a6.m(this, 16);
        this.x.D(Uri.fromFile(o8Var.o0), "other");
        c();
        this.w = d2Var;
        if (d2Var != null && (g71Var = this.x) != null) {
            g71Var.V(d2Var.u0);
        }
        this.F.n(o8Var.o0.getAbsolutePath(), o8Var.q0, o8Var.r0, o8Var.s0, o8Var.t0, o8Var.u0, z10);
        y(true);
    }

    public void set(o8 o8Var) {
        n(o8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.k0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.E = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.A0 != j0Var) {
            this.A0 = j0Var;
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

    public void setVideoTimelineView(zc zcVar) {
        this.F = zcVar;
        if (zcVar != null) {
            zcVar.setDelegate(new a4.m(this, 16));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(o8 o8Var, Runnable runnable, long j3) {
        ArrayList arrayList;
        org.telegram.ui.Components.pa paVar;
        if (o8Var == null || o8Var.v()) {
            g71 g71Var = this.e;
            if (g71Var != null) {
                g71Var.B();
                this.e.H();
                this.e = null;
            }
            c7 c7Var = this.H;
            if (c7Var == null || !c7Var.g) {
                u61 u61Var = this.n;
                if (u61Var != null) {
                    u61Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new z6(this, 6)).start();
                }
            } else {
                c7Var.a(null);
            }
            zc zcVar = this.F;
            if (zcVar != null) {
                zcVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.K);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        g71 g71Var2 = this.e;
        if (g71Var2 != null) {
            g71Var2.H();
            this.e = null;
        }
        int i10 = 0;
        g71 g71Var3 = new g71();
        this.e = g71Var3;
        g71Var3.y = true;
        g71Var3.J = new aa.a(this, o8Var, new Runnable[]{runnable});
        u61 u61Var2 = this.n;
        if (u61Var2 != null) {
            u61Var2.clearAnimation();
            u61 u61Var3 = this.n;
            vz vzVar = u61Var3.b;
            if (vzVar != null) {
                vzVar.postRunnable(new sz(vzVar, i10));
            }
            u61Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new u61(getContext(), this.e);
        this.G.e();
        u61 u61Var4 = this.n;
        org.telegram.ui.Components.ja jaVar = o8Var.u ? null : this.G;
        u61Var4.s = jaVar;
        vz vzVar2 = u61Var4.b;
        if (vzVar2 != null && (paVar = vzVar2.I) != null) {
            org.telegram.ui.Components.ja jaVar2 = paVar.t;
            if (jaVar2 != null && jaVar2.m != null) {
                jaVar2.m = null;
            }
            paVar.t = jaVar;
            if (jaVar != null && jaVar.m != paVar) {
                jaVar.m = paVar;
                jaVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        c7 c7Var2 = this.H;
        if (c7Var2 == null || !c7Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, w7.x5.e(-2, -2, 51));
        } else {
            c7Var2.a(this.n);
        }
        bi.o1 o1Var = new bi.o1(this, 11);
        n8 n8Var = o8Var.d1;
        if (n8Var != null) {
            o1Var.run(n8Var);
        } else if (!o8Var.K || Build.VERSION.SDK_INT < 24) {
            n8 n8Var2 = new n8();
            o8Var.d1 = n8Var2;
            o1Var.run(n8Var2);
        } else {
            Utilities.globalQueue.postRunnable(new j8(o8Var, o1Var, i10));
        }
        File file = o8Var.Z0;
        if (file == null) {
            file = o8Var.L;
        }
        this.e.D(Uri.fromFile(file), "other");
        this.e.P(this.z0.isEmpty());
        this.e.N(true);
        if (o8Var.h) {
            j3 = (long) ((o8Var.Z * o8Var.h0) + j3);
        }
        if (j3 > 0) {
            this.e.L(j3, false);
        }
        c();
        w(true);
        boolean z10 = o8Var.u && (arrayList = o8Var.v) != null && arrayList.size() == 1 && ((MessageObject) o8Var.v.get(0)).type == 5;
        zc zcVar2 = this.F;
        File file2 = o8Var.Z0;
        if (file2 == null) {
            file2 = o8Var.L;
        }
        zcVar2.o(z10, file2.getAbsolutePath(), getDuration(), o8Var.P);
        this.F.setVideoLeft(o8Var.Z);
        this.F.setVideoRight(o8Var.a0);
        zc zcVar3 = this.F;
        if (zcVar3 == null || j3 <= 0) {
            return;
        }
        zcVar3.setProgress(j3);
    }

    public final void u(o8 o8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (o8Var == null) {
            this.S = null;
            return;
        }
        long j3 = o8Var.z0;
        if (j3 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e7 = e(this.S, o8Var.a, j3, o8Var.y0);
        o8Var.x0 = e7;
        this.S = e7;
        if (this.R != e7) {
            this.R = null;
        }
        if (e7 != null) {
            e7.setCallback(this);
        }
        org.telegram.ui.Components.ja jaVar = this.G;
        if (jaVar != null) {
            Drawable drawable2 = this.S;
            if (drawable2 == null) {
                jaVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                jaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                jaVar.f(createBitmap, true);
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
                f7 = v7.z6.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                        pc pcVar = ((dc) this).C0;
                        pcVar.o1.a(true, false, pcVar.i0);
                        pcVar.o1.b(pcVar.c1.getText());
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
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
            o8 o8Var = this.d;
            if ((p5 < o8Var.E || p5 > o8Var.F) && System.currentTimeMillis() - this.J > 500) {
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
            g71 g71Var = this.e;
            if (g71Var == null) {
                g71Var = this.x;
            }
            n10 = g71Var.n();
            y3 = g71Var.y();
        }
        o8 o8Var2 = this.d;
        float f7 = o8Var2.F;
        float f10 = o8Var2.E;
        long j3 = o8Var2.C;
        long j10 = (long) ((f7 - f10) * j3);
        if (y3) {
            long j11 = o8Var2.D;
            if (n10 >= j11) {
            }
        }
        z11 = false;
        long j12 = n10 - (o8Var2.D - ((long) (f10 * j3)));
        if (this.y.y() != z11) {
            this.y.P(z11);
            this.y.K(j12);
        } else if (z10) {
            if (Math.abs(this.y.n() - j12) > (j() ? 300 : 120)) {
                this.y.K(j12);
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
        g71 g71Var = this.e;
        if (g71Var != null) {
            g71Var.P(hashSet.isEmpty());
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
            o8 o8Var = this.d;
            if ((p5 < o8Var.s0 || p5 > o8Var.t0) && System.currentTimeMillis() - this.J > 500) {
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
        o8 o8Var2 = this.d;
        float f7 = o8Var2.t0;
        float f10 = o8Var2.s0;
        float f11 = o8Var2.q0;
        long j3 = (long) ((f7 - f10) * f11);
        long j10 = o8Var2.r0;
        boolean z11 = n10 >= j10 && n10 <= j3 + j10;
        boolean z12 = y3 && z11;
        long j11 = (n10 - j10) + ((long) (f10 * f11));
        rg.d2 d2Var2 = this.w;
        if (d2Var2 != null && d2Var2.B0 != z11) {
            d2Var2.B0 = z11;
            d2Var2.invalidate();
        }
        if (this.x.y() != z12) {
            this.x.P(z12);
            this.x.L(j11, false);
        } else if (z10) {
            if (Math.abs(this.x.n() - j11) > (j() ? 300 : 120)) {
                this.x.L(j11, false);
            }
        }
    }
}
