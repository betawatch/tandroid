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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class yz0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public uo H;
    public final k9 I;
    public final int J;
    public sp0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.zm O;
    public boolean P;
    public final ImageReceiver Q;
    public u8 R;
    public final org.telegram.ui.ActionBar.t4 S;
    public final org.telegram.ui.ActionBar.t4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public xz0 f;
    public xz0 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final org.telegram.ui.ActionBar.e6 y;

    public yz0(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(8.0f);
        this.b = org.telegram.messenger.g0.L(6.0f);
        this.c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.e = org.telegram.messenger.g0.L(41.0f);
        this.f = new xz0(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.t4(0, false, false, null);
        this.L = i10;
        this.J = i3;
        this.y = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, this, e6Var);
        k9 k9Var = new k9(context);
        this.I = k9Var;
        k9Var.getImageReceiver().B0 = true;
        k9Var.getImageReceiver().v0 = false;
        k9Var.getImageReceiver().W(0);
        if (i10 == 0 || i10 == 3 || i10 == 2) {
            addView(k9Var, b8.mf.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(k9Var, b8.mf.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        TextPaint textPaint = new TextPaint(org.telegram.messenger.hs.N1);
        this.F = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, this.y));
        this.F.setTextSize(org.telegram.messenger.g0.L(c()));
        this.F.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i3 = this.L;
        if (i3 == 3 || i3 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = lu0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.bd.M0(2131752217, null);
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
            sp0 sp0Var = new sp0(this, 16);
            this.K = sp0Var;
            org.telegram.messenger.g0.i3(sp0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xz0 xz0Var;
        xz0 xz0Var2;
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
        if (this.n != 1.0f && (xz0Var2 = this.h) != null) {
            xz0Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (xz0Var = this.h) != null) {
            xz0Var.a(canvas, 1.0f);
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
    /* JADX WARN: Removed duplicated region for block: B:61:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(uo uoVar, long j10, boolean z10) {
        long j11;
        uo uoVar2;
        long j12;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.p3 p3Var;
        Drawable drawable;
        int i3;
        int i10;
        int i11;
        int i12;
        la0 la0Var;
        org.telegram.ui.ActionBar.p3 p3Var2;
        org.telegram.ui.zm zmVar;
        org.telegram.ui.zm zmVar2;
        boolean z11 = this.H != uoVar;
        int i13 = this.W;
        int i14 = uoVar.c;
        boolean z12 = i13 != i14;
        this.W = i14;
        this.H = uoVar;
        TLRPC.Document e10 = uoVar.a.e();
        org.telegram.ui.ActionBar.p3 p3Var3 = uoVar.a;
        if (p3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l10 = (Long) org.telegram.messenger.d4.f(p3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) p3Var3.d).gift.slug);
            if (l10 != null) {
                j11 = l10.longValue();
                this.V = j11;
                if (j10 == j11) {
                    this.V = 0L;
                }
                String str = null;
                if (this.V == 0) {
                    if (this.R == null) {
                        this.R = new u8((org.telegram.ui.ActionBar.e6) null);
                    }
                    TLObject e22 = org.telegram.messenger.hp.s1(this.J).e2(this.V);
                    this.R.p(e22);
                    this.Q.i0(e22, this.R, null);
                } else {
                    this.Q.f();
                }
                if (z11) {
                    sp0 sp0Var = this.K;
                    if (sp0Var != null) {
                        org.telegram.messenger.g0.r(sp0Var);
                        this.K = null;
                    }
                    this.I.animate().cancel();
                    this.I.setScaleX(1.0f);
                    this.I.setScaleY(1.0f);
                }
                if (z11) {
                    Drawable f10 = e10 != null ? org.telegram.messenger.t5.f(e10, org.telegram.ui.ActionBar.k6.c7, 0.2f, null) : null;
                    if (f10 == null) {
                        org.telegram.messenger.i6.k(uoVar.a.e);
                        f10 = org.telegram.messenger.i6.g(uoVar.a.e);
                    }
                    this.I.j(org.telegram.messenger.ac.b(e10), "50_50", f10, null);
                    uoVar.a.getClass();
                    TLRPC.WallPaper wallPaper = this.U;
                    if (wallPaper != null) {
                        if (this.P && (zmVar2 = this.O) != null) {
                            zmVar2.g(this);
                        }
                        org.telegram.ui.zm zmVar3 = new org.telegram.ui.zm(wallPaper, false, true);
                        this.O = zmVar3;
                        zmVar3.b = this;
                        la0 la0Var2 = zmVar3.f;
                        if (la0Var2 != null) {
                            la0Var2.q(this);
                        }
                        if (this.P) {
                            this.O.f(this);
                        }
                    } else {
                        if (this.P && (zmVar = this.O) != null) {
                            zmVar.g(this);
                        }
                        this.O = null;
                    }
                }
                this.I.setVisibility((uoVar.a.l() || this.U == null) ? 0 : 8);
                if (!z11 || z12) {
                    if (z10) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new xz0(this);
                        invalidate();
                    }
                    xz0 xz0Var = this.f;
                    uoVar2 = this.H;
                    if (uoVar2 != null || (p3Var = uoVar2.a) == null) {
                        j12 = 0;
                    } else {
                        org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) p3Var.f.get(uoVar2.c);
                        int i15 = o3Var.h;
                        if (this.V != 0) {
                            i15 = o3Var.k;
                        }
                        Paint paint = xz0Var.c;
                        Paint paint2 = xz0Var.a;
                        Paint paint3 = xz0Var.b;
                        paint.setColor(i15);
                        paint3.setColor(o3Var.i);
                        int w02 = this.H.a.l() ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.y) : o3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(w02);
                        paint2.setAlpha(alpha);
                        uo uoVar3 = this.H;
                        jg.a aVar = (jg.a) uoVar3.a.f.get(uoVar3.c);
                        if (aVar != null) {
                            org.telegram.ui.ActionBar.o3 o3Var2 = (org.telegram.ui.ActionBar.o3) aVar;
                            if (o3Var2.a() != 0) {
                                uo uoVar4 = this.H;
                                int i16 = ((org.telegram.ui.ActionBar.o3) uoVar4.a.f.get(uoVar4.c)).d;
                                ArrayList<Integer> arrayList = o3Var2.b(i16).message_colors;
                                if (arrayList.size() > 1) {
                                    int[] iArr = new int[arrayList.size()];
                                    for (int i17 = 0; i17 != arrayList.size(); i17++) {
                                        iArr[i17] = arrayList.get(i17).intValue() | (-16777216);
                                    }
                                    float L = this.c + org.telegram.messenger.g0.L(8.0f);
                                    paint3.setShader(new LinearGradient(0.0f, L, 0.0f, L + this.d, iArr, (float[]) null, Shader.TileMode.CLAMP));
                                } else {
                                    paint3.setShader(null);
                                }
                                paint3.setAlpha(org.telegram.messenger.hs.e4);
                                if (this.H != null) {
                                    if (i16 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = o3Var2.b(i16).wallpaper.settings;
                                        int i18 = wallPaperSettings.background_color;
                                        int i19 = wallPaperSettings.second_background_color;
                                        int i20 = wallPaperSettings.third_background_color;
                                        i12 = wallPaperSettings.fourth_background_color;
                                        i3 = i18;
                                        i10 = i19;
                                        i11 = i20;
                                    } else {
                                        i3 = 0;
                                        i10 = 0;
                                        i11 = 0;
                                        i12 = 0;
                                    }
                                    if (i10 != 0) {
                                        la0Var = new la0(true, i3, i10, i11, i12);
                                        this.M = la0Var.f();
                                    } else {
                                        la0 la0Var3 = new la0(true, i3, i3, i3, i3);
                                        this.M = -16777216;
                                        la0Var = la0Var3;
                                    }
                                    this.H.b = la0Var;
                                }
                                j12 = 0;
                                xz0Var.d = this.H.b;
                                invalidate();
                            }
                        }
                        uo uoVar5 = this.H;
                        org.telegram.ui.ActionBar.o3 o3Var3 = (org.telegram.ui.ActionBar.o3) uoVar5.a.f.get(uoVar5.c);
                        if (this.H != null) {
                            int i21 = o3Var3.k;
                            int i22 = o3Var3.l;
                            int i23 = o3Var3.m;
                            int i24 = o3Var3.n;
                            int i25 = o3Var3.o;
                            j12 = 0;
                            if (o3Var3.a.k(false) != null) {
                                if (i22 != 0) {
                                    la0 la0Var4 = new la0(i21, i22, i23, i24, true, i25, false);
                                    this.M = la0Var4.f();
                                    drawable = la0Var4;
                                } else {
                                    Drawable la0Var5 = new la0(i21, i21, i21, i21, true, i25, false);
                                    this.M = -16777216;
                                    drawable = la0Var5;
                                }
                            } else if (i21 != 0 && i22 != 0) {
                                drawable = new la0(i21, i22, i23, i24, true, i25, false);
                            } else if (i21 != 0) {
                                drawable = new ColorDrawable(i21);
                            } else {
                                org.telegram.ui.ActionBar.j6 j6Var = o3Var3.a;
                                if (j6Var == null || (j6Var.Q <= 0 && j6Var.c == null)) {
                                    org.telegram.ui.ActionBar.p3 p3Var4 = this.H.a;
                                    if (p3Var4 == null || !p3Var4.l()) {
                                        drawable = new la0(true, -2368069, -9722489, -2762611, -7817084);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = org.telegram.messenger.g0.L(112.0f);
                                    float L3 = org.telegram.messenger.g0.L(134.0f);
                                    org.telegram.ui.ActionBar.j6 j6Var2 = o3Var3.a;
                                    Bitmap e12 = org.telegram.messenger.g0.e1(L2, L3, j6Var2.c, j6Var2.b, j6Var2.Q);
                                    if (e12 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(e12);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            this.H.b = drawable;
                            xz0Var.d = this.H.b;
                            invalidate();
                        }
                        j12 = 0;
                        xz0Var.d = this.H.b;
                        invalidate();
                    }
                    h = uoVar.a.h(this.W);
                    if (h == j12) {
                        TLRPC.WallPaper j13 = uoVar.a.j(this.W);
                        if (j13 != null) {
                            uoVar.a.p(this.W, new ii.o1(j13.settings.intensity, 4, h, this, uoVar));
                        }
                    } else {
                        SparseArray sparseArray = uoVar.a.i(this.W).b0;
                        org.telegram.ui.ActionBar.g6 g6Var = sparseArray != null ? (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.o3) uoVar.a.f.get(this.W)).e) : null;
                        if (g6Var != null && (tL_theme = g6Var.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = g6Var.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 120, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.A1 = false;
                                imageReceiver.q0(c2, "120_140", null, null, null, 1);
                                imageReceiver.h1 = new hr(this, uoVar, wallPaper2, 5);
                                org.telegram.messenger.zb.D().M(imageReceiver, null);
                            }
                        } else if (g6Var != null && g6Var.r == null) {
                            int i26 = (int) (g6Var.p * 100.0f);
                            Drawable drawable2 = uoVar.b;
                            if (drawable2 instanceof la0) {
                                la0 la0Var6 = (la0) drawable2;
                                la0Var6.s(la0Var6.u, i26);
                            }
                            org.telegram.messenger.d4.s.c(new org.telegram.ui.f4(this, uoVar, i26, 27));
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
                p3Var2 = this.H.a;
                if (p3Var2 != null || p3Var2.l()) {
                    setContentDescription(org.telegram.messenger.bd.M0(2131752217, null));
                }
                jg.b bVar = this.H.a.c;
                if (bVar != null && (str = bVar.b) == null) {
                    str = bVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j11 = 0;
        this.V = j11;
        if (j10 == j11) {
        }
        String str2 = null;
        if (this.V == 0) {
        }
        if (z11) {
        }
        if (z11) {
        }
        this.I.setVisibility((uoVar.a.l() || this.U == null) ? 0 : 8);
        if (!z11) {
        }
        if (z10) {
        }
        xz0 xz0Var2 = this.f;
        uoVar2 = this.H;
        if (uoVar2 != null) {
        }
        j12 = 0;
        h = uoVar.a.h(this.W);
        if (h == j12) {
        }
        if (!z10) {
        }
        p3Var2 = this.H.a;
        if (p3Var2 != null) {
        }
        setContentDescription(org.telegram.messenger.bd.M0(2131752217, null));
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
            ofFloat.addUpdateListener(new y50(this, 26));
            this.E.addListener(new s9(20, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        this.P = true;
        org.telegram.ui.zm zmVar = this.O;
        if (zmVar != null) {
            zmVar.f(this);
        }
        this.Q.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        this.P = false;
        org.telegram.ui.zm zmVar = this.O;
        if (zmVar != null) {
            zmVar.g(this);
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
    public final void onMeasure(int i3, int i10) {
        int i11 = this.L;
        if (i11 == 1 || i11 == 4) {
            int size = View.MeasureSpec.getSize(i3);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * 1.2f), TLObject.FLAG_30));
        } else {
            int L = org.telegram.messenger.g0.L(i11 == 0 ? 77.0f : 83.0f);
            int size2 = View.MeasureSpec.getSize(i10);
            if (size2 == 0) {
                size2 = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        k9 k9Var = this.I;
        k9Var.setPivotY(k9Var.getMeasuredHeight());
        k9Var.setPivotX(k9Var.getMeasuredWidth() / 2.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.c;
        RectF rectF = this.w;
        rectF.set(f10, f10, i3 - f10, i10 - f10);
        Path path = this.x;
        path.reset();
        float f11 = this.b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        int i10 = org.telegram.ui.ActionBar.k6.i5;
        org.telegram.ui.ActionBar.e6 e6Var = this.y;
        this.s.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, e6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            uo uoVar = this.H;
            if (uoVar != null) {
                this.H = null;
                f(uoVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.y;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, e6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
