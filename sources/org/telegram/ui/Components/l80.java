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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class l80 extends TextView {
    public static Field E;
    public static Class F;
    public static Method G;
    public boolean A;
    public boolean B;
    public PorterDuffColorFilter C;
    public int D;
    public final boolean a;
    public final i80 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public p5 d;
    public m80 e;
    public k80 f;
    public k80 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle v;
    public int w;
    public boolean x;
    public Object y;

    public l80(Context context) {
        this(context, null);
    }

    public int a() {
        return 0;
    }

    public final ClickableSpan b(int i9, int i10) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i9 - getPaddingLeft();
        int textPaddingTop = i10 - getTextPaddingTop();
        int lineForVertical = layout.getLineForVertical(textPaddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public int c() {
        return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.c);
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
                if (F == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    E = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    F = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        G = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        super.invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (G != null) {
                    if (this.y == null) {
                        this.y = E.get(this);
                    }
                    Object obj = this.y;
                    if (obj != null) {
                        G.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5.release(this, this.d);
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
    
        if (r14.A == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        org.telegram.messenger.FileLog.e((java.lang.Throwable) r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        r14.A = true;
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
            i80 i80Var = this.b;
            if (i80Var != null && i80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z11 = false;
        try {
            layout = getLayout();
            height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
        } catch (Exception e10) {
            e = e10;
            canvas2 = canvas;
        }
        if (height == 0.0f && getPaddingLeft() == 0) {
            z10 = false;
            this.d = t5.update(a(), this, this.d, getLayout());
            if (this.B) {
                if (this.C == null) {
                    if (this.D != getPaint().linkColor) {
                    }
                }
                int i9 = getPaint().linkColor;
                this.D = i9;
                this.C = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
            }
            canvas2 = canvas;
            t5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.C);
            if (z10) {
                return;
            }
            canvas2.restore();
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), height);
        z10 = true;
        this.d = t5.update(a(), this, this.d, getLayout());
        if (this.B) {
        }
        canvas2 = canvas;
        t5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.C);
        if (z10) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        int i11 = this.w;
        if (i11 > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i9)), View.MeasureSpec.getMode(i9));
        }
        super.onMeasure(i9, i10);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        i80 i80Var = this.b;
        if (i80Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                m80 m80Var = new m80(b10, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                m80Var.d(c());
                this.e = m80Var;
                i80Var.a(m80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                f80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, m80Var, b10, 27), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                i80Var.d(true);
                m80 m80Var2 = this.e;
                if (m80Var2 != null && (characterStyle = m80Var2.i) == b10) {
                    k80 k80Var = this.f;
                    if (k80Var != null) {
                        k80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                i80Var.d(true);
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

    public void setEmojiColor(int i9) {
        this.B = false;
        this.C = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            i80 i80Var = this.b;
            i80Var.e();
            this.v = characterStyle;
            p80 i9 = i80.i(getLayout(), characterStyle, getPaddingTop());
            if (i9 != null) {
                int d = d(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ld, this.c));
                i9.f(org.telegram.ui.ActionBar.f6.l1(0.8f, d), org.telegram.ui.ActionBar.f6.l1(1.3f, d), org.telegram.ui.ActionBar.f6.l1(1.0f, d), org.telegram.ui.ActionBar.f6.l1(4.0f, d));
                i9.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                i80Var.b(i9, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i9) {
        this.w = i9;
    }

    public void setOnLinkLongPressListener(k80 k80Var) {
        this.h = k80Var;
    }

    public void setOnLinkPressListener(k80 k80Var) {
        this.f = k80Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = t5.update(a(), this, this.d, getLayout());
    }

    public l80(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.a = false;
        this.b = new i80(this);
        this.c = b6Var;
    }

    public l80(Context context, i80 i80Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.A = false;
        this.B = true;
        this.a = true;
        this.b = i80Var;
        this.c = b6Var;
    }

    public int d(int i9) {
        return i9;
    }
}
