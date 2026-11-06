package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ b7(h7 h7Var, int i7) {
        this.a = i7;
        this.b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b.l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = this.b.l;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
