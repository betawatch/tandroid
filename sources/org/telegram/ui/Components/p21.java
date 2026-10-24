package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p21 implements TextWatcher {
    public final /* synthetic */ q21 a;

    public p21(q21 q21Var) {
        this.a = q21Var;
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
                int J = ThemeEditorView.EditorAlert.J(editorAlert);
                this.a.c.e.setText(LocaleController.getString(R.string.NoChats));
                this.a.c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.c.setAdapter(editorAlert2.n);
                this.a.c.n.l();
                if (J > 0) {
                    this.a.c.h.h1(0, -J);
                }
            }
        }
        m21 m21Var = this.a.c.r;
        if (m21Var == null || obj.equals(m21Var.n)) {
            return;
        }
        m21Var.n = obj;
        if (m21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(m21Var.h);
            m21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = m21Var.d + 1;
            m21Var.d = i10;
            m21Var.h = new org.telegram.ui.h4(m21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(m21Var.h, 300L);
            return;
        }
        m21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = m21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        m21Var.d = -1;
        m21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
