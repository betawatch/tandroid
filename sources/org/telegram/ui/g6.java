package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
