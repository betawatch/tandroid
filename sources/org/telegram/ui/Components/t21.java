package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t21 implements TextWatcher {
    public final /* synthetic */ u21 a;

    public t21(u21 u21Var) {
        this.a = u21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            c00 c00Var = this.a.c.e;
            if (c00Var != null) {
                c00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.i0 adapter = this.a.c.c.getAdapter();
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
        q21 q21Var = this.a.c.r;
        if (q21Var == null || obj.equals(q21Var.n)) {
            return;
        }
        q21Var.n = obj;
        if (q21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(q21Var.h);
            q21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = q21Var.d + 1;
            q21Var.d = i10;
            q21Var.h = new zk(q21Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(q21Var.h, 300L);
            return;
        }
        q21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = q21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
        q21Var.d = -1;
        q21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
