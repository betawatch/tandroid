package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hd1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f = false;
    public final /* synthetic */ md1 h;

    public hd1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        md1 md1Var = this.h;
        if (md1Var.a.getVisibility() != 0) {
            md1Var.a.setVisibility(0);
            md1Var.a.setAlpha(0.0f);
        }
        md1Var.r.setVisibility(8);
        md1Var.d.l();
        md1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        md1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new gd1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ld1 ld1Var = this.h.e;
        if (ld1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ld1Var.e);
            ld1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ld1Var.c.clear();
            ld1Var.d.clear();
            ld1Var.l();
            ld1Var.h.r.setVisibility(8);
        } else {
            int i10 = ld1Var.f + 1;
            ld1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kd1 kd1Var = new kd1(ld1Var, obj, i10, 0);
            ld1Var.e = kd1Var;
            dispatchQueue.postRunnable(kd1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new gd1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
