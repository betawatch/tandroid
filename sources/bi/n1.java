package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.d20;
import org.telegram.messenger.tu;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class n1 extends mt implements org.telegram.ui.ActionBar.k6 {
    public long A2;
    public int B2;
    public u4 C2;
    public boolean D2;
    public final g1 E2;
    public m1 Y1;
    public l1 Z1;
    public final org.telegram.ui.ActionBar.p6 a2;
    public int b2;
    public boolean c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public k80 l2;
    public Paint m2;
    public Layout n2;
    public int o2;
    public boolean p2;
    public final f1 q2;
    public TL_iv.PageBlock r2;
    public int s2;
    public boolean t2;
    public boolean u2;
    public boolean v2;
    public int w2;
    public final androidx.activity.i x2;
    public float y2;
    public float z2;

    /* JADX WARN: Type inference failed for: r0v0, types: [bi.f1] */
    public n1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.b2 = d20.s0;
        this.o2 = -1;
        this.p2 = true;
        this.q2 = new InputFilter() { // from class: bi.f1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                n1 n1Var = n1.this;
                if (!n1Var.g2 || n1Var.c2) {
                    return null;
                }
                m1 m1Var = n1Var.Y1;
                if (m1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    m1Var.w(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.s2 = org.telegram.ui.ActionBar.t6.G6;
        this.x2 = new androidx.activity.i(this, 9);
        this.E2 = new g1(this, 0);
        this.a2 = p6Var;
        this.W1 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        i1 i1Var = new i1(0);
        j1 j1Var = new j1(this);
        setCustomSelectionActionModeCallback(i1Var);
        setCustomInsertionActionModeCallback(j1Var);
        setOnLongClickListener(new h1(this, 0));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new ag.r1(this, 1));
        addTextChangedListener(new k1(this));
        this.t2 = false;
        this.u2 = true;
        updateColors();
    }

    @Override // org.telegram.ui.Components.mt
    public final g51 A(String str) {
        return s6.k(str);
    }

    public final void I() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        u4[] u4VarArr = (u4[]) text.getSpans(0, text.length(), u4.class);
        for (u4 u4Var : u4VarArr) {
            u4Var.d(text);
        }
        for (u4 u4Var2 : u4VarArr) {
            u4Var2.a(this.b2, this, this.a2);
        }
    }

    public final void J() {
        org.telegram.ui.ActionBar.d4 d4Var = this.Y0;
        if (d4Var != null) {
            try {
                d4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final u4 K(float f7, float f10) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f7 - getTotalPaddingLeft()) + getScrollX();
            for (u4 u4Var : (u4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), u4.class)) {
                int spanStart = text.getSpanStart(u4Var);
                int spanEnd = text.getSpanEnd(u4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.i0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.i0.L(2.0f)) {
                        return u4Var;
                    }
                }
            }
        }
        return null;
    }

    public final void L() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.d2 = true;
        getText().replace(max, max2, "\n");
        this.d2 = false;
        setSelection(max + 1);
    }

    public final void M() {
        if (this.i2) {
            this.j2 = true;
            int L = org.telegram.messenger.i0.L(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(L, getPaddingTop(), L, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (L * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + L, getPaddingTop(), L, getPaddingBottom());
            }
            this.j2 = false;
        }
    }

    public final void N() {
        m1 m1Var = this.Y1;
        if (m1Var != null) {
            m1Var.b(this);
        }
        requestFocus();
        org.telegram.messenger.i0.J3(this);
    }

    public final void O() {
        J();
        if (isFocused()) {
            clearFocus();
        }
        N();
        J();
        post(new g1(this, 1));
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.r4
    public final void a(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        s6.o(text, i11, min, i10, true, this.r2);
        if ((i10 & 256) != 0) {
            h();
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
        this.p2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.r4
    public final void b(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.k2 = false;
        }
        s6.o(text, i11, min, i10, false, this.r2);
        if ((i10 & 256) != 0) {
            h();
        }
        kt ktVar = this.N1;
        if (ktVar != null) {
            ktVar.m();
        }
        this.p2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.ActionBar.r4
    public final int c(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i10)) < (min = Math.min(i11, text.length()))) {
            return s6.q(max, min, text);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        m1 m1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.Y1 == null || this.h2) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.e2 && (z10 || keyEvent.isShiftPressed())) {
                    L();
                    return true;
                }
                this.Y1.e(this);
            }
        } else if (keyEvent.getAction() == 0 && (m1Var = this.Y1) != null) {
            m1Var.H(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return this.a2;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        I();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.messenger.i0.r(this.E2);
        this.C2 = null;
        this.D2 = false;
        Editable text = getText();
        if (text != null) {
            for (u4 u4Var : (u4[]) text.getSpans(0, text.length(), u4.class)) {
                tu tuVar = u4Var.b;
                if (tuVar != null && u4Var.c == this) {
                    tuVar.h = null;
                    tuVar.a.a.f(this);
                    u4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Layout layout = getLayout();
        k80 k80Var = null;
        if (layout == null) {
            this.l2 = null;
            this.n2 = null;
            this.o2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.p2 || layout != this.n2 || text.length() != this.o2) {
                this.p2 = false;
                this.n2 = layout;
                this.o2 = text.length();
                this.l2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    zz0[] zz0VarArr = (zz0[]) spanned.getSpans(0, spanned.length(), zz0.class);
                    int length = zz0VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        zz0 zz0Var = zz0VarArr[i11];
                        int i12 = zz0Var.b.a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(zz0Var);
                            int spanEnd = spanned.getSpanEnd(zz0Var);
                            k80Var = k80Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (k80Var == null) {
                                    k80 k80Var2 = new k80(0);
                                    k80Var2.n = false;
                                    k80Var = k80Var2;
                                }
                                k80Var.d(layout, spanStart, 0.0f);
                                int L = (32768 & i12) != 0 ? -org.telegram.messenger.i0.L(6.0f) : (i12 & TLObject.FLAG_14) != 0 ? org.telegram.messenger.i0.L(2.0f) : 0;
                                if (L != 0) {
                                    i10 = org.telegram.messenger.i0.L(L > 0 ? 5.0f : -2.0f) + L;
                                } else {
                                    i10 = 0;
                                }
                                k80Var.o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, k80Var);
                            }
                        }
                        i11++;
                        k80Var = k80Var;
                    }
                    if (k80Var != null) {
                        k80Var.n = true;
                    }
                    this.l2 = k80Var;
                }
            }
        }
        if (this.l2 != null) {
            if (this.m2 == null) {
                Paint paint = new Paint(1);
                this.m2 = paint;
                paint.setPathEffect(k80.c());
            }
            this.m2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.K6, this.a2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.O);
            canvas.drawPath(this.l2, this.m2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.Y1 != null) {
            if (length() == 0) {
                this.Y1.r();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.Y1.x(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        m1 m1Var = this.Y1;
        if (m1Var != null) {
            m1Var.i(this, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        M();
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        m1 m1Var;
        m1 m1Var2;
        if (i10 == 16908319 && (m1Var2 = this.Y1) != null && m1Var2.f()) {
            return true;
        }
        if (i10 == 16908322 && (m1Var = this.Y1) != null && m1Var.I(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.Y1 != null && isEnabled() && isFocusable()) {
            this.Y1.b(this);
        }
        if (!this.g2) {
            int action = motionEvent.getAction();
            v vVar = null;
            g1 g1Var = this.E2;
            int i10 = 0;
            if (action == 0) {
                this.y2 = motionEvent.getX();
                this.z2 = motionEvent.getY();
                this.A2 = motionEvent.getEventTime();
                u4 K = K(motionEvent.getX(), motionEvent.getY());
                this.C2 = K;
                if (K != null && this.Z1 != null) {
                    this.D2 = false;
                    K.b().a.m(true);
                    org.telegram.messenger.i0.r(g1Var);
                    org.telegram.messenger.i0.h3(g1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.C2 = null;
            } else {
                u4 u4Var = this.C2;
                if (u4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && K(motionEvent.getX(), motionEvent.getY()) == u4Var;
                    if (!z11 || z10) {
                        u4Var.b().a.m(false);
                        org.telegram.messenger.i0.r(g1Var);
                    }
                    if (z10) {
                        this.C2 = null;
                        if (!this.D2 && z11 && motionEvent.getAction() == 1) {
                            ((a3) this.Z1).a(this, u4Var, false);
                        }
                        this.D2 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.B2 == 0) {
                        this.B2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.y2;
                    float y3 = motionEvent.getY() - this.z2;
                    float f7 = (y3 * y3) + (x10 * x10);
                    int i11 = this.B2;
                    if (f7 <= i11 * i11 && motionEvent.getEventTime() - this.A2 < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - org.telegram.messenger.i0.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + org.telegram.messenger.i0.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                v[] vVarArr = (v[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), v.class);
                                int length = vVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    v vVar2 = vVarArr[i10];
                                    int spanStart = text.getSpanStart(vVar2);
                                    int spanEnd = text.getSpanEnd(vVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.i0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.i0.L(2.0f)) {
                                            vVar = vVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (vVar != null) {
                            t.X(getContext(), vVar.a, new ag.e0(4, this, vVar), this.a2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z10) {
        if (this.f2 == z10) {
            return;
        }
        this.f2 = z10;
        this.u2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z10) {
        this.h2 = z10;
    }

    public void setAutoBold(boolean z10) {
        this.k2 = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.r2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.i2 == z10) {
            return;
        }
        this.i2 = z10;
        if (z10) {
            M();
        } else {
            int L = org.telegram.messenger.i0.L(2.0f);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (!this.j2) {
            this.i2 = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(l1 l1Var) {
        this.Z1 = l1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.b2 = i10;
        I();
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        InputMethodManager inputMethodManager;
        boolean z10 = getInputType() != i10;
        super.setInputType(i10);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(m1 m1Var) {
        this.Y1 = m1Var;
    }

    public void setLocked(boolean z10) {
        f1 f1Var;
        boolean z11;
        if (this.g2 == z10) {
            return;
        }
        this.g2 = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            f1Var = this.q2;
            if (i10 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i10] == f1Var) {
                    z11 = true;
                    break;
                }
                i10++;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = f1Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.e2 = z10;
    }

    @Override // org.telegram.ui.Components.qt, android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        if (this.v2) {
            return;
        }
        this.t2 = true;
    }

    public void setTextColorKey(int i10) {
        this.s2 = i10;
        this.t2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.c2 = true;
        setText(charSequence);
        I();
        setSelection(length());
        this.c2 = false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        this.v2 = true;
        try {
            boolean z10 = this.t2;
            org.telegram.ui.ActionBar.p6 p6Var = this.a2;
            if (!z10 && getCurrentTextColor() != (w02 = org.telegram.ui.ActionBar.t6.w0(this.s2, p6Var))) {
                setTextColor(w02);
            }
            if (this.u2 || getCurrentHintTextColor() == this.w2) {
                this.u2 = false;
                this.w2 = this.f2 ? org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.H6, p6Var);
                int currentHintTextColor = getCurrentHintTextColor();
                int i10 = this.w2;
                if (currentHintTextColor != i10) {
                    setHintTextColor(i10);
                }
            }
            this.v2 = false;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, p6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w03) {
                setLinkTextColor(w03);
            }
            setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            setHandlesColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.l6, p6Var));
            boolean h12 = org.telegram.ui.ActionBar.t6.h1();
            androidx.activity.i iVar = this.x2;
            if (h12) {
                removeCallbacks(iVar);
                postDelayed(iVar, 100L);
            } else {
                removeCallbacks(iVar);
                I();
            }
        } catch (Throwable th2) {
            this.v2 = false;
            throw th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
    }
}
