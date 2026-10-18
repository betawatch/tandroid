package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k21 implements TextWatcher {
    public final /* synthetic */ l21 a;

    public k21(l21 l21Var) {
        this.a = l21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            vz vzVar = this.a.c.e;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.g0 adapter = this.a.c.c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.n) {
                int K = ThemeEditorView.EditorAlert.K(editorAlert);
                this.a.c.e.setText(LocaleController.getString(R.string.NoChats));
                this.a.c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.c.setAdapter(editorAlert2.n);
                this.a.c.n.l();
                if (K > 0) {
                    this.a.c.h.h1(0, -K);
                }
            }
        }
        h21 h21Var = this.a.c.r;
        if (h21Var == null || obj.equals(h21Var.n)) {
            return;
        }
        h21Var.n = obj;
        if (h21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(h21Var.h);
            h21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = h21Var.d + 1;
            h21Var.d = i10;
            h21Var.h = new org.telegram.ui.i4(h21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(h21Var.h, 300L);
            return;
        }
        h21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = h21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
        h21Var.d = -1;
        h21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
