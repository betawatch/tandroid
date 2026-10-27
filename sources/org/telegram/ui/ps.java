package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ps extends ig.t1 {
    public final /* synthetic */ ContactsActivity K;

    public ps(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
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
