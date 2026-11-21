package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f01 implements TextWatcher {
    public final /* synthetic */ g01 a;

    public f01(g01 g01Var) {
        this.a = g01Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            vy vyVar = this.a.c.p1;
            if (vyVar != null) {
                vyVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
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
        c01 c01Var = this.a.c.t1;
        if (c01Var == null || obj.equals(c01Var.n)) {
            return;
        }
        c01Var.n = obj;
        if (c01Var.h != null) {
            Utilities.g.a(c01Var.h);
            c01Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = c01Var.d + 1;
            c01Var.d = i7;
            c01Var.h = new org.telegram.ui.b0(c01Var, obj, i7, 29);
            Utilities.g.d(c01Var.h, 300L);
            return;
        }
        c01Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = c01Var.r;
        editorAlert3.A1 = ThemeEditorView.EditorAlert.K0(editorAlert3);
        c01Var.d = -1;
        c01Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
