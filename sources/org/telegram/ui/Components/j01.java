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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class j01 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public kp H;
    public final q9 I;
    public final int J;
    public ap0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.en O;
    public boolean P;
    public final ImageReceiver Q;
    public b9 R;
    public final org.telegram.ui.ActionBar.v4 S;
    public final org.telegram.ui.ActionBar.v4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public i01 f;
    public i01 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final org.telegram.ui.ActionBar.i6 y;

    public j01(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(8.0f);
        this.b = org.telegram.messenger.g0.L(6.0f);
        this.c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.e = org.telegram.messenger.g0.L(41.0f);
        this.f = new i01(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new org.telegram.ui.ActionBar.v4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.v4(0, false, false, null);
        this.L = i10;
        this.J = i7;
        this.y = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.i5, this, i6Var);
        q9 q9Var = new q9(context);
        this.I = q9Var;
        q9Var.getImageReceiver().B0 = true;
        q9Var.getImageReceiver().v0 = false;
        q9Var.getImageReceiver().W(0);
        if (i10 == 0 || i10 == 3 || i10 == 2) {
            addView(q9Var, c8.ma.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(q9Var, c8.ma.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(org.telegram.messenger.g0.L(120.0f) / bitmap.getWidth(), org.telegram.messenger.g0.L(140.0f) / bitmap.getHeight());
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
        TextPaint textPaint = new TextPaint(org.telegram.messenger.ks.N1);
        this.F = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, this.y));
        this.F.setTextSize(org.telegram.messenger.g0.L(c()));
        this.F.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i7 = this.L;
        if (i7 == 3 || i7 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = wu0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.gd.M0(2131752206, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().B().l0) {
                this.I.getImageReceiver().B().N(0, true, false);
                this.I.getImageReceiver().B().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            ap0 ap0Var = new ap0(this, 17);
            this.K = ap0Var;
            org.telegram.messenger.g0.h3(ap0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i01 i01Var;
        i01 i01Var2;
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
        if (this.n != 1.0f && (i01Var2 = this.h) != null) {
            i01Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (i01Var = this.h) != null) {
            i01Var.a(canvas, 1.0f);
        }
        float f11 = this.n;
        if (f11 != 0.0f) {
            this.f.a(canvas, f11);
        }
        float f12 = this.n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.n = f13;
            if (f13 >= 1.0f) {
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
    /* JADX WARN: Removed duplicated region for block: B:61:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(kp kpVar, long j3, boolean z10) {
        long j10;
        kp kpVar2;
        long j11;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.t3 t3Var;
        Drawable drawable;
        int i7;
        int i10;
        int i11;
        int i12;
        bb0 bb0Var;
        org.telegram.ui.ActionBar.t3 t3Var2;
        org.telegram.ui.en enVar;
        org.telegram.ui.en enVar2;
        int i13 = 0;
        boolean z11 = this.H != kpVar;
        int i14 = this.W;
        int i15 = kpVar.c;
        boolean z12 = i14 != i15;
        this.W = i15;
        this.H = kpVar;
        TLRPC.Document e10 = kpVar.a.e();
        org.telegram.ui.ActionBar.t3 t3Var3 = kpVar.a;
        if (t3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l10 = (Long) org.telegram.messenger.f4.f(t3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) t3Var3.d).gift.slug);
            if (l10 != null) {
                j10 = l10.longValue();
                this.V = j10;
                if (j3 == j10) {
                    this.V = 0L;
                }
                String str = null;
                if (this.V == 0) {
                    if (this.R == null) {
                        this.R = new b9((org.telegram.ui.ActionBar.i6) null);
                    }
                    TLObject g22 = org.telegram.messenger.mp.u1(this.J).g2(this.V);
                    this.R.p(g22);
                    this.Q.i0(g22, this.R, null);
                } else {
                    this.Q.f();
                }
                if (z11) {
                    ap0 ap0Var = this.K;
                    if (ap0Var != null) {
                        org.telegram.messenger.g0.r(ap0Var);
                        this.K = null;
                    }
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                }
                if (z11) {
                    Drawable f10 = e10 != null ? org.telegram.messenger.u5.f(e10, org.telegram.ui.ActionBar.n6.c7, 0.2f, null) : null;
                    if (f10 == null) {
                        org.telegram.messenger.j6.k(kpVar.a.e);
                        f10 = org.telegram.messenger.j6.g(kpVar.a.e);
                    }
                    this.I.j(org.telegram.messenger.fc.b(e10), "50_50", f10, null);
                    kpVar.a.getClass();
                    TLRPC.WallPaper wallPaper = this.U;
                    if (wallPaper != null) {
                        if (this.P && (enVar2 = this.O) != null) {
                            enVar2.g(this);
                        }
                        org.telegram.ui.en enVar3 = new org.telegram.ui.en(wallPaper, false, true);
                        this.O = enVar3;
                        enVar3.b = this;
                        bb0 bb0Var2 = enVar3.f;
                        if (bb0Var2 != null) {
                            bb0Var2.q(this);
                        }
                        if (this.P) {
                            this.O.f(this);
                        }
                    } else {
                        if (this.P && (enVar = this.O) != null) {
                            enVar.g(this);
                        }
                        this.O = null;
                    }
                }
                this.I.setVisibility((kpVar.a.l() || this.U == null) ? 0 : 8);
                if (!z11 || z12) {
                    if (z10) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new i01(this);
                        invalidate();
                    }
                    i01 i01Var = this.f;
                    kpVar2 = this.H;
                    if (kpVar2 != null || (t3Var = kpVar2.a) == null) {
                        j11 = 0;
                    } else {
                        org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) t3Var.f.get(kpVar2.c);
                        int i16 = s3Var.h;
                        if (this.V != 0) {
                            i16 = s3Var.k;
                        }
                        Paint paint = i01Var.c;
                        Paint paint2 = i01Var.a;
                        Paint paint3 = i01Var.b;
                        paint.setColor(i16);
                        paint3.setColor(s3Var.i);
                        int w02 = this.H.a.l() ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.y) : s3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(w02);
                        paint2.setAlpha(alpha);
                        kp kpVar3 = this.H;
                        ig.a aVar = (ig.a) kpVar3.a.f.get(kpVar3.c);
                        if (aVar != null) {
                            org.telegram.ui.ActionBar.s3 s3Var2 = (org.telegram.ui.ActionBar.s3) aVar;
                            if (s3Var2.a() != 0) {
                                kp kpVar4 = this.H;
                                int i17 = ((org.telegram.ui.ActionBar.s3) kpVar4.a.f.get(kpVar4.c)).d;
                                ArrayList<Integer> arrayList = s3Var2.b(i17).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i18 = 0; i18 != arrayList.size(); i18++) {
                                        iArr[i18] = arrayList.get(i18).intValue() | (-16777216);
                                    }
                                    float L = this.c + org.telegram.messenger.g0.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(org.telegram.messenger.ks.e4);
                                if (this.H != null) {
                                    if (i17 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = s3Var2.b(i17).wallpaper.settings;
                                        int i19 = wallPaperSettings.background_color;
                                        int i20 = wallPaperSettings.second_background_color;
                                        int i21 = wallPaperSettings.third_background_color;
                                        i12 = wallPaperSettings.fourth_background_color;
                                        i7 = i19;
                                        i10 = i20;
                                        i11 = i21;
                                    } else {
                                        i7 = 0;
                                        i10 = 0;
                                        i11 = 0;
                                        i12 = 0;
                                    }
                                    if (i10 != 0) {
                                        bb0Var = new bb0(true, i7, i10, i11, i12);
                                        this.M = bb0Var.f();
                                    } else {
                                        bb0 bb0Var3 = new bb0(true, i7, i7, i7, i7);
                                        this.M = -16777216;
                                        bb0Var = bb0Var3;
                                    }
                                    this.H.b = bb0Var;
                                }
                                j11 = 0;
                                i01Var.d = this.H.b;
                                invalidate();
                            }
                        }
                        kp kpVar5 = this.H;
                        org.telegram.ui.ActionBar.s3 s3Var3 = (org.telegram.ui.ActionBar.s3) kpVar5.a.f.get(kpVar5.c);
                        if (this.H != null) {
                            int i22 = s3Var3.k;
                            int i23 = s3Var3.l;
                            int i24 = s3Var3.m;
                            int i25 = s3Var3.n;
                            int i26 = s3Var3.o;
                            j11 = 0;
                            if (s3Var3.a.k(false) != null) {
                                if (i23 != 0) {
                                    bb0 bb0Var4 = new bb0(i22, i23, i24, i25, true, i26, false);
                                    this.M = bb0Var4.f();
                                    drawable = bb0Var4;
                                } else {
                                    Drawable bb0Var5 = new bb0(i22, i22, i22, i22, true, i26, false);
                                    this.M = -16777216;
                                    drawable = bb0Var5;
                                }
                            } else if (i22 != 0 && i23 != 0) {
                                drawable = new bb0(i22, i23, i24, i25, true, i26, false);
                            } else if (i22 != 0) {
                                drawable = new ColorDrawable(i22);
                            } else {
                                org.telegram.ui.ActionBar.m6 m6Var = s3Var3.a;
                                if (m6Var == null || (m6Var.Q <= 0 && m6Var.c == null)) {
                                    org.telegram.ui.ActionBar.t3 t3Var4 = this.H.a;
                                    if (t3Var4 == null || !t3Var4.l()) {
                                        drawable = new bb0(true, -2368069, -9722489, -2762611, -7817084);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = org.telegram.messenger.g0.L(112.0f);
                                    float L3 = org.telegram.messenger.g0.L(134.0f);
                                    org.telegram.ui.ActionBar.m6 m6Var2 = s3Var3.a;
                                    Bitmap e12 = org.telegram.messenger.g0.e1(L2, L3, m6Var2.c, m6Var2.b, m6Var2.Q);
                                    if (e12 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(e12);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            this.H.b = drawable;
                            i01Var.d = this.H.b;
                            invalidate();
                        }
                        j11 = 0;
                        i01Var.d = this.H.b;
                        invalidate();
                    }
                    h = kpVar.a.h(this.W);
                    if (h == j11) {
                        TLRPC.WallPaper j12 = kpVar.a.j(this.W);
                        if (j12 != null) {
                            kpVar.a.p(this.W, new ki.m1(j12.settings.intensity, 3, h, this, kpVar));
                        }
                    } else {
                        SparseArray sparseArray = kpVar.a.i(this.W).b0;
                        org.telegram.ui.ActionBar.k6 k6Var = sparseArray != null ? (org.telegram.ui.ActionBar.k6) sparseArray.get(((org.telegram.ui.ActionBar.s3) kpVar.a.f.get(this.W)).e) : null;
                        if (k6Var != null && (tL_theme = k6Var.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = k6Var.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 120, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.A1 = false;
                                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                                imageReceiver.h1 = new rm(this, kpVar, wallPaper2, 6);
                                org.telegram.messenger.ec.D().M(imageReceiver, null);
                            }
                        } else if (k6Var != null && k6Var.r == null) {
                            int i27 = (int) (k6Var.p * 100.0f);
                            Drawable drawable2 = kpVar.b;
                            if (drawable2 instanceof bb0) {
                                bb0 bb0Var6 = (bb0) drawable2;
                                bb0Var6.s(i27, bb0Var6.u);
                            }
                            org.telegram.messenger.f4.s.c(new h01(this, kpVar, i27, i13));
                        }
                    }
                }
                if (!z10) {
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                    org.telegram.messenger.g0.r(this.K);
                    if (this.I.getImageReceiver().B() != null) {
                        this.I.getImageReceiver().B().stop();
                        this.I.getImageReceiver().B().N(0, false, false);
                    }
                }
                t3Var2 = this.H.a;
                if (t3Var2 != null || t3Var2.l()) {
                    setContentDescription(org.telegram.messenger.gd.M0(2131752206, null));
                }
                ig.b bVar = this.H.a.c;
                if (bVar != null && (str = bVar.b) == null) {
                    str = bVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j10 = 0;
        this.V = j10;
        if (j3 == j10) {
        }
        String str2 = null;
        if (this.V == 0) {
        }
        if (z11) {
        }
        if (z11) {
        }
        this.I.setVisibility((kpVar.a.l() || this.U == null) ? 0 : 8);
        if (!z11) {
        }
        if (z10) {
        }
        i01 i01Var2 = this.f;
        kpVar2 = this.H;
        if (kpVar2 != null) {
        }
        j11 = 0;
        h = kpVar.a.h(this.W);
        if (h == j11) {
        }
        if (!z10) {
        }
        t3Var2 = this.H.a;
        if (t3Var2 != null) {
        }
        setContentDescription(org.telegram.messenger.gd.M0(2131752206, null));
    }

    public final void g(boolean z10, boolean z11) {
        if (!z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z10;
            this.N = z10 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.a0 != z10) {
            float f10 = this.N;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new e60(this, 27));
            this.E.addListener(new org.telegram.ui.on(21, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        this.P = true;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.f(this);
        }
        this.Q.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        this.P = false;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.g(this);
        }
        this.Q.R();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.a0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.L;
        if (i11 == 1 || i11 == 4) {
            int size = View.MeasureSpec.getSize(i7);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int L = org.telegram.messenger.g0.L(i11 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i10);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        q9 q9Var = this.I;
        q9Var.setPivotY(q9Var.getMeasuredHeight());
        q9Var.setPivotX(q9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.c;
        RectF rectF = this.w;
        rectF.set(f10, f10, i7 - f10, i10 - f10);
        Path path = this.x;
        path.reset();
        float f11 = this.b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        int i10 = org.telegram.ui.ActionBar.n6.i5;
        org.telegram.ui.ActionBar.i6 i6Var = this.y;
        this.s.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, i6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            kp kpVar = this.H;
            if (kpVar != null) {
                this.H = null;
                f(kpVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.y;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i5, i6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, i6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
