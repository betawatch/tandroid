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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class qt extends EditText {
    public static Boolean W;
    public int D;
    public k5 E;
    public PorterDuffColorFilter F;
    public boolean G;
    public Layout H;
    public int I;
    public ot J;
    public Rect K;
    public boolean L;
    public int M;
    public Integer N;
    public float O;
    public boolean P;
    public tb0 Q;
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
    public nh.n f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        int i10;
        int i11;
        ot otVar = this.J;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z10 = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (zz0 zz0Var : (zz0[]) spannable.getSpans(0, spannable.length(), zz0.class)) {
                int spanStart = spannable.getSpanStart(zz0Var);
                int spanEnd = spannable.getSpanEnd(zz0Var);
                if (zz0Var.c() && ((spanStart > (i10 = this.r) && spanEnd < this.s) || ((i10 > spanStart && i10 < spanEnd) || ((i11 = this.s) > spanStart && i11 < spanEnd)))) {
                    removeCallbacks(otVar);
                    this.y = false;
                    z10 = true;
                    break;
                }
            }
        }
        if (!this.d || z10 || this.y) {
            return;
        }
        this.y = true;
        postDelayed(otVar, 10000L);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        nh.n nVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sh0 sh0Var = (sh0) obj;
                e0.h hVar = sh0Var.e.J;
                boolean z12 = sh0Var.b() && sh0Var.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (hVar != null) {
                        hVar.g(z12);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (hVar != null && hVar.c && z12) {
                        sh0Var.e.e = !r5.e;
                        g(true);
                        z10 = true;
                    }
                    if (hVar != null) {
                        hVar.g(false);
                    }
                } else if (motionEvent.getAction() == 3 && hVar != null) {
                    hVar.g(false);
                }
                z10 = (hVar != null && hVar.c) || z10;
            }
        }
        if (!z10) {
            if (this.e && (nVar = this.f) != null && ((GestureDetector) ((m2.t) nVar.d).b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z11) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return f5.f();
    }

    public final void f() {
        Editable text = getText();
        if (text != null) {
            for (zz0 zz0Var : (zz0[]) text.getSpans(0, text.length(), zz0.class)) {
                if (zz0Var.c()) {
                    boolean z10 = this.d;
                    yz0 yz0Var = zz0Var.b;
                    if (z10) {
                        yz0Var.a |= 512;
                    } else {
                        yz0Var.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z10) {
        if (this.U) {
            this.V = true;
            return;
        }
        int i10 = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z10 || this.R != length) {
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
            this.c = wh0.d(this, getLayout(), this.c, this.T);
            if (this.V) {
                this.c = wh0.d(this, getLayout(), this.c, this.T);
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
                i10 = getLayout().getText().length();
            }
            this.R = i10;
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
        uh0[] uh0VarArr = (uh0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), uh0.class);
        for (int length = uh0VarArr.length - 1; length >= 0; length--) {
            uh0 uh0Var = uh0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(uh0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(uh0Var);
            spannableStringBuilder.removeSpan(uh0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        k5 k5Var;
        k5 k5Var2;
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
            if (this.G && (k5Var2 = this.E) != null) {
                ArrayList arrayList2 = k5Var2.a;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((j5) arrayList2.get(i10)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            int i11 = nh.i.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            nh.i.a(this, layout2, 0, measuredWidth, (Spanned) getText(), stack, arrayList, arrayList3);
            if (this.G && (k5Var = this.E) != null) {
                ArrayList arrayList4 = k5Var.a;
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    ((j5) arrayList4.get(i12)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    public final void i(nh.i iVar, float f7, float f10) {
        if (this.d) {
            return;
        }
        this.w = f7;
        this.x = f10;
        this.y = false;
        removeCallbacks(this.J);
        j(true, false);
        iVar.q = new nt(this, 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).j(f7, f10, sqrt, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        this.d = z10;
        Editable text = getText();
        if (text != null) {
            for (zz0 zz0Var : (zz0[]) text.getSpans(0, text.length(), zz0.class)) {
                if (zz0Var.c()) {
                    yz0 yz0Var = zz0Var.b;
                    if (z10) {
                        yz0Var.a |= 512;
                    } else {
                        yz0Var.a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.r, this.s);
        this.h = false;
        if (z11) {
            h();
        }
    }

    public final void k(boolean z10) {
        if (this.G) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z10 && this.H == getLayout() && this.I == length) {
                return;
            }
            this.E = o5.update(e(), this, this.E, getLayout());
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
        o5.release(this, this.E);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        boolean z10 = this.P;
        Rect rect = this.K;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.L && getScrollY() != 0) {
            canvas.clipRect(-org.telegram.messenger.i0.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.O, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.O);
        }
        int paddingLeft = getPaddingLeft();
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            path = path2;
        } else {
            path2.rewind();
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                Rect bounds = ((nh.i) arrayList2.get(i11)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i11 = i12;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        g(false);
        for (int i13 = 0; i13 < this.c.size(); i13++) {
            sh0 sh0Var = (sh0) this.c.get(i13);
            int width = getWidth();
            int i14 = this.D;
            getPaint();
            sh0Var.a(canvas, width, i14);
        }
        k(false);
        if (z10) {
            if (this.Q == null) {
                this.Q = new tb0();
            }
            tb0 tb0Var = this.Q;
            tb0Var.a = canvas;
            super.onDraw(tb0Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.G || this.E == null) {
            arrayList = arrayList2;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            o5.drawAnimatedEmojis(canvas, getLayout(), this.E, 0.0f, arrayList, computeVerticalScrollOffset() - org.telegram.messenger.i0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.F);
            canvas.restore();
        }
        canvas.restore();
        if (arrayList.isEmpty()) {
            return;
        }
        nh.i iVar = (nh.i) arrayList.get(0);
        if (iVar.m > 0.0f && iVar.n > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            ((nh.i) arrayList.get(0)).e(path);
            canvas.clipPath(path);
            canvas.translate(0.0f, -getPaddingTop());
            if (z10) {
                if (this.Q == null) {
                    this.Q = new tb0();
                }
                tb0 tb0Var2 = this.Q;
                tb0Var2.a = canvas;
                super.onDraw(tb0Var2);
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
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            nh.i iVar2 = (nh.i) obj;
            Rect bounds2 = iVar2.getBounds();
            int i15 = rect.top;
            int i16 = bounds2.bottom;
            if ((i15 <= i16 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i16 >= i15)) {
                iVar2.h(iVar2.y ? this.D : getPaint().getColor());
                iVar2.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (this.h) {
            return;
        }
        this.r = i10;
        this.s = i11;
        d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
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
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (!this.h) {
            f();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i10);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i10);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    ArrayList arrayList = this.a;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i13);
                        i13++;
                        nh.i iVar = (nh.i) obj;
                        if (iVar.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        k(true);
        g(true);
        invalidate();
    }

    public void setClipToPadding(boolean z10) {
        this.L = z10;
    }

    public void setEmojiColor(Integer num) {
        this.N = num;
        this.F = new PorterDuffColorFilter(num == null ? this.M : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f7) {
        this.O = f7;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.e = z10;
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
    public void setTextColor(int i10) {
        this.M = i10;
        super.setTextColor(i10);
        Integer num = this.N;
        if (num != null) {
            i10 = num.intValue();
        }
        this.F = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }
}
