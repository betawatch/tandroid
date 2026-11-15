package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ kv0(bw0 bw0Var, int i7) {
        this.a = i7;
        this.b = bw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o1.f();
                break;
            case 1:
                this.b.o1.f();
                break;
            case 2:
                bw0 bw0Var = this.b;
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, false, false);
                break;
            case 3:
                bw0 bw0Var2 = this.b;
                org.telegram.messenger.np.s1(bw0Var2.a).y3("stickers", bw0Var2.G1, 1, null);
                break;
            default:
                bw0 bw0Var3 = this.b;
                bw0Var3.dismiss();
                org.telegram.messenger.si.b0(bw0Var3.a).f2(bw0Var3.getContext(), bw0Var3.N1, 1, bw0Var3.G1, false, false);
                break;
        }
    }
}
