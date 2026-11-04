package gi;

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
import b8.ke;
import b8.mf;
import b8.nc;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.xq;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class y5 extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final HashSet A0;
    public j0 B0;
    public m51 E;
    public e0 F;
    public fb G;
    public final org.telegram.ui.Components.x9 H;
    public final x5 I;
    public long J;
    public long K;
    public final u5 L;
    public final u5 M;
    public final u5 N;
    public v8 O;
    public boolean P;
    public final org.telegram.ui.Components.u5 Q;
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
    public f7 d;
    public float d0;
    public m51 e;
    public float e0;
    public int f;
    public boolean f0;
    public final org.telegram.ui.Components.u5 g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public b51 n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public nd0 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public v8 w;
    public boolean w0;
    public ug.r1 x;
    public boolean x0;
    public m51 y;
    public long y0;
    public Runnable z0;

    public y5(Context context, org.telegram.ui.Components.x9 x9Var, x5 x5Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new u5(this, 2);
        this.L = new u5(this, 3);
        this.M = new u5(this, 4);
        this.N = new u5(this, 5);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.g);
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
        this.H = x9Var;
        this.I = x5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_30);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(y5 y5Var, f7 f7Var) {
        long j10;
        long j11;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (f7Var != null) {
            int measuredWidth = y5Var.getMeasuredWidth() <= 0 ? org.telegram.messenger.g0.q.x : y5Var.getMeasuredWidth();
            int i3 = (int) ((measuredWidth * 16) / 9.0f);
            if (f7Var.K) {
                Bitmap bitmap = f7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = f7Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(f7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = y5Var.getContext().getContentResolver().loadThumbnail(f7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i3), null);
                        } catch (Exception unused) {
                        }
                    }
                    j11 = j10;
                    if (j11 >= 0 && f7Var.K && f7Var.N == null) {
                        y5Var.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = f7Var.Z0;
                        if (file == null) {
                            file = f7Var.L;
                        }
                        if (file == null) {
                            return;
                        }
                        cg.d0 d0Var = new cg.d0(y5Var, f7Var, j11, file.getPath(), 2);
                        boolean z10 = f7Var.K;
                        bitmapArr[0] = f7.q(d0Var, measuredWidth, i3, !z10 ? f7Var.Q : 0, !z10);
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
        org.telegram.messenger.g0.h3(new ai.z3(y5Var, bitmapArr, f7Var, zArr, 16));
    }

    public static Drawable e(Drawable drawable, int i3, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
            if (b22 != null) {
                wallPaper = b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = hp.s1(i3).N0(-j10);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return f(drawable, i3, wallPaper, z10);
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
    public static Drawable f(Drawable drawable, int i3, TLRPC.WallPaper wallPaper, boolean z10) {
        int[] iArr;
        org.telegram.ui.ActionBar.g6 k10;
        if (wallPaper != null && TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
            return zm.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.p3 i10 = (wallPaper == null || wallPaper.settings == null) ? null : org.telegram.messenger.d4.f(i3).i(jg.b.d(wallPaper.settings.emoticon));
        if (i10 != null) {
            return g(i3, i10, z10);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.j6 Q0 = !z10 ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str);
            SparseIntArray sparseIntArray = new SparseIntArray();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            SparseIntArray T0 = str3 == null ? org.telegram.ui.ActionBar.k6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.k6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.k6.em;
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
            ke I = org.telegram.ui.ActionBar.k6.I(Q0, sparseIntArray, strArr[0], 0, true);
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
        iArr = org.telegram.ui.ActionBar.k6.em;
        if (iArr != null) {
        }
        k10 = Q0.k(false);
        if (k10 == null) {
        }
        ke I2 = org.telegram.ui.ActionBar.k6.I(Q0, sparseIntArray2, strArr2[0], 0, true);
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
        if (bitmapDrawable2 == null) {
        }
    }

    public static Drawable g(int i3, final org.telegram.ui.ActionBar.p3 p3Var, final boolean z10) {
        if (p3Var.l()) {
            org.telegram.ui.ActionBar.k6.I(org.telegram.ui.ActionBar.p3.d(z10), p3Var.g(i3, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var.f.get(z10 ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g7 = p3Var.g(i3, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.k6.Be;
        int i11 = g7.get(i10, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.k6.Ce;
        int i13 = g7.get(i12, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.k6.De;
        int i15 = g7.get(i14, org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.k6.Ee;
        int i17 = g7.get(i16, org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        final la0 la0Var = new la0();
        la0Var.g = false;
        la0Var.s(la0Var.u, p3Var.j(z10 ? 1 : 0).settings.intensity);
        la0Var.o(i11, i13, i15, i17, 0, true);
        la0Var.u(0);
        final int f10 = la0Var.f();
        p3Var.n(z10 ? 1 : 0, new ResultCallback() { // from class: gi.s5
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long longValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((hg.a) pair.second).a;
                org.telegram.ui.ActionBar.p3 p3Var2 = org.telegram.ui.ActionBar.p3.this;
                if (longValue != p3Var2.h(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i18 = p3Var2.j(z10 ? 1 : 0).settings.intensity;
                la0 la0Var2 = la0Var;
                la0Var2.s(bitmap, i18);
                la0Var2.t(f10);
                la0Var2.r(1.0f);
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
        return la0Var;
    }

    private void setupCollage(f7 f7Var) {
        fb fbVar = this.G;
        if (fbVar != null) {
            fbVar.setCollage(f7Var != null ? f7Var.T : null);
        }
    }

    private void setupImage(f7 f7Var) {
        Utilities.g.c(new g2.c(14, this, f7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        f7 f7Var;
        m51 m51Var = this.e;
        float f11 = 0.0f;
        if (m51Var != null) {
            m51Var.B0((this.P || ((f7Var = this.d) != null && f7Var.Y)) ? 0.0f : f7Var != null ? f7Var.P : 1.0f);
        }
        m51 m51Var2 = this.y;
        if (m51Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                f7 f7Var2 = this.d;
                f10 = f7Var2 != null ? f7Var2.u0 : 1.0f;
            }
            m51Var2.B0(f10);
        }
        m51 m51Var3 = this.E;
        if (m51Var3 != null) {
            if (!this.P) {
                f7 f7Var3 = this.d;
                f11 = f7Var3 != null ? f7Var3.G : 1.0f;
            }
            m51Var3.B0(f11);
        }
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0Var.setMuted(this.P);
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
        f7 f7Var = this.d;
        fArr[0] = f7Var.k0;
        fArr[1] = f7Var.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        a7.h.a(this.c0, this.d0, fArr[0], fArr[1]);
        f7 f7Var2 = this.d;
        fArr[0] = f7Var2.k0 / 2.0f;
        fArr[1] = f7Var2.l0;
        matrix.mapPoints(fArr);
        a7.h.a(this.c0, this.d0, fArr[0], fArr[1]);
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
            float e10 = ((drawable instanceof la0) && ((la0) drawable).u == null) ? 0.0f : this.Q.e(false, 1.0f);
            Drawable drawable2 = this.S;
            if (drawable2 != null && e10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e10) * 255.0f));
                f7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (e10 * 255.0f));
            f7.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        j0 j0Var = this.B0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !j()) {
            float d = this.g0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    f7 f7Var = this.d;
                    int i3 = f7Var.k0;
                    int i10 = f7Var.l0;
                    int i11 = f7Var.Q;
                    re reVar = f7Var.m0;
                    if (((i11 + reVar.k) / 90) % 2 == 1) {
                        i10 = i3;
                        i3 = i10;
                    }
                    float f10 = reVar.e;
                    float f11 = reVar.f;
                    float f12 = i3;
                    float f13 = i10;
                    canvas2.clipRect(((-i3) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.c;
                    canvas2.scale(f14, f14);
                    re reVar2 = this.d.m0;
                    canvas2.translate(reVar2.a * f12, reVar2.b * f13);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    f7 f7Var2 = this.d;
                    canvas2.translate((-f7Var2.k0) / 2.0f, (-f7Var2.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                f7 f7Var3 = this.d;
                int i12 = f7Var3.k0;
                int i13 = f7Var3.l0;
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
        va vaVar = ((ja) this).D0;
        la laVar = vaVar.d1;
        boolean z10 = false;
        if (laVar == null || !laVar.O1) {
            md0 md0Var = vaVar.D1;
            jb0 jb0Var = md0Var.J;
            if (md0Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    md0Var.E = false;
                    md0Var.F = System.currentTimeMillis();
                    md0Var.G = motionEvent.getX();
                    md0Var.H = motionEvent.getY();
                    nd0 nd0Var = md0Var.x;
                    if (nd0Var != null) {
                        md0Var.I = nd0Var.getEnhanceValue();
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
                    float y9 = motionEvent.getY();
                    if (!md0Var.E && System.currentTimeMillis() - md0Var.F <= ViewConfiguration.getLongPressTimeout() && Math.abs(md0Var.H - y9) < Math.abs(md0Var.G - x10) && Math.abs(md0Var.G - x10) > org.telegram.messenger.g0.e) {
                        md0Var.E = true;
                        org.telegram.messenger.g0.r(jb0Var);
                        md0Var.r = true;
                        md0Var.invalidate();
                    }
                    if (md0Var.E) {
                        float f10 = x10 - md0Var.G;
                        if (md0Var.x == null) {
                            md0Var.y.run();
                        }
                        nd0 nd0Var2 = md0Var.x;
                        if (nd0Var2 == null) {
                            md0Var.E = false;
                        } else {
                            float enhanceValue = nd0Var2.getEnhanceValue();
                            float i3 = Utilities.i((f10 / (org.telegram.messenger.g0.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i3 * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(md0Var.I * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (az.o() == 2 ? 5 : 10)) {
                                    org.telegram.messenger.g0.c4(md0Var);
                                    md0Var.I = i3;
                                }
                            } else {
                                try {
                                    md0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                md0Var.I = i3;
                            }
                            md0Var.x.setEnhanceValue(i3);
                            nd0 nd0Var3 = md0Var.x;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((nd0Var3 == null ? 0.0f : nd0Var3.getEnhanceValue()) * 100.0f), md0Var.b, md0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            md0Var.f = staticLayout;
                            md0Var.h = staticLayout.getLineCount() > 0 ? md0Var.f.getLineWidth(0) : 0.0f;
                            md0Var.n = md0Var.f.getLineCount() > 0 ? md0Var.f.getLineLeft(0) : 0.0f;
                            md0Var.invalidate();
                        }
                    }
                    md0Var.G = x10;
                    md0Var.H = y9;
                } else if (action == 1 || action == 3) {
                    md0Var.E = false;
                    md0Var.F = -1L;
                    nd0 nd0Var4 = md0Var.x;
                    if (nd0Var4 != null) {
                        md0Var.I = nd0Var4.getEnhanceValue();
                    }
                    org.telegram.messenger.g0.i3(jb0Var, 600L);
                }
            } else if (md0Var.r) {
                md0Var.r = false;
                md0Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f7 f7Var;
        f7 f7Var2;
        b51 b51Var = this.n;
        if (view == b51Var && (f7Var2 = this.d) != null && f7Var2.u) {
            return false;
        }
        if ((view != b51Var && view != this.r) || (f7Var = this.d) == null || f7Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            f7 f7Var3 = this.d;
            int i3 = f7Var3.k0;
            int i10 = f7Var3.l0;
            int i11 = f7Var3.Q;
            re reVar = f7Var3.m0;
            if (((i11 + reVar.k) / 90) % 2 == 1) {
                i10 = i3;
                i3 = i10;
            }
            float f10 = reVar.e;
            float f11 = reVar.f;
            canvas.clipRect(((-i3) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i3 * f10) / 2.0f, (i10 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            f7 f7Var4 = this.d;
            canvas.translate((-f7Var4.k0) / 2.0f, (-f7Var4.l0) / 2.0f);
        }
        canvas.concat(this.i0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public int getContentHeight() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 1;
        }
        return f7Var.l0;
    }

    public int getContentWidth() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 1;
        }
        return f7Var.k0;
    }

    public long getCurrentPosition() {
        m51 m51Var = this.e;
        if (m51Var != null) {
            return m51Var.S();
        }
        m51 m51Var2 = this.y;
        if (m51Var2 != null) {
            return m51Var2.S();
        }
        m51 m51Var3 = this.E;
        if (m51Var3 != null) {
            return m51Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        f7 f7Var = this.d;
        if (f7Var != null) {
            double d = f7Var.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        m51 m51Var = this.e;
        if (m51Var == null || m51Var.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 0;
        }
        return f7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public b51 getTextureView() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void h(u10 u10Var, View... viewArr) {
        b51 b51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i3 = 0; i3 < viewArr.length; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getWidth() >= 0 && viewArr[i3].getHeight() > 0) {
                View view2 = viewArr[i3];
                if (view2 == this && (b51Var = this.n) != null) {
                    r5[i3] = b51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r5[i3] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r5[i3] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r5[i3]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i3].getWidth(), L2 / viewArr[i3].getHeight());
                    canvas.scale(max, max);
                    viewArr[i3].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new t5(L, L2, L3, r5, u10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        f7 f7Var;
        return (this.F == null || (f7Var = this.d) == null || !f7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(f7 f7Var) {
        this.d = f7Var;
        if (f7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (f7Var.K) {
            setupImage(f7Var);
            if (f7Var.A0 == 0 && f7Var.B0 == 0) {
                f7Var.z(new u5((ja) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(f7Var);
            r();
        }
        b();
        u(f7Var);
        p(f7Var, false);
        s(f7Var, null, false);
    }

    public final void m(long j10) {
        m51 m51Var = this.e;
        if (m51Var != null) {
            m51Var.q0(j10, false);
        } else if (j()) {
            this.F.m(j10, false);
        } else {
            m51 m51Var2 = this.y;
            if (m51Var2 != null) {
                m51Var2.q0(j10, false);
            } else {
                m51 m51Var3 = this.E;
                if (m51Var3 != null) {
                    m51Var3.q0(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(f7 f7Var, b9 b9Var, long j10) {
        this.d = f7Var;
        if (f7Var == null) {
            t(null, b9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (f7Var.v()) {
            setupImage(null);
            t(null, b9Var, j10);
            setupCollage(f7Var);
        } else if (f7Var.K) {
            setupImage(f7Var);
            setupCollage(null);
            t(f7Var, b9Var, j10);
            if (f7Var.A0 == 0 && f7Var.B0 == 0) {
                f7Var.z(new u5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, b9Var, 0L);
            setupImage(f7Var);
            r();
        }
        b();
        u(f7Var);
        p(f7Var, false);
        s(f7Var, null, false);
    }

    public final void o(TextureView textureView, nd0 nd0Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = nd0Var;
        this.r = textureView;
        if (nd0Var != null) {
            int i3 = this.V;
            int i10 = this.W;
            py pyVar = nd0Var.m0;
            if (pyVar != null) {
                pyVar.h(i3, i10);
            } else {
                nd0Var.K0 = i3;
                nd0Var.L0 = i10;
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

    public final void p(f7 f7Var, boolean z10) {
        boolean z11;
        m51 m51Var = this.E;
        if (m51Var != null) {
            m51Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (f7Var == null) {
            return;
        }
        fb fbVar = this.G;
        boolean z12 = false;
        if (fbVar != null) {
            String str = f7Var.y;
            String str2 = f7Var.A;
            String str3 = f7Var.B;
            long j10 = f7Var.C;
            long j11 = f7Var.D;
            float f10 = f7Var.E;
            float f11 = f7Var.F;
            float f12 = f7Var.G;
            if (!TextUtils.equals(fbVar.P, str)) {
                ya yaVar = fbVar.b0;
                if (yaVar != null) {
                    yaVar.a();
                    fbVar.b0 = null;
                    fbVar.V = false;
                }
                fbVar.P = str;
                fbVar.p();
            }
            fbVar.P = str;
            boolean isEmpty = TextUtils.isEmpty(str);
            fbVar.O = !isEmpty;
            if (isEmpty) {
                fbVar.Q = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (fbVar.O) {
                fbVar.S = j10;
                fbVar.R = j11 - ((long) (j10 * f10));
                fbVar.T = f10;
                fbVar.U = f11;
                fbVar.W = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, fbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fbVar.N0 = staticLayout;
                    fbVar.O0 = staticLayout.getLineCount() > 0 ? fbVar.N0.getLineWidth(0) : 0.0f;
                    fbVar.P0 = fbVar.N0.getLineCount() > 0 ? fbVar.N0.getLineLeft(0) : 0.0f;
                } else {
                    fbVar.O0 = 0.0f;
                    fbVar.N0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, fbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fbVar.R0 = staticLayout2;
                    fbVar.S0 = staticLayout2.getLineCount() > 0 ? fbVar.R0.getLineWidth(0) : 0.0f;
                    fbVar.T0 = fbVar.R0.getLineCount() > 0 ? fbVar.R0.getLineLeft(0) : 0.0f;
                } else {
                    fbVar.S0 = 0.0f;
                    fbVar.R0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                fbVar.f0.f(fbVar.O, true);
            }
            fbVar.invalidate();
        } else {
            z11 = true;
        }
        if (f7Var.y != null) {
            m51 m51Var2 = new m51();
            this.E = m51Var2;
            m51Var2.E = z11;
            m51Var2.K = new v5(this, 0);
            m51Var2.j0(Uri.fromFile(new File(f7Var.y)), "other");
            c();
            if (this.e != null && getDuration() > 0) {
                long duration = (long) (f7Var.Z * getDuration());
                this.e.q0(duration, false);
                this.G.setProgress(duration);
            }
            z11 = true;
            w(true);
        }
        va vaVar = ((ja) this).D0;
        x9 x9Var = vaVar.w1;
        if (x9Var != null) {
            f7 f7Var2 = vaVar.L1;
            if (f7Var2 != null && f7Var2.y != null) {
                z12 = z11;
            }
            x9Var.setHasAudio(z12);
        }
    }

    public final void q(zi ziVar) {
        long duration;
        f7 f7Var = this.d;
        if (f7Var != null) {
            f7Var.j = true;
            if (ziVar != null) {
                int i3 = ziVar.I1;
                if (ziVar.k != null) {
                    TLRPC.Document F0 = ziVar.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (TextUtils.isEmpty(ziVar.k.attachPath)) {
                        org.telegram.messenger.w7.G(i3);
                        File K = org.telegram.messenger.w7.K(F0, null, false, true);
                        if (K == null || !K.exists()) {
                            org.telegram.messenger.w7.G(i3);
                            K = org.telegram.messenger.w7.K(F0, null, true, true);
                            if (K == null || !K.exists()) {
                                f7 f7Var2 = this.d;
                                f7Var2.y = null;
                                f7Var2.z = null;
                                f7Var2.A = null;
                                f7Var2.B = null;
                                f7Var2.D = 0L;
                                f7Var2.C = 0L;
                                f7Var2.E = 0.0f;
                                f7Var2.F = 1.0f;
                                return;
                            }
                            this.d.y = K.getAbsolutePath();
                        }
                        this.d.y = K.getAbsolutePath();
                    } else {
                        this.d.y = ziVar.k.attachPath;
                    }
                    f7 f7Var3 = this.d;
                    f7Var3.A = null;
                    f7Var3.B = null;
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
                    f7 f7Var4 = this.d;
                    f7Var4.D = 0L;
                    if (f7Var4.K) {
                        f7Var4.D = (long) (f7Var4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            f7 f7Var5 = ((d0) obj).n;
                            if (f7Var5 != null && f7Var5.K) {
                                duration = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    f7 f7Var6 = this.d;
                    duration = f7Var6.K ? getDuration() : f7Var6.C;
                    fb fbVar = this.G;
                    int maxCount = fbVar == null ? 1 : fbVar.getMaxCount();
                    f7 f7Var7 = this.d;
                    f7Var7.F = f7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            f7Var.y = null;
            f7Var.z = null;
            f7Var.A = null;
            f7Var.B = null;
            f7Var.D = 0L;
            f7Var.C = 0L;
            f7Var.E = 0.0f;
            f7Var.F = 1.0f;
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : org.telegram.messenger.g0.q.y;
        f7 f7Var = this.d;
        int i3 = f7Var.A0;
        Paint paint = this.U;
        if (i3 == 0 || f7Var.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new s3(this, measuredHeight, 1).a(nc.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            f7 f7Var2 = this.d;
            int i10 = f7Var2.A0;
            this.V = i10;
            int i11 = f7Var2.B0;
            this.W = i11;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            b51 b51Var = this.n;
            if (b51Var != null) {
                int i12 = this.V;
                int i13 = this.W;
                py pyVar = b51Var.b;
                if (pyVar == null) {
                    b51Var.n = i12;
                    b51Var.r = i13;
                } else {
                    pyVar.h(i12, i13);
                }
            }
            nd0 nd0Var = this.s;
            if (nd0Var != null) {
                int i14 = this.V;
                int i15 = this.W;
                py pyVar2 = nd0Var.m0;
                if (pyVar2 != null) {
                    pyVar2.h(i14, i15);
                } else {
                    nd0Var.K0 = i14;
                    nd0Var.L0 = i15;
                }
            }
        }
        invalidate();
    }

    public final void s(f7 f7Var, ug.r1 r1Var, boolean z10) {
        m51 m51Var;
        if (f7Var == null || f7Var.o0 == null) {
            m51 m51Var2 = this.y;
            if (m51Var2 != null) {
                m51Var2.g0();
                this.y.m0();
                this.y = null;
            }
            fb fbVar = this.G;
            if (fbVar != null) {
                fbVar.setRoundNull(z10);
            }
            this.x = null;
            org.telegram.messenger.g0.r(this.L);
            return;
        }
        m51 m51Var3 = this.y;
        if (m51Var3 != null) {
            m51Var3.m0();
            this.y = null;
        }
        m51 m51Var4 = new m51();
        this.y = m51Var4;
        m51Var4.E = true;
        m51Var4.K = new w5(this, 0);
        this.y.j0(Uri.fromFile(f7Var.o0), "other");
        c();
        this.x = r1Var;
        if (r1Var != null && (m51Var = this.y) != null) {
            m51Var.A0(r1Var.v0);
        }
        this.G.n(f7Var.o0.getAbsolutePath(), f7Var.q0, f7Var.r0, f7Var.s0, f7Var.t0, f7Var.u0, z10);
        y(true);
    }

    public void set(f7 f7Var) {
        n(f7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.l0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.F = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.B0 != j0Var) {
            this.B0 = j0Var;
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

    public void setVideoTimelineView(fb fbVar) {
        this.G = fbVar;
        if (fbVar != null) {
            fbVar.setDelegate(new android.support.v4.media.c(this, 28));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 8) {
            set(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Runnable[]] */
    public final void t(f7 f7Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.ca caVar;
        if (f7Var == null || f7Var.v()) {
            m51 m51Var = this.e;
            if (m51Var != null) {
                m51Var.g0();
                this.e.m0();
                this.e = null;
            }
            x5 x5Var = this.I;
            if (x5Var == null || !x5Var.g) {
                b51 b51Var = this.n;
                if (b51Var != null) {
                    b51Var.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new u5(this, 6)).start();
                }
            } else {
                x5Var.a(null);
            }
            fb fbVar = this.G;
            if (fbVar != null) {
                fbVar.o(false, null, 1L, 0.0f);
            }
            org.telegram.messenger.g0.r(this.L);
            if (runnable != null) {
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
            return;
        }
        m51 m51Var2 = this.e;
        if (m51Var2 != null) {
            m51Var2.m0();
            this.e = null;
        }
        int i3 = 0;
        m51 m51Var3 = new m51();
        this.e = m51Var3;
        m51Var3.E = true;
        m51Var3.K = new android.support.v4.media.session.a0((FrameLayout) this, (Object) f7Var, (Serializable) new Runnable[]{runnable}, 25);
        b51 b51Var2 = this.n;
        if (b51Var2 != null) {
            b51Var2.clearAnimation();
            b51 b51Var3 = this.n;
            py pyVar = b51Var3.b;
            if (pyVar != null) {
                pyVar.postRunnable(new my(pyVar, i3));
            }
            b51Var3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new b51(getContext(), this.e);
        this.H.e();
        b51 b51Var4 = this.n;
        org.telegram.ui.Components.x9 x9Var = f7Var.u ? null : this.H;
        b51Var4.s = x9Var;
        py pyVar2 = b51Var4.b;
        if (pyVar2 != null && (caVar = pyVar2.J) != null) {
            org.telegram.ui.Components.x9 x9Var2 = caVar.t;
            if (x9Var2 != null && x9Var2.m != null) {
                x9Var2.m = null;
            }
            caVar.t = x9Var;
            if (x9Var != null && x9Var.m != caVar) {
                x9Var.m = caVar;
                x9Var.d();
            }
        }
        this.n.setOpaque(false);
        b();
        x5 x5Var2 = this.I;
        if (x5Var2 == null || !x5Var2.g) {
            this.n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.n, mf.e(-2, -2, 51));
        } else {
            x5Var2.a(this.n);
        }
        ai.v2 v2Var = new ai.v2(this, 27);
        e7 e7Var = f7Var.d1;
        if (e7Var != null) {
            v2Var.a(e7Var);
        } else if (!f7Var.K || Build.VERSION.SDK_INT < 24) {
            e7 e7Var2 = new e7();
            f7Var.d1 = e7Var2;
            v2Var.a(e7Var2);
        } else {
            Utilities.e.c(new a7(f7Var, v2Var, i3));
        }
        File file = f7Var.Z0;
        if (file == null) {
            file = f7Var.L;
        }
        this.e.j0(Uri.fromFile(file), "other");
        this.e.u0(this.A0.isEmpty());
        this.e.s0(true);
        if (f7Var.h) {
            j10 = (long) ((f7Var.Z * f7Var.h0) + j10);
        }
        if (j10 > 0) {
            this.e.q0(j10, false);
        }
        c();
        w(true);
        boolean z10 = f7Var.u && (arrayList = f7Var.v) != null && arrayList.size() == 1 && ((zi) f7Var.v.get(0)).D == 5;
        fb fbVar2 = this.G;
        File file2 = f7Var.Z0;
        if (file2 == null) {
            file2 = f7Var.L;
        }
        fbVar2.o(z10, file2.getAbsolutePath(), getDuration(), f7Var.P);
        this.G.setVideoLeft(f7Var.Z);
        this.G.setVideoRight(f7Var.a0);
        fb fbVar3 = this.G;
        if (fbVar3 == null || j10 <= 0) {
            return;
        }
        fbVar3.setProgress(j10);
    }

    public final void u(f7 f7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (f7Var == null) {
            this.T = null;
            return;
        }
        long j10 = f7Var.z0;
        if (j10 == Long.MIN_VALUE) {
            this.T = null;
            return;
        }
        Drawable e10 = e(this.T, f7Var.a, j10, f7Var.y0);
        f7Var.x0 = e10;
        this.T = e10;
        if (this.S != e10) {
            this.S = null;
        }
        if (e10 != null) {
            e10.setCallback(this);
        }
        org.telegram.ui.Components.x9 x9Var = this.H;
        if (x9Var != null) {
            Drawable drawable2 = this.T;
            if (drawable2 == null) {
                x9Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                x9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                x9Var.f(createBitmap, true);
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
                f10 = a7.h.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                                org.telegram.messenger.g0.c4(this);
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
                                org.telegram.messenger.g0.c4(this);
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
                        va vaVar = ((ja) this).D0;
                        vaVar.p1.a(true, false, vaVar.j0);
                        vaVar.p1.b(vaVar.d1.getText());
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
            f7 f7Var = this.d;
            if ((U < f7Var.E || U > f7Var.F) && System.currentTimeMillis() - this.K > 500) {
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
            m51 m51Var = this.e;
            if (m51Var == null) {
                m51Var = this.y;
            }
            S = m51Var.S();
            d02 = m51Var.d0();
        }
        f7 f7Var2 = this.d;
        float f10 = f7Var2.F;
        float f11 = f7Var2.E;
        long j10 = f7Var2.C;
        long j11 = (long) ((f10 - f11) * j10);
        if (d02) {
            long j12 = f7Var2.D;
            if (S >= j12) {
            }
        }
        z11 = false;
        long j13 = S - (f7Var2.D - ((long) (f11 * j10)));
        if (this.E.d0() != z11) {
            this.E.u0(z11);
            this.E.p0(j13);
        } else if (z10) {
            if (Math.abs(this.E.S() - j13) > (j() ? hs.X4 : 120)) {
                this.E.p0(j13);
            }
        }
    }

    public final void x(int i3, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i3));
        } else {
            hashSet.remove(Integer.valueOf(i3));
        }
        m51 m51Var = this.e;
        if (m51Var != null) {
            m51Var.u0(hashSet.isEmpty());
        }
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
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
            ug.r1 r1Var = this.x;
            if (r1Var != null && !r1Var.C0) {
                r1Var.C0 = true;
                r1Var.D0.f(true, true);
                r1Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z10 || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            f7 f7Var = this.d;
            if ((U < f7Var.s0 || U > f7Var.t0) && System.currentTimeMillis() - this.K > 500) {
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
        f7 f7Var2 = this.d;
        float f10 = f7Var2.t0;
        float f11 = f7Var2.s0;
        float f12 = f7Var2.q0;
        long j10 = (long) ((f10 - f11) * f12);
        long j11 = f7Var2.r0;
        boolean z11 = S >= j11 && S <= j10 + j11;
        boolean z12 = d02 && z11;
        long j12 = (S - j11) + ((long) (f11 * f12));
        ug.r1 r1Var2 = this.x;
        if (r1Var2 != null && r1Var2.C0 != z11) {
            r1Var2.C0 = z11;
            r1Var2.invalidate();
        }
        if (this.y.d0() != z12) {
            this.y.u0(z12);
            this.y.q0(j12, false);
        } else if (z10) {
            if (Math.abs(this.y.S() - j12) > (j() ? hs.X4 : 120)) {
                this.y.q0(j12, false);
            }
        }
    }
}
