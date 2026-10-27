package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y21 implements TextWatcher {
    public final /* synthetic */ z21 a;

    public y21(z21 z21Var) {
        this.a = z21Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            uz uzVar = this.a.c.e;
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
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
        v21 v21Var = this.a.c.r;
        if (v21Var == null || obj.equals(v21Var.n)) {
            return;
        }
        v21Var.n = obj;
        if (v21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(v21Var.h);
            v21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = v21Var.d + 1;
            v21Var.d = i10;
            v21Var.h = new org.telegram.ui.g4(v21Var, obj, i10, 26);
            Utilities.searchQueue.postRunnable(v21Var.h, 300L);
            return;
        }
        v21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = v21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        v21Var.d = -1;
        v21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
