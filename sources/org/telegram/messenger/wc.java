package org.telegram.messenger;

import org.telegram.ui.f60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f60 d;

    public /* synthetic */ wc(hd hdVar, String str, f60 f60Var, int i7) {
        this.a = i7;
        this.b = hdVar;
        this.c = str;
        this.d = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new wc(this.b, this.c, this.d, 1));
                break;
            default:
                qp.e1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
