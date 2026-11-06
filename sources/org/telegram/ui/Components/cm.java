package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ int c;

    public /* synthetic */ cm(bn bnVar, int i7, int i10) {
        this.a = i10;
        this.b = bnVar;
        this.c = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, (sh.c) obj);
                break;
            default:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.j0(this.c, new th.e((String) obj));
                break;
        }
    }
}
