// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aj0 implements Runnable {
    public final /* synthetic */ byte a;
    public final WeakReference b;

    public aj0(mj0 mj0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(mj0Var);
                break;
            default:
                this.b = new WeakReference(mj0Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((bj0) weakReference.get()).Y();
                    break;
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).n = false;
                    break;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((mj0) weakReference.get()).o = false;
                    break;
                }
                break;
        }
    }

    public aj0(bj0 bj0Var) {
        this.a = (byte) 0;
        this.b = new WeakReference(bj0Var);
    }
}
