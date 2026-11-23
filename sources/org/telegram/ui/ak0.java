package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ak0 extends TimerTask {
    public final /* synthetic */ bk0 a;

    public ak0(bk0 bk0Var) {
        this.a = bk0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        bk0 bk0Var = this.a;
        if (bk0Var.w == null) {
            return;
        }
        double currentTimeMillis = System.currentTimeMillis();
        bk0Var.E = (int) (bk0Var.E - (currentTimeMillis - bk0Var.G));
        bk0Var.G = currentTimeMillis;
        org.telegram.messenger.g0.g3(new gf0(this, 9));
    }
}
