package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class be1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f = false;
    public final /* synthetic */ he1 h;

    public be1(he1 he1Var) {
        this.h = he1Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        he1 he1Var = this.h;
        if (he1Var.a.getVisibility() != 0) {
            he1Var.a.setVisibility(0);
            he1Var.a.setAlpha(0.0f);
        }
        he1Var.r.setVisibility(8);
        he1Var.d.l();
        he1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        he1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new ae1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ge1 ge1Var = this.h.e;
        if (ge1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ge1Var.e);
            ge1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ge1Var.c.clear();
            ge1Var.d.clear();
            ge1Var.l();
            ge1Var.h.r.setVisibility(8);
        } else {
            int i10 = ge1Var.f + 1;
            ge1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fe1 fe1Var = new fe1(ge1Var, obj, i10, 0);
            ge1Var.e = fe1Var;
            dispatchQueue.postRunnable(fe1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new ae1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
