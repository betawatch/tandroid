package ci;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ua(oc ocVar, boolean z10, int i10) {
        this.a = i10;
        this.b = ocVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                oc ocVar = this.b;
                if (!this.c) {
                    ocVar.J0.b(false, false);
                    break;
                } else {
                    ocVar.getClass();
                    break;
                }
            default:
                oc ocVar2 = this.b;
                ocVar2.R = null;
                ocVar2.e = false;
                ocVar2.q(this.c);
                break;
        }
    }
}
