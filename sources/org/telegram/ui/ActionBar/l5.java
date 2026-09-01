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
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.t01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class l5 extends View implements Drawable.Callback {
    public View.OnClickListener A0;
    public String B;
    public boolean B0;
    public int C;
    public float C0;
    public float D;
    public float D0;
    public float E;
    public org.telegram.ui.Components.q5 E0;
    public int F;
    public int F0;
    public int G;
    public PorterDuffColorFilter G0;
    public int H;
    public boolean H0;
    public boolean I;
    public Layout.Alignment I0;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public int Q;
    public Paint R;
    public Paint S;
    public Paint T;
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
    public int f0;
    public boolean g0;
    public final TextPaint h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public Boolean m0;
    public int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r;
    public int r0;
    public CharSequence s;
    public float s0;
    public int t0;
    public int u0;
    public Drawable v;
    public final ArrayList v0;
    public Drawable w;
    public final Stack w0;
    public Drawable x;
    public final Path x0;
    public Drawable y;
    public boolean y0;
    public boolean z0;

    public l5(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.E = 1.0f;
        this.F = AndroidUtilities.dp(4.0f);
        this.n0 = 16;
        this.u0 = 3;
        this.v0 = new ArrayList();
        this.w0 = new Stack();
        this.x0 = new Path();
        this.F0 = 0;
        this.I0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.I0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.b0 = (int) Math.max(Math.ceil(this.c.getLineWidth(0)), Math.ceil(this.c.getLineRight(0) - this.c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            if (staticLayout2 != null) {
                this.d0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.r <= 1 || this.c.getLineCount() <= 0) {
                this.d0 = this.c.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.c;
                this.d0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i12 = this.n & 7;
            if (i12 == 1) {
                this.W = ((i10 - this.b0) / 2) - ((int) this.c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.W = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.W = -((int) this.c.getLineLeft(0));
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.W = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.W = i10 - this.b0;
                }
            } else {
                this.W = -AndroidUtilities.dp(8.0f);
            }
            this.W = getPaddingLeft() + this.W;
            if (this.j0) {
                i11 = (this.w == null || this.i0) ? 0 : (int) (r0.getIntrinsicWidth() * this.E);
                if (this.x != null && !this.i0) {
                    i11 += (int) (r4.getIntrinsicWidth() * this.E);
                }
            } else {
                i11 = 0;
            }
            this.N = this.b0 + i11 > i10 - this.o0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.q0 > 0) {
                this.s0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.C;
        if (i13 >= 0) {
            this.D = this.c.getPrimaryHorizontal(i13);
        } else {
            this.D = 0.0f;
        }
    }

    public final void b() {
        int i10 = ((!this.M || (!this.N && this.O == 0.0f)) && !this.k0) ? 0 : 2;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.v0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.x0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((jh.k) arrayList.get(i10)).getBounds();
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
        Stack stack = this.w0;
        ArrayList arrayList = this.v0;
        CharSequence charSequence2 = this.s;
        this.C = -1;
        boolean z4 = false;
        this.z0 = false;
        if (charSequence2 != null) {
            try {
                Drawable drawable = this.v;
                if (drawable == null || this.h0) {
                    i11 = i10;
                } else {
                    drawable.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.F;
                }
                if (this.j0) {
                    i12 = 0;
                } else {
                    if (this.w == null || this.i0) {
                        i12 = 0;
                    } else {
                        i12 = (int) (r9.getIntrinsicWidth() * this.E);
                        i11 = (i11 - i12) - this.F;
                    }
                    if (this.x != null && !this.i0) {
                        i12 += (int) (r10.getIntrinsicWidth() * this.E);
                        i11 = (i11 - i12) - this.F;
                    }
                }
                CharSequence charSequence3 = charSequence2;
                if (this.B != null) {
                    charSequence3 = charSequence2;
                    if (this.y != null) {
                        int indexOf = charSequence2.toString().indexOf(this.B);
                        this.C = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
                            org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2(this.y.getIntrinsicWidth());
                            int i15 = this.C;
                            valueOf.setSpan(p2Var, i15, this.B.length() + i15, 0);
                            charSequence3 = valueOf;
                        } else {
                            i11 = (i11 - this.y.getIntrinsicWidth()) - this.F;
                            charSequence3 = charSequence2;
                        }
                    }
                }
                CharSequence charSequence4 = charSequence3;
                boolean z10 = this.y0;
                TextPaint textPaint = this.h;
                if (z10 && i12 != 0 && !this.i0 && !charSequence4.equals(TextUtils.ellipsize(charSequence4, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.z0 = true;
                    i11 = i11 + i12 + this.F;
                }
                int i16 = i11;
                if (this.I) {
                    CharSequence ellipsize = !this.k0 ? TextUtils.ellipsize(charSequence4, textPaint, i16, TextUtils.TruncateAt.END) : charSequence4;
                    if (this.k0 || ellipsize.equals(charSequence4)) {
                        i14 = i16;
                        CharSequence charSequence5 = ellipsize;
                        int length = charSequence5.length();
                        if (!this.M && !this.k0) {
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
                        StaticLayout c3 = lw0.c(charSequence4, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.u0, false);
                        i14 = i16;
                        this.e = c3;
                        if (c3 != null) {
                            int lineEnd = c3.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence4.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence4);
                            valueOf2.setSpan(new nz(z4), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.M ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.M ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence6 = subSequence2;
                            this.f = new StaticLayout(charSequence6, 0, charSequence6.length(), textPaint, this.M ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = lw0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.q0, getAlignment(), 0.0f, false, truncateAt, i14 + this.q0, this.u0, false);
                        }
                    }
                    i13 = i14;
                } else if (this.r > 1) {
                    StaticLayout c10 = lw0.c(charSequence4, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.r, false);
                    i13 = i16;
                    this.c = c10;
                } else {
                    i13 = i16;
                    if (!this.M && !this.k0) {
                        charSequence = TextUtils.ellipsize(charSequence4, textPaint, i13, TextUtils.TruncateAt.END);
                        int length2 = charSequence.length();
                        if (!this.M && !this.k0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence4;
                    int length22 = charSequence.length();
                    if (!this.M) {
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
                    jh.k.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.b0 = 0;
            this.d0 = 0;
        }
        org.telegram.ui.Components.u5.release(this, this.E0);
        if (this.H0) {
            this.E0 = org.telegram.ui.Components.u5.update(this.F0, this, this.E0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.J;
        int i10 = 0;
        ArrayList arrayList = this.v0;
        if (f10 <= 0.0f || this.r0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.q5 q5Var = this.E0;
            if (q5Var != null) {
                q5Var.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.c, this.E0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((jh.k) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f11 = -this.r0;
        float f12 = this.J;
        canvas.translate((this.s0 * f12) + (f11 * f12), 0.0f);
        float f13 = this.a;
        float f14 = -this.r0;
        float f15 = this.J;
        this.a = e2.c.A(this.s0, f15, f14 * f15, f13);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.q5 q5Var2 = this.E0;
        if (q5Var2 != null) {
            q5Var2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.c, this.E0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((jh.k) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.g0 || getMeasuredHeight() == 0 || this.I) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.t0);
        if ((this.n & 112) == 16) {
            this.a0 = (getMeasuredHeight() - this.d0) / 2;
            return true;
        }
        this.a0 = getPaddingTop();
        return true;
    }

    public final void g(nw0 nw0Var, String str) {
        Drawable drawable = this.y;
        if (drawable == nw0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.y = nw0Var;
        if (nw0Var != null) {
            nw0Var.setCallback(this);
        }
        f();
        this.B = str;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable drawable = this.L;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.v == null && this.w == null && this.x == null) ? 0 : this.F);
    }

    public float getExactWidthIncludeDrawables() {
        return getExactWidth() + (this.v != null ? r1.getIntrinsicWidth() : 0) + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.J;
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
        int measuredWidth = getMeasuredWidth() - ((!this.i0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.F);
        if (this.i0 && (drawable = this.x) != null) {
            i10 = this.F + drawable.getIntrinsicWidth();
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
        return this.i0;
    }

    public int getRightDrawableWidth() {
        if (this.w == null) {
            return 0;
        }
        return (int) ((r0.getIntrinsicWidth() * this.E) + this.F);
    }

    public int getRightDrawableX() {
        return this.e0;
    }

    public int getRightDrawableY() {
        return this.f0;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.v;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.F : 0;
        if (this.w != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.E)) + this.F;
        }
        return this.x != null ? ((int) (r1.getIntrinsicWidth() * this.E)) + this.F + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.s;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.d0;
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
            i10 = this.F + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null && this.C < 0 && (this.n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.F;
        }
        return ((int) getX()) + this.W + i10;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10 = this.b0;
        if (this.j0) {
            r2 = (this.x != null ? (int) (r3.getIntrinsicWidth() * this.E) : 0) + (this.w != null ? (int) (r1.getIntrinsicWidth() * this.E) : 0);
        }
        return i10 + r2;
    }

    public final void h(int i10, int i11) {
        if (this.q0 == i10 && this.r0 == i11) {
            return;
        }
        this.q0 = i10;
        this.r0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.t0);
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

    public boolean l(CharSequence charSequence, boolean z4) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z4 && charSequence2 != null && charSequence2.equals(charSequence)) {
            return false;
        }
        this.s = charSequence;
        this.Q = 500;
        f();
        return true;
    }

    public final void m() {
        if ((this.R == null || this.S == null) && this.M) {
            Paint paint = new Paint();
            this.R = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.R;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.S = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.S.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.m0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.T != null && this.U == AndroidUtilities.dp(this.n0) && this.l0 == booleanValue) && this.k0) {
            if (this.T == null) {
                this.T = new Paint();
            }
            this.l0 = booleanValue;
            if (booleanValue) {
                Paint paint4 = this.T;
                int dp = AndroidUtilities.dp(this.n0);
                this.U = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.T;
                int dp2 = AndroidUtilities.dp(this.n0);
                this.U = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.T.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H0 = true;
        this.E0 = org.telegram.ui.Components.u5.update(this.F0, this, this.E0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H0 = false;
        org.telegram.ui.Components.u5.release(this, this.E0);
        this.g0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f10;
        float f11;
        int d;
        int i10;
        int d10;
        int i11;
        int d11;
        int i12;
        float f12;
        float f13;
        boolean z4;
        float A;
        int d12;
        int i13;
        int d13;
        int i14;
        float f14;
        int d14;
        int i15;
        int d15;
        int i16;
        int d16;
        int i17;
        int d17;
        int i18;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z10 = this.M && (this.N || this.O != 0.0f);
        this.c0 = this.b0;
        Drawable drawable = this.v;
        if (drawable == null || this.h0) {
            intrinsicWidth = (!this.h0 || drawable == null) ? 0 : this.F + drawable.getIntrinsicWidth();
        } else {
            int i19 = (int) (-this.O);
            int i20 = this.n;
            if ((i20 & 7) == 1) {
                i19 += this.W;
            }
            int measuredHeight = (i20 & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.G : this.G + ((this.d0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.v;
            drawable2.setBounds(i19, measuredHeight, drawable2.getIntrinsicWidth() + i19, this.v.getIntrinsicHeight() + measuredHeight);
            this.v.draw(canvas);
            int i21 = this.n & 7;
            intrinsicWidth = (i21 == 3 || i21 == 1) ? this.v.getIntrinsicWidth() + this.F : 0;
            this.c0 = this.v.getIntrinsicWidth() + this.F + this.c0;
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null && this.B != null) {
            int i22 = (int) ((-this.O) + this.D);
            int i23 = this.n;
            if ((i23 & 7) == 1) {
                i22 += this.W;
            }
            int measuredHeight2 = (i23 & 112) == 16 ? ((getMeasuredHeight() - this.y.getIntrinsicHeight()) / 2) + this.G : this.G + ((this.d0 - drawable3.getIntrinsicHeight()) / 2);
            Drawable drawable4 = this.y;
            drawable4.setBounds(i22, measuredHeight2, drawable4.getIntrinsicWidth() + i22, this.y.getIntrinsicHeight() + measuredHeight2);
            this.y.draw(canvas);
            if (this.C < 0) {
                int i24 = this.n & 7;
                if (i24 == 3 || i24 == 1) {
                    intrinsicWidth += this.y.getIntrinsicWidth() + this.F;
                }
                this.c0 = this.y.getIntrinsicWidth() + this.F + this.c0;
            }
        }
        int i25 = intrinsicWidth;
        if (this.w == null || this.z0 || this.E <= 0.0f || this.i0 || this.j0) {
            f10 = 0.0f;
        } else {
            int i26 = this.b0 + i25 + this.F + ((int) (-this.O));
            int i27 = this.n & 7;
            if (i27 == 1 || i27 == 5) {
                i26 += this.W;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.E);
            int intrinsicHeight = (int) (this.w.getIntrinsicHeight() * this.E);
            if ((this.n & 112) == 16) {
                d17 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i18 = this.H;
            } else {
                d17 = l.d.d(this.d0, intrinsicHeight, 2, getPaddingTop());
                i18 = this.H;
            }
            int i28 = d17 + i18;
            f10 = 0.0f;
            this.w.setBounds(i26, i28, i26 + intrinsicWidth2, i28 + intrinsicHeight);
            this.e0 = i26 + (intrinsicWidth2 >> 1);
            this.f0 = i28 + (intrinsicHeight >> 1);
            this.w.draw(canvas);
            this.c0 = this.F + intrinsicWidth2 + this.c0;
        }
        if (this.x != null && !this.z0 && this.E > f10 && !this.i0 && !this.j0) {
            int i29 = this.b0 + i25 + this.F + ((int) (-this.O));
            if (this.w != null) {
                i29 += ((int) (r5.getIntrinsicWidth() * this.E)) + this.F;
            }
            int i30 = this.n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.W;
            }
            int intrinsicWidth3 = (int) (this.x.getIntrinsicWidth() * this.E);
            int intrinsicHeight2 = (int) (this.x.getIntrinsicHeight() * this.E);
            if ((this.n & 112) == 16) {
                d16 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i17 = this.H;
            } else {
                d16 = l.d.d(this.d0, intrinsicHeight2, 2, getPaddingTop());
                i17 = this.H;
            }
            int i31 = d16 + i17;
            this.x.setBounds(i29, i31, i29 + intrinsicWidth3, intrinsicHeight2 + i31);
            this.x.draw(canvas);
            this.c0 = this.F + intrinsicWidth3 + this.c0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.c0;
        float f15 = this.O;
        if (f15 != f10) {
            if (this.v != null && !this.h0) {
                int i32 = ((int) (-f15)) + dp;
                int measuredHeight3 = (this.n & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.G : this.G + ((this.d0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable5 = this.v;
                drawable5.setBounds(i32, measuredHeight3, drawable5.getIntrinsicWidth() + i32, this.v.getIntrinsicHeight() + measuredHeight3);
                this.v.draw(canvas);
            }
            if (this.w == null || this.i0) {
                f11 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.E);
                int intrinsicHeight3 = (int) (this.w.getIntrinsicHeight() * this.E);
                int i33 = this.b0 + i25 + this.F + ((int) (-this.O)) + dp;
                if ((this.n & 112) == 16) {
                    d15 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i16 = this.H;
                } else {
                    d15 = l.d.d(this.d0, intrinsicHeight3, 2, getPaddingTop());
                    i16 = this.H;
                }
                int i34 = d15 + i16;
                f11 = 16.0f;
                this.w.setBounds(i33, i34, i33 + intrinsicWidth4, i34 + intrinsicHeight3);
                this.e0 = i33 + (intrinsicWidth4 >> 1);
                this.f0 = i34 + (intrinsicHeight3 >> 1);
                this.w.draw(canvas);
            }
            if (this.x != null && !this.i0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.E);
                int intrinsicHeight4 = (int) (this.x.getIntrinsicHeight() * this.E);
                int i35 = this.b0 + i25 + this.F + ((int) (-this.O)) + dp;
                if (this.w != null) {
                    i35 += ((int) (r6.getIntrinsicWidth() * this.E)) + this.F;
                }
                if ((this.n & 112) == 16) {
                    d14 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i15 = this.H;
                } else {
                    d14 = l.d.d(this.d0, intrinsicHeight4, 2, getPaddingTop());
                    i15 = this.H;
                }
                int i36 = d14 + i15;
                this.x.setBounds(i35, i36, intrinsicWidth5 + i35, intrinsicHeight4 + i36);
                this.x.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.c != null) {
            if (this.h0 || this.i0 || this.k0 || this.o0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.o0;
                Drawable drawable6 = this.w;
                canvas.clipRect(i25, 0, maxTextWidth - AndroidUtilities.dp((drawable6 == null || (drawable6 instanceof org.telegram.ui.Components.j5) || !this.i0) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.L != null) {
                int i37 = (int) ((this.W + i25) - this.O);
                int i38 = this.b0;
                int i39 = (i38 / 2) + i37;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i38, this.p0);
                int i40 = i39 - (max / 2);
                this.L.setBounds(i40, 0, max + i40, getMeasuredHeight());
                this.L.draw(canvas);
            }
            if (this.W + i25 != 0 || this.a0 != 0 || this.O != f10) {
                canvas.save();
                canvas.translate((this.W + i25) - this.O, this.a0);
                this.a = ((this.W + i25) - this.O) + this.a;
                this.b += this.a0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.J >= 1.0f) {
                f12 = 0.0f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.J) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f14 = AndroidUtilities.dp(this.u0 == 1 ? 0.5f : 4.0f);
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
                float f16 = -this.r0;
                float f17 = this.J;
                canvas.translate((this.s0 * f17) + (f16 * f17), f12);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e == null || this.J <= f12) {
                f13 = 0.0f;
            } else {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.J * 255.0f));
                float f18 = -this.r0;
                float f19 = this.J;
                float f20 = this.s0;
                float f21 = ((f19 * f20) + (f18 * f19)) - f20;
                f13 = 0.0f;
                canvas.translate(f21, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            }
            if (this.O != f13) {
                canvas.translate(dp, f13);
                e(canvas);
            }
            if (this.W + i25 != 0 || this.a0 != 0 || this.O != f13) {
                canvas.restore();
            }
            if (this.w != null && !this.z0 && this.E > 0.0f && !this.i0 && this.j0) {
                int i41 = this.b0 + i25 + this.F + ((int) (-this.O));
                int i42 = this.n & 7;
                if (i42 == 1 || i42 == 5) {
                    i41 += this.W;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.E);
                int intrinsicHeight5 = (int) (this.w.getIntrinsicHeight() * this.E);
                if ((this.n & 112) == 16) {
                    d13 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i14 = this.H;
                } else {
                    d13 = l.d.d(this.d0, intrinsicHeight5, 2, getPaddingTop());
                    i14 = this.H;
                }
                int i43 = d13 + i14;
                this.w.setBounds(i41, i43, i41 + intrinsicWidth6, i43 + intrinsicHeight5);
                this.e0 = i41 + (intrinsicWidth6 >> 1);
                this.f0 = i43 + (intrinsicHeight5 >> 1);
                this.w.draw(canvas);
                this.c0 = this.F + intrinsicWidth6 + this.c0;
            }
            if (this.x != null && !this.z0 && this.E > 0.0f && !this.i0 && this.j0) {
                int i44 = this.b0 + i25 + this.F + ((int) (-this.O));
                if (this.w != null) {
                    i44 += ((int) (r4.getIntrinsicWidth() * this.E)) + this.F;
                }
                int i45 = this.n & 7;
                if (i45 == 1 || i45 == 5) {
                    i44 += this.W;
                }
                int intrinsicWidth7 = (int) (this.x.getIntrinsicWidth() * this.E);
                int intrinsicHeight6 = (int) (this.x.getIntrinsicHeight() * this.E);
                if ((this.n & 112) == 16) {
                    d12 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i13 = this.H;
                } else {
                    d12 = l.d.d(this.d0, intrinsicHeight6, 2, getPaddingTop());
                    i13 = this.H;
                }
                int i46 = d12 + i13;
                this.x.setBounds(i44, i46, i44 + intrinsicWidth7, intrinsicHeight6 + i46);
                this.x.draw(canvas);
                this.c0 = this.F + intrinsicWidth7 + this.c0;
            }
            if (z10) {
                if (this.O < AndroidUtilities.dp(10.0f)) {
                    this.R.setAlpha((int) ((this.O / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.O > (AndroidUtilities.dp(f11) + this.c0) - AndroidUtilities.dp(10.0f)) {
                        this.R.setAlpha((int) org.telegram.ui.b.c(this.O - ((AndroidUtilities.dp(f11) + this.c0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.R.setAlpha(255);
                    }
                }
                canvas.drawRect(i25, 0.0f, AndroidUtilities.dp(6.0f) + i25, getMeasuredHeight(), this.R);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.o0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.S);
                canvas.restore();
            } else if (this.k0 && this.N && this.T != null) {
                canvas.save();
                m();
                if (!this.l0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.o0) - this.U;
                    Drawable drawable7 = this.w;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable7 == null || (drawable7 instanceof org.telegram.ui.Components.j5) || !this.i0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i25, 0.0f, this.U, getMeasuredHeight(), this.T);
                canvas.restore();
            }
            if (!this.M || (!this.N && this.O == 0.0f)) {
                z4 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.P;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i47 = this.Q;
                if (i47 > 0) {
                    this.Q = (int) (i47 - j10);
                    z4 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f11) + this.c0;
                    if (this.O < AndroidUtilities.dp(100.0f)) {
                        A = w.c.c(this.O, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z4 = true;
                    } else {
                        z4 = true;
                        A = this.O >= ((float) (dp2 - AndroidUtilities.dp(100.0f))) ? org.telegram.messenger.y3.A(this.O - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f) : 50.0f;
                    }
                    float dp3 = ((j10 / 1000.0f) * AndroidUtilities.dp(A)) + this.O;
                    this.O = dp3;
                    this.P = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.O = 0.0f;
                        this.Q = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z4;
            if (this.h0 || this.i0 || this.k0 || this.o0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.v;
        if (drawable8 != null && this.h0) {
            int intrinsicWidth8 = drawable8.getIntrinsicWidth();
            int intrinsicHeight7 = this.v.getIntrinsicHeight();
            if ((this.n & 112) == 16) {
                d11 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i12 = this.G;
            } else {
                d11 = l.d.d(this.d0, intrinsicHeight7, 2, getPaddingTop());
                i12 = this.G;
            }
            int i48 = d11 + i12;
            this.v.setBounds(0, i48, intrinsicWidth8, intrinsicHeight7 + i48);
            this.v.draw(canvas);
        }
        if (this.w != null && this.i0) {
            int i49 = this.b0 + i25 + this.F;
            float f22 = this.O;
            int min = Math.min(i49 + (f22 == 0.0f ? -dp : (int) (-f22)) + dp, (getMaxTextWidth() - this.o0) + this.F);
            int intrinsicWidth9 = (int) (this.w.getIntrinsicWidth() * this.E);
            int intrinsicHeight8 = (int) (this.w.getIntrinsicHeight() * this.E);
            if ((this.n & 112) == 16) {
                d10 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i11 = this.H;
            } else {
                d10 = l.d.d(this.d0, intrinsicHeight8, 2, getPaddingTop());
                i11 = this.H;
            }
            int i50 = d10 + i11;
            this.w.setBounds(min, i50, min + intrinsicWidth9, i50 + intrinsicHeight8);
            this.e0 = min + (intrinsicWidth9 >> 1);
            this.f0 = i50 + (intrinsicHeight8 >> 1);
            this.w.draw(canvas);
        }
        if (this.x == null || !this.i0) {
            return;
        }
        int i51 = i25 + this.b0 + this.F;
        float f23 = this.O;
        int min2 = Math.min(i51 + (f23 == 0.0f ? -dp : (int) (-f23)) + dp, (getMaxTextWidth() - this.o0) + this.F);
        if (this.w != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.E)) + this.F;
        }
        int intrinsicWidth10 = (int) (this.x.getIntrinsicWidth() * this.E);
        int intrinsicHeight9 = (int) (this.x.getIntrinsicHeight() * this.E);
        if ((this.n & 112) == 16) {
            d = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i10 = this.H;
        } else {
            d = l.d.d(this.d0, intrinsicHeight9, 2, getPaddingTop());
            i10 = this.H;
        }
        int i52 = d + i10;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.g0 = true;
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
        int i12 = this.V;
        int i13 = AndroidUtilities.displaySize.x;
        if (i12 != i13) {
            this.V = i13;
            this.O = 0.0f;
            this.Q = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.t0) - ((!this.h0 || (drawable6 = this.v) == null) ? 0 : drawable6.getIntrinsicWidth() + this.F)) - ((!this.i0 || (drawable5 = this.w) == null) ? 0 : drawable5.getIntrinsicWidth() + this.F)) - ((!this.i0 || (drawable4 = this.x) == null) ? 0 : drawable4.getIntrinsicWidth() + this.F));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.d0;
        }
        if (this.K) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.b0 + this.t0 + ((!this.h0 || (drawable3 = this.v) == null) ? 0 : drawable3.getIntrinsicWidth() + this.F) + ((!this.i0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.F) + ((!this.i0 || (drawable = this.x) == null) ? 0 : drawable.getIntrinsicWidth() + this.F)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & 112) == 16) {
            this.a0 = l.d.d((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.d0, 2, getPaddingTop());
        } else {
            this.a0 = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0 != null && this.w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.e0 - AndroidUtilities.dp(16.0f), this.f0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.e0, AndroidUtilities.dp(16.0f) + this.f0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.B0 = true;
                this.C0 = motionEvent.getX();
                this.D0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.w;
                if (obj instanceof k5) {
                    ((t01) ((k5) obj)).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.B0) {
                if (Math.abs(motionEvent.getX() - this.C0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.D0) >= AndroidUtilities.touchSlop) {
                    this.B0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.w;
                    if (obj2 instanceof k5) {
                        ((t01) ((k5) obj2)).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.B0 && motionEvent.getAction() == 1) {
                    this.A0.onClick(this);
                    Object obj3 = this.w;
                    if (obj3 instanceof k5) {
                        ((t01) ((k5) obj3)).f.c(false);
                    }
                }
                this.B0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.B0;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.I0 = alignment;
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.L = drawable;
        }
    }

    public void setBuildFullLayout(boolean z4) {
        this.I = z4;
    }

    public void setCanHideRightDrawable(boolean z4) {
        this.y0 = z4;
    }

    public void setDrawablePadding(int i10) {
        if (this.F == i10) {
            return;
        }
        this.F = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.M) {
            this.k0 = true;
            this.m0 = null;
            m();
            b();
        }
        this.n0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.F0) {
            org.telegram.ui.Components.u5.release(this, this.E0);
            this.F0 = i10;
            if (this.H0) {
                this.E0 = org.telegram.ui.Components.u5.update(i10, this, this.E0, this.c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.G0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.J = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.u0 = i10;
    }

    public void setGravity(int i10) {
        this.n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z4) {
        this.h0 = z4;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.G = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.r = i10;
    }

    public void setMinWidth(int i10) {
        this.p0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.t0) {
            return;
        }
        this.t0 = i10;
        f();
    }

    public void setRightDrawable(int i10) {
        i(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setRightDrawableInside(boolean z4) {
        this.j0 = z4;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.A0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z4) {
        this.i0 = z4;
    }

    public void setRightDrawableScale(float f10) {
        this.E = f10;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.H = i10;
    }

    public void setRightPadding(int i10) {
        if (this.o0 != i10) {
            this.o0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.t0;
            Drawable drawable = this.v;
            if (drawable != null && !this.h0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.F;
            }
            int i11 = 0;
            if (!this.j0) {
                if (this.w != null && !this.i0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.E);
                    maxTextWidth = (maxTextWidth - i11) - this.F;
                }
                if (this.x != null && !this.i0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.E);
                    maxTextWidth = (maxTextWidth - i11) - this.F;
                }
            }
            if (this.B != null && this.y != null) {
                int indexOf = this.s.toString().indexOf(this.B);
                this.C = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.y.getIntrinsicWidth()) - this.F;
                }
            }
            if (this.y0 && i11 != 0 && !this.i0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.z0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.F;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z4) {
        if (this.M == z4) {
            return;
        }
        this.M = z4;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        k6.w1(i10, this.w);
        k6.w1(i10, this.v);
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

    public void setWidthWrapContent(boolean z4) {
        this.K = z4;
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

    public void setEllipsizeByGradient(boolean z4) {
        if (this.M == z4) {
            return;
        }
        this.k0 = z4;
        this.m0 = null;
        m();
        b();
    }
}
