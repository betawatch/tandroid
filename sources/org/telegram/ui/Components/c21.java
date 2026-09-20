package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c21 implements TextWatcher {
    public final /* synthetic */ d21 a;

    public c21(d21 d21Var) {
        this.a = d21Var;
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
        z11 z11Var = this.a.c.r;
        if (z11Var == null || obj.equals(z11Var.n)) {
            return;
        }
        z11Var.n = obj;
        if (z11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(z11Var.h);
            z11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = z11Var.d + 1;
            z11Var.d = i10;
            z11Var.h = new wm(z11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(z11Var.h, 300L);
            return;
        }
        z11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = z11Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        z11Var.d = -1;
        z11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
