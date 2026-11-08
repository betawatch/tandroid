package hi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class r1 implements TextWatcher {
    public boolean a;
    public final /* synthetic */ EditTextBoldCursor b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lb0 d;

    public r1(EditTextBoldCursor editTextBoldCursor, int i7, lb0 lb0Var) {
        this.b = editTextBoldCursor;
        this.c = i7;
        this.d = lb0Var;
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
