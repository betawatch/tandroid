package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        usersSelectActivity.n = new y0(this, 2);
        p4Var.presentFragment(usersSelectActivity);
    }
}
