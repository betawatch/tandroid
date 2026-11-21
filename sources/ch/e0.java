package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class e0 extends ot implements b6 {
    public final h6 e2;
    public final jn f2;
    public Runnable g2;
    public int h2;

    public e0(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        this.e2 = h6Var;
        this.f2 = new jn(getContext(), new d0());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.h2 = i7;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
        t6.U(this, m6.Le, h6Var);
        t6.G(this, m6.Yc, h6Var);
        t6.C(this, m6.lg, h6Var);
        int i12 = m6.Me;
        t6.l(this, 34, i12, h6Var);
        t6.D(this, i12, h6Var);
        t6.l(this, 30, m6.Ne, h6Var);
        t6.l(this, 36, m6.mg, h6Var);
        if (i10 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new c0((m) this, i11));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void J() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.e2);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f, ks.e4);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void K(boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            c1.a aVar = new c1.a(7, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new ai.k0(aVar, 2));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                aVar.run();
            }
        }
    }

    @Override // org.telegram.ui.Components.rt, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!((GestureDetector) this.f2.b).onTouchEvent(motionEvent) || isLongClickable()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public int getEditTextSelectionEnd() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public int getEditTextSelectionStart() {
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        menu.clear();
        menu.add(R.id.menu_delete, R.id.menu_delete, 0, gd.N0(2131751586, null));
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (!hasSelection() || ((b[]) getText().getSpans(i7, i10, b.class)).length == 0) {
            return;
        }
        setSelection(i7, i10 - 1);
    }

    public void setMaxLength(int i7) {
        if (this.h2 != i7) {
            this.h2 = i7;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.g2 = runnable;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        h6 h6Var = this.e2;
        try {
            setHintColor(m6.w0(m6.Me, h6Var));
            setCursorColor(m6.w0(m6.Ne, h6Var));
            setHandlesColor(m6.w0(m6.mg, h6Var));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
