// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class l46 extends TextView {
    public static Field J;
    public static Class K;
    public static Method L;
    public Object E;
    public boolean F;
    public boolean G;
    public PorterDuffColorFilter H;
    public int I;
    public final boolean a;
    public final i46 b;
    public final wjb c;
    public cm d;
    public m46 e;
    public k46 f;
    public k46 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle w;
    public int x;
    public boolean y;

    public l46(Context context, wjb wjbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = false;
        this.b = new i46(this);
        this.c = wjbVar;
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i - getPaddingLeft();
        int textPaddingTop = i2 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !gl.A1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return bkb.v0(bkb.Be, this.c);
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        return (getGravity() != 17 || getLayout() == null) ? paddingTop : Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.y) {
            this.y = true;
            try {
                if (K == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    J = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    K = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        L = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L != null) {
                    Object obj = this.E;
                    if (obj == null) {
                        obj = J.get(this);
                        this.E = obj;
                    }
                    if (obj != null) {
                        L.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = gm.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.release(this, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        Layout layout;
        if (!this.a) {
            canvas.save();
            if (!this.n) {
                canvas.translate(this.r ? 0.0f : getPaddingLeft(), this.s ? 0.0f : getTextPaddingTop());
            }
            i46 i46Var = this.b;
            if (i46Var != null && i46Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z2 = false;
        try {
            layout = getLayout();
            float height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
            if (height == 0.0f && getPaddingLeft() == 0) {
                z = false;
            } else {
                canvas.save();
                try {
                    canvas.translate(getPaddingLeft(), height);
                    z = true;
                } catch (Exception e) {
                    e = e;
                    canvas2 = canvas;
                    z2 = true;
                    if (!this.F) {
                        fa4.g(e, true);
                    }
                    this.F = true;
                    z = z2;
                    if (z) {
                    }
                }
            }
            try {
                this.d = gm.update(a(), this, this.d, getLayout());
                if (this.G && (this.H == null || this.I != getPaint().linkColor)) {
                    int i = getPaint().linkColor;
                    this.I = i;
                    this.H = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                }
                canvas2 = canvas;
            } catch (Exception e2) {
                e = e2;
                canvas2 = canvas;
            }
        } catch (Exception e3) {
            e = e3;
            canvas2 = canvas;
        }
        try {
            gm.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.H);
        } catch (Exception e4) {
            e = e4;
            z2 = z;
            if (!this.F) {
            }
            this.F = true;
            z = z2;
            if (z) {
            }
        }
        if (z) {
            canvas2.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.x;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        this.d = gm.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        i46 i46Var = this.b;
        if (i46Var != null) {
            Layout layout = getLayout();
            ClickableSpan b = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b != null && motionEvent.getAction() == 0) {
                m46 m46Var = new m46(b, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                m46Var.d(c());
                this.e = m46Var;
                i46Var.a(m46Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                b46 b2 = this.e.b();
                b2.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b2);
                gl.d3(new sx5((Object) this, (Object) m46Var, (Object) b, (byte) 9), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i46Var.e(true);
                m46 m46Var2 = this.e;
                if (m46Var2 != null && (characterStyle = m46Var2.i) == b) {
                    k46 k46Var = this.f;
                    if (k46Var != null) {
                        k46Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                i46Var.e(true);
                this.e = null;
            }
        }
        return this.e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z) {
        this.n = z;
    }

    public void setDisablePaddingsOffsetX(boolean z) {
        this.r = z;
    }

    public void setDisablePaddingsOffsetY(boolean z) {
        this.s = z;
    }

    public void setEmojiColor(int i) {
        this.G = false;
        this.H = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.w != characterStyle) {
            i46 i46Var = this.b;
            i46Var.f();
            this.w = characterStyle;
            r86 j = i46.j(getLayout(), characterStyle, getPaddingTop());
            if (j != null) {
                int d = d(bkb.v0(bkb.Be, this.c));
                j.g(bkb.p1(0.8f, d), bkb.p1(1.3f, d), bkb.p1(1.0f, d), bkb.p1(4.0f, d));
                j.x.setStrokeWidth(gl.N(1.25f));
                i46Var.b(j, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        this.x = i;
    }

    public void setOnLinkLongPressListener(k46 k46Var) {
        this.h = k46Var;
    }

    public void setOnLinkPressListener(k46 k46Var) {
        this.f = k46Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = gm.update(a(), this, this.d, getLayout());
    }

    public l46(Context context) {
        this(context, null);
    }

    public l46(Context context, i46 i46Var, wjb wjbVar) {
        super(context);
        this.F = false;
        this.G = true;
        this.a = true;
        this.b = i46Var;
        this.c = wjbVar;
    }

    public int d(int i) {
        return i;
    }
}
