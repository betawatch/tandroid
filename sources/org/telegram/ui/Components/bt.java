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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class bt extends EditText {
    public static Boolean a0;
    public int E;
    public l5 F;
    public PorterDuffColorFilter G;
    public boolean H;
    public Layout I;
    public int J;
    public zs K;
    public Rect L;
    public boolean M;
    public int N;
    public Integer O;
    public float P;
    public boolean Q;
    public va0 R;
    public int S;
    public int T;
    public boolean[] U;
    public boolean V;
    public boolean W;
    public ArrayList a;
    public Stack b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public df.c f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        int i3;
        int i10;
        zs zsVar = this.K;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z10 = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (uy0 uy0Var : (uy0[]) spannable.getSpans(0, spannable.length(), uy0.class)) {
                int spanStart = spannable.getSpanStart(uy0Var);
                int spanEnd = spannable.getSpanEnd(uy0Var);
                if (uy0Var.c() && ((spanStart > (i3 = this.r) && spanEnd < this.s) || ((i3 > spanStart && i3 < spanEnd) || ((i10 = this.s) > spanStart && i10 < spanEnd)))) {
                    removeCallbacks(zsVar);
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
        postDelayed(zsVar, 10000L);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        df.c cVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                tg0 tg0Var = (tg0) obj;
                e0.g gVar = tg0Var.e.K;
                boolean z12 = tg0Var.b() && tg0Var.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (gVar != null) {
                        gVar.g(z12);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (gVar != null && gVar.c && z12) {
                        tg0Var.e.e = !r5.e;
                        g(true);
                        z10 = true;
                    }
                    if (gVar != null) {
                        gVar.g(false);
                    }
                } else if (motionEvent.getAction() == 3 && gVar != null) {
                    gVar.g(false);
                }
                z10 = (gVar != null && gVar.c) || z10;
            }
        }
        if (!z10) {
            if (this.e && (cVar = this.f) != null && ((GestureDetector) ((y00) cVar.d).a).onTouchEvent(motionEvent)) {
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
        return g5.f();
    }

    public final void f() {
        Editable text = getText();
        if (text != null) {
            for (uy0 uy0Var : (uy0[]) text.getSpans(0, text.length(), uy0.class)) {
                if (uy0Var.c()) {
                    boolean z10 = this.d;
                    ty0 ty0Var = uy0Var.b;
                    if (z10) {
                        ty0Var.a |= 512;
                    } else {
                        ty0Var.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z10) {
        if (this.V) {
            this.W = true;
            return;
        }
        int i3 = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z10 || this.S != length) {
            this.T = 2;
            this.S = length;
        }
        if (this.T > 0) {
            if (this.U == null) {
                this.U = new boolean[1];
            }
            this.U[0] = false;
            this.W = false;
            this.V = true;
            this.c = xg0.d(this, getLayout(), this.c, this.U);
            if (this.W) {
                this.c = xg0.d(this, getLayout(), this.c, this.U);
            }
            this.V = false;
            this.W = false;
            if (this.U[0]) {
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            this.T--;
            if (getLayout() != null && getLayout().getText() != null) {
                i3 = getLayout().getText().length();
            }
            this.S = i3;
        }
    }

    public float getOffsetY() {
        return this.P;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        vg0[] vg0VarArr = (vg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vg0.class);
        for (int length = vg0VarArr.length - 1; length >= 0; length--) {
            vg0 vg0Var = vg0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(vg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(vg0Var);
            spannableStringBuilder.removeSpan(vg0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        l5 l5Var;
        l5 l5Var2;
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
            if (this.H && (l5Var2 = this.F) != null) {
                ArrayList arrayList2 = l5Var2.a;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    ((k5) arrayList2.get(i3)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            int i10 = yh.f.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            yh.f.a(this, layout2, 0, measuredWidth, (Spanned) getText(), stack, arrayList, arrayList3);
            if (this.H && (l5Var = this.F) != null) {
                ArrayList arrayList4 = l5Var.a;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((k5) arrayList4.get(i11)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    public final void i(yh.f fVar, float f10, float f11) {
        if (this.d) {
            return;
        }
        this.w = f10;
        this.x = f11;
        this.y = false;
        removeCallbacks(this.K);
        j(true, false);
        fVar.q = new ys(this, 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        this.d = z10;
        Editable text = getText();
        if (text != null) {
            for (uy0 uy0Var : (uy0[]) text.getSpans(0, text.length(), uy0.class)) {
                if (uy0Var.c()) {
                    ty0 ty0Var = uy0Var.b;
                    if (z10) {
                        ty0Var.a |= 512;
                    } else {
                        ty0Var.a &= -513;
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
        if (this.H) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z10 && this.I == getLayout() && this.J == length) {
                return;
            }
            this.F = p5.update(e(), this, this.F, getLayout());
            this.I = getLayout();
            this.J = length;
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
        removeCallbacks(this.K);
        p5.release(this, this.F);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        boolean z10 = this.Q;
        Rect rect = this.L;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.M && getScrollY() != 0) {
            canvas.clipRect(-org.telegram.messenger.g0.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.P, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P);
        }
        int paddingLeft = getPaddingLeft();
        int i3 = 0;
        if (arrayList2.isEmpty()) {
            path = path2;
        } else {
            path2.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Rect bounds = ((yh.f) arrayList2.get(i10)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i10 = i11;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        g(false);
        for (int i12 = 0; i12 < this.c.size(); i12++) {
            tg0 tg0Var = (tg0) this.c.get(i12);
            int width = getWidth();
            int i13 = this.E;
            getPaint();
            tg0Var.a(canvas, width, i13);
        }
        k(false);
        if (z10) {
            if (this.R == null) {
                this.R = new va0();
            }
            va0 va0Var = this.R;
            va0Var.a = canvas;
            super.onDraw(va0Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.H || this.F == null) {
            arrayList = arrayList2;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            p5.drawAnimatedEmojis(canvas, getLayout(), this.F, 0.0f, arrayList, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.G);
            canvas.restore();
        }
        canvas.restore();
        if (arrayList.isEmpty()) {
            return;
        }
        yh.f fVar = (yh.f) arrayList.get(0);
        if (fVar.m > 0.0f && fVar.n > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            ((yh.f) arrayList.get(0)).e(path);
            canvas.clipPath(path);
            canvas.translate(0.0f, -getPaddingTop());
            if (z10) {
                if (this.R == null) {
                    this.R = new va0();
                }
                va0 va0Var2 = this.R;
                va0Var2.a = canvas;
                super.onDraw(va0Var2);
            } else {
                super.onDraw(canvas);
            }
            canvas.restore();
        }
        rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.P), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P));
        canvas.save();
        canvas.clipRect(rect);
        canvas.translate(paddingLeft, 0.0f);
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            yh.f fVar2 = (yh.f) obj;
            Rect bounds2 = fVar2.getBounds();
            int i14 = rect.top;
            int i15 = bounds2.bottom;
            if ((i14 <= i15 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i15 >= i14)) {
                fVar2.h(fVar2.y ? this.E : getPaint().getColor());
                fVar2.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        g(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        if (this.h) {
            return;
        }
        this.r = i3;
        this.s = i10;
        d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
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
    public void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        if (!this.h) {
            f();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i3);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i3);
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
                        yh.f fVar = (yh.f) obj;
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

    public void setClipToPadding(boolean z10) {
        this.M = z10;
    }

    public void setEmojiColor(Integer num) {
        this.O = num;
        this.G = new PorterDuffColorFilter(num == null ? this.N : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f10) {
        this.P = f10;
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
    public void setTextColor(int i3) {
        this.N = i3;
        super.setTextColor(i3);
        Integer num = this.O;
        if (num != null) {
            i3 = num.intValue();
        }
        this.G = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }
}
