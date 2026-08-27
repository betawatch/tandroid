package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w01 implements TextWatcher {
    public final /* synthetic */ x01 a;

    public w01(x01 x01Var) {
        this.a = x01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            az azVar = this.a.c.e;
            if (azVar != null) {
                azVar.setText(LocaleController.getString(R.string.NoResult));
            }
        } else {
            f2.q0 adapter = this.a.c.c.getAdapter();
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
        t01 t01Var = this.a.c.r;
        if (t01Var == null || obj.equals(t01Var.n)) {
            return;
        }
        t01Var.n = obj;
        if (t01Var.h != null) {
            Utilities.searchQueue.cancelRunnable(t01Var.h);
            t01Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = t01Var.d + 1;
            t01Var.d = i10;
            t01Var.h = new km(t01Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(t01Var.h, 300L);
            return;
        }
        t01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = t01Var.r;
        editorAlert3.B = ThemeEditorView.EditorAlert.J(editorAlert3);
        t01Var.d = -1;
        t01Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
