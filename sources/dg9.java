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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class dg9 extends xt3 implements snb {
    public int A2;
    public final ag9 B2;
    public int C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public int G2;
    public final ag9 H2;
    public float I2;
    public float J2;
    public long K2;
    public int L2;
    public dj9 M2;
    public boolean N2;
    public final yf9 O2;
    public cg9 f2;
    public bg9 g2;
    public final vnb h2;
    public int i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public boolean q2;
    public boolean r2;
    public f66 s2;
    public Paint t2;
    public Layout u2;
    public int v2;
    public boolean w2;
    public final x32 x2;
    public TL_iv.PageBlock y2;
    public long z2;

    public dg9(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.i2 = yac.t0;
        this.v2 = -1;
        this.w2 = true;
        this.x2 = new x32(this, (byte) 1);
        this.A2 = -1;
        this.B2 = new ag9(this, (byte) 0);
        this.C2 = aob.G6;
        this.H2 = new ag9(this, (byte) 1);
        this.O2 = new yf9(this, (byte) 0);
        this.h2 = vnbVar;
        this.d2 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        ry7 ry7Var = new ry7((byte) 3);
        nk2 nk2Var = new nk2(this, (byte) 1);
        setCustomSelectionActionModeCallback(ry7Var);
        setCustomInsertionActionModeCallback(nk2Var);
        setOnLongClickListener(new zs(this, (byte) 12));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new j(this, (byte) 21));
        addTextChangedListener(new zf9(this));
        this.D2 = false;
        this.E2 = true;
        updateColors();
    }

    @Override // xt3
    public final h8c B(String str) {
        return mm9.k(str);
    }

    public final void J() {
        Editable text = getText();
        if (text != null) {
            dj9[] dj9VarArr = (dj9[]) text.getSpans(0, text.length(), dj9.class);
            for (dj9 dj9Var : dj9VarArr) {
                dj9Var.d(text);
            }
            for (dj9 dj9Var2 : dj9VarArr) {
                dj9Var2.a(this.i2, this.h2, this);
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

    public final dj9 L(float f, float f2) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f2 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f - getTotalPaddingLeft()) + getScrollX();
            for (dj9 dj9Var : (dj9[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), dj9.class)) {
                int spanStart = text.getSpanStart(dj9Var);
                int spanEnd = text.getSpanEnd(dj9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - hl.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + hl.L(2.0f)) {
                        return dj9Var;
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
        this.k2 = true;
        getText().replace(max, max2, "\n");
        this.k2 = false;
        setSelection(max + 1);
    }

    public final void N() {
        if (this.p2) {
            this.q2 = true;
            int L = hl.L(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(L, getPaddingTop(), L, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (L << 1)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + L, getPaddingTop(), L, getPaddingBottom());
            }
            this.q2 = false;
        }
    }

    public final void O() {
        cg9 cg9Var = this.f2;
        if (cg9Var != null) {
            cg9Var.e(this);
        }
        requestFocus();
        hl.E3(this);
    }

    public final void P() {
        K();
        if (isFocused()) {
            clearFocus();
        }
        O();
        K();
        post(new yf9(this, (byte) 1));
    }

    @Override // xt3, km4
    public final void a(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        mm9.o(text, i2, min, i, true, this.y2);
        if ((i & 256) != 0) {
            h();
        }
        vt3 vt3Var = this.U1;
        if (vt3Var != null) {
            vt3Var.c();
        }
        this.w2 = true;
        invalidate();
    }

    @Override // xt3, km4
    public final void b(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        if ((i & 1) != 0) {
            this.r2 = false;
        }
        mm9.o(text, i2, min, i, false, this.y2);
        if ((i & 256) != 0) {
            h();
        }
        vt3 vt3Var = this.U1;
        if (vt3Var != null) {
            vt3Var.c();
        }
        this.w2 = true;
        invalidate();
    }

    @Override // xt3, km4
    public final int c(int i, int i2) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i)) < (min = Math.min(i2, text.length()))) {
            return mm9.q(max, min, text);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        cg9 cg9Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.f2 == null || this.o2) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z = (keyEvent.getFlags() & 2) != 0;
                if (this.l2 && (z || keyEvent.isShiftPressed())) {
                    M();
                    return true;
                }
                this.f2.U(this);
            }
        } else if (keyEvent.getAction() == 0 && (cg9Var = this.f2) != null) {
            cg9Var.W(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public vnb getResourcesProvider() {
        return this.h2;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.view.View
    public final void onDetachedFromWindow() {
        hl.r(this.O2);
        this.M2 = null;
        this.N2 = false;
        Editable text = getText();
        if (text != null) {
            for (dj9 dj9Var : (dj9[]) text.getSpans(0, text.length(), dj9.class)) {
                gk9 gk9Var = dj9Var.b;
                if (gk9Var != null && dj9Var.c == this) {
                    gk9Var.h = null;
                    gk9Var.a.a.f(this);
                    dj9Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Layout layout = getLayout();
        f66 f66Var = null;
        if (layout == null) {
            this.s2 = null;
            this.u2 = null;
            this.v2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.w2 || layout != this.u2 || text.length() != this.v2) {
                this.w2 = false;
                this.u2 = layout;
                this.v2 = text.length();
                this.s2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    smb[] smbVarArr = (smb[]) spanned.getSpans(0, spanned.length(), smb.class);
                    int length = smbVarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        smb smbVar = smbVarArr[i2];
                        int i3 = smbVar.b.a;
                        if ((65536 & i3) != 0) {
                            int spanStart = spanned.getSpanStart(smbVar);
                            int spanEnd = spanned.getSpanEnd(smbVar);
                            f66Var = f66Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (f66Var == null) {
                                    f66 f66Var2 = new f66(0);
                                    f66Var2.n = false;
                                    f66Var = f66Var2;
                                }
                                f66Var.d(layout, spanStart, 0.0f);
                                int L = (32768 & i3) != 0 ? -hl.L(6.0f) : (i3 & TLObject.FLAG_14) != 0 ? hl.L(2.0f) : 0;
                                if (L != 0) {
                                    i = hl.L(L > 0 ? 5.0f : -2.0f) + L;
                                } else {
                                    i = 0;
                                }
                                f66Var.o = i;
                                layout.getSelectionPath(spanStart, spanEnd, f66Var);
                            }
                        }
                        i2++;
                        f66Var = f66Var;
                    }
                    if (f66Var != null) {
                        f66Var.n = true;
                    }
                    this.s2 = f66Var;
                }
            }
        }
        if (this.s2 != null) {
            if (this.t2 == null) {
                Paint paint = new Paint(1);
                this.t2 = paint;
                paint.setPathEffect(f66.c());
            }
            this.t2.setColor(aob.v0(aob.K6, this.h2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.P);
            canvas.drawPath(this.s2, this.t2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && this.f2 != null) {
            this.z2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.f2.G();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f2.F(this)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // cu3, android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        cg9 cg9Var = this.f2;
        if (cg9Var != null) {
            cg9Var.s(this, i, i2);
        }
    }

    @Override // cu3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        N();
    }

    @Override // xt3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        cg9 cg9Var;
        cg9 cg9Var2;
        if (i == 16908319 && (cg9Var2 = this.f2) != null && cg9Var2.i()) {
            return true;
        }
        if (i == 16908322 && (cg9Var = this.f2) != null && cg9Var.w(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.f2 != null && isEnabled() && isFocusable()) {
            this.f2.e(this);
        }
        if (!this.n2) {
            int action = motionEvent.getAction();
            nl6 nl6Var = null;
            yf9 yf9Var = this.O2;
            int i = 0;
            if (action == 0) {
                this.I2 = motionEvent.getX();
                this.J2 = motionEvent.getY();
                this.K2 = motionEvent.getEventTime();
                dj9 L = L(motionEvent.getX(), motionEvent.getY());
                this.M2 = L;
                if (L != null && this.g2 != null) {
                    this.N2 = false;
                    L.b().a.m(true);
                    hl.r(yf9Var);
                    hl.d3(yf9Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.M2 = null;
            } else {
                dj9 dj9Var = this.M2;
                if (dj9Var != null) {
                    boolean z = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z2 = motionEvent.getAction() != 3 && L(motionEvent.getX(), motionEvent.getY()) == dj9Var;
                    if (!z2 || z) {
                        dj9Var.b().a.m(false);
                        hl.r(yf9Var);
                    }
                    if (z) {
                        this.M2 = null;
                        if (!this.N2 && z2 && motionEvent.getAction() == 1) {
                            ((oh9) this.g2).a(this, dj9Var, false);
                        }
                        this.N2 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.L2 == 0) {
                        this.L2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x = motionEvent.getX() - this.I2;
                    float y = motionEvent.getY() - this.J2;
                    float f = (y * y) + (x * x);
                    int i2 = this.L2;
                    if (f <= i2 * i2 && motionEvent.getEventTime() - this.K2 < ViewConfiguration.getLongPressTimeout()) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y2 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x2 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - hl.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + hl.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                nl6[] nl6VarArr = (nl6[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), nl6.class);
                                int length = nl6VarArr.length;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    nl6 nl6Var2 = nl6VarArr[i];
                                    int spanStart = text.getSpanStart(nl6Var2);
                                    int spanEnd = text.getSpanEnd(nl6Var2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - hl.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + hl.L(2.0f)) {
                                            nl6Var = nl6Var2;
                                            break;
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        if (nl6Var != null) {
                            v72.W(getContext(), nl6Var.a, new v35(this, nl6Var, (byte) 26), this.h2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z) {
        if (this.m2 == z) {
            return;
        }
        this.m2 = z;
        this.E2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z) {
        this.o2 = z;
    }

    public void setAutoBold(boolean z) {
        this.r2 = z;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.y2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z) {
        if (this.p2 == z) {
            return;
        }
        this.p2 = z;
        if (z) {
            N();
        } else {
            int L = hl.L(2.0f);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (!this.q2) {
            this.p2 = false;
        }
        super.setGravity(i);
    }

    public void setInlineButtonClickListener(bg9 bg9Var) {
        this.g2 = bg9Var;
    }

    public void setInlineButtonContext(int i) {
        this.i2 = i;
        J();
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i) {
            this.A2 = -1;
            return;
        }
        if (isFocused() && SystemClock.uptimeMillis() - this.z2 < 500) {
            if (this.A2 < 0) {
                postDelayed(this.B2, 500L);
            }
            this.A2 = i;
        } else {
            this.A2 = -1;
            super.setInputType(i);
            if (!isFocused() || (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(cg9 cg9Var) {
        this.f2 = cg9Var;
    }

    public void setLocked(boolean z) {
        x32 x32Var;
        boolean z2;
        if (this.n2 == z) {
            return;
        }
        this.n2 = z;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            x32Var = this.x2;
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (filters[i] == x32Var) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && !z2) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = x32Var;
            setFilters(inputFilterArr);
        }
        boolean z3 = !z;
        setAllowDrawCursor(z3);
        setCursorVisible(z3);
    }

    public void setSoftEnterNewline(boolean z) {
        this.l2 = z;
    }

    @Override // cu3, android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        if (this.F2) {
            return;
        }
        this.D2 = true;
    }

    public void setTextColorKey(int i) {
        this.C2 = i;
        this.D2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.j2 = true;
        setText(charSequence);
        J();
        setSelection(length());
        this.j2 = false;
    }

    @Override // snb
    public final void updateColors() {
        int v0;
        this.F2 = true;
        try {
            boolean z = this.D2;
            vnb vnbVar = this.h2;
            if (!z && getCurrentTextColor() != (v0 = aob.v0(this.C2, vnbVar))) {
                setTextColor(v0);
            }
            if (this.E2 || getCurrentHintTextColor() == this.G2) {
                this.E2 = false;
                this.G2 = this.m2 ? aob.p1(0.5f, aob.v0(aob.Fi, vnbVar)) : aob.v0(aob.H6, vnbVar);
                int currentHintTextColor = getCurrentHintTextColor();
                int i = this.G2;
                if (currentHintTextColor != i) {
                    setHintTextColor(i);
                }
            }
            this.F2 = false;
            int v02 = aob.v0(aob.Xc, vnbVar);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != v02) {
                setLinkTextColor(v02);
            }
            setCursorColor(aob.v0(aob.G6, vnbVar));
            setHandlesColor(aob.v0(aob.l6, vnbVar));
            boolean f1 = aob.f1();
            ag9 ag9Var = this.H2;
            if (f1) {
                removeCallbacks(ag9Var);
                postDelayed(ag9Var, 100L);
            } else {
                removeCallbacks(ag9Var);
                J();
            }
        } catch (Throwable th) {
            this.F2 = false;
            throw th;
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
    }
}
