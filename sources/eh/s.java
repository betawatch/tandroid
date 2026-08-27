package eh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class s extends TextView implements s9 {
    public static Field K;
    public static Class L;
    public static Method M;
    public q80 A;
    public PorterDuffColorFilter B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public Layout G;
    public int H;
    public boolean I;
    public Object J;
    public final p a;
    public final ArrayList b;
    public final Stack c;
    public boolean d;
    public final Path e;
    public boolean f;
    public int h;
    public p5 n;
    public boolean r;
    public final m80 s;
    public final c6 v;
    public CharacterStyle w;
    public o80 x;
    public o80 y;

    public s(Context context) {
        this(context, null, true);
    }

    public ClickableSpan a(int i10, int i11) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i10 - getPaddingLeft();
        int paddingTop = i11 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f10 = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    public final void b() {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i10 = k.A;
            int measuredWidth = getMeasuredWidth();
            k.a(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    public final void c(boolean z10) {
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (!z10 && this.G == getLayout() && this.H == length) {
            return;
        }
        this.n = t5.update(this.h, this, this.n, getLayout());
        this.G = getLayout();
        this.H = length;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        m80 m80Var = this.s;
        if (m80Var != null) {
            Layout layout = getLayout();
            ClickableSpan a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 != null && motionEvent.getAction() == 0) {
                q80 q80Var = new q80(a2, this.v, motionEvent.getX(), motionEvent.getY(), 0);
                q80Var.d(g6.v0(g6.Ld, this.v));
                this.A = q80Var;
                m80Var.a(q80Var, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.A.i);
                int spanEnd = spannableString.getSpanEnd(this.A.i);
                j80 b10 = this.A.b();
                b10.d(layout, spanStart, this.C ? 0.0f : getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, b10);
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(this, q80Var, a2, 10), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                m80Var.d(true);
                q80 q80Var2 = this.A;
                if (q80Var2 != null && (characterStyle = q80Var2.i) == a2) {
                    o80 o80Var = this.x;
                    if (o80Var != null) {
                        o80Var.a((ClickableSpan) characterStyle);
                    } else if (characterStyle != null) {
                        ((ClickableSpan) characterStyle).onClick(this);
                    }
                    this.A = null;
                    return true;
                }
                this.A = null;
            }
            if (motionEvent.getAction() == 3) {
                m80Var.d(true);
                this.A = null;
            }
        }
        if (this.A == null && !(this.f && ((GestureDetector) this.a.a.b).onTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.s9
    public Layout getStaticTextLayout() {
        return getLayout();
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        if (!this.I) {
            this.I = true;
            try {
                if (L == null) {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    K = declaredField;
                    declaredField.setAccessible(true);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    L = cls;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                        M = declaredMethod;
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
                if (M != null) {
                    if (this.J == null) {
                        this.J = K.get(this);
                    }
                    Object obj = this.J;
                    if (obj != null) {
                        M.invoke(obj, null);
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList arrayList;
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.D) {
            canvas.translate(this.E ? 0.0f : paddingLeft, this.F ? 0.0f : paddingTop);
        }
        m80 m80Var = this.s;
        if (m80Var != null && m80Var.f(canvas)) {
            invalidate();
        }
        canvas.restore();
        ArrayList arrayList2 = this.b;
        boolean isEmpty = arrayList2.isEmpty();
        Path path = this.e;
        if (isEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                Rect bounds = ((k) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.r;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            k kVar = (k) arrayList2.get(0);
            if (kVar.m > 0.0f && kVar.n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((k) arrayList2.get(0)).e(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        c(false);
        if (this.n != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            t5.drawAnimatedEmojis(canvas, getLayout(), this.n, 0.0f, arrayList2, 0.0f, getHeight(), 0.0f, 1.0f, this.B);
            arrayList = arrayList2;
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = ((k) arrayList.get(0)).n != -1.0f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        canvas2.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            k kVar2 = (k) obj2;
            kVar2.h(getPaint().getColor());
            kVar2.draw(canvas2);
        }
        if (z10) {
            path.rewind();
            ((k) arrayList.get(0)).e(path);
            canvas2.drawPath(path, g6.Il);
        }
        canvas2.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b();
        c(true);
    }

    public void setDisablePaddingsOffset(boolean z10) {
        this.D = z10;
    }

    public void setDisablePaddingsOffsetX(boolean z10) {
        this.E = z10;
    }

    public void setDisablePaddingsOffsetY(boolean z10) {
        this.F = z10;
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.w != characterStyle) {
            m80 m80Var = this.s;
            m80Var.e();
            this.w = characterStyle;
            t80 i10 = m80.i(getLayout(), characterStyle, getPaddingTop());
            if (i10 != null) {
                int v02 = g6.v0(g6.Ld, this.v);
                i10.f(g6.l1(0.8f, v02), g6.l1(1.3f, v02), g6.l1(1.0f, v02), g6.l1(4.0f, v02));
                i10.w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                m80Var.b(i10, null);
            }
        }
    }

    public void setOnLinkLongPressListener(o80 o80Var) {
        this.y = o80Var;
    }

    public void setOnLinkPressListener(o80 o80Var) {
        this.x = o80Var;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.d = false;
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.B = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z10) {
        this.r = z10;
    }

    public s(Context context, c6 c6Var, boolean z10) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new Stack();
        this.e = new Path();
        this.f = true;
        this.h = 0;
        this.r = true;
        this.C = true;
        this.G = null;
        this.s = new m80(this);
        this.v = c6Var;
        this.a = new p(this, arrayList, new q(0, this, z10));
    }

    public void setClearLinkOnLongPress(boolean z10) {
    }
}
