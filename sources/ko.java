// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ko extends AutoCompleteTextView implements zsb {
    public static final int[] d = {R.attr.popupBackground};
    public final lo a;
    public final qq b;
    public final qx6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.telegram.messenger.beta.R.attr.autoCompleteTextViewStyle);
        xsb.a(context);
        brb.a(getContext(), this);
        ko9 v = ko9.v(getContext(), attributeSet, d, org.telegram.messenger.beta.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) v.c).hasValue(0)) {
            setDropDownBackgroundDrawable(v.n(0));
        }
        v.y();
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, org.telegram.messenger.beta.R.attr.autoCompleteTextViewStyle);
        qq qqVar = new qq(this);
        this.b = qqVar;
        qqVar.f(attributeSet, org.telegram.messenger.beta.R.attr.autoCompleteTextViewStyle);
        qqVar.b();
        qx6 qx6Var = new qx6(this);
        this.c = qx6Var;
        qx6Var.y(attributeSet, org.telegram.messenger.beta.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener u = qx6Var.u(keyListener);
        if (u != keyListener) {
            super.setKeyListener(u);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
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
        xqd.a(editorInfo, onCreateInputConnection, this);
        return this.c.z(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(yqd.a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.L(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.u(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    @Override // zsb
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.b;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override // zsb
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.b;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.b;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }
}
