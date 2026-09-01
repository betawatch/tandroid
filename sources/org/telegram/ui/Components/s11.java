package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class s11 implements TextWatcher {
    public final /* synthetic */ t11 a;

    public s11(t11 t11Var) {
        this.a = t11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z4 = this.a.b.length() > 0;
        if (z4 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z4 ? 1.0f : 0.0f).setDuration(150L).scaleX(z4 ? 1.0f : 0.1f).scaleY(z4 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            oz ozVar = this.a.c.e;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.p0 adapter = this.a.c.c.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.n) {
                int I = ThemeEditorView.EditorAlert.I(editorAlert);
                this.a.c.e.setText(LocaleController.getString(R.string.NoChats));
                this.a.c.e.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.c.setAdapter(editorAlert2.n);
                this.a.c.n.l();
                if (I > 0) {
                    this.a.c.h.h1(0, -I);
                }
            }
        }
        p11 p11Var = this.a.c.r;
        if (p11Var == null || obj.equals(p11Var.n)) {
            return;
        }
        p11Var.n = obj;
        if (p11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(p11Var.h);
            p11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = p11Var.d + 1;
            p11Var.d = i10;
            p11Var.h = new gy(p11Var, obj, i10, 20);
            Utilities.searchQueue.postRunnable(p11Var.h, 300L);
            return;
        }
        p11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = p11Var.r;
        editorAlert3.C = ThemeEditorView.EditorAlert.I(editorAlert3);
        p11Var.d = -1;
        p11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
