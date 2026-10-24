package ei;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ la(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vb vbVar = this.b;
                vbVar.getClass();
                vbVar.f(1.0f, true, new t9(vbVar, 6));
                vbVar.b1.b(true, true);
                break;
            default:
                vb vbVar2 = this.b;
                vbVar2.e(false);
                vbVar2.m2 = null;
                break;
        }
    }
}
