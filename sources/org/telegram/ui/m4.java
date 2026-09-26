package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ p4 a;

    public m4(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.N = new a0.i();
        usersSelectActivity.O = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.G = false;
        p4 p4Var = this.a;
        usersSelectActivity.R = p4Var.U();
        usersSelectActivity.n = new z0(this, 2);
        p4Var.presentFragment(usersSelectActivity);
    }
}
