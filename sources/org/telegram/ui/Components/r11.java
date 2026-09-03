package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r11 implements TextWatcher {
    public final /* synthetic */ s11 a;

    public r11(s11 s11Var) {
        this.a = s11Var;
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
        o11 o11Var = this.a.c.r;
        if (o11Var == null || obj.equals(o11Var.n)) {
            return;
        }
        o11Var.n = obj;
        if (o11Var.h != null) {
            Utilities.searchQueue.cancelRunnable(o11Var.h);
            o11Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = o11Var.d + 1;
            o11Var.d = i10;
            o11Var.h = new gy(o11Var, obj, i10, 20);
            Utilities.searchQueue.postRunnable(o11Var.h, 300L);
            return;
        }
        o11Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = o11Var.r;
        editorAlert3.C = ThemeEditorView.EditorAlert.I(editorAlert3);
        o11Var.d = -1;
        o11Var.l();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
