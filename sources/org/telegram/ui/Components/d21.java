package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class d21 implements TextWatcher {
    public final /* synthetic */ e21 a;

    public d21(e21 e21Var) {
        this.a = e21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            mz mzVar = this.a.c.e;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            s4.h0 adapter = this.a.c.c.getAdapter();
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
        a21 a21Var = this.a.c.r;
        if (a21Var == null || obj.equals(a21Var.n)) {
            return;
        }
        a21Var.n = obj;
        if (a21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(a21Var.h);
            a21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = a21Var.d + 1;
            a21Var.d = i10;
            a21Var.h = new wm(a21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(a21Var.h, 300L);
            return;
        }
        a21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = a21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        a21Var.d = -1;
        a21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
