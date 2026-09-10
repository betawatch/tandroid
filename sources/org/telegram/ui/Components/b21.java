package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b21 implements TextWatcher {
    public final /* synthetic */ c21 a;

    public b21(c21 c21Var) {
        this.a = c21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            tz tzVar = this.a.c.e;
            if (tzVar != null) {
                tzVar.setText(LocaleController.getString(R.string.NoResult));
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
        y11 y11Var = this.a.c.r;
        if (y11Var == null || obj.equals(y11Var.n)) {
            return;
        }
        y11Var.n = obj;
        if (y11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(y11Var.h);
            y11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = y11Var.d + 1;
            y11Var.d = i10;
            y11Var.h = new my(y11Var, obj, i10, 20);
            Utilities.searchQueue.postRunnable(y11Var.h, 300L);
            return;
        }
        y11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = y11Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        y11Var.d = -1;
        y11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
