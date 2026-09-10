package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class at extends fg.w1 {
    public final /* synthetic */ ContactsActivity K;

    public at(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = iVar;
        this.r = z10;
        this.s = z11;
        this.x = 0;
        this.v = z12;
        this.w = true;
        fg.d2 d2Var = new fg.d2(true);
        this.f = d2Var;
        d2Var.a = new fg.t1(this);
    }

    @Override // fg.w1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.K.e.e(false, true);
    }
}
