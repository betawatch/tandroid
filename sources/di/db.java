package di;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ db(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc pcVar = this.b;
                pcVar.getClass();
                pcVar.g(1.0f, true, new ka(pcVar, 6));
                pcVar.b1.b(true, true);
                break;
            default:
                pc pcVar2 = this.b;
                pcVar2.f(false);
                pcVar2.m2 = null;
                break;
        }
    }
}
