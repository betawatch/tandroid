package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n4 implements Runnable {
    public final /* synthetic */ q4 a;

    public n4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.N = new a0.i();
        usersSelectActivity.O = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.G = false;
        q4 q4Var = this.a;
        usersSelectActivity.R = q4Var.U();
        usersSelectActivity.n = new z0(this, 2);
        q4Var.presentFragment(usersSelectActivity);
    }
}
