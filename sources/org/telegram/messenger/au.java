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
import android.view.View;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class au {
    public static final Paint C;
    public final int B;
    public final dv a;
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
    public final ev p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public n80 x;
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
    public au(ev evVar, int i7, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Boolean bool, Runnable runnable) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int w02;
        Drawable drawable;
        int w03;
        this.p = evVar;
        this.B = Math.max(1, i7);
        this.t = runnable;
        this.c = pageButton;
        this.b = z10;
        this.q = z11;
        this.r = z12;
        this.f = z14;
        this.s = z13;
        boolean booleanValue = bool != null ? bool.booleanValue() : evVar.E();
        if (richButtonStyle != null) {
            org.telegram.ui.ActionBar.d6 d6Var3 = org.telegram.ui.ActionBar.d6.h;
            if (richButtonStyle.bg_primary) {
                d6Var = org.telegram.ui.ActionBar.d6.n;
            } else if (richButtonStyle.bg_danger) {
                d6Var = org.telegram.ui.ActionBar.d6.r;
            } else if (richButtonStyle.bg_success) {
                d6Var = org.telegram.ui.ActionBar.d6.s;
            }
            d6Var2 = org.telegram.ui.ActionBar.d6.h;
            if (d6Var == d6Var2 && z14) {
                d6Var = org.telegram.ui.ActionBar.d6.w;
            }
            org.telegram.ui.Components.i00 i00Var = new org.telegram.ui.Components.i00(!booleanValue ? d6Var.f : d6Var.c, null);
            i00Var.c = !z10 ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z13) {
                spannableStringBuilder2.setSpan(i00Var, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new r41("", (ez0) null), 0, spannableStringBuilder2.length(), 33);
            }
            g0.N2(spannableStringBuilder2);
            Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder2, evVar.w))));
            dv dvVar = new dv(evVar, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = dvVar;
            dvVar.r = true;
            dvVar.w = true;
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
                this.i = i5.c.g(t0.b, i10);
            }
            this.e = i();
            org.telegram.ui.ActionBar.i6 i6Var = evVar.D;
            boolean b10 = i6Var == null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
            if (booleanValue && b10) {
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ub, evVar.D);
                int w04 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.vb, evVar.D);
                int w05 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wb, evVar.D);
                if (w03 == 0 || w04 != 0 || w05 != 0) {
                    z15 = true;
                    if (z15 && d6Var != org.telegram.ui.ActionBar.d6.n) {
                        d6Var = d6Var2;
                    }
                    i11 = !booleanValue ? d6Var.d : d6Var.a;
                    i12 = !booleanValue ? d6Var.e : d6Var.b;
                    int i13 = !booleanValue ? d6Var.f : d6Var.c;
                    int w06 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
                    this.h = false;
                    if (z15 || d6Var != org.telegram.ui.ActionBar.d6.n) {
                        if (!org.telegram.ui.ActionBar.n6.f1(i11) || d6Var == org.telegram.ui.ActionBar.d6.n) {
                            this.j = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
                            if (org.telegram.ui.ActionBar.n6.f1(i12)) {
                                this.k = i0.a.f(0.1f, this.j, w06);
                            } else {
                                this.k = org.telegram.ui.ActionBar.n6.w0(i12, evVar.D);
                            }
                        } else {
                            this.j = org.telegram.ui.ActionBar.n6.r1(d6Var == d6Var2 ? 0.08f : 0.1f, org.telegram.ui.ActionBar.n6.w0(i13, evVar.D));
                            this.k = org.telegram.ui.ActionBar.n6.r1(0.16f, org.telegram.ui.ActionBar.n6.w0(i13, evVar.D));
                        }
                    } else {
                        int w07 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
                        this.k = w07;
                        this.j = w07;
                        this.h = true;
                    }
                    w02 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
                    w02 = z10 ? org.telegram.ui.ActionBar.n6.r1(0.5f, w02) : w02;
                    if (w02 == this.l || this.m == null) {
                        this.l = w02;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    i00Var.b = i13;
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
                d6Var = d6Var2;
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            if (!booleanValue) {
            }
            int w062 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.n6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
            if (org.telegram.ui.ActionBar.n6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            i00Var.b = i13;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        d6Var = org.telegram.ui.ActionBar.d6.h;
        d6Var2 = org.telegram.ui.ActionBar.d6.h;
        if (d6Var == d6Var2) {
            d6Var = org.telegram.ui.ActionBar.d6.w;
        }
        org.telegram.ui.Components.i00 i00Var2 = new org.telegram.ui.Components.i00(!booleanValue ? d6Var.f : d6Var.c, null);
        i00Var2.c = !z10 ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z13) {
        }
        g0.N2(spannableStringBuilder22);
        Math.max(1, g0.L(2.0f) + ((int) Math.ceil(Layout.getDesiredWidth(spannableStringBuilder22, evVar.w))));
        dv dvVar2 = new dv(evVar, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = dvVar2;
        dvVar2.r = true;
        dvVar2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i10 != 0) {
        }
        this.e = i();
        org.telegram.ui.ActionBar.i6 i6Var2 = evVar.D;
        if (i6Var2 == null) {
        }
        if (booleanValue) {
            w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ub, evVar.D);
            int w042 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.vb, evVar.D);
            int w052 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wb, evVar.D);
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
            int w0622 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
            this.h = false;
            if (z15) {
            }
            if (org.telegram.ui.ActionBar.n6.f1(i11)) {
            }
            this.j = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
            if (org.telegram.ui.ActionBar.n6.f1(i12)) {
            }
            w02 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
            if (z10) {
            }
            if (w02 == this.l) {
            }
            this.l = w02;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            i00Var2.b = i13;
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
        int w06222 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
        this.h = false;
        if (z15) {
        }
        if (org.telegram.ui.ActionBar.n6.f1(i11)) {
        }
        this.j = org.telegram.ui.ActionBar.n6.w0(i11, evVar.D);
        if (org.telegram.ui.ActionBar.n6.f1(i12)) {
        }
        w02 = org.telegram.ui.ActionBar.n6.w0(i13, evVar.D);
        if (z10) {
        }
        if (w02 == this.l) {
        }
        this.l = w02;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        i00Var2.b = i13;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(View view) {
        this.a.i(view);
    }

    public final void b(Canvas canvas) {
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
        boolean z10 = this.f;
        float f12 = z10 ? 0.09f : 0.04f;
        float f13 = ((1.0f - this.v) * f12) + (1.0f - f12);
        canvas.save();
        if (f13 != 1.0f) {
            canvas.scale(f13, f13, this.e / 2.0f, d() / 2.0f);
        }
        boolean z11 = this.h;
        boolean z12 = this.s;
        boolean z13 = z11 && !z12;
        if (z13) {
            canvas.saveLayer(0.0f, 0.0f, this.e, d(), null);
        } else {
            int i10 = this.u ? this.k : this.j;
            Paint paint = this.g;
            paint.setColor(i10);
            if (!z12) {
                canvas.drawRoundRect(0.0f, 0.0f, this.e, d(), d() / 2.0f, d() / 2.0f, paint);
            }
            c(canvas);
        }
        canvas.save();
        int j3 = j();
        int k10 = k();
        boolean z14 = l() > Math.max(1, k() - j());
        if (z14) {
            canvas2 = canvas;
            canvas2.saveLayer(j3, -g0.L(10.0f), k10, g0.L(10.0f) + d(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(j3, -g0.L(10.0f), k10, g0.L(10.0f) + d());
        canvas2.save();
        dv dvVar = this.a;
        StaticLayout staticLayout = dvVar.b;
        ArrayList arrayList = dvVar.x;
        StaticLayout staticLayout2 = dvVar.b;
        int i11 = dvVar.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z15 = dvVar.s > 0;
        if (z15) {
            canvas2.translate(m() - i11, (d() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(m() - i11, ((d() - staticLayout2.getHeight()) / 2.0f) - g0.L(1.0f));
        } else if (z10) {
            canvas2.translate(m() - i11, (-lineBaseline) + ((d() * 43) / 56));
        } else {
            canvas2.translate(m() - i11, (-lineBaseline) + ((d() * 65) / ks.n1));
        }
        dvVar.d(canvas2, dvVar.T);
        ev evVar = this.p;
        if (evVar.F()) {
            canvas2.translate(0.0f, g0.L(z15 ? 0.0f : z12 ? 0.66f : 2.0f));
            if (z12) {
                int i12 = staticLayout2.getPaint().linkColor;
                if (this.o != i12 || this.n == null) {
                    this.o = i12;
                    this.n = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
                }
                f10 = 2.0f;
                i7 = k10;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.n);
                canvas2 = canvas;
            } else {
                f10 = 2.0f;
                i7 = k10;
                canvas2 = canvas;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, dvVar.b, dvVar.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f10 = 2.0f;
            i7 = k10;
        }
        canvas2.restore();
        if (z14) {
            float d = d();
            RectF rectF = this.A;
            rectF.set(i7 - g0.L(8.0f), 0.0f, i7, d);
            evVar.z.u(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            bg.t.d(drawable, this.e - g0.L(12.33f), g0.L(z10 ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z13) {
            int i13 = this.u ? this.k : this.j;
            Paint paint2 = C;
            paint2.setColor(i13);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, d(), d() / f10, d() / f10, paint2);
            canvas.restore();
            c(canvas);
        }
        canvas.restore();
    }

    public final void c(Canvas canvas) {
        org.telegram.ui.Cells.r1 r1Var;
        TL_keyboard.PageButton pageButton = this.c;
        boolean z10 = (pageButton == null || (r1Var = this.p.E) == null || !r1Var.P0(pageButton)) ? false : true;
        boolean z11 = this.y;
        Runnable runnable = this.t;
        if (z11 != z10) {
            this.y = z10;
            if (z10) {
                n80 n80Var = this.x;
                if (n80Var == null) {
                    n80 n80Var2 = new n80();
                    this.x = n80Var2;
                    n80Var2.D = true;
                    n80Var2.x.setStrokeWidth(g0.N(1.25f));
                } else {
                    n80Var.b = -1L;
                    n80Var.c = -1L;
                }
            } else {
                n80 n80Var3 = this.x;
                if (n80Var3 != null) {
                    n80Var3.a();
                }
            }
            runnable.run();
        }
        n80 n80Var4 = this.x;
        if (n80Var4 != null) {
            if (z10 || n80Var4.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f10 = this.e;
                float d = d();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f10, d);
                float f11 = strokeWidth / 2.0f;
                rectF.inset(f11, f11);
                this.x.i((d() / 2.0f) - f11);
                this.x.e(rectF);
                this.x.g(org.telegram.ui.ActionBar.n6.r1(0.07f, this.l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.l), org.telegram.ui.ActionBar.n6.r1(0.175f, this.l), org.telegram.ui.ActionBar.n6.r1(0.42f, this.l));
                this.x.setAlpha(ks.e4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int d() {
        boolean z10 = this.f;
        ev evVar = this.p;
        return g0.L(z10 ? evVar.M * 1.166666f : evVar.M + 18);
    }

    public final int e() {
        if (this.i == null) {
            return 0;
        }
        return (g0.L(11.66f) / 2) + g0.L(12.33f);
    }

    public final int f() {
        return Math.min(i(), e() + d());
    }

    public final int g() {
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

    public final int h() {
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

    public final int i() {
        return Math.min(this.B, h() + g() + l());
    }

    public final int j() {
        if (this.s) {
            return 0;
        }
        return this.f ? g() : g0.L(8.0f);
    }

    public final int k() {
        int i7;
        int max;
        if (this.s) {
            return this.e;
        }
        if (this.f) {
            i7 = this.e;
            max = h();
        } else {
            i7 = this.e;
            max = Math.max(g0.L(8.0f), e());
        }
        return i7 - max;
    }

    public final int l() {
        dv dvVar = this.a;
        return dvVar.h - dvVar.f;
    }

    public final float m() {
        return this.f ? g() : l() > Math.max(1, k() - j()) ? j() : this.i == null ? (this.e - l()) / 2.0f : Math.max(Math.min((this.e - l()) / 2.0f, (this.e - e()) - l()), g0.L(8.0f));
    }

    public final void n(boolean z10) {
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
            this.w.addListener(new ki.n3(this, 8));
            ValueAnimator valueAnimator2 = this.w;
            boolean z11 = this.f;
            valueAnimator2.setInterpolator(new OvershootInterpolator(z11 ? 3.5f : 2.0f));
            this.w.setDuration(z11 ? 420L : 350L);
            this.w.start();
        }
    }
}
