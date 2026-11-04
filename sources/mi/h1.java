package mi;

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
import org.telegram.messenger.au;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class h1 extends xs implements org.telegram.ui.ActionBar.z5 {
    public int A2;
    public final e1 B2;
    public float C2;
    public float D2;
    public long E2;
    public int F2;
    public j4 G2;
    public boolean H2;
    public final a1 I2;
    public g1 Z1;
    public f1 a2;
    public final org.telegram.ui.ActionBar.e6 b2;
    public int c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public n70 m2;
    public Paint n2;
    public Layout o2;
    public int p2;
    public boolean q2;
    public final z0 r2;
    public TL_iv.PageBlock s2;
    public long t2;
    public int u2;
    public final e1 v2;
    public int w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    /* JADX WARN: Type inference failed for: r1v0, types: [mi.z0] */
    public h1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.c2 = h10.t0;
        this.p2 = -1;
        this.q2 = true;
        this.r2 = new InputFilter() { // from class: mi.z0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
                h1 h1Var = h1.this;
                if (!h1Var.h2 || h1Var.d2) {
                    return null;
                }
                g1 g1Var = h1Var.Z1;
                if (g1Var != null && charSequence != null && i10 > i3 && i11 == i12) {
                    g1Var.g1(charSequence.subSequence(i3, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.u2 = -1;
        this.v2 = new e1(this, 0);
        this.w2 = k6.G6;
        this.B2 = new e1(this, 1);
        this.I2 = new a1(this, 0);
        this.b2 = e6Var;
        this.X1 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        b1 b1Var = new b1(0);
        c1 c1Var = new c1(this);
        setCustomSelectionActionModeCallback(b1Var);
        setCustomInsertionActionModeCallback(c1Var);
        setOnLongClickListener(new gi.p4(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new ci.o(this, 2));
        addTextChangedListener(new d1(this));
        this.x2 = false;
        this.y2 = true;
        updateColors();
    }

    @Override // org.telegram.ui.Components.xs
    public final x31 A(String str) {
        return d6.k(str);
    }

    public final void I() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        j4[] j4VarArr = (j4[]) text.getSpans(0, text.length(), j4.class);
        for (j4 j4Var : j4VarArr) {
            j4Var.d(text);
        }
        for (j4 j4Var2 : j4VarArr) {
            j4Var2.a(this.c2, this, this.b2);
        }
    }

    public final void J() {
        org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
        if (u3Var != null) {
            try {
                u3Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final j4 K(float f10, float f11) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (j4 j4Var : (j4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), j4.class)) {
                int spanStart = text.getSpanStart(j4Var);
                int spanEnd = text.getSpanEnd(j4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                        return j4Var;
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
        this.e2 = true;
        getText().replace(max, max2, "\n");
        this.e2 = false;
        setSelection(max + 1);
    }

    public final void M() {
        if (this.j2) {
            this.k2 = true;
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
            this.k2 = false;
        }
    }

    public final void N() {
        g1 g1Var = this.Z1;
        if (g1Var != null) {
            g1Var.f(this);
        }
        requestFocus();
        org.telegram.messenger.g0.K3(this);
    }

    public final void O() {
        J();
        if (isFocused()) {
            clearFocus();
        }
        N();
        J();
        post(new a1(this, 1));
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.ActionBar.j4
    public final void a(int i3, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        d6.o(text, i10, min, i3, true, this.s2);
        if ((i3 & 256) != 0) {
            h();
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
        this.q2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.ActionBar.j4
    public final void b(int i3, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text == null || i10 < 0 || i11 < 0 || i10 >= i11 || i10 >= (min = Math.min(i11, text.length()))) {
            return;
        }
        if ((i3 & 1) != 0) {
            this.l2 = false;
        }
        d6.o(text, i10, min, i3, false, this.s2);
        if ((i3 & 256) != 0) {
            h();
        }
        vs vsVar = this.O1;
        if (vsVar != null) {
            vsVar.m();
        }
        this.q2 = true;
        invalidate();
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.ActionBar.j4
    public final int c(int i3, int i10) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i3)) < (min = Math.min(i10, text.length()))) {
            return d6.q(max, min, text);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        g1 g1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.Z1 == null || this.i2) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.f2 && (z10 || keyEvent.isShiftPressed())) {
                    L();
                    return true;
                }
                this.Z1.V0(this);
            }
        } else if (keyEvent.getAction() == 0 && (g1Var = this.Z1) != null) {
            g1Var.X1(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.b2;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        I();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.I2);
        this.G2 = null;
        this.H2 = false;
        Editable text = getText();
        if (text != null) {
            for (j4 j4Var : (j4[]) text.getSpans(0, text.length(), j4.class)) {
                au auVar = j4Var.b;
                if (auVar != null && j4Var.c == this) {
                    auVar.h = null;
                    auVar.a.a.f(this);
                    j4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.xs, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        Layout layout = getLayout();
        n70 n70Var = null;
        if (layout == null) {
            this.m2 = null;
            this.o2 = null;
            this.p2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.q2 || layout != this.o2 || text.length() != this.p2) {
                this.q2 = false;
                this.o2 = layout;
                this.p2 = text.length();
                this.m2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    uy0[] uy0VarArr = (uy0[]) spanned.getSpans(0, spanned.length(), uy0.class);
                    int length = uy0VarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        uy0 uy0Var = uy0VarArr[i10];
                        int i11 = uy0Var.b.a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(uy0Var);
                            int spanEnd = spanned.getSpanEnd(uy0Var);
                            n70Var = n70Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (n70Var == null) {
                                    n70 n70Var2 = new n70(0);
                                    n70Var2.n = false;
                                    n70Var = n70Var2;
                                }
                                n70Var.d(layout, spanStart, 0.0f);
                                int L = (32768 & i11) != 0 ? -org.telegram.messenger.g0.L(6.0f) : (i11 & TLObject.FLAG_14) != 0 ? org.telegram.messenger.g0.L(2.0f) : 0;
                                if (L != 0) {
                                    i3 = org.telegram.messenger.g0.L(L > 0 ? 5.0f : -2.0f) + L;
                                } else {
                                    i3 = 0;
                                }
                                n70Var.o = i3;
                                layout.getSelectionPath(spanStart, spanEnd, n70Var);
                            }
                        }
                        i10++;
                        n70Var = n70Var;
                    }
                    if (n70Var != null) {
                        n70Var.n = true;
                    }
                    this.m2 = n70Var;
                }
            }
        }
        if (this.m2 != null) {
            if (this.n2 == null) {
                Paint paint = new Paint(1);
                this.n2 = paint;
                paint.setPathEffect(n70.c());
            }
            this.n2.setColor(k6.w0(k6.K6, this.b2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.P);
            canvas.drawPath(this.m2, this.n2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 == 67 && this.Z1 != null) {
            this.t2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.Z1.w0();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.Z1.c0(this)) {
                return true;
            }
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public final void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        g1 g1Var = this.Z1;
        if (g1Var != null) {
            g1Var.l(this, i3, i10);
        }
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        M();
    }

    @Override // org.telegram.ui.Components.xs, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        g1 g1Var;
        g1 g1Var2;
        if (i3 == 16908319 && (g1Var2 = this.Z1) != null && g1Var2.m()) {
            return true;
        }
        if (i3 == 16908322 && (g1Var = this.Z1) != null && g1Var.M0(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.Z1 != null && isEnabled() && isFocusable()) {
            this.Z1.f(this);
        }
        if (!this.h2) {
            int action = motionEvent.getAction();
            r rVar = null;
            a1 a1Var = this.I2;
            int i3 = 0;
            if (action == 0) {
                this.C2 = motionEvent.getX();
                this.D2 = motionEvent.getY();
                this.E2 = motionEvent.getEventTime();
                j4 K = K(motionEvent.getX(), motionEvent.getY());
                this.G2 = K;
                if (K != null && this.a2 != null) {
                    this.H2 = false;
                    K.b().a.m(true);
                    org.telegram.messenger.g0.r(a1Var);
                    org.telegram.messenger.g0.i3(a1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.G2 = null;
            } else {
                j4 j4Var = this.G2;
                if (j4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && K(motionEvent.getX(), motionEvent.getY()) == j4Var;
                    if (!z11 || z10) {
                        j4Var.b().a.m(false);
                        org.telegram.messenger.g0.r(a1Var);
                    }
                    if (z10) {
                        this.G2 = null;
                        if (!this.H2 && z11 && motionEvent.getAction() == 1) {
                            ((s2) this.a2).a(this, j4Var, false);
                        }
                        this.H2 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.F2 == 0) {
                        this.F2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.C2;
                    float y9 = motionEvent.getY() - this.D2;
                    float f10 = (y9 * y9) + (x10 * x10);
                    int i10 = this.F2;
                    if (f10 <= i10 * i10 && motionEvent.getEventTime() - this.E2 < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + org.telegram.messenger.g0.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i3];
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.Z(getContext(), rVar.a, new f(1, this, rVar), this.b2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z10) {
        if (this.g2 == z10) {
            return;
        }
        this.g2 = z10;
        this.y2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z10) {
        this.i2 = z10;
    }

    public void setAutoBold(boolean z10) {
        this.l2 = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.s2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.j2 == z10) {
            return;
        }
        this.j2 = z10;
        if (z10) {
            M();
        } else {
            int L = org.telegram.messenger.g0.L(2.0f);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (!this.k2) {
            this.j2 = false;
        }
        super.setGravity(i3);
    }

    public void setInlineButtonClickListener(f1 f1Var) {
        this.a2 = f1Var;
    }

    public void setInlineButtonContext(int i3) {
        this.c2 = i3;
        I();
    }

    @Override // android.widget.TextView
    public void setInputType(int i3) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i3) {
            this.u2 = -1;
            return;
        }
        if (isFocused() && SystemClock.uptimeMillis() - this.t2 < 500) {
            if (this.u2 < 0) {
                postDelayed(this.v2, 500L);
            }
            this.u2 = i3;
        } else {
            this.u2 = -1;
            super.setInputType(i3);
            if (!isFocused() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(g1 g1Var) {
        this.Z1 = g1Var;
    }

    public void setLocked(boolean z10) {
        z0 z0Var;
        boolean z11;
        if (this.h2 == z10) {
            return;
        }
        this.h2 = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i3 = 0;
        while (true) {
            z0Var = this.r2;
            if (i3 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i3] == z0Var) {
                    z11 = true;
                    break;
                }
                i3++;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = z0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f2 = z10;
    }

    @Override // org.telegram.ui.Components.bt, android.widget.TextView
    public void setTextColor(int i3) {
        super.setTextColor(i3);
        if (this.z2) {
            return;
        }
        this.x2 = true;
    }

    public void setTextColorKey(int i3) {
        this.w2 = i3;
        this.x2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.d2 = true;
        setText(charSequence);
        I();
        setSelection(length());
        this.d2 = false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        this.z2 = true;
        try {
            boolean z10 = this.x2;
            org.telegram.ui.ActionBar.e6 e6Var = this.b2;
            if (!z10 && getCurrentTextColor() != (w02 = k6.w0(this.w2, e6Var))) {
                setTextColor(w02);
            }
            if (this.y2 || getCurrentHintTextColor() == this.A2) {
                this.y2 = false;
                this.A2 = this.g2 ? k6.r1(0.5f, k6.w0(k6.Ci, e6Var)) : k6.w0(k6.H6, e6Var);
                int currentHintTextColor = getCurrentHintTextColor();
                int i3 = this.A2;
                if (currentHintTextColor != i3) {
                    setHintTextColor(i3);
                }
            }
            this.z2 = false;
            int w03 = k6.w0(k6.Uc, e6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w03) {
                setLinkTextColor(w03);
            }
            setCursorColor(k6.w0(k6.G6, e6Var));
            setHandlesColor(k6.w0(k6.l6, e6Var));
            boolean h12 = k6.h1();
            e1 e1Var = this.B2;
            if (h12) {
                removeCallbacks(e1Var);
                postDelayed(e1Var, 100L);
            } else {
                removeCallbacks(e1Var);
                I();
            }
        } catch (Throwable th2) {
            this.z2 = false;
            throw th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
    }
}
