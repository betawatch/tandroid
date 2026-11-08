package org.telegram.messenger;

import org.telegram.ui.f60;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
