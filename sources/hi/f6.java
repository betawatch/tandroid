package hi;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.za0;
import org.telegram.ui.en;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class f6 extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final HashSet A0;
    public s0 B0;
    public h61 E;
    public n0 F;
    public xb G;
    public final org.telegram.ui.Components.ba H;
    public final e6 I;
    public long J;
    public long K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public m9 O;
    public boolean P;
    public final org.telegram.ui.Components.c6 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap a;
    public final Matrix a0;
    public final Rect b;
    public final float[] b0;
    public final Rect c;
    public float c0;
    public x7 d;
    public float d0;
    public h61 e;
    public float e0;
    public int f;
    public boolean f0;
    public final org.telegram.ui.Components.c6 g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public x51 n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public de0 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public m9 w;
    public boolean w0;
    public tg.w1 x;
    public boolean x0;
    public h61 y;
    public long y0;
    public Runnable z0;

    public f6(Context context, org.telegram.ui.Components.ba baVar, e6 e6Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new d6(this, 1);
        this.L = new d6(this, 2);
        this.M = new d6(this, 3);
        this.N = new d6(this, 4);
        this.Q = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new org.telegram.ui.Components.c6(this, 0L, 320L, kr.g);
        this.h0 = false;
        this.i0 = new Matrix();
        this.j0 = new Matrix();
        this.k0 = new Matrix();
        this.l0 = true;
        this.m0 = new PointF();
        this.n0 = new PointF();
        this.t0 = new Matrix();
        this.u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = baVar;
        this.I = e6Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f6 f6Var, x7 x7Var) {
        long j3;
        long j10;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (x7Var != null) {
            int measuredWidth = f6Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : f6Var.getMeasuredWidth();
            int i7 = (int) ((measuredWidth * 16) / 9.0f);
            if (x7Var.K) {
                Bitmap bitmap = x7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = x7Var.N) != null && str.startsWith("vthumb://")) {
                    j3 = Long.parseLong(x7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = f6Var.getContext().getContentResolver().loadThumbnail(x7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j3) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j3), new Size(measuredWidth, i7), null);
                        } catch (Exception unused) {
                        }
                    }
                    j10 = j3;
                    if (j10 >= 0 && x7Var.K && x7Var.N == null) {
                        f6Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = x7Var.Z0;
                        if (file == null) {
                            file = x7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        bg.f0 f0Var = new bg.f0(f6Var, x7Var, j10, file.getPath(), 2);
                        boolean z10 = x7Var.K;
                        bitmapArr[0] = x7.q(f0Var, measuredWidth, i7, !z10 ? x7Var.Q : 0, !z10);
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
        org.telegram.messenger.g0.g3(new ai.j(f6Var, bitmapArr, x7Var, zArr, 20));
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull d2 = mp.u1(i7).d2(j3);
            if (d2 != null) {
                wallPaper = d2.wallpaper;
            }
        } else {
            TLRPC.ChatFull P0 = mp.u1(i7).P0(-j3);
            if (P0 != null) {
                wallPaper = P0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z10);
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
    public static Drawable f(Drawable drawable, int i7, TLRPC.WallPaper wallPaper, boolean z10) {
        int[] iArr;
        org.telegram.ui.ActionBar.k6 k10;
        if (wallPaper != null && TextUtils.isEmpty(org.telegram.messenger.f4.j(wallPaper))) {
            return en.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.s3 i10 = (wallPaper == null || wallPaper.settings == null) ? null : org.telegram.messenger.f4.f(i7).i(ig.b.d(wallPaper.settings.emoticon));
        if (i10 != null) {
            return g(i7, i10, z10);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string) == null || org.telegram.ui.ActionBar.n6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.n6.Q0(string2) == null || !org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.n6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (m6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.m6 Q0 = !z10 ? org.telegram.ui.ActionBar.n6.Q0(str2) : org.telegram.ui.ActionBar.n6.Q0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            SparseIntArray T0 = str3 == null ? org.telegram.ui.ActionBar.n6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.n6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.n6.hm;
            if (iArr != null) {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    sparseIntArray.put(i11, iArr[i11]);
                }
            }
            k10 = Q0.k(false);
            if (k10 == null) {
                k10.d(T0, sparseIntArray);
            } else {
                for (int i12 = 0; i12 < T0.size(); i12++) {
                    sparseIntArray.put(T0.keyAt(i12), T0.valueAt(i12));
                }
            }
            a8.r7 I = org.telegram.ui.ActionBar.n6.I(Q0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) I.c;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) I.b;
        }
        str = string;
        if (!z10) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.n6.hm;
        if (iArr != null) {
        }
        k10 = Q0.k(false);
        if (k10 == null) {
        }
        a8.r7 I2 = org.telegram.ui.ActionBar.n6.I(Q0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.s3 s3Var, final boolean z10) {
        if (s3Var.l()) {
            org.telegram.ui.ActionBar.n6.I(org.telegram.ui.ActionBar.s3.d(z10), s3Var.g(i7, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = s3Var.g(i7, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.n6.Ee;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.n6.Fe;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.n6.Ge;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.n6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.n6.He;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        final za0 za0Var = new za0();
        za0Var.g = false;
        za0Var.s(s3Var.j(z10 ? 1 : 0).settings.intensity, za0Var.u);
        za0Var.o(i11, i13, i15, i17, 0, true);
        za0Var.u(0);
        final int f10 = za0Var.f();
        s3Var.n(z10 ? 1 : 0, new ResultCallback() { // from class: hi.b6
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((gg.a) pair.second).a;
                org.telegram.ui.ActionBar.s3 s3Var2 = org.telegram.ui.ActionBar.s3.this;
                if (longValue != s3Var2.h(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i18 = s3Var2.j(z10 ? 1 : 0).settings.intensity;
                za0 za0Var2 = za0Var;
                za0Var2.s(i18, bitmap);
                za0Var2.t(f10);
                za0Var2.r(1.0f);
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
        return za0Var;
    }

    private void setupCollage(x7 x7Var) {
        xb xbVar = this.G;
        if (xbVar != null) {
            xbVar.setCollage(x7Var != null ? x7Var.T : null);
        }
    }

    private void setupImage(x7 x7Var) {
        Utilities.g.c(new c(8, this, x7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        x7 x7Var;
        h61 h61Var = this.e;
        float f11 = 0.0f;
        if (h61Var != null) {
            h61Var.B0((this.P || ((x7Var = this.d) != null && x7Var.Y)) ? 0.0f : x7Var != null ? x7Var.P : 1.0f);
        }
        h61 h61Var2 = this.y;
        if (h61Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                x7 x7Var2 = this.d;
                f10 = x7Var2 != null ? x7Var2.u0 : 1.0f;
            }
            h61Var2.B0(f10);
        }
        h61 h61Var3 = this.E;
        if (h61Var3 != null) {
            if (!this.P) {
                x7 x7Var3 = this.d;
                f11 = x7Var3 != null ? x7Var3.G : 1.0f;
            }
            h61Var3.B0(f11);
        }
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        x7 x7Var = this.d;
        fArr[0] = x7Var.k0;
        fArr[1] = x7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        a8.x9.a(this.c0, this.d0, fArr[0], fArr[1]);
        x7 x7Var2 = this.d;
        fArr[0] = x7Var2.k0 / 2.0f;
        fArr[1] = x7Var2.l0;
        matrix.mapPoints(fArr);
        a8.x9.a(this.c0, this.d0, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.T != null) {
            if (this.h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            float e10 = ((drawable instanceof za0) && ((za0) drawable).u == null) ? 0.0f : this.Q.e(false, 1.0f);
            Drawable drawable2 = this.S;
            if (drawable2 != null && e10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e10) * 255.0f));
                x7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (e10 * 255.0f));
            x7.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        s0 s0Var = this.B0;
        if (s0Var != null) {
            s0Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !j()) {
            float d = this.g0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    x7 x7Var = this.d;
                    int i7 = x7Var.k0;
                    int i10 = x7Var.l0;
                    int i11 = x7Var.Q;
                    we weVar = x7Var.m0;
                    if (((i11 + weVar.k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f10 = weVar.e;
                    float f11 = weVar.f;
                    float f12 = i7;
                    float f13 = i10;
                    canvas2.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.c;
                    canvas2.scale(f14, f14);
                    we weVar2 = this.d.m0;
                    canvas2.translate(weVar2.a * f12, weVar2.b * f13);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    x7 x7Var2 = this.d;
                    canvas2.translate((-x7Var2.k0) / 2.0f, (-x7Var2.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                x7 x7Var3 = this.d;
                int i12 = x7Var3.k0;
                int i13 = x7Var3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i12, i13);
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
        nb nbVar = ((bb) this).D0;
        db dbVar = nbVar.d1;
        boolean z10 = false;
        if (dbVar == null || !dbVar.O1) {
            ce0 ce0Var = nbVar.D1;
            eb0 eb0Var = ce0Var.J;
            if (ce0Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    ce0Var.E = false;
                    ce0Var.F = System.currentTimeMillis();
                    ce0Var.G = motionEvent.getX();
                    ce0Var.H = motionEvent.getY();
                    de0 de0Var = ce0Var.x;
                    if (de0Var != null) {
                        ce0Var.I = de0Var.getEnhanceValue();
                    }
                    z10 = true;
                    if (motionEvent.getAction() == 0) {
                        this.y0 = System.currentTimeMillis();
                    } else if (motionEvent.getAction() == 1) {
                        if (System.currentTimeMillis() - this.y0 <= ViewConfiguration.getTapTimeout() && (runnable = this.z0) != null) {
                            runnable.run();
                        }
                        this.y0 = 0L;
                    } else if (motionEvent.getAction() == 3) {
                        this.y0 = 0L;
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
                    if (!ce0Var.E && System.currentTimeMillis() - ce0Var.F <= ViewConfiguration.getLongPressTimeout() && Math.abs(ce0Var.H - y10) < Math.abs(ce0Var.G - x10) && Math.abs(ce0Var.G - x10) > org.telegram.messenger.g0.e) {
                        ce0Var.E = true;
                        org.telegram.messenger.g0.r(eb0Var);
                        ce0Var.r = true;
                        ce0Var.invalidate();
                    }
                    if (ce0Var.E) {
                        float f10 = x10 - ce0Var.G;
                        if (ce0Var.x == null) {
                            ce0Var.y.run();
                        }
                        de0 de0Var2 = ce0Var.x;
                        if (de0Var2 == null) {
                            ce0Var.E = false;
                        } else {
                            float enhanceValue = de0Var2.getEnhanceValue();
                            float i7 = Utilities.i((f10 / (org.telegram.messenger.g0.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i7 * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(ce0Var.I * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (bz.o() == 2 ? 5 : 10)) {
                                    org.telegram.messenger.g0.a4(ce0Var);
                                    ce0Var.I = i7;
                                }
                            } else {
                                try {
                                    ce0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                ce0Var.I = i7;
                            }
                            ce0Var.x.setEnhanceValue(i7);
                            de0 de0Var3 = ce0Var.x;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((de0Var3 == null ? 0.0f : de0Var3.getEnhanceValue()) * 100.0f), ce0Var.b, ce0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            ce0Var.f = staticLayout;
                            ce0Var.h = staticLayout.getLineCount() > 0 ? ce0Var.f.getLineWidth(0) : 0.0f;
                            ce0Var.n = ce0Var.f.getLineCount() > 0 ? ce0Var.f.getLineLeft(0) : 0.0f;
                            ce0Var.invalidate();
                        }
                    }
                    ce0Var.G = x10;
                    ce0Var.H = y10;
                } else if (action == 1 || action == 3) {
                    ce0Var.E = false;
                    ce0Var.F = -1L;
                    de0 de0Var4 = ce0Var.x;
                    if (de0Var4 != null) {
                        ce0Var.I = de0Var4.getEnhanceValue();
                    }
                    org.telegram.messenger.g0.h3(eb0Var, 600L);
                }
            } else if (ce0Var.r) {
                ce0Var.r = false;
                ce0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x7 x7Var;
        x7 x7Var2;
        x51 x51Var = this.n;
        if (view == x51Var && (x7Var2 = this.d) != null && x7Var2.u) {
            return false;
        }
        if ((view != x51Var && view != this.r) || (x7Var = this.d) == null || x7Var.m0 == null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            x7 x7Var3 = this.d;
            int i7 = x7Var3.k0;
            int i10 = x7Var3.l0;
            int i11 = x7Var3.Q;
            we weVar = x7Var3.m0;
            if (((i11 + weVar.k) / 90) % 2 == 1) {
                i10 = i7;
                i7 = i10;
            }
            float f10 = weVar.e;
            float f11 = weVar.f;
            canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            x7 x7Var4 = this.d;
            canvas.translate((-x7Var4.k0) / 2.0f, (-x7Var4.l0) / 2.0f);
        }
        canvas.concat(this.i0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 1;
        }
        return x7Var.l0;
    }

    public int getContentWidth() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 1;
        }
        return x7Var.k0;
    }

    public long getCurrentPosition() {
        h61 h61Var = this.e;
        if (h61Var != null) {
            return h61Var.S();
        }
        h61 h61Var2 = this.y;
        if (h61Var2 != null) {
            return h61Var2.S();
        }
        h61 h61Var3 = this.E;
        if (h61Var3 != null) {
            return h61Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        x7 x7Var = this.d;
        if (x7Var != null) {
            double d = x7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        h61 h61Var = this.e;
        if (h61Var == null || h61Var.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 0;
        }
        return x7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public x51 getTextureView() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void h(w10 w10Var, View... viewArr) {
        x51 x51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (x51Var = this.n) != null) {
                    r52[i7] = x51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r52[i7] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r52[i7] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r52[i7]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i7].getWidth(), L2 / viewArr[i7].getHeight());
                    canvas.scale(max, max);
                    viewArr[i7].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new c6(L, L2, L3, r52, w10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        x7 x7Var;
        return (this.F == null || (x7Var = this.d) == null || !x7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(x7 x7Var) {
        this.d = x7Var;
        if (x7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (x7Var.K) {
            setupImage(x7Var);
            if (x7Var.A0 == 0 && x7Var.B0 == 0) {
                x7Var.z(new d6(this, 0));
            } else {
                r();
            }
        } else {
            setupImage(x7Var);
            r();
        }
        b();
        u(x7Var);
        p(x7Var, false);
        s(x7Var, null, false);
    }

    public final void m(long j3) {
        h61 h61Var = this.e;
        if (h61Var != null) {
            h61Var.q0(j3, false);
        } else if (j()) {
            this.F.m(j3, false);
        } else {
            h61 h61Var2 = this.y;
            if (h61Var2 != null) {
                h61Var2.q0(j3, false);
            } else {
                h61 h61Var3 = this.E;
                if (h61Var3 != null) {
                    h61Var3.q0(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(x7 x7Var, s9 s9Var, long j3) {
        this.d = x7Var;
        if (x7Var == null) {
            t(null, s9Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (x7Var.v()) {
            setupImage(null);
            t(null, s9Var, j3);
            setupCollage(x7Var);
        } else if (x7Var.K) {
            setupImage(x7Var);
            setupCollage(null);
            t(x7Var, s9Var, j3);
            if (x7Var.A0 == 0 && x7Var.B0 == 0) {
                x7Var.z(new d6(this, 0));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, s9Var, 0L);
            setupImage(x7Var);
            r();
        }
        b();
        u(x7Var);
        p(x7Var, false);
        s(x7Var, null, false);
    }

    public final void o(TextureView textureView, de0 de0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = de0Var;
        this.r = textureView;
        if (de0Var != null) {
            int i7 = this.V;
            int i10 = this.W;
            org.telegram.ui.Components.bz bzVar = de0Var.m0;
            if (bzVar != null) {
                bzVar.h(i7, i10);
            } else {
                de0Var.K0 = i7;
                de0Var.L0 = i10;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.l0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(x7 x7Var, boolean z10) {
        boolean z11;
        h61 h61Var = this.E;
        if (h61Var != null) {
            h61Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (x7Var == null) {
            return;
        }
        xb xbVar = this.G;
        boolean z12 = false;
        if (xbVar != null) {
            String str = x7Var.y;
            String str2 = x7Var.A;
            String str3 = x7Var.B;
            long j3 = x7Var.C;
            long j10 = x7Var.D;
            float f10 = x7Var.E;
            float f11 = x7Var.F;
            float f12 = x7Var.G;
            if (!TextUtils.equals(xbVar.P, str)) {
                qb qbVar = xbVar.b0;
                if (qbVar != null) {
                    qbVar.a();
                    xbVar.b0 = null;
                    xbVar.V = false;
                }
                xbVar.P = str;
                xbVar.p();
            }
            xbVar.P = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            xbVar.O = !isEmpty;
            if (isEmpty) {
                xbVar.Q = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (xbVar.O) {
                xbVar.S = j3;
                xbVar.R = j10 - ((long) (j3 * f10));
                xbVar.T = f10;
                xbVar.U = f11;
                xbVar.W = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, xbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    xbVar.N0 = staticLayout;
                    xbVar.O0 = staticLayout.getLineCount() > 0 ? xbVar.N0.getLineWidth(0) : 0.0f;
                    xbVar.P0 = xbVar.N0.getLineCount() > 0 ? xbVar.N0.getLineLeft(0) : 0.0f;
                } else {
                    xbVar.O0 = 0.0f;
                    xbVar.N0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, xbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    xbVar.R0 = staticLayout2;
                    xbVar.S0 = staticLayout2.getLineCount() > 0 ? xbVar.R0.getLineWidth(0) : 0.0f;
                    xbVar.T0 = xbVar.R0.getLineCount() > 0 ? xbVar.R0.getLineLeft(0) : 0.0f;
                } else {
                    xbVar.S0 = 0.0f;
                    xbVar.R0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                xbVar.f0.f(xbVar.O, true);
            }
            xbVar.invalidate();
        } else {
            z11 = true;
        }
        if (x7Var.y != null) {
            h61 h61Var2 = new h61();
            this.E = h61Var2;
            h61Var2.E = z11;
            h61Var2.K = new h6.o(this, 4);
            h61Var2.j0(Uri.fromFile(new File(x7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (x7Var.Z * getDuration());
                this.e.q0(duration, false);
                this.G.setProgress(duration);
            }
            z11 = true;
            w(true);
        }
        nb nbVar = ((bb) this).D0;
        pa paVar = nbVar.w1;
        if (paVar != null) {
            x7 x7Var2 = nbVar.L1;
            if (x7Var2 != null && x7Var2.y != null) {
                z12 = z11;
            }
            paVar.setHasAudio(z12);
        }
    }

    public final void q(fj fjVar) {
        long duration;
        x7 x7Var = this.d;
        if (x7Var != null) {
            x7Var.j = true;
            if (fjVar != null) {
                int i7 = fjVar.K1;
                if (fjVar.k != null) {
                    TLRPC.Document F0 = fjVar.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (TextUtils.isEmpty(fjVar.k.attachPath)) {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J == null || !J.exists()) {
                                x7 x7Var2 = this.d;
                                x7Var2.y = null;
                                x7Var2.z = null;
                                x7Var2.A = null;
                                x7Var2.B = null;
                                x7Var2.D = 0L;
                                x7Var2.C = 0L;
                                x7Var2.E = 0.0f;
                                x7Var2.F = 1.0f;
                                return;
                            }
                            this.d.y = J.getAbsolutePath();
                        }
                        this.d.y = J.getAbsolutePath();
                    } else {
                        this.d.y = fjVar.k.attachPath;
                    }
                    x7 x7Var3 = this.d;
                    x7Var3.A = null;
                    x7Var3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
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
                    x7 x7Var4 = this.d;
                    x7Var4.D = 0L;
                    if (x7Var4.K) {
                        x7Var4.D = (long) (x7Var4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            x7 x7Var5 = ((m0) obj).n;
                            if (x7Var5 != null && x7Var5.K) {
                                duration = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    x7 x7Var6 = this.d;
                    duration = x7Var6.K ? getDuration() : x7Var6.C;
                    xb xbVar = this.G;
                    int maxCount = xbVar == null ? 1 : xbVar.getMaxCount();
                    x7 x7Var7 = this.d;
                    x7Var7.F = x7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            x7Var.y = null;
            x7Var.z = null;
            x7Var.A = null;
            x7Var.B = null;
            x7Var.D = 0L;
            x7Var.C = 0L;
            x7Var.E = 0.0f;
            x7Var.F = 1.0f;
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : org.telegram.messenger.g0.q.y;
        x7 x7Var = this.d;
        int i7 = x7Var.A0;
        Paint paint = this.U;
        if (i7 == 0 || x7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new a4(this, measuredHeight, 1).a(c8.k0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            x7 x7Var2 = this.d;
            int i10 = x7Var2.A0;
            this.V = i10;
            int i11 = x7Var2.B0;
            this.W = i11;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            x51 x51Var = this.n;
            if (x51Var != null) {
                int i12 = this.V;
                int i13 = this.W;
                org.telegram.ui.Components.bz bzVar = x51Var.b;
                if (bzVar == null) {
                    x51Var.n = i12;
                    x51Var.r = i13;
                } else {
                    bzVar.h(i12, i13);
                }
            }
            de0 de0Var = this.s;
            if (de0Var != null) {
                int i14 = this.V;
                int i15 = this.W;
                org.telegram.ui.Components.bz bzVar2 = de0Var.m0;
                if (bzVar2 != null) {
                    bzVar2.h(i14, i15);
                } else {
                    de0Var.K0 = i14;
                    de0Var.L0 = i15;
                }
            }
        }
        invalidate();
    }

    public final void s(x7 x7Var, tg.w1 w1Var, boolean z10) {
        h61 h61Var;
        if (x7Var == null || x7Var.o0 == null) {
            h61 h61Var2 = this.y;
            if (h61Var2 != null) {
                h61Var2.g0();
                this.y.m0();
                this.y = null;
            }
            xb xbVar = this.G;
            if (xbVar != null) {
                xbVar.setRoundNull(z10);
            }
            this.x = null;
            org.telegram.messenger.g0.r(this.L);
            return;
        }
        h61 h61Var3 = this.y;
        if (h61Var3 != null) {
            h61Var3.m0();
            this.y = null;
        }
        h61 h61Var4 = new h61();
        this.y = h61Var4;
        h61Var4.E = true;
        h61Var4.K = new ob.c(this, 28);
        this.y.j0(Uri.fromFile(x7Var.o0), "other");
        c();
        this.x = w1Var;
        if (w1Var != null && (h61Var = this.y) != null) {
            h61Var.A0(w1Var.w0);
        }
        this.G.n(x7Var.o0.getAbsolutePath(), x7Var.q0, x7Var.r0, x7Var.s0, x7Var.t0, x7Var.u0, z10);
        y(true);
    }

    public void set(x7 x7Var) {
        n(x7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.l0 = z10;
    }

    public void setCollageView(n0 n0Var) {
        this.F = n0Var;
    }

    public void setCropEditorDrawing(s0 s0Var) {
        if (this.B0 != s0Var) {
            this.B0 = s0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.z0 = runnable;
    }

    public void setVideoTimelineView(xb xbVar) {
        this.G = xbVar;
        if (xbVar != null) {
            xbVar.setDelegate(new u0(this, 2));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    public final void t(x7 x7Var, Runnable runnable, long j3) {
        ArrayList arrayList;
        org.telegram.ui.Components.ga gaVar;
        int i7 = 5;
        if (x7Var == null || x7Var.v()) {
            h61 h61Var = this.e;
            if (h61Var != null) {
                h61Var.g0();
                this.e.m0();
                this.e = null;
            }
            e6 e6Var = this.I;
            if (e6Var == null || !e6Var.g) {
                x51 x51Var = this.n;
                if (x51Var != null) {
                    x51Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new d6(this, i7)).start();
                }
            } else {
                e6Var.a(null);
            }
            xb xbVar = this.G;
            if (xbVar != null) {
                xbVar.o(false, null, 1L, 0.0f);
            }
            org.telegram.messenger.g0.r(this.L);
            if (runnable != null) {
                org.telegram.messenger.g0.g3(runnable);
                return;
            }
            return;
        }
        h61 h61Var2 = this.e;
        if (h61Var2 != null) {
            h61Var2.m0();
            this.e = null;
        }
        int i10 = 0;
        h61 h61Var3 = new h61();
        this.e = h61Var3;
        h61Var3.E = true;
        h61Var3.K = new h6.m(this, x7Var, new Runnable[]{runnable}, 2);
        x51 x51Var2 = this.n;
        if (x51Var2 != null) {
            x51Var2.clearAnimation();
            x51 x51Var3 = this.n;
            org.telegram.ui.Components.bz bzVar = x51Var3.b;
            if (bzVar != null) {
                bzVar.postRunnable(new yy(bzVar, i10));
            }
            x51Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new x51(getContext(), this.e);
        this.H.e();
        x51 x51Var4 = this.n;
        org.telegram.ui.Components.ba baVar = x7Var.u ? null : this.H;
        x51Var4.s = baVar;
        org.telegram.ui.Components.bz bzVar2 = x51Var4.b;
        if (bzVar2 != null && (gaVar = bzVar2.J) != null) {
            org.telegram.ui.Components.ba baVar2 = gaVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            gaVar.t = baVar;
            if (baVar != null && baVar.m != gaVar) {
                baVar.m = gaVar;
                baVar.d();
            }
        }
        this.n.setOpaque(false);
        b();
        e6 e6Var2 = this.I;
        if (e6Var2 == null || !e6Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, c8.na.e(-2, -2, 51));
        } else {
            e6Var2.a(this.n);
        }
        ai.d0 d0Var = new ai.d0(this, 29);
        w7 w7Var = x7Var.d1;
        if (w7Var != null) {
            d0Var.a(w7Var);
        } else if (!x7Var.K || Build.VERSION.SDK_INT < 24) {
            w7 w7Var2 = new w7();
            x7Var.d1 = w7Var2;
            d0Var.a(w7Var2);
        } else {
            Utilities.e.c(new s7(x7Var, d0Var, i10));
        }
        File file = x7Var.Z0;
        if (file == null) {
            file = x7Var.L;
        }
        this.e.j0(Uri.fromFile(file), "other");
        this.e.u0(this.A0.isEmpty());
        this.e.s0(true);
        long j10 = x7Var.h ? (long) ((x7Var.Z * x7Var.h0) + j3) : j3;
        if (j10 > 0) {
            this.e.q0(j10, false);
        }
        c();
        w(true);
        boolean z10 = x7Var.u && (arrayList = x7Var.v) != null && arrayList.size() == 1 && ((fj) x7Var.v.get(0)).D == 5;
        xb xbVar2 = this.G;
        File file2 = x7Var.Z0;
        if (file2 == null) {
            file2 = x7Var.L;
        }
        xbVar2.o(z10, file2.getAbsolutePath(), getDuration(), x7Var.P);
        this.G.setVideoLeft(x7Var.Z);
        this.G.setVideoRight(x7Var.a0);
        xb xbVar3 = this.G;
        if (xbVar3 == null || j10 <= 0) {
            return;
        }
        xbVar3.setProgress(j10);
    }

    public final void u(x7 x7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (x7Var == null) {
            this.T = null;
            return;
        }
        long j3 = x7Var.z0;
        if (j3 == Long.MIN_VALUE) {
            this.T = null;
            return;
        }
        Drawable e10 = e(this.T, x7Var.a, j3, x7Var.y0);
        x7Var.x0 = e10;
        this.T = e10;
        if (this.S != e10) {
            this.S = null;
        }
        if (e10 != null) {
            e10.setCallback(this);
        }
        org.telegram.ui.Components.ba baVar = this.H;
        if (baVar != null) {
            Drawable drawable2 = this.T;
            if (drawable2 == null) {
                baVar.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.T.getIntrinsicHeight();
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
                this.T.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.T.draw(new Canvas(createBitmap));
                baVar.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f10;
        PointF pointF;
        if (this.l0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.n0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.x9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z11 = this.q0;
            PointF pointF3 = this.m0;
            if (z11 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.o0 = f10;
                this.p0 = d;
                this.q0 = z10;
            }
            if (this.d != null) {
                float width = r2.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.t0;
                if (actionMasked == 0) {
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                    this.x0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.p0);
                        float f17 = this.v0 + degrees;
                        this.v0 = f17;
                        if (!this.s0) {
                            boolean z12 = Math.abs(f17) > 20.0f;
                            this.s0 = z12;
                            if (!z12) {
                                d(matrix);
                                this.s0 = (((float) Math.round(this.e0 / 90.0f)) * 90.0f) - this.e0 > 20.0f;
                            }
                            if (!this.w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.w0 = true;
                            }
                        }
                        if (this.s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.e0 / 90.0f) * 90.0f) - this.e0;
                    if (this.s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.c0, this.d0);
                            if (!this.w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.w0 = true;
                            }
                        } else {
                            this.w0 = false;
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
                        this.r0 = false;
                        nb nbVar = ((bb) this).D0;
                        nbVar.p1.a(true, false, nbVar.j0);
                        nbVar.p1.b(nbVar.d1.getText());
                    }
                    this.x0 = false;
                    this.s0 = false;
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.o0 = f10;
                this.p0 = d;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.T == drawable || super.verifyDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r2 <= (r11 + r9)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z10) {
        long S;
        boolean d02;
        if (this.E == null || this.d == null) {
            return;
        }
        boolean z11 = true;
        if (this.e == null && this.y == null && !j()) {
            this.E.u0(this.A0.isEmpty());
            this.E.s0(true);
            long S2 = this.E.S();
            if (!z10 || this.E.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.E.U();
            x7 x7Var = this.d;
            if ((U < x7Var.E || U > x7Var.F) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.E.p0(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            S = this.F.getPositionWithOffset();
            d02 = this.F.r0;
        } else {
            h61 h61Var = this.e;
            if (h61Var == null) {
                h61Var = this.y;
            }
            S = h61Var.S();
            d02 = h61Var.d0();
        }
        x7 x7Var2 = this.d;
        float f10 = x7Var2.F;
        float f11 = x7Var2.E;
        long j3 = x7Var2.C;
        long j10 = (long) ((f10 - f11) * j3);
        if (d02) {
            long j11 = x7Var2.D;
            if (S >= j11) {
            }
        }
        z11 = false;
        long j12 = S - (x7Var2.D - ((long) (f11 * j3)));
        if (this.E.d0() != z11) {
            this.E.u0(z11);
            this.E.p0(j12);
        } else if (z10) {
            if (Math.abs(this.E.S() - j12) > (j() ? ks.X4 : 120)) {
                this.E.p0(j12);
            }
        }
    }

    public final void x(int i7, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        h61 h61Var = this.e;
        if (h61Var != null) {
            h61Var.u0(hashSet.isEmpty());
        }
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long S;
        boolean d02;
        if (this.y == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.y.u0(this.A0.isEmpty());
            this.y.s0(true);
            tg.w1 w1Var = this.x;
            if (w1Var != null && !w1Var.D0) {
                w1Var.D0 = true;
                w1Var.E0.f(true, true);
                w1Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z10 || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            x7 x7Var = this.d;
            if ((U < x7Var.s0 || U > x7Var.t0) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.y.q0(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            S = this.F.getPositionWithOffset();
            d02 = this.F.r0;
        } else {
            S = this.e.S();
            d02 = this.e.d0();
        }
        x7 x7Var2 = this.d;
        float f10 = x7Var2.t0;
        float f11 = x7Var2.s0;
        float f12 = x7Var2.q0;
        long j3 = (long) ((f10 - f11) * f12);
        long j10 = x7Var2.r0;
        boolean z11 = S >= j10 && S <= j3 + j10;
        boolean z12 = d02 && z11;
        long j11 = (S - j10) + ((long) (f11 * f12));
        tg.w1 w1Var2 = this.x;
        if (w1Var2 != null && w1Var2.D0 != z11) {
            w1Var2.D0 = z11;
            w1Var2.invalidate();
        }
        if (this.y.d0() != z12) {
            this.y.u0(z12);
            this.y.q0(j11, false);
        } else if (z10) {
            if (Math.abs(this.y.S() - j11) > (j() ? ks.X4 : 120)) {
                this.y.q0(j11, false);
            }
        }
    }
}
