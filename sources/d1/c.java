package d1;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ c(e eVar, Throwable th2, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0.g gVar = this.b.f;
                if (gVar != null) {
                    gVar.a(new y0.a(new x0.a(26), this.c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar2 = this.b.f;
                if (gVar2 != null) {
                    gVar2.a(new w0.c(2, this.c.getMessage()));
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
