package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oe1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f = false;
    public final /* synthetic */ ue1 h;

    public oe1(ue1 ue1Var) {
        this.h = ue1Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        ue1 ue1Var = this.h;
        if (ue1Var.a.getVisibility() != 0) {
            ue1Var.a.setVisibility(0);
            ue1Var.a.setAlpha(0.0f);
        }
        ue1Var.r.setVisibility(8);
        ue1Var.d.l();
        ue1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ue1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        te1 te1Var = this.h.e;
        if (te1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(te1Var.e);
            te1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            te1Var.c.clear();
            te1Var.d.clear();
            te1Var.l();
            te1Var.h.r.setVisibility(8);
        } else {
            int i10 = te1Var.f + 1;
            te1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            se1 se1Var = new se1(te1Var, obj, i10, 0);
            te1Var.e = se1Var;
            dispatchQueue.postRunnable(se1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new ne1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
