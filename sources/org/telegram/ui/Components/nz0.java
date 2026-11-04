package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nz0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz0 b;

    public nz0(oz0 oz0Var, int i3) {
        this.b = oz0Var;
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[LOOP:0: B:13:0x0075->B:15:0x007f, LOOP_END] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i3;
        int i10;
        int i11;
        oz0 oz0Var = this.b;
        EditTextBoldCursor[] editTextBoldCursorArr = oz0Var.n;
        ThemeEditorView.EditorAlert editorAlert = oz0Var.J;
        if (editorAlert.C1) {
            return;
        }
        editorAlert.C1 = true;
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
        int b10 = oz0Var.b();
        if (i12 == 2) {
            i3 = b10 & (-256);
            i10 = intValue & org.telegram.messenger.hs.e4;
        } else if (i12 == 1) {
            i3 = b10 & (-65281);
            i10 = (intValue & org.telegram.messenger.hs.e4) << 8;
        } else {
            if (i12 != 0) {
                if (i12 == 3) {
                    i3 = b10 & 16777215;
                    i10 = (intValue & org.telegram.messenger.hs.e4) << 24;
                }
                oz0Var.c(b10);
                for (i11 = 0; i11 < ThemeEditorView.this.e.size(); i11++) {
                    ((org.telegram.ui.ActionBar.t6) ThemeEditorView.this.e.get(i11)).e(oz0Var.b(), false, true);
                }
                ThemeEditorView.a(ThemeEditorView.this);
                editorAlert.C1 = false;
            }
            i3 = b10 & (-16711681);
            i10 = (intValue & org.telegram.messenger.hs.e4) << 16;
        }
        b10 = i3 | i10;
        oz0Var.c(b10);
        while (i11 < ThemeEditorView.this.e.size()) {
        }
        ThemeEditorView.a(ThemeEditorView.this);
        editorAlert.C1 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
