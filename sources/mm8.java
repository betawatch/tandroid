// default package

import android.app.Activity;
import android.content.ContentUris;
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
import org.telegram.messenger.a;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class mm8 extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final HashSet A0;
    public l33 B0;
    public kfc E;
    public kl2 F;
    public ksb G;
    public final tl0 H;
    public final o00 I;
    public long J;
    public long K;
    public final lm8 L;
    public final lm8 M;
    public final lm8 N;
    public bab O;
    public boolean P;
    public final mm Q;
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
    public c8b d;
    public float d0;
    public kfc e;
    public float e0;
    public int f;
    public boolean f0;
    public final mm g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public kec n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public c98 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public bab w;
    public boolean w0;
    public pp9 x;
    public boolean x0;
    public kfc y;
    public long y0;
    public Runnable z0;

    public mm8(Activity activity, tl0 tl0Var, o00 o00Var) {
        super(activity);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new lm8(this, (byte) 1);
        this.L = new lm8(this, (byte) 2);
        this.M = new lm8(this, (byte) 3);
        this.N = new lm8(this, (byte) 4);
        this.Q = new mm(this, 0L, 350L, k43.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new mm(this, 0L, 320L, k43.g);
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
        this.H = tl0Var;
        this.I = o00Var;
        paint.setStrokeWidth(hl.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(hl.L(3.0f), 0.0f, hl.L(1.0f), TLObject.FLAG_30);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
            if (Y1 != null) {
                wallPaper = Y1.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = uc7.s1(i).N0(-j);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return e(drawable, i, wallPaper, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable e(Drawable drawable, int i, TLRPC.WallPaper wallPaper, boolean z) {
        ez3 ez3Var;
        int[] iArr;
        ynb i2;
        if (wallPaper != null) {
            if (TextUtils.isEmpty(af2.h(wallPaper))) {
                return g82.d(drawable, wallPaper, z);
            }
            if (wallPaper.settings != null) {
                ez3Var = af2.e(i).g(dpb.d(wallPaper.settings.emoticon));
                if (ez3Var == null) {
                    return f(i, ez3Var, z);
                }
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (aob.O0(string) == null || aob.O0(string).o()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                znb znbVar = aob.I;
                if (!string.equals(string2)) {
                    str2 = string2;
                } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str2 = string2;
                    znb O0 = !z ? aob.O0(str2) : aob.O0(str);
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    String[] strArr = new String[1];
                    String str3 = O0.d;
                    SparseIntArray R0 = str3 == null ? aob.R0(null, str3, strArr) : aob.R0(new File(O0.b), null, strArr);
                    iArr = aob.hm;
                    if (iArr != null) {
                        for (int i3 = 0; i3 < iArr.length; i3++) {
                            sparseIntArray.put(i3, iArr[i3]);
                        }
                    }
                    i2 = O0.i(false);
                    if (i2 == null) {
                        i2.d(R0, sparseIntArray);
                    } else {
                        for (int i4 = 0; i4 < R0.size(); i4++) {
                            sparseIntArray.put(R0.keyAt(i4), R0.valueAt(i4));
                        }
                    }
                    am2 I = aob.I(O0, sparseIntArray, strArr[0], 0, true);
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) I.c;
                    return bitmapDrawable == null ? bitmapDrawable : (Drawable) I.b;
                }
                str = string;
                if (!z) {
                }
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                String[] strArr2 = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = aob.hm;
                if (iArr != null) {
                }
                i2 = O0.i(false);
                if (i2 == null) {
                }
                am2 I2 = aob.I(O0, sparseIntArray2, strArr2[0], 0, true);
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
                if (bitmapDrawable2 == null) {
                }
            }
        }
        ez3Var = null;
        if (ez3Var == null) {
        }
    }

    public static Drawable f(int i, final ez3 ez3Var, final boolean z) {
        if (ez3Var.l()) {
            aob.I(ez3.d(z), ez3Var.g(i, z ? 1 : 0), ((dz3) ez3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = ez3Var.g(i, z ? 1 : 0);
        int i2 = aob.Ee;
        int i3 = g.get(i2, aob.w0(null, i2, false));
        int i4 = aob.Fe;
        int i5 = g.get(i4, aob.w0(null, i4, false));
        int i6 = aob.Ge;
        int i7 = g.get(i6, aob.w0(null, i6, false));
        int i8 = aob.He;
        int i9 = g.get(i8, aob.w0(null, i8, false));
        final ih7 ih7Var = new ih7();
        ih7Var.g = false;
        ih7Var.r(ez3Var.j(z ? 1 : 0).settings.intensity, ih7Var.u);
        ih7Var.n(true, i3, i5, i7, i9);
        ih7Var.t(0);
        final int f = ih7Var.f();
        ez3Var.n(z ? 1 : 0, new ResultCallback() { // from class: km8
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((avc) pair.second).a;
                    ez3 ez3Var2 = ez3.this;
                    if (longValue != ez3Var2.h(z ? 1 : 0) || bitmap == null) {
                        return;
                    }
                    int i10 = ez3Var2.j(z ? 1 : 0).settings.intensity;
                    ih7 ih7Var2 = ih7Var;
                    ih7Var2.r(i10, bitmap);
                    ih7Var2.s(f);
                    ih7Var2.q(1.0f);
                }
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(TLRPC.TL_error tL_error) {
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(Throwable th) {
            }
        });
        return ih7Var;
    }

    private void setupCollage(c8b c8bVar) {
        ksb ksbVar = this.G;
        if (ksbVar != null) {
            ksbVar.setCollage(c8bVar != null ? c8bVar.T : null);
        }
    }

    private void setupImage(c8b c8bVar) {
        Utilities.g.c(new a58(this, c8bVar, (byte) 20));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        kfc kfcVar = this.e;
        float f3 = 0.0f;
        if (kfcVar != null) {
            if (!this.P) {
                c8b c8bVar = this.d;
                if (c8bVar == null) {
                    f2 = 1.0f;
                } else if (!c8bVar.Y) {
                    f2 = c8bVar.P;
                }
                kfcVar.A0(f2);
            }
            f2 = 0.0f;
            kfcVar.A0(f2);
        }
        kfc kfcVar2 = this.y;
        if (kfcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                c8b c8bVar2 = this.d;
                f = c8bVar2 != null ? c8bVar2.u0 : 1.0f;
            }
            kfcVar2.A0(f);
        }
        kfc kfcVar3 = this.E;
        if (kfcVar3 != null) {
            if (!this.P) {
                c8b c8bVar3 = this.d;
                f3 = c8bVar3 != null ? c8bVar3.G : 1.0f;
            }
            kfcVar3.A0(f3);
        }
        kl2 kl2Var = this.F;
        if (kl2Var != null) {
            kl2Var.setMuted(this.P);
        }
    }

    public final void c(Matrix matrix) {
        if (this.d == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = r0.k0 / 2.0f;
        fArr[1] = r0.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        c8b c8bVar = this.d;
        fArr[0] = c8bVar.k0;
        fArr[1] = c8bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        c8b c8bVar2 = this.d;
        fArr[0] = c8bVar2.k0 / 2.0f;
        fArr[1] = c8bVar2.l0;
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.T != null) {
            if (this.h0) {
                Path path = new Path();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            float e = ((drawable instanceof ih7) && ((ih7) drawable).u == null) ? 0.0f : this.Q.e(false, 1.0f);
            Drawable drawable2 = this.S;
            if (drawable2 != null && e < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e) * 255.0f));
                c8b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (e * 255.0f));
            c8b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        l33 l33Var = this.B0;
        if (l33Var != null) {
            l33Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !i()) {
            float d = this.g0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    c8b c8bVar = this.d;
                    int i = c8bVar.k0;
                    int i2 = c8bVar.l0;
                    int i3 = c8bVar.Q;
                    fo6 fo6Var = c8bVar.m0;
                    if (((i3 + fo6Var.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f = fo6Var.e;
                    float f2 = fo6Var.f;
                    float f3 = i;
                    float f4 = i2;
                    canvas2.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                    float f5 = this.d.m0.c;
                    canvas2.scale(f5, f5);
                    fo6 fo6Var2 = this.d.m0;
                    canvas2.translate(fo6Var2.a * f3, fo6Var2.b * f4);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    c8b c8bVar2 = this.d;
                    canvas2.translate((-c8bVar2.k0) / 2.0f, (-c8bVar2.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                c8b c8bVar3 = this.d;
                int i4 = c8bVar3.k0;
                int i5 = c8bVar3.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i4, i5);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0171, code lost:
    
        if (r1 != false) goto L70;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean v = v(motionEvent);
        sbb sbbVar = ((hbb) this).D0;
        ibb ibbVar = sbbVar.d1;
        boolean z = false;
        if (ibbVar == null || !ibbVar.O1) {
            b98 b98Var = sbbVar.D1;
            x38 x38Var = b98Var.J;
            if (b98Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    b98Var.E = false;
                    b98Var.F = System.currentTimeMillis();
                    b98Var.G = motionEvent.getX();
                    b98Var.H = motionEvent.getY();
                    c98 c98Var = b98Var.x;
                    if (c98Var != null) {
                        b98Var.I = c98Var.getEnhanceValue();
                    }
                    z = true;
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
                    if (!z) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (motionEvent.getPointerCount() <= 1) {
                        super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!b98Var.E && System.currentTimeMillis() - b98Var.F <= ViewConfiguration.getLongPressTimeout() && Math.abs(b98Var.H - y) < Math.abs(b98Var.G - x) && Math.abs(b98Var.G - x) > hl.e) {
                        b98Var.E = true;
                        hl.r(x38Var);
                        b98Var.r = true;
                        b98Var.invalidate();
                    }
                    if (b98Var.E) {
                        float f = x - b98Var.G;
                        if (b98Var.x == null) {
                            b98Var.y.run();
                        }
                        c98 c98Var2 = b98Var.x;
                        if (c98Var2 == null) {
                            b98Var.E = false;
                        } else {
                            float enhanceValue = c98Var2.getEnhanceValue();
                            float i = Utilities.i((f / (hl.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(b98Var.I * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (xea.o() == 2 ? 5 : 10)) {
                                    hl.W3(b98Var);
                                    b98Var.I = i;
                                }
                            } else {
                                try {
                                    b98Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                b98Var.I = i;
                            }
                            b98Var.x.setEnhanceValue(i);
                            c98 c98Var3 = b98Var.x;
                            StaticLayout staticLayout = new StaticLayout(String.valueOf(Math.round((c98Var3 == null ? 0.0f : c98Var3.getEnhanceValue()) * 100.0f)), b98Var.b, b98Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            b98Var.f = staticLayout;
                            b98Var.h = staticLayout.getLineCount() > 0 ? b98Var.f.getLineWidth(0) : 0.0f;
                            b98Var.n = b98Var.f.getLineCount() > 0 ? b98Var.f.getLineLeft(0) : 0.0f;
                            b98Var.invalidate();
                        }
                    }
                    b98Var.G = x;
                    b98Var.H = y;
                } else if (action == 1 || action == 3) {
                    b98Var.E = false;
                    b98Var.F = -1L;
                    c98 c98Var4 = b98Var.x;
                    if (c98Var4 != null) {
                        b98Var.I = c98Var4.getEnhanceValue();
                    }
                    hl.d3(x38Var, 600L);
                }
            } else if (b98Var.r) {
                b98Var.r = false;
                b98Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c8b c8bVar;
        c8b c8bVar2;
        kec kecVar = this.n;
        if (view == kecVar && (c8bVar2 = this.d) != null && c8bVar2.u) {
            return false;
        }
        if ((view != kecVar && view != this.r) || (c8bVar = this.d) == null || c8bVar.m0 == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            c8b c8bVar3 = this.d;
            int i = c8bVar3.k0;
            int i2 = c8bVar3.l0;
            int i3 = c8bVar3.Q;
            fo6 fo6Var = c8bVar3.m0;
            if (((i3 + fo6Var.k) / 90) % 2 == 1) {
                i2 = i;
                i = i2;
            }
            float f = fo6Var.e;
            float f2 = fo6Var.f;
            canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
            canvas.rotate(this.d.Q);
            c8b c8bVar4 = this.d;
            canvas.translate((-c8bVar4.k0) / 2.0f, (-c8bVar4.l0) / 2.0f);
        }
        canvas.concat(this.i0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void g(pcc pccVar, View... viewArr) {
        kec kecVar;
        int L = (int) (hl.L(26.0f) * hl.p);
        int L2 = (int) (hl.L(30.33f) * hl.p);
        int L3 = (int) (hl.L(4.0f) * hl.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (kecVar = this.n) != null) {
                    r5[i] = kecVar.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r5[i] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r5[i] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r5[i]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i].getWidth(), L2 / viewArr[i].getHeight());
                    canvas.scale(max, max);
                    viewArr[i].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new it2(L, L2, L3, r5, pccVar, (byte) 1));
    }

    public int getContentHeight() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 1;
        }
        return c8bVar.l0;
    }

    public int getContentWidth() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 1;
        }
        return c8bVar.k0;
    }

    public long getCurrentPosition() {
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        kfc kfcVar2 = this.y;
        if (kfcVar2 != null) {
            return kfcVar2.S();
        }
        kfc kfcVar3 = this.E;
        if (kfcVar3 != null) {
            return kfcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        c8b c8bVar = this.d;
        if (c8bVar != null) {
            double d = c8bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        kfc kfcVar = this.e;
        if (kfcVar == null || kfcVar.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 0;
        }
        return c8bVar.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public kec getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        c8b c8bVar;
        return (this.F == null || (c8bVar = this.d) == null || !c8bVar.v()) ? false : true;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(c8b c8bVar) {
        long j;
        long j2;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (c8bVar != null) {
            int measuredWidth = getMeasuredWidth() <= 0 ? hl.q.x : getMeasuredWidth();
            int i = (int) ((measuredWidth << 4) / 9.0f);
            if (c8bVar.K) {
                Bitmap bitmap = c8bVar.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = c8bVar.N) != null && str.startsWith("vthumb://")) {
                    j = Long.parseLong(c8bVar.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = getContext().getContentResolver().loadThumbnail(c8bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(measuredWidth, i), null);
                        } catch (Exception unused) {
                        }
                    }
                    j2 = j;
                    if (j2 >= 0 && c8bVar.K && c8bVar.N == null) {
                        invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = c8bVar.Z0;
                        if (file == null) {
                            file = c8bVar.L;
                        }
                        if (file == null) {
                            return;
                        }
                        jn1 jn1Var = new jn1((Object) this, (Object) c8bVar, j2, (Object) file.getPath(), (byte) 6);
                        boolean z = c8bVar.K;
                        bitmapArr[0] = c8b.q(jn1Var, measuredWidth, i, !z ? c8bVar.Q : 0, !z);
                        zArr[0] = false;
                    }
                }
            }
            j = -1;
            j2 = j;
            if (j2 >= 0) {
            }
            if (bitmapArr[0] == null) {
            }
        }
        hl.c3(new oy6(this, bitmapArr, c8bVar, zArr, (byte) 24));
    }

    public final void l(c8b c8bVar) {
        this.d = c8bVar;
        if (c8bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (c8bVar.K) {
            setupImage(c8bVar);
            if (c8bVar.A0 == 0 && c8bVar.B0 == 0) {
                c8bVar.y(new uk8((hbb) this, (byte) 3));
            } else {
                r();
            }
        } else {
            setupImage(c8bVar);
            r();
        }
        a();
        u(c8bVar);
        q(c8bVar, false);
        s(c8bVar, null, false);
    }

    public final void m(long j) {
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            kfcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            kfc kfcVar2 = this.y;
            if (kfcVar2 != null) {
                kfcVar2.p0(j, false);
            } else {
                kfc kfcVar3 = this.E;
                if (kfcVar3 != null) {
                    kfcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(c8b c8bVar, n3b n3bVar, long j) {
        this.d = c8bVar;
        byte b = 0;
        if (c8bVar == null) {
            t(null, n3bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (c8bVar.v()) {
            setupImage(null);
            t(null, n3bVar, j);
            setupCollage(c8bVar);
        } else if (c8bVar.K) {
            setupImage(c8bVar);
            setupCollage(null);
            t(c8bVar, n3bVar, j);
            if (c8bVar.A0 == 0 && c8bVar.B0 == 0) {
                c8bVar.y(new lm8(this, b));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, n3bVar, 0L);
            setupImage(c8bVar);
            r();
        }
        a();
        u(c8bVar);
        q(c8bVar, false);
        s(c8bVar, null, false);
    }

    public final void o(TextureView textureView, c98 c98Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = c98Var;
        this.r = textureView;
        if (c98Var != null) {
            int i = this.V;
            int i2 = this.W;
            rf4 rf4Var = c98Var.m0;
            if (rf4Var != null) {
                rf4Var.f(i, i2);
            } else {
                c98Var.K0 = i;
                c98Var.L0 = i2;
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

    public final void p(r47 r47Var) {
        long duration;
        c8b c8bVar = this.d;
        if (c8bVar != null) {
            c8bVar.j = true;
            if (r47Var != null) {
                int i = r47Var.K1;
                if (r47Var.k != null) {
                    TLRPC.Document F0 = r47Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (TextUtils.isEmpty(r47Var.k.attachPath)) {
                        xb4.G(i);
                        File J = xb4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            xb4.G(i);
                            J = xb4.J(F0, null, true, true);
                            if (J == null || !J.exists()) {
                                c8b c8bVar2 = this.d;
                                c8bVar2.y = null;
                                c8bVar2.z = null;
                                c8bVar2.A = null;
                                c8bVar2.B = null;
                                c8bVar2.D = 0L;
                                c8bVar2.C = 0L;
                                c8bVar2.E = 0.0f;
                                c8bVar2.F = 1.0f;
                                return;
                            }
                            this.d.y = J.getAbsolutePath();
                        }
                        this.d.y = J.getAbsolutePath();
                    } else {
                        this.d.y = r47Var.k.attachPath;
                    }
                    c8b c8bVar3 = this.d;
                    c8bVar3.A = null;
                    c8bVar3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                            i3++;
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
                    c8b c8bVar4 = this.d;
                    c8bVar4.D = 0L;
                    if (c8bVar4.K) {
                        c8bVar4.D = (long) (c8bVar4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            c8b c8bVar5 = ((jl2) obj).n;
                            if (c8bVar5 != null && c8bVar5.K) {
                                duration = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    c8b c8bVar6 = this.d;
                    duration = c8bVar6.K ? getDuration() : c8bVar6.C;
                    ksb ksbVar = this.G;
                    int maxCount = ksbVar == null ? 1 : ksbVar.getMaxCount();
                    c8b c8bVar7 = this.d;
                    c8bVar7.F = c8bVar7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            c8bVar.y = null;
            c8bVar.z = null;
            c8bVar.A = null;
            c8bVar.B = null;
            c8bVar.D = 0L;
            c8bVar.C = 0L;
            c8bVar.E = 0.0f;
            c8bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(c8b c8bVar, boolean z) {
        boolean z2;
        kfc kfcVar = this.E;
        if (kfcVar != null) {
            kfcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (c8bVar != null) {
            ksb ksbVar = this.G;
            boolean z3 = false;
            if (ksbVar != null) {
                String str = c8bVar.y;
                String str2 = c8bVar.A;
                String str3 = c8bVar.B;
                long j = c8bVar.C;
                long j2 = c8bVar.D;
                float f = c8bVar.E;
                float f2 = c8bVar.F;
                float f3 = c8bVar.G;
                if (!TextUtils.equals(ksbVar.P, str)) {
                    dsb dsbVar = ksbVar.b0;
                    if (dsbVar != null) {
                        dsbVar.a();
                        ksbVar.b0 = null;
                        ksbVar.V = false;
                    }
                    ksbVar.P = str;
                    ksbVar.p();
                }
                ksbVar.P = str;
                boolean isEmpty = TextUtils.isEmpty(str);
                ksbVar.O = !isEmpty;
                if (isEmpty) {
                    ksbVar.Q = false;
                    str2 = null;
                    str3 = null;
                }
                String str4 = TextUtils.isEmpty(str2) ? null : str2;
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                if (ksbVar.O) {
                    ksbVar.S = j;
                    ksbVar.R = j2 - ((long) (j * f));
                    ksbVar.T = f;
                    ksbVar.U = f2;
                    ksbVar.W = f3;
                    if (str4 != null) {
                        StaticLayout staticLayout = new StaticLayout(str4, ksbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ksbVar.N0 = staticLayout;
                        ksbVar.O0 = staticLayout.getLineCount() > 0 ? ksbVar.N0.getLineWidth(0) : 0.0f;
                        ksbVar.P0 = ksbVar.N0.getLineCount() > 0 ? ksbVar.N0.getLineLeft(0) : 0.0f;
                    } else {
                        ksbVar.O0 = 0.0f;
                        ksbVar.N0 = null;
                    }
                    if (str3 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str3, ksbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ksbVar.R0 = staticLayout2;
                        ksbVar.S0 = staticLayout2.getLineCount() > 0 ? ksbVar.R0.getLineWidth(0) : 0.0f;
                        ksbVar.T0 = ksbVar.R0.getLineCount() > 0 ? ksbVar.R0.getLineLeft(0) : 0.0f;
                    } else {
                        ksbVar.S0 = 0.0f;
                        ksbVar.R0 = null;
                    }
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                    ksbVar.f0.f(ksbVar.O, true);
                }
                ksbVar.invalidate();
            } else {
                z2 = true;
            }
            if (c8bVar.y != null) {
                kfc kfcVar2 = new kfc();
                this.E = kfcVar2;
                kfcVar2.E = z2;
                kfcVar2.K = new aj3((Object) this, (byte) 27);
                kfcVar2.i0(Uri.fromFile(new File(c8bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = (long) (c8bVar.Z * getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            sbb sbbVar = ((hbb) this).D0;
            wab wabVar = sbbVar.w1;
            if (wabVar != null) {
                c8b c8bVar2 = sbbVar.L1;
                if (c8bVar2 != null && c8bVar2.y != null) {
                    z3 = z2;
                }
                wabVar.setHasAudio(z3);
            }
        }
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : hl.q.y;
        c8b c8bVar = this.d;
        int i = c8bVar.A0;
        Paint paint = this.U;
        if (i == 0 || c8bVar.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jq0((Object) this, measuredHeight, (byte) 3).a(bje.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f = measuredHeight;
            c8b c8bVar2 = this.d;
            int i2 = c8bVar2.A0;
            this.V = i2;
            int i3 = c8bVar2.B0;
            this.W = i3;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i2, i3}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            kec kecVar = this.n;
            if (kecVar != null) {
                int i4 = this.V;
                int i5 = this.W;
                rf4 rf4Var = kecVar.b;
                if (rf4Var == null) {
                    kecVar.n = i4;
                    kecVar.r = i5;
                } else {
                    rf4Var.f(i4, i5);
                }
            }
            c98 c98Var = this.s;
            if (c98Var != null) {
                int i6 = this.V;
                int i7 = this.W;
                rf4 rf4Var2 = c98Var.m0;
                if (rf4Var2 != null) {
                    rf4Var2.f(i6, i7);
                } else {
                    c98Var.K0 = i6;
                    c98Var.L0 = i7;
                }
            }
        }
        invalidate();
    }

    public final void s(c8b c8bVar, pp9 pp9Var, boolean z) {
        kfc kfcVar;
        if (c8bVar == null || c8bVar.o0 == null) {
            kfc kfcVar2 = this.y;
            if (kfcVar2 != null) {
                kfcVar2.f0();
                this.y.l0();
                this.y = null;
            }
            ksb ksbVar = this.G;
            if (ksbVar != null) {
                ksbVar.setRoundNull(z);
            }
            this.x = null;
            hl.r(this.L);
            return;
        }
        kfc kfcVar3 = this.y;
        if (kfcVar3 != null) {
            kfcVar3.l0();
            this.y = null;
        }
        kfc kfcVar4 = new kfc();
        this.y = kfcVar4;
        kfcVar4.E = true;
        kfcVar4.K = new kj4((Object) this, (byte) 29);
        this.y.i0(Uri.fromFile(c8bVar.o0), "other");
        b();
        this.x = pp9Var;
        if (pp9Var != null && (kfcVar = this.y) != null) {
            kfcVar.z0(pp9Var.w0);
        }
        this.G.n(c8bVar.o0.getAbsolutePath(), c8bVar.q0, c8bVar.r0, c8bVar.s0, c8bVar.t0, c8bVar.u0, z);
        y(true);
    }

    public void set(c8b c8bVar) {
        n(c8bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(kl2 kl2Var) {
        this.F = kl2Var;
    }

    public void setCropEditorDrawing(l33 l33Var) {
        if (this.B0 != l33Var) {
            this.B0 = l33Var;
            invalidate();
        }
    }

    public void setDraw(boolean z) {
        this.f0 = z;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.z0 = runnable;
    }

    public void setVideoTimelineView(ksb ksbVar) {
        this.G = ksbVar;
        if (ksbVar != null) {
            ksbVar.setDelegate(new v34(this, (byte) 26));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(c8b c8bVar, n3b n3bVar, long j) {
        ArrayList arrayList;
        yl0 yl0Var;
        byte b = 5;
        if (c8bVar == null || c8bVar.v()) {
            kfc kfcVar = this.e;
            if (kfcVar != null) {
                kfcVar.f0();
                this.e.l0();
                this.e = null;
            }
            o00 o00Var = this.I;
            if (o00Var == null || !o00Var.g) {
                kec kecVar = this.n;
                if (kecVar != null) {
                    kecVar.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new lm8(this, b)).start();
                }
            } else {
                o00Var.a(null);
            }
            ksb ksbVar = this.G;
            if (ksbVar != null) {
                ksbVar.o(false, null, 1L, 0.0f);
            }
            hl.r(this.L);
            if (n3bVar != null) {
                hl.c3(n3bVar);
                return;
            }
            return;
        }
        kfc kfcVar2 = this.e;
        if (kfcVar2 != null) {
            kfcVar2.l0();
            this.e = null;
        }
        byte b2 = 1;
        byte b3 = 0;
        kfc kfcVar3 = new kfc();
        this.e = kfcVar3;
        kfcVar3.E = true;
        kfcVar3.K = new pm3((ViewGroup) this, (Object) c8bVar, (Object) new Runnable[]{n3bVar}, (byte) 24);
        kec kecVar2 = this.n;
        if (kecVar2 != null) {
            kecVar2.clearAnimation();
            kec kecVar3 = this.n;
            rf4 rf4Var = kecVar3.b;
            if (rf4Var != null) {
                rf4Var.postRunnable(new pf4(rf4Var, b3));
            }
            kecVar3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new kec(this.e, getContext());
        this.H.e();
        kec kecVar4 = this.n;
        tl0 tl0Var = c8bVar.u ? null : this.H;
        kecVar4.s = tl0Var;
        rf4 rf4Var2 = kecVar4.b;
        if (rf4Var2 != null && (yl0Var = rf4Var2.J) != null) {
            tl0 tl0Var2 = yl0Var.t;
            if (tl0Var2 != null && tl0Var2.m != null) {
                tl0Var2.m = null;
            }
            yl0Var.t = tl0Var;
            if (tl0Var != null && tl0Var.m != yl0Var) {
                tl0Var.m = yl0Var;
                tl0Var.d();
            }
        }
        this.n.setOpaque(false);
        a();
        o00 o00Var2 = this.I;
        if (o00Var2 == null || !o00Var2.g) {
            this.n.setAlpha(n3bVar != null ? 1.0f : 0.0f);
            addView(this.n, tre.e(-2, -2, 51));
        } else {
            o00Var2.a(this.n);
        }
        ji7 ji7Var = new ji7(this, (byte) 18);
        b8b b8bVar = c8bVar.d1;
        if (b8bVar != null) {
            ji7Var.a(b8bVar);
        } else if (!c8bVar.K || Build.VERSION.SDK_INT < 24) {
            b8b b8bVar2 = new b8b();
            c8bVar.d1 = b8bVar2;
            ji7Var.a(b8bVar2);
        } else {
            Utilities.e.c(new y7b(c8bVar, ji7Var, b2));
        }
        File file = c8bVar.Z0;
        if (file == null) {
            file = c8bVar.L;
        }
        this.e.i0(Uri.fromFile(file), "other");
        this.e.t0(this.A0.isEmpty());
        this.e.r0(true);
        long j2 = c8bVar.h ? (long) ((c8bVar.Z * c8bVar.h0) + j) : j;
        if (j2 > 0) {
            this.e.p0(j2, false);
        }
        b();
        w(true);
        boolean z = c8bVar.u && (arrayList = c8bVar.v) != null && arrayList.size() == 1 && ((r47) c8bVar.v.get(0)).D == 5;
        ksb ksbVar2 = this.G;
        File file2 = c8bVar.Z0;
        if (file2 == null) {
            file2 = c8bVar.L;
        }
        ksbVar2.o(z, file2.getAbsolutePath(), getDuration(), c8bVar.P);
        this.G.setVideoLeft(c8bVar.Z);
        this.G.setVideoRight(c8bVar.a0);
        ksb ksbVar3 = this.G;
        if (ksbVar3 == null || j2 <= 0) {
            return;
        }
        ksbVar3.setProgress(j2);
    }

    public final void u(c8b c8bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (c8bVar == null) {
            this.T = null;
            return;
        }
        long j = c8bVar.z0;
        if (j == Long.MIN_VALUE) {
            this.T = null;
            return;
        }
        Drawable d = d(this.T, c8bVar.a, j, c8bVar.y0);
        c8bVar.x0 = d;
        this.T = d;
        if (this.S != d) {
            this.S = null;
        }
        if (d != null) {
            d.setCallback(this);
        }
        tl0 tl0Var = this.H;
        if (tl0Var != null) {
            Drawable drawable2 = this.T;
            if (drawable2 == null) {
                tl0Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                tl0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.T.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float max = Math.max(100.0f / f, 100.0f / f2);
                if (max > 1.0f) {
                    intrinsicWidth = (int) (f * max);
                    intrinsicHeight = (int) (f2 * max);
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.T.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.T.draw(new Canvas(createBitmap));
                tl0Var.f(createBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double d;
        float f;
        PointF pointF;
        if (this.l0) {
            boolean z = motionEvent.getPointerCount() > 1;
            PointF pointF2 = this.n0;
            if (z) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f = dte.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f = 0.0f;
            }
            boolean z2 = this.q0;
            PointF pointF3 = this.m0;
            if (z2 != z) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.o0 = f;
                this.p0 = d;
                this.q0 = z;
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
                    float f2 = pointF2.x * width;
                    float f3 = pointF2.y * width;
                    float f4 = pointF3.x * width;
                    float f5 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f6 = this.o0;
                        if (f6 != 0.0f) {
                            float f7 = f / f6;
                            matrix.postScale(f7, f7, f2, f3);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.p0);
                        float f8 = this.v0 + degrees;
                        this.v0 = f8;
                        if (!this.s0) {
                            boolean z3 = Math.abs(f8) > 20.0f;
                            this.s0 = z3;
                            if (!z3) {
                                c(matrix);
                                this.s0 = (((float) Math.round(this.e0 / 90.0f)) * 90.0f) - this.e0 > 20.0f;
                            }
                            if (!this.w0) {
                                hl.W3(this);
                                this.w0 = true;
                            }
                        }
                        if (this.s0) {
                            matrix.postRotate(degrees, f2, f3);
                        }
                        this.r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.r0) {
                        matrix.postTranslate(f2 - f4, f3 - f5);
                    }
                    Matrix matrix2 = this.u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.a0;
                    matrix3.set(matrix);
                    c(matrix3);
                    float round = (Math.round(this.e0 / 90.0f) * 90.0f) - this.e0;
                    if (this.s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.c0, this.d0);
                            if (!this.w0) {
                                hl.W3(this);
                                this.w0 = true;
                            }
                        } else {
                            this.w0 = false;
                        }
                    }
                    this.d.n0.set(matrix2);
                    this.d.j = true;
                    a();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.r0 = false;
                        sbb sbbVar = ((hbb) this).D0;
                        sbbVar.p1.a(true, false, sbbVar.j0);
                        sbbVar.p1.b(sbbVar.d1.getText());
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
                this.o0 = f;
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r3 <= (r11 + r9)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(boolean z) {
        long S;
        boolean c0;
        if (this.E == null || this.d == null) {
            return;
        }
        boolean z2 = true;
        if (this.e == null && this.y == null && !i()) {
            this.E.t0(this.A0.isEmpty());
            this.E.r0(true);
            long S2 = this.E.S();
            if (!z || this.E.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.E.U();
            c8b c8bVar = this.d;
            if ((U < c8bVar.E || U > c8bVar.F) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.E.p0(-this.d.D, false);
                return;
            }
            return;
        }
        if (i()) {
            S = this.F.getPositionWithOffset();
            c0 = this.F.r0;
        } else {
            kfc kfcVar = this.e;
            if (kfcVar == null) {
                kfcVar = this.y;
            }
            S = kfcVar.S();
            c0 = kfcVar.c0();
        }
        c8b c8bVar2 = this.d;
        float f = c8bVar2.F;
        float f2 = c8bVar2.E;
        float f3 = c8bVar2.C;
        long j = (long) ((f - f2) * f3);
        if (c0) {
            long j2 = c8bVar2.D;
            if (S >= j2) {
            }
        }
        z2 = false;
        long j3 = S - (c8bVar2.D - ((long) (f2 * f3)));
        if (this.E.c0() != z2) {
            this.E.t0(z2);
            this.E.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.E.S() - j3) > (i() ? jn7.W4 : jn7.E1)) {
                this.E.p0(j3, false);
            }
        }
    }

    public final void x(int i, boolean z) {
        HashSet hashSet = this.A0;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            kfcVar.t0(hashSet.isEmpty());
        }
        kl2 kl2Var = this.F;
        if (kl2Var != null) {
            kl2Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z) {
        long S;
        boolean c0;
        if (this.y == null || this.d == null) {
            return;
        }
        if (this.e == null && !i()) {
            this.y.t0(this.A0.isEmpty());
            this.y.r0(true);
            pp9 pp9Var = this.x;
            if (pp9Var != null && !pp9Var.D0) {
                pp9Var.D0 = true;
                pp9Var.E0.f(true, true);
                pp9Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            c8b c8bVar = this.d;
            if ((U < c8bVar.s0 || U > c8bVar.t0) && System.currentTimeMillis() - this.K > 500) {
                this.K = System.currentTimeMillis();
                this.y.p0(-this.d.r0, false);
                return;
            }
            return;
        }
        if (i()) {
            S = this.F.getPositionWithOffset();
            c0 = this.F.r0;
        } else {
            S = this.e.S();
            c0 = this.e.c0();
        }
        c8b c8bVar2 = this.d;
        float f = c8bVar2.t0;
        float f2 = c8bVar2.s0;
        float f3 = c8bVar2.q0;
        long j = (long) ((f - f2) * f3);
        long j2 = c8bVar2.r0;
        boolean z2 = S >= j2 && S <= j + j2;
        boolean z3 = c0 && z2;
        long j3 = (S - j2) + ((long) (f2 * f3));
        pp9 pp9Var2 = this.x;
        if (pp9Var2 != null && pp9Var2.D0 != z2) {
            pp9Var2.D0 = z2;
            pp9Var2.invalidate();
        }
        if (this.y.c0() != z3) {
            this.y.t0(z3);
            this.y.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.y.S() - j3) > (i() ? jn7.W4 : jn7.E1)) {
                this.y.p0(j3, false);
            }
        }
    }
}
