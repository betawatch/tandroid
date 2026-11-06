package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class ct extends EditText {
    public static Boolean W;
    public int D;
    public n5 E;
    public PorterDuffColorFilter F;
    public boolean G;
    public Layout H;
    public int I;
    public at J;
    public Rect K;
    public boolean L;
    public int M;
    public Integer N;
    public float O;
    public boolean P;
    public ab0 Q;
    public int R;
    public int S;
    public boolean[] T;
    public boolean U;
    public boolean V;
    public ArrayList a;
    public Stack b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public gf.c f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        int i7;
        int i10;
        at atVar = this.J;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z9 = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (vy0 vy0Var : (vy0[]) spannable.getSpans(0, spannable.length(), vy0.class)) {
                int spanStart = spannable.getSpanStart(vy0Var);
                int spanEnd = spannable.getSpanEnd(vy0Var);
                if (vy0Var.c() && ((spanStart > (i7 = this.r) && spanEnd < this.s) || ((i7 > spanStart && i7 < spanEnd) || ((i10 = this.s) > spanStart && i10 < spanEnd)))) {
                    removeCallbacks(atVar);
                    this.y = false;
                    z9 = true;
                    break;
                }
            }
        }
        if (!this.d || z9 || this.y) {
            return;
        }
        this.y = true;
        postDelayed(atVar, 10000L);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        gf.c cVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z9 = false;
        } else {
            int size = arrayList.size();
            z9 = false;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                qg0 qg0Var = (qg0) obj;
                e0.g gVar = qg0Var.e.J;
                boolean z11 = qg0Var.b() && qg0Var.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (gVar != null) {
                        gVar.g(z11);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (gVar != null && gVar.c && z11) {
                        qg0Var.e.e = !r5.e;
                        g(true);
                        z9 = true;
                    }
                    if (gVar != null) {
                        gVar.g(false);
                    }
                } else if (motionEvent.getAction() == 3 && gVar != null) {
                    gVar.g(false);
                }
                z9 = (gVar != null && gVar.c) || z9;
            }
        }
        if (!z9) {
            if (this.e && (cVar = this.f) != null && ((GestureDetector) ((uy) cVar.d).b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z10) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return i5.f();
    }

    public final void f() {
        Editable text = getText();
        if (text != null) {
            for (vy0 vy0Var : (vy0[]) text.getSpans(0, text.length(), vy0.class)) {
                if (vy0Var.c()) {
                    boolean z9 = this.d;
                    uy0 uy0Var = vy0Var.b;
                    if (z9) {
                        uy0Var.a |= 512;
                    } else {
                        uy0Var.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z9) {
        if (this.U) {
            this.V = true;
            return;
        }
        int i7 = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z9 || this.R != length) {
            this.S = 2;
            this.R = length;
        }
        if (this.S > 0) {
            if (this.T == null) {
                this.T = new boolean[1];
            }
            this.T[0] = false;
            this.V = false;
            this.U = true;
            this.c = ug0.d(this, getLayout(), this.c, this.T);
            if (this.V) {
                this.c = ug0.d(this, getLayout(), this.c, this.T);
            }
            this.U = false;
            this.V = false;
            if (this.T[0]) {
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            this.S--;
            if (getLayout() != null && getLayout().getText() != null) {
                i7 = getLayout().getText().length();
            }
            this.R = i7;
        }
    }

    public float getOffsetY() {
        return this.O;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        sg0[] sg0VarArr = (sg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sg0.class);
        for (int length = sg0VarArr.length - 1; length >= 0; length--) {
            sg0 sg0Var = sg0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(sg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(sg0Var);
            spannableStringBuilder.removeSpan(sg0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        n5 n5Var;
        n5 n5Var2;
        Stack stack = this.b;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout != null && (layout.getText() instanceof Spannable)) {
            if (this.G && (n5Var2 = this.E) != null) {
                ArrayList arrayList2 = n5Var2.a;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    ((m5) arrayList2.get(i7)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            int i10 = xh.f.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            xh.f.a(this, layout2, 0, measuredWidth, (Spanned) getText(), stack, arrayList, arrayList3);
            if (this.G && (n5Var = this.E) != null) {
                ArrayList arrayList4 = n5Var.a;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((m5) arrayList4.get(i11)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    public final void i(xh.f fVar, float f10, float f11) {
        if (this.d) {
            return;
        }
        this.w = f10;
        this.x = f11;
        this.y = false;
        removeCallbacks(this.J);
        j(true, false);
        fVar.q = new zs(this, 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    public final void j(boolean z9, boolean z10) {
        this.d = z9;
        Editable text = getText();
        if (text != null) {
            for (vy0 vy0Var : (vy0[]) text.getSpans(0, text.length(), vy0.class)) {
                if (vy0Var.c()) {
                    uy0 uy0Var = vy0Var.b;
                    if (z9) {
                        uy0Var.a |= 512;
                    } else {
                        uy0Var.a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.r, this.s);
        this.h = false;
        if (z10) {
            h();
        }
    }

    public final void k(boolean z9) {
        if (this.G) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z9 && this.H == getLayout() && this.I == length) {
                return;
            }
            this.E = r5.update(e(), this, this.E, getLayout());
            this.H = getLayout();
            this.I = length;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k(true);
        g(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.J);
        r5.release(this, this.E);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        boolean z9 = this.P;
        Rect rect = this.K;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.L && getScrollY() != 0) {
            canvas.clipRect(-org.telegram.messenger.g0.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.O, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.O);
        }
        int paddingLeft = getPaddingLeft();
        int i7 = 0;
        if (arrayList2.isEmpty()) {
            path = path2;
        } else {
            path2.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Rect bounds = ((xh.f) arrayList2.get(i10)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i10 = i11;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        g(false);
        for (int i12 = 0; i12 < this.c.size(); i12++) {
            qg0 qg0Var = (qg0) this.c.get(i12);
            int width = getWidth();
            int i13 = this.D;
            getPaint();
            qg0Var.a(canvas, width, i13);
        }
        k(false);
        if (z9) {
            if (this.Q == null) {
                this.Q = new ab0();
            }
            ab0 ab0Var = this.Q;
            ab0Var.a = canvas;
            super.onDraw(ab0Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.G || this.E == null) {
            arrayList = arrayList2;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            r5.drawAnimatedEmojis(canvas, getLayout(), this.E, 0.0f, arrayList, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.F);
            canvas.restore();
        }
        canvas.restore();
        if (arrayList.isEmpty()) {
            return;
        }
        xh.f fVar = (xh.f) arrayList.get(0);
        if (fVar.m > 0.0f && fVar.n > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            ((xh.f) arrayList.get(0)).e(path);
            canvas.clipPath(path);
            canvas.translate(0.0f, -getPaddingTop());
            if (z9) {
                if (this.Q == null) {
                    this.Q = new ab0();
                }
                ab0 ab0Var2 = this.Q;
                ab0Var2.a = canvas;
                super.onDraw(ab0Var2);
            } else {
                super.onDraw(canvas);
            }
            canvas.restore();
        }
        rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.O), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.O));
        canvas.save();
        canvas.clipRect(rect);
        canvas.translate(paddingLeft, 0.0f);
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            xh.f fVar2 = (xh.f) obj;
            Rect bounds2 = fVar2.getBounds();
            int i14 = rect.top;
            int i15 = bounds2.bottom;
            if ((i14 <= i15 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i15 >= i14)) {
                fVar2.h(fVar2.y ? this.D : getPaint().getColor());
                fVar2.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        g(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (this.h) {
            return;
        }
        this.r = i7;
        this.s = i10;
        d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r10 = r10 - r9;
        r6.r += r10;
        r6.s += r10;
        i(r4, r8, r7);
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        if (!this.h) {
            f();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i7);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i7);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    ArrayList arrayList = this.a;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i12);
                        i12++;
                        xh.f fVar = (xh.f) obj;
                        if (fVar.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        k(true);
        g(true);
        invalidate();
    }

    public void setClipToPadding(boolean z9) {
        this.L = z9;
    }

    public void setEmojiColor(Integer num) {
        this.N = num;
        this.F = new PorterDuffColorFilter(num == null ? this.M : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f10) {
        this.O = f10;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z9) {
        this.e = z9;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h) {
            this.d = false;
            Stack stack = this.b;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        this.M = i7;
        super.setTextColor(i7);
        Integer num = this.N;
        if (num != null) {
            i7 = num.intValue();
        }
        this.F = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }
}
