package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p4 implements Runnable {
    public final /* synthetic */ s4 a;

    public p4(s4 s4Var) {
        this.a = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.K = new a0.h();
        usersSelectActivity.L = new ArrayList();
        usersSelectActivity.x = 1;
        usersSelectActivity.D = false;
        s4 s4Var = this.a;
        usersSelectActivity.O = s4Var.U();
        usersSelectActivity.n = new a1(this, 2);
        s4Var.presentFragment(usersSelectActivity);
    }
}
