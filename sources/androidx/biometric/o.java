package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public o(p pVar) {
        this.a = 0;
        this.b = new WeakReference(pVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b;
                if (weakReference.get() != null) {
                    ((p) weakReference.get()).X();
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.b;
                if (weakReference2.get() != null) {
                    ((x) weakReference2.get()).p = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((x) weakReference3.get()).q = false;
                    break;
                }
                break;
        }
    }

    public o(x xVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new WeakReference(xVar);
                break;
            default:
                this.b = new WeakReference(xVar);
                break;
        }
    }
}
