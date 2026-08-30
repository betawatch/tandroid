package d1;

import kotlin.jvm.internal.j;
import v0.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ a(e eVar, w0.d dVar, int i10) {
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
                    j.h("callback");
                    throw null;
                }
            case 1:
                i iVar2 = this.b.f;
                if (iVar2 != null) {
                    iVar2.onError(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                i iVar3 = this.b.f;
                if (iVar3 != null) {
                    iVar3.onError(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
