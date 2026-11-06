package androidx.biometric;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ g(q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b.l0;
                if (zVar.e == null) {
                    zVar.e = new w();
                }
                zVar.e.b();
                break;
            default:
                this.b.l0.w = false;
                break;
        }
    }
}
