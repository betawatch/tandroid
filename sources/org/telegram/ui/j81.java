package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j81 extends org.telegram.ui.ActionBar.n0 {
    public boolean a = false;
    public final /* synthetic */ o81 b;

    public j81(o81 o81Var) {
        this.b = o81Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        o81 o81Var = this.b;
        if (o81Var.a.getVisibility() != 0) {
            o81Var.a.setVisibility(0);
            o81Var.a.setAlpha(0.0f);
        }
        o81Var.r.setVisibility(8);
        o81Var.d.f();
        o81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        o81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new i81(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        n81 n81Var = this.b.e;
        if (n81Var.e != null) {
            Utilities.g.a(n81Var.e);
            n81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            n81Var.c.clear();
            n81Var.d.clear();
            n81Var.f();
            n81Var.h.r.setVisibility(8);
        } else {
            int i7 = n81Var.f + 1;
            n81Var.f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            m81 m81Var = new m81(n81Var, obj, i7, 0);
            n81Var.e = m81Var;
            p5Var.d(m81Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new i81(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
