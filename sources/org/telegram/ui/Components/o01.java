package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o01 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ p01 b;

    public o01(p01 p01Var, int i9) {
        this.b = p01Var;
        this.a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[LOOP:0: B:13:0x0076->B:15:0x0080, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i9;
        int i10;
        int i11;
        p01 p01Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = p01Var.n;
        ThemeEditorView.EditorAlert editorAlert = p01Var.E;
        if (editorAlert.G) {
            return;
        }
        editorAlert.G = true;
        int intValue = Utilities.parseInt((CharSequence) editable.toString()).intValue();
        int i12 = this.a;
        if (intValue < 0) {
            editTextBoldCursorArr[i12].setText("0");
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i12];
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            intValue = 0;
        } else if (intValue > 255) {
            editTextBoldCursorArr[i12].setText("255");
            EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursorArr[i12];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            intValue = 255;
        }
        int b10 = p01Var.b();
        if (i12 == 2) {
            i9 = b10 & (-256);
            i10 = intValue & 255;
        } else if (i12 == 1) {
            i9 = b10 & (-65281);
            i10 = (intValue & 255) << 8;
        } else {
            if (i12 != 0) {
                if (i12 == 3) {
                    i9 = b10 & 16777215;
                    i10 = (intValue & 255) << 24;
                }
                p01Var.c(b10);
                for (i11 = 0; i11 < ThemeEditorView.this.c.size(); i11++) {
                    ((org.telegram.ui.ActionBar.h6) ThemeEditorView.this.c.get(i11)).d(p01Var.b(), false, true);
                }
                editorAlert.G = false;
            }
            i9 = b10 & (-16711681);
            i10 = (intValue & 255) << 16;
        }
        b10 = i9 | i10;
        p01Var.c(b10);
        while (i11 < ThemeEditorView.this.c.size()) {
        }
        editorAlert.G = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
