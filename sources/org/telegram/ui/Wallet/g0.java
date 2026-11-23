package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class g0 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ r10 h;
    public final /* synthetic */ u0 n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, r10 r10Var) {
        this.n = u0Var;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = bArr;
        this.h = r10Var;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new e0(1, this, this.h));
    }
}
