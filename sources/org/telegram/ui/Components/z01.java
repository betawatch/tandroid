package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z01 implements TextWatcher {
    public final /* synthetic */ a11 a;

    public z01(a11 a11Var) {
        this.a = a11Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            xy xyVar = this.a.c.l1;
            if (xyVar != null) {
                xyVar.setText(org.telegram.messenger.dd.L0(2131748183, null));
            }
        } else {
            s4.g0 adapter = this.a.c.j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.l1.setText(org.telegram.messenger.dd.L0(2131748247, null));
                this.a.c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.j1.setAdapter(editorAlert2.o1);
                this.a.c.o1.f();
                if (J0 > 0) {
                    this.a.c.n1.h1(0, -J0);
                }
            }
        }
        w01 w01Var = this.a.c.p1;
        if (w01Var == null || obj.equals(w01Var.n)) {
            return;
        }
        w01Var.n = obj;
        if (w01Var.h != null) {
            Utilities.g.a(w01Var.h);
            w01Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = w01Var.d + 1;
            w01Var.d = i10;
            w01Var.h = new ki0(w01Var, obj, i10, 12);
            Utilities.g.d(w01Var.h, 300L);
            return;
        }
        w01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = w01Var.r;
        editorAlert3.w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        w01Var.d = -1;
        w01Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
