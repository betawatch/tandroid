package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ob0 implements Runnable {
    public boolean a;
    public final /* synthetic */ tb0 b;

    public ob0(tb0 tb0Var) {
        this.b = tb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        tb0 tb0Var = this.b;
        tb0Var.a(z10);
        tb0Var.postDelayed(this, tb0Var.N);
    }
}
