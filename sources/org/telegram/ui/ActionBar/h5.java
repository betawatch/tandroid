package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.zy;
import org.telegram.ui.h01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class h5 extends View implements Drawable.Callback {
    public String A;
    public boolean A0;
    public int B;
    public float B0;
    public float C;
    public float C0;
    public float D;
    public org.telegram.ui.Components.p5 D0;
    public int E;
    public int E0;
    public int F;
    public PorterDuffColorFilter F0;
    public int G;
    public boolean G0;
    public boolean H;
    public Layout.Alignment H0;
    public float I;
    public boolean J;
    public Drawable K;
    public boolean L;
    public boolean M;
    public float N;
    public long O;
    public int P;
    public Paint Q;
    public Paint R;
    public Paint S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float a;
    public int a0;
    public float b;
    public int b0;
    public StaticLayout c;
    public int c0;
    public StaticLayout d;
    public int d0;
    public StaticLayout e;
    public int e0;
    public StaticLayout f;
    public boolean f0;
    public boolean g0;
    public final TextPaint h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Boolean l0;
    public int m0;
    public int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r;
    public float r0;
    public CharSequence s;
    public int s0;
    public int t0;
    public final ArrayList u0;
    public Drawable v;
    public final Stack v0;
    public Drawable w;
    public final Path w0;
    public Drawable x;
    public boolean x0;
    public Drawable y;
    public boolean y0;
    public View.OnClickListener z0;

    public h5(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.D = 1.0f;
        this.E = AndroidUtilities.dp(4.0f);
        this.m0 = 16;
        this.t0 = 3;
        this.u0 = new ArrayList();
        this.v0 = new Stack();
        this.w0 = new Path();
        this.E0 = 0;
        this.H0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.H0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.a0 = (int) Math.max(Math.ceil(this.c.getLineWidth(0)), Math.ceil(this.c.getLineRight(0) - this.c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            if (staticLayout2 != null) {
                this.c0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.r <= 1 || this.c.getLineCount() <= 0) {
                this.c0 = this.c.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.c;
                this.c0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i12 = this.n & 7;
            if (i12 == 1) {
                this.V = ((i10 - this.a0) / 2) - ((int) this.c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.V = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.V = -((int) this.c.getLineLeft(0));
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.V = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.V = i10 - this.a0;
                }
            } else {
                this.V = -AndroidUtilities.dp(8.0f);
            }
            this.V = getPaddingLeft() + this.V;
            if (this.i0) {
                i11 = (this.w == null || this.h0) ? 0 : (int) (r0.getIntrinsicWidth() * this.D);
                if (this.x != null && !this.h0) {
                    i11 += (int) (r4.getIntrinsicWidth() * this.D);
                }
            } else {
                i11 = 0;
            }
            this.M = this.a0 + i11 > i10 - this.n0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.p0 > 0) {
                this.r0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.B;
        if (i13 >= 0) {
            this.C = this.c.getPrimaryHorizontal(i13);
        } else {
            this.C = 0.0f;
        }
    }

    public final void b() {
        int i10 = ((!this.L || (!this.M && this.N == 0.0f)) && !this.j0) ? 0 : 2;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.u0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.w0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((eh.k) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i10 = i11;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i10) {
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        int dp;
        int i14;
        int dp2;
        Stack stack = this.v0;
        ArrayList arrayList = this.u0;
        CharSequence charSequence2 = this.s;
        this.B = -1;
        boolean z10 = false;
        this.y0 = false;
        if (charSequence2 != null) {
            try {
                Drawable drawable = this.v;
                if (drawable == null || this.g0) {
                    i11 = i10;
                } else {
                    drawable.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.E;
                }
                if (this.i0) {
                    i12 = 0;
                } else {
                    if (this.w == null || this.h0) {
                        i12 = 0;
                    } else {
                        i12 = (int) (r9.getIntrinsicWidth() * this.D);
                        i11 = (i11 - i12) - this.E;
                    }
                    if (this.x != null && !this.h0) {
                        i12 += (int) (r10.getIntrinsicWidth() * this.D);
                        i11 = (i11 - i12) - this.E;
                    }
                }
                CharSequence charSequence3 = charSequence2;
                if (this.A != null) {
                    charSequence3 = charSequence2;
                    if (this.y != null) {
                        int indexOf = charSequence2.toString().indexOf(this.A);
                        this.B = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
                            org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2(this.y.getIntrinsicWidth());
                            int i15 = this.B;
                            valueOf.setSpan(n2Var, i15, this.A.length() + i15, 0);
                            charSequence3 = valueOf;
                        } else {
                            i11 = (i11 - this.y.getIntrinsicWidth()) - this.E;
                            charSequence3 = charSequence2;
                        }
                    }
                }
                CharSequence charSequence4 = charSequence3;
                boolean z11 = this.x0;
                TextPaint textPaint = this.h;
                if (z11 && i12 != 0 && !this.h0 && !charSequence4.equals(TextUtils.ellipsize(charSequence4, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.y0 = true;
                    i11 = i11 + i12 + this.E;
                }
                int i16 = i11;
                if (this.H) {
                    CharSequence ellipsize = !this.j0 ? TextUtils.ellipsize(charSequence4, textPaint, i16, TextUtils.TruncateAt.END) : charSequence4;
                    if (this.j0 || ellipsize.equals(charSequence4)) {
                        i14 = i16;
                        CharSequence charSequence5 = ellipsize;
                        int length = charSequence5.length();
                        if (!this.L && !this.j0) {
                            dp2 = i14 + AndroidUtilities.dp(8.0f);
                            this.c = new StaticLayout(charSequence5, 0, length, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                            this.e = null;
                            this.f = null;
                            this.d = null;
                        }
                        dp2 = AndroidUtilities.dp(2000.0f);
                        this.c = new StaticLayout(charSequence5, 0, length, textPaint, dp2, getAlignment(), 1.0f, 0.0f, false);
                        this.e = null;
                        this.f = null;
                        this.d = null;
                    } else {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = tv0.c(charSequence4, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.t0, false);
                        i14 = i16;
                        this.e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence4.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence4);
                            valueOf2.setSpan(new zy(z10), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence6 = subSequence2;
                            this.f = new StaticLayout(charSequence6, 0, charSequence6.length(), textPaint, this.L ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = tv0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.p0, getAlignment(), 0.0f, false, truncateAt, i14 + this.p0, this.t0, false);
                        }
                    }
                    i13 = i14;
                } else if (this.r > 1) {
                    StaticLayout c11 = tv0.c(charSequence4, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.r, false);
                    i13 = i16;
                    this.c = c11;
                } else {
                    i13 = i16;
                    if (!this.L && !this.j0) {
                        charSequence = TextUtils.ellipsize(charSequence4, textPaint, i13, TextUtils.TruncateAt.END);
                        int length2 = charSequence.length();
                        if (!this.L && !this.j0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence4;
                    int length22 = charSequence.length();
                    if (!this.L) {
                        dp = AndroidUtilities.dp(8.0f) + i13;
                        this.c = new StaticLayout(charSequence, 0, length22, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    dp = AndroidUtilities.dp(2000.0f);
                    this.c = new StaticLayout(charSequence, 0, length22, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    eh.k.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.a0 = 0;
            this.c0 = 0;
        }
        org.telegram.ui.Components.t5.release(this, this.D0);
        if (this.G0) {
            this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.I;
        int i10 = 0;
        ArrayList arrayList = this.u0;
        if (f10 <= 0.0f || this.q0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.p5 p5Var = this.D0;
            if (p5Var != null) {
                p5Var.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((eh.k) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f11 = -this.q0;
        float f12 = this.I;
        canvas.translate((this.r0 * f12) + (f11 * f12), 0.0f);
        float f13 = this.a;
        float f14 = -this.q0;
        float f15 = this.I;
        this.a = com.google.android.recaptcha.internal.a.d(this.r0, f15, f14 * f15, f13);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.p5 p5Var2 = this.D0;
        if (p5Var2 != null) {
            p5Var2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.c, this.D0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.F0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((eh.k) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.f0 || getMeasuredHeight() == 0 || this.H) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.s0);
        if ((this.n & 112) == 16) {
            this.W = (getMeasuredHeight() - this.c0) / 2;
            return true;
        }
        this.W = getPaddingTop();
        return true;
    }

    public final void g(vv0 vv0Var, String str) {
        Drawable drawable = this.y;
        if (drawable == vv0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.y = vv0Var;
        if (vv0Var != null) {
            vv0Var.setCallback(this);
        }
        f();
        this.A = str;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable drawable = this.K;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.v == null && this.w == null && this.x == null) ? 0 : this.E);
    }

    public float getExactWidthIncludeDrawables() {
        return getExactWidth() + (this.v != null ? r1.getIntrinsicWidth() : 0) + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.I;
    }

    public Layout getLayout() {
        return this.c;
    }

    public float getLayoutX() {
        return this.a;
    }

    public float getLayoutY() {
        return this.b;
    }

    public Drawable getLeftDrawable() {
        return this.v;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.c;
        int lineCount = staticLayout != null ? staticLayout.getLineCount() : 0;
        StaticLayout staticLayout2 = this.e;
        return staticLayout2 != null ? staticLayout2.getLineCount() + lineCount : lineCount;
    }

    public int getMaxTextWidth() {
        Drawable drawable;
        Drawable drawable2;
        int i10 = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.h0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.E);
        if (this.h0 && (drawable = this.x) != null) {
            i10 = this.E + drawable.getIntrinsicWidth();
        }
        return measuredWidth - i10;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.w;
    }

    public Drawable getRightDrawable2() {
        return this.x;
    }

    public boolean getRightDrawableOutside() {
        return this.h0;
    }

    public int getRightDrawableWidth() {
        if (this.w == null) {
            return 0;
        }
        return (int) ((r0.getIntrinsicWidth() * this.D) + this.E);
    }

    public int getRightDrawableX() {
        return this.d0;
    }

    public int getRightDrawableY() {
        return this.e0;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.v;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.E : 0;
        if (this.w != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.D)) + this.E;
        }
        return this.x != null ? ((int) (r1.getIntrinsicWidth() * this.D)) + this.E + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.s;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.c0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i10 = 0;
        if (this.c == null) {
            return 0;
        }
        Drawable drawable = this.v;
        if (drawable != null && (this.n & 7) == 3) {
            i10 = this.E + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null && this.B < 0 && (this.n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.E;
        }
        return ((int) getX()) + this.V + i10;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10 = this.a0;
        if (this.i0) {
            r2 = (this.x != null ? (int) (r3.getIntrinsicWidth() * this.D) : 0) + (this.w != null ? (int) (r1.getIntrinsicWidth() * this.D) : 0);
        }
        return i10 + r2;
    }

    public final void h(int i10, int i11) {
        if (this.p0 == i10 && this.q0 == i11) {
            return;
        }
        this.p0 = i10;
        this.q0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.s0);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
        return true;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.w;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.x;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.y;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final boolean j(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
        return true;
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z10) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
            return false;
        }
        this.s = charSequence;
        this.P = 500;
        f();
        return true;
    }

    public final void m() {
        if ((this.Q == null || this.R == null) && this.L) {
            Paint paint = new Paint();
            this.Q = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.Q;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.R = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.R.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.l0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.S != null && this.T == AndroidUtilities.dp(this.m0) && this.k0 == booleanValue) && this.j0) {
            if (this.S == null) {
                this.S = new Paint();
            }
            this.k0 = booleanValue;
            if (booleanValue) {
                Paint paint4 = this.S;
                int dp = AndroidUtilities.dp(this.m0);
                this.T = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.S;
                int dp2 = AndroidUtilities.dp(this.m0);
                this.T = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.S.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G0 = true;
        this.D0 = org.telegram.ui.Components.t5.update(this.E0, this, this.D0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G0 = false;
        org.telegram.ui.Components.t5.release(this, this.D0);
        this.f0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f10;
        float f11;
        int B;
        int i10;
        int B2;
        int i11;
        int B3;
        int i12;
        float f12;
        float f13;
        boolean z10;
        float c10;
        int B4;
        int i13;
        int B5;
        int i14;
        float f14;
        int B6;
        int i15;
        int B7;
        int i16;
        int B8;
        int i17;
        int B9;
        int i18;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z11 = this.L && (this.M || this.N != 0.0f);
        this.b0 = this.a0;
        Drawable drawable = this.v;
        if (drawable == null || this.g0) {
            intrinsicWidth = (!this.g0 || drawable == null) ? 0 : this.E + drawable.getIntrinsicWidth();
        } else {
            int i19 = (int) (-this.N);
            int i20 = this.n;
            if ((i20 & 7) == 1) {
                i19 += this.V;
            }
            int measuredHeight = (i20 & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F : this.F + ((this.c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.v;
            drawable2.setBounds(i19, measuredHeight, drawable2.getIntrinsicWidth() + i19, this.v.getIntrinsicHeight() + measuredHeight);
            this.v.draw(canvas);
            int i21 = this.n & 7;
            intrinsicWidth = (i21 == 3 || i21 == 1) ? this.v.getIntrinsicWidth() + this.E : 0;
            this.b0 = this.v.getIntrinsicWidth() + this.E + this.b0;
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null && this.A != null) {
            int i22 = (int) ((-this.N) + this.C);
            int i23 = this.n;
            if ((i23 & 7) == 1) {
                i22 += this.V;
            }
            int measuredHeight2 = (i23 & 112) == 16 ? ((getMeasuredHeight() - this.y.getIntrinsicHeight()) / 2) + this.F : this.F + ((this.c0 - drawable3.getIntrinsicHeight()) / 2);
            Drawable drawable4 = this.y;
            drawable4.setBounds(i22, measuredHeight2, drawable4.getIntrinsicWidth() + i22, this.y.getIntrinsicHeight() + measuredHeight2);
            this.y.draw(canvas);
            if (this.B < 0) {
                int i24 = this.n & 7;
                if (i24 == 3 || i24 == 1) {
                    intrinsicWidth += this.y.getIntrinsicWidth() + this.E;
                }
                this.b0 = this.y.getIntrinsicWidth() + this.E + this.b0;
            }
        }
        int i25 = intrinsicWidth;
        if (this.w == null || this.y0 || this.D <= 0.0f || this.h0 || this.i0) {
            f10 = 0.0f;
        } else {
            int i26 = this.a0 + i25 + this.E + ((int) (-this.N));
            int i27 = this.n & 7;
            if (i27 == 1 || i27 == 5) {
                i26 += this.V;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.D);
            int intrinsicHeight = (int) (this.w.getIntrinsicHeight() * this.D);
            if ((this.n & 112) == 16) {
                B9 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i18 = this.G;
            } else {
                B9 = i0.a.B(this.c0, intrinsicHeight, 2, getPaddingTop());
                i18 = this.G;
            }
            int i28 = B9 + i18;
            f10 = 0.0f;
            this.w.setBounds(i26, i28, i26 + intrinsicWidth2, i28 + intrinsicHeight);
            this.d0 = i26 + (intrinsicWidth2 >> 1);
            this.e0 = i28 + (intrinsicHeight >> 1);
            this.w.draw(canvas);
            this.b0 = this.E + intrinsicWidth2 + this.b0;
        }
        if (this.x != null && !this.y0 && this.D > f10 && !this.h0 && !this.i0) {
            int i29 = this.a0 + i25 + this.E + ((int) (-this.N));
            if (this.w != null) {
                i29 += ((int) (r5.getIntrinsicWidth() * this.D)) + this.E;
            }
            int i30 = this.n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.V;
            }
            int intrinsicWidth3 = (int) (this.x.getIntrinsicWidth() * this.D);
            int intrinsicHeight2 = (int) (this.x.getIntrinsicHeight() * this.D);
            if ((this.n & 112) == 16) {
                B8 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i17 = this.G;
            } else {
                B8 = i0.a.B(this.c0, intrinsicHeight2, 2, getPaddingTop());
                i17 = this.G;
            }
            int i31 = B8 + i17;
            this.x.setBounds(i29, i31, i29 + intrinsicWidth3, intrinsicHeight2 + i31);
            this.x.draw(canvas);
            this.b0 = this.E + intrinsicWidth3 + this.b0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.b0;
        float f15 = this.N;
        if (f15 != f10) {
            if (this.v != null && !this.g0) {
                int i32 = ((int) (-f15)) + dp;
                int measuredHeight3 = (this.n & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.F : this.F + ((this.c0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable5 = this.v;
                drawable5.setBounds(i32, measuredHeight3, drawable5.getIntrinsicWidth() + i32, this.v.getIntrinsicHeight() + measuredHeight3);
                this.v.draw(canvas);
            }
            if (this.w == null || this.h0) {
                f11 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.D);
                int intrinsicHeight3 = (int) (this.w.getIntrinsicHeight() * this.D);
                int i33 = this.a0 + i25 + this.E + ((int) (-this.N)) + dp;
                if ((this.n & 112) == 16) {
                    B7 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i16 = this.G;
                } else {
                    B7 = i0.a.B(this.c0, intrinsicHeight3, 2, getPaddingTop());
                    i16 = this.G;
                }
                int i34 = B7 + i16;
                f11 = 16.0f;
                this.w.setBounds(i33, i34, i33 + intrinsicWidth4, i34 + intrinsicHeight3);
                this.d0 = i33 + (intrinsicWidth4 >> 1);
                this.e0 = i34 + (intrinsicHeight3 >> 1);
                this.w.draw(canvas);
            }
            if (this.x != null && !this.h0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.D);
                int intrinsicHeight4 = (int) (this.x.getIntrinsicHeight() * this.D);
                int i35 = this.a0 + i25 + this.E + ((int) (-this.N)) + dp;
                if (this.w != null) {
                    i35 += ((int) (r6.getIntrinsicWidth() * this.D)) + this.E;
                }
                if ((this.n & 112) == 16) {
                    B6 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i15 = this.G;
                } else {
                    B6 = i0.a.B(this.c0, intrinsicHeight4, 2, getPaddingTop());
                    i15 = this.G;
                }
                int i36 = B6 + i15;
                this.x.setBounds(i35, i36, intrinsicWidth5 + i35, intrinsicHeight4 + i36);
                this.x.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.c != null) {
            if (this.g0 || this.h0 || this.j0 || this.n0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.n0;
                Drawable drawable6 = this.w;
                canvas.clipRect(i25, 0, maxTextWidth - AndroidUtilities.dp((drawable6 == null || (drawable6 instanceof org.telegram.ui.Components.i5) || !this.h0) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.K != null) {
                int i37 = (int) ((this.V + i25) - this.N);
                int i38 = this.a0;
                int i39 = (i38 / 2) + i37;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i38, this.o0);
                int i40 = i39 - (max / 2);
                this.K.setBounds(i40, 0, max + i40, getMeasuredHeight());
                this.K.draw(canvas);
            }
            if (this.V + i25 != 0 || this.W != 0 || this.N != f10) {
                canvas.save();
                canvas.translate((this.V + i25) - this.N, this.W);
                this.a = ((this.V + i25) - this.N) + this.a;
                this.b += this.W;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.I >= 1.0f) {
                f12 = 0.0f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.I) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f14 = AndroidUtilities.dp(this.t0 == 1 ? 0.5f : 4.0f);
                } else {
                    f14 = 0.0f;
                }
                if (this.c.getLineLeft(0) != f10) {
                    canvas.translate((-this.c.getLineWidth(0)) + f14, 0.0f);
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                    canvas.translate(this.c.getLineWidth(0) - f14, 0.0f);
                }
                float f16 = -this.q0;
                float f17 = this.I;
                canvas.translate((this.r0 * f17) + (f16 * f17), f12);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e == null || this.I <= f12) {
                f13 = 0.0f;
            } else {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.I * 255.0f));
                float f18 = -this.q0;
                float f19 = this.I;
                float f20 = this.r0;
                float f21 = ((f19 * f20) + (f18 * f19)) - f20;
                f13 = 0.0f;
                canvas.translate(f21, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            }
            if (this.N != f13) {
                canvas.translate(dp, f13);
                e(canvas);
            }
            if (this.V + i25 != 0 || this.W != 0 || this.N != f13) {
                canvas.restore();
            }
            if (this.w != null && !this.y0 && this.D > 0.0f && !this.h0 && this.i0) {
                int i41 = this.a0 + i25 + this.E + ((int) (-this.N));
                int i42 = this.n & 7;
                if (i42 == 1 || i42 == 5) {
                    i41 += this.V;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.D);
                int intrinsicHeight5 = (int) (this.w.getIntrinsicHeight() * this.D);
                if ((this.n & 112) == 16) {
                    B5 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i14 = this.G;
                } else {
                    B5 = i0.a.B(this.c0, intrinsicHeight5, 2, getPaddingTop());
                    i14 = this.G;
                }
                int i43 = B5 + i14;
                this.w.setBounds(i41, i43, i41 + intrinsicWidth6, i43 + intrinsicHeight5);
                this.d0 = i41 + (intrinsicWidth6 >> 1);
                this.e0 = i43 + (intrinsicHeight5 >> 1);
                this.w.draw(canvas);
                this.b0 = this.E + intrinsicWidth6 + this.b0;
            }
            if (this.x != null && !this.y0 && this.D > 0.0f && !this.h0 && this.i0) {
                int i44 = this.a0 + i25 + this.E + ((int) (-this.N));
                if (this.w != null) {
                    i44 += ((int) (r4.getIntrinsicWidth() * this.D)) + this.E;
                }
                int i45 = this.n & 7;
                if (i45 == 1 || i45 == 5) {
                    i44 += this.V;
                }
                int intrinsicWidth7 = (int) (this.x.getIntrinsicWidth() * this.D);
                int intrinsicHeight6 = (int) (this.x.getIntrinsicHeight() * this.D);
                if ((this.n & 112) == 16) {
                    B4 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i13 = this.G;
                } else {
                    B4 = i0.a.B(this.c0, intrinsicHeight6, 2, getPaddingTop());
                    i13 = this.G;
                }
                int i46 = B4 + i13;
                this.x.setBounds(i44, i46, i44 + intrinsicWidth7, intrinsicHeight6 + i46);
                this.x.draw(canvas);
                this.b0 = this.E + intrinsicWidth7 + this.b0;
            }
            if (z11) {
                if (this.N < AndroidUtilities.dp(10.0f)) {
                    this.Q.setAlpha((int) ((this.N / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.N > (AndroidUtilities.dp(f11) + this.b0) - AndroidUtilities.dp(10.0f)) {
                        this.Q.setAlpha((int) rl.t(this.N - ((AndroidUtilities.dp(f11) + this.b0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.Q.setAlpha(255);
                    }
                }
                canvas.drawRect(i25, 0.0f, AndroidUtilities.dp(6.0f) + i25, getMeasuredHeight(), this.Q);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.n0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.R);
                canvas.restore();
            } else if (this.j0 && this.M && this.S != null) {
                canvas.save();
                m();
                if (!this.k0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.n0) - this.T;
                    Drawable drawable7 = this.w;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable7 == null || (drawable7 instanceof org.telegram.ui.Components.i5) || !this.h0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i25, 0.0f, this.T, getMeasuredHeight(), this.S);
                canvas.restore();
            }
            if (!this.L || (!this.M && this.N == 0.0f)) {
                z10 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.O;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i47 = this.P;
                if (i47 > 0) {
                    this.P = (int) (i47 - j10);
                    z10 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f11) + this.b0;
                    if (this.N < AndroidUtilities.dp(100.0f)) {
                        c10 = s3.c.c(this.N, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else {
                        z10 = true;
                        c10 = this.N >= ((float) (dp2 - AndroidUtilities.dp(100.0f))) ? rl.c(this.N - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f) : 50.0f;
                    }
                    float dp3 = ((j10 / 1000.0f) * AndroidUtilities.dp(c10)) + this.N;
                    this.N = dp3;
                    this.O = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.N = 0.0f;
                        this.P = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z10;
            if (this.g0 || this.h0 || this.j0 || this.n0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.v;
        if (drawable8 != null && this.g0) {
            int intrinsicWidth8 = drawable8.getIntrinsicWidth();
            int intrinsicHeight7 = this.v.getIntrinsicHeight();
            if ((this.n & 112) == 16) {
                B3 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i12 = this.F;
            } else {
                B3 = i0.a.B(this.c0, intrinsicHeight7, 2, getPaddingTop());
                i12 = this.F;
            }
            int i48 = B3 + i12;
            this.v.setBounds(0, i48, intrinsicWidth8, intrinsicHeight7 + i48);
            this.v.draw(canvas);
        }
        if (this.w != null && this.h0) {
            int i49 = this.a0 + i25 + this.E;
            float f22 = this.N;
            int min = Math.min(i49 + (f22 == 0.0f ? -dp : (int) (-f22)) + dp, (getMaxTextWidth() - this.n0) + this.E);
            int intrinsicWidth9 = (int) (this.w.getIntrinsicWidth() * this.D);
            int intrinsicHeight8 = (int) (this.w.getIntrinsicHeight() * this.D);
            if ((this.n & 112) == 16) {
                B2 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i11 = this.G;
            } else {
                B2 = i0.a.B(this.c0, intrinsicHeight8, 2, getPaddingTop());
                i11 = this.G;
            }
            int i50 = B2 + i11;
            this.w.setBounds(min, i50, min + intrinsicWidth9, i50 + intrinsicHeight8);
            this.d0 = min + (intrinsicWidth9 >> 1);
            this.e0 = i50 + (intrinsicHeight8 >> 1);
            this.w.draw(canvas);
        }
        if (this.x == null || !this.h0) {
            return;
        }
        int i51 = i25 + this.a0 + this.E;
        float f23 = this.N;
        int min2 = Math.min(i51 + (f23 == 0.0f ? -dp : (int) (-f23)) + dp, (getMaxTextWidth() - this.n0) + this.E);
        if (this.w != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.D)) + this.E;
        }
        int intrinsicWidth10 = (int) (this.x.getIntrinsicWidth() * this.D);
        int intrinsicHeight9 = (int) (this.x.getIntrinsicHeight() * this.D);
        if ((this.n & 112) == 16) {
            B = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i10 = this.G;
        } else {
            B = i0.a.B(this.c0, intrinsicHeight9, 2, getPaddingTop());
            i10 = this.G;
        }
        int i52 = B + i10;
        this.x.setBounds(min2, i52, intrinsicWidth10 + min2, intrinsicHeight9 + i52);
        this.x.draw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.s);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.U;
        int i13 = AndroidUtilities.displaySize.x;
        if (i12 != i13) {
            this.U = i13;
            this.N = 0.0f;
            this.P = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.s0) - ((!this.g0 || (drawable6 = this.v) == null) ? 0 : drawable6.getIntrinsicWidth() + this.E)) - ((!this.h0 || (drawable5 = this.w) == null) ? 0 : drawable5.getIntrinsicWidth() + this.E)) - ((!this.h0 || (drawable4 = this.x) == null) ? 0 : drawable4.getIntrinsicWidth() + this.E));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.c0;
        }
        if (this.J) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.a0 + this.s0 + ((!this.g0 || (drawable3 = this.v) == null) ? 0 : drawable3.getIntrinsicWidth() + this.E) + ((!this.h0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.E) + ((!this.h0 || (drawable = this.x) == null) ? 0 : drawable.getIntrinsicWidth() + this.E)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & 112) == 16) {
            this.W = i0.a.B((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.c0, 2, getPaddingTop());
        } else {
            this.W = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z0 != null && this.w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.d0 - AndroidUtilities.dp(16.0f), this.e0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.d0, AndroidUtilities.dp(16.0f) + this.e0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A0 = true;
                this.B0 = motionEvent.getX();
                this.C0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.w;
                if (obj instanceof g5) {
                    ((h01) ((g5) obj)).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.A0) {
                if (Math.abs(motionEvent.getX() - this.B0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.C0) >= AndroidUtilities.touchSlop) {
                    this.A0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.w;
                    if (obj2 instanceof g5) {
                        ((h01) ((g5) obj2)).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.A0 && motionEvent.getAction() == 1) {
                    this.z0.onClick(this);
                    Object obj3 = this.w;
                    if (obj3 instanceof g5) {
                        ((h01) ((g5) obj3)).f.c(false);
                    }
                }
                this.A0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.A0;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.H0 = alignment;
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.K = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.x0 = z10;
    }

    public void setDrawablePadding(int i10) {
        if (this.E == i10) {
            return;
        }
        this.E = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.L) {
            this.j0 = true;
            this.l0 = null;
            m();
            b();
        }
        this.m0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.E0) {
            org.telegram.ui.Components.t5.release(this, this.D0);
            this.E0 = i10;
            if (this.G0) {
                this.D0 = org.telegram.ui.Components.t5.update(i10, this, this.D0, this.c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.F0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.I = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.t0 = i10;
    }

    public void setGravity(int i10) {
        this.n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.g0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.F = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.r = i10;
    }

    public void setMinWidth(int i10) {
        this.o0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.s0) {
            return;
        }
        this.s0 = i10;
        f();
    }

    public void setRightDrawable(int i10) {
        i(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setRightDrawableInside(boolean z10) {
        this.i0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.z0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.h0 = z10;
    }

    public void setRightDrawableScale(float f10) {
        this.D = f10;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.G = i10;
    }

    public void setRightPadding(int i10) {
        if (this.n0 != i10) {
            this.n0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.s0;
            Drawable drawable = this.v;
            if (drawable != null && !this.g0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.E;
            }
            int i11 = 0;
            if (!this.i0) {
                if (this.w != null && !this.h0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i11) - this.E;
                }
                if (this.x != null && !this.h0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.D);
                    maxTextWidth = (maxTextWidth - i11) - this.E;
                }
            }
            if (this.A != null && this.y != null) {
                int indexOf = this.s.toString().indexOf(this.A);
                this.B = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.y.getIntrinsicWidth()) - this.E;
                }
            }
            if (this.x0 && i11 != 0 && !this.h0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.y0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.E;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        g6.w1(i10, this.w);
        g6.w1(i10, this.v);
    }

    public void setTextColor(int i10) {
        this.h.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        setTextSizePx(AndroidUtilities.dp(i10));
    }

    public void setTextSizePx(int i10) {
        float f10 = i10;
        TextPaint textPaint = this.h;
        if (f10 == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f10);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z10) {
        this.J = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.w || drawable == this.x || drawable == this.v || super.verifyDrawable(drawable);
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setEllipsizeByGradient(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.j0 = z10;
        this.l0 = null;
        m();
        b();
    }
}
