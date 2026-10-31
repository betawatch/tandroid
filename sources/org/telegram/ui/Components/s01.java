package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s01 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ t01 b;

    public s01(t01 t01Var, int i10) {
        this.b = t01Var;
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[LOOP:0: B:13:0x0075->B:15:0x007f, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        int i12;
        t01 t01Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = t01Var.n;
        ThemeEditorView.EditorAlert editorAlert = t01Var.I;
        if (editorAlert.B1) {
            return;
        }
        editorAlert.B1 = true;
        int intValue = Utilities.z(editable.toString()).intValue();
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
        int b10 = t01Var.b();
        if (i13 == 2) {
            i10 = b10 & (-256);
            i11 = intValue & org.telegram.messenger.zs.e4;
        } else if (i13 == 1) {
            i10 = b10 & (-65281);
            i11 = (intValue & org.telegram.messenger.zs.e4) << 8;
        } else {
            if (i13 != 0) {
                if (i13 == 3) {
                    i10 = b10 & 16777215;
                    i11 = (intValue & org.telegram.messenger.zs.e4) << 24;
                }
                t01Var.c(b10);
                for (i12 = 0; i12 < ThemeEditorView.this.e.size(); i12++) {
                    ((org.telegram.ui.ActionBar.c7) ThemeEditorView.this.e.get(i12)).e(t01Var.b(), false, true);
                }
                ThemeEditorView.a(ThemeEditorView.this);
                editorAlert.B1 = false;
            }
            i10 = b10 & (-16711681);
            i11 = (intValue & org.telegram.messenger.zs.e4) << 16;
        }
        b10 = i10 | i11;
        t01Var.c(b10);
        while (i12 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.a(ThemeEditorView.this);
        editorAlert.B1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
