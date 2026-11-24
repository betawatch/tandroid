// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lp extends Button implements arb {
    public final kp a;
    public final pr b;
    public iq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        yqb.a(context);
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, R.attr.buttonStyle);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, R.attr.buttonStyle);
        prVar.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private iq getEmojiTextViewHelper() {
        iq iqVar = this.c;
        if (iqVar != null) {
            return iqVar;
        }
        iq iqVar2 = new iq(this);
        this.c = iqVar2;
        return iqVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ghc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ghc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pr prVar = this.b;
        if (prVar != null) {
            return Math.round(prVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ghc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pr prVar = this.b;
        return prVar != null ? prVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ghc.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        pr prVar = this.b;
        if (prVar != null) {
            return prVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pr prVar = this.b;
        if (prVar == null || ghc.b) {
            return;
        }
        prVar.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (ghc.b || !zrVar.f()) {
                return;
            }
            zrVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ghc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            prVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fhe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        pr prVar = this.b;
        if (prVar != null) {
            prVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pr prVar = this.b;
        prVar.l(colorStateList);
        prVar.b();
    }

    @Override // arb
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pr prVar = this.b;
        prVar.m(mode);
        prVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = ghc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pr prVar = this.b;
        if (prVar != null) {
            zr zrVar = prVar.i;
            if (z || zrVar.f()) {
                return;
            }
            zrVar.g(f, i);
        }
    }
}
