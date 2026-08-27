package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n4 implements Runnable {
    public final /* synthetic */ q4 a;

    public n4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.J = new a0.h();
        usersSelectActivity.K = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.C = false;
        q4 q4Var = this.a;
        usersSelectActivity.N = q4Var.U();
        usersSelectActivity.n = new c1(this, 2);
        q4Var.presentFragment(usersSelectActivity);
    }
}
