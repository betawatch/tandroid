package org.telegram.messenger;

import org.telegram.ui.f60;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
