package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ad1 extends org.telegram.ui.ActionBar.g5 {
    public boolean r = false;
    public final /* synthetic */ gd1 s;

    public ad1(gd1 gd1Var) {
        this.s = gd1Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        gd1 gd1Var = this.s;
        if (gd1Var.a.getVisibility() != 0) {
            gd1Var.a.setVisibility(0);
            gd1Var.a.setAlpha(0.0f);
        }
        gd1Var.r.setVisibility(8);
        gd1Var.d.l();
        gd1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        gd1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 0)).start();
        this.r = false;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        fd1 fd1Var = this.s.e;
        if (fd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(fd1Var.e);
            fd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            fd1Var.c.clear();
            fd1Var.d.clear();
            fd1Var.l();
            fd1Var.h.r.setVisibility(8);
        } else {
            int i10 = fd1Var.f + 1;
            fd1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ed1 ed1Var = new ed1(fd1Var, obj, i10, 0);
            fd1Var.e = ed1Var;
            dispatchQueue.postRunnable(ed1Var, 300L);
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
        this.s.a.animate().alpha(0.0f).setDuration(150L).setListener(new zc1(this, 1)).start();
        this.s.e.d.clear();
        this.s.e.c.clear();
        this.s.e.l();
        this.s.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.r = true;
    }
}
