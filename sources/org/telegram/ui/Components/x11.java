package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class x11 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public x11(y11 y11Var, int i10) {
        this.b = y11Var;
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[LOOP:0: B:13:0x0076->B:15:0x0080, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        int i12;
        y11 y11Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = y11Var.n;
        ThemeEditorView.EditorAlert editorAlert = y11Var.I;
        if (editorAlert.K) {
            return;
        }
        editorAlert.K = true;
        int intValue = Utilities.parseInt((CharSequence) editable.toString()).intValue();
        int i13 = this.a;
        if (intValue < 0) {
            editTextBoldCursorArr[i13].setText("0");
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i13];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            intValue = 0;
        } else if (intValue > 255) {
            editTextBoldCursorArr[i13].setText("255");
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            intValue = 255;
        }
        int b10 = y11Var.b();
        if (i13 == 2) {
            i10 = b10 & (-256);
            i11 = intValue & 255;
        } else if (i13 == 1) {
            i10 = b10 & (-65281);
            i11 = (intValue & 255) << 8;
        } else {
            if (i13 != 0) {
                if (i13 == 3) {
                    i10 = b10 & 16777215;
                    i11 = (intValue & 255) << 24;
                }
                y11Var.c(b10);
                for (i12 = 0; i12 < ThemeEditorView.this.c.size(); i12++) {
                    ((org.telegram.ui.ActionBar.l6) ThemeEditorView.this.c.get(i12)).d(y11Var.b(), false, true);
                }
                editorAlert.K = false;
            }
            i10 = b10 & (-16711681);
            i11 = (intValue & 255) << 16;
        }
        b10 = i10 | i11;
        y11Var.c(b10);
        while (i12 < ThemeEditorView.this.c.size()) {
        }
        editorAlert.K = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
