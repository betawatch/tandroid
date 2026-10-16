package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ o7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.o(this.b);
                break;
            default:
                m8.H(this.b);
                break;
        }
    }
}
