package org.telegram.messenger;

import org.telegram.ui.e70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e70 d;

    public /* synthetic */ xc(dd ddVar, String str, e70 e70Var, int i10) {
        this.a = i10;
        this.b = ddVar;
        this.c = str;
        this.d = e70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new xc(this.b, this.c, this.d, 1));
                break;
            default:
                wp.d1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
