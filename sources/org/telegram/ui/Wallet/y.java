package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ j20 h;
    public final /* synthetic */ k0 n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, j20 j20Var) {
        this.n = k0Var;
        this.c = str;
        this.d = j10;
        this.e = str2;
        this.f = bArr;
        this.h = j20Var;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new ih.s(21, this, this.h));
    }
}
