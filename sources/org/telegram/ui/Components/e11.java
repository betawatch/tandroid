package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class e11 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public ValueAnimator D;
    public TextPaint E;
    public StaticLayout F;
    public cp G;
    public final g9 H;
    public final int I;
    public uo0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.xn N;
    public boolean O;
    public final ImageReceiver P;
    public r8 Q;
    public final org.telegram.ui.ActionBar.c5 R;
    public final org.telegram.ui.ActionBar.c5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public d11 f;
    public d11 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final org.telegram.ui.ActionBar.p6 y;

    public e11(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = org.telegram.messenger.i0.L(8.0f);
        this.b = org.telegram.messenger.i0.L(6.0f);
        this.c = org.telegram.messenger.i0.L(4.0f);
        this.d = org.telegram.messenger.i0.L(21.0f);
        this.e = org.telegram.messenger.i0.L(41.0f);
        this.f = new d11(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.R = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.c5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.y = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.i5, this, p6Var);
        g9 g9Var = new g9(context);
        this.H = g9Var;
        g9Var.getImageReceiver().A0 = true;
        g9Var.getImageReceiver().u0 = false;
        g9Var.getImageReceiver().W(0);
        if (i11 == 0 || i11 == 3 || i11 == 2) {
            addView(g9Var, w7.b6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(g9Var, w7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(org.telegram.messenger.i0.L(120.0f) / bitmap.getWidth(), org.telegram.messenger.i0.L(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || Math.abs(max - 1.0f) < 0.0125f) {
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * max);
        int height = (int) (bitmap.getHeight() * max);
        return (height <= 0 || width <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, height, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(org.telegram.messenger.zs.N1);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, this.y));
        this.E.setTextSize(org.telegram.messenger.i0.L(c()));
        this.E.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(52.0f);
        int i10 = this.K;
        if (i10 == 3 || i10 == 4) {
            L = org.telegram.messenger.i0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = ov0.d(b10, textPaint2, true, L, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.cd.L0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().B() != null) {
            org.telegram.messenger.i0.r(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().B().k0) {
                this.H.getImageReceiver().B().N(0, true, false);
                this.H.getImageReceiver().B().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.i0.H).start();
            uo0 uo0Var = new uo0(this, 19);
            this.J = uo0Var;
            org.telegram.messenger.i0.h3(uo0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d11 d11Var;
        d11 d11Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.x);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (d11Var2 = this.h) != null) {
            d11Var2.b(canvas, 1.0f);
        }
        float f7 = this.n;
        if (f7 != 0.0f) {
            this.f.b(canvas, f7);
        }
        if (this.n != 1.0f && (d11Var = this.h) != null) {
            d11Var.a(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.a(canvas, f10);
        }
        float f11 = this.n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.n = f12;
            if (f12 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(cp cpVar, long j10, boolean z10) {
        long j11;
        cp cpVar2;
        long j12;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.y3 y3Var;
        Drawable drawable;
        int i10;
        int i11;
        int i12;
        int i13;
        jb0 jb0Var;
        org.telegram.ui.ActionBar.y3 y3Var2;
        org.telegram.ui.xn xnVar;
        org.telegram.ui.xn xnVar2;
        boolean z11 = this.G != cpVar;
        int i14 = this.V;
        int i15 = cpVar.c;
        boolean z12 = i14 != i15;
        this.V = i15;
        this.G = cpVar;
        TLRPC.Document e = cpVar.a.e();
        org.telegram.ui.ActionBar.y3 y3Var3 = cpVar.a;
        if (y3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l4 = (Long) org.telegram.messenger.g4.f(y3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) y3Var3.d).gift.slug);
            if (l4 != null) {
                j11 = l4.longValue();
                this.U = j11;
                if (j10 == j11) {
                    this.U = 0L;
                }
                String str = null;
                if (this.U == 0) {
                    if (this.Q == null) {
                        this.Q = new r8((org.telegram.ui.ActionBar.p6) null);
                    }
                    TLObject d22 = org.telegram.messenger.vp.r1(this.I).d2(this.U);
                    this.Q.p(d22);
                    this.P.i0(d22, this.Q, null);
                } else {
                    this.P.f();
                }
                if (z11) {
                    uo0 uo0Var = this.J;
                    if (uo0Var != null) {
                        org.telegram.messenger.i0.r(uo0Var);
                        this.J = null;
                    }
                    this.H.animate().cancel();
                    this.H.setScaleX(1.0f);
                    this.H.setScaleY(1.0f);
                }
                if (z11) {
                    Drawable f7 = e != null ? org.telegram.messenger.v5.f(e, org.telegram.ui.ActionBar.t6.c7, 0.2f, null) : null;
                    if (f7 == null) {
                        org.telegram.messenger.k6.k(cpVar.a.e);
                        f7 = org.telegram.messenger.k6.g(cpVar.a.e);
                    }
                    this.H.j(org.telegram.messenger.ic.b(e), "50_50", f7, null);
                    cpVar.a.getClass();
                    TLRPC.WallPaper wallPaper = this.T;
                    if (wallPaper != null) {
                        if (this.O && (xnVar2 = this.N) != null) {
                            xnVar2.g(this);
                        }
                        org.telegram.ui.xn xnVar3 = new org.telegram.ui.xn(wallPaper, false, true);
                        this.N = xnVar3;
                        xnVar3.b = this;
                        jb0 jb0Var2 = xnVar3.f;
                        if (jb0Var2 != null) {
                            jb0Var2.q(this);
                        }
                        if (this.O) {
                            this.N.f(this);
                        }
                    } else {
                        if (this.O && (xnVar = this.N) != null) {
                            xnVar.g(this);
                        }
                        this.N = null;
                    }
                }
                this.H.setVisibility((cpVar.a.l() || this.T == null) ? 0 : 8);
                if (!z11 || z12) {
                    if (z10) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new d11(this);
                        invalidate();
                    }
                    d11 d11Var = this.f;
                    cpVar2 = this.G;
                    if (cpVar2 != null || (y3Var = cpVar2.a) == null) {
                        j12 = 0;
                    } else {
                        org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) y3Var.f.get(cpVar2.c);
                        int i16 = x3Var.h;
                        if (this.U != 0) {
                            i16 = x3Var.k;
                        }
                        Paint paint = d11Var.c;
                        Paint paint2 = d11Var.a;
                        Paint paint3 = d11Var.b;
                        paint.setColor(i16);
                        paint3.setColor(x3Var.i);
                        int w02 = this.G.a.l() ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.y) : x3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(w02);
                        paint2.setAlpha(alpha);
                        cp cpVar3 = this.G;
                        yf.a aVar = (yf.a) cpVar3.a.f.get(cpVar3.c);
                        if (aVar != null) {
                            org.telegram.ui.ActionBar.x3 x3Var2 = (org.telegram.ui.ActionBar.x3) aVar;
                            if (x3Var2.a() != 0) {
                                cp cpVar4 = this.G;
                                int i17 = ((org.telegram.ui.ActionBar.x3) cpVar4.a.f.get(cpVar4.c)).d;
                                ArrayList<Integer> arrayList = x3Var2.b(i17).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i18 = 0; i18 != arrayList.size(); i18++) {
                                        iArr[i18] = arrayList.get(i18).intValue() | (-16777216);
                                    }
                                    float L = this.c + org.telegram.messenger.i0.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(org.telegram.messenger.zs.e4);
                                if (this.G != null) {
                                    if (i17 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = x3Var2.b(i17).wallpaper.settings;
                                        int i19 = wallPaperSettings.background_color;
                                        int i20 = wallPaperSettings.second_background_color;
                                        int i21 = wallPaperSettings.third_background_color;
                                        i13 = wallPaperSettings.fourth_background_color;
                                        i10 = i19;
                                        i11 = i20;
                                        i12 = i21;
                                    } else {
                                        i10 = 0;
                                        i11 = 0;
                                        i12 = 0;
                                        i13 = 0;
                                    }
                                    if (i11 != 0) {
                                        jb0Var = new jb0(true, i10, i11, i12, i13);
                                        this.L = jb0Var.f();
                                    } else {
                                        jb0 jb0Var3 = new jb0(true, i10, i10, i10, i10);
                                        this.L = -16777216;
                                        jb0Var = jb0Var3;
                                    }
                                    this.G.b = jb0Var;
                                }
                                j12 = 0;
                                d11Var.d = this.G.b;
                                invalidate();
                            }
                        }
                        cp cpVar5 = this.G;
                        org.telegram.ui.ActionBar.x3 x3Var3 = (org.telegram.ui.ActionBar.x3) cpVar5.a.f.get(cpVar5.c);
                        if (this.G != null) {
                            int i22 = x3Var3.k;
                            int i23 = x3Var3.l;
                            int i24 = x3Var3.m;
                            int i25 = x3Var3.n;
                            int i26 = x3Var3.o;
                            j12 = 0;
                            if (x3Var3.a.k(false) != null) {
                                if (i23 != 0) {
                                    jb0 jb0Var4 = new jb0(i22, i23, i24, i25, true, i26, false);
                                    this.L = jb0Var4.f();
                                    drawable = jb0Var4;
                                } else {
                                    Drawable jb0Var5 = new jb0(i22, i22, i22, i22, true, i26, false);
                                    this.L = -16777216;
                                    drawable = jb0Var5;
                                }
                            } else if (i22 != 0 && i23 != 0) {
                                drawable = new jb0(i22, i23, i24, i25, true, i26, false);
                            } else if (i22 != 0) {
                                drawable = new ColorDrawable(i22);
                            } else {
                                org.telegram.ui.ActionBar.s6 s6Var = x3Var3.a;
                                if (s6Var == null || (s6Var.P <= 0 && s6Var.c == null)) {
                                    org.telegram.ui.ActionBar.y3 y3Var4 = this.G.a;
                                    if (y3Var4 == null || !y3Var4.l()) {
                                        drawable = new jb0(true, -2368069, -9722489, -2762611, -7817084);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = org.telegram.messenger.i0.L(112.0f);
                                    float L3 = org.telegram.messenger.i0.L(134.0f);
                                    org.telegram.ui.ActionBar.s6 s6Var2 = x3Var3.a;
                                    Bitmap e12 = org.telegram.messenger.i0.e1(L2, L3, s6Var2.c, s6Var2.b, s6Var2.P);
                                    if (e12 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(e12);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            this.G.b = drawable;
                            d11Var.d = this.G.b;
                            invalidate();
                        }
                        j12 = 0;
                        d11Var.d = this.G.b;
                        invalidate();
                    }
                    h = cpVar.a.h(this.V);
                    if (h == j12) {
                        TLRPC.WallPaper j13 = cpVar.a.j(this.V);
                        if (j13 != null) {
                            cpVar.a.p(this.V, new di.a(j13.settings.intensity, 2, h, this, cpVar));
                        }
                    } else {
                        SparseArray sparseArray = cpVar.a.i(this.V).a0;
                        org.telegram.ui.ActionBar.r6 r6Var = sparseArray != null ? (org.telegram.ui.ActionBar.r6) sparseArray.get(((org.telegram.ui.ActionBar.x3) cpVar.a.f.get(this.V)).e) : null;
                        if (r6Var != null && (tL_theme = r6Var.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = r6Var.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                org.telegram.messenger.ic c10 = org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 120, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.z1 = false;
                                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                                imageReceiver.g1 = new androidx.car.app.utils.a(this, cpVar, wallPaper2, 27);
                                org.telegram.messenger.hc.D().M(imageReceiver, null);
                            }
                        } else if (r6Var != null && r6Var.r == null) {
                            int i27 = (int) (r6Var.p * 100.0f);
                            Drawable drawable2 = cpVar.b;
                            if (drawable2 instanceof jb0) {
                                jb0 jb0Var6 = (jb0) drawable2;
                                jb0Var6.s(jb0Var6.u, i27);
                            }
                            org.telegram.messenger.g4.s.c(new ji0(this, cpVar, i27, 13));
                        }
                    }
                }
                if (!z10) {
                    this.H.animate().cancel();
                    this.H.setScaleX(1.0f);
                    this.H.setScaleY(1.0f);
                    org.telegram.messenger.i0.r(this.J);
                    if (this.H.getImageReceiver().B() != null) {
                        this.H.getImageReceiver().B().stop();
                        this.H.getImageReceiver().B().N(0, false, false);
                    }
                }
                y3Var2 = this.G.a;
                if (y3Var2 != null || y3Var2.l()) {
                    setContentDescription(org.telegram.messenger.cd.L0(2131752217, null));
                }
                yf.b bVar = this.G.a.c;
                if (bVar != null && (str = bVar.b) == null) {
                    str = bVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j11 = 0;
        this.U = j11;
        if (j10 == j11) {
        }
        String str2 = null;
        if (this.U == 0) {
        }
        if (z11) {
        }
        if (z11) {
        }
        this.H.setVisibility((cpVar.a.l() || this.T == null) ? 0 : 8);
        if (!z11) {
        }
        if (z10) {
        }
        d11 d11Var2 = this.f;
        cpVar2 = this.G;
        if (cpVar2 != null) {
        }
        j12 = 0;
        h = cpVar.a.h(this.V);
        if (h == j12) {
        }
        if (!z10) {
        }
        y3Var2 = this.G.a;
        if (y3Var2 != null) {
        }
        setContentDescription(org.telegram.messenger.cd.L0(2131752217, null));
    }

    public final void g(boolean z10, boolean z11) {
        if (!z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            this.M = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.W != z10) {
            float f7 = this.M;
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 26));
            this.D.addListener(new ha0(6, this, z10));
            this.D.setDuration(250L);
            this.D.start();
        }
        this.W = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        this.O = true;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.f(this);
        }
        this.P.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        this.O = false;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.g(this);
        }
        this.P.R();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.W);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.K;
        if (i12 == 1 || i12 == 4) {
            int size = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int L = org.telegram.messenger.i0.L(i12 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i11);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        g9 g9Var = this.H;
        g9Var.setPivotY(g9Var.getMeasuredHeight());
        g9Var.setPivotX(g9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.c;
        RectF rectF = this.w;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.x;
        path.reset();
        float f10 = this.b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.t6.i5;
        org.telegram.ui.ActionBar.p6 p6Var = this.y;
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, p6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            cp cpVar = this.G;
            if (cpVar != null) {
                this.G = null;
                f(cpVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.y;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i5, p6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
