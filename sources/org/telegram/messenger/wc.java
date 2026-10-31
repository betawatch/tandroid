package org.telegram.messenger;

import org.telegram.ui.e70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e70 d;

    public /* synthetic */ wc(cd cdVar, String str, e70 e70Var, int i10) {
        this.a = i10;
        this.b = cdVar;
        this.c = str;
        this.d = e70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new wc(this.b, this.c, this.d, 1));
                break;
            default:
                vp.d1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
