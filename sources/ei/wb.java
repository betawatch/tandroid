package ei;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;

    public /* synthetic */ wb(gc gcVar, int i10) {
        this.a = i10;
        this.b = gcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc gcVar = this.b;
                ec ecVar = gcVar.M;
                if (ecVar != null) {
                    long j10 = ecVar.a;
                    if (j10 > 0) {
                        gcVar.H = j10;
                        break;
                    }
                }
                break;
            case 1:
                zb zbVar = this.b.a;
                if (zbVar != null) {
                    zbVar.D();
                    break;
                }
                break;
            default:
                zb zbVar2 = this.b.a;
                if (zbVar2 != null) {
                    zbVar2.j();
                    break;
                }
                break;
        }
    }
}
