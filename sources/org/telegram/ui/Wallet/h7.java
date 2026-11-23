package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                m7.b((m7) this.b, z10, f10);
                break;
            default:
                da daVar = (da) this.b;
                daVar.b0 = null;
                daVar.c0 = 1.0f;
                daVar.G0();
                break;
        }
    }
}
