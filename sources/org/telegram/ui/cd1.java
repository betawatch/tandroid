package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cd1 extends org.telegram.ui.ActionBar.g5 {
    public boolean r = false;
    public final /* synthetic */ id1 s;

    public cd1(id1 id1Var) {
        this.s = id1Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        id1 id1Var = this.s;
        if (id1Var.a.getVisibility() != 0) {
            id1Var.a.setVisibility(0);
            id1Var.a.setAlpha(0.0f);
        }
        id1Var.r.setVisibility(8);
        id1Var.d.l();
        id1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        id1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 0)).start();
        this.r = false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        hd1 hd1Var = this.s.e;
        if (hd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(hd1Var.e);
            hd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            hd1Var.c.clear();
            hd1Var.d.clear();
            hd1Var.l();
            hd1Var.h.r.setVisibility(8);
        } else {
            int i10 = hd1Var.f + 1;
            hd1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            gd1 gd1Var = new gd1(hd1Var, obj, i10, 0);
            hd1Var.e = gd1Var;
            dispatchQueue.postRunnable(gd1Var, 300L);
        }
        if (this.r || TextUtils.isEmpty(obj)) {
            if (this.r && TextUtils.isEmpty(obj)) {
                m();
                return;
            }
            return;
        }
        if (this.s.s.getVisibility() != 0) {
            this.s.s.setVisibility(0);
            this.s.s.setAlpha(0.0f);
        }
        this.s.a.animate().alpha(0.0f).setDuration(150L).setListener(new bd1(this, 1)).start();
        this.s.e.d.clear();
        this.s.e.c.clear();
        this.s.e.l();
        this.s.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.r = true;
    }
}
