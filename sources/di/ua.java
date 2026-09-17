package di;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
