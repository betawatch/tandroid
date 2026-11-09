package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vz0 implements TextWatcher {
    public final /* synthetic */ wz0 a;

    public vz0(wz0 wz0Var) {
        this.a = wz0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9 = this.a.b.length() > 0;
        if (z9 != (this.a.a.getAlpha() != 0.0f)) {
            this.a.a.animate().alpha(z9 ? 1.0f : 0.0f).setDuration(150L).scaleX(z9 ? 1.0f : 0.1f).scaleY(z9 ? 1.0f : 0.1f).start();
        }
        String obj = this.a.b.getText().toString();
        if (obj.length() != 0) {
            jy jyVar = this.a.c.l1;
            if (jyVar != null) {
                jyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
            }
        } else {
            v4.g0 adapter = this.a.c.j1.getAdapter();
            ThemeEditorView.EditorAlert editorAlert = this.a.c;
            if (adapter != editorAlert.o1) {
                int J0 = ThemeEditorView.EditorAlert.J0(editorAlert);
                this.a.c.l1.setText(org.telegram.messenger.id.M0(2131748230, null));
                this.a.c.l1.c();
                ThemeEditorView.EditorAlert editorAlert2 = this.a.c;
                editorAlert2.j1.setAdapter(editorAlert2.o1);
                this.a.c.o1.f();
                if (J0 > 0) {
                    this.a.c.n1.h1(0, -J0);
                }
            }
        }
        sz0 sz0Var = this.a.c.p1;
        if (sz0Var == null || obj.equals(sz0Var.n)) {
            return;
        }
        sz0Var.n = obj;
        if (sz0Var.h != null) {
            Utilities.g.a(sz0Var.h);
            sz0Var.h = null;
        }
        if (obj.length() != 0) {
            int i7 = sz0Var.d + 1;
            sz0Var.d = i7;
            sz0Var.h = new org.telegram.ui.q8((Object) sz0Var, obj, i7, 25);
            Utilities.g.d(sz0Var.h, 300L);
            return;
        }
        sz0Var.e.clear();
        ThemeEditorView.EditorAlert editorAlert3 = sz0Var.r;
        editorAlert3.w1 = ThemeEditorView.EditorAlert.J0(editorAlert3);
        sz0Var.d = -1;
        sz0Var.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
