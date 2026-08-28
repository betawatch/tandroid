package m;

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
import f7.t7;
import g7.r7;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends CheckedTextView implements u0.k {
    public final g2.e a;
    public final n b;
    public final x0 c;
    public u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        e3.a(context);
        d3.a(this, getContext());
        x0 x0Var = new x0(this);
        this.c = x0Var;
        x0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        x0Var.b();
        n nVar = new n(this);
        this.b = nVar;
        nVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new g2.e(this);
        Context context2 = getContext();
        int[] iArr = f.a.l;
        j4.c E = j4.c.E(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) E.c;
        r0.j0.j(this, getContext(), iArr, attributeSet, (TypedArray) E.c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(t7.b(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(E.v(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(m1.b(typedArray.getInt(3, -1), null));
                }
                E.G();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(t7.b(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            E.G();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    private u getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new u(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.b();
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.a();
        }
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return r7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        g2.e eVar = this.a;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g7.l.a(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.b;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.b;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        g2.e eVar = this.a;
        if (eVar != null) {
            if (eVar.c) {
                eVar.c = false;
            } else {
                eVar.c = true;
                eVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(r7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.b;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.b;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        g2.e eVar = this.a;
        if (eVar != null) {
            eVar.f = mode;
            eVar.b = true;
            eVar.b();
        }
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.c;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.c;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        x0 x0Var = this.c;
        if (x0Var != null) {
            x0Var.g(context, i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i9) {
        setCheckMarkDrawable(t7.b(getContext(), i9));
    }
}
