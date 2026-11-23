package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e01 implements TextWatcher {
    public final /* synthetic */ f01 a;

    public e01(f01 f01Var) {
        this.a = f01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            sy syVar = this.a.c.p1;
            if (syVar != null) {
                syVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
            }
        } else {
            v4.i0 adapter = this.a.c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.s1) {
                int K0 = ThemeEditorView.EditorAlert.K0(editorAlert);
                this.a.c.p1.setText(org.telegram.messenger.gd.N0(2131748037, null));
                this.a.c.p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.n1.setAdapter(editorAlert2.s1);
                this.a.c.s1.f();
                if (K0 > 0) {
                    this.a.c.r1.h1(0, -K0);
                }
            }
        }
        b01 b01Var = this.a.c.t1;
        if (b01Var == null || obj.equals(b01Var.n)) {
            return;
        }
        b01Var.n = obj;
        if (b01Var.h != null) {
            Utilities.g.a(b01Var.h);
            b01Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = b01Var.d + 1;
            b01Var.d = i7;
            b01Var.h = new org.telegram.ui.f0(b01Var, obj, i7, 28);
            Utilities.g.d(b01Var.h, 300L);
            return;
        }
        b01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = b01Var.r;
        editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
        b01Var.d = -1;
        b01Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
