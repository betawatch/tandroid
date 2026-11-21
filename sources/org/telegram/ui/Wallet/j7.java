package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ j7(m7 m7Var, int i7) {
        this.a = i7;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7.a(this.b);
                break;
            default:
                m7 m7Var = this.b;
                Runnable runnable = m7Var.d0;
                m7Var.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
