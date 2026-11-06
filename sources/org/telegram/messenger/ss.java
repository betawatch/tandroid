package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ss(dt dtVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = dtVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                dtVar.F = this.c;
                dtVar.G = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
