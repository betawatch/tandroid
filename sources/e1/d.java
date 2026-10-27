package e1;

import v0.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ d(e eVar, w0.d dVar, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b.f;
                if (iVar != null) {
                    iVar.onError(this.c);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.b.f;
                if (iVar2 == null) {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.c("No provider data returned", 2);
                }
                iVar2.onError(obj);
                return;
        }
    }
}
