package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import org.telegram.messenger.beta.R;
import v7.u7;
import w7.l6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class n extends CheckBox implements u0.k {
    public final p a;
    public final e2.c b;
    public final w0 c;
    public t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        b3.a(context);
        a3.a(this, getContext());
        p pVar = new p(this);
        this.a = pVar;
        pVar.e(attributeSet, R.attr.checkboxStyle);
        e2.c cVar = new e2.c(this);
        this.b = cVar;
        cVar.f(attributeSet, R.attr.checkboxStyle);
        w0 w0Var = new w0(this);
        this.c = w0Var;
        w0Var.f(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkboxStyle);
    }

    private t getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new t(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.b;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        p pVar = this.a;
        if (pVar != null) {
            pVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.b;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        p pVar = this.a;
        if (pVar != null) {
            return (ColorStateList) pVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        p pVar = this.a;
        if (pVar != null) {
            return (PorterDuff.Mode) pVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.b;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        p pVar = this.a;
        if (pVar != null) {
            if (pVar.e) {
                pVar.e = false;
            } else {
                pVar.e = true;
                pVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.b;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.b;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.a = colorStateList;
            pVar.c = true;
            pVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.b = mode;
            pVar.d = true;
            pVar.a();
        }
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(u7.b(getContext(), i10));
    }
}
