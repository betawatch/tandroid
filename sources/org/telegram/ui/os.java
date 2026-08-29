package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class os extends rf.d1 {
    public final /* synthetic */ ContactsActivity G;

    public os(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.G = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.D = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z10;
        this.s = z11;
        this.x = 0;
        this.v = z12;
        this.w = true;
        rf.k1 k1Var = new rf.k1(true);
        this.f = k1Var;
        k1Var.a = new rf.b1(this);
    }

    @Override // rf.d1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.G.e.e(false, true);
    }
}
