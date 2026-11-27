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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oo extends CheckedTextView implements zsb {
    public final po a;
    public final lo b;
    public final qq c;
    public jp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        xsb.a(context);
        brb.a(getContext(), this);
        qq qqVar = new qq(this);
        this.c = qqVar;
        qqVar.f(attributeSet, R.attr.checkedTextViewStyle);
        qqVar.b();
        lo loVar = new lo(this);
        this.b = loVar;
        loVar.g(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new po(this);
        Context context2 = getContext();
        int[] iArr = w19.l;
        ko9 v = ko9.v(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        ihc.k(this, getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(yqd.a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(v.m(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(cr3.b(typedArray.getInt(3, -1), null));
                }
                v.y();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(yqd.a(getContext(), resourceId));
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

    private jp getEmojiTextViewHelper() {
        jp jpVar = this.d;
        if (jpVar != null) {
            return jpVar;
        }
        jp jpVar2 = new jp(this);
        this.d = jpVar2;
        return jpVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
        lo loVar = this.b;
        if (loVar != null) {
            loVar.b();
        }
        po poVar = this.a;
        if (poVar != null) {
            poVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c0f.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.b;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        po poVar = this.a;
        if (poVar != null) {
            return (ColorStateList) poVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        po poVar = this.a;
        if (poVar != null) {
            return (PorterDuff.Mode) poVar.b;
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
        xqd.a(editorInfo, onCreateInputConnection, this);
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
        lo loVar = this.b;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.b;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        po poVar = this.a;
        if (poVar != null) {
            if (poVar.e) {
                poVar.e = false;
            } else {
                poVar.e = true;
                poVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c0f.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.b;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.a = colorStateList;
            poVar.c = true;
            poVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        po poVar = this.a;
        if (poVar != null) {
            poVar.b = mode;
            poVar.d = true;
            poVar.b();
        }
    }

    @Override // zsb
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        qq qqVar = this.c;
        qqVar.l(colorStateList);
        qqVar.b();
    }

    @Override // zsb
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        qq qqVar = this.c;
        qqVar.m(mode);
        qqVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qq qqVar = this.c;
        if (qqVar != null) {
            qqVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(yqd.a(getContext(), i));
    }
}
