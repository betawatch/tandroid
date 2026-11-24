// default package

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hq extends EditText implements ir7, arb {
    public final kp a;
    public final pr b;
    public final hr c;
    public final alb d;
    public final hi2 e;
    public gq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        yqb.a(context);
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, R.attr.editTextStyle);
        pr prVar = new pr(this);
        this.b = prVar;
        prVar.f(attributeSet, R.attr.editTextStyle);
        prVar.b();
        hr hrVar = new hr();
        hrVar.a = this;
        this.c = hrVar;
        this.d = new alb();
        hi2 hi2Var = new hi2(this);
        this.e = hi2Var;
        hi2Var.E(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener w = hi2Var.w(keyListener);
        if (w != keyListener) {
            super.setKeyListener(w);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    private gq getSuperCaller() {
        gq gqVar = this.f;
        if (gqVar != null) {
            return gqVar;
        }
        gq gqVar2 = new gq(this);
        this.f = gqVar2;
        return gqVar2;
    }

    @Override // ir7
    public final rw2 a(rw2 rw2Var) {
        this.d.getClass();
        return alb.a(this, rw2Var);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        hr hrVar;
        if (Build.VERSION.SDK_INT >= 28 || (hrVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = hrVar.b;
        return textClassifier == null ? gr.a(hrVar.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pr.h(editorInfo, onCreateInputConnection, this);
        jod.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f = kfc.f(this)) != null) {
            lv3.b(editorInfo, f);
            onCreateInputConnection = dne.a(onCreateInputConnection, editorInfo, new wx4((Object) this, (byte) 13));
        }
        return this.e.F(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && kfc.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = qq.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        nw2 nw2Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || kfc.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                nw2Var = new mw2(primaryClip, 1);
            } else {
                ow2 ow2Var = new ow2();
                ow2Var.b = primaryClip;
                ow2Var.c = (byte) 1;
                nw2Var = ow2Var;
            }
            nw2Var.d(i == 16908322 ? 0 : 1);
            kfc.i(this, nw2Var.build());
        }
        return true;
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pr prVar = this.b;
        if (prVar != null) {
            prVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mxe.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.S(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.w(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        hr hrVar;
        if (Build.VERSION.SDK_INT >= 28 || (hrVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            hrVar.b = textClassifier;
        }
    }
}
