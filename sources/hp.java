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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hp extends EditText implements fp7, zob {
    public final ko a;
    public final pq b;
    public final hq c;
    public final zib d;
    public final lv6 e;
    public gp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        xob.a(context);
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, R.attr.editTextStyle);
        pq pqVar = new pq(this);
        this.b = pqVar;
        pqVar.f(attributeSet, R.attr.editTextStyle);
        pqVar.b();
        hq hqVar = new hq();
        hqVar.a = this;
        this.c = hqVar;
        this.d = new zib();
        lv6 lv6Var = new lv6(this);
        this.e = lv6Var;
        lv6Var.w(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener s = lv6Var.s(keyListener);
        if (s != keyListener) {
            super.setKeyListener(s);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    private gp getSuperCaller() {
        gp gpVar = this.f;
        if (gpVar != null) {
            return gpVar;
        }
        gp gpVar2 = new gp(this);
        this.f = gpVar2;
        return gpVar2;
    }

    @Override // fp7
    public final hv2 a(hv2 hv2Var) {
        this.d.getClass();
        return zib.a(this, hv2Var);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        hq hqVar;
        if (Build.VERSION.SDK_INT >= 28 || (hqVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = hqVar.b;
        return textClassifier == null ? gq.a(hqVar.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pq.h(editorInfo, onCreateInputConnection, this);
        gmd.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f = jdc.f(this)) != null) {
            au3.b(editorInfo, f);
            onCreateInputConnection = ble.a(onCreateInputConnection, editorInfo, new ry4((Object) this, (byte) 10));
        }
        return this.e.x(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && jdc.f(this) != null) {
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
                z = qp.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        dv2 dv2Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || jdc.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                dv2Var = new cv2(primaryClip, 1);
            } else {
                ev2 ev2Var = new ev2();
                ev2Var.b = primaryClip;
                ev2Var.c = (byte) 1;
                dv2Var = ev2Var;
            }
            dv2Var.d(i == 16908322 ? 0 : 1);
            jdc.i(this, dv2Var.build());
        }
        return true;
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.I(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.s(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        hq hqVar;
        if (Build.VERSION.SDK_INT >= 28 || (hqVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            hqVar.b = textClassifier;
        }
    }
}
