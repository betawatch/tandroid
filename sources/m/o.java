package m;

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
import g7.q6;
import g7.r7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends Button implements u0.k {
    public final n a;
    public final x0 b;
    public u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        e3.a(context);
        d3.a(this, getContext());
        n nVar = new n(this);
        this.a = nVar;
        nVar.d(attributeSet, R.attr.buttonStyle);
        x0 x0Var = new x0(this);
        this.b = x0Var;
        x0Var.f(attributeSet, R.attr.buttonStyle);
        x0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new u(this);
        }
        return this.c;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        x0 x0Var = this.b;
        if (x0Var == null || w3.b) {
            return;
        }
        x0Var.i.a();
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

    public void setSupportAllCaps(boolean z10) {
        x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.a.setAllCaps(z10);
        }
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
}
