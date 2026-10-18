package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ long c;

    public /* synthetic */ j6(long j10, int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
        this.c = j10;
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
