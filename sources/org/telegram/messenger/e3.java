package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ e3(int i10, Throwable th2) {
        this.a = i10;
        this.b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLog.lambda$e$4(this.b);
                break;
            default:
                FileLog.lambda$fatal$5(this.b);
                break;
        }
    }
}
