package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b21 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ d21 b;

    public /* synthetic */ b21(d21 d21Var, int i10) {
        this.a = i10;
        this.b = d21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                this.b.V(true);
                break;
            case 1:
                d21 d21Var = this.b;
                if (!d21Var.K) {
                    EditTextBoldCursor editTextBoldCursor = d21Var.a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i10 = i11;
                    }
                    d21Var.K = true;
                    int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                    if (intValue < 0 || intValue > 65535 || !obj.equals(sb2.toString())) {
                        if (intValue < 0) {
                            editTextBoldCursor.setText("0");
                        } else if (intValue > 65535) {
                            editTextBoldCursor.setText("65535");
                        } else {
                            editTextBoldCursor.setText(sb2.toString());
                        }
                    } else if (selectionStart >= 0) {
                        editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                    }
                    d21Var.K = false;
                    d21Var.V(true);
                    break;
                }
                break;
            default:
                this.b.V(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
