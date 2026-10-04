package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ie1 extends org.telegram.ui.ActionBar.f5 {
    public boolean f = false;
    public final /* synthetic */ ne1 h;

    public ie1(ne1 ne1Var) {
        this.h = ne1Var;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        ne1 ne1Var = this.h;
        if (ne1Var.a.getVisibility() != 0) {
            ne1Var.a.setVisibility(0);
            ne1Var.a.setAlpha(0.0f);
        }
        ne1Var.r.setVisibility(8);
        ne1Var.d.l();
        ne1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ne1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new he1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        me1 me1Var = this.h.e;
        if (me1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(me1Var.e);
            me1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            me1Var.c.clear();
            me1Var.d.clear();
            me1Var.l();
            me1Var.h.r.setVisibility(8);
        } else {
            int i10 = me1Var.f + 1;
            me1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            le1 le1Var = new le1(me1Var, obj, i10, 0);
            me1Var.e = le1Var;
            dispatchQueue.postRunnable(le1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new he1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
