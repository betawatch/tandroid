package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import java.util.HashSet;
import org.telegram.messenger.cu;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class f1 extends ot implements org.telegram.ui.ActionBar.b6 {
    public final c1 A2;
    public int B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public int F2;
    public final c1 G2;
    public float H2;
    public float I2;
    public long J2;
    public int K2;
    public i4 L2;
    public boolean M2;
    public final y0 N2;
    public e1 e2;
    public d1 f2;
    public final h6 g2;
    public int h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public boolean q2;
    public h80 r2;
    public Paint s2;
    public Layout t2;
    public int u2;
    public boolean v2;
    public final x0 w2;
    public TL_iv.PageBlock x2;
    public long y2;
    public int z2;

    /* JADX WARN: Type inference failed for: r1v0, types: [oi.x0] */
    public f1(Context context, h6 h6Var) {
        super(context, h6Var);
        this.h2 = j10.t0;
        this.u2 = -1;
        this.v2 = true;
        this.w2 = new InputFilter() { // from class: oi.x0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
                f1 f1Var = f1.this;
                if (!f1Var.m2 || f1Var.i2) {
                    return null;
                }
                e1 e1Var = f1Var.e2;
                if (e1Var != null && charSequence != null && i10 > i7 && i11 == i12) {
                    e1Var.b1(charSequence.subSequence(i7, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.z2 = -1;
        this.A2 = new c1(this, 0);
        this.B2 = m6.G6;
        this.G2 = new c1(this, 1);
        this.N2 = new y0(this, 0);
        this.g2 = h6Var;
        this.c2 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        z0 z0Var = new z0(0);
        a1 a1Var = new a1(this);
        setCustomSelectionActionModeCallback(z0Var);
        setCustomInsertionActionModeCallback(a1Var);
        setOnLongClickListener(new hi.n4(this, 3));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new di.n(this, 2));
        addTextChangedListener(new b1(this));
        this.C2 = false;
        this.D2 = true;
        updateColors();
    }

    @Override // org.telegram.ui.Components.ot
    public final u41 B(String str) {
        return c6.k(str);
    }

    public final void J() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        i4[] i4VarArr = (i4[]) text.getSpans(0, text.length(), i4.class);
        for (i4 i4Var : i4VarArr) {
            i4Var.d(text);
        }
        for (i4 i4Var2 : i4VarArr) {
            i4Var2.a(this.h2, this, this.g2);
        }
    }

    public final void K() {
        org.telegram.ui.ActionBar.x3 x3Var = this.Z0;
        if (x3Var != null) {
            try {
                x3Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final i4 L(float f10, float f11) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (i4 i4Var : (i4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), i4.class)) {
                int spanStart = text.getSpanStart(i4Var);
                int spanEnd = text.getSpanEnd(i4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                        return i4Var;
                    }
                }
            }
        }
        return null;
    }

    public final void M() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.j2 = true;
        getText().replace(max, max2, "\n");
        this.j2 = false;
        setSelection(max + 1);
    }

    public final void N() {
        if (this.o2) {
            this.p2 = true;
            int L = org.telegram.messenger.g0.L(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(L, getPaddingTop(), L, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (L * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + L, getPaddingTop(), L, getPaddingBottom());
            }
            this.p2 = false;
        }
    }

    public final void O() {
        e1 e1Var = this.e2;
        if (e1Var != null) {
            e1Var.e(this);
        }
        requestFocus();
        org.telegram.messenger.g0.I3(this);
    }

    public final void P() {
        K();
        if (isFocused()) {
            clearFocus();
        }
        O();
        K();
        post(new y0(this, 1));
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.ActionBar.k4
    public final void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        c6.o(text, i10, min, i7, true, this.x2);
        if ((i7 & 256) != 0) {
            h();
        }
        mt mtVar = this.T1;
        if (mtVar != null) {
            mtVar.g();
        }
        this.v2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.ActionBar.k4
    public final void b(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        if ((i7 & 1) != 0) {
            this.q2 = false;
        }
        c6.o(text, i10, min, i7, false, this.x2);
        if ((i7 & 256) != 0) {
            h();
        }
        mt mtVar = this.T1;
        if (mtVar != null) {
            mtVar.g();
        }
        this.v2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.ActionBar.k4
    public final int c(int i7, int i10) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i7)) < (min = Math.min(i10, text.length()))) {
            return c6.q(max, min, text);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        e1 e1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.e2 == null || this.n2) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.k2 && (z10 || keyEvent.isShiftPressed())) {
                    M();
                    return true;
                }
                this.e2.x0(this);
            }
        } else if (keyEvent.getAction() == 0 && (e1Var = this.e2) != null) {
            e1Var.E1(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public h6 getResourcesProvider() {
        return this.g2;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.N2);
        this.L2 = null;
        this.M2 = false;
        Editable text = getText();
        if (text != null) {
            for (i4 i4Var : (i4[]) text.getSpans(0, text.length(), i4.class)) {
                cu cuVar = i4Var.b;
                if (cuVar != null && i4Var.c == this) {
                    cuVar.b(this);
                    i4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.ot, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        Layout layout = getLayout();
        h80 h80Var = null;
        if (layout == null) {
            this.r2 = null;
            this.t2 = null;
            this.u2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.v2 || layout != this.t2 || text.length() != this.u2) {
                this.v2 = false;
                this.t2 = layout;
                this.u2 = text.length();
                this.r2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    gz0[] gz0VarArr = (gz0[]) spanned.getSpans(0, spanned.length(), gz0.class);
                    int length = gz0VarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        gz0 gz0Var = gz0VarArr[i10];
                        int i11 = gz0Var.b.a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(gz0Var);
                            int spanEnd = spanned.getSpanEnd(gz0Var);
                            h80Var = h80Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (h80Var == null) {
                                    h80 h80Var2 = new h80(0);
                                    h80Var2.n = false;
                                    h80Var = h80Var2;
                                }
                                h80Var.d(layout, spanStart, 0.0f);
                                int L = (32768 & i11) != 0 ? -org.telegram.messenger.g0.L(6.0f) : (i11 & TLObject.FLAG_14) != 0 ? org.telegram.messenger.g0.L(2.0f) : 0;
                                if (L != 0) {
                                    i7 = org.telegram.messenger.g0.L(L > 0 ? 5.0f : -2.0f) + L;
                                } else {
                                    i7 = 0;
                                }
                                h80Var.o = i7;
                                layout.getSelectionPath(spanStart, spanEnd, h80Var);
                            }
                        }
                        i10++;
                        h80Var = h80Var;
                    }
                    if (h80Var != null) {
                        h80Var.n = true;
                    }
                    this.r2 = h80Var;
                }
            }
        }
        if (this.r2 != null) {
            if (this.s2 == null) {
                Paint paint = new Paint(1);
                this.s2 = paint;
                paint.setPathEffect(h80.c());
            }
            this.s2.setColor(m6.w0(m6.K6, this.g2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.P);
            canvas.drawPath(this.r2, this.s2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 67 && this.e2 != null) {
            this.y2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.e2.E0();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.e2.J(this)) {
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        e1 e1Var = this.e2;
        if (e1Var != null) {
            e1Var.r1(this, i7, i10);
        }
    }

    @Override // org.telegram.ui.Components.rt, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        N();
    }

    @Override // org.telegram.ui.Components.ot, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        e1 e1Var;
        e1 e1Var2;
        if (i7 == 16908319 && (e1Var2 = this.e2) != null && e1Var2.o()) {
            return true;
        }
        if (i7 == 16908322 && (e1Var = this.e2) != null && e1Var.d2(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.e2 != null && isEnabled() && isFocusable()) {
            this.e2.e(this);
        }
        if (!this.m2) {
            int action = motionEvent.getAction();
            q qVar = null;
            y0 y0Var = this.N2;
            int i7 = 0;
            if (action == 0) {
                this.H2 = motionEvent.getX();
                this.I2 = motionEvent.getY();
                this.J2 = motionEvent.getEventTime();
                i4 L = L(motionEvent.getX(), motionEvent.getY());
                this.L2 = L;
                if (L != null && this.f2 != null) {
                    this.M2 = false;
                    L.b().a.m(true);
                    org.telegram.messenger.g0.r(y0Var);
                    org.telegram.messenger.g0.h3(y0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.L2 = null;
            } else {
                i4 i4Var = this.L2;
                if (i4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && L(motionEvent.getX(), motionEvent.getY()) == i4Var;
                    if (!z11 || z10) {
                        i4Var.b().a.m(false);
                        org.telegram.messenger.g0.r(y0Var);
                    }
                    if (z10) {
                        this.L2 = null;
                        if (!this.M2 && z11 && motionEvent.getAction() == 1) {
                            ((s2) this.f2).a(this, i4Var, false);
                        }
                        this.M2 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.K2 == 0) {
                        this.K2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.H2;
                    float y10 = motionEvent.getY() - this.I2;
                    float f10 = (y10 * y10) + (x10 * x10);
                    int i10 = this.K2;
                    if (f10 <= i10 * i10 && motionEvent.getEventTime() - this.J2 < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + org.telegram.messenger.g0.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                q[] qVarArr = (q[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), q.class);
                                int length = qVarArr.length;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    q qVar2 = qVarArr[i7];
                                    int spanStart = text.getSpanStart(qVar2);
                                    int spanEnd = text.getSpanEnd(qVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                                            qVar = qVar2;
                                            break;
                                        }
                                    }
                                    i7++;
                                }
                            }
                        }
                        if (qVar != null) {
                            o.Z(getContext(), qVar.a, new li.d(4, this, qVar), this.g2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z10) {
        if (this.l2 == z10) {
            return;
        }
        this.l2 = z10;
        this.D2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z10) {
        this.n2 = z10;
    }

    public void setAutoBold(boolean z10) {
        this.q2 = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.x2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.o2 == z10) {
            return;
        }
        this.o2 = z10;
        if (z10) {
            N();
        } else {
            int L = org.telegram.messenger.g0.L(2.0f);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (!this.p2) {
            this.o2 = false;
        }
        super.setGravity(i7);
    }

    public void setInlineButtonClickListener(d1 d1Var) {
        this.f2 = d1Var;
    }

    public void setInlineButtonContext(int i7) {
        this.h2 = i7;
        J();
    }

    @Override // android.widget.TextView
    public void setInputType(int i7) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i7) {
            this.z2 = -1;
            return;
        }
        if (isFocused() && SystemClock.uptimeMillis() - this.y2 < 500) {
            if (this.z2 < 0) {
                postDelayed(this.A2, 500L);
            }
            this.z2 = i7;
        } else {
            this.z2 = -1;
            super.setInputType(i7);
            if (!isFocused() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(e1 e1Var) {
        this.e2 = e1Var;
    }

    public void setLocked(boolean z10) {
        x0 x0Var;
        boolean z11;
        if (this.m2 == z10) {
            return;
        }
        this.m2 = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i7 = 0;
        while (true) {
            x0Var = this.w2;
            if (i7 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i7] == x0Var) {
                    z11 = true;
                    break;
                }
                i7++;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = x0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.k2 = z10;
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        if (this.E2) {
            return;
        }
        this.C2 = true;
    }

    public void setTextColorKey(int i7) {
        this.B2 = i7;
        this.C2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.i2 = true;
        setText(charSequence);
        J();
        setSelection(length());
        this.i2 = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        this.E2 = true;
        try {
            boolean z10 = this.C2;
            h6 h6Var = this.g2;
            if (!z10 && getCurrentTextColor() != (w02 = m6.w0(this.B2, h6Var))) {
                setTextColor(w02);
            }
            if (this.D2 || getCurrentHintTextColor() == this.F2) {
                this.D2 = false;
                this.F2 = this.l2 ? m6.r1(0.5f, m6.w0(m6.Fi, h6Var)) : m6.w0(m6.H6, h6Var);
                int currentHintTextColor = getCurrentHintTextColor();
                int i7 = this.F2;
                if (currentHintTextColor != i7) {
                    setHintTextColor(i7);
                }
            }
            this.E2 = false;
            int w03 = m6.w0(m6.Xc, h6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w03) {
                setLinkTextColor(w03);
            }
            setCursorColor(m6.w0(m6.G6, h6Var));
            setHandlesColor(m6.w0(m6.l6, h6Var));
            boolean h12 = m6.h1();
            c1 c1Var = this.G2;
            if (h12) {
                removeCallbacks(c1Var);
                postDelayed(c1Var, 100L);
            } else {
                removeCallbacks(c1Var);
                J();
            }
        } catch (Throwable th2) {
            this.E2 = false;
            throw th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
    }
}
