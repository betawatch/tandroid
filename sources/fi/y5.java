package fi;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class y5 extends FrameLayout {
    public static final /* synthetic */ int B0 = 0;
    public j0 A0;
    public u51 D;
    public e0 E;
    public fb F;
    public final org.telegram.ui.Components.y9 G;
    public final x5 H;
    public long I;
    public long J;
    public final w5 K;
    public final w5 L;
    public final w5 M;
    public u8 N;
    public boolean O;
    public final org.telegram.ui.Components.w5 P;
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
    public e7 d;
    public float d0;
    public u51 e;
    public boolean e0;
    public int f;
    public final org.telegram.ui.Components.w5 f0;
    public boolean g0;
    public int h;
    public final Matrix h0;
    public final Matrix i0;
    public final Matrix j0;
    public boolean k0;
    public final PointF l0;
    public final PointF m0;
    public i51 n;
    public float n0;
    public double o0;
    public boolean p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public td0 s;
    public final Matrix s0;
    public final Matrix t0;
    public float u0;
    public boolean v0;
    public u8 w;
    public boolean w0;
    public tg.r1 x;
    public long x0;
    public u51 y;
    public Runnable y0;
    public final HashSet z0;

    public y5(Context context, org.telegram.ui.Components.y9 y9Var, x5 x5Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new w5(this, 2);
        this.K = new w5(this, 3);
        this.L = new w5(this, 4);
        this.M = new w5(this, 5);
        this.P = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.a0 = new float[2];
        this.e0 = true;
        this.f0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.g);
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
        this.G = y9Var;
        this.H = x5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(y5 y5Var, e7 e7Var) {
        long j3;
        long j10;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (e7Var != null) {
            int measuredWidth = y5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : y5Var.getMeasuredWidth();
            int i7 = (int) ((measuredWidth * 16) / 9.0f);
            if (e7Var.K) {
                Bitmap bitmap = e7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = e7Var.N) != null && str.startsWith("vthumb://")) {
                    j3 = Long.parseLong(e7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = y5Var.getContext().getContentResolver().loadThumbnail(e7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j3) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j3), new Size(measuredWidth, i7), null);
                        } catch (Exception unused) {
                        }
                    }
                    j10 = j3;
                    if (j10 >= 0 && e7Var.K && e7Var.N == null) {
                        y5Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = e7Var.Z0;
                        if (file == null) {
                            file = e7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        bg.e0 e0Var = new bg.e0(y5Var, e7Var, j10, file.getPath(), 2);
                        boolean z9 = e7Var.K;
                        bitmapArr[0] = e7.q(e0Var, measuredWidth, i7, !z9 ? e7Var.Q : 0, !z9);
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
        org.telegram.messenger.g0.h3(new ai.d0(y5Var, bitmapArr, e7Var, zArr, 15));
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z9) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull b22 = qp.s1(i7).b2(j3);
            if (b22 != null) {
                wallPaper = b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = qp.s1(i7).N0(-j3);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z9);
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
    public static Drawable f(Drawable drawable, int i7, TLRPC.WallPaper wallPaper, boolean z9) {
        int[] iArr;
        org.telegram.ui.ActionBar.i6 k10;
        if (wallPaper != null && TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
            return fn.d(drawable, wallPaper, z9);
        }
        org.telegram.ui.ActionBar.r3 i10 = (wallPaper == null || wallPaper.settings == null) ? null : org.telegram.messenger.d4.f(i7).i(ig.b.d(wallPaper.settings.emoticon));
        if (i10 != null) {
            return g(i7, i10, z9);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.l6.Q0(string) == null || org.telegram.ui.ActionBar.l6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.l6.Q0(string2) == null || !org.telegram.ui.ActionBar.l6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.k6 k6Var = org.telegram.ui.ActionBar.l6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (k6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.k6 Q0 = !z9 ? org.telegram.ui.ActionBar.l6.Q0(str2) : org.telegram.ui.ActionBar.l6.Q0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            SparseIntArray T0 = str3 == null ? org.telegram.ui.ActionBar.l6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.l6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.l6.em;
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
            a8.r7 I = org.telegram.ui.ActionBar.l6.I(Q0, sparseIntArray, strArr[0], 0, true);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) I.c;
            return bitmapDrawable == null ? bitmapDrawable : (Drawable) I.b;
        }
        str = string;
        if (!z9) {
        }
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.l6.em;
        if (iArr != null) {
        }
        k10 = Q0.k(false);
        if (k10 == null) {
        }
        a8.r7 I2 = org.telegram.ui.ActionBar.l6.I(Q0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.r3 r3Var, final boolean z9) {
        if (r3Var.l()) {
            org.telegram.ui.ActionBar.l6.I(org.telegram.ui.ActionBar.r3.d(z9), r3Var.g(i7, z9 ? 1 : 0), ((org.telegram.ui.ActionBar.q3) r3Var.f.get(z9 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = r3Var.g(i7, z9 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.l6.Be;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.l6.Ce;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.l6.De;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.l6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.l6.Ee;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.l6.x0(null, i16, false));
        final ra0 ra0Var = new ra0();
        ra0Var.g = false;
        ra0Var.s(r3Var.j(z9 ? 1 : 0).settings.intensity, ra0Var.u);
        ra0Var.o(i11, i13, i15, i17, 0, true);
        ra0Var.u(0);
        final int f10 = ra0Var.f();
        r3Var.n(z9 ? 1 : 0, new ResultCallback() { // from class: fi.u5
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((gg.a) pair.second).a;
                org.telegram.ui.ActionBar.r3 r3Var2 = org.telegram.ui.ActionBar.r3.this;
                if (longValue != r3Var2.h(z9 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i18 = r3Var2.j(z9 ? 1 : 0).settings.intensity;
                ra0 ra0Var2 = ra0Var;
                ra0Var2.s(i18, bitmap);
                ra0Var2.t(f10);
                ra0Var2.r(1.0f);
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
        return ra0Var;
    }

    private void setupCollage(e7 e7Var) {
        fb fbVar = this.F;
        if (fbVar != null) {
            fbVar.setCollage(e7Var != null ? e7Var.T : null);
        }
    }

    private void setupImage(e7 e7Var) {
        Utilities.g.c(new f2.h(8, this, e7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        e7 e7Var;
        u51 u51Var = this.e;
        float f11 = 0.0f;
        if (u51Var != null) {
            u51Var.B0((this.O || ((e7Var = this.d) != null && e7Var.Y)) ? 0.0f : e7Var != null ? e7Var.P : 1.0f);
        }
        u51 u51Var2 = this.y;
        if (u51Var2 != null) {
            if (this.O) {
                f10 = 0.0f;
            } else {
                e7 e7Var2 = this.d;
                f10 = e7Var2 != null ? e7Var2.u0 : 1.0f;
            }
            u51Var2.B0(f10);
        }
        u51 u51Var3 = this.D;
        if (u51Var3 != null) {
            if (!this.O) {
                e7 e7Var3 = this.d;
                f11 = e7Var3 != null ? e7Var3.G : 1.0f;
            }
            u51Var3.B0(f11);
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
        e7 e7Var = this.d;
        fArr[0] = e7Var.k0;
        fArr[1] = e7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.c0, fArr[0] - this.b0));
        a8.r9.a(this.b0, this.c0, fArr[0], fArr[1]);
        e7 e7Var2 = this.d;
        fArr[0] = e7Var2.k0 / 2.0f;
        fArr[1] = e7Var2.l0;
        matrix.mapPoints(fArr);
        a8.r9.a(this.b0, this.c0, fArr[0], fArr[1]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.S != null) {
            if (this.g0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            float e10 = ((drawable instanceof ra0) && ((ra0) drawable).u == null) ? 0.0f : this.P.e(false, 1.0f);
            Drawable drawable2 = this.R;
            if (drawable2 != null && e10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e10) * 255.0f));
                e7.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (e10 * 255.0f));
            e7.j(canvas, this.S, getWidth(), getHeight());
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
            float d = this.f0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    e7 e7Var = this.d;
                    int i7 = e7Var.k0;
                    int i10 = e7Var.l0;
                    int i11 = e7Var.Q;
                    ye yeVar = e7Var.m0;
                    if (((i11 + yeVar.k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f10 = yeVar.e;
                    float f11 = yeVar.f;
                    float f12 = i7;
                    float f13 = i10;
                    canvas2.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.c;
                    canvas2.scale(f14, f14);
                    ye yeVar2 = this.d.m0;
                    canvas2.translate(yeVar2.a * f12, yeVar2.b * f13);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    e7 e7Var2 = this.d;
                    canvas2.translate((-e7Var2.k0) / 2.0f, (-e7Var2.l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                e7 e7Var3 = this.d;
                int i12 = e7Var3.k0;
                int i13 = e7Var3.l0;
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
        va vaVar = ((ja) this).C0;
        la laVar = vaVar.c1;
        boolean z9 = false;
        if (laVar == null || !laVar.N1) {
            sd0 sd0Var = vaVar.C1;
            pb0 pb0Var = sd0Var.I;
            if (sd0Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    sd0Var.D = false;
                    sd0Var.E = System.currentTimeMillis();
                    sd0Var.F = motionEvent.getX();
                    sd0Var.G = motionEvent.getY();
                    td0 td0Var = sd0Var.x;
                    if (td0Var != null) {
                        sd0Var.H = td0Var.getEnhanceValue();
                    }
                    z9 = true;
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
                    if (!z9) {
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
                    if (!sd0Var.D && System.currentTimeMillis() - sd0Var.E <= ViewConfiguration.getLongPressTimeout() && Math.abs(sd0Var.G - y10) < Math.abs(sd0Var.F - x10) && Math.abs(sd0Var.F - x10) > org.telegram.messenger.g0.e) {
                        sd0Var.D = true;
                        org.telegram.messenger.g0.r(pb0Var);
                        sd0Var.r = true;
                        sd0Var.invalidate();
                    }
                    if (sd0Var.D) {
                        float f10 = x10 - sd0Var.F;
                        if (sd0Var.x == null) {
                            sd0Var.y.run();
                        }
                        td0 td0Var2 = sd0Var.x;
                        if (td0Var2 == null) {
                            sd0Var.D = false;
                        } else {
                            float enhanceValue = td0Var2.getEnhanceValue();
                            float i7 = Utilities.i((f10 / (org.telegram.messenger.g0.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i7 * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(sd0Var.H * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (iz.o() == 2 ? 5 : 10)) {
                                    org.telegram.messenger.g0.c4(sd0Var);
                                    sd0Var.H = i7;
                                }
                            } else {
                                try {
                                    sd0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                sd0Var.H = i7;
                            }
                            sd0Var.x.setEnhanceValue(i7);
                            td0 td0Var3 = sd0Var.x;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((td0Var3 == null ? 0.0f : td0Var3.getEnhanceValue()) * 100.0f), sd0Var.b, sd0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            sd0Var.f = staticLayout;
                            sd0Var.h = staticLayout.getLineCount() > 0 ? sd0Var.f.getLineWidth(0) : 0.0f;
                            sd0Var.n = sd0Var.f.getLineCount() > 0 ? sd0Var.f.getLineLeft(0) : 0.0f;
                            sd0Var.invalidate();
                        }
                    }
                    sd0Var.F = x10;
                    sd0Var.G = y10;
                } else if (action == 1 || action == 3) {
                    sd0Var.D = false;
                    sd0Var.E = -1L;
                    td0 td0Var4 = sd0Var.x;
                    if (td0Var4 != null) {
                        sd0Var.H = td0Var4.getEnhanceValue();
                    }
                    org.telegram.messenger.g0.i3(pb0Var, 600L);
                }
            } else if (sd0Var.r) {
                sd0Var.r = false;
                sd0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e7 e7Var;
        e7 e7Var2;
        i51 i51Var = this.n;
        if (view == i51Var && (e7Var2 = this.d) != null && e7Var2.u) {
            return false;
        }
        if ((view != i51Var && view != this.r) || (e7Var = this.d) == null || e7Var.m0 == null) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            e7 e7Var3 = this.d;
            int i7 = e7Var3.k0;
            int i10 = e7Var3.l0;
            int i11 = e7Var3.Q;
            ye yeVar = e7Var3.m0;
            if (((i11 + yeVar.k) / 90) % 2 == 1) {
                i10 = i7;
                i7 = i10;
            }
            float f10 = yeVar.e;
            float f11 = yeVar.f;
            canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            e7 e7Var4 = this.d;
            canvas.translate((-e7Var4.k0) / 2.0f, (-e7Var4.l0) / 2.0f);
        }
        canvas.concat(this.h0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 1;
        }
        return e7Var.l0;
    }

    public int getContentWidth() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 1;
        }
        return e7Var.k0;
    }

    public long getCurrentPosition() {
        u51 u51Var = this.e;
        if (u51Var != null) {
            return u51Var.S();
        }
        u51 u51Var2 = this.y;
        if (u51Var2 != null) {
            return u51Var2.S();
        }
        u51 u51Var3 = this.D;
        if (u51Var3 != null) {
            return u51Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        e7 e7Var = this.d;
        if (e7Var != null) {
            double d = e7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        u51 u51Var = this.e;
        if (u51Var == null || u51Var.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 0;
        }
        return e7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public i51 getTextureView() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void h(c20 c20Var, View... viewArr) {
        i51 i51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (i51Var = this.n) != null) {
                    r52[i7] = i51Var.getBitmap();
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
        Utilities.e.c(new v5(L, L2, L3, r52, c20Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        e7 e7Var;
        return (this.E == null || (e7Var = this.d) == null || !e7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.z0.contains(-9982);
    }

    public final void l(e7 e7Var) {
        this.d = e7Var;
        if (e7Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (e7Var.K) {
            setupImage(e7Var);
            if (e7Var.A0 == 0 && e7Var.B0 == 0) {
                e7Var.z(new w5((ja) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(e7Var);
            r();
        }
        b();
        u(e7Var);
        p(e7Var, false);
        s(e7Var, null, false);
    }

    public final void m(long j3) {
        u51 u51Var = this.e;
        if (u51Var != null) {
            u51Var.q0(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            u51 u51Var2 = this.y;
            if (u51Var2 != null) {
                u51Var2.q0(j3, false);
            } else {
                u51 u51Var3 = this.D;
                if (u51Var3 != null) {
                    u51Var3.q0(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(e7 e7Var, a9 a9Var, long j3) {
        this.d = e7Var;
        if (e7Var == null) {
            t(null, a9Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (e7Var.v()) {
            setupImage(null);
            t(null, a9Var, j3);
            setupCollage(e7Var);
        } else if (e7Var.K) {
            setupImage(e7Var);
            setupCollage(null);
            t(e7Var, a9Var, j3);
            if (e7Var.A0 == 0 && e7Var.B0 == 0) {
                e7Var.z(new w5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, a9Var, 0L);
            setupImage(e7Var);
            r();
        }
        b();
        u(e7Var);
        p(e7Var, false);
        s(e7Var, null, false);
    }

    public final void o(TextureView textureView, td0 td0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = td0Var;
        this.r = textureView;
        if (td0Var != null) {
            int i7 = this.U;
            int i10 = this.V;
            sy syVar = td0Var.l0;
            if (syVar != null) {
                syVar.h(i7, i10);
            } else {
                td0Var.J0 = i7;
                td0Var.K0 = i10;
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

    public final void p(e7 e7Var, boolean z9) {
        boolean z10;
        u51 u51Var = this.D;
        if (u51Var != null) {
            u51Var.g0();
            this.D.m0();
            this.D = null;
        }
        if (e7Var == null) {
            return;
        }
        fb fbVar = this.F;
        boolean z11 = false;
        if (fbVar != null) {
            String str = e7Var.y;
            String str2 = e7Var.A;
            String str3 = e7Var.B;
            long j3 = e7Var.C;
            long j10 = e7Var.D;
            float f10 = e7Var.E;
            float f11 = e7Var.F;
            float f12 = e7Var.G;
            if (!TextUtils.equals(fbVar.O, str)) {
                ya yaVar = fbVar.a0;
                if (yaVar != null) {
                    yaVar.a();
                    fbVar.a0 = null;
                    fbVar.U = false;
                }
                fbVar.O = str;
                fbVar.p();
            }
            fbVar.O = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            fbVar.N = !isEmpty;
            if (isEmpty) {
                fbVar.P = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (fbVar.N) {
                fbVar.R = j3;
                fbVar.Q = j10 - ((long) (j3 * f10));
                fbVar.S = f10;
                fbVar.T = f11;
                fbVar.V = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, fbVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fbVar.M0 = staticLayout;
                    fbVar.N0 = staticLayout.getLineCount() > 0 ? fbVar.M0.getLineWidth(0) : 0.0f;
                    fbVar.O0 = fbVar.M0.getLineCount() > 0 ? fbVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    fbVar.N0 = 0.0f;
                    fbVar.M0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, fbVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fbVar.Q0 = staticLayout2;
                    fbVar.R0 = staticLayout2.getLineCount() > 0 ? fbVar.Q0.getLineWidth(0) : 0.0f;
                    fbVar.S0 = fbVar.Q0.getLineCount() > 0 ? fbVar.Q0.getLineLeft(0) : 0.0f;
                } else {
                    fbVar.R0 = 0.0f;
                    fbVar.Q0 = null;
                }
            }
            if (z9) {
                z10 = true;
            } else {
                z10 = true;
                fbVar.e0.f(fbVar.N, true);
            }
            fbVar.invalidate();
        } else {
            z10 = true;
        }
        if (e7Var.y != null) {
            u51 u51Var2 = new u51();
            this.D = u51Var2;
            u51Var2.D = z10;
            u51Var2.J = new cb.c(this, 26);
            u51Var2.j0(Uri.fromFile(new File(e7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (e7Var.Z * getDuration());
                this.e.q0(duration, false);
                this.F.setProgress(duration);
            }
            z10 = true;
            w(true);
        }
        va vaVar = ((ja) this).C0;
        x9 x9Var = vaVar.v1;
        if (x9Var != null) {
            e7 e7Var2 = vaVar.K1;
            if (e7Var2 != null && e7Var2.y != null) {
                z11 = z10;
            }
            x9Var.setHasAudio(z11);
        }
    }

    public final void q(ij ijVar) {
        long duration;
        e7 e7Var = this.d;
        if (e7Var != null) {
            e7Var.j = true;
            if (ijVar != null) {
                int i7 = ijVar.I1;
                if (ijVar.k != null) {
                    TLRPC.Document F0 = ijVar.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (TextUtils.isEmpty(ijVar.k.attachPath)) {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J == null || !J.exists()) {
                                e7 e7Var2 = this.d;
                                e7Var2.y = null;
                                e7Var2.z = null;
                                e7Var2.A = null;
                                e7Var2.B = null;
                                e7Var2.D = 0L;
                                e7Var2.C = 0L;
                                e7Var2.E = 0.0f;
                                e7Var2.F = 1.0f;
                                return;
                            }
                            this.d.y = J.getAbsolutePath();
                        }
                        this.d.y = J.getAbsolutePath();
                    } else {
                        this.d.y = ijVar.k.attachPath;
                    }
                    e7 e7Var3 = this.d;
                    e7Var3.A = null;
                    e7Var3.B = null;
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
                    e7 e7Var4 = this.d;
                    e7Var4.D = 0L;
                    if (e7Var4.K) {
                        e7Var4.D = (long) (e7Var4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.E.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            e7 e7Var5 = ((d0) obj).n;
                            if (e7Var5 != null && e7Var5.K) {
                                duration = this.E.getDuration();
                                break;
                            }
                        }
                    }
                    e7 e7Var6 = this.d;
                    duration = e7Var6.K ? getDuration() : e7Var6.C;
                    fb fbVar = this.F;
                    int maxCount = fbVar == null ? 1 : fbVar.getMaxCount();
                    e7 e7Var7 = this.d;
                    e7Var7.F = e7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            e7Var.y = null;
            e7Var.z = null;
            e7Var.A = null;
            e7Var.B = null;
            e7Var.D = 0L;
            e7Var.C = 0L;
            e7Var.E = 0.0f;
            e7Var.F = 1.0f;
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : org.telegram.messenger.g0.q.y;
        e7 e7Var = this.d;
        int i7 = e7Var.A0;
        Paint paint = this.T;
        if (i7 == 0 || e7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new t3(this, measuredHeight, 1).a(a8.ba.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            e7 e7Var2 = this.d;
            int i10 = e7Var2.A0;
            this.U = i10;
            int i11 = e7Var2.B0;
            this.V = i11;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            i51 i51Var = this.n;
            if (i51Var != null) {
                int i12 = this.U;
                int i13 = this.V;
                sy syVar = i51Var.b;
                if (syVar == null) {
                    i51Var.n = i12;
                    i51Var.r = i13;
                } else {
                    syVar.h(i12, i13);
                }
            }
            td0 td0Var = this.s;
            if (td0Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                sy syVar2 = td0Var.l0;
                if (syVar2 != null) {
                    syVar2.h(i14, i15);
                } else {
                    td0Var.J0 = i14;
                    td0Var.K0 = i15;
                }
            }
        }
        invalidate();
    }

    public final void s(e7 e7Var, tg.r1 r1Var, boolean z9) {
        u51 u51Var;
        if (e7Var == null || e7Var.o0 == null) {
            u51 u51Var2 = this.y;
            if (u51Var2 != null) {
                u51Var2.g0();
                this.y.m0();
                this.y = null;
            }
            fb fbVar = this.F;
            if (fbVar != null) {
                fbVar.setRoundNull(z9);
            }
            this.x = null;
            org.telegram.messenger.g0.r(this.K);
            return;
        }
        u51 u51Var3 = this.y;
        if (u51Var3 != null) {
            u51Var3.m0();
            this.y = null;
        }
        u51 u51Var4 = new u51();
        this.y = u51Var4;
        u51Var4.D = true;
        u51Var4.J = new aa.n(this, 23);
        this.y.j0(Uri.fromFile(e7Var.o0), "other");
        c();
        this.x = r1Var;
        if (r1Var != null && (u51Var = this.y) != null) {
            u51Var.A0(r1Var.u0);
        }
        this.F.n(e7Var.o0.getAbsolutePath(), e7Var.q0, e7Var.r0, e7Var.s0, e7Var.t0, e7Var.u0, z9);
        y(true);
    }

    public void set(e7 e7Var) {
        n(e7Var, null, 0L);
    }

    public void setAllowCropping(boolean z9) {
        this.k0 = z9;
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

    public void setDraw(boolean z9) {
        this.e0 = z9;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.y0 = runnable;
    }

    public void setVideoTimelineView(fb fbVar) {
        this.F = fbVar;
        if (fbVar != null) {
            fbVar.setDelegate(new d6.i(this, 26));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Runnable[]] */
    public final void t(e7 e7Var, Runnable runnable, long j3) {
        ArrayList arrayList;
        org.telegram.ui.Components.da daVar;
        if (e7Var == null || e7Var.v()) {
            u51 u51Var = this.e;
            if (u51Var != null) {
                u51Var.g0();
                this.e.m0();
                this.e = null;
            }
            x5 x5Var = this.H;
            if (x5Var == null || !x5Var.g) {
                i51 i51Var = this.n;
                if (i51Var != null) {
                    i51Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new w5(this, 6)).start();
                }
            } else {
                x5Var.a(null);
            }
            fb fbVar = this.F;
            if (fbVar != null) {
                fbVar.o(false, null, 1L, 0.0f);
            }
            org.telegram.messenger.g0.r(this.K);
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
            return;
        }
        u51 u51Var2 = this.e;
        if (u51Var2 != null) {
            u51Var2.m0();
            this.e = null;
        }
        int i7 = 0;
        u51 u51Var3 = new u51();
        this.e = u51Var3;
        u51Var3.D = true;
        u51Var3.J = new android.support.v4.media.session.a0((FrameLayout) this, (Object) e7Var, (Serializable) new Runnable[]{runnable}, 26);
        i51 i51Var2 = this.n;
        if (i51Var2 != null) {
            i51Var2.clearAnimation();
            i51 i51Var3 = this.n;
            sy syVar = i51Var3.b;
            if (syVar != null) {
                syVar.postRunnable(new py(syVar, i7));
            }
            i51Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new i51(getContext(), this.e);
        this.G.e();
        i51 i51Var4 = this.n;
        org.telegram.ui.Components.y9 y9Var = e7Var.u ? null : this.G;
        i51Var4.s = y9Var;
        sy syVar2 = i51Var4.b;
        if (syVar2 != null && (daVar = syVar2.I) != null) {
            org.telegram.ui.Components.y9 y9Var2 = daVar.t;
            if (y9Var2 != null && y9Var2.m != null) {
                y9Var2.m = null;
            }
            daVar.t = y9Var;
            if (y9Var != null && y9Var.m != daVar) {
                y9Var.m = daVar;
                y9Var.d();
            }
        }
        this.n.setOpaque(false);
        b();
        x5 x5Var2 = this.H;
        if (x5Var2 == null || !x5Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, c8.ha.e(-2, -2, 51));
        } else {
            x5Var2.a(this.n);
        }
        ai.i iVar = new ai.i(this, 24);
        d7 d7Var = e7Var.d1;
        if (d7Var != null) {
            iVar.a(d7Var);
        } else if (!e7Var.K || Build.VERSION.SDK_INT < 24) {
            d7 d7Var2 = new d7();
            e7Var.d1 = d7Var2;
            iVar.a(d7Var2);
        } else {
            Utilities.e.c(new z6(e7Var, iVar, i7));
        }
        File file = e7Var.Z0;
        if (file == null) {
            file = e7Var.L;
        }
        this.e.j0(Uri.fromFile(file), "other");
        this.e.u0(this.z0.isEmpty());
        this.e.s0(true);
        if (e7Var.h) {
            j3 = (long) ((e7Var.Z * e7Var.h0) + j3);
        }
        if (j3 > 0) {
            this.e.q0(j3, false);
        }
        c();
        w(true);
        boolean z9 = e7Var.u && (arrayList = e7Var.v) != null && arrayList.size() == 1 && ((ij) e7Var.v.get(0)).D == 5;
        fb fbVar2 = this.F;
        File file2 = e7Var.Z0;
        if (file2 == null) {
            file2 = e7Var.L;
        }
        fbVar2.o(z9, file2.getAbsolutePath(), getDuration(), e7Var.P);
        this.F.setVideoLeft(e7Var.Z);
        this.F.setVideoRight(e7Var.a0);
        fb fbVar3 = this.F;
        if (fbVar3 == null || j3 <= 0) {
            return;
        }
        fbVar3.setProgress(j3);
    }

    public final void u(e7 e7Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (e7Var == null) {
            this.S = null;
            return;
        }
        long j3 = e7Var.z0;
        if (j3 == Long.MIN_VALUE) {
            this.S = null;
            return;
        }
        Drawable e10 = e(this.S, e7Var.a, j3, e7Var.y0);
        e7Var.x0 = e10;
        this.S = e10;
        if (this.R != e10) {
            this.R = null;
        }
        if (e10 != null) {
            e10.setCallback(this);
        }
        org.telegram.ui.Components.y9 y9Var = this.G;
        if (y9Var != null) {
            Drawable drawable2 = this.S;
            if (drawable2 == null) {
                y9Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                y9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.S.getIntrinsicHeight();
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
                this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.S.draw(new Canvas(createBitmap));
                y9Var.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f10;
        PointF pointF;
        if (this.k0) {
            boolean z9 = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.m0;
            if (z9) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.r9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z10 = this.p0;
            PointF pointF3 = this.l0;
            if (z10 != z9) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.n0 = f10;
                this.o0 = d;
                this.p0 = z9;
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
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.n0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.o0);
                        float f17 = this.u0 + degrees;
                        this.u0 = f17;
                        if (!this.r0) {
                            boolean z11 = Math.abs(f17) > 20.0f;
                            this.r0 = z11;
                            if (!z11) {
                                d(matrix);
                                this.r0 = (((float) Math.round(this.d0 / 90.0f)) * 90.0f) - this.d0 > 20.0f;
                            }
                            if (!this.v0) {
                                org.telegram.messenger.g0.c4(this);
                                this.v0 = true;
                            }
                        }
                        if (this.r0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.q0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
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
                                org.telegram.messenger.g0.c4(this);
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
                        va vaVar = ((ja) this).C0;
                        vaVar.o1.a(true, false, vaVar.i0);
                        vaVar.o1.b(vaVar.c1.getText());
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
                this.n0 = f10;
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
    public final void w(boolean z9) {
        long S;
        boolean d02;
        if (this.D == null || this.d == null) {
            return;
        }
        boolean z10 = true;
        if (this.e == null && this.y == null && !j()) {
            this.D.u0(this.z0.isEmpty());
            this.D.s0(true);
            long S2 = this.D.S();
            if (!z9 || this.D.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.D.U();
            e7 e7Var = this.d;
            if ((U < e7Var.E || U > e7Var.F) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.D.p0(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            S = this.E.getPositionWithOffset();
            d02 = this.E.q0;
        } else {
            u51 u51Var = this.e;
            if (u51Var == null) {
                u51Var = this.y;
            }
            S = u51Var.S();
            d02 = u51Var.d0();
        }
        e7 e7Var2 = this.d;
        float f10 = e7Var2.F;
        float f11 = e7Var2.E;
        long j3 = e7Var2.C;
        long j10 = (long) ((f10 - f11) * j3);
        if (d02) {
            long j11 = e7Var2.D;
            if (S >= j11) {
            }
        }
        z10 = false;
        long j12 = S - (e7Var2.D - ((long) (f11 * j3)));
        if (this.D.d0() != z10) {
            this.D.u0(z10);
            this.D.p0(j12);
        } else if (z9) {
            if (Math.abs(this.D.S() - j12) > (j() ? qs.X4 : 120)) {
                this.D.p0(j12);
            }
        }
    }

    public final void x(int i7, boolean z9) {
        HashSet hashSet = this.z0;
        if (z9) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        u51 u51Var = this.e;
        if (u51Var != null) {
            u51Var.u0(hashSet.isEmpty());
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z9) {
        long S;
        boolean d02;
        if (this.y == null || this.d == null) {
            return;
        }
        if (this.e == null && !j()) {
            this.y.u0(this.z0.isEmpty());
            this.y.s0(true);
            tg.r1 r1Var = this.x;
            if (r1Var != null && !r1Var.B0) {
                r1Var.B0 = true;
                r1Var.C0.f(true, true);
                r1Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z9 || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            e7 e7Var = this.d;
            if ((U < e7Var.s0 || U > e7Var.t0) && System.currentTimeMillis() - this.J > 500) {
                this.J = System.currentTimeMillis();
                this.y.q0(-this.d.r0, false);
                return;
            }
            return;
        }
        if (j()) {
            S = this.E.getPositionWithOffset();
            d02 = this.E.q0;
        } else {
            S = this.e.S();
            d02 = this.e.d0();
        }
        e7 e7Var2 = this.d;
        float f10 = e7Var2.t0;
        float f11 = e7Var2.s0;
        float f12 = e7Var2.q0;
        long j3 = (long) ((f10 - f11) * f12);
        long j10 = e7Var2.r0;
        boolean z10 = S >= j10 && S <= j3 + j10;
        boolean z11 = d02 && z10;
        long j11 = (S - j10) + ((long) (f11 * f12));
        tg.r1 r1Var2 = this.x;
        if (r1Var2 != null && r1Var2.B0 != z10) {
            r1Var2.B0 = z10;
            r1Var2.invalidate();
        }
        if (this.y.d0() != z11) {
            this.y.u0(z11);
            this.y.q0(j11, false);
        } else if (z9) {
            if (Math.abs(this.y.S() - j11) > (j() ? qs.X4 : 120)) {
                this.y.q0(j11, false);
            }
        }
    }
}
