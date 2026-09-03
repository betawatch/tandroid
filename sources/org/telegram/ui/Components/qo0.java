package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ qo0(yo0 yo0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = yo0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z4) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                yo0 yo0Var = this.b;
                if (!z4) {
                    yo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    yo0Var.getClass();
                    break;
                }
        }
    }
}
