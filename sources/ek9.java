// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ek9 {
    public static final Paint C;
    public final int B;
    public final gl9 a;
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
    public final hl9 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Runnable t;
    public boolean u;
    public float v;
    public ValueAnimator w;
    public va6 x;
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

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e3, code lost:
    
        if (e66.q(((org.telegram.tgnet.tl.TL_keyboard.TL_inlineButtonTypeUrl) r21).url) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ek9(hl9 hl9Var, int i, SpannableStringBuilder spannableStringBuilder, TL_keyboard.PageButton pageButton, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, Runnable runnable) {
        tnb tnbVar;
        tnb tnbVar2;
        int i2;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int v0;
        Drawable drawable;
        int v02;
        this.p = hl9Var;
        this.B = Math.max(1, i);
        this.t = runnable;
        this.c = pageButton;
        this.b = z;
        this.q = z2;
        this.r = z3;
        this.f = z5;
        this.s = z4;
        boolean booleanValue = bool != null ? bool.booleanValue() : hl9Var.D();
        tnb tnbVar3 = tnb.h;
        if (richButtonStyle != null) {
            if (richButtonStyle.bg_primary) {
                tnbVar = tnb.n;
            } else if (richButtonStyle.bg_danger) {
                tnbVar = tnb.r;
            } else if (richButtonStyle.bg_success) {
                tnbVar = tnb.s;
            }
            tnbVar2 = tnb.h;
            if (tnbVar == tnbVar2 && z5) {
                tnbVar = tnb.w;
            }
            ho4 ho4Var = new ho4(!booleanValue ? tnbVar.f : tnbVar.c, null);
            ho4Var.c = !z ? 0.5f : 1.0f;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (z4) {
                spannableStringBuilder2.setSpan(ho4Var, 0, spannableStringBuilder2.length(), 33);
            } else {
                spannableStringBuilder2.setSpan(new f8c("", (rmb) null), 0, spannableStringBuilder2.length(), 33);
            }
            hl.J2(spannableStringBuilder2);
            Layout.getDesiredWidth(spannableStringBuilder2, hl9Var.w);
            gl9 gl9Var = new gl9(hl9Var, spannableStringBuilder2, 100000, Layout.Alignment.ALIGN_CENTER);
            this.a = gl9Var;
            gl9Var.r = true;
            gl9Var.w = true;
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth)) {
                    if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl)) {
                        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeWebView)) {
                            i2 = inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeSwitchInline ? R.drawable.mini_inline_switch_16 : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeBuy ? R.drawable.bot_card : inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? R.drawable.mini_inline_profile_16 : 0;
                        }
                    }
                    i2 = R.drawable.bot_webview;
                }
                i2 = R.drawable.mini_inline_arrow_16;
            } else {
                i2 = R.drawable.mini_inline_copy_16;
            }
            if (i2 != 0) {
                this.i = c00.e(a.b, i2);
            }
            this.e = h();
            vnb vnbVar = hl9Var.D;
            boolean a = vnbVar == null ? vnbVar.a() : aob.I.o();
            if (booleanValue && a) {
                v02 = aob.v0(aob.ub, hl9Var.D);
                int v03 = aob.v0(aob.vb, hl9Var.D);
                int v04 = aob.v0(aob.wb, hl9Var.D);
                if (v02 == 0 || v03 != 0 || v04 != 0) {
                    z6 = true;
                    if (z6 && tnbVar != tnb.n) {
                        tnbVar = tnbVar2;
                    }
                    i3 = !booleanValue ? tnbVar.d : tnbVar.a;
                    if (booleanValue) {
                        i4 = tnbVar.b;
                        i5 = tnbVar.c;
                    } else {
                        i4 = tnbVar.e;
                        i5 = tnbVar.f;
                    }
                    int v05 = aob.v0(i5, hl9Var.D);
                    this.h = false;
                    if (z6 || tnbVar != tnb.n) {
                        if (!aob.d1(i3) || tnbVar == tnb.n) {
                            this.j = aob.v0(i3, hl9Var.D);
                            if (aob.d1(i4)) {
                                this.k = vm2.f(0.1f, this.j, v05);
                            } else {
                                this.k = aob.v0(i4, hl9Var.D);
                            }
                        } else {
                            this.j = aob.p1(tnbVar == tnbVar2 ? 0.08f : 0.1f, aob.v0(i5, hl9Var.D));
                            this.k = aob.p1(0.16f, aob.v0(i5, hl9Var.D));
                        }
                    } else {
                        int v06 = aob.v0(i5, hl9Var.D);
                        this.k = v06;
                        this.j = v06;
                        this.h = true;
                    }
                    v0 = aob.v0(i5, hl9Var.D);
                    v0 = z ? aob.p1(0.5f, v0) : v0;
                    if (v0 == this.l || this.m == null) {
                        this.l = v0;
                        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
                    }
                    ho4Var.b = i5;
                    runnable.run();
                    drawable = this.i;
                    if (drawable == null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.l, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
            }
            z6 = false;
            if (z6) {
                tnbVar = tnbVar2;
            }
            if (!booleanValue) {
            }
            if (booleanValue) {
            }
            int v052 = aob.v0(i5, hl9Var.D);
            this.h = false;
            if (z6) {
            }
            if (aob.d1(i3)) {
            }
            this.j = aob.v0(i3, hl9Var.D);
            if (aob.d1(i4)) {
            }
            v0 = aob.v0(i5, hl9Var.D);
            if (z) {
            }
            if (v0 == this.l) {
            }
            this.l = v0;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            ho4Var.b = i5;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        tnbVar = tnb.h;
        tnbVar2 = tnb.h;
        if (tnbVar == tnbVar2) {
            tnbVar = tnb.w;
        }
        ho4 ho4Var2 = new ho4(!booleanValue ? tnbVar.f : tnbVar.c, null);
        ho4Var2.c = !z ? 0.5f : 1.0f;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(spannableStringBuilder);
        if (z4) {
        }
        hl.J2(spannableStringBuilder22);
        Layout.getDesiredWidth(spannableStringBuilder22, hl9Var.w);
        gl9 gl9Var2 = new gl9(hl9Var, spannableStringBuilder22, 100000, Layout.Alignment.ALIGN_CENTER);
        this.a = gl9Var2;
        gl9Var2.r = true;
        gl9Var2.w = true;
        if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
        }
        if (i2 != 0) {
        }
        this.e = h();
        vnb vnbVar2 = hl9Var.D;
        if (vnbVar2 == null) {
        }
        if (booleanValue) {
            v02 = aob.v0(aob.ub, hl9Var.D);
            int v032 = aob.v0(aob.vb, hl9Var.D);
            int v042 = aob.v0(aob.wb, hl9Var.D);
            if (v02 == 0) {
            }
            z6 = true;
            if (z6) {
            }
            if (!booleanValue) {
            }
            if (booleanValue) {
            }
            int v0522 = aob.v0(i5, hl9Var.D);
            this.h = false;
            if (z6) {
            }
            if (aob.d1(i3)) {
            }
            this.j = aob.v0(i3, hl9Var.D);
            if (aob.d1(i4)) {
            }
            v0 = aob.v0(i5, hl9Var.D);
            if (z) {
            }
            if (v0 == this.l) {
            }
            this.l = v0;
            this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
            ho4Var2.b = i5;
            runnable.run();
            drawable = this.i;
            if (drawable == null) {
            }
        }
        z6 = false;
        if (z6) {
        }
        if (!booleanValue) {
        }
        if (booleanValue) {
        }
        int v05222 = aob.v0(i5, hl9Var.D);
        this.h = false;
        if (z6) {
        }
        if (aob.d1(i3)) {
        }
        this.j = aob.v0(i3, hl9Var.D);
        if (aob.d1(i4)) {
        }
        v0 = aob.v0(i5, hl9Var.D);
        if (z) {
        }
        if (v0 == this.l) {
        }
        this.l = v0;
        this.m = new PorterDuffColorFilter(this.l, PorterDuff.Mode.SRC_IN);
        ho4Var2.b = i5;
        runnable.run();
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Canvas canvas2;
        float f;
        int i5;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.u) {
            float f2 = this.v;
            if (f2 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / hl.r) / 100.0f) + f2;
                this.v = min;
                this.v = Utilities.i(min, 1.0f, 0.0f);
                this.t.run();
            }
        }
        boolean z = this.f;
        float f3 = z ? 0.09f : 0.04f;
        float f4 = ((1.0f - this.v) * f3) + (1.0f - f3);
        canvas.save();
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, this.e / 2.0f, c() / 2.0f);
        }
        boolean z2 = this.h;
        boolean z3 = this.s;
        boolean z4 = z2 && !z3;
        int i6 = this.j;
        int i7 = this.k;
        if (z4) {
            canvas.saveLayer(0.0f, 0.0f, this.e, c(), null);
            i4 = i6;
            i3 = i7;
        } else {
            if (this.u) {
                i = i7;
                i2 = i;
            } else {
                i = i6;
                i2 = i7;
            }
            Paint paint = this.g;
            paint.setColor(i);
            if (z3) {
                i3 = i2;
                i4 = i6;
            } else {
                i3 = i2;
                i4 = i6;
                canvas.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / 2.0f, c() / 2.0f, paint);
            }
            b(canvas);
        }
        canvas.save();
        int i8 = i();
        int j = j();
        boolean z5 = k() > Math.max(1, j() - i());
        if (z5) {
            canvas2 = canvas;
            canvas2.saveLayer(i8, -hl.L(10.0f), j, hl.L(10.0f) + c(), null);
        } else {
            canvas2 = canvas;
        }
        canvas2.clipRect(i8, -hl.L(10.0f), j, hl.L(10.0f) + c());
        canvas2.save();
        gl9 gl9Var = this.a;
        StaticLayout staticLayout = gl9Var.b;
        ArrayList arrayList = gl9Var.x;
        StaticLayout staticLayout2 = gl9Var.b;
        int i9 = gl9Var.f;
        int lineBaseline = (staticLayout == null || staticLayout.getLineCount() <= 0) ? -1 : staticLayout.getLineBaseline(0);
        boolean z6 = gl9Var.s > 0;
        if (z6) {
            canvas2.translate(l() - i9, (c() - staticLayout2.getHeight()) / 2.0f);
        } else if (lineBaseline <= 0) {
            canvas2.translate(l() - i9, ((c() - staticLayout2.getHeight()) / 2.0f) - hl.L(1.0f));
        } else if (z) {
            canvas2.translate(l() - i9, (-lineBaseline) + ((c() * 43) / 56));
        } else {
            canvas2.translate(l() - i9, (-lineBaseline) + ((c() * 65) / jn7.m1));
        }
        gl9Var.d(canvas2, gl9Var.T);
        hl9 hl9Var = this.p;
        if (hl9Var.E()) {
            canvas2.translate(0.0f, hl.L(z6 ? 0.0f : z3 ? 0.66f : 2.0f));
            StaticLayout staticLayout3 = gl9Var.b;
            if (z3) {
                int i10 = staticLayout3.getPaint().linkColor;
                if (this.o != i10 || (porterDuffColorFilter = this.n) == null) {
                    this.o = i10;
                    porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    this.n = porterDuffColorFilter;
                }
                f = 2.0f;
                i5 = j;
                hm.drawAnimatedEmojis(canvas2, gl9Var.b, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                canvas2 = canvas;
            } else {
                f = 2.0f;
                i5 = j;
                canvas2 = canvas;
                hm.drawAnimatedEmojis(canvas2, staticLayout3, gl9Var.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, this.m);
            }
        } else {
            f = 2.0f;
            i5 = j;
        }
        canvas2.restore();
        if (z5) {
            float c = c();
            RectF rectF = this.A;
            rectF.set(i5 - hl.L(8.0f), 0.0f, i5, c);
            hl9Var.z.r(canvas2, rectF, 2, 1.0f);
            canvas2.restore();
        }
        canvas2.restore();
        Drawable drawable = this.i;
        if (drawable != null) {
            br3.d(drawable, this.e - hl.L(12.33f), hl.L(z ? 9.33f : 11.66f), 17);
            drawable.draw(canvas2);
        }
        if (z4) {
            int i11 = this.u ? i3 : i4;
            Paint paint2 = C;
            paint2.setColor(i11);
            canvas2.drawRoundRect(0.0f, 0.0f, this.e, c(), c() / f, c() / f, paint2);
            canvas.restore();
            b(canvas);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        wb2 wb2Var;
        TL_keyboard.PageButton pageButton = this.c;
        boolean z = (pageButton == null || (wb2Var = this.p.E) == null || !wb2Var.P0(pageButton)) ? false : true;
        boolean z2 = this.y;
        Runnable runnable = this.t;
        if (z2 != z) {
            this.y = z;
            va6 va6Var = this.x;
            if (z) {
                if (va6Var == null) {
                    va6 va6Var2 = new va6();
                    this.x = va6Var2;
                    va6Var2.D = true;
                    va6Var2.x.setStrokeWidth(hl.N(1.25f));
                } else {
                    va6Var.b = -1L;
                    va6Var.c = -1L;
                }
            } else if (va6Var != null) {
                va6Var.a();
            }
            runnable.run();
        }
        va6 va6Var3 = this.x;
        if (va6Var3 != null) {
            if (z || va6Var3.d()) {
                float strokeWidth = this.x.x.getStrokeWidth();
                float f = this.e;
                float c = c();
                RectF rectF = this.z;
                rectF.set(0.0f, 0.0f, f, c);
                float f2 = strokeWidth / 2.0f;
                rectF.inset(f2, f2);
                this.x.h((c() / 2.0f) - f2);
                this.x.e(rectF);
                va6 va6Var4 = this.x;
                int i = this.l;
                va6Var4.g(aob.p1(0.07f, i), aob.p1(0.175f, i), aob.p1(0.175f, i), aob.p1(0.42f, i));
                this.x.setAlpha(jn7.d4);
                this.x.draw(canvas);
                runnable.run();
            }
        }
    }

    public final int c() {
        boolean z = this.f;
        hl9 hl9Var = this.p;
        return hl.L(z ? hl9Var.M * 1.166666f : hl9Var.M + 18);
    }

    public final int d() {
        if (this.i == null) {
            return 0;
        }
        return (hl.L(11.66f) / 2) + hl.L(12.33f);
    }

    public final int e() {
        return Math.min(h(), d() + c());
    }

    public final int f() {
        if (this.s) {
            return 0;
        }
        boolean z = this.q;
        boolean z2 = this.f;
        if (z && z2) {
            return hl.L(4.0f);
        }
        if (z2) {
            return hl.L(7.0f);
        }
        return hl.L(this.i != null ? 26.0f : 20.0f);
    }

    public final int g() {
        if (this.s) {
            return 0;
        }
        boolean z = this.r;
        Drawable drawable = this.i;
        boolean z2 = this.f;
        if (z && z2) {
            return hl.L((drawable != null ? 14 : 0) + 4);
        }
        if (z2) {
            return hl.L((drawable != null ? 14 : 0) + 7);
        }
        return hl.L(drawable != null ? 26.0f : 20.0f);
    }

    public final int h() {
        return Math.min(this.B, g() + f() + k());
    }

    public final int i() {
        if (this.s) {
            return 0;
        }
        return this.f ? f() : hl.L(8.0f);
    }

    public final int j() {
        if (this.s) {
            return this.e;
        }
        return this.e - (this.f ? g() : Math.max(hl.L(8.0f), d()));
    }

    public final int k() {
        gl9 gl9Var = this.a;
        return gl9Var.h - gl9Var.f;
    }

    public final float l() {
        if (this.f) {
            return f();
        }
        if (k() > Math.max(1, j() - i())) {
            return i();
        }
        int i = this.e;
        return this.i == null ? (i - k()) / 2.0f : Math.max(Math.min((i - k()) / 2.0f, (this.e - d()) - k()), hl.L(8.0f));
    }

    public final void m(boolean z) {
        if (this.u != z) {
            this.u = z;
            this.t.run();
            if (z) {
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.w.cancel();
                    this.w = null;
                    return;
                }
                return;
            }
            float f = this.v;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new b49(this, (byte) 4));
                this.w.addListener(new n88(this, (byte) 29));
                ValueAnimator valueAnimator2 = this.w;
                boolean z2 = this.f;
                valueAnimator2.setInterpolator(new OvershootInterpolator(z2 ? 3.5f : 2.0f));
                this.w.setDuration(z2 ? 420L : 350L);
                this.w.start();
            }
        }
    }
}
