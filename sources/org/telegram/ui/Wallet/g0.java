package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g0 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ q10 h;
    public final /* synthetic */ u0 n;

    public g0(u0 u0Var, String str, long j3, String str2, byte[] bArr, q10 q10Var) {
        this.n = u0Var;
        this.c = str;
        this.d = j3;
        this.e = str2;
        this.f = bArr;
        this.h = q10Var;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new e0(1, this, this.h));
    }
}
