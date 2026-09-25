package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.h90;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class i1 extends cu {
    public boolean E;
    public h90 F;
    public Paint G;
    public Layout H;
    public int I;
    public boolean J;
    public final b1 K;
    public TL_iv.PageBlock L;
    public int M;
    public float N;
    public float O;
    public long P;
    public int Q;
    public l4 R;
    public boolean S;
    public final c1 T;
    public h1 c;
    public g1 d;
    public final org.telegram.ui.ActionBar.d6 e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [ii.b1] */
    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f = UserConfig.selectedAccount;
        this.I = -1;
        this.J = true;
        this.K = new InputFilter() { // from class: ii.b1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                i1 i1Var = i1.this;
                if (!i1Var.v || i1Var.h) {
                    return null;
                }
                h1 h1Var = i1Var.c;
                if (h1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    h1Var.K(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.M = org.telegram.ui.ActionBar.h6.G6;
        this.T = new c1(this, 0);
        this.e = d6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        d1 d1Var = new d1(0);
        e1 e1Var = new e1(this);
        setCustomSelectionActionModeCallback(d1Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(e1Var);
        }
        setOnLongClickListener(new ci.m5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new hg.u0(this, 1));
        addTextChangedListener(new f1(this));
        t();
    }

    @Override // org.telegram.ui.Components.cu, org.telegram.ui.ActionBar.u4
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        g6.o(text, i11, min, i10, true, this.L);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.cu
    public final b61 createUrlSpan(String str) {
        return g6.k(str);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        h1 h1Var;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.c == null || this.w) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z10 = (keyEvent.getFlags() & 2) != 0;
                if (this.r && (z10 || keyEvent.isShiftPressed())) {
                    p();
                    return true;
                }
                this.c.m(this);
            }
        } else if (keyEvent.getAction() == 0 && (h1Var = this.c) != null) {
            h1Var.X(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cu, org.telegram.ui.ActionBar.u4
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i10)) < (min = Math.min(i11, text.length()))) {
            return g6.q(max, min, text);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        l4[] l4VarArr = (l4[]) text.getSpans(0, text.length(), l4.class);
        for (l4 l4Var : l4VarArr) {
            l4Var.d(text);
        }
        for (l4 l4Var2 : l4VarArr) {
            l4Var2.a(this.f, this, this.e);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
        if (g4Var != null) {
            try {
                g4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.cu
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.J = true;
        invalidate();
    }

    public final l4 o(float f7, float f10) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f7 - getTotalPaddingLeft()) + getScrollX();
            for (l4 l4Var : (l4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), l4.class)) {
                int spanStart = text.getSpanStart(l4Var);
                int spanEnd = text.getSpanEnd(l4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return l4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.eu, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.eu, android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.T);
        this.R = null;
        this.S = false;
        Editable text = getText();
        if (text != null) {
            for (l4 l4Var : (l4[]) text.getSpans(0, text.length(), l4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = l4Var.b;
                if (richButtonSpan != null && l4Var.c == this) {
                    richButtonSpan.detach(this);
                    l4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.cu, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.eu, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Layout layout = getLayout();
        h90 h90Var = null;
        if (layout == null) {
            this.F = null;
            this.H = null;
            this.I = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.J || layout != this.H || text.length() != this.I) {
                this.J = false;
                this.H = layout;
                this.I = text.length();
                this.F = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    c11[] c11VarArr = (c11[]) spanned.getSpans(0, spanned.length(), c11.class);
                    int length = c11VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        c11 c11Var = c11VarArr[i11];
                        int i12 = c11Var.b.a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(c11Var);
                            int spanEnd = spanned.getSpanEnd(c11Var);
                            h90Var = h90Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (h90Var == null) {
                                    h90 h90Var2 = new h90(0);
                                    h90Var2.n = false;
                                    h90Var = h90Var2;
                                }
                                h90Var.d(layout, spanStart, 0.0f);
                                int dp = (32768 & i12) != 0 ? -AndroidUtilities.dp(6.0f) : (i12 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                if (dp != 0) {
                                    i10 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                                } else {
                                    i10 = 0;
                                }
                                h90Var.o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, h90Var);
                            }
                        }
                        i11++;
                        h90Var = h90Var;
                    }
                    if (h90Var != null) {
                        h90Var.n = true;
                    }
                    this.F = h90Var;
                }
            }
        }
        if (this.F != null) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setPathEffect(h90.c());
            }
            this.G.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.F, this.G);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.c != null) {
            if (length() == 0) {
                this.c.x();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.c.t(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.eu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        h1 h1Var = this.c;
        if (h1Var != null) {
            h1Var.B(this, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.eu, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override // org.telegram.ui.Components.cu, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        h1 h1Var;
        h1 h1Var2;
        if (i10 == 16908319 && (h1Var2 = this.c) != null && h1Var2.f()) {
            return true;
        }
        if (i10 == 16908322 && (h1Var = this.c) != null && h1Var.p(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c != null && isEnabled() && isFocusable()) {
            this.c.c(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            t tVar = null;
            c1 c1Var = this.T;
            int i10 = 0;
            if (action == 0) {
                this.N = motionEvent.getX();
                this.O = motionEvent.getY();
                this.P = motionEvent.getEventTime();
                l4 o9 = o(motionEvent.getX(), motionEvent.getY());
                this.R = o9;
                if (o9 != null && this.d != null) {
                    this.S = false;
                    o9.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(c1Var);
                    AndroidUtilities.runOnUIThread(c1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.R = null;
            } else {
                l4 l4Var = this.R;
                if (l4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == l4Var;
                    if (!z11 || z10) {
                        l4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(c1Var);
                    }
                    if (z10) {
                        this.R = null;
                        if (!this.S && z11 && motionEvent.getAction() == 1) {
                            ((u2) this.d).a(this, l4Var, false);
                        }
                        this.S = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.Q == 0) {
                        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.N;
                    float y3 = motionEvent.getY() - this.O;
                    float f7 = (y3 * y3) + (x10 * x10);
                    int i11 = this.Q;
                    if (f7 <= i11 * i11 && motionEvent.getEventTime() - this.P < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                t[] tVarArr = (t[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), t.class);
                                int length = tVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    t tVar2 = tVarArr[i10];
                                    int spanStart = text.getSpanStart(tVar2);
                                    int spanEnd = text.getSpanEnd(tVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            tVar = tVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (tVar != null) {
                            r.U(getContext(), tVar.a, new ai.g3(20, this, tVar), this.e);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.n = true;
        getText().replace(max, max2, "\n");
        this.n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (this.x) {
            this.y = true;
            int dp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
            } else {
                int max = Math.max(0, Math.round(((getWidth() - (dp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(max + dp, getPaddingTop(), dp, getPaddingBottom());
            }
            this.y = false;
        }
    }

    public final void r() {
        h1 h1Var = this.c;
        if (h1Var != null) {
            h1Var.c(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.cu, org.telegram.ui.ActionBar.u4
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.E = false;
        }
        g6.o(text, i11, min, i10, false, this.L);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    public final void s() {
        n();
        if (isFocused()) {
            clearFocus();
        }
        r();
        n();
        post(new c1(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.E = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.L = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        if (z10) {
            q();
        } else {
            int dp = AndroidUtilities.dp(2.0f);
            setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (!this.y) {
            this.x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(g1 g1Var) {
        this.d = g1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f = i10;
        m();
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

    public void setListener(h1 h1Var) {
        this.c = h1Var;
    }

    public void setLocked(boolean z10) {
        b1 b1Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            b1Var = this.K;
            if (i10 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i10] == b1Var) {
                    z11 = true;
                    break;
                }
                i10++;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = b1Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.r = z10;
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        t();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    public final void t() {
        int i10 = this.M;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        setHintTextColor(this.s ? org.telegram.ui.ActionBar.h6.l1(0.5f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)) : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        setCursorColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, d6Var));
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
