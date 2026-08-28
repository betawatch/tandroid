package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ p4 a;

    public m4(p4 p4Var) {
        this.a = p4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.J = new a0.h();
        usersSelectActivity.K = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.C = false;
        p4 p4Var = this.a;
        usersSelectActivity.N = p4Var.T();
        usersSelectActivity.n = new b1(this, 2);
        p4Var.presentFragment(usersSelectActivity);
    }
}
