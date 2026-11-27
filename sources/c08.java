// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c08 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b18 d;

    public c08(b18 b18Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = b18Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        boolean z = true;
        this.a = true;
        int i = 0;
        while (true) {
            if (i >= editable.length()) {
                z = false;
                break;
            }
            char charAt = editable.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                break;
            } else {
                i++;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z) {
            editTextBoldCursor.setErrorText(ob6.M0(2131747176, null));
        } else {
            this.d.P0(editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
