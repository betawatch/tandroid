package androidx.biometric;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public q(r rVar) {
        this.a = 0;
        this.b = new WeakReference(rVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b;
                if (weakReference.get() != null) {
                    ((r) weakReference.get()).X();
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.b;
                if (weakReference2.get() != null) {
                    ((a0) weakReference2.get()).p = false;
                    break;
                }
                break;
            default:
                WeakReference weakReference3 = this.b;
                if (weakReference3.get() != null) {
                    ((a0) weakReference3.get()).q = false;
                    break;
                }
                break;
        }
    }

    public q(a0 a0Var, int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new WeakReference(a0Var);
                break;
            default:
                this.b = new WeakReference(a0Var);
                break;
        }
    }
}
