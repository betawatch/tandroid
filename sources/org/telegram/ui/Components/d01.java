package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d01 implements TextWatcher {
    public final /* synthetic */ e01 a;

    public d01(e01 e01Var) {
        this.a = e01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            ty tyVar = this.a.c.p1;
            if (tyVar != null) {
                tyVar.setText(org.telegram.messenger.gd.M0(2131747975, null));
            }
        } else {
            v4.i0 adapter = this.a.c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.a.c.p1.setText(org.telegram.messenger.gd.M0(2131748038, null));
                this.a.c.p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.n1.setAdapter(editorAlert2.s1);
                this.a.c.s1.f();
                if (K0 > 0) {
                    this.a.c.r1.h1(0, -K0);
                }
            }
        }
        a01 a01Var = this.a.c.t1;
        if (a01Var == null || obj.equals(a01Var.n)) {
            return;
        }
        a01Var.n = obj;
        if (a01Var.h != null) {
            Utilities.g.a(a01Var.h);
            a01Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = a01Var.d + 1;
            a01Var.d = i7;
            a01Var.h = new org.telegram.ui.b0(a01Var, obj, i7, 29);
            Utilities.g.d(a01Var.h, 300L);
            return;
        }
        a01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = a01Var.r;
        editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
        a01Var.d = -1;
        a01Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
