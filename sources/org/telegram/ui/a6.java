package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r20 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a6(int i10, long j10, org.telegram.messenger.r20 r20Var) {
        this.a = i10;
        this.b = r20Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Long.valueOf(this.c));
                break;
            default:
                this.b.a(Long.valueOf(this.c));
                break;
        }
    }
}
