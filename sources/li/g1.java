package li;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g1 extends ju implements p6 {
    public boolean E;
    public t90 F;
    public Paint G;
    public Layout H;
    public int I;
    public boolean J;
    public final z0 K;
    public TL_iv.PageBlock L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public final a5.d R;
    public float S;
    public float T;
    public long U;
    public int V;
    public k4 W;
    public boolean a0;
    public final a1 b0;
    public f1 c;
    public e1 d;
    public final u6 e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    /* JADX WARN: Type inference failed for: r0v0, types: [li.z0] */
    public g1(Context context, u6 u6Var) {
        super(context, u6Var);
        this.f = UserConfig.selectedAccount;
        this.I = -1;
        this.J = true;
        this.K = new InputFilter() { // from class: li.z0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                g1 g1Var = g1.this;
                if (!g1Var.v || g1Var.h) {
                    return null;
                }
                f1 f1Var = g1Var.c;
                if (f1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    f1Var.T(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.M = y6.G6;
        this.R = new a5.d(this, 28);
        this.b0 = new a1(this, 0);
        this.e = u6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        b1 b1Var = new b1(0);
        c1 c1Var = new c1(this);
        setCustomSelectionActionModeCallback(b1Var);
        setCustomInsertionActionModeCallback(c1Var);
        setOnLongClickListener(new fi.b5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new bi.o(this, 2));
        addTextChangedListener(new d1(this));
        this.N = false;
        this.O = true;
        updateColors();
    }

    @Override // org.telegram.ui.Components.ju, org.telegram.ui.ActionBar.b5
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        f6.o(text, i11, min, i10, true, this.L);
        if ((i10 & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override // org.telegram.ui.Components.ju
    public final a71 createUrlSpan(String str) {
        return f6.k(str);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        f1 f1Var;
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
                this.c.t(this);
            }
        } else if (keyEvent.getAction() == 0 && (f1Var = this.c) != null) {
            f1Var.f0(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ju, org.telegram.ui.ActionBar.b5
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text != null && (max = Math.max(0, i10)) < (min = Math.min(i11, text.length()))) {
            return f6.q(max, min, text);
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public u6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text == null) {
            return;
        }
        k4[] k4VarArr = (k4[]) text.getSpans(0, text.length(), k4.class);
        for (k4 k4Var : k4VarArr) {
            k4Var.d(text);
        }
        for (k4 k4Var2 : k4VarArr) {
            k4Var2.a(this.f, this, this.e);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.m4 m4Var = this.floatingActionMode;
        if (m4Var != null) {
            try {
                m4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.ju
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.J = true;
        invalidate();
    }

    public final k4 o(float f7, float f10) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f7 - getTotalPaddingLeft()) + getScrollX();
            for (k4 k4Var : (k4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), k4.class)) {
                int spanStart = text.getSpanStart(k4Var);
                int spanEnd = text.getSpanEnd(k4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return k4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.b0);
        this.W = null;
        this.a0 = false;
        Editable text = getText();
        if (text != null) {
            for (k4 k4Var : (k4[]) text.getSpans(0, text.length(), k4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.b;
                if (richButtonSpan != null && k4Var.c == this) {
                    richButtonSpan.detach(this);
                    k4Var.c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.ju, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Layout layout = getLayout();
        t90 t90Var = null;
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
                    a21[] a21VarArr = (a21[]) spanned.getSpans(0, spanned.length(), a21.class);
                    int length = a21VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        a21 a21Var = a21VarArr[i11];
                        int i12 = a21Var.b.a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(a21Var);
                            int spanEnd = spanned.getSpanEnd(a21Var);
                            t90Var = t90Var;
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (t90Var == null) {
                                    t90 t90Var2 = new t90(0);
                                    t90Var2.n = false;
                                    t90Var = t90Var2;
                                }
                                t90Var.d(layout, spanStart, 0.0f);
                                int dp = (32768 & i12) != 0 ? -AndroidUtilities.dp(6.0f) : (i12 & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                if (dp != 0) {
                                    i10 = AndroidUtilities.dp(dp > 0 ? 5.0f : -2.0f) + dp;
                                } else {
                                    i10 = 0;
                                }
                                t90Var.o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, t90Var);
                            }
                        }
                        i11++;
                        t90Var = t90Var;
                    }
                    if (t90Var != null) {
                        t90Var.n = true;
                    }
                    this.F = t90Var;
                }
            }
        }
        if (this.F != null) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setPathEffect(t90.c());
            }
            this.G.setColor(y6.w0(y6.K6, this.e) & 872415231);
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
                this.c.R();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.c.o(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // org.telegram.ui.Components.lu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        f1 f1Var = this.c;
        if (f1Var != null) {
            f1Var.E(this, i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.lu, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override // org.telegram.ui.Components.ju, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        f1 f1Var;
        f1 f1Var2;
        if (i10 == 16908319 && (f1Var2 = this.c) != null && f1Var2.e()) {
            return true;
        }
        if (i10 == 16908322 && (f1Var = this.c) != null && f1Var.g(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.c != null && isEnabled() && isFocusable()) {
            this.c.b(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            s sVar = null;
            a1 a1Var = this.b0;
            int i10 = 0;
            if (action == 0) {
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.U = motionEvent.getEventTime();
                k4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.W = o10;
                if (o10 != null && this.d != null) {
                    this.a0 = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.W = null;
            } else {
                k4 k4Var = this.W;
                if (k4Var != null) {
                    boolean z10 = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z11 = motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == k4Var;
                    if (!z11 || z10) {
                        k4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                    }
                    if (z10) {
                        this.W = null;
                        if (!this.a0 && z11 && motionEvent.getAction() == 1) {
                            ((r2) this.d).a(this, k4Var, false);
                        }
                        this.a0 = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.V == 0) {
                        this.V = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x9 = motionEvent.getX() - this.S;
                    float y3 = motionEvent.getY() - this.T;
                    float f7 = (y3 * y3) + (x9 * x9);
                    int i11 = this.V;
                    if (f7 <= i11 * i11 && motionEvent.getEventTime() - this.U < ViewConfiguration.getLongPressTimeout()) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x10 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                s[] sVarArr = (s[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), s.class);
                                int length = sVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    s sVar2 = sVarArr[i10];
                                    int spanStart = text.getSpanStart(sVar2);
                                    int spanEnd = text.getSpanEnd(sVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            sVar = sVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (sVar != null) {
                            q.X(getContext(), sVar.a, new ai.n1(28, this, sVar), this.e);
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
        f1 f1Var = this.c;
        if (f1Var != null) {
            f1Var.b(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override // org.telegram.ui.Components.ju, org.telegram.ui.ActionBar.b5
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text == null || i11 < 0 || i12 < 0 || i11 >= i12 || i11 >= (min = Math.min(i12, text.length()))) {
            return;
        }
        if ((i10 & 1) != 0) {
            this.E = false;
        }
        f6.o(text, i11, min, i10, false, this.L);
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
        post(new a1(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        this.O = true;
        updateColors();
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

    public void setInlineButtonClickListener(e1 e1Var) {
        this.d = e1Var;
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

    public void setListener(f1 f1Var) {
        this.c = f1Var;
    }

    public void setLocked(boolean z10) {
        z0 z0Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            z0Var = this.K;
            if (i10 >= length) {
                z11 = false;
                break;
            } else {
                if (filters[i10] == z0Var) {
                    z11 = true;
                    break;
                }
                i10++;
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
        this.r = z10;
    }

    @Override // org.telegram.ui.Components.lu, android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        if (this.P) {
            return;
        }
        this.N = true;
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        this.N = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        this.P = true;
        try {
            boolean z10 = this.N;
            u6 u6Var = this.e;
            if (!z10 && getCurrentTextColor() != (w02 = y6.w0(this.M, u6Var))) {
                setTextColor(w02);
            }
            if (this.O || getCurrentHintTextColor() == this.Q) {
                this.O = false;
                this.Q = this.s ? y6.o1(0.5f, y6.w0(y6.Oh, u6Var)) : y6.w0(y6.H6, u6Var);
                int currentHintTextColor = getCurrentHintTextColor();
                int i10 = this.Q;
                if (currentHintTextColor != i10) {
                    setHintTextColor(i10);
                }
            }
            this.P = false;
            int w03 = y6.w0(y6.gc, u6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w03) {
                setLinkTextColor(w03);
            }
            setCursorColor(y6.w0(y6.G6, u6Var));
            setHandlesColor(y6.w0(y6.l6, u6Var));
            boolean g12 = y6.g1();
            a5.d dVar = this.R;
            if (g12) {
                removeCallbacks(dVar);
                postDelayed(dVar, 100L);
            } else {
                removeCallbacks(dVar);
                m();
            }
        } catch (Throwable th2) {
            this.P = false;
            throw th2;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
