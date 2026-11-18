package androidx.biometric;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                z zVar = this.b.m0;
                if (zVar.e == null) {
                    zVar.e = new w();
                }
                zVar.e.b();
                break;
            default:
                this.b.m0.w = false;
                break;
        }
    }
}
