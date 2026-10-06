package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n21 implements TextWatcher {
    public final /* synthetic */ o21 a;

    public n21(o21 o21Var) {
        this.a = o21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            pz pzVar = this.a.c.e;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.a.c.c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.n) {
                int H = ThemeEditorView.EditorAlert.H(editorAlert);
                this.a.c.e.setText(LocaleController.getString(R.string.NoChats));
                this.a.c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.c.setAdapter(editorAlert2.n);
                this.a.c.n.l();
                if (H > 0) {
                    this.a.c.h.h1(0, -H);
                }
            }
        }
        k21 k21Var = this.a.c.r;
        if (k21Var == null || obj.equals(k21Var.n)) {
            return;
        }
        k21Var.n = obj;
        if (k21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(k21Var.h);
            k21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = k21Var.d + 1;
            k21Var.d = i10;
            k21Var.h = new zm(k21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(k21Var.h, 300L);
            return;
        }
        k21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = k21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.H(editorAlert3);
        k21Var.d = -1;
        k21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
