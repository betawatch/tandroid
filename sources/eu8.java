// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eu8 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu8 b;

    public /* synthetic */ eu8(fu8 fu8Var, byte b) {
        this.a = b;
        this.b = fu8Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        fu8 fu8Var = this.b;
        switch (b) {
            case 0:
                fu8Var.Y(true);
                break;
            case 1:
                if (!fu8Var.L) {
                    EditTextBoldCursor editTextBoldCursor = fu8Var.a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb = new StringBuilder(obj.length());
                    int i = 0;
                    while (i < obj.length()) {
                        int i2 = i + 1;
                        String substring = obj.substring(i, i2);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i = i2;
                    }
                    fu8Var.L = true;
                    int intValue = Utilities.z(sb.toString()).intValue();
                    if (intValue < 0 || intValue > 65535 || !obj.equals(sb.toString())) {
                        if (intValue < 0) {
                            editTextBoldCursor.setText("0");
                        } else if (intValue > 65535) {
                            editTextBoldCursor.setText("65535");
                        } else {
                            editTextBoldCursor.setText(sb.toString());
                        }
                    } else if (selectionStart >= 0) {
                        editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                    }
                    fu8Var.L = false;
                    fu8Var.Y(true);
                    break;
                }
                break;
            default:
                fu8Var.Y(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }
}
