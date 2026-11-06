package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class tz0 implements TextWatcher {
    public final /* synthetic */ uz0 a;

    public tz0(uz0 uz0Var) {
        this.a = uz0Var;
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
        qz0 qz0Var = this.a.c.p1;
        if (qz0Var == null || obj.equals(qz0Var.n)) {
            return;
        }
        qz0Var.n = obj;
        if (qz0Var.h != null) {
            Utilities.g.a(qz0Var.h);
            qz0Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = qz0Var.d + 1;
            qz0Var.d = i7;
            qz0Var.h = new org.telegram.ui.q8((Object) qz0Var, obj, i7, 25);
            Utilities.g.d(qz0Var.h, 300L);
            return;
        }
        qz0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = qz0Var.r;
        editorAlert3.w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        qz0Var.d = -1;
        qz0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
