package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                w6.b((w6) this.b, z9, f10);
                break;
            default:
                n9 n9Var = (n9) this.b;
                n9Var.a0 = null;
                n9Var.b0 = 1.0f;
                n9Var.G0();
                break;
        }
    }
}
