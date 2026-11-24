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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class no extends CheckedTextView implements zob {
    public final oo a;
    public final ko b;
    public final pq c;
    public ip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007c, B:11:0x0083, B:12:0x008a, B:14:0x0091, B:21:0x0065, B:23:0x006b, B:25:0x0071), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public no(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        xob.a(context);
        cnb.a(getContext(), this);
        pq pqVar = new pq(this);
        this.c = pqVar;
        pqVar.f(attributeSet, R.attr.checkedTextViewStyle);
        pqVar.b();
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.g(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new oo(this);
        Context context2 = getContext();
        int[] iArr = jy8.l;
        vk9 v = vk9.v(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        jdc.j(this, getContext(), iArr, attributeSet, (TypedArray) v.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(hmd.a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(v.m(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(lq3.b(typedArray.getInt(3, -1), null));
                }
                v.y();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(hmd.a(getContext(), resourceId));
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

    private ip getEmojiTextViewHelper() {
        ip ipVar = this.d;
        if (ipVar != null) {
            return ipVar;
        }
        ip ipVar2 = new ip(this);
        this.d = ipVar2;
        return ipVar2;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.b();
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kve.d(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        oo ooVar = this.a;
        if (ooVar != null) {
            return (ColorStateList) ooVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        gmd.a(editorInfo, onCreateInputConnection, this);
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        oo ooVar = this.a;
        if (ooVar != null) {
            if (ooVar.e) {
                ooVar.e = false;
            } else {
                ooVar.e = true;
                ooVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.a = colorStateList;
            ooVar.c = true;
            ooVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        oo ooVar = this.a;
        if (ooVar != null) {
            ooVar.b = mode;
            ooVar.d = true;
            ooVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pq pqVar = this.c;
        if (pqVar != null) {
            pqVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(hmd.a(getContext(), i));
    }
}
