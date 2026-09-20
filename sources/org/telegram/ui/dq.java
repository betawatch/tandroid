package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;
    public final /* synthetic */ long c;

    public /* synthetic */ dq(nq nqVar, long j3, int i10) {
        this.a = i10;
        this.b = nqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                nq nqVar = this.b;
                nqVar.n = j3;
                nqVar.r = true;
                nqVar.n0();
                break;
            default:
                nq.Z(this.b, this.c);
                break;
        }
    }
}
