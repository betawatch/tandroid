package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import j7.s7;
import k7.l6;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o extends CheckBox implements u0.k {
    public final g2.e a;
    public final m b;
    public final w0 c;
    public t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        d3.a(context);
        c3.a(this, getContext());
        g2.e eVar = new g2.e(this);
        this.a = eVar;
        eVar.e(attributeSet, R.attr.checkboxStyle);
        m mVar = new m(this);
        this.b = mVar;
        mVar.d(attributeSet, R.attr.checkboxStyle);
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
        m mVar = this.b;
        if (mVar != null) {
            mVar.a();
        }
        w0 w0Var = this.c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        g2.e eVar = this.a;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        g2.e eVar = this.a;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f;
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
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.b;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g2.e eVar = this.a;
        if (eVar != null) {
            if (eVar.c) {
                eVar.c = false;
            } else {
                eVar.c = true;
                eVar.a();
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

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((l6) getEmojiTextViewHelper().b.b).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.f = mode;
            eVar.b = true;
            eVar.a();
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
        setButtonDrawable(s7.b(getContext(), i10));
    }
}
