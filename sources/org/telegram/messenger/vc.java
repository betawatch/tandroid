package org.telegram.messenger;

import org.telegram.ui.e60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
