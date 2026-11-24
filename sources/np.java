// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class np extends CheckedTextView implements arb {
    public final op a;
    public final kp b;
    public final pr c;
    public iq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public np(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        yqb.a(context);
        dpb.a(getContext(), this);
        pr prVar = new pr(this);
        this.c = prVar;
        prVar.f(attributeSet, R.attr.checkedTextViewStyle);
        prVar.b();
        kp kpVar = new kp(this);
        this.b = kpVar;
        kpVar.g(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new op(this);
        Context context2 = getContext();
        int[] iArr = k09.l;
        wm9 v = wm9.v(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        kfc.j(this, getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(kod.a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(v.i(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(vr3.b(typedArray.getInt(3, -1), null));
                }
                v.y();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(kod.a(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            v.y();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            v.y();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pr prVar = this.c;
        if (prVar != null) {
            prVar.b();
        }
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
        op opVar = this.a;
        if (opVar != null) {
            opVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mxe.d(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        op opVar = this.a;
        if (opVar != null) {
            return (ColorStateList) opVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jod.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        op opVar = this.a;
        if (opVar != null) {
            if (opVar.e) {
                opVar.e = false;
            } else {
                opVar.e = true;
                opVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.a = colorStateList;
            opVar.c = true;
            opVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        op opVar = this.a;
        if (opVar != null) {
            opVar.b = mode;
            opVar.d = true;
            opVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pr prVar = this.c;
        if (prVar != null) {
            prVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(kod.a(getContext(), i));
    }
}
