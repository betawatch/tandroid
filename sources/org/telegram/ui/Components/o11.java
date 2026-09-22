package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o11 implements TextWatcher {
    public final /* synthetic */ p11 a;

    public o11(p11 p11Var) {
        this.a = p11Var;
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
        l11 l11Var = this.a.c.r;
        if (l11Var == null || obj.equals(l11Var.n)) {
            return;
        }
        l11Var.n = obj;
        if (l11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(l11Var.h);
            l11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = l11Var.d + 1;
            l11Var.d = i10;
            l11Var.h = new wm(l11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(l11Var.h, 300L);
            return;
        }
        l11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = l11Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        l11Var.d = -1;
        l11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
