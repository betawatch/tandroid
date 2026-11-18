package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
