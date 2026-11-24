// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class jia extends View implements Drawable.Callback {
    public final Stack A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public bya E;
    public View.OnClickListener E0;
    public String F;
    public boolean F0;
    public int G;
    public float G0;
    public float H;
    public float H0;
    public float I;
    public cm I0;
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

    public jia(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.I = 1.0f;
        this.J = gl.L(4.0f);
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

    public final void a(int i) {
        int i2;
        int i3;
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
            int i4 = this.n & 7;
            if (i4 == 1) {
                i2 = ((i - this.f0) / 2) - ((int) this.c.getLineLeft(0));
                this.d0 = i2;
            } else if (i4 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    i2 = -((int) staticLayout4.getLineLeft(0));
                    this.d0 = i2;
                } else {
                    i2 = -((int) this.c.getLineLeft(0));
                    this.d0 = i2;
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    i2 = (int) (i - staticLayout5.getLineWidth(0));
                    this.d0 = i2;
                } else {
                    i2 = i - this.f0;
                    this.d0 = i2;
                }
            } else {
                i2 = -gl.L(8.0f);
                this.d0 = i2;
            }
            this.d0 = getPaddingLeft() + i2;
            if (this.n0) {
                i3 = (this.x == null || this.m0) ? 0 : (int) (r0.getIntrinsicWidth() * this.I);
                if (this.y != null && !this.m0) {
                    i3 += (int) (r4.getIntrinsicWidth() * this.I);
                }
            } else {
                i3 = 0;
            }
            this.R = this.f0 + i3 > i - this.s0;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.u0 > 0) {
                this.w0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i5 = this.G;
        if (i5 >= 0) {
            this.H = this.c.getPrimaryHorizontal(i5);
        } else {
            this.H = 0.0f;
        }
    }

    public final void b() {
        int i = ((!this.Q || (!this.R && this.S == 0.0f)) && !this.o0) ? 0 : 2;
        if (getLayerType() != i) {
            setLayerType(i, null);
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Rect bounds = ((qla) obj).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Stack stack = this.A0;
        ArrayList arrayList = this.z0;
        CharSequence charSequence = this.s;
        this.G = -1;
        this.D0 = false;
        byte b = 1;
        if (charSequence != null) {
            try {
                Drawable drawable = this.w;
                if (drawable == null || this.l0) {
                    i2 = i;
                } else {
                    drawable.getIntrinsicWidth();
                    i2 = (i - this.w.getIntrinsicWidth()) - this.J;
                }
                if (this.n0) {
                    i3 = 0;
                } else {
                    if (this.x == null || this.m0) {
                        i3 = 0;
                    } else {
                        i3 = (int) (r9.getIntrinsicWidth() * this.I);
                        i2 = (i2 - i3) - this.J;
                    }
                    if (this.y != null && !this.m0) {
                        i3 += (int) (r10.getIntrinsicWidth() * this.I);
                        i2 = (i2 - i3) - this.J;
                    }
                }
                CharSequence charSequence2 = charSequence;
                if (this.F != null) {
                    charSequence2 = charSequence;
                    if (this.E != null) {
                        int indexOf = charSequence.toString().indexOf(this.F);
                        this.G = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                            se3 se3Var = new se3(this.E.getIntrinsicWidth());
                            int i6 = this.G;
                            valueOf.setSpan(se3Var, i6, this.F.length() + i6, 0);
                            charSequence2 = valueOf;
                        } else {
                            i2 = (i2 - this.E.getIntrinsicWidth()) - this.J;
                            charSequence2 = charSequence;
                        }
                    }
                }
                CharSequence charSequence3 = charSequence2;
                boolean z = this.C0;
                TextPaint textPaint = this.h;
                if (z && i3 != 0 && !this.m0 && !charSequence3.equals(TextUtils.ellipsize(charSequence3, textPaint, i2, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    i2 = i2 + i3 + this.J;
                }
                int i7 = i2;
                if (this.M) {
                    CharSequence ellipsize = !this.o0 ? TextUtils.ellipsize(charSequence3, textPaint, i7, TextUtils.TruncateAt.END) : charSequence3;
                    if (this.o0 || ellipsize.equals(charSequence3)) {
                        i5 = i7;
                        CharSequence charSequence4 = ellipsize;
                        this.c = new StaticLayout(charSequence4, 0, charSequence4.length(), textPaint, (this.Q || this.o0) ? gl.L(2000.0f) : i5 + gl.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                        this.e = null;
                        this.f = null;
                        this.d = null;
                    } else {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c = lwa.c(charSequence3, textPaint, i7, alignment, 0.0f, truncateAt, i7, this.y0, false);
                        i5 = i7;
                        this.e = c;
                        if (c != null) {
                            int lineEnd = c.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence3.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
                            valueOf2.setSpan(new lx2(b), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.d = new StaticLayout(ellipsize, 0, ellipsize.length(), textPaint, this.Q ? gl.L(2000.0f) : i5 + gl.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), textPaint, this.Q ? gl.L(2000.0f) : i5 + gl.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                subSequence2 = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence5 = subSequence2;
                            this.f = new StaticLayout(charSequence5, 0, charSequence5.length(), textPaint, this.Q ? gl.L(2000.0f) : i5 + gl.L(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.e = lwa.c(valueOf2, textPaint, i5 + gl.L(8.0f) + this.u0, getAlignment(), 0.0f, truncateAt, i5 + this.u0, this.y0, false);
                        }
                    }
                    i4 = i5;
                } else if (this.r > 1) {
                    StaticLayout c2 = lwa.c(charSequence3, textPaint, i7, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i7, this.r, false);
                    i4 = i7;
                    this.c = c2;
                } else {
                    i4 = i7;
                    CharSequence ellipsize2 = (this.Q || this.o0) ? charSequence3 : TextUtils.ellipsize(charSequence3, textPaint, i4, TextUtils.TruncateAt.END);
                    this.c = new StaticLayout(ellipsize2, 0, ellipsize2.length(), textPaint, (this.Q || this.o0) ? gl.L(2000.0f) : gl.L(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    qla.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i4);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.f0 = 0;
            this.h0 = 0;
        }
        gm.release(this, this.I0);
        if (this.L0) {
            this.I0 = gm.update(this.J0, this, this.I0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        float f = this.N;
        int i = 0;
        ArrayList arrayList = this.z0;
        if (f <= 0.0f || this.v0 == 0) {
            canvas.save();
            c(canvas);
            cm cmVar = this.I0;
            if (cmVar != null) {
                cmVar.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            gm.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qla) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f2 = -this.v0;
        float f3 = this.N;
        canvas.translate((this.w0 * f3) + (f2 * f3), 0.0f);
        float f4 = this.a;
        float f5 = -this.v0;
        float f6 = this.N;
        this.a = ir2.i(this.w0, f6, f5 * f6, f4);
        canvas.save();
        c(canvas);
        cm cmVar2 = this.I0;
        if (cmVar2 != null) {
            cmVar2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        gm.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((qla) obj2).draw(canvas);
        }
        canvas.restore();
    }

    public final boolean f() {
        if (!this.k0 || getMeasuredHeight() == 0 || this.M) {
            requestLayout();
            return true;
        }
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0);
        if ((this.n & kk7.w1) == 16) {
            this.e0 = (getMeasuredHeight() - this.h0) / 2;
            return true;
        }
        this.e0 = getPaddingTop();
        return true;
    }

    public final void g(bya byaVar, String str) {
        bya byaVar2 = this.E;
        if (byaVar2 == byaVar) {
            return;
        }
        if (byaVar2 != null) {
            byaVar2.setCallback(null);
        }
        this.E = byaVar;
        if (byaVar != null) {
            byaVar.setCallback(this);
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
        return getExactWidth() + (this.w != null ? r1.getIntrinsicWidth() : 0) + (this.x != null ? r1.getIntrinsicWidth() : 0) + (this.y != null ? r3.getIntrinsicWidth() : 0);
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
        int i = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.m0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.J);
        if (this.m0 && (drawable = this.y) != null) {
            i = drawable.getIntrinsicWidth() + this.J;
        }
        return measuredWidth - i;
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
        int i = 0;
        if (this.c == null) {
            return 0;
        }
        Drawable drawable = this.w;
        if (drawable != null && (this.n & 7) == 3) {
            i = this.J + drawable.getIntrinsicWidth();
        }
        bya byaVar = this.E;
        if (byaVar != null && this.G < 0 && (this.n & 7) == 3) {
            i += byaVar.getIntrinsicWidth() + this.J;
        }
        return ((int) getX()) + this.d0 + i;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i = this.f0;
        if (this.n0) {
            r2 = (this.y != null ? (int) (r3.getIntrinsicWidth() * this.I) : 0) + (this.x != null ? (int) (r1.getIntrinsicWidth() * this.I) : 0);
        }
        return i + r2;
    }

    public final void h(int i, int i2) {
        if (this.u0 == i && this.v0 == i2) {
            return;
        }
        this.u0 = i;
        this.v0 = i2;
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
        bya byaVar = this.E;
        if (drawable == byaVar) {
            invalidate(byaVar.getBounds());
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

    public boolean l(CharSequence charSequence, boolean z) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z && charSequence2 != null && charSequence2.equals(charSequence)) {
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
            paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.V;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.W = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, gl.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.W.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.q0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.a0 != null && this.b0 == gl.L(this.r0) && this.p0 == booleanValue) && this.o0) {
            Paint paint4 = this.a0;
            if (paint4 == null) {
                paint4 = new Paint();
                this.a0 = paint4;
            }
            this.p0 = booleanValue;
            if (booleanValue) {
                int L = gl.L(this.r0);
                this.b0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                int L2 = gl.L(this.r0);
                this.b0 = L2;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.a0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L0 = true;
        this.I0 = gm.update(this.J0, this, this.I0, this.c);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L0 = false;
        gm.release(this, this.I0);
        this.k0 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f;
        float f2;
        int g;
        int i;
        int g2;
        int i2;
        int g3;
        int i3;
        float f3;
        boolean z;
        float f4;
        int g4;
        int i4;
        int g5;
        int i5;
        float f5;
        int g6;
        int i6;
        int g7;
        int i7;
        int g8;
        int i8;
        int g9;
        int i9;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        boolean z2 = this.Q && (this.R || this.S != 0.0f);
        this.g0 = this.f0;
        Drawable drawable = this.w;
        if (drawable == null || this.l0) {
            intrinsicWidth = (!this.l0 || drawable == null) ? 0 : this.J + drawable.getIntrinsicWidth();
        } else {
            int i10 = (int) (-this.S);
            int i11 = this.n;
            if ((i11 & 7) == 1) {
                i10 += this.d0;
            }
            int measuredHeight = (i11 & kk7.w1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
            Drawable drawable2 = this.w;
            drawable2.setBounds(i10, measuredHeight, drawable2.getIntrinsicWidth() + i10, this.w.getIntrinsicHeight() + measuredHeight);
            this.w.draw(canvas);
            int i12 = this.n & 7;
            intrinsicWidth = (i12 == 3 || i12 == 1) ? this.w.getIntrinsicWidth() + this.J : 0;
            this.g0 = this.w.getIntrinsicWidth() + this.J + this.g0;
        }
        bya byaVar = this.E;
        if (byaVar != null && this.F != null) {
            int i13 = (int) ((-this.S) + this.H);
            int i14 = this.n;
            if ((i14 & 7) == 1) {
                i13 += this.d0;
            }
            int measuredHeight2 = (i14 & kk7.w1) == 16 ? ((getMeasuredHeight() - this.E.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - byaVar.getIntrinsicHeight()) / 2);
            bya byaVar2 = this.E;
            byaVar2.setBounds(i13, measuredHeight2, byaVar2.getIntrinsicWidth() + i13, this.E.getIntrinsicHeight() + measuredHeight2);
            this.E.draw(canvas);
            if (this.G < 0) {
                int i15 = this.n & 7;
                if (i15 == 3 || i15 == 1) {
                    intrinsicWidth += this.E.getIntrinsicWidth() + this.J;
                }
                this.g0 = this.E.getIntrinsicWidth() + this.J + this.g0;
            }
        }
        int i16 = intrinsicWidth;
        if (this.x == null || this.D0 || this.I <= 0.0f || this.m0 || this.n0) {
            f = 0.0f;
        } else {
            int i17 = this.f0 + i16 + this.J + ((int) (-this.S));
            int i18 = this.n & 7;
            if (i18 == 1 || i18 == 5) {
                i17 += this.d0;
            }
            int intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.I);
            int intrinsicHeight = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & kk7.w1) == 16) {
                g9 = (getMeasuredHeight() - intrinsicHeight) / 2;
                i9 = this.L;
            } else {
                g9 = ug8.g(this.h0, intrinsicHeight, 2, getPaddingTop());
                i9 = this.L;
            }
            int i19 = g9 + i9;
            f = 0.0f;
            this.x.setBounds(i17, i19, i17 + intrinsicWidth2, i19 + intrinsicHeight);
            this.i0 = i17 + (intrinsicWidth2 >> 1);
            this.j0 = i19 + (intrinsicHeight >> 1);
            this.x.draw(canvas);
            this.g0 = this.J + intrinsicWidth2 + this.g0;
        }
        if (this.y != null && !this.D0 && this.I > f && !this.m0 && !this.n0) {
            int i20 = this.f0 + i16 + this.J + ((int) (-this.S));
            if (this.x != null) {
                i20 += ((int) (r5.getIntrinsicWidth() * this.I)) + this.J;
            }
            int i21 = this.n & 7;
            if (i21 == 1 || i21 == 5) {
                i20 += this.d0;
            }
            int intrinsicWidth3 = (int) (this.y.getIntrinsicWidth() * this.I);
            int intrinsicHeight2 = (int) (this.y.getIntrinsicHeight() * this.I);
            if ((this.n & kk7.w1) == 16) {
                g8 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i8 = this.L;
            } else {
                g8 = ug8.g(this.h0, intrinsicHeight2, 2, getPaddingTop());
                i8 = this.L;
            }
            int i22 = g8 + i8;
            this.y.setBounds(i20, i22, i20 + intrinsicWidth3, intrinsicHeight2 + i22);
            this.y.draw(canvas);
            this.g0 = this.J + intrinsicWidth3 + this.g0;
        }
        int L = gl.L(16.0f) + this.g0;
        float f6 = this.S;
        if (f6 != f) {
            if (this.w != null && !this.l0) {
                int i23 = ((int) (-f6)) + L;
                int measuredHeight3 = (this.n & kk7.w1) == 16 ? ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K : this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
                Drawable drawable3 = this.w;
                drawable3.setBounds(i23, measuredHeight3, drawable3.getIntrinsicWidth() + i23, this.w.getIntrinsicHeight() + measuredHeight3);
                this.w.draw(canvas);
            }
            if (this.x == null || this.m0) {
                f2 = 16.0f;
            } else {
                int intrinsicWidth4 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight3 = (int) (this.x.getIntrinsicHeight() * this.I);
                int i24 = this.f0 + i16 + this.J + ((int) (-this.S)) + L;
                if ((this.n & kk7.w1) == 16) {
                    g7 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                    i7 = this.L;
                } else {
                    g7 = ug8.g(this.h0, intrinsicHeight3, 2, getPaddingTop());
                    i7 = this.L;
                }
                int i25 = g7 + i7;
                f2 = 16.0f;
                this.x.setBounds(i24, i25, i24 + intrinsicWidth4, i25 + intrinsicHeight3);
                this.i0 = i24 + (intrinsicWidth4 >> 1);
                this.j0 = i25 + (intrinsicHeight3 >> 1);
                this.x.draw(canvas);
            }
            if (this.y != null && !this.m0) {
                int intrinsicWidth5 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight4 = (int) (this.y.getIntrinsicHeight() * this.I);
                int i26 = this.f0 + i16 + this.J + ((int) (-this.S)) + L;
                if (this.x != null) {
                    i26 += ((int) (r6.getIntrinsicWidth() * this.I)) + this.J;
                }
                if ((this.n & kk7.w1) == 16) {
                    g6 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i6 = this.L;
                } else {
                    g6 = ug8.g(this.h0, intrinsicHeight4, 2, getPaddingTop());
                    i6 = this.L;
                }
                int i27 = g6 + i6;
                this.y.setBounds(i26, i27, intrinsicWidth5 + i26, intrinsicHeight4 + i27);
                this.y.draw(canvas);
            }
        } else {
            f2 = 16.0f;
        }
        if (this.c != null) {
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.s0;
                Drawable drawable4 = this.x;
                canvas.clipRect(i16, 0, maxTextWidth - gl.L((drawable4 == null || (drawable4 instanceof tl) || !this.m0) ? f : 2.0f), getMeasuredHeight());
            }
            vu3.n = false;
            if (this.P != null) {
                int i28 = (int) ((this.d0 + i16) - this.S);
                int i29 = this.f0;
                int i30 = (i29 / 2) + i28;
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i29, this.t0);
                int i31 = i30 - (max / 2);
                this.P.setBounds(i31, 0, max + i31, getMeasuredHeight());
                this.P.draw(canvas);
            }
            if (this.d0 + i16 != 0 || this.e0 != 0 || this.S != f) {
                canvas.save();
                canvas.translate((this.d0 + i16) - this.S, this.e0);
                this.a = ((this.d0 + i16) - this.S) + this.a;
                this.b += this.e0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout == null || this.N >= 1.0f) {
                f3 = f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.N) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    f5 = gl.L(this.y0 == 1 ? 0.5f : 4.0f);
                } else {
                    f5 = f;
                }
                float lineLeft = this.c.getLineLeft(0);
                StaticLayout staticLayout2 = this.c;
                if (lineLeft != f) {
                    f3 = f;
                    canvas.translate((-staticLayout2.getLineWidth(0)) + f5, f3);
                } else {
                    f3 = f;
                    canvas.translate(staticLayout2.getLineWidth(0) - f5, f3);
                }
                float f7 = -this.v0;
                float f8 = this.N;
                canvas.translate((this.w0 * f8) + (f7 * f8), f3);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.e != null) {
                if (this.N > f3) {
                    int alpha2 = textPaint.getAlpha();
                    textPaint.setAlpha((int) (this.N * 255.0f));
                    float f9 = -this.v0;
                    float f10 = this.N;
                    float f11 = this.w0;
                    f3 = 0.0f;
                    canvas.translate(((f10 * f11) + (f9 * f10)) - f11, 0.0f);
                    this.e.draw(canvas);
                    textPaint.setAlpha(alpha2);
                } else {
                    f3 = 0.0f;
                }
            }
            if (this.S != f3) {
                canvas.translate(L, f3);
                e(canvas);
            }
            if (this.d0 + i16 != 0 || this.e0 != 0 || this.S != f3) {
                canvas.restore();
            }
            if (this.x != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i32 = this.f0 + i16 + this.J + ((int) (-this.S));
                int i33 = this.n & 7;
                if (i33 == 1 || i33 == 5) {
                    i32 += this.d0;
                }
                int intrinsicWidth6 = (int) (r3.getIntrinsicWidth() * this.I);
                int intrinsicHeight5 = (int) (this.x.getIntrinsicHeight() * this.I);
                if ((this.n & kk7.w1) == 16) {
                    g5 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i5 = this.L;
                } else {
                    g5 = ug8.g(this.h0, intrinsicHeight5, 2, getPaddingTop());
                    i5 = this.L;
                }
                int i34 = g5 + i5;
                this.x.setBounds(i32, i34, i32 + intrinsicWidth6, i34 + intrinsicHeight5);
                this.i0 = i32 + (intrinsicWidth6 >> 1);
                this.j0 = i34 + (intrinsicHeight5 >> 1);
                this.x.draw(canvas);
                this.g0 = this.J + intrinsicWidth6 + this.g0;
            }
            if (this.y != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i35 = this.f0 + i16 + this.J + ((int) (-this.S));
                if (this.x != null) {
                    i35 += ((int) (r4.getIntrinsicWidth() * this.I)) + this.J;
                }
                int i36 = this.n & 7;
                if (i36 == 1 || i36 == 5) {
                    i35 += this.d0;
                }
                int intrinsicWidth7 = (int) (this.y.getIntrinsicWidth() * this.I);
                int intrinsicHeight6 = (int) (this.y.getIntrinsicHeight() * this.I);
                if ((this.n & kk7.w1) == 16) {
                    g4 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i4 = this.L;
                } else {
                    g4 = ug8.g(this.h0, intrinsicHeight6, 2, getPaddingTop());
                    i4 = this.L;
                }
                int i37 = g4 + i4;
                this.y.setBounds(i35, i37, i35 + intrinsicWidth7, intrinsicHeight6 + i37);
                this.y.draw(canvas);
                this.g0 = this.J + intrinsicWidth7 + this.g0;
            }
            if (z2) {
                if (this.S < gl.L(10.0f)) {
                    this.V.setAlpha((int) ((this.S / gl.L(10.0f)) * 255.0f));
                } else {
                    if (this.S > (gl.L(f2) + this.g0) - gl.L(10.0f)) {
                        this.V.setAlpha((int) de9.e(this.S - ((gl.L(f2) + this.g0) - gl.L(10.0f)), gl.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.V.setAlpha(kk7.d4);
                    }
                }
                canvas.drawRect(i16, 0.0f, gl.L(6.0f) + i16, getMeasuredHeight(), this.V);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.s0) - gl.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, gl.L(6.0f), getMeasuredHeight(), this.W);
                canvas.restore();
            } else if (this.o0 && this.R && this.a0 != null) {
                canvas.save();
                m();
                if (!this.p0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.s0) - this.b0;
                    Drawable drawable5 = this.x;
                    canvas.translate(maxTextWidth2 - gl.L((drawable5 == null || (drawable5 instanceof tl) || !this.m0) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i16, 0.0f, this.b0, getMeasuredHeight(), this.a0);
                canvas.restore();
            }
            if (!this.Q || (!this.R && this.S == 0.0f)) {
                z = true;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.T;
                if (j > 17) {
                    j = 17;
                }
                int i38 = this.U;
                if (i38 > 0) {
                    this.U = (int) (i38 - j);
                    z = true;
                } else {
                    int L2 = gl.L(f2) + this.g0;
                    float f12 = this.S;
                    float L3 = gl.L(100.0f);
                    float f13 = this.S;
                    if (f12 < L3) {
                        f4 = b00.A(f13, gl.L(100.0f), 20.0f, 30.0f);
                        z = true;
                    } else if (f13 >= L2 - gl.L(100.0f)) {
                        z = true;
                        f4 = de9.x(this.S - (L2 - gl.L(100.0f)), gl.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z = true;
                        f4 = 50.0f;
                    }
                    float L4 = ((j / 1000.0f) * gl.L(f4)) + this.S;
                    this.S = L4;
                    this.T = elapsedRealtime;
                    if (L4 > L2) {
                        this.S = 0.0f;
                        this.U = 500;
                    }
                    b();
                }
                invalidate();
            }
            vu3.n = z;
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable6 = this.w;
        if (drawable6 != null && this.l0) {
            int intrinsicWidth8 = drawable6.getIntrinsicWidth();
            int intrinsicHeight7 = this.w.getIntrinsicHeight();
            if ((this.n & kk7.w1) == 16) {
                g3 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                i3 = this.K;
            } else {
                g3 = ug8.g(this.h0, intrinsicHeight7, 2, getPaddingTop());
                i3 = this.K;
            }
            int i39 = g3 + i3;
            this.w.setBounds(0, i39, intrinsicWidth8, intrinsicHeight7 + i39);
            this.w.draw(canvas);
        }
        if (this.x != null && this.m0) {
            int i40 = this.f0 + i16 + this.J;
            float f14 = this.S;
            int min = Math.min(i40 + (f14 == 0.0f ? -L : (int) (-f14)) + L, (getMaxTextWidth() - this.s0) + this.J);
            int intrinsicWidth9 = (int) (this.x.getIntrinsicWidth() * this.I);
            int intrinsicHeight8 = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & kk7.w1) == 16) {
                g2 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i2 = this.L;
            } else {
                g2 = ug8.g(this.h0, intrinsicHeight8, 2, getPaddingTop());
                i2 = this.L;
            }
            int i41 = g2 + i2;
            this.x.setBounds(min, i41, min + intrinsicWidth9, i41 + intrinsicHeight8);
            this.i0 = min + (intrinsicWidth9 >> 1);
            this.j0 = i41 + (intrinsicHeight8 >> 1);
            this.x.draw(canvas);
        }
        if (this.y == null || !this.m0) {
            return;
        }
        int i42 = i16 + this.f0 + this.J;
        float f15 = this.S;
        int min2 = Math.min(i42 + (f15 == 0.0f ? -L : (int) (-f15)) + L, (getMaxTextWidth() - this.s0) + this.J);
        if (this.x != null) {
            min2 += ((int) (r3.getIntrinsicWidth() * this.I)) + this.J;
        }
        int intrinsicWidth10 = (int) (this.y.getIntrinsicWidth() * this.I);
        int intrinsicHeight9 = (int) (this.y.getIntrinsicHeight() * this.I);
        if ((this.n & kk7.w1) == 16) {
            g = (getMeasuredHeight() - intrinsicHeight9) / 2;
            i = this.L;
        } else {
            g = ug8.g(this.h0, intrinsicHeight9, 2, getPaddingTop());
            i = this.L;
        }
        int i43 = g + i;
        this.y.setBounds(min2, i43, intrinsicWidth10 + min2, intrinsicHeight9 + i43);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.c0;
        int i4 = gl.q.x;
        if (i3 != i4) {
            this.c0 = i4;
            this.S = 0.0f;
            this.U = 500;
            b();
        }
        d((((((size - getPaddingLeft()) - getPaddingRight()) - this.x0) - ((!this.l0 || (drawable6 = this.w) == null) ? 0 : drawable6.getIntrinsicWidth() + this.J)) - ((!this.m0 || (drawable5 = this.x) == null) ? 0 : drawable5.getIntrinsicWidth() + this.J)) - ((!this.m0 || (drawable4 = this.y) == null) ? 0 : drawable4.getIntrinsicWidth() + this.J));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.h0;
        }
        if (this.O) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.f0 + this.x0 + ((!this.l0 || (drawable3 = this.w) == null) ? 0 : drawable3.getIntrinsicWidth() + this.J) + ((!this.m0 || (drawable2 = this.x) == null) ? 0 : drawable2.getIntrinsicWidth() + this.J) + ((!this.m0 || (drawable = this.y) == null) ? 0 : drawable.getIntrinsicWidth() + this.J)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & kk7.w1) == 16) {
            this.e0 = ug8.g((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.h0, 2, getPaddingTop());
        } else {
            this.e0 = getPaddingTop();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 != null && this.x != null) {
            RectF rectF = gl.P;
            rectF.set(this.i0 - gl.L(16.0f), this.j0 - gl.L(16.0f), gl.L(16.0f) + this.i0, gl.L(16.0f) + this.j0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.F0 = true;
                this.G0 = motionEvent.getX();
                this.H0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.x;
                if (drawable instanceof uo8) {
                    ((uo8) drawable).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.F0) {
                if (Math.abs(motionEvent.getX() - this.G0) >= gl.e || Math.abs(motionEvent.getY() - this.H0) >= gl.e) {
                    this.F0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.x;
                    if (drawable2 instanceof uo8) {
                        ((uo8) drawable2).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.F0 && motionEvent.getAction() == 1) {
                    this.E0.onClick(this);
                    Drawable drawable3 = this.x;
                    if (drawable3 instanceof uo8) {
                        ((uo8) drawable3).f.c(false);
                    }
                }
                this.F0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.F0;
    }

    public final void p(int i, float f, float f2, y74 y74Var) {
        invalidate();
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

    public void setBuildFullLayout(boolean z) {
        this.M = z;
    }

    public void setCanHideRightDrawable(boolean z) {
        this.C0 = z;
    }

    public void setDrawablePadding(int i) {
        if (this.J == i) {
            return;
        }
        this.J = i;
        f();
    }

    public void setEllipsizeByGradient(int i) {
        if (!this.Q) {
            this.o0 = true;
            this.q0 = null;
            m();
            b();
        }
        this.r0 = i;
        m();
    }

    public void setEmojiCacheType(int i) {
        if (i != this.J0) {
            gm.release(this, this.I0);
            this.J0 = i;
            if (this.L0) {
                this.I0 = gm.update(i, this, this.I0, this.c);
            }
        }
    }

    public void setEmojiColor(int i) {
        this.K0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f) {
        this.N = f;
        invalidate();
    }

    public void setFullTextMaxLines(int i) {
        this.y0 = i;
    }

    public void setGravity(int i) {
        this.n = i;
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

    public void setLeftDrawableOutside(boolean z) {
        this.l0 = z;
    }

    public void setLeftDrawableTopPadding(int i) {
        this.K = i;
    }

    public void setLinkTextColor(int i) {
        this.h.linkColor = i;
        invalidate();
    }

    public void setMaxLines(int i) {
        this.r = i;
    }

    public void setMinWidth(int i) {
        this.t0 = i;
    }

    public void setMinusWidth(int i) {
        if (i == this.x0) {
            return;
        }
        this.x0 = i;
        f();
    }

    public void setRightDrawable(int i) {
        i(i == 0 ? null : getContext().getResources().getDrawable(i));
    }

    public void setRightDrawableInside(boolean z) {
        this.n0 = z;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.E0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z) {
        this.m0 = z;
    }

    public void setRightDrawableScale(float f) {
        this.I = f;
    }

    public void setRightDrawableTopPadding(int i) {
        this.L = i;
    }

    public void setRightPadding(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0;
            Drawable drawable = this.w;
            if (drawable != null && !this.l0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.J;
            }
            int i2 = 0;
            if (!this.n0) {
                if (this.x != null && !this.m0) {
                    i2 = (int) (r0.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i2) - this.J;
                }
                if (this.y != null && !this.m0) {
                    i2 = (int) (r0.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i2) - this.J;
                }
            }
            if (this.F != null && this.E != null) {
                int indexOf = this.s.toString().indexOf(this.F);
                this.G = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.E.getIntrinsicWidth()) - this.J;
                }
            }
            if (this.C0 && i2 != 0 && !this.m0) {
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    maxTextWidth = maxTextWidth + i2 + this.J;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z) {
        if (this.Q == z) {
            return;
        }
        this.Q = z;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i) {
        bkb.A1(i, this.x);
        bkb.A1(i, this.w);
    }

    public void setTextColor(int i) {
        this.h.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        setTextSizePx(gl.L(i));
    }

    public void setTextSizePx(int i) {
        float f = i;
        TextPaint textPaint = this.h;
        if (f == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z) {
        this.O = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.x || drawable == this.y || drawable == this.w || super.verifyDrawable(drawable);
    }

    public void setEllipsizeByGradient(boolean z) {
        if (this.Q == z) {
            return;
        }
        this.o0 = z;
        this.q0 = null;
        m();
        b();
    }

    public void setLeftDrawable(int i) {
        setLeftDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }
}
