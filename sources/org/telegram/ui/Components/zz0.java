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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class zz0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public ValueAnimator D;
    public TextPaint E;
    public StaticLayout F;
    public uo G;
    public final l9 H;
    public final int I;
    public ir0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.dn N;
    public boolean O;
    public final ImageReceiver P;
    public w8 Q;
    public final org.telegram.ui.ActionBar.t4 R;
    public final org.telegram.ui.ActionBar.t4 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public yz0 f;
    public yz0 h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final org.telegram.ui.ActionBar.f6 y;

    public zz0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(8.0f);
        this.b = org.telegram.messenger.g0.L(6.0f);
        this.c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.e = org.telegram.messenger.g0.L(41.0f);
        this.f = new yz0(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.R = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.t4(0, false, false, null);
        this.K = i10;
        this.I = i7;
        this.y = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, this, f6Var);
        l9 l9Var = new l9(context);
        this.H = l9Var;
        l9Var.getImageReceiver().A0 = true;
        l9Var.getImageReceiver().u0 = false;
        l9Var.getImageReceiver().W(0);
        if (i10 == 0 || i10 == 3 || i10 == 2) {
            addView(l9Var, c8.ha.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(l9Var, c8.ha.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(org.telegram.messenger.qs.N1);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, this.y));
        this.E.setTextSize(org.telegram.messenger.g0.L(c()));
        this.E.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i7 = this.K;
        if (i7 == 3 || i7 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = mu0.d(b10, textPaint2, true, L, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.hd.M0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().B().k0) {
                this.H.getImageReceiver().B().N(0, true, false);
                this.H.getImageReceiver().B().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            ir0 ir0Var = new ir0(this, 14);
            this.J = ir0Var;
            org.telegram.messenger.g0.i3(ir0Var, 2500L);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yz0 yz0Var;
        yz0 yz0Var2;
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
        if (this.n != 1.0f && (yz0Var2 = this.h) != null) {
            yz0Var2.b(canvas, 1.0f);
        }
        float f10 = this.n;
        if (f10 != 0.0f) {
            this.f.b(canvas, f10);
        }
        if (this.n != 1.0f && (yz0Var = this.h) != null) {
            yz0Var.a(canvas, 1.0f);
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
    public final void f(uo uoVar, long j3, boolean z9) {
        long j10;
        uo uoVar2;
        long j11;
        long h;
        TLRPC.TL_theme tL_theme;
        TLRPC.Document document;
        org.telegram.ui.ActionBar.r3 r3Var;
        Drawable drawable;
        int i7;
        int i10;
        int i11;
        int i12;
        qa0 qa0Var;
        org.telegram.ui.ActionBar.r3 r3Var2;
        org.telegram.ui.dn dnVar;
        org.telegram.ui.dn dnVar2;
        boolean z10 = this.G != uoVar;
        int i13 = this.V;
        int i14 = uoVar.c;
        boolean z11 = i13 != i14;
        this.V = i14;
        this.G = uoVar;
        TLRPC.Document e10 = uoVar.a.e();
        org.telegram.ui.ActionBar.r3 r3Var3 = uoVar.a;
        if (r3Var3.d instanceof TLRPC.TL_chatThemeUniqueGift) {
            Long l10 = (Long) org.telegram.messenger.d4.f(r3Var3.g).r.get(((TLRPC.TL_chatThemeUniqueGift) r3Var3.d).gift.slug);
            if (l10 != null) {
                j10 = l10.longValue();
                this.U = j10;
                if (j3 == j10) {
                    this.U = 0L;
                }
                String str = null;
                if (this.U == 0) {
                    if (this.Q == null) {
                        this.Q = new w8((org.telegram.ui.ActionBar.f6) null);
                    }
                    TLObject e22 = org.telegram.messenger.qp.s1(this.I).e2(this.U);
                    this.Q.p(e22);
                    this.P.i0(e22, this.Q, null);
                } else {
                    this.P.f();
                }
                if (z10) {
                    ir0 ir0Var = this.J;
                    if (ir0Var != null) {
                        org.telegram.messenger.g0.r(ir0Var);
                        this.J = null;
                    }
                    this.H.animate().cancel();
                    this.H.setScaleX(1.0f);
                    this.H.setScaleY(1.0f);
                }
                if (z10) {
                    Drawable f10 = e10 != null ? org.telegram.messenger.t5.f(e10, org.telegram.ui.ActionBar.k6.c7, 0.2f, null) : null;
                    if (f10 == null) {
                        org.telegram.messenger.i6.k(uoVar.a.e);
                        f10 = org.telegram.messenger.i6.g(uoVar.a.e);
                    }
                    this.H.j(org.telegram.messenger.hc.b(e10), "50_50", f10, null);
                    uoVar.a.getClass();
                    TLRPC.WallPaper wallPaper = this.T;
                    if (wallPaper != null) {
                        if (this.O && (dnVar2 = this.N) != null) {
                            dnVar2.g(this);
                        }
                        org.telegram.ui.dn dnVar3 = new org.telegram.ui.dn(wallPaper, false, true);
                        this.N = dnVar3;
                        dnVar3.b = this;
                        qa0 qa0Var2 = dnVar3.f;
                        if (qa0Var2 != null) {
                            qa0Var2.q(this);
                        }
                        if (this.O) {
                            this.N.f(this);
                        }
                    } else {
                        if (this.O && (dnVar = this.N) != null) {
                            dnVar.g(this);
                        }
                        this.N = null;
                    }
                }
                this.H.setVisibility((uoVar.a.l() || this.T == null) ? 0 : 8);
                if (!z10 || z11) {
                    if (z9) {
                        this.n = 1.0f;
                    } else {
                        this.n = 0.0f;
                        this.h = this.f;
                        this.f = new yz0(this);
                        invalidate();
                    }
                    yz0 yz0Var = this.f;
                    uoVar2 = this.G;
                    if (uoVar2 != null || (r3Var = uoVar2.a) == null) {
                        j11 = 0;
                    } else {
                        org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) r3Var.f.get(uoVar2.c);
                        int i15 = q3Var.h;
                        if (this.U != 0) {
                            i15 = q3Var.k;
                        }
                        Paint paint = yz0Var.c;
                        Paint paint2 = yz0Var.a;
                        Paint paint3 = yz0Var.b;
                        paint.setColor(i15);
                        paint3.setColor(q3Var.i);
                        int w02 = this.G.a.l() ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.y) : q3Var.j;
                        int alpha = paint2.getAlpha();
                        paint2.setColor(w02);
                        paint2.setAlpha(alpha);
                        uo uoVar3 = this.G;
                        ig.a aVar = (ig.a) uoVar3.a.f.get(uoVar3.c);
                        if (aVar != null) {
                            org.telegram.ui.ActionBar.q3 q3Var2 = (org.telegram.ui.ActionBar.q3) aVar;
                            if (q3Var2.a() != 0) {
                                uo uoVar4 = this.G;
                                int i16 = ((org.telegram.ui.ActionBar.q3) uoVar4.a.f.get(uoVar4.c)).d;
                                ArrayList<Integer> arrayList = q3Var2.b(i16).message_colors;
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
                                paint3.setAlpha(org.telegram.messenger.qs.e4);
                                if (this.G != null) {
                                    if (i16 >= 0) {
                                        TLRPC.WallPaperSettings wallPaperSettings = q3Var2.b(i16).wallpaper.settings;
                                        int i18 = wallPaperSettings.background_color;
                                        int i19 = wallPaperSettings.second_background_color;
                                        int i20 = wallPaperSettings.third_background_color;
                                        i12 = wallPaperSettings.fourth_background_color;
                                        i7 = i18;
                                        i10 = i19;
                                        i11 = i20;
                                    } else {
                                        i7 = 0;
                                        i10 = 0;
                                        i11 = 0;
                                        i12 = 0;
                                    }
                                    if (i10 != 0) {
                                        qa0Var = new qa0(true, i7, i10, i11, i12);
                                        this.L = qa0Var.f();
                                    } else {
                                        qa0 qa0Var3 = new qa0(true, i7, i7, i7, i7);
                                        this.L = -16777216;
                                        qa0Var = qa0Var3;
                                    }
                                    this.G.b = qa0Var;
                                }
                                j11 = 0;
                                yz0Var.d = this.G.b;
                                invalidate();
                            }
                        }
                        uo uoVar5 = this.G;
                        org.telegram.ui.ActionBar.q3 q3Var3 = (org.telegram.ui.ActionBar.q3) uoVar5.a.f.get(uoVar5.c);
                        if (this.G != null) {
                            int i21 = q3Var3.k;
                            int i22 = q3Var3.l;
                            int i23 = q3Var3.m;
                            int i24 = q3Var3.n;
                            int i25 = q3Var3.o;
                            j11 = 0;
                            if (q3Var3.a.k(false) != null) {
                                if (i22 != 0) {
                                    qa0 qa0Var4 = new qa0(i21, i22, i23, i24, true, i25, false);
                                    this.L = qa0Var4.f();
                                    drawable = qa0Var4;
                                } else {
                                    Drawable qa0Var5 = new qa0(i21, i21, i21, i21, true, i25, false);
                                    this.L = -16777216;
                                    drawable = qa0Var5;
                                }
                            } else if (i21 != 0 && i22 != 0) {
                                drawable = new qa0(i21, i22, i23, i24, true, i25, false);
                            } else if (i21 != 0) {
                                drawable = new ColorDrawable(i21);
                            } else {
                                org.telegram.ui.ActionBar.j6 j6Var = q3Var3.a;
                                if (j6Var == null || (j6Var.P <= 0 && j6Var.c == null)) {
                                    org.telegram.ui.ActionBar.r3 r3Var4 = this.G.a;
                                    if (r3Var4 == null || !r3Var4.l()) {
                                        drawable = new qa0(true, -2368069, -9722489, -2762611, -7817084);
                                    }
                                    drawable = null;
                                } else {
                                    float L2 = org.telegram.messenger.g0.L(112.0f);
                                    float L3 = org.telegram.messenger.g0.L(134.0f);
                                    org.telegram.ui.ActionBar.j6 j6Var2 = q3Var3.a;
                                    Bitmap e12 = org.telegram.messenger.g0.e1(L2, L3, j6Var2.c, j6Var2.b, j6Var2.P);
                                    if (e12 != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(e12);
                                        bitmapDrawable.setFilterBitmap(true);
                                        drawable = bitmapDrawable;
                                    }
                                    drawable = null;
                                }
                            }
                            this.G.b = drawable;
                            yz0Var.d = this.G.b;
                            invalidate();
                        }
                        j11 = 0;
                        yz0Var.d = this.G.b;
                        invalidate();
                    }
                    h = uoVar.a.h(this.V);
                    if (h == j11) {
                        TLRPC.WallPaper j12 = uoVar.a.j(this.V);
                        if (j12 != null) {
                            uoVar.a.p(this.V, new hi.n1(j12.settings.intensity, 4, h, this, uoVar));
                        }
                    } else {
                        SparseArray sparseArray = uoVar.a.i(this.V).a0;
                        org.telegram.ui.ActionBar.h6 h6Var = sparseArray != null ? (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.q3) uoVar.a.f.get(this.V)).e) : null;
                        if (h6Var != null && (tL_theme = h6Var.r) != null && tL_theme.settings.size() > 0) {
                            TLRPC.WallPaper wallPaper2 = h6Var.r.settings.get(0).wallpaper;
                            if (wallPaper2 != null && (document = wallPaper2.document) != null) {
                                org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 120, false, null, false), document);
                                ImageReceiver imageReceiver = new ImageReceiver(null);
                                imageReceiver.z1 = false;
                                imageReceiver.q0(c10, "120_140", null, null, null, 1);
                                imageReceiver.g1 = new hr(this, uoVar, wallPaper2, 5);
                                org.telegram.messenger.gc.D().M(imageReceiver, null);
                            }
                        } else if (h6Var != null && h6Var.r == null) {
                            int i26 = (int) (h6Var.p * 100.0f);
                            Drawable drawable2 = uoVar.b;
                            if (drawable2 instanceof qa0) {
                                qa0 qa0Var6 = (qa0) drawable2;
                                qa0Var6.s(qa0Var6.u, i26);
                            }
                            org.telegram.messenger.d4.s.c(new org.telegram.ui.q8(this, uoVar, i26, 26));
                        }
                    }
                }
                if (!z9) {
                    this.H.animate().cancel();
                    this.H.setScaleX(1.0f);
                    this.H.setScaleY(1.0f);
                    org.telegram.messenger.g0.r(this.J);
                    if (this.H.getImageReceiver().B() != null) {
                        this.H.getImageReceiver().B().stop();
                        this.H.getImageReceiver().B().N(0, false, false);
                    }
                }
                r3Var2 = this.G.a;
                if (r3Var2 != null || r3Var2.l()) {
                    setContentDescription(org.telegram.messenger.hd.M0(2131752217, null));
                }
                ig.b bVar = this.G.a.c;
                if (bVar != null && (str = bVar.b) == null) {
                    str = bVar.a;
                }
                setContentDescription(str);
                return;
            }
        }
        j10 = 0;
        this.U = j10;
        if (j3 == j10) {
        }
        String str2 = null;
        if (this.U == 0) {
        }
        if (z10) {
        }
        if (z10) {
        }
        this.H.setVisibility((uoVar.a.l() || this.T == null) ? 0 : 8);
        if (!z10) {
        }
        if (z9) {
        }
        yz0 yz0Var2 = this.f;
        uoVar2 = this.G;
        if (uoVar2 != null) {
        }
        j11 = 0;
        h = uoVar.a.h(this.V);
        if (h == j11) {
        }
        if (!z9) {
        }
        r3Var2 = this.G.a;
        if (r3Var2 != null) {
        }
        setContentDescription(org.telegram.messenger.hd.M0(2131752217, null));
    }

    public final void g(boolean z9, boolean z10) {
        if (!z10) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z9;
            this.M = z9 ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        if (this.W != z9) {
            float f10 = this.M;
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 25));
            this.D.addListener(new t9(20, this, z9));
            this.D.setDuration(250L);
            this.D.start();
        }
        this.W = z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        this.O = true;
        org.telegram.ui.dn dnVar = this.N;
        if (dnVar != null) {
            dnVar.f(this);
        }
        this.P.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        this.O = false;
        org.telegram.ui.dn dnVar = this.N;
        if (dnVar != null) {
            dnVar.g(this);
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
    public final void onMeasure(int i7, int i10) {
        int i11 = this.K;
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
        l9 l9Var = this.H;
        l9Var.setPivotY(l9Var.getMeasuredHeight());
        l9Var.setPivotX(l9Var.getMeasuredWidth() / 2.0f);
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
        int i10 = org.telegram.ui.ActionBar.k6.i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        this.s.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            uo uoVar = this.G;
            if (uoVar != null) {
                this.G = null;
                f(uoVar, 0L, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        try {
            this.s.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i5, f6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, f6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
