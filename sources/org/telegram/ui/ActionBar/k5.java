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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.mw0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class k5 extends View implements Drawable.Callback {
    public final Stack A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public Drawable E;
    public View.OnClickListener E0;
    public String F;
    public boolean F0;
    public int G;
    public float G0;
    public float H;
    public float H0;
    public float I;
    public org.telegram.ui.Components.l5 I0;
    public int J;
    public int J0;
    public int K;
    public PorterDuffColorFilter K0;
    public int L;
    public boolean L0;
    public boolean M;
    public Layout.Alignment M0;
    public float N;
    public boolean O;
    public Drawable P;
    public boolean Q;
    public boolean R;
    public float S;
    public long T;
    public int U;
    public Paint V;
    public Paint W;
    public float a;
    public Paint a0;
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
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public Boolean q0;
    public int r;
    public int r0;
    public CharSequence s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public Drawable w;
    public float w0;
    public Drawable x;
    public int x0;
    public Drawable y;
    public int y0;
    public final ArrayList z0;

    public k5(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.I = 1.0f;
        this.J = org.telegram.messenger.g0.L(4.0f);
        this.r0 = 16;
        this.y0 = 3;
        this.z0 = new ArrayList();
        this.A0 = new Stack();
        this.B0 = new Path();
        this.J0 = 0;
        this.M0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.M0;
    }

    public void Y(int i3, float f10, float f11, qe.c cVar) {
        invalidate();
    }

    public final void a(int i3) {
        int i10;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f0 = (int) Math.max(Math.ceil(this.c.getLineWidth(0)), Math.ceil(this.c.getLineRight(0) - this.c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            if (staticLayout2 != null) {
                this.h0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.r <= 1 || this.c.getLineCount() <= 0) {
                this.h0 = this.c.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.c;
                this.h0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i11 = this.n & 7;
            if (i11 == 1) {
                this.d0 = ((i3 - this.f0) / 2) - ((int) this.c.getLineLeft(0));
            } else if (i11 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    this.d0 = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.d0 = -((int) this.c.getLineLeft(0));
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    this.d0 = (int) (i3 - staticLayout5.getLineWidth(0));
                } else {
                    this.d0 = i3 - this.f0;
                }
            } else {
                this.d0 = -org.telegram.messenger.g0.L(8.0f);
            }
            this.d0 = getPaddingLeft() + this.d0;
            if (this.n0) {
                i10 = (this.x == null || this.m0) ? 0 : (int) (r0.getIntrinsicWidth() * this.I);
                if (this.y != null && !this.m0) {
                    i10 += (int) (r4.getIntrinsicWidth() * this.I);
                }
            } else {
                i10 = 0;
            }
            this.R = this.f0 + i10 > i3 - this.s0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.u0 > 0) {
                this.w0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i12 = this.G;
        if (i12 >= 0) {
            this.H = this.c.getPrimaryHorizontal(i12);
        } else {
            this.H = 0.0f;
        }
    }

    public final void b() {
        int i3 = ((!this.Q || (!this.R && this.S == 0.0f)) && !this.o0) ? 0 : 2;
        if (getLayerType() != i3) {
            setLayerType(i3, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.z0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.B0;
        path.rewind();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            Rect bounds = ((yh.f) arrayList.get(i3)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i3 = i10;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i3) {
        int i10;
        int i11;
        int i12;
        CharSequence charSequence;
        int L;
        int i13;
        int L2;
        Stack stack = this.A0;
        ArrayList arrayList = this.z0;
        CharSequence charSequence2 = this.s;
        this.G = -1;
        boolean z10 = false;
        this.D0 = false;
        if (charSequence2 != null) {
            try {
                Drawable drawable = this.w;
                if (drawable == null || this.l0) {
                    i10 = i3;
                } else {
                    drawable.getIntrinsicWidth();
                    i10 = (i3 - this.w.getIntrinsicWidth()) - this.J;
                }
                if (this.n0) {
                    i11 = 0;
                } else {
                    if (this.x == null || this.m0) {
                        i11 = 0;
                    } else {
                        i11 = (int) (r9.getIntrinsicWidth() * this.I);
                        i10 = (i10 - i11) - this.J;
                    }
                    if (this.y != null && !this.m0) {
                        i11 += (int) (r10.getIntrinsicWidth() * this.I);
                        i10 = (i10 - i11) - this.J;
                    }
                }
                CharSequence charSequence3 = charSequence2;
                if (this.F != null) {
                    charSequence3 = charSequence2;
                    if (this.E != null) {
                        int indexOf = charSequence2.toString().indexOf(this.F);
                        this.G = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence2);
                            org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(this.E.getIntrinsicWidth());
                            int i14 = this.G;
                            valueOf.setSpan(r2Var, i14, this.F.length() + i14, 0);
                            charSequence3 = valueOf;
                        } else {
                            i10 = (i10 - this.E.getIntrinsicWidth()) - this.J;
                            charSequence3 = charSequence2;
                        }
                    }
                }
                CharSequence charSequence4 = charSequence3;
                boolean z11 = this.C0;
                TextPaint textPaint = this.h;
                if (z11 && i11 != 0 && !this.m0 && !charSequence4.equals(TextUtils.ellipsize(charSequence4, textPaint, i10, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    i10 = i10 + i11 + this.J;
                }
                int i15 = i10;
                if (this.M) {
                    CharSequence ellipsize = !this.o0 ? TextUtils.ellipsize(charSequence4, textPaint, i15, TextUtils.TruncateAt.END) : charSequence4;
                    if (this.o0 || ellipsize.equals(charSequence4)) {
                        i13 = i15;
                        CharSequence charSequence5 = ellipsize;
                        int length = charSequence5.length();
                        if (!this.Q && !this.o0) {
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
                        StaticLayout c2 = lu0.c(charSequence4, textPaint, i15, alignment, 0.0f, truncateAt, i15, this.y0, false);
                        i13 = i15;
                        this.e = c2;
                        if (c2 != null) {
                            int lineEnd = c2.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence4.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence4);
                            valueOf2.setSpan(new fy(z10), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.Q ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.Q ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence6 = subSequence2;
                            this.f = new StaticLayout(charSequence6, 0, charSequence6.length(), textPaint, this.Q ? org.telegram.messenger.g0.L(2000.0f) : i13 + org.telegram.messenger.g0.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = lu0.c(valueOf2, textPaint, i13 + org.telegram.messenger.g0.L(8.0f) + this.u0, getAlignment(), 0.0f, truncateAt, i13 + this.u0, this.y0, false);
                        }
                    }
                    i12 = i13;
                } else if (this.r > 1) {
                    StaticLayout c10 = lu0.c(charSequence4, textPaint, i15, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i15, this.r, false);
                    i12 = i15;
                    this.c = c10;
                } else {
                    i12 = i15;
                    if (!this.Q && !this.o0) {
                        charSequence = TextUtils.ellipsize(charSequence4, textPaint, i12, TextUtils.TruncateAt.END);
                        int length2 = charSequence.length();
                        if (!this.Q && !this.o0) {
                            L = org.telegram.messenger.g0.L(8.0f) + i12;
                            this.c = new StaticLayout(charSequence, 0, length2, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                        }
                        L = org.telegram.messenger.g0.L(2000.0f);
                        this.c = new StaticLayout(charSequence, 0, length2, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                    }
                    charSequence = charSequence4;
                    int length22 = charSequence.length();
                    if (!this.Q) {
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
                    yh.f.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i12);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.f0 = 0;
            this.h0 = 0;
        }
        org.telegram.ui.Components.p5.release(this, this.I0);
        if (this.L0) {
            this.I0 = org.telegram.ui.Components.p5.update(this.J0, this, this.I0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f10 = this.N;
        int i3 = 0;
        ArrayList arrayList = this.z0;
        if (f10 <= 0.0f || this.v0 == 0) {
            canvas.save();
            c(canvas);
            org.telegram.ui.Components.l5 l5Var = this.I0;
            if (l5Var != null) {
                l5Var.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((yh.f) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f11 = -this.v0;
        float f12 = this.N;
        canvas.translate((this.w0 * f12) + (f11 * f12), 0.0f);
        float f13 = this.a;
        float f14 = -this.v0;
        float f15 = this.N;
        this.a = t4.c.c(this.w0, f15, f14 * f15, f13);
        canvas.save();
        c(canvas);
        org.telegram.ui.Components.l5 l5Var2 = this.I0;
        if (l5Var2 != null) {
            l5Var2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((yh.f) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.k0 || getMeasuredHeight() == 0 || this.M) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0);
        if ((this.n & hs.x1) == 16) {
            this.e0 = (getMeasuredHeight() - this.h0) / 2;
            return true;
        }
        this.e0 = getPaddingTop();
        return true;
    }

    public final void g(nu0 nu0Var, String str) {
        Drawable drawable = this.E;
        if (drawable == nu0Var) {
            return;
        }
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.E = nu0Var;
        if (nu0Var != null) {
            nu0Var.setCallback(this);
        }
        f();
        this.F = str;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable drawable = this.P;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.w == null && this.x == null && this.y == null) ? 0 : this.J);
    }

    public float getExactWidthIncludeDrawables() {
        return getExactWidth() + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0) + (this.y != null ? r1.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.N;
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
        int i3 = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.m0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.J);
        if (this.m0 && (drawable = this.y) != null) {
            i3 = this.J + drawable.getIntrinsicWidth();
        }
        return measuredWidth - i3;
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
        return this.m0;
    }

    public int getRightDrawableWidth() {
        if (this.x == null) {
            return 0;
        }
        return (int) ((r0.getIntrinsicWidth() * this.I) + this.J);
    }

    public int getRightDrawableX() {
        return this.i0;
    }

    public int getRightDrawableY() {
        return this.j0;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.w;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.J : 0;
        if (this.x != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.I)) + this.J;
        }
        return this.y != null ? ((int) (r1.getIntrinsicWidth() * this.I)) + this.J + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.s;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.h0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i3 = 0;
        if (this.c == null) {
            return 0;
        }
        Drawable drawable = this.w;
        if (drawable != null && (this.n & 7) == 3) {
            i3 = this.J + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && this.G < 0 && (this.n & 7) == 3) {
            i3 += drawable2.getIntrinsicWidth() + this.J;
        }
        return ((int) getX()) + this.d0 + i3;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i3 = this.f0;
        if (this.n0) {
            r2 = (this.y != null ? (int) (r3.getIntrinsicWidth() * this.I) : 0) + (this.x != null ? (int) (r1.getIntrinsicWidth() * this.I) : 0);
        }
        return i3 + r2;
    }

    public final void h(int i3, int i10) {
        if (this.u0 == i3 && this.v0 == i10) {
            return;
        }
        this.u0 = i3;
        this.v0 = i10;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0);
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
        Drawable drawable5 = this.E;
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

    public boolean l(CharSequence charSequence, boolean z10) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z10 && charSequence2 != null && charSequence2.equals(charSequence)) {
            return false;
        }
        this.s = charSequence;
        this.U = 500;
        f();
        return true;
    }

    public final void m() {
        if ((this.V == null || this.W == null) && this.Q) {
            Paint paint = new Paint();
            this.V = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.V;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.W = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.W.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.q0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.a0 != null && this.b0 == org.telegram.messenger.g0.L(this.r0) && this.p0 == booleanValue) && this.o0) {
            if (this.a0 == null) {
                this.a0 = new Paint();
            }
            this.p0 = booleanValue;
            if (booleanValue) {
                Paint paint4 = this.a0;
                int L = org.telegram.messenger.g0.L(this.r0);
                this.b0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.a0;
                int L2 = org.telegram.messenger.g0.L(this.r0);
                this.b0 = L2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.a0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L0 = true;
        this.I0 = org.telegram.ui.Components.p5.update(this.J0, this, this.I0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L0 = false;
        org.telegram.ui.Components.p5.release(this, this.I0);
        this.k0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f10;
        float f11;
        int e10;
        int i3;
        int e11;
        int i10;
        int e12;
        int i11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        int e13;
        int i12;
        int e14;
        int i13;
        float f15;
        int e15;
        int i14;
        int e16;
        int i15;
        int e17;
        int i16;
        int e18;
        int i17;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z11 = this.Q && (this.R || this.S != 0.0f);
        this.g0 = this.f0;
        Drawable drawable = this.w;
        if (drawable == null || this.l0) {
            intrinsicWidth = (!this.l0 || drawable == null) ? 0 : this.J + drawable.getIntrinsicWidth();
        } else {
            int i18 = (int) (-this.S);
            int i19 = this.n;
            if ((i19 & 7) == 1) {
                i18 += this.d0;
            }
            int measuredHeight = (i19 & hs.x1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.w;
            drawable2.setBounds(i18, measuredHeight, drawable2.getIntrinsicWidth() + i18, this.w.getIntrinsicHeight() + measuredHeight);
            this.w.draw(canvas);
            int i20 = this.n & 7;
            intrinsicWidth = (i20 == 3 || i20 == 1) ? this.w.getIntrinsicWidth() + this.J : 0;
            this.g0 = this.w.getIntrinsicWidth() + this.J + this.g0;
        }
        Drawable drawable3 = this.E;
        if (drawable3 != null && this.F != null) {
            int i21 = (int) ((-this.S) + this.H);
            int i22 = this.n;
            if ((i22 & 7) == 1) {
                i21 += this.d0;
            }
            int measuredHeight2 = (i22 & hs.x1) == 16 ? ((getMeasuredHeight() - this.E.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - drawable3.getIntrinsicHeight()) / 2);
            Drawable drawable4 = this.E;
            drawable4.setBounds(i21, measuredHeight2, drawable4.getIntrinsicWidth() + i21, this.E.getIntrinsicHeight() + measuredHeight2);
            this.E.draw(canvas);
            if (this.G < 0) {
                int i23 = this.n & 7;
                if (i23 == 3 || i23 == 1) {
                    intrinsicWidth += this.E.getIntrinsicWidth() + this.J;
                }
                this.g0 = this.E.getIntrinsicWidth() + this.J + this.g0;
            }
        }
        int i24 = intrinsicWidth;
        if (this.x == null || this.D0 || this.I <= 0.0f || this.m0 || this.n0) {
            f10 = 0.0f;
        } else {
            int i25 = this.f0 + i24 + this.J + ((int) (-this.S));
            int i26 = this.n & 7;
            if (i26 == 1 || i26 == 5) {
                i25 += this.d0;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.I);
            int intrinsicHeight = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & hs.x1) == 16) {
                e18 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i17 = this.L;
            } else {
                e18 = k2.p1.e(this.h0, intrinsicHeight, 2, getPaddingTop());
                i17 = this.L;
            }
            int i27 = e18 + i17;
            f10 = 0.0f;
            this.x.setBounds(i25, i27, i25 + intrinsicWidth2, i27 + intrinsicHeight);
            this.i0 = i25 + (intrinsicWidth2 >> 1);
            this.j0 = i27 + (intrinsicHeight >> 1);
            this.x.draw(canvas);
            this.g0 = this.J + intrinsicWidth2 + this.g0;
        }
        if (this.y != null && !this.D0 && this.I > f10 && !this.m0 && !this.n0) {
            int i28 = this.f0 + i24 + this.J + ((int) (-this.S));
            if (this.x != null) {
                i28 += ((int) (r5.getIntrinsicWidth() * this.I)) + this.J;
            }
            int i29 = this.n & 7;
            if (i29 == 1 || i29 == 5) {
                i28 += this.d0;
            }
            int intrinsicWidth3 = (int) (this.y.getIntrinsicWidth() * this.I);
            int intrinsicHeight2 = (int) (this.y.getIntrinsicHeight() * this.I);
            if ((this.n & hs.x1) == 16) {
                e17 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i16 = this.L;
            } else {
                e17 = k2.p1.e(this.h0, intrinsicHeight2, 2, getPaddingTop());
                i16 = this.L;
            }
            int i30 = e17 + i16;
            this.y.setBounds(i28, i30, i28 + intrinsicWidth3, intrinsicHeight2 + i30);
            this.y.draw(canvas);
            this.g0 = this.J + intrinsicWidth3 + this.g0;
        }
        int L = org.telegram.messenger.g0.L(16.0f) + this.g0;
        float f16 = this.S;
        if (f16 != f10) {
            if (this.w != null && !this.l0) {
                int i31 = ((int) (-f16)) + L;
                int measuredHeight3 = (this.n & hs.x1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable5 = this.w;
                drawable5.setBounds(i31, measuredHeight3, drawable5.getIntrinsicWidth() + i31, this.w.getIntrinsicHeight() + measuredHeight3);
                this.w.draw(canvas);
            }
            if (this.x == null || this.m0) {
                f11 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight3 = (int) (this.x.getIntrinsicHeight() * this.I);
                int i32 = this.f0 + i24 + this.J + ((int) (-this.S)) + L;
                if ((this.n & hs.x1) == 16) {
                    e16 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i15 = this.L;
                } else {
                    e16 = k2.p1.e(this.h0, intrinsicHeight3, 2, getPaddingTop());
                    i15 = this.L;
                }
                int i33 = e16 + i15;
                f11 = 16.0f;
                this.x.setBounds(i32, i33, i32 + intrinsicWidth4, i33 + intrinsicHeight3);
                this.i0 = i32 + (intrinsicWidth4 >> 1);
                this.j0 = i33 + (intrinsicHeight3 >> 1);
                this.x.draw(canvas);
            }
            if (this.y != null && !this.m0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight4 = (int) (this.y.getIntrinsicHeight() * this.I);
                int i34 = this.f0 + i24 + this.J + ((int) (-this.S)) + L;
                if (this.x != null) {
                    i34 += ((int) (r6.getIntrinsicWidth() * this.I)) + this.J;
                }
                if ((this.n & hs.x1) == 16) {
                    e15 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i14 = this.L;
                } else {
                    e15 = k2.p1.e(this.h0, intrinsicHeight4, 2, getPaddingTop());
                    i14 = this.L;
                }
                int i35 = e15 + i14;
                this.y.setBounds(i34, i35, intrinsicWidth5 + i34, intrinsicHeight4 + i35);
                this.y.draw(canvas);
            }
        } else {
            f11 = 16.0f;
        }
        if (this.c != null) {
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.s0;
                Drawable drawable6 = this.x;
                canvas.clipRect(i24, 0, maxTextWidth - org.telegram.messenger.g0.L((drawable6 == null || (drawable6 instanceof org.telegram.ui.Components.e5) || !this.m0) ? f10 : 2.0f), getMeasuredHeight());
            }
            org.telegram.messenger.i6.n = false;
            if (this.P != null) {
                int i36 = (int) ((this.d0 + i24) - this.S);
                int i37 = this.f0;
                int i38 = (i37 / 2) + i36;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i37, this.t0);
                int i39 = i38 - (max / 2);
                this.P.setBounds(i39, 0, max + i39, getMeasuredHeight());
                this.P.draw(canvas);
            }
            if (this.d0 + i24 != 0 || this.e0 != 0 || this.S != f10) {
                canvas.save();
                canvas.translate((this.d0 + i24) - this.S, this.e0);
                this.a = ((this.d0 + i24) - this.S) + this.a;
                this.b += this.e0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.N >= 1.0f) {
                f12 = f10;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.N) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f15 = org.telegram.messenger.g0.L(this.y0 == 1 ? 0.5f : 4.0f);
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
                float f19 = -this.v0;
                float f20 = this.N;
                canvas.translate((this.w0 * f20) + (f19 * f20), f12);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e == null) {
                f13 = f12;
            } else if (this.N > f12) {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.N * 255.0f));
                float f21 = -this.v0;
                float f22 = this.N;
                float f23 = this.w0;
                float f24 = ((f22 * f23) + (f21 * f22)) - f23;
                f13 = 0.0f;
                canvas.translate(f24, 0.0f);
                this.e.draw(canvas);
                textPaint.setAlpha(alpha2);
            } else {
                f13 = 0.0f;
            }
            if (this.S != f13) {
                canvas.translate(L, f13);
                e(canvas);
            }
            if (this.d0 + i24 != 0 || this.e0 != 0 || this.S != f13) {
                canvas.restore();
            }
            if (this.x != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i40 = this.f0 + i24 + this.J + ((int) (-this.S));
                int i41 = this.n & 7;
                if (i41 == 1 || i41 == 5) {
                    i40 += this.d0;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight5 = (int) (this.x.getIntrinsicHeight() * this.I);
                if ((this.n & hs.x1) == 16) {
                    e14 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i13 = this.L;
                } else {
                    e14 = k2.p1.e(this.h0, intrinsicHeight5, 2, getPaddingTop());
                    i13 = this.L;
                }
                int i42 = e14 + i13;
                this.x.setBounds(i40, i42, i40 + intrinsicWidth6, i42 + intrinsicHeight5);
                this.i0 = i40 + (intrinsicWidth6 >> 1);
                this.j0 = i42 + (intrinsicHeight5 >> 1);
                this.x.draw(canvas);
                this.g0 = this.J + intrinsicWidth6 + this.g0;
            }
            if (this.y != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i43 = this.f0 + i24 + this.J + ((int) (-this.S));
                if (this.x != null) {
                    i43 += ((int) (r4.getIntrinsicWidth() * this.I)) + this.J;
                }
                int i44 = this.n & 7;
                if (i44 == 1 || i44 == 5) {
                    i43 += this.d0;
                }
                int intrinsicWidth7 = (int) (this.y.getIntrinsicWidth() * this.I);
                int intrinsicHeight6 = (int) (this.y.getIntrinsicHeight() * this.I);
                if ((this.n & hs.x1) == 16) {
                    e13 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i12 = this.L;
                } else {
                    e13 = k2.p1.e(this.h0, intrinsicHeight6, 2, getPaddingTop());
                    i12 = this.L;
                }
                int i45 = e13 + i12;
                this.y.setBounds(i43, i45, i43 + intrinsicWidth7, intrinsicHeight6 + i45);
                this.y.draw(canvas);
                this.g0 = this.J + intrinsicWidth7 + this.g0;
            }
            if (z11) {
                if (this.S < org.telegram.messenger.g0.L(10.0f)) {
                    this.V.setAlpha((int) ((this.S / org.telegram.messenger.g0.L(10.0f)) * 255.0f));
                } else {
                    if (this.S > (org.telegram.messenger.g0.L(f11) + this.g0) - org.telegram.messenger.g0.L(10.0f)) {
                        this.V.setAlpha((int) org.telegram.messenger.camera.q.x(this.S - ((org.telegram.messenger.g0.L(f11) + this.g0) - org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.V.setAlpha(hs.e4);
                    }
                }
                canvas.drawRect(i24, 0.0f, org.telegram.messenger.g0.L(6.0f) + i24, getMeasuredHeight(), this.V);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.s0) - org.telegram.messenger.g0.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredHeight(), this.W);
                canvas.restore();
            } else if (this.o0 && this.R && this.a0 != null) {
                canvas.save();
                m();
                if (!this.p0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.s0) - this.b0;
                    Drawable drawable7 = this.x;
                    canvas.translate(maxTextWidth2 - org.telegram.messenger.g0.L((drawable7 == null || (drawable7 instanceof org.telegram.ui.Components.e5) || !this.m0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i24, 0.0f, this.b0, getMeasuredHeight(), this.a0);
                canvas.restore();
            }
            if (!this.Q || (!this.R && this.S == 0.0f)) {
                z10 = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.T;
                if (j10 > 17) {
                    j10 = 17;
                }
                int i46 = this.U;
                if (i46 > 0) {
                    this.U = (int) (i46 - j10);
                    z10 = true;
                } else {
                    int L2 = org.telegram.messenger.g0.L(f11) + this.g0;
                    if (this.S < org.telegram.messenger.g0.L(100.0f)) {
                        f14 = a1.g.A(this.S, org.telegram.messenger.g0.L(100.0f), 20.0f, 30.0f);
                        z10 = true;
                    } else if (this.S >= L2 - org.telegram.messenger.g0.L(100.0f)) {
                        z10 = true;
                        f14 = org.telegram.messenger.camera.q.v(this.S - (L2 - org.telegram.messenger.g0.L(100.0f)), org.telegram.messenger.g0.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z10 = true;
                        f14 = 50.0f;
                    }
                    float L3 = ((j10 / 1000.0f) * org.telegram.messenger.g0.L(f14)) + this.S;
                    this.S = L3;
                    this.T = elapsedRealtime;
                    if (L3 > L2) {
                        this.S = 0.0f;
                        this.U = 500;
                    }
                    b();
                }
                invalidate();
            }
            org.telegram.messenger.i6.n = z10;
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.w;
        if (drawable8 != null && this.l0) {
            int intrinsicWidth8 = drawable8.getIntrinsicWidth();
            int intrinsicHeight7 = this.w.getIntrinsicHeight();
            if ((this.n & hs.x1) == 16) {
                e12 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i11 = this.K;
            } else {
                e12 = k2.p1.e(this.h0, intrinsicHeight7, 2, getPaddingTop());
                i11 = this.K;
            }
            int i47 = e12 + i11;
            this.w.setBounds(0, i47, intrinsicWidth8, intrinsicHeight7 + i47);
            this.w.draw(canvas);
        }
        if (this.x != null && this.m0) {
            int i48 = this.f0 + i24 + this.J;
            float f25 = this.S;
            int min = Math.min(i48 + (f25 == 0.0f ? -L : (int) (-f25)) + L, (getMaxTextWidth() - this.s0) + this.J);
            int intrinsicWidth9 = (int) (this.x.getIntrinsicWidth() * this.I);
            int intrinsicHeight8 = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & hs.x1) == 16) {
                e11 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i10 = this.L;
            } else {
                e11 = k2.p1.e(this.h0, intrinsicHeight8, 2, getPaddingTop());
                i10 = this.L;
            }
            int i49 = e11 + i10;
            this.x.setBounds(min, i49, min + intrinsicWidth9, i49 + intrinsicHeight8);
            this.i0 = min + (intrinsicWidth9 >> 1);
            this.j0 = i49 + (intrinsicHeight8 >> 1);
            this.x.draw(canvas);
        }
        if (this.y == null || !this.m0) {
            return;
        }
        int i50 = i24 + this.f0 + this.J;
        float f26 = this.S;
        int min2 = Math.min(i50 + (f26 == 0.0f ? -L : (int) (-f26)) + L, (getMaxTextWidth() - this.s0) + this.J);
        if (this.x != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.I)) + this.J;
        }
        int intrinsicWidth10 = (int) (this.y.getIntrinsicWidth() * this.I);
        int intrinsicHeight9 = (int) (this.y.getIntrinsicHeight() * this.I);
        if ((this.n & hs.x1) == 16) {
            e10 = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i3 = this.L;
        } else {
            e10 = k2.p1.e(this.h0, intrinsicHeight9, 2, getPaddingTop());
            i3 = this.L;
        }
        int i51 = e10 + i3;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.k0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.c0;
        int i12 = org.telegram.messenger.g0.q.x;
        if (i11 != i12) {
            this.c0 = i12;
            this.S = 0.0f;
            this.U = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.x0) - ((!this.l0 || (drawable6 = this.w) == null) ? 0 : drawable6.getIntrinsicWidth() + this.J)) - ((!this.m0 || (drawable5 = this.x) == null) ? 0 : drawable5.getIntrinsicWidth() + this.J)) - ((!this.m0 || (drawable4 = this.y) == null) ? 0 : drawable4.getIntrinsicWidth() + this.J));
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.h0;
        }
        if (this.O) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.f0 + this.x0 + ((!this.l0 || (drawable3 = this.w) == null) ? 0 : drawable3.getIntrinsicWidth() + this.J) + ((!this.m0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.J) + ((!this.m0 || (drawable = this.y) == null) ? 0 : drawable.getIntrinsicWidth() + this.J)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & hs.x1) == 16) {
            this.e0 = k2.p1.e((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.h0, 2, getPaddingTop());
        } else {
            this.e0 = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 != null && this.x != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(this.i0 - org.telegram.messenger.g0.L(16.0f), this.j0 - org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f) + this.i0, org.telegram.messenger.g0.L(16.0f) + this.j0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.F0 = true;
                this.G0 = motionEvent.getX();
                this.H0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.x;
                if (obj instanceof j5) {
                    ((mw0) ((j5) obj)).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.F0) {
                if (Math.abs(motionEvent.getX() - this.G0) >= org.telegram.messenger.g0.e || Math.abs(motionEvent.getY() - this.H0) >= org.telegram.messenger.g0.e) {
                    this.F0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.x;
                    if (obj2 instanceof j5) {
                        ((mw0) ((j5) obj2)).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.F0 && motionEvent.getAction() == 1) {
                    this.E0.onClick(this);
                    Object obj3 = this.x;
                    if (obj3 instanceof j5) {
                        ((mw0) ((j5) obj3)).f.c(false);
                    }
                }
                this.F0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.F0;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.M0 = alignment;
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.P = drawable;
        }
    }

    public void setBuildFullLayout(boolean z10) {
        this.M = z10;
    }

    public void setCanHideRightDrawable(boolean z10) {
        this.C0 = z10;
    }

    public void setDrawablePadding(int i3) {
        if (this.J == i3) {
            return;
        }
        this.J = i3;
        f();
    }

    public void setEllipsizeByGradient(int i3) {
        if (!this.Q) {
            this.o0 = true;
            this.q0 = null;
            m();
            b();
        }
        this.r0 = i3;
        m();
    }

    public void setEmojiCacheType(int i3) {
        if (i3 != this.J0) {
            org.telegram.ui.Components.p5.release(this, this.I0);
            this.J0 = i3;
            if (this.L0) {
                this.I0 = org.telegram.ui.Components.p5.update(i3, this, this.I0, this.c);
            }
        }
    }

    public void setEmojiColor(int i3) {
        this.K0 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f10) {
        this.N = f10;
        invalidate();
    }

    public void setFullTextMaxLines(int i3) {
        this.y0 = i3;
    }

    public void setGravity(int i3) {
        this.n = i3;
    }

    public void setLeftDrawable(int i3) {
        setLeftDrawable(i3 == 0 ? null : getContext().getResources().getDrawable(i3));
    }

    public void setLeftDrawableOutside(boolean z10) {
        this.l0 = z10;
    }

    public void setLeftDrawableTopPadding(int i3) {
        this.K = i3;
    }

    public void setLinkTextColor(int i3) {
        this.h.linkColor = i3;
        invalidate();
    }

    public void setMaxLines(int i3) {
        this.r = i3;
    }

    public void setMinWidth(int i3) {
        this.t0 = i3;
    }

    public void setMinusWidth(int i3) {
        if (i3 == this.x0) {
            return;
        }
        this.x0 = i3;
        f();
    }

    public void setRightDrawable(int i3) {
        i(i3 == 0 ? null : getContext().getResources().getDrawable(i3));
    }

    public void setRightDrawableInside(boolean z10) {
        this.n0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.E0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z10) {
        this.m0 = z10;
    }

    public void setRightDrawableScale(float f10) {
        this.I = f10;
    }

    public void setRightDrawableTopPadding(int i3) {
        this.L = i3;
    }

    public void setRightPadding(int i3) {
        if (this.s0 != i3) {
            this.s0 = i3;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0;
            Drawable drawable = this.w;
            if (drawable != null && !this.l0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.J;
            }
            int i10 = 0;
            if (!this.n0) {
                if (this.x != null && !this.m0) {
                    i10 = (int) (r0.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i10) - this.J;
                }
                if (this.y != null && !this.m0) {
                    i10 = (int) (r0.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i10) - this.J;
                }
            }
            if (this.F != null && this.E != null) {
                int indexOf = this.s.toString().indexOf(this.F);
                this.G = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.E.getIntrinsicWidth()) - this.J;
                }
            }
            if (this.C0 && i10 != 0 && !this.m0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    maxTextWidth = maxTextWidth + i10 + this.J;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i3) {
        k6.C1(i3, this.x);
        k6.C1(i3, this.w);
    }

    public void setTextColor(int i3) {
        this.h.setColor(i3);
        invalidate();
    }

    public void setTextSize(int i3) {
        setTextSizePx(org.telegram.messenger.g0.L(i3));
    }

    public void setTextSizePx(int i3) {
        float f10 = i3;
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
        this.O = z10;
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

    public void setEllipsizeByGradient(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.o0 = z10;
        this.q0 = null;
        m();
        b();
    }
}
