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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lo extends Button implements zob {
    public final ko a;
    public final pq b;
    public ip c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        xob.a(context);
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, R.attr.buttonStyle);
        pq pqVar = new pq(this);
        this.b = pqVar;
        pqVar.f(attributeSet, R.attr.buttonStyle);
        pqVar.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.c;
        if (ipVar != null) {
            return ipVar;
        }
        ip ipVar2 = new ip(this);
        this.c = ipVar2;
        return ipVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.a;
        if (koVar != null) {
            koVar.b();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (gfc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (gfc.b) {
            return super.getAutoSizeMinTextSize();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (gfc.b) {
            return super.getAutoSizeStepGranularity();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return Math.round(pqVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (gfc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pq pqVar = this.b;
        return pqVar != null ? pqVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (gfc.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            return pqVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kve.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.f();
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
        pq pqVar = this.b;
        if (pqVar == null || gfc.b) {
            return;
        }
        pqVar.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pq pqVar = this.b;
        if (pqVar != null) {
            zq zqVar = pqVar.i;
            if (gfc.b || !zqVar.f()) {
                return;
            }
            zqVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (gfc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (gfc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (gfc.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((efe) getEmojiTextViewHelper().b.a).a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    @Override // zob
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.b;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override // zob
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.b;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = gfc.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            zq zqVar = pqVar.i;
            if (z || zqVar.f()) {
                return;
            }
            zqVar.g(f, i);
        }
    }
}
