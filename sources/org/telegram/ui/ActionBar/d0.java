package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(q0 q0Var, int i7, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                if (q0Var.b.getSwipeBack() != null) {
                    q0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                q0 q0Var2 = this.b;
                if (q0Var2.b.getSwipeBack() != null) {
                    q0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}
