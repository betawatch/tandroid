package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h81 extends org.telegram.ui.ActionBar.n0 {
    public boolean a = false;
    public final /* synthetic */ m81 b;

    public h81(m81 m81Var) {
        this.b = m81Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        m81 m81Var = this.b;
        if (m81Var.a.getVisibility() != 0) {
            m81Var.a.setVisibility(0);
            m81Var.a.setAlpha(0.0f);
        }
        m81Var.r.setVisibility(8);
        m81Var.d.f();
        m81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        m81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        l81 l81Var = this.b.e;
        if (l81Var.e != null) {
            Utilities.g.a(l81Var.e);
            l81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            l81Var.c.clear();
            l81Var.d.clear();
            l81Var.f();
            l81Var.h.r.setVisibility(8);
        } else {
            int i7 = l81Var.f + 1;
            l81Var.f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            k81 k81Var = new k81(l81Var, obj, i7, 0);
            l81Var.e = k81Var;
            p5Var.d(k81Var, 300L);
        }
        if (this.a || TextUtils.isEmpty(obj)) {
            if (this.a && TextUtils.isEmpty(obj)) {
                h();
                return;
            }
            return;
        }
        if (this.b.s.getVisibility() != 0) {
            this.b.s.setVisibility(0);
            this.b.s.setAlpha(0.0f);
        }
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new g81(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
