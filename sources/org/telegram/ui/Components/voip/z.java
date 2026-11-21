package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ z(a0 a0Var, int i7) {
        this.a = i7;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a0.a(this.b);
                break;
            default:
                a0 a0Var = this.b;
                if (a0Var.y) {
                    a0Var.h();
                    a0Var.post(new z(a0Var, 0));
                    break;
                }
                break;
        }
    }
}
