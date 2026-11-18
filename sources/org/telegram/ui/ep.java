package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
