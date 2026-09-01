package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m11 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;

    public m11(n11 n11Var, int i10) {
        this.b = n11Var;
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
        n11 n11Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = n11Var.n;
        ThemeEditorView.EditorAlert editorAlert = n11Var.F;
        if (editorAlert.H) {
            return;
        }
        editorAlert.H = true;
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
        int b10 = n11Var.b();
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
                n11Var.c(b10);
                for (i12 = 0; i12 < ThemeEditorView.this.c.size(); i12++) {
                    ((org.telegram.ui.ActionBar.m6) ThemeEditorView.this.c.get(i12)).d(n11Var.b(), false, true);
                }
                editorAlert.H = false;
            }
            i10 = b10 & (-16711681);
            i11 = (intValue & 255) << 16;
        }
        b10 = i10 | i11;
        n11Var.c(b10);
        while (i12 < ThemeEditorView.this.c.size()) {
        }
        editorAlert.H = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
