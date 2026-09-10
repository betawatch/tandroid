package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ho;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class e8 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public n0 A0;
    public j0 E;
    public me F;
    public final org.telegram.ui.Components.ia G;
    public final d8 H;
    public long I;
    public long J;
    public final b8 K;
    public final b8 L;
    public final b8 M;
    public tb N;
    public boolean O;
    public final org.telegram.ui.Components.d6 P;
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
    public r9 d;
    public float d0;
    public t71 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.d6 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public h71 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public sf0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public tb v;
    public boolean v0;
    public pg.b2 w;
    public boolean w0;
    public t71 x;
    public long x0;
    public t71 y;
    public Runnable y0;
    public final HashSet z0;

    public e8(Context context, org.telegram.ui.Components.ia iaVar, d8 d8Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new b8(this, 2);
        this.K = new b8(this, 3);
        this.L = new b8(this, 4);
        this.M = new b8(this, 5);
        this.P = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.g);
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
        this.G = iaVar;
        this.H = d8Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e8 e8Var, r9 r9Var) {
        long j3;
        long j10;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (r9Var != null) {
            int measuredWidth = e8Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : e8Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (r9Var.K) {
                Bitmap bitmap = r9Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = r9Var.N) != null && str.startsWith("vthumb://")) {
                    j3 = Long.parseLong(r9Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = e8Var.getContext().getContentResolver().loadThumbnail(r9Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j3) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j3), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j10 = j3;
                    if (j10 >= 0 && r9Var.K && r9Var.N == null) {
                        e8Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = r9Var.Z0;
                        if (file == null) {
                            file = r9Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        a8 a8Var = new a8(e8Var, r9Var, j10, file.getPath(), 0);
                        boolean z10 = r9Var.K;
                        bitmapArr[0] = r9.q(a8Var, measuredWidth, i10, !z10 ? r9Var.Q : 0, !z10);
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
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(e8Var, bitmapArr, r9Var, zArr, 1));
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
            return ho.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.f4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(eg.b.d(wallPaper.settings.emoticon));
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
            u6 H = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray, strArr[0], 0, true);
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
        u6 H2 = org.telegram.ui.ActionBar.j6.H(N0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.f4 f4Var, final boolean z10) {
        if (f4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.f4.e(z10), f4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = f4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final lc0 lc0Var = new lc0();
        lc0Var.g = false;
        lc0Var.t(lc0Var.u, f4Var.k(z10 ? 1 : 0).settings.intensity);
        lc0Var.o(i12, i14, i16, i18, 0, true);
        lc0Var.v(0);
        final int f7 = lc0Var.f();
        f4Var.o(z10 ? 1 : 0, new ResultCallback() { // from class: bi.y7
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((cg.a) pair.second).b;
                org.telegram.ui.ActionBar.f4 f4Var2 = org.telegram.ui.ActionBar.f4.this;
                if (longValue != f4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = f4Var2.k(z10 ? 1 : 0).settings.intensity;
                lc0 lc0Var2 = lc0Var;
                lc0Var2.t(bitmap, i19);
                lc0Var2.u(f7);
                lc0Var2.s(1.0f);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(Throwable th2) {
                org.telegram.tgnet.o.a(this, th2);
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final /* synthetic */ void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.o.b(this, tL_error);
            }
        });
        return lc0Var;
    }

    private void setupCollage(r9 r9Var) {
        me meVar = this.F;
        if (meVar != null) {
            meVar.setCollage(r9Var != null ? r9Var.T : null);
        }
    }

    private void setupImage(r9 r9Var) {
        Utilities.searchQueue.postRunnable(new a1.e(16, this, r9Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        r9 r9Var;
        t71 t71Var = this.e;
        float f10 = 0.0f;
        if (t71Var != null) {
            t71Var.W((this.O || ((r9Var = this.d) != null && r9Var.Y)) ? 0.0f : r9Var != null ? r9Var.P : 1.0f);
        }
        t71 t71Var2 = this.x;
        if (t71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                r9 r9Var2 = this.d;
                f7 = r9Var2 != null ? r9Var2.u0 : 1.0f;
            }
            t71Var2.W(f7);
        }
        t71 t71Var3 = this.y;
        if (t71Var3 != null) {
            if (!this.O) {
                r9 r9Var3 = this.d;
                f10 = r9Var3 != null ? r9Var3.G : 1.0f;
            }
            t71Var3.W(f10);
        }
        j0 j0Var = this.E;
        if (j0Var != null) {
            j0Var.setMuted(this.O);
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
        r9 r9Var = this.d;
        fArr[0] = r9Var.k0;
        fArr[1] = r9Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        v7.a7.a(this.b0, this.c0, fArr[0], fArr[1]);
        r9 r9Var2 = this.d;
        fArr[0] = r9Var2.k0 / 2.0f;
        fArr[1] = r9Var2.l0;
        matrix.mapPoints(fArr);
        v7.a7.a(this.b0, this.c0, fArr[0], fArr[1]);
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
            float d = ((drawable instanceof lc0) && ((lc0) drawable).u == null) ? 0.0f : this.P.d(1.0f, false);
            Drawable drawable2 = this.R;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                r9.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (d * 255.0f));
            r9.j(canvas, this.S, getWidth(), getHeight());
            if (this.g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        n0 n0Var = this.A0;
        if (n0Var != null) {
            n0Var.d.b(canvas2, true);
        } else if (this.e0 && this.d != null && !j()) {
            float e = this.f0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    r9 r9Var = this.d;
                    int i10 = r9Var.k0;
                    int i11 = r9Var.l0;
                    int i12 = r9Var.Q;
                    MediaController.CropState cropState = r9Var.m0;
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
                    r9 r9Var2 = this.d;
                    canvas2.translate((-r9Var2.k0) / 2.0f, (-r9Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                r9 r9Var3 = this.d;
                int i13 = r9Var3.k0;
                int i14 = r9Var3.l0;
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
        ce ceVar = ((nd) this).C0;
        qd qdVar = ceVar.c1;
        boolean z10 = false;
        if (qdVar == null || !qdVar.O1) {
            qf0 qf0Var = ceVar.C1;
            kc0 kc0Var = qf0Var.I;
            if (qf0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    qf0Var.y = false;
                    qf0Var.E = System.currentTimeMillis();
                    qf0Var.F = motionEvent.getX();
                    qf0Var.G = motionEvent.getY();
                    sf0 sf0Var = qf0Var.w;
                    if (sf0Var != null) {
                        qf0Var.H = sf0Var.getEnhanceValue();
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
                    if (!qf0Var.y && System.currentTimeMillis() - qf0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(qf0Var.G - y3) < Math.abs(qf0Var.F - x10) && Math.abs(qf0Var.F - x10) > AndroidUtilities.touchSlop) {
                        qf0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(kc0Var);
                        qf0Var.r = true;
                        qf0Var.invalidate();
                    }
                    if (qf0Var.y) {
                        float f7 = x10 - qf0Var.F;
                        if (qf0Var.w == null) {
                            qf0Var.x.run();
                        }
                        sf0 sf0Var2 = qf0Var.w;
                        if (sf0Var2 == null) {
                            qf0Var.y = false;
                        } else {
                            float enhanceValue = sf0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f7 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(qf0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(qf0Var);
                                    qf0Var.H = clamp;
                                }
                            } else {
                                try {
                                    qf0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                qf0Var.H = clamp;
                            }
                            qf0Var.w.setEnhanceValue(clamp);
                            sf0 sf0Var3 = qf0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((sf0Var3 == null ? 0.0f : sf0Var3.getEnhanceValue()) * 100.0f), qf0Var.b, qf0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            qf0Var.f = staticLayout;
                            qf0Var.h = staticLayout.getLineCount() > 0 ? qf0Var.f.getLineWidth(0) : 0.0f;
                            qf0Var.n = qf0Var.f.getLineCount() > 0 ? qf0Var.f.getLineLeft(0) : 0.0f;
                            qf0Var.invalidate();
                        }
                    }
                    qf0Var.F = x10;
                    qf0Var.G = y3;
                } else if (action == 1 || action == 3) {
                    qf0Var.y = false;
                    qf0Var.E = -1L;
                    sf0 sf0Var4 = qf0Var.w;
                    if (sf0Var4 != null) {
                        qf0Var.H = sf0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(kc0Var, 600L);
                }
            } else if (qf0Var.r) {
                qf0Var.r = false;
                qf0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r9 r9Var;
        r9 r9Var2;
        h71 h71Var = this.n;
        if (view == h71Var && (r9Var2 = this.d) != null && r9Var2.u) {
            return false;
        }
        if ((view != h71Var && view != this.r) || (r9Var = this.d) == null || r9Var.m0 == null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            r9 r9Var3 = this.d;
            int i10 = r9Var3.k0;
            int i11 = r9Var3.l0;
            int i12 = r9Var3.Q;
            MediaController.CropState cropState = r9Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f7 = cropState.cropPw;
            float f10 = cropState.cropPh;
            canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            r9 r9Var4 = this.d;
            canvas.translate((-r9Var4.k0) / 2.0f, (-r9Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 1;
        }
        return r9Var.l0;
    }

    public int getContentWidth() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 1;
        }
        return r9Var.k0;
    }

    public long getCurrentPosition() {
        t71 t71Var = this.e;
        if (t71Var != null) {
            return t71Var.n();
        }
        t71 t71Var2 = this.x;
        if (t71Var2 != null) {
            return t71Var2.n();
        }
        t71 t71Var3 = this.y;
        if (t71Var3 != null) {
            return t71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        r9 r9Var = this.d;
        if (r9Var != null) {
            double d = r9Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        t71 t71Var = this.e;
        if (t71Var == null || t71Var.p() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.p();
    }

    public int getOrientation() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 0;
        }
        return r9Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public h71 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        h71 h71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (h71Var = this.n) != null) {
                    bitmapArr[i10] = h71Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new z7(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        r9 r9Var;
        return (this.E == null || (r9Var = this.d) == null || !r9Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(r9 r9Var) {
        this.d = r9Var;
        if (r9Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (r9Var.K) {
            setupImage(r9Var);
            if (r9Var.A0 == 0 && r9Var.B0 == 0) {
                r9Var.z(new b8((nd) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(r9Var);
            r();
        }
        b();
        u(r9Var);
        p(r9Var, false);
        s(r9Var, null, false);
    }

    public final void m(long j3) {
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            t71 t71Var2 = this.x;
            if (t71Var2 != null) {
                t71Var2.L(j3, false);
            } else {
                t71 t71Var3 = this.y;
                if (t71Var3 != null) {
                    t71Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(r9 r9Var, zb zbVar, long j3) {
        this.d = r9Var;
        if (r9Var == null) {
            t(null, zbVar, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (r9Var.v()) {
            setupImage(null);
            t(null, zbVar, j3);
            setupCollage(r9Var);
        } else if (r9Var.K) {
            setupImage(r9Var);
            setupCollage(null);
            t(r9Var, zbVar, j3);
            if (r9Var.A0 == 0 && r9Var.B0 == 0) {
                r9Var.z(new b8(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, zbVar, 0L);
            setupImage(r9Var);
            r();
        }
        b();
        u(r9Var);
        p(r9Var, false);
        s(r9Var, null, false);
    }

    public final void o(TextureView textureView, sf0 sf0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = sf0Var;
        this.r = textureView;
        if (sf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            c00 c00Var = sf0Var.l0;
            if (c00Var != null) {
                c00Var.i(i10, i11);
            } else {
                sf0Var.J0 = i10;
                sf0Var.K0 = i11;
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

    public final void p(r9 r9Var, boolean z10) {
        boolean z11;
        t71 t71Var = this.y;
        if (t71Var != null) {
            t71Var.B();
            this.y.H();
            this.y = null;
        }
        if (r9Var == null) {
            return;
        }
        me meVar = this.F;
        boolean z12 = false;
        if (meVar != null) {
            String str = r9Var.y;
            String str2 = r9Var.A;
            String str3 = r9Var.B;
            long j3 = r9Var.C;
            long j10 = r9Var.D;
            float f7 = r9Var.E;
            float f10 = r9Var.F;
            float f11 = r9Var.G;
            if (!TextUtils.equals(meVar.O, str)) {
                fe feVar = meVar.a0;
                if (feVar != null) {
                    feVar.a();
                    meVar.a0 = null;
                    meVar.U = false;
                }
                meVar.O = str;
                meVar.p();
            }
            meVar.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            meVar.N = !isEmpty;
            if (isEmpty) {
                meVar.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (meVar.N) {
                meVar.R = j3;
                meVar.Q = j10 - ((long) (j3 * f7));
                meVar.S = f7;
                meVar.T = f10;
                meVar.V = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, meVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    meVar.M0 = staticLayout;
                    meVar.N0 = staticLayout.getLineCount() > 0 ? meVar.M0.getLineWidth(0) : 0.0f;
                    meVar.O0 = meVar.M0.getLineCount() > 0 ? meVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    meVar.N0 = 0.0f;
                    meVar.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, meVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    meVar.Q0 = staticLayout2;
                    meVar.R0 = staticLayout2.getLineCount() > 0 ? meVar.Q0.getLineWidth(0) : 0.0f;
                    meVar.S0 = meVar.Q0.getLineCount() > 0 ? meVar.Q0.getLineLeft(0) : 0.0f;
                } else {
                    meVar.R0 = 0.0f;
                    meVar.Q0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                meVar.e0.f(meVar.N, true);
            }
            meVar.invalidate();
        } else {
            z11 = true;
        }
        if (r9Var.y != null) {
            t71 t71Var2 = new t71();
            this.y = t71Var2;
            t71Var2.y = z11;
            t71Var2.J = new pb.c(this, 7);
            t71Var2.D(Uri.fromFile(new File(r9Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (r9Var.Z * getDuration());
                this.e.L(duration, false);
                this.F.setProgress(duration);
            }
            w(true);
        }
        ce ceVar = ((nd) this).C0;
        ad adVar = ceVar.v1;
        if (adVar != null) {
            r9 r9Var2 = ceVar.K1;
            if (r9Var2 != null && r9Var2.y != null) {
                z12 = true;
            }
            adVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        r9 r9Var = this.d;
        if (r9Var != null) {
            r9Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                r9Var.y = null;
                r9Var.z = null;
                r9Var.A = null;
                r9Var.B = null;
                r9Var.D = 0L;
                r9Var.C = 0L;
                r9Var.E = 0.0f;
                r9Var.F = 1.0f;
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
                            r9 r9Var2 = this.d;
                            r9Var2.y = null;
                            r9Var2.z = null;
                            r9Var2.A = null;
                            r9Var2.B = null;
                            r9Var2.D = 0L;
                            r9Var2.C = 0L;
                            r9Var2.E = 0.0f;
                            r9Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                r9 r9Var3 = this.d;
                r9Var3.A = null;
                r9Var3.B = null;
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
                r9 r9Var4 = this.d;
                r9Var4.D = 0L;
                if (r9Var4.K) {
                    r9Var4.D = (long) (r9Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        r9 r9Var5 = ((i0) obj).n;
                        if (r9Var5 != null && r9Var5.K) {
                            duration = this.E.getDuration();
                            break;
                        }
                    }
                }
                r9 r9Var6 = this.d;
                duration = r9Var6.K ? getDuration() : r9Var6.C;
                me meVar = this.F;
                int maxCount = meVar == null ? 1 : meVar.getMaxCount();
                r9 r9Var7 = this.d;
                r9Var7.F = r9Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        r9 r9Var = this.d;
        int i10 = r9Var.A0;
        Paint paint = this.T;
        if (i10 == 0 || r9Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new c8(this, measuredHeight, 0).run(r0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f7 = measuredHeight;
            r9 r9Var2 = this.d;
            int i11 = r9Var2.A0;
            this.U = i11;
            int i12 = r9Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            h71 h71Var = this.n;
            if (h71Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                c00 c00Var = h71Var.b;
                if (c00Var == null) {
                    h71Var.n = i13;
                    h71Var.r = i14;
                } else {
                    c00Var.i(i13, i14);
                }
            }
            sf0 sf0Var = this.s;
            if (sf0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                c00 c00Var2 = sf0Var.l0;
                if (c00Var2 != null) {
                    c00Var2.i(i15, i16);
                } else {
                    sf0Var.J0 = i15;
                    sf0Var.K0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(r9 r9Var, pg.b2 b2Var, boolean z10) {
        t71 t71Var;
        if (r9Var == null || r9Var.o0 == null) {
            t71 t71Var2 = this.x;
            if (t71Var2 != null) {
                t71Var2.B();
                this.x.H();
                this.x = null;
            }
            me meVar = this.F;
            if (meVar != null) {
                meVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.K);
            return;
        }
        t71 t71Var3 = this.x;
        if (t71Var3 != null) {
            t71Var3.H();
            this.x = null;
        }
        t71 t71Var4 = new t71();
        this.x = t71Var4;
        t71Var4.y = true;
        t71Var4.J = new a6.i(this, 9);
        this.x.D(Uri.fromFile(r9Var.o0), "other");
        c();
        this.w = b2Var;
        if (b2Var != null && (t71Var = this.x) != null) {
            t71Var.V(b2Var.u0);
        }
        this.F.n(r9Var.o0.getAbsolutePath(), r9Var.q0, r9Var.r0, r9Var.s0, r9Var.t0, r9Var.u0, z10);
        y(true);
    }

    public void set(r9 r9Var) {
        n(r9Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.k0 = z10;
    }

    public void setCollageView(j0 j0Var) {
        this.E = j0Var;
    }

    public void setCropEditorDrawing(n0 n0Var) {
        if (this.A0 != n0Var) {
            this.A0 = n0Var;
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

    public void setVideoTimelineView(me meVar) {
        this.F = meVar;
        if (meVar != null) {
            meVar.setDelegate(new xa.c(this, 10));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(r9 r9Var, Runnable runnable, long j3) {
        ArrayList arrayList;
        org.telegram.ui.Components.oa oaVar;
        if (r9Var == null || r9Var.v()) {
            t71 t71Var = this.e;
            if (t71Var != null) {
                t71Var.B();
                this.e.H();
                this.e = null;
            }
            d8 d8Var = this.H;
            if (d8Var == null || !d8Var.g) {
                h71 h71Var = this.n;
                if (h71Var != null) {
                    h71Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new b8(this, 6)).start();
                }
            } else {
                d8Var.a(null);
            }
            me meVar = this.F;
            if (meVar != null) {
                meVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.K);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        t71 t71Var2 = this.e;
        if (t71Var2 != null) {
            t71Var2.H();
            this.e = null;
        }
        int i10 = 0;
        t71 t71Var3 = new t71();
        this.e = t71Var3;
        t71Var3.y = true;
        t71Var3.J = new aa.a(this, r9Var, new Runnable[]{runnable});
        h71 h71Var2 = this.n;
        if (h71Var2 != null) {
            h71Var2.clearAnimation();
            h71 h71Var3 = this.n;
            c00 c00Var = h71Var3.b;
            if (c00Var != null) {
                c00Var.postRunnable(new zz(c00Var, i10));
            }
            h71Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new h71(getContext(), this.e);
        this.G.e();
        h71 h71Var4 = this.n;
        org.telegram.ui.Components.ia iaVar = r9Var.u ? null : this.G;
        h71Var4.s = iaVar;
        c00 c00Var2 = h71Var4.b;
        if (c00Var2 != null && (oaVar = c00Var2.I) != null) {
            org.telegram.ui.Components.ia iaVar2 = oaVar.t;
            if (iaVar2 != null && iaVar2.m != null) {
                iaVar2.m = null;
            }
            oaVar.t = iaVar;
            if (iaVar != null && iaVar.m != oaVar) {
                iaVar.m = oaVar;
                iaVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        d8 d8Var2 = this.H;
        if (d8Var2 == null || !d8Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, w7.a6.e(-2, -2, 51));
        } else {
            d8Var2.a(this.n);
        }
        ai.b bVar = new ai.b(this, 7);
        q9 q9Var = r9Var.d1;
        if (q9Var != null) {
            bVar.run(q9Var);
        } else if (!r9Var.K || Build.VERSION.SDK_INT < 24) {
            q9 q9Var2 = new q9();
            r9Var.d1 = q9Var2;
            bVar.run(q9Var2);
        } else {
            Utilities.globalQueue.postRunnable(new m9(r9Var, bVar, i10));
        }
        File file = r9Var.Z0;
        if (file == null) {
            file = r9Var.L;
        }
        this.e.D(Uri.fromFile(file), "other");
        this.e.P(this.z0.isEmpty());
        this.e.N(true);
        if (r9Var.h) {
            j3 = (long) ((r9Var.Z * r9Var.h0) + j3);
        }
        if (j3 > 0) {
            this.e.L(j3, false);
        }
        c();
        w(true);
        boolean z10 = r9Var.u && (arrayList = r9Var.v) != null && arrayList.size() == 1 && ((MessageObject) r9Var.v.get(0)).type == 5;
        me meVar2 = this.F;
        File file2 = r9Var.Z0;
        if (file2 == null) {
            file2 = r9Var.L;
        }
        meVar2.o(z10, file2.getAbsolutePath(), getDuration(), r9Var.P);
        this.F.setVideoLeft(r9Var.Z);
        this.F.setVideoRight(r9Var.a0);
        me meVar3 = this.F;
        if (meVar3 == null || j3 <= 0) {
            return;
        }
        meVar3.setProgress(j3);
    }

    public final void u(r9 r9Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (r9Var == null) {
            this.S = null;
            return;
        }
        long j3 = r9Var.z0;
        if (j3 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e = e(this.S, r9Var.a, j3, r9Var.y0);
        r9Var.x0 = e;
        this.S = e;
        if (this.R != e) {
            this.R = null;
        }
        if (e != null) {
            e.setCallback(this);
        }
        org.telegram.ui.Components.ia iaVar = this.G;
        if (iaVar != null) {
            Drawable drawable2 = this.S;
            if (drawable2 == null) {
                iaVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                iaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                iaVar.f(createBitmap, true);
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
                f7 = v7.a7.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                        ce ceVar = ((nd) this).C0;
                        ceVar.o1.a(true, false, ceVar.i0);
                        ceVar.o1.b(ceVar.c1.getText());
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
            r9 r9Var = this.d;
            if ((p5 < r9Var.E || p5 > r9Var.F) && System.currentTimeMillis() - this.J > 500) {
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
            t71 t71Var = this.e;
            if (t71Var == null) {
                t71Var = this.x;
            }
            n10 = t71Var.n();
            y3 = t71Var.y();
        }
        r9 r9Var2 = this.d;
        float f7 = r9Var2.F;
        float f10 = r9Var2.E;
        long j3 = r9Var2.C;
        long j10 = (long) ((f7 - f10) * j3);
        if (y3) {
            long j11 = r9Var2.D;
            if (n10 >= j11) {
            }
        }
        z11 = false;
        long j12 = n10 - (r9Var2.D - ((long) (f10 * j3)));
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
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.P(hashSet.isEmpty());
        }
        j0 j0Var = this.E;
        if (j0Var != null) {
            j0Var.setPlaying(hashSet.isEmpty());
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
            pg.b2 b2Var = this.w;
            if (b2Var != null && !b2Var.B0) {
                b2Var.B0 = true;
                b2Var.C0.f(true, true);
                b2Var.invalidate();
            }
            long n11 = this.x.n();
            if (!z10 || this.x.p() == -9223372036854775807L) {
                return;
            }
            float p5 = n11 / this.x.p();
            r9 r9Var = this.d;
            if ((p5 < r9Var.s0 || p5 > r9Var.t0) && System.currentTimeMillis() - this.J > 500) {
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
        r9 r9Var2 = this.d;
        float f7 = r9Var2.t0;
        float f10 = r9Var2.s0;
        float f11 = r9Var2.q0;
        long j3 = (long) ((f7 - f10) * f11);
        long j10 = r9Var2.r0;
        boolean z11 = n10 >= j10 && n10 <= j3 + j10;
        boolean z12 = y3 && z11;
        long j11 = (n10 - j10) + ((long) (f10 * f11));
        pg.b2 b2Var2 = this.w;
        if (b2Var2 != null && b2Var2.B0 != z11) {
            b2Var2.B0 = z11;
            b2Var2.invalidate();
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
