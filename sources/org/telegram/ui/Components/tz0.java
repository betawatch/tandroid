package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tz0 implements TextWatcher {
    public final /* synthetic */ uz0 a;

    public tz0(uz0 uz0Var) {
        this.a = uz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            gy gyVar = this.a.c.m1;
            if (gyVar != null) {
                gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
            }
        } else {
            u4.h0 adapter = this.a.c.k1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.p1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.m1.setText(org.telegram.messenger.bd.M0(2131748238, null));
                this.a.c.m1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.k1.setAdapter(editorAlert2.p1);
                this.a.c.p1.f();
                if (J0 > 0) {
                    this.a.c.o1.h1(0, -J0);
                }
            }
        }
        qz0 qz0Var = this.a.c.q1;
        if (qz0Var == null || obj.equals(qz0Var.n)) {
            return;
        }
        qz0Var.n = obj;
        if (qz0Var.h != null) {
            Utilities.g.a(qz0Var.h);
            qz0Var.h = null;
        }
        if (obj.length() != 0) {
            int i3 = qz0Var.d + 1;
            qz0Var.d = i3;
            qz0Var.h = new org.telegram.ui.f4(qz0Var, obj, i3, 26);
            Utilities.g.e(qz0Var.h, 300L);
            return;
        }
        qz0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = qz0Var.r;
        editorAlert3.x1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        qz0Var.d = -1;
        qz0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
