package d1;

import kotlin.jvm.internal.j;
import v0.h;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ a(e eVar, w0.d dVar, int i3) {
        this.a = i3;
        this.b = eVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b.f;
                if (hVar != null) {
                    hVar.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                h hVar2 = this.b.f;
                if (hVar2 != null) {
                    hVar2.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                h hVar3 = this.b.f;
                if (hVar3 != null) {
                    hVar3.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
