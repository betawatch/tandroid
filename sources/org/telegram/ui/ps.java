package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ps extends hg.t1 {
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
        hg.a2 a2Var = new hg.a2(true);
        this.f = a2Var;
        a2Var.a = new hg.q1(this);
    }

    @Override // hg.t1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.K.e.e(false, true);
    }
}
