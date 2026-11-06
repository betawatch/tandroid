package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class uz0 implements TextWatcher {
    public final /* synthetic */ vz0 a;

    public uz0(vz0 vz0Var) {
        this.a = vz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9 = this.a.b.length() > 0;
        if (z9 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(150L).scaleX(z9 ? 1.0f : 0.1f).scaleY(z9 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            iy iyVar = this.a.c.l1;
            if (iyVar != null) {
                iyVar.setText(org.telegram.messenger.hd.M0(2131748166, null));
            }
        } else {
            v4.g0 adapter = this.a.c.j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.l1.setText(org.telegram.messenger.hd.M0(2131748229, null));
                this.a.c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.j1.setAdapter(editorAlert2.o1);
                this.a.c.o1.f();
                if (J0 > 0) {
                    this.a.c.n1.h1(0, -J0);
                }
            }
        }
        rz0 rz0Var = this.a.c.p1;
        if (rz0Var == null || obj.equals(rz0Var.n)) {
            return;
        }
        rz0Var.n = obj;
        if (rz0Var.h != null) {
            Utilities.g.a(rz0Var.h);
            rz0Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = rz0Var.d + 1;
            rz0Var.d = i7;
            rz0Var.h = new org.telegram.ui.q8((Object) rz0Var, obj, i7, 25);
            Utilities.g.d(rz0Var.h, 300L);
            return;
        }
        rz0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = rz0Var.r;
        editorAlert3.w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        rz0Var.d = -1;
        rz0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
