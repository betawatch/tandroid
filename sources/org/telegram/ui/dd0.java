package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dd0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;

    public /* synthetic */ dd0(ed0 ed0Var, int i7) {
        this.a = i7;
        this.b = ed0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new iz(this, 26));
                break;
            default:
                if (this.b.U != null) {
                    org.telegram.messenger.g0.h3(new iz(this, 27));
                    break;
                }
                break;
        }
    }
}
