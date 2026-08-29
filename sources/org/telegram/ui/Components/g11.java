package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g11 implements TextWatcher {
    public final /* synthetic */ h11 a;

    public g11(h11 h11Var) {
        this.a = h11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            hz hzVar = this.a.c.e;
            if (hzVar != null) {
                hzVar.setText(LocaleController.getString(R.string.NoResult));
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
        d11 d11Var = this.a.c.r;
        if (d11Var == null || obj.equals(d11Var.n)) {
            return;
        }
        d11Var.n = obj;
        if (d11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(d11Var.h);
            d11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = d11Var.d + 1;
            d11Var.d = i10;
            d11Var.h = new rm(d11Var, obj, i10, 22);
            Utilities.searchQueue.postRunnable(d11Var.h, 300L);
            return;
        }
        d11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = d11Var.r;
        editorAlert3.B = ThemeEditorView.EditorAlert.I(editorAlert3);
        d11Var.d = -1;
        d11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
