package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j7.a8;
import j7.s7;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k7.l6;
import k7.x7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class z0 extends TextView implements u0.k {
    public final m a;
    public final w0 b;
    public final y c;
    public t d;
    public boolean e;
    public ja.c f;
    public Future h;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private t getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new t(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.a;
        if (mVar != null) {
            mVar.a();
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u3.b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            return Math.round(w0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u3.b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            return Math.round(w0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u3.b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            return Math.round(w0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u3.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.b;
        return w0Var != null ? w0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (u3.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            return w0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public x0 getSuperCaller() {
        if (this.f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f = new y0(this);
            } else if (i10 >= 26) {
                this.f = new ja.c(this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                x7.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) yVar.c;
        return textClassifier == null ? q0.a((TextView) yVar.b) : textClassifier;
    }

    public p0.c getTextMetricsParamsCompat() {
        return x7.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        k7.m.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        w0 w0Var = this.b;
        if (w0Var == null || u3.b) {
            return;
        }
        w0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.h;
        if (future != null) {
            try {
                this.h = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                x7.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        w0 w0Var = this.b;
        if (w0Var != null) {
            g1 g1Var = w0Var.i;
            if (u3.b || !g1Var.f()) {
                return;
            }
            g1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (u3.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (u3.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (u3.b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().w(i10);
        } else {
            x7.b(i10, this);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i10);
        } else {
            x7.c(i10, this);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(p0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        x7.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.c = textClassifier;
        }
    }

    public void setTextFuture(Future<p0.d> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.b;
        TextPaint textPaint = cVar.a;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        if (Build.VERSION.SDK_INT >= 23) {
            getPaint().set(textPaint);
            e0.b.r(this, cVar.c);
            e0.b.u(this, cVar.d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z4 = u3.b;
        if (z4) {
            super.setTextSize(i10, f10);
            return;
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            g1 g1Var = w0Var.i;
            if (z4 || g1Var.f()) {
                return;
            }
            g1Var.g(f10, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            a8 a8Var = i0.e.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i10);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(context);
        this.e = false;
        this.f = null;
        c3.a(this, getContext());
        m mVar = new m(this);
        this.a = mVar;
        mVar.d(attributeSet, i10);
        w0 w0Var = new w0(this);
        this.b = w0Var;
        w0Var.f(attributeSet, i10);
        w0Var.b();
        y yVar = new y();
        yVar.b = this;
        this.c = yVar;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? s7.b(context, i10) : null, i11 != 0 ? s7.b(context, i11) : null, i12 != 0 ? s7.b(context, i12) : null, i13 != 0 ? s7.b(context, i13) : null);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? s7.b(context, i10) : null, i11 != 0 ? s7.b(context, i11) : null, i12 != 0 ? s7.b(context, i12) : null, i13 != 0 ? s7.b(context, i13) : null);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }
}
