package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class l21 implements TextWatcher {
    public final /* synthetic */ m21 a;

    public l21(m21 m21Var) {
        this.a = m21Var;
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
        i21 i21Var = this.a.c.r;
        if (i21Var == null || obj.equals(i21Var.n)) {
            return;
        }
        i21Var.n = obj;
        if (i21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(i21Var.h);
            i21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = i21Var.d + 1;
            i21Var.d = i10;
            i21Var.h = new org.telegram.ui.i4(i21Var, obj, i10, 28);
            Utilities.searchQueue.postRunnable(i21Var.h, 300L);
            return;
        }
        i21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = i21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
        i21Var.d = -1;
        i21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
