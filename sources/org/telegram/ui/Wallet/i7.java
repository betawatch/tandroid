package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i7 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                n7.b((n7) this.b, z10, f10);
                break;
            default:
                ea eaVar = (ea) this.b;
                eaVar.b0 = null;
                eaVar.c0 = 1.0f;
                eaVar.G0();
                break;
        }
    }
}
