package org.telegram.messenger;

import org.telegram.ui.e60;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e60 d;

    public /* synthetic */ vc(hd hdVar, String str, e60 e60Var, int i7) {
        this.a = i7;
        this.b = hdVar;
        this.c = str;
        this.d = e60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new vc(this.b, this.c, this.d, 1));
                break;
            default:
                np.e1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
