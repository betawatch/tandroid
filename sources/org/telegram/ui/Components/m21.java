package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m21 implements TextWatcher {
    public final /* synthetic */ n21 a;

    public m21(n21 n21Var) {
        this.a = n21Var;
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
        j21 j21Var = this.a.c.r;
        if (j21Var == null || obj.equals(j21Var.n)) {
            return;
        }
        j21Var.n = obj;
        if (j21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(j21Var.h);
            j21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = j21Var.d + 1;
            j21Var.d = i10;
            j21Var.h = new zm(j21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(j21Var.h, 300L);
            return;
        }
        j21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = j21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.H(editorAlert3);
        j21Var.d = -1;
        j21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
