package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ae1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f = false;
    public final /* synthetic */ ge1 h;

    public ae1(ge1 ge1Var) {
        this.h = ge1Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        ge1 ge1Var = this.h;
        if (ge1Var.a.getVisibility() != 0) {
            ge1Var.a.setVisibility(0);
            ge1Var.a.setAlpha(0.0f);
        }
        ge1Var.r.setVisibility(8);
        ge1Var.d.l();
        ge1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ge1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new zd1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        fe1 fe1Var = this.h.e;
        if (fe1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(fe1Var.e);
            fe1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            fe1Var.c.clear();
            fe1Var.d.clear();
            fe1Var.l();
            fe1Var.h.r.setVisibility(8);
        } else {
            int i10 = fe1Var.f + 1;
            fe1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ee1 ee1Var = new ee1(fe1Var, obj, i10, 0);
            fe1Var.e = ee1Var;
            dispatchQueue.postRunnable(ee1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new zd1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
