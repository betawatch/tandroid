package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kx0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ mx0 b;

    public /* synthetic */ kx0(mx0 mx0Var, int i3) {
        this.a = i3;
        this.b = mx0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                this.b.Z(true);
                break;
            case 1:
                mx0 mx0Var = this.b;
                if (!mx0Var.L) {
                    EditTextBoldCursor editTextBoldCursor = mx0Var.a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i3 = 0;
                    while (i3 < obj.length()) {
                        int i10 = i3 + 1;
                        String substring = obj.substring(i3, i10);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i3 = i10;
                    }
                    mx0Var.L = true;
                    int intValue = Utilities.z(sb2.toString()).intValue();
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
                    mx0Var.L = false;
                    mx0Var.Z(true);
                    break;
                }
                break;
            default:
                this.b.Z(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
