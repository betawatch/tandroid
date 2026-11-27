// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ku2 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;

    public ku2(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            if (obj.isEmpty()) {
                return;
            }
            int intValue = Utilities.z(obj).intValue();
            EditTextBoldCursor editTextBoldCursor = this.a;
            if (intValue < 0) {
                editTextBoldCursor.setText("0");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            } else if (intValue > 300) {
                editTextBoldCursor.setText("300");
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            } else {
                if (obj.equals(String.valueOf(intValue))) {
                    return;
                }
                editTextBoldCursor.setText(String.valueOf(intValue));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
