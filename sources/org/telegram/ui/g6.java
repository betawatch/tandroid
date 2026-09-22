package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
