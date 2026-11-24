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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class cl8 extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public final HashSet A0;
    public e43 B0;
    public ndc E;
    public cm2 F;
    public lqb G;
    public final sm0 H;
    public final n10 I;
    public long J;
    public long K;
    public final bl8 L;
    public final bl8 M;
    public final bl8 N;
    public f8b O;
    public boolean P;
    public final ln Q;
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
    public g6b d;
    public float d0;
    public ndc e;
    public float e0;
    public int f;
    public boolean f0;
    public final ln g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public ncc n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public n78 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public f8b w;
    public boolean w0;
    public ao9 x;
    public boolean x0;
    public ndc y;
    public long y0;
    public Runnable z0;

    public cl8(Activity activity, sm0 sm0Var, n10 n10Var) {
        super(activity);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new bl8(this, (byte) 1);
        this.L = new bl8(this, (byte) 2);
        this.M = new bl8(this, (byte) 3);
        this.N = new bl8(this, (byte) 4);
        this.Q = new ln(this, 0L, 350L, d53.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new ln(this, 0L, 320L, d53.g);
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
        this.H = sm0Var;
        this.I = n10Var;
        paint.setStrokeWidth(gm.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(gm.L(3.0f), 0.0f, gm.L(1.0f), TLObject.FLAG_30);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull X1 = oc7.r1(i).X1(j);
            if (X1 != null) {
                wallPaper = X1.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = oc7.r1(i).M0(-j);
            if (M0 != null) {
                wallPaper = M0.wallpaper;
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
        tz3 tz3Var;
        int[] iArr;
        amb i2;
        if (wallPaper != null) {
            if (TextUtils.isEmpty(uf2.h(wallPaper))) {
                return a92.d(drawable, wallPaper, z);
            }
            if (wallPaper.settings != null) {
                tz3Var = uf2.e(i).g(fnb.d(wallPaper.settings.emoticon));
                if (tz3Var == null) {
                    return f(i, tz3Var, z);
                }
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (cmb.O0(string) == null || cmb.O0(string).o()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                bmb bmbVar = cmb.I;
                if (!string.equals(string2)) {
                    str2 = string2;
                } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str2 = string2;
                    bmb O0 = !z ? cmb.O0(str2) : cmb.O0(str);
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    String[] strArr = new String[1];
                    String str3 = O0.d;
                    SparseIntArray R0 = str3 == null ? cmb.R0(null, str3, strArr) : cmb.R0(new File(O0.b), null, strArr);
                    iArr = cmb.gm;
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
                    sm2 I = cmb.I(O0, sparseIntArray, strArr[0], 0, true);
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
                iArr = cmb.gm;
                if (iArr != null) {
                }
                i2 = O0.i(false);
                if (i2 == null) {
                }
                sm2 I2 = cmb.I(O0, sparseIntArray2, strArr2[0], 0, true);
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) I2.c;
                if (bitmapDrawable2 == null) {
                }
            }
        }
        tz3Var = null;
        if (tz3Var == null) {
        }
    }

    public static Drawable f(int i, final tz3 tz3Var, final boolean z) {
        if (tz3Var.l()) {
            cmb.I(tz3.d(z), tz3Var.g(i, z ? 1 : 0), ((sz3) tz3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = tz3Var.g(i, z ? 1 : 0);
        int i2 = cmb.De;
        int i3 = g.get(i2, cmb.w0(null, i2, false));
        int i4 = cmb.Ee;
        int i5 = g.get(i4, cmb.w0(null, i4, false));
        int i6 = cmb.Fe;
        int i7 = g.get(i6, cmb.w0(null, i6, false));
        int i8 = cmb.Ge;
        int i9 = g.get(i8, cmb.w0(null, i8, false));
        final ah7 ah7Var = new ah7();
        ah7Var.g = false;
        ah7Var.r(tz3Var.j(z ? 1 : 0).settings.intensity, ah7Var.u);
        ah7Var.n(true, i3, i5, i7, i9);
        ah7Var.t(0);
        final int f = ah7Var.f();
        tz3Var.n(z ? 1 : 0, new ResultCallback() { // from class: al8
            @Override // org.telegram.tgnet.ResultCallback
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((osc) pair.second).a;
                    tz3 tz3Var2 = tz3.this;
                    if (longValue != tz3Var2.h(z ? 1 : 0) || bitmap == null) {
                        return;
                    }
                    int i10 = tz3Var2.j(z ? 1 : 0).settings.intensity;
                    ah7 ah7Var2 = ah7Var;
                    ah7Var2.r(i10, bitmap);
                    ah7Var2.s(f);
                    ah7Var2.q(1.0f);
                }
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(TLRPC.TL_error tL_error) {
            }

            @Override // org.telegram.tgnet.ResultCallback
            public final void onError(Throwable th) {
            }
        });
        return ah7Var;
    }

    private void setupCollage(g6b g6bVar) {
        lqb lqbVar = this.G;
        if (lqbVar != null) {
            lqbVar.setCollage(g6bVar != null ? g6bVar.T : null);
        }
    }

    private void setupImage(g6b g6bVar) {
        Utilities.g.c(new a18(this, g6bVar, (byte) 22));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        ndc ndcVar = this.e;
        float f3 = 0.0f;
        if (ndcVar != null) {
            if (!this.P) {
                g6b g6bVar = this.d;
                if (g6bVar == null) {
                    f2 = 1.0f;
                } else if (!g6bVar.Y) {
                    f2 = g6bVar.P;
                }
                ndcVar.A0(f2);
            }
            f2 = 0.0f;
            ndcVar.A0(f2);
        }
        ndc ndcVar2 = this.y;
        if (ndcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                g6b g6bVar2 = this.d;
                f = g6bVar2 != null ? g6bVar2.u0 : 1.0f;
            }
            ndcVar2.A0(f);
        }
        ndc ndcVar3 = this.E;
        if (ndcVar3 != null) {
            if (!this.P) {
                g6b g6bVar3 = this.d;
                f3 = g6bVar3 != null ? g6bVar3.G : 1.0f;
            }
            ndcVar3.A0(f3);
        }
        cm2 cm2Var = this.F;
        if (cm2Var != null) {
            cm2Var.setMuted(this.P);
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
        g6b g6bVar = this.d;
        fArr[0] = g6bVar.k0;
        fArr[1] = g6bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        g6b g6bVar2 = this.d;
        fArr[0] = g6bVar2.k0 / 2.0f;
        fArr[1] = g6bVar2.l0;
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
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            float e = ((drawable instanceof ah7) && ((ah7) drawable).u == null) ? 0.0f : this.Q.e(false, 1.0f);
            Drawable drawable2 = this.S;
            if (drawable2 != null && e < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - e) * 255.0f));
                g6b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (e * 255.0f));
            g6b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        e43 e43Var = this.B0;
        if (e43Var != null) {
            e43Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !i()) {
            float d = this.g0.d(this.a == null);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r5.k0 / 2.0f, r5.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    g6b g6bVar = this.d;
                    int i = g6bVar.k0;
                    int i2 = g6bVar.l0;
                    int i3 = g6bVar.Q;
                    ao6 ao6Var = g6bVar.m0;
                    if (((i3 + ao6Var.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f = ao6Var.e;
                    float f2 = ao6Var.f;
                    float f3 = i;
                    float f4 = i2;
                    canvas2.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
                    float f5 = this.d.m0.c;
                    canvas2.scale(f5, f5);
                    ao6 ao6Var2 = this.d.m0;
                    canvas2.translate(ao6Var2.a * f3, ao6Var2.b * f4);
                    canvas2.rotate(this.d.m0.d + r0.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    g6b g6bVar2 = this.d;
                    canvas2.translate((-g6bVar2.k0) / 2.0f, (-g6bVar2.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                g6b g6bVar3 = this.d;
                int i4 = g6bVar3.k0;
                int i5 = g6bVar3.l0;
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
        v9b v9bVar = ((k9b) this).D0;
        l9b l9bVar = v9bVar.d1;
        boolean z = false;
        if (l9bVar == null || !l9bVar.O1) {
            m78 m78Var = v9bVar.D1;
            kl7 kl7Var = m78Var.J;
            if (m78Var.w && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    m78Var.E = false;
                    m78Var.F = System.currentTimeMillis();
                    m78Var.G = motionEvent.getX();
                    m78Var.H = motionEvent.getY();
                    n78 n78Var = m78Var.x;
                    if (n78Var != null) {
                        m78Var.I = n78Var.getEnhanceValue();
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
                    if (!m78Var.E && System.currentTimeMillis() - m78Var.F <= ViewConfiguration.getLongPressTimeout() && Math.abs(m78Var.H - y) < Math.abs(m78Var.G - x) && Math.abs(m78Var.G - x) > gm.e) {
                        m78Var.E = true;
                        gm.r(kl7Var);
                        m78Var.r = true;
                        m78Var.invalidate();
                    }
                    if (m78Var.E) {
                        float f = x - m78Var.G;
                        if (m78Var.x == null) {
                            m78Var.y.run();
                        }
                        n78 n78Var2 = m78Var.x;
                        if (n78Var2 == null) {
                            m78Var.E = false;
                        } else {
                            float enhanceValue = n78Var2.getEnhanceValue();
                            float i = Utilities.i((f / (gm.q.x * 0.8f)) + enhanceValue, 1.0f, 0.0f);
                            int round = Math.round(i * 100.0f);
                            int round2 = Math.round(enhanceValue * 100.0f);
                            int round3 = Math.round(m78Var.I * 100.0f);
                            if (round == round2 || !(round == 100 || round == 0)) {
                                if (Math.abs(round - round3) > (gda.o() == 2 ? 5 : 10)) {
                                    gm.W3(m78Var);
                                    m78Var.I = i;
                                }
                            } else {
                                try {
                                    m78Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                m78Var.I = i;
                            }
                            m78Var.x.setEnhanceValue(i);
                            n78 n78Var3 = m78Var.x;
                            StaticLayout staticLayout = new StaticLayout(String.valueOf(Math.round((n78Var3 == null ? 0.0f : n78Var3.getEnhanceValue()) * 100.0f)), m78Var.b, m78Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            m78Var.f = staticLayout;
                            m78Var.h = staticLayout.getLineCount() > 0 ? m78Var.f.getLineWidth(0) : 0.0f;
                            m78Var.n = m78Var.f.getLineCount() > 0 ? m78Var.f.getLineLeft(0) : 0.0f;
                            m78Var.invalidate();
                        }
                    }
                    m78Var.G = x;
                    m78Var.H = y;
                } else if (action == 1 || action == 3) {
                    m78Var.E = false;
                    m78Var.F = -1L;
                    n78 n78Var4 = m78Var.x;
                    if (n78Var4 != null) {
                        m78Var.I = n78Var4.getEnhanceValue();
                    }
                    gm.d3(kl7Var, 600L);
                }
            } else if (m78Var.r) {
                m78Var.r = false;
                m78Var.invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        g6b g6bVar;
        g6b g6bVar2;
        ncc nccVar = this.n;
        if (view == nccVar && (g6bVar2 = this.d) != null && g6bVar2.u) {
            return false;
        }
        if ((view != nccVar && view != this.r) || (g6bVar = this.d) == null || g6bVar.m0 == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
        canvas.concat(this.d.n0);
        if (this.d.m0 != null) {
            canvas.translate(r0.k0 / 2.0f, r0.l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            g6b g6bVar3 = this.d;
            int i = g6bVar3.k0;
            int i2 = g6bVar3.l0;
            int i3 = g6bVar3.Q;
            ao6 ao6Var = g6bVar3.m0;
            if (((i3 + ao6Var.k) / 90) % 2 == 1) {
                i2 = i;
                i = i2;
            }
            float f = ao6Var.e;
            float f2 = ao6Var.f;
            canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
            canvas.rotate(this.d.Q);
            g6b g6bVar4 = this.d;
            canvas.translate((-g6bVar4.k0) / 2.0f, (-g6bVar4.l0) / 2.0f);
        }
        canvas.concat(this.i0);
        canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.Bitmap[], java.io.Serializable] */
    public final void g(qac qacVar, View... viewArr) {
        ncc nccVar;
        int L = (int) (gm.L(26.0f) * gm.p);
        int L2 = (int) (gm.L(30.33f) * gm.p);
        int L3 = (int) (gm.L(4.0f) * gm.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (nccVar = this.n) != null) {
                    r5[i] = nccVar.getBitmap();
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
        Utilities.e.c(new zt2(L, L2, L3, r5, qacVar, (byte) 1));
    }

    public int getContentHeight() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 1;
        }
        return g6bVar.l0;
    }

    public int getContentWidth() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 1;
        }
        return g6bVar.k0;
    }

    public long getCurrentPosition() {
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        ndc ndcVar2 = this.y;
        if (ndcVar2 != null) {
            return ndcVar2.S();
        }
        ndc ndcVar3 = this.E;
        if (ndcVar3 != null) {
            return ndcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        g6b g6bVar = this.d;
        if (g6bVar != null) {
            double d = g6bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        ndc ndcVar = this.e;
        if (ndcVar == null || ndcVar.U() == -9223372036854775807L) {
            return 1L;
        }
        return this.e.U();
    }

    public int getOrientation() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 0;
        }
        return g6bVar.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public ncc getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        g6b g6bVar;
        return (this.F == null || (g6bVar = this.d) == null || !g6bVar.v()) ? false : true;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(g6b g6bVar) {
        long j;
        long j2;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (g6bVar != null) {
            int measuredWidth = getMeasuredWidth() <= 0 ? gm.q.x : getMeasuredWidth();
            int i = (int) ((measuredWidth << 4) / 9.0f);
            if (g6bVar.K) {
                Bitmap bitmap = g6bVar.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = g6bVar.N) != null && str.startsWith("vthumb://")) {
                    j = Long.parseLong(g6bVar.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = getContext().getContentResolver().loadThumbnail(g6bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(measuredWidth, i), null);
                        } catch (Exception unused) {
                        }
                    }
                    j2 = j;
                    if (j2 >= 0 && g6bVar.K && g6bVar.N == null) {
                        invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = g6bVar.Z0;
                        if (file == null) {
                            file = g6bVar.L;
                        }
                        if (file == null) {
                            return;
                        }
                        zn1 zn1Var = new zn1((Object) this, (Object) g6bVar, j2, (Object) file.getPath(), (byte) 6);
                        boolean z = g6bVar.K;
                        bitmapArr[0] = g6b.q(zn1Var, measuredWidth, i, !z ? g6bVar.Q : 0, !z);
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
        gm.c3(new jy6(this, bitmapArr, g6bVar, zArr, (byte) 23));
    }

    public final void l(g6b g6bVar) {
        this.d = g6bVar;
        if (g6bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (g6bVar.K) {
            setupImage(g6bVar);
            if (g6bVar.A0 == 0 && g6bVar.B0 == 0) {
                g6bVar.y(new q78((k9b) this, (byte) 25));
            } else {
                r();
            }
        } else {
            setupImage(g6bVar);
            r();
        }
        a();
        u(g6bVar);
        q(g6bVar, false);
        s(g6bVar, null, false);
    }

    public final void m(long j) {
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            ndcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            ndc ndcVar2 = this.y;
            if (ndcVar2 != null) {
                ndcVar2.p0(j, false);
            } else {
                ndc ndcVar3 = this.E;
                if (ndcVar3 != null) {
                    ndcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(g6b g6bVar, b7b b7bVar, long j) {
        this.d = g6bVar;
        byte b = 0;
        if (g6bVar == null) {
            t(null, b7bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (g6bVar.v()) {
            setupImage(null);
            t(null, b7bVar, j);
            setupCollage(g6bVar);
        } else if (g6bVar.K) {
            setupImage(g6bVar);
            setupCollage(null);
            t(g6bVar, b7bVar, j);
            if (g6bVar.A0 == 0 && g6bVar.B0 == 0) {
                g6bVar.y(new bl8(this, b));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, b7bVar, 0L);
            setupImage(g6bVar);
            r();
        }
        a();
        u(g6bVar);
        q(g6bVar, false);
        s(g6bVar, null, false);
    }

    public final void o(TextureView textureView, n78 n78Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = n78Var;
        this.r = textureView;
        if (n78Var != null) {
            int i = this.V;
            int i2 = this.W;
            uf4 uf4Var = n78Var.m0;
            if (uf4Var != null) {
                uf4Var.f(i, i2);
            } else {
                n78Var.K0 = i;
                n78Var.L0 = i2;
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

    public final void p(k47 k47Var) {
        long duration;
        g6b g6bVar = this.d;
        if (g6bVar != null) {
            g6bVar.j = true;
            if (k47Var != null) {
                int i = k47Var.K1;
                if (k47Var.k != null) {
                    TLRPC.Document F0 = k47Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (TextUtils.isEmpty(k47Var.k.attachPath)) {
                        bc4.G(i);
                        File J = bc4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            bc4.G(i);
                            J = bc4.J(F0, null, true, true);
                            if (J == null || !J.exists()) {
                                g6b g6bVar2 = this.d;
                                g6bVar2.y = null;
                                g6bVar2.z = null;
                                g6bVar2.A = null;
                                g6bVar2.B = null;
                                g6bVar2.D = 0L;
                                g6bVar2.C = 0L;
                                g6bVar2.E = 0.0f;
                                g6bVar2.F = 1.0f;
                                return;
                            }
                            this.d.y = J.getAbsolutePath();
                        }
                        this.d.y = J.getAbsolutePath();
                    } else {
                        this.d.y = k47Var.k.attachPath;
                    }
                    g6b g6bVar3 = this.d;
                    g6bVar3.A = null;
                    g6bVar3.B = null;
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
                    g6b g6bVar4 = this.d;
                    g6bVar4.D = 0L;
                    if (g6bVar4.K) {
                        g6bVar4.D = (long) (g6bVar4.Z * getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            g6b g6bVar5 = ((bm2) obj).n;
                            if (g6bVar5 != null && g6bVar5.K) {
                                duration = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    g6b g6bVar6 = this.d;
                    duration = g6bVar6.K ? getDuration() : g6bVar6.C;
                    lqb lqbVar = this.G;
                    int maxCount = lqbVar == null ? 1 : lqbVar.getMaxCount();
                    g6b g6bVar7 = this.d;
                    g6bVar7.F = g6bVar7.C != 0 ? Math.min(1.0f, Math.min(duration, maxCount * 59000) / this.d.C) : 1.0f;
                }
            }
            g6bVar.y = null;
            g6bVar.z = null;
            g6bVar.A = null;
            g6bVar.B = null;
            g6bVar.D = 0L;
            g6bVar.C = 0L;
            g6bVar.E = 0.0f;
            g6bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(g6b g6bVar, boolean z) {
        boolean z2;
        ndc ndcVar = this.E;
        if (ndcVar != null) {
            ndcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (g6bVar != null) {
            lqb lqbVar = this.G;
            boolean z3 = false;
            if (lqbVar != null) {
                String str = g6bVar.y;
                String str2 = g6bVar.A;
                String str3 = g6bVar.B;
                long j = g6bVar.C;
                long j2 = g6bVar.D;
                float f = g6bVar.E;
                float f2 = g6bVar.F;
                float f3 = g6bVar.G;
                if (!TextUtils.equals(lqbVar.P, str)) {
                    eqb eqbVar = lqbVar.b0;
                    if (eqbVar != null) {
                        eqbVar.a();
                        lqbVar.b0 = null;
                        lqbVar.V = false;
                    }
                    lqbVar.P = str;
                    lqbVar.p();
                }
                lqbVar.P = str;
                boolean isEmpty = TextUtils.isEmpty(str);
                lqbVar.O = !isEmpty;
                if (isEmpty) {
                    lqbVar.Q = false;
                    str2 = null;
                    str3 = null;
                }
                String str4 = TextUtils.isEmpty(str2) ? null : str2;
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                if (lqbVar.O) {
                    lqbVar.S = j;
                    lqbVar.R = j2 - ((long) (j * f));
                    lqbVar.T = f;
                    lqbVar.U = f2;
                    lqbVar.W = f3;
                    if (str4 != null) {
                        StaticLayout staticLayout = new StaticLayout(str4, lqbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        lqbVar.N0 = staticLayout;
                        lqbVar.O0 = staticLayout.getLineCount() > 0 ? lqbVar.N0.getLineWidth(0) : 0.0f;
                        lqbVar.P0 = lqbVar.N0.getLineCount() > 0 ? lqbVar.N0.getLineLeft(0) : 0.0f;
                    } else {
                        lqbVar.O0 = 0.0f;
                        lqbVar.N0 = null;
                    }
                    if (str3 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str3, lqbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        lqbVar.R0 = staticLayout2;
                        lqbVar.S0 = staticLayout2.getLineCount() > 0 ? lqbVar.R0.getLineWidth(0) : 0.0f;
                        lqbVar.T0 = lqbVar.R0.getLineCount() > 0 ? lqbVar.R0.getLineLeft(0) : 0.0f;
                    } else {
                        lqbVar.S0 = 0.0f;
                        lqbVar.R0 = null;
                    }
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = true;
                    lqbVar.f0.f(lqbVar.O, true);
                }
                lqbVar.invalidate();
            } else {
                z2 = true;
            }
            if (g6bVar.y != null) {
                ndc ndcVar2 = new ndc();
                this.E = ndcVar2;
                ndcVar2.E = z2;
                ndcVar2.K = new ai4((Object) this, (byte) 22);
                ndcVar2.i0(Uri.fromFile(new File(g6bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = (long) (g6bVar.Z * getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            v9b v9bVar = ((k9b) this).D0;
            z8b z8bVar = v9bVar.w1;
            if (z8bVar != null) {
                g6b g6bVar2 = v9bVar.L1;
                if (g6bVar2 != null && g6bVar2.y != null) {
                    z3 = z2;
                }
                z8bVar.setHasAudio(z3);
            }
        }
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : gm.q.y;
        g6b g6bVar = this.d;
        int i = g6bVar.A0;
        Paint paint = this.U;
        if (i == 0 || g6bVar.B0 == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jr0((Object) this, measuredHeight, (byte) 3).a(lge.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f = measuredHeight;
            g6b g6bVar2 = this.d;
            int i2 = g6bVar2.A0;
            this.V = i2;
            int i3 = g6bVar2.B0;
            this.W = i3;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i2, i3}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            ncc nccVar = this.n;
            if (nccVar != null) {
                int i4 = this.V;
                int i5 = this.W;
                uf4 uf4Var = nccVar.b;
                if (uf4Var == null) {
                    nccVar.n = i4;
                    nccVar.r = i5;
                } else {
                    uf4Var.f(i4, i5);
                }
            }
            n78 n78Var = this.s;
            if (n78Var != null) {
                int i6 = this.V;
                int i7 = this.W;
                uf4 uf4Var2 = n78Var.m0;
                if (uf4Var2 != null) {
                    uf4Var2.f(i6, i7);
                } else {
                    n78Var.K0 = i6;
                    n78Var.L0 = i7;
                }
            }
        }
        invalidate();
    }

    public final void s(g6b g6bVar, ao9 ao9Var, boolean z) {
        ndc ndcVar;
        if (g6bVar == null || g6bVar.o0 == null) {
            ndc ndcVar2 = this.y;
            if (ndcVar2 != null) {
                ndcVar2.f0();
                this.y.l0();
                this.y = null;
            }
            lqb lqbVar = this.G;
            if (lqbVar != null) {
                lqbVar.setRoundNull(z);
            }
            this.x = null;
            gm.r(this.L);
            return;
        }
        ndc ndcVar3 = this.y;
        if (ndcVar3 != null) {
            ndcVar3.l0();
            this.y = null;
        }
        ndc ndcVar4 = new ndc();
        this.y = ndcVar4;
        ndcVar4.E = true;
        ndcVar4.K = new k44(this, (byte) 28);
        this.y.i0(Uri.fromFile(g6bVar.o0), "other");
        b();
        this.x = ao9Var;
        if (ao9Var != null && (ndcVar = this.y) != null) {
            ndcVar.z0(ao9Var.w0);
        }
        this.G.n(g6bVar.o0.getAbsolutePath(), g6bVar.q0, g6bVar.r0, g6bVar.s0, g6bVar.t0, g6bVar.u0, z);
        y(true);
    }

    public void set(g6b g6bVar) {
        n(g6bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(cm2 cm2Var) {
        this.F = cm2Var;
    }

    public void setCropEditorDrawing(e43 e43Var) {
        if (this.B0 != e43Var) {
            this.B0 = e43Var;
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

    public void setVideoTimelineView(lqb lqbVar) {
        this.G = lqbVar;
        if (lqbVar != null) {
            lqbVar.setDelegate(new fk3(this));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(g6b g6bVar, b7b b7bVar, long j) {
        ArrayList arrayList;
        xm0 xm0Var;
        byte b = 5;
        if (g6bVar == null || g6bVar.v()) {
            ndc ndcVar = this.e;
            if (ndcVar != null) {
                ndcVar.f0();
                this.e.l0();
                this.e = null;
            }
            n10 n10Var = this.I;
            if (n10Var == null || !n10Var.g) {
                ncc nccVar = this.n;
                if (nccVar != null) {
                    nccVar.clearAnimation();
                    this.n.animate().alpha(0.0f).withEndAction(new bl8(this, b)).start();
                }
            } else {
                n10Var.a(null);
            }
            lqb lqbVar = this.G;
            if (lqbVar != null) {
                lqbVar.o(false, null, 1L, 0.0f);
            }
            gm.r(this.L);
            if (b7bVar != null) {
                gm.c3(b7bVar);
                return;
            }
            return;
        }
        ndc ndcVar2 = this.e;
        if (ndcVar2 != null) {
            ndcVar2.l0();
            this.e = null;
        }
        byte b2 = 0;
        ndc ndcVar3 = new ndc();
        this.e = ndcVar3;
        ndcVar3.E = true;
        ndcVar3.K = new in3((ViewGroup) this, (Object) g6bVar, (Object) new Runnable[]{b7bVar}, (byte) 24);
        ncc nccVar2 = this.n;
        if (nccVar2 != null) {
            nccVar2.clearAnimation();
            ncc nccVar3 = this.n;
            uf4 uf4Var = nccVar3.b;
            if (uf4Var != null) {
                uf4Var.postRunnable(new sf4(uf4Var, b2));
            }
            nccVar3.a = null;
            removeView(this.n);
            this.n = null;
        }
        this.n = new ncc(this.e, getContext());
        this.H.e();
        ncc nccVar4 = this.n;
        sm0 sm0Var = g6bVar.u ? null : this.H;
        nccVar4.s = sm0Var;
        uf4 uf4Var2 = nccVar4.b;
        if (uf4Var2 != null && (xm0Var = uf4Var2.J) != null) {
            sm0 sm0Var2 = xm0Var.t;
            if (sm0Var2 != null && sm0Var2.m != null) {
                sm0Var2.m = null;
            }
            xm0Var.t = sm0Var;
            if (sm0Var != null && sm0Var.m != xm0Var) {
                sm0Var.m = xm0Var;
                sm0Var.d();
            }
        }
        this.n.setOpaque(false);
        a();
        n10 n10Var2 = this.I;
        if (n10Var2 == null || !n10Var2.g) {
            this.n.setAlpha(b7bVar != null ? 1.0f : 0.0f);
            addView(this.n, qoe.e(-2, -2, 51));
        } else {
            n10Var2.a(this.n);
        }
        ci7 ci7Var = new ci7(this, (byte) 17);
        f6b f6bVar = g6bVar.d1;
        if (f6bVar != null) {
            ci7Var.a(f6bVar);
        } else if (!g6bVar.K || Build.VERSION.SDK_INT < 24) {
            f6b f6bVar2 = new f6b();
            g6bVar.d1 = f6bVar2;
            ci7Var.a(f6bVar2);
        } else {
            Utilities.e.c(new b6b(g6bVar, ci7Var, b2));
        }
        File file = g6bVar.Z0;
        if (file == null) {
            file = g6bVar.L;
        }
        this.e.i0(Uri.fromFile(file), "other");
        this.e.t0(this.A0.isEmpty());
        this.e.r0(true);
        long j2 = g6bVar.h ? (long) ((g6bVar.Z * g6bVar.h0) + j) : j;
        if (j2 > 0) {
            this.e.p0(j2, false);
        }
        b();
        w(true);
        boolean z = g6bVar.u && (arrayList = g6bVar.v) != null && arrayList.size() == 1 && ((k47) g6bVar.v.get(0)).D == 5;
        lqb lqbVar2 = this.G;
        File file2 = g6bVar.Z0;
        if (file2 == null) {
            file2 = g6bVar.L;
        }
        lqbVar2.o(z, file2.getAbsolutePath(), getDuration(), g6bVar.P);
        this.G.setVideoLeft(g6bVar.Z);
        this.G.setVideoRight(g6bVar.a0);
        lqb lqbVar3 = this.G;
        if (lqbVar3 == null || j2 <= 0) {
            return;
        }
        lqbVar3.setProgress(j2);
    }

    public final void u(g6b g6bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (g6bVar == null) {
            this.T = null;
            return;
        }
        long j = g6bVar.z0;
        if (j == Long.MIN_VALUE) {
            this.T = null;
            return;
        }
        Drawable d = d(this.T, g6bVar.a, j, g6bVar.y0);
        g6bVar.x0 = d;
        this.T = d;
        if (this.S != d) {
            this.S = null;
        }
        if (d != null) {
            d.setCallback(this);
        }
        sm0 sm0Var = this.H;
        if (sm0Var != null) {
            Drawable drawable2 = this.T;
            if (drawable2 == null) {
                sm0Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                sm0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                sm0Var.f(createBitmap, true);
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
                f = oqe.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                                gm.W3(this);
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
                                gm.W3(this);
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
                        v9b v9bVar = ((k9b) this).D0;
                        v9bVar.p1.a(true, false, v9bVar.j0);
                        v9bVar.p1.b(v9bVar.d1.getText());
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
            g6b g6bVar = this.d;
            if ((U < g6bVar.E || U > g6bVar.F) && System.currentTimeMillis() - this.K > 500) {
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
            ndc ndcVar = this.e;
            if (ndcVar == null) {
                ndcVar = this.y;
            }
            S = ndcVar.S();
            c0 = ndcVar.c0();
        }
        g6b g6bVar2 = this.d;
        float f = g6bVar2.F;
        float f2 = g6bVar2.E;
        float f3 = g6bVar2.C;
        long j = (long) ((f - f2) * f3);
        if (c0) {
            long j2 = g6bVar2.D;
            if (S >= j2) {
            }
        }
        z2 = false;
        long j3 = S - (g6bVar2.D - ((long) (f2 * f3)));
        if (this.E.c0() != z2) {
            this.E.t0(z2);
            this.E.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.E.S() - j3) > (i() ? nm7.W4 : nm7.E1)) {
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
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            ndcVar.t0(hashSet.isEmpty());
        }
        cm2 cm2Var = this.F;
        if (cm2Var != null) {
            cm2Var.setPlaying(hashSet.isEmpty());
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
            ao9 ao9Var = this.x;
            if (ao9Var != null && !ao9Var.D0) {
                ao9Var.D0 = true;
                ao9Var.E0.f(true, true);
                ao9Var.invalidate();
            }
            long S2 = this.y.S();
            if (!z || this.y.U() == -9223372036854775807L) {
                return;
            }
            float U = S2 / this.y.U();
            g6b g6bVar = this.d;
            if ((U < g6bVar.s0 || U > g6bVar.t0) && System.currentTimeMillis() - this.K > 500) {
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
        g6b g6bVar2 = this.d;
        float f = g6bVar2.t0;
        float f2 = g6bVar2.s0;
        float f3 = g6bVar2.q0;
        long j = (long) ((f - f2) * f3);
        long j2 = g6bVar2.r0;
        boolean z2 = S >= j2 && S <= j + j2;
        boolean z3 = c0 && z2;
        long j3 = (S - j2) + ((long) (f2 * f3));
        ao9 ao9Var2 = this.x;
        if (ao9Var2 != null && ao9Var2.D0 != z2) {
            ao9Var2.D0 = z2;
            ao9Var2.invalidate();
        }
        if (this.y.c0() != z3) {
            this.y.t0(z3);
            this.y.p0(j3, false);
        } else if (z) {
            if (Math.abs(this.y.S() - j3) > (i() ? nm7.W4 : nm7.E1)) {
                this.y.p0(j3, false);
            }
        }
    }
}
