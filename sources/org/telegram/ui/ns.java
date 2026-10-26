package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ns extends ig.t1 {
    public final /* synthetic */ ContactsActivity K;

    public ns(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z10;
        this.s = z11;
        this.x = 0;
        this.v = z12;
        this.w = true;
        ig.a2 a2Var = new ig.a2(true);
        this.f = a2Var;
        a2Var.a = new ig.q1(this);
    }

    @Override // ig.t1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.K.c.e(false, true);
    }
}
