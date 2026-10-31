package d1;

import kotlin.jvm.internal.i;
import v0.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ w0.d c;

    public /* synthetic */ a(f fVar, w0.d dVar, int i10) {
        this.a = i10;
        this.b = fVar;
        this.c = dVar;
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
            case 1:
                h hVar2 = this.b.f;
                if (hVar2 != null) {
                    hVar2.g(this.c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar3 = this.b.f;
                if (hVar3 != null) {
                    hVar3.g(this.c);
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}
