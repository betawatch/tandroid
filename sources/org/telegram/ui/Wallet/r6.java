package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                w6.b((w6) this.b, z10, f10);
                break;
            default:
                p9 p9Var = (p9) this.b;
                p9Var.b0 = null;
                p9Var.c0 = 1.0f;
                p9Var.G0();
                break;
        }
    }
}
