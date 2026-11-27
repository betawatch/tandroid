// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class cu3 extends EditText {
    public static Boolean a0;
    public int E;
    public dm F;
    public PorterDuffColorFilter G;
    public boolean H;
    public Layout I;
    public int J;
    public l K;
    public Rect L;
    public boolean M;
    public int N;
    public Integer O;
    public float P;
    public boolean Q;
    public nm7 R;
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
    public nk0 f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        int i;
        int i2;
        l lVar = this.K;
        CharSequence text = getLayout() != null ? getLayout().getText() : null;
        boolean z = false;
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (smb smbVar : (smb[]) spannable.getSpans(0, spannable.length(), smb.class)) {
                int spanStart = spannable.getSpanStart(smbVar);
                int spanEnd = spannable.getSpanEnd(smbVar);
                if (smbVar.b() && ((spanStart > (i = this.r) && spanEnd < this.s) || ((i > spanStart && i < spanEnd) || ((i2 = this.s) > spanStart && i2 < spanEnd)))) {
                    removeCallbacks(lVar);
                    this.y = false;
                    z = true;
                    break;
                }
            }
        }
        if (!this.d || z || this.y) {
            return;
        }
        this.y = true;
        postDelayed(lVar, 10000L);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        nk0 nk0Var;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z = false;
        } else {
            int size = arrayList.size();
            z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                n19 n19Var = (n19) obj;
                zb4 zb4Var = n19Var.e.K;
                boolean z3 = n19Var.b() && n19Var.g.contains(motionEvent.getX(), motionEvent.getY() - ((float) paddingTop));
                if (motionEvent.getAction() == 0) {
                    if (zb4Var != null) {
                        zb4Var.d(z3);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (zb4Var != null && zb4Var.c && z3) {
                        n19Var.e.e = !r5.e;
                        g(true);
                        z = true;
                    }
                    if (zb4Var != null) {
                        zb4Var.d(false);
                    }
                } else if (motionEvent.getAction() == 3 && zb4Var != null) {
                    zb4Var.d(false);
                }
                z = (zb4Var != null && zb4Var.c) || z;
            }
        }
        if (!z) {
            if (this.e && (nk0Var = this.f) != null && ((GestureDetector) ((kj4) nk0Var.d).b).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z2) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return wl.f();
    }

    public final void f() {
        Editable text = getText();
        if (text != null) {
            for (smb smbVar : (smb[]) text.getSpans(0, text.length(), smb.class)) {
                if (smbVar.b()) {
                    boolean z = this.d;
                    rmb rmbVar = smbVar.b;
                    if (z) {
                        rmbVar.a |= 512;
                    } else {
                        rmbVar.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z) {
        if (this.V) {
            this.W = true;
            return;
        }
        int i = 0;
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (z || this.S != length) {
            this.T = 2;
            this.S = length;
        }
        if (this.T > 0) {
            boolean[] zArr = this.U;
            if (zArr == null) {
                zArr = new boolean[1];
                this.U = zArr;
            }
            zArr[0] = false;
            this.W = false;
            this.V = true;
            this.c = r19.d(this, getLayout(), this.c, this.U);
            if (this.W) {
                this.c = r19.d(this, getLayout(), this.c, this.U);
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
                i = getLayout().getText().length();
            }
            this.S = i;
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
        p19[] p19VarArr = (p19[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), p19.class);
        for (int length = p19VarArr.length - 1; length >= 0; length--) {
            p19 p19Var = p19VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(p19Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(p19Var);
            spannableStringBuilder.removeSpan(p19Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        cu3 cu3Var;
        dm dmVar;
        dm dmVar2;
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
        if (layout == null || !(layout.getText() instanceof Spannable)) {
            cu3Var = this;
        } else {
            if (this.H && (dmVar2 = this.F) != null) {
                ArrayList arrayList2 = dmVar2.a;
                for (int i = 0; i < arrayList2.size(); i++) {
                    ((cm) arrayList2.get(i)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            short s = npa.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            int i2 = measuredWidth;
            cu3Var = this;
            npa.a(cu3Var, layout2, 0, i2, (Spanned) getText(), stack, arrayList, arrayList3);
            if (cu3Var.H && (dmVar = cu3Var.F) != null) {
                ArrayList arrayList4 = dmVar.a;
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    ((cm) arrayList4.get(i3)).d.recordPositions = true;
                }
            }
        }
        cu3Var.invalidate();
    }

    public final void i(npa npaVar, float f, float f2) {
        if (this.d) {
            return;
        }
        this.w = f;
        this.x = f2;
        this.y = false;
        removeCallbacks(this.K);
        j(true, false);
        npaVar.q = new au3(this, (byte) 0);
        float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((npa) obj).j(f, f2, sqrt, false);
        }
    }

    public final void j(boolean z, boolean z2) {
        this.d = z;
        Editable text = getText();
        if (text != null) {
            for (smb smbVar : (smb[]) text.getSpans(0, text.length(), smb.class)) {
                if (smbVar.b()) {
                    rmb rmbVar = smbVar.b;
                    if (z) {
                        rmbVar.a |= 512;
                    } else {
                        rmbVar.a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.r, this.s);
        this.h = false;
        if (z2) {
            h();
        }
    }

    public final void k(boolean z) {
        if (this.H) {
            int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
            if (!z && this.I == getLayout() && this.J == length) {
                return;
            }
            this.F = hm.update(e(), this, this.F, getLayout());
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
        hm.release(this, this.F);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        boolean z = this.Q;
        Rect rect = this.L;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.M && getScrollY() != 0) {
            canvas.clipRect(-hl.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.P, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P);
        }
        int paddingLeft = getPaddingLeft();
        int i = 0;
        if (arrayList2.isEmpty()) {
            path = path2;
        } else {
            path2.rewind();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                Rect bounds = ((npa) arrayList2.get(i2)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i2 = i3;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        g(false);
        for (int i4 = 0; i4 < this.c.size(); i4++) {
            n19 n19Var = (n19) this.c.get(i4);
            int width = getWidth();
            int i5 = this.E;
            getPaint();
            n19Var.a(canvas, width, i5);
        }
        k(false);
        if (z) {
            nm7 nm7Var = this.R;
            if (nm7Var == null) {
                nm7Var = new nm7();
                this.R = nm7Var;
            }
            nm7Var.a = canvas;
            super.onDraw(nm7Var);
        } else {
            super.onDraw(canvas);
        }
        if (!this.H || this.F == null) {
            arrayList = arrayList2;
        } else {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            hm.drawAnimatedEmojis(canvas, getLayout(), this.F, 0.0f, arrayList, computeVerticalScrollOffset() - hl.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.G);
            canvas.restore();
        }
        canvas.restore();
        if (arrayList.isEmpty()) {
            return;
        }
        npa npaVar = (npa) arrayList.get(0);
        if (npaVar.m > 0.0f && npaVar.n > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            path.rewind();
            ((npa) arrayList.get(0)).e(path);
            canvas.clipPath(path);
            canvas.translate(0.0f, -getPaddingTop());
            if (z) {
                nm7 nm7Var2 = this.R;
                if (nm7Var2 == null) {
                    nm7Var2 = new nm7();
                    this.R = nm7Var2;
                }
                nm7Var2.a = canvas;
                super.onDraw(nm7Var2);
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
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            npa npaVar2 = (npa) obj;
            Rect bounds2 = npaVar2.getBounds();
            int i6 = rect.top;
            int i7 = bounds2.bottom;
            if ((i6 <= i7 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i7 >= i6)) {
                npaVar2.h(npaVar2.y ? this.E : getPaint().getColor());
                npaVar2.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(false);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.h) {
            return;
        }
        this.r = i;
        this.s = i2;
        d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
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
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.h) {
            f();
            try {
                Layout layout = getLayout();
                if ((charSequence instanceof Spannable) && layout != null) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(i);
                    int lineTop = (int) ((layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset)) / 2.0f);
                    ArrayList arrayList = this.a;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i4);
                        i4++;
                        npa npaVar = (npa) obj;
                        if (npaVar.getBounds().contains(primaryHorizontal, lineTop)) {
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        k(true);
        g(true);
        invalidate();
    }

    public void setClipToPadding(boolean z) {
        this.M = z;
    }

    public void setEmojiColor(Integer num) {
        this.O = num;
        this.G = new PorterDuffColorFilter(num == null ? this.N : num.intValue(), PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f) {
        this.P = f;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z) {
        this.e = z;
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
    public void setTextColor(int i) {
        this.N = i;
        super.setTextColor(i);
        Integer num = this.O;
        if (num != null) {
            i = num.intValue();
        }
        this.G = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
