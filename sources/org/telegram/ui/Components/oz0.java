package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oz0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public oz0(pz0 pz0Var, int i7) {
        this.b = pz0Var;
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
        pz0 pz0Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = pz0Var.n;
        ThemeEditorView.EditorAlert editorAlert = pz0Var.I;
        if (editorAlert.B1) {
            return;
        }
        editorAlert.B1 = true;
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
        int b10 = pz0Var.b();
        if (i12 == 2) {
            i7 = b10 & (-256);
            i10 = intValue & org.telegram.messenger.qs.e4;
        } else if (i12 == 1) {
            i7 = b10 & (-65281);
            i10 = (intValue & org.telegram.messenger.qs.e4) << 8;
        } else {
            if (i12 != 0) {
                if (i12 == 3) {
                    i7 = b10 & 16777215;
                    i10 = (intValue & org.telegram.messenger.qs.e4) << 24;
                }
                pz0Var.c(b10);
                for (i11 = 0; i11 < ThemeEditorView.this.e.size(); i11++) {
                    ((org.telegram.ui.ActionBar.t6) ThemeEditorView.this.e.get(i11)).e(pz0Var.b(), false, true);
                }
                ThemeEditorView.a(ThemeEditorView.this);
                editorAlert.B1 = false;
            }
            i7 = b10 & (-16711681);
            i10 = (intValue & org.telegram.messenger.qs.e4) << 16;
        }
        b10 = i7 | i10;
        pz0Var.c(b10);
        while (i11 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.a(ThemeEditorView.this);
        editorAlert.B1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
