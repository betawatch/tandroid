package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k81 extends org.telegram.ui.ActionBar.n0 {
    public boolean a = false;
    public final /* synthetic */ p81 b;

    public k81(p81 p81Var) {
        this.b = p81Var;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void h() {
        p81 p81Var = this.b;
        if (p81Var.a.getVisibility() != 0) {
            p81Var.a.setVisibility(0);
            p81Var.a.setAlpha(0.0f);
        }
        p81Var.r.setVisibility(8);
        p81Var.d.f();
        p81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        p81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        o81 o81Var = this.b.e;
        if (o81Var.e != null) {
            Utilities.g.a(o81Var.e);
            o81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            o81Var.c.clear();
            o81Var.d.clear();
            o81Var.f();
            o81Var.h.r.setVisibility(8);
        } else {
            int i7 = o81Var.f + 1;
            o81Var.f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            n81 n81Var = new n81(o81Var, obj, i7, 0);
            o81Var.e = n81Var;
            p5Var.d(n81Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new j81(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
