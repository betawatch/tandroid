package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ hf(co coVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co.o0(this.b, this.c, this.d);
                break;
            default:
                co.k1(this.b, this.c, this.d);
                break;
        }
    }
}
