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
import f7.j8;
import f7.t7;
import g7.q6;
import g7.r7;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a1 extends TextView implements u0.k {
    public final n a;
    public final x0 b;
    public final z c;
    public u d;
    public boolean e;
    public fa.c f;
    public Future h;

    public a1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new u(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.a;
        if (nVar != null) {
            nVar.a();
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (w3.b) {
            return super.getAutoSizeMaxTextSize();
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            return Math.round(x0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (w3.b) {
            return super.getAutoSizeMinTextSize();
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            return Math.round(x0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (w3.b) {
            return super.getAutoSizeStepGranularity();
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            return Math.round(x0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (w3.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x0 x0Var = this.b;
        return x0Var != null ? x0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (w3.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            return x0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r7.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public y0 getSuperCaller() {
        if (this.f == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
                this.f = new z0(this);
            } else if (i9 >= 26) {
                this.f = new fa.c(this, 28);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.c();
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
                r7.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.c;
        return textClassifier == null ? r0.a((TextView) zVar.b) : textClassifier;
    }

    public p0.c getTextMetricsParamsCompat() {
        return r7.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        g7.l.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        x0 x0Var = this.b;
        if (x0Var == null || w3.b) {
            return;
        }
        x0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
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
                r7.a(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        x0 x0Var = this.b;
        if (x0Var != null) {
            h1 h1Var = x0Var.i;
            if (w3.b || !h1Var.f()) {
                return;
            }
            h1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (w3.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.i(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (w3.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.j(iArr, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (w3.b) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.k(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q6) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i9);
        } else {
            r7.b(i9, this);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i9);
        } else {
            r7.c(i9, this);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i9 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(p0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        r7.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.c = textClassifier;
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
        int i9 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i9 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i9 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i9 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i9 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i9 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i9 = 7;
            }
        }
        setTextDirection(i9);
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
    public final void setTextSize(int i9, float f10) {
        boolean z10 = w3.b;
        if (z10) {
            super.setTextSize(i9, f10);
            return;
        }
        x0 x0Var = this.b;
        if (x0Var != null) {
            h1 h1Var = x0Var.i;
            if (z10 || h1Var.f()) {
                return;
            }
            h1Var.g(f10, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i9) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i9 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            j8 j8Var = i0.e.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i9);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i9);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        e3.a(context);
        this.e = false;
        this.f = null;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.a = nVar;
        nVar.d(attributeSet, i9);
        x0 x0Var = new x0(this);
        this.b = x0Var;
        x0Var.f(attributeSet, i9);
        x0Var.b();
        z zVar = new z();
        zVar.b = this;
        this.c = zVar;
        getEmojiTextViewHelper().a(attributeSet, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i9 != 0 ? t7.b(context, i9) : null, i10 != 0 ? t7.b(context, i10) : null, i11 != 0 ? t7.b(context, i11) : null, i12 != 0 ? t7.b(context, i12) : null);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i9 != 0 ? t7.b(context, i9) : null, i10 != 0 ? t7.b(context, i10) : null, i11 != 0 ? t7.b(context, i11) : null, i12 != 0 ? t7.b(context, i12) : null);
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.b();
        }
    }
}
