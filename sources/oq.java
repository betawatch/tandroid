// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oq extends RadioButton implements arb {
    public final op a;
    public final kp b;
    public final pr c;
    public iq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        yqb.a(context);
        dpb.a(getContext(), this);
        op opVar = new op(this);
        this.a = opVar;
        opVar.e(attributeSet, R.attr.radioButtonStyle);
        kp kpVar = new kp(this);
        this.b = kpVar;
        kpVar.g(attributeSet, R.attr.radioButtonStyle);
        pr prVar = new pr(this);
        this.c = prVar;
        prVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.d;
        if (iqVar != null) {
            return iqVar;
        }
        iq iqVar2 = new iq(this);
        this.d = iqVar2;
        return iqVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        op opVar = this.a;
        if (opVar != null) {
            opVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.b;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        op opVar = this.a;
        if (opVar != null) {
            return (ColorStateList) opVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        op opVar = this.a;
        if (opVar != null) {
            return (PorterDuff.Mode) opVar.b;
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
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        op opVar = this.a;
        if (opVar != null) {
            if (opVar.e) {
                opVar.e = false;
            } else {
                opVar.e = true;
                opVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.a = colorStateList;
            opVar.c = true;
            opVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.b = mode;
            opVar.d = true;
            opVar.a();
        }
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.c;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.c;
        prVar.m(mode);
        prVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(kod.a(getContext(), i));
    }
}
