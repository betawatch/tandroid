package e1;

import kotlin.jvm.internal.i;
import v0.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = this.b.f;
                if (hVar != null) {
                    hVar.g(new w0.c(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
            default:
                h hVar2 = this.b.f;
                if (hVar2 != null) {
                    hVar2.g(new w0.c(2, "No provider data returned."));
                    return;
                } else {
                    i.h("callback");
                    throw null;
                }
        }
    }
}
