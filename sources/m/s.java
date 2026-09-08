package m;

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
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import w7.q7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s extends EditText implements r0.o, u0.k {
    public final e2.c a;
    public final w0 b;
    public final y c;
    public final u0.j d;
    public final y e;
    public r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        b3.a(context);
        a3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.a = cVar;
        cVar.f(attributeSet, R.attr.editTextStyle);
        w0 w0Var = new w0(this);
        this.b = w0Var;
        w0Var.f(attributeSet, R.attr.editTextStyle);
        w0Var.b();
        y yVar = new y();
        yVar.b = this;
        this.c = yVar;
        this.d = new u0.j();
        y yVar2 = new y(this);
        this.e = yVar2;
        yVar2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = yVar2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private r getSuperCaller() {
        if (this.f == null) {
            this.f = new r(this);
        }
        return this.f;
    }

    @Override // r0.o
    public final r0.g a(r0.g gVar) {
        this.d.getClass();
        return u0.j.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q7.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) yVar.c;
        return textClassifier == null ? q0.a((TextView) yVar.b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e7;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        w0.h(editorInfo, onCreateInputConnection, this);
        w7.n.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e7 = r0.i0.e(this)) != null) {
            t0.c.b(editorInfo, e7);
            onCreateInputConnection = t0.g.a(onCreateInputConnection, editorInfo, new rg.p2(this, 2));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && r0.i0.e(this) != null) {
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
                z10 = b0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        r0.d dVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || r0.i0.e(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i11 >= 31) {
                dVar = new j2.j(primaryClip, 1);
            } else {
                r0.e eVar = new r0.e();
                eVar.b = primaryClip;
                eVar.c = 1;
                dVar = eVar;
            }
            dVar.c(i10 == 16908322 ? 0 : 1);
            r0.i0.i(this, dVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q7.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.e.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    @Override // u0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
