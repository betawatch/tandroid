package org.telegram.ui.Wallet;

import org.telegram.ui.d01;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d01 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c1(d01 d01Var, String str, int i10) {
        this.a = i10;
        this.b = d01Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
