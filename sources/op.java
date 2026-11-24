// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class op extends RadioButton implements zob {
    public final oo a;
    public final ko b;
    public final pq c;
    public ip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        xob.a(context);
        cnb.a(getContext(), this);
        oo ooVar = new oo(this);
        this.a = ooVar;
        ooVar.e(attributeSet, R.attr.radioButtonStyle);
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.g(attributeSet, R.attr.radioButtonStyle);
        pq pqVar = new pq(this);
        this.c = pqVar;
        pqVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.d;
        if (ipVar != null) {
            return ipVar;
        }
        ip ipVar2 = new ip(this);
        this.d = ipVar2;
        return ipVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (ColorStateList) ooVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (PorterDuff.Mode) ooVar.b;
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
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        oo ooVar = this.a;
        if (ooVar != null) {
            if (ooVar.e) {
                ooVar.e = false;
            } else {
                ooVar.e = true;
                ooVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((efe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.a = colorStateList;
            ooVar.c = true;
            ooVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b = mode;
            ooVar.d = true;
            ooVar.a();
        }
    }

    @Override // zob
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.c;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override // zob
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.c;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(hmd.a(getContext(), i));
    }
}
