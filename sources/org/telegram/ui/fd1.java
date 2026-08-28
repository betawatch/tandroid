package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fd1 extends org.telegram.ui.ActionBar.e5 {
    public boolean f = false;
    public final /* synthetic */ kd1 h;

    public fd1(kd1 kd1Var) {
        this.h = kd1Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        kd1 kd1Var = this.h;
        if (kd1Var.a.getVisibility() != 0) {
            kd1Var.a.setVisibility(0);
            kd1Var.a.setAlpha(0.0f);
        }
        kd1Var.r.setVisibility(8);
        kd1Var.d.l();
        kd1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        kd1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        jd1 jd1Var = this.h.e;
        if (jd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(jd1Var.e);
            jd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            jd1Var.c.clear();
            jd1Var.d.clear();
            jd1Var.l();
            jd1Var.h.r.setVisibility(8);
        } else {
            int i9 = jd1Var.f + 1;
            jd1Var.f = i9;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            id1 id1Var = new id1(jd1Var, obj, i9, 0);
            jd1Var.e = id1Var;
            dispatchQueue.postRunnable(id1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new ed1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
