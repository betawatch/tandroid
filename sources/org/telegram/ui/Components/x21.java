package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x21 implements TextWatcher {
    public final /* synthetic */ y21 a;

    public x21(y21 y21Var) {
        this.a = y21Var;
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
        u21 u21Var = this.a.c.r;
        if (u21Var == null || obj.equals(u21Var.n)) {
            return;
        }
        u21Var.n = obj;
        if (u21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(u21Var.h);
            u21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = u21Var.d + 1;
            u21Var.d = i10;
            u21Var.h = new org.telegram.ui.g4(u21Var, obj, i10, 26);
            Utilities.searchQueue.postRunnable(u21Var.h, 300L);
            return;
        }
        u21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = u21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        u21Var.d = -1;
        u21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
