package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                x6.b((x6) this.b, z9, f10);
                break;
            default:
                o9 o9Var = (o9) this.b;
                o9Var.a0 = null;
                o9Var.b0 = 1.0f;
                o9Var.G0();
                break;
        }
    }
}
