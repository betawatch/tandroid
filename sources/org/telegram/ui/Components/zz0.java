package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class zz0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ a01 b;

    public zz0(a01 a01Var, int i7) {
        this.b = a01Var;
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[LOOP:0: B:13:0x0075->B:15:0x007f, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10;
        int i11;
        a01 a01Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = a01Var.n;
        ThemeEditorView.EditorAlert editorAlert = a01Var.J;
        if (editorAlert.F1) {
            return;
        }
        editorAlert.F1 = true;
        int intValue = Utilities.z(editable.toString()).intValue();
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
        int b10 = a01Var.b();
        if (i12 == 2) {
            i7 = b10 & (-256);
            i10 = intValue & org.telegram.messenger.ls.e4;
        } else if (i12 == 1) {
            i7 = b10 & (-65281);
            i10 = (intValue & org.telegram.messenger.ls.e4) << 8;
        } else {
            if (i12 != 0) {
                if (i12 == 3) {
                    i7 = b10 & 16777215;
                    i10 = (intValue & org.telegram.messenger.ls.e4) << 24;
                }
                a01Var.c(b10);
                for (i11 = 0; i11 < ThemeEditorView.this.e.size(); i11++) {
                    ((org.telegram.ui.ActionBar.v6) ThemeEditorView.this.e.get(i11)).e(a01Var.b(), false, true);
                }
                ThemeEditorView.a(ThemeEditorView.this);
                editorAlert.F1 = false;
            }
            i7 = b10 & (-16711681);
            i10 = (intValue & org.telegram.messenger.ls.e4) << 16;
        }
        b10 = i7 | i10;
        a01Var.c(b10);
        while (i11 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.a(ThemeEditorView.this);
        editorAlert.F1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
