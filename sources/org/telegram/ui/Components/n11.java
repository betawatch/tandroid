package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n11 implements TextWatcher {
    public final /* synthetic */ o11 a;

    public n11(o11 o11Var) {
        this.a = o11Var;
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
        k11 k11Var = this.a.c.r;
        if (k11Var == null || obj.equals(k11Var.n)) {
            return;
        }
        k11Var.n = obj;
        if (k11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(k11Var.h);
            k11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = k11Var.d + 1;
            k11Var.d = i10;
            k11Var.h = new org.telegram.ui.dm(k11Var, obj, i10, 23);
            Utilities.searchQueue.postRunnable(k11Var.h, 300L);
            return;
        }
        k11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = k11Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        k11Var.d = -1;
        k11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
