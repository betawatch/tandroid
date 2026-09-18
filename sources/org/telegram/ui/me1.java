package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class me1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f = false;
    public final /* synthetic */ se1 h;

    public me1(se1 se1Var) {
        this.h = se1Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        se1 se1Var = this.h;
        if (se1Var.a.getVisibility() != 0) {
            se1Var.a.setVisibility(0);
            se1Var.a.setAlpha(0.0f);
        }
        se1Var.r.setVisibility(8);
        se1Var.d.l();
        se1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        se1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new le1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        re1 re1Var = this.h.e;
        if (re1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(re1Var.e);
            re1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            re1Var.c.clear();
            re1Var.d.clear();
            re1Var.l();
            re1Var.h.r.setVisibility(8);
        } else {
            int i10 = re1Var.f + 1;
            re1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            qe1 qe1Var = new qe1(re1Var, obj, i10, 0);
            re1Var.e = qe1Var;
            dispatchQueue.postRunnable(qe1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new le1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
