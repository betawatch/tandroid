// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class anb extends FrameLayout implements gk7, tjb {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public wd2 H;
    public final be0 I;
    public final int J;
    public cib K;
    public final byte L;
    public int M;
    public float N;
    public p72 O;
    public boolean P;
    public final ImageReceiver Q;
    public pb0 R;
    public final m17 S;
    public final m17 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public zmb f;
    public zmb h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final wjb y;

    /* JADX WARN: Multi-variable type inference failed */
    public anb(int i, int i2, wjb wjbVar, Context context) {
        super(context);
        this.a = gl.L(8.0f);
        this.b = gl.L(6.0f);
        this.c = gl.L(4.0f);
        this.d = gl.L(21.0f);
        this.e = gl.L(41.0f);
        this.f = new zmb(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new m17(0, true, false, null);
        this.T = new m17(0, false, false, null);
        this.L = i2;
        this.J = i;
        this.y = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.q0(gl.L(8.0f));
        zkb.h(bkb.h5, wjbVar, this);
        be0 be0Var = new be0(context);
        this.I = be0Var;
        be0Var.getImageReceiver().B0 = true;
        be0Var.getImageReceiver().v0 = false;
        be0Var.getImageReceiver().M(0);
        if (i2 == 0 || i2 == 3 || i2 == 2) {
            addView(be0Var, nme.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(be0Var, nme.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(gl.L(120.0f) / bitmap.getWidth(), gl.L(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(max - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * max);
        int height = (int) (bitmap.getHeight() * max);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.G;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(kk7.M1);
        this.F = textPaint;
        textPaint.setColor(bkb.v0(bkb.Nf, this.y));
        this.F.setTextSize(gl.L(c()));
        this.F.setTypeface(gl.o());
        int L = gl.L(52.0f);
        byte b = this.L;
        if (b == 3 || b == 4) {
            L = gl.L(77.0f);
        }
        String b2 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = lwa.d(b2, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return k96.M0(2131752205, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().y() != null) {
            gl.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().y().l0) {
                this.I.getImageReceiver().y().I(0, true, false);
                this.I.getImageReceiver().y().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(gl.H).start();
            cib cibVar = new cib(this, (byte) 6);
            this.K = cibVar;
            gl.e3(cibVar, 2500L);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zmb zmbVar;
        zmb zmbVar2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (zmbVar2 = this.h) != null) {
            zmbVar2.b(canvas, 1.0f);
        }
        float f = this.n;
        if (f != 0.0f) {
            this.f.b(canvas, f);
        }
        if (this.n != 1.0f && (zmbVar = this.h) != null) {
            zmbVar.a(canvas, 1.0f);
        }
        float f2 = this.n;
        if (f2 != 0.0f) {
            this.f.a(canvas, f2);
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            float f4 = f3 + 0.10666667f;
            this.n = f4;
            if (f4 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(wd2 wd2Var, long j, boolean z) {
        long j2;
        zmb zmbVar;
        wd2 wd2Var2;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        jy3 jy3Var;
        fj5 fj5Var;
        wd2 wd2Var3;
        Drawable drawable;
        wd2 wd2Var4;
        int i;
        int i2;
        int i3;
        int i4;
        ye7 ye7Var;
        jy3 jy3Var2;
        p72 p72Var;
        p72 p72Var2;
        boolean z2 = this.H != wd2Var;
        int i5 = this.W;
        int i6 = wd2Var.c;
        boolean z3 = i5 != i6;
        this.W = i6;
        this.H = wd2Var;
        TLRPC.Document e = wd2Var.a.e();
        jy3 jy3Var3 = wd2Var.a;
        if (jy3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l = (Long) je2.e(jy3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) jy3Var3.d).gift.slug);
            if (l != null) {
                j2 = l.longValue();
                this.V = j2;
                if (j == j2) {
                    this.V = 0L;
                    j2 = 0;
                }
                String str = null;
                if (j2 == 0) {
                    if (this.R == null) {
                        this.R = new pb0((wjb) null);
                    }
                    TLObject Z1 = na7.q1(this.J).Z1(this.V);
                    this.R.o(Z1);
                    this.Q.U(Z1, this.R, null);
                } else {
                    this.Q.f();
                }
                if (z2) {
                    cib cibVar = this.K;
                    if (cibVar != null) {
                        gl.r(cibVar);
                        this.K = null;
                    }
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                }
                if (z2) {
                    Drawable f = e != null ? uo3.f(e, bkb.b7, 0.2f, null) : null;
                    if (f == null) {
                        vu3.k(wd2Var.a.e);
                        f = vu3.g(wd2Var.a.e);
                    }
                    this.I.m(gl5.b(e), "50_50", f, null);
                    wd2Var.a.getClass();
                    TLRPC.WallPaper wallPaper = this.U;
                    boolean z4 = this.P;
                    if (wallPaper != null) {
                        if (z4 && (p72Var2 = this.O) != null) {
                            p72Var2.g(this);
                        }
                        p72 p72Var3 = new p72(wallPaper, false, true);
                        this.O = p72Var3;
                        p72Var3.b = this;
                        ye7 ye7Var2 = p72Var3.f;
                        if (ye7Var2 != null) {
                            ye7Var2.p(this);
                        }
                        if (this.P) {
                            this.O.f(this);
                        }
                    } else {
                        if (z4 && (p72Var = this.O) != null) {
                            p72Var.g(this);
                        }
                        this.O = null;
                    }
                }
                this.I.setVisibility((wd2Var.a.l() || this.U == null) ? 0 : 8);
                if (!z2 || z3) {
                    if (z) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new zmb(this);
                        invalidate();
                    }
                    zmbVar = this.f;
                    wd2Var2 = this.H;
                    if (wd2Var2 != null && (jy3Var = wd2Var2.a) != null) {
                        iy3 iy3Var = (iy3) jy3Var.f.get(wd2Var2.c);
                        int i7 = iy3Var.h;
                        if (this.V != 0) {
                            i7 = iy3Var.k;
                        }
                        Paint paint = zmbVar.c;
                        Paint paint2 = zmbVar.a;
                        Paint paint3 = zmbVar.b;
                        paint.setColor(i7);
                        paint3.setColor(iy3Var.i);
                        int v0 = !this.H.a.l() ? bkb.v0(bkb.Ei, this.y) : iy3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(v0);
                        paint2.setAlpha(alpha);
                        wd2 wd2Var5 = this.H;
                        fj5Var = (fj5) wd2Var5.a.f.get(wd2Var5.c);
                        if (fj5Var != null) {
                            iy3 iy3Var2 = (iy3) fj5Var;
                            if (iy3Var2.a() != 0) {
                                wd2 wd2Var6 = this.H;
                                int i8 = ((iy3) wd2Var6.a.f.get(wd2Var6.c)).d;
                                ArrayList<Integer> arrayList = iy3Var2.b(i8).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i9 = 0; i9 != arrayList.size(); i9++) {
                                        iArr[i9] = arrayList.get(i9).intValue() | (-16777216);
                                    }
                                    float L = this.c + gl.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(kk7.d4);
                                wd2Var4 = this.H;
                                if (wd2Var4 != null) {
                                    if (i8 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = iy3Var2.b(i8).wallpaper.settings;
                                        int i10 = wallPaperSettings.background_color;
                                        int i11 = wallPaperSettings.second_background_color;
                                        int i12 = wallPaperSettings.third_background_color;
                                        i4 = wallPaperSettings.fourth_background_color;
                                        i = i10;
                                        i2 = i11;
                                        i3 = i12;
                                    } else {
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                    }
                                    if (i2 != 0) {
                                        ye7Var = new ye7(i, i2, i3, i4, true, false);
                                        this.M = ye7Var.f();
                                    } else {
                                        ye7 ye7Var3 = new ye7(i, i, i, i, true, false);
                                        this.M = -16777216;
                                        ye7Var = ye7Var3;
                                    }
                                    wd2Var4 = this.H;
                                    wd2Var4.b = ye7Var;
                                }
                                zmbVar.d = wd2Var4.b;
                                invalidate();
                            }
                        }
                        wd2 wd2Var7 = this.H;
                        iy3 iy3Var3 = (iy3) wd2Var7.a.f.get(wd2Var7.c);
                        wd2Var3 = this.H;
                        if (wd2Var3 != null) {
                            wd2Var4 = wd2Var3;
                        } else {
                            int i13 = iy3Var3.k;
                            int i14 = iy3Var3.l;
                            int i15 = iy3Var3.m;
                            int i16 = iy3Var3.n;
                            if (iy3Var3.a.i(false) != null) {
                                if (i14 != 0) {
                                    ye7 ye7Var4 = new ye7(i13, i14, i15, i16, true, false);
                                    this.M = ye7Var4.f();
                                    drawable = ye7Var4;
                                } else {
                                    Drawable ye7Var5 = new ye7(i13, i13, i13, i13, true, false);
                                    this.M = -16777216;
                                    drawable = ye7Var5;
                                }
                            } else if (i13 != 0) {
                                drawable = i14 != 0 ? new ye7(i13, i14, i15, i16, true, false) : new ColorDrawable(i13);
                            } else {
                                akb akbVar = iy3Var3.a;
                                if (akbVar == null || (akbVar.Q <= 0 && akbVar.c == null)) {
                                    jy3 jy3Var4 = this.H.a;
                                    if (jy3Var4 == null || !jy3Var4.l()) {
                                        drawable = new ye7(-2368069, -9722489, -2762611, -7817084, true, false);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = gl.L(112.0f);
                                    float L3 = gl.L(134.0f);
                                    akb akbVar2 = iy3Var3.a;
                                    Bitmap d1 = gl.d1(L2, L3, akbVar2.c, akbVar2.b, akbVar2.Q);
                                    if (d1 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(d1);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            wd2Var4 = this.H;
                            wd2Var4.b = drawable;
                        }
                        zmbVar.d = wd2Var4.b;
                        invalidate();
                    }
                    h = wd2Var.a.h(this.W);
                    jy3 jy3Var5 = wd2Var.a;
                    int i17 = this.W;
                    if (h == 0) {
                        TLRPC.WallPaper j3 = jy3Var5.j(i17);
                        if (j3 != null) {
                            wd2Var.a.p(this.W, new bf(this, h, wd2Var, j3.settings.intensity, (byte) 5));
                        }
                    } else {
                        SparseArray sparseArray = jy3Var5.i(i17).b0;
                        zjb zjbVar = sparseArray != null ? (zjb) sparseArray.get(((iy3) wd2Var.a.f.get(this.W)).e) : null;
                        if (zjbVar != null && (tL_theme = zjbVar.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = zjbVar.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                gl5 c = gl5.c(ba4.w(document.thumbs, 120, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.A1 = false;
                                imageReceiver.d0(c, "120_140", null, null, null, 1);
                                imageReceiver.h1 = new io9(this, wd2Var, wallPaper2, (byte) 9);
                                fl5.z().I(imageReceiver, null);
                            }
                        } else if (zjbVar != null && zjbVar.r == null) {
                            int i18 = (int) (zjbVar.p * 100.0f);
                            Drawable drawable2 = wd2Var.b;
                            if (drawable2 instanceof ye7) {
                                ye7 ye7Var6 = (ye7) drawable2;
                                ye7Var6.r(i18, ye7Var6.u);
                            }
                            je2.s.c(new t79((Object) this, (Object) wd2Var, i18, (byte) 24));
                        }
                    }
                }
                if (!z) {
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                    gl.r(this.K);
                    if (this.I.getImageReceiver().y() != null) {
                        this.I.getImageReceiver().y().stop();
                        this.I.getImageReceiver().y().I(0, false, false);
                    }
                }
                jy3Var2 = this.H.a;
                if (jy3Var2 != null || jy3Var2.l()) {
                    setContentDescription(k96.M0(2131752205, null));
                }
                elb elbVar = this.H.a.c;
                if (elbVar != null && (str = elbVar.b) == null) {
                    str = elbVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j2 = 0;
        this.V = j2;
        if (j == j2) {
        }
        String str2 = null;
        if (j2 == 0) {
        }
        if (z2) {
        }
        if (z2) {
        }
        this.I.setVisibility((wd2Var.a.l() || this.U == null) ? 0 : 8);
        if (!z2) {
        }
        if (z) {
        }
        zmbVar = this.f;
        wd2Var2 = this.H;
        if (wd2Var2 != null) {
            iy3 iy3Var4 = (iy3) jy3Var.f.get(wd2Var2.c);
            int i72 = iy3Var4.h;
            if (this.V != 0) {
            }
            Paint paint4 = zmbVar.c;
            Paint paint22 = zmbVar.a;
            Paint paint32 = zmbVar.b;
            paint4.setColor(i72);
            paint32.setColor(iy3Var4.i);
            if (!this.H.a.l()) {
            }
            int alpha2 = paint22.getAlpha();
            paint22.setColor(v0);
            paint22.setAlpha(alpha2);
            wd2 wd2Var52 = this.H;
            fj5Var = (fj5) wd2Var52.a.f.get(wd2Var52.c);
            if (fj5Var != null) {
            }
            wd2 wd2Var72 = this.H;
            iy3 iy3Var32 = (iy3) wd2Var72.a.f.get(wd2Var72.c);
            wd2Var3 = this.H;
            if (wd2Var3 != null) {
            }
            zmbVar.d = wd2Var4.b;
            invalidate();
        }
        h = wd2Var.a.h(this.W);
        jy3 jy3Var52 = wd2Var.a;
        int i172 = this.W;
        if (h == 0) {
        }
        if (!z) {
        }
        jy3Var2 = this.H.a;
        if (jy3Var2 != null) {
        }
        setContentDescription(k96.M0(2131752205, null));
    }

    public final void g(boolean z, boolean z2) {
        if (!z2) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            this.N = z ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.a0 != z) {
            float f = this.N;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new gja(this, (byte) 24));
            this.E.addListener(new pu9((byte) 8, this, z));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
        this.P = true;
        p72 p72Var = this.O;
        if (p72Var != null) {
            p72Var.f(this);
        }
        this.Q.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        this.P = false;
        p72 p72Var = this.O;
        if (p72Var != null) {
            p72Var.g(this);
        }
        this.Q.K();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.a0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.L;
        if (b == 1 || b == 4) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int L = gl.L(b == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        be0 be0Var = this.I;
        be0Var.setPivotY(be0Var.getMeasuredHeight());
        be0Var.setPivotX(be0Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = this.c;
        RectF rectF = this.w;
        rectF.set(f, f, i - f, i2 - f);
        Path path = this.x;
        path.reset();
        float f2 = this.b;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        int i2 = bkb.h5;
        wjb wjbVar = this.y;
        this.s.setColor(bkb.v0(i2, wjbVar));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(bkb.v0(bkb.Nf, wjbVar));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            wd2 wd2Var = this.H;
            if (wd2Var != null) {
                this.H = null;
                f(wd2Var, 0L, false);
            }
        }
    }

    @Override // tjb
    public final void updateColors() {
        wjb wjbVar = this.y;
        try {
            this.s.setColor(bkb.v0(bkb.h5, wjbVar));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.Nf, wjbVar));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
