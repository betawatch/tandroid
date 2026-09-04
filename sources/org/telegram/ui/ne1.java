package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ne1 extends org.telegram.ui.ActionBar.g5 {
    public boolean f = false;
    public final /* synthetic */ te1 h;

    public ne1(te1 te1Var) {
        this.h = te1Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        te1 te1Var = this.h;
        if (te1Var.a.getVisibility() != 0) {
            te1Var.a.setVisibility(0);
            te1Var.a.setAlpha(0.0f);
        }
        te1Var.r.setVisibility(8);
        te1Var.d.l();
        te1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        te1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        se1 se1Var = this.h.e;
        if (se1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(se1Var.e);
            se1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            se1Var.c.clear();
            se1Var.d.clear();
            se1Var.l();
            se1Var.h.r.setVisibility(8);
        } else {
            int i10 = se1Var.f + 1;
            se1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            re1 re1Var = new re1(se1Var, obj, i10, 0);
            se1Var.e = re1Var;
            dispatchQueue.postRunnable(re1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new me1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
