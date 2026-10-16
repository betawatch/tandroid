package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ Utilities.Callback2 h;
    public final /* synthetic */ k0 n;

    public y(k0 k0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.n = k0Var;
        this.c = str;
        this.d = j10;
        this.e = str2;
        this.f = bArr;
        this.h = callback2;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new bi.f0(23, this, this.h));
    }
}
