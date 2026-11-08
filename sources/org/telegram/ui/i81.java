package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i81 extends org.telegram.ui.ActionBar.n0 {
    public boolean a = false;
    public final /* synthetic */ n81 b;

    public i81(n81 n81Var) {
        this.b = n81Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        n81 n81Var = this.b;
        if (n81Var.a.getVisibility() != 0) {
            n81Var.a.setVisibility(0);
            n81Var.a.setAlpha(0.0f);
        }
        n81Var.r.setVisibility(8);
        n81Var.d.f();
        n81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        n81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        m81 m81Var = this.b.e;
        if (m81Var.e != null) {
            Utilities.g.a(m81Var.e);
            m81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            m81Var.c.clear();
            m81Var.d.clear();
            m81Var.f();
            m81Var.h.r.setVisibility(8);
        } else {
            int i7 = m81Var.f + 1;
            m81Var.f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            l81 l81Var = new l81(m81Var, obj, i7, 0);
            m81Var.e = l81Var;
            p5Var.d(l81Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new h81(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
