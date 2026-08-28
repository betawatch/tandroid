package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u01 implements TextWatcher {
    public final /* synthetic */ v01 a;

    public u01(v01 v01Var) {
        this.a = v01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            yy yyVar = this.a.c.e;
            if (yyVar != null) {
                yyVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.r0 adapter = this.a.c.c.getAdapter();
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
        r01 r01Var = this.a.c.r;
        if (r01Var == null || obj.equals(r01Var.n)) {
            return;
        }
        r01Var.n = obj;
        if (r01Var.h != null) {
            Utilities.searchQueue.cancelRunnable(r01Var.h);
            r01Var.h = null;
        }
        if (obj.length() != 0) {
            int i9 = r01Var.d + 1;
            r01Var.d = i9;
            r01Var.h = new org.telegram.ui.rl(r01Var, obj, i9, 23);
            Utilities.searchQueue.postRunnable(r01Var.h, 300L);
            return;
        }
        r01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = r01Var.r;
        editorAlert3.B = ThemeEditorView.EditorAlert.I(editorAlert3);
        r01Var.d = -1;
        r01Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
