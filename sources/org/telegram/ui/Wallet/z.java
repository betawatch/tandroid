package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ Utilities.Callback2 h;
    public final /* synthetic */ l0 n;

    public z(l0 l0Var, String str, long j10, String str2, byte[] bArr, Utilities.Callback2 callback2) {
        this.n = l0Var;
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
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new ai.r5(28, this, this.h));
    }
}
