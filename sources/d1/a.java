package d1;

import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ a(e eVar, w0.d dVar, int i7) {
        this.a = i7;
        this.b = eVar;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0.g gVar = this.b.f;
                if (gVar != null) {
                    gVar.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 1:
                v0.g gVar2 = this.b.f;
                if (gVar2 != null) {
                    gVar2.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            default:
                v0.g gVar3 = this.b.f;
                if (gVar3 != null) {
                    gVar3.a(this.c);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
