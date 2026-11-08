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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.uw0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class k5 extends View implements Drawable.Callback {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public Drawable D;
    public View.OnClickListener D0;
    public String E;
    public boolean E0;
    public int F;
    public float F0;
    public float G;
    public float G0;
    public float H;
    public org.telegram.ui.Components.n5 H0;
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
    public float v0;
    public Drawable w;
    public int w0;
    public Drawable x;
    public int x0;
    public Drawable y;
    public final ArrayList y0;
    public final Stack z0;

    public k5(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.H = 1.0f;
        this.I = org.telegram.messenger.g0.L(4.0f);
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

    public void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public final void a(int i7) {
        int i10;
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
            int i11 = this.n & 7;
            if (i11 == 1) {
                this.c0 = ((i7 - this.e0) / 2) - ((int) this.c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.c0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.c0 = -((int) this.c.getLineLeft(0));
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.c0 = (int) (i7 - staticLayout5.getLineWidth(0));
                } else {
                    this.c0 = i7 - this.e0;
                }
            } else {
                this.c0 = -org.telegram.messenger.g0.L(8.0f);
            }
            this.c0 = getPaddingLeft() + this.c0;
            if (this.m0) {
                i10 = (this.x == null || this.l0) ? 0 : (int) (r0.getIntrinsicWidth() * this.H);
                if (this.y != null && !this.l0) {
                    i10 += (int) (r4.getIntrinsicWidth() * this.H);
                }
            } else {
                i10 = 0;
            }
            this.Q = this.e0 + i10 > i7 - this.r0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.t0 > 0) {
                this.v0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.F;
        if (i12 >= 0) {
            this.G = this.c.getPrimaryHorizontal(i12);
        } else {
            this.G = 0.0f;
        }
    }

    public final void b() {
        int i7 = ((!this.P || (!this.Q && this.R == 0.0f)) && !this.n0) ? 0 : 2;
        if (getLayerType() != i7) {
            setLayerType(i7, null);
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
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            Rect bounds = ((xh.f) arrayList.get(i7)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i7 = i10;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i7) {
        int i10;
        int i11;
        int i12;
        CharSequence charSequence;
        int L;
        int i13;
        int L2;
        Stack stack = this.z0;
        ArrayList arrayList = this.y0;
        CharSequence charSequence2 = this.s;
        this.F = -1;
        boolean z9 = false;
        this.C0 = false;
        if (charSequence2 != null) {
            try {
                Drawable drawable = this.w;
                if (drawable == null || this.k0) {
                    i10 = i7;
                } else {
                    drawable.getIntrinsicWidth();
                    i10 = (i7 - this.w.getIntrinsicWidth()) - this.I;
                }
                if (this.m0) {
                    i11 = 0;
                } else {
                    if (this.x == null || this.l0) {
                        i11 = 0;
                    } else {
                        i11 = (int) (r9.getIntrinsicWidth() * this.H);
                        i10 = (i10 - i11) - this.I;
                    }
                    if (this.y != null && !this.l0) {
                        i11 += (int) (r10.getIntrinsicWidth() * this.H);
                        i10 = (i10 - i11) - this.I;
                    }
                }
                CharSequence charSequence3 = charSequence2;
                if (this.E != null) {
                    charSequence3 = charSequence2;
                    if (this.D != null) {
                        int indexOf = charSequence2.toString().indexOf(this.E);
                        this.F = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
                            org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(this.D.getIntrinsicWidth());
                            int i14 = this.F;
                            valueOf.setSpan(r2Var, i14, this.E.length() + i14, 0);
                            charSequence3 = valueOf;
                        } else {
                            i10 = (i10 - this.D.getIntrinsicWidth()) - this.I;
                            charSequence3 = charSequence2;
                        }
                    }
                }
                CharSequence charSequence4 = charSequence3;
                boolean z10 = this.B0;
                TextPaint textPaint = this.h;
                if (z10 && i11 != 0 && !this.l0 && !charSequence4.equals(TextUtils.ellipsize(charSequence4, textPaint, i10, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    i10 = i10 + i11 + this.I;
                }
                int i15 = i10;
                if (this.L) {
                    CharSequence ellipsize = !this.n0 ? TextUtils.ellipsize(charSequence4, textPaint, i15, TextUtils.TruncateAt.END) : charSequence4;
                    if (this.n0 || ellipsize.equals(charSequence4)) {
                        i13 = i15;
                        CharSequence charSequence5 = ellipsize;
                        int length = charSequence5.length();
                        if (!this.P && !this.n0) {
                            L2 = i13 + org.telegram.messenger.g0.L(8.0f);
                            this.c = new StaticLayout(charSequence5, 0, length, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                            this.e = null;
                            this.f = null;
                            this.d = null;
                        }
                        L2 = org.telegram.messenger.g0.L(2000.0f);
                        this.c = new StaticLayout(charSequence5, 0, length, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                        this.e = null;
                        this.f = null;
                        this.d = null;
                    } else {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c10 = mu0.c(charSequence4, textPaint, i15, alignment, 0.0f, truncateAt, i15, this.x0, false);
                        i13 = i15;
                        this.e = c10;
                        if (c10 != null) {
                            int lineEnd = c10.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence4.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence4);
                            valueOf2.setSpan(new iy(z9), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.P ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.P ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence6 = subSequence2;
                            this.f = new StaticLayout(charSequence6, 0, charSequence6.length(), textPaint, this.P ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = mu0.c(valueOf2, textPaint, i13 + org.telegram.messenger.g0.L(8.0f) + this.t0, getAlignment(), 0.0f, truncateAt, i13 + this.t0, this.x0, false);
                        }
                    }
                    i12 = i13;
                } else if (this.r > 1) {
                    StaticLayout c11 = mu0.c(charSequence4, textPaint, i15, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i15, this.r, false);
                    i12 = i15;
                    this.c = c11;
                } else {
                    i12 = i15;
                    if (!this.P && !this.n0) {
                        charSequence = TextUtils.ellipsize(charSequence4, textPaint, i12, TextUtils.TruncateAt.END);
                        int length2 = charSequence.length();
                        if (!this.P && !this.n0) {
                            L = org.telegram.messenger.g0.L(8.0f) + i12;
                            this.c = new StaticLayout(charSequence, 0, length2, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                        }
                        L = org.telegram.messenger.g0.L(2000.0f);
                        this.c = new StaticLayout(charSequence, 0, length2, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence4;
                    int length22 = charSequence.length();
                    if (!this.P) {
                        L = org.telegram.messenger.g0.L(8.0f) + i12;
                        this.c = new StaticLayout(charSequence, 0, length22, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    L = org.telegram.messenger.g0.L(2000.0f);
                    this.c = new StaticLayout(charSequence, 0, length22, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    xh.f.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i12);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.e0 = 0;
            this.g0 = 0;
        }
        org.telegram.ui.Components.r5.release(this, this.H0);
        if (this.K0) {
            this.H0 = org.telegram.ui.Components.r5.update(this.I0, this, this.H0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.M;
        int i7 = 0;
        ArrayList arrayList = this.y0;
        if (f10 <= 0.0f || this.u0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.n5 n5Var = this.H0;
            if (n5Var != null) {
                n5Var.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((xh.f) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f11 = -this.u0;
        float f12 = this.M;
        canvas.translate((this.v0 * f12) + (f11 * f12), 0.0f);
        float f13 = this.a;
        float f14 = -this.u0;
        float f15 = this.M;
        this.a = rf.b.d(this.v0, f15, f14 * f15, f13);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.n5 n5Var2 = this.H0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.c, this.H0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.J0);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((xh.f) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.j0 || getMeasuredHeight() == 0 || this.L) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0);
        if ((this.n & qs.x1) == 16) {
            this.d0 = (getMeasuredHeight() - this.g0) / 2;
            return true;
        }
        this.d0 = getPaddingTop();
        return true;
    }

    public final void g(ou0 ou0Var, String str) {
        Drawable drawable = this.D;
        if (drawable == ou0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.D = ou0Var;
        if (ou0Var != null) {
            ou0Var.setCallback(this);
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
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.w == null && this.x == null && this.y == null) ? 0 : this.I);
    }

    public float getExactWidthIncludeDrawables() {
        return getExactWidth() + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0) + (this.y != null ? r1.getIntrinsicWidth() : 0);
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
        return this.w;
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
        int i7 = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.l0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.I);
        if (this.l0 && (drawable = this.y) != null) {
            i7 = this.I + drawable.getIntrinsicWidth();
        }
        return measuredWidth - i7;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.x;
    }

    public Drawable getRightDrawable2() {
        return this.y;
    }

    public boolean getRightDrawableOutside() {
        return this.l0;
    }

    public int getRightDrawableWidth() {
        if (this.x == null) {
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
        Drawable drawable = this.w;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.I : 0;
        if (this.x != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.H)) + this.I;
        }
        return this.y != null ? ((int) (r1.getIntrinsicWidth() * this.H)) + this.I + intrinsicWidth : intrinsicWidth;
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
        int i7 = 0;
        if (this.c == null) {
            return 0;
        }
        Drawable drawable = this.w;
        if (drawable != null && (this.n & 7) == 3) {
            i7 = this.I + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.D;
        if (drawable2 != null && this.F < 0 && (this.n & 7) == 3) {
            i7 += drawable2.getIntrinsicWidth() + this.I;
        }
        return ((int) getX()) + this.c0 + i7;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i7 = this.e0;
        if (this.m0) {
            r2 = (this.y != null ? (int) (r3.getIntrinsicWidth() * this.H) : 0) + (this.x != null ? (int) (r1.getIntrinsicWidth() * this.H) : 0);
        }
        return i7 + r2;
    }

    public final void h(int i7, int i10) {
        if (this.t0 == i7 && this.u0 == i10) {
            return;
        }
        this.t0 = i7;
        this.u0 = i10;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.x;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.y;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.D;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    public final void j(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z9) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z9 && charSequence2 != null && charSequence2.equals(charSequence)) {
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
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.U;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.V = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.V.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.p0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.W != null && this.a0 == org.telegram.messenger.g0.L(this.q0) && this.o0 == booleanValue) && this.n0) {
            if (this.W == null) {
                this.W = new Paint();
            }
            this.o0 = booleanValue;
            if (booleanValue) {
                Paint paint4 = this.W;
                int L = org.telegram.messenger.g0.L(this.q0);
                this.a0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.W;
                int L2 = org.telegram.messenger.g0.L(this.q0);
                this.a0 = L2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K0 = true;
        this.H0 = org.telegram.ui.Components.r5.update(this.I0, this, this.H0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K0 = false;
        org.telegram.ui.Components.r5.release(this, this.H0);
        this.j0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f10;
        float f11;
        int D;
        int i7;
        int D2;
        int i10;
        int D3;
        int i11;
        float f12;
        float f13;
        boolean z9;
        float f14;
        int D4;
        int i12;
        int D5;
        int i13;
        float f15;
        int D6;
        int i14;
        int D7;
        int i15;
        int D8;
        int i16;
        int D9;
        int i17;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z10 = this.P && (this.Q || this.R != 0.0f);
        this.f0 = this.e0;
        Drawable drawable = this.w;
        if (drawable == null || this.k0) {
            intrinsicWidth = (!this.k0 || drawable == null) ? 0 : this.I + drawable.getIntrinsicWidth();
        } else {
            int i18 = (int) (-this.R);
            int i19 = this.n;
            if ((i19 & 7) == 1) {
                i18 += this.c0;
            }
            int measuredHeight = (i19 & qs.x1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.w;
            drawable2.setBounds(i18, measuredHeight, drawable2.getIntrinsicWidth() + i18, this.w.getIntrinsicHeight() + measuredHeight);
            this.w.draw(canvas);
            int i20 = this.n & 7;
            intrinsicWidth = (i20 == 3 || i20 == 1) ? this.w.getIntrinsicWidth() + this.I : 0;
            this.f0 = this.w.getIntrinsicWidth() + this.I + this.f0;
        }
        Drawable drawable3 = this.D;
        if (drawable3 != null && this.E != null) {
            int i21 = (int) ((-this.R) + this.G);
            int i22 = this.n;
            if ((i22 & 7) == 1) {
                i21 += this.c0;
            }
            int measuredHeight2 = (i22 & qs.x1) == 16 ? ((getMeasuredHeight() - this.D.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - drawable3.getIntrinsicHeight()) / 2);
            Drawable drawable4 = this.D;
            drawable4.setBounds(i21, measuredHeight2, drawable4.getIntrinsicWidth() + i21, this.D.getIntrinsicHeight() + measuredHeight2);
            this.D.draw(canvas);
            if (this.F < 0) {
                int i23 = this.n & 7;
                if (i23 == 3 || i23 == 1) {
                    intrinsicWidth += this.D.getIntrinsicWidth() + this.I;
                }
                this.f0 = this.D.getIntrinsicWidth() + this.I + this.f0;
            }
        }
        int i24 = intrinsicWidth;
        if (this.x == null || this.C0 || this.H <= 0.0f || this.l0 || this.m0) {
            f10 = 0.0f;
        } else {
            int i25 = this.e0 + i24 + this.I + ((int) (-this.R));
            int i26 = this.n & 7;
            if (i26 == 1 || i26 == 5) {
                i25 += this.c0;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.H);
            int intrinsicHeight = (int) (this.x.getIntrinsicHeight() * this.H);
            if ((this.n & qs.x1) == 16) {
                D9 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i17 = this.K;
            } else {
                D9 = jg.g.D(this.g0, intrinsicHeight, 2, getPaddingTop());
                i17 = this.K;
            }
            int i27 = D9 + i17;
            f10 = 0.0f;
            this.x.setBounds(i25, i27, i25 + intrinsicWidth2, i27 + intrinsicHeight);
            this.h0 = i25 + (intrinsicWidth2 >> 1);
            this.i0 = i27 + (intrinsicHeight >> 1);
            this.x.draw(canvas);
            this.f0 = this.I + intrinsicWidth2 + this.f0;
        }
        if (this.y != null && !this.C0 && this.H > f10 && !this.l0 && !this.m0) {
            int i28 = this.e0 + i24 + this.I + ((int) (-this.R));
            if (this.x != null) {
                i28 += ((int) (r5.getIntrinsicWidth() * this.H)) + this.I;
            }
            int i29 = this.n & 7;
            if (i29 == 1 || i29 == 5) {
                i28 += this.c0;
            }
            int intrinsicWidth3 = (int) (this.y.getIntrinsicWidth() * this.H);
            int intrinsicHeight2 = (int) (this.y.getIntrinsicHeight() * this.H);
            if ((this.n & qs.x1) == 16) {
                D8 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i16 = this.K;
            } else {
                D8 = jg.g.D(this.g0, intrinsicHeight2, 2, getPaddingTop());
                i16 = this.K;
            }
            int i30 = D8 + i16;
            this.y.setBounds(i28, i30, i28 + intrinsicWidth3, intrinsicHeight2 + i30);
            this.y.draw(canvas);
            this.f0 = this.I + intrinsicWidth3 + this.f0;
        }
        int L = org.telegram.messenger.g0.L(16.0f) + this.f0;
        float f16 = this.R;
        if (f16 != f10) {
            if (this.w != null && !this.k0) {
                int i31 = ((int) (-f16)) + L;
                int measuredHeight3 = (this.n & qs.x1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.J : this.J + ((this.g0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable5 = this.w;
                drawable5.setBounds(i31, measuredHeight3, drawable5.getIntrinsicWidth() + i31, this.w.getIntrinsicHeight() + measuredHeight3);
                this.w.draw(canvas);
            }
            if (this.x == null || this.l0) {
                f11 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight3 = (int) (this.x.getIntrinsicHeight() * this.H);
                int i32 = this.e0 + i24 + this.I + ((int) (-this.R)) + L;
                if ((this.n & qs.x1) == 16) {
                    D7 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i15 = this.K;
                } else {
                    D7 = jg.g.D(this.g0, intrinsicHeight3, 2, getPaddingTop());
                    i15 = this.K;
                }
                int i33 = D7 + i15;
                f11 = 16.0f;
                this.x.setBounds(i32, i33, i32 + intrinsicWidth4, i33 + intrinsicHeight3);
                this.h0 = i32 + (intrinsicWidth4 >> 1);
                this.i0 = i33 + (intrinsicHeight3 >> 1);
                this.x.draw(canvas);
            }
            if (this.y != null && !this.l0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight4 = (int) (this.y.getIntrinsicHeight() * this.H);
                int i34 = this.e0 + i24 + this.I + ((int) (-this.R)) + L;
                if (this.x != null) {
                    i34 += ((int) (r6.getIntrinsicWidth() * this.H)) + this.I;
                }
                if ((this.n & qs.x1) == 16) {
                    D6 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i14 = this.K;
                } else {
                    D6 = jg.g.D(this.g0, intrinsicHeight4, 2, getPaddingTop());
                    i14 = this.K;
                }
                int i35 = D6 + i14;
                this.y.setBounds(i34, i35, intrinsicWidth5 + i34, intrinsicHeight4 + i35);
                this.y.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.c != null) {
            if (this.k0 || this.l0 || this.n0 || this.r0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.r0;
                Drawable drawable6 = this.x;
                canvas.clipRect(i24, 0, maxTextWidth - org.telegram.messenger.g0.L((drawable6 == null || (drawable6 instanceof org.telegram.ui.Components.g5) || !this.l0) ? f10 : 2.0f), getMeasuredHeight());
            }
            org.telegram.messenger.i6.n = false;
            if (this.O != null) {
                int i36 = (int) ((this.c0 + i24) - this.R);
                int i37 = this.e0;
                int i38 = (i37 / 2) + i36;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i37, this.s0);
                int i39 = i38 - (max / 2);
                this.O.setBounds(i39, 0, max + i39, getMeasuredHeight());
                this.O.draw(canvas);
            }
            if (this.c0 + i24 != 0 || this.d0 != 0 || this.R != f10) {
                canvas.save();
                canvas.translate((this.c0 + i24) - this.R, this.d0);
                this.a = ((this.c0 + i24) - this.R) + this.a;
                this.b += this.d0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.M >= 1.0f) {
                f12 = f10;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.M) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f15 = org.telegram.messenger.g0.L(this.x0 == 1 ? 0.5f : 4.0f);
                } else {
                    f15 = f10;
                }
                if (this.c.getLineLeft(0) != f10) {
                    float f17 = (-this.c.getLineWidth(0)) + f15;
                    float f18 = f10;
                    canvas.translate(f17, f18);
                    f12 = f18;
                } else {
                    f12 = f10;
                    canvas.translate(this.c.getLineWidth(0) - f15, f12);
                }
                float f19 = -this.u0;
                float f20 = this.M;
                canvas.translate((this.v0 * f20) + (f19 * f20), f12);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e == null) {
                f13 = f12;
            } else if (this.M > f12) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.M * 255.0f));
                float f21 = -this.u0;
                float f22 = this.M;
                float f23 = this.v0;
                float f24 = ((f22 * f23) + (f21 * f22)) - f23;
                f13 = 0.0f;
                canvas.translate(f24, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f13 = 0.0f;
            }
            if (this.R != f13) {
                canvas.translate(L, f13);
                e(canvas);
            }
            if (this.c0 + i24 != 0 || this.d0 != 0 || this.R != f13) {
                canvas.restore();
            }
            if (this.x != null && !this.C0 && this.H > 0.0f && !this.l0 && this.m0) {
                int i40 = this.e0 + i24 + this.I + ((int) (-this.R));
                int i41 = this.n & 7;
                if (i41 == 1 || i41 == 5) {
                    i40 += this.c0;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.H);
                int intrinsicHeight5 = (int) (this.x.getIntrinsicHeight() * this.H);
                if ((this.n & qs.x1) == 16) {
                    D5 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i13 = this.K;
                } else {
                    D5 = jg.g.D(this.g0, intrinsicHeight5, 2, getPaddingTop());
                    i13 = this.K;
                }
                int i42 = D5 + i13;
                this.x.setBounds(i40, i42, i40 + intrinsicWidth6, i42 + intrinsicHeight5);
                this.h0 = i40 + (intrinsicWidth6 >> 1);
                this.i0 = i42 + (intrinsicHeight5 >> 1);
                this.x.draw(canvas);
                this.f0 = this.I + intrinsicWidth6 + this.f0;
            }
            if (this.y != null && !this.C0 && this.H > 0.0f && !this.l0 && this.m0) {
                int i43 = this.e0 + i24 + this.I + ((int) (-this.R));
                if (this.x != null) {
                    i43 += ((int) (r4.getIntrinsicWidth() * this.H)) + this.I;
                }
                int i44 = this.n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.c0;
                }
                int intrinsicWidth7 = (int) (this.y.getIntrinsicWidth() * this.H);
                int intrinsicHeight6 = (int) (this.y.getIntrinsicHeight() * this.H);
                if ((this.n & qs.x1) == 16) {
                    D4 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i12 = this.K;
                } else {
                    D4 = jg.g.D(this.g0, intrinsicHeight6, 2, getPaddingTop());
                    i12 = this.K;
                }
                int i45 = D4 + i12;
                this.y.setBounds(i43, i45, i43 + intrinsicWidth7, intrinsicHeight6 + i45);
                this.y.draw(canvas);
                this.f0 = this.I + intrinsicWidth7 + this.f0;
            }
            if (z10) {
                if (this.R < org.telegram.messenger.g0.L(10.0f)) {
                    this.U.setAlpha((int) ((this.R / org.telegram.messenger.g0.L(10.0f)) * 255.0f));
                } else {
                    if (this.R > (org.telegram.messenger.g0.L(f11) + this.f0) - org.telegram.messenger.g0.L(10.0f)) {
                        this.U.setAlpha((int) org.telegram.messenger.camera.q.x(this.R - ((org.telegram.messenger.g0.L(f11) + this.f0) - org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.U.setAlpha(qs.e4);
                    }
                }
                canvas.drawRect(i24, 0.0f, org.telegram.messenger.g0.L(6.0f) + i24, getMeasuredHeight(), this.U);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.r0) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredHeight(), this.V);
                canvas.restore();
            } else if (this.n0 && this.Q && this.W != null) {
                canvas.save();
                m();
                if (!this.o0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.r0) - this.a0;
                    Drawable drawable7 = this.x;
                    canvas.translate(maxTextWidth2 - org.telegram.messenger.g0.L((drawable7 == null || (drawable7 instanceof org.telegram.ui.Components.g5) || !this.l0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i24, 0.0f, this.a0, getMeasuredHeight(), this.W);
                canvas.restore();
            }
            if (!this.P || (!this.Q && this.R == 0.0f)) {
                z9 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.S;
                if (j3 > 17) {
                    j3 = 17;
                }
                int i46 = this.T;
                if (i46 > 0) {
                    this.T = (int) (i46 - j3);
                    z9 = true;
                } else {
                    int L2 = org.telegram.messenger.g0.L(f11) + this.f0;
                    if (this.R < org.telegram.messenger.g0.L(100.0f)) {
                        f14 = com.google.android.recaptcha.internal.a.c(this.R, org.telegram.messenger.g0.L(100.0f), 20.0f, 30.0f);
                        z9 = true;
                    } else if (this.R >= L2 - org.telegram.messenger.g0.L(100.0f)) {
                        z9 = true;
                        f14 = org.telegram.messenger.camera.q.v(this.R - (L2 - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z9 = true;
                        f14 = 50.0f;
                    }
                    float L3 = ((j3 / 1000.0f) * org.telegram.messenger.g0.L(f14)) + this.R;
                    this.R = L3;
                    this.S = elapsedRealtime;
                    if (L3 > L2) {
                        this.R = 0.0f;
                        this.T = 500;
                    }
                    b();
                }
                invalidate();
            }
            org.telegram.messenger.i6.n = z9;
            if (this.k0 || this.l0 || this.n0 || this.r0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.w;
        if (drawable8 != null && this.k0) {
            int intrinsicWidth8 = drawable8.getIntrinsicWidth();
            int intrinsicHeight7 = this.w.getIntrinsicHeight();
            if ((this.n & qs.x1) == 16) {
                D3 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i11 = this.J;
            } else {
                D3 = jg.g.D(this.g0, intrinsicHeight7, 2, getPaddingTop());
                i11 = this.J;
            }
            int i47 = D3 + i11;
            this.w.setBounds(0, i47, intrinsicWidth8, intrinsicHeight7 + i47);
            this.w.draw(canvas);
        }
        if (this.x != null && this.l0) {
            int i48 = this.e0 + i24 + this.I;
            float f25 = this.R;
            int min = Math.min(i48 + (f25 == 0.0f ? -L : (int) (-f25)) + L, (getMaxTextWidth() - this.r0) + this.I);
            int intrinsicWidth9 = (int) (this.x.getIntrinsicWidth() * this.H);
            int intrinsicHeight8 = (int) (this.x.getIntrinsicHeight() * this.H);
            if ((this.n & qs.x1) == 16) {
                D2 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i10 = this.K;
            } else {
                D2 = jg.g.D(this.g0, intrinsicHeight8, 2, getPaddingTop());
                i10 = this.K;
            }
            int i49 = D2 + i10;
            this.x.setBounds(min, i49, min + intrinsicWidth9, i49 + intrinsicHeight8);
            this.h0 = min + (intrinsicWidth9 >> 1);
            this.i0 = i49 + (intrinsicHeight8 >> 1);
            this.x.draw(canvas);
        }
        if (this.y == null || !this.l0) {
            return;
        }
        int i50 = i24 + this.e0 + this.I;
        float f26 = this.R;
        int min2 = Math.min(i50 + (f26 == 0.0f ? -L : (int) (-f26)) + L, (getMaxTextWidth() - this.r0) + this.I);
        if (this.x != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.H)) + this.I;
        }
        int intrinsicWidth10 = (int) (this.y.getIntrinsicWidth() * this.H);
        int intrinsicHeight9 = (int) (this.y.getIntrinsicHeight() * this.H);
        if ((this.n & qs.x1) == 16) {
            D = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i7 = this.K;
        } else {
            D = jg.g.D(this.g0, intrinsicHeight9, 2, getPaddingTop());
            i7 = this.K;
        }
        int i51 = D + i7;
        this.y.setBounds(min2, i51, intrinsicWidth10 + min2, intrinsicHeight9 + i51);
        this.y.draw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.s);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.j0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.b0;
        int i12 = org.telegram.messenger.g0.q.x;
        if (i11 != i12) {
            this.b0 = i12;
            this.R = 0.0f;
            this.T = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.w0) - ((!this.k0 || (drawable6 = this.w) == null) ? 0 : drawable6.getIntrinsicWidth() + this.I)) - ((!this.l0 || (drawable5 = this.x) == null) ? 0 : drawable5.getIntrinsicWidth() + this.I)) - ((!this.l0 || (drawable4 = this.y) == null) ? 0 : drawable4.getIntrinsicWidth() + this.I));
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.g0;
        }
        if (this.N) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.e0 + this.w0 + ((!this.k0 || (drawable3 = this.w) == null) ? 0 : drawable3.getIntrinsicWidth() + this.I) + ((!this.l0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.I) + ((!this.l0 || (drawable = this.y) == null) ? 0 : drawable.getIntrinsicWidth() + this.I)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & qs.x1) == 16) {
            this.d0 = jg.g.D((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.g0, 2, getPaddingTop());
        } else {
            this.d0 = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 != null && this.x != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.h0 - org.telegram.messenger.g0.L(16.0f), this.i0 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f) + this.h0, org.telegram.messenger.g0.L(16.0f) + this.i0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.E0 = true;
                this.F0 = motionEvent.getX();
                this.G0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.x;
                if (obj instanceof j5) {
                    ((uw0) ((j5) obj)).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.E0) {
                if (Math.abs(motionEvent.getX() - this.F0) >= org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.G0) >= org.telegram.messenger.g0.e) {
                    this.E0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.x;
                    if (obj2 instanceof j5) {
                        ((uw0) ((j5) obj2)).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.E0 && motionEvent.getAction() == 1) {
                    this.D0.onClick(this);
                    Object obj3 = this.x;
                    if (obj3 instanceof j5) {
                        ((uw0) ((j5) obj3)).f.c(false);
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

    public void setBuildFullLayout(boolean z9) {
        this.L = z9;
    }

    public void setCanHideRightDrawable(boolean z9) {
        this.B0 = z9;
    }

    public void setDrawablePadding(int i7) {
        if (this.I == i7) {
            return;
        }
        this.I = i7;
        f();
    }

    public void setEllipsizeByGradient(int i7) {
        if (!this.P) {
            this.n0 = true;
            this.p0 = null;
            m();
            b();
        }
        this.q0 = i7;
        m();
    }

    public void setEmojiCacheType(int i7) {
        if (i7 != this.I0) {
            org.telegram.ui.Components.r5.release(this, this.H0);
            this.I0 = i7;
            if (this.K0) {
                this.H0 = org.telegram.ui.Components.r5.update(i7, this, this.H0, this.c);
            }
        }
    }

    public void setEmojiColor(int i7) {
        this.J0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i7) {
        this.x0 = i7;
    }

    public void setGravity(int i7) {
        this.n = i7;
    }

    public void setLeftDrawable(int i7) {
        setLeftDrawable(i7 == 0 ? null : getContext().getResources().getDrawable(i7));
    }

    public void setLeftDrawableOutside(boolean z9) {
        this.k0 = z9;
    }

    public void setLeftDrawableTopPadding(int i7) {
        this.J = i7;
    }

    public void setLinkTextColor(int i7) {
        this.h.linkColor = i7;
        invalidate();
    }

    public void setMaxLines(int i7) {
        this.r = i7;
    }

    public void setMinWidth(int i7) {
        this.s0 = i7;
    }

    public void setMinusWidth(int i7) {
        if (i7 == this.w0) {
            return;
        }
        this.w0 = i7;
        f();
    }

    public void setRightDrawable(int i7) {
        i(i7 == 0 ? null : getContext().getResources().getDrawable(i7));
    }

    public void setRightDrawableInside(boolean z9) {
        this.m0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.D0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z9) {
        this.l0 = z9;
    }

    public void setRightDrawableScale(float f10) {
        this.H = f10;
    }

    public void setRightDrawableTopPadding(int i7) {
        this.K = i7;
    }

    public void setRightPadding(int i7) {
        if (this.r0 != i7) {
            this.r0 = i7;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.w0;
            Drawable drawable = this.w;
            if (drawable != null && !this.k0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.I;
            }
            int i10 = 0;
            if (!this.m0) {
                if (this.x != null && !this.l0) {
                    i10 = (int) (r0.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i10) - this.I;
                }
                if (this.y != null && !this.l0) {
                    i10 = (int) (r0.getIntrinsicWidth() * this.H);
                    maxTextWidth = (maxTextWidth - i10) - this.I;
                }
            }
            if (this.E != null && this.D != null) {
                int indexOf = this.s.toString().indexOf(this.E);
                this.F = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.D.getIntrinsicWidth()) - this.I;
                }
            }
            if (this.B0 && i10 != 0 && !this.l0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.C0 = true;
                    maxTextWidth = maxTextWidth + i10 + this.I;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z9) {
        if (this.P == z9) {
            return;
        }
        this.P = z9;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i7) {
        k6.C1(i7, this.x);
        k6.C1(i7, this.w);
    }

    public void setTextColor(int i7) {
        this.h.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        setTextSizePx(org.telegram.messenger.g0.L(i7));
    }

    public void setTextSizePx(int i7) {
        float f10 = i7;
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

    public void setWidthWrapContent(boolean z9) {
        this.N = z9;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.x || drawable == this.y || drawable == this.w || super.verifyDrawable(drawable);
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setEllipsizeByGradient(boolean z9) {
        if (this.P == z9) {
            return;
        }
        this.n0 = z9;
        this.p0 = null;
        m();
        b();
    }
}
