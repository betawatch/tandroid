// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class je4 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ je4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.c = editTextBoldCursor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        switch (b) {
            case 0:
                if (!this.b && editable.length() > 32) {
                    this.b = true;
                    editable.delete(32, editable.length());
                    gm.z3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                if (!this.b && editable.length() > 40) {
                    this.b = true;
                    editable.delete(40, editable.length());
                    gm.z3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.b = false;
                    break;
                }
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
}
