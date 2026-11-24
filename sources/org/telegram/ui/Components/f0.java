package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f0 implements TextWatcher {
    public final /* synthetic */ g0 a;

    public f0(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = this.a.b.length() > 0;
        if (z != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        int length = obj.length();
        ThemeEditorView.EditorAlert editorAlert = this.a.c;
        if (length != 0) {
            g24 g24Var = editorAlert.o1;
            if (g24Var != null) {
                g24Var.setText(k96.M0(2131747975, null));
            }
        } else {
            w39 adapter = editorAlert.m1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
            if (adapter != editorAlert2.r1) {
                int D0 = editorAlert2.D0();
                this.a.c.o1.setText(k96.M0(2131748038, null));
                this.a.c.o1.c();
                ThemeEditorView.EditorAlert editorAlert3 = this.a.c;
                editorAlert3.m1.setAdapter(editorAlert3.r1);
                this.a.c.r1.f();
                if (D0 > 0) {
                    this.a.c.q1.g1(0, -D0);
                }
            }
        }
        c0 c0Var = this.a.c.s1;
        if (c0Var == null || obj.equals(c0Var.n)) {
            return;
        }
        c0Var.n = obj;
        if (c0Var.h != null) {
            Utilities.g.a(c0Var.h);
            c0Var.h = null;
        }
        if (obj.length() != 0) {
            int i = c0Var.d + 1;
            c0Var.d = i;
            c0Var.h = new t79(c0Var, obj, i, (byte) 23);
            Utilities.g.d(c0Var.h, 300L);
            return;
        }
        c0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert4 = c0Var.r;
        int i2 = ThemeEditorView.EditorAlert.G1;
        editorAlert4.z1 = editorAlert4.D0();
        c0Var.d = -1;
        c0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
