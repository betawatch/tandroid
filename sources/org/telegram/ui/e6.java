package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ long c;

    public /* synthetic */ e6(long j10, int i9, Utilities.Callback callback) {
        this.a = i9;
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
