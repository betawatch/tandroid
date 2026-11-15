package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wz0 implements TextWatcher {
    public final /* synthetic */ xz0 a;

    public wz0(xz0 xz0Var) {
        this.a = xz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10 = this.a.b.length() > 0;
        if (z10 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            ny nyVar = this.a.c.p1;
            if (nyVar != null) {
                nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
            }
        } else {
            v4.h0 adapter = this.a.c.n1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.s1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.p1.setText(org.telegram.messenger.hd.M0(2131748230, null));
                this.a.c.p1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.n1.setAdapter(editorAlert2.s1);
                this.a.c.s1.f();
                if (J0 > 0) {
                    this.a.c.r1.h1(0, -J0);
                }
            }
        }
        tz0 tz0Var = this.a.c.t1;
        if (tz0Var == null || obj.equals(tz0Var.n)) {
            return;
        }
        tz0Var.n = obj;
        if (tz0Var.h != null) {
            Utilities.g.a(tz0Var.h);
            tz0Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = tz0Var.d + 1;
            tz0Var.d = i7;
            tz0Var.h = new org.telegram.ui.f0(tz0Var, obj, i7, 28);
            Utilities.g.d(tz0Var.h, 300L);
            return;
        }
        tz0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = tz0Var.r;
        editorAlert3.A1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        tz0Var.d = -1;
        tz0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
