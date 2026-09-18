package ci;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
