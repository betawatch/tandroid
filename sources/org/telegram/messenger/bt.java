package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ bt(ot otVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = otVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ot otVar = this.b;
                otVar.F = this.c;
                otVar.G = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
