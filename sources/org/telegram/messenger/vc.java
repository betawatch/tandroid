package org.telegram.messenger;

import org.telegram.ui.g60;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ g60 d;

    public /* synthetic */ vc(hd hdVar, String str, g60 g60Var, int i7) {
        this.a = i7;
        this.b = hdVar;
        this.c = str;
        this.d = g60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new vc(this.b, this.c, this.d, 1));
                break;
            default:
                np.g1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
