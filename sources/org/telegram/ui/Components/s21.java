package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s21 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ t21 b;

    public s21(t21 t21Var, int i10) {
        this.b = t21Var;
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
        t21 t21Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = t21Var.n;
        ThemeEditorView.EditorAlert editorAlert = t21Var.I;
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
        int b10 = t21Var.b();
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
                t21Var.c(b10);
                for (i12 = 0; i12 < ThemeEditorView.this.e.size(); i12++) {
                    ((org.telegram.ui.ActionBar.h7) ThemeEditorView.this.e.get(i12)).e(t21Var.b(), false, true);
                }
                ThemeEditorView.a(ThemeEditorView.this);
                editorAlert.K = false;
            }
            i10 = b10 & (-16711681);
            i11 = (intValue & 255) << 16;
        }
        b10 = i10 | i11;
        t21Var.c(b10);
        while (i12 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.a(ThemeEditorView.this);
        editorAlert.K = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
