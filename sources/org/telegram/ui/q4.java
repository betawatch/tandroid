package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
