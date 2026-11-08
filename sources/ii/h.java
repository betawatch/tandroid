package ii;

import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(p pVar, long j3, int i7) {
        this.a = i7;
        this.b = pVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p.c0(this.b, this.c);
                break;
            default:
                p pVar = this.b;
                pVar.getClass();
                pVar.presentFragment(an.ra(this.c));
                break;
        }
    }
}
