package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;

    public /* synthetic */ ep(np npVar, long j3, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                np npVar = this.b;
                npVar.n = j3;
                npVar.r = true;
                npVar.s0();
                break;
            default:
                np.e0(this.b, this.c);
                break;
        }
    }
}
