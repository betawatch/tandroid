package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fe1 extends org.telegram.ui.ActionBar.f5 {
    public boolean f = false;
    public final /* synthetic */ le1 h;

    public fe1(le1 le1Var) {
        this.h = le1Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        le1 le1Var = this.h;
        if (le1Var.a.getVisibility() != 0) {
            le1Var.a.setVisibility(0);
            le1Var.a.setAlpha(0.0f);
        }
        le1Var.r.setVisibility(8);
        le1Var.d.l();
        le1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        le1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new ee1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ke1 ke1Var = this.h.e;
        if (ke1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ke1Var.e);
            ke1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ke1Var.c.clear();
            ke1Var.d.clear();
            ke1Var.l();
            ke1Var.h.r.setVisibility(8);
        } else {
            int i10 = ke1Var.f + 1;
            ke1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            je1 je1Var = new je1(ke1Var, obj, i10, 0);
            ke1Var.e = je1Var;
            dispatchQueue.postRunnable(je1Var, 300L);
        }
        if (this.f || TextUtils.isEmpty(obj)) {
            if (this.f && TextUtils.isEmpty(obj)) {
                m();
                return;
            }
            return;
        }
        if (this.h.s.getVisibility() != 0) {
            this.h.s.setVisibility(0);
            this.h.s.setAlpha(0.0f);
        }
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new ee1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
