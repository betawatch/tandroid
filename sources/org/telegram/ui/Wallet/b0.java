package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class b0 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ v10 h;
    public final /* synthetic */ n0 n;

    public b0(n0 n0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.n = n0Var;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = bArr;
        this.h = v10Var;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new bi.p5(27, this, this.h));
    }
}
