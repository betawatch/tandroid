package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q21 implements TextWatcher {
    public final /* synthetic */ r21 a;

    public q21(r21 r21Var) {
        this.a = r21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            yz yzVar = this.a.c.e;
            if (yzVar != null) {
                yzVar.setText(LocaleController.getString(R.string.NoResult));
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
        n21 n21Var = this.a.c.r;
        if (n21Var == null || obj.equals(n21Var.n)) {
            return;
        }
        n21Var.n = obj;
        if (n21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(n21Var.h);
            n21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = n21Var.d + 1;
            n21Var.d = i10;
            n21Var.h = new org.telegram.ui.gm(n21Var, obj, i10, 24);
            Utilities.searchQueue.postRunnable(n21Var.h, 300L);
            return;
        }
        n21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = n21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.K(editorAlert3);
        n21Var.d = -1;
        n21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
