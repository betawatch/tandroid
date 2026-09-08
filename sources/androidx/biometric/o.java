package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                    ((y) weakReference2.get()).p = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((y) weakReference3.get()).q = false;
                    break;
                }
                break;
        }
    }

    public o(y yVar, int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new WeakReference(yVar);
                break;
            default:
                this.b = new WeakReference(yVar);
                break;
        }
    }
}
