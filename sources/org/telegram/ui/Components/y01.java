package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y01 implements TextWatcher {
    public final /* synthetic */ z01 a;

    public y01(z01 z01Var) {
        this.a = z01Var;
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
                xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
            }
        } else {
            s4.g0 adapter = this.a.c.j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.l1.setText(org.telegram.messenger.cd.L0(2131748247, null));
                this.a.c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.j1.setAdapter(editorAlert2.o1);
                this.a.c.o1.f();
                if (J0 > 0) {
                    this.a.c.n1.h1(0, -J0);
                }
            }
        }
        v01 v01Var = this.a.c.p1;
        if (v01Var == null || obj.equals(v01Var.n)) {
            return;
        }
        v01Var.n = obj;
        if (v01Var.h != null) {
            Utilities.g.a(v01Var.h);
            v01Var.h = null;
        }
        if (obj.length() != 0) {
            int i10 = v01Var.d + 1;
            v01Var.d = i10;
            v01Var.h = new ji0(v01Var, obj, i10, 12);
            Utilities.g.d(v01Var.h, 300L);
            return;
        }
        v01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = v01Var.r;
        editorAlert3.w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        v01Var.d = -1;
        v01Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
