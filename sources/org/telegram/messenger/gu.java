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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class gu {
    public static final Paint C;
    public final int B;
    public final jv a;
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
    public final kv p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public b80 x;
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
    
        if (org.telegram.ui.r90.q(((org.telegram.tgnet.tl.TL_keyboard.TL_inlineButtonTypeUrl) r21).url) != false) goto L43;
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
    public gu(kv kvVar, int i7, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Boolean bool, Runnable runnable) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i10;
        boolean z14;
        int i11;
        int i12;
        int w02;
        Drawable drawable;
        int w03;
        this.p = kvVar;
        this.B = Math.max(1, i7);
        this.t = runnable;
        this.c = pageButton;
        this.b = z9;
        this.q = z10;
        this.r = z11;
        this.f = z13;
        this.s = z12;
        boolean booleanValue = bool != null ? bool.booleanValue() : kvVar.E();
        if (richButtonStyle != null) {
            org.telegram.ui.ActionBar.c6 c6Var3 = org.telegram.ui.ActionBar.c6.h;
            if (richButtonStyle.bg_primary) {
                c6Var = org.telegram.ui.ActionBar.c6.n;
            } else if (richButtonStyle.bg_danger) {
                c6Var = org.telegram.ui.ActionBar.c6.r;
            } else if (richButtonStyle.bg_success) {
                c6Var = org.telegram.ui.ActionBar.c6.s;
            }
            c6Var2 = org.telegram.ui.ActionBar.c6.h;
            if (c6Var == c6Var2 && z13) {
                c6Var = org.telegram.ui.ActionBar.c6.w;
            }
            org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(!booleanValue ? c6Var.f : c6Var.c, null);
            yzVar.c = !z9 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z12) {
                spannableStringBuilder2.setSpan(yzVar, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new c41("", (vy0) null), 0, spannableStringBuilder2.length(), 33);
            }
            g0.N2(spannableStringBuilder2);
            Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder2, kvVar.w))));
            jv jvVar = new jv(kvVar, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = jvVar;
            jvVar.r = true;
            jvVar.w = true;
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
                this.i = jg.g.h(t0.b, i10);
            }
            this.e = h();
            org.telegram.ui.ActionBar.g6 g6Var = kvVar.D;
            boolean a10 = g6Var == null ? g6Var.a() : org.telegram.ui.ActionBar.l6.I.q();
            if (booleanValue && a10) {
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.rb, kvVar.D);
                int w04 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.sb, kvVar.D);
                int w05 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tb, kvVar.D);
                if (w03 == 0 || w04 != 0 || w05 != 0) {
                    z14 = true;
                    if (z14 && c6Var != org.telegram.ui.ActionBar.c6.n) {
                        c6Var = c6Var2;
                    }
                    i11 = !booleanValue ? c6Var.d : c6Var.a;
                    i12 = !booleanValue ? c6Var.e : c6Var.b;
                    int i13 = !booleanValue ? c6Var.f : c6Var.c;
                    int w06 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
                    this.h = false;
                    if (z14 || c6Var != org.telegram.ui.ActionBar.c6.n) {
                        if (!org.telegram.ui.ActionBar.l6.f1(i11) || c6Var == org.telegram.ui.ActionBar.c6.n) {
                            this.j = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
                            if (org.telegram.ui.ActionBar.l6.f1(i12)) {
                                this.k = i0.a.f(0.1f, this.j, w06);
                            } else {
                                this.k = org.telegram.ui.ActionBar.l6.w0(i12, kvVar.D);
                            }
                        } else {
                            this.j = org.telegram.ui.ActionBar.l6.r1(c6Var == c6Var2 ? 0.08f : 0.1f, org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D));
                            this.k = org.telegram.ui.ActionBar.l6.r1(0.16f, org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D));
                        }
                    } else {
                        int w07 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
                        this.k = w07;
                        this.j = w07;
                        this.h = true;
                    }
                    w02 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
                    w02 = z9 ? org.telegram.ui.ActionBar.l6.r1(0.5f, w02) : w02;
                    if (w02 == this.l || this.m == null) {
                        this.l = w02;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    yzVar.b = i13;
                    runnable.run();
                    drawable = this.i;
                    if (drawable == null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.l, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
            }
            z14 = false;
            if (z14) {
                c6Var = c6Var2;
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w062 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
            this.h = false;
            if (z14) {
            }
            if (org.telegram.ui.ActionBar.l6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
            if (org.telegram.ui.ActionBar.l6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
            if (z9) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            yzVar.b = i13;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        c6Var = org.telegram.ui.ActionBar.c6.h;
        c6Var2 = org.telegram.ui.ActionBar.c6.h;
        if (c6Var == c6Var2) {
            c6Var = org.telegram.ui.ActionBar.c6.w;
        }
        org.telegram.ui.Components.yz yzVar2 = new org.telegram.ui.Components.yz(!booleanValue ? c6Var.f : c6Var.c, null);
        yzVar2.c = !z9 ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z12) {
        }
        g0.N2(spannableStringBuilder22);
        Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder22, kvVar.w))));
        jv jvVar2 = new jv(kvVar, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = jvVar2;
        jvVar2.r = true;
        jvVar2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i10 != 0) {
        }
        this.e = h();
        org.telegram.ui.ActionBar.g6 g6Var2 = kvVar.D;
        if (g6Var2 == null) {
        }
        if (booleanValue) {
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.rb, kvVar.D);
            int w042 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.sb, kvVar.D);
            int w052 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tb, kvVar.D);
            if (w03 == 0) {
            }
            z14 = true;
            if (z14) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w0622 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
            this.h = false;
            if (z14) {
            }
            if (org.telegram.ui.ActionBar.l6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
            if (org.telegram.ui.ActionBar.l6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
            if (z9) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            yzVar2.b = i13;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        z14 = false;
        if (z14) {
        }
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        int w06222 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
        this.h = false;
        if (z14) {
        }
        if (org.telegram.ui.ActionBar.l6.f1(i11)) {
        }
        this.j = org.telegram.ui.ActionBar.l6.w0(i11, kvVar.D);
        if (org.telegram.ui.ActionBar.l6.f1(i12)) {
        }
        w02 = org.telegram.ui.ActionBar.l6.w0(i13, kvVar.D);
        if (z9) {
        }
        if (w02 == this.l) {
        }
        this.l = w02;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        yzVar2.b = i13;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        float f10;
        int i7;
        if (this.u) {
            float f11 = this.v;
            if (f11 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / g0.r) / 100.0f) + f11;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z9 = this.f;
        float f12 = z9 ? 0.09f : 0.04f;
        float f13 = ((1.0f - this.v) * f12) + (1.0f - f12);
        canvas.save();
        if (f13 != 1.0f) {
            canvas.scale(f13, f13, this.e / 2.0f, c() / 2.0f);
        }
        boolean z10 = this.h;
        boolean z11 = this.s;
        boolean z12 = z10 && !z11;
        if (z12) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
        } else {
            int i10 = this.u ? this.k : this.j;
            Paint paint = this.g;
            paint.setColor(i10);
            if (!z11) {
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i11 = i();
        int j3 = j();
        boolean z13 = k() > Math.max(1, j() - i());
        if (z13) {
            canvas2 = canvas;
            canvas2.saveLayer(i11, -g0.L(10.0f), j3, g0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i11, -g0.L(10.0f), j3, g0.L(10.0f) + c());
        canvas2.save();
        jv jvVar = this.a;
        StaticLayout staticLayout = jvVar.b;
        ArrayList arrayList = jvVar.x;
        StaticLayout staticLayout2 = jvVar.b;
        int i12 = jvVar.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z14 = jvVar.s > 0;
        if (z14) {
            canvas2.translate(l() - i12, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(l() - i12, ((c() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        } else if (z9) {
            canvas2.translate(l() - i12, (-lineBaseline) + ((c() * 43) / 56));
        } else {
            canvas2.translate(l() - i12, (-lineBaseline) + ((c() * 65) / qs.n1));
        }
        jvVar.d(canvas2, jvVar.S);
        kv kvVar = this.p;
        if (kvVar.F()) {
            canvas2.translate(0.0f, g0.L(z14 ? 0.0f : z11 ? 0.66f : 2.0f));
            if (z11) {
                int i13 = staticLayout2.getPaint().linkColor;
                if (this.o != i13 || this.n == null) {
                    this.o = i13;
                    this.n = new PorterDuffColorFilter(i13, PorterDuff.Mode.SRC_IN);
                }
                f10 = 2.0f;
                i7 = j3;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.n);
                canvas2 = canvas;
            } else {
                f10 = 2.0f;
                i7 = j3;
                canvas2 = canvas;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, jvVar.b, jvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f10 = 2.0f;
            i7 = j3;
        }
        canvas2.restore();
        if (z13) {
            float c10 = c();
            RectF rectF = this.A;
            rectF.set(i7 - g0.L(8.0f), 0.0f, i7, c10);
            kvVar.z.m(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            bg.s.d(drawable, this.e - g0.L(12.33f), g0.L(z9 ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z12) {
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
        boolean z9 = (pageButton == null || (q1Var = this.p.E) == null || !q1Var.P0(pageButton)) ? false : true;
        boolean z10 = this.y;
        Runnable runnable = this.t;
        if (z10 != z9) {
            this.y = z9;
            if (z9) {
                b80 b80Var = this.x;
                if (b80Var == null) {
                    b80 b80Var2 = new b80();
                    this.x = b80Var2;
                    b80Var2.D = true;
                    b80Var2.x.setStrokeWidth(g0.N(1.25f));
                } else {
                    b80Var.b = -1L;
                    b80Var.c = -1L;
                }
            } else {
                b80 b80Var3 = this.x;
                if (b80Var3 != null) {
                    b80Var3.a();
                }
            }
            runnable.run();
        }
        b80 b80Var4 = this.x;
        if (b80Var4 != null) {
            if (z9 || b80Var4.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f10 = this.e;
                float c10 = c();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f10, c10);
                float f11 = strokeWidth / 2.0f;
                rectF.inset(f11, f11);
                this.x.i((c() / 2.0f) - f11);
                this.x.e(rectF);
                this.x.g(org.telegram.ui.ActionBar.l6.r1(0.07f, this.l), org.telegram.ui.ActionBar.l6.r1(0.175f, this.l), org.telegram.ui.ActionBar.l6.r1(0.175f, this.l), org.telegram.ui.ActionBar.l6.r1(0.42f, this.l));
                this.x.setAlpha(qs.e4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        boolean z9 = this.f;
        kv kvVar = this.p;
        return g0.L(z9 ? kvVar.M * 1.166666f : kvVar.M + 18);
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
        boolean z9 = this.q;
        boolean z10 = this.f;
        if (z9 && z10) {
            return g0.L(4.0f);
        }
        if (z10) {
            return g0.L(7.0f);
        }
        return g0.L(this.i != null ? 26.0f : 20.0f);
    }

    public final int g() {
        if (this.s) {
            return 0;
        }
        boolean z9 = this.r;
        boolean z10 = this.f;
        Drawable drawable = this.i;
        if (z9 && z10) {
            return g0.L((drawable != null ? 14 : 0) + 4);
        }
        if (z10) {
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
        int i7;
        int max;
        if (this.s) {
            return this.e;
        }
        if (this.f) {
            i7 = this.e;
            max = g();
        } else {
            i7 = this.e;
            max = Math.max(g0.L(8.0f), d());
        }
        return i7 - max;
    }

    public final int k() {
        jv jvVar = this.a;
        return jvVar.h - jvVar.f;
    }

    public final float l() {
        return this.f ? f() : k() > Math.max(1, j() - i()) ? i() : this.i == null ? (this.e - k()) / 2.0f : Math.max(Math.min((this.e - k()) / 2.0f, (this.e - d()) - k()), g0.L(8.0f));
    }

    public final void m(boolean z9) {
        if (this.u == z9) {
            return;
        }
        this.u = z9;
        this.t.run();
        if (z9) {
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
            this.w.addListener(new m.a(this, 7));
            ValueAnimator valueAnimator2 = this.w;
            boolean z10 = this.f;
            valueAnimator2.setInterpolator(new OvershootInterpolator(z10 ? 3.5f : 2.0f));
            this.w.setDuration(z10 ? 420L : 350L);
            this.w.start();
        }
    }
}
