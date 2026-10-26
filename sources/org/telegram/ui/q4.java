package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q4 implements Runnable {
    public final /* synthetic */ t4 a;

    public q4(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.N = new a0.h();
        usersSelectActivity.O = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.G = false;
        t4 t4Var = this.a;
        usersSelectActivity.R = t4Var.V();
        usersSelectActivity.n = new y0(this, 2);
        t4Var.presentFragment(usersSelectActivity);
    }
}
