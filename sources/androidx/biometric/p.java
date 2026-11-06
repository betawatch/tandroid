package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public p(q qVar) {
        this.a = 0;
        this.b = new WeakReference(qVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b;
                if (weakReference.get() != null) {
                    ((q) weakReference.get()).X();
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.b;
                if (weakReference2.get() != null) {
                    ((z) weakReference2.get()).p = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((z) weakReference3.get()).q = false;
                    break;
                }
                break;
        }
    }

    public p(z zVar, int i7) {
        this.a = i7;
        switch (i7) {
            case 2:
                this.b = new WeakReference(zVar);
                break;
            default:
                this.b = new WeakReference(zVar);
                break;
        }
    }
}
