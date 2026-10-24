package androidx.biometric;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ h(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = this.b.l0;
                if (yVar.e == null) {
                    yVar.e = new v();
                }
                yVar.e.b();
                break;
            default:
                this.b.l0.w = false;
                break;
        }
    }
}
