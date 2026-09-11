package di;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ua(pc pcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = pcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                pc pcVar = this.b;
                if (!this.c) {
                    pcVar.J0.b(false, false);
                    break;
                } else {
                    pcVar.getClass();
                    break;
                }
            default:
                pc pcVar2 = this.b;
                pcVar2.R = null;
                pcVar2.e = false;
                pcVar2.q(this.c);
                break;
        }
    }
}
