package e1;

import kotlin.jvm.internal.j;
import v0.g;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ c(d dVar, w0.d dVar2, int i7) {
        this.a = i7;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = this.b.f;
                if (gVar != null) {
                    gVar.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                g gVar2 = this.b.f;
                if (gVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.c(2, "No provider data returned");
                }
                gVar2.a(obj);
                return;
        }
    }
}
