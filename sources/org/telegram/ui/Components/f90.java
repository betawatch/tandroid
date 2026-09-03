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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class f90 extends TextView {
    public static Field F;
    public static Class G;
    public static Method H;
    public boolean B;
    public boolean C;
    public PorterDuffColorFilter D;
    public int E;
    public final boolean a;
    public final c90 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public q5 d;
    public g90 e;
    public e90 f;
    public e90 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public CharacterStyle v;
    public int w;
    public boolean x;
    public Object y;

    public f90(Context context) {
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
                if (G == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    F = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    G = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        H = declaredMethod;
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
                if (H != null) {
                    if (this.y == null) {
                        this.y = F.get(this);
                    }
                    Object obj = this.y;
                    if (obj != null) {
                        H.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u5.release(this, this.d);
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
    
        if (r14.B == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        org.telegram.messenger.FileLog.e((java.lang.Throwable) r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        r14.B = true;
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
        boolean z4;
        Layout layout;
        float height;
        if (!this.a) {
            canvas.save();
            if (!this.n) {
                canvas.translate(this.r ? 0.0f : getPaddingLeft(), this.s ? 0.0f : getTextPaddingTop());
            }
            c90 c90Var = this.b;
            if (c90Var != null && c90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        boolean z10 = false;
        try {
            layout = getLayout();
            height = ((getGravity() & 16) == 0 || layout == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
        } catch (Exception e) {
            e = e;
            canvas2 = canvas;
        }
        if (height == 0.0f && getPaddingLeft() == 0) {
            z4 = false;
            this.d = u5.update(a(), this, this.d, getLayout());
            if (this.C) {
                if (this.D == null) {
                    if (this.E != getPaint().linkColor) {
                    }
                }
                int i10 = getPaint().linkColor;
                this.E = i10;
                this.D = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            }
            canvas2 = canvas;
            u5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.D);
            if (z4) {
                return;
            }
            canvas2.restore();
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), height);
        z4 = true;
        this.d = u5.update(a(), this, this.d, getLayout());
        if (this.C) {
        }
        canvas2 = canvas;
        u5.drawAnimatedEmojis(canvas2, layout, this.d, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.D);
        if (z4) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.w;
        if (i12 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        c90 c90Var = this.b;
        if (c90Var != null) {
            Layout layout = getLayout();
            ClickableSpan b10 = b((int) motionEvent.getX(), (int) motionEvent.getY());
            if (b10 != null && motionEvent.getAction() == 0) {
                g90 g90Var = new g90(b10, this.c, motionEvent.getX(), motionEvent.getY(), 0);
                g90Var.d(c());
                this.e = g90Var;
                c90Var.a(g90Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.e.i);
                int spanEnd = spannableString.getSpanEnd(this.e.i);
                y80 b11 = this.e.b();
                b11.d(layout, spanStart, getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b11);
                AndroidUtilities.runOnUIThread(new gp(this, g90Var, b10, 9), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                c90Var.d(true);
                g90 g90Var2 = this.e;
                if (g90Var2 != null && (characterStyle = g90Var2.i) == b10) {
                    e90 e90Var = this.f;
                    if (e90Var != null) {
                        e90Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.e = null;
                    return true;
                }
                this.e = null;
            }
            if (motionEvent.getAction() == 3) {
                c90Var.d(true);
                this.e = null;
            }
        }
        return this.e != null || super.onTouchEvent(motionEvent);
    }

    public void setDisablePaddingsOffset(boolean z4) {
        this.n = z4;
    }

    public void setDisablePaddingsOffsetX(boolean z4) {
        this.r = z4;
    }

    public void setDisablePaddingsOffsetY(boolean z4) {
        this.s = z4;
    }

    public void setEmojiColor(int i10) {
        this.C = false;
        this.D = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.v != characterStyle) {
            c90 c90Var = this.b;
            c90Var.e();
            this.v = characterStyle;
            j90 i10 = c90.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int d = d(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ld, this.c));
                i10.f(org.telegram.ui.ActionBar.j6.l1(0.8f, d), org.telegram.ui.ActionBar.j6.l1(1.3f, d), org.telegram.ui.ActionBar.j6.l1(1.0f, d), org.telegram.ui.ActionBar.j6.l1(4.0f, d));
                i10.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                c90Var.b(i10, null);
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        this.w = i10;
    }

    public void setOnLinkLongPressListener(e90 e90Var) {
        this.h = e90Var;
    }

    public void setOnLinkPressListener(e90 e90Var) {
        this.f = e90Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.d = u5.update(a(), this, this.d, getLayout());
    }

    public f90(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.a = false;
        this.b = new c90(this);
        this.c = f6Var;
    }

    public f90(Context context, c90 c90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.B = false;
        this.C = true;
        this.a = true;
        this.b = c90Var;
        this.c = f6Var;
    }

    public int d(int i10) {
        return i10;
    }
}
