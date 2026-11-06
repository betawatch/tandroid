package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.ii0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ch.o0 n;

    public /* synthetic */ ci(di diVar, int i7, boolean z9, org.telegram.ui.Components.ii0 ii0Var, float f10, float f11, ch.o0 o0Var, int i10) {
        this.a = i10;
        this.b = diVar;
        this.c = i7;
        this.d = z9;
        this.e = ii0Var;
        this.f = f10;
        this.h = f11;
        this.n = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.i3(new ci(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                an anVar = this.b.s;
                org.telegram.ui.Cells.z H8 = anVar.H8(this.c, true);
                if (this.d) {
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ch.k0.d(anVar, this.e, H8, null, this.f, this.h, this.n, i7, 1);
                    ch.k0.f();
                    break;
                }
                break;
        }
    }
}
