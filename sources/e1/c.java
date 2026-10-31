package e1;

import kotlin.jvm.internal.i;
import v0.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ c(d dVar, w0.d dVar2, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b.f;
                if (hVar != null) {
                    hVar.g(this.c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.b.f;
                if (hVar2 == null) {
                    i.h("callback");
                    throw null;
                }
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.c(2, "No provider data returned");
                }
                hVar2.g(obj);
                return;
        }
    }
}
