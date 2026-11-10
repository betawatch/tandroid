package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class z implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ v10 h;
    public final /* synthetic */ l0 n;

    public z(l0 l0Var, String str, long j3, String str2, byte[] bArr, v10 v10Var) {
        this.n = l0Var;
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
