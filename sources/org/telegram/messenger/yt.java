package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yt {
    public static final Paint C;
    public final int B;
    public final bv a;
    public final boolean b;
    public final TL_keyboard.PageButton c;
    public int d;
    public int e;
    public final boolean f;
    public final boolean h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final int l;
    public final PorterDuffColorFilter m;
    public PorterDuffColorFilter n;
    public int o;
    public final cv p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public w70 x;
    public boolean y;
    public final Paint g = new Paint(1);
    public final RectF z = new RectF();
    public final RectF A = new RectF();

    static {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint = new Paint();
        C = paint;
        paint.setXfermode(porterDuffXfermode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f6, code lost:
    
        if (org.telegram.ui.m90.q(((org.telegram.tgnet.tl.TL_keyboard.TL_inlineButtonTypeUrl) r21).url) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yt(cv cvVar, int i3, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, Runnable runnable) {
        org.telegram.ui.ActionBar.a6 a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int w02;
        Drawable drawable;
        int w03;
        this.p = cvVar;
        this.B = Math.max(1, i3);
        this.t = runnable;
        this.c = pageButton;
        this.b = z10;
        this.q = z11;
        this.r = z12;
        this.f = z14;
        this.s = z13;
        boolean booleanValue = bool != null ? bool.booleanValue() : cvVar.E();
        if (richButtonStyle != null) {
            org.telegram.ui.ActionBar.a6 a6Var3 = org.telegram.ui.ActionBar.a6.h;
            if (richButtonStyle.bg_primary) {
                a6Var = org.telegram.ui.ActionBar.a6.n;
            } else if (richButtonStyle.bg_danger) {
                a6Var = org.telegram.ui.ActionBar.a6.r;
            } else if (richButtonStyle.bg_success) {
                a6Var = org.telegram.ui.ActionBar.a6.s;
            }
            a6Var2 = org.telegram.ui.ActionBar.a6.h;
            if (a6Var == a6Var2 && z14) {
                a6Var = org.telegram.ui.ActionBar.a6.w;
            }
            org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(!booleanValue ? a6Var.f : a6Var.c, null);
            tzVar.c = !z10 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z13) {
                spannableStringBuilder2.setSpan(tzVar, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new v31("", (ty0) null), 0, spannableStringBuilder2.length(), 33);
            }
            g0.N2(spannableStringBuilder2);
            Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder2, cvVar.w))));
            bv bvVar = new bv(cvVar, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = bvVar;
            bvVar.r = true;
            bvVar.w = true;
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth)) {
                    if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl)) {
                        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView)) {
                            i10 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline ? R.drawable.mini_inline_switch_16 : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy ? R.drawable.bot_card : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? R.drawable.mini_inline_profile_16 : 0;
                        }
                    }
                    i10 = R.drawable.bot_webview;
                }
                i10 = R.drawable.mini_inline_arrow_16;
            } else {
                i10 = R.drawable.mini_inline_copy_16;
            }
            if (i10 != 0) {
                this.i = k2.p1.g(t0.b, i10);
            }
            this.e = h();
            org.telegram.ui.ActionBar.e6 e6Var = cvVar.D;
            boolean a10 = e6Var == null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
            if (booleanValue && a10) {
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.rb, cvVar.D);
                int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.sb, cvVar.D);
                int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tb, cvVar.D);
                if (w03 == 0 || w04 != 0 || w05 != 0) {
                    z15 = true;
                    if (z15 && a6Var != org.telegram.ui.ActionBar.a6.n) {
                        a6Var = a6Var2;
                    }
                    i11 = !booleanValue ? a6Var.d : a6Var.a;
                    i12 = !booleanValue ? a6Var.e : a6Var.b;
                    int i13 = !booleanValue ? a6Var.f : a6Var.c;
                    int w06 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
                    this.h = false;
                    if (z15 || a6Var != org.telegram.ui.ActionBar.a6.n) {
                        if (!org.telegram.ui.ActionBar.k6.f1(i11) || a6Var == org.telegram.ui.ActionBar.a6.n) {
                            this.j = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
                            if (org.telegram.ui.ActionBar.k6.f1(i12)) {
                                this.k = i0.a.f(0.1f, this.j, w06);
                            } else {
                                this.k = org.telegram.ui.ActionBar.k6.w0(i12, cvVar.D);
                            }
                        } else {
                            this.j = org.telegram.ui.ActionBar.k6.r1(a6Var == a6Var2 ? 0.08f : 0.1f, org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D));
                            this.k = org.telegram.ui.ActionBar.k6.r1(0.16f, org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D));
                        }
                    } else {
                        int w07 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
                        this.k = w07;
                        this.j = w07;
                        this.h = true;
                    }
                    w02 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
                    w02 = z10 ? org.telegram.ui.ActionBar.k6.r1(0.5f, w02) : w02;
                    if (w02 == this.l || this.m == null) {
                        this.l = w02;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    tzVar.b = i13;
                    runnable.run();
                    drawable = this.i;
                    if (drawable == null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.l, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
            }
            z15 = false;
            if (z15) {
                a6Var = a6Var2;
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w062 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.k6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
            if (org.telegram.ui.ActionBar.k6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            tzVar.b = i13;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        a6Var = org.telegram.ui.ActionBar.a6.h;
        a6Var2 = org.telegram.ui.ActionBar.a6.h;
        if (a6Var == a6Var2) {
            a6Var = org.telegram.ui.ActionBar.a6.w;
        }
        org.telegram.ui.Components.tz tzVar2 = new org.telegram.ui.Components.tz(!booleanValue ? a6Var.f : a6Var.c, null);
        tzVar2.c = !z10 ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z13) {
        }
        g0.N2(spannableStringBuilder22);
        Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder22, cvVar.w))));
        bv bvVar2 = new bv(cvVar, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = bvVar2;
        bvVar2.r = true;
        bvVar2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i10 != 0) {
        }
        this.e = h();
        org.telegram.ui.ActionBar.e6 e6Var2 = cvVar.D;
        if (e6Var2 == null) {
        }
        if (booleanValue) {
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.rb, cvVar.D);
            int w042 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.sb, cvVar.D);
            int w052 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tb, cvVar.D);
            if (w03 == 0) {
            }
            z15 = true;
            if (z15) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w0622 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.k6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
            if (org.telegram.ui.ActionBar.k6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            tzVar2.b = i13;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        z15 = false;
        if (z15) {
        }
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        int w06222 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
        this.h = false;
        if (z15) {
        }
        if (org.telegram.ui.ActionBar.k6.f1(i11)) {
        }
        this.j = org.telegram.ui.ActionBar.k6.w0(i11, cvVar.D);
        if (org.telegram.ui.ActionBar.k6.f1(i12)) {
        }
        w02 = org.telegram.ui.ActionBar.k6.w0(i13, cvVar.D);
        if (z10) {
        }
        if (w02 == this.l) {
        }
        this.l = w02;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        tzVar2.b = i13;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        float f10;
        int i3;
        if (this.u) {
            float f11 = this.v;
            if (f11 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.r) / 100.0f) + f11;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z10 = this.f;
        float f12 = z10 ? 0.09f : 0.04f;
        float f13 = ((1.0f - this.v) * f12) + (1.0f - f12);
        canvas.save();
        if (f13 != 1.0f) {
            canvas.scale(f13, f13, this.e / 2.0f, c() / 2.0f);
        }
        boolean z11 = this.h;
        boolean z12 = this.s;
        boolean z13 = z11 && !z12;
        if (z13) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
        } else {
            int i10 = this.u ? this.k : this.j;
            Paint paint = this.g;
            paint.setColor(i10);
            if (!z12) {
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i11 = i();
        int j10 = j();
        boolean z14 = k() > Math.max(1, j() - i());
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(i11, -g0.L(10.0f), j10, g0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i11, -g0.L(10.0f), j10, g0.L(10.0f) + c());
        canvas2.save();
        bv bvVar = this.a;
        StaticLayout staticLayout = bvVar.b;
        ArrayList arrayList = bvVar.x;
        StaticLayout staticLayout2 = bvVar.b;
        int i12 = bvVar.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z15 = bvVar.s > 0;
        if (z15) {
            canvas2.translate(l() - i12, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(l() - i12, ((c() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        } else if (z10) {
            canvas2.translate(l() - i12, (-lineBaseline) + ((c() * 43) / 56));
        } else {
            canvas2.translate(l() - i12, (-lineBaseline) + ((c() * 65) / hs.n1));
        }
        bvVar.d(canvas2, bvVar.T);
        cv cvVar = this.p;
        if (cvVar.F()) {
            canvas2.translate(0.0f, g0.L(z15 ? 0.0f : z12 ? 0.66f : 2.0f));
            if (z12) {
                int i13 = staticLayout2.getPaint().linkColor;
                if (this.o != i13 || this.n == null) {
                    this.o = i13;
                    this.n = new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN);
                }
                f10 = 2.0f;
                i3 = j10;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.n);
                canvas2 = canvas;
            } else {
                f10 = 2.0f;
                i3 = j10;
                canvas2 = canvas;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, bvVar.b, bvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f10 = 2.0f;
            i3 = j10;
        }
        canvas2.restore();
        if (z14) {
            float c2 = c();
            RectF rectF = this.A;
            rectF.set(i3 - g0.L(8.0f), 0.0f, i3, c2);
            cvVar.z.w(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            cg.r.d(drawable, this.e - g0.L(12.33f), g0.L(z10 ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z13) {
            int i14 = this.u ? this.k : this.j;
            Paint paint2 = C;
            paint2.setColor(i14);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / f10, c() / f10, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.c;
        boolean z10 = (pageButton == null || (q1Var = this.p.E) == null || !q1Var.P0(pageButton)) ? false : true;
        boolean z11 = this.y;
        Runnable runnable = this.t;
        if (z11 != z10) {
            this.y = z10;
            if (z10) {
                w70 w70Var = this.x;
                if (w70Var == null) {
                    w70 w70Var2 = new w70();
                    this.x = w70Var2;
                    w70Var2.D = true;
                    w70Var2.x.setStrokeWidth(g0.N(1.25f));
                } else {
                    w70Var.b = -1L;
                    w70Var.c = -1L;
                }
            } else {
                w70 w70Var3 = this.x;
                if (w70Var3 != null) {
                    w70Var3.a();
                }
            }
            runnable.run();
        }
        w70 w70Var4 = this.x;
        if (w70Var4 != null) {
            if (z10 || w70Var4.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f10 = this.e;
                float c2 = c();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f10, c2);
                float f11 = strokeWidth / 2.0f;
                rectF.inset(f11, f11);
                this.x.i((c() / 2.0f) - f11);
                this.x.e(rectF);
                this.x.g(org.telegram.ui.ActionBar.k6.r1(0.07f, this.l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.l), org.telegram.ui.ActionBar.k6.r1(0.175f, this.l), org.telegram.ui.ActionBar.k6.r1(0.42f, this.l));
                this.x.setAlpha(hs.e4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        boolean z10 = this.f;
        cv cvVar = this.p;
        return g0.L(z10 ? cvVar.M * 1.166666f : cvVar.M + 18);
    }

    public final int d() {
        if (this.i == null) {
            return 0;
        }
        return (g0.L(11.66f) / 2) + g0.L(12.33f);
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        if (this.s) {
            return 0;
        }
        boolean z10 = this.q;
        boolean z11 = this.f;
        if (z10 && z11) {
            return g0.L(4.0f);
        }
        if (z11) {
            return g0.L(7.0f);
        }
        return g0.L(this.i != null ? 26.0f : 20.0f);
    }

    public final int g() {
        if (this.s) {
            return 0;
        }
        boolean z10 = this.r;
        boolean z11 = this.f;
        Drawable drawable = this.i;
        if (z10 && z11) {
            return g0.L((drawable != null ? 14 : 0) + 4);
        }
        if (z11) {
            return g0.L((drawable != null ? 14 : 0) + 7);
        }
        return g0.L(drawable != null ? 26.0f : 20.0f);
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.s) {
            return 0;
        }
        return this.f ? f() : g0.L(8.0f);
    }

    public final int j() {
        int i3;
        int max;
        if (this.s) {
            return this.e;
        }
        if (this.f) {
            i3 = this.e;
            max = g();
        } else {
            i3 = this.e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i3 - max;
    }

    public final int k() {
        bv bvVar = this.a;
        return bvVar.h - bvVar.f;
    }

    public final float l() {
        return this.f ? f() : k() > Math.max(1, j() - i()) ? i() : this.i == null ? (this.e - k()) / 2.0f : Math.max(Math.min((this.e - k()) / 2.0f, (this.e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z10) {
        if (this.u == z10) {
            return;
        }
        this.u = z10;
        this.t.run();
        if (z10) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w.cancel();
                this.w = null;
                return;
            }
            return;
        }
        float f10 = this.v;
        if (f10 != 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new g(this, 1));
            this.w.addListener(new ii.v3(this, 8));
            ValueAnimator valueAnimator2 = this.w;
            boolean z11 = this.f;
            valueAnimator2.setInterpolator(new OvershootInterpolator(z11 ? 3.5f : 2.0f));
            this.w.setDuration(z11 ? 420L : 350L);
            this.w.start();
        }
    }
}
