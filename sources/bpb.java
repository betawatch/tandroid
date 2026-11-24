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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class bpb extends FrameLayout implements jm7, vlb {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public hf2 H;
    public final bf0 I;
    public final int J;
    public zcb K;
    public final byte L;
    public int M;
    public float N;
    public a92 O;
    public boolean P;
    public final ImageReceiver Q;
    public pc0 R;
    public final m37 S;
    public final m37 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public apb f;
    public apb h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final ylb y;

    /* JADX WARN: Multi-variable type inference failed */
    public bpb(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        this.a = gm.L(8.0f);
        this.b = gm.L(6.0f);
        this.c = gm.L(4.0f);
        this.d = gm.L(21.0f);
        this.e = gm.L(41.0f);
        this.f = new apb(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new m37(0, true, false, null);
        this.T = new m37(0, false, false, null);
        this.L = i2;
        this.J = i;
        this.y = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.q0(gm.L(8.0f));
        anb.h(cmb.h5, ylbVar, this);
        bf0 bf0Var = new bf0(context);
        this.I = bf0Var;
        bf0Var.getImageReceiver().B0 = true;
        bf0Var.getImageReceiver().v0 = false;
        bf0Var.getImageReceiver().M(0);
        if (i2 == 0 || i2 == 3 || i2 == 2) {
            addView(bf0Var, qoe.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(bf0Var, qoe.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(gm.L(120.0f) / bitmap.getWidth(), gm.L(140.0f) / bitmap.getHeight());
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
        TextPaint textPaint = new TextPaint(nm7.M1);
        this.F = textPaint;
        textPaint.setColor(cmb.v0(cmb.Nf, this.y));
        this.F.setTextSize(gm.L(c()));
        this.F.setTypeface(gm.o());
        int L = gm.L(52.0f);
        byte b = this.L;
        if (b == 3 || b == 4) {
            L = gm.L(77.0f);
        }
        String b2 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = oya.d(b2, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return jb6.M0(2131752154, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().y() != null) {
            gm.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().y().l0) {
                this.I.getImageReceiver().y().I(0, true, false);
                this.I.getImageReceiver().y().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(gm.H).start();
            zcb zcbVar = new zcb(this, (byte) 14);
            this.K = zcbVar;
            gm.d3(zcbVar, 2500L);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        apb apbVar;
        apb apbVar2;
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
        if (this.n != 1.0f && (apbVar2 = this.h) != null) {
            apbVar2.b(canvas, 1.0f);
        }
        float f = this.n;
        if (f != 0.0f) {
            this.f.b(canvas, f);
        }
        if (this.n != 1.0f && (apbVar = this.h) != null) {
            apbVar.a(canvas, 1.0f);
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
    public final void f(hf2 hf2Var, long j, boolean z) {
        long j2;
        apb apbVar;
        hf2 hf2Var2;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        tz3 tz3Var;
        el5 el5Var;
        hf2 hf2Var3;
        Drawable drawable;
        hf2 hf2Var4;
        int i;
        int i2;
        int i3;
        int i4;
        ah7 ah7Var;
        tz3 tz3Var2;
        a92 a92Var;
        a92 a92Var2;
        boolean z2 = this.H != hf2Var;
        int i5 = this.W;
        int i6 = hf2Var.c;
        boolean z3 = i5 != i6;
        this.W = i6;
        this.H = hf2Var;
        TLRPC.Document e = hf2Var.a.e();
        tz3 tz3Var3 = hf2Var.a;
        if (tz3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l = (Long) uf2.e(tz3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) tz3Var3.d).gift.slug);
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
                        this.R = new pc0((ylb) null);
                    }
                    TLObject a2 = oc7.r1(this.J).a2(this.V);
                    this.R.o(a2);
                    this.Q.U(a2, this.R, null);
                } else {
                    this.Q.f();
                }
                if (z2) {
                    zcb zcbVar = this.K;
                    if (zcbVar != null) {
                        gm.r(zcbVar);
                        this.K = null;
                    }
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                }
                if (z2) {
                    Drawable f = e != null ? eq3.f(e, cmb.b7, 0.2f, null) : null;
                    if (f == null) {
                        gw3.k(hf2Var.a.e);
                        f = gw3.g(hf2Var.a.e);
                    }
                    this.I.m(gn5.b(e), "50_50", f, null);
                    hf2Var.a.getClass();
                    TLRPC.WallPaper wallPaper = this.U;
                    boolean z4 = this.P;
                    if (wallPaper != null) {
                        if (z4 && (a92Var2 = this.O) != null) {
                            a92Var2.g(this);
                        }
                        a92 a92Var3 = new a92(wallPaper, false, true);
                        this.O = a92Var3;
                        a92Var3.b = this;
                        ah7 ah7Var2 = a92Var3.f;
                        if (ah7Var2 != null) {
                            ah7Var2.p(this);
                        }
                        if (this.P) {
                            this.O.f(this);
                        }
                    } else {
                        if (z4 && (a92Var = this.O) != null) {
                            a92Var.g(this);
                        }
                        this.O = null;
                    }
                }
                this.I.setVisibility((hf2Var.a.l() || this.U == null) ? 0 : 8);
                if (!z2 || z3) {
                    if (z) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new apb(this);
                        invalidate();
                    }
                    apbVar = this.f;
                    hf2Var2 = this.H;
                    if (hf2Var2 != null && (tz3Var = hf2Var2.a) != null) {
                        sz3 sz3Var = (sz3) tz3Var.f.get(hf2Var2.c);
                        int i7 = sz3Var.h;
                        if (this.V != 0) {
                            i7 = sz3Var.k;
                        }
                        Paint paint = apbVar.c;
                        Paint paint2 = apbVar.a;
                        Paint paint3 = apbVar.b;
                        paint.setColor(i7);
                        paint3.setColor(sz3Var.i);
                        int v0 = !this.H.a.l() ? cmb.v0(cmb.Ei, this.y) : sz3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(v0);
                        paint2.setAlpha(alpha);
                        hf2 hf2Var5 = this.H;
                        el5Var = (el5) hf2Var5.a.f.get(hf2Var5.c);
                        if (el5Var != null) {
                            sz3 sz3Var2 = (sz3) el5Var;
                            if (sz3Var2.a() != 0) {
                                hf2 hf2Var6 = this.H;
                                int i8 = ((sz3) hf2Var6.a.f.get(hf2Var6.c)).d;
                                ArrayList<Integer> arrayList = sz3Var2.b(i8).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i9 = 0; i9 != arrayList.size(); i9++) {
                                        iArr[i9] = arrayList.get(i9).intValue() | (-16777216);
                                    }
                                    float L = this.c + gm.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(nm7.d4);
                                hf2Var4 = this.H;
                                if (hf2Var4 != null) {
                                    if (i8 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = sz3Var2.b(i8).wallpaper.settings;
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
                                        ah7Var = new ah7(i, i2, i3, i4, true, false);
                                        this.M = ah7Var.f();
                                    } else {
                                        ah7 ah7Var3 = new ah7(i, i, i, i, true, false);
                                        this.M = -16777216;
                                        ah7Var = ah7Var3;
                                    }
                                    hf2Var4 = this.H;
                                    hf2Var4.b = ah7Var;
                                }
                                apbVar.d = hf2Var4.b;
                                invalidate();
                            }
                        }
                        hf2 hf2Var7 = this.H;
                        sz3 sz3Var3 = (sz3) hf2Var7.a.f.get(hf2Var7.c);
                        hf2Var3 = this.H;
                        if (hf2Var3 != null) {
                            hf2Var4 = hf2Var3;
                        } else {
                            int i13 = sz3Var3.k;
                            int i14 = sz3Var3.l;
                            int i15 = sz3Var3.m;
                            int i16 = sz3Var3.n;
                            if (sz3Var3.a.i(false) != null) {
                                if (i14 != 0) {
                                    ah7 ah7Var4 = new ah7(i13, i14, i15, i16, true, false);
                                    this.M = ah7Var4.f();
                                    drawable = ah7Var4;
                                } else {
                                    Drawable ah7Var5 = new ah7(i13, i13, i13, i13, true, false);
                                    this.M = -16777216;
                                    drawable = ah7Var5;
                                }
                            } else if (i13 != 0) {
                                drawable = i14 != 0 ? new ah7(i13, i14, i15, i16, true, false) : new ColorDrawable(i13);
                            } else {
                                bmb bmbVar = sz3Var3.a;
                                if (bmbVar == null || (bmbVar.Q <= 0 && bmbVar.c == null)) {
                                    tz3 tz3Var4 = this.H.a;
                                    if (tz3Var4 == null || !tz3Var4.l()) {
                                        drawable = new ah7(-2368069, -9722489, -2762611, -7817084, true, false);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = gm.L(112.0f);
                                    float L3 = gm.L(134.0f);
                                    bmb bmbVar2 = sz3Var3.a;
                                    Bitmap d1 = gm.d1(L2, L3, bmbVar2.c, bmbVar2.b, bmbVar2.Q);
                                    if (d1 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(d1);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            hf2Var4 = this.H;
                            hf2Var4.b = drawable;
                        }
                        apbVar.d = hf2Var4.b;
                        invalidate();
                    }
                    h = hf2Var.a.h(this.W);
                    tz3 tz3Var5 = hf2Var.a;
                    int i17 = this.W;
                    if (h == 0) {
                        TLRPC.WallPaper j3 = tz3Var5.j(i17);
                        if (j3 != null) {
                            hf2Var.a.p(this.W, new cg(this, h, hf2Var, j3.settings.intensity, (byte) 5));
                        }
                    } else {
                        SparseArray sparseArray = tz3Var5.i(i17).b0;
                        amb ambVar = sparseArray != null ? (amb) sparseArray.get(((sz3) hf2Var.a.f.get(this.W)).e) : null;
                        if (ambVar != null && (tL_theme = ambVar.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = ambVar.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                gn5 c = gn5.c(bc4.w(document.thumbs, nm7.E1, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.A1 = false;
                                imageReceiver.d0(c, "120_140", null, null, null, 1);
                                imageReceiver.h1 = new jq9(this, hf2Var, wallPaper2, (byte) 9);
                                fn5.z().I(imageReceiver, null);
                            }
                        } else if (ambVar != null && ambVar.r == null) {
                            int i18 = (int) (ambVar.p * 100.0f);
                            Drawable drawable2 = hf2Var.b;
                            if (drawable2 instanceof ah7) {
                                ah7 ah7Var6 = (ah7) drawable2;
                                ah7Var6.r(i18, ah7Var6.u);
                            }
                            uf2.s.c(new v99((Object) this, (Object) hf2Var, i18, (byte) 24));
                        }
                    }
                }
                if (!z) {
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                    gm.r(this.K);
                    if (this.I.getImageReceiver().y() != null) {
                        this.I.getImageReceiver().y().stop();
                        this.I.getImageReceiver().y().I(0, false, false);
                    }
                }
                tz3Var2 = this.H.a;
                if (tz3Var2 != null || tz3Var2.l()) {
                    setContentDescription(jb6.M0(2131752154, null));
                }
                fnb fnbVar = this.H.a.c;
                if (fnbVar != null && (str = fnbVar.b) == null) {
                    str = fnbVar.a;
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
        this.I.setVisibility((hf2Var.a.l() || this.U == null) ? 0 : 8);
        if (!z2) {
        }
        if (z) {
        }
        apbVar = this.f;
        hf2Var2 = this.H;
        if (hf2Var2 != null) {
            sz3 sz3Var4 = (sz3) tz3Var.f.get(hf2Var2.c);
            int i72 = sz3Var4.h;
            if (this.V != 0) {
            }
            Paint paint4 = apbVar.c;
            Paint paint22 = apbVar.a;
            Paint paint32 = apbVar.b;
            paint4.setColor(i72);
            paint32.setColor(sz3Var4.i);
            if (!this.H.a.l()) {
            }
            int alpha2 = paint22.getAlpha();
            paint22.setColor(v0);
            paint22.setAlpha(alpha2);
            hf2 hf2Var52 = this.H;
            el5Var = (el5) hf2Var52.a.f.get(hf2Var52.c);
            if (el5Var != null) {
            }
            hf2 hf2Var72 = this.H;
            sz3 sz3Var32 = (sz3) hf2Var72.a.f.get(hf2Var72.c);
            hf2Var3 = this.H;
            if (hf2Var3 != null) {
            }
            apbVar.d = hf2Var4.b;
            invalidate();
        }
        h = hf2Var.a.h(this.W);
        tz3 tz3Var52 = hf2Var.a;
        int i172 = this.W;
        if (h == 0) {
        }
        if (!z) {
        }
        tz3Var2 = this.H.a;
        if (tz3Var2 != null) {
        }
        setContentDescription(jb6.M0(2131752154, null));
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
            ofFloat.addUpdateListener(new rha(this, (byte) 26));
            this.E.addListener(new sw9((byte) 8, this, z));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
        this.P = true;
        a92 a92Var = this.O;
        if (a92Var != null) {
            a92Var.f(this);
        }
        this.Q.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        this.P = false;
        a92 a92Var = this.O;
        if (a92Var != null) {
            a92Var.g(this);
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
            int L = gm.L(b == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i2);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        bf0 bf0Var = this.I;
        bf0Var.setPivotY(bf0Var.getMeasuredHeight());
        bf0Var.setPivotX(bf0Var.getMeasuredWidth() / 2.0f);
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
        int i2 = cmb.h5;
        ylb ylbVar = this.y;
        this.s.setColor(cmb.v0(i2, ylbVar));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(cmb.v0(cmb.Nf, ylbVar));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            hf2 hf2Var = this.H;
            if (hf2Var != null) {
                this.H = null;
                f(hf2Var, 0L, false);
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar = this.y;
        try {
            this.s.setColor(cmb.v0(cmb.h5, ylbVar));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(cmb.v0(cmb.Nf, ylbVar));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
