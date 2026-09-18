package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ oo0(wo0 wo0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = wo0Var;
        this.c = kVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                wo0 wo0Var = this.b;
                if (!z10) {
                    wo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    wo0Var.getClass();
                    break;
                }
        }
    }
}
