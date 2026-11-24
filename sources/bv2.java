// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bv2 implements TextWatcher {
    public final /* synthetic */ EditTextBoldCursor a;

    public bv2(EditTextBoldCursor editTextBoldCursor) {
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
            fc4.g(e, true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
