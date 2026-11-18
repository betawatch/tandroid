package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o1 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xb0 d;

    public o1(EditTextBoldCursor editTextBoldCursor, int i7, xb0 xb0Var) {
        this.b = editTextBoldCursor;
        this.c = i7;
        this.d = xb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.a) {
            int length = text.length();
            int i7 = this.c;
            if (length > i7) {
                this.a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
