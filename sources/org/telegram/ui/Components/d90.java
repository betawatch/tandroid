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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class d90 extends TextView {
    public static Field I;
    public static Class J;
    public static Method K;
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public final boolean a;
    public final a90 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public v5 d;
    public e90 e;
    public c90 f;
    public c90 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle v;
    public int w;
    public boolean x;
    public Object y;

    public d90(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int textPaddingTop = i11 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f7 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f7);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f7 && layout.getLineWidth(lineForVertical) + lineLeft >= f7 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.c);
    }

    public int getTextPaddingTop() {
        int paddingTop = getPaddingTop();
        return (getGravity() != 17 || getLayout() == null) ? paddingTop : Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.x) {
            this.x = true;
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
                FileLog.e(th2);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (K != null) {
                    if (this.y == null) {
                        this.y = I.get(this);
                    }
                    Object obj = this.y;
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
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z5.release(this, this.d);
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
    
        org.telegram.messenger.FileLog.e((java.lang.Throwable) r0, true);
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
        boolean z10;
        Layout layout;
        float height;
        if (!this.a) {
            canvas.save();
            if (!this.n) {
                canvas.translate(this.r ? 0.0f : getPaddingLeft(), this.s ? 0.0f : getTextPaddingTop());
            }
            a90 a90Var = this.b;
            if (a90Var != null && a90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z11 = false;
        try {
            layout = getLayout();
            height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
        } catch (Exception e7) {
            e = e7;
            canvas2 = canvas;
        }
        if (height == 0.0f && getPaddingLeft() == 0) {
            z10 = false;
            this.d = z5.update(a(), this, this.d, getLayout());
            if (this.F) {
                if (this.G == null) {
                    if (this.H != getPaint().linkColor) {
                    }
                }
                int i10 = getPaint().linkColor;
                this.H = i10;
                this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            }
            canvas2 = canvas;
            z5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G);
            if (z10) {
                return;
            }
            canvas2.restore();
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), height);
        z10 = true;
        this.d = z5.update(a(), this, this.d, getLayout());
        if (this.F) {
        }
        canvas2 = canvas;
        z5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.G);
        if (z10) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        a90 a90Var = this.b;
        if (a90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                e90 e90Var = new e90(b10, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                e90Var.d(c());
                this.e = e90Var;
                a90Var.a(e90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                x80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this, e90Var, b10, 22), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                a90Var.d(true);
                e90 e90Var2 = this.e;
                if (e90Var2 != null && (characterStyle = e90Var2.i) == b10) {
                    c90 c90Var = this.f;
                    if (c90Var != null) {
                        c90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                a90Var.d(true);
                this.e = null;
            }
        }
        return this.e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.n = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.r = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.s = z10;
    }

    public void setEmojiColor(int i10) {
        this.F = false;
        this.G = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            a90 a90Var = this.b;
            a90Var.e();
            this.v = characterStyle;
            h90 i10 = a90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.c));
                i10.f(org.telegram.ui.ActionBar.j6.l1(0.8f, d), org.telegram.ui.ActionBar.j6.l1(1.3f, d), org.telegram.ui.ActionBar.j6.l1(1.0f, d), org.telegram.ui.ActionBar.j6.l1(4.0f, d));
                i10.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                a90Var.b(i10, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        this.w = i10;
    }

    public void setOnLinkLongPressListener(c90 c90Var) {
        this.h = c90Var;
    }

    public void setOnLinkPressListener(c90 c90Var) {
        this.f = c90Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = z5.update(a(), this, this.d, getLayout());
    }

    public d90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.a = false;
        this.b = new a90(this);
        this.c = f6Var;
    }

    public d90(Context context, a90 a90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = false;
        this.F = true;
        this.a = true;
        this.b = a90Var;
        this.c = f6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
