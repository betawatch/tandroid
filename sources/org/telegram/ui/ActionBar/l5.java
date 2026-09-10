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
import org.telegram.messenger.em;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class l5 extends View implements Drawable.Callback {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public View.OnClickListener D0;
    public String E;
    public boolean E0;
    public int F;
    public float F0;
    public float G;
    public float G0;
    public float H;
    public org.telegram.ui.Components.u5 H0;
    public int I;
    public int I0;
    public int J;
    public PorterDuffColorFilter J0;
    public int K;
    public boolean K0;
    public boolean L;
    public Layout.Alignment L0;
    public float M;
    public boolean N;
    public Drawable O;
    public boolean P;
    public boolean Q;
    public float R;
    public long S;
    public int T;
    public Paint U;
    public Paint V;
    public Paint W;
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
    public int g0;
    public final TextPaint h;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public boolean o0;
    public Boolean p0;
    public int q0;
    public int r;
    public int r0;
    public CharSequence s;
    public int s0;
    public int t0;
    public int u0;
    public Drawable v;
    public float v0;
    public Drawable w;
    public int w0;
    public Drawable x;
    public int x0;
    public Drawable y;
    public final ArrayList y0;
    public final Stack z0;

    public l5(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.H = 1.0f;
        this.I = AndroidUtilities.dp(4.0f);
        this.q0 = 16;
        this.x0 = 3;
        this.y0 = new ArrayList();
        this.z0 = new Stack();
        this.A0 = new Path();
        this.I0 = 0;
        this.L0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.L0;
    }

    public final void a(int i10) {
        int i11;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.e0 = (int) Math.max(Math.ceil(this.c.getLineWidth(0)), Math.ceil(this.c.getLineRight(0) - this.c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            if (staticLayout2 != null) {
                this.g0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.r <= 1 || this.c.getLineCount() <= 0) {
                this.g0 = this.c.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.c;
                this.g0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i12 = this.n & 7;
            if (i12 == 1) {
                this.c0 = ((i10 - this.e0) / 2) - ((int) this.c.getLineLeft(0));
            } else if (i12 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.c0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.c0 = -((int) this.c.getLineLeft(0));
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.c0 = (int) (i10 - staticLayout5.getLineWidth(0));
                } else {
                    this.c0 = i10 - this.e0;
                }
            } else {
                this.c0 = -AndroidUtilities.dp(8.0f);
            }
            this.c0 = getPaddingLeft() + this.c0;
            if (this.m0) {
                i11 = (this.w == null || this.l0) ? 0 : (int) (r0.getIntrinsicWidth() * this.H);
                if (this.x != null && !this.l0) {
                    i11 += (int) (r4.getIntrinsicWidth() * this.H);
                }
            } else {
                i11 = 0;
            }
            this.Q = this.e0 + i11 > i10 - this.r0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.t0 > 0) {
                this.v0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i13 = this.F;
        if (i13 >= 0) {
            this.G = this.c.getPrimaryHorizontal(i13);
        } else {
            this.G = 0.0f;
        }
    }

    public final void b() {
        int i10 = ((!this.P || (!this.Q && this.R == 0.0f)) && !this.n0) ? 0 : 2;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.y0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.A0;
        path.rewind();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            Rect bounds = ((uh.h) arrayList.get(i10)).getBounds();
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
        Stack stack = this.z0;
        ArrayList arrayList = this.y0;
        CharSequence charSequence2 = this.s;
        this.F = -1;
        boolean z10 = false;
        this.C0 = false;
        if (charSequence2 != null) {
            try {
                Drawable drawable = this.v;
                if (drawable == null || this.k0) {
                    i11 = i10;
                } else {
                    drawable.getIntrinsicWidth();
                    i11 = (i10 - this.v.getIntrinsicWidth()) - this.I;
                }
                if (this.m0) {
                    i12 = 0;
                } else {
                    if (this.w == null || this.l0) {
                        i12 = 0;
                    } else {
                        i12 = (int) (r9.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    }
                    if (this.x != null && !this.l0) {
                        i12 += (int) (r10.getIntrinsicWidth() * this.H);
                        i11 = (i11 - i12) - this.I;
                    }
                }
                CharSequence charSequence3 = charSequence2;
                if (this.E != null) {
                    charSequence3 = charSequence2;
                    if (this.y != null) {
                        int indexOf = charSequence2.toString().indexOf(this.E);
                        this.F = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
                            org.telegram.ui.Cells.p2 p2Var = new org.telegram.ui.Cells.p2(this.y.getIntrinsicWidth());
                            int i15 = this.F;
                            valueOf.setSpan(p2Var, i15, this.E.length() + i15, 0);
                            charSequence3 = valueOf;
                        } else {
                            i11 = (i11 - this.y.getIntrinsicWidth()) - this.I;
                            charSequence3 = charSequence2;
                        }
                    }
                }
                CharSequence charSequence4 = charSequence3;
                boolean z11 = this.B0;
                TextPaint textPaint = this.h;
                if (z11 && i12 != 0 && !this.l0 && !charSequence4.equals(TextUtils.ellipsize(charSequence4, textPaint, i11, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    i11 = i11 + i12 + this.I;
                }
                int i16 = i11;
                if (this.L) {
                    CharSequence ellipsize = !this.n0 ? TextUtils.ellipsize(charSequence4, textPaint, i16, TextUtils.TruncateAt.END) : charSequence4;
                    if (this.n0 || ellipsize.equals(charSequence4)) {
                        i14 = i16;
                        CharSequence charSequence5 = ellipsize;
                        int length = charSequence5.length();
                        if (!this.P && !this.n0) {
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
                        StaticLayout c10 = uw0.c(charSequence4, textPaint, i16, alignment, 0.0f, false, truncateAt, i16, this.x0, false);
                        i14 = i16;
                        this.e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence4.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence4);
                            valueOf2.setSpan(new sz(z10), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.P ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.P ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence6 = subSequence2;
                            this.f = new StaticLayout(charSequence6, 0, charSequence6.length(), textPaint, this.P ? AndroidUtilities.dp(2000.0f) : i14 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = uw0.c(valueOf2, textPaint, i14 + AndroidUtilities.dp(8.0f) + this.t0, getAlignment(), 0.0f, false, truncateAt, i14 + this.t0, this.x0, false);
                        }
                    }
                    i13 = i14;
                } else if (this.r > 1) {
                    StaticLayout c11 = uw0.c(charSequence4, textPaint, i16, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i16, this.r, false);
                    i13 = i16;
                    this.c = c11;
                } else {
                    i13 = i16;
                    if (!this.P && !this.n0) {
                        charSequence = TextUtils.ellipsize(charSequence4, textPaint, i13, TextUtils.TruncateAt.END);
                        int length2 = charSequence.length();
                        if (!this.P && !this.n0) {
                            dp = AndroidUtilities.dp(8.0f) + i13;
                            this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                        }
                        dp = AndroidUtilities.dp(2000.0f);
                        this.c = new StaticLayout(charSequence, 0, length2, textPaint, dp, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence4;
                    int length22 = charSequence.length();
                    if (!this.P) {
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
                    uh.h.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i13);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.e0 = 0;
            this.g0 = 0;
        }
        org.telegram.ui.Components.y5.release(this, this.H0);
        if (this.K0) {
            this.H0 = org.telegram.ui.Components.y5.update(this.I0, this, this.H0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f7 = this.M;
        int i10 = 0;
        ArrayList arrayList = this.y0;
        if (f7 <= 0.0f || this.u0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.u5 u5Var = this.H0;
            if (u5Var != null) {
                u5Var.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((uh.h) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f10 = -this.u0;
        float f11 = this.M;
        canvas.translate((this.v0 * f11) + (f10 * f11), 0.0f);
        float f12 = this.a;
        float f13 = -this.u0;
        float f14 = this.M;
        this.a = r6.a(this.v0, f14, f13 * f14, f12);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.u5 u5Var2 = this.H0;
        if (u5Var2 != null) {
            u5Var2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((uh.h) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.j0 || getMeasuredHeight() == 0 || this.L) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0);
        if ((this.n & 112) == 16) {
            this.d0 = (getMeasuredHeight() - this.g0) / 2;
            return true;
        }
        this.d0 = getPaddingTop();
        return true;
    }

    public final void g(ww0 ww0Var, String str) {
        Drawable drawable = this.y;
        if (drawable == ww0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.y = ww0Var;
        if (ww0Var != null) {
            ww0Var.setCallback(this);
        }
        f();
        this.E = str;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable drawable = this.O;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.v == null && this.w == null && this.x == null) ? 0 : this.I);
    }

    public float getExactWidthIncludeDrawables() {
        return getExactWidth() + (this.v != null ? r1.getIntrinsicWidth() : 0) + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.M;
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
        int measuredWidth = getMeasuredWidth() - ((!this.l0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.I);
        if (this.l0 && (drawable = this.x) != null) {
            i10 = this.I + drawable.getIntrinsicWidth();
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
        return this.l0;
    }

    public int getRightDrawableWidth() {
        if (this.w == null) {
            return 0;
        }
        return (int) ((r0.getIntrinsicWidth() * this.H) + this.I);
    }

    public int getRightDrawableX() {
        return this.h0;
    }

    public int getRightDrawableY() {
        return this.i0;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.v;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.I : 0;
        if (this.w != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.H)) + this.I;
        }
        return this.x != null ? ((int) (r1.getIntrinsicWidth() * this.H)) + this.I + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.s;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.g0;
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
            i10 = this.I + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.y;
        if (drawable2 != null && this.F < 0 && (this.n & 7) == 3) {
            i10 += drawable2.getIntrinsicWidth() + this.I;
        }
        return ((int) getX()) + this.c0 + i10;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i10 = this.e0;
        if (this.m0) {
            r2 = (this.x != null ? (int) (r3.getIntrinsicWidth() * this.H) : 0) + (this.w != null ? (int) (r1.getIntrinsicWidth() * this.H) : 0);
        }
        return i10 + r2;
    }

    public final void h(int i10, int i11) {
        if (this.t0 == i10 && this.u0 == i11) {
            return;
        }
        this.t0 = i10;
        this.u0 = i11;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0);
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
        this.T = 500;
        f();
        return true;
    }

    public final void m() {
        if ((this.U == null || this.V == null) && this.P) {
            Paint paint = new Paint();
            this.U = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.U;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.V = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.V.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.p0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.W != null && this.a0 == AndroidUtilities.dp(this.q0) && this.o0 == booleanValue) && this.n0) {
            if (this.W == null) {
                this.W = new Paint();
            }
            this.o0 = booleanValue;
            if (booleanValue) {
                Paint paint4 = this.W;
                int dp = AndroidUtilities.dp(this.q0);
                this.a0 = dp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.W;
                int dp2 = AndroidUtilities.dp(this.q0);
                this.a0 = dp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, dp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.H0 = org.telegram.ui.Components.y5.update(this.I0, this, this.H0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        org.telegram.ui.Components.y5.release(this, this.H0);
        this.j0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f7;
        float f10;
        int C;
        int i10;
        int C2;
        int i11;
        int C3;
        int i12;
        float f11;
        float f12;
        boolean z10;
        float c10;
        int C4;
        int i13;
        int C5;
        int i14;
        float f13;
        int C6;
        int i15;
        int C7;
        int i16;
        int C8;
        int i17;
        int C9;
        int i18;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z11 = this.P && (this.Q || this.R != 0.0f);
        this.f0 = this.e0;
        Drawable drawable = this.v;
        if (drawable == null || this.k0) {
            intrinsicWidth = (!this.k0 || drawable == null) ? 0 : this.I + drawable.getIntrinsicWidth();
        } else {
            int i19 = (int) (-this.R);
            int i20 = this.n;
            if ((i20 & 7) == 1) {
                i19 += this.c0;
            }
            int measuredHeight = (i20 & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.v;
            drawable2.setBounds(i19, measuredHeight, drawable2.getIntrinsicWidth() + i19, this.v.getIntrinsicHeight() + measuredHeight);
            this.v.draw(canvas);
            int i21 = this.n & 7;
            intrinsicWidth = (i21 == 3 || i21 == 1) ? this.v.getIntrinsicWidth() + this.I : 0;
            this.f0 = this.v.getIntrinsicWidth() + this.I + this.f0;
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null && this.E != null) {
            int i22 = (int) ((-this.R) + this.G);
            int i23 = this.n;
            if ((i23 & 7) == 1) {
                i22 += this.c0;
            }
            int measuredHeight2 = (i23 & 112) == 16 ? ((getMeasuredHeight() - this.y.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - drawable3.getIntrinsicHeight()) / 2);
            Drawable drawable4 = this.y;
            drawable4.setBounds(i22, measuredHeight2, drawable4.getIntrinsicWidth() + i22, this.y.getIntrinsicHeight() + measuredHeight2);
            this.y.draw(canvas);
            if (this.F < 0) {
                int i24 = this.n & 7;
                if (i24 == 3 || i24 == 1) {
                    intrinsicWidth += this.y.getIntrinsicWidth() + this.I;
                }
                this.f0 = this.y.getIntrinsicWidth() + this.I + this.f0;
            }
        }
        int i25 = intrinsicWidth;
        if (this.w == null || this.C0 || this.H <= 0.0f || this.l0 || this.m0) {
            f7 = 0.0f;
        } else {
            int i26 = this.e0 + i25 + this.I + ((int) (-this.R));
            int i27 = this.n & 7;
            if (i27 == 1 || i27 == 5) {
                i26 += this.c0;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.H);
            int intrinsicHeight = (int) (this.w.getIntrinsicHeight() * this.H);
            if ((this.n & 112) == 16) {
                C9 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i18 = this.K;
            } else {
                C9 = hc.b.C(this.g0, intrinsicHeight, 2, getPaddingTop());
                i18 = this.K;
            }
            int i28 = C9 + i18;
            f7 = 0.0f;
            this.w.setBounds(i26, i28, i26 + intrinsicWidth2, i28 + intrinsicHeight);
            this.h0 = i26 + (intrinsicWidth2 >> 1);
            this.i0 = i28 + (intrinsicHeight >> 1);
            this.w.draw(canvas);
            this.f0 = this.I + intrinsicWidth2 + this.f0;
        }
        if (this.x != null && !this.C0 && this.H > f7 && !this.l0 && !this.m0) {
            int i29 = this.e0 + i25 + this.I + ((int) (-this.R));
            if (this.w != null) {
                i29 += ((int) (r5.getIntrinsicWidth() * this.H)) + this.I;
            }
            int i30 = this.n & 7;
            if (i30 == 1 || i30 == 5) {
                i29 += this.c0;
            }
            int intrinsicWidth3 = (int) (this.x.getIntrinsicWidth() * this.H);
            int intrinsicHeight2 = (int) (this.x.getIntrinsicHeight() * this.H);
            if ((this.n & 112) == 16) {
                C8 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i17 = this.K;
            } else {
                C8 = hc.b.C(this.g0, intrinsicHeight2, 2, getPaddingTop());
                i17 = this.K;
            }
            int i31 = C8 + i17;
            this.x.setBounds(i29, i31, i29 + intrinsicWidth3, intrinsicHeight2 + i31);
            this.x.draw(canvas);
            this.f0 = this.I + intrinsicWidth3 + this.f0;
        }
        int dp = AndroidUtilities.dp(16.0f) + this.f0;
        float f14 = this.R;
        if (f14 != f7) {
            if (this.v != null && !this.k0) {
                int i32 = ((int) (-f14)) + dp;
                int measuredHeight3 = (this.n & 112) == 16 ? ((getMeasuredHeight() - this.v.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - this.v.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable5 = this.v;
                drawable5.setBounds(i32, measuredHeight3, drawable5.getIntrinsicWidth() + i32, this.v.getIntrinsicHeight() + measuredHeight3);
                this.v.draw(canvas);
            }
            if (this.w == null || this.l0) {
                f10 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight3 = (int) (this.w.getIntrinsicHeight() * this.H);
                int i33 = this.e0 + i25 + this.I + ((int) (-this.R)) + dp;
                if ((this.n & 112) == 16) {
                    C7 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i16 = this.K;
                } else {
                    C7 = hc.b.C(this.g0, intrinsicHeight3, 2, getPaddingTop());
                    i16 = this.K;
                }
                int i34 = C7 + i16;
                f10 = 16.0f;
                this.w.setBounds(i33, i34, i33 + intrinsicWidth4, i34 + intrinsicHeight3);
                this.h0 = i33 + (intrinsicWidth4 >> 1);
                this.i0 = i34 + (intrinsicHeight3 >> 1);
                this.w.draw(canvas);
            }
            if (this.x != null && !this.l0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight4 = (int) (this.x.getIntrinsicHeight() * this.H);
                int i35 = this.e0 + i25 + this.I + ((int) (-this.R)) + dp;
                if (this.w != null) {
                    i35 += ((int) (r6.getIntrinsicWidth() * this.H)) + this.I;
                }
                if ((this.n & 112) == 16) {
                    C6 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i15 = this.K;
                } else {
                    C6 = hc.b.C(this.g0, intrinsicHeight4, 2, getPaddingTop());
                    i15 = this.K;
                }
                int i36 = C6 + i15;
                this.x.setBounds(i35, i36, intrinsicWidth5 + i35, intrinsicHeight4 + i36);
                this.x.draw(canvas);
            }
        } else {
            f10 = 16.0f;
        }
        if (this.c != null) {
            if (this.k0 || this.l0 || this.n0 || this.r0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.r0;
                Drawable drawable6 = this.w;
                canvas.clipRect(i25, 0, maxTextWidth - AndroidUtilities.dp((drawable6 == null || (drawable6 instanceof org.telegram.ui.Components.n5) || !this.l0) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
            if (this.O != null) {
                int i37 = (int) ((this.c0 + i25) - this.R);
                int i38 = this.e0;
                int i39 = (i38 / 2) + i37;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i38, this.s0);
                int i40 = i39 - (max / 2);
                this.O.setBounds(i40, 0, max + i40, getMeasuredHeight());
                this.O.draw(canvas);
            }
            if (this.c0 + i25 != 0 || this.d0 != 0 || this.R != f7) {
                canvas.save();
                canvas.translate((this.c0 + i25) - this.R, this.d0);
                this.a = ((this.c0 + i25) - this.R) + this.a;
                this.b += this.d0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.M >= 1.0f) {
                f11 = 0.0f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.M) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f13 = AndroidUtilities.dp(this.x0 == 1 ? 0.5f : 4.0f);
                } else {
                    f13 = 0.0f;
                }
                if (this.c.getLineLeft(0) != f7) {
                    canvas.translate((-this.c.getLineWidth(0)) + f13, 0.0f);
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    canvas.translate(this.c.getLineWidth(0) - f13, 0.0f);
                }
                float f15 = -this.u0;
                float f16 = this.M;
                canvas.translate((this.v0 * f16) + (f15 * f16), f11);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e == null || this.M <= f11) {
                f12 = 0.0f;
            } else {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.M * 255.0f));
                float f17 = -this.u0;
                float f18 = this.M;
                float f19 = this.v0;
                float f20 = ((f18 * f19) + (f17 * f18)) - f19;
                f12 = 0.0f;
                canvas.translate(f20, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            }
            if (this.R != f12) {
                canvas.translate(dp, f12);
                e(canvas);
            }
            if (this.c0 + i25 != 0 || this.d0 != 0 || this.R != f12) {
                canvas.restore();
            }
            if (this.w != null && !this.C0 && this.H > 0.0f && !this.l0 && this.m0) {
                int i41 = this.e0 + i25 + this.I + ((int) (-this.R));
                int i42 = this.n & 7;
                if (i42 == 1 || i42 == 5) {
                    i41 += this.c0;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight5 = (int) (this.w.getIntrinsicHeight() * this.H);
                if ((this.n & 112) == 16) {
                    C5 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i14 = this.K;
                } else {
                    C5 = hc.b.C(this.g0, intrinsicHeight5, 2, getPaddingTop());
                    i14 = this.K;
                }
                int i43 = C5 + i14;
                this.w.setBounds(i41, i43, i41 + intrinsicWidth6, i43 + intrinsicHeight5);
                this.h0 = i41 + (intrinsicWidth6 >> 1);
                this.i0 = i43 + (intrinsicHeight5 >> 1);
                this.w.draw(canvas);
                this.f0 = this.I + intrinsicWidth6 + this.f0;
            }
            if (this.x != null && !this.C0 && this.H > 0.0f && !this.l0 && this.m0) {
                int i44 = this.e0 + i25 + this.I + ((int) (-this.R));
                if (this.w != null) {
                    i44 += ((int) (r4.getIntrinsicWidth() * this.H)) + this.I;
                }
                int i45 = this.n & 7;
                if (i45 == 1 || i45 == 5) {
                    i44 += this.c0;
                }
                int intrinsicWidth7 = (int) (this.x.getIntrinsicWidth() * this.H);
                int intrinsicHeight6 = (int) (this.x.getIntrinsicHeight() * this.H);
                if ((this.n & 112) == 16) {
                    C4 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i13 = this.K;
                } else {
                    C4 = hc.b.C(this.g0, intrinsicHeight6, 2, getPaddingTop());
                    i13 = this.K;
                }
                int i46 = C4 + i13;
                this.x.setBounds(i44, i46, i44 + intrinsicWidth7, intrinsicHeight6 + i46);
                this.x.draw(canvas);
                this.f0 = this.I + intrinsicWidth7 + this.f0;
            }
            if (z11) {
                if (this.R < AndroidUtilities.dp(10.0f)) {
                    this.U.setAlpha((int) ((this.R / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.R > (AndroidUtilities.dp(f10) + this.f0) - AndroidUtilities.dp(10.0f)) {
                        this.U.setAlpha((int) em.u(this.R - ((AndroidUtilities.dp(f10) + this.f0) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.U.setAlpha(255);
                    }
                }
                canvas.drawRect(i25, 0.0f, AndroidUtilities.dp(6.0f) + i25, getMeasuredHeight(), this.U);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.r0) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.V);
                canvas.restore();
            } else if (this.n0 && this.Q && this.W != null) {
                canvas.save();
                m();
                if (!this.o0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.r0) - this.a0;
                    Drawable drawable7 = this.w;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable7 == null || (drawable7 instanceof org.telegram.ui.Components.n5) || !this.l0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i25, 0.0f, this.a0, getMeasuredHeight(), this.W);
                canvas.restore();
            }
            if (!this.P || (!this.Q && this.R == 0.0f)) {
                z10 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.S;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i47 = this.T;
                if (i47 > 0) {
                    this.T = (int) (i47 - j3);
                    z10 = true;
                } else {
                    int dp2 = AndroidUtilities.dp(f10) + this.f0;
                    if (this.R < AndroidUtilities.dp(100.0f)) {
                        c10 = a4.a.e(this.R, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else {
                        z10 = true;
                        c10 = this.R >= ((float) (dp2 - AndroidUtilities.dp(100.0f))) ? em.c(this.R - (dp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f) : 50.0f;
                    }
                    float dp3 = ((j3 / 1000.0f) * AndroidUtilities.dp(c10)) + this.R;
                    this.R = dp3;
                    this.S = elapsedRealtime;
                    if (dp3 > dp2) {
                        this.R = 0.0f;
                        this.T = 500;
                    }
                    b();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z10;
            if (this.k0 || this.l0 || this.n0 || this.r0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.v;
        if (drawable8 != null && this.k0) {
            int intrinsicWidth8 = drawable8.getIntrinsicWidth();
            int intrinsicHeight7 = this.v.getIntrinsicHeight();
            if ((this.n & 112) == 16) {
                C3 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i12 = this.J;
            } else {
                C3 = hc.b.C(this.g0, intrinsicHeight7, 2, getPaddingTop());
                i12 = this.J;
            }
            int i48 = C3 + i12;
            this.v.setBounds(0, i48, intrinsicWidth8, intrinsicHeight7 + i48);
            this.v.draw(canvas);
        }
        if (this.w != null && this.l0) {
            int i49 = this.e0 + i25 + this.I;
            float f21 = this.R;
            int min = Math.min(i49 + (f21 == 0.0f ? -dp : (int) (-f21)) + dp, (getMaxTextWidth() - this.r0) + this.I);
            int intrinsicWidth9 = (int) (this.w.getIntrinsicWidth() * this.H);
            int intrinsicHeight8 = (int) (this.w.getIntrinsicHeight() * this.H);
            if ((this.n & 112) == 16) {
                C2 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i11 = this.K;
            } else {
                C2 = hc.b.C(this.g0, intrinsicHeight8, 2, getPaddingTop());
                i11 = this.K;
            }
            int i50 = C2 + i11;
            this.w.setBounds(min, i50, min + intrinsicWidth9, i50 + intrinsicHeight8);
            this.h0 = min + (intrinsicWidth9 >> 1);
            this.i0 = i50 + (intrinsicHeight8 >> 1);
            this.w.draw(canvas);
        }
        if (this.x == null || !this.l0) {
            return;
        }
        int i51 = i25 + this.e0 + this.I;
        float f22 = this.R;
        int min2 = Math.min(i51 + (f22 == 0.0f ? -dp : (int) (-f22)) + dp, (getMaxTextWidth() - this.r0) + this.I);
        if (this.w != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.H)) + this.I;
        }
        int intrinsicWidth10 = (int) (this.x.getIntrinsicWidth() * this.H);
        int intrinsicHeight9 = (int) (this.x.getIntrinsicHeight() * this.H);
        if ((this.n & 112) == 16) {
            C = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i10 = this.K;
        } else {
            C = hc.b.C(this.g0, intrinsicHeight9, 2, getPaddingTop());
            i10 = this.K;
        }
        int i52 = C + i10;
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
        this.j0 = true;
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
        int i12 = this.b0;
        int i13 = AndroidUtilities.displaySize.x;
        if (i12 != i13) {
            this.b0 = i13;
            this.R = 0.0f;
            this.T = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.w0) - ((!this.k0 || (drawable6 = this.v) == null) ? 0 : drawable6.getIntrinsicWidth() + this.I)) - ((!this.l0 || (drawable5 = this.w) == null) ? 0 : drawable5.getIntrinsicWidth() + this.I)) - ((!this.l0 || (drawable4 = this.x) == null) ? 0 : drawable4.getIntrinsicWidth() + this.I));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.g0;
        }
        if (this.N) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.e0 + this.w0 + ((!this.k0 || (drawable3 = this.v) == null) ? 0 : drawable3.getIntrinsicWidth() + this.I) + ((!this.l0 || (drawable2 = this.w) == null) ? 0 : drawable2.getIntrinsicWidth() + this.I) + ((!this.l0 || (drawable = this.x) == null) ? 0 : drawable.getIntrinsicWidth() + this.I)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & 112) == 16) {
            this.d0 = hc.b.C((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.g0, 2, getPaddingTop());
        } else {
            this.d0 = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 != null && this.w != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.h0 - AndroidUtilities.dp(16.0f), this.i0 - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.h0, AndroidUtilities.dp(16.0f) + this.i0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.E0 = true;
                this.F0 = motionEvent.getX();
                this.G0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.w;
                if (obj instanceof k5) {
                    ((q11) ((k5) obj)).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.E0) {
                if (Math.abs(motionEvent.getX() - this.F0) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.G0) >= AndroidUtilities.touchSlop) {
                    this.E0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.w;
                    if (obj2 instanceof k5) {
                        ((q11) ((k5) obj2)).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.E0 && motionEvent.getAction() == 1) {
                    this.D0.onClick(this);
                    Object obj3 = this.w;
                    if (obj3 instanceof k5) {
                        ((q11) ((k5) obj3)).f.c(false);
                    }
                }
                this.E0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.E0;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.L0 = alignment;
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.O = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.L = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.B0 = z10;
    }

    public void setDrawablePadding(int i10) {
        if (this.I == i10) {
            return;
        }
        this.I = i10;
        f();
    }

    public void setEllipsizeByGradient(int i10) {
        if (!this.P) {
            this.n0 = true;
            this.p0 = null;
            m();
            b();
        }
        this.q0 = i10;
        m();
    }

    public void setEmojiCacheType(int i10) {
        if (i10 != this.I0) {
            org.telegram.ui.Components.y5.release(this, this.H0);
            this.I0 = i10;
            if (this.K0) {
                this.H0 = org.telegram.ui.Components.y5.update(i10, this, this.H0, this.c);
            }
        }
    }

    public void setEmojiColor(int i10) {
        this.J0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f7) {
        this.M = f7;
        invalidate();
    }

    public void setFullTextMaxLines(int i10) {
        this.x0 = i10;
    }

    public void setGravity(int i10) {
        this.n = i10;
    }

    public void setLeftDrawable(int i10) {
        setLeftDrawable(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.k0 = z10;
    }

    public void setLeftDrawableTopPadding(int i10) {
        this.J = i10;
    }

    public void setLinkTextColor(int i10) {
        this.h.linkColor = i10;
        invalidate();
    }

    public void setMaxLines(int i10) {
        this.r = i10;
    }

    public void setMinWidth(int i10) {
        this.s0 = i10;
    }

    public void setMinusWidth(int i10) {
        if (i10 == this.w0) {
            return;
        }
        this.w0 = i10;
        f();
    }

    public void setRightDrawable(int i10) {
        i(i10 == 0 ? null : getContext().getResources().getDrawable(i10));
    }

    public void setRightDrawableInside(boolean z10) {
        this.m0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.D0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.l0 = z10;
    }

    public void setRightDrawableScale(float f7) {
        this.H = f7;
    }

    public void setRightDrawableTopPadding(int i10) {
        this.K = i10;
    }

    public void setRightPadding(int i10) {
        if (this.r0 != i10) {
            this.r0 = i10;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0;
            Drawable drawable = this.v;
            if (drawable != null && !this.k0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.I;
            }
            int i11 = 0;
            if (!this.m0) {
                if (this.w != null && !this.l0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
                if (this.x != null && !this.l0) {
                    i11 = (int) (r0.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i11) - this.I;
                }
            }
            if (this.E != null && this.y != null) {
                int indexOf = this.s.toString().indexOf(this.E);
                this.F = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.y.getIntrinsicWidth()) - this.I;
                }
            }
            if (this.B0 && i11 != 0 && !this.l0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    maxTextWidth = maxTextWidth + i11 + this.I;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i10) {
        j6.w1(i10, this.w);
        j6.w1(i10, this.v);
    }

    public void setTextColor(int i10) {
        this.h.setColor(i10);
        invalidate();
    }

    public void setTextSize(int i10) {
        setTextSizePx(AndroidUtilities.dp(i10));
    }

    public void setTextSizePx(int i10) {
        float f7 = i10;
        TextPaint textPaint = this.h;
        if (f7 == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f7);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z10) {
        this.N = z10;
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
        if (this.P == z10) {
            return;
        }
        this.n0 = z10;
        this.p0 = null;
        m();
        b();
    }
}
