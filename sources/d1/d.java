package d1;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0.g gVar = this.b.f;
                if (gVar != null) {
                    gVar.a(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.b.f;
                if (gVar2 != null) {
                    gVar2.a(new y0.a(new x0.a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
