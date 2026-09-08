package e1;

import v0.i;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                i iVar = this.b.f;
                if (iVar != null) {
                    iVar.onError(new w0.c("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            default:
                i iVar2 = this.b.f;
                if (iVar2 != null) {
                    iVar2.onError(new w0.c("No provider data returned.", 2));
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}
