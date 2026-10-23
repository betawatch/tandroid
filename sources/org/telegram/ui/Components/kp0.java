package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ kp0(sp0 sp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = sp0Var;
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
                sp0 sp0Var = this.b;
                if (!z10) {
                    sp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    sp0Var.getClass();
                    break;
                }
        }
    }
}
