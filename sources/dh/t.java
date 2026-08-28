package dh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ t(u uVar, int i9) {
        this.a = i9;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u uVar = this.b;
                uVar.post(new t(uVar, 1));
                break;
            default:
                u uVar2 = this.b;
                uVar2.d = true;
                uVar2.b();
                break;
        }
    }
}
