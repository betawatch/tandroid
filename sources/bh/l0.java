package bh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ju;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class l0 extends ju implements p6 {
    public final u6 c;
    public final jg.s0 d;
    public Runnable e;
    public int f;

    public l0(Context context, int i10, u6 u6Var) {
        super(context, u6Var);
        this.c = u6Var;
        this.d = new jg.s0(getContext(), new k0());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        f7.V(this, y6.Ud, u6Var);
        f7.H(this, y6.hc, u6Var);
        f7.D(this, y6.uf, u6Var);
        int i13 = y6.Vd;
        f7.m(this, 34, i13, u6Var);
        f7.E(this, i13, u6Var);
        f7.m(this, 30, y6.Wd, u6Var);
        f7.m(this, 36, y6.vf, u6Var);
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new j0((q) this, i12));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override // org.telegram.ui.Components.lu, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!((GestureDetector) this.d.b).onTouchEvent(motionEvent) || isLongClickable()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i10 = R.id.menu_delete;
        menu.add(i10, i10, 0, LocaleController.getString(R.string.Delete));
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

    public final void m() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            c cVar = new c(this.c);
            ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f, 255);
            ofInt.addUpdateListener(new a(cVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(cVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (c cVar : (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)) {
            a1.f fVar = new a1.f(25, this, cVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f, 0);
                ofInt.addUpdateListener(new a(cVar, this, 1));
                ofInt.addListener(new b(fVar, 0));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                fVar.run();
            }
        }
    }

    @Override // org.telegram.ui.Components.lu, android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (!hasSelection() || ((c[]) getText().getSpans(i10, i11, c.class)).length == 0) {
            return;
        }
        setSelection(i10, i11 - 1);
    }

    public void setMaxLength(int i10) {
        if (this.f != i10) {
            this.f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        u6 u6Var = this.c;
        try {
            setHintColor(y6.w0(y6.Vd, u6Var));
            setCursorColor(y6.w0(y6.Wd, u6Var));
            setHandlesColor(y6.w0(y6.vf, u6Var));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
