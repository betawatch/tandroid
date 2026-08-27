package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gd1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f = false;
    public final /* synthetic */ ld1 h;

    public gd1(ld1 ld1Var) {
        this.h = ld1Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        ld1 ld1Var = this.h;
        if (ld1Var.a.getVisibility() != 0) {
            ld1Var.a.setVisibility(0);
            ld1Var.a.setAlpha(0.0f);
        }
        ld1Var.r.setVisibility(8);
        ld1Var.d.l();
        ld1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ld1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        kd1 kd1Var = this.h.e;
        if (kd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(kd1Var.e);
            kd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            kd1Var.c.clear();
            kd1Var.d.clear();
            kd1Var.l();
            kd1Var.h.r.setVisibility(8);
        } else {
            int i10 = kd1Var.f + 1;
            kd1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            jd1 jd1Var = new jd1(kd1Var, obj, i10, 0);
            kd1Var.e = jd1Var;
            dispatchQueue.postRunnable(jd1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new fd1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
