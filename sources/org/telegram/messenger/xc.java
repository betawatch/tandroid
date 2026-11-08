package org.telegram.messenger;

import org.telegram.ui.f60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f60 d;

    public /* synthetic */ xc(id idVar, String str, f60 f60Var, int i7) {
        this.a = i7;
        this.b = idVar;
        this.c = str;
        this.d = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new xc(this.b, this.c, this.d, 1));
                break;
            default:
                qp.e1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
