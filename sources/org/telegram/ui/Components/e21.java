package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e21 implements TextWatcher {
    public final /* synthetic */ f21 a;

    public e21(f21 f21Var) {
        this.a = f21Var;
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
        b21 b21Var = this.a.c.r;
        if (b21Var == null || obj.equals(b21Var.n)) {
            return;
        }
        b21Var.n = obj;
        if (b21Var.h != null) {
            Utilities.searchQueue.cancelRunnable(b21Var.h);
            b21Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = b21Var.d + 1;
            b21Var.d = i10;
            b21Var.h = new wm(b21Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(b21Var.h, 300L);
            return;
        }
        b21Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = b21Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        b21Var.d = -1;
        b21Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
