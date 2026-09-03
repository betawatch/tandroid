package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
