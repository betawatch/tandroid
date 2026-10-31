package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dx(Object obj, float f7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = f7;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ex exVar = (ex) this.d;
                float f7 = this.b;
                int i10 = this.c;
                vy vyVar = exVar.F;
                try {
                    ci.p pVar = new ci.p(vyVar.P.getContext(), 0, f7);
                    pVar.a = i10;
                    vyVar.Q.w0(pVar);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                org.telegram.ui.i31 i31Var = (org.telegram.ui.i31) this.d;
                float f10 = this.b;
                int i11 = this.c;
                try {
                    ci.p pVar2 = new ci.p(i31Var.h0.getContext(), 0, f10);
                    pVar2.a = i11;
                    i31Var.r0.w0(pVar2);
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
        }
    }
}
