package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ long c;

    public /* synthetic */ g6(long j3, int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(Long.valueOf(this.c));
                break;
            default:
                this.b.run(Long.valueOf(this.c));
                break;
        }
    }
}
