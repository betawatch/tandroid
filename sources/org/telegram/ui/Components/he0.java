package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ he0(le0 le0Var, int i7) {
        this.a = i7;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
