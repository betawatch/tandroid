package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p11 implements TextWatcher {
    public final /* synthetic */ q11 a;

    public p11(q11 q11Var) {
        this.a = q11Var;
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
        m11 m11Var = this.a.c.r;
        if (m11Var == null || obj.equals(m11Var.n)) {
            return;
        }
        m11Var.n = obj;
        if (m11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(m11Var.h);
            m11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = m11Var.d + 1;
            m11Var.d = i10;
            m11Var.h = new wm(m11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(m11Var.h, 300L);
            return;
        }
        m11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = m11Var.r;
        editorAlert3.F = ThemeEditorView.EditorAlert.J(editorAlert3);
        m11Var.d = -1;
        m11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
