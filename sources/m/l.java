package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import j7.s7;
import k7.x7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class l extends AutoCompleteTextView implements u0.k {
    public static final int[] d = {R.attr.popupBackground};
    public final m a;
    public final w0 b;
    public final y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(context);
        c3.a(this, getContext());
        l7.w0 y10 = l7.w0.y(getContext(), attributeSet, d, i10);
        if (((TypedArray) y10.c).hasValue(0)) {
            setDropDownBackgroundDrawable(y10.s(0));
        }
        y10.A();
        m mVar = new m(this);
        this.a = mVar;
        mVar.d(attributeSet, i10);
        w0 w0Var = new w0(this);
        this.b = w0Var;
        w0Var.f(attributeSet, i10);
        w0Var.b();
        y yVar = new y(this);
        this.c = yVar;
        yVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = yVar.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return x7.d(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k7.m.a(editorInfo, onCreateInputConnection, this);
        return this.c.c(onCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(x7.e(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(s7.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.c.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.a(keyListener));
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
}
