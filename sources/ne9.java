// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ne9 extends qu3 implements vlb {
    public final ke9 A2;
    public int B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public int F2;
    public final ke9 G2;
    public float H2;
    public float I2;
    public long J2;
    public int K2;
    public qh9 L2;
    public boolean M2;
    public final ie9 N2;
    public me9 e2;
    public le9 f2;
    public final ylb g2;
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
    public b66 r2;
    public Paint s2;
    public Layout t2;
    public int u2;
    public boolean v2;
    public final s42 w2;
    public TL_iv.PageBlock x2;
    public long y2;
    public int z2;

    public ne9(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.h2 = z8c.t0;
        this.u2 = -1;
        this.v2 = true;
        this.w2 = new s42(this, (byte) 1);
        this.z2 = -1;
        this.A2 = new ke9(this, (byte) 0);
        this.B2 = cmb.F6;
        this.G2 = new ke9(this, (byte) 1);
        this.N2 = new ie9(this, (byte) 0);
        this.g2 = ylbVar;
        this.c2 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        mx7 mx7Var = new mx7((byte) 3);
        fl2 fl2Var = new fl2(this, (byte) 1);
        setCustomSelectionActionModeCallback(mx7Var);
        setCustomInsertionActionModeCallback(fl2Var);
        setOnLongClickListener(new au(this, (byte) 12));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new j(this, (byte) 22));
        addTextChangedListener(new je9(this));
        this.C2 = false;
        this.D2 = true;
        updateColors();
    }

    @Override // qu3
    public final i6c B(String str) {
        return zk9.k(str);
    }

    public final void J() {
        Editable text = getText();
        if (text != null) {
            qh9[] qh9VarArr = (qh9[]) text.getSpans(0, text.length(), qh9.class);
            for (qh9 qh9Var : qh9VarArr) {
                qh9Var.d(text);
            }
            for (qh9 qh9Var2 : qh9VarArr) {
                qh9Var2.a(this.h2, this.g2, this);
            }
        }
    }

    public final void K() {
        cl4 cl4Var = this.Z0;
        if (cl4Var != null) {
            try {
                cl4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final qh9 L(float f, float f2) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f2 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f - getTotalPaddingLeft()) + getScrollX();
            for (qh9 qh9Var : (qh9[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), qh9.class)) {
                int spanStart = text.getSpanStart(qh9Var);
                int spanEnd = text.getSpanEnd(qh9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - gm.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + gm.L(2.0f)) {
                        return qh9Var;
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
            int L = gm.L(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(L, getPaddingTop(), L, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (L << 1)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + L, getPaddingTop(), L, getPaddingBottom());
            }
            this.p2 = false;
        }
    }

    public final void O() {
        me9 me9Var = this.e2;
        if (me9Var != null) {
            me9Var.d(this);
        }
        requestFocus();
        gm.E3(this);
    }

    public final void P() {
        K();
        if (isFocused()) {
            clearFocus();
        }
        O();
        K();
        post(new ie9(this, (byte) 1));
    }

    @Override // qu3, gm4
    public final void a(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        zk9.o(text, i2, min, i, true, this.x2);
        if ((i & 256) != 0) {
            h();
        }
        ou3 ou3Var = this.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
        this.v2 = true;
        invalidate();
    }

    @Override // qu3, gm4
    public final void b(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        if ((i & 1) != 0) {
            this.q2 = false;
        }
        zk9.o(text, i2, min, i, false, this.x2);
        if ((i & 256) != 0) {
            h();
        }
        ou3 ou3Var = this.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
        this.v2 = true;
        invalidate();
    }

    @Override // qu3, gm4
    public final int c(int i, int i2) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i)) < (min = Math.min(i2, text.length()))) {
            return zk9.q(max, min, text);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        me9 me9Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.e2 == null || this.n2) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z = (keyEvent.getFlags() & 2) != 0;
                if (this.k2 && (z || keyEvent.isShiftPressed())) {
                    M();
                    return true;
                }
                this.e2.W(this);
            }
        } else if (keyEvent.getAction() == 0 && (me9Var = this.e2) != null) {
            me9Var.Z(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public ylb getResourcesProvider() {
        return this.g2;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.view.View
    public final void onDetachedFromWindow() {
        gm.r(this.N2);
        this.L2 = null;
        this.M2 = false;
        Editable text = getText();
        if (text != null) {
            for (qh9 qh9Var : (qh9[]) text.getSpans(0, text.length(), qh9.class)) {
                ti9 ti9Var = qh9Var.b;
                if (ti9Var != null && qh9Var.c == this) {
                    ti9Var.h = null;
                    ti9Var.a.a.f(this);
                    qh9Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // qu3, org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Layout layout = getLayout();
        b66 b66Var = null;
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
                    xkb[] xkbVarArr = (xkb[]) spanned.getSpans(0, spanned.length(), xkb.class);
                    int length = xkbVarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        xkb xkbVar = xkbVarArr[i2];
                        int i3 = xkbVar.b.a;
                        if ((65536 & i3) != 0) {
                            int spanStart = spanned.getSpanStart(xkbVar);
                            int spanEnd = spanned.getSpanEnd(xkbVar);
                            b66Var = b66Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (b66Var == null) {
                                    b66 b66Var2 = new b66(0);
                                    b66Var2.n = false;
                                    b66Var = b66Var2;
                                }
                                b66Var.d(layout, spanStart, 0.0f);
                                int L = (32768 & i3) != 0 ? -gm.L(6.0f) : (i3 & TLObject.FLAG_14) != 0 ? gm.L(2.0f) : 0;
                                if (L != 0) {
                                    i = gm.L(L > 0 ? 5.0f : -2.0f) + L;
                                } else {
                                    i = 0;
                                }
                                b66Var.o = i;
                                layout.getSelectionPath(spanStart, spanEnd, b66Var);
                            }
                        }
                        i2++;
                        b66Var = b66Var;
                    }
                    if (b66Var != null) {
                        b66Var.n = true;
                    }
                    this.r2 = b66Var;
                }
            }
        }
        if (this.r2 != null) {
            if (this.s2 == null) {
                Paint paint = new Paint(1);
                this.s2 = paint;
                paint.setPathEffect(b66.c());
            }
            this.s2.setColor(cmb.v0(cmb.J6, this.g2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.P);
            canvas.drawPath(this.r2, this.s2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && this.e2 != null) {
            this.y2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.e2.H();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.e2.G(this)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // vu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        me9 me9Var = this.e2;
        if (me9Var != null) {
            me9Var.r(this, i, i2);
        }
    }

    @Override // vu3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        N();
    }

    @Override // qu3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        me9 me9Var;
        me9 me9Var2;
        if (i == 16908319 && (me9Var2 = this.e2) != null && me9Var2.i()) {
            return true;
        }
        if (i == 16908322 && (me9Var = this.e2) != null && me9Var.v(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.e2 != null && isEnabled() && isFocusable()) {
            this.e2.d(this);
        }
        if (!this.m2) {
            int action = motionEvent.getAction();
            ll6 ll6Var = null;
            ie9 ie9Var = this.N2;
            int i = 0;
            if (action == 0) {
                this.H2 = motionEvent.getX();
                this.I2 = motionEvent.getY();
                this.J2 = motionEvent.getEventTime();
                qh9 L = L(motionEvent.getX(), motionEvent.getY());
                this.L2 = L;
                if (L != null && this.f2 != null) {
                    this.M2 = false;
                    L.b().a.n(true);
                    gm.r(ie9Var);
                    gm.d3(ie9Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.L2 = null;
            } else {
                qh9 qh9Var = this.L2;
                if (qh9Var != null) {
                    boolean z = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z2 = motionEvent.getAction() != 3 && L(motionEvent.getX(), motionEvent.getY()) == qh9Var;
                    if (!z2 || z) {
                        qh9Var.b().a.n(false);
                        gm.r(ie9Var);
                    }
                    if (z) {
                        this.L2 = null;
                        if (!this.M2 && z2 && motionEvent.getAction() == 1) {
                            ((ag9) this.f2).a(this, qh9Var, false);
                        }
                        this.M2 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.K2 == 0) {
                        this.K2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x = motionEvent.getX() - this.H2;
                    float y = motionEvent.getY() - this.I2;
                    float f = (y * y) + (x * x);
                    int i2 = this.K2;
                    if (f <= i2 * i2 && motionEvent.getEventTime() - this.J2 < ViewConfiguration.getLongPressTimeout()) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y2 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x2 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - gm.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + gm.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                ll6[] ll6VarArr = (ll6[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), ll6.class);
                                int length = ll6VarArr.length;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    ll6 ll6Var2 = ll6VarArr[i];
                                    int spanStart = text.getSpanStart(ll6Var2);
                                    int spanEnd = text.getSpanEnd(ll6Var2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - gm.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + gm.L(2.0f)) {
                                            ll6Var = ll6Var2;
                                            break;
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        if (ll6Var != null) {
                            p82.X(getContext(), ll6Var.a, new u35(this, ll6Var, (byte) 26), this.g2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z) {
        if (this.l2 == z) {
            return;
        }
        this.l2 = z;
        this.D2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z) {
        this.n2 = z;
    }

    public void setAutoBold(boolean z) {
        this.q2 = z;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.x2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z) {
        if (this.o2 == z) {
            return;
        }
        this.o2 = z;
        if (z) {
            N();
        } else {
            int L = gm.L(2.0f);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (!this.p2) {
            this.o2 = false;
        }
        super.setGravity(i);
    }

    public void setInlineButtonClickListener(le9 le9Var) {
        this.f2 = le9Var;
    }

    public void setInlineButtonContext(int i) {
        this.h2 = i;
        J();
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i) {
            this.z2 = -1;
            return;
        }
        if (isFocused() && SystemClock.uptimeMillis() - this.y2 < 500) {
            if (this.z2 < 0) {
                postDelayed(this.A2, 500L);
            }
            this.z2 = i;
        } else {
            this.z2 = -1;
            super.setInputType(i);
            if (!isFocused() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(me9 me9Var) {
        this.e2 = me9Var;
    }

    public void setLocked(boolean z) {
        s42 s42Var;
        boolean z2;
        if (this.m2 == z) {
            return;
        }
        this.m2 = z;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            s42Var = this.w2;
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (filters[i] == s42Var) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && !z2) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = s42Var;
            setFilters(inputFilterArr);
        }
        boolean z3 = !z;
        setAllowDrawCursor(z3);
        setCursorVisible(z3);
    }

    public void setSoftEnterNewline(boolean z) {
        this.k2 = z;
    }

    @Override // vu3, android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        if (this.E2) {
            return;
        }
        this.C2 = true;
    }

    public void setTextColorKey(int i) {
        this.B2 = i;
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

    @Override // vlb
    public final void updateColors() {
        int v0;
        this.E2 = true;
        try {
            boolean z = this.C2;
            ylb ylbVar = this.g2;
            if (!z && getCurrentTextColor() != (v0 = cmb.v0(this.B2, ylbVar))) {
                setTextColor(v0);
            }
            if (this.D2 || getCurrentHintTextColor() == this.F2) {
                this.D2 = false;
                this.F2 = this.l2 ? cmb.p1(0.5f, cmb.v0(cmb.Ei, ylbVar)) : cmb.v0(cmb.G6, ylbVar);
                int currentHintTextColor = getCurrentHintTextColor();
                int i = this.F2;
                if (currentHintTextColor != i) {
                    setHintTextColor(i);
                }
            }
            this.E2 = false;
            int v02 = cmb.v0(cmb.Wc, ylbVar);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != v02) {
                setLinkTextColor(v02);
            }
            setCursorColor(cmb.v0(cmb.F6, ylbVar));
            setHandlesColor(cmb.v0(cmb.k6, ylbVar));
            boolean f1 = cmb.f1();
            ke9 ke9Var = this.G2;
            if (f1) {
                removeCallbacks(ke9Var);
                postDelayed(ke9Var, 100L);
            } else {
                removeCallbacks(ke9Var);
                J();
            }
        } catch (Throwable th) {
            this.E2 = false;
            throw th;
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
    }
}
