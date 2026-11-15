package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g81 extends org.telegram.ui.ActionBar.m0 {
    public boolean a = false;
    public final /* synthetic */ l81 b;

    public g81(l81 l81Var) {
        this.b = l81Var;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        l81 l81Var = this.b;
        if (l81Var.a.getVisibility() != 0) {
            l81Var.a.setVisibility(0);
            l81Var.a.setAlpha(0.0f);
        }
        l81Var.r.setVisibility(8);
        l81Var.d.f();
        l81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        l81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        k81 k81Var = this.b.e;
        if (k81Var.e != null) {
            Utilities.g.a(k81Var.e);
            k81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            k81Var.c.clear();
            k81Var.d.clear();
            k81Var.f();
            k81Var.h.r.setVisibility(8);
        } else {
            int i7 = k81Var.f + 1;
            k81Var.f = i7;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            j81 j81Var = new j81(k81Var, obj, i7, 0);
            k81Var.e = j81Var;
            p5Var.d(j81Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new f81(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
