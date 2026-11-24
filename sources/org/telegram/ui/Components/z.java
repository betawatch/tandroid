package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public z(a0 a0Var, int i) {
        this.b = a0Var;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[LOOP:0: B:13:0x0075->B:15:0x007f, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i;
        int i2;
        int i3;
        a0 a0Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = a0Var.n;
        ThemeEditorView.EditorAlert editorAlert = a0Var.J;
        if (editorAlert.E1) {
            return;
        }
        editorAlert.E1 = true;
        int intValue = Utilities.z(editable.toString()).intValue();
        int i4 = this.a;
        if (intValue < 0) {
            editTextBoldCursorArr[i4].setText("0");
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i4];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            intValue = 0;
        } else if (intValue > 255) {
            editTextBoldCursorArr[i4].setText("255");
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[i4];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            intValue = 255;
        }
        int b = a0Var.b();
        if (i4 == 2) {
            i = b & (-256);
            i2 = intValue & nm7.d4;
        } else if (i4 == 1) {
            i = b & (-65281);
            i2 = (intValue & nm7.d4) << 8;
        } else {
            if (i4 != 0) {
                if (i4 == 3) {
                    i = b & 16777215;
                    i2 = (intValue & nm7.d4) << 24;
                }
                a0Var.c(b);
                for (i3 = 0; i3 < ThemeEditorView.this.e.size(); i3++) {
                    ((cnb) ThemeEditorView.this.e.get(i3)).e(a0Var.b(), false, true);
                }
                ThemeEditorView.this.c();
                editorAlert.E1 = false;
            }
            i = b & (-16711681);
            i2 = (intValue & nm7.d4) << 16;
        }
        b = i | i2;
        a0Var.c(b);
        while (i3 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.this.c();
        editorAlert.E1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
