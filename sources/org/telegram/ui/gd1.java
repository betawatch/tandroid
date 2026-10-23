package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gd1 extends org.telegram.ui.ActionBar.k5 {
    public boolean r = false;
    public final /* synthetic */ md1 s;

    public gd1(md1 md1Var) {
        this.s = md1Var;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        md1 md1Var = this.s;
        if (md1Var.a.getVisibility() != 0) {
            md1Var.a.setVisibility(0);
            md1Var.a.setAlpha(0.0f);
        }
        md1Var.r.setVisibility(8);
        md1Var.d.l();
        md1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        md1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 0)).start();
        this.r = false;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ld1 ld1Var = this.s.e;
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
        this.s.a.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 1)).start();
        this.s.e.d.clear();
        this.s.e.c.clear();
        this.s.e.l();
        this.s.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.r = true;
    }
}
