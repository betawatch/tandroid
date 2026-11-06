package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class w70 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public Object D;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean a;
    public final n2.n0 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public n5 d;
    public x70 e;
    public v70 f;
    public v70 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle w;
    public int x;
    public boolean y;

    public w70(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i7, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i7 - getPaddingLeft();
        int textPaddingTop = i10 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, this.c);
    }

    public final void e() {
        this.F = false;
        this.G = null;
        invalidate();
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
                if (J == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    I = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    J = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        K = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (K != null) {
                    if (this.D == null) {
                        this.D = I.get(this);
                    }
                    Object obj = this.D;
                    if (obj != null) {
                        K.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5.release(this, this.d);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(5:3|(5:5|(1:7)(1:13)|8|(1:10)(1:12)|11)|14|(1:18)|19)|20|(4:21|22|(1:74)(1:25)|26)|(12:31|32|33|34|35|36|(3:38|(2:40|(1:42))|43)|44|45|46|47|(2:49|50)(1:52))|66|67|68|69|32|33|34|35|36|(0)|44|45|46|47|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(5:3|(5:5|(1:7)(1:13)|8|(1:10)(1:12)|11)|14|(1:18)|19)|20|21|22|(1:74)(1:25)|26|(12:31|32|33|34|35|36|(3:38|(2:40|(1:42))|43)|44|45|46|47|(2:49|50)(1:52))|66|67|68|69|32|33|34|35|36|(0)|44|45|46|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (r14.E == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        r14.E = true;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        r4 = r15;
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:33:0x0084, B:36:0x0092, B:38:0x009c, B:40:0x00a0, B:43:0x00af, B:44:0x00c0), top: B:32:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        Layout layout;
        float height;
        if (!this.a) {
            canvas.save();
            if (!this.n) {
                canvas.translate(this.r ? 0.0f : getPaddingLeft(), this.s ? 0.0f : getTextPaddingTop());
            }
            n2.n0 n0Var = this.b;
            if (n0Var != null && n0Var.h(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z10 = false;
        try {
            layout = getLayout();
            height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
        } catch (Exception e10) {
            e = e10;
            canvas2 = canvas;
        }
        if (height == 0.0f && getPaddingLeft() == 0) {
            z9 = false;
            this.d = r5.update(a(), this, this.d, getLayout());
            if (this.F) {
                if (this.G == null) {
                    if (this.H != getPaint().linkColor) {
                    }
                }
                int i7 = getPaint().linkColor;
                this.H = i7;
                this.G = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            }
            canvas2 = canvas;
            r5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G);
            if (z9) {
                return;
            }
            canvas2.restore();
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), height);
        z9 = true;
        this.d = r5.update(a(), this, this.d, getLayout());
        if (this.F) {
        }
        canvas2 = canvas;
        r5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G);
        if (z9) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11 = this.x;
        if (i11 > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7));
        }
        super.onMeasure(i7, i10);
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        n2.n0 n0Var = this.b;
        if (n0Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                x70 x70Var = new x70(b10, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                x70Var.d(c());
                this.e = x70Var;
                n0Var.b(x70Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                r70 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                org.telegram.messenger.g0.i3(new ng(this, x70Var, b10, 12), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                n0Var.f(true);
                x70 x70Var2 = this.e;
                if (x70Var2 != null && (characterStyle = x70Var2.i) == b10) {
                    v70 v70Var = this.f;
                    if (v70Var != null) {
                        v70Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                n0Var.f(true);
                this.e = null;
            }
        }
        return this.e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z9) {
        this.n = z9;
    }

    public void setDisablePaddingsOffsetX(boolean z9) {
        this.r = z9;
    }

    public void setDisablePaddingsOffsetY(boolean z9) {
        this.s = z9;
    }

    public void setEmojiColor(int i7) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.w != characterStyle) {
            n2.n0 n0Var = this.b;
            n0Var.g();
            this.w = characterStyle;
            a80 k10 = n2.n0.k(getLayout(), characterStyle, getPaddingTop());
            if (k10 != null) {
                int d = d(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ze, this.c));
                k10.g(org.telegram.ui.ActionBar.k6.r1(0.8f, d), org.telegram.ui.ActionBar.k6.r1(1.3f, d), org.telegram.ui.ActionBar.k6.r1(1.0f, d), org.telegram.ui.ActionBar.k6.r1(4.0f, d));
                k10.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                n0Var.c(k10, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        this.x = i7;
    }

    public void setOnLinkLongPressListener(v70 v70Var) {
        this.h = v70Var;
    }

    public void setOnLinkPressListener(v70 v70Var) {
        this.f = v70Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = r5.update(a(), this, this.d, getLayout());
    }

    public w70(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.a = false;
        this.b = new n2.n0(this);
        this.c = f6Var;
    }

    public w70(Context context, n2.n0 n0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.a = true;
        this.b = n0Var;
        this.c = f6Var;
    }

    public int d(int i7) {
        return i7;
    }
}
