package fi;

import a8.me;
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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class o6 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public j0 A0;
    public e0 E;
    public cc F;
    public final org.telegram.ui.Components.la G;
    public final n6 H;
    public long I;
    public long J;
    public final m6 K;
    public final m6 L;
    public final m6 M;
    public p9 N;
    public boolean O;
    public final org.telegram.ui.Components.h6 P;
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
    public w7 d;
    public float d0;
    public t81 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.h6 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public i81 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public fg0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public p9 v;
    public boolean v0;
    public sg.c2 w;
    public boolean w0;
    public t81 x;
    public long x0;
    public t81 y;
    public Runnable y0;
    public final HashSet z0;

    public o6(Context context, org.telegram.ui.Components.la laVar, n6 n6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new m6(this, 2);
        this.K = new m6(this, 3);
        this.L = new m6(this, 4);
        this.M = new m6(this, 5);
        this.P = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.g);
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
        this.H = n6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(o6 o6Var, w7 w7Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (w7Var != null) {
            int measuredWidth = o6Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : o6Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (w7Var.K) {
                Bitmap bitmap = w7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = w7Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(w7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = o6Var.getContext().getContentResolver().loadThumbnail(w7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && w7Var.K && w7Var.N == null) {
                        o6Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = w7Var.Z0;
                        if (file == null) {
                            file = w7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        ag.j0 j0Var = new ag.j0(o6Var, w7Var, j11, file.getPath(), 2);
                        boolean z10 = w7Var.K;
                        bitmapArr[0] = w7.q(j0Var, measuredWidth, i10, !z10 ? w7Var.Q : 0, !z10);
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
        AndroidUtilities.runOnUIThread(new ai.e0(o6Var, bitmapArr, w7Var, zArr, 14));
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
        org.telegram.ui.ActionBar.w6 k10;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return zn.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.h4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(hg.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string) == null || org.telegram.ui.ActionBar.y6.P0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string2) == null || !org.telegram.ui.ActionBar.y6.P0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (x6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.x6 P0 = !z10 ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = P0.d;
            SparseIntArray S0 = str3 == null ? org.telegram.ui.ActionBar.y6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.y6.S0(new File(P0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.y6.ql;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    sparseIntArray.put(i11, iArr[i11]);
                }
            }
            k10 = P0.k(false);
            if (k10 == null) {
                k10.c(S0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < S0.size(); i12++) {
                    sparseIntArray.put(S0.keyAt(i12), S0.valueAt(i12));
                }
            }
            me H = org.telegram.ui.ActionBar.y6.H(P0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) H.b;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) H.a;
        }
        str = string;
        if (!z10) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = P0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.y6.ql;
        if (iArr != null) {
        }
        k10 = P0.k(false);
        if (k10 == null) {
        }
        me H2 = org.telegram.ui.ActionBar.y6.H(P0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) H2.b;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.h4 h4Var, final boolean z10) {
        if (h4Var.l()) {
            org.telegram.ui.ActionBar.y6.H(org.telegram.ui.ActionBar.h4.d(z10), h4Var.g(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.g4) h4Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g7 = h4Var.g(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.y6.Nd;
        int i12 = g7.get(i11, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.y6.Od;
        int i14 = g7.get(i13, org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.y6.Pd;
        int i16 = g7.get(i15, org.telegram.ui.ActionBar.y6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.y6.Qd;
        int i18 = g7.get(i17, org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        final vc0 vc0Var = new vc0();
        vc0Var.g = false;
        vc0Var.s(vc0Var.u, h4Var.j(z10 ? 1 : 0).settings.intensity);
        vc0Var.o(i12, i14, i16, i18, 0, true);
        vc0Var.u(0);
        final int f7 = vc0Var.f();
        h4Var.n(z10 ? 1 : 0, new ResultCallback() { // from class: fi.k6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((fg.a) pair.second).b;
                org.telegram.ui.ActionBar.h4 h4Var2 = org.telegram.ui.ActionBar.h4.this;
                if (longValue != h4Var2.h(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = h4Var2.j(z10 ? 1 : 0).settings.intensity;
                vc0 vc0Var2 = vc0Var;
                vc0Var2.s(bitmap, i19);
                vc0Var2.t(f7);
                vc0Var2.r(1.0f);
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
        return vc0Var;
    }

    private void setupCollage(w7 w7Var) {
        cc ccVar = this.F;
        if (ccVar != null) {
            ccVar.setCollage(w7Var != null ? w7Var.T : null);
        }
    }

    private void setupImage(w7 w7Var) {
        Utilities.searchQueue.postRunnable(new e2.q0(10, this, w7Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        w7 w7Var;
        t81 t81Var = this.e;
        float f10 = 0.0f;
        if (t81Var != null) {
            t81Var.W((this.O || ((w7Var = this.d) != null && w7Var.Y)) ? 0.0f : w7Var != null ? w7Var.P : 1.0f);
        }
        t81 t81Var2 = this.x;
        if (t81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                w7 w7Var2 = this.d;
                f7 = w7Var2 != null ? w7Var2.u0 : 1.0f;
            }
            t81Var2.W(f7);
        }
        t81 t81Var3 = this.y;
        if (t81Var3 != null) {
            if (!this.O) {
                w7 w7Var3 = this.d;
                f10 = w7Var3 != null ? w7Var3.G : 1.0f;
            }
            t81Var3.W(f10);
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
        w7 w7Var = this.d;
        fArr[0] = w7Var.k0;
        fArr[1] = w7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        a8.ic.a(this.b0, this.c0, fArr[0], fArr[1]);
        w7 w7Var2 = this.d;
        fArr[0] = w7Var2.k0 / 2.0f;
        fArr[1] = w7Var2.l0;
        matrix.mapPoints(fArr);
        a8.ic.a(this.b0, this.c0, fArr[0], fArr[1]);
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
            float d = ((drawable instanceof vc0) && ((vc0) drawable).u == null) ? 0.0f : this.P.d(1.0f, false);
            Drawable drawable2 = this.R;
            if (drawable2 != null && d < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - d) * 255.0f));
                w7.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (d * 255.0f));
            w7.j(canvas, this.S, getWidth(), getHeight());
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
            float e = this.f0.e(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    w7 w7Var = this.d;
                    int i10 = w7Var.k0;
                    int i11 = w7Var.l0;
                    int i12 = w7Var.Q;
                    MediaController.CropState cropState = w7Var.m0;
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
                    w7 w7Var2 = this.d;
                    canvas2.translate((-w7Var2.k0) / 2.0f, (-w7Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                w7 w7Var3 = this.d;
                int i13 = w7Var3.k0;
                int i14 = w7Var3.l0;
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
        sb sbVar = ((gb) this).C0;
        ib ibVar = sbVar.c1;
        boolean z10 = false;
        if (ibVar == null || !ibVar.O1) {
            dg0 dg0Var = sbVar.C1;
            xa0 xa0Var = dg0Var.I;
            if (dg0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    dg0Var.y = false;
                    dg0Var.E = System.currentTimeMillis();
                    dg0Var.F = motionEvent.getX();
                    dg0Var.G = motionEvent.getY();
                    fg0 fg0Var = dg0Var.w;
                    if (fg0Var != null) {
                        dg0Var.H = fg0Var.getEnhanceValue();
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
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    if (!dg0Var.y && System.currentTimeMillis() - dg0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(dg0Var.G - y3) < Math.abs(dg0Var.F - x9) && Math.abs(dg0Var.F - x9) > AndroidUtilities.touchSlop) {
                        dg0Var.y = true;
                        AndroidUtilities.cancelRunOnUIThread(xa0Var);
                        dg0Var.r = true;
                        dg0Var.invalidate();
                    }
                    if (dg0Var.y) {
                        float f7 = x9 - dg0Var.F;
                        if (dg0Var.w == null) {
                            dg0Var.x.run();
                        }
                        fg0 fg0Var2 = dg0Var.w;
                        if (fg0Var2 == null) {
                            dg0Var.y = false;
                        } else {
                            float enhanceValue = fg0Var2.getEnhanceValue();
                            float clamp = Utilities.clamp((f7 / (AndroidUtilities.displaySize.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(clamp * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(dg0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(dg0Var);
                                    dg0Var.H = clamp;
                                }
                            } else {
                                try {
                                    dg0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                dg0Var.H = clamp;
                            }
                            dg0Var.w.setEnhanceValue(clamp);
                            fg0 fg0Var3 = dg0Var.w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((fg0Var3 == null ? 0.0f : fg0Var3.getEnhanceValue()) * 100.0f), dg0Var.b, dg0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            dg0Var.f = staticLayout;
                            dg0Var.h = staticLayout.getLineCount() > 0 ? dg0Var.f.getLineWidth(0) : 0.0f;
                            dg0Var.n = dg0Var.f.getLineCount() > 0 ? dg0Var.f.getLineLeft(0) : 0.0f;
                            dg0Var.invalidate();
                        }
                    }
                    dg0Var.F = x9;
                    dg0Var.G = y3;
                } else if (action == 1 || action == 3) {
                    dg0Var.y = false;
                    dg0Var.E = -1L;
                    fg0 fg0Var4 = dg0Var.w;
                    if (fg0Var4 != null) {
                        dg0Var.H = fg0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(xa0Var, 600L);
                }
            } else if (dg0Var.r) {
                dg0Var.r = false;
                dg0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        w7 w7Var;
        w7 w7Var2;
        i81 i81Var = this.n;
        if (view == i81Var && (w7Var2 = this.d) != null && w7Var2.u) {
            return false;
        }
        if ((view != i81Var && view != this.r) || (w7Var = this.d) == null || w7Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            w7 w7Var3 = this.d;
            int i10 = w7Var3.k0;
            int i11 = w7Var3.l0;
            int i12 = w7Var3.Q;
            MediaController.CropState cropState = w7Var3.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f7 = cropState.cropPw;
            float f10 = cropState.cropPh;
            canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
            canvas.rotate(this.d.Q);
            w7 w7Var4 = this.d;
            canvas.translate((-w7Var4.k0) / 2.0f, (-w7Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 1;
        }
        return w7Var.l0;
    }

    public int getContentWidth() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 1;
        }
        return w7Var.k0;
    }

    public long getCurrentPosition() {
        t81 t81Var = this.e;
        if (t81Var != null) {
            return t81Var.n();
        }
        t81 t81Var2 = this.x;
        if (t81Var2 != null) {
            return t81Var2.n();
        }
        t81 t81Var3 = this.y;
        if (t81Var3 != null) {
            return t81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        w7 w7Var = this.d;
        if (w7Var != null) {
            double d = w7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        t81 t81Var = this.e;
        if (t81Var == null || t81Var.p() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.p();
    }

    public int getOrientation() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 0;
        }
        return w7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public i81 getTextureView() {
        return this.n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        i81 i81Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (i81Var = this.n) != null) {
                    bitmapArr[i10] = i81Var.getBitmap();
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
        w7 w7Var;
        return (this.E == null || (w7Var = this.d) == null || !w7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(w7 w7Var) {
        this.d = w7Var;
        if (w7Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (w7Var.K) {
            setupImage(w7Var);
            if (w7Var.A0 == 0 && w7Var.B0 == 0) {
                w7Var.z(new m6((gb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(w7Var);
            r();
        }
        b();
        u(w7Var);
        p(w7Var, false);
        s(w7Var, null, false);
    }

    public final void m(long j10) {
        t81 t81Var = this.e;
        if (t81Var != null) {
            t81Var.L(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            t81 t81Var2 = this.x;
            if (t81Var2 != null) {
                t81Var2.L(j10, false);
            } else {
                t81 t81Var3 = this.y;
                if (t81Var3 != null) {
                    t81Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(w7 w7Var, v9 v9Var, long j10) {
        this.d = w7Var;
        if (w7Var == null) {
            t(null, v9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (w7Var.v()) {
            setupImage(null);
            t(null, v9Var, j10);
            setupCollage(w7Var);
        } else if (w7Var.K) {
            setupImage(w7Var);
            setupCollage(null);
            t(w7Var, v9Var, j10);
            if (w7Var.A0 == 0 && w7Var.B0 == 0) {
                w7Var.z(new m6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, v9Var, 0L);
            setupImage(w7Var);
            r();
        }
        b();
        u(w7Var);
        p(w7Var, false);
        s(w7Var, null, false);
    }

    public final void o(TextureView textureView, fg0 fg0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = fg0Var;
        this.r = textureView;
        if (fg0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            e00 e00Var = fg0Var.l0;
            if (e00Var != null) {
                e00Var.i(i10, i11);
            } else {
                fg0Var.J0 = i10;
                fg0Var.K0 = i11;
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

    public final void p(w7 w7Var, boolean z10) {
        boolean z11;
        t81 t81Var = this.y;
        if (t81Var != null) {
            t81Var.B();
            this.y.H();
            this.y = null;
        }
        if (w7Var == null) {
            return;
        }
        cc ccVar = this.F;
        boolean z12 = false;
        if (ccVar != null) {
            String str = w7Var.y;
            String str2 = w7Var.A;
            String str3 = w7Var.B;
            long j10 = w7Var.C;
            long j11 = w7Var.D;
            float f7 = w7Var.E;
            float f10 = w7Var.F;
            float f11 = w7Var.G;
            if (!TextUtils.equals(ccVar.O, str)) {
                vb vbVar = ccVar.a0;
                if (vbVar != null) {
                    vbVar.a();
                    ccVar.a0 = null;
                    ccVar.U = false;
                }
                ccVar.O = str;
                ccVar.p();
            }
            ccVar.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            ccVar.N = !isEmpty;
            if (isEmpty) {
                ccVar.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (ccVar.N) {
                ccVar.R = j10;
                ccVar.Q = j11 - ((long) (j10 * f7));
                ccVar.S = f7;
                ccVar.T = f10;
                ccVar.V = f11;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, ccVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.M0 = staticLayout;
                    ccVar.N0 = staticLayout.getLineCount() > 0 ? ccVar.M0.getLineWidth(0) : 0.0f;
                    ccVar.O0 = ccVar.M0.getLineCount() > 0 ? ccVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.N0 = 0.0f;
                    ccVar.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, ccVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.Q0 = staticLayout2;
                    ccVar.R0 = staticLayout2.getLineCount() > 0 ? ccVar.Q0.getLineWidth(0) : 0.0f;
                    ccVar.S0 = ccVar.Q0.getLineCount() > 0 ? ccVar.Q0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.R0 = 0.0f;
                    ccVar.Q0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                ccVar.e0.f(ccVar.N, true);
            }
            ccVar.invalidate();
        } else {
            z11 = true;
        }
        if (w7Var.y != null) {
            t81 t81Var2 = new t81();
            this.y = t81Var2;
            t81Var2.y = z11;
            t81Var2.J = new rb.c(this, 21);
            t81Var2.D(Uri.fromFile(new File(w7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (w7Var.Z * getDuration());
                this.e.L(duration, false);
                this.F.setProgress(duration);
            }
            z11 = true;
            w(true);
        }
        sb sbVar = ((gb) this).C0;
        ta taVar = sbVar.v1;
        if (taVar != null) {
            w7 w7Var2 = sbVar.K1;
            if (w7Var2 != null && w7Var2.y != null) {
                z12 = z11;
            }
            taVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        long duration;
        w7 w7Var = this.d;
        if (w7Var != null) {
            w7Var.j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                w7Var.y = null;
                w7Var.z = null;
                w7Var.A = null;
                w7Var.B = null;
                w7Var.D = 0L;
                w7Var.C = 0L;
                w7Var.E = 0.0f;
                w7Var.F = 1.0f;
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
                            w7 w7Var2 = this.d;
                            w7Var2.y = null;
                            w7Var2.z = null;
                            w7Var2.A = null;
                            w7Var2.B = null;
                            w7Var2.D = 0L;
                            w7Var2.C = 0L;
                            w7Var2.E = 0.0f;
                            w7Var2.F = 1.0f;
                            return;
                        }
                        this.d.y = pathToAttach.getAbsolutePath();
                    }
                    this.d.y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.y = messageObject.messageOwner.attachPath;
                }
                w7 w7Var3 = this.d;
                w7Var3.A = null;
                w7Var3.B = null;
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
                w7 w7Var4 = this.d;
                w7Var4.D = 0L;
                if (w7Var4.K) {
                    w7Var4.D = (long) (w7Var4.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        w7 w7Var5 = ((d0) obj).n;
                        if (w7Var5 != null && w7Var5.K) {
                            duration = this.E.getDuration();
                            break;
                        }
                    }
                }
                w7 w7Var6 = this.d;
                duration = w7Var6.K ? getDuration() : w7Var6.C;
                cc ccVar = this.F;
                int maxCount = ccVar == null ? 1 : ccVar.getMaxCount();
                w7 w7Var7 = this.d;
                w7Var7.F = w7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        w7 w7Var = this.d;
        int i10 = w7Var.A0;
        Paint paint = this.T;
        if (i10 == 0 || w7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new c4(this, measuredHeight, 1).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f7 = measuredHeight;
            w7 w7Var2 = this.d;
            int i11 = w7Var2.A0;
            this.U = i11;
            int i12 = w7Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            i81 i81Var = this.n;
            if (i81Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                e00 e00Var = i81Var.b;
                if (e00Var == null) {
                    i81Var.n = i13;
                    i81Var.r = i14;
                } else {
                    e00Var.i(i13, i14);
                }
            }
            fg0 fg0Var = this.s;
            if (fg0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                e00 e00Var2 = fg0Var.l0;
                if (e00Var2 != null) {
                    e00Var2.i(i15, i16);
                } else {
                    fg0Var.J0 = i15;
                    fg0Var.K0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(w7 w7Var, sg.c2 c2Var, boolean z10) {
        t81 t81Var;
        if (w7Var == null || w7Var.o0 == null) {
            t81 t81Var2 = this.x;
            if (t81Var2 != null) {
                t81Var2.B();
                this.x.H();
                this.x = null;
            }
            cc ccVar = this.F;
            if (ccVar != null) {
                ccVar.setRoundNull(z10);
            }
            this.w = null;
            AndroidUtilities.cancelRunOnUIThread(this.K);
            return;
        }
        t81 t81Var3 = this.x;
        if (t81Var3 != null) {
            t81Var3.H();
            this.x = null;
        }
        t81 t81Var4 = new t81();
        this.x = t81Var4;
        t81Var4.y = true;
        t81Var4.J = new b6.i(this, 21);
        this.x.D(Uri.fromFile(w7Var.o0), "other");
        c();
        this.w = c2Var;
        if (c2Var != null && (t81Var = this.x) != null) {
            t81Var.V(c2Var.u0);
        }
        this.F.n(w7Var.o0.getAbsolutePath(), w7Var.q0, w7Var.r0, w7Var.s0, w7Var.t0, w7Var.u0, z10);
        y(true);
    }

    public void set(w7 w7Var) {
        n(w7Var, null, 0L);
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

    public void setVideoTimelineView(cc ccVar) {
        this.F = ccVar;
        if (ccVar != null) {
            ccVar.setDelegate(new za.c(this, 22));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(w7 w7Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ra raVar;
        if (w7Var == null || w7Var.v()) {
            t81 t81Var = this.e;
            if (t81Var != null) {
                t81Var.B();
                this.e.H();
                this.e = null;
            }
            n6 n6Var = this.H;
            if (n6Var == null || !n6Var.g) {
                i81 i81Var = this.n;
                if (i81Var != null) {
                    i81Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new m6(this, 6)).start();
                }
            } else {
                n6Var.a(null);
            }
            cc ccVar = this.F;
            if (ccVar != null) {
                ccVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.K);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        t81 t81Var2 = this.e;
        if (t81Var2 != null) {
            t81Var2.H();
            this.e = null;
        }
        int i10 = 0;
        t81 t81Var3 = new t81();
        this.e = t81Var3;
        t81Var3.y = true;
        t81Var3.J = new a8.h0(this, w7Var, new Runnable[]{runnable});
        i81 i81Var2 = this.n;
        if (i81Var2 != null) {
            i81Var2.clearAnimation();
            i81 i81Var3 = this.n;
            e00 e00Var = i81Var3.b;
            if (e00Var != null) {
                e00Var.postRunnable(new b00(e00Var, i10));
            }
            i81Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new i81(getContext(), this.e);
        this.G.e();
        i81 i81Var4 = this.n;
        org.telegram.ui.Components.la laVar = w7Var.u ? null : this.G;
        i81Var4.s = laVar;
        e00 e00Var2 = i81Var4.b;
        if (e00Var2 != null && (raVar = e00Var2.I) != null) {
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
        n6 n6Var2 = this.H;
        if (n6Var2 == null || !n6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, kb1.i(-2, -2, 51));
        } else {
            n6Var2.a(this.n);
        }
        ai.i iVar = new ai.i(this, 23);
        v7 v7Var = w7Var.d1;
        if (v7Var != null) {
            iVar.run(v7Var);
        } else if (!w7Var.K || Build.VERSION.SDK_INT < 24) {
            v7 v7Var2 = new v7();
            w7Var.d1 = v7Var2;
            iVar.run(v7Var2);
        } else {
            Utilities.globalQueue.postRunnable(new r7(w7Var, iVar, i10));
        }
        File file = w7Var.Z0;
        if (file == null) {
            file = w7Var.L;
        }
        this.e.D(Uri.fromFile(file), "other");
        this.e.P(this.z0.isEmpty());
        this.e.N(true);
        if (w7Var.h) {
            j10 = (long) ((w7Var.Z * w7Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.L(j10, false);
        }
        c();
        w(true);
        boolean z10 = w7Var.u && (arrayList = w7Var.v) != null && arrayList.size() == 1 && ((MessageObject) w7Var.v.get(0)).type == 5;
        cc ccVar2 = this.F;
        File file2 = w7Var.Z0;
        if (file2 == null) {
            file2 = w7Var.L;
        }
        ccVar2.o(z10, file2.getAbsolutePath(), getDuration(), w7Var.P);
        this.F.setVideoLeft(w7Var.Z);
        this.F.setVideoRight(w7Var.a0);
        cc ccVar3 = this.F;
        if (ccVar3 == null || j10 <= 0) {
            return;
        }
        ccVar3.setProgress(j10);
    }

    public final void u(w7 w7Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (w7Var == null) {
            this.S = null;
            return;
        }
        long j10 = w7Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e = e(this.S, w7Var.a, j10, w7Var.y0);
        w7Var.x0 = e;
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
                f7 = a8.ic.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                        sb sbVar = ((gb) this).C0;
                        sbVar.o1.a(true, false, sbVar.i0);
                        sbVar.o1.b(sbVar.c1.getText());
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
            float p10 = n11 / this.y.p();
            w7 w7Var = this.d;
            if ((p10 < w7Var.E || p10 > w7Var.F) && System.currentTimeMillis() - this.J > 500) {
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
            t81 t81Var = this.e;
            if (t81Var == null) {
                t81Var = this.x;
            }
            n10 = t81Var.n();
            y3 = t81Var.y();
        }
        w7 w7Var2 = this.d;
        float f7 = w7Var2.F;
        float f10 = w7Var2.E;
        long j10 = w7Var2.C;
        long j11 = (long) ((f7 - f10) * j10);
        if (y3) {
            long j12 = w7Var2.D;
            if (n10 >= j12) {
            }
        }
        z11 = false;
        long j13 = n10 - (w7Var2.D - ((long) (f10 * j10)));
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
        t81 t81Var = this.e;
        if (t81Var != null) {
            t81Var.P(hashSet.isEmpty());
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
            sg.c2 c2Var = this.w;
            if (c2Var != null && !c2Var.B0) {
                c2Var.B0 = true;
                c2Var.C0.f(true, true);
                c2Var.invalidate();
            }
            long n11 = this.x.n();
            if (!z10 || this.x.p() == -9223372036854775807L) {
                return;
            }
            float p10 = n11 / this.x.p();
            w7 w7Var = this.d;
            if ((p10 < w7Var.s0 || p10 > w7Var.t0) && System.currentTimeMillis() - this.J > 500) {
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
        w7 w7Var2 = this.d;
        float f7 = w7Var2.t0;
        float f10 = w7Var2.s0;
        float f11 = w7Var2.q0;
        long j10 = (long) ((f7 - f10) * f11);
        long j11 = w7Var2.r0;
        boolean z11 = n10 >= j11 && n10 <= j10 + j11;
        boolean z12 = y3 && z11;
        long j12 = (n10 - j11) + ((long) (f10 * f11));
        sg.c2 c2Var2 = this.w;
        if (c2Var2 != null && c2Var2.B0 != z11) {
            c2Var2.B0 = z11;
            c2Var2.invalidate();
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
