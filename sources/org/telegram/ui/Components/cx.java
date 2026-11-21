package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cx(Object obj, float f10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dx dxVar = (dx) this.d;
                float f10 = this.b;
                int i7 = this.c;
                ty tyVar = dxVar.G;
                try {
                    pi.l lVar = new pi.l(tyVar.Q.getContext(), 0, f10);
                    lVar.a = i7;
                    tyVar.R.w0(lVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    pi.l lVar2 = new pi.l(s11Var.i0.getContext(), 0, f11);
                    lVar2.a = i10;
                    s11Var.s0.w0(lVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
