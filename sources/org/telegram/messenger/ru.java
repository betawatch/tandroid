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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.yz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ru {
    public static final Paint C;
    public final int B;
    public final uv a;
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
    public final vv p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public t80 x;
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
    
        if (org.telegram.ui.ua0.q(((org.telegram.tgnet.tl.TL_keyboard.TL_inlineButtonTypeUrl) r21).url) != false) goto L43;
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
    public ru(vv vvVar, int i10, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, Runnable runnable) {
        org.telegram.ui.ActionBar.l6 l6Var;
        org.telegram.ui.ActionBar.l6 l6Var2;
        int i11;
        boolean z15;
        int i12;
        int i13;
        int w02;
        Drawable drawable;
        int w03;
        this.p = vvVar;
        this.B = Math.max(1, i10);
        this.t = runnable;
        this.c = pageButton;
        this.b = z10;
        this.q = z11;
        this.r = z12;
        this.f = z14;
        this.s = z13;
        boolean booleanValue = bool != null ? bool.booleanValue() : vvVar.E();
        if (richButtonStyle != null) {
            org.telegram.ui.ActionBar.l6 l6Var3 = org.telegram.ui.ActionBar.l6.h;
            if (richButtonStyle.bg_primary) {
                l6Var = org.telegram.ui.ActionBar.l6.n;
            } else if (richButtonStyle.bg_danger) {
                l6Var = org.telegram.ui.ActionBar.l6.r;
            } else if (richButtonStyle.bg_success) {
                l6Var = org.telegram.ui.ActionBar.l6.s;
            }
            l6Var2 = org.telegram.ui.ActionBar.l6.h;
            if (l6Var == l6Var2 && z14) {
                l6Var = org.telegram.ui.ActionBar.l6.w;
            }
            org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(!booleanValue ? l6Var.f : l6Var.c, null);
            l00Var.c = !z10 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z13) {
                spannableStringBuilder2.setSpan(l00Var, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new e51("", (yz0) null), 0, spannableStringBuilder2.length(), 33);
            }
            i0.M2(spannableStringBuilder2);
            Math.max(1, i0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder2, vvVar.w))));
            uv uvVar = new uv(vvVar, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = uvVar;
            uvVar.r = true;
            uvVar.w = true;
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth)) {
                    if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl)) {
                        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView)) {
                            i11 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline ? R.drawable.mini_inline_switch_16 : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy ? R.drawable.bot_card : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? R.drawable.mini_inline_profile_16 : 0;
                        }
                    }
                    i11 = R.drawable.bot_webview;
                }
                i11 = R.drawable.mini_inline_arrow_16;
            } else {
                i11 = R.drawable.mini_inline_copy_16;
            }
            if (i11 != 0) {
                this.i = i0.a.f(w0.b, i11);
            }
            this.e = h();
            org.telegram.ui.ActionBar.p6 p6Var = vvVar.D;
            boolean a2 = p6Var == null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
            if (booleanValue && a2) {
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.rb, vvVar.D);
                int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.sb, vvVar.D);
                int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tb, vvVar.D);
                if (w03 == 0 || w04 != 0 || w05 != 0) {
                    z15 = true;
                    if (z15 && l6Var != org.telegram.ui.ActionBar.l6.n) {
                        l6Var = l6Var2;
                    }
                    i12 = !booleanValue ? l6Var.d : l6Var.a;
                    i13 = !booleanValue ? l6Var.e : l6Var.b;
                    int i14 = !booleanValue ? l6Var.f : l6Var.c;
                    int w06 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
                    this.h = false;
                    if (z15 || l6Var != org.telegram.ui.ActionBar.l6.n) {
                        if (!org.telegram.ui.ActionBar.t6.f1(i12) || l6Var == org.telegram.ui.ActionBar.l6.n) {
                            this.j = org.telegram.ui.ActionBar.t6.w0(i12, vvVar.D);
                            if (org.telegram.ui.ActionBar.t6.f1(i13)) {
                                this.k = i0.b.f(0.1f, this.j, w06);
                            } else {
                                this.k = org.telegram.ui.ActionBar.t6.w0(i13, vvVar.D);
                            }
                        } else {
                            this.j = org.telegram.ui.ActionBar.t6.r1(l6Var == l6Var2 ? 0.08f : 0.1f, org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D));
                            this.k = org.telegram.ui.ActionBar.t6.r1(0.16f, org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D));
                        }
                    } else {
                        int w07 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
                        this.k = w07;
                        this.j = w07;
                        this.h = true;
                    }
                    w02 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
                    w02 = z10 ? org.telegram.ui.ActionBar.t6.r1(0.5f, w02) : w02;
                    if (w02 == this.l || this.m == null) {
                        this.l = w02;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    l00Var.b = i14;
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
                l6Var = l6Var2;
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w062 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.t6.f1(i12)) {
            }
            this.j = org.telegram.ui.ActionBar.t6.w0(i12, vvVar.D);
            if (org.telegram.ui.ActionBar.t6.f1(i13)) {
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            l00Var.b = i14;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        l6Var = org.telegram.ui.ActionBar.l6.h;
        l6Var2 = org.telegram.ui.ActionBar.l6.h;
        if (l6Var == l6Var2) {
            l6Var = org.telegram.ui.ActionBar.l6.w;
        }
        org.telegram.ui.Components.l00 l00Var2 = new org.telegram.ui.Components.l00(!booleanValue ? l6Var.f : l6Var.c, null);
        l00Var2.c = !z10 ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z13) {
        }
        i0.M2(spannableStringBuilder22);
        Math.max(1, i0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder22, vvVar.w))));
        uv uvVar2 = new uv(vvVar, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = uvVar2;
        uvVar2.r = true;
        uvVar2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i11 != 0) {
        }
        this.e = h();
        org.telegram.ui.ActionBar.p6 p6Var2 = vvVar.D;
        if (p6Var2 == null) {
        }
        if (booleanValue) {
            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.rb, vvVar.D);
            int w042 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.sb, vvVar.D);
            int w052 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tb, vvVar.D);
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
            int w0622 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.t6.f1(i12)) {
            }
            this.j = org.telegram.ui.ActionBar.t6.w0(i12, vvVar.D);
            if (org.telegram.ui.ActionBar.t6.f1(i13)) {
            }
            w02 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            l00Var2.b = i14;
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
        int w06222 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
        this.h = false;
        if (z15) {
        }
        if (org.telegram.ui.ActionBar.t6.f1(i12)) {
        }
        this.j = org.telegram.ui.ActionBar.t6.w0(i12, vvVar.D);
        if (org.telegram.ui.ActionBar.t6.f1(i13)) {
        }
        w02 = org.telegram.ui.ActionBar.t6.w0(i14, vvVar.D);
        if (z10) {
        }
        if (w02 == this.l) {
        }
        this.l = w02;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        l00Var2.b = i14;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2;
        float f7;
        int i10;
        if (this.u) {
            float f10 = this.v;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / i0.r) / 100.0f) + f10;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z10 = this.f;
        float f11 = z10 ? 0.09f : 0.04f;
        float f12 = ((1.0f - this.v) * f11) + (1.0f - f11);
        canvas.save();
        if (f12 != 1.0f) {
            canvas.scale(f12, f12, this.e / 2.0f, c() / 2.0f);
        }
        boolean z11 = this.h;
        boolean z12 = this.s;
        boolean z13 = z11 && !z12;
        if (z13) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
        } else {
            int i11 = this.u ? this.k : this.j;
            Paint paint = this.g;
            paint.setColor(i11);
            if (!z12) {
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i12 = i();
        int j10 = j();
        boolean z14 = k() > Math.max(1, j() - i());
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(i12, -i0.L(10.0f), j10, i0.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i12, -i0.L(10.0f), j10, i0.L(10.0f) + c());
        canvas2.save();
        uv uvVar = this.a;
        StaticLayout staticLayout = uvVar.b;
        ArrayList arrayList = uvVar.x;
        StaticLayout staticLayout2 = uvVar.b;
        int i13 = uvVar.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z15 = uvVar.s > 0;
        if (z15) {
            canvas2.translate(l() - i13, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(l() - i13, ((c() - staticLayout2.getHeight()) / 2.0f) - i0.L(1.0f));
        } else if (z10) {
            canvas2.translate(l() - i13, (-lineBaseline) + ((c() * 43) / 56));
        } else {
            canvas2.translate(l() - i13, (-lineBaseline) + ((c() * 65) / zs.n1));
        }
        uvVar.d(canvas2, uvVar.S);
        vv vvVar = this.p;
        if (vvVar.F()) {
            canvas2.translate(0.0f, i0.L(z15 ? 0.0f : z12 ? 0.66f : 2.0f));
            if (z12) {
                int i14 = staticLayout2.getPaint().linkColor;
                if (this.o != i14 || this.n == null) {
                    this.o = i14;
                    this.n = new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN);
                }
                f7 = 2.0f;
                i10 = j10;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, uvVar.b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.n);
                canvas2 = canvas;
            } else {
                f7 = 2.0f;
                i10 = j10;
                canvas2 = canvas;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, uvVar.b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f7 = 2.0f;
            i10 = j10;
        }
        canvas2.restore();
        if (z14) {
            float c10 = c();
            RectF rectF = this.A;
            rectF.set(i10 - i0.L(8.0f), 0.0f, i10, c10);
            vvVar.z.o(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            rf.o.d(drawable, this.e - i0.L(12.33f), i0.L(z10 ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z13) {
            int i15 = this.u ? this.k : this.j;
            Paint paint2 = C;
            paint2.setColor(i15);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / f7, c() / f7, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        TL_keyboard.PageButton pageButton = this.c;
        boolean z10 = (pageButton == null || (q1Var = this.p.E) == null || !q1Var.N0(pageButton)) ? false : true;
        boolean z11 = this.y;
        Runnable runnable = this.t;
        if (z11 != z10) {
            this.y = z10;
            if (z10) {
                t80 t80Var = this.x;
                if (t80Var == null) {
                    t80 t80Var2 = new t80();
                    this.x = t80Var2;
                    t80Var2.D = true;
                    t80Var2.x.setStrokeWidth(i0.N(1.25f));
                } else {
                    t80Var.b = -1L;
                    t80Var.c = -1L;
                }
            } else {
                t80 t80Var3 = this.x;
                if (t80Var3 != null) {
                    t80Var3.a();
                }
            }
            runnable.run();
        }
        t80 t80Var4 = this.x;
        if (t80Var4 != null) {
            if (z10 || t80Var4.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f7 = this.e;
                float c10 = c();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f7, c10);
                float f10 = strokeWidth / 2.0f;
                rectF.inset(f10, f10);
                this.x.i((c() / 2.0f) - f10);
                this.x.e(rectF);
                this.x.g(org.telegram.ui.ActionBar.t6.r1(0.07f, this.l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.l), org.telegram.ui.ActionBar.t6.r1(0.175f, this.l), org.telegram.ui.ActionBar.t6.r1(0.42f, this.l));
                this.x.setAlpha(zs.e4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        boolean z10 = this.f;
        vv vvVar = this.p;
        return i0.L(z10 ? vvVar.M * 1.166666f : vvVar.M + 18);
    }

    public final int d() {
        if (this.i == null) {
            return 0;
        }
        return (i0.L(11.66f) / 2) + i0.L(12.33f);
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
            return i0.L(4.0f);
        }
        if (z11) {
            return i0.L(7.0f);
        }
        return i0.L(this.i != null ? 26.0f : 20.0f);
    }

    public final int g() {
        if (this.s) {
            return 0;
        }
        boolean z10 = this.r;
        boolean z11 = this.f;
        Drawable drawable = this.i;
        if (z10 && z11) {
            return i0.L((drawable != null ? 14 : 0) + 4);
        }
        if (z11) {
            return i0.L((drawable != null ? 14 : 0) + 7);
        }
        return i0.L(drawable != null ? 26.0f : 20.0f);
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.s) {
            return 0;
        }
        return this.f ? f() : i0.L(8.0f);
    }

    public final int j() {
        int i10;
        int max;
        if (this.s) {
            return this.e;
        }
        if (this.f) {
            i10 = this.e;
            max = g();
        } else {
            i10 = this.e;
            max = Math.max(i0.L(8.0f), d());
        }
        return i10 - max;
    }

    public final int k() {
        uv uvVar = this.a;
        return uvVar.h - uvVar.f;
    }

    public final float l() {
        return this.f ? f() : k() > Math.max(1, j() - i()) ? i() : this.i == null ? (this.e - k()) / 2.0f : Math.max(Math.min((this.e - k()) / 2.0f, (this.e - d()) - k()), i0.L(8.0f));
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
        float f7 = this.v;
        if (f7 != 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new g(this, 1));
            this.w.addListener(new bg.e(this, 18));
            ValueAnimator valueAnimator2 = this.w;
            boolean z11 = this.f;
            valueAnimator2.setInterpolator(new OvershootInterpolator(z11 ? 3.5f : 2.0f));
            this.w.setDuration(z11 ? 420L : 350L);
            this.w.start();
        }
    }
}
