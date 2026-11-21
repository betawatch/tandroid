package bi;

import di.gb;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ r8(d9 d9Var, int i7) {
        this.a = i7;
        this.b = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g1(false);
                break;
            case 1:
                this.b.g1(true);
                break;
            case 2:
                d9 d9Var = this.b;
                di.f6 f6Var = new di.f6(d9Var.getContext(), d9Var.U1, d9Var.V1, d9Var.J0, null);
                long j3 = d9Var.Y1.id;
                String str = d9Var.b2;
                f6Var.m3 = true;
                di.y8.y(f6Var.a, false).K(j3, new ai.x1(9, f6Var, str));
                break;
            case 3:
                d9 d9Var2 = this.b;
                m0.h1(d9Var2.getContext(), d9Var2.Y1, d9Var2.J0);
                break;
            case 4:
                d9 d9Var3 = this.b;
                new gb(d9Var3.getContext(), d9Var3.J0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
